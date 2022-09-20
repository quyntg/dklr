package org.opencps.api.controller.util;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 * @author trungnt
 *
 */
public class VRRestUtil {
	private static Log _log = LogFactoryUtil.getLog(VRRestUtil.class);

	public static LinkedHashMap<String, Object> getParamMap(Object model) {
		LinkedHashMap<String, Object> params = null;
		Class<?> clazz = model.getClass();
		Field[] fields = clazz.getDeclaredFields();

		if (fields != null && fields.length > 0) {
			params = new LinkedHashMap<String, Object>();
			for (int f = 0; f < fields.length; f++) {
				Field field = fields[f];
				String name = field.getName();
				// System.out.println(name);
				String methodName = "get" + StringUtil.upperCaseFirstLetter(name);
				try {
					Method method = clazz.getMethod(methodName);
					Object value = method.invoke(model);
					if (value != null) {
						params.put(name.toLowerCase(), value);
						_log.info("=============>>> pamra: " + name.toLowerCase() + "|" + value);
					}
				} catch (Exception e) {
					_log.warn(e);
				}
			}
		}

		return params;
	}

	public static JSONObject errorMessage(String msg) {
		JSONObject error = JSONFactoryUtil.createJSONObject();
		if (Validator.isNotNull(msg)) {
			error.put("error", msg);
		} else {
			error.put("error", "Internal Server Error");
		}
		return error;
	}

	public static Object mappingModel(Object sourceModel, Class<?> sourceClass, Object targetModel,
			Class<?> targetClass) {
		LinkedHashMap<String, Class<?>> TABLE_COLUMNS_DATA_MAP = null;
		try {
			Field tableColumnsDataMapField = sourceClass.getField("TABLE_COLUMNS_DATA_MAP");

			TABLE_COLUMNS_DATA_MAP = (LinkedHashMap<String, Class<?>>) tableColumnsDataMapField.get(null);
		} catch (Exception e) {
			_log.error(e);
		}

		if (TABLE_COLUMNS_DATA_MAP != null && !TABLE_COLUMNS_DATA_MAP.isEmpty()) {
			Method[] methods = sourceClass.getDeclaredMethods();
			if (methods != null && methods.length > 0) {

				for (int m = 0; m < methods.length; m++) {
					Method method = methods[m];
					String name = method.getName();
					if (name.startsWith("get")) {
						String setMethodName = name.replaceAll("get", "set");
						String fileName = name.replaceFirst("get", StringPool.BLANK).toLowerCase();
						Class<?> dataType = TABLE_COLUMNS_DATA_MAP.get(fileName);

						try {
							Method setMethod = targetClass.getMethod(setMethodName, dataType);
							Object value = method.invoke(sourceModel);
							_log.info("==============>>>>> value " + value + "|" + setMethodName);
							if (setMethod != null) {
								if (dataType.getName().equals(Date.class.getName())) {
									setMethod.invoke(targetModel, new Date());
								} else {
									setMethod.invoke(targetModel, value);
								}
							}

						} catch (Exception e) {
							continue;
						}
					}

				}
			}
		}

		return targetModel;
	}
}
