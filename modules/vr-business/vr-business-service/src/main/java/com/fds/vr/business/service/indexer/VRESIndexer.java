package com.fds.vr.business.service.indexer;

import com.fds.vr.business.model.VRES;
import com.fds.vr.business.service.VRESLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexWriterHelperUtil;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.filter.BooleanFilter;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.LinkedHashMap;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

public class VRESIndexer extends BaseIndexer<VRES> {

	public static final String CLASS_NAME = VRES.class.getName();

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	public void postProcessSearchQuery(BooleanQuery searchQuery, BooleanFilter fullQueryBooleanFilter,
			SearchContext searchContext) throws Exception {

		@SuppressWarnings("unchecked")
		LinkedHashMap<String, Object> params = (LinkedHashMap<String, Object>) searchContext.getAttribute("params");

		if (params != null) {
			String expandoAttributes = (String) params.get("expandoAttributes");

			if (Validator.isNotNull(expandoAttributes)) {
				addSearchExpando(searchQuery, searchContext, expandoAttributes);
			}
		}
	}

	@Override
	protected void doDelete(VRES object) throws Exception {
		ElasticQueryWrapUtil.DELETE(String.valueOf(object.getId()), object.getCompanyId());
		deleteDocument(object.getCompanyId(), object.getId());
	}

	@Override
	protected Document doGetDocument(VRES object) throws Exception {
		Document document = getBaseModelDocument(CLASS_NAME, object);

		document.addKeywordSortable("id", String.valueOf(object.getId()));
		document.addKeywordSortable(Field.COMPANY_ID, String.valueOf(object.getCompanyId()));
		document.addDateSortable(Field.MODIFIED_DATE, object.getModifiedDate());
		document.addKeywordSortable(Field.USER_ID, String.valueOf(object.getUserId()));
		document.addKeywordSortable(Field.USER_NAME, String.valueOf(object.getUserName()));
		document.addText("data", object.getData());
		
		/*
		JSONObject esData = JSONFactoryUtil.createJSONObject();
		esData.put("id", String.valueOf(object.getId()));
		esData.put("type_es", String.valueOf(object.getType()));
		esData.put(Field.COMPANY_ID, String.valueOf(object.getCompanyId()));
		esData.put(Field.MODIFIED_DATE, object.getModifiedDate());
		esData.put(Field.CREATE_DATE, object.getCreateDate());
		esData.put(Field.USER_ID, String.valueOf(object.getUserId()));
		esData.put(Field.USER_NAME, String.valueOf(object.getUserName()));
		
		if (!"".equals(object.getData())) {
			JSONObject objectData = JSONFactoryUtil.createJSONObject(object.getData());
			
			esData.put("data", objectData);
		}
		
		ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, object.getCompanyId());
		*/
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet, PortletRequest portletRequest,
			PortletResponse portletResponse) {

		Summary summary = createSummary(document);

		summary.setMaxContentLength(QueryUtil.ALL_POS);

		return summary;
	}

	@Override
	protected void doReindex(VRES object) throws Exception {
		Document document = getDocument(object);
		IndexWriterHelperUtil.updateDocument(getSearchEngineId(), object.getCompanyId(), document,
				isCommitImmediately());
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		VRES object = VRESLocalServiceUtil.getVRES(classPK);
		doReindex(object);
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);
		reindexEmployee(companyId);
	}

	protected void reindexEmployee(long companyId) throws PortalException {
		final IndexableActionableDynamicQuery indexableActionableDynamicQuery = VRESLocalServiceUtil
				.getIndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setCompanyId(companyId);
		indexableActionableDynamicQuery
				.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<VRES>() {

					@Override
					public void performAction(VRES object) {
						try {
							Document document = getDocument(object);

							indexableActionableDynamicQuery.addDocuments(document);
						} catch (PortalException pe) {
							if (_log.isWarnEnabled()) {
								_log.warn("Unable to index VRES " + object.getId(), pe);
							}
						}
					}

				});
		indexableActionableDynamicQuery.setSearchEngineId(getSearchEngineId());

		indexableActionableDynamicQuery.performActions();
	}

	private static final Log _log = LogFactoryUtil.getLog(VRESIndexer.class);

}