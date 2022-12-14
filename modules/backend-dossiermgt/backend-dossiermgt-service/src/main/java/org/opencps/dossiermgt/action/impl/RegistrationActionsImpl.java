package org.opencps.dossiermgt.action.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.dossiermgt.action.RegistrationActions;
import org.opencps.dossiermgt.action.RegistrationLogActions;
import org.opencps.dossiermgt.model.Registration;
import org.opencps.dossiermgt.model.RegistrationForm;
import org.opencps.dossiermgt.model.RegistrationLog;
import org.opencps.dossiermgt.model.impl.RegistrationImpl;
import org.opencps.dossiermgt.service.DeliverableLocalServiceUtil;
import org.opencps.dossiermgt.service.RegistrationFormLocalServiceUtil;
import org.opencps.dossiermgt.service.RegistrationLocalServiceUtil;
import org.opencps.dossiermgt.service.RegistrationLogLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class RegistrationActionsImpl implements RegistrationActions {

	Log _log = LogFactoryUtil.getLog(RegistrationActionsImpl.class);

	@Override
	public Registration insert(long groupId, long companyId, String applicantName, String applicantIdType,
			String applicantIdNo, String applicantIdDate, String address, String cityCode, String cityName,
			String districtCode, String districtName, String wardCode, String wardName, String contactName,
			String contactTelNo, String contactEmail, String govAgencyCode, String govAgencyName, int registrationState,
			String registrationClass, String representativeEnterprise, int markasdeleted, String remarks, ServiceContext serviceContext)
			throws SystemException, PortalException {
		List<Registration> listRegistration = RegistrationLocalServiceUtil.getRegistrationByGID_UID(groupId,
				serviceContext.getUserId());
		//_log.info("listRegistration: "+listRegistration.size());
		// registration moi nhat se thiet lap flag markasdeleted = 1; Chi khi duyet moi chuyen ve gia tri 0;
		markasdeleted = 0; 
		
		if (listRegistration.size() == 0) {
			// _log.info("2. markasdeleted = 1");
			return RegistrationLocalServiceUtil.insert(groupId, companyId, applicantName, applicantIdType,
					applicantIdNo, applicantIdDate, address, cityCode, cityName, districtCode, districtName, wardCode,
					wardName, contactName, contactTelNo, contactEmail, govAgencyCode, govAgencyName, 0, 
					Validator.isNotNull(registrationClass) ? registrationClass.toString(): StringPool.BLANK,
					representativeEnterprise, markasdeleted, remarks, serviceContext);
			
		} else {
			Registration registration = listRegistration.get(0);
			int state = registration.getRegistrationState();
			//_log.info("registration: "+registration.getRegistrationId());
			//_log.info("state: "+state);
			if (state == 2) {
				//_log.info("3. markasdeleted = 1");
				return RegistrationLocalServiceUtil.insert(groupId, companyId, applicantName, applicantIdType,
						applicantIdNo, applicantIdDate, address, cityCode, cityName, districtCode, districtName,
						wardCode, wardName, contactName, contactTelNo, contactEmail, govAgencyCode, govAgencyName, 0,
						Validator.isNotNull(registrationClass) ? registrationClass.toString() : StringPool.BLANK,
						representativeEnterprise, markasdeleted, remarks, serviceContext);
			} else {
				//_log.info("4. return registration;");
				return registration;
			}
		}

	}

	@Override
	public Registration updateRegistration(long groupId, long registrationId, String applicantName,
			String applicantIdType, String applicantIdNo, String applicantIdDate, String address, String cityCode,
			String cityName, String districtCode, String districtName, String wardCode, String wardName,
			String contactName, String contactTelNo, String contactEmail, String govAgencyCode, String govAgencyName,
			int registrationState, String registrationClass, String representativeEnterprise,
			int markasdeleted, String remarks, 
			ServiceContext serviceContext) throws PortalException {

		int start = -1, end = -1;

		long userId = serviceContext.getUserId();

		List<RegistrationForm> lstRegistrationFormchange = new ArrayList<RegistrationForm>();
		
		List<RegistrationForm> lstRegistrationForm = RegistrationFormLocalServiceUtil.findByG_REGID_ISNEW(registrationId, true);
		// changeType IsNew in registrationForm
		if  (lstRegistrationForm != null && lstRegistrationForm.size() > 0 && registrationState == 2) {
			for (RegistrationForm registrationForm : lstRegistrationForm) {
					registrationForm.setIsNew(false);
					registrationForm.setModifiedDate(new Date());
					RegistrationForm registrationFormChanged = RegistrationFormLocalServiceUtil
							.updateRegistrationForm(registrationForm);
					lstRegistrationFormchange.add(registrationFormChanged);
			}
		}
		// add registrationLog
		String content = "";
		RegistrationLogActions registrationLogActions = new RegistrationLogActionsImpl();
		List<RegistrationLog> lstRegistrationLog = registrationLogActions.getRegistrationLogbyId(groupId,
				registrationId);
		if (lstRegistrationLog.size() == 0) {
			content = "1";
		} else {
			content = String.valueOf(Integer.valueOf(lstRegistrationLog.get(0).getContent()) + 1);
		}

		if (registrationState == 2 || registrationState == 3) {			
			addLog("", groupId, userId, registrationId, content, lstRegistrationFormchange);
		}
		markasdeleted = 0;
		if (registrationState == 2) {
			// Find all Registrations with exacted applicantIdNo: update markasdeleted from 0 to 1
			// Registration moi nhat khi duoc duyet se chuyen flag markasdeleted ve gia tri 0;
			Registration registration = RegistrationLocalServiceUtil.fetchRegistration(registrationId);
			List<Registration> oldReg =  RegistrationLocalServiceUtil.findByREG_APPNO_markasdeleted(groupId, registration.getApplicantIdNo(), markasdeleted);
			_log.info("groupId==="+groupId+"===applicantIdNo==="+registration.getApplicantIdNo()+"====findByREG_APPNO_markasdeleted.size()===="+oldReg.size());
			if (Validator.isNotNull(oldReg) && oldReg.size() > 0) {
				_log.info("1. Find all Registrations with exacted applicantIdNo: update markasdeleted from 0 to 1");
				_log.info("2. Latest approved registration: update markasdeleted up to 0;");
				for (Registration oldregistration : oldReg) {
					oldregistration.setMarkasdeleted(1);					
					RegistrationLocalServiceUtil.updateRegistration(oldregistration);
					long resGroupId = 55217;
					Registration registrationServer = RegistrationLocalServiceUtil
							.fetchRegistrationByUuidAndGroupId(oldregistration.getUuid(), resGroupId);

					if (registrationServer != null) {
						registrationServer.setMarkasdeleted(1);					
						RegistrationLocalServiceUtil.updateRegistration(registrationServer);
					}
				}
			}				
			remarks = StringPool.BLANK; // reset
			
		} /*else {
			markasdeleted = 1;
		}*/

		return RegistrationLocalServiceUtil.updateRegistration(groupId, registrationId, applicantName, applicantIdType,
				applicantIdNo, applicantIdDate, address, cityCode, cityName, districtCode, districtName, wardCode,
				wardName, contactName, contactTelNo, contactEmail, govAgencyCode, govAgencyName, registrationState,
				registrationClass, representativeEnterprise, markasdeleted, remarks, serviceContext);

	}

	@Override
	public Registration delete(long registrationId) throws PortalException {
		return RegistrationLocalServiceUtil.deleteRegistration(registrationId);

	}

	@Override
	public Registration getDetail(long registrationId) throws PortalException {
		return RegistrationLocalServiceUtil.getRegistration(registrationId);

	}

	@Override
	public RegistrationLog addLog(String author, long groupId, long userId, long registrationId, String content,
			List<RegistrationForm> payload) {
		JSONArray jsArray = JSONFactoryUtil.createJSONArray();
		for (RegistrationForm registrationForm : payload) {
			JSONObject mediaItemsJsonObject = JSONFactoryUtil.createJSONObject();

			mediaItemsJsonObject.put("registrationFormId", registrationForm.getRegistrationFormId());
			mediaItemsJsonObject.put("groupId", registrationForm.getGroupId());
			mediaItemsJsonObject.put("userId", registrationForm.getUserId());
			mediaItemsJsonObject.put("createDate", registrationForm.getCreateDate());
			mediaItemsJsonObject.put("modifiedDate", registrationForm.getModifiedDate());
			mediaItemsJsonObject.put("registrationId", registrationForm.getRegistrationId());
			mediaItemsJsonObject.put("referenceUid", registrationForm.getReferenceUid());
			mediaItemsJsonObject.put("formNo", registrationForm.getFormNo());
			mediaItemsJsonObject.put("formName", registrationForm.getFormName());
			mediaItemsJsonObject.put("formData", registrationForm.getFormData());
			mediaItemsJsonObject.put("formScript", registrationForm.getFormScript());
			mediaItemsJsonObject.put("formReport", registrationForm.getFormReport());
			mediaItemsJsonObject.put("fileEntryId", registrationForm.getFileEntryId());
			mediaItemsJsonObject.put("isNew", registrationForm.getIsNew());
			mediaItemsJsonObject.put("removed", registrationForm.getRemoved());
			jsArray.put(mediaItemsJsonObject);
		}
		// jsonObj.put("result", jsArray.to);
		String strPayload = jsArray.toJSONString();
		return RegistrationLogLocalServiceUtil.addLog(author, groupId, userId, registrationId, content, strPayload);

	}

	public int getfileEntryId(String formdata, String formScript, String formReport) {

		int fileEntryId = 0;

		return fileEntryId;
	}

	@Override
	public JSONObject getRegistrations(long userId, long companyId, long groupId, LinkedHashMap<String, Object> params,
			Sort[] sorts, int start, int end, ServiceContext serviceContext) {
		JSONObject result = JSONFactoryUtil.createJSONObject();

		Hits hits = null;

		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);

		try {

			hits = RegistrationLocalServiceUtil.searchLucene(userId, params, sorts, start, end, searchContext);

			result.put("data", hits.toList());

			result.put("total",
					RegistrationLocalServiceUtil.countLucense(userId, params, sorts, start, end, searchContext));

		} catch (Exception e) {
			_log.error(e);
		}

		return result;
	}


	@Override
	public JSONObject getFormDataByFormNo(long userId, long companyId, LinkedHashMap<String, Object> params, Sort[] object, int start,
			int end, ServiceContext serviceContext) {
		// TODO Auto-generated method stub
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		Hits hits = null;
		_log.info("companyId:"+companyId);
		SearchContext searchContext = new SearchContext();
		searchContext.setCompanyId(companyId);
		
		try {
			
			hits = RegistrationFormLocalServiceUtil.searchLucene(params, object, start, end, searchContext);
			
			result.put("data", hits.toList());
			
			long total = RegistrationFormLocalServiceUtil.countLucene(params, searchContext);
			
			result.put("total", total);
			
		} catch (Exception e) {
			_log.error(e);
		}
		
		return result;
	}
}