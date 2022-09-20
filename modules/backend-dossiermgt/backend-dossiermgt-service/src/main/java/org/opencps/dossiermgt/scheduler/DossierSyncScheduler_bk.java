package org.opencps.dossiermgt.scheduler;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.servlet.HttpMethods;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.opencps.auth.utils.APIDateTimeUtils;
import org.opencps.communication.model.ServerConfig;
import org.opencps.communication.service.ServerConfigLocalServiceUtil;
import org.opencps.dossiermgt.model.DossierSync;
import org.opencps.dossiermgt.service.DossierSyncLocalServiceUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

//@Component(immediate = true, service = DossierSyncScheduler.class)
public class DossierSyncScheduler_bk extends BaseSchedulerEntryMessageListener {

	private static volatile boolean isRunningSync = false;

	@Override
	protected void doReceive(Message message) throws Exception {

		if (!isRunningSync) {
			isRunningSync = true;
		} else {
			return;
		}

			_log.info("OpenCPS SYNC DOSSIERS IS  : " + APIDateTimeUtils.convertDateToString(new Date()));

			Company company = CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setCompanyId(company.getCompanyId());

			InvokeREST rest = new InvokeREST();
			// Get all SERVER NO need to DOSSIER sync to
			HashMap<String, String> properties = new HashMap<String, String>();

			//String serverConfigEndpoint = "serverconfigs";
//			JSONObject resServerConfig = rest.callAPI(0l, HttpMethods.GET, "application/json",
//					RESTFulConfiguration.SERVER_PATH_BASE, serverConfigEndpoint, RESTFulConfiguration.SERVER_USER,
//					RESTFulConfiguration.SERVER_PASS, properties, serviceContext);
			List<ServerConfig> configList = ServerConfigLocalServiceUtil.getServerConfigs(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			for (ServerConfig config : configList) {
			//String dossierSyncEndpoint = "dossiersyncs/server/" + serverNo;

//			JSONObject resDossierSync = rest.callAPI(0l, HttpMethods.GET, "application/json",
//					RESTFulConfiguration.CLIENT_PATH_BASE, dossierSyncEndpoint, RESTFulConfiguration.CLIENT_USER,
//					RESTFulConfiguration.CLIENT_PASS, properties, serviceContext);
				if (Validator.isNotNull(config.getServerNo())) {
					List<DossierSync> dossierSyncList = DossierSyncLocalServiceUtil.fetchByServerNo(config.getServerNo(), QueryUtil.ALL_POS,
							QueryUtil.ALL_POS);
					try {
						for (DossierSync dossierSync : dossierSyncList) {
							long dossierSyncId = dossierSync.getDossierSyncId();
							//call to rest API sync
							String doDossierSyncEnpoint = "dossiersyncs/" + dossierSyncId + "/sending";
							rest.callAPI(config.getGroupId(), HttpMethods.GET, "application/json",
									RESTFulConfiguration.CLIENT_PATH_BASE, doDossierSyncEnpoint,
									RESTFulConfiguration.CLIENT_USER, RESTFulConfiguration.CLIENT_PASS, properties,
									serviceContext);
						}
					} catch (Exception e) {
					}
				}
			}
		
		//List<String> lsServerNo = getListServerNo(resServerConfig);
//		for (String serverNo : lsServerNo) {
//
//			String dossierSyncEndpoint = "dossiersyncs/server/" + serverNo;
//
//			JSONObject resDossierSync = rest.callAPI(0l, HttpMethods.GET, "application/json",
//					RESTFulConfiguration.CLIENT_PATH_BASE, dossierSyncEndpoint, RESTFulConfiguration.CLIENT_USER,
//					RESTFulConfiguration.CLIENT_PASS, properties, serviceContext);
//
//			if (resDossierSync.getInt(RESTFulConfiguration.STATUS) == 200) {
//				
//				_log.info("DOSSIER_SYN_"+resDossierSync);
//
//				JSONObject jsData = JSONFactoryUtil
//						.createJSONObject(resDossierSync.getString(RESTFulConfiguration.MESSAGE));
//
//				JSONArray jsArrayData = JSONFactoryUtil.createJSONArray(jsData.getString("data"));
//
//				// Grouping DossierSync by DossierId and order by SyncMethod
//				Map<Long, SortedMap<Integer, JSONObject>> dossierSyncs = new TreeMap<Long, SortedMap<Integer, JSONObject>>();
//			
//				for (int i = 0; i < jsArrayData.length(); i++) {
//
//					JSONObject object = jsArrayData.getJSONObject(i);
//					long dossierSyncId = GetterUtil.getLong(object.get("dossierSyncId"));
//					int method = GetterUtil.getInteger(object.get("method"));
//					
//					if(dossierSyncs.containsKey(dossierSyncId)){
//						SortedMap<Integer, JSONObject> temp = dossierSyncs.get(dossierSyncId);
//						temp.put(method, object);
//					}else{
//						SortedMap<Integer, JSONObject> temp = new TreeMap<Integer, JSONObject>();
//						temp.put(method, object);
//						dossierSyncs.put(dossierSyncId, temp);
//					}
//				}
//				
//				ArrayList<DossierSyncOrderedModel> origin = DossierSyncUtils.convertToModel(jsArrayData);
//				
//				DossierSyncUtils.orderSync(origin);
//				
//				for (DossierSyncOrderedModel elm : origin) {
//					System.out.println("dossierId_" + elm.getDossierId() + "_method_" + elm.getMethodId());
//					
//					try {
//
//						long dossierSyncId = elm.getDossierSyncId();
//
//						String serverConfigDetail = "serverconfigs/" + serverNo;
//
//						JSONObject resServerDetail = rest.callAPI(0l, HttpMethods.GET, "application/json",
//								RESTFulConfiguration.SERVER_PATH_BASE, serverConfigDetail,
//								RESTFulConfiguration.SERVER_USER, RESTFulConfiguration.SERVER_PASS, properties,
//								serviceContext);
//
//						long serverGroupId = getGroupId(resServerDetail);
//
//						String doDossierSyncEnpoint = "dossiersyncs/" + dossierSyncId + "/sending";
//						
//						//call to rest API sync
//						rest.callAPI(serverGroupId, HttpMethods.GET, "application/json",
//								RESTFulConfiguration.CLIENT_PATH_BASE, doDossierSyncEnpoint,
//								RESTFulConfiguration.CLIENT_USER, RESTFulConfiguration.CLIENT_PASS, properties,
//								serviceContext);
//
//					} catch (Exception e) {
//						//e.printStackTrace();
//						
//						_log.info("Can't Sync DossierSyncId = " + elm.getDossierSyncId());
//					}
//				}
//
//			}
//		}
		isRunningSync = false;
		_log.info("OpenCPS SYNC DOSSIERS HAS BEEN DONE : " + APIDateTimeUtils.convertDateToString(new Date()));

	}

//	private List<String> getListServerNo(JSONObject response) {
//		List<String> lsServer = new ArrayList<>();
//
//		try {
//
//			if (response.getInt(RESTFulConfiguration.STATUS) == 200) {
//
//				JSONObject jsData = JSONFactoryUtil.createJSONObject(response.getString(RESTFulConfiguration.MESSAGE));
//
//				JSONArray jsArrayData = JSONFactoryUtil.createJSONArray(jsData.getString("data"));
//
//				for (int i = 0; i < jsArrayData.length(); i++) {
//					JSONObject elm = jsArrayData.getJSONObject(i);
//
//					if (Validator.isNotNull(elm.getString("serverNo"))) {
//						lsServer.add(elm.getString("serverNo"));
//					}
//				}
//
//			}
//
//		} catch (JSONException e) {
//			e.printStackTrace();
//		}
//
//		return lsServer;
//	}
	
	

//	private long getGroupId(JSONObject response) {
//		long groupId = 0l;
//		try {
//			if (response.getInt(RESTFulConfiguration.STATUS) == 200) {
//				JSONObject jsData = JSONFactoryUtil.createJSONObject(response.getString(RESTFulConfiguration.MESSAGE));
//				groupId = jsData.getLong("groupId");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//
//		return groupId;
//	}

	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(
				TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(), 20, TimeUnit.SECOND));
		_schedulerEngineHelper.register(this, schedulerEntryImpl, DestinationNames.SCHEDULER_DISPATCH);
	}

	@Deactivate
	protected void deactivate() {
		_schedulerEngineHelper.unregister(this);
	}

	@Reference(target = ModuleServiceLifecycle.PORTAL_INITIALIZED, unbind = "-")
	protected void setModuleServiceLifecycle(ModuleServiceLifecycle moduleServiceLifecycle) {
	}

	@Reference(unbind = "-")
	protected void setSchedulerEngineHelper(SchedulerEngineHelper schedulerEngineHelper) {

		_schedulerEngineHelper = schedulerEngineHelper;
	}

	@Reference(unbind = "-")
	protected void setTriggerFactory(TriggerFactory triggerFactory) {
	}

	private SchedulerEngineHelper _schedulerEngineHelper;

	private Log _log = LogFactoryUtil.getLog(DossierSyncScheduler_bk.class);

}
