package frontend.web.dossier.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.WindowStateException;
import javax.servlet.http.HttpServletRequest;

import org.opencps.auth.api.exception.UnauthenticationException;
import org.opencps.auth.api.exception.UnauthorizationException;
import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.communication.model.ServerConfig;
import org.opencps.communication.service.ServerConfigLocalServiceUtil;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.synchronization.action.DictCollectionTempInterface;
import org.opencps.synchronization.action.impl.DictCollectionActions;
import org.opencps.synchronization.constants.DataMGTTempConstants;
import org.opencps.synchronization.constants.DictCollectionTempTerm;
import org.opencps.synchronization.constants.DictGroupTempTerm;
import org.opencps.synchronization.constants.DictItemGroupTempTerm;
import org.opencps.synchronization.constants.DictItemTempTerm;
import org.opencps.synchronization.constants.SyncServerTerm;
import org.opencps.synchronization.model.DictCollectionTemp;
import org.opencps.synchronization.model.DictGroupTemp;
import org.opencps.synchronization.model.DictItemGroupTemp;
import org.opencps.synchronization.model.DictItemTemp;
import org.opencps.synchronization.service.DictCollectionTempLocalServiceUtil;
import org.opencps.synchronization.service.DictGroupTempLocalServiceUtil;
import org.opencps.synchronization.service.DictItemGroupTempLocalServiceUtil;
import org.opencps.synchronization.service.DictItemTempLocalServiceUtil;
import org.opencps.synchronization.service.SyncQueueLocalServiceUtil;
import org.opencps.synchronization.service.impl.DictItemTempLocalServiceImpl;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;
import org.opencps.usermgt.utils.DateTimeUtils;
import org.osgi.service.component.annotations.Component;

import com.liferay.asset.kernel.exception.DuplicateCategoryException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.freemarker.FreeMarkerPortlet;

/**
 * @author binhth
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=frontend-web-dossier Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/templates/view.ftl",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.header-portlet-javascript=/js/config.js",
		"com.liferay.portlet.footer-portlet-javascript=/js/main2.js",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FrontendWebDossierPortlet extends FreeMarkerPortlet {

	@Override
	public void render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		// TODO Auto-generated method stub
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(renderRequest);
		
		
		String dossierId = PortalUtil.getOriginalServletRequest(httpRequest).getParameter("dossierId");
		
		try {
			Employee employee = EmployeeLocalServiceUtil.fetchByF_mappingUserId(themeDisplay.getScopeGroupId(), themeDisplay.getUserId());
			String employeeStr = JSONFactoryUtil.looseSerialize(employee);
			JSONObject employeeStrObj = JSONFactoryUtil.createJSONObject(employeeStr);
			if (employeeStrObj != null) {
				renderRequest.setAttribute("employee", employeeStrObj);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			_log.info(e.getMessage());
		}
		
		try {
			Dossier dossier = DossierLocalServiceUtil.getDossier(Long.parseLong(dossierId));
			String dossierStr = JSONFactoryUtil.looseSerialize(dossier);
			JSONObject dossierObj = JSONFactoryUtil.createJSONObject(dossierStr);
			if (dossierObj != null) {
				renderRequest.setAttribute("dossier", dossierObj);
			}

		} catch (Exception e) {
			// TODO: handle exception
			_log.info(e.getMessage());
		}

		
		String dossierPartNo = PortalUtil.getOriginalServletRequest(httpRequest).getParameter("dossierPartNo");
		String stateWindow = PortalUtil.getOriginalServletRequest(httpRequest).getParameter("stateWindow");
		
		_log.info("dossier============"+dossierId);
		_log.info("dossierPartNo============"+dossierPartNo);
		_log.info("stateWindow============"+stateWindow);
		try {
			_log.info("themeDisplay.getScopeGroup().getFriendlyURL()============"+ themeDisplay.getUser().getSiteGroups().get(0).getFriendlyURL());
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PortletURL resourceUrl =  PortletURLFactoryUtil.create(renderRequest, PortalUtil.getPortletId(renderRequest), themeDisplay.getPlid(), PortletRequest.RESOURCE_PHASE);
		_log.info("resourceUrl++++++++++++++++++" + resourceUrl);
		
		renderRequest.setAttribute("getDictGroupURL", resourceUrl.toString());
		renderRequest.setAttribute("ajax", generateURLJsonObject(renderResponse));
		renderRequest.setAttribute("portletNamespace", themeDisplay.getPortletDisplay().getNamespace());
		renderRequest.setAttribute("dossierId", dossierId);
		renderRequest.setAttribute("dossierPartNo", dossierPartNo);
		renderRequest.setAttribute("stateWindow", stateWindow);
		super.render(renderRequest, renderResponse);
		
	}
	
	public void getListDictGroupByDictItem(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {
			
			long dictItemId = ParamUtil.getLong(actionRequest, "dictItemId", 0);
			
			ServiceContext serviceContext =	ServiceContextFactory.getInstance(actionRequest);
			DictItemTemp dictItem = DictItemTempLocalServiceUtil.getDictItemTemp(dictItemId);
			
			List<String> result = new ArrayList<String>();
			LinkedHashMap<String, Object> params =
				new LinkedHashMap<String, Object>();
			DictCollectionTempInterface dictItemDataUtil = new DictCollectionActions();
			params.put("groupId", String.valueOf(dictItem.getGroupId()));
			params.put(
				DictItemGroupTempTerm.DICT_ITEM_ID,
				String.valueOf(dictItem.getDictItemId()));

			JSONObject jsonData = dictItemDataUtil.getDictItemsGroupTemp(
				dictItem.getUserId(), dictItem.getCompanyId(),
				dictItem.getGroupId(), params, new Sort[] {}, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, serviceContext);

			try {

				// TODO template commented
				// @SuppressWarnings("unchecked")
				List<Document> listResults = (List<Document>) jsonData.get("data");

				writeJSON(actionRequest, actionResponse, listResults.get(0).get(DictItemGroupTempTerm.GROUP_CODE).toString());
				
//				for (Document document : listResults) {
//
//					result.add(document.get(DictItemGroupTempTerm.GROUP_CODE).toString());
//
//				}

			}
			catch (Exception e) {

				_log.error(e);
			} finally {
				// writeJSON(actionRequest, actionResponse, "");
			}
			
			_log.info("Dict_GROUP =====================>"+String.join(",", result));

		}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		_log.info("serveResource++++++++++++++++++++++++++");
		try {
			long dictItemId = ParamUtil.getLong(resourceRequest, "dictItemId", 0);
			_log.info("dictItemId++++++++++++++++++++++++++" + dictItemId);
			ServiceContext serviceContext =	ServiceContextFactory.getInstance(resourceRequest);
			DictItemTemp dictItem = DictItemTempLocalServiceUtil.getDictItemTemp(dictItemId);
			
			JSONObject result = JSONFactoryUtil.createJSONObject();
			LinkedHashMap<String, Object> params =
				new LinkedHashMap<String, Object>();
			DictCollectionTempInterface dictItemDataUtil = new DictCollectionActions();
			params.put("groupId", String.valueOf(dictItem.getGroupId()));
			params.put(
				DictItemGroupTempTerm.DICT_ITEM_ID,
				String.valueOf(dictItem.getDictItemId()));

			JSONObject jsonData = dictItemDataUtil.getDictItemsGroupTemp(
				dictItem.getUserId(), dictItem.getCompanyId(),
				dictItem.getGroupId(), params, new Sort[] {}, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, serviceContext);

			try {

				// TODO template commented
				// @SuppressWarnings("unchecked")
				List<Document> listResults = (List<Document>) jsonData.get("data");
				result.put("groupCode", listResults.get(0).get(DictItemGroupTempTerm.GROUP_CODE).toString());
				writeJSON(resourceRequest, resourceResponse, result);
				
//				for (Document document : listResults) {
//
//					result.add(document.get(DictItemGroupTempTerm.GROUP_CODE).toString());
//
//				}

			}
			catch (Exception e) {

				_log.error(e);
			} finally {
				writeJSON(resourceRequest, resourceResponse, result);
			}
			super.serveResource(resourceRequest, resourceResponse);
		} catch (Exception e) {
			// TODO: handle exception
			throw new PortletException((Throwable) e);
		}
	}
	
	private JSONObject generateURLJsonObject(RenderResponse renderResponse) throws WindowStateException {

		JSONObject urlObject = JSONFactoryUtil.createJSONObject();

		PortletURL saveDictItemURL = renderResponse.createActionURL();

		saveDictItemURL.setParameter(
			ActionRequest.ACTION_NAME, "saveDictItem");
		saveDictItemURL.setWindowState(LiferayWindowState.EXCLUSIVE);

		urlObject.put("saveDictItemURL", saveDictItemURL);
		
		PortletURL getDictGroupURL = renderResponse.createActionURL();

		getDictGroupURL.setParameter(
			ActionRequest.ACTION_NAME, "getListDictGroupByDictItem");
		getDictGroupURL.setWindowState(LiferayWindowState.EXCLUSIVE);

		urlObject.put("getDictGroupURL", getDictGroupURL);
		return urlObject;
	}
	
	public void saveDictItem(
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException {
			_log.info("LUU CSSX NUOC NGOAI!!!!!!!!");
			ThemeDisplay themeDisplay =
				(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

			long groupId = themeDisplay.getScopeGroupId();

			long userId = themeDisplay.getUserId();

			String itemCode = ParamUtil.getString(actionRequest, "itemCode");
			String itemName = ParamUtil.getString(actionRequest, "itemName");
			String itemNameEN = ParamUtil.getString(actionRequest, "itemNameEN");
			String itemCodeOld = ParamUtil.getString(actionRequest, "itemCodeOld");
			String collectionCode =
				ParamUtil.getString(actionRequest, "collectionCode");
			String itemDescription =
				ParamUtil.getString(actionRequest, "itemDescription");
			String sibling = ParamUtil.getString(actionRequest, "sibling");
			String parentItemCode =
				ParamUtil.getString(actionRequest, "parentItemCode");
			String groupCodes = ParamUtil.getString(actionRequest, "groupCode");

			String metaData = ParamUtil.getString(actionRequest, "metaData");

			DictCollectionTempInterface dictCollectionActions =
				new DictCollectionActions();

			JSONObject result = JSONFactoryUtil.createJSONObject();
			
			try {
				ServiceContext serviceContext =
					ServiceContextFactory.getInstance(actionRequest);

				DictItemTemp dictItem = null;
				List<ServerConfig> lstServers = ServerConfigLocalServiceUtil.getServerConfigs(QueryUtil.ALL_POS,
						QueryUtil.ALL_POS);

				if (Validator.isNotNull(itemCodeOld)) {
					String oldMetaData = null;
					DictItemTemp oldDictItem = dictCollectionActions.getDictItemTempByItemCode(collectionCode, itemCodeOld, groupId, serviceContext);
					
					dictItem = dictCollectionActions.updateDictItemTempByItemCode(
						userId, groupId, serviceContext, collectionCode,
						itemCodeOld, itemCode, itemName, itemNameEN,
						itemDescription, String.valueOf(sibling), parentItemCode, DataMGTTempConstants.DATA_STATUS_ACTIVE);
					
					try {
						for (ServerConfig sc : lstServers) {
							String configs = sc.getConfigs();
							if (Validator.isNotNull(configs)) {
								try {
									JSONObject configObj = JSONFactoryUtil.createJSONObject(configs);
									if (configObj.has(SyncServerTerm.SERVER_TYPE)
											&& configObj.getString(SyncServerTerm.SERVER_TYPE)
													.equals(SyncServerTerm.SYNC_SERVER_TYPE)
											&& configObj.has(SyncServerTerm.SERVER_USERNAME)
											&& configObj.has(SyncServerTerm.SERVER_PASSWORD)
											&& configObj.has(SyncServerTerm.SERVER_URL)
											&& (configObj.has(SyncServerTerm.PUSH)
													&& configObj.getBoolean(SyncServerTerm.PUSH))) {
										if (groupId == sc.getGroupId()) {
											JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
											jsonObject.put("old", convertObject(oldDictItem));
											jsonObject.put("new", convertObject(dictItem));
											
											SyncQueueLocalServiceUtil.addBusinessSyncQueue(userId, groupId, sc.getServerNo(), DictItemTemp.class.getName(), jsonObject.toJSONString(), SyncServerTerm.QUEUE_STATUS_NEW, 0, SyncServerTerm.PRIORITY_LOW, SyncServerTerm.METHOD_UPDATE, serviceContext);
										}
									}
								} catch (Exception e) {
									_log.error(e);
								}
							}
						}
					} catch (Exception e) {
						_log.error(e);
					}							

					oldMetaData = dictItem.getMetaData();
					
					String newMetaData = null;
					oldDictItem = dictItem;
					
					dictItem = dictCollectionActions.updateMetaDataByItemCode(
						userId, groupId, serviceContext, collectionCode,
						itemCode, metaData);
				
					newMetaData = dictItem.getMetaData();
					
					if (newMetaData != null && !newMetaData.equals(oldMetaData)) {
						try {
							for (ServerConfig sc : lstServers) {
								String configs = sc.getConfigs();
								if (Validator.isNotNull(configs)) {
									try {
										JSONObject configObj = JSONFactoryUtil.createJSONObject(configs);
										if (configObj.has(SyncServerTerm.SERVER_TYPE)
												&& configObj.getString(SyncServerTerm.SERVER_TYPE)
														.equals(SyncServerTerm.SYNC_SERVER_TYPE)
												&& configObj.has(SyncServerTerm.SERVER_USERNAME)
												&& configObj.has(SyncServerTerm.SERVER_PASSWORD)
												&& configObj.has(SyncServerTerm.SERVER_URL)
												&& (configObj.has(SyncServerTerm.PUSH)
														&& configObj.getBoolean(SyncServerTerm.PUSH))) {
											if (groupId == sc.getGroupId()) {
												JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
												jsonObject.put("old", convertObject(oldDictItem));
												jsonObject.put("new", convertObject(dictItem));
												
												SyncQueueLocalServiceUtil.addBusinessSyncQueue(userId, groupId, sc.getServerNo(), DictItemTemp.class.getName(), jsonObject.toJSONString(), SyncServerTerm.QUEUE_STATUS_NEW, 0, SyncServerTerm.PRIORITY_LOW, SyncServerTerm.METHOD_UPDATE_METADATA, serviceContext);
											}
										}
									} catch (Exception e) {
										_log.error(e);
									}
								}
							}
						} catch (Exception e) {
							_log.error(e);
						}							
					}
					else {
						
					}
				}
				else {
					dictItem = dictCollectionActions.addDictItemsTemp(
						userId, groupId, collectionCode, parentItemCode, itemCode,
						itemName, itemNameEN, itemDescription,
						String.valueOf(sibling), 0, metaData, DataMGTTempConstants.DATA_STATUS_ACTIVE, serviceContext);
					
					try {
						for (ServerConfig sc : lstServers) {
							String configs = sc.getConfigs();
							if (Validator.isNotNull(configs)) {
								try {
									JSONObject configObj = JSONFactoryUtil.createJSONObject(configs);
									if (configObj.has(SyncServerTerm.SERVER_TYPE)
											&& configObj.getString(SyncServerTerm.SERVER_TYPE)
													.equals(SyncServerTerm.SYNC_SERVER_TYPE)
											&& configObj.has(SyncServerTerm.SERVER_USERNAME)
											&& configObj.has(SyncServerTerm.SERVER_PASSWORD)
											&& configObj.has(SyncServerTerm.SERVER_URL)
											&& (configObj.has(SyncServerTerm.PUSH)
													&& configObj.getBoolean(SyncServerTerm.PUSH))) {
										if (groupId == sc.getGroupId()) {
											JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
											jsonObject.put("new", convertObject(dictItem));
											
											SyncQueueLocalServiceUtil.addBusinessSyncQueue(userId, groupId, sc.getServerNo(), DictItemTemp.class.getName(), jsonObject.toJSONString(), SyncServerTerm.QUEUE_STATUS_NEW, 0, SyncServerTerm.PRIORITY_LOW, SyncServerTerm.METHOD_CREATE, serviceContext);
										}
									}
								} catch (Exception e) {
									_log.error(e);
								}
							}
						}
					} catch (Exception e) {
						_log.error(e);
					}		
				}

			List<DictItemGroupTemp> lstItemGroups = DictItemGroupTempLocalServiceUtil.findByDictItemTemp(groupId, dictItem.getDictItemId(), QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			List<String> oldItemGroups = new ArrayList<>();
			for (DictItemGroupTemp t : lstItemGroups) {
				try {
					DictGroupTemp groupTemp = DictGroupTempLocalServiceUtil.fetchDictGroupTemp(t.getDictGroupId());
					oldItemGroups.add(groupTemp.getGroupCode());
				}
				catch (Exception e) {
					
				}
			}

			groupCodes = dictCollectionActions.updateBusiessDictItemGroupTemp(userId, groupId, dictItem.getDictItemId(),
					groupCodes, collectionCode, serviceContext);
			List<String> newItemGroups = Arrays.asList(StringUtil.split(groupCodes));
							
			for (String groupCode : oldItemGroups) {
				if (!newItemGroups.contains(groupCode)) {
					try {
						for (ServerConfig sc : lstServers) {
							String configs = sc.getConfigs();
							if (Validator.isNotNull(configs)) {
								try {
									JSONObject configObj = JSONFactoryUtil.createJSONObject(configs);
									if (configObj.has(SyncServerTerm.SERVER_TYPE)
											&& configObj.getString(SyncServerTerm.SERVER_TYPE)
													.equals(SyncServerTerm.SYNC_SERVER_TYPE)
											&& configObj.has(SyncServerTerm.SERVER_USERNAME)
											&& configObj.has(SyncServerTerm.SERVER_PASSWORD)
											&& configObj.has(SyncServerTerm.SERVER_URL)
											&& (configObj.has(SyncServerTerm.PUSH)
													&& configObj.getBoolean(SyncServerTerm.PUSH))) {
										if (groupId == sc.getGroupId()) {
											JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
											JSONObject itemGroupObj = JSONFactoryUtil.createJSONObject();
											itemGroupObj.put(DictCollectionTempTerm.COLLECTION_CODE, collectionCode);
											itemGroupObj.put(DictGroupTempTerm.GROUP_CODE, groupCode);
											itemGroupObj.put(DictItemTempTerm.ITEM_CODE, dictItem.getItemCode());
											
											jsonObject.put("new", itemGroupObj);
											
											SyncQueueLocalServiceUtil.addBusinessSyncQueue(userId, groupId, sc.getServerNo(), DictItemGroupTemp.class.getName(), jsonObject.toJSONString(), SyncServerTerm.QUEUE_STATUS_NEW, 0, SyncServerTerm.PRIORITY_LOWEST, SyncServerTerm.METHOD_REMOVE_FROM_GROUP, serviceContext);
										}
									}
								} catch (Exception e) {
									_log.error(e);
								}
							}
						}
					} catch (Exception e) {
						_log.error(e);
					}															
				}
			}
			
			for (String groupCode : newItemGroups) {
				if (!oldItemGroups.contains(groupCode)) {
					try {
						for (ServerConfig sc : lstServers) {
							String configs = sc.getConfigs();
							if (Validator.isNotNull(configs)) {
								try {
									JSONObject configObj = JSONFactoryUtil.createJSONObject(configs);
									if (configObj.has(SyncServerTerm.SERVER_TYPE)
											&& configObj.getString(SyncServerTerm.SERVER_TYPE)
													.equals(SyncServerTerm.SYNC_SERVER_TYPE)
											&& configObj.has(SyncServerTerm.SERVER_USERNAME)
											&& configObj.has(SyncServerTerm.SERVER_PASSWORD)
											&& configObj.has(SyncServerTerm.SERVER_URL)
											&& (configObj.has(SyncServerTerm.PUSH)
													&& configObj.getBoolean(SyncServerTerm.PUSH))) {
										if (groupId == sc.getGroupId()) {
											JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
											JSONObject itemGroupObj = JSONFactoryUtil.createJSONObject();
											itemGroupObj.put(DictCollectionTempTerm.COLLECTION_CODE, collectionCode);
											itemGroupObj.put(DictGroupTempTerm.GROUP_CODE, groupCode);
											itemGroupObj.put(DictItemTempTerm.ITEM_CODE, dictItem.getItemCode());
											
											jsonObject.put("new", itemGroupObj);
											
											SyncQueueLocalServiceUtil.addBusinessSyncQueue(userId, groupId, sc.getServerNo(), DictItemGroupTemp.class.getName(), jsonObject.toJSONString(), SyncServerTerm.QUEUE_STATUS_NEW, 0, SyncServerTerm.PRIORITY_LOWEST, SyncServerTerm.METHOD_ADD_TO_GROUP, serviceContext);
										}
									}
								} catch (Exception e) {
									_log.error(e);
								}
							}
						}
					} catch (Exception e) {
						_log.error(e);
					}															
				}
			}
				
			result.put(
					"createDate", DateTimeUtils.convertDateToString(
						dictItem.getCreateDate(), DateTimeUtils._TIMESTAMP));
				result.put(
					"modifiedDate", DateTimeUtils.convertDateToString(
						dictItem.getModifiedDate(), DateTimeUtils._TIMESTAMP));
				result.put("itemCode", dictItem.getItemCode());
				result.put(
					"itemName", Validator.isNotNull(dictItem.getItemName())
						? dictItem.getItemName() : StringPool.BLANK);
				result.put(
					"itemNameEN", Validator.isNotNull(dictItem.getItemNameEN())
						? dictItem.getItemNameEN() : StringPool.BLANK);
				result.put("itemDescription", dictItem.getItemDescription());
				result.put("parentItem", dictItem.getParentItemId());
				result.put("level", dictItem.getLevel());
				result.put("sibling", dictItem.getSibling());
				result.put("treeIndex", dictItem.getTreeIndex());
				result.put("dictItemId", dictItem.getDictItemId());
				result.put("groupCode", groupCodes);

			}
			catch (Exception e) {
				_log.error(e);
				if (e instanceof UnauthenticationException) {

					result.put("statusCode", 401);

				}

				if (e instanceof UnauthorizationException) {

					result.put("statusCode", 403);

				}

				if (e instanceof NoSuchUserException) {

					result.put("statusCode", 401);

				}

				if (e instanceof DuplicateCategoryException) {

					result.put("statusCode", 409);

				}
				result.put("msg", "error");
			}
			finally {
				writeJSON(actionRequest, actionResponse, result);
			}

		}
	
	public static JSONObject convertObject(Object o) {
		JSONObject result = JSONFactoryUtil.createJSONObject();
		
		if (o instanceof DictCollectionTemp) {
			DictCollectionTemp dictCollection = (DictCollectionTemp)o;
			result.put(DictCollectionTempTerm.MODIFIED_DATE, APIDateTimeUtils.convertDateToString(dictCollection.getModifiedDate(), APIDateTimeUtils._TIMESTAMP));
			result.put(DictCollectionTempTerm.COLLECTION_CODE, dictCollection.getCollectionCode());
			result.put(DictCollectionTempTerm.COLLECTION_NAME, dictCollection.getCollectionName());
			result.put(DictCollectionTempTerm.COLLECTION_NAME_EN, dictCollection.getCollectionNameEN());
			result.put(DictCollectionTempTerm.DESCRIPTION, dictCollection.getDescription());
			result.put(DictCollectionTempTerm.DATAFORM, dictCollection.getDataForm());
		}
		else if (o instanceof DictGroupTemp) {
			DictGroupTemp dictGroup = (DictGroupTemp)o;
			result.put(DictGroupTempTerm.MODIFIED_DATE, APIDateTimeUtils.convertDateToString(dictGroup.getModifiedDate(), APIDateTimeUtils._TIMESTAMP));
			result.put(DictGroupTempTerm.GROUP_CODE, dictGroup.getGroupCode());
			result.put(DictGroupTempTerm.GROUP_NAME, dictGroup.getGroupName());
			result.put(DictGroupTempTerm.GROUP_NAME_EN, dictGroup.getGroupNameEN());
			result.put(DictGroupTempTerm.GROUP_DESCRIPTION, dictGroup.getGroupDescription());
			try {
				DictCollectionTemp dictCollection = DictCollectionTempLocalServiceUtil.fetchDictCollectionTemp(dictGroup.getDictCollectionId());
				result.put(DictCollectionTempTerm.COLLECTION_CODE, dictCollection.getCollectionCode());
			}
			catch (Exception e) {
				
			}
		}
		else if (o instanceof DictItemTemp) {
			DictItemTemp dictItem = (DictItemTemp)o;
			
			result.put(DictItemTempTerm.MODIFIED_DATE, APIDateTimeUtils.convertDateToString(dictItem.getModifiedDate(), APIDateTimeUtils._TIMESTAMP));
			result.put(DictItemTempTerm.ITEM_CODE, dictItem.getItemCode());
			result.put(DictItemTempTerm.ITEM_NAME, dictItem.getItemName());
			result.put(DictItemTempTerm.ITEM_NAME_EN, dictItem.getItemNameEN());
			result.put(DictItemTempTerm.ITEM_DESCRIPTION, dictItem.getItemDescription());
			result.put(DictItemTempTerm.META_DATA, dictItem.getMetaData());
			result.put(DictItemTempTerm.SIBLING, dictItem.getSibling());
			result.put(DictItemTempTerm.LEVEL, dictItem.getLevel());
			
			try {
				DictCollectionTemp dictCollection = DictCollectionTempLocalServiceUtil.fetchDictCollectionTemp(dictItem.getDictCollectionId());
				result.put(DictCollectionTempTerm.COLLECTION_CODE, dictCollection.getCollectionCode());
			}
			catch (Exception e) {
				
			}			
			try {
				DictItemTemp parentItem = DictItemTempLocalServiceUtil.fetchDictItemTemp(dictItem.getParentItemId());
				result.put(DictItemTempTerm.PARENT_ITEM_CODE, parentItem.getItemCode());
			}
			catch (Exception e) {
				
			}			
		}
		
		return result;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(FrontendWebDossierPortlet.class);
	
}