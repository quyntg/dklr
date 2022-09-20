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
						
						<#if methodOfIssue?has_content && methodOfIssue == "10">
							<span class="text-bold" id="statusName" style="text-transform:uppercase;">
								Hồ sơ phiếu chưa quyết toán hết
							</span> &nbsp;&nbsp;&nbsp;
						<#elseif methodOfIssue?has_content && methodOfIssue == "40">
							<span class="text-bold" id="statusName" style="text-transform:uppercase;">
								Hồ sơ phiếu đã quyết toán
							</span> &nbsp;&nbsp;&nbsp;
						<#elseif methodOfIssue?has_content && methodOfIssue == "20">
							<span class="text-bold" id="statusName" style="text-transform:uppercase;">
								Hồ sơ cấp theo lô
							</span> &nbsp;&nbsp;&nbsp;
						<#else>
							<span class="text-bold" id="statusName" style="text-transform:uppercase;">
								Hồ sơ đã giám sát
							</span> &nbsp;&nbsp;&nbsp;
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

					<div style="width: 100%;">
						<table class="table table-bordered M0">
							<#-- Table header -->
							<thead style="background: #316BB6; color: #fff;font-weight: normal;">
								<tr>

									<th class="text-center hover-pointer">
										<span style="font-weight: normal;">STT</span>
									</th>
									<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
										<span style="font-weight: normal;">Số hồ sơ </span>
										<span class="pull-right align-middle PT5">
											<i class="fa fa-sort" aria-hidden="true"></i>
										</span>
									</th>
									<th class="fieldDossier text-center hover-pointer" sort="submitDate" sort-type="desc">
										<span style="font-weight: normal;">Ngày hồ sơ</span>
									</th>
									<th class="text-center hover-pointer">
										<span style="font-weight: normal;">Đối tượng</span></br>
									</th>
									<th class="text-center hover-pointer">
										<span style="font-weight: normal;">Loại hồ sơ</span>
									</th>
									<th class="text-center hover-pointer">
										<span style="font-weight: normal;">SL đề nghị</span>
									</th>
									<th class="text-center hover-pointer">
										<span style="font-weight: normal;">SL đã cấp</span>
									</th>
									<th class="text-center hover-pointer">
										<span style="font-weight: normal;">
											<#if methodOfIssue?has_content && methodOfIssue == '10'>
												SL chưa quyết toán
											<#else>
												SL chưa sử dụng
											</#if>
										</span>
									</th>
									<th class="text-center">
										<span style="font-weight: normal;">Thao tác</span>
									</th>
								</tr>
							</thead>
							<#-- Table body -->
							<tbody class="" id="listViewDsAnChiDangKiem">

							</tbody>
						</table>

						<script type="text/x-kendo-template" id="dsAnChiDangKiemproFileTemplate">

							<tr class="rowTable">

								<td data-pk="#:dossierId#" class="text-center count" style="width: 1%; text-align: center;" onclick="xemAnChi(this)">
									#:count#
								</td>

								<td class="text-center" style="width: 15%" onclick="xemAnChi(this)" data-pk="#:dossierId#">
									<span style="cursor: pointer;">
										<a href="javascript:;" class="link-detail-employee text-hover-blue">
											#=dossierNo#
										</a>
									</span>

								</td>

								<td class="text-center" style="width: 8%" onclick="xemAnChi(this)" data-pk="#:dossierId#">
									<p>
										<span style="cursor: pointer;">#=appliedDate#</span>
									</p>

								</td>

								<td class="text-center" style="width: 14%" onclick="xemAnChi(this)" data-pk="#:dossierId#"> 

									<p>
										<span style="cursor: pointer;">#=getTextVehicleClass(vehicleClass)#</span>
									</p>

								</td>

								<td class="text-center" style="width: 10%" onclick="xemAnChi(this)" data-pk="#:dossierId#">
									<p style="cursor: pointer;">#=getTextIssueType(issueType)#</p>
								</td>

								<td class="text-center" onclick="xemAnChi(this)" data-pk="#:dossierId#">
									<span style="cursor: pointer;" class="">#=totalInDocument#</span>
								</td>

								<td class="text-center" onclick="xemAnChi(this)" data-pk="#:dossierId#">
									<span style="cursor: pointer;" class="">#=(totalInUse + totalNotUsed)#</span>
								</td>

								<td class="text-center" onclick="xemAnChi(this)" data-pk="#:dossierId#">
									<span class="">#=totalNotUsed#</span>
								</td>

								<td class="text-center">
									#if ("${methodOfIssue}" == 10) {#
										#if (totalNotUsed != 0) {#
											<button type="button" class="btn-link no-border dnQuyetToan" data-pk="#:dossierId#" onclick="dnQuyetToan(this)">
												ĐN quyết toán
											</button> <br>
										#}#
										#if (checkBtnHuy(totalInUse, totalNotUsed)) {#
											<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 7)">
												ĐN hủy hồ sơ
											</button> <br>
										#}#
										#if (totalNotUsed != 0) {#
											<button type="button" class="btn-link no-border dnHuy" 	data-pk="#:dossierId#" onclick="dnHuy(this, 5)">
												ĐN trả ấn chỉ
											</button>
										#}#
										
									#} else if ("${methodOfIssue}" == 40) {#
										#if (dossierStatus == "done" && dossierSubStatus == "" && statusReg != 3 && issueType != 9 && issueType != 10) {#
										<#-- <button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 4)">
											ĐN cấp thay thế
										</button> <br> -->

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 3)">
											Đề nghị cấp lại
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 2)">
											Đề nghị cấp đổi
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 5)">
											ĐN trả ấn chỉ
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 6)">
											ĐN hủy ấn chỉ
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 7)">
											ĐN hủy hồ sơ
										</button> <br>
										#}#
									#} else if ("${methodOfIssue}" == 20) {#
										#if (checkBtn(totalInUse, totalNotUsed, totalInDocument)) {#
											<button type="button" class="btn-link no-border dnKiemTra" data-pk="#:dossierId#" data-type="dnKiemTra" onclick="dnGSKT(this)">
												ĐN kiểm tra
											</button> <br>
										#}#
										#if (dossierStatus == "done" && dossierSubStatus == "" && statusReg != 3) {#
										<#-- <button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 4)">
											ĐN cấp thay thế
										</button> <br> -->

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 3)">
											Đề nghị cấp lại
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 2)">
											Đề nghị cấp đổi
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 5)">
											ĐN trả ấn chỉ
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 6)">
											ĐN hủy ấn chỉ
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 7)">
											ĐN hủy hồ sơ
										</button> <br>
										#}#
									#} else {#
										#if (checkBtn(totalInUse, totalNotUsed, totalInDocument)) {#
											<button type="button" class="btn-link no-border dnGiamSat" data-pk="#:dossierId#" data-type="dnGiamSat" onclick="dnGSKT(this)">
												ĐN giám sát
											</button> <br>
										#}#

										#if (dossierStatus == "done" && dossierSubStatus == "" && statusReg != 3) {#
										<#-- <button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 4)">
											ĐN cấp thay thế
										</button> <br> -->

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 3)">
											Đề nghị cấp lại
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 2)">
											Đề nghị cấp đổi
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 5)">
											ĐN trả ấn chỉ
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 6)">
											ĐN hủy ấn chỉ
										</button> <br>

										<button type="button" class="btn-link no-border dnHuy" data-pk="#:dossierId#" onclick="dnHuy(this, 7)">
											ĐN hủy hồ sơ
										</button> <br>
										#}#
									#}#
								</td>

							</tr>
						</script>
					</div>
					<#-- <div style="width: 100%; height: 30px; display: flex;justify-content: space-between;">
						<div><span style="font-style: italic;color: #939393;"> Tổng số hồ sơ tìm thấy:</span><span style="color: red;font-style: small;" id="totalHoSo"></span></div>
					</div> -->
                </div>
                <div>
                	
          
                </div>
            </div>
		</div>
		<#--	-->
		<div class="footerListProfile row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
			<div class="clearfix align-middle" style="float: right">
				<#-- <span class="text-light-gray MR15"><i>Tổng số <span id="totalHoSo" class="red"></span> kết quả được tìm thấy</i></span> -->
				<#-- <span class="show-per-page MT0">Hiển thị
					<span class="">
						<select class="ML5" id="itemPpageDsAnChi" style="background-color: #ffffff">
							<option value="20">20</option>
							<option value="30">30</option>
							<option value="50">50</option>
							<option value="100">100</option>
						</select>
					</span>
				</span> -->
				<span id="pagerProfileAnChiDk" class="M0 P0" style="background: #ffffff"></span>
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

	function checkBtn(totalInUsed, totalNotUsed, totalInDocument) {
		var totalInUsedTmp = parseInt(totalInUsed || 0);
		var totalNotUsedTmp = parseInt(totalNotUsed || 0);
		var totalInDocumentTmp = parseInt(totalInDocument || 0);
		if (totalInUsedTmp + totalNotUsedTmp < totalInDocumentTmp) {
			return true;
		} else {
			return false;
		}
	}

	function checkBtnHuy(totalInUsed, totalNotUsed) {
		var totalInUsedTmp = parseInt(totalInUsed || 0);
		var totalNotUsedTmp = parseInt(totalNotUsed || 0);
		if (totalInUsedTmp == 0 && totalNotUsedTmp > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	function checkBtnTraHuy(totalInUsed, totalNotUsed) {
		var totalInUsedTmp = parseInt(totalInUsed || 0);
		var totalNotUsedTmp = parseInt(totalNotUsed || 0);
		if (totalInUsedTmp > 0 || totalNotUsedTmp > 0) {
			return true;
		} else {
			return false;
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
		} else if (data == '5') {
			return 'Trả ấn chỉ'
		} else if (data == '6') {
			return 'Hủy ấn chỉ'
		} else if (data == '7') {
			return 'Hủy hồ sơ'
		} else if (data == '8') {
			return 'Quyết toán ấn chỉ đã sử dụng'
		} else if (data == '9') {
			return 'Quyết toán ấn chỉ hỏng'
		} else if (data == '10') {
			return 'Quyết toán ấn chỉ mất'
		} else {
			return ''
		}
	}

	function xemAnChi (event) {
		var dossierId = $(event).attr('data-pk');
		if (dossierId) {
			$.ajax({
				url : "/o/rest/v2/dossiers/" + dossierId,
				dataType : "json",
				type : "GET",
				headers : {"groupId": "${groupId}"},
				data : {

				},
				success : function (result) {
					if (result) {
						manageDossier.navigate('/' + result['dossierStatus'] + '/dossiers/' + dossierId);
					}
				},
				error : function (result) {
					console.log(result)
				}
			});
		}
	}


	function dnGSKT (event) {
		var dossierId = $(event).attr('data-pk');
		var dataTye = $(event).attr('data-type');
		console.log('dataTye, dossierId------------++++++++++++', dataTye, dossierId)
		if (dataTye == 'dnKiemTra') {
			manageDossier.navigate('/dossiers/' + dossierId + '/denghikiemtra');
		} else {
			manageDossier.navigate('/dossiers/' + dossierId + '/denghigiamsat');
		}
	}

	function getDossierTemplateNo (dossierId) {
		var dossierTemplateNo = '';
		$.ajax({
			url : "/o/rest/v2/dossiers/" + dossierId,
			dataType : "json",
			type : "GET",
			async: false,
			headers : {"groupId": "${groupId}"},
			data : {
			},
			success : function (result) {
				dossierTemplateNo = result.dossierTemplateNo;
			},
			error : function (result) {
				console.log(result)
			}
		});

		return dossierTemplateNo;
	}

	function dnHuy (event, issueType) {
		var dossierId = $(event).attr('data-pk');
		console.log('dataTye, dossierId------------++++++++++++', dossierId)
		var dossierTemplateNo = getDossierTemplateNo(dossierId);

		$.ajax({
			url : "/o/rest/v2/dossiers/" + dossierId + "/files",
			dataType : "json",
			type : "GET",
			async: false,
			headers : {"groupId": "${groupId}"},
			data : {

			},
			success : function (result) {
				if (result.total == 0) {
					$.ajax({
						url : "/o/rest/v2/dossiers/" + dossierId + "/create/files",
						dataType : "json",
						type : "POST",
						headers : {"groupId": "${groupId}"},
                  		contentType: "application/x-www-form-urlencoded; charset=utf-8",
						data : {
							dossierPartNo : "TP1,TP2",
							dossierTemplateNo: dossierTemplateNo
						},
						success : function (result) {
							if (result) {
								
							}
						},
						error : function (result) {
							console.log(result)
						}
					});
				}
			},
			error : function (result) {
				console.log(result)
			}
		});

		manageDossier.navigate('/dossiers/' + dossierId + '/denghihuy/' + issueType);
	}

	function dnTraHuy (event) {
		var dossierId = $(event).attr('data-pk');
		console.log('dataTye, dossierId------------++++++++++++', dataTye, dossierId)
		manageDossier.navigate('/dossiers/' + dossierId + '/denghitrahuy');
	}

	

	function dnQuyetToan (event) {
		var dossierId = $(event).attr('data-pk');
		if (dossierId) {
			$.ajax({
				url : "/o/rest/v2/dossiers/" + dossierId,
				dataType : "json",
				type : "GET",
				headers : {"groupId": "${groupId}"},
				data : {

				},
				success : function (result) {
					if (result) {
						$.ajax({
							url : "${api.server}/dossiers",
							dataType : "json",
							type : "POST",
							data : {
								referenceUid : "",
								serviceCode : result['serviceCode'],
								govAgencyCode : result['govAgencyCode'],
								dossierTemplateNo : result['dossierTemplateNo'],
								applicantName : "${(registration.applicantName)!}",
								applicantIdType : "${(registration.applicantIdType)!}",
								applicantIdNo : "${(registration.applicantCode)!}",
								applicantIdDate : "",
								address : "${(registration.applicantAddress)!}",
								cityCode : "${(registration.applicantCityCode)!}",
								districtCode : "${(registration.applicantDistrictCode)!}",
								wardCode : "${(registration.applicantWardCode)!}",
								contactName : "${(registration.applicantContactName)!}",
								contactTelNo : "${(registration.applicantContactPhone)!}",
								contactEmail : "${(registration.applicantContactEmail)!}"
							},
							headers : {
								"groupId": "${groupId}",
								"dossierId": dossierId || ''
							},
							success : function (resultNewDossier) {
								manageDossier.navigate("/taohosomoi/chuanbihoso/" + resultNewDossier['dossierId']);
								window.sessionStorage.setItem('dossierIdDnQuyetToan', dossierId);
								dossierIdDnQuyetToan = dossierId;
							},
							error : function(result){
							}
						});
					}
				},
				error : function (result) {
					console.log(result)
				}
			});
		}
	}

	$(function () {
		
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

		$('#doituongFilterChoInPhoi').change(function () {
			$('#loaiHinhFilterChoInPhoi').empty();
			getLoaiHinhSX()
		})
		
		
		
		function fullScreen(){
			$("#fullScreen").children().toggle();
			$("#panel_list").toggle();
			$("#mainType2").toggleClass("col-sm-10","col-sm-12");

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

		getNhaXuong();

		getLoaiHinhSX();

		var dataSourceDsAnChiDangKiemTemplate = new kendo.data.DataSource({
			transport: {
				read: function (options) {
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
						url : "/o/rest/vr-app/issue/find/data",
						dataType : "json",
						type : "GET",
						headers : {"groupId": "${groupId}"},
						data : {
							methodOfIssue: "${methodOfIssue}",
							dossierNo: $('#soHoSoFilterChoInPhoi').val(),
							vehicleClass: $('#doituongFilterChoInPhoi').val(),
							certifiedAssemblyType: $('#loaiHinhFilterChoInPhoi').val(),
							applicantIdNo: "${(registration.applicantCode)!}",
							productionPlantCode: $('#nhaXuongFilterChoInPhoi').val(),
							// methodOfIssue: $('#phuongThucFilterChoInPhoi').val(),
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
							$("#totalHoSo").html(result['total'] || 0);
						},
						error : function (result) {
							options.error(result);
							$("#totalHoSo").html(0);
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
		$("#listViewDsAnChiDangKiem").kendoListView({
			dataSource: dataSourceDsAnChiDangKiemTemplate,
			autoBind: false,
			change: function () {

			},
			template: function (data) {
				count ++;
				data['count'] = count;
				return kendo.template($("#dsAnChiDangKiemproFileTemplate").html())(data);
			},
			dataBound: function () {
				count = 0;
			}
		});
		dataSourceDsAnChiDangKiemTemplate.read();

		var pageTmp = 1;
		var pager = $("#pagerProfileAnChiDk").kendoPager({
			dataSource: dataSourceDsAnChiDangKiemTemplate,
			pageSizes: false,
			info: false,
			change: function (e) {
				var page = e['index'] || 1;
				pageTmp = page;
				var start = page * dataSourceDsAnChiDangKiemTemplate.pageSize() - dataSourceDsAnChiDangKiemTemplate.pageSize();
				var end = page * dataSourceDsAnChiDangKiemTemplate.pageSize();
				count = start;
				dataSourceDsAnChiDangKiemTemplate.read({
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

		$('#timKiemHsPXX').click(function () {
			dataSourceDsAnChiDangKiemTemplate.read();
		})
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
    /*.table-hoso-filter{
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
	}*/

</style>
