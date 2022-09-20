<#if (Request)??>
<#include "init.ftl">
</#if>
<div class="box">
	<div class="row-header align-middle">
		<div class="background-triangle-big">Danh sách phiếu tính tiền</div> 
		<span class="text-bold"></span>
		<div class="MLA form-inline">
			<input type="text" class="form-control input-sm MR10" id="keyInputListBill" placeholder="Nhập từ khóa"
			onkeyup="inputListBill()" style="width: 290px;">
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
					<span>Chọn</span> <br>
					<input type="checkbox" class="select-bill-all" onchange="changeSelectAllBill(this)">
				</th>
				<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
					<span>Loại sản phẩm</span>
					<#-- <span class="pull-right align-middle PT5 text-light-gray">
						<i class="fa fa-sort" aria-hidden="true"></i>
					</span></br> -->
				</th>
				<th class="fieldDossier text-center hover-pointer" sort="submitDate" sort-type="desc">
					<strong>Số phiếu tính tiền</strong>
					<#-- <span class="pull-right align-middle PT5 text-light-gray">
						<i class="fa fa-sort" aria-hidden="true"></i>
					</span></br> -->
				</th>
				<th class="text-center hover-pointer">
					<strong>Ngày lập phiếu</strong></br>
				</th>
				<th class="text-center hover-pointer">
					<strong>Tổng tiền nộp phí</strong>
				</th>
				<th class="text-center hover-pointer">
					<strong>Tên doanh nghiệp</strong></br>
				</th>
				<th class="text-center hover-pointer">
					<strong>Cấp hóa đơn điện tử</strong>
				</th>
				<th class="text-center hover-pointer">
					<strong>Thao tác</strong>
				</th>
			</tr>
		</thead>
		<#-- Table body -->
		<tbody class="" id="listViewDossierBill">

		</tbody>

		<script type="text/x-kendo-template" id="dossierBillTemplate">
			<tr class="rowTable">
				<td class="text-center count" style="width: 3%">
					#:stt#
				</td>

				<td class="text-center" style="width: auto;">
					<input type="checkbox" class="item-bill-check" id="checkboxBill#:id#" onchange="selectProduct(this, '#:index#')">
				</td>

				<td class="text-center" style="width: auto;">
					#:loai#
				</td>

				<td class="text-center" style="width: auto;">
					#:so#
				</td>

				<td class="text-center" style="width: auto;">
					#:ngay#
				</td>

				<td class="text-center" style="width: auto;">
					#:tong#
				</td>

				<td class="text-center" style="width: auto;">
					#:ten#
				</td>

				<td class="text-center" style="width: auto;">
					#:hoadon#
				</td>

				<td class="text-center" style="width: auto;">
					
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
		<div id="pageDossierBill" class="M0 P0 k-pager-wrap k-widget k-floatwrap" style="background-color: #fff;"></div>
	</div>	
</div>

<script>
	var dataSelect = [];
	var selectCount = 0;
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
						// 		data: [{ index: 0, id: 'bill1'}, {index: 1, id: 'bill2'}, {index: 2, id: 'bill3'}, {index: 3, id: 'bill4'}, {index: 4, id: 'bill5'}],
						// 		total: 0
						// 	});
						// }
						options.success({
							data: [
								{
									index: 0, 
									id: 'bill1',
									stt: 1,
									loai: 'A',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 123,
									ten: 'Phiếu tính tiền 1',
									hoadon: 'Có'
								},
								{
									index: 1, 
									id: 'bill2',
									stt: 2,
									loai: 'B',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 123,
									ten: 'Phiếu tính tiền 2',
									hoadon: 'Không'
								},
								{
									index: 2, 
									id: 'bill3',
									stt: 3,
									loai: 'C',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 677,
									ten: 'Phiếu tính tiền 3',
									hoadon: 'Có'
								},
								{
									index: 3, 
									id: 'bill4',
									stt: 4,
									loai: 'D',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 12,
									ten: 'Phiếu tính tiền 4',
									hoadon: 'Không'
								},
								{
									index: 4, 
									id: 'bill5',
									stt: 5,
									loai: 'E',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 344,
									ten: 'Phiếu tính tiền 5',
									hoadon: 'Có'
								}
							],
							total: 0
						});
					},
					error: function (result) {
						options.success({
							data: [
								{
									index: 0, 
									id: 'bill1',
									stt: 1,
									loai: 'A',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 123,
									ten: 'Phiếu tính tiền 1',
									hoadon: 'Có'
								},
								{
									index: 1, 
									id: 'bill2',
									stt: 2,
									loai: 'B',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 123,
									ten: 'Phiếu tính tiền 2',
									hoadon: 'Không'
								},
								{
									index: 2, 
									id: 'bill3',
									stt: 3,
									loai: 'C',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 677,
									ten: 'Phiếu tính tiền 3',
									hoadon: 'Có'
								},
								{
									index: 3, 
									id: 'bill4',
									stt: 4,
									loai: 'D',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 12,
									ten: 'Phiếu tính tiền 4',
									hoadon: 'Không'
								},
								{
									index: 4, 
									id: 'bill5',
									stt: 5,
									loai: 'E',
									so: 'LT101',
									ngay: '30/2/2019',
									tong: 344,
									ten: 'Phiếu tính tiền 5',
									hoadon: 'Có'
								}
							],
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
				id: "id"
			}
		}

	});

	$("#pageDossierBill").kendoPager({
		dataSource: dataSourceProductStop,
		change: function () {
			$("#pageDossierBill .k-link").css({"border-radius":"0","border-color":"#ddd","height":"27px","margin-right":"0px"});
		},
		buttonCount: 10,
		info: false
	});

	$("#listViewDossierBill").kendoListView({
		dataSource: dataSourceProductStop,
		template: kendo.template($("#dossierBillTemplate").html()),
		dataBound: function () {
			var data = $("#listViewDossierBill").getKendoListView().dataSource.view();
			for (var i = 0; i < data.length; i++) {
				for (var j = 0; j < dataSelect.length; j++) {
					if (dataSelect[j].itemCode === data[i].itemCode) {
						$("#checkboxBill" + dataSelect[j].id).prop('checked', true);
					}
				}
			}
		}
	});

	function fnBack () {
		window.history.back();
	}

	function inputListBill () {
		var keyword = $("#keyInputListBill").val();
		if (keyword !== null && keyword !== undefined && keyword.length > 2 || keyword === "") {
			dataSourceProductStop.read({
				keyword: keyword
			})
		}
	}

	function selectProduct (checkbox, index) {
		var indexTmp = parseInt(index);
		if (indexTmp === null || indexTmp === undefined || indexTmp === "" || indexTmp < 0) {
			console.log('valid index');
			return;
		}
		var data = $("#listViewDossierBill").getKendoListView().dataSource.view();
		if (data) {
			if ($(checkbox).prop('checked')) {
				dataSelect.push(data[indexTmp]);
				selectCount ++;
			} else {
				var itemTmp = data[indexTmp];
				for (var i = 0; i < dataSelect.length; i++) {
					if (dataSelect[i].id === itemTmp.id) {
						dataSelect.splice(i, 1);
						selectCount --;
						break;
					}
				}
			}
			if (selectCount === data.length) {
				$(".select-bill-all").prop("checked", true);
			} else {
				$(".select-bill-all").prop("checked", false);
			}
		}
		console.log("dataSelect++++++++++++++", dataSelect);
	}

	function changeSelectAllBill (checkbox) {
		var data = $("#listViewDossierBill").getKendoListView().dataSource.view();
		if (data) {
			if ($(checkbox).prop('checked')) {
				selectCount = data.length;
				for (var i = 0; i < data.length; i++) {
					var indexTmp = dataSelect.findIndex(function (item) {
						return item.id === data[i].id
					});
					if (indexTmp === -1) {
						dataSelect.push(data[i])
					}
				}
				$(".item-bill-check").prop("checked", true);
			} else {
				selectCount = 0;
				for (var i = 0; i < data.length; i++) {
					for (var j = 0; j < dataSelect.length; j++) {
						if (dataSelect[j].id === data[i].id) {
							dataSelect.splice(j, 1);
						}
					}
				}
				$(".item-bill-check").prop("checked", false);
			}
		}
		console.log("dataSelect++++++++++++++", dataSelect);
	}
</script>