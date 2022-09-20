<#include "init.ftl">
<link href="/o/frontend.web.thong.tin.doanh.nghiep.cb2/css/app.33cfc091bbab0d8b683ec77fc9dceb66.css" rel=stylesheet>
<div id="app" style="background: #ffff;">

</div>
<script src="/o/frontend.web.thong.tin.doanh.nghiep.cb2/js/manifest.b2bbdbb8eff6d9fe10d7.js" type="text/javascript"></script>
<script src="/o/frontend.web.thong.tin.doanh.nghiep.cb2/js/vendor.aa167f78215ce73a8c12.js" type="text/javascript"></script>
<script src="/o/frontend.web.thong.tin.doanh.nghiep.cb2/js/app.a6f90da606e0dd4ac58d.js" type="text/javascript"></script>

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
	.v-menu__content.theme--light.menuable__content__active {
		margin-top: -131px;
   		margin-left: 15px;
	}
	.ltr .column, .rtl .column-last {
		float: none !important;
	}
</style>