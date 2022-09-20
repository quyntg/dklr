<#if (Request)??>
    <#include "init.ftl">
</#if>
<div id="detailDossier">
    <div class="box">

        <input type="hidden" name="dossierStatus" id="dossierStatus">

        <input type="hidden" name="dossierTemplateNo" id="dossierTemplateNo">
        <input type="hidden" name="dossierId" id="dossierId" value="${(dossierId)!}">
        <input type="hidden" name="dossierId_Hidden" id="dossierId_Hidden" value="${(dossierId)!}">
        <input type="hidden" name="dossierNo" id="dossierNo" value="${(dossier.dossierNo)!}">
        <input type="hidden" name="applicantIdNo" id="applicantIdNo" value="${(dossier.applicantIdNo)!}">
        <input type="hidden" name="expireCertificateId_hidden" id="expireCertificateId_hidden" value="">
        <input type="hidden" name="dossierIdCTN" id="dossierIdCTN" value="${(dossier.dossierIdCTN)!}">
        <input type="hidden" name="referenceUid" id="referenceUid" value="${(dossier.referenceUid)!}">
        <input type="hidden" name="referenceUid" id="referenceUid" value="${(dossier.referenceUid)!}">
        <input type="hidden" name="issueType" id="issueType" value="${(issueType)!}">
        <div class="row-header align-middle">
            <div class="background-triangle-big">Tên thủ tục</div>
            <span class="text-bold" data-bind="text:serviceName"></span>
            <div class="pull-right group-icons">
                <a href="javascript:;" onclick="fnBack();">
                    <i class="fa fa-reply" aria-hidden="true"></i>
                    Quay lại
                </a>

                <#if sendReissue?has_content >

                    <a class="" id="btn-sendReissue-dossier-header" data-bind="value : lockState"><i
                                class="fa fa-paper-plane"></i> Yêu cầu sửa giấy chứng nhận</a>

                <#elseif resCancelling?has_content >

                    <a href="javascript:;" class="" id="btn-cancelling-header" data-bind="value : lockState"><i
                                class="fa fa-paper-plane"></i> Yêu cầu hủy</a>

                <#elseif sendAdd?has_content >

                    <a class="" id="btn-sendadd-dossier-header" data-bind="value : lockState"><i
                                class="fa fa-paper-plane"></i> Gửi bổ sung</a>

                <#elseif dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "waiting">

                    <a class="" id="btn-submit-dossier-header" data-bind="value : lockState"><i
                                class="fa fa-paper-plane"></i> Nộp hồ sơ</a>

                <#else>

                </#if>
            </div>
        </div>

        <div class="dossier-general-info P15 MB30">
            <div class="col-sm-4">
                <div class="row">
                    <span class="text-bold">Tình trạng</span>: <i data-bind="text:dossierStatusText" class="red"></i>
                </div>
                <div class="row">
                    <i data-bind="html:briefNote" class="text-light-gray"></i>
                </div>
            </div>
            <div class="col-sm-4">
                <div class="row MB5" id="">
                    <span>Số hồ sơ (Mã tiếp nhận)</span>: <span data-bind="text:dossierNo" class="text-bold"></span>

                </div>
                <div class="row" id="">
                    <span>Mã hồ sơ</span>: <span data-bind="text : dossierIdCTN" class="text-bold"></span>
                </div>
                <div class="row" id="mahsMCDT">
                    <span>Mã hồ sơ MCĐT</span>: <span data-bind="text : dossierReferenceNo" class="text-bold"></span>
                </div>
            </div>

            <div class="col-sm-4">
                <div class="row MB5" id="">
                    <span>Thời gian gửi</span>: <span data-bind="text : submitDate" class="text-bold"></span>
                </div>
                <div class="row MB5" id="tinhTranghieuLuc">
                    <span>Tình trạng hiệu lực </span> <span data-bind="text : soGiayChungNhan" class="text-bold"></span>: <span data-bind="text : tinhTranghieuLuc" class="text-bold red"></span>
                </div>
                <#-- <div class="row" id="">
					<a href="javascript:;" class="text-light-blue text-underline">
						Thông tin chủ hồ sơ
					</a>
				</div> -->
            </div>

            <div class="col-sm-12">
                <span data-bind="attr : {actionNote1 : actionNote1}" id="actionNote1"></span>
            </div>
        </div>

        <div class="row">
            <div class="col-sm-12">
                <div class="guide-section PB0" style="clear: both;">
                    <div class="head-part slide-toggle">
                        <div class="background-triangle-small">
                            <i class="fa fa-star"></i>

                        </div>
                        <span class="text-uppercase hover-pointer">Hướng dẫn</span>
                        <i class="fa fa-angle-down pull-right hover-pointer MR15" aria-hidden="true"
                           style="font-size: 150%;"></i>
                    </div>

                    <div class="content-part collapse PB15" id="collapseDossierG">

                        <span data-bind="html:dossierNote"></span>
                        <#-- <p class="MB0 text-light-blue PB15"><a href="javascript:;" id="guide-toggle">Xem thêm >></a></p> -->
                    </div>

                </div>
            </div>
        </div>
        <#-- Bổ sung thông tin chủ hồ sơ -->
        <div class="row">
            <div class="col-sm-12">
                <div class="dossier-parts">
                    <div class="head-part align-middle slide-toggle">
                        <div class="background-triangle-small">
                            <i class="fa fa-star"></i>
                        </div>
                        <div class="col-sm-12 PL0">

							<span class="text-uppercase hover-pointer">
								Thông tin chủ hồ sơ
							</span>
                            <i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true"
                               style="font-size: 150%;"></i>
                        </div>
                    </div>
                    <div class="content-part collapse" id="collapseDossierI">
                        <div class="row-parts-head MT5">

                            <div class="row MT5">
                                <div class="col-sm-2">
                                    <label>Họ và tên</label>
                                </div>
                                <div class="col-sm-10">
                                    <span data-bind="text:contactName"></span>

                                </div>
                            </div>

                            <div class="row">
                                <div class="col-sm-2">
                                    <label>Địa chỉ</label>
                                </div>
                                <div class="col-sm-10">
                                    <span data-bind="text:address"></span>

                                </div>
                            </div>

                            <div class="row">
                                <div class="col-sm-2">
                                    <label>Tỉnh/ Thành phố</label>
                                </div>
                                <div class="col-sm-10">
                                    <span data-bind="text:cityName"></span>

                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-2">
                                    <label>Quận/ Huyện</label>
                                </div>
                                <div class="col-sm-10">
                                    <span data-bind="text:districtName"></span>

                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-2">
                                    <label>Xã/ Phường</label>
                                </div>
                                <div class="col-sm-10">
                                    <span data-bind="text:wardName" required></span>

                                </div>
                            </div>

                            <div class="row">
                                <div class="col-sm-2">
                                    <label>Điện thoại</label>
                                </div>
                                <div class="col-sm-10">
                                    <span data-bind="text:contactTelNo"></span>

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

        <#--  -->
        <div class="row">
            <div class="col-sm-12">
                <form id="dossierFormSubmiting">
                    <div class="dossier-parts sttDocument">
                        <div class="head-part align-middle MB5 slide-toggle">
                            <div class="background-triangle-small">I</div>
                            <div class="col-sm-12 PL0">
                                <span class="text-uppercase hover-pointer">Thành phần hồ sơ</span>
                                <span class="hover-pointer pull-right"><i class="text-light-gray">Những thành phần hồ sơ có dấu
									(<span class="red">*</span>) là thành phần bắt buộc</i>
									<span>
										<i class="fa fa-angle-down hover-pointer" aria-hidden="true"
                                           style="font-size: 150%;"></i>
									</span>
								</span>
                            </div>
                        </div>
                        <div class="content-part collapse in PB0 PT0">
                            <div>
                                <div class="row-parts-head align-middle slide-toggle PT5"
                                     style="background: #dbd9d9; cursor: pointer;">
                                    <div class="col-sm-12 PL0">
							<span>
								Bản khai trực tuyến <i class="fa fa-angle-down hover-pointer" aria-hidden="true"
                                                       style="font-size: 128%;"></i>
							</span>
                                    </div>
                                    <div class="clear"></div>
                                </div>
                                <div class="collapse" id="banKhaiTrucTuyenCollapse" style="display: block;">
                                    <div class="col-sm-12 PL0 PR0 content-part collapse in" id="lsDossierTemplPart">
                                        <script type="text/x-kendo-template" id="templateDossierPart">
                                            #
                                                if (partType == 1 && hasForm) {
                                                var lockState = fnCheckLockTemplate("${dossier.lockState}", id);
                                            #

                                            <div class="row-parts-head align-middle slide-toggle">
                                                <span class="text-bold MR5">#:itemIndex#.</span>
                                                <span class="hover-pointer"> #:partName#
													#
													if(required){
													#
														<span class="red">*</span>
														<input type="hidden" id="validPart#:id#" name="validPart#:id#"
                                                               class="validPart" value="0">
													#}#
												</span>

                                                <div class="actions">

                                                    <#-- #
                                                    if (!lockState) {
                                                    #
                                                    <a href="javascript:;"
                                                       class="text-light-blue uploadfile-form-repository"
                                                       data-toggle="tooltip" data-placement="top"
                                                       title="Tải giấy tờ từ kho lưu trữ" part-no="#:id#">
                                                        <i class="fa fa-archive" aria-hidden="true"></i>
                                                    </a>
                                                    #
                                                    }
                                                    #

                                                    #
                                                    if (!lockState) {
                                                    #
                                                        <label class="MB0 ML10 hover-pointer" for="file#:id#"
                                                               title="Tải file lên">
                                                            <i class="fa fa-upload text-light-blue"></i>
                                                        </label>
                                                    #
                                                    }
                                                    #

                                                    <input type='file' id="file#:id#" name="file#:id#"
                                                           class="hidden dossier-file" #if(multiple){# multiple #}#
                                                           part-no="#:id#" file-template-no="#:fileTemplateNo#"
                                                           hasform="#if(hasForm){# true #}#"> -->

                                                    <#-- <a href="javascript:;" class="dossier-component-profile" data-toggle="tooltip" data-placement="top" title="Số tệp tin" data-partno="#:id#" data-number="#if(hasForm){# 1 #}else {# 0 #}#">
															<span class="number-in-circle" >#if(hasForm){# 1 #}else {# 0 #}#</span>
														</a> -->
                                                    <a href="javascript:;" class="dossier-component-profile"
                                                       data-placement="top" title="Số tệp tin" data-partno="#:id#"
                                                       data-number="#if(hasForm){# 1 #}else {# 0 #}#">
                                                        <span class="number-in-circle">#if(hasForm){# 1 #}else {# 0 #}#</span>
                                                    </a>

                                                    #
                                                    if (!lockState) {
                                                    #
                                                    <#-- <a href="javascript:;" class="text-light-gray delete-dossier-file"
                                                       data-toggle="tooltip" data-placement="top" title="Xóa"
                                                       data-partno="#:id#" eForm="#:hasForm#"
                                                       fileTemplateNo="#:fileTemplateNo#">
                                                        <i class="fa fa-trash-o" aria-hidden="true"></i> Xóa
                                                    </a> -->
                                                    #
                                                    }
                                                    #
                                                </div>
                                            </div>
                                            </div>

                                            #
                                            if (hasForm) {
                                                var dossierFile =  getReferentUidFile(${dossier.dossierId},id);
                                                if (dossierFile) {
                                                
                                            #

                                            <div class="collapse" id="collapseDossierPart#:id#">
                                                <div class="col-xs-12 col-sm-12 text-right">
                                                    <input type="hidden" name="" id="dossierFileId#:id#"
                                                           value="#:dossierFile.dossierFileId#">
                                                    #
                                                    if (!lockState) {
                                                    #
                                                    <button style="z-index: 99;" id="btn-save-formalpaca#:id#"
                                                            class="btn btn-active MB10 MT10 MR20 saveForm saveFormAlpaca"
                                                            type="button" data-pk="#:id#"
                                                            data-partname="#:partName#"
                                                            referenceUid="#:dossierFile.referenceUid#">Ghi lại
                                                    </button>
                                                    #
                                                    }
                                                    #
                                                </div>
                                                <div class="col-sm-12 divForm" #if(dossierFile.referenceUid){#
                                                     style="height: 450px; overflow: auto;" #}#>
                                                    #
                                                    if (!lockState) {
                                                    #
													<div id="formPartNo#:id#" class="formAlpacaDN" data-pk="#:id#"
												    data-partname="#:partName#"
                                                    dossierFileId="#:dossierFile.dossierFileId#"
                                                    style=""
													>
														#
														} else {
														#
														<div id="formPartNo#:id#" class="formAlpacaDN" 
                                                        style="pointer-events: none;"
                                                        data-pk="#:id#"
														data-partname="#:partName#"
                                                        dossierFileId="#:dossierFile.dossierFileId#"
														>
															#
															}
															#
                                                        </div>

                                                    </div>
                                                </div>

                                                #
                                                $.ajax({
                                                url : "${api.server}/dossiers/${dossier.dossierId}/files/"+dossierFile.referenceUid+"/formscript",
                                                dataType : "text",
                                                type : "GET",
                                                processData: false,
                                                headers : {"groupId": "${groupId}"},
                                                success : function(result) {
                                                $("\\#formPartNo"+id).empty();
                                                var alpaca4 = {};
                                                if (!result) {
                                                    alpaca4 = {};
                                                } else {
                                                    alpaca4 = eval("(" + result + ")");
                                                }
                                                var formdata = fnGetFormData(${dossier.dossierId},dossierFile.referenceUid);
                                                if (formdata) {
                                                $("\\#validPart"+id).val("1");
                                                }
                                                alpaca4.data = formdata;
                                                setTimeout(function () {
                                                $("\\#formPartNo"+id).alpaca(alpaca4);
                                                }, 1000);
                                                $("\\#formPartNo"+id).parent().css("overflow", "auto");

                                                <#-- $("\\#formPartNo"+id).append('<div class="row"><div class="col-xs-12 col-sm-12"><button id="btn-save-formalpaca'+id+'" class="btn btn-active MB10 MT10 saveForm" type="button" data-pk="'+id+'" referentUid="'+referentUidFile+'">Ghi lại</button></div></div>'); -->

                                                },
                                                error : function (result) {

                                                }
                                                });
                                                }
                                                #
                                                #
                                                    } 
                                                }
                                                #
                                        </script>
                                    </div>
                                    <div class="clear"></div>
                                </div>
                            </div>

                            <div style="clear: both;">
                                <div class="row-parts-head align-middle slide-toggle PT5"
                                     style="background: #dbd9d9; cursor: pointer;">
                                    <div class="col-sm-12 PL0">
								<span>
									Tài liệu đính kèm <i class="fa fa-angle-down hover-pointer" aria-hidden="true"
                                    style="font-size: 128%;"></i>
								</span>
                                    </div>
                                    <div class="clear"></div>
                                </div>
                                <div class="collapse" id="vanBanDinhKemCollapse" style="display: block;">
                                    <div class="col-sm-12 PL0 PR0 content-part collapse in" id="lsDossierTemplPart2">
                                        <script type="text/x-kendo-template" id="templateDossierPart2">
                                            #
                                                if (partType == 1 && !hasForm) {
                                                var lockState = fnCheckLockTemplate("${dossier.lockState}", id);
                                            #

                                            <div class="row-parts-head align-middle slide-toggle">
                                                <span class="text-bold MR5">#:itemIndex2#.</span>
                                                <span class="hover-pointer"> #:partName#
														#
														if(required){
														#
															<span class="red">*</span>
															<input type="hidden" id="validPart#:id#"
                                                                   name="validPart#:id#" class="validPart" value="0">
														#}#
													</span>

                                                <div class="actions">
                                                    #
                                                    if (!lockState) {
                                                    #
                                                    
                                                    <a href="javascript:;"
                                                       class="text-light-blue uploadfile-form-repository"
                                                       data-toggle="tooltip" data-placement="top"
                                                       title="Tải giấy tờ từ kho lưu trữ" part-no="#:id#">
                                                        <i class="fa fa-archive" aria-hidden="true"></i>
                                                    </a>

                                                    #
                                                    }
                                                    #

                                                    #
                                                    if (!lockState) {
                                                    #
                                                    <label class="MB0 ML10 hover-pointer" for="file#:id#"
                                                           title="Tải file lên">
                                                        <i class="fa fa-upload text-light-blue"></i>
                                                    </label>
                                                    #
                                                    }
                                                    #

                                                    <input type='file' id="file#:id#" name="file#:id#"
                                                           class="hidden dossier-file" #if(multiple){# multiple #}#
                                                           part-no="#:id#" file-template-no="#:fileTemplateNo#"
                                                           hasform="#if(hasForm){# true #}#">

                                                    <a href="javascript:;" class="dossier-component-profile"
                                                       data-placement="top" title="Số tệp tin" data-partno="#:id#"
                                                       data-number="#if(hasForm){# 1 #}else {# 0 #}#">
                                                        <span class="number-in-circle">#if(hasForm){# 1 #} else {# 0 #}#</span>
                                                    </a>

                                                    #
                                                    if (!lockState) {
                                                    #
                                                    <#-- <a href="javascript:;" class="text-light-gray delete-dossier-file"
                                                       data-toggle="tooltip" data-placement="top" title="Xóa"
                                                       data-partno="#:id#" eForm="#:hasForm#"
                                                       fileTemplateNo="#:fileTemplateNo#">
                                                        <i class="fa fa-trash-o" aria-hidden="true"></i> Xóa
                                                    </a> -->
                                                    #
                                                    }
                                                    #
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
                </form>
            </div>
        </div>

        <div class="dossier-parts sttDocument" id="paymentDossier">

            <div class="head-part align-middle MB5 slide-toggle">

                <div class="background-triangle-small" id="paymentDossierNum">II</div>
                <div class="col-sm-12 PL0">

                    <span class="text-uppercase hover-pointer">Thanh toán</span>
                    <i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true"
                       style="font-size: 150%;"></i>
                </div>

            </div>
            <div class="content-part collapse" id="collapseDossierPayment">
                <div class="row-parts-head MT5">
                    <div class="row">
                        <div class="col-sm-12" id="paymentDossierContent" data-bind="value: paymentDossier">

                            <div class="row MB5">
                                <div class="col-sm-2">
                                    <span class="text-bold">Tên phí thanh toán</span>
                                </div>
                                <div class="col-sm-10" data-bind="text: paymentFee"></div>
                            </div>

                            <div class="row MB5">
                                <div class="col-sm-2">
                                    <span class="text-bold">Gía trị thanh toán</span>
                                </div>
                                <div class="col-sm-10 red">
                                    <span data-bind="text:paymentAmount"></span>
                                    <span> VNĐ</span>
                                </div>
                            </div>

                            <div class="row MB5">
                                <div class="col-sm-2">
                                    <span class="text-bold">Chuyển khoản đến</span>
                                </div>
                                <div class="col-sm-10" data-bind="text:paymentGovAgencyName "></div>
                            </div>

                            <div class="row MB5">
                                <div class="col-sm-2">
                                    <span class="text-bold">Thông tin tài khoản nhận</span>
                                </div>
                                <div class="col-sm-10" data-bind="text:paymentBankInfo"></div>
                            </div>

                            <div class="row MB5">
                                <div class="col-sm-2">
                                    <span class="text-bold">Trạng thái</span>
                                </div>
                                <div class="col-sm-10" data-bind="text:paymentStatus"></div>
                            </div>

                            <div class="row MB10">
                                <div class="col-sm-2">
                                    <span class="text-bold">Ngày thanh toán</span>
                                </div>
                                <div class="col-sm-10" data-bind="text:paymentApproveDatetime"></div>
                            </div>

                            <div id="unpaid">
                                <div class="row MB10">
                                    <div class="col-sm-12">
                                        <button class="btn btn-sm btn-border-color MR10 text-light-blue"
                                                id="dossier-payment-online"
                                                data-bind="attr : {data-pk : dossierReferenceNo}"
                                                style="font-weight: bold; text-shadow: 0 0 black;">Thanh toán qua cổng DVCQG
                                        </button>
                                        <button class="btn btn-sm btn-border-color MR10 text-light-blue"
                                                data-bind="attr : {data-pk : referenceUidPayment}"
                                                id="dossier-payment-confirm">Thông báo đã nộp chuyển khoản
                                        </button>
                                        <button class="btn btn-sm btn-border-color text-light-blue"
                                                id="dossier-payment-viewpdf"
                                                data-bind="attr : {data-pk : referenceUidPayment}">Phiếu thông báo phí, lệ phí
                                        </button>
                                    </div>
                                </div>

                                <div class="row MB20 MT20" data-bind="value: isPay">
                                    <div class="col-sm-12 text-center">
                                        <div class="row">
                                            <div class="col-sm-4">

                                            </div>
                                            <div class="col-sm-4 text-center MB10">
                                                <i class="fa fa-file-image-o text-center text-light-gray MB10"
                                                   aria-hidden="true" style="font-size:100px;">

                                                </i>
                                                <br>
                                                <span id="fileNamePayment" name="fileNamePayment"></span>
                                                <br>
                                                <span class="text-center" style="font-size: 10px;">Chứng từ thanh toán cho chuyển khoản là giấy yêu cầu nộp tiền vào ngân hàng hoặc hóa đơn chứng nhận giao dịch chuyển khoản được in ra</span>
                                            </div>
                                            <div class="col-sm-4">

                                            </div>
                                        </div>
                                        <input type="file" id="filePayment" name="filePayment" class="hidden">
                                        <label class="btn btn-sm MB0 ML10 hover-pointer" for="filePayment"
                                               title="Tải file lên">
                                            <span class="text-normal">Chọn ảnh từ máy</span>
                                        </label>
                                    </div>
                                </div>

                                <div class="row">
                                    <div class="col-sm-11">
                                        <div class="form-group">
                                            <label class="control-label">Ghi chú kèm theo</label>
                                            <textarea class="form-control" rows="2" id="confirmNote" name="confirmNote"
                                                      data-bind="text:confirmNote">

									</textarea>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="dossier-parts sttDocument">

            <div class="head-part align-middle slide-toggle">

                <div class="background-triangle-small" id="resultDossierNum">II</div>
                <div class="col-sm-12 PL0">

                    <span class="text-uppercase hover-pointer">Kết quả</span>
                    <i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true"
                       style="font-size: 150%;"></i>
                </div>

            </div>
            <div class="content-part collapse in" id="collapseDossierResult">
                <div class="row-parts-head P0">
                    <ul class="ul-with-border">
                        <div id="listViewDossiserFileTemplate"></div>
                    </ul>
                    <script type="text/x-kendo-template" id="templateDossiserFileTemplate">
                        <li>
                            <div class="row ML5">
                                <div class="col-sm-12">
                                    <a href="${api.server}/dossiers/${(dossierId)!}/files/#:referenceUid#"
                                       class="download-file-result" data-pk="#:referenceUid#">
                                        <i class="fa fa-download"></i>
                                        #:displayName#
                                    </a>
                                </div>
                            </div>
                        </li>
                    </script>
                </div>
            </div>
        </div>

        <div class="row sttDocument" id="danhSachCacLanXNHL_Toogle">
            <div class="col-sm-12">
                <div class="dossier-parts" style="">
                    <div class="head-part align-middle slide-toggle">
                        <div class="background-triangle-small">IV</div> 
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

        <div class="row sttDocument" id="danhSachCacLanXNHL_HangNam_Toogle">
            <div class="col-sm-12">
                <div class="dossier-parts" style="">
                    <div class="head-part align-middle slide-toggle">
                        <div class="background-triangle-small">IV</div> 
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

        <div class="row sttDocument" id="danhSachCacLanQuyetToan_Toogle">
            <div class="col-sm-12">
                <div class="dossier-parts" style="">
                    <div class="head-part align-middle slide-toggle">
                        <div class="background-triangle-small">IV</div> 
                        <div class="col-sm-12 PL0">
                            
                            <span class="text-uppercase hover-pointer">
                                Danh sách các lần quyết toán
                            </span>
                            <i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true" style="font-size: 150%;"></i>
                        </div>
                        
                    </div>
                    <div class="content-part collapse in" id="collapseDossierDSCLQT" style="">
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
                                                    <strong>Ngày đề nghị quyết toán</strong>

                                                </th>
                                                <th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
                                                    <strong>Ngày duyệt cấp phiếu</strong>

                                                </th>
                                                <th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
                                                    <strong>Hành động</strong>
                                                </th>
                                            </tr>
                                        </thead>
                                        <#-- Table body -->
                                        <tbody class="" id="danhSachCacLanQuyetToan">

                                        </tbody>
                                        <script type="text/x-kendo-template" id="templateDanhSachCacLanQuyetToan">
                                        <tr>
                                            <td class="fieldDossier text-center hover-pointer">
                                                #:stt#
                                            </td>
                                            <td class="fieldDossier text-center hover-pointer">
                                                <span>#:dossierNo#</span>
                                            </td>
                                            <td class="fieldDossier text-center hover-pointer">
                                                <span>#:appliedDate#</span>
                                            </td>
                                            <td class="fieldDossier text-center hover-pointer">
                                                <span>#:approvedDate#</span>
                                            </td>
                                            <td class="fieldDossier text-center hover-pointer">
                                                
                                                <a onclick="xemHSQuyetToan(this)" href="javascript:;"  class="link-detail-employee text-hover-blue" data-pk="#=dossierId#">
                                                    Xem
                                                </a>
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

        <div class="dossier-parts sttDocument">

            <div class="head-part align-middle slide-toggle">
                <div class="background-triangle-small" id="logDossierNum">III</div>
                <div class="col-sm-12 PL0">

                    <span class="text-uppercase hover-pointer">Tiến trình xử lý</span>
                    <i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true"
                       style="font-size: 150%;"></i>
                </div>

            </div>
            <div class="content-part collapse in" id="collapseDossierPart">
                <div class="row-parts-head MT5">

                    <div class="table-responsive">
                        <table class="table table-bordered table_history_style">
                            <tbody id="listViewDossiserLog">

                            </tbody>
                        </table>
                    </div>
                    <script type="text/x-kendo-template" id="templateDossiserLog">

                        #
                        var jobposTitle = "";
                        var briefNote = "";
                        var dossier = [];
                        try {

                        var payLoadObj = payload;

                        var stepName = payLoadObj["stepName"] ? payLoadObj.stepName : "";
                        var dossier = payLoadObj["files"] ? payLoadObj.files : [];

                        } catch (e) {
                            console.log(e);
                        }
                        #
                        <tr>
                            <td style="padding-top: 15px; width: 1%;">
                                <span class="text-bold">#:itemIndex#</span>
                            </td>
                            <td style="padding-top: 15px">

                                <span class="text-bold PR10">#:author# </span>

                                #
                                if ( stepName != "" && stepName != null ) {
                                if(stepName === "type_cancelling"){
                                stepName = "Yêu cầu hủy";
                                } else if(stepName === "type_submitting"){
                                    stepName = "Yêu cầu sửa đổi bổ sung";
                                }else if(stepName === "type_submitting1"){
                                    stepName = "Đề nghị kiểm tra lại (giám sát lại)";
                                }else if(stepName === "type_submitting2"){
                                    stepName = "Yêu cầu cấp thay thế (đổi ấn chỉ hỏng)";
                                }else if(stepName === "type_submitting3"){
                                    stepName = "Yêu cầu cấp thay thế (cho ấn chỉ mất)";
                                }else if(stepName === "type_submitting4"){
                                    stepName = "Yêu cầu cấp thay thế";
                                }else if(stepName === "type_submitting5"){
                                    stepName = "Yêu cầu trả ấn chỉ";
                                }else if(stepName === "type_submitting6"){
                                    stepName = "Yêu cầu hủy ấn chỉ";
                                }else if(stepName === "type_submitting7"){
                                    stepName = "Yêu cầu hủy hồ sơ sau cấp phát";
                                } else if(stepName === "type_submit"){
                                stepName = "Yêu cầu sửa thành phần hồ sơ";
                                }else if(stepName === "type_correcting"){
                                stepName = "Yêu cầu chỉnh sửa kết quả";
                                }else if(stepName === "type_reject_cancelling"){
                                stepName = "Từ chối yêu cầu hủy";
                                }else if(stepName === "type_reject_submit"){
                                stepName = "Hủy yêu cầu sửa thành phần hồ sơ";
                                }else if(stepName === "type_reject_submitting"){
                                stepName = "Từ chối yêu cầu bổ sung";
                                }else if(stepName === "type_reject_correcting"){
                                stepName = "Hủy yêu cầu chỉnh sửa kết quả";
                                }
                                #

                                <span class="text-light-blue">(#:stepName#)</span>
                                #}#

                                <p>
                                    #if ( createDate!="" && createDate!=null ) {#
                                    #= kendo.toString(kendo.parseDate(createDate, "yyyy-MM-ddTHH:mm:ss"), "HH:mm - dd/MM/yyyy")#
                                    #}#
                                </p>

                                #if ( content!="" && content!=null ) {#
                                <span>Ý kiến: </span> #=content# <br>
                                #}#

                                #
                                if(dossier){
                                for(var i = 0 ; i < dossier.length ; i++){
                                #
                                <p>
                                    <a target="_blank" href="javascript:;"
                                       onclick="openFileNewtab('${api.server}/dossiers/fileEntryId/#:dossier[i].fileEntryId#');"
                                       class="text-greyy text-hover-blue">
                                        <i aria-hidden="true" class="fa fa-download PR5"></i>
                                        #:dossier[i].fileName#
                                    </a>
                                </p>
                                #
                                }
                                }
                                #

                            </td>
                        </tr>
                    </script>

                </div>
            </div>
        </div>

        <#if dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "waiting" || dossier.dossierStatus == "waiting_4">
            <div class="row-parts-content" id="nhanKetQuaTu">
                <div class="row">
                    <div class="col-xs-12 col-sm-7">
                        <label>Nhận kết quả từ (<span style="color: red;">*</span>)</label>
                        <input class="form-control MB0" name="corporationCode" id="corporationCode" required="required" validationMessage="Bạn phải chọn kết quả từ" data-bind="value : corporationCode">
                        <span data-for="corporationCode" class="k-invalid-msg"></span> 
                    </div>
                </div>
            </div>
        <#else>
            <div class="row-parts-content" id="corporationName">
                <div class="row">
                    <div class="col-sm-12 MB10">
                        <span >Nhận kết quả từ: </span>
                        <span class="text-bold" data-bind="text:corporationName"></span>
                    </div>
                </div>
            </div>
        </#if>
        

        <#if dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "waiting" || dossier.dossierStatus == "waiting_4">
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


            </div>
        <#else>
            <div class="row-parts-content" id="postal" data-bind="value: viaPostal">
                <div class="row">
                    <div class="col-sm-12 MB10">
                        <span class="text-bold">Thông tin trả KQ trả qua đường bưu điện: </span>
                        <br>
                        Tên người nhận: <span class="text-bold" data-bind="text:postalReceiverName"></span>
                        <br>
                        Địa chỉ: <span class="text-bold" data-bind="text:postalAddress"></span> <br>
                        Tỉnh/Thành phố: <span class="text-bold" data-bind="text:postalCityName"></span> <br>
                        Số điện thoại: <span class="text-bold" data-bind="text:postalTelNo"></span>
                    </div>
                </div>
            </div>
        </#if>
        <#-- <div class="row-parts-content" id="postal" data-bind="value: viaPostal">
            <div class="row">
                <div class="col-sm-12 MB10">
                    <span class="text-bold">Thông tin trả KQ trả qua đường bưu điện: </span>
                    <br>
                    Tên người nhận: <span class="text-bold" data-bind="text:postalReceiverName"></span>
                    <br>
                    Địa chỉ: <span class="text-bold" data-bind="text:postalAddress"></span> <br>
                    Tỉnh/Thành phố: <span class="text-bold" data-bind="text:postalCityName"></span> <br>
                    Số điện thoại: <span class="text-bold" data-bind="text:postalTelNo"></span>
                </div>
            </div>
        </div> -->

        

        <div class="row-parts-content">
            <#if sendReissue?has_content >
                <div class="row MB20">
                    <div class="col-sm-12">
                        <label>${lblApplicantNote}</label>
                        <textarea class="form-control" name="applicantNote" id="applicantNote" placeholder="Ghi chú"
                                  data-bind="text : applicantNote" rows="3"></textarea>
                    </div>
                </div>

            <#elseif sendAdd?has_content >
                <div class="row MB20">
                    <div class="col-sm-12">
                        <label>${lblApplicantNote}</label>
                        <textarea class="form-control" name="applicantNote" id="applicantNote" placeholder="Ghi chú"
                                  data-bind="text : applicantNote" rows="3"></textarea>
                    </div>
                </div>

            <#elseif resCancelling?has_content >

                <div class="row MB20">
                    <div class="col-sm-12">
                        <label>${lblApplicantNote}</label>
                        <textarea class="form-control" name="applicantNote" id="applicantNote" placeholder="Ghi chú"
                                  data-bind="text : applicantNote" rows="3"></textarea>
                    </div>
                </div>

            <#elseif dossier.dossierStatus?has_content && dossier.dossierStatus == "waiting" && dossier.submitting?has_content && dossier.submitting != true>
                <div class="row MB20">
                    <div class="col-sm-12">
                        <label>Thông báo gửi bổ sung</label>
                        <textarea class="form-control" name="applicantNote" id="applicantNote" placeholder="Ghi chú"
                                  data-bind="text : applicantNote" rows="3"></textarea>
                    </div>
                </div>
            <#else>

            </#if>
        </div>

        <div id="uploadFileTemplateDialog" class="modal fade" role="dialog">

        </div>

        <#-- <div id="profileDetail" class="modal fade" role="dialog">

</div> -->

    </div>
    <div class="button-row MT20">

        <button class="btn btn-active" id="btn-back-dossier" type="button"><i class="fa fa-reply"
                                                                              aria-hidden="true"></i> Quay lại
        </button>
        <#if sendReissue?has_content >

            <a class="btn btn-active" id="btn-sendReissue-dossier-footer" data-bind="value : correctingDate" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i
                        class="fa fa-paper-plane"></i> Yêu cầu sửa giấy chứng nhận</a>
        <#elseif dnTraHuy?has_content >

            <a class="btn btn-active" id="btn-dntrahuy-dossier-footer" data-bind="value : correctingDate" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i
                        class="fa fa-paper-plane"></i> Trả hủy ấn chỉ</a>

        <#elseif sendAdd?has_content >

            <a class="btn btn-active" id="btn-sendadd-dossier-footer" data-bind="value : submitting"><i
                        class="fa fa-paper-plane" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."></i> Gửi bổ sung</a>

        <#elseif dnHuy?has_content >

            <a class="btn btn-active" id="btn-dnhuy-dossier-footer" data-bind="value : submitting"><i
                        class="fa fa-paper-plane" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."></i> 

                    <#if issueType?has_content &&  issueType == "2">

                        Đề nghị cấp đổi

                    <#elseif issueType?has_content &&  issueType == "3">

                        Đề nghị cấp lại

                    <#elseif issueType?has_content &&  issueType == "4">

                        ĐN cấp thay thế

                    <#elseif issueType?has_content &&  issueType == "5">

                        ĐN trả ấn chỉ
                    <#elseif issueType?has_content &&  issueType == "6">

                        ĐN hủy ấn chỉ
                    <#else>
                        ĐN hủy hồ sơ
                    </#if>

            </a>
                        
        <#elseif dnKiemTra?has_content >

            <a class="btn btn-active" data-pk="Đề nghị kiểm tra" id="btn-dnkiemtra-dossier-footer" data-bind="value : submitting"><i
                        class="fa fa-paper-plane" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."></i> ĐN kiểm tra</a>
        <#elseif dnGiamSat?has_content >

            <a class="btn btn-active" data-pk="Đề nghị giám sát" id="btn-dngiamsat-dossier-footer" data-bind="value : submitting"><i
                        class="fa fa-paper-plane" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."></i> ĐN giám sát</a>

        <#elseif resCancelling?has_content >

            <a href="javascript:;" class="btn btn-active" id="btn-rescancelling-dossier"
               data-bind="value : cancellingDate" data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i class="fa fa-paper-plane"></i> Yêu cầu hủy</a>

        <#elseif dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "waiting">

            <button class="btn btn-active" id="btn-submit-dossier" data-bind="value : lockState"
                    data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i
                        class="fa fa-paper-plane"></i> Nộp hồ sơ
            </button>

        <#elseif dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "waiting_3">

            <button class="btn btn-active" id="btn-submit-dossier" data-bind="value : lockState"
                    data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i
                        class="fa fa-paper-plane"></i> Xác nhận kế hoạch
            </button>
        <#elseif dossier.submitting?has_content &&  dossier.submitting != true && dossier.dossierStatus?has_content && dossier.dossierStatus == "waiting_4">

            <button class="btn btn-active" id="btn-submit-dossier" data-bind="value : lockState"
                    data-loading-text="<i class='fa fa-spinner fa-spin '></i> Đang xử lý..."><i
                        class="fa fa-paper-plane"></i> Gửi hồ sơ khắc phục
            </button>
        <#else>

        </#if>


    </div>
</div>

<style type="text/css">
    .divForm {
        overflow: auto !important;
    }
</style>

<script type="text/javascript">

    function xemHSQuyetToan(event) {
        var dossierId = $(event).attr('data-pk');
        console.log('dossierId+++++++xemHSQuyetToan', dossierId)
        $.ajax({
            url: "${api.server}/dossiers/" + dossierId,
            dataType: "json",
            type: "GET",
            headers: {"groupId": "${groupId}"},
            success: function (result) {
                window.location.href = '/group/cong-tiep-nhan/quan-ly-ho-so#/' + result['dossierStatus'] + '/dossiers/' + dossierId
            }
        })
    }

    $("#btn-submit-dossier").button('loading');
    $(".formAlpacaDN").parent().css("overflow", "auto");

    $(window).scroll(function (event) {
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

    var toDetailDossierXNHL = function (event){
        var id = $(event).attr("data-pk");
        var dossierstatus = $(event).attr("data-dossierstatus");
        if (id) {
            window.open('/group/cong-tiep-nhan/quan-ly-ho-so#/' + dossierstatus + '/dossiers/' + id, '_blank')
        } else {
            console.log('ko có id', id)
        }
    }

    var indexDossiserPart = 0;
    var indexDossiserPart2 = 0;

    var dataSourceDossierTemplate = new kendo.data.DataSource({
        transport: {
            read: function (options) {
                if (options.data.dossierTemplateNo) {
                    $.ajax({
                        url: "${api.server}/dossiertemplates/" + options.data.dossierTemplateNo,
                        dataType: "json",
                        type: "GET",
                        headers: {"groupId": "${groupId}"},
                        data: {},
                        success: function (result) {
                            if (result.dossierParts && result.dossierParts['length']) {
                                var tmp = result.dossierParts.filter(function (item) {
                                    return item['partType'] == 1 && item['hasForm']
                                })
                                indexDossiserPart2 = tmp['length'];
                            }
                            options.success(result.dossierParts);
                            $("#dossierTemplateNo").val(result.templateNo);
                        },
                        error: function (result) {
                            options.error(result);
                        }
                    });
                }
            }
        },
        schema: {
            model: {
                id: "partNo"
            }
        }
    });

    var fnLoadPayment = function (dossierId) {
        console.log('dossierId=======fnLoadPayment======', dossierId);
        var resultModel = null;
        if (dossierId) {
            $.ajax({
                url: "${api.server}/dossiers/" + dossierId + "/payments",
                dataType: "json",
                type: "GET",
                headers: {"groupId": "${groupId}"},
                async: false,
                data: {
                    paymentStatus: 0
                },
                success: function (result) {
                    if (result.data) {
                        resultModel = result.data[0];
                    }
                },
                error: function (result) {
                    $("#paymentDossier").remove();
                }
            });
        }

        return resultModel;
    }

    var checkIsXNHL = function (serviceCode) {
        var listServiceCode = ['TT302011BGTVTCNCLKLLKXCGXNHL', 'TT302011BGTVTCNCLKLLKXMXNHL', 'TT302011BGTVTCNCLKLTXXBBCHXNHL', 'TT302011BGTVTCNCLKLTXXBBCNXNHL', 'TT302011BGTVTCNCLKLTXXCGXNHL', 'TT302011BGTVTCNCLKLTXXDDXNHL', 'TT302011BGTVTCNCLKLTXXMTGMXNHL']
        if (listServiceCode.includes(serviceCode)) {
            return true
        } else {
            return false
        }
    }

    var checkIsXNHL_HangNam = function (serviceCode) {
        var listServiceCodeHN = ['TT302011BGTVTCNCLKLLKOTO', 'TT302011BGTVTCNCLKLLKXM', 'TT302011BGTVTCNCLKLTXXCG', 'TT302011BGTVTCNCLKLTXXMTGM', 'TT302011BGTVTCNCLKLTXXDD','TT302011BGTVTCNCLKLTXXBBCN', 'TT302011BGTVTCNCLKLTXXBBCH'];
        if (listServiceCodeHN.includes(serviceCode)) {
            return true
        } else {
            return false
        }
    }

    var getDetailVr_vehicletypeCertificate = function (dossierIdCTN) {
        var tmp = {}
        $.ajax({
            url: "/o/rest/vr-app/vrvehicletypecertificate/dossierIdCTN/" + dossierIdCTN,
            dataType: "json",
            type: "GET",
            headers: {"groupId": "${groupId}"},
            async: false,
            success: function (result) {
                if (result) {
                    if (result['certificaterecordstatus'] == 2 || result['certificaterecordstatus'] == 3) {
                        $('#tinhTranghieuLuc').show();
                        var tinhTrang = ''
                        if (result['expiredstatus'] == 0) {
                            tinhTrang = 'Mất hiệu lực'
                        } else if (result['expiredstatus'] == 1) {
                            tinhTrang = 'Còn hiệu lực'
                        } else if (result['expiredstatus'] == 2) {
                            tinhTrang = 'Đã bị thay thế'
                        } else if (result['expiredstatus'] == 3) {
                            tinhTrang = 'DN tạm dừng sản xuất'
                        }
                        tmp = {
                            expiredStatusText: tinhTrang,
                            certificateRecordNo: result['certificateRecordNo'] || result['certificaterecordno']
                        }
                    } else {
                        $('#tinhTranghieuLuc').hide();
                    }
                } else {
                    $('#tinhTranghieuLuc').hide();
                }
            },
            error: function (xhr) {
                $('#tinhTranghieuLuc').hide();
                tmp = {}
            }
        })
        return tmp
    }

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

        var dataSourceDanhSachCacLanQuyetToanTemplate = new kendo.data.DataSource({
            transport :{
                read : function (options) {
                    console.log('dossierIdCTN+++++++++', options['data'])
                    $.ajax({
                        url: "/o/rest/vr-app/issue/get/settlement",
                        dataType: "json",
                        type: "GET",
                        headers : {"groupId": "${groupId}"},
                        async: false,
                        data: {
                            dossierNo: options['data']['dossierNo']
                        },
                        success: function(result){
                            options.success(result['data'] || []);
                        },
                        error: function(result){
                            options.error(result);
                        }
                    });
                }
            },
            schema : {
                model : {
                    id : "id"
                }
            }
        });

        var indexDsCacLanQuyetToan =0 ;
        $("#danhSachCacLanQuyetToan").kendoListView({
            dataSource : dataSourceDanhSachCacLanQuyetToanTemplate,
            autoBind : false,
            change : function () {

            },
            template : function(data){

                
                indexDsCacLanQuyetToan ++;

                data['stt'] = indexDsCacLanQuyetToan;

                return kendo.template($("#templateDanhSachCacLanQuyetToan").html())(data);

            },
            dataBound : function () {
                indexDsCacLanQuyetToan = 0;
            }
        });


    var printDetailDossier = function (dossierId) {
        console.log('dossierId=======printDetailDossier======', dossierId);
        
        if (dossierId) {
            $.ajax({
                url: "${api.server}/dossiers/" + dossierId,
                dataType: "json",
                type: "GET",
                headers: {"groupId": "${groupId}"},
                success: function (result) {
                    $("#dossierIdCTN").val(result['dossierIdCTN']);
                    $("#dossierStatusHidden").val(result['dossierStatus']);
                    dataSourceDossierTemplate.read({
                        dossierTemplateNo: result.dossierTemplateNo
                    });

                    var listCapPhieu = ['TT302011BGTVTCPPXCG', 'TT302011BGTVTCPPXCD', 'TT302011BGTVTCPPXMTGM', 'TT302011BGTVTCPPXBBCN', 'TT302011BGTVTCPPXBBCH'];
                    if (listCapPhieu.includes(result['dossierTemplateNo'])) {
                        var vrIssue = {};
                        $.ajax({
                            url: "/o/rest/vr-app/outputsheet/get/relation",
                            dataType: "json",
                            type: "GET",
                            headers: {"groupId": "${groupId}"},
                            async: false,
                            success: function (result) {
                                if (result && result['VR_Issue'] && result['VR_Issue']['length']) {
                                    vrIssue = result['VR_Issue'][0];
                                }
                            },
                            error: function (xhr) {

                            }
                        });
                        if (vrIssue['methodOfIssue'] == 10 || vrIssue['methodOfIssue'] == 40) {
                            $('#danhSachCacLanQuyetToan_Toogle').show();
                            console.log('dossierNo-------', result['dossierNo'] )
                            dataSourceDanhSachCacLanQuyetToanTemplate.read({
                                dossierNo: result['dossierNo'] 
                            })
                        } else {
                            $('#danhSachCacLanQuyetToan_Toogle').hide();
                        }
                    } else {
                        $('#danhSachCacLanQuyetToan_Toogle').hide();
                    }

                    var isHoSoXNHL = checkIsXNHL(result['serviceCode']);
                    var isHoSoXNHL_HangNam = checkIsXNHL_HangNam(result['serviceCode']);
                    var tmp = getDetailVr_vehicletypeCertificate(result['dossierIdCTN'])
                    var tinhTranghieuLuc = '';
                    var soGiayChungNhan = '';
                    console.log('isXNHL+++++++', isHoSoXNHL);
                    var dossierIdCTNHoSoXNHL = window.sessionStorage.getItem('dossierIdCTNHoSoXNHL');
                    if (isHoSoXNHL) {
                        $('#danhSachCacLanXNHL_Toogle').show();
                        dataSourceDanhSachCacLanXNHLTemplate.read({
                            dossierIdCTN : dossierIdCTNHoSoXNHL || result['dossierIdCTN'],
                            type: dossierIdCTNHoSoXNHL ? 1 : 2
                        });
                    } else {
                        $('#danhSachCacLanXNHL_Toogle').hide();
                    }

                    if (isHoSoXNHL_HangNam) {
                        $('#danhSachCacLanXNHL_HangNam_Toogle').show();
                        dataSourceDanhSachCacLanXNHL_HangNamTemplate.read({
                            dossierIdCTN : dossierIdCTNHoSoXNHL || result['dossierIdCTN'],
                            type: dossierIdCTNHoSoXNHL ? 1 : 2
                        });
                    } else {
                        $('#danhSachCacLanXNHL_HangNam_Toogle').hide();
                    }
                    if (tmp && checkIsXNHL_HangNam) {
                        tinhTranghieuLuc = tmp['expiredStatusText'];
                        soGiayChungNhan = tmp['certificateRecordNo'];
                    }

                    var payment = fnLoadPayment(result.dossierId);
                    // if (!payment) {
                    //     $("#paymentDossier").remove();
                    //     $("#resultDossierNum").html("II");
                    //     $("#logDossierNum").html("III");
                    // } else if (isHoSoXNHL || isHoSoXNHL_HangNam) {
                    //     $("#logDossierNum").html("V");
                    // } else {
                    //     $("#resultDossierNum").html("III");
                    // }

                    $('.sttDocument').each(function (index, item) {
                        index ++;
                        var tmp = ''
                        if (index == 1) {
                            tmp = 'I'
                        } else if (index == 2) {
                            tmp = 'II'
                        } else if (index == 3) {
                            tmp = 'III'
                        } else if (index == 4) {
                            tmp = 'IV'
                        } else if (index == 5) {
                            tmp = 'V'
                        } else if (index == 6) {
                            tmp = 'VI'
                        } else if (index == 7) {
                            tmp = 'VII'
                        } else if (index == 8) {
                            tmp = 'VIII'
                        } else if (index == 9) {
                            tmp = 'IX'
                        } else if (index == 10) {
                            tmp = 'X'
                        }
                        $(this).find(".background-triangle-small").html(tmp);
                    })

                    var viewModel = kendo.observable({
                        dossierId: result.dossierId,
                        dossierReferenceNo: result.dossierReferenceNo,
                        tinhTranghieuLuc: tinhTranghieuLuc,
                        soGiayChungNhan: soGiayChungNhan,
                        lockState: function (e) {
                            if (result.lockState) {
                                if (result.lockState.startsWith("LOCK")) {
                                    if (result.lockState === "LOCK ALL") {
                                        $("#btn-submit-dossier").remove();
                                        $("#btn-delete-dossier").remove();
                                        $("#btn-submit-dossier-header").remove();
                                        $("#btn-delete-dossier-header").remove();
                                    } else {
                                        $("#btn-submit-dossier").show();
                                        $("#btn-delete-dossier").show();
                                        $("#btn-submit-dossier-header").show();
                                        $("#btn-delete-dossier-header").show();
                                    }
                                } else {
                                    $("#btn-submit-dossier").show();
                                    $("#btn-delete-dossier").show();
                                    $("#btn-submit-dossier-header").show();
                                    $("#btn-delete-dossier-header").show();
                                }

                            } else {
                                $("#btn-submit-dossier").show();
                                $("#btn-delete-dossier").show();
                                $("#btn-submit-dossier-header").show();
                                $("#btn-delete-dossier-header").show();
                            }

                            return "";
                        },
                        dossierIdCTN: function (e) {
                            if (result.dossierIdCTN) {
                                return result.dossierIdCTN;
                            }

                            return "";
                        },
                        serviceName: result.serviceName,
                        govAgencyName: result.govAgencyName,

                        actionNote1: function (e) {

                            if (result.actionNote) {
                                $("#actionNote1").html('<i class="fa fa-bolt" aria-hidden="true" style="color: red;"></i> <span>' + result.actionNote + '</span>');
                            } else {
                                $("#actionNote1").remove();
                            }

                            return;
                        },

                        applicantName: result.applicantName,
                        applicantNote: "",
                        address: result.address,
                        briefNote: function (e) {
                            if (result.briefNote) {
                                return result.briefNote;
                            } else {
                                return "";
                            }
                        },
                        submitDate: function () {
                            if (result.submitDate) {
                                return result.submitDate;
                            }

                            return "";
                        },
                        cityCode: result.cityCode,
                        districtCode: result.districtCode,
                        wardCode: result.wardCode,
                        contactTelNo: result.contactTelNo,
                        contactEmail: result.contactEmail,
                        dossierNo: result.dossierNo,
                        dossierStatusText: result.dossierStatusText,
                        stepInstruction: result.stepInstruction,
                        dossierStatus: result.dossierStatus,
                        postalAddress: result.postalAddress,
                        corporationCode: result.corporationCode,
                        corporationName: function (e) {
                            if (!result['corporationName']) {
                              $('#corporationName').remove();
                            }
                            if (result.viaPostal == 2) {
                              return result['corporationName'] + ' (Bưu điện)'
                            } else {
                               return result['corporationName'] + ' (Trực tiếp)'
                            }
                            // return result['corporationName'] || ''
                        },
                        postalReceiverName: function (e) {
                            return result['postalReceiverName'] || ''
                        },
                        postalCityCode: result.postalCityCode,
                        postalCityName: result.postalCityName,
                        postalTelNo: result.postalTelNo,
                        dossierTemplateNo: result.dossierTemplateNo,
                        contactName: result.contactName,
                        cityName: result.cityName,
                        districtName: result.districtName,
                        wardName: result.wardName,
                        viaPostal: function (e) {
                            if (result.viaPostal == 0 || result.viaPostal == 1) {
                                $("#postal").remove();
                            }
                        },
                        submissionNote: function (e) {
                            if (result.submissionNote) {
                                $("#guideDossier").show();
                                return result.submissionNote;
                            } else {
                                $("#guideDossier").hide();
                                return "";
                            }
                        },
                        paymentDossier: payment,
                        paymentFee: function (e) {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').paymentFee) {
                                    return this.get('paymentDossier').paymentFee;
                                }
                            }
                            return "";
                        },
                        paymentAmount: function (e) {
                            if (this.get('paymentDossier') && this.get('paymentDossier')['paymentAmount']) {
                                var value = this.get('paymentDossier')['paymentAmount'];
                                var moneyCur = (value / 1).toFixed(0).replace('.', ',');
                                return moneyCur.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
                            }
                            return "";
                        },
                        paymentGovAgencyName: function (e) {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').govAgencyName) {
                                    return this.get('paymentDossier').govAgencyName;
                                }
                            }
                            return "";
                        },
                        paymentBankInfo: function (e) {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').bankInfo) {
                                    return this.get('paymentDossier').bankInfo;
                                }
                            }
                            return "";
                        },
                        paymentStatus: function (e) {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').paymentStatus === 0) {
                                    $("#dossier-payment-confirm").prop("disabled", false);
                                    return "Chờ nộp";
                                } else if (this.get('paymentDossier').paymentStatus === 1) {
                                    $("#dossier-payment-confirm").prop("disabled", true);
                                    return "Báo đã nộp";
                                } else if (this.get('paymentDossier').paymentStatus === 2) {
                                    $("#dossier-payment-confirm").prop("disabled", false);
                                    return "Hoàn thành";
                                } else {
                                    $("#dossier-payment-confirm").prop("disabled", false);
                                    return "Không hợp lệ";
                                }
                            }
                            return "";
                        },
                        paymentApproveDatetime: function (e) {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').approveDatetime) {
                                    return this.get('paymentDossier').approveDatetime;
                                }
                            }
                            return "---";
                        },
                        paymentConfirmNote: function (e) {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').confirmNote) {
                                    return this.get('paymentDossier').confirmNote;
                                }
                            }
                            return "";
                        },
                        referenceUidPayment: function (e) {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').referenceUid) {
                                    return this.get('paymentDossier').referenceUid;
                                }
                            }
                            return "";
                        },
                        isPay: function () {
                            if (this.get('paymentDossier')) {
                                if (this.get('paymentDossier').paymentStatus !== 2) {
                                    $("#unpaid").show();
                                    $("#alreadyPaid").hide();
                                }
                            }
                        },
                        cancellingDate: function () {
                            if (result.cancellingDate) {
                                $("#btn-rescancelling-dossier").hide();
                                $("#btn-cancelling-header").hide();
                            }

                            return "";
                        },
                        correctingDate: function () {
                            if (result.correctingDate) {
                                $("#btn-sendReissue-dossier-header,#btn-sendReissue-dossier-footer,#btn-dntrahuy-dossier-footer").hide();
                            }
                            return "";
                        },
                        submitting: function () {
                            if (result.submitting) {
                                return result.submitting;
                            }
                            return;
                        },
                        endorsementDate: function () {
                            if (result.endorsementDate) {
                                $("#btn-sendadd-dossier-header,#btn-sendadd-dossier-footer,#btn-dnhuy-dossier-footer").hide();
                            }

                            return "";
                        }

                    });

                    kendo.bind($("#detailDossier"), viewModel);
                    if (result['dossierReferenceNo']) {
                        $("#mahsMCDT").show();
                    } else {
                        $("#mahsMCDT").hide();
                    }

                },
                error: function (result) {
                    $("#paymentDossier").html("");
                }

            });
        }
    }

    var arrIsChangeForm = [];

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

    var fnCheckValidTemplate = function () {
        console.log($(".validPart"));
        var valid = true;
        try {

            $(".validPart").each(function (index) {
                console.log($(this).val());
                if ($(this).val() === "0") {
                    valid = false;
                }
            });

        } catch (e) {
            valid = false;
        }

        return valid;
    }

    var fnCheckLockTemplate = function (lockState, item) {
        if ("${sendReissue}" || "${sendAdd}") {
            return false;
        }
        if ("${dnHuy}" && item == 'TP1') {
            return false;
        }
        if (lockState.startsWith("LOCK")) {

            if (lockState === "LOCK INPUT") {
                return true;
            } else if (lockState === "LOCK ALL") {
                return true;
            } else if (lockState !== "LOCK ALL" && lockState !== "LOCK INPUT" && lockState !== "LOCK OUTPUT") {
                var partLocksStr = lockState.split(" ")[1];
                if (partLocksStr) {
                    var partLocks = partLocksStr.split(",");
                    for (var i = 0; i < partLocks.length; i++) {
                        if (partLocks[i] === item) {
                            return true;
                        }
                    }
                }
                return false;
            }

        } else if (lockState.startsWith("UPDATE")) {
            if (lockState === "UPDATE INPUT") {
                return false;
            }

            if (lockState === "UPDATE ALL") {
                return false;
            }

            if (lockState !== "UPDATE ALL" && lockState !== "UPDATE INPUT" && lockState !== "UPDATE OUTPUT") {
                var partLocksStr = lockState.split(" ")[1];
                if (partLocksStr) {
                    var partLocks = partLocksStr.split(",");
                    for (var i = 0; i < partLocks.length; i++) {
                        if (partLocks[i] === item) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }

        return false;
    }

    $(function () {
        $("body").data("dossierFiles", []);


        $(document).off("click", ".show-dossierpart-new-tab");
        $(document).on("click", ".show-dossierpart-new-tab", function () {
            var partNo = $(this).attr("data-partno");
            var hasForm = $(this).attr("hasForm");
            var hasFile = $(this).attr("hasFile");

            if (!hasForm) {
                if (hasFile) {
                    var dossierId = "${(dossierId)!}";
                    var dossierTemplateNo = "${(dossier.dossierTemplateNo)!}";

                    var url = "#/" + dossierId + "/files/" + dossierTemplateNo + "/" + partNo;

                    window.open(url, "_blank");
                }

            }

        });

        $(document).off("click", ".dossier-file");
        $(document).on("click", ".dossier-file", function () {
            funDossierFile("${dossier.dossierId}", funGenNumberFile);
        });

        $(document).off("change", ".dossier-file");
        $(document).on("change", ".dossier-file", function () {

            var partNo = $(this).attr("part-no");
            var fileTemplateNo = $(this).attr("file-template-no");
            var dossierTemplateNo = $("#dossierTemplateNo").val();
            var hasform = $(this).attr("hasform");

            kendo.ui.progress($("#mainType2"), true);

            funUploadFile($(this), partNo, dossierTemplateNo + "", fileTemplateNo, hasform);
        });

        $(document).off("click", ".uploadfile-form-repository");
        $(document).on("click", ".uploadfile-form-repository", function () {
            var dossierId = "${(dossierId)!}";
            var dossierTemplateNo = $("#dossierTemplateNo").val();
            var partNo = $(this).attr("part-no");
            $("#uploadFileTemplateDialog").load("${ajax.customer_dossier_detail_filetemplate}&${portletNamespace}dossierPartNo=" + partNo + "&${portletNamespace}dossierId=" + dossierId + "&${portletNamespace}dossierTemplateNo=" + dossierTemplateNo, function (result) {
                $(this).modal("show");
            });
            funDossierFile("${dossier.dossierId}", funGenNumberFile);
        });

        $(document).off("click", ".dossier-component-profile");
        $(document).on("click", ".dossier-component-profile", function () {
            var partNo = $(this).attr("data-partno");
            var dossierId = "${(dossierId)!}";
            var dossierTemplateNo = "${(dossier.dossierTemplateNo)!}";
            var lockState = "${(dossier.lockState)!}";

            var url = "#/" + dossierId + "/files/" + dossierTemplateNo + "/" + partNo;

            var cf = fnConfirm("Thông báo",
                "Bạn muốn mở trong tab mới hay cửa sổ mới",
                "Tab mới", "Cửa sổ mới",
                function () {

                    window.open(url, "_blank");

                }, function () {

                    window.open(url, "_blank", "location=yes");
                });

            cf.open();

            funDossierFile("${dossier.dossierId}", funGenNumberFile);

        });

        $(document).off("click", ".delete-dossier-file");
        $(document).on("click", ".delete-dossier-file", function () {
            if (navigator.onLine) {

                var dossierId = "${dossier.dossierId}";
                var dataPartNo = $(this).attr("data-partno");
                var eForm = $(this).attr("eForm");
                var fileTemplateNo = $(this).attr("fileTemplateNo");
                try {
                    $("#formPartNo" + dataPartNo).alpaca('get').setValue({});
                } catch (e) {

                }

                var cf = confirm("Bạn có muốn xóa file toàn bộ file của thành phần này!");
                if (cf) {
                    if (dossierId && dataPartNo) {
                        if (eForm === "true") {

                            $.ajax({
                                url: "${api.server}/dossiers/" + dossierId + "/files",
                                dataType: "json",
                                type: "GET",
                                headers: {"groupId": "${groupId}"},
                                success: function (result) {
                                    var data = result.data;
                                    if (data) {
                                        var arrIsSuccess = new Array();
                                        for (var i = 0; i < data.length; i++) {
                                            var isSuccess = false;
                                            if (dataPartNo === data[i].dossierPartNo) {
                                                isSuccess = removeDossierFile(dossierId, data[i].referenceUid);
                                                arrIsSuccess.push(isSuccess);

                                            }
                                        }

                                        if (jQuery.inArray(false, arrIsSuccess) == -1) {
                                            $(".dossier-component-profile").filter("[data-partno=" + dataPartNo + "]").html('<span class="number-in-circle" >0</span>');

                                            $(".dossier-component-profile").filter("[data-partno=" + dataPartNo + "]").attr("data-number", 0);

                                            if (navigator.onLine) {
                                                notification.show({
                                                    message: "Yêu cầu được thực hiện thành công"
                                                }, "success");
                                            }
                                            $("#validPart" + dataPartNo).val("0");
                                        } else {
                                            if (navigator.onLine) {
                                                notification.show({
                                                    message: "Xẩy ra lỗi, vui lòng thử lại"
                                                }, "error");
                                            }
                                        }


                                    }
                                },
                                error: function (result) {
                                    if (navigator.onLine) {
                                        notification.show({
                                            message: "Xẩy ra lỗi, vui lòng thử lại"
                                        }, "error");
                                    }
                                }
                            });

                        } else {
                            removeDossierFileNotEform(dossierId, fileTemplateNo, dataPartNo);
                        }
                    }

                }
            } else {
                alert("Không có kết nối internet, vui lòng kiểm tra kết nối của bạn!");
            }
        });

        $("#btn-view-extendguide").click(function () {
            if ($("#extend-guide").attr("status") == "none") {
                $("#extend-guide").show();
                $("#extend-guide").attr("status", "show");
            } else {
                $("#extend-guide").hide();
                $("#extend-guide").attr("status", "none");
            }
        });

        var dataSourceDossiserFileTemplate;
        var dataSourceDossiserLog;

        dataSourceDossiserFileTemplate = new kendo.data.DataSource({
            transport: {
                read: function (options) {
                    $.ajax({
                        url: "${api.server}/dossiers/${dossier.dossierId}/files",
                        dataType: "json",
                        type: "GET",
                        headers: {"groupId": "${groupId}"},
                        data: {},
                        success: function (result) {
                            var arrResult = fnGetPartype2(result.data);
                            options.success(arrResult);
                        },
                        error: function (result) {
                            options.error(result);
                        }
                    });
                }
            },
            schema: {
                model: {
                    id: "dossierFileId"
                }
            }
        });

        dataSourceDossiserLog = new kendo.data.DataSource({
            transport: {
                read: function (options) {
                    $.ajax({
                        url: "${api.server}/dossierlogs/${dossier.dossierId}/logs",
                        dataType: "json",
                        type: "GET",
                        headers: {"groupId": "${groupId}"},
                        data: {},
                        success: function (result) {
                            result["data"] = result.hasOwnProperty("data") ? result["data"] : [];

                            var arrLogsResult = fnGetLogs(result.data);
                            console.log(arrLogsResult);
                            options.success(arrLogsResult);
                        },
                        error: function (result) {
                            options.error(result);
                        }
                    });
                }
            },
            schema: {
                data: "data",
                total: "total",
                model: {
                    id: "dossierLogId"
                }
            }
        });

        $("#listViewDossiserFileTemplate").kendoListView({
            dataSource: dataSourceDossiserFileTemplate,
            template: kendo.template($("#templateDossiserFileTemplate").html()),
            autoBind: true
        });

        var fnGetPartype2 = function (arrFile) {
            var arrResult = new Array();
            if (arrFile) {
                for (var i = 0; i < arrFile.length; i++) {
                    if (arrFile[i].dossierPartType == 2) {
                        arrResult.push(arrFile[i]);
                    }
                }
            }

            return arrResult;
        }

        var fnGetLogs = function (arrLogs) {

            var arrLogsResult = new Array();
            var count = 0;
            var result = {};
            if (arrLogs) {
                for (var i = 0; i < arrLogs.length; i++) {
                    if (arrLogs[i].notificationType === 'PROCESS_TYPE') {
                        arrLogsResult.push(arrLogs[i]);
                        count++;
                    }
                }
            }
            result["data"] = arrLogsResult;
            result["total"] = count;
            return result;
        }

        

        var indexDossiserLog = 0;
        $("#listViewDossiserLog").kendoListView({
            dataSource: dataSourceDossiserLog,
            autoBind: true,
            dataBound: function () {
                indexDossiserLog = 0;
            },
            template: function (data) {

                indexDossiserLog++;

                data.itemIndex = indexDossiserLog;

                return kendo.template($("#templateDossiserLog").html())(data);

            },
        });

        
        $("#lsDossierTemplPart").kendoListView({
            dataSource: dataSourceDossierTemplate,
            autoBind: false,
            change: function () {

            },
            template: function (data) {

                if (data.partType === 1) {
                    indexDossiserPart++;
                }

                data.itemIndex = indexDossiserPart;

                return kendo.template($("#templateDossierPart").html())(data);

            },
            dataBound: function () {
                indexDossiserPart = 0;
                var dossierParts = this.dataSource.view();
                //kiem tra dossier status, neu status thuoc new thi cho phep upoad hoac sua file
                //fnCheckStatusAndHideUpload("${(dossier.dossierStatus)!}",dossierParts);

                //gen number file cho icon thanh phan ho so

                funDossierFile("${dossier.dossierId}", funGenNumberFile);
            }
        });

        
        $("#lsDossierTemplPart2").kendoListView({
            dataSource: dataSourceDossierTemplate,
            autoBind: false,
            change: function () {

            },
            template: function (data) {


                if (data.partType === 1 && !data['hasForm']) {
                    indexDossiserPart2++;
                }

                data['itemIndex2'] = indexDossiserPart2;

                return kendo.template($("#templateDossierPart2").html())(data);

            },
            dataBound: function () {
                indexDossiserPart2 = 0;
                funDossierFile("${dossier.dossierId}", funGenNumberFile);
            }
        });

        printDetailDossier("${dossier.dossierId}");

        var funUploadFile = function (file, partNo, dossierTemplateNo, fileTemplateNo) {
            var data = new FormData();
            var fileLength = $(file)[0].files.length;
            data.append('displayName', $(file)[0].files[0]['name'] || "");
            data.append('file', $(file)[0].files[0]);
            data.append('dossierPartNo', partNo);
            data.append('referenceUid', "");
            data.append('dossierTemplateNo', dossierTemplateNo);
            data.append('fileTemplateNo', fileTemplateNo);
            data.append('formData', "");
            data.append('isSync', "true");
            data.append('fileType', "");
            data.append('formDataDossierFile', "");
            //data.append('deliverableCode', "");

            $.ajax({
                type: 'POST',
                url: '${api.server}/dossiers/${dossier.dossierId}/files',
                data: data,
                headers: {"groupId": "${groupId}"},
                processData: false,
                contentType: false,
                dataType: 'json',
                cache: false,
                success: function (result) {
                    kendo.ui.progress($("#mainType2"), false);

                    funDossierFile("${dossier.dossierId}", funGenNumberFile);

                    notification.show({
                        message: "Yêu cầu được thực hiện thành công"
                    }, "success");

                    $(file).val("");

                },
                error: function (result) {
                    kendo.ui.progress($("#mainType2"), false);

                    notification.show({
                        message: "Thêm không thành công do số biểu mẫu bị trùng."
                    }, "error");

                    $(file).val("");
                }
            });

        }

        var fnCheckStatusAndHideUpload = function (dossierStatus, dossierParts) {
            /*if(dossierStatus !== "" && dossierStatus !== "new" && dossierStatus !== "waiting" && "
            ${(sendAdd)!}" !== "true"){
		$(".uploadfile-form-repository").remove();
		$(".lbl-dossier-file").remove();
		$(".delete-dossier-file").remove();
	}*/

            console.log("dossierParts=========", dossierParts);
            var promise = new Promise(function (resolve, reject) {
                $.ajax({
                    url: "${api.server}/dossiers/${(dossierId)!}/processstep",
                    dataType: "json",
                    type: "GET",
                    headers: {"groupId": "${groupId}"},
                    success: function (result) {
                        resolve(result);
                    },
                    error: function (xhr) {
                        reject(xhr);
                    }
                });
            });


            promise.then(function (success) {
                var arrPart = success.split(",");
                console.log("arrPart=========", arrPart);
                if (arrPart) {
                    for (var i = 0; i < arrPart.length; i++) {
                        var index = $.inArray(arrPart[i], dossierParts);
                        if (index != -1) {
                            $(".lbl-dossier-file[data-partno=" + arrPart[i] + "]").remove();
                            $(".uploadfile-form-repository[partno=" + arrPart[i] + "]").remove();
                            $(".delete-dossier-file[data-partno=" + arrPart[i] + "]").remove();
                        }
                    }
                }


            }, function (error) {

            });


        }

        var removeDossierFile = function (dossierId, fileId) {
            var isSuccess = false;

            $.ajax({
                url: "${api.server}/dossiers/" + dossierId + "/files/" + fileId + "/resetformdata",
                dataType: "json",
                type: "PUT",
                headers: {"groupId": "${groupId}"},
                async: false,
                success: function (result) {
                    isSuccess = true;

                },
                error: function (result) {
                    isSuccess = false;
                }
            });
            return isSuccess;
        }

        var removeDossierFileNotEform = function (dossierId, fileTemplateNo, partNo) {

            if (navigator.onLine) {
                var data = new FormData();
                $.ajax({
                    url: "${api.server}/dossiers/" + dossierId + "/files/" + fileTemplateNo + "/all",
                    type: "DELETE",
                    dataType: "json",
                    processData: false,
                    contentType: false,
                    cache: false,
                    headers: {
                        "groupId": "${groupId}",
                        "Accept": "application/json"
                    },
                    data: data,
                    success: function (result) {
                        notification.show({
                            message: "Yêu cầu được thực hiện thành công"
                        }, "success");
                        $(".dossier-component-profile").filter("[data-partno=" + partNo + "]").html('<span class="number-in-circle" >0</span>');

                        $(".dossier-component-profile").filter("[data-partno=" + partNo + "]").attr("data-number", 0);
                        $("#validPart" + partNo).val("0");
                    },
                    error: function (result) {
                        notification.show({
                            message: "Xảy ra lỗi, xin vui lòng thử lại"
                        }, "error");
                    }
                });
            }


        }

        var funDossierFile = function (dossierId, callBack) {
            if (dossierId) {
                $.ajax({
                    url: "${api.server}/dossiers/" + dossierId + "/files",
                    dataType: "json",
                    type: "GET",
                    headers: {"groupId": "${groupId}"},
                    success: function (result) {
                        if (result.data) {
                            callBack(result.data);
                        } else {
                            callBack([]);
                        }


                    },
                    error: function (result) {

                    }
                });
            }
        }


        var funGenNumberFile = function (arrCount) {

            $(".dossier-component-profile").each(function (index) {
                var partNo = $(this).attr("data-partno");
                var found = $.grep(arrCount, function (v) {
                    return v.dossierPartNo === partNo;
                });

                $(this).attr("data-number", found.length);
                $(this).html('<span class="number-in-circle" >' + found.length + '</span>');
                if (found.length > 0) {
                    $(".show-dossierpart-new-tab[data-partno=" + partNo + "]").attr('hasFile', 'true');
                } else {
                    $("#validPart" + partNo).val("0");
                    $(".show-dossierpart-new-tab[data-partno=" + partNo + "]").attr('hasFile', '');
                }
            });

            $("#btn-submit-dossier").button('reset');

        }
    });


    var getReferentUidFile = function (dossierId, dossierPartNo) {
        var dossierFile;
        if (dossierId) {
            $.ajax({
                type: 'GET',
                dataType: "json",
                url: '${api.server}/dossiers/${dossier.dossierId}/files',
                headers: {"groupId": "${groupId}"},
                async: false,
                success: function (result) {
                    if (result.data) {
                        for (var i = 0; i < result.data.length; i++) {
                            if (result.data[i].eForm) {
                                if (dossierPartNo === result.data[i].dossierPartNo) {
                                    dossierFile = result.data[i];
                                    return;
                                }

                            }
                        }
                    }

                },
                error: function (result) {

                }
            });
        }

        return dossierFile;
    }

    var fnGetFormData = function (dossierId, referentUid) {
        var value = null;
        var expireCertificateId = window.sessionStorage.getItem('expireCertificateId');
        $('#expireCertificateId_hidden').val(expireCertificateId)
        if (dossierId && referentUid) {
            $.ajax({
                url: "${api.server}/dossiers/" + dossierId + "/files/" + referentUid + "/formdata",
                type: "GET",
                dataType: "json",
                async: false,
                success: function (result) {
                    value = result;

                },
                error: function (result) {

                }

            });
        }

        return value;
    }


    var fnSaveForm = function (id, value) {
        var current = $("#btn-save-formalpaca" + id);
        var referentUid = current.attr("referenceUid");

        if (referentUid) {
            $.ajax({
                url: "${api.server}/dossiers/${dossier.dossierId}/files/" + referentUid + "/formdata",
                dataType: "json",
                type: "PUT",
                headers: {
                    "groupId": "${groupId}",
                    Accept: "application/json"
                },
                data: {
                    formdata: JSON.stringify(value)
                },
                success: function (result) {
                    notification.show({
                        message: "Yêu cầu được thực hiện thành công!"
                    }, "success");

                    $("#validPart" + id).val("1");
                    try {
                        for (var i = 0; i < arrIsChangeForm.length; i++) {
                            if (arrIsChangeForm[i].partNo === id) {
                                arrIsChangeForm[i].isSave = true;
                            }
                        }
                    } catch (e) {

                    }
                },
                error: function (result) {
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
        } else {
            console.log('Không có referenceUid!!!!');
            // notification.show({
            //     message: "Vui lòng kiểm tra lại các thông tin bắt buộc trước khi ghi lại!"
            // }, "error");
        }

        if ("${dossier.dossierTemplateNo}" === 'TT302011BGTVTCOP' && id === 'TP99') {
            $('#thoi_han_kiem_tra_from').val($('#ngay_kiem_tra').val())
            $('#thoi_han_kiem_tra_to').val($('#ngay_kiem_tra_to').val())
            $('#btn-save-formalpacaTP1').click()
        }

    });

    $("#btn-sendReissue-dossier").click(function () {
        var cf = fnConfirm("Thông báo",
            "Bạn có muốn gửi yêu cầu sửa giấy chứng nhận?",
            "OK", "Thoát",
            function () {

                fnCorrecting("${(dossierId)!}");

            }, function () {

            });

        cf.open();

    });


    var createActionDossier = function (dossierId, callBackSubmit) {
        if (dossierId) {
            $.ajax({
                url: "${api.server}/dossiers/" + dossierId + "/actions",
                dataType: "json",
                type: "POST",
                headers: {
                    "groupId": "${groupId}",
                    Accept: "application/json"
                },
                data: {
                    actionCode: 1100,
                    actionNote: $("textarea#applicantNote").val(),
                    actionUser: '${(userInfo.actionUser)!}'
                },
                success: function (result) {
                    callBackSubmit();
                    console.log("create acion dossier success!");
                },
                error: function (result) {
                }
            });
        }
    }

    var fnSubmitting2 = function (dossierId) {
        kendo.ui.progress($("#mainType2"), true);
        $("#btn-sendadd-dossier-header,#btn-sendadd-dossier-footer,#btn-dnhuy-dossier-footer").hide();
        console.log("----------5" + "${(dossier.dossierStatus)!}");
        var applicantNote = $("textarea#applicantNote").val();
        /*if(applicantNote.trim() == ''){
		alert('Bạn phải nhập ý kiến trước khi gửi.');
		$("textarea#applicantNote").focus();
		return;
	}*/
        console.log("run sendReissue!");
        var issueType = "${(issueType)!}" || "";
        if ("${(dnGiamSat)!}" || "${(dnKiemTra)!}") {
            issueType = 1
        }
        var postalValidator = $("#postalInfo").kendoValidator().data("kendoValidator");
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
        if(postalValidator.validate() && validCorporationCode) {
            $.ajax({
                url  : '${api.server}/dossiers/${dossierId}', 
                dataType : "json",
                type : 'PUT', 
                headers: {"groupId": "${groupId}"},
                data : {
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
                },
                error:function(result){
                    console.error(result);
                }   
            });
        } else {
            var message = '';
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
            return false;
        }
        
        $.ajax({
            url: "${api.server}/dossiers/" + dossierId + "/submitting" + issueType,
            dataType: "json",
            type: "POST",
            headers: {
                "groupId": "${groupId}",
                "Accept": "application/json"
            },
            processData: false,
            contentType: 'text/plain',
            data: $("textarea#applicantNote").val(),
            success: function (result) {
                kendo.ui.progress($("#mainType2"), false);
                notification.show({
                    message: "Yêu cầu được thực hiện thành công!"
                }, "success");
                $("#btn-sendadd-dossier-header,#btn-sendadd-dossier-footer,#btn-dnhuy-dossier-footer").hide();
                try {
                    manageDossier.navigate("/" + statusRouteTem.status);
                    $('html,body').scrollTop(0);
                } catch (e) {

                }
                window.sessionStorage.setItem("editInput", false);
            },
            error: function (result) {
                kendo.ui.progress($("#mainType2"), false);
                notification.show({
                    message: "Thực hiện không thành công, xin vui lòng thử lại!"
                }, "error");
                $("#btn-sendadd-dossier-header,#btn-sendadd-dossier-footer,#btn-dnhuy-dossier-footer").show();
            }
        });


    }


    var fnCorrecting = function (dossierId) {
        kendo.ui.progress($("#mainType2"), true);
        $("#btn-sendReissue-dossier-header,#btn-sendReissue-dossier-footer,#btn-dntrahuy-dossier-footer").hide();
        console.log("----------4" + "${(dossier.dossierStatus)!}");
        var applicantNote = $("textarea#applicantNote").val();
        /*if(applicantNote.trim() == ''){
		alert('Bạn phải nhập ý kiến trước khi gửi.');
		$("textarea#applicantNote").focus();
		return;
	}*/
        console.log("run sendReissue!");

        $.ajax({
            url: "${api.server}/dossiers/" + dossierId + "/correcting",
            dataType: "json",
            type: "POST",
            headers: {
                "groupId": "${groupId}",
                "Accept": "application/json"
            },
            processData: false,
            contentType: 'text/plain',
            data: $("textarea#applicantNote").val(),
            success: function (result) {
                kendo.ui.progress($("#mainType2"), false);
                notification.show({
                    message: "Yêu cầu được thực hiện thành công!"
                }, "success");
                $("#btn-sendReissue-dossier-header,#btn-sendReissue-dossier-footer,#btn-dntrahuy-dossier-footer").hide();
                $("#btn-sendReissue-dossier-header").hide();

                try {
                    manageDossier.navigate("/" + statusRouteTem.status);
                    $('html,body').scrollTop(0);
                } catch (e) {

                }
                window.sessionStorage.setItem("editInput", false);
            },
            error: function (result) {
                kendo.ui.progress($("#mainType2"), false);
                $("#btn-sendReissue-dossier-header,#btn-sendReissue-dossier-footer,#btn-dntrahuy-dossier-footer").show();
                notification.show({
                    message: "Thực hiện không thành công, xin vui lòng thử lại!"
                }, "error");
            }
        });

    }


    $("#btn-cancelling-header").click(function () {
        var cf = fnConfirm("Thông báo",
            "Bạn có muốn gửi yêu cầu hủy?",
            "OK", "Thoát",
            function () {

                fnCancelling("${(dossierId)!}");

            }, function () {

            });

        cf.open();
    });


    $("#btn-rescancelling-dossier").click(function () {
        var lsForm = $(".formAlpacaDN");
        if (lsForm && lsForm['length'] && "${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
            for (var i = 0; i < lsForm.length; i++) {
                var partNo = $(lsForm[i]).attr("data-pk");
                var partName = $(lsForm[i]).attr("data-partname");
                var dossierFileId = $(lsForm[i]).attr("dossierFileId");
                console.log("dossierFileId+++++++++partNo+++++partName++++++++", dossierFileId, partNo, partName);
                var checkTmp = fnCheckLockTemplate("${dossier.lockState}", partNo);
                console.log("checkTmp+++++++++lockState+++++partNo++++++++", "${dossier.lockState}", partNo, checkTmp);
                // checkTmp = true là thành phần có lock (ko tác động vào hs) nên ko kiểm tra valid form nữa
                if (checkTmp) {
                    continue;
                }
                var tv = fnCheckIsChangeForm(dossierFileId, partNo, partName);
                console.log('toàn vẹn++++++++', tv);
                if (!tv) {
                    console.log('dữ liệu ko toàn vẹn++++++++', tv);
                    return;
                }
            }
        }
        var cf = fnConfirm("Thông báo",
            "Bạn có muốn gửi yêu cầu hủy?",
            "OK", "Thoát",
            function () {

                fnCancelling("${(dossierId)!}");

            }, function () {

            });

        cf.open();

    });

    var fnCancelling = function (dossierId) {
        kendo.ui.progress($("#mainType2"), true);
        $("#btn-rescancelling-dossier,#btn-cancelling-header").hide();
        console.log("-----------1" + "${(dossier.dossierStatus)!}");
        if ("${(dossier.dossierStatus)!}" !== "new" && "${(dossier.dossierStatus)!}" !== "null" && "${(dossier.dossierStatus)!}" !== "done") {

            /*var applicantNote = $("textarea#applicantNote").val();
		if(applicantNote.trim() == ''){
			alert('Bạn phải nhập ý kiến trước khi gửi.');
			$("textarea#applicantNote").focus();
			return;
		}*/

            console.log("run rescancelling!");

            $.ajax({
                url: "${api.server}/dossiers/" + dossierId + "/cancelling",
                dataType: "json",
                type: "POST",
                headers: {
                    "groupId": "${groupId}",
                    "Accept": "application/json"
                },
                processData: false,
                contentType: 'text/plain',
                data: $("textarea#applicantNote").val(),
                success: function (result) {
                    kendo.ui.progress($("#mainType2"), false);
                    notification.show({
                        message: "Yêu cầu được thực hiện thành công!"
                    }, "success");

                    $("#btn-rescancelling-dossier,#btn-cancelling-header").hide();

                    try {
                        manageDossier.navigate("/" + statusRouteTem.status);
                        $('html,body').scrollTop(0);
                    } catch (e) {

                    }
                },
                error: function (result) {
                    kendo.ui.progress($("#mainType2"), false);
                    $("#btn-rescancelling-dossier,#btn-cancelling-header").show();
                    notification.show({
                        message: "Thực hiện không thành công, xin vui lòng thử lại!"
                    }, "error");
                }
            });

        }

    }


    $("#btn-back-dossier").click(function () {
        try {
            fnBack();
        } catch (e) {

        }
    });

    $("#btn-sendadd-dossier-header,#btn-sendadd-dossier-footer,#btn-dnhuy-dossier-footer,#btn-dnkiemtra-dossier-footer,#btn-dngiamsat-dossier-footer").click(function () {
        // var validateDossierTemplate = fnCheckValidTemplate();

        // if (!validateDossierTemplate) {
        //     $('.saveFormAlpaca').click()
        // }

        var lsForm = $(".formAlpacaDN");
        if (lsForm && lsForm['length'] && "${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
            for (var i = 0; i < lsForm.length; i++) {
                var partNo = $(lsForm[i]).attr("data-pk");
                var partName = $(lsForm[i]).attr("data-partname");
                var dossierFileId = $(lsForm[i]).attr("dossierFileId");
                console.log("dossierFileId+++++++++partNo+++++partName++++++++", dossierFileId, partNo, partName);
                var checkTmp = fnCheckLockTemplate("${dossier.lockState}", partNo);
                console.log("checkTmp+++++++++lockState+++++partNo++++++++", "${dossier.lockState}", partNo, checkTmp);
                // checkTmp = true là thành phần có lock (ko tác động vào hs) nên ko kiểm tra valid form nữa
                if (checkTmp) {
                    continue;
                }
                var tv = fnCheckIsChangeForm(dossierFileId, partNo, partName);
                console.log('toàn vẹn++++++++', tv);
                if (!tv) {
                    console.log('dữ liệu ko toàn vẹn++++++++', tv);
                    return;
                }
            }
        }

        var message = "";
        if ("${(issueType)!}" == 2) {
            message = "Bạn có muốn đề nghị cấp thay thế (cho phiếu hỏng)";
        } else if ("${(issueType)!}" == 3) {
            message = "Bạn có muốn đề nghị cấp thay thế (đổi phiếu mất)?";
        } else if ("${(issueType)!}" == 4) {
            message = "Bạn có muốn đề nghị cấp thay thế?";
        } else if ("${(issueType)!}" == 5) {
            message = "Bạn có muốn đề nghị trả ấn chỉ?";
        } else if ("${(issueType)!}" == 6) {
            message = "Bạn có muốn đề nghị hủy ấn chỉ?";
        } else if ("${(issueType)!}" == 7) {
            message = "Bạn có muốn đề nghị hủy hồ sơ?";
        } else {
            message = "Bạn có muốn gửi yêu cầu bổ sung?";
        }
        if ("${(dnGiamSat)!}") {
            message = "Bạn có muốn đề nghị giám sát?";
        } else if ("${(dnKiemTra)!}") {
            message = "Bạn có muốn đề nghị kiểm tra?";
        }

        var cf = fnConfirm("Thông báo",
            message,
            "OK", "Thoát",
            function () {

                fnSubmitting2("${(dossierId)!}");

            }, function () {

            });

        cf.open();
    });

    $("#btn-sendReissue-dossier-header,#btn-sendReissue-dossier-footer,#btn-dntrahuy-dossier-footer").click(function () {

        var lsForm = $(".formAlpacaDN");
        if (lsForm && lsForm['length'] && "${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD') {
            for (var i = 0; i < lsForm.length; i++) {
                var partNo = $(lsForm[i]).attr("data-pk");
                var partName = $(lsForm[i]).attr("data-partname");
                var dossierFileId = $(lsForm[i]).attr("dossierFileId");
                console.log("dossierFileId+++++++++partNo+++++partName++++++++", dossierFileId, partNo, partName);
                var checkTmp = fnCheckLockTemplate("${dossier.lockState}", partNo);
                console.log("checkTmp+++++++++lockState+++++partNo++++++++", "${dossier.lockState}", partNo, checkTmp);
                // checkTmp = true là thành phần có lock (ko tác động vào hs) nên ko kiểm tra valid form nữa
                if (checkTmp) {
                    continue;
                }
                var tv = fnCheckIsChangeForm(dossierFileId, partNo, partName);
                console.log('toàn vẹn++++++++', tv);
                if (!tv) {
                    console.log('dữ liệu ko toàn vẹn++++++++', tv);
                    return;
                }
            }
        }
        var cf = fnConfirm("Thông báo",
            "Bạn có muốn gửi yêu cầu sửa giấy chứng nhận?",
            "OK", "Thoát",
            function () {

                fnCorrecting("${(dossierId)!}");

            }, function () {

            });

        cf.open();

    });

    $("#btn-submit-dossier,#btn-submit-dossier-header").click(function (event) {

        console.log('is DNKiemTra', '${dnKiemTra}', "${dnGiamSat}")
        /*if($("textarea#applicantNote").val() === ""){
		var cf = showAlert("Thông báo","Bạn phải nhập thông báo gửi bổ sung!","Thoát");
		cf.open();
		return false;
	}*/

        // var validateDossierTemplate = fnCheckValidTemplate();

        // check valid Thời gian dự kiến kiểm tra *

        var validTp99 = $("#validPartTP99").val()
        if ("${dossier.dossierStatus}" === 'waiting_3' && validTp99 === '0') {
            notification.show({
                message: "Bạn vui lòng lưu lại mục thời gian dự kiến kiểm tra!"
            }, "error");

            return false;
        }

        var lsForm = $(".formAlpacaDN");
        if (lsForm && lsForm['length'] && "${dossier.dossierTemplateNo}" !== 'TT302011BGTVTCOP' && "${dossier.dossierTemplateNo}" !== 'TT192012TTBGTVTDGLD' && "${dnKiemTra}" == '' && "${dnGiamSat}" == '') {
            for (var i = 0; i < lsForm.length; i++) {
                var partNo = $(lsForm[i]).attr("data-pk");
                var partName = $(lsForm[i]).attr("data-partname");
                var dossierFileId = $(lsForm[i]).attr("dossierFileId");
                var checkTmp = fnCheckLockTemplate("${dossier.lockState}", partNo);
                console.log("checkTmp+++++++++lockState+++++partNo++++++++", "${dossier.lockState}", partNo, checkTmp);
                // checkTmp = true là thành phần có lock (ko tác động vào hs) nên ko kiểm tra valid form nữa
                if (checkTmp) {
                    continue;
                }
                console.log("dossierFileId+++++++++partNo+++++partName++++++++", dossierFileId, partNo, partName);
                var tv = fnCheckIsChangeForm(dossierFileId, partNo, partName);
                console.log('toàn vẹn++++++++', tv);
                if (!tv) {
                    console.log('dữ liệu ko toàn vẹn++++++++', tv);
                    return;
                }
            }
        }
        var mes = $(event.target).attr('data-pk');
        if (!mes) {
            mes = 'Bạn có muốn nộp hồ sơ?'
        } else {
            mes = 'Bạn có muốn ' + mes + '?'
        }
        var cf = fnConfirm("Thông báo",
            mes,
            "OK", "Thoát",
            function () {

                $("#btn-back-dossier").prop("disabled", "disabled");
                $.ajax({
                    url: "${api.server}/dossiers/${dossier.dossierId}",
                    dataType: "json",
                    type: "PUT",
                    headers: {
                        "groupId": "${groupId}"
                    },
                    async: false,
                    data: {
                        applicantNote: $("textarea#applicantNote").val()
                    },
                    success: function (result) {
                        $.ajax({
                            url: "${api.server}/dossiers/${dossier.dossierId}/submitting",
                            dataType: "json",
                            type: "GET",
                            async: false,
                            headers: {
                                "groupId": "${groupId}",
                                Accept: "application/json"
                            },
                            data: {
                                applicantNote: $("textarea#applicantNote").val()
                            },
                            success: function (result) {
                                $("#btn-submit-dossier").hide();
                                $("#btn-dnkiemtra-dossier-footer,#btn-dngiamsat-dossier-footer").hide();
                                $("#btn-back-dossier").prop("disabled", "");

                                notification.show({
                                    message: "Yêu cầu được thực hiện thành công!"
                                }, "success");

                                try {

                                    firstLoadDataSource = true;
                                    manageDossier.navigate("/" + statusRouteTem.status);
                                    $('html,body').scrollTop(0);
                                } catch (e) {

                                }
                                if ($("#lsDossierTemplPart").getKendoListView()) {
                                    $("#lsDossierTemplPart").getKendoListView().refresh();
                                }

                                printDetailDossier("${dossier.dossierId}");
                                window.sessionStorage.setItem("editInput", false);
                            },
                            error: function (result) {
                                $("#btn-back-dossier").prop("disabled", "");
                                notification.show({
                                    message: "Thực hiện không thành công, xin vui lòng thử lại!"
                                }, "error");
                            }
                        });
                    },
                    error: function (result) {

                    }

                });

            }, function () {

            });

        cf.open();

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
    $("#postalCityCode").data("kendoComboBox") ? $("#postalCityCode").data("kendoComboBox").enable(false) : null;
    $("#postalTelNo").prop('disabled', true);
    $("#postalReceiverName").prop('disabled', true);

    var fnBack = function () {
        window.history.back();
        window.sessionStorage.setItem("editInput", false);
    };


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
    // 						arrIsChangeForm[i].isSave = false;
    // 						arrIsChangeForm[i].partName = partName;
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
    // 						arrIsChangeForm[i].isSave = false;
    // 						arrIsChangeForm[i].partName = partName;
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

    $("#dossier-payment-online").click(function () {
        var dossierReferenceNo = $(this).attr("data-pk");
        if (dossierReferenceNo) {
            $.ajax({
                url: "/o/rest/v2/dossiers/get/payment/platform",
                dataType: "json",
                type: "GET",
                headers: {},
                async: false,
                contentType: "application/x-www-form-urlencoded",
                data: {
                    "dossierReferenceNo": dossierReferenceNo
                },
                success: function (result) { 
                    console.log('result____', result.UrlThanhToan);       
                    window.open(result.UrlThanhToan);
                },
                error: function (result) {

                }

            });
        }
    });


    $("#dossier-payment-confirm").click(function () {
        var referenceUid = $(this).attr("data-pk");
        if (referenceUid) {

            var data = new FormData();

            data.append('file', $("#filePayment")[0].files[0]);
            data.append('confirmNote', $("textarea#confirmNote").val());
            data.append('paymentMethod', "Chuyển khoản");
            data.append('confirmPayload', null);
            $.ajax({
                url: "${api.server}/dossiers/${dossier.dossierId}/payments/" + referenceUid + "/confirm",
                dataType: "json",
                type: "PUT",
                headers: {"groupId": "${groupId}"},
                processData: false,
                contentType: false,
                cache: false,
                data: data,
                success: function (result) {
                    notification.show({
                        message: "Yêu cầu được thực hiện thành công"
                    }, "success");
                    $("#dossier-payment-confirm").prop("disabled", true);
                },
                error: function (result) {
                    notification.show({
                        message: "Thực hiện không thành công, xin vui lòng thử lại"
                    }, "error");
                }

            });
        }
    });

    $("#filePayment").change(function (event) {
        event.preventDefault();
        try {
            var fileName = $("#filePayment")[0].files[0].name;
            if (fileName) {
                $("#fileNamePayment").html(fileName);
            } else {
                $("#fileNamePayment").html("");
            }

        } catch (e) {
            $("#fileNamePayment").html("");
        }

    });

    $("#dossier-payment-viewpdf").click(function () {
        var referenceUid = $(this).attr("data-pk");
        if (referenceUid) {
            $.ajax({
                url: "${api.server}/dossiers/${dossier.dossierId}/payments/" + referenceUid + "/invoicefile",
                dataType: "json",
                type: "GET",
                headers: {"groupId": "${groupId}"},
                responseType: 'blob',
                data: {},
                success: function (result) {
                    var urlblob = window.URL.createObjectURL(response);
                    window.open(urlblob, '_blank');
                },
                error: function (result) {

                }

            });
        }
    });

    function fileAttachmentUrl(options) {

        // Use XMLHttpRequest instead of Jquery $ajax
        var xhttp = new XMLHttpRequest();
        var a, filename;
        var data = {};

        xhttp.onreadystatechange = function () {

            if (xhttp.readyState === 4 && xhttp.status === 200) {

                // check for a filename
                var disposition = xhttp.getResponseHeader('Content-Disposition');
                if (disposition && disposition.indexOf('attachment') !== -1) {
                    var filenameRegex = /filename[^;=\n]*=((['"]).*?\2|[^;\n]*)/;
                    var matches = filenameRegex.exec(disposition);
                    if (matches != null && matches[1]) filename = matches[1].replace(/['"]/g, '');
                }

                // Trick for making downloadable link
                a = document.createElement('a');
                a.href = window.URL.createObjectURL(xhttp.response);

                var url = window.URL.createObjectURL(xhttp.response);

                //callback success
                options.success({url: url, status: xhttp.status});
            } else if (xhttp.readyState === 4 && xhttp.status !== 200) {
                options.error(xhttp.status);
            }

        };

        // Post data to URL which handles post request
        xhttp.open(options.method, options.url);
        xhttp.setRequestHeader("Content-Type", "application/json");

        // others data header
        if (options.hasOwnProperty("headers")) {
            Object.keys(options.headers).map(function (objectKey, index) {
                var value = options.headers[objectKey];
                xhttp.setRequestHeader(objectKey, value);
            });
        }

        // You should set responseType as blob for binary responses
        if (options.hasOwnProperty("responseType")) {
            xhttp.responseType = options.responseType;
        } else {
            xhttp.responseType = 'blob';
        }

        // Data to post
        if (options.hasOwnProperty("data")) {
            data = options.data;
        }

        // excecute request
        xhttp.send(data);

    };

    function openFileNewtab(url) {
        var urlOut = "";
        var urlReadFile = fileAttachmentUrl({
            method: "GET",
            url: url,
            async: false,
            success: function (options) {
                urlOut = options.url;
                window.open(urlOut, "_blank");
            },
            error: function () {
            }
        });
    }
</script>

<style type="text/css" media="screen">

    .table_history_style tr:nth-child(odd) td:first-child {
        background-color: #E9F7F8;
    }

    .table_history_style tr:nth-child(even) td:first-child {
        background-color: #D9E7E8;
    }
</style>
