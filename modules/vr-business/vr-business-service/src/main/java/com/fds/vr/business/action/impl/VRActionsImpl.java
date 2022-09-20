package com.fds.vr.business.action.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.opencps.datamgt.model.DictCollection;
import org.opencps.datamgt.model.DictGroup;
import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.model.DictItemGroup;
import org.opencps.datamgt.service.DictCollectionLocalServiceUtil;
import org.opencps.datamgt.service.DictGroupLocalServiceUtil;
import org.opencps.datamgt.service.DictItemGroupLocalServiceUtil;
import org.opencps.datamgt.service.DictItemLocalServiceUtil;

import com.fds.vr.business.action.VRActions;
import com.fds.vr.business.constant.VRKeys;
import com.fds.vr.business.model.VRConfigTechSpec;
import com.fds.vr.business.model.VRCorporationAttendee;
import com.fds.vr.business.model.VRDossierFile;
import com.fds.vr.business.model.VRLimitConfigTechSpec;
import com.fds.vr.business.model.impl.VRDossierFileModelImpl;
import com.fds.vr.business.service.VRConfigTechSpecLocalServiceUtil;
import com.fds.vr.business.service.VRCorporationAttendeeLocalServiceUtil;
import com.fds.vr.business.service.VRDossierFileLocalServiceUtil;
import com.fds.vr.business.service.VRLimitConfigTechSpecLocalServiceUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;

public class VRActionsImpl implements VRActions {
	@Override
	public JSONObject getTechSpecByVehicleClass(long groupId, String module, long dossierId, long dossierFileId,
			String vehicleClass, String flag) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONArray techSpecArr = JSONFactoryUtil.createJSONArray();

		try {

			// get id THONG_SO_KY_THUAT
			DictCollection nhomThongSoKyThuat = DictCollectionLocalServiceUtil
					.fetchByF_dictCollectionCode(VRKeys.NHOM_THONG_SO_KY_THUAT, groupId);

			long ttktId = nhomThongSoKyThuat.getPrimaryKey();

			DictGroup phanLoaiNhomTTSKT = DictGroupLocalServiceUtil.getByGC_GI_DCI(vehicleClass, groupId, ttktId);

			List<DictItemGroup> danhSachNhomThongSoKTChiTiet = DictItemGroupLocalServiceUtil.findByDictGroupId(groupId,
					phanLoaiNhomTTSKT.getPrimaryKey());

			if (Validator.isNull(module)) {
				module = "1";
			}

			for (DictItemGroup dg : danhSachNhomThongSoKTChiTiet) {

				DictItem dictItem = DictItemLocalServiceUtil.getDictItem(dg.getDictItemId());
				if (dg.getDictItemId() > 0 && dictItem != null && dictItem.getItemCode().length() > 0) {
					_log.info("vehicleClass====" + vehicleClass + "===========dictItem.getItemCode()===="
							+ dictItem.getItemCode() + "============module====" + module);
					List<VRConfigTechSpec> configTechSpecs = VRConfigTechSpecLocalServiceUtil.getByVCSC(vehicleClass,
							dictItem.getItemCode().trim(), module);
					JSONObject jsonTechSpec = JSONFactoryUtil.createJSONObject();

					jsonTechSpec.put("key", dictItem.getItemCode());
					jsonTechSpec.put("type", "label");
					jsonTechSpec.put("title", dictItem.getItemName());
					jsonTechSpec.put("required", false);
					jsonTechSpec.put("Reference", false);
					jsonTechSpec.put("placeholder", dictItem.getItemDescription());
					jsonTechSpec.put("datasource", StringPool.BLANK);
					jsonTechSpec.put("value", StringPool.BLANK);

					if (configTechSpecs != null && configTechSpecs.size() > 0) {
						JSONArray items = JSONFactoryUtil.createJSONArray();

						for (VRConfigTechSpec vrConfig : configTechSpecs) {
							JSONObject techspec = JSONFactoryUtil.createJSONObject();

							techspec.put("key", vrConfig.getSpecificationCode());

							techspec.put("type", vrConfig.getSpecificationEntryType());

							techspec.put("title", vrConfig.getSpecificationDisplayName());

							techspec.put("required", vrConfig.getSpecificationMandatory());

							techspec.put("Reference", false);

							techspec.put("value", StringPool.BLANK);

							techspec.put("sequenceNo", vrConfig.getSequenceNo());

							techspec.put("standard", vrConfig.getSpecificationStandard());
							techspec.put("basicunit", vrConfig.getSpecificationBasicUnit());
							techspec.put("placeholder", vrConfig.getSpecificationEntryPlaceholder());
							if (Validator.isNotNull(vrConfig.getSpecificationDataCollectionId())) {
								techspec.put("specificationDataCollectionID",
										vrConfig.getSpecificationDataCollectionId());
								techspec.put("datasource", getDataSource(vrConfig.getSpecificationDataCollectionId(),
										groupId, vehicleClass));
							}

							items.put(techspec);
						}

						jsonTechSpec.put("items", items);

						techSpecArr.put(jsonTechSpec);
					}

				}
			}

			if (dossierFileId != 0) {
				// DB chua luu formSchema, nen do data vao techSpecArr
				techSpecArr = getFormData(dossierFileId, techSpecArr, flag);
			}

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", techSpecArr);

		} catch (Exception e) {
			_log.error(e);
		}

		return returnObj;
	}

	@Override
	public JSONObject getTechSpecByVehicleClassExt(long groupId, String module, long dossierId, long dossierFileId,
			String fileTemplateNo, String vehicleClass, String flag) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONArray techSpecArr = JSONFactoryUtil.createJSONArray();

		try {

			// get id THONG_SO_KY_THUAT
			DictCollection nhomThongSoKyThuat = DictCollectionLocalServiceUtil
					.fetchByF_dictCollectionCode(VRKeys.NHOM_THONG_SO_KY_THUAT, groupId);

			long ttktId = nhomThongSoKyThuat.getPrimaryKey();

			DictGroup phanLoaiNhomTTSKT = DictGroupLocalServiceUtil.getByGC_GI_DCI(vehicleClass, groupId, ttktId);

			List<DictItemGroup> danhSachNhomThongSoKTChiTiet = DictItemGroupLocalServiceUtil.findByDictGroupId(groupId,
					phanLoaiNhomTTSKT.getPrimaryKey());

			if (Validator.isNull(module)) {
				module = "1";
			}

			VRDossierFile dossierFile = null;

			String formData = StringPool.BLANK;

			if (dossierFileId > 0) {

				dossierFile = VRDossierFileLocalServiceUtil.fetchVRDossierFile(dossierFileId);

			}

			// Add by Dungnv
			if (flag != null && flag.equals("bb")) {
				if (dossierFile == null) {
					if (Validator.isNotNull(fileTemplateNo)) {
						try {
							dossierFile = VRDossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossierId,
									fileTemplateNo, false, OrderByComparatorFactoryUtil
											.create(VRDossierFileModelImpl.TABLE_NAME, "createDate", false));
							if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
								File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
								if (formDataFile != null) {
									formData = FileUploadUtils.fileToString(formDataFile);
								}
							}
							
							if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
								formData = dossierFile.getFormData();
							}
						} catch (Exception e) {
							_log.error(e);
						}
					}
				}
				if (dossierFile != null) {
					VRDossierFile dossierFile_KQ = dossierFile;
					VRDossierFile dossierFile_TP = VRDossierFileLocalServiceUtil.getDossierFileByDID_DPNO(dossierId,
							"TP1", false);
					String formData_KQ = StringPool.BLANK;
					String formData_TP = StringPool.BLANK;
					if (Validator.isNotNull(dossierFile_KQ) && (dossierFile_KQ.getFormDataDossierFile() > 0)) {
						File formDataFile_KQ = FileUploadUtils.getFile(dossierFile_KQ.getFormDataDossierFile());
						if (formDataFile_KQ != null) {
							formData_KQ = FileUploadUtils.fileToString(formDataFile_KQ);
						}
					}
					
					if (Validator.isNotNull(dossierFile_KQ) && formData_KQ.isEmpty()) {
						formData_KQ = dossierFile_KQ.getFormData();
					}

					if (Validator.isNotNull(dossierFile_TP) && (dossierFile_TP.getFormDataDossierFile() > 0)) {
						File formDataFile_TP = FileUploadUtils.getFile(dossierFile_TP.getFormDataDossierFile());
						if (formDataFile_TP != null) {
							formData_TP = FileUploadUtils.fileToString(formDataFile_TP);
						}
					}
					
					if (Validator.isNotNull(dossierFile_TP) && formData_TP.isEmpty()) {
						formData_TP = dossierFile_TP.getFormData();
					}

					JSONObject jFormData_KQ = JSONFactoryUtil.createJSONObject(formData_KQ);
					JSONObject jFormData_TP = JSONFactoryUtil.createJSONObject(formData_TP);
					// _log.info("- Dungnv: jFormData_KQ_Id: " +
					// dossierFile_KQ.getFormDataDossierFile());
					// _log.info("- Dungnv: jFormData_TP_Id: " +
					// dossierFile_TP.getFormDataDossierFile());
					jFormData_TP.keys().forEachRemaining(key -> {
						if (!key.contains("trackChange")) {
							jFormData_KQ.remove(key);
							jFormData_KQ.put(key, jFormData_TP.getString(key));
						}
					});
					formData = jFormData_KQ.toJSONString();
				}
			} else {
				if (dossierFile != null) {
					// Update online form
					// Add by Dungnv
					if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
						File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
						if (formDataFile != null) {
							formData = FileUploadUtils.fileToString(formDataFile);
						}
					}
					
					if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
						formData = dossierFile.getFormData();
					}
					
					// _log.info("==========================1 " + dossierFile.getFileEntryId());
				} else {
					// View online form
					// _log.info("==========================2");
					if (Validator.isNotNull(fileTemplateNo)) {
						try {
							dossierFile = VRDossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(dossierId,
									fileTemplateNo, false, OrderByComparatorFactoryUtil
											.create(VRDossierFileModelImpl.TABLE_NAME, "createDate", false));

							// Add by Dungnv
							if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
								File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
								if (formDataFile != null) {
									formData = FileUploadUtils.fileToString(formDataFile);
								}
							}
							
							if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
								formData = dossierFile.getFormData();
							}
							// Comment by Dungnv
							// formData = dossierFile.getFormData();

							// _log.info("==========================3");

						} catch (Exception e) {
							_log.error(e);
						}
					}
				}
			}

			JSONObject formDataObject = null;

			if (Validator.isNotNull(formData)) {
				try {
					formDataObject = JSONFactoryUtil.createJSONObject(formData);
				} catch (Exception e) {
					_log.error("Can not create json object from formData", e);
				}
			}

			for (DictItemGroup dg : danhSachNhomThongSoKTChiTiet) {

				DictItem dictItem = DictItemLocalServiceUtil.getDictItem(dg.getDictItemId());

				List<VRConfigTechSpec> configTechSpecs = VRConfigTechSpecLocalServiceUtil.getByVCSC(vehicleClass,
						dictItem.getItemCode(), module);

				JSONObject jsonTechSpec = JSONFactoryUtil.createJSONObject();

				jsonTechSpec.put("key", dictItem.getItemCode());
				jsonTechSpec.put("type", "label");
				jsonTechSpec.put("title", dictItem.getItemName());
				jsonTechSpec.put("required", false);
				jsonTechSpec.put("Reference", false);
				jsonTechSpec.put("placeholder", dictItem.getItemDescription());
				jsonTechSpec.put("datasource", StringPool.BLANK);
				jsonTechSpec.put("value", StringPool.BLANK);

				JSONArray items = JSONFactoryUtil.createJSONArray();

				for (VRConfigTechSpec vrConfig : configTechSpecs) {

					JSONObject techspec = JSONFactoryUtil.createJSONObject();

					String tmpKey = vrConfig.getSpecificationCode();

					String tmpType = vrConfig.getSpecificationEntryType();

					techspec.put("key", tmpKey);

					techspec.put("type", vrConfig.getSpecificationEntryType());

					techspec.put("title", vrConfig.getSpecificationDisplayName());

					techspec.put("required", vrConfig.getSpecificationMandatory());

					techspec.put("Reference", false);

					techspec.put("sequenceNo", vrConfig.getSequenceNo());

					techspec.put("standard", vrConfig.getSpecificationStandard());
					techspec.put("basicunit", vrConfig.getSpecificationBasicUnit());
					techspec.put("placeholder", vrConfig.getSpecificationEntryPlaceholder());
					if (Validator.isNotNull(vrConfig.getSpecificationDataCollectionId())) {
						techspec.put("specificationDataCollectionID", vrConfig.getSpecificationDataCollectionId());
						techspec.put("datasource",
								getDataSource(vrConfig.getSpecificationDataCollectionId(), groupId, vehicleClass));
					}
					String value = StringPool.BLANK;
					String value_text = StringPool.BLANK;
					String result = StringPool.BLANK;
					String resultTD = StringPool.BLANK;

					if (formDataObject != null) {

						if (formDataObject.has(tmpKey)) {
							value = formDataObject.getString(tmpKey);
						}

						if (formDataObject.has(tmpKey + "_text") && (tmpType.equalsIgnoreCase("select")
								|| tmpType.equalsIgnoreCase("select1") || tmpType.equalsIgnoreCase("select2")
								|| tmpType.equalsIgnoreCase("select3"))) {
							value_text = formDataObject.getString(tmpKey + "_text");

						}

						if (dossierFileId > 0) {
							// Update online form
							if (formDataObject.has("bb_" + tmpKey)) {
								resultTD = formDataObject.getString("bb_" + tmpKey);

							}

							if (formDataObject.has("kl_" + tmpKey)) {
								result = formDataObject.getString("kl_" + tmpKey);
							}

						} else {
							// View online form
							result = StringPool.BLANK;
							resultTD = value;
						}

					}

					techspec.put("value_text", value_text);
					techspec.put("resultTD", resultTD);
					techspec.put("result", result);
					techspec.put("value", value);

					items.put(techspec);
				}

				jsonTechSpec.put("items", items);

				techSpecArr.put(jsonTechSpec);
			}

			if (dossierFileId != 0) {
				// DB chua luu formSchema, nen do data vao techSpecArr
				techSpecArr = getFormData(dossierFileId, techSpecArr, flag);
			}

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", techSpecArr);

		} catch (Exception e) {
			_log.error(e);
			// returnObj.put("status", HttpsURLConnection.HTTP_OK);
			// returnObj.put("content", techSpecArr);
		}

		return returnObj;
	}

	// LamTV: Add process module ext vehicle Type
	private static final String TEXT = "_text";
	private static final String SELECT = "select";
	private static final String SELECT_1 = "select1";
	private static final String SELECT_2 = "select2";
	private static final String SELECT_3 = "select3";
	private static final String BB = "bb_";
	private static final String KL = "kl_";

	@Override
	public JSONObject getTechSpecByVehicleType(long groupId, String module, long dossierId, long dossierFileId,
			String fileTemplateNo, String vehicleClass, String vehicleType, String flag) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONArray techSpecArr = JSONFactoryUtil.createJSONArray();

		try {

			// get id THONG_SO_KY_THUAT
			DictCollection nhomThongSoKyThuat = DictCollectionLocalServiceUtil
					.fetchByF_dictCollectionCode(VRKeys.NHOM_THONG_SO_KY_THUAT, groupId);

			long ttktId = nhomThongSoKyThuat.getPrimaryKey();

			DictGroup phanLoaiNhomTTSKT = DictGroupLocalServiceUtil.getByGC_GI_DCI(vehicleClass, groupId, ttktId);

			List<DictItemGroup> danhSachNhomThongSoKTChiTiet = DictItemGroupLocalServiceUtil.findByDictGroupId(groupId,
					phanLoaiNhomTTSKT.getPrimaryKey());

			if (Validator.isNull(module)) {
				module = "1";
			}

			for (DictItemGroup dg : danhSachNhomThongSoKTChiTiet) {

				DictItem dictItem = DictItemLocalServiceUtil.getDictItem(dg.getDictItemId());

//				List<VRConfigTechSpec> configTechSpecs = VRConfigTechSpecLocalServiceUtil.getByVCSC(vehicleClass,
//						dictItem.getItemCode(), module);
//				List<VRConfigTechSpec> configTechSpecsList = VRConfigTechSpecLocalServiceUtil.getByVCCTSCMD(vehicleClass,
//						vehicleClass, dictItem.getItemCode(), module);

				List<VRConfigTechSpec> configTechSpecsTypeList = VRConfigTechSpecLocalServiceUtil
						.getByVCCTSCMD(vehicleClass, vehicleType, dictItem.getItemCode(), module);

				List<VRConfigTechSpec> configTechSpecsAll = new ArrayList<VRConfigTechSpec>();

				// Check list null or empty
//				if (configTechSpecsList != null && configTechSpecsList.size() > 0) {
//					configTechSpecsAll.addAll(configTechSpecsList);
//				}
				if (configTechSpecsTypeList != null && configTechSpecsTypeList.size() > 0) {
					configTechSpecsAll.addAll(configTechSpecsTypeList);
				}

				JSONObject jsonTechSpec = JSONFactoryUtil.createJSONObject();

				jsonTechSpec.put("key", dictItem.getItemCode());
				jsonTechSpec.put("type", "label");
				jsonTechSpec.put("title", dictItem.getItemName());
				jsonTechSpec.put("required", false);
				jsonTechSpec.put("Reference", false);
				jsonTechSpec.put("placeholder", dictItem.getItemDescription());
				jsonTechSpec.put("datasource", StringPool.BLANK);
				jsonTechSpec.put("value", StringPool.BLANK);

				JSONArray items = JSONFactoryUtil.createJSONArray();

				if (configTechSpecsAll.size() > 0) {
					for (VRConfigTechSpec vrConfig : configTechSpecsAll) {

						JSONObject techspec = JSONFactoryUtil.createJSONObject();

						// Get value record techSpec
						String tmpKey = vrConfig.getSpecificationCode();
						String tmpType = vrConfig.getSpecificationEntryType();
						String title = vrConfig.getSpecificationDisplayName();
						int required = vrConfig.getSpecificationMandatory();
						String standard = vrConfig.getSpecificationStandard();
						String basicunit = vrConfig.getSpecificationBasicUnit();
						String placeholder = vrConfig.getSpecificationEntryPlaceholder();
						String dataCollection = vrConfig.getSpecificationDataCollectionId();
						JSONArray datasource = null;
						if (Validator.isNotNull(dataCollection)) {
							datasource = getDataSource(vrConfig.getSpecificationDataCollectionId(), groupId,
									vehicleClass);
						}

						techspec.put("key", tmpKey);
						techspec.put("type", tmpType);
						techspec.put("title", title);
						techspec.put("required", required);
						techspec.put("Reference", false);
						techspec.put("standard", standard);
						techspec.put("basicunit", basicunit);
						techspec.put("placeholder", placeholder);
						techspec.put("datasource", datasource);
						techspec.put("sequenceNo", vrConfig.getSequenceNo());
						techspec.put("specificationDataCollectionID", vrConfig.getSpecificationDataCollectionId());

						// Add external field in techSpec
						String value = StringPool.BLANK;
						String value_text = StringPool.BLANK;
						String result = StringPool.BLANK;
						String resultTD = StringPool.BLANK;

						VRDossierFile dossierFile = null;
						String formData = StringPool.BLANK;

						if (dossierFileId > 0) {
							dossierFile = VRDossierFileLocalServiceUtil.fetchVRDossierFile(dossierFileId);
						}

						_log.info("========================== dossierFileId = " + dossierFileId + " |fileTemplateNo: "
								+ fileTemplateNo);

						if (dossierFile != null) {
							// Update online form
							// Add by Dungnv
							if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
								File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
								if (formDataFile != null) {
									formData = FileUploadUtils.fileToString(formDataFile);
								}
							}
							
							if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
								formData = dossierFile.getFormData();
							}

							if (Validator.isNull(formData)) {
								if (Validator.isNotNull(fileTemplateNo)) {
									try {
										dossierFile = VRDossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(
												dossierId, fileTemplateNo, false, OrderByComparatorFactoryUtil.create(
														VRDossierFileModelImpl.TABLE_NAME, "createDate", false));
										// Add by Dungnv
										if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
											File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
											if (formDataFile != null) {
												formData = FileUploadUtils.fileToString(formDataFile);
											}
										}
										
										if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
											formData = dossierFile.getFormData();
										}

										_log.info("==========================3");

									} catch (Exception e) {
										_log.info("FORM DATA IS NULL");
									}
								}
							}
							// _log.info("==========================1 " + dossierFile.getFileEntryId());
						} else {
							// View online form
							// _log.info("==========================2");
							if (Validator.isNotNull(fileTemplateNo)) {
								try {
									dossierFile = VRDossierFileLocalServiceUtil.getDossierFileByDID_FTNO_First(
											dossierId, fileTemplateNo, false, OrderByComparatorFactoryUtil
													.create(VRDossierFileModelImpl.TABLE_NAME, "createDate", false));
									// Add by Dungnv
									if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
										File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
										if (formDataFile != null) {
											formData = FileUploadUtils.fileToString(formDataFile);
										}
									}
									
									if (Validator.isNotNull(dossierFile) && formData.isEmpty()) {
										formData = dossierFile.getFormData();
									}
									
								} catch (Exception e) {

								}
							}
						}

						JSONObject formDataObject = null;

						if (Validator.isNotNull(formData)) {
							try {
								formDataObject = JSONFactoryUtil.createJSONObject(formData);
							} catch (Exception e) {
								_log.error("Can not create json object from formData", e);
							}
						}

						if (formDataObject != null) {

							if (formDataObject.has(tmpKey)) {
								value = formDataObject.getString(tmpKey);

							}

							boolean flagValue = false;
							if (formDataObject.has(tmpKey + TEXT)) {
								if (tmpType.equalsIgnoreCase(SELECT) || tmpType.equalsIgnoreCase(SELECT_1)
										|| tmpType.equalsIgnoreCase(SELECT_2) || tmpType.equalsIgnoreCase(SELECT_3)) {
									flagValue = true;
								}
							}
							if (flagValue) {
								value_text = formDataObject.getString(tmpKey + TEXT);
							}

							if (dossierFileId > 0) {
								// Update online form
								if (formDataObject.has(BB + tmpKey)) {
									resultTD = formDataObject.getString(BB + tmpKey);

								}

								if (formDataObject.has(KL + tmpKey)) {
									result = formDataObject.getString(KL + tmpKey);
								}

							} else {
								// View online form
								result = StringPool.BLANK;
								resultTD = value;
							}

						}

						techspec.put("value_text", value_text);
						techspec.put("resultTD", resultTD);
						techspec.put("result", result);
						techspec.put("value", value);

						items.put(techspec);
					}
				}

				jsonTechSpec.put("items", items);

				techSpecArr.put(jsonTechSpec);
			}

			if (dossierFileId != 0) {
				// DB chua luu formSchema, nen do data vao techSpecArr
				techSpecArr = getFormData(dossierFileId, techSpecArr, flag);
			}

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", techSpecArr);

		} catch (Exception e) {
			// _log.error(e);
			// returnObj.put("status", HttpsURLConnection.HTTP_OK);
			// returnObj.put("content", techSpecArr);
		}

		return returnObj;
	}

	private JSONArray getFormData(long dossierFileId, JSONArray formSchema, String flag) {

		JSONArray output = JSONFactoryUtil.createJSONArray();

		VRDossierFile dossierFile = getDossierFile(dossierFileId);

		JSONObject formData = null;

		// JSONArray formSchema = null;

//		_log.info("==childKeyObj==getFormData==" + formSchema);

		if (Validator.isNotNull(dossierFile)) {

			try {
				// Add by Dungnv
				if (flag != null && flag.equals("bb")) {
					// _log.info("- Dungnv: flag != null && flag.equals(\"bb\")");
					VRDossierFile dossierFile_KQ = dossierFile;
					VRDossierFile dossierFile_TP = VRDossierFileLocalServiceUtil
							.getDossierFileByDID_DPNO(dossierFile.getDossierId(), "TP1", false);
					String formData_KQ = StringPool.BLANK;
					String formData_TP = StringPool.BLANK;
					if (Validator.isNotNull(dossierFile_KQ) && (dossierFile_KQ.getFormDataDossierFile() > 0)) {
						File formDataFile_KQ = FileUploadUtils.getFile(dossierFile_KQ.getFormDataDossierFile());
						if (formDataFile_KQ != null) {
							formData_KQ = FileUploadUtils.fileToString(formDataFile_KQ);
						}
					}
					
					if (Validator.isNotNull(dossierFile_KQ) && formData_KQ.isEmpty()) {
						formData_KQ = dossierFile_KQ.getFormData();
					}
					
					if (Validator.isNotNull(dossierFile_TP) && (dossierFile_TP.getFormDataDossierFile() > 0)) {
						File formDataFile_TP = FileUploadUtils.getFile(dossierFile_TP.getFormDataDossierFile());
						if (formDataFile_TP != null) {
							formData_TP = FileUploadUtils.fileToString(formDataFile_TP);
						}
					}
					
					if (Validator.isNotNull(dossierFile_TP) && formData_TP.isEmpty()) {
						formData_TP = dossierFile_TP.getFormData();
					}

					JSONObject jFormData_KQ = JSONFactoryUtil.createJSONObject(formData_KQ);
					JSONObject jFormData_TP = JSONFactoryUtil.createJSONObject(formData_TP);
					jFormData_TP.keys().forEachRemaining(key -> {
						if (!key.contains("trackChange")) {
							jFormData_KQ.remove(key);
							jFormData_KQ.put(key, jFormData_TP.getString(key));
						}
					});
					formData = JSONFactoryUtil.createJSONObject(jFormData_KQ.toJSONString());
				} else {
					String strFormData = StringPool.BLANK;
					if (Validator.isNotNull(dossierFile) && (dossierFile.getFormDataDossierFile() > 0)) {
						File formDataFile = FileUploadUtils.getFile(dossierFile.getFormDataDossierFile());
						
						if (formDataFile != null) {
							strFormData = FileUploadUtils.fileToString(formDataFile);
						}
					}
					
					if (Validator.isNotNull(dossierFile) && strFormData.isEmpty()) {
						strFormData = dossierFile.getFormData();
					}
					formData = JSONFactoryUtil.createJSONObject(strFormData);
				}

				// Comment by Dungnv
				// formData = JSONFactoryUtil.createJSONObject(dossierFile.getFormData());

//				_log.info("formData: "+formData);

				// DB chua luu FormSchema

				// formSchema =
				// JSONFactoryUtil.createJSONArray(dossierFile.getFormSchema());

				int length = formSchema.length();

				for (int i = 0; i < length; i++) {

					JSONObject parent = formSchema.getJSONObject(i);
//					_log.info("parent "+i+": "+parent);

					String keyObject = parent.getString("key");

					String keyValue = formData.getString(keyObject);
//					_log.info("keyValue: "+keyValue);

					parent.put("value", keyValue);

					JSONArray items = JSONFactoryUtil.createJSONArray(parent.getString("items"));

					int lengthChild = items.length();

					JSONArray altJSONArray = JSONFactoryUtil.createJSONArray();

					for (int j = 0; j < lengthChild; j++) {
						JSONObject child = items.getJSONObject(j);

						String childKeyObj = child.getString("key");

						String childKeyValue = formData.getString(childKeyObj);

						child.put("value", childKeyValue);

//						_log.info("==childKeyObj==" + dossierFileId + "_" + childKeyObj + "_" + childKeyValue);

						altJSONArray.put(child);
					}

					parent.put("items", altJSONArray);

					output.put(parent);
				}
			} catch (Exception e) {
				// _log.error(e);
			}

		}

		if (output.length() == 0) {
			output = formSchema;
		}

		return output;
	}

	private VRDossierFile getDossierFile(long dossierFileId) {

		VRDossierFile dossierFile = null;

		if (dossierFileId != 0) {
			try {
				dossierFile = VRDossierFileLocalServiceUtil.getByDossierFileId(dossierFileId);
			} catch (Exception e) {
				_log.error(e);
			}

		}

		return dossierFile;
	}

	@Override
	public JSONObject getTechSpecLimit(long groupId, String module, long dossierId, long dossierFileId,
			String vehicleClass, String vehicleType, long fomulaType) {

		JSONObject returnObj = JSONFactoryUtil.createJSONObject();

		try {
			DictCollection nhomLoaiPhuongTien = DictCollectionLocalServiceUtil
					.fetchByF_dictCollectionCode(VRKeys.LOAI_PHUONG_TIEN, groupId);

			long loaiPhuongTienId = nhomLoaiPhuongTien.getPrimaryKey();

			DictItem dictItem = DictItemLocalServiceUtil.fetchByF_dictItemCode(vehicleType, loaiPhuongTienId, groupId);

			List<DictItemGroup> lsDictItemGroup = DictItemGroupLocalServiceUtil.findByF_dictItemId(groupId,
					dictItem.getPrimaryKey());

			long dictGroupId = 0;

			if (lsDictItemGroup.size() != 0) {
				dictGroupId = lsDictItemGroup.get(0).getDictGroupId();
			}

			String dictGroupName = StringPool.BLANK;

			if (dictGroupId != 0) {
				dictGroupName = DictGroupLocalServiceUtil.getDictGroup(dictGroupId).getGroupName();
			}

			List<VRLimitConfigTechSpec> vrLimits = VRLimitConfigTechSpecLocalServiceUtil.getLimitConfigs(vehicleClass,
					dictGroupName, fomulaType);

			JSONObject jsContent = JSONFactoryUtil.createJSONObject();

			jsContent.put("TechSpecs", getLimitsConfig(vrLimits));

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", jsContent);

		} catch (Exception e) {
			returnObj.put("status", HttpsURLConnection.HTTP_FORBIDDEN);

		}

		return returnObj;
	}

	@Override
	public JSONObject getTechSpecByVehicleClassType(long groupId, String module, long dossierId, long dossierFileId,
			String vehicleClass, String vehicleType, String flag) {
		JSONObject returnObj = JSONFactoryUtil.createJSONObject();
		JSONArray techSpecArr = JSONFactoryUtil.createJSONArray();

		if (Validator.isNull(module)) {
			module = "1";
		}

		try {
			// get id THONG_SO_KY_THUAT
			DictCollection nhomThongSoKyThuat = DictCollectionLocalServiceUtil
					.fetchByF_dictCollectionCode(VRKeys.NHOM_THONG_SO_KY_THUAT, groupId);

			long ttktId = nhomThongSoKyThuat.getPrimaryKey();

			DictGroup phanLoaiNhomTTSKT = DictGroupLocalServiceUtil.getByGC_GI_DCI(vehicleClass, groupId, ttktId);

			List<DictItemGroup> danhSachNhomThongSoKTChiTiet = DictItemGroupLocalServiceUtil.findByDictGroupId(groupId,
					phanLoaiNhomTTSKT.getPrimaryKey());

			for (DictItemGroup dg : danhSachNhomThongSoKTChiTiet) {

				DictItem dictItem = DictItemLocalServiceUtil.getDictItem(dg.getDictItemId());

				List<VRConfigTechSpec> configTechSpecs = VRConfigTechSpecLocalServiceUtil.getByVCCTSCMD(vehicleClass,
						vehicleClass, dictItem.getItemCode(), module);

				List<VRConfigTechSpec> configTechSpecsType = VRConfigTechSpecLocalServiceUtil
						.getByVCCTSCMD(vehicleClass, vehicleType, dictItem.getItemCode(), module);

				List<VRConfigTechSpec> configTechSpecsAll = new ArrayList<VRConfigTechSpec>();

				configTechSpecsAll.addAll(configTechSpecs);
				configTechSpecsAll.addAll(configTechSpecsType);

				JSONObject jsonTechSpec = JSONFactoryUtil.createJSONObject();

				jsonTechSpec.put("key", dictItem.getItemCode());
				jsonTechSpec.put("type", "label");
				jsonTechSpec.put("title", dictItem.getItemName());
				jsonTechSpec.put("required", false);
				jsonTechSpec.put("Reference", false);
				jsonTechSpec.put("placeholder", dictItem.getItemDescription());
				jsonTechSpec.put("datasource", StringPool.BLANK);
				jsonTechSpec.put("value", StringPool.BLANK);

				JSONArray items = JSONFactoryUtil.createJSONArray();

				for (VRConfigTechSpec vrConfig : configTechSpecsAll) {
					JSONObject techspec = JSONFactoryUtil.createJSONObject();

					techspec.put("key", vrConfig.getSpecificationCode());

					techspec.put("type", vrConfig.getSpecificationEntryType());

					techspec.put("title", vrConfig.getSpecificationDisplayName());

					techspec.put("required", vrConfig.getSpecificationMandatory());

					techspec.put("Reference", false);

					techspec.put("value", StringPool.BLANK);

					techspec.put("standard", vrConfig.getSpecificationStandard());

					techspec.put("basicunit", vrConfig.getSpecificationBasicUnit());

					techspec.put("sequenceNo", vrConfig.getSequenceNo());

					techspec.put("placeholder", vrConfig.getSpecificationEntryPlaceholder());
					if (Validator.isNotNull(vrConfig.getSpecificationDataCollectionId())) {
						techspec.put("specificationDataCollectionID", vrConfig.getSpecificationDataCollectionId());
						techspec.put("datasource",
								getDataSource(vrConfig.getSpecificationDataCollectionId(), groupId, vehicleClass));
					}

					items.put(techspec);
				}

				jsonTechSpec.put("items", items);

				techSpecArr.put(jsonTechSpec);

			}

			if (dossierFileId != 0) {
				// DB chua luu formSchema, nen do data vao techSpecArr
				techSpecArr = getFormData(dossierFileId, techSpecArr, flag);
			}

			returnObj.put("status", HttpsURLConnection.HTTP_OK);
			returnObj.put("content", techSpecArr);

		} catch (Exception e) {
			returnObj.put("status", HttpsURLConnection.HTTP_FORBIDDEN);
		}

		return returnObj;
	}

	@Override
	public JSONObject getDictItem(long groupId, String dictCollectionCode, String dictCollectionType) {
		// TODO Auto-generated method stub
		return null;
	}

	private JSONArray getLimitsConfig(List<VRLimitConfigTechSpec> vrLimitConfigs) {

		JSONArray arrOut = JSONFactoryUtil.createJSONArray();

		for (VRLimitConfigTechSpec vrLimit : vrLimitConfigs) {

			arrOut.put(vrLimit.getSpecificationCode());
		}

		return arrOut;
	}

	/**
	 * @param dataSourceCode
	 * @return
	 */
	private JSONArray getDataSource(String collectionCode, long groupId, String vehicleClass) {

		JSONArray datasource = JSONFactoryUtil.createJSONArray();

		// _log.info("collectionCode" + collectionCode + "groupId" + groupId +
		// "vehicleClass" + vehicleClass);

		// long dictCollectionId = getDictCollectionId(collectionCode, groupId);

		try {
			long dictGroupCollectionId = getDictCollectionId(collectionCode, groupId);

			DictGroup phanLoaiNhomTTSKT = DictGroupLocalServiceUtil.getByGC_GI_DCI(vehicleClass, groupId,
					dictGroupCollectionId);

			List<DictItemGroup> danhSachNhomThongSoKT = DictItemGroupLocalServiceUtil.findByDictGroupId(groupId,
					phanLoaiNhomTTSKT.getPrimaryKey());

			for (DictItemGroup dg : danhSachNhomThongSoKT) {
				JSONObject diObject = JSONFactoryUtil.createJSONObject();

				DictItem dictItem = DictItemLocalServiceUtil.getDictItem(dg.getDictItemId());
				if (dictItem != null && Validator.isNotNull(dg.getDictGroupName())) {
					diObject.put("value", dictItem.getItemCode());
					diObject.put("text", dictItem.getItemName());
					datasource.put(diObject);
				}

			}

		} catch (Exception e) {
			// _log.error(e);
		}
		// _log.info("datasource" + datasource.length());

		return datasource;
	}

	private long getDictCollectionId(String collectionCode, long groupId) {
		long dictCollectionId = 0;

		try {
			DictCollection dc = DictCollectionLocalServiceUtil.fetchByF_dictCollectionCode(collectionCode, groupId);

			dictCollectionId = dc.getDictCollectionId();
		} catch (Exception e) {
			// _log.error(e);
		}

		return dictCollectionId;
	}

	@Override
	public List<VRCorporationAttendee> getVRCorporationByUserId(int mtCore, long userId, String fromDateConvert,
			String toDateConvert) {

		return VRCorporationAttendeeLocalServiceUtil.getVRCorporationByUserId(mtCore, userId, fromDateConvert,
				toDateConvert);
	}

	Log _log = LogFactoryUtil.getLog(VRActionsImpl.class);

}
