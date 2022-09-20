<#include "init.ftl">
<link href="/o/frontend.tracuu.publicpage/css/app.4bbf890059c94c53debc66f1aa0ecee0.css" rel=stylesheet>
<div id="app" style="background: #ffff;">

</div>
<script src="/o/frontend.tracuu.publicpage/js/manifest.6120de875a76780518dd.js" type="text/javascript"></script>
<script src="/o/frontend.tracuu.publicpage/js/vendor.5ca771ef24770b827819.js" type="text/javascript"></script>
<script src="/o/frontend.tracuu.publicpage/js/app.4ce974c7a06ad7d462b8.js" type="text/javascript"></script>

<style>
	
</style>

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

