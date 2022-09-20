<#if (Request)??>
<#include "init.ftl">
</#if>
<div class="steps align-space-between">
	<div class="step align-middle-lg done">
		<span>1</span>
		<span>Lựa chọn Dịch vụ công</span>
	</div>
	<div class="step align-middle-lg" id="step2">
		<span>2</span>
		<span>Chuẩn bị hồ sơ</span>
	</div>
	<div class="step align-middle-lg" id="step3">
		<span>3</span>
		<span>Nộp hồ sơ</span>
	</div>
</div>

<div class="box" id="detailDossier">

	<input type="hidden" name="dossierTemplateId" id="dossierTemplateId">
	<input type="hidden" name="dossierId_Hidden" id="dossierId_Hidden" value="${(dossierId)!}">
	<input type="hidden" name="dossierItemId" id="dossierItemId">
	<input type="hidden" name="dossierTemplateNo" id="dossierTemplateNo" data-bind="value : dossierTemplateNo">
	<input type="hidden" name="dossierId" id="dossierId" value="${(dossierId)!}">
	<input type="hidden" name="dossierNo" id="dossierNo" value="${(dossier.dossierNo)!}">
	<input type="hidden" name="applicantIdNo" id="applicantIdNo" value="${(dossier.applicantIdNo)!}">
	<input type="hidden" name="expireCertificateId_hidden" id="expireCertificateId_hidden" value="">
	<input type="hidden" name="dossierIdCTN" id="dossierIdCTN" value="${(dossier.dossierIdCTN)!}">
	<input type="hidden" name="referenceUid" id="referenceUid" value="${(dossier.referenceUid)!}">
	<input type="hidden" name="dossierStatusHidden" id="dossierStatusHidden" value="${(dossier.dossierStatus)!}">
	<div class="row-header  align-middle-lg">
		<div class="background-triangle-big">Tên thủ tục</div> 
		<span class="text-bold" data-bind="text:serviceName"></span>
		<div class="pull-right group-icons align-middle-lg">


			<a href="javascript:;" onclick="fnBack();">
				<i class="fa fa-reply" aria-hidden="true"></i>
				Quay lại
			</a>

			<#if resCancelling?has_content >

			<a href="javascript:;" class="" id="btn-cancelling-header" data-bind="value : submitting"><i class="fa fa-paper-plane"></i> Yêu cầu hủy</a>

			<#elseif sendAdd?has_content >
			
			<#assign btnLabel = "Gửi bổ sung">

			<#if dossier.dossierStatus == "done">
			<#assign btnLabel = "Sửa đổi bổ sung">
			</#if>

			<a href="javascript:;" class="" id="btn-submiting-header" data-bind="value : submitting"><i class="fa fa-paper-plane"></i> ${btnLabel}</a>

			<#else>

			<a href="javascript:;" id="btn-save-dosier-header">
				<i class="fa fa-save"></i>
				Lưu
			</a>
			<a href="javascript:;" id="btn-next-dossier-header">
				<i class="fa fa-sign-in" aria-hidden="true"></i>
				Tiếp tục
			</a>

			</#if>

		</div>
	</div>

	<div class="PB0 PL10 PT10" style="clear: both;" id="brefNoteHSXNHL">
		
		
	</div>

	<div class="guide-section PB0" style="clear: both;">
		<div class="head-part slide-toggle">
			<div class="background-triangle-small">
				<i class="fa fa-star"></i>
				
			</div> 
			<span class="text-uppercase hover-pointer">Hướng dẫn</span> 
			<i class="fa fa-angle-down pull-right hover-pointer MR15" aria-hidden="true" style="font-size: 150%;"></i>
		</div>

		<div class="content-part collapse PB15" id="collapseDossierG">
			<span data-bind="html:dossierNote"></span>
			<#-- <p class="MB0 text-light-blue PB15"><a href="javascript:;" id="guide-toggle">Xem thêm >></a></p> -->
		</div>
		
	</div>

	<div class="row" id="applicantInfo">
		<div class="col-sm-12">
			<div class="dossier-parts" style="">
				<div class="head-part align-middle slide-toggle">
					<div class="background-triangle-small">I</div> 
					<div class="col-sm-12 PL0">
						
						<span class="text-uppercase hover-pointer">
							Thông tin chủ hồ sơ
						</span>
						<i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true" style="font-size: 150%;"></i>
					</div>
					
				</div>
				<div class="content-part collapse" id="collapseDossierI" style="pointer-events:none;">
					<div class="row-parts-head MT5">
						<div class="row MT5">
							
							<div class="col-sm-2 PT5 text-right">
								Họ và tên
							</div>
							<div class="col-sm-10">
								<div class="form-group"> 
									<input type="text" class="form-control" data-bind="value : applicantName" id="applicantName" name="applicantName" required="required" validationMessage="Bạn phải điền họ tên"> 
									<span data-for="applicantName" class="k-invalid-msg"></span>
								</div>
								
							</div>

							<div class="col-sm-2 PT5 text-right">
								Địa chỉ
							</div>
							<div class="col-sm-10">
								<div class="form-group"> 
									<input type="text" class="form-control" data-bind="value: address" id="address" name="address"> 
								</div>
							</div>

							<div class="col-sm-2 PT5 text-right">
								Tỉnh/ Thành phố <span class="red">(*)</span>
							</div>
							<div class="col-sm-2 PR0">
								<div class="form-group"> 
									<select class="form-control" id="cityCode" name="cityCode" data-bind="value : cityCode" required="required" validationMessage="Bạn phải chọn Tỉnh/ Thành phố"> 
									</select>
									<span data-for="cityCode" class="k-invalid-msg"></span>
								</div>
							</div>

							<div class="col-sm-2 PT5 text-right">
								Quận/ Huyện <span class="red">(*)</span>
							</div>
							<div class="col-sm-2 PR0">
								<div class="form-group"> 
									<select class="form-control" id="districtCode" name="districtCode" data-bind="value : districtCode" required="required" validationMessage="Bạn phải chọn Quận/ Huyện"> 
									</select>
									<span data-for="districtCode" class="k-invalid-msg"></span>
								</div>
							</div>
							
							<div class="col-sm-2 PT5 text-right">
								Xã/ Phường <span class="red">(*)</span>
							</div>
							<div class="col-sm-2 PL0">
								<div class="form-group"> 
									<select class="form-control" id="wardCode" name="wardCode" data-bind="value : wardCode" required="required" validationMessage="Bạn phải chọn Xã/ Phường"> 
									</select>
									<span data-for="wardCode" class="k-invalid-msg"></span>
								</div>
							</div>

							<div class="col-sm-2 PT5 text-right">
								Điện thoại
							</div>
							<div class="col-sm-2 PR0">
								<div class="form-group"> 
									<input type="text" class="form-control" id="contactTelNo" name="contactTelNo" data-bind="value : contactTelNo">
									<span data-for="contactTelNo" class="k-invalid-msg"></span> 
								</div>
							</div>
							
							<div class="col-sm-2 PT5 text-right">
								Địa chỉ email
							</div>
							<div class="col-sm-6">
								<div class="form-group"> 
									<input type="text" class="form-control" id="contactEmail" name="contactEmail" data-bind="value : contactEmail">
									<span data-for="contactEmail" class="k-invalid-msg"></span> 
								</div>
							</div>

							<input type="hidden" name="serviceCode" id="serviceCode" data-bind="value:serviceCode">
							<input type="hidden" name="govAgencyCode_" id="govAgencyCode_" data-bind="value:govAgencyCode">
							<input type="hidden" name="dossierTemplateNo" id="dossierTemplateNo" data-bind="value:dossierTemplateNo">

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="dossierFormSubmiting">
		<div class="dossier-parts">
			<div class="head-part align-middle PB5 slide-toggle">
				<div class="background-triangle-small hover-pointer">II</div> 
				<div class="col-sm-12 PL0">
					<span class="text-uppercase hover-pointer">Thành phần hồ sơ</span> 
					<span class="hover-pointer pull-right"><i class="text-light-gray">Những thành phần hồ sơ có dấu 
						(<span class="red">*</span>) là thành phần bắt buộc</i>
						<span>
							<i class="fa fa-angle-down hover-pointer" aria-hidden="true" style="font-size: 150%;"></i>
						</span>
					</span>
				</div>
				
			</div>

			<div class="content-part collapse in PB0 PT0">
					<div>
						<div class="row-parts-head align-middle slide-toggle PT5" style="background: #dbd9d9; cursor: pointer;">
						<div class="col-sm-12 PL0">
							<span> 
								Bản khai trực tuyến <i class="fa fa-angle-down hover-pointer" aria-hidden="true" style="font-size: 128%;"></i>
							</span>
						</div>
						<div class="clear"></div>
					</div>
					<div class="collapse" id="banKhaiTrucTuyenCollapse" style="display: block;">
						<div class="col-sm-12 PL0 PR0 content-part collapse in" id="lsDossierTemplPart">
							

							<script type="text/x-kendo-template" id="templateDossierPart">
								#if (partType == 1 && hasForm) {#

										<div class="row-parts-head align-middle slide-toggle">
											<span class="text-bold MR5">#:itemIndex#.</span>
												<span class="hover-pointer"> #:partName# 
													#
													if(required){
													#
														<span class="red">*</span>
														<input type="hidden" id="validPart#:id#" name="validPart#:id#" class="validPart" value="0">
													#}#
												</span>

													<div class="actions">

														<#-- <a href="javascript:;" class="text-light-blue uploadfile-form-repository" data-toggle="tooltip" data-placement="top" title="Tải giấy tờ từ kho lưu trữ" part-no="#:id#">
															<i class="fa fa-archive" aria-hidden="true"></i>
														</a>

														<label class="MB0 ML10 hover-pointer" for="file#:id#" title="Tải file lên" >
															<i class="fa fa-upload text-light-blue"></i>
														</label>

														<input type='file' id="file#:id#" name="file#:id#" class="hidden dossier-file" #if(multiple){# multiple #}# part-no="#:id#" file-template-no="#:fileTemplateNo#" hasform="#if(hasForm){# true #}#" > -->

														<#-- <a href="javascript:;" class="dossier-component-profile" data-toggle="tooltip" data-placement="top" title="Số tệp tin" data-partno="#:id#" data-number="#if(hasForm){# 1 #}else {# 0 #}#">
															<span class="number-in-circle" >#if(hasForm){# 1 #}else {# 0 #}#</span>
														</a> -->
														<a href="javascript:;" class="dossier-component-profile" data-placement="top" title="Số tệp tin" data-partno="#:id#" data-number="#if(hasForm){# 1 #}else {# 0 #}#">
															<span class="number-in-circle" >#if(hasForm){# 1 #}else {# 0 #}#</span>
														</a>

														<#-- <a href="javascript:;" class="text-light-gray delete-dossier-file" data-toggle="tooltip" data-placement="top" title="Xóa" data-partno="#:id#" eForm="#:hasForm#" fileTemplateNo="#:fileTemplateNo#">
															<i class="fa fa-trash-o" aria-hidden="true"></i> Xóa
														</a> -->
													</div>
												</div>
											</div>

											#
											if (hasForm) {
											var dossierFile =  getReferentUidFile(${dossierId},id);
											#

											<div class="collapse" id="collapseDossierPart#:id#">
												<div class="col-xs-12 col-sm-12 text-right">
													<button style="z-index: 99;" id="btn-save-formalpaca#:id#" class="btn btn-active MB10 MT10 MR20 saveForm saveFormAlpaca" data-partname="#:partName#"
															type="button" data-pk="#:id#" referenceUid="#:dossierFile.referenceUid#">Ghi lại</button>
													<input type="hidden" name="" id="dossierFileId#:id#" value="#:dossierFile.dossierFileId#">
												</div>
												<div class="col-sm-12 divForm" #if(dossierFile.referenceUid){# style="height: 450px; overflow: auto;" #}# >

													<div id="formPartNo#:id#" class="formAlpacaDN" data-pk="#:id#" data-partname="#:partName#" dossierFileId="#:dossierFile.dossierFileId#" style="">

													</div>

												</div>
											</div>

											#
												$.ajax({
													url : "${api.server}/dossiers/${dossierId}/files/"+dossierFile.referenceUid+"/formscript",
													dataType : "text",
													type : "GET",
													processData: false,
													headers : {"groupId": "${groupId}"},
													success : function(result) {
														$("\\#formPartNo"+id).empty();
														var alpaca2 = {};
														if (!result) {
															alpaca2 = {};
														} else {
															alpaca2 = eval("(" + result + ")");
														}
														var formdata = fnGetFormData(${dossierId},dossierFile.referenceUid, id);
														if (formdata) {
															$("\\#validPart"+id).val("1");
														}
														alpaca2.data = formdata;
														setTimeout(function () {
															$("\\#formPartNo"+id).alpaca(alpaca2);
														}, 1000);
														$("\\#formPartNo"+id).parent().css("overflow", "auto");

														<#-- $("\\#formPartNo"+id).append('<div class="row"><div class="col-xs-12 col-sm-12"><button id="btn-save-formalpaca'+id+'" class="btn btn-active MB10 MT10 saveForm" type="button" data-pk="'+id+'" referentUid="'+referentUidFile+'">Ghi lại</button></div></div>'); -->

													},
													error : function (result) {

													}
												});
											}
										#
									#}#
							</script>
						</div>
						<div class="clear"></div>
					</div>
					</div>

					<div style="clear: both;">
						<div class="row-parts-head align-middle slide-toggle PT5" style="background: #dbd9d9; cursor: pointer;">
							<div class="col-sm-12 PL0">
								<span> 
									Tài liệu đính kèm <i class="fa fa-angle-down hover-pointer" aria-hidden="true" style="font-size: 128%;"></i>
								</span>
							</div>
							<div class="clear"></div>
						</div>
						<div class="collapse" id="vanBanDinhKemCollapse" style="display: block;">
							<div class="col-sm-12 PL0 PR0 content-part collapse in" id="lsDossierTemplPart2">
								<script type="text/x-kendo-template" id="templateDossierPart2">
									#if (partType == 1 && !hasForm) {#

											<div class="row-parts-head align-middle slide-toggle">
												<span class="text-bold MR5">#:itemIndex2#.</span>
													<span class="hover-pointer"> #:partName# 
														#
														if(required){
														#
															<span class="red">*</span>
															<input type="hidden" id="validPart#:id#" name="validPart#:id#" class="validPart" value="0">
														#}#
													</span>

														<div class="actions">

															<a href="javascript:;" class="text-light-blue uploadfile-form-repository" data-toggle="tooltip" data-placement="top" title="Tải giấy tờ từ kho lưu trữ" part-no="#:id#">
																<i class="fa fa-archive" aria-hidden="true"></i>
															</a>

															<label class="MB0 ML10 hover-pointer" for="file#:id#" title="Tải file lên" >
																<i class="fa fa-upload text-light-blue"></i>
															</label>

															<input type='file' id="file#:id#" name="file#:id#" class="hidden dossier-file" #if(multiple){# multiple #}# part-no="#:id#" file-template-no="#:fileTemplateNo#" hasform="#if(hasForm){# true #}#" >

															<a href="javascript:;" class="dossier-component-profile" data-placement="top" title="Số tệp tin" data-partno="#:id#" data-number="#if(hasForm){# 1 #}else {# 0 #}#">
																<span class="number-in-circle" >#if(hasForm){# 1 #} else {# 0 #}#</span>
															</a>

															<#-- <a href="javascript:;" class="text-light-gray delete-dossier-file" data-toggle="tooltip" data-placement="top" title="Xóa" data-partno="#:id#" eForm="#:hasForm#" fileTemplateNo="#:fileTemplateNo#">
																<i class="fa fa-trash-o" aria-hidden="true"></i> Xóa
															</a> -->
														</div>
													</div>
												</div>
										#}#
								</script>
							</div>
							<div class="clear"></div>
						</div>
					</div>
			</div>

			
    </div>
	</div>

	<div class="row" id="danhSachCacLanXNHL_Toogle">
		<div class="col-sm-12">
			<div class="dossier-parts" style="">
				<div class="head-part align-middle slide-toggle">
					<div class="background-triangle-small">III</div> 
					<div class="col-sm-12 PL0">
						
						<span class="text-uppercase hover-pointer">
							Danh sách các lần XNHL
						</span>
						<i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true" style="font-size: 150%;"></i>
					</div>
					
				</div>
				<div class="content-part collapse in" id="collapseDossierIII" style="">
					<div class="row-parts-head MT5">
						<div class="row MT5">
							
							<div class="col-xs-12 col-sm-12">
								<table class="table table-bordered M0">
									<#-- Table header -->
									<thead>
										<tr>
											<th class="text-center hover-pointer">
												<strong>STT</strong>
											</th>
											<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
												<strong>Số hồ sơ</strong>

											</th>
											<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
												<strong>Ngày đề nghị</strong>

											</th>
											<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
												<strong>Ngày hiệu lực</strong>

											</th>
											<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
												<strong>Hành động</strong>
											</th>
										</tr>
									</thead>
									<#-- Table body -->
									<tbody class="" id="danhSachCacLanXNHL">

									</tbody>
									<script type="text/x-kendo-template" id="templateDanhSachCacLanXNHL">
										<tr>
											<td class="fieldDossier text-center hover-pointer">
												#:stt#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												#
												if(validdossierid == -1 || validdossierid == '-1'){
												#
													<span>#:dossierno#</span>
													
												#} else {#
													<span>#:validdossierno#</span>
												#}#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												#
												if(validrequestdate){
												#
													<span>#:validrequestdate#</span>
													
												#} else {#
												#}#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												#
												if(certificaterecordexpiredate){
												#
													<span>#:certificaterecordexpiredate#</span>
													
												#} else {#
												#}#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												
												#
												if(validdossierid == -1 || validdossierid == '-1'){
												#
													<a href="/group/cong-tiep-nhan/quan-ly-ho-so\\#/#:dossierstatus#/dossiers/#:dossierid#" target="_blank" class="link-detail-employee text-hover-blue" data-pk="#=dossierid#" data-dossierstatus="#=dossierstatus#">
														Xem
													</a>
													
												#} else {#
													<a href="/group/cong-tiep-nhan/quan-ly-ho-so\\#/#:dossierstatus#/dossiers/#:validdossierid#" target="_blank" class="link-detail-employee text-hover-blue" data-pk="#=validdossierid#" data-dossierstatus="#=dossierstatus#">
														Xem
													</a>
												#}#
											</td>
										</tr>
									</script>
								</table>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="row" id="danhSachCacLanXNHL_HangNam_Toogle">
		<div class="col-sm-12">
			<div class="dossier-parts" style="">
				<div class="head-part align-middle slide-toggle">
					<div class="background-triangle-small">III</div> 
					<div class="col-sm-12 PL0">
						
						<span class="text-uppercase hover-pointer">
							XNHL hằng năm
						</span>
						<i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true" style="font-size: 150%;"></i>
					</div>
					
				</div>
				<div class="content-part collapse in" id="collapseDossierIII" style="">
					<div class="row-parts-head MT5">
						<div class="row MT5">
							
							<div class="col-xs-12 col-sm-12">
								<table class="table table-bordered M0">
									<#-- Table header -->
									<thead>
										<tr>
											<th class="text-center hover-pointer">
												<strong>STT</strong>
											</th>
											<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
												<strong>Số hồ sơ</strong>

											</th>
											<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
												<strong>Ngày đề nghị</strong>

											</th>
											<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
												<strong>Ngày hiệu lực</strong>

											</th>
											<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
												<strong>Hành động</strong>
											</th>
										</tr>
									</thead>
									<#-- Table body -->
									<tbody class="" id="danhSachCacLanXNHL_HangNam">

									</tbody>
									<script type="text/x-kendo-template" id="templateDanhSachCacLanXNHL_HangNam">
										<tr>
											<td class="fieldDossier text-center hover-pointer">
												#:stt#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												#
												if(validdossierid == -1 || validdossierid == '-1'){
												#
													<span>#:dossierno#</span>
													
												#} else {#
													<span>#:validdossierno#</span>
												#}#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												#
												if(validrequestdate){
												#
													<span>#:validrequestdate#</span>
													
												#} else {#
												#}#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												#
												if(certificaterecordexpiredate){
												#
													<span>#:certificaterecordexpiredate#</span>
													
												#} else {#
												#}#
											</td>
											<td class="fieldDossier text-center hover-pointer">
												
												#
												if(validdossierid == -1 || validdossierid == '-1'){
												#
													<#-- <a href="javascript:;" class="link-detail-employee text-hover-blue" data-pk="#=dossierid#" data-dossierstatus="#=dossierstatus#" onclick="toDetailDossierXNHL">
														Xem
													</a> -->
													
												#} else {#
													<a href="/group/cong-tiep-nhan/quan-ly-ho-so\\#/#:dossierstatus#/dossiers/#:validdossierid#" target="_blank" class="link-detail-employee text-hover-blue" data-pk="#=validdossierid#" data-dossierstatus="#=dossierstatus#">
														Xem
													</a>
												#}#
											</td>
										</tr>
									</script>
								</table>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="row-parts-content" id="nhanKetQuaTu">
		<div class="row">
			<div class="col-xs-12 col-sm-7">
				<label>Nhận kết quả từ (<span style="color: red;">*</span>)</label>
				<input class="form-control MB0" name="corporationCode" id="corporationCode" required="required" validationMessage="Bạn phải chọn kết quả từ" data-bind="value : corporationCode">
				<span data-for="corporationCode" class="k-invalid-msg"></span> 
			</div>
		</div>
	</div>

<div class="row-parts-content" id="postalInfo">



	<div class="checkbox ML15" style="display: inline-block;">
		<input type="checkbox" id="viaPostal" name="viaPostal" data-bind="attr : {viaPostal : viaPostal}"> <label class="text-normal">Tích vào ô này kết quả sẽ trả qua đường bưu điện</label>
	</div>

	<div class="row">
		<div class="col-xs-12 col-sm-6">
			<label>Tên người nhận (<span style="color: red;">*</span>)</label>
			<input type="text" class="form-control input-small" placeholder="" id="postalReceiverName" name="postalReceiverName" validationMessage="Bạn phải nhập tên người nhận" data-bind="value: postalReceiverName">
			<span data-for="postalReceiverName" class="k-invalid-msg"></span> 
		</div>
		<div class="col-xs-12 col-sm-6">
		</div>
		<div class="col-xs-12 col-sm-7">
			<label>Địa chỉ nhận kết quả</label> (<span style="color: red;">*</span>)
			<input type="text" class="form-control input-small" placeholder="Ghi rõ thôn, số nhà, tên đường - phố" id="postalAddress" name="postalAddress" required="required" validationMessage="Bạn phải nhập địa chỉ nhận kết quả" data-bind="value : postalAddress">
			<span data-for="postalAddress" class="k-invalid-msg"></span> 
		</div>
		<div class="col-xs-12 col-sm-2">
			<label>Tỉnh/Thành phố</label> (<span style="color: red;">*</span>)
			<input class="form-control MB0" name="postalCityCode" id="postalCityCode" required="required" validationMessage="Bạn phải nhập Tỉnh/ Thành phố" data-bind="value : postalCityCode">
			<span data-for="postalCityCode" class="k-invalid-msg"></span> 
		</div>
		<div class="col-xs-12 col-sm-3">
			<label>Số điện thoại</label> (<span style="color: red;">*</span>)
			<input type="text" class="form-control input-small" placeholder="" id="postalTelNo" name="postalTelNo" required="required" validationMessage="Bạn phải nhập số điện thoại" data-bind="value: postalTelNo">
			<span data-for="postalTelNo" class="k-invalid-msg"></span> 
		</div>
	</div>

	<div class="row MB20">
		<div class="col-sm-12">
			<label>${lblApplicantNote}</label>
			<textarea class="form-control" name="applicantNote" id="applicantNote" placeholder="Ghi chú" data-bind="text : applicantNote" rows="3"></textarea>
		</div>
	</div>
</div>
</div>

<div class="button-row MT20">
	<button class="btn btn-active" id="btn-back-dossier" type="button"><i class="fa fa-reply" aria-hidden="true"></i> Quay lại</button>	

	<#if resCancelling?has_content >

	<button class="btn btn-active" data-bind="value : submitting" style="display:none"><i class="fa fa-paper-plane"></i> Xác nhận</button>
	<a href="javascript:;" class="btn btn-active" id="btn-rescancelling-dossier" data-bind="value : submitting"><i class="fa fa-paper-plane"></i> Yêu cầu hủy</a>
	<#elseif sendAdd?has_content >

	<button class="btn btn-active" data-bind="value : submitting" style="display:none"><i class="fa fa-paper-plane"></i> Xác nhận</button>
	<#assign btnLabel = "Gửi bổ sung">

	<#if dossier.dossierStatus == "done">
	<#assign btnLabel = "Sửa đổi bổ sung">
	</#if>
	
	<a href="javascript:;" class="btn btn-active" id="btn-sendadd-dosier" data-bind="value : submitting"><i class="fa fa-paper-plane"></i> ${btnLabel}</a>
	<#else>

	<button class="btn btn-active" id="btn-save-dossier" type="button" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i class="fa fa-save"></i> Lưu</button>
	
	<button class="btn btn-active" id="btn-submit-dossier" type="button" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i class="fa fa-sign-in" aria-hidden="true"></i> Tiếp tục</button>
	
	</#if>
	<#-- <button class="btn btn-active" id="btn-submit-dossier"><i class="fa fa-paper-plane"></i> Nộp hồ sơ</button>
	<button class="btn btn-active"><i class="fa fa-trash"></i> Xóa</button> -->
</div>

<div id="uploadFileTemplateDialog" class="modal fade" role="dialog">
	
</div>  
<div id="dialogConfirm">
	
</div>

<div id="uploadDialog" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title">Tải file lên</h4>
      </div>
      <div class="modal-body">
        <p>File đang được tải lên, vui lòng chờ!</p>
      </div>
    </div>

  </div>
</div>


<#-- <div id="profileDetail" class="modal fade" role="dialog">
	
</div> -->

<style type="text/css">
	.divForm {
		overflow: auto !important;
	}
</style>

<script type="text/javascript">

	$(".formAlpacaDN").parent().css("overflow", "auto");
	var funSaveDossier;
	var createActionDossier;
	var fnBack;
	var fnNext;
	var dossierFiles = [];

	var arrIsChangeForm = [];

	var toDetailDossierXNHL = function (event){
		var id = $(event).attr("data-pk");
		var dossierstatus = $(event).attr("data-dossierstatus");
		if (id) {
			window.open('/group/cong-tiep-nhan/quan-ly-ho-so#/' + dossierstatus + '/dossiers/' + id, '_blank')
		} else {
			console.log('ko có id', id)
		}
	}

	var changeDiaDiemNhanAnChi = function (val) {
		if (val) {
			$('#viaPostal').val('');
			$("#viaPostal").attr("disabled", true);
			$('#postalAddress').val('');
			$('#postalCityCode').val('');
			$('#postalTelNo').val('');
			$('#postalReceiverName').val('');
		} else {
			$("#viaPostal").attr("disabled", false);
		}
	}

	/*$("#dialogConfirm").kendoDialog({
		width: "400px",
		title: "Thông báo",
		closable: true,
		modal: false,
		content: "<p>Bạn chưa lưu lại thông tin, bạn có muốn lưu lại thay đổi trước khi chuyển sang thao tác khác?<p>",
		actions: [
		{ text: 'Hủy bỏ' , action : onCloseDialog},
		{ text: 'Lưu lại', primary: true, action : onSaveInfo }
		]
	});

	function onSaveInfo(){
		funSaveDossier();
	}

	function onCloseDialog(){

	}*/
	console.log("VLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
	var fnCheckIsChangeForm = function(dossierFileId, partNo, partName){
		var formControl = $("#formPartNo" + partNo).alpaca('get');
        var formData = null;
        var res = true;
        if (!dossierFileId) {
        	console.log('ko có dossierFileId!!!!');
        	return false;
        }
        if (formControl && formControl['options'] && formControl['options']['fields'] && formControl['options']['fields']['initEvent']) {
            if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('validateData')) {
                console.log('Không có hàm validateData trong form alpaca!!!!');
                notification.show({
                    message: "Không có hàm validateData trong form alpaca!!!!"
                }, "error");
                res = false;
                return res;
            } else {
                var validate = formControl['options']['fields']['initEvent'].validateData();
                console.log('validate++++++++++++', validate);
                if (!validate) {
                    notification.show({
                        message: "Thành phần " + partName + " đang chưa đủ dữ liệu, vui lòng kiểm tra lại!"
                    }, "error");
                    res = false;
                    return res;
                }
            }
            if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('postData')) {
                console.log('Không có hàm postData trong form alpaca!!!!');
                notification.show({
                    message: "Không có hàm postData trong form alpaca"
                }, "error");
                res = false;
                return res;
            } else {
                formData = formControl['options']['fields']['initEvent'].postData();
            }
        }
        console.log('DATA CHECK TOÀN VẸN =================', formData)
		$.ajax({
			url : "/o/rest/v2/dossiers/" + dossierFileId + "/validate/formdata/1",
			dataType : "json",
			type : "POST",
			headers : {"groupId": "${groupId}"},
			data: {
				formdata: JSON.stringify(formData)
			},
			async: false,
			success : function(result) {
				res = result ? result['result'] : false;
				console.log('res++++++++++++', result['result'])
				if (!result['result']) {
					notification.show({
						message: "Dữ liệu đã thay đổi, vui lòng nhấn ghi lại thành phần " + partName
					}, "error");
				}
			},
			error: function (xhr) {
				console.log('xhr+++++++++++++', xhr);
				res = false;
				notification.show({
					message: "Xẩy ra lỗi, vui lòng thử lại"
				}, "error");
			}
		});

		return res;
	}

	$(window).scroll(function(event) {
		event.preventDefault();
		var buttonFirst = $(".saveFormAlpaca")[0]
		var docViewTop = $(window).scrollTop();
		var docViewBottom = docViewTop + $(window).height();
		if (!buttonFirst || !$(buttonFirst).offset()) {
			return
		}
		var elemTop = $(buttonFirst).offset().top;
		var elemBottom = elemTop + $(buttonFirst).height();
        var tmp = docViewTop >= elemTop
		if (tmp) {
			$("#btn-save-formalpacaTP1").css("position", "fixed");
			$("#btn-save-formalpacaTP1").css("top", "10px");
			$("#btn-save-formalpacaTP1").css("right", "100px");
		}
		if (docViewTop <= 300) {
			$("#btn-save-formalpacaTP1").css("position", "");
			$("#btn-save-formalpacaTP1").css("top", "");
			$("#btn-save-formalpacaTP1").css("right", "");
		}
	});

	$(function(){

		
		$("#step2").addClass("done");
		$("#step3").removeClass("done");

		$(document).off("click",".dossier-file");
		$(document).on("click",".dossier-file",function(){
			funDossierFile("${dossierId}",funGenNumberFile);
		});

		$(document).off("change",".dossier-file");
		$(document).on("change",".dossier-file",function(){
			

			console.log("change");

			var partNo = $(this).attr("part-no");
			var fileTemplateNo = $(this).attr("file-template-no");
			var dossierTemplateNo = $("#dossierTemplateNo").val();
			var hasform = $(this).attr("hasform");

			console.log(partNo);
			console.log(fileTemplateNo);
			console.log($(this)[0].files[0]);

			//show progress load
			kendo.ui.progress($("#mainType2"), true);

			funUploadFile($(this),partNo,dossierTemplateNo+"",fileTemplateNo,hasform);

			funDossierFile("${dossierId}",funGenNumberFile);
		});

		$(document).off("click",".uploadfile-form-repository");
		$(document).on("click",".uploadfile-form-repository",function(){
			

			var dossierId = "${(dossierId)!}";
			var dossierTemplateNo = $("#dossierTemplateNo").val();
			var partNo = $(this).attr("part-no");
			$("#uploadFileTemplateDialog").load("${ajax.customer_dossier_detail_filetemplate}&${portletNamespace}dossierPartNo="+partNo+"&${portletNamespace}dossierId="+dossierId+"&${portletNamespace}dossierTemplateNo="+dossierTemplateNo,function(result){
				$(this).modal("show");
			});

			funDossierFile("${dossierId}",funGenNumberFile);

		});

		$(document).off("click",".dossier-component-profile");
		$(document).on("click",".dossier-component-profile",function(){

			var partNo = $(this).attr("data-partno");
			var dossierId = "${(dossierId)!}";
			var dossierTemplateNo = "${(dossier.dossierTemplateNo)!}";
			
			var url = "#/"+dossierId+"/files/"+dossierTemplateNo+"/"+partNo;

			var cf = fnConfirm("Thông báo",
			 "Bạn muốn mở trong tab mới hay cửa sổ mới", 
			 "Tab mới", "Cửa sổ mới",
			function(){

				window.open(url,"_blank");

			}, function(){
				window.open(url,"_blank","location=yes");
			});

			cf.open();

			funDossierFile("${dossierId}",funGenNumberFile);

		});

		$(document).off("click",".delete-dossier-file");
		$(document).on("click",".delete-dossier-file",function(){
			if(navigator.onLine){
				var dossierId  = "${dossierId}";
				var dataPartNo = $(this).attr("data-partno");
				var eForm = $(this).attr("eForm");
				var fileTemplateNo = $(this).attr("fileTemplateNo");
				try{
					$("#formPartNo"+dataPartNo).alpaca('get').setValue({});
				}catch (e){

				}

				console.log(dossierId);
				console.log(dataPartNo);
				var cf = confirm("Bạn có muốn xóa file toàn bộ file của thành phần này!");
				if(cf){
					if(dossierId && dataPartNo){
						if(eForm === "true"){

							$.ajax({
								url : "${api.server}/dossiers/"+dossierId+"/files",
								dataType : "json",
								type : "GET",
								headers : {"groupId": "${groupId}"},
								success : function(result) {
									var data = result.data;
									if(data){
										for (var i = 0; i < data.length; i++) {
											if(dataPartNo === data[i].dossierPartNo){
												removeDossierFile(dossierId, data[i].referenceUid);
											}
										}
										$(".dossier-component-profile").filter("[data-partno="+dataPartNo+"]").html('<span class="number-in-circle" >0</span>');

										$(".dossier-component-profile").filter("[data-partno="+dataPartNo+"]").attr("data-number",0);

										if(navigator.onLine){
											notification.show({
												message: "Yêu cầu được thực hiện thành công"
											}, "success");
										}

									}
									$("#validPart"+dataPartNo).val("0");
								},
								error : function(result) {
									if(navigator.onLine){
										notification.show({
											message: "Xẩy ra lỗi, vui lòng thử lại"
										}, "error");
									}
									
								}
							});

						}else {
							removeDossierFileNotEform(dossierId,fileTemplateNo,dataPartNo);
						}
					}
				}
			}else {
				alert("Không có kết nối internet, vui lòng kiểm tra kết nối của bạn!");
			}

			
		});

		$("#btn-view-extendguide").click(function(){
			if($("#extend-guide").attr("status")==="none"){
				$("#extend-guide").show();
				$("#extend-guide").attr("status","show");
			}else{
				$("#extend-guide").hide();
				$("#extend-guide").attr("status","none");
			}
		});

		$(document).on("click",".dossier-online-form",function(event){
			console.log("abcd");
			$(this).unbind();
			$("#showDossierOnlineForm").load("${ajax.customer_dossier_online_form_dialog}",function(result){
				$(this).modal("show");
			});
		});

		(function($) { 
			$('.spinner .btn:first-of-type').on('click', function() { 
				$('.spinner input').val(parseInt($('.spinner input').val(), 10) + 1); 
			}); 
			$('.spinner .btn:last-of-type').on('click', function() { 
				$('.spinner input').val(parseInt($('.spinner input').val(), 10) - 1); 
			}); 
		})(jQuery);

		$("#dossier-submit-info").click(function(){
			$("#dossierSubmitInfo").load("${ajax.customer_dossier_info}",function(result){
				$(this).modal("show");
			});
		});

		var dataSourceDanhSachCacLanXNHLTemplate = new kendo.data.DataSource({
			transport :{
				read : function(options){
					console.log('dossierIdCTN+++++++++', options['data'])
					if (options['data'] && options['data']['type'] == 1) {
						$.ajax({
							url : "/o/rest/vr-app/vrexpirecertificate",
							dataType : "json",
							type : "GET",
							headers : {"groupId": "${groupId}"},
							async: false,
							data : {
								dossierIdCTN: options['data']['dossierIdCTN']
							},
							success : function(result){
								options.success(result['vr_expire_certificate'] || []);
							},
							error : function(result){
								options.error(result);
							}
						});
					} else {
						$.ajax({
							url : "/o/rest/vr-app/vrexpirecertificate",
							dataType : "json",
							type : "GET",
							headers : {"groupId": "${groupId}"},
							data : {
								validDossierIdCTN: options.data['dossierIdCTN']
							},
							success : function(resultCer){
								if (resultCer && resultCer['vr_expire_certificate'] && resultCer['vr_expire_certificate']['length']) {
									var tmp = resultCer['vr_expire_certificate'][0]
									$.ajax({
										url : "/o/rest/vr-app/vrexpirecertificate",
										dataType : "json",
										type : "GET",
										headers : {"groupId": "${groupId}"},
										async: false,
										data : {
											dossierIdCTN: tmp['dossierIdCTN'] || tmp['dossieridctn']
										},
										success : function(result){
											options.success(result['vr_expire_certificate'] || []);
										},
										error : function(result){
											options.error(result);
										}
									});
									
								} else {

									options.success([]);
								}
							},
							error : function (xhr) {
								options.error(xhr);
							}
						});
					}
				}
			},
			schema : {
				model : {
					id : "id"
				}
			}
		});

		var indexDsCacLanXNHL =0 ;
		$("#danhSachCacLanXNHL").kendoListView({
			dataSource : dataSourceDanhSachCacLanXNHLTemplate,
			autoBind : false,
			change : function () {

			},
			template : function(data){

				
				indexDsCacLanXNHL ++;

				data['stt'] = indexDsCacLanXNHL;

				return kendo.template($("#templateDanhSachCacLanXNHL").html())(data);

			},
			dataBound : function () {
				indexDsCacLanXNHL = 0;
			}
		});

		var dataSourceDanhSachCacLanXNHL_HangNamTemplate = new kendo.data.DataSource({
			transport :{
				read : function(options){
					console.log('dossierIdCTN+++++++++', options['data'])
					if (options['data'] && options['data']['type'] == 1) {
						$.ajax({
							url : "/o/rest/vr-app/vrexpirecertificate",
							dataType : "json",
							type : "GET",
							headers : {"groupId": "${groupId}"},
							async: false,
							data : {
								dossierIdCTN: options['data']['dossierIdCTN']
							},
							success : function(result){
								options.success(result['vr_expire_certificate'] || []);
							},
							error : function(result){
								options.error(result);
							}
						});
					} else {
						if (!options.data || !options.data['dossierIdCTN']) {
							options.success([]);
							return;
						}
						$.ajax({
							url : "/o/rest/vr-app/vrexpirecertificate",
							dataType : "json",
							type : "GET",
							headers : {"groupId": "${groupId}"},
							data : {
								validDossierIdCTN: options.data['dossierIdCTN']
							},
							success : function(resultCer){
								if (resultCer && resultCer['vr_expire_certificate'] && resultCer['vr_expire_certificate']['length']) {
									var tmp = resultCer['vr_expire_certificate'][0]
									$.ajax({
										url : "/o/rest/vr-app/vrexpirecertificate",
										dataType : "json",
										type : "GET",
										headers : {"groupId": "${groupId}"},
										async: false,
										data : {
											dossierIdCTN: tmp['dossierIdCTN'] || tmp['dossieridctn']
										},
										success : function(result){
											options.success(result['vr_expire_certificate'] || []);
										},
										error : function(result){
											options.error(result);
										}
									});
									
								} else {
									$.ajax({
										url : "/o/rest/vr-app/vrexpirecertificate",
										dataType : "json",
										type : "GET",
										headers : {"groupId": "${groupId}"},
										async: false,
										data : {
											dossierIdCTN: options['data']['dossierIdCTN']
										},
										success : function(result){
											options.success(result['vr_expire_certificate'] || []);
										},
										error : function(result){
											options.error(result);
										}
									});
								}
							},
							error : function (xhr) {
								options.error(xhr);
							}
						});
					}
				}
			},
			schema : {
				model : {
					id : "id"
				}
			}
		});

		var indexDsCacLanXNHL_HangNam =0 ;
		$("#danhSachCacLanXNHL_HangNam").kendoListView({
			dataSource : dataSourceDanhSachCacLanXNHL_HangNamTemplate,
			autoBind : false,
			change : function () {

			},
			template : function(data){

				
				indexDsCacLanXNHL_HangNam ++;

				data['stt'] = indexDsCacLanXNHL_HangNam;

				return kendo.template($("#templateDanhSachCacLanXNHL_HangNam").html())(data);

			},
			dataBound : function () {
				indexDsCacLanXNHL_HangNam = 0;
			}
		});

		var indexDossiserPart =0 ;
		var indexDossiserPart2 = 0 ;
		var dataSourceDossierTemplate = new kendo.data.DataSource({
			transport :{
				read : function(options){
					if(options.data.dossierTemplateNo){
						$.ajax({
							url : "${api.server}/dossiertemplates/"+options.data.dossierTemplateNo,
							dataType : "json",
							type : "GET",
							headers : {"groupId": "${groupId}"},
							data : {

							},
							success : function(result){
								if (result.dossierParts && result.dossierParts['length']) {
									var tmp = result.dossierParts.filter(function (item) {
										return item['partType'] == 1 && item['hasForm']
									})
									indexDossiserPart2 = tmp['length'];
								}
								options.success(result.dossierParts);
								$("#dossierTemplateNo").val(result.templateNo);
							},
							error : function(result){
								options.error(result);
							}
						});
					}
				}
			},
			schema : {
				model : {
					id : "partNo"
				}
			}
		});

		
		$("#lsDossierTemplPart").kendoListView({
			dataSource : dataSourceDossierTemplate,
			autoBind : false,
			change : function(){

			},
			template : function(data){

				
				if(data.partType === 1 && data['hasForm']){
					indexDossiserPart ++;
				}

				data.itemIndex = indexDossiserPart;

				return kendo.template($("#templateDossierPart").html())(data);

			},
			dataBound : function(){
				indexDossiserPart = 0;
				funDossierFile("${dossierId}",funGenNumberFile);
			}
		});

		
		$("#lsDossierTemplPart2").kendoListView({
			dataSource : dataSourceDossierTemplate,
			autoBind : false,
			change : function(){
			},
			template : function(data){

				
				if(data.partType === 1 && !data['hasForm']){
					indexDossiserPart2 ++;
				}

				data['itemIndex2'] = indexDossiserPart2;

				return kendo.template($("#templateDossierPart2").html())(data);

			},
			dataBound : function(){
				indexDossiserPart2 = 0;
				funDossierFile("${dossierId}", funGenNumberFile);
			}
		});

		$("#showFileTemplateDialog").click(function(){
			$("#fileTemplateDialog").load("employeemain_dossierdetail_filetemplate.ftl",function(result){
				$(this).modal("show");
			});
		});

		$("#btn-save-dossier,#btn-save-dosier-header").click(function(){
			sessionStorage.setItem("applicantNote", $("textarea#applicantNote").val());
			try{
				var lsForm = $(".formAlpacaDN");
				if (lsForm && lsForm['length'] && "${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
					for (var i = 0; i < lsForm.length; i++) {
						var partNo = $(lsForm[i]).attr("data-pk");
						var partName = $(lsForm[i]).attr("data-partname");
						var dossierFileId = $(lsForm[i]).attr("dossierFileId");
						console.log("dossierFileId+++++++++partNo+++++partName++++++++", dossierFileId, partNo, partName);
						var tv = fnCheckIsChangeForm(dossierFileId, partNo, partName);
						console.log('toàn vẹn++++++++', tv);
						if (!tv) {
							console.log('dữ liệu ko toàn vẹn++++++++', tv);
							return;
						}
					}
				}
				funSaveDossier(function () {
					setTimeout(function () {
						manageDossier.navigate("/taohosomoi/nophoso/${dossierId}");
					}, 300)
				});
			}catch(e){
				console.log(e);
			}

			
		});

		$("#btn-submit-dossier,#btn-next-dossier-header").click(function(){
			sessionStorage.setItem("applicantNote", $("textarea#applicantNote").val());
			try{
				var lsForm = $(".formAlpacaDN");
				if (lsForm && lsForm['length'] && "${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
					for (var i = 0; i < lsForm.length; i++) {
						var partNo = $(lsForm[i]).attr("data-pk");
						var partName = $(lsForm[i]).attr("data-partname");
						var dossierFileId = $(lsForm[i]).attr("dossierFileId");
						console.log("dossierFileId+++++++++partNo+++++partName++++++++", dossierFileId, partNo, partName);
						var tv = fnCheckIsChangeForm(dossierFileId, partNo, partName);
						console.log('toàn vẹn++++++++', tv);
						if (!tv) {
							console.log('dữ liệu ko toàn vẹn++++++++', tv);
							return;
						}
					}
				}
				funSaveDossier(function () {
					setTimeout(function () {
						manageDossier.navigate("/taohosomoi/nophoso/${dossierId}");
					}, 300)
				});
			}catch(e){
				console.log(e);
			}
			
		});

		fnNext = function(){
			var lsForm = $(".formAlpacaDN");
			if (lsForm && lsForm['length'] && "${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
				for (var i = 0; i < lsForm.length; i++) {
					var partNo = $(lsForm[i]).attr("data-pk");
					var partName = $(lsForm[i]).attr("data-partname");
					var dossierFileId = $(lsForm[i]).attr("dossierFileId");
					console.log("dossierFileId+++++++++partNo+++++partName++++++++", dossierFileId, partNo, partName);
					var tv = fnCheckIsChangeForm(dossierFileId, partNo, partName);
					console.log('toàn vẹn dữ liệu++++++++', tv);
					if (!tv) {
						console.log('dữ liệu ko toàn vẹn++++++++', tv);
						return;
					}
				}
			}
			funSaveDossier(function () {
				setTimeout(function () {
					manageDossier.navigate("/taohosomoi/nophoso/${dossierId}");
				}, 300)
			});
		}

		$("#btn-back-dossier").click(function(){
			fnBack();
		});

		fnBack = function(){
			window.history.back();
		};

		funSaveDossier = function (callBack) {
		//PUT dossier
		$("#btn-save-dossier").button('loading');
		$("#btn-back-dossier").prop("disabled","disabled");
		$("#btn-submit-dossier").prop("disabled","disabled");
		var postalValidator = $("#postalInfo").kendoValidator().data("kendoValidator");
		var applicantValidator = $("#applicantInfo").kendoValidator().data("kendoValidator");
		// $('.saveFormAlpaca').click()
		var corporationName = '';
		var dataCorporation = $("#corporationCode").getKendoComboBox().dataSource.data();
		if (dataCorporation && dataCorporation['length']) {
			var tmp = dataCorporation.find(function (item) {
				return item['itemCode'] == $("#corporationCode").val()
			});
			corporationName = tmp ? tmp['itemName'] : '';
		} else {
			corporationName = ''
		}
		var validCorporationCode = true;
		if ("${(dossier.dossierTemplateNo)!}" == 'TT302011BGTVTCPPXCG' && !$("#corporationCode").val()) {
			validCorporationCode = false;
		}
		if(applicantValidator.validate() && postalValidator.validate() && validCorporationCode){
			$.ajax({
				url  : '${api.server}/dossiers/${dossierId}', 
				dataType : "json",
				type : 'PUT', 
				headers: {"groupId": "${groupId}"},
				data : {
					referenceUid : "",
					serviceCode : $("#serviceCode").val(),
					govAgencyCode : $("#govAgencyCode_").val(),
					dossierTemplateNo : $("#dossierTemplateNo").val(),

					applicantName : "${(applicant.applicantName)!}",
					applicantIdType : "${(applicant.applicantIdType)!}",
					applicantIdNo : "${(applicant.applicantIdNo)!}",
					applicantIdDate : "01/01/2017 00:00:00",

					contactName : $("#applicantName").val(),
					address : $("#address").val(),
					cityCode : $("#cityCode").val(),
					districtCode : $("#districtCode").val(),
					wardCode : $("#wardCode").val(),
					contactTelNo : $("#contactTelNo").val(),
					contactEmail : $("#contactEmail").val(),
					viaPostal : $("#viaPostal").is(":checked") ? 2 : 1,
					applicantNote : $("textarea#applicantNote").val(),
					corporationCode: $("#corporationCode").val(),
					corporationName: corporationName,
					postalTelNo: $("#postalTelNo").val(),
					postalReceiverName: $("#postalReceiverName").val(),
					postalCityCode: $("#postalCityCode").val(),
					postalAddress: $("#postalAddress").val(),

				},
				success :  function(result){          
					$("#btn-save-dossier").button('reset');
					$("#btn-back-dossier").prop("disabled","");
					$("#btn-submit-dossier").prop("disabled","");
					console.log(result.dossierStatus);             
					if(result.dossierStatus == ''){
						console.log("------>doActions");  
						createActionDossier("${dossierId}");
						getTotal();
					}
					setTimeout(function () {
						callBack()
					}, 400)
					/*notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");*/
				},
				error:function(result){
					$("#btn-save-dossier").button('reset'); 
					console.error(result);
					notification.show({
						message: "Xảy ra lỗi, xin vui lòng thử lại"
					}, "error");
				}	
			});
		}else {
			$("#btn-save-dossier").button('reset');
			var message = '';
			if  (!applicantValidator.validate()) {
				message = '- Kiểm tra các trường bắt buộc'
			}

			if (!postalValidator.validate()) {
				message += ' \n ';
				message += '- Kiểm tra các trường bắt buộc của mục thông tin bưu điện'
			}
			if (!validCorporationCode) {
				message += ' \n ';
				message += '- Chưa chọn nơi nhận ấn chỉ'
			}

			notification.show({
				message: message
			}, "error");

		}

	}

	createActionDossier = function(dossierId){
		if(dossierId){
			$.ajax({
				url : "${api.server}/dossiers/"+dossierId+"/actions",
				dataType : "json",
				type : "POST",
				headers: {
					"groupId": "${groupId}",
					Accept : "application/json"
				},
				data : {
					actionCode  : 1100,
					actionNote :  $("textarea#applicantNote").val(),
					actionUser: '${(userInfo.actionUser)!}'
				},
				success : function(result){
					$("#btn-save-dossier").button('reset');
					$("#btn-back-dossier").prop("disabled","");
					$("#btn-submit-dossier").prop("disabled","");
					console.log("create acion dossier success!");
					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");
				},
				error : function(result){
					$("#btn-save-dossier").button('reset');
					$("#btn-back-dossier").prop("disabled","");
					$("#btn-submit-dossier").prop("disabled","");
					notification.show({
						message: "Xảy ra lỗi, xin vui lòng thử lại"
					}, "error");
				}
			});
		}
	}

	$("#cityCode").kendoComboBox({
		placeholder : "Chọn tên thành phố",
		dataTextField : "itemName",
		dataValueField : "itemCode",
		noDataTemplate : "Không có dữ liệu",
		filter : "contains",
		autoBind : true,
		dataSource : {
			transport : {
				read : function(options){
					$.ajax({
						url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
						dataType : "json",
						type : "GET",
						headers: {"groupId": "${groupId}"},
						data : {
							parent : 0
						},
						success : function(result){
							options.success(result);
						},
						error : function(result){
							options.error(result);
						}
					});
				}
			},
			schema : {
				data : "data",
				total : "total"
			}
		},
		change : function(e){
			var value = this.value();
			console.log("change");
			console.log(value);
			if(value){
				$("#districtCode").data("kendoComboBox").dataSource.read({
					parent : value
				});
				$("#districtCode").data("kendoComboBox").select(-1);
				$("#wardCode").data("kendoComboBox").select(-1);
			}

		}

	});

	$("#districtCode").kendoComboBox({
		placeholder : "Chọn Quận/ Huyện",
		dataTextField : "itemName",
		dataValueField : "itemCode",
		noDataTemplate : "Không có dữ liệu",
		filter : "contains",
		dataSource : {
			transport : {
				read : function(options){
					var parent = "${(dossier.cityCode)!}";
					if(options.data.parent){
						parent = options.data.parent;
					}

					$.ajax({
						url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
						dataType : "json",
						type : "GET",
						headers: {"groupId": "${groupId}"},
						data : {
							parent : parent
						},
						success : function(result){
							options.success(result);
						},
						error : function(result){
							options.error(result);
						}
					});
				}
			},
			schema : {
				data : "data",
				total : "total"
			}
		},
		change : function(e){
			var value = this.value();
			if(value){
				$("#wardCode").data("kendoComboBox").dataSource.read({
					parent : value
				});
				$("#wardCode").data("kendoComboBox").select(-1);
			}

		}
	});

	$("#wardCode").kendoComboBox({
		placeholder : "Chọn Xã/ Phường",
		dataTextField : "itemName",
		dataValueField : "itemCode",
		noDataTemplate : "Không có dữ liệu",
		filter : "contains",
		dataSource : {
			transport : {
				read : function(options){
					var parent = "${(dossier.districtCode)!}";
					if(options.data.parent){
						parent = options.data.parent;
					}
					$.ajax({
						url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
						dataType : "json",
						type : "GET",
						headers: {"groupId": "${groupId}"},
						data : {
							parent : parent
						},
						success : function(result){
							options.success(result);
						},
						error : function(result){
							options.error(result);
						}
					});
				}
			},
			schema : {
				data : "data",
				total : "total"
			}
		}

	});

	$("#corporationCode").kendoComboBox({
		placeholder : "Chọn địa điểm nhận ấn chỉ",
		dataTextField : "itemName",
		dataValueField : "itemCode",
		noDataTemplate : "Không có dữ liệu",
		autoBind : false,
		filter : "contains",
		dataSource : {
			transport : {
				read : function(options){
					$.ajax({
						url : "${api.server}/dictcollections/VR30/dictgroups/CPP/dictitems",
						dataType : "json",
						type : "GET",
						headers: {"groupId": "${groupId}"},
						data : {
						},
						success : function(result){
							if (!result['data']) {
								result = {
									total: 0,
									data: []
								}
							}
							options.success(result);
						},
						error : function(result){
							options.error(result);
						}
					});
				}
			},
			schema : {
				data : "data",
				total : "total"
			}
		},
		change: function (e) {
			var value = this.value();
			// changeDiaDiemNhanAnChi(value);
			// $('#postalInfo').html('');
		}

	});

	$("#postalCityCode").kendoComboBox({
		placeholder : "Chọn Tỉnh/ Thành phố",
		dataTextField : "itemName",
		dataValueField : "itemCode",
		noDataTemplate : "Không có dữ liệu",
		autoBind : false,
		filter : "contains",
		dataSource : {
			transport : {
				read : function(options){
					$.ajax({
						url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
						dataType : "json",
						type : "GET",
						headers: {"groupId": "${groupId}"},
						data : {
							parent : 0
						},
						success : function(result){
							options.success(result);
						},
						error : function(result){
							options.error(result);
						}
					});
				}
			},
			schema : {
				data : "data",
				total : "total"
			}
		}

	});

	$(function() {
		$("[data-role=combobox]").each(function() {
			var widget = $(this).getKendoComboBox();
			widget.input.on("focus", function() {
				widget.open();
			});
		});
	});

	var checkIsXNHL = function (serviceCode) {
        var listServiceCode = ['TT302011BGTVTCNCLKLLKXCGXNHL', 'TT302011BGTVTCNCLKLLKXMXNHL', 'TT302011BGTVTCNCLKLTXXBBCHXNHL', 'TT302011BGTVTCNCLKLTXXBBCNXNHL', 'TT302011BGTVTCNCLKLTXXCGXNHL', 'TT302011BGTVTCNCLKLTXXDDXNHL', 'TT302011BGTVTCNCLKLTXXMTGMXNHL']
        if (listServiceCode.includes(serviceCode)) {
            return true
        } else {
            return false
        }
    }

	var checkIsXNHL_HangNam = function (serviceCode) {
		var listServiceCodeHN = ['TT302011BGTVTCNCLKLLKOTO', 'TT302011BGTVTCNCLKLLKXM', 'TT302011BGTVTCNCLKLTXXCG','TT302011BGTVTCNCLKLTXXMTGM', 'TT302011BGTVTCNCLKLTXXDD', 'TT302011BGTVTCNCLKLTXXBBCN', 'TT302011BGTVTCNCLKLTXXBBCH']
		if (listServiceCodeHN.includes(serviceCode)) {
			return true
		} else {
			return false
		}
	}

	var printDetailDossier = function(dossierId){
		if(dossierId){
			$.ajax({
				url : "${api.server}/dossiers/"+dossierId,
				dataType : "json",
				type : "GET",
				headers : {"groupId": "${groupId}"},
				success : function(result){
					$("#dossierIdCTN").val(result['dossierIdCTN']);
					$("#dossierStatusHidden").val(result['dossierStatus']);
					// var isHoSoXNHL = window.sessionStorage.getItem('isXNHL');
					var isHoSoXNHL = checkIsXNHL(result['serviceCode']);
					var isHoSoXNHL_HangNam = checkIsXNHL_HangNam(result['serviceCode']);
					console.log("load detail dossier!");
					console.log(result);
					console.log('isXNHL+++++++', isHoSoXNHL);
					dataSourceDossierTemplate.read({
						dossierTemplateNo : result.dossierTemplateNo
					});
					var dossierIdCTNHoSoXNHL = window.sessionStorage.getItem('dossierIdCTNHoSoXNHL');
					if (isHoSoXNHL) {
						var brefNoteHoSoXNHL = window.sessionStorage.getItem('briefNoteHoSoXNHL') || '';
						$('#danhSachCacLanXNHL_Toogle').show();
						$("#brefNoteHSXNHL").show();
						dataSourceDanhSachCacLanXNHLTemplate.read({
							dossierIdCTN : dossierIdCTNHoSoXNHL,
							type: dossierIdCTNHoSoXNHL ? 1 : 2
						});
						$("#brefNoteHSXNHL").html(brefNoteHoSoXNHL)
					} else {
						$('#danhSachCacLanXNHL_Toogle').hide();
						$("#brefNoteHSXNHL").hide();
						$("#brefNoteHSXNHL").html("")
					}

					if (isHoSoXNHL_HangNam) {
						$('#danhSachCacLanXNHL_HangNam_Toogle').show();
						dataSourceDanhSachCacLanXNHL_HangNamTemplate.read({
							dossierIdCTN : dossierIdCTNHoSoXNHL,
							type: dossierIdCTNHoSoXNHL ? 1 : 2
						});
					} else {
						$('#danhSachCacLanXNHL_HangNam_Toogle').hide();
					}

					var viewModel = kendo.observable({
						dossierTemplateNo : function(){
							result.dossierTemplateNo;
						},

						serviceCode : result.serviceCode,
						govAgencyCode : result.govAgencyCode,
						dossierTemplateNo : function (e) {
							var listCapPhieu = ['TT302011BGTVTCPPXCG', 'TT302011BGTVTCPPXMTGM', 'TT302011BGTVTCPPXBBCN', 'TT302011BGTVTCPPXBBCH', 'TT302011BGTVTCPPXDD', 'TT302011BGTVTCPPXCD'];
							if (listCapPhieu.includes(result['dossierTemplateNo'])) {
								$("#nhanKetQuaTu").show();
							} else {
								$("#nhanKetQuaTu").hide();
							}
							return result['dossierTemplateNo'];
						},
						serviceName : result.serviceName,
						govAgencyName : result.govAgencyName,

						applicantName : result.applicantName,
						address : result.address,
						cityCode : result.cityCode,
						districtCode : result.districtCode,
						wardCode : result.wardCode,
						contactTelNo : result.contactTelNo,
						contactEmail : result.contactEmail,
						applicantNote : function(){
							/*var applicantNote = sessionStorage.getItem("applicantNote");
							if(typeof applicantNote === 'object' || applicantNote){
								applicantNote = "";
							}
							return applicantNote;*/

							return "";
						},
						dossierNote : function(){
							if(result.dossierNote){
								return result.dossierNote;
							}else {
								return "";
							}
						},
						viaPostal : function(){
							if(result.viaPostal === 2){
								$("#viaPostal").prop('checked', true);
								$("#postalAddress").prop('disabled', false);
								$("#postalCityCode").data("kendoComboBox").enable(true);
								$("#postalTelNo").prop('disabled', false);
								$("#postalReceiverName").prop('disabled', false);
							}else {
								$("#viaPostal").prop('checked', false);
							}
							
						},
						postalAddress : result.postalAddress,
						postalCityCode : result.postalCityCode,
						postalTelNo : result.postalTelNo,
						postalReceiverName: result['postalReceiverName']

					});
					kendo.bind($("#detailDossier"), viewModel);
				},
				error : function(result){

				}

			});
		}
	}

	printDetailDossier("${dossierId}");

	var removeDossierFile = function(dossierId, fileId){
		$.ajax({
			url : "${api.server}/dossiers/"+dossierId+"/files/"+fileId+"/resetformdata",
			dataType : "json",
			type : "PUT",
			headers : {"groupId": "${groupId}"},
			success : function(result) {

			},
			error : function(result) {

			}
		});
	}

	var removeDossierFileNotEform = function(dossierId,fileTemplateNo,partNo){
		if(navigator.onLine){
			var data = new FormData();
			$.ajax({
				url : "${api.server}/dossiers/"+dossierId+"/files/"+fileTemplateNo+"/all",
				type : "DELETE",
				dataType : "json",
				processData: false,
				contentType: false,
				cache: false,
				headers : {
					"groupId": "${groupId}",
					"Accept" : "application/json"
				},
				data : data,
				success : function(result) {
					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");

					$(".dossier-component-profile").filter("[data-partno="+partNo+"]").html('<span class="number-in-circle" >0</span>');

					$(".dossier-component-profile").filter("[data-partno="+partNo+"]").attr("data-number",0);

				},
				error : function(result) {
					if(navigator.onLine){
						notification.show({
							message: "Xẩy ra lỗi, vui lòng thử lại"
						}, "error");
					}
				}
			});
		}
		
	}

	/*function makeFileList() {
		var input = document.getElementById("file");
		var ul = document.getElementById("fileList");
		while (ul.hasChildNodes()) {
			ul.removeChild(ul.firstChild);
		}
		for (var i = 0; i < input.files.length; i++) {
			var li = document.createElement("li");
			li.innerHTML = input.files[i].name;
			ul.appendChild(li);
		}
		if(!ul.hasChildNodes()) {
			var li = document.createElement("li");
			li.innerHTML = 'No Files Selected';
			ul.appendChild(li);
		}
	}
	*/

	var funUploadFile = function(file, partNo , dossierTemplateNo , fileTemplateNo, hasForm){
		var data = new FormData();
		console.log(file);
		var fileLength = $(file)[0].files.length;
		data.append( 'displayName', $(file)[0].files[0].name);
		data.append( 'file', $(file)[0].files[0]);
		data.append('dossierPartNo', partNo);
		data.append('referenceUid', "");
		data.append('dossierTemplateNo', dossierTemplateNo);
		data.append('fileTemplateNo', fileTemplateNo);
		data.append('formData', "");
		data.append('fileType', "");
		data.append('isSync', "true");
		data.append('formDataDossierFile', "");
		//data.append('deliverableCode', "");

		$.ajax({
			type : 'POST', 
			url  : '${api.server}/dossiers/${dossierId}/files', 
			data : data,
			headers: {"groupId": "${groupId}"},
			dataType: 'json',
			processData: false,
			contentType: false,
			cache: false,
			success :  function(result){ 
				kendo.ui.progress($("#mainType2"), false);

				console.log("fileLength=======",fileLength);

				var currentFileNumber = $(".dossier-component-profile").filter("[data-partno="+partNo+"]").attr("data-number");

				console.log("currentFileNumber=======",currentFileNumber);

				var totalFile = fileLength + parseInt(currentFileNumber, 0);

				console.log("totalFile=======",totalFile);

				$(".dossier-component-profile").filter("[data-partno="+partNo+"]").html('<span class="number-in-circle" >'+totalFile+'</span>');

				console.log("dossier-component-profile=======",$(".dossier-component-profile").filter("[data-partno="+partNo+"]"));


				$(".dossier-component-profile").filter("[data-partno="+partNo+"]").attr("data-number",totalFile);

				notification.show({
					message: "Yêu cầu được thực hiện thành công"
				}, "success");

				if(!hasForm){
					$("#validPart"+partNo).val("1");
				}
				dossierFiles.push(result);

				$(file).val("");

			},
			error:function(result){
				kendo.ui.progress($("#mainType2"), false);

				notification.show({
					message: "Thực hiện không thành công, xin vui lòng thử lại"
				}, "error");

				$(file).val("");
			}
		});
		console.log("success!");
	}

	$("#viaPostal").change(function(){
		if($(this).is(":checked")) {
			$("#postalAddress").prop('disabled', false);
			$("#postalCityCode").data("kendoComboBox").enable(true);
			$("#postalTelNo").prop('disabled', false);
			$("#postalReceiverName").prop('disabled', false);
			// $('#corporationCode').data("kendoComboBox").select(-1);
			// $('#corporationCode').data("kendoComboBox").enable(false);
		}else{
			$("#postalAddress").prop('disabled', true);
			$("#postalCityCode").data("kendoComboBox").enable(false);
			$("#postalTelNo").prop('disabled', true);
			// $("#postalReceiverName").prop('disabled', true);
			// $('#corporationCode').data("kendoComboBox").enable(true);
		}
	});

	$("#postalAddress").prop('disabled', true);
	$("#postalCityCode").data("kendoComboBox").enable(false);
	$("#postalTelNo").prop('disabled', true);
	$("#postalReceiverName").prop('disabled', true);



});

var getReferentUidFile = function(dossierId, dossierPartNo){
	var dossierFile = {};
	if (!dossierId) {
		console.log('ko có dossierId', dossierId);
		return {}
	}
	if((!dossierFiles || !dossierFiles['length'])){
		$.ajax({
			type : 'GET', 
			dataType : "json",
			url  : '${api.server}/dossiers/${dossierId}/files', 
			headers: {"groupId": "${groupId}"},
			async : false,
			success :  function(result){ 
				dossierFiles = result['data'] || [];
				if(result['data']){
					for (var i = 0; i < result.data.length; i++) {
						if(result.data[i].eForm){
							if(dossierPartNo == result.data[i]['dossierPartNo']){
								dossierFile = result.data[i];
								break;
							}

						}
					}
				}

			},
			error:function(result){

			}
		});
	} else if (dossierFiles['length']) {
		for (var i = 0; i < dossierFiles['length']; i++) {
			if(dossierFiles[i]['eForm']){
				if(dossierPartNo == dossierFiles[i]['dossierPartNo']){
					dossierFile = dossierFiles[i];
					break;
				}

			}
		}
	}
	console.log('dossierFile+++++++++++++++++', dossierFile);
	return dossierFile;
}

$(function(){
	manageDossier.route("/taohosomoi/nophoso/(:dossierId)", function(dossierId){
		$("#mainType1").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.customer_dossier_detail_2}&${portletNamespace}dossierId="+dossierId,function(result){
			
		});
	});
});

var fnGetFormData = function(dossierId, referentUid, id){
	var value = null;
	var tmpdossierIdBanKhaiHoSoXNHL = dossierIdBanKhaiHoSoXNHL ? dossierIdBanKhaiHoSoXNHL : window.sessionStorage.getItem('dossierIdBanKhaiHoSoXNHL');
	console.log('tmpdossierIdBanKhaiHoSoXNHL====', tmpdossierIdBanKhaiHoSoXNHL)
	if(dossierId && referentUid && (!tmpdossierIdBanKhaiHoSoXNHL || tmpdossierIdBanKhaiHoSoXNHL == '0')){
		$.ajax({
			url : "${api.server}/dossiers/" + dossierId + "/files/" + referentUid + "/formdata",
			type : "GET",
			dataType : "json",
			async : false,
			success : function (result) {
				value = result;
			},
			error : function(result){

			}

		});
	} else if (tmpdossierIdBanKhaiHoSoXNHL && id) {
		var expireCertificateId = window.sessionStorage.getItem('expireCertificateId');
		$('#expireCertificateId_hidden').val(expireCertificateId)
		console.log("dossierIdBanKhaiHoSoXNHL=============", tmpdossierIdBanKhaiHoSoXNHL, id)
		$.ajax({
			url : "${api.server}/dossiers/" + tmpdossierIdBanKhaiHoSoXNHL + "/files",
			type : "GET",
			dataType : "json",
			async : false,
			success : function (result) {
				if (result && result['data']) {
					for (var i = 0; i < result['data'].length; i++) {
						var tmpFile = result['data'][i];
						if (tmpFile && tmpFile['dossierPartNo'] == id) {
							if (tmpFile['formData']) {
								value = JSON.parse(tmpFile['formData']);
							}
						}
					}
				}
			},
			error : function(result){

			}

		});
	}

	// if ("${dossier.dossierTemplateNo}" == 'TT302011BGTVTCOP' && !"${dossier.dossierStatus}") {
	// 	$.ajax({
	// 		url : "/o/rest/vr-app/cop/copreportrepository/${registration.applicantCode}/1",
	// 		type : "GET",
	// 		dataType : "json",
	// 		async : false,
	// 		success : function (resultCOP){
	// 			console.log('resultCOP============', resultCOP);
	// 			if (resultCOP) {
	// 				if (resultCOP['copReportMetadata']) {
	// 					var tmpDanhSachSP = JSON.parse(resultCOP['copReportMetadata']);
	// 					value['danh_sach_san_pham'] = tmpDanhSachSP;
	// 				}
	// 				$.ajax({
	// 					url : "/o/rest/vr-app/cop/productionplant/prodequipment/reportrepository/1/" + resultCOP['id'],
	// 					type : "GET",
	// 					dataType : "json",
	// 					async : false,
	// 					success : function (resultProPlantEquip){
	// 						console.log('resultProPlantEquip============', resultCOP)
	// 						if (resultProPlantEquip && resultProPlantEquip['length']) {
	// 							resultProPlantEquip = resultProPlantEquip.map(function (item) {
	// 								if (item['description']) {
	// 									var tmp = JSON.parse(item['description'])
	// 									console.log('tmp resultProPlantEquip++++++++++', tmp);
	// 									item = Object.assign(item, tmp);
	// 								}
	// 								return item;
	// 							});
	// 							value['thiet_bi_xuat_xuong'] = resultProPlantEquip;
	// 						}
	// 					},
	// 					error : function(result){

	// 					}

	// 				});
	// 			}
	// 		},
	// 		error : function(result){

	// 		}

	// 	});
	// }
	console.log('value++++++++++++++', value)
	return value;
}

var fnCheckValidTemplate = function(){
	console.log($(".validPart"));
	var valid = true;
	try {

		$(".validPart").each(function(index){
			console.log($(this).val());
			if($(this).val() === "0"){
				valid = false;
			}
		});

	}catch(e){
		valid = false;
	}

	return valid;
}

var fnSaveForm = function(id, value){
	var current = $("#btn-save-formalpaca"+id);
	var referentUid = current.attr("referenceUid");
	console.log(referentUid);
	if(referentUid){
		$.ajax({
			url : "${api.server}/dossiers/${dossierId}/files/"+referentUid+"/formdata",
			dataType : "json",
			type : "PUT",
			headers: {
				"groupId": "${groupId}",
				Accept : "application/json"
			},
			data : {
				formdata: JSON.stringify(value)
			},
			success : function(result){
				notification.show({
					message: "Yêu cầu được thực hiện thành công!"
				}, "success");
				console.log($("#validPart"+id));
				$("#validPart"+id).val("1");
				try{
					for (var i = 0; i < arrIsChangeForm.length; i++) {
						if(arrIsChangeForm[i].partNo === id){
							arrIsChangeForm[i].isSave = true;
						}
					}
				}catch(e){

				}
			},
			error : function(result){
				notification.show({
					message: "Thực hiện không thành công, xin vui lòng thử lại!"
				}, "error");
			}
		});
	}
}

	$(document).off("click",".saveFormAlpaca");
	$(document).on("click",".saveFormAlpaca",function(event){
		var id = $(this).attr("data-pk");
		var partName = $(this).attr("data-partname");
		var referentUidFile = $(this).attr("referenceUid");

		console.log('partNo++++++++++++++', id);
		console.log('partName++++++++++++++', partName);

		var value = null;

		var formControl = $("#formPartNo"+id).alpaca('get');
		if ("${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
			if (formControl && formControl['options'] && formControl['options']['fields'] && formControl['options']['fields']['initEvent']) {
				if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('validateData')) {
					console.log('Không có hàm validateData trong form alpaca!!!!');
					notification.show({
						message: "Không có hàm validateData trong form alpaca!!!!"
					}, "error");
					return false;
				} else {
					var validate = formControl['options']['fields']['initEvent'].validateData();
					if (!validate) {
						notification.show({
							message: "Thành phần " + partName + " đang chưa đủ dữ liệu, vui lòng kiểm tra lại!"
						}, "error");
						return false;
					}
				}

				if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('postData')) {
					console.log('Không có hàm postData trong form alpaca!!!!');
					notification.show({
						message: "Không có hàm postData trong form alpaca!!!!"
					}, "error");
					value = $('#formPartNo' + id).alpaca('get').getValue();
					// return false;
				} else {
					value = formControl['options']['fields']['initEvent'].postData();
					if (!value) {
						console.log('hàm postData value = rỗng !!!!', value);
						notification.show({
							message: "Thành phần " + partName + " đang không có dữ liệu, vui lòng kiểm tra lại!"
						}, "error");
						return false;
					}
				}
			} else {
				console.log('Không có formControl!!!!');
				return;
			}
		}
		
		// if ("${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
		// 	if (formControl && formControl['options'] && formControl['options']['fields'] && formControl['options']['fields']['initEvent']) {
		// 		if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('postData')) {
		// 			console.log('Không có hàm postData trong form alpaca!!!!');
		// 			notification.show({
		// 				message: "Không có hàm postData trong form alpaca!!!!"
		// 			}, "error");
		// 			return false;
		// 		} else {
		// 			value = formControl['options']['fields']['initEvent'].postData();
		// 			if (!value) {
		// 				console.log('hàm postData value = rỗng !!!!', value);
		// 				notification.show({
		// 					message: "Thành phần " + partName + " đang không có dữ liệu, vui lòng kiểm tra lại!"
		// 				}, "error");
		// 				return false;
		// 			}
		// 		}
		// 	} else {
		// 		console.log('Không có formControl!!!!');
		// 		return;
		// 	}
		// }
		// if ("${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
		// 	if (formControl && formControl['options'] && formControl['options']['fields'] && formControl['options']['fields']['initEvent']) {
		// 		if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('postData')) {
		// 			value = $('#formPartNo' + id).alpaca('get').getValue();
		// 		} else {
		// 			value = formControl['options']['fields']['initEvent'].postData();
		// 		}
		// 	} else {
		// 		console.log('Không có formControl!!!!');
		// 		return;
		// 	}
		// }

		var extendValue = $('.extendValueForm')
		if (extendValue && extendValue['length']) {
			for (var i = 0; i < extendValue.length; i++) {
				var key = $(extendValue[i]).attr('key')
				if (key) {
					value[key] = $(extendValue[i]).val()
				}

			}
		}

		var errorMessage = '';
		console.log(errorMessage);
		console.log(referentUidFile);
		console.log('formControl+++++++++++++initEvent', formControl['options']['fields'] && formControl['options']['fields']['initEvent']);
		var formType = $("#formPartNo"+id+" .formType").val();

		if (referentUidFile && formType !== 'dklr') {
			$.ajax({
				url : "${api.server}/dossiers/${dossierId}/files/"+referentUidFile+"/formdata",
				dataType : "json",
				type : "PUT",
				headers: {
					"groupId": "${groupId}",
					Accept : "application/json"
				},
				data : {
					formdata: JSON.stringify(value)
				},
				success : function(result){
					notification.show({
						message: "Yêu cầu được thực hiện thành công!"
					}, "success");
					console.log($("#validPart"+id));
					$("#validPart"+id).val("1");

					try{
						for (var i = 0; i < arrIsChangeForm.length; i++) {
							if(arrIsChangeForm[i].partNo === id){
								arrIsChangeForm[i].isSave = true;
							}
						}
						jQuery.data( document.body, "arrIsChangeForm", arrIsChangeForm );
					}catch(e){

					}
				},
				error : function(result){
					console.log('Thực hiện không thành công, xin vui lòng thử lại!!!!!!')
					notification.show({
						message: "Thực hiện không thành công, xin vui lòng thử lại!"
					}, "error");
				}
			});
		}else {
			if (!referentUidFile) {
				console.log('Không có referenceUid!!!!');
			} else {
				console.log('formType dklr!!!!');
			}
			
			// notification.show({
			// 	message: "Vui lòng kiểm tra lại các thông tin bắt buộc trước khi ghi lại!"
			// }, "error");
		}

		if ("${dossier.dossierTemplateNo}" === 'TT302011BGTVTCOP' && id === 'TP99') {
			$('#thoi_han_kiem_tra_from').val($('#ngay_kiem_tra').val())
			$('#thoi_han_kiem_tra_to').val($('#ngay_kiem_tra_to').val())
			$('#btn-save-formalpacaTP1').click()
		}

	});

$(document).ready(function(){
	$('html, body').animate({
		scrollTop: $("#dossierFormSubmiting").offset().top
	}, 700);
});

$("#btn-cancelling-header").click(function(){
	kendo.confirm("Bạn có muốn gửi yêu cầu hủy?").then(function () {
		fnCancelling("${(dossierId)!}");
	}, function () {

	});
});

$("#btn-submiting-header").click(function(){
	kendo.confirm("Bạn có muốn gửi yêu cầu bổ sung?").then(function () {
		fnSubmitting("${(dossierId)!}");
	}, function () {
		
	});
});

$("#btn-rescancelling-dossier").click(function(){
	kendo.confirm("Bạn có muốn gửi yêu cầu hủy?").then(function () {
		fnCancelling("${(dossierId)!}");
	}, function () {

	});
	
});

$("#btn-sendadd-dosier").click(function(){
	kendo.confirm("Bạn có muốn gửi yêu cầu bổ sung?").then(function () {
		fnSubmitting("${(dossierId)!}");
	}, function () {
		
	});
	
});

var fnCancelling = function(dossierId){
	console.log("-----------1" + "${(dossier.dossierStatus)!}");
	if("${(dossier.dossierStatus)!}" !== "new" && "${(dossier.dossierStatus)!}" !== "null" && "${(dossier.dossierStatus)!}" !== "done"){
		var applicantNote = $("textarea#applicantNote").val();
		if(applicantNote.trim() == ''){
			alert('Bạn phải nhập ý kiến trước khi gửi.');
			$("textarea#applicantNote").focus();
			return;
		}
		console.log("run rescancelling!");
		$.ajax({
			url : "${api.server}/dossiers/${dossierId}",
			dataType : "json",
			type : "PUT",
			headers: {
				"groupId": "${groupId}",
				Accept : "application/json"
			},
			data : {
				applicantNote : $("textarea#applicantNote").val()
			},
			success : function(result){

				$.ajax({
					url : "${api.server}/dossiers/"+dossierId+"/cancelling",
					dataType : "json",
					type : "GET",
					headers: {
						"groupId": "${groupId}",
						Accept : "application/json"
					},
					data : {

					},
					success : function(result){
						notification.show({
							message: "Yêu cầu được thực hiện thành công!"
						}, "success");

					},
					error : function(result){
						notification.show({
							message: "Thực hiện không thành công, xin vui lòng thử lại!"
						}, "error");
					}
				});

				
			},
			error : function(result){
				
			}
		});
	}

}

var fnSubmitting = function(dossierId){
	console.log("----------1" + "${(dossier.dossierStatus)!}");
	var applicantNote = $("textarea#applicantNote").val();
	if(applicantNote.trim() == ''){
		alert('Bạn phải nhập ý kiến trước khi gửi.');
		$("textarea#applicantNote").focus();
		return;
	}
	if("${(dossier.dossierStatus)!}" == "waiting"){
		console.log("run senadd!");
		$.ajax({
			url : "${api.server}/dossiers/${dossierId}",
			dataType : "json",
			type : "PUT",
			headers: {
				"groupId": "${groupId}",
				Accept : "application/json"
			},
			data : {
				applicantNote : $("textarea#applicantNote").val()
			},
			success : function(result){
				$.ajax({
					url : "${api.server}/dossiers/"+dossierId+"/submitting",
					dataType : "json",
					type : "GET",
					headers: {
						"groupId": "${groupId}",
						Accept : "application/json"
					},
					data : {

					},
					success : function(result){
						notification.show({
							message: "Yêu cầu được thực hiện thành công!"
						}, "success");

					},
					error : function(result){
						notification.show({
							message: "Thực hiện không thành công, xin vui lòng thử lại!"
						}, "error");
					}
				});
				
			},
			error : function(result){
				
			}
		});
	}
	
	if("${(dossier.dossierStatus)!}" == "done"){
		console.log("run senadd!");
		$.ajax({
			url : "${api.server}/dossiers/${dossierId}",
			dataType : "json",
			type : "PUT",
			headers: {
				"groupId": "${groupId}",
				Accept : "application/json"
			},
			data : {
				applicantNote : $("textarea#applicantNote").val()
			},
			success : function(result){
				$.ajax({
					url : "${api.server}/dossiers/"+dossierId+"/correcting",
					dataType : "json",
					type : "GET",
					headers: {
						"groupId": "${groupId}",
						Accept : "application/json"
					},
					data : {

					},
					success : function(result){
						notification.show({
							message: "Yêu cầu được thực hiện thành công!"
						}, "success");

					},
					error : function(result){
						notification.show({
							message: "Thực hiện không thành công, xin vui lòng thử lại!"
						}, "error");
					}
				});
				
			},
			error : function(result){
				
			}
		});
	}
}

/*$(window).hashchange( function(){
	var isValid = false;
	$("#dialogConfirm").data("kendoDialog").open();
});*/
// $(document).off("keyup",".formAlpacaDN input,select");
// $(document).off("change",".formAlpacaDN input,select");
// $(document).on({
// 	keyup: function () {
// 		var partNo = $(this).parents(".formAlpacaDN").attr("data-pk");
// 		var partName = $(this).parents(".formAlpacaDN").attr("data-partname");
// 		console.log("keyup form partno ====",partNo);
// 		if(partNo){
// 			if(arrIsChangeForm){
// 				for (var i = 0; i < arrIsChangeForm.length; i++) {
// 					if(arrIsChangeForm[i].partNo === partNo){
// 						arrIsChangeForm[i].partName = partName;
// 						arrIsChangeForm[i].isSave = false;
// 						return;
// 					}
// 				}
// 			}
// 			arrIsChangeForm.push({
// 				partNo : partNo,
// 				partName : partName,
// 				isSave : false
// 			});
// 		}
// 		jQuery.data( document.body, "arrIsChangeForm", arrIsChangeForm );
// 	},
// 	change: function () {
// 		var partNo = $(this).parents(".formAlpacaDN").attr("data-pk");
// 		var partName = $(this).parents(".formAlpacaDN").attr("data-partname");
// 		console.log("change form partno ====",partNo);
// 		if(partNo){
// 			if(arrIsChangeForm){
// 				for (var i = 0; i < arrIsChangeForm.length; i++) {
// 					if(arrIsChangeForm[i].partNo === partNo){
// 						arrIsChangeForm[i].partName = partName;
// 						arrIsChangeForm[i].isSave = false;
// 						return;
// 					}
// 				}
// 			}
// 			arrIsChangeForm.push({
// 				partNo : partNo,
// 				partName : partName,
// 				isSave : false
// 			});
// 		}
// 		jQuery.data( document.body, "arrIsChangeForm", arrIsChangeForm );
// 	}
// }, '.formAlpacaDN input,select');

// window.onhashchange = function(event) {
// 	if($(".saveFormAlpaca").length > 0){
// 		try{
// 			var isChange = fnCheckIsChangeForm();
// 			console.log("isChange");
// 			if(isChange){
// 				var cf = confirm("Bạn vừa thay đổi dữ liệu trong "+isChange.partName+" bạn có muốn lưu lại!");
// 				if(cf){
// 					$(".saveFormAlpaca[data-pk="+isChange.partNo+"]").trigger("click");
// 					event.preventDefault();
// 				}else {
					
// 					$.each(arrIsChangeForm,function(index,value){
// 						if(value.partNo === isChange.partNo){
// 							arrIsChangeForm.splice(index, 1);
// 							return ;
// 						}
// 					});

// 				}
// 				return ;
// 			}else {
// 				return ;
// 			}
// 		}catch(e){

// 		}
// 	}
	
// }
var funGenNumberFile = function(arrCount){
	$(".dossier-component-profile").each(function(index){
		var partNo = $(this).attr("data-partno");
		var found = $.grep(arrCount, function(v) {
			return v.dossierPartNo === partNo;
		});

		$(this).attr("data-number",found.length);
		$(this).html('<span class="number-in-circle" >' + found.length + '</span>');
	});
}

var funDossierFile = function (dossierId, callBack) {
	if(!dossierId){
		console.log('Ko có dossierId', dossierId);
		callBack([]);
		return;
	}
	if (dossierFiles && dossierFiles['length']) {
		callBack(dossierFiles);
	} else {
		$.ajax({
			url: "${api.server}/dossiers/" + dossierId + "/files",
			dataType: "json",
			type: "GET",
			async: false,
			headers: {"groupId": "${groupId}"},
			success: function (result) {
				if (result.data) {
					callBack(result.data);
				} else {
					callBack([]);
				}
				dossierFiles = result['data'] || [];
			},
			error: function (xhr) {
				console.log(xhr);
			}
		});
	}
}

/*$(window).on("navigate", function (event, data) {
	var direction = data.state.direction;
	if (direction == 'back') {
		if($(".saveFormAlpaca").length > 0){
			try{
				var isChange = fnCheckIsChangeForm();
				console.log("isChange");
				if(isChange){
					var cf = confirm("Bạn vừa thay đổi dữ liệu trong "+isChange.partName+" bạn có muốn lưu lại!");
					if(cf){
						$(".saveFormAlpaca[data-pk="+isChange.partNo+"]").trigger("click");
						event.preventDefault();
					}else {

						$.each(arrIsChangeForm,function(index,value){
							if(value.partNo === isChange.partNo){
								arrIsChangeForm.splice(index, 1);
								return ;
							}
						});

					}
					return ;
				}else {
					return ;
				}
			}catch(e){

			}
		}
	}
	if (direction == 'forward') {
    // do something else
}
});*/
</script>
