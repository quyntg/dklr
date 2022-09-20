<#if (Request)??>
	<#include "init.ftl">
</#if>
<#------------- Phần VIEW --------------->
	<#-- WRAPPER ELEMENT -->
	<div id="appManagerDossier" style="font-size:13px"></div>
	<div id="confirmSaveForm" style="background-color: #ffffff; color: black" class="">
	
	</div>

	<#-- layout template -->
	<script type="text/x-kendo-template" id="layoutTemplate">
		<div id="panel_list" class="col-sm-2 PL0 PR0"></div>
		
		<div id="mainType1" class="col-sm-10 P0" >
			<div id="main_section" class="col-sm-12 P0" style="background: #ffffff;">
			</div>
		</div>

		<div id="mainType2" class="col-sm-10 P0"></div>
	</script>

	<#-- panel list template -->
	<script type="text/x-kendo-template" id="panelTemplate">
		<div class="dossier-emp-navigator-wrapper">
			<div class="row">
				<div class="col-sm-12">
					<button class="btn btn-active form-control" id="btn_create_new_dossier" data-bind = "click: load_serviceConfig" style="background-color: #316BB6;">Tạo hồ sơ mới</button>
				</div>
			</div>
	
			<div class="row MT5" id="dossier-emp-navigator-filter-wrapper">
				
				<div class="col-sm-12 filterField">
					<div class="MB5">
						<input name="serviceInfo" id="serviceInfo" data-role="combobox" data-placeholder="Chọn thủ tục hành chính" data-text-field="serviceName" data-value-field="serviceCode" data-filter="contains" data-suggest="true" data-bind="source:dataServiceInfo, events: { change: eventLookup,dataBound: dataBound}">
					</div>
				</div>
				<div class="col-md-12 MB5 filterField">
					<input id="dossier-emp-nav-selectbox-by-dossierNo" placeholder="Mã hồ sơ" name="dossierNo" class="form-control dossier-emp-nav-selectbox" data-bind="events: { keyup: filterDossierNo}" style="height:30px" />
				</div>
				
				<div class="hidden col-md-12 MB5">
					<input id="dossier-emp-nav-selectbox-by-startDate" placeholder="Từ ngày"
						data-datePicker
						data-datePicker-msg="Ngày không hợp lệ!"
						name="startDate" class="form-control dossier-emp-nav-selectbox" />
				</div>
				
				<div class="hidden col-md-12 MB5">
					<input id="dossier-emp-nav-selectbox-by-endDate" placeholder="Đến ngày"
						data-datePicker
						data-datePicker-msg="Ngày không hợp lệ!"
						name="endDate" class="form-control dossier-emp-nav-selectbox" />
				</div>
				<#--  -->
				<div class="col-sm-12 MB10">
					<div class="accordion">
						<div class="accordion-group">
							<div class="accordion-heading" style="background-color: #316BB6;border: none;font-family: 'Roboto-Regular'">
								<a class="" style="color: #ffffff" data-toggle="collapse" href="#groupFilterStatus">
									DANH SÁCH
								</a>
							</div>
							<div id="groupFilterStatus" class="accordion-body collapse in">
								<div class="accordion-inner">
									<ul id="profileStatus" class="ul-default ul-with-left-icon icon-folder have-bagde">
										<#if constants.dossierStatus?has_content>
											<#list constants.dossierStatus as odossierStatus>
												<li dataPk='${odossierStatus.value}' dataPkSub='${odossierStatus.valueSub}' class='itemStatus' data-bind="click: filterStatus">
													<i class='fa fa-folder icon-left' aria-hidden='true'></i>  
													<span class="hover-pointer text-hover-blue dossierStatus">${odossierStatus.text}</span>
													<span class="bagde">0</span>
												</li>
											</#list>
										</#if>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<#--  -->
				<div class="col-sm-12">
					<div class="accordion" style="border: 1px solid #fff;">
						<div class="accordion-group">
							<div class="accordion-heading" style="background-color: #316BB6;border: none;font-family: 'Roboto-Regular'">
								<a style="color: #ffffff" data-toggle="collapse" href="#groupLookup">
									TRA CỨU & IN ẤN
								</a>
							</div>
							<div id="groupLookup" class="accordion-body collapse in">
								<div class="accordion-inner">
									<ul id="profileStatusAnChi" class="ul-default have-bagde">
										<#-- <li class="hover-pointer text-hover-blue itemStatus" id="searchCC" 
											data-bind="click: filterInvestigation" >
											<span class="dossierStatus">Tra cứu chứng chỉ</span>
										</li> -->
										<li class="hover-pointer text-hover-blue itemStatusAnChi" id="searchCC" datapk="traCuuHoSo"
											data-bind="click: filterInvestigation" >
											<span class="dossierStatus">Tra cứu hồ sơ</span>
										</li>
										<#-- <li class="hover-pointer text-hover-blue itemStatusAnChi" 
											data-bind="click: filterInvestigation">
											<span class="dossierStatus">Tra cứu phương tiện xuất xưởng</span>
										</li> -->
										<li id="danhSachXeXuatXuong" datapk="traCuuPTXX" class='itemStatusAnChi' style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachXeXuatXuong" >
											<span class="dossierStatus">Tra cứu phương tiện xuất xưởng</span>
											<span id="countDSXeDaXuatXuong" class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
										<li id="danhSachAnChiCapPhat" datapk="anChiDaCapPhat" class='itemStatusAnChi'   style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachAnChiDaCapPhat">
											<span class="dossierStatus">Ấn chỉ đã nhận</span>
											<span id="countDSAnChiDaCapPhat" class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
										<li id="danhSachXeChoInPhieuXuatXuong" datapk="choinPhieuXX" class='itemStatusAnChi'  style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachXeChoInPhieuXuatXuong">
											<span class="dossierStatus">In & Cập nhật sê ri phiếu</span>
											<span class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>

				<div class="col-sm-12">
					<div class="accordion" style="border: 1px solid #fff;">
						<div class="accordion-group">
							<div class="accordion-heading" style="background-color: #316BB6;border: none;font-family: 'Roboto-Regular'">
								<a style="color: #ffffff" data-toggle="collapse" href="#groupLookupAnChiDk">
									ẤN CHỈ ĐĂNG KIỂM
								</a>
							</div>
							<div id="groupLookupAnChiDk" class="accordion-body collapse in">
								<div class="accordion-inner">
									<ul id="profileStatusAnChiDk" class="ul-default have-bagde">
										
										<li pk="hsChuaQuyetToan" datapk="/an-chi-dang-kiem/10" class='itemStatusAnChi' style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachAnChiDk" >
											<span class="dossierStatus">Hồ sơ phiếu chưa quyết toán hết	</span>
											<span id="countDSXeDaXuatXuong" class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
										<li pk="hsDaQuyetToan" datapk="/an-chi-dang-kiem/40" class='itemStatusAnChi'   style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachAnChiDk">
											<span class="dossierStatus">Hồ sơ phiếu đã quyết toán</span>
											<span id="countDSAnChiDaCapPhat" class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
										<li pk="hsCapTheoLo" datapk="/an-chi-dang-kiem/20" class='itemStatusAnChi'  style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachAnChiDk">
											<span class="dossierStatus">Hồ sơ cấp theo lô</span>
											<span class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>

										<li pk="hsDaGiamSat" datapk="/an-chi-dang-kiem/30" class='itemStatusAnChi'  style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachAnChiDk">
											<span class="dossierStatus">Hồ sơ đã giám sát</span>
											<span class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
				<#--  -->
				<#-- <div class="col-sm-12">
					<div class="accordion" style="border: 1px solid #fff;">
						<div class="accordion-group">
							<div class="accordion-heading" style="background-color: #316BB6;border: none;font-family: 'Roboto-Regular'">
								<a style="color: #ffffff" data-toggle="collapse" href="#xuatXuong">
									Xuất xưởng
								</a>
							</div>
							<div id="xuatXuong" class="accordion-body collapse in">
								<div class="accordion-inner">
									<ul id="">
										<li id="danhSachXeXuatXuong" class='itemStatus' style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachXeXuatXuong" >
											<span class="dossierStatus">Xe đã xuất xưởng</span>
											<span id="countDSXeDaXuatXuong" class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
										<li id="danhSachAnChiCapPhat" class='itemStatus'   style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachAnChiDaCapPhat">
											<span class="dossierStatus">Ấn chỉ đã nhận</span>
											<span id="countDSAnChiDaCapPhat" class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
										<li id="danhSachXeChoInPhieuXuatXuong" class='itemStatus'  style="display: flex;padding: 5px;justify-content: space-between;"
											data-bind="click: filterDanhSachXeChoInPhieuXuatXuong">
											<span class="dossierStatus">Xe chờ in phiếu</span>
											<span class="bagde" style="background-color: #ddd;padding: 3px; color: #14bef0;">0</span>
										</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>		 -->	
				<#--  -->
		
			</div>
	
		</div>
	</script>
	<#-- TEMPLATE TRANG QUẢN LÝ HỒ SƠ/ C-04 -->
	<#include "manageDossierView.ftl">
	<#include "manageDossierView_2.ftl">

	<#-- <script>
		$(function () {
			$('#btn_create_new_dossier').click(function () {
				$.ajax({
					url : "/o/rest/v2/dossiers/delete/recycle/data",
					dataType : "json",
					type : "GET",
					data : {
						applicantIdNo: "${(applicant.applicantIdNo)!}",
						dossierId : ""
					},
					headers : {"groupId": "${groupId}"},
					success : function(result){

					},
					error : function(result){

					}
				})
			})
		})
	</script> -->


	<style type="text/css">
		.cl-switch {
		  /*
		  Switcher Style
		  */
		  /*
		  When Checked
		  */
		  /*
		  Switch large style
		  */
		  /*
		  Switch xlarge style
		  */
		  /*
		  Switch Black color style
		  */
		  /*
		  Switch Red color style
		  */
		  /*
		  Switch green color style
		  */
		  /*
		  Switch green color style
		  */
		}
		.cl-switch input[type="checkbox"] {
			display: none;
			visibility: hidden;
		}
		.cl-switch .switcher {
			display: inline-block;
			border-radius: 100px;
			width: 35px;
			height: 15px;
			background-color: #ccc;
			position: relative;
			-webkit-box-sizing: border-box;
			-moz-box-sizing: border-box;
			box-sizing: border-box;
			vertical-align: middle;
			cursor: pointer;
		}
		.cl-switch .switcher:before {
			content: "";
			display: block;
			width: 20px;
			height: 20px;
			background-color: #fff;
			box-shadow: 0 1px 3px rgba(0, 0, 0, 0.6);
			border-radius: 50%;
			margin-top: -2.5px;
			position: absolute;
			top: 0;
			right: 0;
			-webkit-box-sizing: border-box;
			-moz-box-sizing: border-box;
			box-sizing: border-box;
			margin-right: 0;
			-webkit-transition: all 0.2s;
			-moz-transition: all 0.2s;
			-ms-transition: all 0.2s;
			-o-transition: all 0.2s;
			transition: all 0.2s;
		}
		.cl-switch .switcher:active:before {
			box-shadow: 0 1px 3px rgba(0, 0, 0, 0.6), 0 0 0 10px rgba(63, 81, 181, 0.3);
			transition: all, 0.1s;
		}
		.cl-switch .label {
			font-family: "Roboto", sans-serif;
			cursor: pointer;
			vertical-align: middle;
			margin: 0 5px;
		}
		.cl-switch input[type="checkbox"]:checked + .switcher {
			background-color: #8591d5;
		}
		.cl-switch input[type="checkbox"]:checked + .switcher:before {
			right: 100%;
			margin-right: -20px;
			background-color: #3f51b5;
		}
		.cl-switch.cl-switch-large .switcher {
			width: 52px;
			height: 22px;
		}
		.cl-switch.cl-switch-large .switcher:before {
			width: 30px;
			height: 30px;
			margin-top: -4px;
		}
		.cl-switch.cl-switch-large .label {
			font-size: 18px;
		}
		.cl-switch.cl-switch-large input[type="checkbox"]:checked + .switcher:before {
			margin-right: -30px;
		}
		.cl-switch.cl-switch-xlarge .switcher {
			width: 87px;
			height: 37px;
		}
		.cl-switch.cl-switch-xlarge .switcher:before {
			width: 50px;
			height: 50px;
			margin-top: -6px;
		}
		.cl-switch.cl-switch-xlarge .label {
			font-size: 24px;
		}
		.cl-switch.cl-switch-xlarge input[type="checkbox"]:checked + .switcher:before {
			margin-right: -50px;
		}
		.cl-switch.cl-switch-black input[type="checkbox"]:checked + .switcher {
			background-color: #676767;
		}
		.cl-switch.cl-switch-black input[type="checkbox"]:checked + .switcher:before {
			background-color: #343434;
		}
		.cl-switch.cl-switch-black .switcher:active:before {
			box-shadow: 0 1px 3px rgba(0, 0, 0, 0.6), 0 0 0 10px rgba(52, 52, 52, 0.3);
		}
		.cl-switch.cl-switch-red input[type="checkbox"]:checked + .switcher {
			background-color: #ffcece;
		}
		.cl-switch.cl-switch-red input[type="checkbox"]:checked + .switcher:before {
			background-color: #ff6868;
		}
		.cl-switch.cl-switch-red .switcher:active:before {
			box-shadow: 0 1px 3px rgba(0, 0, 0, 0.6), 0 0 0 10px rgba(255, 104, 104, 0.3);
		}
		.cl-switch.cl-switch-green input[type="checkbox"]:checked + .switcher {
			background-color: #77e4c0;
		}
		.cl-switch.cl-switch-green input[type="checkbox"]:checked + .switcher:before {
			background-color: #29cc97;
		}
		.cl-switch.cl-switch-green .switcher:active:before {
			box-shadow: 0 1px 3px rgba(0, 0, 0, 0.6), 0 0 0 10px rgba(41, 204, 151, 0.3);
		}
		.cl-switch.cl-switch-orange input[type="checkbox"]:checked + .switcher {
			background-color: #ffc166;
		}
		.cl-switch.cl-switch-orange input[type="checkbox"]:checked + .switcher:before {
			background-color: #ff9800;
		}
		.cl-switch.cl-switch-orange .switcher:active:before {
			box-shadow: 0 1px 3px rgba(0, 0, 0, 0.6), 0 0 0 10px rgba(255, 152, 0, 0.3);
		}

	</style>
	