<#include "init.ftl">
<link href="/o/frontend.web.thong.tin.doanh.nghiep.cd/css/app.e674dcf90cb6f5a5aa72e5f5ec69b54a.css" rel=stylesheet>
<div id="app" style="background: #ffff;">

</div>
<script src="/o/frontend.web.thong.tin.doanh.nghiep.cd/js/manifest.a5f954d721b695aedb3f.js?browserId=other&themeId=opencpsvue_WAR_opencpsvuetheme&languageId=en_US&b=7002&t=1570752516000" type="text/javascript"></script>
<script src="/o/frontend.web.thong.tin.doanh.nghiep.cd/js/vendor.e76161199ca8107203b9.js?browserId=other&themeId=opencpsvue_WAR_opencpsvuetheme&languageId=en_US&b=7002&t=1570752516000" type="text/javascript"></script>
<script src="/o/frontend.web.thong.tin.doanh.nghiep.cd/js/app.475fa633739fd99678d2.js?browserId=other&themeId=opencpsvue_WAR_opencpsvuetheme&languageId=en_US&b=7002&t=1570752516000" type="text/javascript"></script>


<script type="text/javascript">
	$(function () {
		$("#dropdownMenu1").click(function (event) {
			event.preventDefault();
			var value = $("#banner .account-section .dropdown-menu").css("display");
			if (!value || value === 'none') {
				$("#banner .account-section .dropdown-menu").css("display", "block");
			} else {
				$("#banner .account-section .dropdown-menu").css("display", "none");
			}
		})
	})
</script>
<style>
	.container-fluid {
		padding: 0;
	}
	.alpaca-field input {
	  height: 27px !important;
	  background-color: transparent !important;
	  border-bottom: 1px solid gainsboro!important;
	  border-top: 1px solid gainsboro!important;
	  border-left: 1px solid gainsboro!important;
	  border-right: 1px solid gainsboro!important;
	}
	
	.radio, .checkbox {
		margin-top: 0px;
	}
	.radio + .radio, .checkbox + .checkbox {
	  margin-top: 0;
	}
	
	#column-doi_tuong input[type="checkbox"] {
	  margin-top: -3px !important;
	  margin-left: -15px!important;
	}
	
	.alpaca-control.checkbox>label {
	  padding-right: 15px !important;
	}
	
	.radio.alpaca-control>label>input {
	  margin-top: -3px !important;
	}
	
	body .table-bordered {
	  border-top: 1px solid #ccc;
	}
</style>