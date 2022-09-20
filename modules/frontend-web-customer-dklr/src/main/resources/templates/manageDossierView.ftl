<#if (Request)??>
<#include "init.ftl">
</#if>
<#-- main section template -->

<#if registration?has_content>
	<input type="hidden" name="registrationId__hidden" id="registrationId__hidden" value="${(registration.registrationId)!}">
</#if>

<script type="text/x-kendo-template" id="mainTemplate">
	<div id="contentMain" class="row panel M0" style="border: none;box-shadow: none">
		<div class="panel-heading P0">
			<div class="row PL15 PR15">
				<div class="row-header align-middle-lg" style="background: #C6E1F1 !important;">
					<div class="background-triangle-big">
						<i class="fa fa-file-text"></i>
					</div>
					<span class="text-bold" id="statusName" style="text-transform:uppercase; color: #005F8F !important;"></span> &nbsp;&nbsp;&nbsp;

					<#if registration?has_content && registration.applicantCode?has_content && (registration.applicantStatus == '0')>
						<span class="text-bold red" style="text-transform:uppercase;">(Tài khoản chưa gửi thông tin)</span>
					<#elseif registration?has_content && registration.applicantCode?has_content && (registration.applicantStatus == '1')>
						<span class="text-bold red" style="text-transform:uppercase;">(Tài khoản chờ duyệt)</span>
					<#elseif registration?has_content && registration.applicantCode?has_content && (registration.applicantStatus == '2')>

					<#elseif registration?has_content && registration.applicantCode?has_content && (registration.applicantStatus == '3')>
						<span class="text-bold red" style="text-transform:uppercase;">(Tài khoản chưa bổ sung thông tin)</span>
					<#else>
						<span class="text-bold red" style="text-transform:uppercase;">(Tài khoản này chưa bổ sung thông tin doanh nghiệp)</span>
					</#if>

					<div class="MLA form-inline">

						<label class="cl-switch displayCheckBox">
							<input type="checkbox" data-bind="events: { change: onChangeSwitch }" />
							<span class="switcher"></span>
							<span class="label" id="labelSwitch" style="color: #005F8F !important;">Thông báo từ cơ quan quản lý</span>
						</label>


						<input type="text" class="form-control" id="noInput" placeholder="Nhập số chứng chỉ" 
						data-bind="events: { keyup: filterInvestigationNo}" >

						<input type="text" class="form-control" id="keyInput" placeholder="Nhập mã hồ sơ"
						data-bind="events: { keyup: filterKey}" style="width: 290px;">

					</div>
					
					<a class="PL5 PR5 hover-pointer no-icon" href="#searchAdvancedCollapse1" data-toggle="collapse" id="btnSearchAdvancedCollapse1" style="color: #005F8F !important;">Nâng cao</a>

					<span id="fullScreen" data-bind="events: { click: fullScreen}">
						<i class="fa fa-expand fs20 toggle-collapse MR10 ML10" aria-hidden="true"></i>
						<i class="fa fa-compress fs20 MR10 ML10" aria-hidden="true" style="display: none"></i>
					</span>

				</div>
			</div>
		</div>
		<#--	-->
		<div id="wrapMain" class="table-responsive">
			<div class="row collapse toggle-hide M0" id="searchAdvancedCollapse1">

				<div class="col-sm-11 PR0 PB5">
					<div class="row PT5">
						<#-- <div class="col-sm-3">
							<label>Thủ tục</label>
							<input name="advanced_serviceName_search" id="advanced_serviceName_search"
							data-role="combobox"
							data-placeholder="Chọn thủ tục"
							data-text-field="serviceName"
							data-value-field="serviceCode"
							data-filter="contains"
							data-bind="
							source: dataServiceInfo
							"
							>
						</div> -->
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Số hồ sơ</label>
								</div>
								<div class="col-sm-8">
									<input class="form-control input-sm" name="advanced_dossierNo_search" id="advanced_dossierNo_search"
									placeholder="Số hồ sơ">
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0 PL0" style="text-align: right;">
									<label>Ngày tiếp nhận (Từ)</label>
								</div>
								<div class="col-sm-8">
									<input name="fromReceiveDate" id="fromReceiveDate"
									data-role="datepicker"
									data-placeholder="Từ ngày"
									data-format="dd/MM/yyyy"
									> 
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Đến</label>
								</div>
								<div class="col-sm-8">
									<input name="toReceiveDate" id="toReceiveDate"
										data-role="datepicker"
										data-placeholder="Đến ngày"
										data-format="dd/MM/yyyy"
									>
								</div>
							</div>
						</div>
					</div>

					<div class="row PT5">
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Mã hồ sơ</label>
								</div>
								<div class="col-sm-8">
									<input class="form-control input-sm" name="dossierIdCTNAdvanced" id="dossierIdCTNAdvanced" placeholder="Mã hồ sơ" >
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Ngày gửi (Từ)</label>
								</div>
								<div class="col-sm-8">
									<input name="fromSubmitDate" id="fromSubmitDate"
									data-role="datepicker"
									data-placeholder="Từ ngày"
									data-format="dd/MM/yyyy"
									> 
								</div>
							</div>
						</div>
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Đến</label>
								</div>
								<div class="col-sm-8">
									<input name="toSubmitDate" id="toSubmitDate"
									data-role="datepicker"
									data-placeholder="Đến ngày"
									data-format="dd/MM/yyyy"
									>
								</div>
							</div>							
						</div>
						
					</div>

					<div class="row PT5">
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Số chứng chỉ</label>
								</div>
								<div class="col-sm-8">
									<input class="form-control input-sm" name="so_chung_chi" id="so_chung_chi" placeholder="Số chứng chỉ" >
								</div>
							</div>	
						</div>
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Ngày ký (Từ)</label>
								</div>
								<div class="col-sm-8">
									<input name="tu_ngay_ky_cc" id="tu_ngay_ky_cc"
									data-role="datepicker"
									data-placeholder="Từ ngày"
									data-format="dd/MM/yyyy"
									> 
								</div>
							</div>								
						</div>
						<div class="col-sm-4">
							<div class="row">
								<div class="col-sm-4 PT5 PR0" style="text-align: right;">
									<label>Đến</label>
								</div>
								<div class="col-sm-8">
									<input name="den_ngay_ky_cc" id="den_ngay_ky_cc"
									data-role="datepicker"
									data-placeholder="Đến ngày"
									data-format="dd/MM/yyyy"
									>
								</div>
							</div>								
						</div>
						
					</div>
				</div>
				
				<div class="col-sm-1 PL0 PR0" style="height: 100px; display: flex; align-items: flex-end;">
					<button class="btn btn-active" data-bind="events: {
						click: searchAdvanced}">Tìm kiếm</button>
				</div>
			</div> 
			<table class="table table-bordered M0">
				<#-- Table header -->
				<thead style="background: #316BB6; color: #fff;font-weight: normal;">
					<tr>
						<#-- <th class="text-center hover-pointer displayCheckBoxTable">
							<input type="checkbox" name="checkboxall" data-bind="events:{change : checkBoxAll}">
						</th> -->

						<th class="text-center hover-pointer">
							<span style="font-weight: normal;">STT</span>
						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<span style="font-weight: normal;">Tên thủ tục</span>
							<span class="pull-right align-middle PT5">
								<i class="fa fa-sort" aria-hidden="true"></i>
							</span>		
						</th>
						<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
							<span style="font-weight: normal;">Mã hồ sơ </span>
							<span class="pull-right align-middle PT5">
								<i class="fa fa-sort" aria-hidden="true"></i>
							</span></br>
							<span style="font-weight: normal;">Ngày gửi</span>
						</th>
						<th class="fieldDossier text-center hover-pointer" sort="submitDate" sort-type="desc">
							<span style="font-weight: normal;" class="PR10">Số hồ sơ</span>
							<span class="pull-right align-middle PT5">
								<i class="fa fa-sort" aria-hidden="true"></i>
							</span></br>
							<span style="font-weight: normal;">Ngày tiếp nhận</span>
						</th>
						<th class="text-center hover-pointer">
							<span style="font-weight: normal;">Số chứng chỉ</span></br>
							<span style="font-weight: normal;">Ngày ký</span>
						</th>
						<th class="text-center hover-pointer">
							<span style="font-weight: normal;">Nội dung</span>
						</th>
						<th class="text-center hover-pointer">
							<span style="font-weight: normal;">Ghi chú</span>
						</th>
						<th class="text-center">
							<span style="font-weight: normal;">Hành động</span>
						</th>
					</tr>
				</thead>
				<#-- Table body -->
				<tbody class="" data-role="listview" data-auto-bind="false" data-bind="source: dataSourceProfile, events:{dataBound : changeList}" data-template="proFileTemplate" id="listViewDossier">

				</tbody>
			</table>

		</div>
		<div class="footerListProfile row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
			<div class="clearfix align-middle" style="float: right">
				<span class="MR15"><i>Tổng số <span id="totalItem_dossierList" class="red"></span> kết quả được tìm thấy</i></span>
				<span class="show-per-page MT0">Hiển thị
					<span class="select-wrapper">
						<select class="ML5" id="itemPpage" data-bind="events:{change: changePageSize}" style="background-color: #ffffff">

						</select>
					</span>
				</span>
				<span id="pagerProfile" class="M0 P0" data-role="pager" data-info="false" data-bind="source: dataSourceProfile, events:{change: stylePager}" data-page-size="false" data-button-count="10" style="background: #ffffff" data-auto-bind="false"></span>
			</div>	
		</div>

	</div>
</script>
<#-- <#include "notificationPaying.ftl"> -->
<#-- for listview dossier-->
<script type="text/x-kendo-template" id="proFileTemplate">

	<tr class="rowTable">

		<td class="text-center count" style="width: 1%; text-align: center;">
			#:count#
		</td>

		<td class="" style="width: 15%">
			<span>
				<a href="javascript:;" class="link-detail-employee text-hover-blue" data-pk="#=dossierId#" data-bind="events: { click : loadDossierDetail}">
					#=serviceName#
				</a>
			</span>

		</td>

		<td class="text-center" style="width: 8%">
			<p title="Mã hồ sơ">
				#if(dossierIdCTN){#
				<strong>#=dossierIdCTN#</strong>
				#}#

			</p>

			#if (submitDate) {#
			<p title="Ngày gửi">
				#:submitDate#
			</p>
			#} else {#
			<p><i title="Ngày gửi" class="text-gray">---</i></p>
			#}#

		</td>

		<td class="text-center" style="width: 14%">
			
			<p title="Số hồ sơ">#=dossierNo#</p>
			#if(dossierNo){
				if(receiveDate){#
					<p title="Ngày tiếp nhận">#:receiveDate#</p>
				#}else{#
					<p><i title="Ngày tiếp nhận" class="text-gray">---</i></p>
				#}
			}#
			
		</td>

		<td class="text-center" style="width: 10%">
			<#-- Số chứng chỉ -->
			<#-- #=briefNote# -->
			<p>#=certNo#</p>
			<p>#=certDate#</p>
		</td>

		<td class="" style="width: 16%">
			<span class="">#=briefNote#</span>
		</td>

		<td class="" style="width: 23%">
			# 
			if(applicantNote && applicantNote !== ''){
				applicantNote = String(applicantNote);
				var applicantNotes = applicantNote.split("<br>");
				var strResult = "";
				for(var i=0; i< applicantNotes.length; i++){
					if(applicantNotes[i].startsWith("DN")){
						applicantNotes[i] = "<span class='text-light-blue'>"+applicantNotes[i]+"</span>"+"<br>";
					}else {
						applicantNotes[i] = "<span class='red'>"+applicantNotes[i]+"</span>"+"<br>";
					}
					strResult += applicantNotes[i];
				}
			#
			<i>#=strResult#</i>
			#}#
		</td>

		<td class="PT0 PR0" style="width: 12%">
			<#--	-->
			<#-- <button type="button" class="btn-link no-border PT10 copyProfile" data-pk="#:dossierId#">
				<i class="fa fa-file-o" aria-hidden="true"></i>
				Sao chép
			</button> -->
			<#--	-->
			<#-- <button type="button" class="btn-link no-border PT10 downloadProfile" data-pk="#:dossierId#">
					<i class="fa fa-download" aria-hidden="true"/>
					Tải kết quả
				</button> -->


			#
			if(dossierStatus === "done" && dossierSubStatus === "" && statusReg !== 3 && !isExpiredCertificates && !isDNXNHL && !isTBDSX){
			#
				<button type="button" class="btn-link no-border PT10 sendAdd" data-pk="#:dossierId#">
					<i class="fa fa-paper-plane" aria-hidden="true"></i>
					Sửa đổi bổ sung
				</button>
				<button type="button" class="btn-link no-border PT10 resDone" data-pk="#:dossierId#">
					<i class="fa fa-reply" aria-hidden="true"/>
					Yêu cầu sửa giấy chứng nhận
				</button>

			#
			}
			#

			#
			if(isExpiredCertificates){
			#
				<button type="button" class="btn-link no-border PT10 deNghiXNHH" data-pk="#:dossierId#">
					<i class="fa fa-paper-plane" aria-hidden="true"></i>
					Đề nghị XNHL
				</button>
				<button type="button" class="btn-link no-border PT10 dungSX" data-pk="#:dossierId#" data-dossierIdCTN="#:dossierIdCTN#">
					<i class="fa fa-times" aria-hidden="true"/>
					Dừng SX
				</button>

			#
			}
			#

			#
			if(isDNXNHL){
			#

				<#-- <button type="button" class="btn-link no-border PT10 resCancelling" data-pk="#:dossierId#">
					<i class="fa fa-trash-o" aria-hidden="true"></i>
					Yêu cầu hủy
				</button></br> -->

			#
			}
			#

			#
			if(isTBDSX){
			#
				<button type="button" class="btn-link no-border PT10 deNghiXNHH" data-pk="#:dossierId#">
					<i class="fa fa-paper-plane" aria-hidden="true"></i>
					Đề nghị XNHL
				</button>

			#
			}
			#


			#
			if((dossierStatus == "waiting" || dossierStatus == "waiting_3") && !cancellingDate && !endorsementDate && !correctingDate){
			#

				<button type="button" class="btn-link no-border PT10 resCancelling" data-pk="#:dossierId#">
					<i class="fa fa-trash-o" aria-hidden="true"></i>
					Yêu cầu hủy
				</button></br>

			#
			}
			#

			#
			if(dossierStatus == "waiting_4"){
			#

				<button type="button" class="btn-link no-border PT10 guiHoSoKhacPhuc" data-pk="#:dossierId#">
					<i class="fa fa-paper-plane" aria-hidden="true"></i>
					Gửi hồ sơ khắc phục
				</button></br>

			#
			}
			#
			
			<#--  -->
			#if(dossierStatus == "receiving" && !cancellingDate && !endorsementDate && !cancellingDate){#
			<button type="button" class="btn-link no-border PT10 resCancelling" data-pk="#:dossierId#">
				<i class="fa fa-trash-o" aria-hidden="true"></i>
				Yêu cầu hủy
			</button></br>

			#}#

		</td>

	</tr>
</script>


<style>
	.table>tr>td:first-child, .table>tr>th:first-child {
		padding-left: 8px;
	}
	.ul-with-left-icon.icon-folder .icon-left {
		left: 0 !important;
	}
	.ul-with-left-icon.icon-folder li {
		padding-left:  26px !important;
	}
	ul#profileStatus {
		height: 300px !important;
		overflow: auto;
	}

	.table-bordered > thead > tr > th, .table-bordered > thead > tr > td, .table-bordered > tbody > tr > th, .table-bordered > tbody > tr > td, .table-bordered > tfoot > tr > th, .table-bordered > tfoot > tr > td {
		border: 1px solid #979696;
	}

	/*ul#profileStatus::-webkit-scrollbar-track
	{
		-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
		border-radius: 10px;
		background-color: #F5F5F5;
	}

	ul#profileStatus::-webkit-scrollbar
	{
		width: 12px;
		background-color: #F5F5F5;
	}

	ul#profileStatus::-webkit-scrollbar-thumb
	{
		border-radius: 10px;
		-webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
		background-color: #D62929;
	}*/

	tbody#listViewDossier>tr:hover {
		background: #e9e8e8;
	}

	tbody#listViewDossier tr:nth-child(even){
		background-color: #f1efef;
	}

	#banner > .container-fluid, #navigation > .container-fluid, #main-content > .container-fluid, #footer > .container-fluid {
		padding-left:  5px;
		padding-right:  5px;
	}
	body section#main-content {
		padding-top: 0;
	}

	.table > thead > tr > th, .table > thead > tr > td, .table > tbody > tr > th, .table > tbody > tr > td, .table > tfoot > tr > th, .table > tfoot > tr > td {
		padding: 2px !important;
	}
	span, i, b, p, strong, button {
		font-size: 12px;
	}
</style>
