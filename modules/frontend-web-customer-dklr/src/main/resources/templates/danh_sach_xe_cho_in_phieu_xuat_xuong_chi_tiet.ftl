<#if (Request)??>
<#include "init.ftl">
	
</#if>
<div id="contentMain" class="row panel M0" style="border: none;box-shadow: none">
	<div id="wrapMain" class="table-responsive">

			<div id="dialogChiTietXe" class="modal fade" role="dialog">
				<div class="modal-dialog">

					<!-- Modal content-->
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title">Xem trước PDF</h4>
						</div>
						<div class="modal-body">
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

				</div>
			</div>

			<div class="row PL15 PR15">
				<div class="row-header align-middle-lg" style="justify-content: space-between;align-items: center;line-height: 32px;">
					<div>
						<div class="background-triangle-big">
							<i class="fa fa-file-text"></i>
						</div>
						<span class="text-bold" id="statusName" style="text-transform:uppercase;">Danh sách </span> <span class="text-bold" id="vehicleClassDsXeChiTiet"></span> &nbsp;&nbsp;&nbsp;
						<#if registration?has_content>
							
						<#else>
							<span class="text-bold red" style="text-transform:uppercase;"></span>
						</#if>
					</div>
					<div>

						<a class="PL5 PR5 hover-pointer no-icon" href="javascript:;" onclick="quayLai()">Quay lại</a>

						<#-- <a class="PL5 PR5 hover-pointer no-icon" href="#searchAdvancedCollapse1" data-toggle="collapse">Nâng cao</a> -->

						<span id="fullScreen" onclick="fullScreen()">
							<i class="fa fa-expand fs20 toggle-collapse MR10 ML10" aria-hidden="true"></i>
							<i class="fa fa-compress fs20 MR10 ML10" aria-hidden="true" style="display: none"></i>
						</span>
					</div>
				</div>
			</div>
			<div>
				
				<#-- <div class="triangle-right"></div><strong>Danh sách xe</strong></div> -->
			<div style="width: 100%;">
				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Số GCN</label>
					<input type="text" class="form-control" id="soGCNFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Năm GCN</label>
					<input type="text" class="form-control" id="namGCNFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Ngày cấp từ</label>
					<input type="date" class="form-control" id="ngayCapTuFilterXe" >
				</div>

				<div class="filter-group" style="width: 22%;">
					<label for="noGCN">Đến</label>
					<input type="date" class="form-control" id="ngayCapDenFilterXe" >
				</div>

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
					<label for="noGCN">Số seri</label>
					<input placeholder="Số phát hành CQQLCL" type="text" class="form-control" id="soPhatHanhCQQLCLFilterXe">
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Số PXX</label>
					<input type="text" class="form-control" id="soPxxFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
					<label for="noGCN">Ngày XX từ</label>
					<input type="date" class="form-control" id="ngayXXTuFilterXe" >
				</div>

				<div class="filter-group" style="width: 22%;">
					<label for="noGCN">Đến</label>
					<input type="date" class="form-control" id="ngayXXDenFilterXe" >
				</div>

				<div class="filter-group" style="width: 25%;">
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
				</div>
				<div class="filter-group" style="width: 10%;">
					<a href="https://www.neodynamic.com/downloads/jspm/jspm-4.0.0.0-win.exe" target="_blank" style="color: blue;">Tải thư viện</a>
				</div>
				
				<div style="width: 100%; display: flex; align-items: center; justify-content: center;" class="">
					<input type="file" style="display: none;"  id="fileMauInXe"/>
					<button type="button" id="btn-import" class="btn btn-active PL5" onclick="getDSXe()">Tìm kiếm</button>
					<button type="button" id="btn-import" class="btn btn-active PL5" onclick="inPhieu()">In phiếu</button>
					<!-- <button type="button" id="btn-import" class="btn btn-active PL5">Báo hỏng, mất</button> -->
					<button type="button" id="btn-cap-nhat-so-seri" disabled class="btn btn-active PL5" onclick="capNhatSoSeri()">Cập nhật số seri</button>
					<button type="button" id="btn-hoan-thanh-cap-nhat-so-seri" class="btn btn-active PL5" style="font-weight: bold !important; background-color: #1f1f9d !important;" onclick="hoanThanhCapNhatSoSeri()">Hoàn thành cập nhật số seri</button>
					<!-- <button type="button" id="btn-import" class="btn btn-active PL5" onclick="uploadMauIn()">Cập nhật mẫu mới</button>
					<button type="button" id="btn-import" class="btn btn-active PL5" onclick="taiMauIn()">Tải mẫu in</button>
					<button type="button" id="btn-import" class="btn btn-active PL5" onclick="khoiPhucMauGoc()">Khôi phục mẫu gốc</button> -->
				</div>
			</div>
			<div style="width: 100%; display: flex;">
				<table class="table table-bordered M0">
					<thead>
						<tr>
							<th>
								<#-- <span>Chọn</span> --><input type="checkbox" id="checkboxAllXe">
							</th>
							<th class="text-center hover-pointer">
								<span>STT</span>
							</th>
							<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
								<span>Số GCN </span>
							</th>
							<th class="fieldDossier text-center hover-pointer PL0 PR5" sort-type="desc">
								<span>Ngày cấp </span>
							</th>
							<th class="fieldDossier text-center hover-pointer PL0 PR5" sort-type="desc">
								<span>Ngày xuất xưởng </span>
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
								<strong>Số thùng</strong>
							</th>
							<th class="text-center hover-pointer">
								<strong>Số serial</strong>
							</th>
							<th class="text-center hover-pointer" style="width: 14%;">
								<strong>Hành động</strong>
							</th>
						</tr>
					</thead>
					<tbody id="danhSachXeTable">
					
					</tbody>

					<script type="text/x-kendo-template" id="dsXeCHoInPhieuXXChiTietTemplate">

							<tr class="rowTable">
								<td class="text-center">
									<input type="checkbox" class="checkboxXe" name="radioHoSo" onclick="selectXe(#:vehicleRecordId#, this)"/>
								</td>

								<td data-pk="#:id#" class="text-center count" style="width: 1%; text-align: center;">
									#:count#
								</td>

								<td class="text-center" style="width: 15%" data-pk="#:id#">
									<span style="cursor: pointer;">
										<a href="javascript:;" class="link-detail-employee text-hover-blue">
											#=certificateRecordNo#
										</a>
									</span>

								</td>

								<td class="text-center" style="width: 8%" data-pk="#:id#">
									<p>
										<span style="cursor: pointer;">#=certificateRecordDate#</span>
									</p>

								</td>

								<td class="text-center" style="width: 14%" data-pk="#:id#"> 
									<p>
										<span style="cursor: pointer;">#=productionDate#</span>
									</p>
								</td>

								<td class="text-center" style="width: 10%" data-pk="#:id#">
									<p style="cursor: pointer;">#=frameNo#</p>
								</td>

								<td class="text-center" data-pk="#:id#">
									<span style="cursor: pointer;" class="">#=engineNo#</span>
								</td>

								<td class="text-center" data-pk="#:id#">
									<span style="cursor: pointer;" class="">#=color#</span>
								</td>

								<td class="text-center" data-pk="#:id#">
									<span class="">#=boxNo#</span>
								</td>
								<td class="text-center" data-pk="#:id#">
									<span class="">#=serialNo#</span>
								</td>

								<td class="text-center">
									<a href="javascript:;" style="color: blue;" onclick="inThu(#:vehicleRecordId#)">In thử</a> | 
									<a href="javascript:;" style="color: blue;" onclick="xemTruoc(#:vehicleRecordId#, '#=vehicleClass#')">Xem phiếu XX điện tử</a>
								</td>

							</tr>
						</script>
				</table>
				<#-- <div id="preview" style="width: 50%; border-left: 0.5px solid;">
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
				</div> -->
			</div>

			<div class="footerListProfile row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
				<div class="clearfix align-middle" style="float: right">
					<span class="text-light-gray MR15"><i>Tổng số <span id="totalItem_dossierListDsXe" class="red"></span> kết quả được tìm thấy</i></span>

					<span id="pagerChoInPhieuXXChiTiet" class="M0 P0" style="background: #ffffff"></span>
				</div>	
			</div>


		</div>
		<div id="modalCapNhatSoSeri" class="modal fade" role="dialog">
			<div class="modal-dialog modal-lg">
				
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Cập nhật số seri</h4>
					</div>
					<div class="modal-body">
						<div class="col-sm-12">
							<div id="capNhatXeChoIn">

							</div>

						</div>
						<div class="col-sm-12">
							<button class="btn btn-active ML20" onclick="capNhatSoSeriAction(0)" type="button">Xác nhận</button>
							<button class="btn btn-active ML20" onclick="capNhatSoSeriAction(1)" type="button">Kiểm tra Serial</button>
							<button class="btn" style="margin:0 10px;" data-dismiss="modal">Đóng</button>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="modalKiemTraSoSeri" class="modal fade" role="dialog">
			<div class="modal-dialog modal-lg">
				
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Kiểm tra số seri</h4>
					</div>
					<div class="modal-body">
						<div class="col-sm-12">
							<div id="objectView2">

							</div>

						</div>
						<div class="col-sm-12">
							<button class="btn" style="margin:0 10px;" data-dismiss="modal">Đóng</button>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div id="modalViewPhieuXXDienTu" class="modal fade" role="dialog">
			<div class="modal-dialog modal-lg">
				
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal">&times;</button>
						<h4 class="modal-title">Phiếu xuất xưởng điện tử</h4>
					</div>
					<div class="modal-body">
						<div class="col-sm-12">
							<div id="objectView3">

							</div>

						</div>
						<div class="col-sm-12">
							<button class="btn" style="margin:0 10px;" data-dismiss="modal">Đóng</button>
						</div>
					</div>
				</div>
			</div>
		</div>

		<#-- <div id="modalCapNhatSoSeri" class="modal-cps" style="display: block;">
			<div class="modal-cps-content">
				<div class="modal-cps-header"> 
					<span style="font-size: 18px;">Cập nhật số seri</span>
					<span class="close close-cps">×</span>
				</div>
				<div class="modal-cps-body">
					
					<div id="capNhatXeChoIn" style="max-height: 400px; overflow: auto;" class="jexcel_container">

					</div>
				</div>
				<div class="modal-footer">
					<button class="btn btn-active ML20" onclick="capNhatSoSeriAction()" type="button">Xác nhận</button>
					<button type="button" class="btn btn-default close-cps">Đóng</button>
				</div>
			</div>
		</div> -->
		
</div>

<style>
	.jexcel > thead > tr > td {
		min-width: 100px;
	}
	.jexcel > tbody > tr > td {
		min-width: 100px;
	}
</style>

<script>
	var dataJexcel = [
		[]
	];
	var columns = [
		{
			type: 'text',
			title:'Số khung',
			readOnly: true,
			width:120
		},
		{
			type: 'text',
			title:'Số động sơ',
			readOnly: true,
			width:140
		},
		{
			type: 'text',
			title:'Màu sơn',
			readOnly: true,
			width:120
		},
		{
			type: 'text',
			title:'Số thùng',
			readOnly: true,
			width:140
		},
		{
			type: 'text',
			title:'Ngày xuất xưởng',
			readOnly: true,
			width:140
		},
		{
			type: 'text',
			title:'Số seri',
			width:130
		}
	]

	function showJexcel (data) {
		jexcel(document.getElementById('capNhatXeChoIn'), {
			data: data,
			columns: columns
		});
	}
		var listSelectXe = [];
		var listXe  = [];
		var	groupId = window.themeDisplay.getScopeGroupId()
		var resHs = null

		function convertSelectXeToJexcel () {
			var data = [];
			console.log('listSelectXe+++++++++++', listSelectXe)
			if (listSelectXe && listSelectXe['length']) {
				for (var i = 0; i <  listSelectXe['length']; i++) {
					var tmp = listSelectXe[i];
					var tmpArr = [];
					// tmpArr.push(tmp['certificaterecordno'])
					// tmpArr.push(tmp['certificateRecordDate'])
					
					tmpArr.push(tmp['frameNo'])
					tmpArr.push(tmp['engineNo'])
					tmpArr.push(tmp['color'])
					tmpArr.push(tmp['boxNo'])
					tmpArr.push(tmp['productionDate'])
					tmpArr.push(tmp['serialNo'])
					// tmpArr.push(tmp['certificateRecordNo'])
					data.push(tmpArr)
				}
			} else {
				data = [[]]
			}
			return data
			console.log('dataJexcel+++++++++++', data)
		}

		function convertSelectXeToJexcelError () {
			var data = [];
			console.log('listSelectXe+++++++++++', listSelectXe)
			if (listSelectXe && listSelectXe['length']) {
				for (var i = 0; i <  listSelectXe['length']; i++) {
					var tmp = listSelectXe[i];
					var tmpArr = [];
					// tmpArr.push(tmp['certificaterecordno'])
					// tmpArr.push(tmp['certificateRecordDate'])
					
					tmpArr.push(tmp['frameNo'])
					tmpArr.push(tmp['engineNo'])
					tmpArr.push(tmp['color'])
					tmpArr.push(tmp['boxNo'])
					tmpArr.push(tmp['productionDate'])
					tmpArr.push(tmp['serialNo'])
					// tmpArr.push(tmp['certificateRecordNo'])
					if (tmp && tmp['type'] == 1 && tmp['stampStatus'] != 0) {
						tmpArr.push('Số serial đã sử dụng');
					} else if (tmp && tmp['type'] == 0) {
						tmpArr.push('Số serial không tồn tại');
					} else {
						tmpArr.push('');
					}
					// if (tmp['stampStatus'] != 0 && tmp['stampStatus'] != null) {
					// 	tmpArr.push('Số serial đã sử dụng');
					// } else if (tmp['stampStatus'] == null) {
					// 	tmpArr.push('Số serial không tồn tại');
					// } else {
					// 	tmpArr.push('');
					// }
					data.push(tmpArr)
				}
			} else {
				data = [[]]
			}
			return data
			console.log('dataJexcel+++++++++++', data)
		}

	function convertJexcelToXe () {
		var data = []
		dataJexcel = $('#capNhatXeChoIn').jexcel('getData');
		if (dataJexcel && dataJexcel['length']) {
			for (var i = 0; i <  dataJexcel['length']; i++) {
				var tmpArr = dataJexcel[i];
				var tmp = {};
				// tmp['certificaterecordno'] = tmpArr[0];
				// tmp['certificateRecordDate'] = tmpArr[1];
				
				tmp['frameNo'] = tmpArr[0];
				tmp['engineNo'] = tmpArr[1];
				tmp['color'] = tmpArr[2];
				tmp['boxNo'] = tmpArr[3];
				tmp['productionDate'] = tmpArr[4];
				tmp['serialNo'] = tmpArr[5];
				data.push(tmp)
			}
		}
		console.log('data+++++++++++', data)
		return data
	}
		function getTextVehicleClass(data) {
			if (!data) {
				return ''
			}
			if (data == 'XCG') {
				return 'XE CƠ GIỚI'
			} else if (data == 'XMY') {
				return 'XE MÔ TÔ, XE GẮN MÁY'
			} else if (data == 'XDD') {
				return 'XE ĐẠP ĐIỆN'
			} else if (data == 'XCN') {
				return 'XE CHỞ NGƯỜI 4 BÁNH'
			} else if (data == 'XCH') {
				return 'XE CHỞ HÀNG 4 BÁNH'
			} else {
				return ''
			}
		}
		function quayLai () {
			manageDossier.navigate("/danh-sach-xe-cho-in-phieu-xuat-xuong");
		}
		function doPrinting (url, fileName) {

		}
		function getDetailHSPXX () {
			var Url = '/o/rest/vr-app/issue/find/data';
			var res = null;
			$.ajax({
				url: Url,
				type: "GET",
				dataType: 'json',
				async: false,
				data: {
					dossierNo: '${(dossier.dossierNo)!}',
					start: 0,
					end: 1
				},
				success: function (success) {
					if (success['data'] && success['data']['length']) {
						res = success['data'][0]

						if (res['digitalIssueStatus'] == 9) {
							$('#btn-cap-nhat-so-seri').prop('disabled', false);
							$('#btn-hoan-thanh-cap-nhat-so-seri').prop('disabled', false);
						} else {
							$('#btn-cap-nhat-so-seri').prop('disabled', true);
							$('#btn-hoan-thanh-cap-nhat-so-seri').prop('disabled', true);
						}
					} else {
						res = null
					}
					
				},
				error: function (xhr) {
					res = null
				}
			});
			return res;	
		}

		// function getDSXe () {
		// 	document.getElementById("danhSachXeTable").innerHTML = '<tr><td colspan="7" class="text-center PT5 PB5">Đang tải dữ liệu vui lòng chờ....</td></tr>'
		// 	var Url = '/o/rest/vr-app/getDataGCN'
		// 	var currentDate = new Date()
		// 	var currentDateStr = currentDate.getFullYear() + '-' + String((currentDate.getMonth() + 1)).padStart(2, '0') + '-' + String(currentDate.getDate()).padStart(2, '0')

		// 	var prev3Year = new Date();
		// 	prev3Year.setFullYear(prev3Year.getFullYear() - 3);
		// 	var prev3DateStr = prev3Year.getFullYear() + '-' + String((prev3Year.getMonth() + 1)).padStart(2, '0') + '-' + String(prev3Year.getDate()).padStart(2, '0')

		// 	console.log('currentDateStr++++++++++', currentDateStr)
		// 	console.log('prev3DateStr++++++++++', prev3DateStr)

		// 	var certificateRecordDateFrom = document.getElementById("ngayCapTuFilterXe").value
		// 	var certificateRecordDateFromFormat = ''
		// 	if (certificateRecordDateFrom) {
		// 		var tmp = certificateRecordDateFrom.split('-')
		// 		certificateRecordDateFromFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
		// 	} else {
		// 		$('#ngayCapTuFilterXe').val(prev3DateStr)
		// 	}
			

		// 	var certificateRecordDateTo = document.getElementById("ngayCapDenFilterXe").value
		// 	var certificateRecordDateToFormat = ''
		// 	if (certificateRecordDateTo) {
		// 		var tmp2 = certificateRecordDateTo.split('-')
		// 		certificateRecordDateToFormat = tmp2[2] + '/' + tmp2[1] + '/' + tmp2[0]
		// 	} else {
		// 		$('#ngayCapDenFilterXe').val(currentDateStr)
		// 	}
			
			

		// 	var ngayXXTuFilterXe = document.getElementById("ngayXXTuFilterXe").value
		// 	var ngayXXTuFilterXeFormat = ''
		// 	if (ngayXXTuFilterXe) {
		// 		var tmp3 = ngayXXTuFilterXe.split('-')
		// 		ngayXXTuFilterXeFormat = tmp3[2] + '/' + tmp3[1] + '/' + tmp3[0]
		// 	} else {

		// 	}
			
			
		// 	var ngayXXDenFilterXe = document.getElementById("ngayXXDenFilterXe").value
		// 	var ngayXXDenFilterXeFormat = ''
		// 	if (ngayXXDenFilterXe) {
		// 		var tmp4 = ngayXXDenFilterXe.split('-')
		// 		ngayXXDenFilterXeFormat = tmp4[2] + '/' + tmp4[1] + '/' + tmp4[0]
		// 	} else {
		// 		$('#ngayXXDenFilterXe').val(currentDateStr)
		// 	}
		// 	resHs = getDetailHSPXX()
		// 	var vehicleClass = resHs ? resHs['vehicleClass'] : ''
		// 	var vehicleClassText = getTextVehicleClass(vehicleClass);
		// 	$('#vehicleClassDsXeChiTiet').html(vehicleClassText)
		// 	console.log('resHs+++++++++++++', resHs)
		// 	$.ajax({
		// 		url: Url,
		// 		type: "GET",
		// 		dataType: 'json',
		// 		data: {
		// 			applicantIdNo: "${(registration.applicantCode)!}",
		// 			vehicleClass: resHs ? resHs['vehicleClass'] : 'XCG',
		// 			issueId: resHs ? resHs['id'] : '',
		// 			certificateRecordNo: $('#soGCNFilterXe').val().trim(),
		// 			certificateYear: $('#namGCNFilterXe').val().trim(),
		// 			certificateRecordDateFrom: certificateRecordDateFromFormat,
		// 			certificateRecordDateTo: certificateRecordDateToFormat,
		// 			productionDateFrom: ngayXXTuFilterXeFormat,
		// 			productionDateTo: ngayXXDenFilterXeFormat,
		// 			productionNumber: $('#soPxxFilterXe').val().trim(),
		// 			frameNo: $('#soKhungFilterXe').val().trim(),
		// 			engineNo: $('#soDongCoFilterXe').val().trim(),
		// 			serialNo: $('#soPhatHanhCQQLCLFilterXe').val().trim(),
		// 			color: $('#mauSonPxxFilterXe').val().trim(),
		// 			postPrintingStatus: $('#trangThaiPhieuFilterXe').val().trim(),
		// 			printingStatus: $('#trangThaiInFilterXe').val().trim()
		// 			// vehicleRecordStatus: $('#vehicleRecordStatus').val()
		// 		},
		// 		success: function (success) {
		// 			var html = '';
		// 			if (!success) {
		// 				document.getElementById("danhSachXeTable").innerHTML = ''
		// 				return;
		// 			}
		// 			listXe = success['data'].slice()
		// 			if (!success) {
		// 				document.getElementById("danhSachXeTable").innerHTML = ''
		// 				// document.getElementById("totalHoSo").innerHTML = 0
		// 				return;
		// 			}
		// 			for(var i=0; i < success['data'].length; i++){
		// 				html += '<tr class="rowTable">'
		// 					+	'<td class="text-center"><input type="checkbox" class="checkboxXe" name="radioHoSo" onclick="selectXe('+ success['data'][i]['vehicleRecordId'] +', this)"></td>'
		// 						+	'<td class="text-center">'+ (i + 1) + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['certificaterecordno'] + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['certificateRecordDate'] + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['productionDate'] + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['frameNo'] + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['engineNo'] + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['color'] + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['boxNo'] + '</td>'
		// 						+	'<td class="text-center">'+ success['data'][i]['serialNo'] + '</td>'
		// 						+	'<td class="text-center"> <a style="color: blue;" href="javascript:;" onclick="inThu(' + success['data'][i]['vehicleRecordId'] + ')">In thử</a> | <a style="color: blue;" href="javascript:;" onclick="xemTruoc(' + success['data'][i]['vehicleRecordId'] + ')">Xem trước</a></td>'
		// 					+	'</tr>'
		// 			}
		// 			document.getElementById("danhSachXeTable").innerHTML = html
		// 			document.getElementById("totalItem_dossierListDsXe").innerHTML = success['total']
		// 		},
		// 	});	
		// }
		
		function fullScreen () {
			$("#fullScreen").children().toggle();
			$("#panel_list").toggle();
			$("#mainType2").toggleClass("col-sm-10","col-sm-12");
		}

		function checkTrungSoSeri (array) {
			var flag = false;
			for (var i = 0; i < array['length'] - 1; ++i) {
				for (var j = i + 1; j < array['length']; ++j) {
					if (array[i]['serialNo'] == array[j]['serialNo']) {
						flag = true;
						alert("Số seri " + array[i]['serialNo'] + " bị trùng, vui lòng kiểm tra lại!");
						return flag;
					}
				}
			}
			return flag;
		}

		function checkError (data) {
			if (!data || !data['length']) {
				return false;
			}
			for (var i = data.length - 1; i >= 0; i--) {
				
				if (data[i] && data[i]['type'] == 1 && data[i]['stampStatus'] != 0) {
					// số serial đã đc sử dụng
					return true;
				} else if (data[i] && data[i]['type'] == 0) {
					// số serial không tồn tại
					return true;
				}
				return false
			}
			return false;
		}

		function capNhatSoSeriAction (isCheck) {
			if (isCheck == 1) {
				$("#objectView2").html("Đang tải dữ liệu....");
			}
			var data = convertJexcelToXe();
			if (!data || !data['length']) {
				console.log('ko có xe nào đc chọn')
				notification.show({
					message: "Không có xe nào đc chọn!"
				}, "error");
				$('#modalCapNhatSoSeri').modal('hide');
				return;
			}
			data.forEach(function (itemXe) {
				listSelectXe.forEach(function (itemXeSelect) {
					if (itemXe['frameNo'] == itemXeSelect['frameNo'] && itemXe['engineNo'] == itemXeSelect['engineNo'] && itemXe['color'] == itemXeSelect['color']) {
						itemXe['vehicleRecordId'] = itemXeSelect['vehicleRecordId'];
						itemXe['productionDate'] = itemXeSelect['productionDate'];
						itemXe['certificateRecordNo'] = itemXeSelect['certificateRecordNo'];
					}
				})
			})
			console.log('data PUTTTTTTT', data)
			var Url = '/o/rest/vr-app/inputstampbookdetails/record/update/${(dossierId)!}/' + isCheck + '?isInPhieu=1'
			$.ajax({
                'headers': {
                    "groupId": Liferay.ThemeDisplay.getScopeGroupId()
                },
				'url': Url,
				'data': JSON.stringify(data),
				'type': 'PUT',
				'processData': false,
				'contentType': 'application/json',
				success: function (success) {
					if (isCheck == 1) {
						var fileEntryId = success['fileEntryId'];
						if (!fileEntryId || fileEntryId == '0') {
							console.log('fileEntryId', fileEntryId);
							$('#modalKiemTraSoSeri').modal('hide');
							return;
						}
						var urlRes = success['fileURL'];
						$('#modalKiemTraSoSeri').modal('show');
						var url = '/o/rest/v2/dossiers/fileEntryId/' + fileEntryId
						$.ajax({
							url: url,
							method: 'GET',
							data: {
							},
							success: function (data, status, xhr) {
								if (data) {
									//var urlRes = window.URL.createObjectURL(blob);
									$("#objectView2").html("");
									$("#objectView2").append('<iframe src="'+urlRes+'" width="100%" style="height:100vh">    </iframe>');
								}
							},
							error: function (xhr) {
								console.log(xhr);
								$('#modalKiemTraSoSeri').modal('hide');
							}
						})
						return;
					}
					if (checkError(success['VR_InputStampbookDetails'])) {
						notification.show({
							message: "Số seri bị lỗi, vui lòng kiểm tra lại!"
						}, "error");
						$('#capNhatXeChoIn').html('');
						listSelectXe = success['VR_InputStampbookDetails'] || [];
						var findIndex = columns.findIndex(function (item) {
							return item['title'] == '#'
						});
						if (findIndex == -1) {
							columns.push({
								type: 'text',
								title:'#',
								width: 210
							});
						}
						var dataJexcel = convertSelectXeToJexcelError();
						showJexcel(dataJexcel);
						$('table[class="jexcel"] > tbody').children().find("[data-x=6]").css('background-color', 'red');
						// table.setStyle('A1', 'background-color' , 'red');
					} else {
						notification.show({
							message: "Yêu cầu được thực hiện thành công"
						}, "success");
						for (var i = columns.length - 1; i >= 0; i--) {
							if (columns[i]['title'] == '#') {
								columns.splice(i, 1);
							}
						}
						$('table[class="jexcel"] > tbody').children().find("[data-x=6]").css('background-color', '');
						$('#modalCapNhatSoSeri').modal('hide');
						listSelectXe = [];
						$('.checkboxXe').prop('checked', false);
						dataSourceDsXeChoInPhieuXXChiTiet.read({
							start: 0,
							end: 500
						});
						dataSourceDsXeChoInPhieuXXChiTiet.page(1);
						// getDSXe();
					}
				},
				error: function (xhr) {
					notification.show({
						message: "Thực hiện không thành công, xin vui lòng thử lại"
					}, "error");
					$('#modalKiemTraSoSeri').modal('hide');
				}
			});	
		}

		function capNhatSoSeri () {
			$('#capNhatXeChoIn').html('')
			$('#modalCapNhatSoSeri').modal('show');
			dataJexcel = convertSelectXeToJexcel();
			showJexcel(dataJexcel);
		}

		function hoanThanhCapNhatSoSeri () {
			var cf = fnConfirm("Thông báo",
	            "Bạn có muốn hoàn thành cập nhật số seri",
	            "OK", "Thoát",
	            function () {
	                
					$.ajax({
						url: '/o/rest/vr-app/issue/' + resHs["id"] + '/6',
						type: "PUT",
						headers: {
							groupId: 55217,
							Accept: 'application/json'
						},
						success: function(success) {							
							dataSourceDsXeChoInPhieuXXChiTiet.read();
						}
					});

	            }, function () {

	            });

	        cf.open();
		}

		function uploadMauIn () {
			$("#fileMauInXe").val('');
			$('#fileMauInXe').click();
		}

		function taiMauIn () {
			window.open('/o/rest/v2/dossiers/download/file/template?vehicleClass=XCG&applicantIdNo=${(registration.applicantCode)!}', '_blank')
		}

		function khoiPhucMauGoc () {
			var Url = '/o/rest/v2/dossiers/reset/file/template'
			$.ajax({
				url: Url,
				type: "PUT",
				dataType: 'json',
				data: {
					vehicleClass: 'XCG',
					applicantIdNo: '${(registration.applicantCode)!}'
				},
				success: function (success) {
					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");
				},
				error: function (xhr) {
					notification.show({
						message: "Thực hiện không thành công, xin vui lòng thử lại"
					}, "error");
				}
			});	
		}
	

	function selectXe (item, event) {
		console.log('item========', item, $(event))
		var tmp = listXe.find(function (itemTmp) {
			return itemTmp['vehicleRecordId'] == item
		})
		console.log('tmp', tmp)
		var index = listSelectXe.findIndex(function (itemXe) {
			if (itemXe['vehicleRecordId'] == tmp['vehicleRecordId']) {
				return true
			} else {
				return false
			}
		});
		console.log(index)
		if ($(event).prop('checked')) {
			if (index == -1) {
				listSelectXe.push(tmp)
			}
		} else {
			if (index != -1) {
				listSelectXe.splice(index, 1);
			}
		}
		if (listSelectXe && listSelectXe['length'] && res['digitalIssueStatus'] == 9) {
			$('#btn-cap-nhat-so-seri').prop('disabled', false);
		} else {
			$('#btn-cap-nhat-so-seri').prop('disabled', true);
		}
	}

		function getFile (url, fileName) {
			var UrlTmp = '/o/rest/v2/dossiers/download/file/template?vehicleClass=XCG&applicantIdNo=${(registration.applicantCode)!}&pathFile=' + url
			doPrinting(UrlTmp, fileName)
		}

		function download (fileUrl, fileName) {
			var a = document.createElement("a");

			var url = '/o/rest/v2/dossiers/download/file/template?pathFile=' + fileUrl
			a.href = url;
			a.setAttribute("download", fileName || Date.now());
			a.click();
			a.remove();
		}


		function inPhieu () {
			var Url = '/o/rest/vr-app/load/fileExport'
			console.log('vehicleRecordId', listSelectXe)
			$.ajax({
				url: Url,
				type: "GET",
				dataType: 'json',
				data: {
					vehicleClass: 'XCG',
					applicantIdNo: '${(registration.applicantCode)!}',
					vehicleRecordId: listSelectXe.map(function (item) {
						return item['vehicleRecordId']
					}).join(',')
				},
				success: function (success) {
					for(var i = 0; i < success.length; i++ ) {
						download(success[i]['url'], success[i]['fileName']);
					}				
				},
			});	
		}
		

		function inThu (item) {
			var Url = '/o/rest/vr-app/load/fileExport'
			console.log('vehicleRecordId', listSelectXe)
			$.ajax({
				url: Url,
				type: "GET",
				dataType: 'json',
				data: {
					vehicleClass: 'XCG',
					applicantIdNo: '${(registration.applicantCode)!}',
					vehicleRecordId: item
				},
				success: function (success) {
					console.log(success)
					for(var i = 0; i < success.length; i++ ) {
						getFile(success[i]['url'], success[i]['fileName'] || 'test.doc')
					}				
				},
			});	
		}

		function xemTruoc (vehicleRecordId, vehicleClass) {
			$("#objectView3").html("Đang tải dữ liệu....");
			var Url = '/o/rest/vr-app/issue/view/pxx'
			console.log(vehicleRecordId + '___' + vehicleClass)
			$.ajax({
				url: Url,
				headers: {"groupId": "${groupId}"},
				type: "GET",
				dataType: 'json',
				data: {
					vehicleClass: vehicleClass,
					vehicleRecordId: vehicleRecordId
				},
				success: function (success) {
					console.log(success)
					$('#modalViewPhieuXXDienTu').modal('show');
					var urlRes = success['fileURL'];
					$("#objectView3").html("");
					$("#objectView3").append('<iframe src="' + window.location.protocol + '//' + urlRes + '" width="100%" style="height:100vh">    </iframe>');			
				},
				error: function (xhr) {
					console.log(xhr);
					$('#modalViewPhieuXXDienTu').modal('hide');
				}
			});
		}
	$(function () {
		
		// getDSXe()
		
		$('#fileMauInXe').change(function() {
			console.log($(this))
			var data = new FormData();
			// console.log(file);
			data.append( 'displayName', $(this)[0].files[0].name);
			data.append( 'file', $(this)[0].files[0]);
			//data.append('deliverableCode', "");
			var vehicleClass = resHs ? resHs['vehicleClass'] : ''
			if (!vehicleClass) {
				console.log('ko có vehicleClass')
				return
			}
			$.ajax({
				type : 'POST', 
				url  : '/o/rest/v2/dossiers/upload/template/' + vehicleClass + '/' + "${(registration.applicantCode)!}", 
				data : data,
				headers: {"groupId": "${groupId}"},
				dataType: 'json',
				processData: false,
				contentType: false,
				cache: false,
				success :  function(result){ 

					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");

					$(this).val("");

				},
				error:function(result){

					notification.show({
						message: "Thực hiện không thành công, xin vui lòng thử lại"
					}, "error");

				}
			});
			console.log("success!");
		});
		$('#checkboxAllXe').change(function () {
			if ($(this).prop('checked')) {
				listSelectXe = listXe.slice()
				$('.checkboxXe').prop('checked', true)
			} else {
				$('.checkboxXe').prop('checked', false)
				listSelectXe = []
			}
			if (listSelectXe && listSelectXe['length']) {
				$('#btn-cap-nhat-so-seri').prop('disabled', false);
			} else {
				$('#btn-cap-nhat-so-seri').prop('disabled', true);
			}
		})
		

		var dataSourceDsXeChoInPhieuXXChiTiet = new kendo.data.DataSource({
			transport: {
				read: function (options) {
					var Url = '/o/rest/vr-app/getDataGCN'
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
					resHs = getDetailHSPXX()
					var vehicleClass = resHs ? resHs['vehicleClass'] : ''
					var vehicleClassText = getTextVehicleClass(vehicleClass);
					$('#vehicleClassDsXeChiTiet').html(vehicleClassText)
					console.log('resHs+++++++++++++', resHs)

					console.log('options+++++++++', options['data'])
					$.ajax({
						url : Url,
						dataType : "json",
						type : "GET",
						headers : {"groupId": "${groupId}"},
						data : {
							applicantIdNo: "${(registration.applicantCode)!}",
							vehicleClass: resHs ? resHs['vehicleClass'] : 'XCG',
							issueId: resHs ? resHs['id'] : '',
							certificateRecordNo: $('#soGCNFilterXe').val().trim(),
							certificateYear: $('#namGCNFilterXe').val().trim(),
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
							printingStatus: $('#trangThaiInFilterXe').val().trim(),
							start: options['data']['start'] || 0,
							end: options['data']['end'] || 500
						},
						success : function (result) {
							if (!result['data']) {
								result = {
									data: [],
									total: 0
								}
							}
							listXe = result['data'].slice() || [];
							options.success(result);
							$("#totalItem_dossierListDsXe").html(result['total'] || 0);
						},
						error : function (result) {
							options.error(result);
							$("#totalItem_dossierListDsXe").html(0);
						}
					});
				}
			},
			serverPaging: true,
			pageSize: parseInt($('#itemPpageDsAnChi').val() || 500),
			schema: {
				data: "data",
				total: "total",
				model: {
					id: "vehicleRecordId"
				}
			}
		});

		var count = 0 ;
		$("#danhSachXeTable").kendoListView({
			dataSource: dataSourceDsXeChoInPhieuXXChiTiet,
			autoBind: false,
			change: function () {

			},
			template: function (data) {
				count ++;
				data['count'] = count;
				return kendo.template($("#dsXeCHoInPhieuXXChiTietTemplate").html())(data);
			},
			dataBound: function () {
				count = 0;
			}
		});
		dataSourceDsXeChoInPhieuXXChiTiet.read();

		var pageTmp = 1;
		var pager = $("#pagerChoInPhieuXXChiTiet").kendoPager({
			dataSource: dataSourceDsXeChoInPhieuXXChiTiet,
			pageSizes: false,
			info: false,
			change: function (e) {
				var page = e['index'] || 1;
				pageTmp = page;
				var start = page * dataSourceDsXeChoInPhieuXXChiTiet.pageSize() - dataSourceDsXeChoInPhieuXXChiTiet.pageSize();
				var end = page * dataSourceDsXeChoInPhieuXXChiTiet.pageSize();
				count = start;
				dataSourceDsXeChoInPhieuXXChiTiet.read({
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