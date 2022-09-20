package org.opencps.dossiermgt.action.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.opencps.dossiermgt.action.PaymentFileActions;
import org.opencps.dossiermgt.action.impl.PaymentFileActionsImpl;
import org.opencps.dossiermgt.constants.DossierStatusConstants;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ProcessStep;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessStepLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;

import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class DossierMgtUtils {

	private static final Log _log = LogFactoryUtil.getLog(DossierMgtUtils.class);
	private static final long VALUE_CONVERT_DATE_TIMESTAMP = 1000 * 60 * 60 * 24;
	private static final String PATTERN_DATE = "dd-MM-yyyy HH:mm:ss";
	private static final String PATTERN_DATE_2 = "dd/MM/yyyy HH:mm:ss";
	private static final String PATTERN_DATE_3 = "dd/MM/yyyy";

	//LamTV: Process get process option
	public static ProcessOption getProcessOption(String serviceInfoCode, String govAgencyCode, String dossierTemplateNo,
			long groupId) {

		try {
			ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(groupId, serviceInfoCode, govAgencyCode);
			if (config != null) {
				return ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(groupId, dossierTemplateNo,
						config.getServiceConfigId());
			}
		} catch (PortalException e) {
			_log.error(e);
		}
		return null;
	}

	protected Dossier getDossier(long groupId, String refId) throws PortalException {

		Dossier dossier = null;

		dossier = DossierLocalServiceUtil.getByRef(groupId, refId);

		if (Validator.isNull(dossier)) {
			long dossierId = GetterUtil.getLong(refId);

			if (dossierId != 0) {
				dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
			}
		}

		return dossier;
	}

	public static Dossier getDossier(String id, long groupId) {

		long dossierId = GetterUtil.getLong(id);

		Dossier dossier = null;

		dossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		if (Validator.isNull(dossier)) {
			dossier = DossierLocalServiceUtil.getByRef(groupId, id);
		}

		return dossier;
	}

	//LamTV: Process get process action
	public static ProcessAction getProcessAction(long groupId, Dossier dossier, String actionCode,
			long serviceProcessId) throws PortalException {

		_log.info("GET PROCESS ACTION____");
		ProcessAction action = null;
		DossierAction dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossier.getDossierActionId());
		
		try {
			List<ProcessAction> actions = ProcessActionLocalServiceUtil.getByActionCode(groupId, actionCode,
					serviceProcessId);

			_log.info("GET PROCESS ACTION____" + groupId + "," + actionCode + "," + serviceProcessId);

			String dossierStatus = dossier.getDossierStatus();
			String dossierSubStatus = dossier.getDossierSubStatus();
			String preStepCode;
			for (ProcessAction act : actions) {

				preStepCode = act.getPreStepCode();
				_log.info("LamTV_preStepCode: "+preStepCode);

				ProcessStep step = ProcessStepLocalServiceUtil.fetchBySC_GID(preStepCode, groupId, serviceProcessId);
//				_log.info("LamTV_ProcessStep: "+step);

				if (Validator.isNull(step) && dossierAction == null) {
					action = act;
					break;
				} else {
					String stepStatus = step != null ? step.getDossierStatus() : StringPool.BLANK;
					String stepSubStatus = step != null ?  step.getDossierSubStatus() : StringPool.BLANK;
					boolean flagCheck = false;
					
					if (dossierAction != null) {
						if (act.getPreStepCode().equals(dossierAction.getStepCode())) {
							flagCheck = true;
						}
					}
					else {
						flagCheck = true;
					}
					_log.info("LamTV_preStepCode: "+stepStatus + "," + stepSubStatus + "," + dossierStatus + "," + dossierSubStatus + "," + act.getPreCondition() + "," + flagCheck);
					if (stepStatus.contentEquals(dossierStatus)
							&& StringUtil.containsIgnoreCase(stepSubStatus, dossierSubStatus)
							&& flagCheck) {
						if (Validator.isNotNull(act.getPreCondition()) && DossierMgtUtils.checkPreCondition(act.getPreCondition().split(StringPool.COMMA), dossier)) {
							action = act;
							break;							
						}
						else if (Validator.isNull(act.getPreCondition())) {
							action = act;
							break;
						}
					}
				}
			}
		} catch (Exception e) {
			_log.info("NOT PROCESS ACTION");
			_log.info(e);
		}

		return action;
	}

	public static boolean checkPreCondition(String[] preConditions, Dossier dossier) {
		boolean result = true;
		
		
		
		for (String preCondition : preConditions) {
			switch (preCondition) {
			case "payok":
				result = result && checkPayOk(dossier);
				break;

			case "cancelling":
				result = result && checkCancelling(dossier);
				break;

			case "reject_cancelling":
				result = result && checkCancelling(dossier);
				break;

			case "correcting":
				result = result && checkCorrecting(dossier);
				break;

			case "reject_correcting":
				result = result && checkCorrecting(dossier);
				break;

			case "submitting":
				result = result && checkSubmitting(dossier);
				break;

			case "reject_submitting":
				result = result && checkSubmitting(dossier);
				break;

			default:
				break;
			}
		}

		return result;
	}

	private static boolean checkPayOk(Dossier dossier) {
		boolean result = true;
		PaymentFileActions actions = new PaymentFileActionsImpl();
		List<PaymentFile> paymentFiles = actions.getPaymentFiles(dossier.getDossierId());
		if (paymentFiles != null) {
			for (PaymentFile paymentFile : paymentFiles) {
				if (paymentFile.getPaymentStatus() != 2) {
					result = result && false;
				}
			}
		}
		return result;
	}

	private static boolean checkCancelling(Dossier dossier) {
		if (dossier.getCancellingDate() != null) {
			return true;
		}
		return false;
	}

	private static boolean checkCorrecting(Dossier dossier) {
		if (dossier.getCorrecttingDate() != null) {
			return true;
		}

		return false;
	}
	
	
	private static boolean checkSubmitting(Dossier dossier) {
		if (dossier.getEndorsementDate() != null) {
			return true;
		}

		return false;
	}

	//Update status of dossier
	public static void updateStatus(Dossier dossier, String status, String statusText, String subStatus, String subStatusText,
			String lockState, ServiceContext context) throws PortalException {

		Date now = new Date();

		dossier.setModifiedDate(now);
		dossier.setDossierStatus(status);
		dossier.setDossierStatusText(statusText);
		dossier.setDossierSubStatus(subStatus);
		dossier.setDossierSubStatusText(subStatusText);
		dossier.setLockState(lockState);
		//dossier.setDossierNote(stepInstruction);

		if (status.equalsIgnoreCase(DossierStatusConstants.RELEASING)) {
			dossier.setReleaseDate(now);
		}

		if (status.equalsIgnoreCase(DossierStatusConstants.DONE)) {
			dossier.setFinishDate(now);
			if (dossier.getReleaseDate() == null) {
				dossier.setReleaseDate(now);
			}
		}
	}

	// Condition active or not active
	public static String checkConditionState(List<VRVehicleTypeCertificate> certTypeList) {

		int lengthCert = certTypeList.size();
		Date now = new Date();
		if (lengthCert == 1) {
			VRVehicleTypeCertificate typeCert = certTypeList.get(0);
			String expiredStatus = typeCert.getExpiredStatus();
			if (expiredStatus.equals(DossierTerm.EXPIRED_STATUS_NOT_ACTIVE) ) {
				return SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo());
			} else {
				Date copReportExpireDate = typeCert.getCopReportExpireDate();
				if (copReportExpireDate != null) {
					long subExpiredTime = copReportExpireDate.getTime() - now.getTime();
					long daySubTime = subExpiredTime / VALUE_CONVERT_DATE_TIMESTAMP;
					if (daySubTime <= 30) {
						return SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo());
					} else {
						Date certificateRecordExpireDate = typeCert.getCopReportExpireDate();
						if (certificateRecordExpireDate != null) {
							long subCertExpiredTime = certificateRecordExpireDate.getTime() - now.getTime();
							long dayCertSubTime = subCertExpiredTime / VALUE_CONVERT_DATE_TIMESTAMP;
							if (dayCertSubTime <= 30) {
								return SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo());
							}
						}
					}
				}
			}
		} else {
			StringBuilder sb = new StringBuilder();
			for (VRVehicleTypeCertificate typeCert : certTypeList) {
				if (typeCert.getExpiredStatus().equals(DossierTerm.EXPIRED_STATUS_NOT_ACTIVE)) {
					if (sb.length() == 0) {
						sb.append(SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo()));
					} else {
						sb.append(StringPool.COMMA);
						sb.append(SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo()));
					}
				} else {
					Date copReportExpireDate = typeCert.getCopReportExpireDate();
					if (copReportExpireDate != null) {
						long subExpiredTime = copReportExpireDate.getTime() - now.getTime();
						long daySubTime = subExpiredTime / VALUE_CONVERT_DATE_TIMESTAMP;
						if (daySubTime <= 30) {
							if (sb.length() == 0) {
								sb.append(SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo()));
							} else {
								sb.append(StringPool.COMMA);
								sb.append(SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo()));
							}
						} else {
							Date certificateRecordExpireDate = typeCert.getCopReportExpireDate();
							if (certificateRecordExpireDate != null) {
								long subCertExpiredTime = certificateRecordExpireDate.getTime() - now.getTime();
								long dayCertSubTime = subCertExpiredTime / VALUE_CONVERT_DATE_TIMESTAMP;
								if (dayCertSubTime <= 30) {
									if (sb.length() == 0) {
										sb.append(SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo()));
									} else {
										sb.append(StringPool.COMMA);
										sb.append(SpecialCharacterUtils.splitSpecial(typeCert.getDossierNo()));
									}
								}
							}
						}
					}
				}
			}
			return sb.toString();
		}
		return StringPool.BLANK;
	}

	public static Date parseStringToDate(String strDate) {
		
		try {
			SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE);
			return df.parse(strDate);
		}
		catch (ParseException e) {
			
			try {
				SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_2);
				return df.parse(strDate);
			} catch (Exception e2) {
				try {
					SimpleDateFormat df = new SimpleDateFormat(PATTERN_DATE_3);
					return df.parse(strDate);
				} catch (Exception e3) {
					
				}
			}
			
			//_log.error(e);
			return null;
		}
		
	}

}
