<#include "init.ftl">
<link href="/o/frontend.web.thong.tin.doanh.nghiep.cb/css/app.11c6257b42030f85046da395ef58fd76.css" rel=stylesheet>
<div id="app" style="background: #ffff;">

</div>
<script src="/o/frontend.tracuu.publicpage/js/manifest.071382d6c2abcd599a6c.js" type="text/javascript"></script>
<script src="/o/frontend.tracuu.publicpage/js/vendor.33d5f6448730a0301688.js" type="text/javascript"></script>
<script src="/o/frontend.tracuu.publicpage/js/app.21c54ddd9870164ed203.js" type="text/javascript"></script>

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