package org.opencps.api.controller.util;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.opencps.api.paymentfile.model.PaymentFileInputModel;
import org.opencps.api.paymentfile.model.PaymentFileModel;
import org.opencps.api.paymentfile.model.PaymentFileSearchTemplateModel;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.dossiermgt.constants.PaymentFileTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;

import com.liferay.document.library.kernel.model.DLFileVersion;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileVersionLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class PaymentFileUtils {

	/**
	 * Mapping documents with Object PaymentFileModel
	 * 
	 * @param documents
	 * @return List<PaymentFileModel>
	 */
	public static List<PaymentFileModel> mappingToPaymentFileModel(List<Document> documents) throws ParseException {

		if (documents == null) {
			return null;
		}

		List<PaymentFileModel> results = new ArrayList<PaymentFileModel>();

		for (Document doc : documents) {
			PaymentFileModel model = new PaymentFileModel();

			String strCreateDate = doc.get(Field.CREATE_DATE);

			Date createDate = null;

			if (Validator.isNotNull(strCreateDate)) {
				createDate = APIDateTimeUtils.convertStringToDate(strCreateDate, "yyyyMMddHHmmss");
			}

			model.setCreateDate(createDate != null
					? APIDateTimeUtils.convertDateToString(createDate, APIDateTimeUtils._TIMESTAMP) : strCreateDate);

			String strModifiedDate = doc.get(Field.MODIFIED_DATE);

			Date modifiedDate = null;

			if (Validator.isNotNull(strModifiedDate)) {
				modifiedDate = APIDateTimeUtils.convertStringToDate(strModifiedDate, "yyyyMMddHHmmss");
			}

			model.setModifiedDate(modifiedDate != null
					? APIDateTimeUtils.convertDateToString(modifiedDate, APIDateTimeUtils._TIMESTAMP)
					: strModifiedDate);
			// model.setCreateDate(doc.get(PaymentFileTerm.CREATE_DATE));
			// model.setModifiedDate(doc.get(PaymentFileTerm.MODIFIED_DATE));
			model.setReferenceUid(doc.get(PaymentFileTerm.REFERENCE_UID));
			model.setGovAgencyCode(doc.get(PaymentFileTerm.GOV_AGENCY_CODE));
			model.setGovAgencyName(doc.get(PaymentFileTerm.GOV_AGENCY_NAME));
			model.setApplicantName(doc.get(PaymentFileTerm.APPLICANT_NAME));
			model.setApplicantIdNo(doc.get(PaymentFileTerm.APPLICANT_ID_NO));
			// model.setIsNew(paymentFile.getIsNew());
			model.setPaymentFee(doc.get(PaymentFileTerm.PAYMENT_FEE));
			model.setPaymentAmount(GetterUtil.getLong(doc.get(PaymentFileTerm.PAYMENT_AMOUNT)));
			model.setPaymentNote(doc.get(PaymentFileTerm.PAYMENT_NOTE));
			model.setBankInfo(doc.get(PaymentFileTerm.BANK_INFO));
			model.setEpaymentProfile(doc.get(PaymentFileTerm.EPAYMENT_PROFILE));
			model.setPaymentStatus(Integer.parseInt(doc.get(PaymentFileTerm.PAYMENT_STATUS)));
			model.setPaymentMethod(doc.get(PaymentFileTerm.PAYMENT_METHOD));
			// model.setConfirmDatetime(APIDateTimeUtils.convertDateToString(doc.getDate(PaymentFileTerm.CONFIRM_DATETIME)));
			model.setConfirmPayload(doc.get(PaymentFileTerm.CONFIRM_PAYLOAD));
			DLFileVersion dlFilePayLoad = getFileInfo(
					GetterUtil.getLong(doc.get(PaymentFileTerm.CONFIRM_FILE_ENTRY_ID)));
			if (dlFilePayLoad != null) {
				model.setConfirmFileType(dlFilePayLoad.getExtension());
				model.setConfirmFileSize(dlFilePayLoad.getSize());
			} else {
				model.setConfirmFileType(StringPool.BLANK);
				model.setConfirmFileSize(0L);
			}
			model.setConfirmNote(doc.get(PaymentFileTerm.CONFIRM_NOTE));
			// model.setApproveDatetime(APIDateTimeUtils.convertDateToString(doc.getDate(PaymentFileTerm.APPROVE_DATETIME)));
			model.setAccountUserName(doc.get(PaymentFileTerm.ACCOUNT_USER_NAME));
			model.setGovAgencyTaxNo(doc.get(PaymentFileTerm.GOV_AGENCY_TAX_NO));
			model.setInvoiceTemplateNo(doc.get(PaymentFileTerm.INVOICE_TEMPLATE_NO));
			model.setInvoiceIssueNo(doc.get(PaymentFileTerm.INVOICE_ISSUE_NO));
			model.setInvoiceNo(doc.get(PaymentFileTerm.INVOICE_NO));
			model.setIsNew(GetterUtil.getBoolean(doc.get(PaymentFileTerm.IS_NEW)) ? 1 :0);
			
			DLFileVersion dlFileInvoice = getFileInfo(
					GetterUtil.getLong(doc.get(PaymentFileTerm.INVOICE_FILE_ENTRY_ID)));
			if (dlFileInvoice != null) {
				model.setInvoiceFileType(dlFileInvoice.getExtension());
				model.setInvoiceFileSize(dlFileInvoice.getSize());
			} else {
				model.setInvoiceFileType(StringPool.BLANK);
				model.setInvoiceFileSize(0L);
			}
			model.setConfirmFileEntryId(GetterUtil.getLong(doc.get(PaymentFileTerm.CONFIRM_FILE_ENTRY_ID)));
			
			Dossier dossier = DossierLocalServiceUtil.fetchDossier(GetterUtil.getLong(doc.get(PaymentFileTerm.DOSSIER_ID)));
			
			model.setBriefNote(dossier.getBriefNote());
			
			results.add(model);
		}

		return results;
	}

	/**
	 * Mapping Object PaymentFile with Object PaymentFileInputModel
	 * 
	 * @param paymentFile
	 * @return PaymentFileInputModel
	 */
	public static PaymentFileInputModel mappingToPaymentFileInputModel(PaymentFile paymentFile) {

		if (paymentFile == null) {
			return null;
		}

		PaymentFileInputModel model = new PaymentFileInputModel();

		model.setReferenceUid(paymentFile.getReferenceUid());
		//model.setGovAgencyCode(paymentFile.getGovAgencyCode());
		//model.setGovAgencyName(paymentFile.getGovAgencyName());
		// TODO:
//		try {
//			Dossier dossier = DossierLocalServiceUtil.getDossier(paymentFile.getDossierId());
//			//model.setApplicantName(dossier.getApplicantName());
//			//model.setApplicantIdNo(dossier.getApplicantIdNo());
//		} catch (Exception e) {
//			_log.error(e);
//		}
		model.setPaymentFee(paymentFile.getPaymentFee());
		model.setPaymentAmount(paymentFile.getPaymentAmount());
		model.setPaymentNote(paymentFile.getPaymentNote());
		model.setEpaymentProfile(paymentFile.getEpaymentProfile());

		return model;
	}

	/**
	 * Mapping Object PaymentFile with Object PaymentFileModel
	 * 
	 * @param paymentFile
	 * @return PaymentFileModel
	 */
	public static PaymentFileModel mappingToPaymentFileModel(PaymentFile paymentFile) {

		if (paymentFile == null) {
			return null;
		}

		PaymentFileModel model = new PaymentFileModel();

		model.setCreateDate(APIDateTimeUtils.convertDateToString(paymentFile.getCreateDate()));
		model.setModifiedDate(APIDateTimeUtils.convertDateToString(paymentFile.getModifiedDate()));
		model.setReferenceUid(paymentFile.getReferenceUid());
		model.setGovAgencyCode(paymentFile.getGovAgencyCode());
		model.setGovAgencyName(paymentFile.getGovAgencyName());
		Dossier dossier = null;
		try {
			dossier = DossierLocalServiceUtil.getDossier(paymentFile.getDossierId());

		} catch (Exception e) {
			_log.error(e);
		}

		model.setApplicantName((dossier != null && Validator.isNotNull(dossier.getApplicantName()))
				? dossier.getApplicantName() : StringPool.BLANK);
		model.setApplicantIdNo((dossier != null && Validator.isNotNull(dossier.getApplicantIdNo()))
				? dossier.getApplicantIdNo() : StringPool.BLANK);

		model.setIsNew(GetterUtil.getInteger(paymentFile.getIsNew()));
		model.setPaymentFee(paymentFile.getPaymentFee());
		model.setPaymentAmount(paymentFile.getPaymentAmount());
		model.setPaymentNote(paymentFile.getPaymentNote());
		model.setBankInfo(paymentFile.getBankInfo());
		model.setEpaymentProfile(paymentFile.getEpaymentProfile());
		model.setPaymentStatus(paymentFile.getPaymentStatus());
		model.setPaymentMethod(paymentFile.getPaymentMethod());
		model.setConfirmDatetime(APIDateTimeUtils.convertDateToString(paymentFile.getConfirmDatetime()));
		model.setConfirmPayload(paymentFile.getConfirmPayload());

		DLFileVersion dlFilePayLoad = getFileInfo(GetterUtil.getLong(paymentFile.getConfirmFileEntryId()));

		if (dlFilePayLoad != null) {
			model.setConfirmFileType(dlFilePayLoad.getExtension());
			model.setConfirmFileSize(dlFilePayLoad.getSize());
		} else {
			model.setConfirmFileType(StringPool.BLANK);
			model.setConfirmFileSize(0L);
		}
		model.setConfirmNote(paymentFile.getConfirmNote());
		model.setApproveDatetime(APIDateTimeUtils.convertDateToString(paymentFile.getApproveDatetime()));
		model.setAccountUserName(paymentFile.getAccountUserName());
		model.setGovAgencyTaxNo(paymentFile.getGovAgencyTaxNo());
		model.setInvoiceTemplateNo(paymentFile.getInvoiceTemplateNo());
		model.setInvoiceIssueNo(paymentFile.getInvoiceIssueNo());
		model.setInvoiceNo(paymentFile.getInvoiceNo());

		DLFileVersion dlFileInvoice = getFileInfo(GetterUtil.getLong(paymentFile.getInvoiceFileEntryId()));

		if (dlFileInvoice != null) {
			model.setConfirmFileType(dlFileInvoice.getExtension());
			model.setConfirmFileSize(dlFileInvoice.getSize());
		} else {
			model.setConfirmFileType(StringPool.BLANK);
			model.setConfirmFileSize(0L);
		}

		//Dossier dossier = DossierLocalServiceUtil.fetchDossier(GetterUtil.getLong(doc.get(PaymentFileTerm.DOSSIER_ID)));
		
		model.setBriefNote(dossier.getBriefNote());

		return model;
	}

	/**
	 * Mapping document with Object PaymentFileSearchTemplateModel
	 * 
	 * @param documents
	 * @return List<PaymentFileSearchTemplateModel>
	 */
	public static List<PaymentFileSearchTemplateModel> mappingToPaymentFileSearchResultModel(List<Document> documents) {

		if (documents == null) {
			return null;
		}
		


		List<PaymentFileSearchTemplateModel> results = new ArrayList<PaymentFileSearchTemplateModel>();
		//
		for (Document doc : documents) {
			
			Dossier dossier = DossierLocalServiceUtil.fetchDossier(GetterUtil.getLong(doc.get(PaymentFileTerm.DOSSIER_ID)));
			
			if (Validator.isNull(dossier)) {
				//_log.info("DOSSIER_IS_NULL**&&");
				continue;
			}

			PaymentFileSearchTemplateModel model = new PaymentFileSearchTemplateModel();

			// model.setCreateDate(APIDateTimeUtils.convertDateToString(doc.getDate(PaymentFileTerm.CREATE_DATE)));
			// model.setModifiedDate(APIDateTimeUtils.convertDateToString(doc.getDate(PaymentFileTerm.MODIFIED_DATE)));
			model.setDossierId(GetterUtil.getLong(doc.get(PaymentFileTerm.DOSSIER_ID)));
			model.setDossierNo(doc.get(PaymentFileTerm.DOSSIER_NO));
			model.setCounter(GetterUtil.getInteger(PaymentFileTerm.COUNTER));
			model.setServiceCode(doc.get(PaymentFileTerm.SERVICE_CODE));
			model.setServiceName(doc.get(PaymentFileTerm.SERVICE_NAME));
			model.setReferenceUid(doc.get(PaymentFileTerm.REFERENCE_UID));
			// model.setCreateDate(doc.get(PaymentFileTerm.CREATE_DATE));
			// model.setModifiedDate(doc.get(PaymentFileTerm.MODIFIED_DATE));

			String strCreateDate = doc.get(Field.CREATE_DATE);

			Date createDate = null;

			if (Validator.isNotNull(strCreateDate)) {
				createDate = APIDateTimeUtils.convertStringToDate(strCreateDate, "yyyyMMddHHmmss");
			}

			model.setCreateDate(createDate != null
					? APIDateTimeUtils.convertDateToString(createDate, APIDateTimeUtils._TIMESTAMP) : strCreateDate);

			String strModifiedDate = doc.get(Field.MODIFIED_DATE);

			Date modifiedDate = null;

			if (Validator.isNotNull(strModifiedDate)) {
				modifiedDate = APIDateTimeUtils.convertStringToDate(strModifiedDate, "yyyyMMddHHmmss");
			}

			model.setModifiedDate(modifiedDate != null
					? APIDateTimeUtils.convertDateToString(modifiedDate, APIDateTimeUtils._TIMESTAMP)
					: strModifiedDate);

			model.setGovAgencyCode(doc.get(PaymentFileTerm.GOV_AGENCY_CODE));
			model.setGovAgencyName(doc.get(PaymentFileTerm.GOV_AGENCY_NAME));
			model.setApplicantName(doc.get(PaymentFileTerm.APPLICANT_NAME));
			model.setApplicantIdNo(doc.get(PaymentFileTerm.APPLICANT_ID_NO));
			model.setIsNew(GetterUtil.getBoolean(doc.get(PaymentFileTerm.IS_NEW)));
			model.setPaymentFee(doc.get(PaymentFileTerm.PAYMENT_FEE));
			model.setPaymentAmount(GetterUtil.getLong(doc.get(PaymentFileTerm.PAYMENT_AMOUNT)));
			model.setPaymentNote(doc.get(PaymentFileTerm.PAYMENT_NOTE));
			model.setBankInfo(doc.get(PaymentFileTerm.BANK_INFO));
			model.setEpaymentProfile(doc.get(PaymentFileTerm.EPAYMENT_PROFILE));
			model.setPaymentStatus(Integer.parseInt(doc.get(PaymentFileTerm.PAYMENT_STATUS)));
			model.setPaymentMethod(doc.get(PaymentFileTerm.PAYMENT_METHOD));
			// model.setConfirmDatetime(doc.get(PaymentFileTerm.CONFIRM_DATETIME));

			String strConfirmDatetime = doc.get(PaymentFileTerm.CONFIRM_DATETIME);

			Date confirmDatetime = null;

			if (Validator.isNotNull(strConfirmDatetime)) {
				confirmDatetime = APIDateTimeUtils.convertStringToDate(strConfirmDatetime, "yyyyMMddHHmmss");
			}

			model.setConfirmDatetime(confirmDatetime != null
					? APIDateTimeUtils.convertDateToString(confirmDatetime, APIDateTimeUtils._TIMESTAMP)
					: strConfirmDatetime);

			model.setConfirmPayload(doc.get(PaymentFileTerm.CONFIRM_PAYLOAD));
			DLFileVersion dlFilePayLoad = getFileInfo(
					GetterUtil.getLong(doc.get(PaymentFileTerm.CONFIRM_FILE_ENTRY_ID)));
			if (dlFilePayLoad != null) {
				model.setConfirmFileType(dlFilePayLoad.getExtension());
				model.setConfirmFileSize(dlFilePayLoad.getSize());
			} else {
				model.setConfirmFileType(StringPool.BLANK);
				model.setConfirmFileSize(0L);
			}
			model.setConfirmNote(doc.get(PaymentFileTerm.CONFIRM_NOTE));
			// model.setApproveDatetime(doc.get(PaymentFileTerm.APPROVE_DATETIME));

			String strApproveDatetime = doc.get(PaymentFileTerm.CONFIRM_DATETIME);

			Date approveDatetime = null;

			if (Validator.isNotNull(strApproveDatetime)) {
				approveDatetime = APIDateTimeUtils.convertStringToDate(strApproveDatetime, "yyyyMMddHHmmss");
			}

			model.setApproveDatetime(approveDatetime != null
					? APIDateTimeUtils.convertDateToString(approveDatetime, APIDateTimeUtils._TIMESTAMP)
					: strApproveDatetime);

			model.setAccountUserName(doc.get(PaymentFileTerm.ACCOUNT_USER_NAME));
			model.setGovAgencyTaxNo(doc.get(PaymentFileTerm.GOV_AGENCY_TAX_NO));
			model.setInvoiceTemplateNo(doc.get(PaymentFileTerm.INVOICE_TEMPLATE_NO));
			model.setInvoiceIssueNo(doc.get(PaymentFileTerm.INVOICE_ISSUE_NO));
			model.setInvoiceNo(doc.get(PaymentFileTerm.INVOICE_NO));
			DLFileVersion dlFileInvoice = getFileInfo(
					GetterUtil.getLong(doc.get(PaymentFileTerm.INVOICE_FILE_ENTRY_ID)));
			if (dlFileInvoice != null) {
				model.setInvoiceFileType(dlFileInvoice.getExtension());
				model.setInvoiceFileSize(dlFileInvoice.getSize());
			} else {
				model.setInvoiceFileType(StringPool.BLANK);
				model.setInvoiceFileSize(0L);
			}

			model.seteInvoice(doc.get(PaymentFileTerm.E_INVOICE));
			model.setBriefNote(dossier.getBriefNote());

			results.add(model);

		}

		return results;
	}

	/**
	 * Get info file upload
	 * 
	 * @param fileId
	 * @return DLFileVersion
	 */
	public static DLFileVersion getFileInfo(Long fileId) {
		DLFileVersion dlFileVersion = null;

		if (fileId > 0) {
			try {
				FileEntry fileEntry = DLAppLocalServiceUtil.getFileEntry(fileId);
				dlFileVersion = DLFileVersionLocalServiceUtil.getLatestFileVersion(fileEntry.getFileEntryId(), true);
			} catch (Exception e) {
				_log.error(e);
			}
		}
		return dlFileVersion;
	}

	private static final String KHONG = "kh??ng";    
	private static final String MOT = "m???t";
	private static final String HAI = "hai";
	private static final String BA = "ba";
	private static final String BON = "b???n";
	private static final String NAM = "n??m";
	private static final String SAU = "s??u";
	private static final String BAY = "b???y";
	private static final String TAM = "t??m";
	private static final String CHIN = "ch??n";
	private static final String LAM = "l??m";
	private static final String LE = "l???";
	private static final String MUOI = "m????i";
	private static final String MUOIF = "m?????i";
	private static final String MOTS = "m???t";
	private static final String TRAM = "tr??m";
	private static final String NGHIN = "ngh??n";
	private static final String TRIEU = "tri???u";
	private static final String TY = "t???";
 
 
	private static final String [] number = {KHONG, MOT, HAI, BA,
        BON, NAM, SAU, BAY, TAM, CHIN};
    
	// H??m ?????c s???
	public static String readNum(String a) {
		ArrayList<String> kq = new ArrayList<String>();

		// C???t chu???i string ch??? s??? ra th??nh c??c chu???i nh??? 3 ch??? s???
		ArrayList<String> List_Num = splitString(a, 3);

		while (List_Num.size() != 0) {
			// X??t 3 s??? ?????u ti??n c???a chu???i (s??? ?????u ti??n c???a List_Num)
			switch (List_Num.size() % 3) {
			// 3 s??? ???? thu???c h??ng tr??m
			case 1:
				kq.addAll(read_3num(List_Num.get(0)));
				break;
			// 3 s??? ???? thu???c h??ng ngh??n
			case 2:
				ArrayList<String> nghin = read_3num(List_Num.get(0));
				if (!nghin.isEmpty()) {
					kq.addAll(nghin);
					kq.add(NGHIN);
				}
				break;
			// 3 s??? ???? thu???c h??ng tri???u
			case 0:
				ArrayList<String> trieu = read_3num(List_Num.get(0));
				if (!trieu.isEmpty()) {
					kq.addAll(trieu);
					kq.add(TRIEU);
				}
				break;
			}

			// X??t n???u 3 s??? ???? thu???c h??ng t???
			if (List_Num.size() == (List_Num.size() / 3) * 3 + 1 && List_Num.size() != 1)
				kq.add(TY);

			// X??a 3 s??? ?????u ti??n ????? ti???p t???c 3 s??? k???
			List_Num.remove(0);
		}
		
		StringBuilder sb = new StringBuilder();
		for (String s : kq) {
            sb.append(s);
            sb.append(" ");
        }
		sb.append("??????ng ");
		
		return sb.toString();
	}

	// ?????c 3 s???
	private static ArrayList<String> read_3num(String a) {
		ArrayList<String> kq = new ArrayList<String>();
		int num = -1;
		try {
			num = Integer.parseInt(a);
		} catch (Exception ex) {
		}
		if (num == 0)
			return kq;

		int hang_tram = -1;
		try {
			hang_tram = Integer.parseInt(a.substring(0, 1));
		} catch (Exception ex) {
		}
		int hang_chuc = -1;
		try {
			hang_chuc = Integer.parseInt(a.substring(1, 2));
		} catch (Exception ex) {
		}
		int hang_dv = -1;
		try {
			hang_dv = Integer.parseInt(a.substring(2, 3));
		} catch (Exception ex) {
		}

		// x??t h??ng tr??m
		if (hang_tram != -1) {
			kq.add(number[hang_tram]);
			kq.add(TRAM);
		}

		// x??t h??ng ch???c
		switch (hang_chuc) {
		case -1:
			break;
		case 1:
			kq.add(MUOIF);
			break;
		case 0:
			if (hang_dv != 0)
				kq.add(LE);
			break;
		default:
			kq.add(number[hang_chuc]);
			kq.add(MUOI);
			break;
		}

		// x??t h??ng ????n v???
		switch (hang_dv) {
		case -1:
			break;
		case 1:
			if ((hang_chuc != 0) && (hang_chuc != 1) && (hang_chuc != -1))
				kq.add(MOTS);
			else
				kq.add(number[hang_dv]);
			break;
		case 5:
			if ((hang_chuc != 0) && (hang_chuc != -1))
				kq.add(LAM);
			else
				kq.add(number[hang_dv]);
			break;
		case 0:
			if (kq.isEmpty())
				kq.add(number[hang_dv]);
			break;
		default:
			kq.add(number[hang_dv]);
			break;
		}
		return kq;
	}

	private static ArrayList<String> splitString(String str, int chunkSize) {
		int du = str.length() % chunkSize;
		// N???u ????? d??i chu???i kh??ng ph???i b???i s??? c???a chunkSize th?? th??m # v??o tr?????c cho ?????.
		if (du != 0)
			for (int i = 0; i < (chunkSize - du); i++)
				str = "#" + str;
		return splitStringEvery(str, chunkSize);
	}

	// H??m c???t chu???i ra th??nh chu???i nh???
	private static ArrayList<String> splitStringEvery(String s, int interval) {
		ArrayList<String> arrList = new ArrayList<String>();
		int arrayLength = (int) Math.ceil(((s.length() / (double) interval)));
		String[] result = new String[arrayLength];
		int j = 0;
		int lastIndex = result.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			result[i] = s.substring(j, j + interval);
			j += interval;
		}
		result[lastIndex] = s.substring(j);

		/*
		 * C?? th??? d??ng h??m sau ????? c???t nh??ng hi???u su???t s??? th???p h??n c??ch tr??n result =
		 * s.split("(?<=\\G.{" + interval + "})");
		 */

		arrList.addAll(Arrays.asList(result));
		return arrList;
	}

	private static Log _log = LogFactoryUtil.getLog(PaymentFileUtils.class.getName());

}
