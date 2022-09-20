package frontend.web.thong.tin.doanh.nghiep.cd.portlet;

import frontend.web.thong.tin.doanh.nghiep.cd.constants.FrontendWebThongTinDoanhNghiepCdPortletKeys;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.LiferayWindowState;
import com.liferay.portal.kernel.portlet.PortletConfigFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.freemarker.FreeMarkerPortlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.portlet.Portlet;
import javax.portlet.PortletConfig;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.WindowStateException;
import javax.servlet.http.HttpServletRequest;

import org.opencps.dossiermgt.model.Registration;
import org.opencps.dossiermgt.service.RegistrationLocalServiceUtil;
import org.opencps.usermgt.model.Applicant;
import org.opencps.usermgt.service.util.UserMgtUtils;
import org.osgi.service.component.annotations.Component;

/**
 * @author Admin
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.css-class-wrapper=portlet-freemarker",
		"com.liferay.portlet.display-category=category.opencps.register",
		"com.liferay.portlet.header-portlet-css=/css/app.a88bb928d39902245a09d6cb2d0664be.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/templates/view.ftl",
		"javax.portlet.name=" + FrontendWebThongTinDoanhNghiepCdPortletKeys.FrontendWebThongTinDoanhNghiepCd,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FrontendWebThongTinDoanhNghiepCdPortlet extends FreeMarkerPortlet {
	@Override
	public void render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
		HttpServletRequest request = PortalUtil.getHttpServletRequest(renderRequest);
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		PortletURL resourceUrl =  PortletURLFactoryUtil.create(renderRequest, PortalUtil.getPortletId(renderRequest), themeDisplay.getPlid(), PortletRequest.RESOURCE_PHASE);
		_log.info("resourceUrl++++++++++++++++++" + resourceUrl);
		_log.info("path++++++++++++++++++" + themeDisplay.getPathContext());
		super.render(renderRequest, renderResponse);

	}
	
	

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		try {
			ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
			JSONObject result = JSONFactoryUtil.createJSONObject();
			
			Applicant applicant = UserMgtUtils.getApplicant(themeDisplay.getUser().getEmailAddress());
			JSONObject applicantObj = JSONFactoryUtil.createJSONObject();
			String jsonObj = JSONFactoryUtil.looseSerialize(applicant);
			
			User userLogin = themeDisplay.getUser();
			JSONObject userLoginObj = JSONFactoryUtil.createJSONObject();
			String jsonUserLoginObj = JSONFactoryUtil.looseSerialize(userLogin);
			try {
				applicantObj = JSONFactoryUtil.createJSONObject(jsonObj);
				userLoginObj = JSONFactoryUtil.createJSONObject(jsonUserLoginObj);
				result.put("applicant", applicantObj);
				result.put("user", userLoginObj);
				result.put("groupId", themeDisplay.getScopeGroupId());
				result.put("portletNamespace", themeDisplay.getPortletDisplay().getNamespace());
			} catch (Exception e) {
				
			}
			writeJSON(resourceRequest, resourceResponse, result);
		} catch (Exception e) {
			// TODO: handle exception
		}
		super.serveResource(resourceRequest, resourceResponse);
	}



	private static final Log _log =
		LogFactoryUtil.getLog(FrontendWebThongTinDoanhNghiepCdPortlet.class);
}