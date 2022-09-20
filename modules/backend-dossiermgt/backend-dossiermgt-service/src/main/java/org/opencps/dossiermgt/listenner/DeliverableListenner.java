package org.opencps.dossiermgt.listenner;

import org.opencps.dossiermgt.model.Deliverable;
import org.opencps.dossiermgt.service.DeliverableLocalServiceUtil;
import org.opencps.dossiermgt.vr.utils.ResultDeliverableCOPUtils;
import org.opencps.dossiermgt.vr.utils.VRVehicleUpdateUtils;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.ModelListenerException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModelListener;
import com.liferay.portal.kernel.model.ModelListener;

@Component(immediate = true, service = ModelListener.class)
public class DeliverableListenner extends BaseModelListener<Deliverable> {

	private Log _log = LogFactoryUtil.getLog(DeliverableListenner.class.getName());

	@Override
	public void onAfterCreate(Deliverable model) throws ModelListenerException {
		try {
			if (model == null) {
				return;
			}
			_log.info("Deliverable VRBusiness Insert.....");			
			// update VRBusiness here
			String businessTypeCode = model.getDeliverableType();
			int mtCore = 1;
			String businessResult = VRVehicleUpdateUtils.updateVrBusiness(model, mtCore);
			_log.info("====businessTypeCode====" + businessTypeCode + "==businessResult==" + businessResult);
			
			//Process update VR_COP
			//ResultDeliverableCOPUtils.updateVRCOPBusiness(model, mtCore);
			
		} catch (Exception e) {
			_log.error(e);
		}
	
	}

	@Override
	public void onAfterUpdate(Deliverable model) throws ModelListenerException {		
		try {
			if (modelBeforeUpdate == null) {
				return;
			}
			_log.info("Deliverable VRBusiness Update.....");			
			// update VRBusiness here
			String businessTypeCode = model.getDeliverableType();
			int mtCore = 1;
			String businessResult = VRVehicleUpdateUtils.updateVrBusiness(model, mtCore);
			_log.info("====businessTypeCode====" + businessTypeCode + "==businessResult==" + businessResult);
			
			//Process update VR_COP
			//ResultDeliverableCOPUtils.updateVRCOPBusiness(model, mtCore);
			
		} catch (Exception e) {
			_log.error(e);
		}
	}

	@Override
	public void onBeforeUpdate(Deliverable model) throws ModelListenerException {
		try {
			modelBeforeUpdate = DeliverableLocalServiceUtil.getDeliverable(model.getPrimaryKey());
		} catch (Exception e) {
			_log.error(e);
		}
	}

	public static Deliverable modelBeforeUpdate;

}
