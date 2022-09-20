package com.fds.vr.business.engine;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.lang.reflect.Field;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author trungnt
 *
 */
public class SQLQueryBuilder {

	private String selectQuery;
	private String countQuery;
	private String from;
	private List<String> queryFields = new ArrayList<String>();
	private List<String> columnInstances = new ArrayList<String>();
	private List<String> conditions = new ArrayList<String>();
	private List<String> joins = new ArrayList<String>();
	private List<String> joinConditions = new ArrayList<String>();
	private List<String> dataTypes = new ArrayList<String>();

	public SQLQueryBuilder build() {
		String query = getFrom();
		if (!getJoins().isEmpty()) {
			query += StringPool.SPACE + StringUtil.merge(getJoins(), StringPool.SPACE);
		}

		if (!getJoinConditions().isEmpty()) {
			query += StringPool.SPACE + StringUtil.merge(getJoinConditions(), StringPool.SPACE);
		}

		if (!getConditions().isEmpty()) {
			query += " WHERE 1 = 1 " + StringUtil.merge(getConditions(), StringPool.SPACE);
		}

		this.setSelectQuery(getSelect() + StringPool.SPACE + query);

		this.setCountQuery("SELECT count(*) AS total " + query);

		return this;
	}

	public SQLQueryBuilder select(String... fields) {
		if (fields != null && fields.length > 0) {
			this.setQueryFields(ListUtil.toList(fields));
			for (int i = 0; i < fields.length; i++) {
				String columnNameInstance = fields[i].trim().replaceAll("\\s+", " ");
				columnNameInstance = columnNameInstance.substring(columnNameInstance.lastIndexOf(" ") + 1);
				this.setColumnInstances(columnNameInstance);
			}

		}

		return this;
	}

	public SQLQueryBuilder select(DBField... fields) {
		if (fields != null && fields.length > 0) {

			for (int i = 0; i < fields.length; i++) {
				DBField field = fields[i];
				this.setDataTypes(field.getType());
				String fieldName = field.getName();
				this.setQueryFields(fieldName);
				String columnNameInstance = fieldName.trim().replaceAll("\\s+", " ");
				columnNameInstance = columnNameInstance.substring(columnNameInstance.lastIndexOf(" ") + 1);
				this.setColumnInstances(columnNameInstance);
			}

		}

		return this;
	}
	
	/*public static void main(String[] args) {
		String test = "s ";
		test = test.trim().replaceAll("\\s+", " ");
		System.out.println(test);
		System.out.println(test.substring(test.lastIndexOf(" ") + 1));
	}*/

	public SQLQueryBuilder select(Class<?> clazz, DBField... fields) {

		selectAll(clazz);

		if (fields != null && fields.length > 0) {

			for (int i = 0; i < fields.length; i++) {
				DBField field = fields[i];
				this.setDataTypes(field.getType());
				this.setQueryFields(field.getName());
				String columnNameInstance = field.getName().trim().replaceAll("\\s+", " ");
				columnNameInstance = columnNameInstance.substring(columnNameInstance.lastIndexOf(" ") + 1);
				this.setColumnInstances(columnNameInstance);
			}

		}

		return this;
	}

	public SQLQueryBuilder selectAll(Class<?>... clazzs) {
		if (clazzs != null && clazzs.length >= 0) {
			List<String> _tmp = new ArrayList<String>();
			for (int i = 0; i < clazzs.length; i++) {
				HashMap<String, Integer> TABLE_COLUMNS_MAP = null;
				String TABLE_NAME = StringPool.BLANK;
				try {
					Field tableColumnsMapField = clazzs[i].getField("TABLE_COLUMNS_MAP");
					TABLE_COLUMNS_MAP = (HashMap<String, Integer>) tableColumnsMapField.get(null);
					Field tableName = clazzs[i].getField("TABLE_NAME");
					TABLE_NAME = (String) tableName.get(null);
				} catch (Exception e) {
					_log.error(e);
				}

				if (TABLE_COLUMNS_MAP != null) {

					for (Entry<String, Integer> entry : TABLE_COLUMNS_MAP.entrySet()) {
						String columnName = entry.getKey();
						String queryFieldName = columnName;
						String alias = columnName;
						int type = entry.getValue();

						if (_tmp.contains(columnName)) {
							int count = 1;
							while (getColumnInstances().contains(alias)) {
								alias = columnName + count;
								count++;
							}

						} else {
							_tmp.add(columnName);
						}

						this.setDataTypes(type);
						this.setQueryFields(TABLE_NAME + "." + queryFieldName + " AS " + alias);
						this.setColumnInstances(alias);
					}

				}
			}
		}
		return this;
	}

	public SQLQueryBuilder selectAll() {
		return this;
	}

	public SQLQueryBuilder from(String table) {
		this.setFrom("FROM " + table);
		return this;
	}

	public SQLQueryBuilder from(String table, String alias) {
		this.setFrom("FROM " + table + (Validator.isNotNull(alias) ? " AS " + alias : StringPool.BLANK));
		return this;
	}

	public SQLQueryBuilder join(String joinType, String left, String leftcolName, String right, String rightcolName) {
		String join = joinType + " " + right + " ON " + left + "." + leftcolName + " = " + right + "." + rightcolName;
		this.setJoins(join);
		return this;
	}

	public SQLQueryBuilder joinwhere(String column, Object value, String condition, String searchOperator) {
		String joincondition = condition(column, value, condition, searchOperator);
		this.setJoinConditions(joincondition);
		return this;
	}

	public SQLQueryBuilder joinwhere(String column, Object value, String condition, String searchOperator,
			boolean parenthesis, String... alias) {
		String joincondition = condition(column, value, condition, searchOperator, parenthesis, alias);
		this.setJoinConditions(joincondition);
		return this;
	}

	public SQLQueryBuilder where(String column, Object value, String condition, String searchOperator) {

		String queryCondition = condition(column, value, condition, searchOperator);

		if (queryCondition != null) {
			this.setConditions(queryCondition);
		}

		return this;
	}

	public SQLQueryBuilder where(String column, Object value, String condition, String searchOperator, String alias) {

		String queryCondition = condition(Validator.isNotNull(alias) ? alias + "." + column : column, value, condition,
				searchOperator);

		if (queryCondition != null) {
			this.setConditions(queryCondition);
		}

		return this;
	}

	public SQLQueryBuilder where(String column, Object value, String condition, String searchOperator,
			boolean parenthesis, String... alias) {

		String queryCondition = condition(column, value, condition, searchOperator, parenthesis, alias);
		if (queryCondition != null) {
			this.setConditions(queryCondition);
		}

		return this;
	}

	public String condition(String column, Object value, String condition, String searchOperator) {

		String queryCondition = StringPool.BLANK;

		if (value != null) {

			queryCondition += StringPool.SPACE + condition + StringPool.SPACE

					+ column + StringPool.SPACE + searchOperator + StringPool.SPACE;
			if (Validator.isNotNull(searchOperator)) {
				if (searchOperator.equals(StringPool.LIKE)) {
					queryCondition += "'%" + value + "%'";
				}else if(searchOperator.equals("BETWEEN")) {
					queryCondition += value;
				} else if(searchOperator.equals("IN")) {
					queryCondition += "(" + value + ")";
				}
				else {
					if (value instanceof String) {
						queryCondition += "'" + value + "'";
					} else {
						queryCondition += value;
					}
				}

			}
		}

		return queryCondition;
	}

	public String condition(String column, Object value, String condition, String searchOperator, boolean parenthesis,
			String... alias) {

		String queryCondition = StringPool.BLANK;
		if (value != null) {

			queryCondition += StringPool.SPACE + condition + StringPool.SPACE + (parenthesis ? "(" : StringPool.BLANK)
					+ (alias != null && alias.length > 0
							? (Validator.isNotNull(alias[0]) ? (alias[0] + StringPool.PERIOD) : StringPool.BLANK)
							: StringPool.BLANK)
					+ column + StringPool.SPACE + searchOperator + StringPool.SPACE;

			if (Validator.isNotNull(searchOperator)) {
				if (searchOperator.equals(StringPool.LIKE)) {
					queryCondition += "'%" + value + "%'";
				} else {
					if (value instanceof String) {
						queryCondition += "'" + value + "'";
					} else {
						queryCondition += value;
					}
				}

			}
			if (parenthesis) {
				queryCondition += ")";
			}

		}

		return queryCondition;
	}

	public String getSelect() {
		return "SELECT " + (queryFields.isEmpty() ? "*" : StringUtil.merge(queryFields));
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public List<String> getQueryFields() {
		return queryFields;
	}

	public void setQueryFields(String queryField) {
		this.queryFields.add(queryField);
	}

	public void setQueryFields(List<String> queryFields) {
		this.queryFields.addAll(queryFields);
	}

	public List<String> getConditions() {
		return conditions;
	}

	public void setConditions(String condition) {
		this.conditions.add(condition);
	}

	public List<String> getJoins() {
		return joins;
	}

	public void setJoins(String join) {
		this.joins.add(join);
	}

	public List<String> getJoinConditions() {
		return joinConditions;
	}

	public void setJoinConditions(String joinCondition) {
		this.joinConditions.add(joinCondition);
	}

	public String getSelectQuery() {
		return selectQuery;
	}

	public void setSelectQuery(String selectQuery) {
		this.selectQuery = selectQuery;
	}

	public String getCountQuery() {
		return countQuery;
	}

	public void setCountQuery(String countQuery) {
		this.countQuery = countQuery;
	}

	public List<String> getColumnInstances() {
		return columnInstances;
	}

	public void setColumnInstances(String columnInstance) {
		this.columnInstances.add(columnInstance);
	}

	public void setColumnInstances(List<String> columnInstances) {
		this.columnInstances.addAll(columnInstances);
	}

	public List<String> getDataTypes() {

		return dataTypes;
	}

	public void setDataTypes(List<String> dataTypes) {
		this.dataTypes.addAll(dataTypes);
	}

	public void setDataTypes(int type) {
		if (type == Types.VARCHAR || type == Types.LONGNVARCHAR || type == Types.NVARCHAR) {
			this.dataTypes.add(String.class.getName());
		} else if (type == Types.BIGINT) {
			this.dataTypes.add(long.class.getName());
		} else if (type == Types.INTEGER || type == Types.SMALLINT || type == Types.TINYINT) {
			this.dataTypes.add(int.class.getName());
		} else if (type == Types.DOUBLE) {
			this.dataTypes.add(double.class.getName());
		} else if (type == Types.FLOAT) {
			this.dataTypes.add(float.class.getName());
		} else if (type == Types.BOOLEAN) {
			this.dataTypes.add(boolean.class.getName());
		} else if (type == Types.DATE || type == Types.TIME || type == Types.TIMESTAMP
				|| type == Types.TIME_WITH_TIMEZONE || type == Types.TIMESTAMP_WITH_TIMEZONE) {
			this.dataTypes.add(Date.class.getName());
		}
	}

	private Log _log = LogFactoryUtil.getLog(SQLQueryBuilder.class);
}
