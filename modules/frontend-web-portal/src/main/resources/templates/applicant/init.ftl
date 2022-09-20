<#if (Request)??>
<#include "../init.ftl">
<@liferay_portlet.actionURL name="/login/login" var="loginURL" >
<@liferay_portlet.param name="mvcRenderCommandName" value="/login/login" />
</@>

<#assign GetterUtil = objectUtil("com.liferay.portal.kernel.util.GetterUtil") />
<#assign PortalUtil = objectUtil("com.liferay.portal.kernel.util.PortalUtil") />

<#assign active_user_id = GetterUtil.getString(PortalUtil.getOriginalServletRequest(request).getParameter("active_user_id")) />
<#assign redirectURL = GetterUtil.getString(PortalUtil.getOriginalServletRequest(request).getParameter("redirectURL")) />

<#assign isSignedIn = themeDisplay.isSignedIn() />

<#assign userName = (Request.userName)! />
</#if>


