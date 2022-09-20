package frontend.web.tracuu.portlet;

import frontend.web.tracuu.constants.FrontendWebTracuuPortletKeys;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.freemarker.FreeMarkerPortlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.WindowStateException;
import javax.servlet.http.HttpServletRequest;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.dossiermgt.model.Registration;
import org.opencps.dossiermgt.service.DossierLocalServiceUtil;
import org.opencps.dossiermgt.service.RegistrationLocalServiceUtil;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.service.util.UserMgtUtils;
import org.osgi.service.component.annotations.Component;

/**
 * @author hoang
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.css-class-wrapper=portlet-freemarker",
		"com.liferay.portlet.display-category=category.tracuu",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/templates/tra_cuu_main.ftl",
		"javax.portlet.name=" + FrontendWebTracuuPortletKeys.FrontendWebTracuu,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FrontendWebTracuuPortlet extends FreeMarkerPortlet {

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		HttpServletRequest request = PortalUtil.getHttpServletRequest(renderRequest);

		HttpServletRequest oRequest = PortalUtil.getOriginalServletRequest(request);

		Applicant applicant = UserMgtUtils.getApplicant(themeDisplay.getUser().getEmailAddress());

		JSONObject applicantObj = JSONFactoryUtil.createJSONObject();
		String jsonObj = JSONFactoryUtil.looseSerialize(applicant);
		try {
			applicantObj = JSONFactoryUtil.createJSONObject(jsonObj);
		} catch (Exception e) {
			
		}

		// get variable dossier
		String dossierId = ParamUtil.getString(renderRequest, "dossierId");
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

		// set varible
		renderRequest.setAttribute("api", generateApiJsonObject(themeDisplay));
		renderRequest.setAttribute("applicant", applicantObj);

		super.render(renderRequest, renderResponse);
	}
	
	private JSONObject generateApiJsonObject(ThemeDisplay themeDisplay) {

		JSONObject apiObject = JSONFactoryUtil.createJSONObject();

		apiObject.put("server", themeDisplay.getPortalURL() + "/o/rest/v2");
		apiObject.put("portletNamespace", themeDisplay.getPortletDisplay().getNamespace());

		return apiObject;
	}
	
	private JSONObject generateURLJsonObject(RenderResponse renderResponse) throws WindowStateException {

		JSONObject urlObject = JSONFactoryUtil.createJSONObject();

		PortletURL customerDossierDetail2URL = renderResponse.createRenderURL();
		customerDossierDetail2URL.setWindowState(LiferayWindowState.EXCLUSIVE);
		customerDossierDetail2URL.setParameter("mvcPath", "/templates/customer_dossier_detail_2.ftl");

		urlObject.put("customer_dossier_detail_2", customerDossierDetail2URL);
		
		return urlObject;
	}
	
	private static final Log _log = LogFactoryUtil.getLog(FrontendWebTracuuPortlet.class);
	
}