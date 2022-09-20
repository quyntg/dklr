/**
 * 
 */
package org.opencps.kyso.action;

import com.liferay.portal.kernel.json.JSONObject;

/**
 * @author ddung
 *
 */
public interface DigitalSignatureHSMActions {
	public JSONObject createHashSignature(String emailUser, long fileEntryId, String typeSignature, String postStepCode);
}
