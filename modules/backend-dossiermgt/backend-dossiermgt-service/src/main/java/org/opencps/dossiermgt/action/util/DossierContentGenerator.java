package org.opencps.dossiermgt.action.util;

import java.io.File;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierFile;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.service.DossierFileLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.opencps.dossiermgt.service.comparator.DossierFileComparator;

import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

public class DossierContentGenerator {

	public static String getDossierNote(long groupId, long dossierId) {

		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		if (Validator.isNotNull(dossier)) {

			ProcessOption option = getProcessOption(groupId, dossier.getServiceCode(), dossier.getGovAgencyCode(),
					dossier.getDossierTemplateNo());

			String source = option.getInstructionNote();

			// TODO add keys and values that need to be replaced

			String[] keys = new String[] {};
			String[] values = new String[] {};

			return replateContent(source, keys, values);

		} else {
			return StringPool.BLANK;
		}
	}

	public static String getSubmissionNote(long groupId, long dossierId) {
		Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		if (Validator.isNotNull(dossier)) {

			ProcessOption option = getProcessOption(groupId, dossier.getServiceCode(), dossier.getGovAgencyCode(),
					dossier.getDossierTemplateNo());

			String source = option.getSubmissionNote();

			// TODO add keys and values that need to be replaced

			String[] keys = new String[] {};
			String[] values = new String[] {};

			return replateContent(source, keys, values);

		} else {
			return StringPool.BLANK;
		}

	}

	private static String replateContent(String strSource, String[] keys, String[] values) {
		return StringUtil.replace(strSource, keys, values);
	}

	private static ProcessOption getProcessOption(long groupId, String serviceCode, String govAgencyCode,
			String dossierTemplateNo) {
		try {
			ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(groupId, serviceCode, govAgencyCode);

			return ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(groupId, dossierTemplateNo,
					config.getServiceConfigId());
		} catch (Exception e) {
			return null;
		}

	}

	public static String getBriefNote(Dossier dossier, String briefNotePattern) {

		//Dossier dossier = DossierLocalServiceUtil.fetchDossier(dossierId);

		String briefNote = StringPool.BLANK;

		LinkedHashMap<String, String> patternContentMaps = new LinkedHashMap<String, String>();

		if (Validator.isNotNull(dossier) && Validator.isNotNull(briefNotePattern)) {

			String pattern = "\\[\\$(.*?)\\$\\]";

			Pattern r = Pattern.compile(pattern);

			Matcher m = r.matcher(briefNotePattern);

			int count = 0;

			while (m.find()) {
				briefNotePattern = briefNotePattern.replace(m.group(0), "$variable" + count + "$");
				patternContentMaps.put("$variable" + count + "$", m.group(1));
				m = r.matcher(briefNotePattern);
				count++;
			}

			for (Map.Entry<String, String> entry : patternContentMaps.entrySet()) {
				String tmpKey = entry.getKey();
				String patternContent = entry.getValue();
				String[] textSplit = StringUtil.split(patternContent, "@");
				if (textSplit == null || textSplit.length < 2) {
//					_log.info("===getBriefNote===" + tmpKey + "=");
					briefNotePattern = briefNotePattern.replace(tmpKey, StringPool.BLANK);
				} else {
					String dataKey = textSplit[0];
					String fileTemplateNo = textSplit[1];
					
					DossierFile dossierFile = DossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossier.getDossierId(),
							fileTemplateNo, false, new DossierFileComparator(false, "createDate", Date.class));
					
//					_log.info("===getBriefNote===" + dossier.getDossierId() + "=" + fileTemplateNo);
					
					if (dossierFile == null) {
//						_log.info("===getBriefNote===" + tmpKey + "=");
						briefNotePattern = StringPool.BLANK;//briefNotePattern.replace(tmpKey, StringPool.BLANK);
						//TODO: Trong truong hop khong tim thay dossierFile thi k update vao briefNote
					} else {
						//Add by Dungnv
						String formData = StringPool.BLANK;
						if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
							File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
							if (formDataFile != null) {
								formData = FileUploadUtils.fileToString(formDataFile);
							}
						}
			    		
						if(Validator.isNotNull(dossierFile) && formData.isEmpty()) {
							formData = dossierFile.getFormData();
						}
						//Comment by Dungnv
						//String formData = dossierFile.getFormData();
//						_log.info("===getBriefNote===" + dossierFile.getDossierFileId() + "=" + formData);
						if (Validator.isNull(formData)) {
							briefNotePattern = briefNotePattern.replace(tmpKey, StringPool.BLANK);
						} else {
							try {
								String value = StringPool.BLANK;
								
								JSONObject object = JSONFactoryUtil.createJSONObject(formData);
								if(object.has(dataKey)){
									value = object.getString(dataKey);
								}
								
//								_log.info("===getBriefNote===" + dossierFile.getDossierFileId() + "=" + dataKey + "=" + value);
								
								briefNotePattern = briefNotePattern.replace(tmpKey,
										Validator.isNotNull(value) ? value : StringPool.BLANK);
							} catch (Exception e) {
								_log.error(e);
								briefNotePattern = briefNotePattern.replace(tmpKey, StringPool.BLANK);
							}
						}
					}
				}
			}

			briefNote = briefNotePattern;

			return briefNote;

		} else {
			return StringPool.BLANK;
		}
	}
	
	private static Log _log = LogFactoryUtil.getLog(DossierContentGenerator.class.getName());
}
