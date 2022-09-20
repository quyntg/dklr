<#if (Request)??>
<#include "init.ftl">
</#if>
<#-- main section template -->

<#if registration?has_content>
	<input type="hidden" name="registrationId__hidden" id="registrationId__hidden" value="${(registration.registrationId)!}">
</#if>

<script type="text/x-kendo-template" id="mainTemplate_3">
	<div id="contentMain" class="row panel M0" style="border: none;box-shadow: none">
		<div class="panel-heading P0">
			<div class="row PL15 PR15">
				<div class="row-header align-middle-lg">
                    <h3>Hello</h3>
				</div>
			</div>
		</div>
	</div>
</script>


