/**
 * 
 */
package org.opencps.frontend.web.portal.portlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.opencps.frontend.web.portal.constants.FrontendWebPortalPortletKeys;
import org.opencps.usermgt.model.Employee;
import org.opencps.usermgt.service.EmployeeLocalServiceUtil;
import org.osgi.service.component.annotations.Component;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.util.bridges.freemarker.FreeMarkerPortlet;

import java.io.IOException;

/**
 * @author phucnv
 * @date Sep 11, 2017
 *
 */
@Component(immediate = true, property = {
	"com.liferay.portlet.css-class-wrapper=portlet-freemarker",
	"com.liferay.portlet.display-category=category.opencps_v2.portal",
	"com.liferay.portlet.header-portlet-css=/css/main.css",
	"com.liferay.portlet.instanceable=false",
	"javax.portlet.display-name=Login Portlet",
	"javax.portlet.init-param.template-path=/",
	"javax.portlet.init-param.view-template=/templates/applicant/login.ftl",
	"javax.portlet.name=" + FrontendWebPortalPortletKeys.LOGIN_PORTLET_NAME,
	"javax.portlet.resource-bundle=content.Language",
	"javax.portlet.security-role-ref=power-user,user"
}, service = Portlet.class)
public class LoginPortlet extends FreeMarkerPortlet {
	
	private static final Log _log = LogFactoryUtil.getLog(FrontendWebPortalPortlet.class);
	@Override
	public void render(
		RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		// TODO Auto-generated method stub
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		HttpServletRequest httpRequest = PortalUtil.getHttpServletRequest(renderRequest);
		
		
		String dossierId = PortalUtil.getOriginalServletRequest(httpRequest).getParameter("dossierId");
		String userName = StringPool.BLANK;
		if (Validator.isNotNull(themeDisplay.getUser()) && Validator.isNotNull(themeDisplay.getUser().getFullName())) {
			userName = themeDisplay.getUser().getFullName().replaceAll(" business", "");
			userName = userName.replaceAll(" citizen", "");
		}
		_log.info("userName" + userName);
		renderRequest.setAttribute("userName", userName);
		super.render(renderRequest, renderResponse);
		
	}
}
