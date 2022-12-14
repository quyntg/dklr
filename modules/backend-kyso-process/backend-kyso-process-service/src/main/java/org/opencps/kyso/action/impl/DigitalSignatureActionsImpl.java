package org.opencps.kyso.action.impl;

import java.awt.image.BufferedImage;
import java.io.File;
import java.security.cert.Certificate;

import org.opencps.kyso.action.DigitalSignatureActions;
import org.opencps.kyso.utils.BCYSignatureUtil;
import org.opencps.kyso.utils.CertUtil;
import org.opencps.kyso.utils.ExtractTextLocations;
import org.opencps.kyso.utils.ImageUtil;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfSignatureAppearance;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

import backend.kyso.process.service.util.ConfigProps;
import vgca.svrsigner.ServerSigner;

public class DigitalSignatureActionsImpl implements DigitalSignatureActions{

	private static Log _log = LogFactoryUtil.getLog(DigitalSignatureActionsImpl.class);

	//private static final String TYPE_KYSO = "1135, 1158, 1160, 1129, 1130, 1153, 1188";
	//private static final String TYPE_DONGDAU = "1137, 1160, 1162";
	//private static final String STEPCODE_KYSO = "208, 209, 300, 301";
	private static final String STEPCODE_DONGDAU = "400, 401";

	@Override
	public JSONObject createHashSignature(String email, long fileEntryId, String typeSignature, String postStepCode) {
			byte[] inHash = null;
			String fieldName = StringPool.BLANK;
			String fullPathSigned = StringPool.BLANK;
			JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
			JSONArray hashComputers = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray signFieldNames = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray fileNames = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();
			JSONArray messages = JSONFactoryUtil.getJSONFactory().createJSONArray();
			JSONArray fullPathOfSignedFiles = JSONFactoryUtil.getJSONFactory()
					.createJSONArray();

			String realPath = PropsUtil.get(ConfigProps.CER_HOME)+"/";
			_log.info("realPath_Kyso: "+realPath);

			String fullPath = StringPool.BLANK;

			try {
				DLFileEntry dlFileEntry = DLFileEntryLocalServiceUtil.fetchDLFileEntry(fileEntryId);
				
				File fileTemp = FileUtil.createTempFile(dlFileEntry.getContentStream());
				_log.info("fileTemp URL: "+fileTemp.getAbsolutePath());
				
				File file = new File(realPath + dlFileEntry.getFileName());
				
				FileUtil.move(fileTemp, file);
				
				fullPath = file.getAbsolutePath();
				_log.info("fullPath: "+fullPath);

				String signImagePath = StringPool.BLANK;
				_log.info("====***typeSignature+===: "+typeSignature);
				_log.info("====***postStepCode+===: "+postStepCode);

				signImagePath = new File(realPath + email + ".png").getAbsolutePath();
				_log.info("signImagePath_Kyso: "+realPath);
				String imageBase64 = ImageUtil.getSignatureImageBase64ByPath(signImagePath);

				BufferedImage bufferedImage = ImageUtil.getImageByPath(signImagePath);

				Certificate cert = CertUtil.getCertificateByPath(new File(realPath + email + ".cer").getAbsolutePath());

				boolean showSignatureInfo = true;

				ServerSigner signer = BCYSignatureUtil.getServerSigner(fullPath, cert, imageBase64, showSignatureInfo);

				signer.setSignatureGraphic(imageBase64);
				signer.setSignatureAppearance(PdfSignatureAppearance.RenderingMode.GRAPHIC_AND_DESCRIPTION);

				ExtractTextLocations textLocation = new ExtractTextLocations(fullPath);

				_log.info("*********************************" + textLocation.getAnchorX() + "-"
						+ textLocation.getAnchorY() + "********************************");

				_log.info("*********************************" + textLocation.getPageLLX() + "-"
						+ textLocation.getPageURX() + "-" + textLocation.getPageLLY() + "-" + textLocation.getPageURY()
						+ "*******************************");

				// tinh kich thuoc cua anh

//				int signatureImageWidth = (bufferedImage != null && bufferedImage.getWidth() > 0)
//						? bufferedImage.getWidth()/2 : 80;
//
//				int signatureImageHeight = (bufferedImage != null && bufferedImage.getHeight() > 0)
//						? bufferedImage.getHeight() : 80;
//				
//				float llx = textLocation.getAnchorX() + offsetX;
//
//				float lly = textLocation.getAnchorY() - signatureImageHeight * imageZoom + offsetY;
//
//				if (textLocation.getAnchorX() > 200) {
//					llx = llx - 100;
//				}
//				if (textLocation.getAnchorY() > 420) {
//					lly = lly - 420;
//				}
//
//				if (lly < 0) {
//					lly = 0;
//				}
//				if (llx < 0) {
//					llx = 0;
//				}
//				float urx = llx + signatureImageWidth * imageZoom;
//				float ury = lly + signatureImageHeight * imageZoom;
				// tinh kich thuoc cua anh
				int signatureImageWidth = (bufferedImage != null && bufferedImage
						.getWidth() > 0) ? bufferedImage.getWidth() : 80;
				int signatureImageHeight = (bufferedImage != null && bufferedImage
						.getHeight() > 0) ? bufferedImage
						.getHeight() : 80;
				float llx = textLocation.getAnchorX();
				float urx = llx + signatureImageWidth / 3;

				float lly = textLocation.getPageURY()
						- textLocation.getAnchorY()
						- signatureImageHeight / 3;

				float ury = lly + signatureImageHeight / 3;
				
				_log.info("signatureImageWidth: " + signatureImageWidth + ", signatureImageHeight: " + signatureImageHeight + ", llx: " + llx + ", urx: " + urx + ", lly: " + lly + ", ury: " + ury);

				//if (TYPE_KYSO.contains(typeSignature) && STEPCODE_KYSO.contains(postStepCode)) {
//				if (STEPCODE_KYSO.contains(postStepCode)) {
//					inHash = signer.computeHash(new Rectangle(llx + 10, lly - 15, urx + 90, ury),textLocation.getPageSize());
//					_log.info("inHash_Kyso: "+inHash);
//				} else if (TYPE_DONGDAU.contains(typeSignature) && STEPCODE_DONGDAU.contains(postStepCode)) {
//					inHash = signer.computeHash(new Rectangle(llx + 10, lly - 115, urx + 90, ury-95), textLocation.getPageSize());
//					_log.info("inHash_Dongdau: "+inHash);
//				}

				if (STEPCODE_DONGDAU.contains(postStepCode)) {
					inHash = signer.computeHash(new Rectangle(llx + 10, lly - 115, urx + 90, ury-95), textLocation.getPageSize());
					_log.info("inHash_Dongdau: "+inHash);
				} else {
					inHash = signer.computeHash(new Rectangle(llx + 10, lly - 15, urx + 90, ury),textLocation.getPageSize());
					_log.info("inHash_Kyso: "+inHash);
				}

				fieldName = signer.getSignatureName();
				_log.info("fieldName:"+fieldName);
				
				fullPathSigned = signer.getSignedFile();
				_log.info("fullPathSigned: "+fullPathSigned);

				hashComputers.put(Base64.encode(inHash));
				_log.info("hashComputers: ");

				signFieldNames.put(fieldName);
				_log.info("signFieldNames");

				fileNames.put(dlFileEntry.getFileName());
				
				_log.info("fileNames");
				messages.put("success");

				fullPathOfSignedFiles.put(fullPathSigned);
				
				_log.info("hashComputers: "+hashComputers);
				_log.info("signFieldNames: "+signFieldNames);
				_log.info("fullPathOfSignedFiles: "+fullPathOfSignedFiles);
				_log.info("fileNames: "+fileNames);
				_log.info("messages: "+messages);
				
				_log.info("===KY XONG===: "+ fullPathSigned);

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

	@Override
	public JSONObject completeSignature(String sign, String signFieldName, String fileName) {

		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		
		if (Validator.isNotNull(sign) && Validator.isNotNull(fileName)) {
			byte[] signature = Base64.decode(sign);

			String realPath = PropsUtil.get(ConfigProps.CER_HOME)+"/";
			String fullPath = StringPool.BLANK;

			try {
				fileName = fileName.substring(0,
						fileName.lastIndexOf(StringPool.PERIOD));
				_log.info("fileName: "+fileName);
				
				ServerSigner signer = new ServerSigner(realPath
						+ fileName + ".pdf", null);

				signer.completeSign(signature, signFieldName);

				String signedFile = signer.getSignedFile();
				_log.info("signedFile: "+signedFile.toString());

				fullPath = realPath + fileName + ".pdf";
				_log.info("fullPath: "+fullPath.toString());
				
				jsonFeed.put("signedFile", signedFile);
				jsonFeed.put("fullPath", fullPath);
				jsonFeed.put("msg", "success");
			} catch (Exception e) {
				_log.error(e);
				jsonFeed.put("msg", "error");
			}
		} else {
			jsonFeed.put("msg", "error");
			_log.info("Cannot sign the file: " + fileName);
		}
		
		return jsonFeed;
	}

}
