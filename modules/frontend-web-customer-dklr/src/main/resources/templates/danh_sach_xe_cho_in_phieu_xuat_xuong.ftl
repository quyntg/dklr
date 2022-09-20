<#if (Request)??>
<#include "init.ftl">
	
</#if>

<div id="contentMain" class="row panel M0" style="border: none;box-shadow: none">
		<div id="dialog"></div>
		<div id="dialog-cauhinh" oncontextmenu="return false;" style="width: 100%; z-index: 9999999999;background: #fff;position: fixed; top: 0; left: 0; display: none;">
			<div id="nav-filter" style="position: absolute;top: 64px;right: 0; width: 280px;height: 100%; background-color: #fff; box-shadow: -3px 6px 16px #888888;">
				<div style="width: 87%;padding: 10px;">
					<input id="input-label" style="width: 100%;height: 30px; border-radius: 5px;border: 1px solid;padding: 2px 10px;" type="" name="">

				</div>
				<hr>
				<div id="list-label" style="width: 100%; box-sizing: border-box;">
					
				</div>
			</div>
			<div style="width: 100%;">
				<div style="width: 100%;background: #2196f3;color: #fff; height: 64px; line-height: 64px; display: flex; justify-content: space-between; box-shadow: 0px 2px 4px -1px rgba(0,0,0,0.2), 0px 4px 5px 0px rgba(0,0,0,0.14), 0px 1px 10px 0px rgba(0,0,0,0.12); padding: 0 15px;">
					<div>
						<button id="btn-close-cauhinh" style="width: 36px; height: 36px; color: #fff; font-weight: bold; background: none; border: none; cursor: pointer;">X</button>
						<strong style="font-size: 25px; margin-left: 20px;font-family: 'Roboto', sans-serif;">Cấu hình phôi</strong>
					</div>
					
					<div style="padding-right: 61px;">
						<button class="btn btn-active" id="btn-save-cauhinh" style="height: 64px;color: #fff; font-weight: bold; background: none; border: none; cursor: pointer;margin:0 10px;">Lưu lại</button>
					</div>
				</div>
				<div style="width: 100%;height: 700px;overflow: auto;" >
					<div id="page" style="width: 21cm;min-height: 29.7cm;margin: 1cm auto;border: 1px #D3D3D3 solid;">
						<div id="printTraCuu" style="background-size: cover;height: 297mm;width: 210mm;margin-left: auto;margin-right: auto;position: relative;">
							
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="panel-heading P0">
			<div class="row PL15 PR15">
				<div class="row-header align-middle-lg" style="justify-content: space-between;align-items: center;line-height: 32px;">
					<div>
						<div class="background-triangle-big">
							<i class="fa fa-file-text"></i>
						</div>
						<span class="text-bold" id="statusName" style="text-transform:uppercase;">Danh sách chờ in & cập nhật sê ri phiếu</span> &nbsp;&nbsp;&nbsp;
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
            <div class="" style="width:100%;padding-top: 5px;">
                <div>
					<#-- <div style="display: flex;align-items: center;"><div class="triangle-right"></div><strong>Danh sách hồ sơ</strong></div> -->
<#-- 						dossierNo
						vehicleclass
						certifiedassemblytype
						applicantIdNo
						productionPlantCode
						methodOfIssue
						IssueType -->
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
								<label for="noGCN">Số hồ sơ</label>
								<input type="text" class="form-control" id="soHoSoFilterChoInPhoi" >
							</div>


							<div class="filter-group" style="width: 25%;">
								<label for="noGCN">Ngày hồ sơ</label>
								<input type="date" class="form-control" id="ngayhoSoTuFilterChoInPhoi" >
							</div>

							<div class="filter-group" style="width: 22%;">
								<label for="noGCN">Đến</label>
								<input type="date" class="form-control" id="ngayhoSoDenFilterChoInPhoi" >
							</div>

							<div class="filter-group" style="width: 25%;">
								<label for="noGCN">Nhà xưởng</label>
								<select class="form-control" id="nhaXuongFilterChoInPhoi">
								</select>
							</div>

							<div class="filter-group" style="width: 25%;">
								<label for="noGCN">Loại hình SXLR </label>
								<select class="form-control" id="loaiHinhFilterChoInPhoi">
								</select>
							</div>


							<div class="filter-group" style="width: 25%;">
								<label for="noGCN">Phương thức cấp</label>
								<select class="form-control" id="phuongThucFilterChoInPhoi">
									<option value=""></option>
									<option value="10">Cấp ứng</option>
									<option value="20">Cấp theo lô</option>
									<option value="30">Cấp giám sát</option>
									<option value="40">Quyết toán ấn chỉ đã tạm ứng</option>
								</select>
							</div>

							<div class="filter-group" style="width: 22%;">
								<label for="noGCN">Hình thức cấp</label>
								<select class="form-control" id="loaiHoSoFilterChoInPhoi">
									<option value=""></option>
									<option value="1">Cấp mới lần đầu</option>
									<option value="4">Cấp thay thế</option>
									<option value="3">Cấp thay thế (cho phiếu mất)</option>
									<option value="2">Cấp thay thế (đổi phiếu hỏng)</option>
									<#-- <option value="13">Đổi ấn chỉ do Tổ KTKV làm hỏng</option>
									<option value="2">Cấp lại ấn chỉ mất (CẤP LẠI LẦN 2)</option> -->
								</select>
							</div>

							<div style="width: 100%; display: flex; align-items: center; justify-content: center;">
								<button type="button" id="timKiemHsPXX" class="btn btn-active PL5">Tìm kiếm</button>

								<#-- <button type="button" id="toDanhSachXe" class="btn btn-active PL5">To danh sách xe</button> -->
							</div>

						</div>
					<#-- <div style="width: 100%;">
						<div class="filter-group" style="padding: 3px 0px; width: 24%;">
							<label for="vehicleclassFilter">Đối tượng</label>
							<select class="form-control" id="vehicleclassFilter">
								<option value="">Tất cả</option>
							</select>
						</div>
						<div class="filter-group" style="padding: 3px 0px; width: 24%;">
							<label for="issuetypeFilter">Loại Hồ sơ</label>
							<input type="text" class="form-control" id="issuetypeFilter" >
						</div>

						<button type="button" id="toDanhSachXe" class="btn btn-active PL5" onclick="selectHoSo(123)">To danh sách xe</button>
					</div> -->
					<div style="width: 100%;overflow: scroll;">
						<table class="table-hoso-filter">
							<thead>
								<tr>
									<th><strong>STT</strong></th>
									<#-- <th><strong>Chọn</strong></th> -->
									<th><strong>Số hồ sơ</strong></th>
									<th><strong>Ngày hồ sơ</strong></th>
									<th><strong>Đối tượng</strong></th>
									<th><strong>Loại hồ sơ</strong></th>
									<th><strong>SL đã cấp</strong></th>
									<th><strong>SL chưa sử dụng</strong></th>
									<th><strong>Trạng thái sê ri phiếu</strong></th>
									<th><strong>Thao tác</strong></th>
								</tr>
							</thead>
							<tbody id="danhSachHoSoFilter">

							</tbody>

							<script type="text/x-kendo-template" id="dsXeCHoInPhieuXXTemplate">

							<tr class="rowTable">

								<td data-pk="#:id#" class="text-center count" style="width: 1%; text-align: center;">
									#:count#
								</td>

								<td class="text-center" style="width: 15%" data-pk="#:id#">
									<span style="cursor: pointer;">
										<a href="javascript:;" class="link-detail-employee text-hover-blue">
											#=dossierNo#
										</a>
									</span>

								</td>

								<td class="text-center" style="width: 8%" data-pk="#:id#">
									<p>
										<span style="cursor: pointer;">#=appliedDate#</span>
									</p>

								</td>

								<td class="text-center" style="width: 14%" data-pk="#:id#"> 

									<p>
										<span style="cursor: pointer;">#=getTextVehicleClass(vehicleClass)#</span>
									</p>

								</td>

								<td class="text-center" style="width: 10%" onclick="xemAnChi(this)" data-pk="#:id#">
									<p style="cursor: pointer;">#=getTextIssueType(issueType)#</p>
								</td>

								<td class="text-center" style="width: 10%" data-pk="#:id#">
									<span style="cursor: pointer;" class="">#=totalInDocument#</span>
								</td>

								<td class="text-center" style="width: 10%" data-pk="#:id#">
									<span style="cursor: pointer;" class="">#=totalInUse#</span>
								</td>

								<td class="text-center" style="width: 12%" data-pk="#:id#">
									<span style="cursor: pointer;" class="">#=getTextDIS(digitalIssueStatus)#</span>
								</td>

								<td class="text-center">
									<a href="javascript:;" style="color: blue; " data-pk="#:dossierId#" onclick="selectHoSoTable(this)">Xem chi tiết hồ sơ</a>
									#if(digitalIssueStatus == 6) {#
										<br>
										<a href="javascript:;" style="color: blue;" data-pk="#:id#" onclick="suggestEditAnChi(this)">Y/C cập nhật</a>
									#}#
									#if(digitalIssueStatus == 9) {#
										<br>
										<a href="javascript:;" style="color: blue;" data-pk="#:id#" onclick="acceptUpdateAnChi(this)">Hoàn thành</a>
									#}#
								</td>


							</tr>
						</script>
						</table>
					</div>
					<div style="width: 100%; height: 30px; display: flex;justify-content: space-between;">
						<div><span style="font-style: italic;color: #939393;"> Tổng số hồ sơ tìm thấy:</span><span style="color: red;font-style: small;" id="totalHoSo"></span></div>
					</div>
                </div>
                <div>
                	
                	
                	<#-- <button type="button" id="btn-import" class="btn btn-active PL5">Import Excel</button>
                	<button type="button" class="btn btn-active PL5">Export Excel</button>
                	<button type="button" class="btn btn-active PL5">In phiếu</button>
                	<button type="button" class="btn btn-active PL5">Báo hỏng, báo mất</button>
                	<button type="button" id="btn-cauhinh" class="btn btn-active PL5">Cấu hình phôi XCG</button> -->
					<#-- <div style="width:100%; display: flex; justify-content: center;">
						<button type="button" id="btn-import" class="btn btn-active">Import Excel</button>
					</div>
					<div style="width:100%; display: flex; justify-content: center;">
						<button type="button" class="btn btn-active">Export Excel</button>
					</div>
					<div style="width:100%; display: flex; justify-content: center;">
						<button type="button" class="btn btn-active">In phiếu</button>
					</div>
					<div style="width:100%; display: flex; justify-content: center;">
						<button type="button" class="btn btn-active">Báo hỏng, báo mất</button>
					</div>
					<div style="width:100%; display: flex; justify-content: center;">
						<button type="button" id="btn-cauhinh" class="btn btn-active">Cấu hình phôi XCG</button>
					</div>	    -->
                </div>
            </div>
		</div>
		<#--	-->
		<#-- <div id="wrapMain" class="table-responsive">
			<div style="display: flex;align-items: center;"><div class="triangle-right"></div><strong>Danh sách xe</strong></div>
			<div style="width: 100%;">
				<div class="filter-group" style="width: 20%;">
					<label for="noGCN">Số GCN</label>
					<input type="text" class="form-control" id="noGCN" >
				</div>
				<div class="filter-group" style="width: 20%;">
					<label for="noGCN">Trạng thái</label>
					<select class="form-control" id="">
						<option>Đã in</option>
						<option>Chưa in</option>
					</select>
				</div>
			</div>
			<div style="width: 100%; display: flex;">
				<table class="table table-bordered M0" style="width:50%">
					<thead>
						<tr>
							<th>
								<span>Chọn</span><input type="checkbox" >
							</th>
							<th class="text-center hover-pointer">
								<span>STT</span>
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
								
							</th>
						</tr>
					</thead>
					<tbody id="danhSach">
				
					</tbody>
				</table>
				<div id="preview" style="width: 50%; border-left: 0.5px solid;">
					<div style="width: 100%;margin-left:15px;display:flex;">
						<strong style="margin-right: 5px;">Xem bản thảo: </strong>
						<input type="radio" name="previewBanThao" value="PDF" style="margin-left: 5px;">PDF
						<input type="radio" name="previewBanThao" value="HTML" style="margin-left: 5px;">HTML
					</div>
					<object id="viewPDF" data="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" style="width:100%; height: 400px;">
						<embed src="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" />
					</object>
					<div id="viewHTML" style="position: relative;">

					</div>
				</div>
			</div>


		</div> -->
		<div class="footerListProfile row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
			<div class="clearfix align-middle" style="float: right">
				<#-- <span class="text-light-gray MR15"><i>Tổng số <span id="totalItem_dossierList" class="red"></span> kết quả được tìm thấy</i></span> -->
				<#-- <span class="show-per-page MT0">Hiển thị
					<span class="select-wrapper">
						<select class="ML5" id="itemPpage" style="background-color: #ffffff">
							<option value="10">10</option>
							<option value="20">20</option>
							<option value="50">50</option>
							<option value="100">100</option>
						</select>
					</span>
				</span> -->
				<span id="pagerChoInPhieuXX" class="M0 P0" style="background: #ffffff"></span>
				<#-- <span id="pagerProfile" class="M0 P0" data-role="pager" data-info="false" data-bind="source: dataSourceProfile, events:{change: stylePager}" data-button-count="10" style="background: #ffffff" data-auto-bind="false"></span> -->
			</div>	
		</div>
</div>
<script>

	$('#doituongFilterChoInPhoi').val('XCG')
	function getTextVehicleClass(data) {
		if (!data) {
			return ''
		}
		if (data == 'XCG') {
			return 'Xe cơ giới'
		} else if (data == 'XMY') {
			return 'Xe mô tô, xe gắn máy'
		} else if (data == 'XDD') {
			return 'Xe đạp điện'
		} else if (data == 'XCN') {
			return 'Xe chở người 4 bánh'
		} else if (data == 'XCH') {
			return 'Xe chở hàng 4 bánh'
		} else {
			return ''
		}
	}
	function getTextIssueType(data) {
		if (!data) {
			return ''
		}
		if (data == '1') {
			return 'Cấp mới lần đầu'
		} else if (data == '4') {
			return 'Cấp thay thế'
		} else if (data == '3') {
			return 'Cấp thay thế (cho phiếu mất)'
		} else if (data == '2') {
			return 'Cấp thay thế (đổi phiếu hỏng)'
		} else {
			return ''
		}
	}
	function getTextDIS(data) {
		if (!data) {
			return ''
		}
		if (data == '5') {
			return 'Y/C cập nhật'
		} else if (data == '6') {
			return 'Hoàn thành'
		} else if (data == '9') {
			return 'Chưa hoàn thành'
		} else {
			return ''
		}
	}
	function selectHoSo(dossierNo) {
		manageDossier.navigate("/danh-sach-xe-cho-in-phieu-xuat-xuong/" + dossierNo);
	}
	function selectHoSoTable (event) {
		var dossierId = $(event).attr('data-pk');
		manageDossier.navigate("/danh-sach-xe-cho-in-phieu-xuat-xuong/" + dossierId);
	}
	function suggestEditAnChi (event) {
		var id = $(event).attr('data-pk');
		var cf = fnConfirm("Thông báo",
            "Bạn có muốn yêu cầu sửa đổi ấn chỉ",
            "OK", "Thoát",
            function () {
                
				$.ajax({
					url: '/o/rest/vr-app/issue/' + id + '/5',
					type: "PUT",
					headers: {
						groupId: 55217,
						Accept: 'application/json'
					},
					success: function(success) {
						dataSourceDsXeChoInPhieuXX.read();
					}
				});

            }, function () {

            });

        cf.open();
	}
	function acceptUpdateAnChi (event) {
		var id = $(event).attr('data-pk');
		//manageDossier.navigate("/danh-sach-xe-cho-in-phieu-xuat-xuong/" + dossierId);
		var cf = fnConfirm("Thông báo",
            "Bạn có muốn hoàn thành cập nhật sê ri phiếu",
            "OK", "Thoát",
            function () {
                
				$.ajax({
					url: '/o/rest/vr-app/issue/' + id + '/6',
					type: "PUT",
					headers: {
						groupId: 55217,
						Accept: 'application/json'
					},
					success: function(success) {
						dataSourceDsXeChoInPhieuXX.read();
					}
				});

            }, function () {

            });

        cf.open();
	}
	// function getDSHoSo () {

	// 	var Url = '/o/rest/vr-app/issue/find/data'
	// 	var appliedDateFrom = document.getElementById("ngayhoSoTuFilterChoInPhoi").value
	// 	var appliedDateFromFormat = ''
	// 	if(appliedDateFrom){
	// 		var tmp = appliedDateFrom.split('-')
	// 		appliedDateFromFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
	// 	}

	// 	var appliedDateTo = document.getElementById("ngayhoSoDenFilterChoInPhoi").value
	// 	var appliedDateToFormat = ''
	// 	if(appliedDateTo){
	// 		var tmp2 = appliedDateTo.split('-')
	// 		appliedDateToFormat = tmp2[2] + '/' + tmp2[1] + '/' + tmp2[0]
	// 	}
	// 	$.ajax({
	// 		url: Url,
	// 		type: "GET",
	// 		data: {
	// 			dossierNo: $('#soHoSoFilterChoInPhoi').val(),
	// 			vehicleClass: $('#doituongFilterChoInPhoi').val(),
	// 			certifiedAssemblyType: $('#loaiHinhFilterChoInPhoi').val(),
	// 			applicantIdNo: "${(registration.applicantCode)!}",
	// 			productionPlantCode: $('#nhaXuongFilterChoInPhoi').val(),
	// 			methodOfIssue: $('#phuongThucFilterChoInPhoi').val(),
	// 			issueType: $('#loaiHoSoFilterChoInPhoi').val(),
	// 			appliedDateFrom: appliedDateFromFormat || '',
	// 			appliedDateTo: appliedDateToFormat || '',
	// 			start: -1,
	// 			end: -1
	// 		},
	// 		success: function (success) {
	// 			var html = '';
	// 			for(var i=0; i< success.data.length; i++){
	// 				html += '<tr class="rowTable">'
	// 						// +	'<td class="text-center"><input type="radio" name="radioHoSo" onclick="selectHoSo('+success.data[i].id+')"></td>'
	// 						+	'<td class="text-center" data-pk="' + success.data[i]['dossierId'] + '" onclick="selectHoSoTable(this)">'+ (success.data[i]['dossierId'] ? success.data[i]['dossierNo'] : '') + '</td>'
	// 						+	'<td class="text-center">'+ (success.data[i]['appliedDate'] ? success.data[i]['appliedDate'] : '') + '</td>'
	// 						+	'<td class="text-center">'+ getTextVehicleClass(success.data[i]['vehicleClass']) + '</td>'
	// 						+	'<td class="text-center">'+ getTextIssueType(success.data[i]['issueType']) + '</td>'
	// 						+	'<td class="text-center">'+ (success.data[i]['totalInDocument'] ? success.data[i]['totalInDocument'] : 0) + '</td>'
	// 						+	'<td class="text-center">'+ (success.data[i]['totalInUse'] ? success.data[i]['totalInUse'] : 0) + '</td>'
	// 						+	'<td class="text-center" data-pk="' + success.data[i]['dossierId'] + '"><a data-pk="' + success.data[i]['dossierId'] + '" href="javascript:;" style="color: blue;" onclick="selectHoSoTable(this)">Xem</a></td>'
	// 						+	'</tr>'
	// 					}
	// 					console.log(html)
	// 					document.getElementById("danhSachHoSoFilter").innerHTML = html
	// 					$("#profileStatusAnChi li[dataPk='choinPhieuXX'] .bagde").html(success['total']);
	// 					document.getElementById("totalHoSo").innerHTML = success['total']

	// 				},
	// 			});	
	// }
	$(function () {
		
		
		
		// getDSHoSo ()

		function getLoaiHinhSX(){
			if (!$('#doituongFilterChoInPhoi').val()) {
				console.log('ko có đối tượng')
				return
			}
			var tmp = $('#doituongFilterChoInPhoi').val();
			if (tmp == 'XCG') {
				tmp = 'PXXXCG'
			}
			// /o/rest/v2/dictcollections/VR77/dictgroups/PXXXCG/dictitems
			$.ajax({
				url: '/o/rest/v2/dictcollections/VR77/dictgroups/' + tmp + '/dictitems',
				type: "GET",
				headers: {
					groupId: 55217,
					Accept: 'application/json'
				},
				success: function(success) {
					var dictGroups = success['data'] ? success['data'] : []
					var select = document.getElementById("loaiHinhFilterChoInPhoi");
					var option = document.createElement("option");
					option['text'] = '';
					option['value'] = '';
					select.appendChild(option);
					dictGroups.forEach(function(item){
						var option = document.createElement("option");
						option['text'] = item['itemName'];
						option['value'] = item['itemCode'];
						select.appendChild(option);
					})
				},
			})
		}

		

		function getNhaXuong () {
			$.ajax({
				url: '/o/rest/vr-app/production/plant/search',
				type: "GET",
				data: {
					start: -1,
					end: -1,
					mtCore: 1,
					applicantcode: "${(registration.applicantCode)!}"
				},
				headers: {
					groupId: 55217,
					Accept: 'application/json'
				},
				success: function(success) {
					var dictGroups = success['data'] ? success['data'] : []
					var select = document.getElementById("nhaXuongFilterChoInPhoi");
					var option = document.createElement("option");
					option['text'] = '---';
					option['value'] = '';
					select.appendChild(option);
					dictGroups.forEach(function(item){
						var option = document.createElement("option");
						option['text'] = item['productionPlantName'];
						option['value'] = item['productionPlantCode'];
						select.appendChild(option);
					})
				},
			})
		}

		var dataSourceDsXeChoInPhieuXX = new kendo.data.DataSource({
			transport: {
				read: function (options) {
					var Url = '/o/rest/vr-app/issue/find/data'
					var appliedDateFrom = document.getElementById("ngayhoSoTuFilterChoInPhoi").value
					var appliedDateFromFormat = ''
					if(appliedDateFrom){
						var tmp = appliedDateFrom.split('-')
						appliedDateFromFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
					}

					var appliedDateTo = document.getElementById("ngayhoSoDenFilterChoInPhoi").value
					var appliedDateToFormat = ''
					if(appliedDateTo){
						var tmp2 = appliedDateTo.split('-')
						appliedDateToFormat = tmp2[2] + '/' + tmp2[1] + '/' + tmp2[0]
					}

					console.log('options+++++++++', options['data'])
					$.ajax({
						url : Url,
						dataType : "json",
						type : "GET",
						headers : {"groupId": "${groupId}"},
						data : {
							dossierNo: $('#soHoSoFilterChoInPhoi').val(),
							vehicleClass: $('#doituongFilterChoInPhoi').val(),
							certifiedAssemblyType: $('#loaiHinhFilterChoInPhoi').val(),
							applicantIdNo: "${(registration.applicantCode)!}",
							productionPlantCode: $('#nhaXuongFilterChoInPhoi').val(),
							methodOfIssue: $('#phuongThucFilterChoInPhoi').val(),
							issueType: $('#loaiHoSoFilterChoInPhoi').val(),
							appliedDateFrom: appliedDateFromFormat || '',
							appliedDateTo: appliedDateToFormat || '',
							start: options['data']['start'] || 0,
							end: options['data']['end'] || 20
						},
						success : function (result) {
							if (!result['data']) {
								result = {
									data: [],
									total: 0
								}
							}
							options.success(result);
							$("#totalItem_dossierList").html(result['total'] || 0);
							document.getElementById("totalHoSo").innerHTML = result['total']
						},
						error : function (result) {
							options.error(result);
							$("#totalItem_dossierList").html(0);
							document.getElementById("totalHoSo").innerHTML = result['total']
						}
					});
				}
			},
			serverPaging: true,
			pageSize: parseInt($('#itemPpageDsAnChi').val() || 20),
			schema: {
				data: "data",
				total: "total",
				model: {
					id: "id"
				}
			}
		});

		var count = 0 ;
		$("#danhSachHoSoFilter").kendoListView({
			dataSource: dataSourceDsXeChoInPhieuXX,
			autoBind: false,
			change: function () {

			},
			template: function (data) {
				count ++;
				data['count'] = count;
				return kendo.template($("#dsXeCHoInPhieuXXTemplate").html())(data);
			},
			dataBound: function () {
				//count = 0;
			}
		});
		dataSourceDsXeChoInPhieuXX.read();

		var pager = $("#pagerChoInPhieuXX").kendoPager({
			dataSource: dataSourceDsXeChoInPhieuXX,
			pageSizes: false,
			info: false,
			change: function (e) {
				var page = e['index'] || 1;
				var start = (page - 1) * 20;
				var end = (page - 1) * 20 + 20;
				count = start - 20;
				dataSourceDsXeChoInPhieuXX.read({
					start: start,
					end: end
				})
				console.log("pager change event", page, start, end);
			},
			messages: {
				display: "Tổng số {2} bản ghi",
				itemsPerPage: "Số bản ghi 1 trang"
			}
		});

		getNhaXuong();

		getLoaiHinhSX();

		$('#doituongFilterChoInPhoi').change(function () {
			$('#loaiHinhFilterChoInPhoi').empty();
			getLoaiHinhSX()
		})

		$('#timKiemHsPXX').click(function () {
			dataSourceDsXeChoInPhieuXX.read({
				start: 0,
				end: 20
			});
			dataSourceDsXeChoInPhieuXX.page(1);
		})
		
		
		$('#toDanhSachXeTest').click(function () {
			selectHoSo(1233)
		})

		function fullScreen(){
			$("#fullScreen").children().toggle();
			$("#panel_list").toggle();
			$("#mainType2").toggleClass("col-sm-10","col-sm-12");

		}
	})
	
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
    .table-hoso-filter{
        width: 100%;
        border: 0.5px solid;
		max-height: 200px;
    	overflow: scroll;
    }
    .table-hoso-filter th, .table-hoso-filter td{
        border-right: 0.5px solid;
        border-bottom: 0.5px solid;
    }
    .table-hoso-filter tr th:last-child, .table-hoso-filter tr td:last-child{
        border-right: 0px solid;
       
    }
    .table-hoso-filter tr:last-child td{
        border-bottom: 0px solid;
    }
	.triangle-right {
		width: 0;
		height: 0;
		border-top: 7px solid transparent;
		border-left: 21px solid #4e839d;
		border-bottom: 6px solid transparent;
	}
	.k-dialog .k-dialog-buttongroup.k-dialog-button-layout-normal {
		display: flex;
		justify-content: flex-end;
	}
	.k-window{
		box-shadow: -1px 5px 12px 12px rgba(128,128,128,.3)!important;
	}

</style>
