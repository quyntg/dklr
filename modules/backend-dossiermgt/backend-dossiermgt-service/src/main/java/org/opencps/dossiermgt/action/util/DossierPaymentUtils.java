package org.opencps.dossiermgt.action.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.opencps.dossiermgt.action.PaymentFileActions;
import org.opencps.dossiermgt.action.impl.PaymentFileActionsImpl;
import org.opencps.dossiermgt.constants.PaymentFileTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.PaymentConfig;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil;
import org.opencps.dossiermgt.service.PaymentConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.PaymentFileLocalServiceUtil;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class DossierPaymentUtils {

	static Log _log = LogFactoryUtil.getLog(DossierPaymentUtils.class);
//	public static void main(String[] args) {
//		
////		String pattern = "bank cash keypay net=[ payment = 2000000;  if (#gia_thiet_ke@TT302011BGTVTTTKXMCDPL05 * 0.08 < 2000000)"
////				+ " { payment = 2000000 + 50000; } "
////				+ "else { payment = #gia_thiet_ke@TT302011BGTVTTTKXMCDPL05 * 0.08 + 50000; }]"
////				+ "   ship=0 tax=0  $Lệ phí cấp chứng chỉ và phí thẩm định thiết kế$";
//		//String pattern = "net=[ payment = 2000000;  if (100000 * 0.08 < 2000000)"
//		//		+ " { payment = 2000000 + 50000; } "
//		//		+ "else { payment = 100000 * 0.08 + 50000; }]";
//		//String pattern2 = "total=[payment = LePhi + shipAmount ]";
//		String pattern = "tong = [payment = 2000000/11 * 10;  if(#100000 * 0.08 < 2000000) "
//				+ "{ payment = 2000000/11 * 10; } else { payment = 100000 * 0.08 / 11 * 10; }]";
//
////		org.json.JSONObject elementJSON = null;
////		org.json.JSONObject totalJSON = new org.json.JSONObject();
////		org.json.JSONArray dataArray = new org.json.JSONArray();
////			elementJSON = new org.json.JSONObject();
////			elementJSON.put("paymentType", "LePhi");
////			elementJSON.put("returnPayment", "net");
////			elementJSON.put("formula", pattern);
////			dataArray.put(elementJSON);
////			elementJSON = new org.json.JSONObject();
////			elementJSON.put("paymentType", "shipAmount");
////			elementJSON.put("returnPayment", "ship");
////			elementJSON.put("formula", "10000");
////			dataArray.put(elementJSON);
////		
////			totalJSON.put("paymentType", "total");
////			totalJSON.put("returnPayment", "total");
////			totalJSON.put("formula", pattern2);
////			totalJSON.put("dataArr", dataArray);
//		
//			//String strTotal = totalJSON.toString();
//			// get total payment amount
//			//JSONObject paymentData = JSONFactoryUtil.createJSONObject(pattern);
//			//org.json.JSONObject paymentData = new org.json.JSONObject(strTotal);
//			//org.json.JSONObject paymentData = new org.json.JSONObject(pattern);
//			//if (Validator.isNotNull(paymentData)) {
//				
//				//Map<String, Long> mapJSON = null;
////				if (paymentData.has("dataArr")) {
////					Object strDataArr = paymentData.get("dataArr");
////					strDataArr = new JSONTokener(strDataArr.toString()).nextValue();
////					if (strDataArr instanceof org.json.JSONArray) {
////						org.json.JSONArray dataArr = (org.json.JSONArray) strDataArr;
////				    }
////					org.json.JSONArray dataArr = (org.json.JSONArray) strDataArr;
////					mapJSON = new HashMap<>();
////					if (dataArr != null && dataArr.length() > 0) {
////						for (int i = 0; i < dataArr.length(); i++) {
////							org.json.JSONObject data = dataArr.getJSONObject(i);
////							if (Validator.isNotNull(data) && data.has("paymentType")) {
////								String returnPayment = data.getString("returnPayment");
////								String formula = data.getString("formula");
////								if (Validator.isNotNull(returnPayment) && Validator.isNotNull(formula)) {
////									Pattern patternName = Pattern.compile(PATTERN_DEFAULT);
////									Matcher matcherName = patternName.matcher(formula);
////									long valueReturn = 0;
////									if (matcherName.find()) {
////										ScriptEngineManager manager = new ScriptEngineManager();
////
////										ScriptEngine engine = manager.getEngineByExtension("js");
////
////											manager = new ScriptEngineManager();
////
////											engine = manager.getEngineByExtension("js");
////
////											List<ScriptEngineFactory> factories = manager.getEngineFactories();
////
//////											for (ScriptEngineFactory ft : factories) {
//////												_log.info("EXTENTISION____" + ft.getExtensions());
//////												_log.info("NAME__" + ft.getEngineName());
//////												_log.info("NAMES___" + ft.getNames());
//////											}
////
//////											for (ScriptEngineFactory se : new ScriptEngineManager().getEngineFactories()) {
//////												System.out.println("se = " + se.getEngineName());
//////												System.out.println("se = " + se.getEngineVersion());
//////												System.out.println("se = " + se.getLanguageName());
//////												System.out.println("se = " + se.getLanguageVersion());
//////												System.out.println("se = " + se.getNames());
//////												System.out.println("se = " + se.getExtensions());
//////											}
////
////											String netScript = matcherName.group(1);
////
////											try {
////
////												engine.eval(netScript);
////
////												valueReturn = GetterUtil.getInteger(engine.get("payment"));
////												//System.out.println("DossierPaymentUtils.main()" + net);
////											} catch (ScriptException e) {
////												e.printStackTrace();
////											}
////									} else {
////										valueReturn = data.getLong("formula");
////									}
////									mapJSON.put(data.getString("paymentType"), valueReturn);
////								}
////							}
////						}
////					}
////				}
////				if (mapJSON != null) {
////					String paymentTypeTotal = paymentData.getString("paymentType");
////					String returnPaymentTotal = paymentData.getString("returnPayment");
////					String formulaTotal = paymentData.getString("formula");
////					if (Validator.isNotNull(returnPaymentTotal) && Validator.isNotNull(formulaTotal)) {
////						Pattern patternName = Pattern.compile(PATTERN_DEFAULT);
////						Matcher matcherName = patternName.matcher(formulaTotal);
////						long valueReturnTotal = 0;
////						if (matcherName.find()) {
////							try {
////								valueReturnTotal = getDossierPaymentTotal(returnPaymentTotal, formulaTotal, matcherName,
////										mapJSON);
////							} catch (JSONException e) {
////								// TODO Auto-generated catch block
////								e.printStackTrace();
////							}
////						}
////						mapJSON.put(paymentTypeTotal, valueReturnTotal);
////					}
////				}
//				//System.out.println(mapJSON);
//			//}
//			
//			
//			
//		Pattern patternName = null;
//		Matcher matcherName = null;
//
//		ScriptEngineManager manager = new ScriptEngineManager();
//
//		ScriptEngine engine = manager.getEngineByExtension("js");
//
//		//patternName = Pattern.compile("net=\\[(.*?)\\]");
//
//		//matcherName = patternName.matcher(pattern);
//
//		patternName = Pattern.compile("#(.*?)@(.*?) ");
//
//		matcherName = patternName.matcher(pattern);
//
//		LinkedHashSet<String> listSTR = new LinkedHashSet<String>();
//		org.json.JSONObject aaa = new org.json.JSONObject();
//
//		while (matcherName.find()) {
//			aaa.put(matcherName.group(0).trim(), matcherName.group(0).trim());
//		}
//
////		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
//
////		for (String string : listSTR) {
////
////			jsonObject.put(string.trim(), string.trim());
////
////		}
//
//		if (matcherName.find()) {
//
//			manager = new ScriptEngineManager();
//
//			engine = manager.getEngineByExtension("js");
//
//			List<ScriptEngineFactory> factories = manager.getEngineFactories();
//
//			for (ScriptEngineFactory ft : factories) {
//				_log.info("EXTENTISION____" + ft.getExtensions());
//				_log.info("NAME__" + ft.getEngineName());
//				_log.info("NAMES___" + ft.getNames());
//			}
//
//			for (ScriptEngineFactory se : new ScriptEngineManager().getEngineFactories()) {
//				System.out.println("se = " + se.getEngineName());
//				System.out.println("se = " + se.getEngineVersion());
//				System.out.println("se = " + se.getLanguageName());
//				System.out.println("se = " + se.getLanguageVersion());
//				System.out.println("se = " + se.getNames());
//				System.out.println("se = " + se.getExtensions());
//			}
//
//			String netScript = matcherName.group(1);
//
//			try {
//
//				engine.eval(netScript);
//
//				long net = GetterUtil.getInteger(engine.get("payment"));
//				System.out.println("DossierPaymentUtils.main()" + net);
//			} catch (ScriptException e) {
//				e.printStackTrace();
//			}
//
//		}
//
//	}

	// call processPaymentFile create paymentFile
	//Deprecated by Dungnv
	@Deprecated
	public static void processPaymentFile(ProcessAction processAction, String pattern, long groupId, long dossierId, long userId,
			ServiceContext serviceContext, String serverNo) throws JSONException {

		// get total payment amount
		JSONObject paymentData = JSONFactoryUtil.createJSONObject(pattern);
		JSONObject paymentJSON = null;
		String paymentFee = StringPool.BLANK;
		if (Validator.isNotNull(paymentData)) {
			if (paymentData.has(PaymentFileTerm.PAYMENT_FEE)) {
				paymentFee = paymentData.getString(PaymentFileTerm.PAYMENT_FEE);
			}

			if (paymentData.has("paymentPart")) {
				JSONArray dataArr = JSONFactoryUtil.createJSONArray(paymentData.getString("paymentPart"));
				paymentJSON = JSONFactoryUtil.createJSONObject();
				if (dataArr != null && dataArr.length() > 0) {
					for (int i = 0; i < dataArr.length(); i++) {
						JSONObject data = dataArr.getJSONObject(i);
						if (Validator.isNotNull(data) && data.has("paymentType")) {
							String returnPayment = data.getString("returnPayment");
							String formula = data.getString("formula");
							if (Validator.isNotNull(returnPayment) && Validator.isNotNull(formula)) {
								Pattern patternName = Pattern.compile(PATTERN_DEFAULT);
								String subPattern = splitPattern(formula);
								Matcher matcherName = patternName.matcher(subPattern);
								String valueReturn = "";
								if (matcherName.find()) {
									valueReturn = getDossierPaymentElement(returnPayment, subPattern, matcherName,
											dossierId, serviceContext);
								} else {
									valueReturn = data.getString("formula");
								}
								paymentJSON.put(data.getString("paymentType"), valueReturn);
							}
						}
					}
				}
			}
			if (paymentJSON != null) {
				String paymentTypeTotal = paymentData.getString("paymentType");
				String returnPaymentTotal = paymentData.getString("returnPayment");
				String formulaTotal = paymentData.getString("formula");
				if (Validator.isNotNull(returnPaymentTotal) && Validator.isNotNull(formulaTotal)) {
					Pattern patternName = Pattern.compile(PATTERN_DEFAULT);
					String subPatternTotal = splitPattern(formulaTotal);
					Matcher matcherName = patternName.matcher(subPatternTotal);
					String valueReturnTotal = "";
					if (matcherName.find()) {
						valueReturnTotal = getDossierPaymentTotal(returnPaymentTotal, subPatternTotal, matcherName,
								paymentJSON);
					} else {
						valueReturnTotal = paymentData.getString("formula");
					}
					paymentJSON.put(paymentTypeTotal, valueReturnTotal);
				}
			}
		}

		_log.info("mapJSON: "+paymentJSON);
		// get PaymentFee
//		List<String> messages = getMessagePayment(pattern);
		// get total payment amount
		//JSONObject patternObj = JSONFactoryUtil.createJSONObject(pattern);

		// TODO paymentNote
		String paymentNote = StringPool.BLANK;
//		String paymentFee = StringPool.BLANK;

		// create paymentFile
		PaymentFileActions actions = new PaymentFileActionsImpl();

		// get dossier
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		String strPaymentFee = processAction.getPaymentFee();
		JSONObject paymentFeeJSON = JSONFactoryUtil.createJSONObject(strPaymentFee);
		PaymentConfig paymentConfig = null;
		if (paymentFeeJSON != null && paymentFeeJSON.has("invoiceTemplateNo")
				&& Validator.isNotNull(paymentFeeJSON.getString("invoiceTemplateNo"))) {
			paymentConfig = PaymentConfigLocalServiceUtil.getByInvoiceTemplateNo(groupId,
					paymentFeeJSON.getString("invoiceTemplateNo"));
		} else {
			paymentConfig = PaymentConfigLocalServiceUtil.getPaymentConfigByGovAgencyCode(groupId,
					dossier.getGovAgencyCode());
		}
		
//		String paymentFee = StringPool.BLANK;
//		long advanceAmount = 0;
//		
//		if (patternObj.has(PaymentFileTerm.PAYMENT_FEE)) {
//			paymentFee = patternObj.getString(PaymentFileTerm.PAYMENT_FEE);
//		}
//		if (patternObj.has(PaymentFileTerm.ADVANCE_AMOUNT)) {
//			advanceAmount = patternObj.getLong(PaymentFileTerm.ADVANCE_AMOUNT);
//		}

		try {

			int paymentStatus = DossierPaymentUtils.convertPaymentStatus(processAction.getRequestPayment());
			PaymentFile paymentFile = actions.createPaymentFile(userId, groupId, dossierId, null, paymentFee,
					paymentJSON.getLong("paymentAmount"), paymentNote, StringPool.BLANK, StringPool.BLANK,
					paymentStatus, StringPool.BLANK, paymentJSON.toJSONString(), serviceContext);
			
			long counterPaymentFile = CounterLocalServiceUtil.increment(PaymentFile.class.getName()+"paymentFileNo");
			
			Calendar cal = Calendar.getInstance();
			
			cal.setTime(new Date());
			
			int prefix = cal.get(Calendar.YEAR);
			
			String invoiceNo = Integer.toString(prefix) + String.format("%010d", counterPaymentFile);
			
			paymentFile.setInvoiceNo(invoiceNo);
			if (paymentConfig != null) {
				paymentFile.setInvoiceTemplateNo(paymentConfig.getInvoiceTemplateNo());
				paymentFile.setGovAgencyTaxNo(paymentConfig.getGovAgencyTaxNo());
				paymentFile.setGovAgencyCode(paymentConfig.getGovAgencyCode());
				paymentFile.setGovAgencyName(paymentConfig.getGovAgencyName());
				paymentFile.setBankInfo(paymentConfig.getBankInfo());
			}
			PaymentFileLocalServiceUtil.updatePaymentFile(paymentFile);
			
			// generator epaymentProfile
			JSONObject epaymentConfigJSON = JSONFactoryUtil.createJSONObject(paymentConfig.getEpaymentConfig());

			JSONObject epaymentProfileJSON = JSONFactoryUtil.createJSONObject();

			if (epaymentConfigJSON.has("paymentKeypayDomain")) {

				try {
					String generatorPayURL = PaymentUrlGenerator.generatorPayURL(groupId,
							paymentFile.getPaymentFileId(), pattern, dossierId);

					epaymentProfileJSON.put("keypayUrl", generatorPayURL);

					// fill good_code to keypayGoodCode
					String pattern1 = "good_code=";
					String pattern2 = "&";

					String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);

					Pattern p = Pattern.compile(regexString);
					Matcher m = p.matcher(generatorPayURL);

					if (m.find()) {
						String goodCode = m.group(1);

						epaymentProfileJSON.put("keypayGoodCode", goodCode);
					} else {
						epaymentProfileJSON.put("keypayGoodCode", StringPool.BLANK);
					}

					epaymentProfileJSON.put("keypayMerchantCode", epaymentConfigJSON.get("paymentMerchantCode"));

					actions.updateEProfile(dossierId, paymentFile.getReferenceUid(), epaymentProfileJSON.toJSONString(),
							serviceContext);

				} catch (IOException e) {
					e.printStackTrace();
				}

			} else {
				actions.updateEProfile(dossierId, paymentFile.getReferenceUid(), epaymentProfileJSON.toJSONString(),
						serviceContext);
			}

			// Create paymentfile sync
			if (Validator.isNotNull(serverNo)) {
				DossierSyncLocalServiceUtil.updateDossierSync(groupId, userId, dossierId, dossier.getReferenceUid(),
						false, 2, paymentFile.getPrimaryKey(), paymentFile.getReferenceUid(), serverNo);
			}

		} catch (PortalException e) {
			e.printStackTrace();
		}
	}
	
	//Add by Dungnv - Ham nay su dung neu muon chi sinh ra 1 queue trong dossiersync
	public static JSONObject processPaymentFileNew(ProcessAction processAction, String pattern, long groupId, long dossierId, long userId,
			ServiceContext serviceContext, String serverNo) throws JSONException {

		JSONObject result = JSONFactoryUtil.createJSONObject();
		// get total payment amount
		JSONObject paymentData = JSONFactoryUtil.createJSONObject(pattern);
		JSONObject paymentJSON = null;
		String paymentFee = StringPool.BLANK;
		if (Validator.isNotNull(paymentData)) {
			if (paymentData.has(PaymentFileTerm.PAYMENT_FEE)) {
				paymentFee = paymentData.getString(PaymentFileTerm.PAYMENT_FEE);
			}

			if (paymentData.has("paymentPart")) {
				JSONArray dataArr = JSONFactoryUtil.createJSONArray(paymentData.getString("paymentPart"));
				paymentJSON = JSONFactoryUtil.createJSONObject();
				if (dataArr != null && dataArr.length() > 0) {
					for (int i = 0; i < dataArr.length(); i++) {
						JSONObject data = dataArr.getJSONObject(i);
						if (Validator.isNotNull(data) && data.has("paymentType")) {
							String returnPayment = data.getString("returnPayment");
							String formula = data.getString("formula");
							if (Validator.isNotNull(returnPayment) && Validator.isNotNull(formula)) {
								Pattern patternName = Pattern.compile(PATTERN_DEFAULT);
								String subPattern = splitPattern(formula);
								Matcher matcherName = patternName.matcher(subPattern);
								String valueReturn = "";
								if (matcherName.find()) {
									valueReturn = getDossierPaymentElement(returnPayment, subPattern, matcherName,
											dossierId, serviceContext);
								} else {
									valueReturn = data.getString("formula");
								}
								paymentJSON.put(data.getString("paymentType"), valueReturn);
							}
						}
					}
				}
			}
			if (paymentJSON != null) {
				String paymentTypeTotal = paymentData.getString("paymentType");
				String returnPaymentTotal = paymentData.getString("returnPayment");
				String formulaTotal = paymentData.getString("formula");
				if (Validator.isNotNull(returnPaymentTotal) && Validator.isNotNull(formulaTotal)) {
					Pattern patternName = Pattern.compile(PATTERN_DEFAULT);
					String subPatternTotal = splitPattern(formulaTotal);
					Matcher matcherName = patternName.matcher(subPatternTotal);
					String valueReturnTotal = "";
					if (matcherName.find()) {
						valueReturnTotal = getDossierPaymentTotal(returnPaymentTotal, subPatternTotal, matcherName,
								paymentJSON);
					} else {
						valueReturnTotal = paymentData.getString("formula");
					}
					paymentJSON.put(paymentTypeTotal, valueReturnTotal);
				}
			}
		}

		_log.info("mapJSON: "+paymentJSON);
		// get PaymentFee
//		List<String> messages = getMessagePayment(pattern);
		// get total payment amount
		//JSONObject patternObj = JSONFactoryUtil.createJSONObject(pattern);

		// TODO paymentNote
		String paymentNote = StringPool.BLANK;
//		String paymentFee = StringPool.BLANK;

		// create paymentFile
		PaymentFileActions actions = new PaymentFileActionsImpl();

		// get dossier
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		String strPaymentFee = processAction.getPaymentFee();
		JSONObject paymentFeeJSON = JSONFactoryUtil.createJSONObject(strPaymentFee);
		PaymentConfig paymentConfig = null;
		if (paymentFeeJSON != null && paymentFeeJSON.has("invoiceTemplateNo")
				&& Validator.isNotNull(paymentFeeJSON.getString("invoiceTemplateNo"))) {
			paymentConfig = PaymentConfigLocalServiceUtil.getByInvoiceTemplateNo(groupId,
					paymentFeeJSON.getString("invoiceTemplateNo"));
		} else {
			paymentConfig = PaymentConfigLocalServiceUtil.getPaymentConfigByGovAgencyCode(groupId,
					dossier.getGovAgencyCode());
		}
		
//		String paymentFee = StringPool.BLANK;
//		long advanceAmount = 0;
//		
//		if (patternObj.has(PaymentFileTerm.PAYMENT_FEE)) {
//			paymentFee = patternObj.getString(PaymentFileTerm.PAYMENT_FEE);
//		}
//		if (patternObj.has(PaymentFileTerm.ADVANCE_AMOUNT)) {
//			advanceAmount = patternObj.getLong(PaymentFileTerm.ADVANCE_AMOUNT);
//		}

		try {

			int paymentStatus = DossierPaymentUtils.convertPaymentStatus(processAction.getRequestPayment());
			PaymentFile paymentFile = actions.createPaymentFile(userId, groupId, dossierId, null, paymentFee,
					paymentJSON.getLong("paymentAmount"), paymentNote, StringPool.BLANK, StringPool.BLANK,
					paymentStatus, StringPool.BLANK, paymentJSON.toJSONString(), serviceContext);
			
			long counterPaymentFile = CounterLocalServiceUtil.increment(PaymentFile.class.getName()+"paymentFileNo");
			
			Calendar cal = Calendar.getInstance();
			
			cal.setTime(new Date());
			
			int prefix = cal.get(Calendar.YEAR);
			
			String invoiceNo = Integer.toString(prefix) + String.format("%010d", counterPaymentFile);
			
			paymentFile.setInvoiceNo(invoiceNo);
			if (paymentConfig != null) {
				paymentFile.setInvoiceTemplateNo(paymentConfig.getInvoiceTemplateNo());
				paymentFile.setGovAgencyTaxNo(paymentConfig.getGovAgencyTaxNo());
				paymentFile.setGovAgencyCode(paymentConfig.getGovAgencyCode());
				paymentFile.setGovAgencyName(paymentConfig.getGovAgencyName());
				paymentFile.setBankInfo(paymentConfig.getBankInfo());
			}
			PaymentFileLocalServiceUtil.updatePaymentFile(paymentFile);
			
			// generator epaymentProfile
			JSONObject epaymentConfigJSON = JSONFactoryUtil.createJSONObject(paymentConfig.getEpaymentConfig());

			JSONObject epaymentProfileJSON = JSONFactoryUtil.createJSONObject();

			if (epaymentConfigJSON.has("paymentKeypayDomain")) {

				try {
					String generatorPayURL = PaymentUrlGenerator.generatorPayURL(groupId,
							paymentFile.getPaymentFileId(), pattern, dossierId);

					epaymentProfileJSON.put("keypayUrl", generatorPayURL);

					// fill good_code to keypayGoodCode
					String pattern1 = "good_code=";
					String pattern2 = "&";

					String regexString = Pattern.quote(pattern1) + "(.*?)" + Pattern.quote(pattern2);

					Pattern p = Pattern.compile(regexString);
					Matcher m = p.matcher(generatorPayURL);

					if (m.find()) {
						String goodCode = m.group(1);

						epaymentProfileJSON.put("keypayGoodCode", goodCode);
					} else {
						epaymentProfileJSON.put("keypayGoodCode", StringPool.BLANK);
					}

					epaymentProfileJSON.put("keypayMerchantCode", epaymentConfigJSON.get("paymentMerchantCode"));

					actions.updateEProfile(dossierId, paymentFile.getReferenceUid(), epaymentProfileJSON.toJSONString(),
							serviceContext);

				} catch (IOException e) {
					e.printStackTrace();
				}

			} else {
				actions.updateEProfile(dossierId, paymentFile.getReferenceUid(), epaymentProfileJSON.toJSONString(),
						serviceContext);
			}

			// Create paymentfile sync
			if (Validator.isNotNull(serverNo)) {
				result.put("groupId", groupId);
				result.put("userId", userId);
				result.put("dossierId", dossierId);
				result.put("dossierReferenceUid", dossier.getReferenceUid());
				result.put("createDossier", false);
				result.put("method", 2);
				result.put("classPK", paymentFile.getPrimaryKey());
				result.put("fileReferenceUid", paymentFile.getReferenceUid());
				result.put("serverNo", serverNo);
			}

		} catch (PortalException e) {
			_log.error(e);
		}
		return result;
	}

	private static final String PATTERN_DEFAULT = "\\[(.*?)\\]";
	private static final String PATTERN_DETAIL = "#(.*?)@(.*?) ";


	/**
	 * Get payment message
	 * 
	 * @param pattern
	 * @return
	 */
	public static List<String> getMessagePayment(String pattern) {

		List<String> msgPayments = new ArrayList<String>();
		try {
			pattern = pattern.substring(pattern.indexOf(PAY_MESSAGE), pattern.lastIndexOf(PAY_MESSAGE) + 1);

			String[] splitPattern = StringUtil.split(pattern, PAY_MESSAGE);

			for (String element : splitPattern) {
				if (!element.trim().contentEquals("")) {
					msgPayments.add(StringUtil.trimLeading(element));
				}
			}
		} catch (Exception e) {

		}

		return msgPayments;
	}

	private static String splitPattern(String pattern){
		if (Validator.isNotNull(pattern) && pattern.contains("[")) {
			int indexRegex = pattern.indexOf("[");
			if (indexRegex != -1) {
				return pattern.substring(indexRegex);
			}
		}
		return pattern;
	}

	private static String getDossierPaymentElement(String returnPayment,String pattern, Matcher matcherName,
			long dossierId, ServiceContext serviceContext) throws JSONException {

		//_log.info("patternName" + patternName);
		//_log.info("matcherName" + matcherName);
		_log.info("pattern" + pattern);
		_log.info("dossierId" + dossierId);

		Pattern patternName = Pattern.compile(PATTERN_DETAIL);

		matcherName = patternName.matcher(pattern);

		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();

		while (matcherName.find()) {
			jsonObject.put(matcherName.group(0).trim(), matcherName.group(0).trim());
		}
		//_log.info("jsonObject" + jsonObject.toString());

		if (jsonObject != null) {
			String result = AutoFillFormData.sampleDataBinding(jsonObject.toString(), dossierId, serviceContext);

			jsonObject = JSONFactoryUtil.createJSONObject(result);

			Map<String, Object> jsonMap = AutoFillFormData.jsonToMap(jsonObject);

			for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
				String valReplace = StringPool.BLANK;

				if (Validator.isNumber(String.valueOf(entry.getValue()))) {

					valReplace = String.valueOf(entry.getValue());

				} else {
					valReplace = "'" + String.valueOf(entry.getValue()) + "'";

				}
				pattern = pattern.replaceAll(entry.getKey(), valReplace);
			}

		}

		//_log.info("pattern: "+pattern);
		patternName = Pattern.compile(PATTERN_DEFAULT);

		matcherName = patternName.matcher(pattern);

		if (matcherName.find()) {

			ScriptEngineManager manager = new ScriptEngineManager(null);

			ScriptEngine engine = manager.getEngineByExtension("js");

			String netScript = matcherName.group(1);

			//_log.info("NETSCRIPT______" + netScript);

			try {

				//_log.info("engine_1" + engine);
				//_log.info("maneger" + manager);

				engine.eval(netScript);
				//_log.info("engine_2" + engine);
				_log.info("net__________" + GetterUtil.getLong(engine.get("payment")));

				return String.valueOf(GetterUtil.getLong(engine.get("payment")));
			} catch (Exception e) {
				_log.error(e);
			}
		}
		return "";
	}

	private static String getDossierPaymentTotal(String returnPaymentTotal, String formulaTotal,
			Matcher matcherName, JSONObject paymentJSON) throws JSONException {

		//_log.info("matcherName" + matcherName);
		//_log.info("returnPaymentTotal" + returnPaymentTotal);
		//_log.info("formulaTotal" + formulaTotal);
		//_log.info("mapJSON" + mapJSON);

		Iterator<String> keys = paymentJSON.keys();

		while(keys.hasNext()) {
			String valReplace = StringPool.BLANK;
			String key = keys.next();
			if (Validator.isNumber(paymentJSON.getString(key))) {
				valReplace = paymentJSON.getString(key);
			} else {
				valReplace = "'" + paymentJSON.getString(key) + "'";
			}
			formulaTotal = formulaTotal.replaceAll(key, valReplace);
		}

		Pattern patternName = Pattern.compile(PATTERN_DEFAULT);

		//_log.info("formulaTotal: "+formulaTotal);
		matcherName = patternName.matcher(formulaTotal);

		if (matcherName.find()) {

			ScriptEngineManager manager = new ScriptEngineManager(null);

			ScriptEngine engine = manager.getEngineByExtension("js");

			String netScript = matcherName.group(1);

			//_log.info("NETSCRIPT______" + netScript);

			try {

				//_log.info("engine_1" + engine);
				//_log.info("maneger" + manager);

				engine.eval(netScript);
				//_log.info("engine_2" + engine);
				_log.info("net__________" + GetterUtil.getLong(engine.get("payment")));

				return String.valueOf(GetterUtil.getLong(engine.get("payment")));
			} catch (Exception e) {
				//_log.error(e);
			}
		}
		return "";
	}

	public static final String PAY_MESSAGE = "$";

	public static int convertPaymentStatus(int requestPayment) {
		return requestPayment == 5 ? PaymentFileTerm.PAYMENT_STATUS_APPROVED
				: requestPayment == 3 ? PaymentFileTerm.PAYMENT_STATUS_CONFIRM : 0;
	}
}
