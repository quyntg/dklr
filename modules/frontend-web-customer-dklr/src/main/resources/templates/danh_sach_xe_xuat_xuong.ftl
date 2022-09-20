<#if (Request)??>
<#include "init.ftl">
	
</#if>

<div id="contentMain" class="row panel M0" style="border: none;box-shadow: none">
	<div style="width: 100%;" id="manHinhDanhSach">
		<div class="panel-heading P0">
			<div class="row PL15 PR15">
				<div class="row-header align-middle-lg" style="justify-content: space-between;align-items: center;line-height: 32px;">
					<div>
						<div class="background-triangle-big">
							<i class="fa fa-file-text"></i>
						</div>
						<span class="text-bold" id="statusName" style="text-transform:uppercase;">Danh sách xe đã xuất xưởng</span> &nbsp;&nbsp;&nbsp;
						<#if registration?has_content>
							
						<#else>
							<span class="text-bold red" style="text-transform:uppercase;"></span>
						</#if>
					</div>
					<div>
						<a class="PL5 PR5 hover-pointer no-icon" href="#searchAdvancedCollapse1" data-toggle="collapse">Nâng cao</a>

						<span id="fullScreen" onclick="fullScreen()">
							<i class="fa fa-expand fs20 toggle-collapse MR10 ML10" aria-hidden="true"></i>
							<i class="fa fa-compress fs20 MR10 ML10" aria-hidden="true" style="display: none"></i>
						</span>
					</div>
				</div>
			</div>
            <div style="width: 100%;">
            	<div class="filter-group" style="width: 25%;">
            		<label for="noGCN">Đối tượng</label>
            		<select class="form-control" id="doituongFilterChoInPhoi">
            			<option value=""></option>
            			<option value="XCG">Xe cơ giới</option>
            			<option value="XMY">Xe mô tô, xe gắn máy</option>
            			<option value="XMY2">Xe mô tô, xe gắn máy (điện)</option>
            			<option value="XDD">Xe đạp điện</option>
            			<option value="XCN">Xe chở người 4 bánh</option>
            			<option value="XCH">Xe chở hàng 4 bánh</option>
            		</select>
            	</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Số GCN</label>
					<input type="text" class="form-control" id="soGCNFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Ngày cấp từ</label>
					<input type="date" class="form-control" id="ngayCapTuFilterXe" >
				</div>

				<div class="filter-group" style="width: 22%;">
					<label for="noGCN">Đến</label>
					<input type="date" class="form-control" id="ngayCapDenFilterXe" >
				</div>

				<#-- <div class="filter-group" style="width: 25%;">
					<label for="noGCN">Năm GCN</label>
					<input type="text" class="form-control" id="namGCNFilterXe" >
				</div> -->

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Số khung</label>
					<input type="text" class="form-control" id="soKhungFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Số động cơ</label>
					<input type="text" class="form-control" id="soDongCoFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Màu sơn</label>
					<input type="text" class="form-control" id="mauSonPxxFilterXe" >
				</div>

				<div class="filter-group" style="width: 22%;">
					<label for="noGCN">Tình trạng</label>
					<select class="form-control" id="trangThaiPhieuFilterXe">
						<option value=""></option>
						<option value="0">Bình thường</option>
						<option value="1">Bị hỏng</option>
						<option value="2">Bị thu hồi</option>
						<option value="3">Báo mất</option>
					</select>
				</div>				

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Số PXX</label>
					<input type="text" class="form-control" id="soPxxFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Ngày XX từ</label>
					<input type="date" class="form-control" id="ngayXXTuFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Đến</label>
					<input type="date" class="form-control" id="ngayXXDenFilterXe" >
				</div>

				<div class="filter-group" style="width: 22%;">
					<label for="noGCN">Số seri</label>
					<input placeholder="Số phát hành CQQLCL" type="text" class="form-control" id="soPhatHanhCQQLCLFilterXe" >
				</div>

				<#-- <div class="filter-group" style="width: 25%;">
					<label for="noGCN">Trạng thái</label>
					<select class="form-control" id="trangThaiInFilterXe">
						<option value="0">Chưa in</option>
						<option value="1">Đã in</option>
					</select>
				</div>
				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Chọn máy in</label>

					<select class="form-control" id="printerName">
						
					</select>
				</div> -->
				<#-- <div class="filter-group" style="width: 10%;">
					<a href="https://www.neodynamic.com/downloads/jspm/jspm-4.0.0.0-win.exe" target="_blank" style="color: blue;">Tải thư viện</a>
				</div> -->
				
				<div style="width: 100%; display: flex; align-items: center; justify-content: center;" class="">
					<button type="button" id="btn-import" class="btn btn-active PL5" onclick="getDSXe()">Tìm kiếm</button>

					<button type="button" id="btn-import" class="btn btn-active PL5" onclick="huyDieuKien()">Hủy điều kiện</button>
				</div>
			</div>
		</div>
		<#--	-->
		<div id="wrapMain" class="table-responsive">
			<table class="table table-bordered M0">
				<#-- Table header -->
				<thead>
					<tr>
						<th class="text-center hover-pointer">
							<span>STT</span>
						</th>
						<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
							<span>Đối tượng </span>
						</th>
						<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
							<span>Số hồ sơ </span>
						</th>
						<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
							<span>Số ấn chỉ </span>
						</th>
						<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
							<span>Số GCN </span>
						</th>
						<th class="fieldDossier text-center hover-pointer" sort="submitDate" sort-type="desc">
							<strong>Số khung</strong>
						</th>
						<th class="text-center hover-pointer">
							<strong>Số động sơ</strong>
						</th>
						<th class="text-center hover-pointer">
							<strong>Màu sơn</strong>
						</th>
						<th class="text-center hover-pointer">
							<strong>Hành động</strong>
						</th>
					</tr>
				</thead>
				<#-- Table body -->
				<tbody id="danhSachXeXuatXuongList">

				</tbody>
				<script type="text/x-kendo-template" id="templateDsXeXuatXuong">
					<tr>
						<td class="text-center">#:itemIndex#</td>
						<td class="text-center">#:vehicleClass#</td>
						<td class="text-center">#:dossierNo#</td>
						<td class="text-center">#:stampShortNo#</td>
						<td class="text-center">#:certificateRecordNo#</td>
						<td class="text-center">#:frameNo#</td>
						<td class="text-center">#:engineNo#</td>
						<td class="text-center">#:color#</td>
						<td class="text-center"><a href="javascript:;" style="color: blue;" onclick="preview()">Xem</a></td>
					</tr>
				</script>
			</table>

			<div class="clearfix align-middle" style="float: right">
				<#-- <span class="MR15"><i>Tổng số <span id="totalItem_dossierList" class="red"></span> kết quả được tìm thấy</i></span>
				<span class="show-per-page MT20">Hiển thị
					<span class="select-wrapper">
						<select class="ML5" id="itemPpageDsXe" onchange="changePageSize()" style="background-color: #ffffff">
							<option value="10">10</option>
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
						</select>
					</span>
				</span> -->
				<span id="pagerProfileDsXe" class="M0 P0" style="background: #ffffff"></span>
			</div>	

		</div>
		<#-- <div class="row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
			<div class="clearfix align-middle" style="float: right">
				<span class="text-light-gray MR15"><i>Tổng số <span id="totalDsXe" class="red"></span> kết quả được tìm thấy</i></span>
				<span class="show-per-page MT0">Hiển thị
					<span class="select-wrapper">
						<select class="ML5" id="listPage" onchange="changePageSize()" style="background-color: #ffffff">

						</select>
					</span>
				</span>
				<span id="btn-page" class="M0 P0" style="background: #ffffff"></span>
			</div>	
		</div>	 -->
	</div>
    <div id="viewPDF" style="display: none;">
		<div id="viewPDF-container">
			<div style="width: 100%; height: 26px; background-color: #ccc1c1; display: flex; justify-content: flex-end;"><button style="width: 26px; height: 26px; background-color: #615555; color: #fff;" onclick="closeViewPDF()">X</button></div>
			<object data="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" style="width:100%; height:700px;">
				<embed src="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" />
			</object>
		</div>
    </div>
</div>

<script>
	function getDSXe () {
		dataSourceDsXeXuatXuongTemplate.read({
			start: 0,
			end: 15
		})
	}

	function huyDieuKien () {
		$('#doituongFilterChoInPhoi').val('');
		$('#soKhungFilterXe').val('');
		$('#soDongCoFilterXe').val('');
		$('#soPhatHanhCQQLCLFilterXe').val('');
		$('#mauSonPxxFilterXe').val('');
		$('#trangThaiPhieuFilterXe').val('');
		$('#doituongFilterChoInPhoi').val('');
		$('#soGCNFilterXe').val('');
		$('#soPxxFilterXe').val('');
		
		var currentDate = new Date()
		var currentDateStr = currentDate.getFullYear() + '-' + String((currentDate.getMonth() + 1)).padStart(2, '0') + '-' + String(currentDate.getDate()).padStart(2, '0');

		var prev3Year = new Date();
		prev3Year.setFullYear(prev3Year.getFullYear() - 3);
		var prev3DateStr = prev3Year.getFullYear() + '-' + String((prev3Year.getMonth() + 1)).padStart(2, '0') + '-' + String(prev3Year.getDate()).padStart(2, '0');

		$('#ngayCapTuFilterXe').val(prev3DateStr);
		$('#ngayCapDenFilterXe').val(currentDateStr);

		$('#ngayXXTuFilterXe').val('');
		$('#ngayXXDenFilterXe').val(currentDateStr);
	}

	var dataSourceDsXeXuatXuongTemplate = new kendo.data.DataSource({
		transport :{
			read: function(options){
				var currentDate = new Date()
				var currentDateStr = currentDate.getFullYear() + '-' + String((currentDate.getMonth() + 1)).padStart(2, '0') + '-' + String(currentDate.getDate()).padStart(2, '0')

				var prev3Year = new Date();
				prev3Year.setFullYear(prev3Year.getFullYear() - 3);
				var prev3DateStr = prev3Year.getFullYear() + '-' + String((prev3Year.getMonth() + 1)).padStart(2, '0') + '-' + String(prev3Year.getDate()).padStart(2, '0')

				console.log('currentDateStr++++++++++', currentDateStr)
				console.log('prev3DateStr++++++++++', prev3DateStr)

				var certificateRecordDateFrom = document.getElementById("ngayCapTuFilterXe").value
				var certificateRecordDateFromFormat = ''
				if (certificateRecordDateFrom) {
					var tmp = certificateRecordDateFrom.split('-')
					certificateRecordDateFromFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
				} else {
					$('#ngayCapTuFilterXe').val(prev3DateStr)
				}


				var certificateRecordDateTo = document.getElementById("ngayCapDenFilterXe").value
				var certificateRecordDateToFormat = ''
				if (certificateRecordDateTo) {
					var tmp2 = certificateRecordDateTo.split('-')
					certificateRecordDateToFormat = tmp2[2] + '/' + tmp2[1] + '/' + tmp2[0]
				} else {
					$('#ngayCapDenFilterXe').val(currentDateStr)
				}



				var ngayXXTuFilterXe = document.getElementById("ngayXXTuFilterXe").value
				var ngayXXTuFilterXeFormat = ''
				if (ngayXXTuFilterXe) {
					var tmp3 = ngayXXTuFilterXe.split('-')
					ngayXXTuFilterXeFormat = tmp3[2] + '/' + tmp3[1] + '/' + tmp3[0]
				} else {

				}


				var ngayXXDenFilterXe = document.getElementById("ngayXXDenFilterXe").value
				var ngayXXDenFilterXeFormat = ''
				if (ngayXXDenFilterXe) {
					var tmp4 = ngayXXDenFilterXe.split('-')
					ngayXXDenFilterXeFormat = tmp4[2] + '/' + tmp4[1] + '/' + tmp4[0]
				} else {
					$('#ngayXXDenFilterXe').val(currentDateStr)
				}
				$.ajax({
					url: "/o/rest/vr-app/getDataGCN",
					dataType: "json",
					type: "GET",
					headers: {"groupId": "${groupId}"},
					data: {
						applicantIdNo: "${(registration.applicantCode)!}",
						vehicleClass: $('#doituongFilterChoInPhoi').val(),
						certificateRecordNo: $('#soGCNFilterXe').val().trim(),
						certificateRecordDateFrom: certificateRecordDateFromFormat,
						certificateRecordDateTo: certificateRecordDateToFormat,
						productionDateFrom: ngayXXTuFilterXeFormat,
						productionDateTo: ngayXXDenFilterXeFormat,
						productionNumber: $('#soPxxFilterXe').val().trim(),
						frameNo: $('#soKhungFilterXe').val().trim(),
						engineNo: $('#soDongCoFilterXe').val().trim(),
						serialNo: $('#soPhatHanhCQQLCLFilterXe').val().trim(),
						color: $('#mauSonPxxFilterXe').val().trim(),
						postPrintingStatus: $('#trangThaiPhieuFilterXe').val().trim(),
						start: options.data['start'] || 0,
						end: options.data['end'] || 15
					},
					success: function (result) {
						if (!result || !result['data']) {
							result = {
								data: [],
								total: 0
							}
						}
						options.success(result);
						$("#profileStatusAnChi li[dataPk='traCuuPTXX'] .bagde").html(result['total']);
						// $('#totalDsXe').val(result['total'] ? result['total'] : 0)
					},
					error: function (result) {
						options.error(result);
					}
				});
			}
		},
		pageSize: 15,
		serverPaging: true,
		schema: {
			data:"data",
			total:"total",
			model: {
				id: "id"
			}
		}
	});

	var indexDossiserPart = 0;
	$("#danhSachXeXuatXuongList").kendoListView({
		dataSource: dataSourceDsXeXuatXuongTemplate,
		autoBind: false,
		change: function(){

		},
		template: function(data){
			indexDossiserPart++;
			data['itemIndex'] = indexDossiserPart;
			return kendo.template($("#templateDsXeXuatXuong").html())(data);
		},
		dataBound : function(){
			indexDossiserPart = 0;
		}
	});

	function changePageSize () {
		dataSourceDsXeXuatXuongTemplate.pageSize(parseInt($("#itemPpageDsXe").val()));
		$("#pagerProfileDsXe .k-link").css({"border-radius":"0","border-color":"#ddd","height":"27px","margin-right":"0px"});
	}
	var pageTmp = 1;
	var pager = $("#pagerProfileDsXe").kendoPager({
		dataSource: dataSourceDsXeXuatXuongTemplate,
		change: function(e) {
			console.log("pager change event", e);
			var page = e['index'] || 1;
			pageTmp = page;
			var start = page * dataSourceDsXeXuatXuongTemplate.pageSize() - dataSourceDsXeXuatXuongTemplate.pageSize();
			var end = page * dataSourceDsXeXuatXuongTemplate.pageSize();
			indexDossiserPart = start 
			dataSourceDsXeXuatXuongTemplate.read({
				start: start,
				end: end
			})
		},
		pageSizes: [15, 30, 50, 100, "all"],
		messages: {
			display: "Tổng số {2} bản ghi",
			itemsPerPage: "Số bản ghi 1 trang"
		}
	});

	var pageSizeDropDownList = pager.find("select").data("kendoDropDownList");

	pageSizeDropDownList.bind("change", function(e) {
		console.log('change');
		var pageSize = e.sender.value() || dataSourceDsXeXuatXuongTemplate.pageSize();
		var page = pageTmp || 1;
		$("#pagerProfileDsXe").getKendoPager().page(page)
		// var start = page * dataSourceDsXeXuatXuongTemplate.pageSize() - dataSourceDsXeXuatXuongTemplate.pageSize();
		// var end = page * dataSourceDsXeXuatXuongTemplate.pageSize();
		// console.log('page===============', page)
		// console.log('pageSize===============', pageSize)
		// // pageSize có các options từ 15 - 100 , > 100 tức là người dùng chọn All
		// if (pageSize > 100) {
		// 	start = -1;
		// 	end = -1;
		// 	indexDossiserPart = 0;
		// }
		// indexDossiserPart = page * pageSize || 0
		// dataSourceDsXeXuatXuongTemplate.read({
		// 	start: start,
		// 	end: end
		// });
	});
	
	// dataSourceDsXeXuatXuongTemplate.read({
	// 	start: 0,
	// 	end: 15
	// });
</script>

<script>
	// document.getElementById("danhSachAnChiCapPhat").style.background= "#fff0"
	// document.getElementById("danhSachXeXuatXuong").style.background= "linear-gradient(to right, #ffeaa0 0%,rgba(246,246,246,0) 100%)"
	// document.getElementById("danhSachXeChoInPhieuXuatXuong").style.background= "#fff0"
	// document.body.scrollTop = 0;
	// document.documentElement.scrollTop = 0;
	// var originUrl = window.location.href.substr(0, window.location.href.lastIndexOf('/group'))
	// var	groupId = window.themeDisplay.getScopeGroupId()
	// var total = 0
	// var pagesize = 10
	// var page = 1
	// var pageMax = Math.ceil(total/pagesize)
	// var dictGroups = []
	// console.log('1111111')
	// window.getList = function(){
	// 	let productiondate = document.getElementById("productiondateFilter").value
	// 	const [year, month, day] = productiondate.split('-')
	// 	let productiondateFormat = ''
	// 	if(typeof day !== 'undefined'){
	// 		productiondateFormat = day + '/' + month + '/' + year
	// 	}
	// 	let params = {
	// 		vehicleclass: document.getElementById("vehicleclassFilter").value,
	// 		stampissueno: document.getElementById("stampissueNoFilter").value,
	// 		certificaterecordno: document.getElementById("certificaterecordnoFilter").value,
	// 		productiondate: productiondateFormat,
	// 		frameno: document.getElementById("framenoFilter").value,
	// 		engineno: document.getElementById("enginenoFilter").value,
	// 		serialno: document.getElementById("serialnoFilter").value,
	// 		applicantprofileid: window.applicantprofileid 
	// 	}
	// 	console.log('2222222')
	// 	let Url = originUrl + '/o/rest/vr-app/vehicle/record/search?'
	// 	for (const key in params) {
	// 		if (params[key] !== '') {
	// 			Url += '&' + key + '=' + params[key]
	// 		}
	// 	}

	// 	$.ajax({
	// 		url: Url,
	// 		type: "GET",
	// 		success: function (success) {
	// 			let html = '';
	// 			console.log('33333')
	// 			for(let i=0; i< success.data.length; i++){
	// 				html += '<tr class="rowTable">'
	// 					+	'<td class="text-center">'+ (page*pagesize-pagesize+i+1) +'</td>'
	// 						+	'<td class="text-center">'+ success.data[i].vehicleclass + '</td>'
	// 						+	'<td class="text-center">'+ success.data[i].stampissueno + '</td>'
	// 						+	'<td class="text-center">'+ success.data[i].serialno + '</td>'
	// 						+	'<td class="text-center">'+ success.data[i].certificaterecordno + '</td>'
	// 						+	'<td class="text-center">'+ success.data[i].frameno + '</td>'
	// 						+	'<td class="text-center">'+ success.data[i].engineno + '</td>'
	// 						+	'<td class="text-center">'+ success.data[i].color + '</td>'
	// 						+	'<td class="text-center"><span class="span-thaotac">Hồ sơ</span><span class="span-thaotac" onclick="xemChiTiet('+success.data[i].certificateid+')">TSTK</span><span class="span-thaotac" onclick="xemPDF('+success.data[i].id+')">Phiếu XX</span></td>'
	// 					+	'</tr>'
	// 			}
	// 			document.getElementById("danhSach").innerHTML = html
	// 			total = success.total
	// 			pageMax =  Math.ceil(total/pagesize)
	// 			document.getElementById("total").innerHTML = total
	// 			document.querySelector("#listPage").innerHTML = ''
	// 			for(let i=10; i<=total; i+=10){
	// 				let option = document.createElement("option");
	// 				option.text = i;
	// 				option.value = i;
	// 				document.querySelector("#listPage").appendChild(option);
	// 			}
	// 			document.getElementById('listPage').value = pagesize
	// 			document.getElementById("btn-page").innerHTML = `
	// 				<ul class="k-pager-numbers k-reset">
	// 					<li onclick="lastPageLast()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;"><span class="k-icon k-i-arrow-w"></span></a></li>
	// 					<li onclick="lastPage()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;">...</a></li>
	// 					<li><span class="k-state-selected" style="height: 27px;">`+page+`</span></li>
	// 					<li onclick="nextPage()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;">...</a></li>
	// 					<li onclick="nextPageLast()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;"><span class="k-icon k-i-arrow-e"></span></li>
	// 				</ul>
	// 			`
	// 		},
	// 	});
	// }
	// function getDictGroups(){
	// 	$.ajax({
	// 		url: originUrl + '/o/rest/v2/dictcollections/VR84/dictgroups',
	// 		type: "GET",
	// 		headers: {
	// 			groupId: groupId,
	// 			Accept: 'application/json'
	// 		},
	// 		success: function(success) {
	// 			dictGroups = success.data
	// 			let select = document.getElementById("vehicleclassFilter");
	// 			dictGroups.forEach(function(item){
	// 				let option = document.createElement("option");
	// 				option.text = item.groupCode;
	// 				option.value = item.groupCode;
	// 				select.appendChild(option);
	// 			})
	// 		},
	// 	})
	// }
	// function changeDoiTuong() {
	// 	let value = document.getElementById("vehicleclassFilter").value;
	// 	console.log(value)
	// }
	// function Search() {
	// 	window.getList()
	// }
	// function getApplicantsProfileID (applicantIdNo) {
	// 	let Url = originUrl + '/o/rest/vr-app/applicant/profile/'+applicantIdNo
	// 	$.ajax({
	// 		url: Url,
	// 		headers: {
	// 			Accept: 'application/json'
	// 		},
	// 		type: "GET",
	// 		success: function (success) {
	// 			console.log('getApplicantsProfileID')
	// 			window.applicantprofileid = success.id
	// 			window.getList()
	// 		},
	// 	});
	// }
	// function getApplicants () {
	// 	let Url = originUrl + '/o/rest/v2/applicants/selfdetail'
	// 	$.ajax({
	// 		url: Url,
	// 		headers: {
	// 			Accept: 'application/json'
	// 		},
	// 		type: "GET",
	// 		success: function (success) {
	// 			console.log('getApplicants')
	// 			if(success.applicantIdType === 'business'){
	// 				getApplicantsProfileID(success.applicantIdNo)
	// 			}
	// 		},
	// 	});
	// }
	// function xuatExcel () {
	// 	let productiondate = document.getElementById("productiondateFilter").value
	// 	const [year, month, day] = productiondate.split('-')
	// 	let productiondateFormat = ''
	// 	if(typeof day !== 'undefined'){
	// 		productiondateFormat = day + '/' + month + '/' + year
	// 	}
	// 	let params = {
	// 		vehicleclass: document.getElementById("vehicleclassFilter").value,
	// 		stampissueno: document.getElementById("stampissueNoFilter").value,
	// 		certificaterecordno: document.getElementById("certificaterecordnoFilter").value,
	// 		productiondate: productiondateFormat,
	// 		frameno: document.getElementById("framenoFilter").value,
	// 		engineno: document.getElementById("enginenoFilter").value,
	// 		serialno: document.getElementById("serialnoFilter").value,
	// 		applicantprofileid: window.applicantprofileid 
	// 	}
	// 	console.log('xuatExcel')
	// 	let Url = originUrl + '/o/rest/vr-app/vehicle/record/export?'
	// 	for (const key in params) {
	// 		if (params[key] !== '') {
	// 			Url += '&' + key + '=' + params[key]
	// 		}
	// 	}
	// 	let data = {
	// 		headercodes: '{auto},vehicleclass,stampissueno,serialno,certificaterecordno,frameno,engineno,color',
	// 		headerlabels: 'STT, Đối tượng, Số hồ sơ, Số ấn chỉ, Số GNC, Số khung, Số động cơ, Màu sơn'
	// 	}
	// 	let dataPost = new URLSearchParams()
	// 	for(key in data){
	// 		dataPost.append(key, data[key])
	// 	}
	// 	axios.post(Url, dataPost, {
	// 		header: {
	// 			'Content-Type': 'application/x-www-form-urlencoded',
	// 			'Accept': '*'
	// 		},
	// 		responseType: 'blob'
	// 	}).then((req) => {
	// 		const url = window.URL.createObjectURL(req.data);
 //            const link = document.createElement('a');
 //            link.href = url;
 //            link.setAttribute('download', 'Danh sách xe đã xuất xưởng.xls'); //or any other extension
	// 		console.log('url:',url)
	// 		console.log(link)
 //            document.body.appendChild(link);
 //            link.click();
	// 	})
	// }
	// getApplicants()
	// getDictGroups()
	// function xemChiTiet(certificateid){
	// 	window.certificateid = certificateid
	// 	manageDossier.navigate("/chi-tiet-xe-xuat-xuong")
	// }
	// function xemPDF(){
	// 	document.getElementById("viewPDF").style.display = "block"
	// }
	// function closeViewPDF(){
	// 	document.getElementById("viewPDF").style.display = "none"
	// }
	// $.ajax({
	// 		url: originUrl + '/o/rest/vr-app/vehicle/record/count',
	// 		type: "GET",
	// 		success : function(result){
	// 			console.log('aaaaaa:', document.getElementById("countDSXeDaXuatXuong"))
	// 			document.getElementById("countDSXeDaXuatXuong").innerHTML = result
	// 		},
	// 	})
	// $.ajax({
	// 	url: originUrl + '/o/rest/vr-app/issue/stampbook/count',
	// 	type: "GET",
	// 	success : function(result){
	// 		$("#countDSAnChiDaCapPhat").html(result);
	// 	},
	// })
</script>

<style>
	span.k-pager-sizes.k-label select {
		display: none !important;
	}
    .filter-group{
        width: 33%;
        padding: 1px 10px;
        display: inline-block;
    }
	.filter-group label{
		display: inline-block!important;
		width: 30%!important;
	}
	.filter-group input,select{
		display: inline-block!important;
		width: 65%!important;
		height: 29px!important;
		font-size: 13px!important;
	}
    .btn-filter{
        color: #fff;
        background-color: #007bff;
        border-color: #007bff;
        font-weight: 400;
        text-align: center;
        font-size: 13px;
        margin: 5px 0px;
    }
	.btn-active{
		margin:5px;
	}
	.span-thaotac{
		color: #0b72ba; 
		font-weight: bold;
		cursor: pointer;
		margin: 0 5px;
	}
    #viewPDF{
        width: 100%;
		position: fixed;
		top: 0;
		left: 0;
    }
	#viewPDF-container{
		width: 80%	;
		margin: 30px auto;
		box-shadow: 0px 3px 5px -1px rgba(0, 0, 0, 0.2), 0px 6px 10px 0px rgba(0, 0, 0, 0.14), 0px 1px 18px 0px rgba(0, 0, 0, 0.12);
	}
</style>
