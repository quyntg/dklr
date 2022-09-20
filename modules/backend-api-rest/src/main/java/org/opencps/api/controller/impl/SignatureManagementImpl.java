package org.opencps.api.controller.impl;

import java.io.File;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;

import org.opencps.api.controller.SignatureManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.api.digitalsignature.model.DigitalSignatureInputModel;
import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.NotFoundException;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;
import org.opencps.dossiermgt.action.DossierActions;
import org.opencps.dossiermgt.action.impl.DossierActionsImpl;
import org.opencps.dossiermgt.model.Deliverable;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.scheduler.InvokeREST;
import org.opencps.dossiermgt.scheduler.RESTFulConfiguration;
import org.opencps.dossiermgt.service.DeliverableLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierPartLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.vr.utils.ResultDeliverableCOPUtils;

import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.servlet.HttpMethods;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class SignatureManagementImpl implements SignatureManagement {

	Log _log = LogFactoryUtil.getLog(SignatureManagementImpl.class.getName());
	// private static final String TYPE_DONGDAU = "1137, 1160, 1162";

	@Override
	public Response updateDossierFileBySignature(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Long id, DigitalSignatureInputModel input)
			throws PortalException {
		BackendAuth auth = new BackendAuthImpl();

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		long dossierId = Long.valueOf(id);

		if (!auth.isAuth(serviceContext)) {
			throw new UnauthenticationException();
		}

		long fileEntryId = Long.valueOf(input.getFileEntryId());
		JSONObject result = JSONFactoryUtil.createJSONObject();
		if (fileEntryId > 0) {
			String sign = input.getSign();
			String signFieldName = input.getSignFieldName();
			String fileName = input.getFileName();

			JSONObject signatureCompleted = callSignatureSync(groupId, user, id, sign, signFieldName, fileName,
					serviceContext);

			if (signatureCompleted.getInt(RESTFulConfiguration.STATUS) == HttpURLConnection.HTTP_OK) {
				_log.info("fileEntryId: " + fileEntryId);
				String message = signatureCompleted.getString(RESTFulConfiguration.MESSAGE);
				JSONObject jsonData = JSONFactoryUtil.createJSONObject(message);
				String signedFilePath = jsonData.getString("signedFile");
				File fileSigned = new File(signedFilePath);

				DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fileEntryId);
				// _log.info("dlFileEntry: "+dlFileEntry.getFileName());
				DLAppLocalServiceUtil.updateFileEntry(user.getUserId(), dlFileEntry.getFileEntryId(),
						dlFileEntry.getTitle(), dlFileEntry.getMimeType(), dlFileEntry.getTitle(),
						dlFileEntry.getDescription(), StringPool.BLANK, true, fileSigned, serviceContext);

				serviceContext.setUserId(user.getUserId());

				// Next action
				Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
				if (dossier != null) {
//					_log.info("dossierId: "+dossier.getDossierId());
//					_log.info("ReferenceId: "+dossier.getReferenceUid());
//					_log.info("actionCode: "+actionCode);
//					_log.info("actionUser: "+actionUser);
//					_log.info("actionNote: "+actionNote);
//					_log.info("assignUserId: "+assignUserId);
//					_log.info("subUsers: "+subUsers);
					String actionCode = input.getActionCode();

					DossierActions actions = new DossierActionsImpl();
					ProcessOption option = getProcessOption(dossier.getServiceCode(), dossier.getGovAgencyCode(),
							dossier.getDossierTemplateNo(), groupId);
					ProcessAction proAction = getProcessAction(groupId, dossier.getDossierId(),
							dossier.getReferenceUid(), input.getActionCode(), option.getServiceProcessId());
					if (option != null && proAction != null) {
						actions.doAction(groupId, dossier, option, proAction, actionCode, input.getActionUser(),
								input.getActionNote(), GetterUtil.getLong(input.getAssignUserId()), user.getUserId(),
								StringPool.BLANK, StringPool.BLANK, serviceContext);
					}

					// Update deliverable with deliverableType
					DossierFile dossierFile = DossierFileLocalServiceUtil.getByFileEntryId(fileEntryId);
					if (dossierFile != null) {
						String deliverableCode = dossierFile.getDeliverableCode();
						if (Validator.isNotNull(deliverableCode)) {
							Deliverable deliverable = DeliverableLocalServiceUtil.getByCode(deliverableCode);
							if (deliverable != null) {
								String deliState = deliverable.getDeliverableState();
								if (!"2".equals(deliState)) {
									deliverable.setDeliverableState("2");
									DeliverableLocalServiceUtil.updateDeliverable(deliverable);
								}
								// Process update VR_COP
								if (dossier.getServiceCode().equalsIgnoreCase("TT302011BGTVTCOP")) {
									ResultDeliverableCOPUtils.updateVRCOPBusiness(dossier, deliverable, 1);
								}
							}
						}
					}

					Dossier dossier_CTN = DossierLocalServiceUtil.getByRef(55217L, dossier.getReferenceUid());
					VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
							.findByDossierId_MtCore(dossier_CTN.getDossierId(), 1L);
					if (Validator.isNotNull(vrVehicleTypeCertificate)) {
						vrVehicleTypeCertificate.setDeliverableFileEntryid(fileEntryId);
						
						VRVehicleTypeCertificateLocalServiceUtil.updateVRVehicleTypeCertificate(vrVehicleTypeCertificate, company);
					}

					// Process success
					result.put("msg", "success");
				}
			}
		} else {
			result.put("msg", "fileEntryId");
		}

		return Response.status(200).entity(JSONFactoryUtil.looseSerialize(result)).build();

	}

	private JSONObject callSignatureSync(long groupId, User user, long id, String sign, String signFieldName,
			String fileName, ServiceContext serviceContext) throws PortalException {

		InvokeREST rest = new InvokeREST();

		HashMap<String, String> properties = new HashMap<String, String>();

		// Call initDossier to SERVER

		String httpMethod = HttpMethods.POST;

		String endPoint = "signature/completeSignature";

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("sign", sign);
		params.put("signFieldName", signFieldName);
		params.put("fileName", fileName);

		JSONObject resPostDossier = rest.callPostAPI(groupId, httpMethod, "application/json",
				RESTFulConfiguration.SERVER_PATH_BASE, endPoint, RESTFulConfiguration.SERVER_USER,
				RESTFulConfiguration.SERVER_PASS, properties, params, serviceContext);

		return resPostDossier;

	}

	@Override
	public Response getHashComputedBySignature(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, Long id, DigitalSignatureInputModel input) {
		_log.info("START*************");
		BackendAuth auth = new BackendAuthImpl();

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			String strIdArr = input.getStrIdArr();
//			_log.info("array Id: "+strIdArr);

			String[] idSplit = strIdArr.split(StringPool.SEMICOLON);
//			_log.info("idSplit Id: "+idSplit);

			JSONObject hashComputed = null;
			JSONObject results = null;
			for (String strId : idSplit) {
				String[] idArr = strId.split(StringPool.COMMA);
				DossierPart dossierPart = DossierPartLocalServiceUtil.fetchDossierPart(Long.valueOf(idArr[1]));
				_log.info("Dossier Part: " + dossierPart.getDossierPartId());
				DossierFile dossierFile = null;
				if (dossierPart != null && dossierPart.getESign()) {
					dossierFile = DossierFileLocalServiceUtil.fetchDossierFile(Long.valueOf(idArr[0]));
					_log.info("Dossier File: " + dossierFile.getDossierFileId());
					if (dossierFile != null && dossierFile.getFileEntryId() > 0) {
						long fileEntryId = dossierFile.getFileEntryId();
						_log.info("fileEntryId: " + fileEntryId);

						try {
							// Dungnv - Them chuc nang ky so HSM
							hashComputed = callHashComputedSync(groupId, user, fileEntryId, input.getActionCode(),
									input.getPostStepCode(), input.isUseHSM(), serviceContext);
							_log.info("hashComputed: " + hashComputed);
						} catch (Exception e) {
							_log.info("hashComputed: " + hashComputed);
							_log.info(e);
						}

						results = JSONFactoryUtil
								.createJSONObject(hashComputed.getString(RESTFulConfiguration.MESSAGE));
						_log.info("getHashComputedBySignature results: " + results);
					} else {
						results = JSONFactoryUtil.createJSONObject();
						results.put("msg", "fileEntryId");
					}
					break;
				}
			}
			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(results)).build();

		} catch (Exception e) {
			ErrorMsg error = new ErrorMsg();

			if (e instanceof UnauthenticationException) {
				error.setMessage("Non-Authoritative Information.");
				error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
				error.setDescription("Non-Authoritative Information.");

				return Response.status(HttpURLConnection.HTTP_NOT_AUTHORITATIVE).entity(error).build();
			} else {
				if (e instanceof UnauthorizationException) {
					error.setMessage("Unauthorized.");
					error.setCode(HttpURLConnection.HTTP_NOT_AUTHORITATIVE);
					error.setDescription("Unauthorized.");

					return Response.status(HttpURLConnection.HTTP_UNAUTHORIZED).entity(error).build();

				} else {

					error.setMessage("Internal Server Error");
					error.setCode(HttpURLConnection.HTTP_FORBIDDEN);
					error.setDescription(e.getMessage());

					return Response.status(HttpURLConnection.HTTP_INTERNAL_ERROR).entity(error).build();

				}
			}
		}
	}

	// Dungnv - Them chuc nang ky so HSM
	private JSONObject callHashComputedSync(long groupId, User user, long fileEntryId, String actionCode,
			String postStepCode, boolean useHSM, ServiceContext serviceContext) throws PortalException {

		InvokeREST rest = new InvokeREST();

		HashMap<String, String> properties = new HashMap<String, String>();

		// Call initDossier to SERVER
		String httpMethod = HttpMethods.POST;
		_log.info("=======> userHSM: " + useHSM);
		String endPoint = "signature/requestsToken";
		if (useHSM) {
			endPoint = "signature/requestsTokenHSM";
		}

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("fileEntryId", fileEntryId);
		params.put("emailUser", user.getEmailAddress());
		params.put("typeSignature", actionCode);
		params.put("postStepCode", postStepCode);

		JSONObject resPostHashComputed = rest.callPostAPI(groupId, httpMethod, "application/json",
				RESTFulConfiguration.SERVER_PATH_BASE, endPoint, RESTFulConfiguration.SERVER_USER,
				RESTFulConfiguration.SERVER_PASS, properties, params, serviceContext);

		return resPostHashComputed;

	}

	protected Dossier getDossier(long groupId, long dossierId, String refId) throws PortalException {

		Dossier dossier = null;

		if (dossierId != 0) {
			dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
		} else {
			dossier = DossierLocalServiceUtil.getByRef(groupId, refId);
		}

		return dossier;
	}

	private ProcessOption getProcessOption(String serviceInfoCode, String govAgencyCode, String dossierTemplateNo,
			long groupId) throws PortalException {

		ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(groupId, serviceInfoCode, govAgencyCode);

		return ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(groupId, dossierTemplateNo,
				config.getServiceConfigId());
	}

	protected ProcessAction getProcessAction(long groupId, long dossierId, String refId, String actionCode,
			long serviceProcessId) throws PortalException {

		_log.info("GET PROCESS ACTION____");

		ProcessAction action = null;

		try {
			List<ProcessAction> actions = ProcessActionLocalServiceUtil.getByActionCode(groupId, actionCode,
					serviceProcessId);

			Dossier dossier = getDossier(groupId, dossierId, refId);

			String dossierStatus = dossier.getDossierStatus();

			String dossierSubStatus = dossier.getDossierSubStatus();

			for (ProcessAction act : actions) {

				String preStepCode = act.getPreStepCode();

				ProcessStep step = ProcessStepLocalServiceUtil.fetchBySC_GID(preStepCode, groupId, serviceProcessId);

				if (Validator.isNull(step)) {
					action = act;
					break;
				} else {
					if (step.getDossierStatus().contentEquals(dossierStatus)
							&& StringUtil.containsIgnoreCase(step.getDossierSubStatus(), dossierSubStatus)) {

						action = act;
						break;
					}
				}
			}

		} catch (Exception e) {
			throw new NotFoundException("NotProcessActionFound");
		}

		return action;
	}

}
