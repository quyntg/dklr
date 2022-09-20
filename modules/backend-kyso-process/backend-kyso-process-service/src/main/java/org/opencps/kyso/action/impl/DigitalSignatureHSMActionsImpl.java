/**
 * 
 */
package org.opencps.kyso.action.impl;

import com.itextpdf.text.Rectangle;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.awt.image.BufferedImage;
import java.io.File;
import java.security.cert.Certificate;

import org.apache.commons.io.FileUtils;
import org.opencps.kyso.action.DigitalSignatureHSMActions;
import org.opencps.kyso.utils.CertUtil;
import org.opencps.kyso.utils.ExtractTextLocationsHSM;
import org.opencps.kyso.utils.ImageUtil;
import org.opencps.kyso.utils.SignatureUtil;

import backend.kyso.process.service.util.ConfigProps;

/**
 * @author ddung
 *
 */
public class DigitalSignatureHSMActionsImpl implements DigitalSignatureHSMActions {
	private static Log _log = LogFactoryUtil.getLog(DigitalSignatureHSMActionsImpl.class);

	@Override
	public JSONObject createHashSignature(String emailUser, long fileEntryId, String typeSignature,
			String postStepCode) {
		String realPath = PropsUtil.get(ConfigProps.CER_HOME) + "/hsmcer/";
		_log.info("realPath_Kyso: " + realPath);

		String fieldName = StringPool.BLANK;
		String fullPathSigned = StringPool.BLANK;
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONArray hashComputers = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray fileNames = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();
		JSONArray fullPathOfSignedFiles = JSONFactoryUtil.getJSONFactory().createJSONArray();

		String fullPath = StringPool.BLANK;
		try {
			DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fileEntryId);

			File fileTemp = FileUtil.createTempFile(dlFileEntry.getContentStream());
			_log.info("fileTemp URL: " + fileTemp.getAbsolutePath());

			File file = new File(realPath + dlFileEntry.getFileName());

			FileUtil.move(fileTemp, file);

			fullPath = file.getAbsolutePath();
			_log.info("fullPath: " + fullPath);

			String signImagePath = StringPool.BLANK;
			_log.info("====***typeSignature+===: " + typeSignature);
			_log.info("====***postStepCode+===: " + postStepCode);

			signImagePath = new File(realPath + emailUser + ".png").getAbsolutePath();
			_log.info("signImagePath_Kyso: " + signImagePath);
			BufferedImage bufferedImage = ImageUtil.getImageByPath(signImagePath);
			
			byte[] chuKyBytes = FileUtils.readFileToByteArray(new File(signImagePath));

			Certificate cert = CertUtil.getCertificateByPath(new File(realPath + emailUser + ".cer").getAbsolutePath());

			ExtractTextLocationsHSM textLocation = new ExtractTextLocationsHSM(fullPath);

			Rectangle rec = SignatureUtil.createRectangle(textLocation, bufferedImage);

			vgca.hsmsigner.ServerSigner signer = SignatureUtil.getServerSignerHSM(fullPath, cert, chuKyBytes);
			
			signer.Sign(rec, textLocation.getPageSize());

			fieldName = signer.getSignatureName();
			_log.info("fieldName:" + fieldName);

			fullPathSigned = signer.getSignedFile();
			_log.info("fullPathSigned: " + fullPathSigned);

			signFieldNames.put(fieldName);
			_log.info("signFieldNames");

			fileNames.put(dlFileEntry.getFileName());

			_log.info("fileNames");
			messages.put("success");

			fullPathOfSignedFiles.put(fullPathSigned);

			_log.info("hashComputers: " + hashComputers);
			_log.info("signFieldNames: " + signFieldNames);
			_log.info("fullPathOfSignedFiles: " + fullPathOfSignedFiles);
			_log.info("fileNames: " + fileNames);
			_log.info("messages: " + messages);

			_log.info("===KY XONG===: " + fullPathSigned);
		} catch (Exception e) {
			hashComputers.put(StringPool.BLANK);
			signFieldNames.put(StringPool.BLANK);
			fileNames.put(StringPool.BLANK);
			fullPathOfSignedFiles.put(StringPool.BLANK);
			messages.put(e.getClass().getName());

			_log.error(e);
		}

		jsonFeed.put("hashComputers", hashComputers);
		jsonFeed.put("signFieldNames", signFieldNames);
		jsonFeed.put("fileNames", fileNames);
		jsonFeed.put("msg", messages);
		jsonFeed.put("fullPathSigned", fullPathOfSignedFiles);
		jsonFeed.put("fileEntryId", fileEntryId);
		_log.info("=====CHECK END=====" + jsonFeed.toString());

		return jsonFeed;

	}

}
