<#include "init.ftl">
<script src="https://cdnjs.cloudflare.com/ajax/libs/js-polyfills/0.1.43/polyfill.js" integrity="sha512-qOOdnUM5GtxFYZtMURfJthJ+1PphZz6uCofz6oBnCxCyP3Oc+ieRzc8sb7c+YL1vrenZNwu/C0EaqBaVvbiRhw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<#--<script src="/o/frontendwebdossier/js/main.js?browserId=other&themeId=opencpsvue_WAR_opencpsvuetheme&languageId=en_US&b=7002&t=1570752516000" type="text/javascript"></script>-->

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
.datatablePT .datatable{
    table-layout: fixed
}
.datatablePT .datatable thead th{
    white-space: pre!important;
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

body .danhSachHoSoTable__class table.table th:nth-child(1), body .danhSachHoSoTable__class table.table td:nth-child(1) {
    padding: 0;
    min-width: 30px;
}

.dialog.dialog--active.dialog--fullscreen>div.card {
    height: 100% !important;
}

</style>

<style>
              #alpacajs_form_TC_TSKT div.lv-one {
                  width: 95%;
                  margin: auto;
                  border-left: 1px #e9e9e9 solid;
                  border-right: 1px #e9e9e9 solid;
                  border-top: 0px;
              }

              #alpacajs_form_TC_TSKT .lv-one > .lv-content > div:nth-child(odd) {
                  background-color: #fafafa;
              }

              #alpacajs_form_TC_TSKT div.top-bb, .top-bb-header, .top-bb-content {
                  border: 0 !important;
              }
              #alpacajs_form_TC_TSKT div.top-bb {
                  width: 85%;
                  margin: auto;
                  border: 1px #e9e9e9 solid;
                  border-bottom: 0px;
              }

              #alpacajs_form_TC_TSKT .top-bb div.top-bb-header, .top-bb div.top-bb-title, .top-bb div.top-bb-left, .top-bb div.top-bb-right, .top-bb div.top-bb-ndtd-left, .top-bb div.top-bb-ndtd-mid, .top-bb div.top-bb-ndtd-right {
                  padding: 5px;
                  overflow: visible;
                  border-top: 1px solid #e9e9e9;
                  border-bottom: 0px solid #e9e9e9;
              }
              #alpacajs_form_TC_TSKT .top-bb-title {
                  margin-top: 15px;
              }
              #alpacajs_form_TC_TSKT .top-bb-title {
                  border: 1px solid black !important;
                  border-width: 1px 1px 0 !important;
              }
              #alpacajs_form_TC_TSKT .top-bb div.top-bb-title {
                  font-weight: bold;
              }
              #alpacajs_form_TC_TSKT .top-bb div.top-bb-ndtd-left {
                  width: 30%;
                  float: left;
                  font-weight: bold;
                  -webkit-justify-content: center;
                  justify-content: center;
              }
              #alpacajs_form_TC_TSKT .top-bb div.top-bb-ndtd-mid {
                  width: 26%;
                  float: left;
                  border-left: 1px solid #e9e9e9;
                  font-weight: bold;
                  -webkit-justify-content: center;
                  justify-content: center;
              }
              #alpacajs_form_TC_TSKT .top-bb div.top-bb-ndtd-right {
                  width: 18%;
                  float: right;
                  border-left: 1px solid #e9e9e9;
                  font-weight: bold;
                  -webkit-justify-content: center;
                  justify-content: center;
              }
              #alpacajs_form_TC_TSKT div[class*="top-bb"] {
                  overflow: visible;
                  display: -webkit-box;
                  display: flex;
                  -webkit-flex-wrap: wrap;
                  flex-wrap: wrap;
                  width: 100%;
              }

              #alpacajs_form_TC_TSKT .top-bb .form-control, .top-bb ~ div .form-control {
                height: 28px;
                line-height: normal;
              }
              #alpacajs_form_TC_TSKT .top-bb *:not(.fa), .top-bb ~ div *:not(.fa) {
                font-size: 12px !important;
                font-family: Arial, sans-serif !important;
                color: black !important;
              }
              #alpacajs_form_TC_TSKT .lv-one div select {
                width: 100%;
              }
              #alpacajs_form_TC_TSKT .bien-ban-tham-dinh select {
                font-size: 13px;
              }
              #alpacajs_form_TC_TSKT .alpaca-field select {
                background-color: #fff!important;
                border-bottom: 1px solid #dcdcdc!important;
                border-top: 1px solid #dcdcdc!important;
                border-left: 1px solid #dcdcdc!important;
                border-right: 1px solid #dcdcdc!important;
                box-shadow: none;
                -moz-appearance: menulist;
                -webkit-appearance: menulist;
              }
              #alpacajs_form_TC_TSKT .form-control {
                border-width: 1px 1px 1px 1px;
              }
              #alpacajs_form_TC_TSKT .form-control {
                display: block;
                width: 100%;
                height: 34px;
                padding: 6px 12px;
                font-size: 14px;
                line-height: 1.42857;
                color: #555555;
                background-color: #fff;
                background-image: none;
                border: 1px solid #ccc;
                border-radius: 4px;
                -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
                box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
                -webkit-transition: border-color ease-in-out 0.15s, box-shadow ease-in-out 0.15s;
                -o-transition: border-color ease-in-out 0.15s, box-shadow ease-in-out 0.15s;
                transition: border-color ease-in-out 0.15s, box-shadow ease-in-out 0.15s;
              }
              #alpacajs_form_TC_TSKT .alpaca-field .lv-one .text-thiet-ke textarea, .alpaca-field .text-thiet-ke input, .alpaca-field textarea {
                width: 100%;
                box-shadow: none !important;
              }
              #alpacajs_form_TC_TSKT .lv-one .text-thiet-ke textarea, .text-thiet-ke input {
                width: 100%;
              }
              #alpacajs_form_TC_TSKT .lv-one div.lv-title, .lv-one div.content-label-full, .lv-one div.content-label, .lv-one div.content-thiet-ke, .lv-one div.content-ket-luan, .lv-one div.content-order {
                  border-color: black;
                  height: 100%;
                  display: flex;
                  align-items: center;
                  justify-content: center;
              }
              #alpacajs_form_TC_TSKT .lv-one div.lv-title, .lv-one div.content-label, .lv-one div.content-thiet-ke, .lv-one div.content-ket-luan, .lv-one div.content-order {
                  padding: 5px;
                  overflow: visible;
                  border-top: 1px solid #e9e9e9;
                  border-bottom: 0px solid #e9e9e9;
              }
              #alpacajs_form_TC_TSKT .lv-one .content-order {
                  border-right: 1px solid #e9e9e9;
                  width: 4%;
              }

              #alpacajs_form_TC_TSKT .lv-one div.lv-title, .lv-one .content-label {
                  justify-content: flex-start !important;
              }
              #alpacajs_form_TC_TSKT .lv-one .content-label {
                  border-right: 1px solid #e9e9e9;
              }
              #alpacajs_form_TC_TSKT .lv-one .content-label {
                  width: 30%;
                  float: left;
              }

              #alpacajs_form_TC_TSKT .bien-ban-tham-dinh .not-pass {
                color: #0000CC !important;
                background-color: #f3acac !important;
              }
              #alpacajs_form_TC_TSKT div[class*="lv-"] {
                overflow: visible;
                display: -webkit-box;
                display: flex;
                -webkit-flex-wrap: wrap;
                flex-wrap: wrap;
                width: 100%;
              }

              #alpacajs_form_TC_TSKT .lv-one div.lv-title, .lv-one .content-label {
                justify-content: flex-start !important;
              }
              #alpacajs_form_TC_TSKT .lv-one div.lv-title {
                font-weight: bold;
                cursor: pointer;
              }
              #alpacajs_form_TC_TSKT .lv-one .content-ket-luan {
                width: 18%;
                float: right;
              }
              #alpacajs_form_TC_TSKT .lv-one .content-thiet-ke {
                border-right: 1px solid #e9e9e9;
              }
              #alpacajs_form_TC_TSKT .lv-one .content-thiet-ke {
                width: 26%;
                float: left;
              }
              #alpacajs_form_TC_TSKT .bien-ban-tham-dinh .ob-focus {
                  color: #0000CC !important;
                  background-color: #E6E6E6 !important;
              }
              #alpacajs_form_TC_TSKT .bien-ban-tham-dinh .nil {
                  color: #0000CC !important;
                  background-color: #fff1ae !important;
              }
              #alpacajs_form_TC_TSKT div.bot-bb {
                  border: 1px black solid;
              }

              #alpacajs_form_TC_TSKT div.bot-bb {
                  width: 85%;
                  margin: auto;
                  border: 1px #e9e9e9 solid;
                  border-bottom: 0px;
              }
              #alpacajs_form_TC_TSKT div[class*="bot-bb"] {
                  overflow: visible;
                  display: -webkit-box;
                  display: flex;
                  -webkit-flex-wrap: wrap;
                  flex-wrap: wrap;
                  width: 100%;
              }

              #alpacajs_form_TC_TSKT .v-chip.v-chip.v-chip--outline {
                height: 21px !important;
              }

              #alpacajs_form_TC_TSKT .v-chip--label, .v-chip--label .v-chip__content {
                font-size: 12px;
              }

              #alpacajs_form_TC_TSKT .bot-bb div.bot-bb-title {
                font-weight: bold;
              }

              #alpacajs_form_TC_TSKT .bot-bb .content-stt {
                width: 5%;
              }

              #alpacajs_form_TC_TSKT .bot-bb .content-label {
                width: 25%;
              }

              #alpacajs_form_TC_TSKT .bot-bb .content-ket-luan {
                width: 70%;
              }

              #alpacajs_form_TC_TSKT .bot-bb .content-label, .bot-bb .content-stt, .bot-bb .content-ket-luan, div.bot-bb-title {
                padding: 5px;
                overflow: visible;
                border-top: 1px solid #e9e9e9;
                border-bottom: 0px solid #e9e9e9;
              }

              #alpacajs_form_TC_TSKT .bot-bb .content-chung {
                padding: 5px;
                overflow: visible;
                width: 85%;
              }

              #alpacajs_form_TC_TSKT .top-bb div.top-bb-content {
                  padding: 5px 0;
                  align-items: baseline;
                  flex-wrap: nowrap;
              }

              #alpacajs_form_TC_TSKT .top-bb div.top-bb-header:not(:first-child) {
                  padding: 5px 0;
              }

              #alpacajs_form_TC_TSKT .top-bb div.top-bb-header {
                -webkit-justify-content: center;
                justify-content: center;
                font-weight: bold;
              }

              #alpacajs_form_TC_TSKT .top-bb div.top-bb-header, .top-bb div.top-bb-header label {
                  flex-wrap: wrap;
                  font-weight: normal;
              }

              #alpacajs_form_TC_TSKT .top-bb div.top-bb-header > span:last-child {
                margin-left: 5px;
              }

              #alpacajs_form_TC_TSKT .top-bb-content label {
                width: 140px;
                flex-shrink: 0;
                font-weight: normal;
              }

              #alpacajs_form_TC_TSKT .top-bb-content [id*="column"] {
                width: 100%;
              }

              #phien_ban_gcn {
                width: 50px;
              }
              .btn-close-dialog-tskt {
              	position: absolute !important;
              }

              .table-tskt {
                font-family: Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
              }

              .table-tskt td, #customers th {
                border: 1px solid #ddd;
                padding: 5px;
              }

              .table-tskt tr:nth-child(even){background-color: #f2f2f2;}

              .table-tskt tr:hover {background-color: #ddd;}

              .table-tskt th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: center;
                background-color: #2C4577;
                color: white;
              }
            </style>
