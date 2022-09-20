package org.opencps.dossiermgt.scheduler;

import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRApplicantProfileHistory;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.impl.VRApplicantProfileHistoryImpl;
import com.fds.vr.business.model.impl.VRApplicantProfileImpl;
import com.fds.vr.business.model.impl.VRProductionPlantImpl;
import com.fds.vr.business.service.VRApplicantProfileHistoryLocalServiceUtil;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRProductionPlantLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.servlet.HttpMethods;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import java.net.HttpURLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.communication.model.ServerConfig;
import org.opencps.communication.service.ServerConfigLocalServiceUtil;
import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;
import org.opencps.dossiermgt.constants.RegistrationTerm;
import org.opencps.dossiermgt.model.Registration;
import org.opencps.dossiermgt.model.RegistrationForm;
import org.opencps.dossiermgt.model.RegistrationTemplates;
import org.opencps.dossiermgt.service.RegistrationFormLocalServiceUtil;
import org.opencps.dossiermgt.service.RegistrationLocalServiceUtil;
import org.opencps.dossiermgt.service.RegistrationTemplatesLocalServiceUtil;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.service.ApplicantLocalServiceUtil;
import org.opencps.usermgt.utils.DateTimeUtils;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = RegistrationSyncScheduler.class)
public class RegistrationSyncScheduler extends BaseSchedulerEntryMessageListener {

	@Override
	protected void doReceive(Message message) throws Exception {

		//_log.info("OpenCPS SYNC Registration IS STARTING : " + APIDateTimeUtils.convertDateToString(new Date()));
		
		Company company = CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));
		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setCompanyId(company.getCompanyId());

		InvokeREST rest = new InvokeREST();

		// Get all SERVER NO need to DOSSIER sync to
		HashMap<String, String> properties = new HashMap<String, String>();
		List<ServerConfig> configList = ServerConfigLocalServiceUtil.getServerConfigs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		if (configList != null && configList.size() > 0) {
		for (ServerConfig config : configList) {
				long groupId = config.getGroupId();
				//_log.info("resServerConfig groupId ---------- :" + groupId);
				
				// TODO GROUP EMPLOYEE
				long desGroupId = 55301;

				// listener submiting of server
				List<Registration> registrations = RegistrationLocalServiceUtil.getdByF_submitting(groupId, Boolean.TRUE);
				//_log.info("resServerConfig registrations ---------- :" + registrations);
				String registrationEndpoint = "registrations/syncs";
				String registrationFormEndpoint = "registrations/syncs/form";
				//
				if (registrations != null && registrations.size() > 0) {
					processUpdateRegistrationForm(registrations, properties, rest, groupId, desGroupId,
							registrationEndpoint, registrationFormEndpoint, serviceContext);
				}
				// listener submiting of client
				List<Registration> registrationClients = RegistrationLocalServiceUtil.getdByF_submitting(desGroupId, Boolean.TRUE);
				if (registrationClients != null && registrationClients.size() > 0) {
					processUpdateRegistrationClient(registrationClients, properties, rest, groupId, desGroupId,
							registrationEndpoint, registrationFormEndpoint, serviceContext);
				}
			}
		}
		
		//_log.info("OpenCPS SYNC Registration HAS BEEN DONE : " + APIDateTimeUtils.convertDateToString(new Date()));

	}
	

	private void processUpdateRegistrationClient(List<Registration> registrationClientList,
			HashMap<String, String> properties, InvokeREST rest, long groupId, long desGroupId,
			String registrationEndpoint, String registrationFormEndpoint, ServiceContext serviceContext) {

		for (Registration registrationClient : registrationClientList) {
			Registration registrationServer = RegistrationLocalServiceUtil
					.fetchRegistrationByUuidAndGroupId(registrationClient.getUuid(), groupId);

			if (registrationServer != null) {
				Map<String, Object> params = getParamsPostRegistration(registrationClient);
				//_log.info("params: "+JSONFactoryUtil.looseSerialize(params));

				JSONObject clientRegistrationPOSTrespone = rest.callPostAPI(groupId, HttpMethods.POST,
						"application/json", RESTFulConfiguration.SERVER_PATH_BASE, registrationEndpoint,
						RESTFulConfiguration.SERVER_USER, RESTFulConfiguration.SERVER_PASS, properties, params,
						serviceContext);

				if (clientRegistrationPOSTrespone.getInt(RESTFulConfiguration.STATUS) == HttpURLConnection.HTTP_OK) {
					registrationClient.setSubmitting(Boolean.FALSE);
					registrationClient.setModifiedDate(new Date());

					RegistrationLocalServiceUtil.updateRegistration(registrationClient);

					if (registrationClient.getRegistrationState() == 2) {
						try {
							//_log.info("Start Update application info ==="+registrationClient.getApplicantIdNo() );
							// 1. Update application info
							Applicant applicant = ApplicantLocalServiceUtil
									.fetchByAppId(registrationClient.getApplicantIdNo());

							if (applicant != null) {
								applicant.setContactTelNo(registrationClient.getContactTelNo());
								applicant.setContactName(registrationClient.getContactName());
								applicant.setApplicantName(registrationClient.getApplicantName());
								applicant.setApplicantIdType(registrationClient.getApplicantIdType());
								applicant.setApplicantIdNo(registrationClient.getApplicantIdNo());
								applicant.setApplicantIdDate(registrationClient.getApplicantIdDate());
								applicant.setAddress(registrationClient.getAddress());
								applicant.setCityCode(registrationClient.getCityCode());
								applicant.setCityName(registrationClient.getCityName());
								applicant.setDistrictCode(registrationClient.getDistrictCode());
								applicant.setDistrictName(registrationClient.getDistrictName());
								applicant.setWardCode(registrationClient.getWardCode());
								applicant.setWardName(registrationClient.getWardName());
								applicant.setContactEmail(registrationClient.getContactEmail());
								applicant.setRepresentativeEnterprise(registrationClient.getRepresentativeEnterprise());

								ApplicantLocalServiceUtil.updateApplicant(applicant);
							}

							String mappingMA_CTY = StringPool.BLANK;
							String mappingTEN_CTY = StringPool.BLANK;
							String mappingDIA_CHI_CTY = StringPool.BLANK;
							String mappingStatus = StringPool.BLANK;
							String mappingNote = StringPool.BLANK;
							String markupDesigner = StringPool.BLANK; // 1: CSTK
							String markupDomesticsManufacturer = StringPool.BLANK; // 2: CSSX TN
							String markupImporter = StringPool.BLANK; // 3: CSNK
							String markupCorporation = StringPool.BLANK; // 4:CSSX NN, 5: CSBHBD, 9: KHAC
							String markupOverseasManufacturer = StringPool.BLANK;

							SimpleDateFormat formatDateShort = new SimpleDateFormat("dd/MM/yyyy");
							String applicantCeremonyDate = formatDateShort
									.format(registrationClient.getApplicantIdDate());

							RegistrationForm registrationFormTTC = RegistrationFormLocalServiceUtil
									.getByRegIdAndFormNo(registrationClient.getRegistrationId(), "TTCDN");

							String applicantBusinessType = StringPool.BLANK;
							if (registrationFormTTC != null && registrationFormTTC.getFormData().length() > 1) {
								JSONObject formJson = JSONFactoryUtil
										.createJSONObject(registrationFormTTC.getFormData());
								applicantBusinessType = formJson.getString("loai_hinh_doanh_nghiep");
								markupCorporation = formJson.getString("doi_tuong");
								markupDesigner = markupCorporation.contains("1") ? "1" : "0";
								markupDomesticsManufacturer = markupCorporation.contains("2") ? "1" : "0";
								markupImporter = markupCorporation.contains("3") ? "1" : "0";
							}

							boolean flagUpdate = true;
							boolean flagNotDuplicate = true; //must check
							// 2. Update vr_applicantprofile

							VRApplicantProfile appProfile = new VRApplicantProfileImpl();
                    		VRApplicantProfile vrApplicantProfile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(registrationClient.getApplicantIdNo().trim());
                            if (vrApplicantProfile != null) {
                            	appProfile = vrApplicantProfile;
                            	flagUpdate = true;
                            } else {
                            	flagUpdate = false;
                            	appProfile.setId(CounterLocalServiceUtil.increment(VRApplicantProfile.class.getName()));
                            }

							appProfile.setMtCore(1);
							appProfile.setModifyDate(new Date());
							appProfile.setSyncDate(new Date());

							if (1 == 1) {
								// Mapping with one specific Oracle account (if
								// exist)

								appProfile.setMappingMA_CTY(mappingMA_CTY);
								appProfile.setMappingTEN_CTY(mappingTEN_CTY);
								appProfile.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
								appProfile.setMappingStatus(mappingStatus);
								appProfile.setMappingNote(mappingNote);
							}
							appProfile.setApplicantCode(registrationClient.getApplicantIdNo());
							appProfile.setApplicantName(registrationClient.getApplicantName());
							appProfile.setApplicantAddress(registrationClient.getAddress());
							appProfile.setApplicantPhone(registrationClient.getContactTelNo());
							appProfile.setApplicantEmail(registrationClient.getContactEmail());
							appProfile.setApplicantFax("---");
							appProfile.setApplicantBusinessType(applicantBusinessType); // Lay tu json
							appProfile.setApplicantRepresentative(registrationClient.getContactName());
							appProfile
									.setApplicantRepresentativeTitle(registrationClient.getRepresentativeEnterprise());
							appProfile.setApplicantCity(registrationClient.getCityCode());
							appProfile.setApplicantContactName(registrationClient.getContactName());
							appProfile.setApplicantContactEmail(registrationClient.getContactEmail());
							appProfile.setApplicantContactPhone(registrationClient.getContactTelNo());
							appProfile.setApplicantNationality("VN");
							appProfile.setApplicantRegion("---");
							appProfile.setMarkupDesigner(markupDesigner); // Lay tu json
							appProfile.setMarkupDomesticsManufacturer(markupDomesticsManufacturer); // Lay tu json
							appProfile.setMarkupOverseasManufacturer(markupOverseasManufacturer); // Chua co thong tin
							appProfile.setMarkupCorporation(markupCorporation); // Lay tu json
							appProfile.setMarkupImporter(markupImporter); // Lay tu json
							appProfile.setApplicantStatus("2"); // da phe duyet
							appProfile.setApplicantCeremonyDate(applicantCeremonyDate.toString());

							if (flagUpdate == true) {
								VRApplicantProfileLocalServiceUtil.updateVRApplicantProfile(appProfile);
							} else {
								// Last check for duplicate error
								VRApplicantProfile profile = VRApplicantProfileLocalServiceUtil.findByApplicantCode(registrationClient.getApplicantIdNo().trim());
								if (profile != null) {
									_log.info("Kiem tra va Loai bo trung lap VRApplicantProfile.");
									flagNotDuplicate = false;
								} else {
									VRApplicantProfileLocalServiceUtil.addVRApplicantProfile(appProfile);
								}					
							}

							// 3. Insert vr_applicantprofile_history

							VRApplicantProfileHistory appProfileHistory = new VRApplicantProfileHistoryImpl();
							long VRApplicantProfileHistoryId = CounterLocalServiceUtil
									.increment(VRApplicantProfileHistory.class.getName());
							appProfileHistory.setId(VRApplicantProfileHistoryId);
							appProfileHistory.setMtCore(1);
							if (1 == 1) {
								// Mapping with one specific Oracle account (if
								// exist)
								appProfileHistory.setMappingMA_CTY(mappingMA_CTY);
								appProfileHistory.setMappingTEN_CTY(mappingTEN_CTY);
								appProfileHistory.setMappingDIA_CHI_CTY(mappingDIA_CHI_CTY);
								appProfileHistory.setMappingStatus(mappingStatus);
								appProfileHistory.setMappingNote(mappingNote);
							}
							appProfileHistory.setApplicantCode(registrationClient.getApplicantIdNo());
							appProfileHistory.setApplicantName(registrationClient.getApplicantName());
							appProfileHistory.setApplicantAddress(registrationClient.getAddress());
							appProfileHistory.setApplicantPhone(registrationClient.getContactTelNo());
							appProfileHistory.setApplicantEmail(registrationClient.getContactEmail());
							appProfileHistory.setApplicantFax("---");
							appProfileHistory.setApplicantBusinessType(applicantBusinessType); // Lay tu json
							appProfileHistory.setApplicantRepresentative(registrationClient.getContactName());
							appProfileHistory
									.setApplicantRepresentativeTitle(registrationClient.getRepresentativeEnterprise());
							appProfileHistory.setApplicantCity(registrationClient.getCityCode());
							appProfileHistory.setApplicantContactName(registrationClient.getContactName());
							appProfileHistory.setApplicantContactEmail(registrationClient.getContactEmail());
							appProfileHistory.setApplicantContactPhone(registrationClient.getContactTelNo());
							appProfileHistory.setApplicantNationality("VN");
							appProfileHistory.setApplicantRegion("---");
							appProfileHistory.setMarkupDesigner(markupDesigner); // Lay tu json
							appProfileHistory.setMarkupDomesticsManufacturer(markupDomesticsManufacturer); // Lay tu json
							appProfileHistory.setMarkupOverseasManufacturer(markupOverseasManufacturer);
							appProfileHistory.setMarkupCorporation(markupCorporation); // Lay tu json
							appProfileHistory.setMarkupImporter(markupImporter); // Lay tu json
							appProfileHistory.setApplicantStatus("2"); // da phe duyet
							appProfileHistory.setApplicantCeremonyDate(applicantCeremonyDate.toString());
							appProfileHistory.setModifyDate(new Date());
							appProfileHistory.setSyncDate(new Date());

							VRApplicantProfileHistoryLocalServiceUtil.addVRApplicantProfileHistory(appProfileHistory);
							
							
							flagUpdate = true; // reset flagUpdate
							// 4. Update vr_productionplant
							List<RegistrationForm> registrationForms = RegistrationFormLocalServiceUtil
									.getFormsbyRegId(desGroupId, registrationClient.getRegistrationId());
							//_log.info("groupId==="+desGroupId+"===registrationClient.getRegistrationId()==="+registrationClient.getRegistrationId()+"====registrationForms.size()===="+registrationForms.size());
							if (registrationForms != null && registrationForms.size() > 0 && (flagNotDuplicate == true) ) {
								//_log.info("1. Start Update vr_productionplant");
								for (RegistrationForm regForm : registrationForms) {

									if ((regForm.getFormData().length() > 1) && (regForm.getRemoved() == false)
											&& (regForm.getFormNo().contains("TTXSXLR"))) {
										//_log.info("2. form TTXSXLR");
										JSONObject xuongSXJson = JSONFactoryUtil.createJSONObject();
										String formData = regForm.getFormData();
										long registrationFormId = regForm.getRegistrationFormId();
										try {
											JSONObject formJson = JSONFactoryUtil.createJSONObject(formData);
											String productionPlantName = formJson.getString("ten_xuong_san_xuat");
											String productionPlantAddress = formJson
													.getString("dia_chi_xuong_san_xuat");
											String productionPlantRepresentative = formJson
													.getString("nguoi_dai_dien_xuong");
											String productionPlantRepresentativeTitle = formJson
													.getString("chuc_danh_dai_dien_xuong");
											String email_xuong = formJson.getString("email_xuong");
											if (Validator.isNotNull(productionPlantName)
													&& Validator.isNotNull(productionPlantAddress)) {
												_log.info("Quy tac Update form TTXSXLR==="+productionPlantName);
												 /*Quy tac Update: Trung ca ten
												 & dia chi; hoac Trung ten,
												 khac dia chi; hoac Trung dia
												 chi va nguoi_dai_dien_xuong
												 int Count1 = 0; // Trung ca ten & dia chi;
												 int Count2 = 0; // hoac Trung ten, khac dia chi;
												 int Count3 = 0; // hoac Trung dia chi va nguoi_dai_dien_xuong;*/
												long applicantProfileId = appProfile.getId();

												VRProductionPlant objProductionPlant = new VRProductionPlantImpl();
												List<VRProductionPlant> lstProductionPlantCount1 = VRProductionPlantLocalServiceUtil
														.findByproductionPlantName(1, applicantProfileId,
																productionPlantName);
												if (lstProductionPlantCount1 != null
														&& lstProductionPlantCount1.size() > 0) {
													objProductionPlant = lstProductionPlantCount1.get(0);
													flagUpdate = true;
													_log.info("3.1");
												} else {
													List<VRProductionPlant> lstProductionPlantCount2 = VRProductionPlantLocalServiceUtil
															.findByproductionPlantName_PPAddress(1, applicantProfileId,
																	productionPlantName, productionPlantAddress);
													if (lstProductionPlantCount2 != null
															&& lstProductionPlantCount2.size() > 0) {
														objProductionPlant = lstProductionPlantCount2.get(0);
														flagUpdate = true;
														_log.info("3.2");
													} else {
														List<VRProductionPlant> lstProductionPlantCount3 = VRProductionPlantLocalServiceUtil
																.findByproductionPlantRep_PPAddress(1,
																		applicantProfileId,
																		productionPlantRepresentative,
																		productionPlantAddress);
														if (lstProductionPlantCount3 != null
																&& lstProductionPlantCount3.size() > 0) {
															objProductionPlant = lstProductionPlantCount3.get(0);
															flagUpdate = true;
															_log.info("3.3");
														} else {
															flagUpdate = false;
															_log.info("3.4");
														}
													}
												}

												if (flagUpdate == false) {													
													objProductionPlant = new VRProductionPlantImpl();
													long VRProductionPlantId = CounterLocalServiceUtil
															.increment(VRProductionPlant.class.getName());
													objProductionPlant.setId(VRProductionPlantId);
													objProductionPlant.setApplicantProfileId(applicantProfileId);
													objProductionPlant.setProductionPlantCode(
															registrationClient.getApplicantIdNo() + "."
																	+ VRProductionPlantId);
													_log.info("3.5");
												}

												objProductionPlant.setMtCore(1);
												objProductionPlant.setModifyDate(new Date());
												objProductionPlant.setSyncDate(new Date());

												objProductionPlant.setProductionPlantName(productionPlantName);
												objProductionPlant.setProductionPlantAddress(productionPlantAddress);
												objProductionPlant.setProductionPlantStateCode("VN");
												objProductionPlant.setProductionPlantStateName("Vietnam");
												objProductionPlant.setProductionPlantProvinceCode(
														registrationClient.getCityCode());
												objProductionPlant.setRegistrationFormId(registrationFormId);
												try {
													String provinceName = getDictItemName(groupId, "ADMINISTRATIVE_REGION", registrationClient.getCityCode());
													if (Validator.isNotNull(registrationClient.getCityCode()) && Validator.isNotNull(productionPlantAddress)) {
														Integer lastPoint = productionPlantAddress.lastIndexOf (' ');
														if (lastPoint > 3) {
															String[] arrSplit_2 = provinceName.split("\\s");
															String lastTwoWordsOfProvince= arrSplit_2[arrSplit_2.length-2] + " " + arrSplit_2[arrSplit_2.length-1]; 
															_log.info("productionPlantAddress.lastIndexOf (' ')" + lastPoint + "===lastTwoWordsOfProvince=="+lastTwoWordsOfProvince);
															if ( productionPlantAddress.toLowerCase().contains(lastTwoWordsOfProvince.toLowerCase())) {
																objProductionPlant.setProductionPlantProvinceName(provinceName);
															} else {
																List <DictItem> lstDictItemProvince = DictItemLocalServiceUtil.findByF_dictCollectionId_parentItemId(1, 0);
																for (DictItem objProvince : lstDictItemProvince) {
																	String[] arrSplit_3 = objProvince.getItemName().split("\\s");
																	lastTwoWordsOfProvince= arrSplit_3[arrSplit_3.length-2] + " " + arrSplit_3[arrSplit_3.length-1];
																	
																	if ( productionPlantAddress.toLowerCase().contains(lastTwoWordsOfProvince.toLowerCase())) {
																		objProductionPlant.setProductionPlantProvinceName(objProvince.getItemName());
																		objProductionPlant.setProductionPlantProvinceCode(objProvince.getItemCode());
																	} 
																}
																
															}
														} 
													}
													if (Validator.isNotNull(registrationClient.getCityCode())
															&& Validator.isNull(objProductionPlant
																	.getProductionPlantProvinceName())) {
														objProductionPlant.setProductionPlantProvinceName(provinceName);
													}
												} catch (Exception e) {
													// TODO: handle exception
												}

												objProductionPlant.setProductionPlantEmail(email_xuong);
												objProductionPlant.setProductionPlantRepresentative(
														productionPlantRepresentative);
												objProductionPlant.setProductionPlantRepresentativeTitle(
														productionPlantRepresentativeTitle);
												objProductionPlant.setProductionPlantType("TN");
												objProductionPlant.setProductionPlantStatus(1 + "");
												objProductionPlant.setRegistrationId(regForm.getRegistrationId());

												if (flagUpdate == true) {
													_log.info("3.6");

													VRProductionPlantLocalServiceUtil
															.updateVRProductionPlant(objProductionPlant);
												} else {
													_log.info("3.7");
													VRProductionPlantLocalServiceUtil
															.addVRProductionPlant(objProductionPlant);
												}

											}

										} catch (Exception e) {
											_log.info("3.x");
											// TODO: handle exception
										}
									}
								}

							}

							flagUpdate = true; // reset flagUpdate
							// 5. Mapping with one specific Oracle account-based
							// XuongSX (if exist)

						} catch (Exception e) {
							_log.error(e);
						}
					}
				}
			}
		}
		
	}


	private void processUpdateRegistrationForm(List<Registration> registrations, HashMap<String, String> properties,
			InvokeREST rest, long groupId, long desGroupId, String registrationEndpoint,
			String registrationFormEndpoint, ServiceContext serviceContext) throws PortalException {
		for (Registration registration : registrations) {
			
			Map<String, Object> params = getParamsPostRegistration(registration);
			
			JSONObject registrationPOSTrespone = rest.callPostAPI(desGroupId, HttpMethods.POST, "application/json", 
					RESTFulConfiguration.SERVER_PATH_BASE, registrationEndpoint, RESTFulConfiguration.SERVER_USER,
					RESTFulConfiguration.SERVER_PASS,
					properties, params, serviceContext);
			
			if (registrationPOSTrespone.getInt(RESTFulConfiguration.STATUS) == HttpURLConnection.HTTP_OK) {
				
				registration.setSubmitting(Boolean.FALSE);
				RegistrationLocalServiceUtil.updateRegistration(registration);
				
				// TODO sync registrationForm
				List<RegistrationForm> registrationForms = RegistrationFormLocalServiceUtil.getFormsbyRegId(groupId, registration.getRegistrationId());
				
				for (RegistrationForm registrationForm : registrationForms) {
					
					// Map<String, Object> paramsForm = getParamsPostRegistrationForm(registrationForm, registration.getUuid());
					Map<String, Object> paramsForm = getParamsPostRegistrationFormBusiness(groupId, registrationForm, registration.getUuid());
					
					JSONObject registrationFormPOSTrespone = rest.callPostAPI(desGroupId, HttpMethods.POST, "application/json", 
							RESTFulConfiguration.SERVER_PATH_BASE, registrationFormEndpoint, RESTFulConfiguration.SERVER_USER,
							RESTFulConfiguration.SERVER_PASS,
							properties, paramsForm, serviceContext);
					
					if (registrationFormPOSTrespone.getInt(RESTFulConfiguration.STATUS) == HttpURLConnection.HTTP_OK) {
						if(registration.getRegistrationState() == 2) {
							 registrationForm.setIsNew(Boolean.FALSE);
						}
						registrationForm.setModifiedDate(new Date());
						RegistrationFormLocalServiceUtil.updateRegistrationForm(registrationForm);
						
					}
				}
				
			}
		}
	}

	private Map<String, Object> getParamsPostRegistration(Registration registration) {

		Map<String, Object> params = new HashMap<String, Object>();

		params.put(RegistrationTerm.UUID, registration.getUuid());
		params.put(RegistrationTerm.REGISTRATION_ID, registration.getRegistrationId());
		params.put(RegistrationTerm.GROUP_ID, registration.getGroupId());
		params.put(RegistrationTerm.USER_ID, registration.getUserId());
		params.put(RegistrationTerm.CREATE_DATE, registration.getCreateDate());
		params.put(RegistrationTerm.MODIFIED_DATE, registration.getModifiedDate());
		params.put(RegistrationTerm.COMPANY_ID, registration.getCompanyId());
		params.put(RegistrationTerm.APPLICATION_NAME, registration.getApplicantName());
		params.put(RegistrationTerm.APPLICATION_ID_TYPE, registration.getApplicantIdType());
		params.put(RegistrationTerm.APPLICATION_ID_NO, registration.getApplicantIdNo());
		params.put(RegistrationTerm.APPLICATION_ID_DATE, DateTimeUtils.convertDateToString(
		    registration.getApplicantIdDate(), DateTimeUtils._TIMESTAMP));
		params.put(RegistrationTerm.ADDRESS, registration.getAddress());
		params.put(RegistrationTerm.CITY_CODE, registration.getCityCode());
		params.put(RegistrationTerm.CITY_NAME, registration.getCityName());
		params.put(RegistrationTerm.DISTRICT_CODE, registration.getDistrictCode());
		params.put(RegistrationTerm.DISTRICT_NAME, registration.getDistrictName());
		params.put(RegistrationTerm.WARD_CODE, registration.getWardCode());
		params.put(RegistrationTerm.WARD_NAME, registration.getWardName());
		params.put(RegistrationTerm.CONTACT_NAME, registration.getContactName());
		params.put(RegistrationTerm.CONTACT_TEL_NO, registration.getContactTelNo());
		params.put(RegistrationTerm.CONTACT_EMAIL, registration.getContactEmail());
		params.put(RegistrationTerm.GOV_AGENCY_CODE, registration.getGovAgencyCode());
		params.put(RegistrationTerm.GOV_AGENCY_NAME, registration.getGovAgencyName());
		params.put(RegistrationTerm.REGISTRATIONSTATE, registration.getRegistrationState());
		params.put(RegistrationTerm.REGISTRATION_CLASS, registration.getRegistrationClass());
		params.put(RegistrationTerm.REPRESENTATIVE_ENTERPRISE, registration.getRepresentativeEnterprise());
		params.put(RegistrationTerm.SUBMITTING, registration.getSubmitting());
		params.put(RegistrationTerm.REMARKS, registration.getRemarks());
		params.put(RegistrationTerm.MARK_AS_DELETED, registration.getMarkasdeleted());

		return params;
	}
	
	private Map<String, Object> getParamsPostRegistrationFormBusiness(long groupId, RegistrationForm registrationForm, String registrationUUID) throws PortalException {

		Map<String, Object> params = new HashMap<String, Object>();

		try {
			String govAgencyCode = "";
			RegistrationTemplates registrationTemplate = RegistrationTemplatesLocalServiceUtil
					.getRegTempbyFormNoGovCode(groupId, registrationForm.getFormNo(), govAgencyCode);
			
			params.put(RegistrationTerm.UUID, registrationUUID);
			params.put("referenceUid", registrationForm.getReferenceUid());
			params.put("formNo", registrationForm.getFormNo());
			params.put("formName", registrationForm.getFormName());
			params.put("formData", registrationForm.getFormData()); // xem xet bo sung FormData chenh lech giua 2 cong
			params.put("formScript", registrationTemplate.getFormScriptOfficial());
			params.put("formReport", registrationTemplate.getFormReportOfficial());
			params.put("fileEntryId", registrationForm.getFileEntryId());
			params.put("removed", Boolean.valueOf(registrationForm.getRemoved()));
			
		} catch (Exception e) {
			throw new PortalException("RegistrationFormNotFound");
		}

		return params;
	}

	private Map<String, Object> getParamsPostRegistrationForm(RegistrationForm registrationForm, String registrationUUID) throws PortalException {

		Map<String, Object> params = new HashMap<String, Object>();

		try {

			params.put(RegistrationTerm.UUID, registrationUUID);
			params.put("referenceUid", registrationForm.getReferenceUid());
			params.put("formNo", registrationForm.getFormNo());
			params.put("formName", registrationForm.getFormName());
			params.put("formData", registrationForm.getFormData());
			params.put("formScript", registrationForm.getFormScript());
			params.put("formReport", registrationForm.getFormReport());
			params.put("fileEntryId", registrationForm.getFileEntryId());
			params.put("removed", Boolean.valueOf(registrationForm.getRemoved()));
			
		} catch (Exception e) {
			throw new PortalException("RegistrationFormNotFound");
		}

		return params;
	}

	private long getGroupId(JSONObject response) {
		long groupId = 0l;

		try {

			if (response.getInt(RESTFulConfiguration.STATUS) == 200) {

				JSONObject jsData = JSONFactoryUtil.createJSONObject(response.getString(RESTFulConfiguration.MESSAGE));
				groupId = jsData.getLong("groupId");
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		return groupId;
	}
	
	protected String getDictItemName(long groupId, String collectionCode, String itemCode) {

		DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(collectionCode, groupId);
		
		if (Validator.isNotNull(dc)) {
			DictItem it = DictItemLocalServiceUtil.fetchByF_dictItemCode(itemCode, dc.getPrimaryKey(), groupId);

			return it.getItemName();

		} else {
			return StringPool.BLANK;
		}

	}

	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(
				TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(), 1, TimeUnit.MINUTE));
		_schedulerEngineHelper.register(this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	@Deactivate
	protected void deactivate() {
		_schedulerEngineHelper.unregister(this);
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {

		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
	}

	private SchedulerEngineHelper _schedulerEngineHelper;

	private Log _log = LogFactoryUtil.getLog(RegistrationSyncScheduler.class);

}
