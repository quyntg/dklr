package com.fds.vr.util;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.opencps.datamgt.utils.DateTimeUtils;

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

	public static Object mappingModel(Object sourceModel, Object targetModel) {
		LinkedHashMap<String, Class<?>> TABLE_COLUMNS_DATA_MAP = null;
		try {
			Field tableColumnsDataMapField = sourceModel.getClass().getField("TABLE_COLUMNS_DATA_MAP");

			TABLE_COLUMNS_DATA_MAP = (LinkedHashMap<String, Class<?>>) tableColumnsDataMapField.get(null);
		} catch (Exception e) {
			_log.error(e);
		}

		if (TABLE_COLUMNS_DATA_MAP != null && !TABLE_COLUMNS_DATA_MAP.isEmpty()) {
			Method[] methods = sourceModel.getClass().getDeclaredMethods();
			if (methods != null && methods.length > 0) {

				for (int m = 0; m < methods.length; m++) {
					Method method = methods[m];
					String name = method.getName();

					if (name.startsWith("get")) {
						String setMethodName = name.replaceAll("get", "set");
						String fileName = name.replaceFirst("get", StringPool.BLANK).toLowerCase();
						Class<?> dataType = TABLE_COLUMNS_DATA_MAP.get(fileName);

						try {
							Method setMethod = targetModel.getClass().getMethod(setMethodName, dataType);
							Object value = method.invoke(sourceModel);

							if (setMethod != null && value != null) {
								if (dataType.getName().equals(Date.class.getName())) {
									Date date = null;
									try {
										long timestamp = GetterUtil.getLong(value);
										Calendar calendar = Calendar.getInstance();
										calendar.setTimeInMillis(timestamp);
										date = calendar.getTime();
									} catch (Exception e) {
										_log.info(e.fillInStackTrace());
									}
									setMethod.invoke(targetModel, date);
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

	public static Map<String, Object> json2Object(JSONObject data, Object... objects) {

		if (objects == null || objects.length == 0) {
			return null;
		} else {
			Map<String, Object> objectMap = new HashMap<String, Object>();
			for (Object object : objects) {
				_log.info("===>> object class: " + object.getClass().getName());
				Map<String, Method> methodMap = getMethodMap(object.getClass());

				for (Entry<String, Method> entry : methodMap.entrySet()) {
					String methodName = entry.getKey();
					if (methodName.startsWith("set")) {
						String _tmpFieldName = methodName.replace("set", "").toLowerCase();
						_log.info("===> filedname:" + _tmpFieldName);
						if (data.has(_tmpFieldName)) {
							Method method = methodMap.get(methodName);
							Class<?> paramType = method.getParameterTypes()[0];
							Object value = data.get(_tmpFieldName);
							if (value != null) {

								if (paramType.getName().equals(Date.class.getName())) {

									Date _tmp = DateTimeUtils.convertStringToDate(String.valueOf(value),
											DateTimeUtils._VN_DATE_TIME_FORMAT_HOUR);

									value = _tmp;
								} else {
									if (!paramType.getName().equals(value.getClass().getName())) {
										_log.info("--->>>>> Todo convert data? " + _tmpFieldName);
										value = castData(value, value.getClass(), paramType);
									}
								}

								try {
									method.invoke(object, value);
								} catch (Exception e) {
									_log.error(e);
									return null;
								}
								_log.info("---> " + methodName + "|" + _tmpFieldName + "|" + paramType.getName() + "|"
										+ value + "|" + value.getClass().getName());
							}
						}

					}

				}
				objectMap.put(object.getClass().getName(), object);
			}

			return objectMap;
		}

	}

	public static Object castData(Object object, Class<?> from, Class<?> to) {
		try {
			object = to.cast(object);
		} catch (Exception e) {
			try {
				if (to.getName().equals(long.class.getName())) {
					object = Long.parseLong(String.valueOf(object));
				} else if (to.getName().equals(int.class.getName())) {
					object = Integer.parseInt(String.valueOf(object));
				} else if (to.getName().equals(double.class.getName())) {
					object = Double.parseDouble(String.valueOf(object));
				} else if (to.getName().equals(float.class.getName())) {
					object = Float.parseFloat(String.valueOf(object));
				} else if (to.getName().equals(boolean.class.getName())) {
					object = Boolean.parseBoolean(String.valueOf(object));
				} else if (to.getName().equals(String.class.getName())) {
					object = (String) object;
				}

			} catch (Exception p) {
				_log.info("Can't parse object");
				return null;
			}

		}
		return object;
	}

	public static Map<String, Method> getMethodMap(Class<?> clazz) {
		Map<String, Method> map = new HashMap<String, Method>();
		Method[] methods = clazz.getMethods();
		if (methods != null) {

			for (Method method : methods) {
				map.put(method.getName(), method);
			}
		}
		return map;
	}
}
