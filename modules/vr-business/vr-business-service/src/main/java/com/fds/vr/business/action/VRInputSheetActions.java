/**
 * 
 */
package com.fds.vr.business.action;

import com.fds.vr.business.model.VRInputSheet;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Company;

/**
 * @author ddung
 *
 */
public interface VRInputSheetActions {
	public void indexing(VRInputSheet vrInputSheet, Company company) throws SystemException, PortalException;
}
