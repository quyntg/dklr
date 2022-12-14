package org.opencps.dossiermgt.scheduler;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.opencps.dossiermgt.action.DossierActions;
import org.opencps.dossiermgt.action.impl.DossierActionsImpl;
import org.opencps.dossiermgt.action.util.DossierMgtUtils;
import org.opencps.dossiermgt.constants.DossierActionTerm;
import org.opencps.dossiermgt.constants.DossierStatusConstants;
import org.opencps.dossiermgt.constants.DossierTerm;
import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.DossierAction;
import org.opencps.dossiermgt.model.DossierRequestUD;
import org.opencps.dossiermgt.model.PaymentFile;
import org.opencps.dossiermgt.model.ProcessAction;
import org.opencps.dossiermgt.model.ProcessOption;
import org.opencps.dossiermgt.model.ServiceConfig;
import org.opencps.dossiermgt.service.DossierActionLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.DossierRequestUDLocalServiceUtil;
import org.opencps.dossiermgt.service.PaymentFileLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessActionLocalServiceUtil;
import org.opencps.dossiermgt.service.ProcessOptionLocalServiceUtil;
import org.opencps.dossiermgt.service.ServiceConfigLocalServiceUtil;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.BaseSchedulerEntryMessageListener;
import com.liferay.portal.kernel.messaging.DestinationNames;
import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.module.framework.ModuleServiceLifecycle;
import com.liferay.portal.kernel.scheduler.SchedulerEngineHelper;
import com.liferay.portal.kernel.scheduler.TimeUnit;
import com.liferay.portal.kernel.scheduler.TriggerFactory;
import com.liferay.portal.kernel.scheduler.TriggerFactoryUtil;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

@Component(immediate = true, service = TimerScheduler.class)
public class TimerScheduler extends BaseSchedulerEntryMessageListener {
	private static volatile boolean isRunningTime = false;

	@Override
	protected void doReceive(Message message) {
		if (!isRunningTime) {
			isRunningTime = true;
		} else {
			return;
		}

		try{
			// TODO Auto-generated method stub
			_log.info("Invoke Timer****");
			// get all actions that has preCondition is "timer"
	
			// Get all dossier
			List<Dossier> allDossierTimer = new ArrayList<Dossier>();
	
			Company company = CompanyLocalServiceUtil.getCompanyByMx(PropsUtil.get(PropsKeys.COMPANY_DEFAULT_WEB_ID));
	
			// This is TEMPORARY code for auto = timer, it need to optimize later
			allDossierTimer = DossierLocalServiceUtil.findDossierByRequestStatus("3",QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
			DossierActions dossierActions = new DossierActionsImpl();
	
			User systemUser = UserLocalServiceUtil.getUserByEmailAddress(company.getCompanyId(),
					RESTFulConfiguration.SERVER_USER);
	
			ServiceContext serviceContext = new ServiceContext();
			serviceContext.setCompanyId(company.getCompanyId());
			serviceContext.setUserId(systemUser.getUserId());
	
			LinkedHashMap<String, Object> params = new LinkedHashMap<String, Object>();
	
			//Sort[] sorts = new Sort[] { SortFactoryUtil.create("_sortable", Sort.STRING_TYPE, false) };
			//_log.info("======== allDossierTimer" +allDossierTimer.size());
			for (Dossier dossier : allDossierTimer) {
				params.put(Field.GROUP_ID, String.valueOf(dossier.getGroupId()));
				params.put(DossierTerm.DOSSIER_ID, String.valueOf(dossier.getDossierId()));
				params.put(DossierTerm.REFERENCE_UID, String.valueOf(dossier.getReferenceUid()));
				params.put(DossierActionTerm.AUTO, "timmer");
	
				if (Validator.isNotNull(dossier.getDossierStatus()) && (dossier.getCancellingDate()!= null ||
						dossier.getCorrecttingDate()!= null || dossier.getEndorsementDate()!= null || DossierStatusConstants.PAYING.equals(dossier.getDossierStatus()))) {
	
					long dossierActionId = dossier.getDossierActionId();
	
					DossierAction dossierAction = DossierActionLocalServiceUtil.fetchDossierAction(dossierActionId);
	
					long serviceProcessId = dossierAction != null ? dossierAction.getServiceProcessId() : 0;
	
					String stepCode = dossierAction != null ? dossierAction.getStepCode() : StringPool.BLANK;
	
					if (dossierAction != null) {
						serviceContext.setUserId(dossierAction.getUserId());
					}
					//boolean pending = dossierAction != null ? dossierAction.getPending() : false;
	
					List<ProcessAction> lstProcessAction = new ArrayList<ProcessAction>();
	
					lstProcessAction = ProcessActionLocalServiceUtil.getProcessActionByG_SPID_PRESC(dossier.getGroupId(),
							serviceProcessId, stepCode);
					/*
					 * _log.info("===========> dossier.getGroupId() :" +dossier.getGroupId()
					 * +"====== serviceProcessId "+serviceProcessId
					 * +"============ stepCode:"+stepCode
					 * +"======dossier.getDossierActionId()="+dossier.getDossierActionId()+
					 * "========");
					 */
					//TODO : test case auto event
					DossierRequestUD dRegUD = DossierRequestUDLocalServiceUtil
							.getDossierRequestByDossierId(dossier.getDossierId());
	
					boolean flag = false;
					if (dRegUD != null && dRegUD.getStatusReg() == 3) {
						for (ProcessAction processAction : lstProcessAction) {
							String serviceCode = dossier.getServiceCode();
							String govAgencyCode = dossier.getGovAgencyCode();
							String dossierTempNo = dossier.getDossierTemplateNo();
							ProcessOption option = null;
							ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(dossier.getGroupId(), 
									serviceCode, govAgencyCode);
							if (config != null) {
								option = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(dossier.getGroupId(), 
										dossierTempNo,
										config.getServiceConfigId());
							}
	
							if (processAction.getAutoEvent().contains("timmer")) {
								
								String perConditionStr = processAction.getPreCondition();
	
								boolean checkPreCondition = DossierMgtUtils
										.checkPreCondition(StringUtil.split(perConditionStr, StringPool.COMMA), dossier);
	
								// do action
	
								String userActionName = _getUserActionName(perConditionStr, dossier.getDossierId(),
										systemUser.getFullName());
	
								// String subUsers = StringPool.BLANK;
								if (checkPreCondition) {
									
									flag = true;
	
									dossierActions.doAction(dossier.getGroupId(), dossier, option, processAction,
											processAction.getActionCode(), userActionName, StringPool.BLANK,
											processAction.getAssignUserId(), systemUser.getUserId(), StringPool.BLANK,
											StringPool.BLANK, serviceContext);
								}
							}
							if (flag) {
								break;
							}
						}
					} else {
						for (ProcessAction processAction : lstProcessAction) {
							String serviceCode = dossier.getServiceCode();
							String govAgencyCode = dossier.getGovAgencyCode();
							String dossierTempNo = dossier.getDossierTemplateNo();
							ProcessOption option = null;
							ServiceConfig config = ServiceConfigLocalServiceUtil.getBySICodeAndGAC(dossier.getGroupId(), 
									serviceCode, govAgencyCode);
							if (config != null) {
								option = ProcessOptionLocalServiceUtil.getByDTPLNoAndServiceCF(dossier.getGroupId(), 
										dossierTempNo,
										config.getServiceConfigId());
							}
							if (processAction.getAutoEvent().contains("timmer")) {
								
								String perConditionStr = processAction.getPreCondition();
	
								boolean checkPreCondition = DossierMgtUtils
										.checkPreCondition(StringUtil.split(perConditionStr, StringPool.COMMA), dossier);
	
								// do action

								String userActionName = _getUserActionName(perConditionStr, dossier.getDossierId(),
										systemUser.getFullName());
	
								// String subUsers = StringPool.BLANK;
								//_log.info("=====perConditionStr: "+perConditionStr);
								//_log.info("=====checkPreCondition: "+checkPreCondition);
								if (checkPreCondition && perConditionStr.contains("payok")) {
									
									_log.info("payok$$$$$dossierId_"+dossier.getDossierId() + "autoEvent_" + processAction.getAutoEvent());
	
									flag = true;
	
									dossierActions.doAction(dossier.getGroupId(), dossier, option, processAction,
											processAction.getActionCode(), userActionName, processAction.getActionName(),
											processAction.getAssignUserId(), systemUser.getUserId(), StringPool.BLANK,
											StringPool.BLANK, serviceContext);
								}
							}
							
							if (flag) {
								break;
							}
						}
					}
//					if (dRegUD != null && dRegUD.getStatusReg() == 3){
//						_log.info("======> lan 2 DossierRequestId "+ dRegUD.getDossierRequestId());
//						DossierRequestUDLocalServiceUtil.deleteDossierRequestUD(dRegUD.getDossierRequestId());
//					}
				}
			}
		} catch (Exception e) {
			_log.error(e);
		}

		isRunningTime = false;


	}

	private String _getUserActionName(String perConditionStr, long dossierId, String defaultName) {
		String userActionName = StringPool.BLANK;

		List<PaymentFile> paymentFiles = PaymentFileLocalServiceUtil.getByDossierId(dossierId);

		if (paymentFiles.size() > 0) {
			PaymentFile paymentFile = paymentFiles.get(0);

			long userId = paymentFile.getUserId();

			try {
				userActionName = UserLocalServiceUtil.getUser(userId).getFullName();
			} catch (Exception e) {
				_log.info("DEFAULT_NAME");

				userActionName = defaultName;
			}
		}

		return userActionName;
	}

	@Activate
	@Modified
	protected void activate() {
		schedulerEntryImpl.setTrigger(
				TriggerFactoryUtil.createTrigger(getEventListenerClass(), getEventListenerClass(), 30, TimeUnit.SECOND));
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

	private Log _log = LogFactoryUtil.getLog(TimerScheduler.class);

}
