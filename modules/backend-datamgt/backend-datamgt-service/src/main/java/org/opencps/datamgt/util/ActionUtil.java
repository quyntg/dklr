package org.opencps.datamgt.util;

import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.datamgt.utils.DateTimeUtils;

/**
 * @author trungnt
 *
 */
public class ActionUtil {
	private static Log _log = LogFactoryUtil.getLog(ActionUtil.class);

	public static SQLQueryInstance createSQLQueryInstance(String sqlStatementPattern,
			LinkedHashMap<String, String> columnMap, StringBuilder conditions, LinkedHashMap<String, String> sortedby,
			Class<?> returnClassName, String className, String tableAlias, String joinStatements,String coutPrimaryKey) {
		SQLQueryInstance instance = new SQLQueryInstance(sqlStatementPattern, columnMap, conditions, sortedby,
				returnClassName, className, tableAlias, joinStatements,coutPrimaryKey);
		return instance;
	}

	// create statement column name with table alias
	public static String createSCNWTAS(String columnName, String tableAlias) {
		
		columnName = columnName.toLowerCase();
		
		if (Validator.isNotNull(tableAlias)) {
			_log.info("====>>> tableAlias " + tableAlias);
			return tableAlias + "." + columnName + " AS " + tableAlias + "_" + columnName;
		} else {
			_log.info("====>>> columnName " + columnName);
			return columnName;
		}
	}

	public static String buildSQLCondition(String columnName, Object value, String condition, String searchOperator,
			String... alias) {
		String queryCondition = StringPool.BLANK;
		queryCondition += StringPool.SPACE + condition + StringPool.SPACE
				+ (alias != null && alias.length > 0
						? (Validator.isNotNull(alias[0]) ? (alias[0] + StringPool.PERIOD) : StringPool.BLANK)
						: StringPool.BLANK)
				+ columnName + StringPool.SPACE + searchOperator + StringPool.SPACE + value;
		
		return queryCondition;
	}
	
	public static String buildSQLCondition(String columnName, String[] values, String condition, String searchOperator,
			String... alias) {
		String queryCondition = StringPool.BLANK;
		
		if(searchOperator.equals("IN")) {
		
			queryCondition += StringPool.SPACE + condition + StringPool.SPACE+ 
					(alias != null && alias.length > 0 ? (Validator.isNotNull(alias[0]) ? (alias[0] + StringPool.PERIOD) : StringPool.BLANK): StringPool.BLANK)
					+ columnName + StringPool.SPACE + searchOperator + StringPool.SPACE + buildSQLArrayCondition(values);
		}

		return queryCondition;
	}
	
	public static String buildSQLArrayCondition(String[] values) {
		String queryCondition = StringPool.OPEN_PARENTHESIS;
		
		for(int i=0;i <values.length;i++) {
			String value = values[i];
			
			if(i ==  values.length -1) {
				
				queryCondition += StringPool.APOSTROPHE+value+StringPool.APOSTROPHE+StringPool.CLOSE_PARENTHESIS;
				
			}else {
				queryCondition += StringPool.APOSTROPHE+value+StringPool.APOSTROPHE;
				
				if(values.length > 1) {
					queryCondition+= StringPool.COMMA;
				}
			}
		}

		return queryCondition;
	}

	public static JSONObject array2Json(Object[] objects, List<String> columnNames, List<String> dataTypes) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		if (objects != null && objects.length > 0 && dataTypes != null && dataTypes.size() == objects.length
				&& columnNames != null && columnNames.size() == objects.length) {
			for (int o = 0; o < objects.length; o++) {
				Object object = objects[o];
				String columnName = columnNames.get(o);
				result.put(columnName, object);
			}
		}
		return result;
	}

	public static JSONObject object2Json(Object object, Class<?> clazz, String tableAlias) throws JSONException {

		JSONObject result = JSONFactoryUtil.createJSONObject(JSONFactoryUtil.looseSerialize(object));

		if (clazz.getDeclaredFields() != null) {
			for (int i = 0; i < clazz.getDeclaredFields().length; i++) {
				String fieldName = clazz.getDeclaredFields()[i].getName();
				fieldName = fieldName.replaceFirst("_", "");
				String dataType = clazz.getDeclaredFields()[i].getType().getName();
				if (result.has(fieldName)) {
					String key = Validator.isNotNull(tableAlias) ? (tableAlias + "_")
							: StringPool.BLANK + fieldName.toLowerCase();
					Object value = result.get(fieldName);

					if (dataType.equals("java.util.Date")) {
						String strDate = StringPool.BLANK;
						long time = (Long) result.getLong(fieldName);
						if (time > 0) {
							Calendar c = Calendar.getInstance();
							c.setTimeInMillis(time);
							Date date = c.getTime();
							strDate = DateTimeUtils.convertDateToString(date, DateTimeUtils._VN_DATE_TIME_FORMAT_HOUR);
							value = strDate;
						}
					}
					result.put(key, value);
					result.remove(fieldName);
				}

			}
		}
		return result;
	}
	
//	public static LinkedHashMap<String, String> createSCNWTAS(LinkedHashMap<String, String> columnStatementMap,
//			 Class<?> clazz, String tableAlias) {
//		
//		
//		
//		_log.info("clazz.getDeclaredFields():"+clazz.getDeclaredFields());
//		if (clazz.getDeclaredFields() != null) {
//			
//			Field[] fileds = clazz.getFields();
//			
//			
//			
//			for (int i = 0; i < clazz.getDeclaredFields().length; i++) {
//				Field field = fileds[i];
//				
//				_log.info("=====field.getName().length:"+field.getName());
//				_log.info("--+++field.getType():"+field.getType());
//				
//			}
//			
//			_log.info("clazz.getDeclaredFields().length:"+clazz.getDeclaredFields().length);
//			for (int i = 0; i < clazz.getDeclaredFields().length; i++) {
//
//				String fieldName = clazz.getDeclaredFields()[i].getName();
//				_log.info("--fieldName(1):"+fieldName);
//				fieldName = fieldName.replaceFirst("_", "").toLowerCase();
//				_log.info("++fieldName(2):"+fieldName);
//				String dataType = clazz.getDeclaredFields()[i].getType().getName();
//				_log.info("++dataType:"+dataType);
//
//				String key = StringPool.BLANK;
//				
//				
//				if (Validator.isNotNull(tableAlias)) {
//
//					key = tableAlias + "." + fieldName + " AS " + tableAlias + "_" + fieldName;
//				} else {
//					key = fieldName;
//				}
//
//				columnStatementMap.put(key, dataType);
//
//			}
//		}
//
//		return columnStatementMap;
//	}

	public static JSONObject mergeJSON(JSONObject object1, JSONObject object2, Class<?> clazz) {

		HashMap<String, String> fieldMap = new HashMap<String, String>();

		String object2IdMappingName = (clazz.getSimpleName().substring(0, 1).toLowerCase()
				+ clazz.getSimpleName().substring(1)).replace("ModelImpl", "") + "Id";

		Field[] fields = clazz.getDeclaredFields();

		if (fields != null) {
			for (int i = 0; i < fields.length; i++) {
				String fieldName = fields[i].getName();
				String type = fields[i].getType().getName();
				if (String.valueOf(fieldName.charAt(0)).equals("_")) {
					fieldName = fieldName.substring(1);
				}

				fieldMap.put(fieldName.toLowerCase(), type);
			}
		}

		if (object2.has(object2IdMappingName) && !object1.has(object2IdMappingName)) {
			object1.put(object2IdMappingName, object2.getLong(object2IdMappingName));
		}

		Iterator<String> keys = object2.keys();

		while (keys.hasNext()) {
			String key = keys.next();

			if (key.equals("id")) {

				long id = object2.getLong("id");

				object1.put(object2IdMappingName, id);
			}
			if (!object1.has(key) && fieldMap.containsKey(key.toLowerCase())) {
				Object value = null;
				String type = fieldMap.get(key.toLowerCase());
				if (type.equals("java.lang.String")) {
					value = object2.getString(key);
					object1.put(key, value.toString());
				} else if (type.equals("int")) {
					value = object2.getInt(key);
					object1.put(key, (Integer) value);
				} else if (type.equals("long")) {
					value = object2.getLong(key);
					object1.put(key, (Long) value);
				} else if (type.equals("double")) {
					value = object2.getDouble(key);
					object1.put(key, (Double) value);
				} else if (type.equals("boolean")) {
					value = object2.getBoolean(key);
					object1.put(key, (Boolean) value);
				} else if (type.equals("java.util.Date")) {
					value = object2.getLong(key);
					long time = (Long) value;
					String strDate = StringPool.BLANK;
					if (time > 0) {
						Calendar c = Calendar.getInstance();
						c.setTimeInMillis(time);
						Date date = c.getTime();
						strDate = DateTimeUtils.convertDateToString(date, DateTimeUtils._VN_TIME_FORMAT_HOUR);
					}

					object1.put(key, strDate);
				}
			}
		}
		return object1;
	}

	public static int getStart(LinkedHashMap<String, Object> params) {
		int start = 0;
		if (params != null) {

			if (params.containsKey("start")) {
				start = (int) params.get("start");
			}
		}
		return start;
	}

	public static int getEnd(LinkedHashMap<String, Object> params) {
		int end = 0;
		if (params != null) {
			if (params.containsKey("end")) {
				end = (int) params.get("end");
			}
		}
		return end;
	}

	public static String getKeyword(LinkedHashMap<String, Object> params) {
		String keyword = StringPool.BLANK;
		if (params != null) {
			if (params.containsKey("keyword")) {
				keyword = (String) params.get("keyword");
			}
		}
		return keyword;
	}

	public static LinkedHashMap<String, String> getOrderFiledMap(LinkedHashMap<String, Object> params,
			LinkedHashMap<String, String> statementColumnNames) {
		LinkedHashMap<String, String> orderMap = new LinkedHashMap<String, String>();
		if (params != null) {

			String order_asc = StringPool.BLANK;
			String order_desc = StringPool.BLANK;

			if (params.containsKey("order_asc")) {
				order_asc = (String) params.get("order_asc");
			}
			if (params.containsKey("order_desc")) {
				order_desc = (String) params.get("order_desc");
			}

			if ((Validator.isNotNull(order_asc) || Validator.isNotNull(order_desc))) {

				if (statementColumnNames != null && !statementColumnNames.isEmpty()) {
					HashMap<String, String> _tmp = new HashMap<String, String>();
					statementColumnNames.forEach((k, v) -> {
						k = k.trim();
						String fileld = StringPool.BLANK;
						String alias = StringPool.BLANK;
						if (k.contains(" ")) {
							alias = k.substring(k.lastIndexOf(" ") + 1, k.length());
							if (k.contains(".")) {
								fileld = k.substring(k.lastIndexOf(".") + 1, k.indexOf(" "));
							} else {
								fileld = k.substring(0, k.indexOf(" "));
							}

						} else {
							if (k.contains(".")) {
								fileld = k.substring(k.lastIndexOf(".") + 1, k.length());
							} else {
								fileld = k;
							}

							alias = fileld;
						}

						if (Validator.isNotNull(fileld) && Validator.isNotNull(alias)) {
							_tmp.put(fileld, alias);
						}

					});

					if (Validator.isNotNull(order_asc)) {
						String[] orderASC = StringUtil.split(order_asc);
						if (orderASC != null && orderASC.length > 0) {
							for (int i = 0; i < orderASC.length; i++) {
								String field = orderASC[i];
								if (_tmp.containsKey(field)) {
									orderMap.put(_tmp.get(field), "ASC");
								}
							}
						}
					}

					if (Validator.isNotNull(order_desc)) {
						String[] orderDESC = StringUtil.split(order_desc);
						if (orderDESC != null && orderDESC.length > 0) {
							for (int i = 0; i < orderDESC.length; i++) {
								String field = orderDESC[i];
								if (_tmp.containsKey(field)) {
									orderMap.put(_tmp.get(field), "DESC");
								}
							}
						}
					}
				} else {
					if (Validator.isNotNull(order_asc)) {
						String[] orderASC = StringUtil.split(order_asc);
						if (orderASC != null && orderASC.length > 0) {
							for (int i = 0; i < orderASC.length; i++) {
								String field = orderASC[i];
								orderMap.put(field, "ASC");
							}
						}
					}

					if (Validator.isNotNull(order_desc)) {
						String[] orderDESC = StringUtil.split(order_desc);
						if (orderDESC != null && orderDESC.length > 0) {
							for (int i = 0; i < orderDESC.length; i++) {
								String field = orderDESC[i];
								orderMap.put(field, "DESC");
							}
						}
					}
				}
			}
		}
		return orderMap;
	}

	
}
