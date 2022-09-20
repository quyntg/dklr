<#if (Request)??>
<#include "init.ftl">
</#if>

<div class="row">
	<div class="col-sm-4 col-xs-12">
		<div class="row">
			<div class="col-sm-3 text-right">
				<div class="PT5 text-bold">Số chứng chỉ</div>
			</div>
			<div class="col-sm-9">
				<div class="form-group"> 
					<input type="text" class="form-control input-sm" id="traCuuSoCC" name="traCuuSoCC" onchange="traCuuThongTin()"></span>
				</div>
			</div>
		</div>
	</div>
	<div class="col-sm-4 col-xs-12">
		<div class="row">
			<div class="col-sm-3 text-right">
				<div class="PT5 text-bold">Số khung</div>
			</div>
			<div class="col-sm-9">
				<div class="form-group"> 
					<input type="text" class="form-control input-sm" id="traCuuSoKhung" name="traCuuSoKhung" onchange="traCuuThongTin()"></span>
				</div>
			</div>
		</div>
	</div>
	<div class="col-sm-4 col-xs-12">
		<div class="row">
			<div class="col-sm-3 text-right">
				<div class="PT5 text-bold">Số động cơ</div>
			</div>
			<div class="col-sm-9">
				<div class="form-group"> 
					<input type="text" class="form-control input-sm" id="traCuuSoDongCo" name="traCuuSoDongCo" onchange="traCuuThongTin()"></span>
				</div>
			</div>
		</div>
	</div>
	<#if isSignedIn == false>
		<div class="col-sm-12 col-xs-12 text-center MB5">
			<a href="#" onclick="javascript: window.location='/web/cong-tiep-nhan/login?action=tra_cuu';" style="font-size: 12px; font-weight: bold; color: #3563c1; padding-bottom: 50px;"> 
				<i class="fa fa-user-circle-o" aria-hidden="true"></i>
				Đăng nhập để tìm kiếm
			</a>
		</div>
	<#else>

	</#if>
	<div class="col-sm-12 col-xs-12">
		<table class="table table-bordered M0">
			<thead>
				<tr>
					<th class="text-center hover-pointer">
						<span>STT</span>
					</th>
					<th class="fieldDossier text-center hover-pointer">
						Số ĐKKT <br>
						Ngày ĐKKT
					</th>
					<th class="fieldDossier text-center hover-pointer">
						Số BBKT <br>
						Ngày BBKT
					</th>
					<th class="fieldDossier text-center hover-pointer">
						Số chứng chỉ <br>
						Ngày cấp
					</th>
					<th class="text-center hover-pointer">
						Số khung
					</th>
					<th class="text-center hover-pointer">
						Số động cơ
					</th>
					<th class="text-center hover-pointer">
						Năm sản xuất
					</th>
					<th class="text-center hover-pointer">
						Thao tác
					</th>
				</tr>
			</thead>
			<tbody class="" id="listViewTraCuuThongTin">

			</tbody>

			<script type="text/x-kendo-template" id="traCuuTemplate">
				<tr class="rowTable">
					<td class="text-center count" style="width: 3%">
						#:Stt#
					</td>

					<td class="text-center" style="width: auto;">
						#:SoDKKT# <br>
						#:NgayDKKT#
					</td>

					<td class="text-center" style="width: auto;">
						#:SoBBKT# <br>
						#:NgayBBKT#
					</td>

					<td class="text-center" style="width: auto;">
						#:SoChungChi#
						#:NgayCap#
					</td>

					<td class="text-center" style="width: auto;">
						#:SoKhung#
					</td>

					<td class="text-center" style="width: auto;">
						#:SoDongCo#
					</td>

					<td class="text-center" style="width: auto;">
						#:NamSanXuat#
					</td>

					<td class="text-center" style="width: auto;">

					</td>

				</tr>
			</script>
		
		</table>
	</div>
	<div class="col-sm-12">
		<div class="footerListProfile row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
			<div class="clearfix align-middle" style="float: right">
				<span class="text-light-gray MR15">
					<i>Tổng số <span id="totalItem_TraCuu" class="red"></span> kết quả được tìm thấy</i>
				</span>
				<div id="pageTraCuuThongTin" class="M0 P0 k-pager-wrap k-widget k-floatwrap" style="background-color: #fff;"></div>
			</div>	
		</div>
	</div>
</div>

<#if isSignedIn>
<script>
	var dataSourceTraCuuTT = new kendo.data.DataSource({
		transport: {
			read: function (options) {
				$.ajax({
					url: "${api.server}/dossiers",
					dataType: "json",
					type: "GET",
					headers: {"groupId": ${groupId}},
					data: options.data,
					success: function (result) {
						options.success({
							data: [
								{
									Stt: 1,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								},
								{
									Stt: 2,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								},
								{
									Stt: 3,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								},
								{
									Stt: 4,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								}
							],
							total: 4
						});
					},
					error: function (result) {
						options.success({
							data: [
								{
									Stt: 1,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								},
								{
									Stt: 2,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								},
								{
									Stt: 3,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								},
								{
									Stt: 4,
									SoDKKT: 'abc',
									NgayDKKT: 'abc',
									SoBBKT: 'abc',
									NgayBBKT: 'abc',
									SoChungChi: 'abc',
									NgayCap: 'abc',
									SoKhung: 'abc',
									SoDongCo: 'abc',
									NamSanXuat: 'abc'
								}
							],
							total: 4
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
				id: "Stt"
			}
		}

	});

	function traCuuThongTin () {
		dataSourceTraCuuTT.read({
			traCuuSoCC: $("traCuuSoCC").val(),
			traCuuSoKhung: $("traCuuSoKhung").val(),
			traCuuSoDongCo: $("traCuuSoDongCo").val()
		});
	}

	$("#pageTraCuuThongTin").kendoPager({
		dataSource: dataSourceTraCuuTT,
		change: function () {
			$("#pageTraCuuThongTin .k-link").css({"border-radius":"0","border-color":"#ddd","height":"27px","margin-right":"0px"});
		},
		buttonCount: 10,
		info: false
	});

	$("#listViewTraCuuThongTin").kendoListView({
		dataSource: dataSourceTraCuuTT,
		template: kendo.template($("#traCuuTemplate").html()),
		dataBound: function () {
			var data = $("#listViewTraCuuThongTin").getKendoListView().dataSource.view();
			// for (var i = 0; i < data.length; i++) {
				
			// }
		}
	});


</script>
</#if>