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

<div id="detailDossier">
	
	<div class="box" >
		<input type="hidden" name="dossierTemplateId" id="dossierTemplateId">
		<input type="hidden" name="dossierItemId" id="dossierItemId">
		<input type="hidden" name="dossierId_Hidden" id="dossierId_Hidden" value="${(dossierId)!}">
		<input type="hidden" name="dossierTemplateNo" id="dossierTemplateNo" data-bind="value: dossierTemplateNo">
		<input type="hidden" name="dossierId" id="dossierId" value="${(dossierId)!}">
		<input type="hidden" name="dossierNo" id="dossierNo" value="${(dossier.dossierNo)!}">
		<input type="hidden" name="applicantIdNo" id="applicantIdNo" value="${(dossier.applicantIdNo)!}">
		<input type="hidden" name="expireCertificateId_hidden" id="expireCertificateId_hidden" value="">
		<input type="hidden" name="dossierIdCTN" id="dossierIdCTN" value="${(dossier.dossierIdCTN)!}">
		<input type="hidden" name="referenceUid" id="referenceUid" value="${(dossier.referenceUid)!}">
		<input type="hidden" name="dossierStatusHidden" id="dossierStatusHidden" value="${(dossier.dossierStatus)!}">
		<div class="row-header align-middle">
			<div class="background-triangle-big">Tên thủ tục</div> 
			<span class="text-bold" data-bind="text:serviceName"></span>
			<div class="pull-right group-icons">
				<a href="javascript:;" onclick="fnBack();">
					<i class="fa fa-reply" aria-hidden="true"></i>
					Quay lại
				</a>
				<#if dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "new">
					<a href="javascript:;" id="btn-submit-dossier-header" style="display: none;" data-bind="value : lockState">
						<i class="fa fa-paper-plane" aria-hidden="true"></i> 
						Nộp hồ sơ
					</a>
					<a href="javascript:;" id="btn-delete-dossier-header" style="display: none;" data-bind="value : lockState">
						<i class="fa fa-trash"></i>
						Xóa
					</a>
				</#if>
			</div>
		</div>

		<div class="dossier-general-info P15 MB30">
			
			<div class="col-sm-5">
				<span class="text-bold">Trạng thái</span>: <i data-bind="text:dossierStatusText"></i>
			</div>
			<div class="col-sm-7">
				<span>Mã hồ sơ</span>: <span data-bind="text : dossierIdCTN" class="text-bold"></span>
			</div>
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

		<div class="row">
			<div class="col-sm-12">
				<div class="dossier-parts" >
					<div class="head-part align-middle slide-toggle">
						<div class="background-triangle-small">I</div>
						<div class="col-sm-12 PL0">

							<span class="text-uppercase hover-pointer">
								Thông tin chủ hồ sơ
							</span>
							<i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true" style="font-size: 150%;"></i>
						</div>
					</div>
					<div class="content-part collapse" id="collapseDossierI">
						<div class="row-parts-head MT5">
							
							<div class="row MT5">
								<div class="col-sm-2">
									<label>Họ và tên</label>
								</div>
								<div class="col-sm-10">
									<span id="contactName" data-pk="1" data-type="text" data-toggle="#editContactName" data-original-title="Nhập họ và tên" tabindex="-1" class="" data-bind="text:contactName" required></span>
									<span class="pull-right">
										<a href="javascript:;" id="editContactName" style="float: right"><i class="fa fa-pencil"></i></a>
									</span>
								</div>
							</div>

							<div class="row">
								<div class="col-sm-2">
									<label>Địa chỉ</label>
								</div>
								<div class="col-sm-10">
									<span id="address" data-pk="1" data-type="text" data-toggle="#editAddress" data-original-title="Nhập địa chỉ" tabindex="-1" class="" data-bind="text:address" required></span>
									<span class="pull-right">
										<a href="javascript:;" id="editAddress" style="float: right"><i class="fa fa-pencil"></i></a>
									</span>
								</div>
							</div>

							<div class="row">
								<div class="col-sm-2">
									<label>Tỉnh/ Thành phố <span class="red">(*)</span></label>
								</div>
								<div class="col-sm-10">
									<span id="city" data-pk="1" data-type="select" data-toggle="#editCity" data-original-title="Chọn tỉnh/ thành phố" tabindex="-1" class="" data-bind="text:cityName" required><#-- ${api.applicant.cityName} --></span>
									<span class="pull-right">
										<a href="javascript:;" id="editCity" style="float: right"><i class="fa fa-pencil"></i></a>
									</span>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-2">
									<label>Quận/ Huyện <span class="red">(*)</span></label>
								</div>
								<div class="col-sm-10">
									<span id="district" data-pk="1" data-type="select" data-toggle="#editDistrict" data-original-title="Chọn quận/ huyện" tabindex="-1" class="" data-bind="text:districtName" required><#-- ${api.applicant.districtName} --></span>
									<span class="pull-right">
										<a href="javascript:;" id="editDistrict" style="float: right"><i class="fa fa-pencil"></i></a>
									</span>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-2">
									<label>Xã/ Phường <span class="red">(*)</span></label>
								</div>
								<div class="col-sm-10">
									<span id="wards" data-pk="1" data-type="select" data-toggle="#editWards" data-original-title="Chọn xã/ phường" tabindex="-1" class="" data-bind="text:wardName" required><#-- ${api.applicant.wardName} --></span>
									<span class="pull-right">
										<a href="javascript:;" id="editWards" style="float: right"><i class="fa fa-pencil"></i></a>
									</span>
								</div>
							</div>

							<div class="row">
								<div class="col-sm-2">
									<label>Điện thoại</label>
								</div>
								<div class="col-sm-10">
									<span id="contactTelNo" data-pk="1" data-type="text" data-toggle="#editContactTelNo" data-original-title="Nhập số điện thoại" tabindex="-1" class="" data-bind="text:contactTelNo"></span>
									<span class="pull-right">
										<a href="javascript:;" id="editContactTelNo" style="float: right"><i class="fa fa-pencil"></i></a>
									</span>
								</div>
							</div>
							
							<div class="row">
								<div class="col-sm-2">
									<label>Địa chỉ email</label>
								</div>
								<div class="col-sm-10">
									<span data-bind="text:contactEmail"></span>
								</div>
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
														
														var formdata = fnGetFormData(${dossierId},dossierFile.referenceUid);
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

<div class="row-parts-content">

	<div class="row">
		<div class="col-xs-12 MB5">
			<div class="row MB5" id="nhanKetQuaTu">
				<div class="col-xs-12 col-sm-2 ">
					<label>Nhận kết quả từ</label>
				</div>
				<div class="col-sm-10">
					<span id="corporationCode" data-pk="1" data-type="select" data-toggle="#editCorporationCode" data-original-title="Nhận kết quả từ" tabindex="-1" class="" data-bind="text:corporationName" required></span>
					<span class="pull-right">
						<a href="javascript:;" id="editCorporationCode" style="float: right"><i class="fa fa-pencil"></i></a>
					</span>
				</div>
			</div>
		</div>
	</div>

	<div class="checkbox ML15" style="display: inline-block;">
		<input type="checkbox" data-bind="attr : {viaPostal: viaPostal}" name="viaPostal" id="viaPostal"> <label class="text-normal">Tích vào ô này kết quả sẽ trả qua đường bưu điện</label>
	</div>

	<div class="row" id="viaPostalContent">

		<div class="col-xs-12 MB5">
			<div class="row MB5">
				<div class="col-xs-12 col-sm-2 ">
					<label>Tên người nhận (<span style="color: red;">*</span>)</label>
				</div>
				<div class="col-sm-10">
					<span id="postalReceiverName" data-pk="1" data-type="text" data-toggle="#editPostalReceiverName" data-original-title="Nhập tên người nhận" tabindex="-1" class="" data-bind="text:postalReceiverName" required></span>
					<span class="pull-right">
						<a href="javascript:;" id="editPostalReceiverName" style="float: right"><i class="fa fa-pencil"></i></a>
					</span>
				</div>
			</div>
		</div>

		<div class="col-xs-12 MB5">
			<div class="row MB5">
				<div class="col-xs-12 col-sm-2 ">
					<label>Địa chỉ nhận kết quả (<span style="color: red;">*</span>)</label>
				</div>
				<div class="col-sm-10">
					<span id="postalAddress" data-pk="1" data-type="text" data-toggle="#editPostalAddress" data-original-title="Nhập địa chỉ nhận kết quả" tabindex="-1" class="" data-bind="text:postalAddress" required></span>
					<span class="pull-right">
						<a href="javascript:;" id="editPostalAddress" style="float: right"><i class="fa fa-pencil"></i></a>
					</span>
				</div>
			</div>
		</div>

		<div class="col-xs-12 MB5">
			<div class="row ">
				<div class="col-xs-12 col-sm-2 ">
					<label>Tỉnh/Thành phố (<span style="color: red;">*</span>)</label>
				</div>
				<div class="col-sm-10">
					<span id="postalCityCode" data-pk="1" data-type="select" data-toggle="#editPostalCityCode" data-original-title="Chọn Tỉnh/Thành phố" tabindex="-1" class="" data-bind="text:postalCityName" required></span>
					<span class="pull-right">
						<a href="javascript:;" id="editPostalCityCode" style="float: right"><i class="fa fa-pencil"></i></a>
					</span>
				</div>
			</div>
		</div>


		<div class="col-xs-12 MB5">
			<div class="row MB5">
				<div class="col-xs-12 col-sm-2 ">
					<label>Số điện thoại (<span style="color: red;">*</span>)</label>
				</div>
				<div class="col-sm-10">
					<span id="postalTelNo" data-pk="1" data-type="text" data-toggle="#editPostalTelNo" data-original-title="Nhập số điện thoại" tabindex="-1" class="" data-bind="text:postalTelNo" required></span>
					<span class="pull-right">
						<a href="javascript:;" id="editPostalTelNo" style="float: right"><i class="fa fa-pencil"></i></a>
					</span>
				</div>
			</div>
		</div>

		

	</div>

	<div class="row MB5">
		<div class="col-sm-1">
			<label>Ghi chú</label>
		</div>
		<div class="col-sm-11">
			<span id="applicantNote" data-pk="1" data-type="textarea" data-toggle="#editApplicantNote" data-original-title="Ghi chú" tabindex="-1" class="" data-bind="text:applicantNote"></span>
			<span class="pull-right">
				<a href="javascript:;" id="editApplicantNote" style="float: right"><i class="fa fa-pencil"></i></a>
			</span>
		</div>
	</div>
	
</div>
</div>

<div class="button-row MT20">
	<button class="btn btn-active" id="btn-back-dossier" type="button"><i class="fa fa-reply" aria-hidden="true"></i> Quay lại</button>
	
	<#if dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && (dossier.dossierStatus == "new" || dossier.dossierStatus == "")>
		<button class="btn btn-active" id="btn-submit-dossier" data-bind="value : referenceUid" data-bind="value : lockState"><i class="fa fa-paper-plane"></i> Nộp hồ sơ</button>

		<button class="btn btn-active" id="btn-delete-dossier" data-bind="attr : {data-pk : dossierId}" data-bind="value : lockState"><i class="fa fa-trash"></i> Xóa</button>
	</#if>

	<#-- <#if dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "new">
	
	</#if>-->

</div>
</div>

<div id="uploadFileTemplateDialog" class="modal fade" role="dialog">
</div>


<#-- <div id="profileDetail" class="modal fade" role="dialog">
	
</div> -->

<style type="text/css">
	.divForm {
		overflow: auto !important;
	}
</style>


<script type="text/javascript">
	console.log("VLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL2222222222222222222", ${dossier});
	$(".formAlpacaDN").parent().css("overflow", "auto");
	$("#step2").addClass("done");
	$("#step3").addClass("done");
	var arrIsChangeForm = [];
	var fnCheckValidTemplate = function () {
		console.log($(".validPart"));
		var valid = true;
		try {

			$(".validPart").each( function (index) {
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

	var toDetailDossierXNHL = function (event){
		var id = $(event).attr("data-pk");
		var dossierstatus = $(event).attr("data-dossierstatus");
		if (id) {
			window.open('/group/cong-tiep-nhan/quan-ly-ho-so#/' + dossierstatus + '/dossiers/' + id, '_blank')
		} else {
			console.log('ko có id', id)
		}
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

	var fnCheckLockTemplate = function(lockState, item){
		// if(lockState){
		// 	if(lockState.startsWith("LOCK")){

		// 		if(lockState === "LOCK INPUT"){
		// 			return true;
		// 		}else if(lockState === "LOCK ALL"){
		// 			return true;
		// 		}else if (lockState !== "LOCK ALL" && lockState !== "LOCK INPUT" && lockState !== "LOCK OUTPUT" )  {
		// 			var partLocksStr = lockState.split(" ")[1];
		// 			if(partLocksStr){
		// 				var partLocks = partLocksStr.split(",");
		// 				for (var i = 0; i < partLocks.length; i++) {
		// 					if(partLocks[i] === item){
		// 						return true;
		// 					}
		// 				}
		// 			}
		// 		}

		// 	}else if(lockState.startsWith("UPDATE")){

		// 		if(lockState === "UPDATE INPUT"){
		// 			return false;
		// 		}

		// 		if(lockState === "UPDATE ALL"){
		// 			return false;
		// 		}

		// 		if (lockState !== "UPDATE ALL" && lockState !== "UPDATE INPUT" && lockState !== "UPDATE OUTPUT" ){
		// 			var partLocksStr = lockState.split(" ")[1];
		// 			if(partLocksStr){
		// 				var partLocks = partLocksStr.split(",");
		// 				for (var i = 0; i < partLocks.length; i++) {
		// 					if(partLocks[i] === item){
		// 						return false;
		// 					}
		// 				}
		// 			}
		// 		}


		// 	}
		// }

		return false;
	}

	var fnCheckStatusAndHideUpload = function(dossierStatus, dossierParts){
		/*if(dossierStatus !== "" && dossierStatus !== "new" && dossierStatus !== "waiting" && "${(sendAdd)!}" !== "true"){
			$(".uploadfile-form-repository").remove();
			$(".lbl-dossier-file").remove();
			$(".delete-dossier-file").remove();
		}*/

		console.log("dossierParts=========",dossierParts);
		var promise = new Promise(function(resolve, reject){
			$.ajax({
				url : "${api.server}/dossiers/${(dossierId)!}/processstep",
				dataType : "json",
				type : "GET",
				headers : {"groupId": "${groupId}"},
				success : function(result){
					resolve(result);
				},
				error : function(xhr){
					reject(xhr);
				}
			});
		});


		promise.then(function(success){
			var arrPart = success.split(",");
			console.log("arrPart=========",arrPart);
			if(arrPart){
				for (var i = 0; i < arrPart.length; i++) {
					var index = $.inArray( arrPart[i], dossierParts );
					if(index != -1){
						$(".lbl-dossier-file[data-partno="+arrPart[i]+"]").remove();
						$(".uploadfile-form-repository[partno="+arrPart[i]+"]").remove();
						$(".delete-dossier-file[data-partno="+arrPart[i]+"]").remove();
					}
				}
			}


		},function(error){

		});


	}


	var fnCheckIsChangeForm = function (dossierFileId, partNo, partName) {
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
				if (!result['result']) {
					notification.show({
						message: "Dữ liệu đã thay đổi, vui lòng nhấn ghi lại thành phần " + partName
					}, "error");
				}
			},
			error: function(xhr) {
				console.log('xhr+++++++++++++', xhr);
				res = false;
				notification.show({
					message: "Xẩy ra lỗi, vui lòng thử lại"
				}, "error");
			}
		});

		return res;
	}
	$(function(){

		$(document).off("click",".show-dossierpart-new-tab");
		$(document).on("click",".show-dossierpart-new-tab",function(){
			var partNo = $(this).attr("data-partno");
			var hasForm = $(this).attr("hasForm");
			var hasFile = $(this).attr("hasFile");

			if(!hasForm){
				if(hasFile){
					var dossierId = "${(dossierId)!}";
					var dossierTemplateNo = "${(dossier.dossierTemplateNo)!}";

					var url = "#/"+dossierId+"/files/"+dossierTemplateNo+"/"+partNo;

					window.open(url,"_blank");
				}
				
			}
			
		});
		
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
			console.log(partNo);
			console.log(fileTemplateNo);
			console.log($(this)[0].files[0]);

			//show progress load
			kendo.ui.progress($("#mainType2"), true);

			funUploadFile($(this),partNo,dossierTemplateNo,fileTemplateNo);
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
										var arrIsSuccess = new Array();
										for (var i = 0; i < data.length; i++) {
											var isSuccess = false;
											if(dataPartNo === data[i].dossierPartNo){
												isSuccess = removeDossierFile(dossierId, data[i].referenceUid);
												arrIsSuccess.push(isSuccess);

											}
										}

										if(jQuery.inArray( false, arrIsSuccess ) == -1){
											$(".dossier-component-profile").filter("[data-partno="+dataPartNo+"]").html('<span class="number-in-circle" >0</span>');

											$(".dossier-component-profile").filter("[data-partno="+dataPartNo+"]").attr("data-number",0);
											if(navigator.onLine){
												notification.show({
													message: "Yêu cầu được thực hiện thành công"
												}, "success");
											}
											$("#validPart"+dataPartNo).val("0");
										}else {
											if(navigator.onLine){
												notification.show({
													message: "Xẩy ra lỗi, vui lòng thử lại"
												}, "error");
											}
										}

									}
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
			}else{
				alert("Không có kết nối internet, vui lòng kiểm tra kết nối của bạn!");
			}
		});
	});


	$("#btn-back-dossier").click(function(){
		try{
			fnBack();
		}catch(e){
			
		}
	});

	var fnBack = function(){
		window.history.back();
	};

	$("#btn-view-extendguide").click(function(){
		if($("#extend-guide").attr("status")=="none"){

			$("#extend-guide").show();
			$("#extend-guide").attr("status","show");

		}else{

			$("#extend-guide").hide();
			$("#extend-guide").attr("status","none");
			
		}

	});

	var indexDossiserPart = 0 ;
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

	
	$("#lsDossierTemplPart").kendoListView({
		dataSource : dataSourceDossierTemplate,
		autoBind : false,
		change : function(){
			
		},
		template : function(data){

			if(data.partType === 1){
				indexDossiserPart ++;
			}

			data.itemIndex = indexDossiserPart;

			return kendo.template($("#templateDossierPart").html())(data);

		},
		dataBound : function(){
			indexDossiserPart = 0;

			funDossierFile("${dossierId}",funGenNumberFile);
			var dossierParts = this.dataSource.view();
			//kiem tra dossier status, neu status thuoc new thi cho phep upoad hoac sua file
			//fnCheckStatusAndHideUpload("${(dossier.dossierStatus)!}",dossierParts);
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
			funDossierFile("${dossierId}",funGenNumberFile);
		}
	});

	$(document).on("click",".dossier-online-form",function(event){
		console.log("abcd");
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

	$("#showFileTemplateDialog").click(function(){
		$("#fileTemplateDialog").load("employeemain_dossierdetail_filetemplate.ftl",function(result){
			$(this).modal("show");
		});
	});

	$("#btn-submit-dossier").click(function(){
		
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

		sessionStorage.setItem("applicantNote", $('#applicantNote').editable('getValue'));
		var cf = fnConfirm("Thông báo",
			"Bạn có muốn nộp hồ sơ này?", 
			"OK", "Thoát",
			function(){



				funSubmitDossier(function(){
					printDetailDossier("${dossierId}");
				});
				

			}, function(){
				
			});

		cf.open();

		/*kendo.confirm("Bạn có muốn nộp hồ sơ này?").then(function () {
			$("#btn-submit-dossier").button('loading');
			$("#btn-back-dossier").prop("disabled","disabled");
			$("#btn-delete-dossier").prop("disabled","disabled");
			funSubmitDossier();
		}, function () {

		});*/
		
	});

	var funSubmitDossier = function(callBack){
		var validateAplicantInfo = $('#contactName, #city , #district , #wards ' ).editable('validate');
		var validatePostal = true;

		if($("#viaPostal").is(":checked")){
			validatePostal = $('#address, #postalCityCode , #postalTelNo, #postalReceiverName' ).editable('validate');
		}

		console.log(validatePostal);
		console.log(validateAplicantInfo);

		if( jQuery.isEmptyObject(validateAplicantInfo) && jQuery.isEmptyObject(validatePostal)){
			$.ajax({
				type : 'GET', 
				url  : '${api.server}/dossiers/${dossierId}/submitting',
				dataType : "json", 
				data : {

				},
				headers: {
					"groupId": "${groupId}",
					Accept : "application/json"
				},
				success :  function(result){    
					console.log("submit dossier success!");
					$("#btn-submit-dossier").button('reset');
					$("#btn-submit-dossier").hide();
					$("#btn-submit-dossier-header").hide();
					$("#btn-back-dossier").prop("disabled","");
					$("#btn-delete-dossier").prop("disabled","");
					manageDossier.navigate("/taohosomoi/nopthanhcong/${dossierId}"); 
					
					notification.show({
						message: "Yêu cầu được thực hiện thành công!"
					}, "success");
					getTotal();

					$("#lsDossierTemplPart").getKendoListView().refresh();

					callBack();
				},
				error:function(result){
					$("#btn-submit-dossier").button('reset');
					$("#btn-back-dossier").prop("disabled","");
					$("#btn-delete-dossier").prop("disabled","");
					notification.show({
						message: "Có lỗi sảy ra!"
					}, "error");
				}
			});

			
		}else {
			$("#btn-submit-dossier").button('reset');
			$("#btn-back-dossier").prop("disabled","");
			$("#btn-delete-dossier").prop("disabled","");

			var message = '';
			if  (!jQuery.isEmptyObject(validateAplicantInfo)) {
				message = '- Kiểm tra các trường bắt buộc'
			}

			if (!jQuery.isEmptyObject(validatePostal)) {
				message += ' \n ';
				message += '- Kiểm tra các trường bắt buộc của mục thông tin bưu điện'
			}

			notification.show({
				message: message
			}, "error");
		}
		
	}

	var funDeleteDossier = function(dossierId){
		if(dossierId){
			$.ajax({
				type : 'DELETE', 
				url  : '${api.server}/dossiers/'+dossierId, 
				dataType : "json",
				data : {

				},
				headers: {"groupId": "${groupId}"},
				success :  function(result){    
					$("#btn-delete-dossier-header").hide();    
					$("#btn-delete-dossier").hide();
					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");  
					$.ajax({
						url: "/o/rest/v2/dossiers/delete/recycle/data",
						dataType : "json",
						type: "DELETE",
						data: {
							applicantIdNo: "${(applicant.applicantIdNo)!}",
							dossierId: dossierId
						},
						headers: {"groupId": "${groupId}"},
						success: function (result) {

						},
						error: function (result) {

						}
					})
					firstLoadDataSource = true;             
					manageDossier.navigate("/new");
				},
				error:function(result){
					notification.show({
						message: "Có lỗi sảy ra, xin vui lòng thử lại"
					}, "error");
				}
			});
			console.log("delete dossier success!");
		}
	}

	$("#btn-delete-dossier").click(function(){
		var dossierId = $(this).attr("data-pk");

		var cf = fnConfirm("Thông báo",
			"Bạn có muốn xóa hồ sơ này?", 
			"OK", "Thoát",
			function(){

				funDeleteDossier(dossierId);

			}, function(){

			});

		cf.open();

	});

	var updateDossierURL = "/o/rest/v2/dossiers/${dossierId}";

	$('#contactName').editable({
		url: updateDossierURL,
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		emptytext : "",
		params: function(params) {
			return {
				contactName: params.value
			};
		},
		validate: function(value) {
			if (value.length < 1){
				return 'Đây là trường bắt buộc';
			}
		},
		success: function(response, newValue) {
			
		},
		error: function(event, id, obj) {

		}
	});
	$('#editContactName').click(function(e) {
		e.stopPropagation();
		$('#contactName').editable('toggle');
	});

	$('#address').editable({
		url: updateDossierURL,
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		emptytext : "",
		params: function(params) {
			return {
				address: params.value
			};
		},
		validate: function(value) {
			if (value.length < 1){
				return 'Đây là trường bắt buộc';
			}
		},
		success: function(response, newValue) {

		},
		error: function(event, id, obj) {

		}
	});
	$('#editAddress').click(function(e) {
		e.stopPropagation();
		$('#address').editable('toggle');
	});

	$('#city').editable({
		url: updateDossierURL,
		emptytext : "",
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		params: function(params) {
			return {
				cityCode: params.value
			};
		},
		validate: function(value) {
			if (value.length < 1){
				return 'Đây là trường bắt buộc';
			}
		},
		success: function(response, newValue) {
			var arrDisplay = new Array();
			$.ajax({
				url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
				dataType : "json",
				type : "GET",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					parent : newValue
				},
				success : function(result){
					var arrDataRes = result.data;
					for (var i = 0; i < arrDataRes.length; i++) {
						arrDisplay.push({ value: arrDataRes[i].itemCode, text : arrDataRes[i].itemName});
					}
				},
				error : function(xhr){

				}
			});
			$('#district').editable('option', 'source', arrDisplay);
			$('#district').html("-");
			$('#wards').html("-");
			$.ajax({
				url : updateDossierURL,
				dataType : "json",
				type : "PUT",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					districtCode: "-",
					districtName: "-",
					wardCode: "-",
					wardName: "-",
				},
				success : function(result){
					
				},
				error : function(xhr){

				}
			});
		},
		error: function(event, id, obj) {

		},
		prepend: "",
		source: function(){
			var arrDisplay = new Array();
			$.ajax({
				url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
				dataType : "json",
				type : "GET",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					parent : 0
				},
				success : function(result){
					var arrDataRes = result.data;
					for (var i = 0; i < arrDataRes.length; i++) {
						arrDisplay.push({ value: arrDataRes[i].itemCode, text : arrDataRes[i].itemName});
					}
				},
				error : function(xhr){

				}
			});
			return arrDisplay;
		}
	});


	$('#district').editable({
		url: updateDossierURL,
		emptytext : "",
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		params: function(params) {
			return {
				districtCode: params.value
			};
		},
		validate: function(value) {
			if (value.length < 1){
				return 'Đây là trường bắt buộc';
			}
		},
		success : function(response, newValue){
			var arrDisplay = new Array();
			$.ajax({
				url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
				dataType : "json",
				type : "GET",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					parent : newValue
				},
				success : function(result){
					var arrDataRes = result.data;
					for (var i = 0; i < arrDataRes.length; i++) {
						arrDisplay.push({ value: arrDataRes[i].itemCode, text : arrDataRes[i].itemName});
					}
				},
				error : function(xhr){

				}
			});
			$('#wards').editable('option', 'source', arrDisplay);
			$('#wards').html("-");
			$.ajax({
				url : updateDossierURL,
				dataType : "json",
				type : "PUT",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					wardCode: "-",
					wardName: "-",
				},
				success : function(result){
					
				},
				error : function(xhr){

				}
			});
		},
		error : function(xhr){

		},
		prepend: "",
		source: function(){
			var arrDisplay = new Array();
			$.ajax({
				url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
				dataType : "json",
				type : "GET",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					parent : "${(dossier.cityCode)!}"
				},
				success : function(result){
					var arrDataRes = result.data;
					for (var i = 0; i < arrDataRes.length; i++) {
						arrDisplay.push({ value: arrDataRes[i].itemCode, text : arrDataRes[i].itemName});
					}
				},
				error : function(xhr){

				}
			});
			return arrDisplay;
		}
	});

	$('#wards').editable({
		url: updateDossierURL,
		emptytext : "",
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		params: function(params) {
			return {
				wardCode: params.value
			};
		},
		validate: function(value) {
			if (value.length < 1){
				return 'Đây là trường bắt buộc';
			}
		},
		success : function(data){

		},
		error : function(xhr){

		},
		prepend: "",
		source: function(){
			var arrDisplay = new Array();
			$.ajax({
				url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
				dataType : "json",
				type : "GET",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					parent : "${(dossier.districtCode)!}"
				},
				success : function(result){
					var arrDataRes = result.data;
					for (var i = 0; i < arrDataRes.length; i++) {
						arrDisplay.push({ value: arrDataRes[i].itemCode, text : arrDataRes[i].itemName});
					}
				},
				error : function(xhr){

				}
			});
			return arrDisplay;
		}
	});

	$('#editCity').click(function(e) {
		e.stopPropagation();
		$('#city').editable('toggle');
	});

	$('#editDistrict').click(function(e) {
		e.stopPropagation();
		$('#district').editable('toggle');
	});

	$('#editWards').click(function(e) {
		e.stopPropagation();
		$('#wards').editable('toggle');
	});

	$('#contactTelNo').editable({
		url: updateDossierURL,
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		emptytext : "",
		params: function(params) {
			return {
				contactTelNo: params.value
			};
		},
		validate: function(value) {
			if(value === ""){
				return "Bạn phải nhập số điện thoại";
			}
		},
		success: function(response, newValue) {

		},
		error: function(event, id, obj) {

		}
	});
	$('#editContactTelNo').click(function(e) {
		e.stopPropagation();
		$('#contactTelNo').editable('toggle');
	});

	$('#postalAddress').editable({
		url: updateDossierURL,
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		emptytext : "",
		params: function(params) {
			return {
				postalAddress: params.value
			};
		},
		validate: function(value) {
			if(value === ""){
				return "Bạn phải nhập địa chỉ";
			}
		},
		success: function(response, newValue) {

		},
		error: function(event, id, obj) {

		}
	});
	
	$('#editPostalAddress').click(function(e) {
		e.stopPropagation();
		$('#postalAddress').editable('toggle');
	});


	$('#corporationCode').editable({
		url: updateDossierURL,
		emptytext : "",
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		params: function(params) {
			var corporationName = $('#corporationCode').editable()[0].textContent || '';
			console.log('corporationName++++++++++', corporationName, params);
			return {
				corporationCode: params.value,
				corporationName: corporationName
			};
		},
		validate: function(value) {
		},
		success: function(response, newValue) {
			// console.log('newValue++++++', newValue, response);
			// if (newValue && newValue['corporationCode']) {
			// 	$('#viaPostal').val('');
			// 	$("#viaPostal").attr("disabled", true);
			// 	$('#postalReceiverName').editable("setValue", '');
			// 	$('#postalAddress').editable("setValue", '');
			// 	$('#postalCityCode').editable("setValue", '');
			// 	$('#postalTelNo').editable("setValue", '');

			// 	$("#editPostalReceiverName").css("pointer-events", "none");
			// 	$("#editPostalAddress").css("pointer-events", "none");
			// 	$("#editPostalCityCode").css("pointer-events", "none");
			// 	$("#editPostalTelNo").css("pointer-events", "none");

			// 	$.ajax({
			// 		url : updateDossierURL,
			// 		dataType : "json",
			// 		type : "GET",
			// 		async: false,
			// 		headers: {"groupId": "${groupId}"},
			// 		data : {
			// 			viaPostal: 1,
			// 			postalReceiverName: '',
			// 			postalAddress: '',
			// 			postalCityCode: '',
			// 			postalCityName: '',
			// 			postalTelNo: ''
			// 		},
			// 		success : function(result){

			// 		},
			// 		error : function(xhr){

			// 		}
			// 	});
			// } else {
			// 	$("#viaPostal").attr("disabled", false);
			// 	$("#editPostalReceiverName").css("pointer-events", "");
			// 	$("#editPostalAddress").css("pointer-events", "");
			// 	$("#editPostalCityCode").css("pointer-events", "");
			// 	$("#editPostalTelNo").css("pointer-events", "");
			// }
		},
		error: function(event, id, obj) {

		},
		prepend: "",
		source: function () {
			var arrDisplay = new Array();
			$.ajax({
				url : "${api.server}/dictcollections/VR30/dictgroups/CPP/dictitems",
				dataType : "json",
				type : "GET",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					parent : 0
				},
				success : function(result){
					var arrDataRes = result.data || [];
					for (var i = 0; i < arrDataRes.length; i++) {
						arrDisplay.push({ value: arrDataRes[i].itemCode, text : arrDataRes[i].itemName});
					}
				},
				error : function(xhr){

				}
			});
			return arrDisplay;
		}
	});
	
	$('#editCorporationCode').click(function(e) {
		e.stopPropagation();
		$('#corporationCode').editable('toggle');
	});

	$('#postalCityCode').editable({
		url: updateDossierURL,
		emptytext : "",
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		params: function(params) {
			return {
				postalCityCode: params.value
			};
		},
		validate: function(value) {
			if (value.length < 1){
				return 'Đây là trường bắt buộc';
			}
		},
		success: function(response, newValue) {
			
		},
		error: function(event, id, obj) {

		},
		prepend: "",
		source: function(){
			var arrDisplay = new Array();
			$.ajax({
				url : "${api.server}/dictcollections/ADMINISTRATIVE_REGION/dictitems",
				dataType : "json",
				type : "GET",
				async: false,
				headers: {"groupId": "${groupId}"},
				data : {
					parent : 0
				},
				success : function(result){
					var arrDataRes = result.data;
					for (var i = 0; i < arrDataRes.length; i++) {
						arrDisplay.push({ value: arrDataRes[i].itemCode, text : arrDataRes[i].itemName});
					}
				},
				error : function(xhr){

				}
			});
			return arrDisplay;
		}
	});

	$('#editPostalCityCode').click(function(e) {
		e.stopPropagation();
		$('#postalCityCode').editable('toggle');
	});

	$('#postalTelNo').editable({
		url: updateDossierURL,
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		emptytext : "",
		params: function(params) {
			return {
				postalTelNo: params.value
			};
		},
		validate: function(value) {
			if(value === ""){
				return "Bạn phải nhập số điện thoại";
			}
		},
		success: function(response, newValue) {
			
		},
		error: function(event, id, obj) {

		}
	});

	$('#editPostalTelNo').click(function(e) {
		e.stopPropagation();

		$('#postalTelNo').editable('toggle');
	});

	$('#postalReceiverName').editable({
		url: updateDossierURL,
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		emptytext : "",
		params: function(params) {
			return {
				postalReceiverName: params.value
			};
		},
		validate: function(value) {
			if(value === ""){
				return "Bạn phải nhập tên người nhận";
			}
		},
		success: function(response, newValue) {
			
		},
		error: function(event, id, obj) {

		}
	});

	$('#editPostalReceiverName').click(function(e) {
		e.stopPropagation();

		$('#postalReceiverName').editable('toggle');
	});

	

	$('#applicantNote').editable({
		url: updateDossierURL,
		ajaxOptions:{
			type:'PUT',
			dataType: "json",
			headers: {"groupId": "${groupId}"}
		},
		emptytext : "",
		params: function(params) {
			return {
				applicantNote: params.value
			};
		},
		validate: function(value) {

		},
		success: function(response, newValue) {

		},
		error: function(event, id, obj) {

		}
	});
	$('#editApplicantNote').click(function(e) {
		e.stopPropagation();
		$('#applicantNote').editable('toggle');
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
					console.log("load detail dossier!");
					$("#dossierIdCTN").val(result['dossierIdCTN']);
					$("#dossierStatusHidden").val(result['dossierStatus']);
					console.log(result.dossierId);

					dataSourceDossierTemplate.read({
						dossierTemplateNo : result.dossierTemplateNo
					});

					var isHoSoXNHL = checkIsXNHL(result['serviceCode']);
					var isHoSoXNHL_HangNam = checkIsXNHL_HangNam(result['serviceCode']);
					var dossierIdCTNHoSoXNHL = window.sessionStorage.getItem('dossierIdCTNHoSoXNHL');
                    console.log('isXNHL+++++++', isHoSoXNHL);
                    if (isHoSoXNHL) {
                        $('#danhSachCacLanXNHL_Toogle').show();
                        dataSourceDanhSachCacLanXNHLTemplate.read({
							dossierIdCTN : dossierIdCTNHoSoXNHL,
							type: dossierIdCTNHoSoXNHL ? 1 : 2
						});
                        // var brefNoteHoSoXNHL = window.sessionStorage.getItem('briefNoteHoSoXNHL') || '';
                        // $("#brefNoteHSXNHL").show();
                        // $("#brefNoteHSXNHL").html(brefNoteHoSoXNHL)
                    } else {
                        $('#danhSachCacLanXNHL_Toogle').hide();
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
						dossierId : result.dossierId,
						dossierTemplateNo: function (e) {
							console.log('dossierTemplateNo+++++++++', result['dossierTemplateNo']);
							var listCapPhieu = ['TT302011BGTVTCPPXCG', 'TT302011BGTVTCPPXMTGM', 'TT302011BGTVTCPPXBBCN', 'TT302011BGTVTCPPXBBCH', 'TT302011BGTVTCPPXDD', 'TT302011BGTVTCPPXCD'];
							if (listCapPhieu.includes(result['dossierTemplateNo'])) {
								$("#nhanKetQuaTu").show();
							} else {
								$("#nhanKetQuaTu").hide();
							}
							return result['dossierTemplateNo'];
						},
						lockState : function(e){
							if(result.lockState){
								if(result.lockState.startsWith("LOCK")){
									if(result.lockState === "LOCK ALL"){
										$("#btn-submit-dossier").remove();
										$("#btn-delete-dossier").remove();
										$("#btn-submit-dossier-header").remove();
										$("#btn-delete-dossier-header").remove();
									}else {
										$("#btn-submit-dossier").show();
										$("#btn-delete-dossier").show();
										$("#btn-submit-dossier-header").show();
										$("#btn-delete-dossier-header").show();
									}
								}else {
									$("#btn-submit-dossier").show();
									$("#btn-delete-dossier").show();
									$("#btn-submit-dossier-header").show();
									$("#btn-delete-dossier-header").show();
								}

							}else {
								$("#btn-submit-dossier").show();
								$("#btn-delete-dossier").show();
								$("#btn-submit-dossier-header").show();
								$("#btn-delete-dossier-header").show();
							}

							return "";
						},
						dossierIdCTN : function(e){
							if(result.dossierIdCTN){
								return result.dossierIdCTN;
							}

							return "";
						},
						serviceName : result.serviceName,
						govAgencyName : result.govAgencyName,
						dossierNote : function(e){
							if(result.dossierNote){
								return result.dossierNote;
							}

							return "";
						},

						contactName : function(){
							$('#contactName').editable("setValue",result.contactName); 
							return result.contactName;
						},
						address : function(){
							$('#address').editable("setValue",result.address); 
							return result.address;
						},
						cityName : function(){
							$('#city').editable("setValue",result.cityCode); 
							return result.cityName;
						},
						districtName : function(){
							$('#district').editable("setValue",result.districtCode); 
							return result.districtName
						},
						wardName : function(){
							$('#wards').editable("setValue",result.wardCode); 
							return result.wardName
						},
						contactTelNo : function(){
							$('#contactTelNo').editable("setValue",result.contactTelNo);
							return result.contactTelNo; 
						},
						contactEmail : result.contactEmail,
						dossierNo : result.dossierNo,
						dossierStatusText : result.dossierStatusText,
						stepInstruction : function(){
							if(result.stepInstruction){
								return result.stepInstruction;
							}else {
								return "";
							}
						},
						applicantNote : function(){
							/*var applicantNote = sessionStorage.getItem("applicantNote");
							if(!applicantNote || typeof applicantNote === 'object'){
								applicantNote = "Ghi chú người nộp hồ sơ";
							}

							$('#applicantNote').editable("setValue",applicantNote);

							return applicantNote;*/

							return "";
						},
						viaPostal : function(e){
							console.log(result.viaPostal);

							if(result.viaPostal < 2){
								$("#viaPostalContent").hide();
								$("#viaPostal").prop('checked', false);
								// $("#editCorporationCode").css("pointer-events", "");
							}else {
								// $('#corporationCode').editable("setValue", '');
								// $("#editCorporationCode").css("pointer-events", "none");
								$("#viaPostalContent").show();
								$("#viaPostal").prop('checked', true);
							}

							return result.viaPostal;
						},
						corporationName: function (e) {
							if (result['corporationName']) {
								$('#corporationCode').editable("setValue", result['corporationName']);
								// $('#viaPostal').val('');
								// $("#viaPostal").attr("disabled", true);
								// $('#postalReceiverName').editable("setValue", '');
								// $('#postalAddress').editable("setValue", '');
								// $('#postalCityCode').editable("setValue", '');
								// $('#postalTelNo').editable("setValue", '');

								// $("#editPostalReceiverName").css("pointer-events", "none");
								// $("#editPostalAddress").css("pointer-events", "none");
								// $("#editPostalCityCode").css("pointer-events", "none");
								// $("#editPostalTelNo").css("pointer-events", "none");
							} else {
								$('#corporationCode').editable("setValue", result['corporationName']);

								// $("#editPostalReceiverName").css("pointer-events", "");
								// $("#editPostalAddress").css("pointer-events", "");
								// $("#editPostalCityCode").css("pointer-events", "");
								// $("#editPostalTelNo").css("pointer-events", "");
							}
							
							return result['corporationName'];
						},
						postalAddress : function(){
							$('#postalAddress').editable("setValue",result.postalAddress);
							return result.postalAddress;
						},
						sheetAddressName : function () {
							return result['sheetAddressName'];
						},
						postalCityName : function(){
							console.log(result.postalCityCode);
							console.log(result.postalCityName);
							$('#postalCityCode').editable("setValue",result.postalCityCode);
							return result.postalCityName;
						},
						postalTelNo : function(){
							$('#postalTelNo').editable("setValue",result.postalTelNo);
							return result.postalTelNo;
						},
						postalReceiverName : function () {
							$('#postalReceiverName').editable("setValue", result['postalReceiverName']);
							return result['postalReceiverName'];
						},
						submitting : function(){
							if(result.submitting){
								$("#btn-submit-dossier").hide();
								$("#btn-submit-dossier-header").hide();
							}
							return result.submitting;
						}

					});

					kendo.bind($("#detailDossier"), viewModel);
				},
				error : function(result){

				}

			});
		}
	}

	$("#btn-submit-dossier-header").click(function(){

		var cf = fnConfirm("Thông báo",
			"Bạn có muốn gửi yêu cầu sửa giấy chứng nhận?", 
			"OK", "Thoát",
			function(){

				funSubmitDossier(function(){
					printDetailDossier("${dossierId}");
				});
				

			}, function(){

			});

		cf.open();
		
	});

	$("#btn-delete-dossier-header").click(function(){

		var cf = fnConfirm("Thông báo",
			"Bạn có muốn gửi yêu cầu sửa giấy chứng nhận?", 
			"OK", "Thoát",
			function(){

				funDeleteDossier("${(dossierId)!}");

			}, function(){

			});

		cf.open();
	});

	var fnGetReferenceUidForm = function(arrFile){
		var referenceUid = 0;
		if(arrFile){
			for (var i = 0; i < arrFile.length; i++) {
				if(arrFile[i].eForm){
					referenceUid = arrFile[i].referenceUid;
					break;
				}
			}
		}
		return referenceUid;
	}

	var funDossierFile = function(dossierId,callBack){
		if(dossierId){
			$.ajax({
				url : "${api.server}/dossiers/"+dossierId+"/files",
				dataType : "json",
				type : "GET",
				headers : {"groupId": "${groupId}"},
				success : function(result){
					if(result.data){
						callBack(result.data);
					}else {
						callBack([]);
					}


				},
				error : function(result){

				}
			});
		}
	}
	

	var funGenNumberFile = function(arrCount){
		$(".dossier-component-profile").each(function(index){
			var partNo = $(this).attr("data-partno");
			var found = $.grep(arrCount, function(v) {
				return v.dossierPartNo === partNo;
			});

			$(this).attr("data-number",found.length);
			$(this).html('<span class="number-in-circle" >'+found.length+'</span>');
			if(found.length > 0){
				$(".show-dossierpart-new-tab[data-partno="+partNo+"]").attr('hasFile', 'true');
			}else {
				$("#validPart"+partNo).val("0");
				$(".show-dossierpart-new-tab[data-partno="+partNo+"]").attr('hasFile', '');
			}
		});
	}

	var removeDossierFile = function(dossierId, fileId){
		var isSuccess = false;
		$.ajax({
			url : "${api.server}/dossiers/"+dossierId+"/files/"+fileId+"/resetformdata",
			dataType : "json",
			type : "PUT",
			headers : {"groupId": "${groupId}"},
			async : false,
			success : function(result) {
				isSuccess = true;

			},
			error : function(result) {
				isSuccess = false;
			}	
		});
		return isSuccess;
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
					$("#validPart"+partNo).val("0");
				},
				error : function(result) {
					if(navigator.onLine){
						notification.show({
							message: "Xảy ra lỗi, xin vui lòng thử lại"
						}, "error");
					}
				}
			});
		}
		
	}

	var funUploadFile = function(file, partNo , dossierTemplateNo , fileTemplateNo){
		var data = new FormData();
		console.log(file);
		var fileLength = $(file)[0].files.length;
		data.append( 'displayName', $(file)[0].files[0].name);
		data.append( 'file', $(file)[0].files[0]);
		data.append('dossierPartNo', partNo);
		data.append('referenceUid', "");
		data.append('dossierTemplateNo', dossierTemplateNo);
		data.append('fileTemplateNo', fileTemplateNo);
		data.append('fileType', "");
		data.append('formData', "");
		data.append('isSync', "true");
		data.append('formDataDossierFile', "");
		//data.append('deliverableCode', "");

		$.ajax({
			type : 'POST', 
			url  : '${api.server}/dossiers/${dossierId}/files', 
			data : data,
			headers: {"groupId": "${groupId}"},
			processData: false,
			contentType: false,
			dataType: 'json',
			cache: false,
			success :  function(result){ 
				kendo.ui.progress($("#mainType2"), false);

				funDossierFile("${dossierId}",funGenNumberFile);

				/*console.log("fileLength=======",fileLength);

				var currentFileNumber = $(".dossier-component-profile").filter("[data-partno="+partNo+"]").attr("data-number");

				console.log("currentFileNumber=======",currentFileNumber);

				var totalFile = fileLength + parseInt(currentFileNumber, 0);

				console.log("totalFile=======",totalFile);

				$(".dossier-component-profile").filter("[data-partno="+partNo+"]").html('<span class="number-in-circle" >'+totalFile+'</span>');

				console.log("dossier-component-profile=======",$(".dossier-component-profile").filter("[data-partno="+partNo+"]"));


				$(".dossier-component-profile").filter("[data-partno="+partNo+"]").attr("data-number",totalFile);*/

				notification.show({
					message: "Yêu cầu được thực hiện thành công"
				}, "success");

				$(file).val("");

			},
			error:function(result){
				kendo.ui.progress($("#mainType2"), false);
				
				notification.show({
					message: "Xảy ra lỗi, xin vui lòng thử lại"
				}, "error");

				$(file).val("");
			}
		});
		console.log("success!");
	}

	printDetailDossier("${dossierId}");

	$("#viaPostal").change(function(){
		var viaPostal = 1;
		if($(this).is(":checked")) {
			$("#viaPostalContent").show();
			viaPostal = 2;
			// $('#editCorporationCode').css('pointer-events', 'none');
			// $('#corporationCode').editable("setValue", '');
		}else{
			// $('#editCorporationCode').css('pointer-events', '');
			$("#viaPostalContent").hide();	
			viaPostal = 1;
		}
		// $.ajax({
		// 	url : "${api.server}/dossiers/${dossierId}",
		// 	dataType : "json",
		// 	type : "PUT",
		// 	headers: {"groupId": "${groupId}"},
		// 	data : {
		// 		viaPostal : viaPostal,
		// 		corporationCode: '',
		// 		corporationName: ''
		// 	},
		// 	success : function(result){

		// 	},
		// 	error : function(xhr){

		// 	}
		// });
	});

	var getReferentUidFile = function(dossierId,dossierPartNo){
		var dossierFile;
		if(dossierId){
			$.ajax({
				type : 'GET', 
				dataType : "json",
				url  : '${api.server}/dossiers/${dossierId}/files', 
				headers: {"groupId": "${groupId}"},
				async : false,
				success :  function(result){ 
					if(result.data){
						for (var i = 0; i < result.data.length; i++) {
							if(result.data[i].eForm){
								if(dossierPartNo == result.data[i].dossierPartNo){
									dossierFile = result.data[i];
									return ;
								}

							}
						}
					}

				},
				error:function(result){

				}
			});
		}
		console.log(dossierFile);

		return dossierFile;
	}


	var fnGetFormData = function(dossierId, referentUid){
		var value = null;
		var expireCertificateId = window.sessionStorage.getItem('expireCertificateId');
		$('#expireCertificateId_hidden').val(expireCertificateId)
		if(dossierId && referentUid){
			$.ajax({
				url : "${api.server}/dossiers/"+dossierId+"/files/" + referentUid + "/formdata",
				type : "GET",
				dataType : "json",
				async : false,
				success : function(result){
					value = result;

				},
				error : function(result){

				}

			});
		}

		return value;
	}

	$(function(){
		manageDossier.route("/taohosomoi/nopthanhcong/(:dossierId)", function(dossierId){
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.submited_dossier_info}&${portletNamespace}dossierId="+dossierId,function(result){

			});
		});
	});



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

		// var formType = $("#formPartNo"+id+" .formType").val();
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
			} else {
				console.log('Không có formControl!!!!');
				return;
			}
		}

		// if(formType !== "dklr"){
			
		// }

		if ("${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
			if (formControl && formControl['options'] && formControl['options']['fields'] && formControl['options']['fields']['initEvent']) {
				if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('postData')) {
					console.log('Không có hàm postData trong form alpaca!!!!');
					notification.show({
						message: "Không có hàm postData trong form alpaca!!!!"
					}, "error");
					return false;
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
		
		if ("${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
			if (formControl && formControl['options'] && formControl['options']['fields'] && formControl['options']['fields']['initEvent']) {
				if (!formControl['options']['fields']['initEvent'] || !formControl['options']['fields']['initEvent'].hasOwnProperty('postData')) {
					value = $('#formPartNo' + id).alpaca('get').getValue();
				} else {
					value = formControl['options']['fields']['initEvent'].postData();
				}
			} else {
				console.log('Không có formControl!!!!');
				return;
			}
		}

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
			console.log('Không có referenceUid!!!!');
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

</script>