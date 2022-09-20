<#if (Request)??>
<#include "init.ftl">
</#if>

<div class="box" id="detailDossier">

	<input type="hidden" name="productId" id="productId" value="${(productId)!}">
	<div class="row-header  align-middle-lg">
		<div class="background-triangle-big">Chi tiết sản phẩm dừng sản xuất</div> 
		<span class="text-bold" data-bind="text:serviceName"></span>
		<div class="pull-right group-icons align-middle-lg">


			<a href="javascript:;" onclick="fnBack();">
				<i class="fa fa-reply" aria-hidden="true"></i>
				Quay lại
			</a>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-12 col-xs-12">
			
		</div>
	</div>
</div>

<script type="text/javascript">
	function fnBack () {
		window.history.back();
	}
</script>
