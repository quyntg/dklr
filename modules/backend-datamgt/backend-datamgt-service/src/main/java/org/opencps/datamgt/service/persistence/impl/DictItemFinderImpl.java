package org.opencps.datamgt.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.opencps.datamgt.model.DictItem;
import org.opencps.datamgt.model.impl.DictItemImpl;
import org.opencps.datamgt.model.impl.DictItemModelImpl;
import org.opencps.datamgt.service.persistence.DictItemFinder;
import org.opencps.datamgt.util.ActionUtil;

public class DictItemFinderImpl extends DictItemFinderBaseImpl implements DictItemFinder {
	
	private static Log log = LogFactoryUtil.getLog(DictItemFinderImpl.class);
	
	public List<DictItem> findByCollection_Level_OrderBy(long groupId, String collectionCode, String level, String OrderBy ) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM opencps_dictitem ");
			if (Validator.isNull(level)) {
				// bo qua
			} else if ((Validator.isNotNull(level)) && level.equalsIgnoreCase("0")){
				// bo qua INNER JOIN parentItem
			} else {
				query.append("INNER JOIN opencps_dictitem parent  ");
				query.append("ON opencps_dictitem.dictCollectionId = parent.dictCollectionId  ");
				query.append("AND opencps_dictitem.parentItemId = parent.dictItemId  ");
				if (Validator.isNotNull(level) && Long.parseLong(level.trim()) > 0) {
					query.append("AND parent.level < " + level +" ");
				} else {
					query.append("AND parent.level in (0, 1)  ");
				}
			}			
			
			query.append("INNER JOIN opencps_dictcollection collection  ");
			query.append("ON opencps_dictitem.dictCollectionId = collection.dictCollectionId  ");
			query.append("AND collection.collectionCode in ('" + collectionCode + "')  ");
			query.append("WHERE  1=1 ");
			if (groupId > 0 ) {
				query.append(" and opencps_dictitem.groupId =   " + groupId +" ");
			} else { 
				query.append(" and opencps_dictitem.groupId = 55301  ");	
			}
			
			if (Validator.isNull(level)) {
				// bo qua
			} else if ((Validator.isNotNull(level)) && level.equalsIgnoreCase("0")){
				query.append(" and opencps_dictitem.level = 0  ");
			} else {
				query.append(" and opencps_dictitem.parentItemId > 0  ");
			}
			
			if (Validator.isNotNull(OrderBy) && OrderBy.contains("name")) {
				query.append("order by opencps_dictitem.parentItemId, CONVERT(opencps_dictitem.itemName USING utf8) COLLATE utf8_polish_ci ");
			} else if (Validator.isNotNull(OrderBy) && OrderBy.contains("sibling")) {
				query.append("order by opencps_dictitem.parentItemId, LENGTH(sibling), sibling ");
			} else {
				query.append("order by opencps_dictitem.parentItemId, CONVERT(opencps_dictitem.itemName USING utf8) COLLATE utf8_polish_ci ");
			}
			
					
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DictItemImpl.TABLE_NAME, DictItemImpl.class);
			
			log.info("=========findByCollection_Level_OrderBy===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			return (List<DictItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DictItem>();
	}
	
	public List<DictItem> findByCollection_Parent_Level_OrderBy(long groupId, String collectionCode, String parentItemCode, String level, String OrderBy ) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM opencps_dictitem ");
			if (Validator.isNull(level)) {
				// bo qua
			} else if ((Validator.isNotNull(level)) && level.equalsIgnoreCase("0")){
				// bo qua INNER JOIN parentItem
			} else {
				query.append("INNER JOIN opencps_dictitem parent  ");
				query.append("ON opencps_dictitem.dictCollectionId = parent.dictCollectionId  ");
				query.append("AND opencps_dictitem.parentItemId = parent.dictItemId  ");
				if (Validator.isNotNull(level) && Long.parseLong(level.trim()) > 0) {
					query.append("AND parent.level < " + level +" ");
				} else {
					query.append("AND parent.level in (0, 1)  ");
				}			
				
				String parentFilter = StringPool.BLANK;
				if (Validator.isNotNull(parentItemCode)) {
					String[] arrGroupCode = StringUtil.split(parentItemCode);
					if (arrGroupCode != null && arrGroupCode.length > 0) {
						for (int i = 0; i < arrGroupCode.length; i++) {
							if (Validator.isNotNull(arrGroupCode[i])) {
								if (Validator.isNotNull(parentFilter)) {
									parentFilter = parentFilter + " OR  " + "parent.itemCode like '"+arrGroupCode[i].trim()+"%' ";
								} else {
									parentFilter = " AND ( "  + "parent.itemCode like '"+arrGroupCode[i].trim()+"%' ";
								}
								
							}

						}
					}
				}
				if (Validator.isNotNull(parentFilter)) {
					query.append(parentFilter + " )  ");
				}
			}			
			
			query.append("INNER JOIN opencps_dictcollection collection  ");
			query.append("ON opencps_dictitem.dictCollectionId = collection.dictCollectionId  ");
			query.append("AND collection.collectionCode in ('" + collectionCode + "')  ");
			query.append("WHERE  1=1 ");
			if (groupId > 0 ) {
				query.append(" and opencps_dictitem.groupId =   " + groupId +" ");
			} else { 
				query.append(" and opencps_dictitem.groupId = 55301  ");	
			}
			
			if (Validator.isNull(level)) {
				// bo qua
			} else if ((Validator.isNotNull(level)) && level.equalsIgnoreCase("0")){
				query.append(" and opencps_dictitem.level = 0  ");
			} else {
				query.append(" and opencps_dictitem.parentItemId > 0  ");
			}
			
			if (Validator.isNotNull(OrderBy) && OrderBy.contains("name")) {
				query.append("order by opencps_dictitem.parentItemId, CONVERT(opencps_dictitem.itemName USING utf8) COLLATE utf8_polish_ci ");
			} else if (Validator.isNotNull(OrderBy) && OrderBy.contains("sibling")) {
				query.append("order by opencps_dictitem.parentItemId, LENGTH(sibling), sibling ");
			} else {
				query.append("order by opencps_dictitem.parentItemId, CONVERT(opencps_dictitem.itemName USING utf8) COLLATE utf8_polish_ci ");
			}
			
					
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DictItemImpl.TABLE_NAME, DictItemImpl.class);
			
			log.info("=========findByCollection_Parent_Level_OrderBy===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			return (List<DictItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DictItem>();
	}
	
	
	public List<DictItem> findByCollection_Group_Level_OrderBy(long groupId, String collectionCode, String groupCode , String level, String OrderBy ) {
		Session session = null;
		try {
			session = openSession();
			
			StringBuilder query = new StringBuilder();
			query.append("SELECT * FROM opencps_dictitem ");
			if (Validator.isNull(level)) {
				// bo qua
			} else if ((Validator.isNotNull(level)) && level.equalsIgnoreCase("0")){
				// bo qua INNER JOIN parentItem
			} else {
				query.append("INNER JOIN opencps_dictitem parent  ");
				query.append("ON opencps_dictitem.dictCollectionId = parent.dictCollectionId  ");
				query.append("AND opencps_dictitem.parentItemId = parent.dictItemId  ");
				if (Validator.isNotNull(level) && Long.parseLong(level.trim()) > 0) {
					query.append("AND parent.level < " + level +" ");
				} else {
					query.append("AND parent.level in (0, 1)  ");
				}	
			}			

			query.append("INNER JOIN opencps_dictcollection collection  ");
			query.append("ON opencps_dictitem.dictCollectionId = collection.dictCollectionId  ");
			query.append("AND collection.collectionCode in ('" + collectionCode + "')  ");
			
			query.append("INNER JOIN opencps_dictgroup dictgroup  ");
			query.append("ON opencps_dictitem.dictCollectionId = dictgroup.dictCollectionId  ");
			query.append("INNER JOIN opencps_dictitemgroup itemgroup  ");
			query.append("ON opencps_dictitem.dictItemId = itemgroup.dictItemId  ");
			query.append("AND itemgroup.dictGroupId = dictgroup.dictGroupId  ");
			
			String groupCodeFilter = StringPool.BLANK;
			if (Validator.isNotNull(groupCode)) {
				String[] arrGroupCode = StringUtil.split(groupCode);
				if (arrGroupCode != null && arrGroupCode.length > 0) {
					for (int i = 0; i < arrGroupCode.length; i++) {
						if (Validator.isNotNull(arrGroupCode[i])) {
							if (Validator.isNotNull(groupCodeFilter)) {
								groupCodeFilter = groupCodeFilter + " OR  " + "itemgroup.dictGroupName in ('"+arrGroupCode[i].trim()+"' ) ";
							} else {
								groupCodeFilter = " AND ( "  + "itemgroup.dictGroupName in ('"+arrGroupCode[i].trim()+"' ) ";
							}
							
						}

					}
				}
			}
			if (Validator.isNotNull(groupCodeFilter)) {
				query.append(groupCodeFilter + " )  ");
			}			
			
			query.append("WHERE  1=1 ");
			if (groupId > 0 ) {
				query.append(" and opencps_dictitem.groupId =   " + groupId +" ");
			} else { 
				query.append(" and opencps_dictitem.groupId = 55301  ");	
			}
			
			if (Validator.isNull(level)) {
				// bo qua
			} else if ((Validator.isNotNull(level)) && level.equalsIgnoreCase("0")){
				query.append(" and opencps_dictitem.level = 0  ");
			} else {
				query.append(" and opencps_dictitem.parentItemId > 0  ");
			}
			
			if (Validator.isNotNull(OrderBy) && OrderBy.contains("name")) {
				query.append("order by opencps_dictitem.parentItemId, CONVERT(opencps_dictitem.itemName USING utf8) COLLATE utf8_polish_ci ");
			} else if (Validator.isNotNull(OrderBy) && OrderBy.contains("sibling")) {
				query.append("order by opencps_dictitem.parentItemId, LENGTH(sibling), sibling ");
			} else {
				query.append("order by opencps_dictitem.parentItemId, CONVERT(opencps_dictitem.itemName USING utf8) COLLATE utf8_polish_ci ");
			}
			
					
			SQLQuery q = session.createSQLQuery(query.toString());
			q.setCacheable(false);
			q.addEntity(DictItemImpl.TABLE_NAME, DictItemImpl.class);
			
			log.info("=========findByCollection_Group_Level_OrderBy===" + query.toString() );
			QueryPos qPos = QueryPos.getInstance(q);
			
			
			return (List<DictItem>) QueryUtil.list(q, getDialect(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		} catch (Exception e) {
			log.error(e);
		} finally {
			closeSession(session);
		}
		
		return new ArrayList<DictItem>();
	}
	
	public JSONArray findData(String sql, List<String> columnNames, List<String> dataTypes, Class<?> modelClazz,
			String modelClassName, int start, int end) throws SystemException {

		Session session = null;
		JSONArray results = JSONFactoryUtil.createJSONArray();
		try {
			session = openSession();

			log.info("===>>>>>>>>>>>>> DictItemFinder " + sql + "|" + start + "|" + end);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			if (Validator.isNotNull(modelClassName) && modelClazz != null) {
				q.addEntity(modelClassName, modelClazz);
				List<DictItem> vrProductionPlants = (List<DictItem>) QueryUtil.list(q, getDialect(),
						start, end);
				
				if (vrProductionPlants != null) {
					for (DictItem vrProductionPlant : vrProductionPlants) {
						JSONObject json = ActionUtil.object2Json(vrProductionPlant, DictItemModelImpl.class,
								"");
						results.put(json);
					}
				}
			} else {

				if (columnNames.size() > 1) {
					Iterator<Object[]> itr = (Iterator<Object[]>) QueryUtil.iterate(q, getDialect(), start, end);

					if (itr.hasNext()) {
						while (itr.hasNext()) {
							Object[] objects = itr.next();
							JSONObject json = ActionUtil.array2Json(objects, columnNames, dataTypes);
							results.put(json);
						}

					}
				} else if (columnNames.size() == 1) {
					Iterator itr = QueryUtil.iterate(q, getDialect(), start, end);

					if (itr.hasNext()) {
						while (itr.hasNext()) {

							JSONObject json = JSONFactoryUtil.createJSONObject();
							json.put(columnNames.get(0), itr.next());
							results.put(json);
						}

					}
				}
			}

			return results;
		} catch (Exception e) {
			log.info(e);
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}

	public long countData(String sql) throws SystemException {

		Session session = null;

		try {
			session = openSession();

			log.info("===>>>DictItemFinder " + sql);

			SQLQuery q = session.createSQLQuery(sql);

			q.setCacheable(false);

			q.addScalar("total", Type.LONG);

			Iterator<Long> itr = q.list().iterator();

			if (itr.hasNext()) {
				Long count = itr.next();
				if (count != null) {
					return count.intValue();
				}
			}
			return 0;
		} catch (Exception e) {
			throw new SystemException(e);
		} finally {
			closeSession(session);
		}
	}
	
	
}
