<#if (Request)??>
	<#include "init.ftl">
</#if>
<#-- <span id="notification"></span>
<script type="text/javascript">
	var notification = $("#notification").kendoNotification().data("kendoNotification");
</script> -->
<#include "customerView.ftl">
<#include "customerViewModel.ftl">
<#include "customerRouting.ftl">
