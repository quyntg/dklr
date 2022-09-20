package org.opencps.api.controller.impl;

import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageBusException;
import com.liferay.portal.kernel.messaging.MessageBusUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.httpclient.util.HttpURLConnection;
import org.opencps.api.controller.ProcessPluginManagement;
import org.opencps.api.controller.exception.ErrorMsg;
import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;
import org.opencps.dossiermgt.action.DossierFileActions;
import org.opencps.dossiermgt.action.impl.DossierFileActionsImpl;
import org.opencps.dossiermgt.action.util.AutoFillFormData;
import org.opencps.dossiermgt.action.util.DossierMgtUtils;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierActionUser;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.DossierPart;
import org.opencps.dossiermgt.model.ProcessPlugin;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierActionUserLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierPartLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessPluginLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;

public class ProcessPluginManagementImpl implements ProcessPluginManagement {

	@Override
	public Response getPlugins(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
		long userId = user.getUserId();
		BackendAuth auth = new BackendAuthImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			
			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);
			if (Validator.isNotNull(dossier)) {
				long dossierActionId = dossier.getDossierActionId();
				if (dossierActionId != 0) {
					DossierActionUser dau = DossierActionUserLocalServiceUtil.getByDID_UID_MOD(dossierActionId, userId, 1);
					boolean hasPermission = false;
					if (dau != null) {
						hasPermission = true;
					}
//					for (DossierActionUser actionUser : dossierActionUsers) {
//						if (actionUser.getUserId() == userId && actionUser.getModerator() == 1) {
//							hasPermission = true;
//						}
//					}

					if (!hasPermission) {

						JSONObject resultsNull = JSONFactoryUtil.createJSONObject();
						resultsNull.put("total", 0);
						return Response.status(200).entity(JSONFactoryUtil.looseSerialize(resultsNull)).build();
					}
				
					DossierAction dossierAction = DossierActionLocalServiceUtil.getDossierAction(dossierActionId);
					//String stepCode = dossierAction.getStepCode();
					if (dossierAction != null) {
						List<ProcessPlugin> plugins = ProcessPluginLocalServiceUtil
								.getProcessPlugins(dossierAction.getServiceProcessId(), dossierAction.getStepCode());

						JSONObject results = JSONFactoryUtil.createJSONObject();
						if (plugins != null && plugins.size() > 0) {

							results.put("total", plugins.size());

							JSONArray dataArr = JSONFactoryUtil.createJSONArray();

							for (ProcessPlugin plugin : plugins) {
								JSONObject elm = JSONFactoryUtil.createJSONObject();

								elm.put("processPluginId", plugin.getPrimaryKey());
								elm.put("pluginName", plugin.getPluginName());

								dataArr.put(elm);
							}

							results.put("data", dataArr);
						}
						return Response.status(200).entity(JSONFactoryUtil.looseSerialize(results)).build();
					} else {
						throw new Exception("The dossier wasn't on process");
					}
				} else {
					throw new Exception("The dossier wasn't on process");
				}

			} else {
				throw new Exception("Cant get dossier with id_" + id);
			}

		} catch (Exception e) {
			_log.error(e);

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

	@Override
	public Response getFormData(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, long pluginid) {

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			if (Validator.isNotNull(dossier)) {

				long dossierActionId = dossier.getDossierActionId();

				if (dossierActionId != 0) {

					ProcessPlugin plugin = ProcessPluginLocalServiceUtil.getProcessPlugin(pluginid);

					String formData = plugin.getSampleData();

					if (formData.startsWith("#")) {
						return Response.status(200).entity(formData).build();

					} else {

						JSONObject result = JSONFactoryUtil.createJSONObject(plugin.getSampleData());

						return Response.status(200).entity(JSONFactoryUtil.looseSerialize(result)).build();
					}

				} else {
					throw new Exception("The dossier wasn't on process");
				}

			} else {
				throw new Exception("Cant get dossier with id_" + id);
			}

		} catch (Exception e) {
			_log.error(e);

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

	@Override
	public Response getFormScript(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, long pluginid) {
		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		BackendAuth auth = new BackendAuthImpl();

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			if (Validator.isNotNull(dossier)) {

				long dossierActionId = dossier.getDossierActionId();

				if (dossierActionId != 0) {

					ProcessPlugin plugin = ProcessPluginLocalServiceUtil.getProcessPlugin(pluginid);

					String formData = plugin.getPluginForm();

					if (formData.startsWith("#")) {
						return Response.status(200).entity(JSONFactoryUtil.looseSerialize(formData)).build();

					} else {

						JSONObject result = JSONFactoryUtil.createJSONObject(plugin.getPluginForm());

						return Response.status(200).entity(JSONFactoryUtil.looseSerialize(result)).build();
					}

				} else {
					throw new Exception("The dossier wasn't on process");
				}

			} else {
				throw new Exception("Cant get dossier with id_" + id);
			}

		} catch (Exception e) {
			_log.error(e);

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

	@Override
	public Response getPreview(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, long pluginid) {

		BackendAuth auth = new BackendAuthImpl();

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			if (Validator.isNotNull(dossier)) {

				long dossierActionId = dossier.getDossierActionId();

				if (dossierActionId != 0) {

					ProcessPlugin plugin = ProcessPluginLocalServiceUtil.getProcessPlugin(pluginid);

					// String formReport = plugin.getPluginForm();

					String formCode = plugin.getSampleData();

					String pluginForm = plugin.getPluginForm();

					String[] splipPluginForms = StringUtil.split(pluginForm, StringPool.AT);

					boolean original = false;

					if (splipPluginForms.length == 3 && splipPluginForms[2].contentEquals("original")) {
						original = true;
					}

					boolean autoRun = plugin.getAutoRun();

					String formData = StringPool.BLANK;
					String formReport = StringPool.BLANK;

					if (formCode.startsWith("#")) {
						
						formData = _getFormData(groupId, formCode, dossier.getDossierId(), autoRun,
								dossier.getDossierTemplateNo(), original, dossierActionId, serviceContext);
						
						_log.debug("formData"+ formData);
						
						formReport = _getFormScript(formCode, dossier.getDossierId());
					}

					Message message = new Message();

					message.put("formReport", formReport);

					message.put("formData", formData);

					message.setResponseId(String.valueOf(dossier.getPrimaryKeyObj()));
					message.setResponseDestinationName("jasper/engine/preview/callback");

					try {
						String previewResponse = (String) MessageBusUtil
								.sendSynchronousMessage("jasper/engine/preview/destination", message, 10000);

						// JSONObject jsonObject =
						// JSONFactoryUtil.createJSONObject();

						if (Validator.isNotNull(previewResponse)) {
							// jsonObject =
							// JSONFactoryUtil.createJSONObject(previewResponse);
						}

						// String fileDes = jsonObject.getString("fileDes");

						File file = new File(previewResponse);

						ResponseBuilder responseBuilder = Response.ok((Object) file);

						responseBuilder.header("Content-Disposition",
								"attachment; filename=\"" + file.getName() + "\"");
						responseBuilder.header("Content-Type", "application/pdf");
						
						return responseBuilder.build();

					} catch (MessageBusException e) {
						throw new Exception("Preview rendering not avaiable");
					}

				} else {
					throw new Exception("The dossier wasn't on process");
				}

			} else {
				throw new Exception("Cant get dossier with id_" + id);
			}

		} catch (Exception e) {
			_log.error(e);

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

	private String _getFormData(long groupId, String fileTemplateNo, long dossierId, boolean autoRun,
			String dossierTemplateNo, boolean original, long dossierActionId, ServiceContext context) {

		_log.info("RUN TO GET FORM DATA");

		String formData = StringPool.BLANK;

		fileTemplateNo = StringUtil.replaceFirst(fileTemplateNo, "#", StringPool.BLANK);

		try {
			// Dossier dossier = DossierLocalServiceUtil.getDossier(dossierId);

			DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossierId,
					fileTemplateNo, false, new DossierFileComparator(false, "createDate", Date.class));

			DossierPart dossierPart = DossierPartLocalServiceUtil.getByFileTemplateNo(groupId, fileTemplateNo);

			formData = AutoFillFormData.sampleDataBinding(dossierPart.getSampleData(), dossierId, context);
			
			_log.info(formData);

			if (original) {
				if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
			    	File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
					if (formDataFile != null) {
						formData = FileUploadUtils.fileToString(formDataFile);
					}					
				}
				if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
					formData = dossierFile.getFormData();
				}
			} else {
				DossierFileActions actions = new DossierFileActionsImpl();
				
				if (Validator.isNull(dossierFile)) {

					/* if (autoRun) { */
						// create DossierFile

						dossierFile = actions.addDossierFile(groupId, dossierId, PortalUUIDUtil.generate(),
								dossierTemplateNo, dossierPart.getPartNo(), fileTemplateNo, dossierPart.getPartName(),
								StringPool.BLANK, 0L, null, StringPool.BLANK, String.valueOf(false), dossierActionId,
								context);

						_log.info("UPDATED DOSSIERFILE");

						DossierFileLocalServiceUtil.updateFormDataPlugin(groupId, dossierId,
								dossierFile.getReferenceUid(), formData, context);
					/*} else {
						// add temp File				
						

					}*/

				} else {

					DossierFileLocalServiceUtil.updateFormDataPlugin(groupId, dossierId,
							dossierFile.getReferenceUid(), formData, context);

				}
				
				// SONVH xu ly rut gon formData
				_log.info("==========rut gon formData trong noi dung Chung chi =========");
				try {
					JSONObject shortFormData = JSONFactoryUtil.createJSONObject(formData);
					Iterator<String> keys = shortFormData.keys();
		            while(keys.hasNext()) {
		                String key = keys.next();
		                if (key.startsWith("trackChange_") || key.startsWith("thong_so_ky_thuat")) {
		                	System.out.println(key);
		                	shortFormData.remove(key);
		                }
		            }
					
					formData = shortFormData.toJSONString();
					_log.info("==========rut gon formData===="+formData);
				} catch (Exception e) {
					
				}
			}

		} catch (Exception e) {
			_log.error(e);
			_log.info("Cant get formdata with fileTemplateNo_" + fileTemplateNo);
		}

		return formData;
	}

	private String _getFormScript(String fileTemplateNo, long dossierId) {
		String formData = StringPool.BLANK;

		fileTemplateNo = StringUtil.replaceFirst(fileTemplateNo, "#", StringPool.BLANK);

		try {

			Dossier dossier = DossierLocalServiceUtil.getDossier(dossierId);

			DossierPart part = DossierPartLocalServiceUtil.getByFileTemplateNo(dossier.getGroupId(), fileTemplateNo);

			formData = part.getFormReport();

		} catch (Exception e) {
			_log.info("Cant get formdata with fileTemplateNo_" + fileTemplateNo);
		}

		return formData;
	}

	private String _getFormHtml(String fileTemplateNo, long dossierId) {
		String formData = StringPool.BLANK;

		fileTemplateNo = StringUtil.replaceFirst(fileTemplateNo, "#", StringPool.BLANK);

		try {

			Dossier dossier = DossierLocalServiceUtil.getDossier(dossierId);

			DossierPart part = DossierPartLocalServiceUtil.getByFileTemplateNo(dossier.getGroupId(), fileTemplateNo);

			formData = part.getFormScript();

		} catch (Exception e) {
			_log.info("Cant get formdata with fileTemplateNo_" + fileTemplateNo);
		}

		return formData;
	}

	Log _log = LogFactoryUtil.getLog(ProcessPluginManagementImpl.class);

	@Override
	public Response getPreviewHtml(HttpServletRequest request, HttpHeaders header, Company company, Locale locale,
			User user, ServiceContext serviceContext, String id, long pluginid) {
		BackendAuth auth = new BackendAuthImpl();

		long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));

		try {

			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}

			Dossier dossier = DossierMgtUtils.getDossier(id, groupId);

			if (Validator.isNotNull(dossier)) {

				long dossierActionId = dossier.getDossierActionId();

				if (dossierActionId != 0) {

					ProcessPlugin plugin = ProcessPluginLocalServiceUtil.getProcessPlugin(pluginid);

					// String formReport = plugin.getPluginForm();

					String formCode = plugin.getSampleData();

					boolean autoRun = plugin.getAutoRun();

					String pluginForm = plugin.getPluginForm();

					String[] splipPluginForms = StringUtil.split(pluginForm, StringPool.AT);

					boolean original = false;

					if (splipPluginForms.length == 3 && splipPluginForms[2].contentEquals("original")) {
						original = true;
					}

					String formData = StringPool.BLANK;
					String formReport = StringPool.BLANK;

					if (formCode.startsWith("#")) {
						formData = _getFormData(groupId, formCode, dossier.getDossierId(), autoRun,
								dossier.getDossierTemplateNo(), original, dossierActionId, serviceContext);

						formReport = _getFormHtml(formCode, dossier.getDossierId());
					}

					JSONObject result = JSONFactoryUtil.createJSONObject();

					String fileTemplateNo = StringUtil.replaceFirst(formCode, "#", StringPool.BLANK);

					DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(
							dossier.getDossierId(), fileTemplateNo, false,
							new DossierFileComparator(false, "createDate", Date.class));

					DossierPart dossierPart = DossierPartLocalServiceUtil.getByFileTemplateNo(groupId, fileTemplateNo);

					long dossierFileId = 0;
					String partNo = StringPool.BLANK;

					if (Validator.isNotNull(dossierFile)) {
						dossierFileId = dossierFile.getDossierFileId();
					}
					
					if (Validator.isNotNull(dossierPart)) {
						partNo = dossierPart.getPartNo();
					}
					
					result.put("partNo", partNo);
					result.put("dossierFileId", dossierFileId);
					result.put("formReport", formReport);
					result.put("formData", formData);

					return Response.status(HttpURLConnection.HTTP_OK).entity(JSONFactoryUtil.looseSerialize(result))
							.build();

				} else {
					throw new Exception("The dossier wasn't on process");
				}

			} else {
				throw new Exception("Cant get dossier with id_" + id);
			}

		} catch (Exception e) {
			_log.error(e);

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

	@Override
	public Response updateFormDataPlugins(HttpServletRequest request, HttpHeaders header, Company company,
			Locale locale, User user, ServiceContext serviceContext, long dossierId) {
		BackendAuth auth = new BackendAuthImpl();
		
		try {
			if (!auth.isAuth(serviceContext)) {
				throw new UnauthenticationException();
			}
			
			Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);
			DossierAction dossierAction = null;
			long groupId = GetterUtil.getLong(header.getHeaderString("groupId"));
			
			if (dossier != null) {
				long dossierActionId = dossier.getDossierActionId();
				_log.info("dossierActionId: "+dossierActionId);
				if (dossierActionId > 0) {
					dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);
				}
				
				long serviceProcessId = dossierAction != null ? dossierAction.getServiceProcessId() : 0;
				String stepCode = dossierAction != null ? dossierAction.getStepCode() : StringPool.BLANK;
	
				DossierActionUser dau = DossierActionUserLocalServiceUtil.getByDID_UID_MOD(dossierActionId, user.getUserId(), 1);
				if (dau != null) {
					List<ProcessPlugin> pluginList = ProcessPluginLocalServiceUtil
							.getBySC_SPID_ARUN(serviceProcessId, stepCode, true);
		
					if (pluginList != null && pluginList.size() > 0) {
						for (ProcessPlugin plg : pluginList) {
							// do create file
							String pluginForm = plg.getPluginForm();
							String fileTemplateNo = StringUtil.replaceFirst(plg.getSampleData(), "#", StringPool.BLANK);
		
							if (Validator.isNotNull(pluginForm) && !pluginForm.contains("original")) {
								long now = System.currentTimeMillis();

								_log.info("@@@@@ START_DOAUTORUN: "
										+ LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
								
								try {
									// Dossier dossier = DossierLocalServiceUtil.getDossier(dossierId);

									DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossierId,
											fileTemplateNo, false, new DossierFileComparator(false, "createDate", Date.class));

									_log.info("- DOSSIER_FILE 1: "
											+ (System.currentTimeMillis() - now));

									DossierPart dossierPart = DossierPartLocalServiceUtil.getByFileTemplateNo(groupId, fileTemplateNo);
									
									_log.info("- DOSSIER_PART	: "
											+ (System.currentTimeMillis() - now));

									String formData = AutoFillFormData.sampleDataBinding(dossierPart.getSampleData(), dossierId, serviceContext);
									
									_log.info("- FORM_DATA		: "
											+ (System.currentTimeMillis() - now));

									if (Validator.isNull(dossierFile)) {

										DossierFileActions actions = new DossierFileActionsImpl();

										dossierFile = actions.addDossierFile(groupId, dossierId, PortalUUIDUtil.generate(), dossier.getDossierTemplateNo(),
												dossierPart.getPartNo(), fileTemplateNo, dossierPart.getPartName(), StringPool.BLANK, 0L, null,
												StringPool.BLANK, String.valueOf(false), dossierActionId, serviceContext);

										_log.info("- ADD DOSSIER_FL		: "
												+ (System.currentTimeMillis() - now));

									}

									DossierFileActions actions = new DossierFileActionsImpl();
									actions.updateDossierFileFormData(groupId, dossierId, dossierActionId, dossierFile.getReferenceUid(), formData, serviceContext);
									
									//DossierFileLocalServiceUtil.updateFormDataPlugin(groupId, dossierId,
									//		dossierFile.getReferenceUid(), formData, context);
									_log.info("- UPDATE DSR_ACT		: "
											+ (System.currentTimeMillis() - now));


								} catch (Exception e) {
									_log.info("Cant get formdata with fileTemplateNo_" + fileTemplateNo);
								}

								_log.info("!!!! END_DOAUTORUN: "
										+ LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME));
							}
						}
					}
				}
			}
			return Response.status(HttpURLConnection.HTTP_OK).entity("Done").build();
		} catch (Exception e) {
			_log.error(e);
	
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
}
