
<#include "init.ftl">

<#--  <script src="/o/frontendwebdossier/js/main.js?browserId=other&themeId=opencpsvue_WAR_opencpsvuetheme&languageId=en_US&b=7002&t=1570752516000" type="text/javascript"></script>  -->

<input type="hidden" id="employeeTitle" name="employeeTitle" value="${(employee.title)!}">
<input type="hidden" id="employeeFullName" name="employeeFullName" value="${(employee.fullName)!}">

<div class="application theme--light">
  	<object id="plugin0" type="application/x-cryptolib05plugin" width="0" height="0"></object>
	<div id="dossierViewJX" style="width: 100%;"> </div>
	
</div>

<script type="text/javascript">
	document.addEventListener('DOMContentLoaded', function (event) {
		var stateWindow = "${(stateWindow)!}";
		var dossierId = '${(dossierId)!}';
		var dossierPartNo = "${(dossierPartNo)!}";

		var emailAddress = '${(user.emailAddress)!}';
		var urlCoSo = "${(ajax.saveDictItemURL)!}";
		var urlGetDictGroup = "${(getDictGroupURL)!}";
		var portletNamespace = "${(portletNamespace)!}";

		funLoadVue(stateWindow, dossierId, dossierPartNo, emailAddress, urlCoSo, urlGetDictGroup, portletNamespace);
	});
	
</script>

<style>
	.chip .chip__content {
	min-height: 17px !important;
	font-size: 12px !important;
}
.datatable thead th {
    -webkit-transform: none;
    transform: none;
    background: #14BEF0;
    color: #fff !important;
}
.container-fluid {
	padding: 0 !important;
	padding-left: 0 !important;
    padding-right: 0 !important;
}

li.active {
    background: #e1e1e1;
}
</style>
