<#if (Request)??>
<#include "init.ftl">
</#if>
<div class="box">
	<div class="row-header align-middle">
		<div class="background-triangle-big">Danh sách sản phẩm dừng sản xuất</div> 
		<span class="text-bold"></span>
		<div class="MLA form-inline">
			<input type="text" class="form-control input-sm MR10" id="keyInputProductStop" placeholder="Nhập từ khóa"
			onkeyup="inputProductStop()" style="width: 290px;">
		</div>
	</div>
	<table class="table table-bordered M0">
		<#-- Table header -->
		<thead>
			<tr>
				<th class="text-center hover-pointer">
					<span>STT</span>
				</th>
				<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
					<span>Nhóm sản phẩm</span>	
				</th>
				<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
					<span>Loại sản phẩm</span>
					<#-- <span class="pull-right align-middle PT5 text-light-gray">
						<i class="fa fa-sort" aria-hidden="true"></i>
					</span></br> -->
				</th>
				<th class="fieldDossier text-center hover-pointer" sort="submitDate" sort-type="desc">
					<strong>Nhãn hiệu</strong>
					<#-- <span class="pull-right align-middle PT5 text-light-gray">
						<i class="fa fa-sort" aria-hidden="true"></i>
					</span></br> -->
				</th>
				<th class="text-center hover-pointer">
					<strong>Tên thương mại</strong></br>
				</th>
				<th class="text-center hover-pointer">
					<strong>Mã kiểu loại</strong>
				</th>
			</tr>
		</thead>
		<#-- Table body -->
		<tbody class="" id="listViewProductStop">

		</tbody>

		<script type="text/x-kendo-template" id="productStopTemplate">
			<tr class="rowTable">
				<td class="text-center count" style="width: 3%">
					#:stt#
				</td>

				<td class="text-center" style="width: auto;">
					<span>
						#:nhom#
					</span>

				</td>

				<td class="text-center" style="width: auto;">
					#:loai#
				</td>

				<td class="text-center" style="width: auto;">
					#:nh#
				</td>

				<td class="text-center" style="width: auto;">
					#:ten#
				</td>

				<td class="text-center" style="width: auto;">
					#:ma#
				</td>

			</tr>
		</script>
		
	</table>
</div>
<div class="footerListProfile row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
	<div class="clearfix align-middle" style="float: right">
		<span class="text-light-gray MR15">
			<i>Tổng số <span id="totalItem_dossierList" class="red"></span> kết quả được tìm thấy</i>
		</span>
		<div id="pageProductStop" class="M0 P0 k-pager-wrap k-widget k-floatwrap" style="background-color: #fff;"></div>
	</div>	
</div>

<script>
	var dataSourceProductStop = new kendo.data.DataSource({
		transport: {
			read: function (options) {
				$.ajax({
					url: "${api.server}/dossiers",
					dataType: "json",
					type: "GET",
					headers: {"groupId": ${groupId}},
					data: options.data,
					success: function (result) {
						// $(".k-pager-first").css("display","none");
						// $(".k-pager-last").css("display","none");
						// $("#pagerProfile .k-link").css({"border-radius":"0","border-color":"#ddd","height":"27px","margin-right":"0px"})
						// if (result.data) {
						// 	options.success(result);
						// } else {
						// 	options.success({
						// 		data: [{}, {}, {}, {}, {}],
						// 		total: 0
						// 	});
						// }
						options.success({
							data: [
								{
									stt: 1,
									nhom: 'nhom A',
									loai: 'A',
									ten: 'Sản phẩm A',
									ma: 'TT101',
									nh: 'DONGFENG'
								},
								{
									stt: 2,
									nhom: 'nhom B',
									loai: 'B',
									ten: 'Sản phẩm B',
									ma: 'TT102',
									nh: 'DONGFENG'
								},
								{
									stt: 3,
									nhom: 'nhom C',
									loai: 'C',
									ten: 'Sản phẩm C',
									ma: 'TT103',
									nh: 'DONGFENG'
								},
								{
									stt: 4,
									nhom: 'nhom D',
									loai: 'D',
									ten: 'Sản phẩm D',
									ma: 'TT104',
									nh: 'DONGFENG'
								},
								{
									stt: 5,
									nhom: 'nhom A',
									loai: 'E',
									ten: 'Sản phẩm E',
									ma: 'TT105',
									nh: 'DONGFENG'
								}
							],
							total: 0
						});
					},
					error: function (result) {
						options.success({
							data: [{}, {}, {}, {}, {}],
							total: 0
						});
						// options.error(result);
					}
				});
			}
		},
		page: 1,
		pageSize: 10,
		schema: {
			data: "data",
			total: "total",
			model: {
				id: "stt"
			}
		},
		// sort: { field: "createDate", dir: "desc" }

	});

	$("#pageProductStop").kendoPager({
		dataSource: dataSourceProductStop,
		change: function () {
			$("#pageProductStop .k-link").css({"border-radius":"0","border-color":"#ddd","height":"27px","margin-right":"0px"});
		},
		buttonCount: 10,
		info: false
	});

	$("#listViewProductStop").kendoListView({
		dataSource: dataSourceProductStop,
		template: kendo.template($("#productStopTemplate").html())
	});

	function fnBack () {
		window.history.back();
	}

	function inputProductStop () {
		var keyword = $("#keyInputProductStop").val();
		if (keyword !== null && keyword !== undefined && keyword.length > 2 || keyword === "") {
			dataSourceProductStop.read({
				keyword: keyword
			})
		}
	}
</script>