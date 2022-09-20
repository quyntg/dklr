package com.fds.vr.business.action.impl;


import com.fds.vr.business.action.ILCertificateActions;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;

public class ILCertificateActionsImpl implements ILCertificateActions {

	@Override
	public JSONObject getDocAcceptList(String keywords, String serviceCode, String govAgencyCode,
			String routeCode, String fromDate, String toDate, int start, int limit) {

		JSONObject jsonData = JSONFactoryUtil.createJSONObject();
		
//		List<ILCertificate> dataList = ILCertificateLocalServiceUtil.getDocAcceptList(keywords, serviceCode, govAgencyCode, routeCode, fromDate,
//				toDate, start, limit);
//		jsonData.put("data", dataList);
//
//		long total = ILCertificateLocalServiceUtil.countDocAcceptList(keywords, serviceCode, govAgencyCode, routeCode, fromDate,
//				toDate);
//		jsonData.put("total", total);

		return jsonData;
	}

//	@Override
//	public ILCertificate getDetailCert(long certificateId) {
////		return ILCertificateLocalServiceUtil.fetchILCertificate(certificateId);
//		return null;
//	}
//
//	@Override
//	public List<ILVehicleCustomsBorderGuard> getBorderGuardList(String registrationNumber) {
//		//return ILVehicleCustomsBorderGuardLocalServiceUtil.getBorderGuardList(registrationNumber);
//		return null;
//	}

//	@Override
//	public ILVehicleCustomsBorderGuard addCustomBorderGuard(String registrationNumber, String expImpGateType,
//			String expImpGate, String driverName, String driverLicenceNo, Date regDate) {
//
////		return ILVehicleCustomsBorderGuardLocalServiceUtil.addCustomBorderGuard(registrationNumber, expImpGateType,
////				expImpGate, driverName, driverLicenceNo, regDate);
//		return null;
//
//	}

//	@Override
//	public ILCertificate getCertByValidFrom(String serviceCode, String applicant, String regSearch) {
//		ILCertificate certInfo = null;
//
////		List<ILCertificate> certList = ILCertificateLocalServiceUtil.getCertByValidFrom(serviceCode, applicant,
////				regSearch);
////		if (certList != null && certList.size() > 0) {
////			certInfo = certList.get(0);
////		}
//
//		return certInfo;
//
//	}

	@Override
	public JSONObject getCertByApplicant(String serviceCode, String applicant) {
		JSONObject jsonData = JSONFactoryUtil.createJSONObject();
		
//		List<ILCertificate> dataList = ILCertificateLocalServiceUtil.getByApplicant(serviceCode, applicant);
//		jsonData.put("data", dataList);
//
//		long total = ILCertificateLocalServiceUtil.countByApplicant(serviceCode, applicant);
//		jsonData.put("total", total);

		return jsonData;
	}

}
