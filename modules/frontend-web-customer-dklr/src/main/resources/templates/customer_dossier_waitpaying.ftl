<#if (Request)??>
<#include "init.ftl">
</#if>
<div id="detailDossier">
	<div class="box">

		<input type="hidden" name="dossierStatus" id="dossierStatus">
		
		<input type="hidden" name="dossierTemplateNo" id="dossierTemplateNo">
		<div class="row-header align-middle">
			<div class="background-triangle-big">Tên thủ tục</div> 
			<span class="text-bold" data-bind="text:serviceName"></span>
			<div class="pull-right group-icons">
				<a href="javascript:;" onclick="fnBack();" >
					<i class="fa fa-reply" aria-hidden="true"></i>
					Quay lại
				</a>
			</div>
		</div>

		<div class="dossier-general-info P15 MB40">
			<div class="col-sm-4">
				<div class="row MB5">
					<span class="text-bold">Tình trạng</span>: <i data-bind="text:dossierStatusText" class="red"></i>
				</div>
				<#-- <div class="row" id="">
					<a href="javascript:;" class="text-blue text-underline">
						Thông tin chủ hồ sơ
					</a>
				</div> -->
			</div>
			<div class="col-sm-4">

				<div class="row" id="">
					<span>Số hồ sơ (Mã tiếp nhận)</span>: <span data-bind="text:dossierNo" class="text-bold"></span>
					
				</div>
				<div class="row">
					<span>Mã hồ sơ</span>: <span data-bind="text : dossierIdCTN" class="text-bold"></span>
				</div>
				<div class="row" id="mahsMCDT">
					<span>Mã hồ sơ MCĐT</span>: <span data-bind="text : dossierReferenceNo" class="text-bold"></span>
				</div>
			</div>
			
			<div class="col-sm-4 text-center">
				<div class="row MB5" id="">
					<span>Thời gian gửi</span>: <span data-bind="text:submitDate" class="text-bold"></span>
				</div>
				
			</div>
			
		</div>

		<div class="guide-section PB0">
			<div class="head-part slide-toggle">
				<div class="background-triangle-small">
					<i class="fa fa-star"></i>

				</div> 
				<span class="text-uppercase hover-pointer">Hướng dẫn</span> 
				<i class="fa fa-angle-down pull-right hover-pointer MR15" aria-hidden="true" style="font-size: 150%;"></i>
			</div>

			<div class="content-part collapse PB15" id="collapseDossierG">
				<span data-bind="html:stepInstruction"></span>
				<#-- <p class="MB0 text-light-blue PB15"><a href="javascript:;" id="guide-toggle">Xem thêm >></a></p> -->
			</div>

		</div>
		<#-- Bổ sung thông tin chủ hồ sơ -->
		<div class="row">
			<div class="col-sm-12">
				<div class="dossier-parts" >
					<div class="head-part align-middle slide-toggle">
						<div class="background-triangle-small">
							I
						</div>
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
									<span data-bind="text:districtName" ></span>
									
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

		<div class="dossier-parts" id="paymentDossier">
			<div class="head-part align-middle MB5 slide-toggle">
				<div class="background-triangle-small">II</div> 
				<div class="col-sm-12 PL0">

					<span class="text-uppercase hover-pointer">Thanh toán</span>
					<i class="fa fa-angle-down pull-right hover-pointer" aria-hidden="true" style="font-size: 150%;"></i>
				</div>

			</div>
			<div class="content-part collapse in" id="collapseDossierPayment">
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
										<button class="btn btn-sm btn-border-color MR10 text-light-blue" id="dossier-payment-online" data-bind="attr : {data-pk : dossierReferenceNo}" style="font-weight: bold; text-shadow: 0 0 black;">Thanh toán qua cổng DVCQG</button> 
										<button class="btn btn-sm btn-border-color MR10 text-light-blue" data-bind="attr : {data-pk : referenceUid}" id="dossier-payment-confirm">Thông báo đã nộp chuyển khoản</button>
										<button class="btn btn-sm btn-border-color text-light-blue" id="dossier-payment-viewpdf" data-bind="attr : {data-pk : referenceUid}">Phiếu thông báo phí, lệ phí</button>
									</div>
								</div>

								<div class="row MB20 MT20" data-bind="value: isPay">
									<div class="col-sm-12 text-center">
										<div class="row">
											<div class="col-sm-4">

											</div>
											<div class="col-sm-4 text-center MB10">
												<i class="fa fa-file-image-o text-center text-light-gray MB10" aria-hidden="true" style="font-size:100px;">
													
												</i> 
												<br>
												<span id="fileNamePayment" name="fileNamePayment"></span>
												<br>
												<span class="text-center" style="font-size: 10px;">Chứng từ thanh toán cho chuyển khoản là giấy yêu cầu nộp tiền vào ngân hàng hoặc hóa đơn chứng nhận giao dịch chuyển khoản được in ra</span>
											</div>
											<div class="col-sm-4">
		
											</div>
										</div>
										<input type="file" id="filePayment" name="filePayment" class="hidden" >
										<label class="btn btn-sm MB0 ML10 hover-pointer" for="filePayment" title="Tải file lên" >
											<span class="text-normal">Chọn ảnh từ máy</span>
										</label>
									</div>
								</div>

								<div class="row">
									<div class="col-sm-11">
										<div class="form-group"> 
											<label class="control-label">Ghi chú kèm theo</label> 
											<textarea class="form-control" rows="2" id="confirmNote" name="confirmNote" data-bind="text:confirmNote">

											</textarea> 
										</div>
									</div> 
									<div class="col-sm-1 MT30">
										<button class="btn">Gửi</button>
									</div>
								</div>
							</div>

							<#-- 
							<div id="alreadyPaid" data-bind="value: isPay">
								<div class="row MB5">
									<div class="col-sm-2">								
										<span class="text-bold">Ghi chú kèm theo</span>	
									</div>
									<div class="col-sm-10" data-bind="text: paymentConfirmNote"></div>
								</div>

								<div class="row MB5">
									<div class="col-sm-2">								
										<span class="text-bold">Chứng từ kèm theo</span>	
									</div>
									<div class="col-sm-10" data-bind="text: paymentBankInfo"></div>
								</div>
							</div>
						-->
					</div>
				</div>
			</div>
		</div>
	</div> 

	<div class="dossier-parts" style="">
		<div class="head-part align-middle slide-toggle">
			<div class="background-triangle-small">III</div> 
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
<div class="button-row MT20">
	<button class="btn btn-active" type="button" onclick="fnBack();"><i class="fa fa-reply" aria-hidden="true"></i> Quay lại</button>
</div>
</div>

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

	var fnLoadPayment = function(dossierId){

		console.log(dossierId);
		var resultModel = null;
		if(dossierId){
			$.ajax({
				url : "${api.server}/dossiers/"+dossierId+"/payments",
				dataType : "json",
				type : "GET",
				headers : {"groupId": "${groupId}"},
				async : false,
				data : {
				},
				success : function(result){
					if(result.data){
						resultModel = result.data[0];
					}
				},
				error :  function(result){
					$("#paymentDossier").hide();
				}

			});
		}

		return resultModel;
	}
	
	var fnBack = function(){
		window.history.back();
	};

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

	var printDetailDossier = function(dossierId){
		if(dossierId){
			$.ajax({
				url : "${api.server}/dossiers/"+dossierId,
				dataType : "json",
				type : "GET",
				headers : {"groupId": "${groupId}"},
				success : function(result){
					console.log("load detail dossier!");
					console.log(result.dossierId);

					var payment = fnLoadPayment(result.dossierId);
					
					$('#danhSachCacLanQuyetToan_Toogle').show();
                    console.log('dossierNo-------', result['dossierNo'] )
                    dataSourceDanhSachCacLanQuyetToanTemplate.read({
                        dossierNo: result['dossierNo'] 
                    })

					var viewModel = kendo.observable({

						dossierId : result.dossierId,
						serviceName : result.serviceName,
						govAgencyName : result.govAgencyName,
						dossierNo : result.dossierNo,
						dossierStatusText : result.dossierStatusText,
						stepInstruction : result.stepInstruction,
						dossierStatus : result.dossierStatus,
						paymentDossier : payment,
						submitDate : result.submitDate,
						dossierIdCTN : result.dossierIdCTN,
						dossierReferenceNo: result.dossierReferenceNo,
						contactName: result.contactName,
						cityName:result.cityName,
						districtName:result.districtName,
						wardName:result.wardName,
						address: result.address,
						contactTelNo: result.contactTelNo,
						contactEmail: result.contactEmail,
						paymentFee : function(e){
							console.log(this.get('paymentDossier'));
							if(this.get('paymentDossier') && this.get('paymentDossier')['paymentFee']){
								return this.get('paymentDossier')['paymentFee'];
							}
							return "";
						},
						referenceUid : function(e){
							console.log(this.get('paymentDossier'));
							if(this.get('paymentDossier') && this.get('paymentDossier')['referenceUid']){
								return this.get('paymentDossier')['referenceUid'];
							}
							return "";
						},
						paymentAmount : function(e){
							if(this.get('paymentDossier') && this.get('paymentDossier')['paymentAmount']){
								var value = this.get('paymentDossier')['paymentAmount'];
					      var moneyCur = (value/1).toFixed(0).replace('.', ',');
					      return moneyCur.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
							}
							return "";
						},
						paymentGovAgencyName : function(e){
							if(this.get('paymentDossier') && this.get('paymentDossier')['govAgencyName']){
								return this.get('paymentDossier')['govAgencyName'];
							}
							return "";
						},
						paymentBankInfo : function(e){
							if(this.get('paymentDossier') && this.get('paymentDossier')['bankInfo']){
								return this.get('paymentDossier')['bankInfo'];
							}
							return "";
						},
						paymentStatus : function(e){
							if(this.get('paymentDossier')){
								if(this.get('paymentDossier').paymentStatus === 0){
									$("#dossier-payment-confirm").prop("disabled",false);
									return "Chờ nộp";
								}else if(this.get('paymentDossier').paymentStatus === 1){
									$("#dossier-payment-confirm").prop("disabled",true);
									return "Báo đã nộp";
								}else if(this.get('paymentDossier').paymentStatus === 2){
									$("#dossier-payment-confirm").prop("disabled",false);
									return "Hoàn thành";
								}else {
									$("#dossier-payment-confirm").prop("disabled",false);
									return "Không hợp lệ";
								}
							}
							return "";
						},
						paymentApproveDatetime : function(e){
							if(this.get('paymentDossier') && this.get('paymentDossier')['approveDatetime']){
								return this.get('paymentDossier')['approveDatetime'];
							}
							return "---";
						},
						paymentConfirmNote : function(e){
							if(this.get('paymentDossier') && this.get('paymentDossier')['confirmNote']){
								return this.get('paymentDossier')['confirmNote'];
							}
							return "";
						},
						isPay : function(){
							if(this.get('paymentDossier') && this.get('paymentDossier')['paymentStatus'] !== 2){
								$("#unpaid").show();
								$("#alreadyPaid").hide();
							}
						},
						confirmDatetime : function(){
							if(this.get('paymentDossier') && this.get('paymentDossier')['confirmDatetime'] ){
								return this.get('paymentDossier')['confirmDatetime'];
							}
						},
						submitting : function(){
							if(result.submitting){
								$("#btn-submit-dossier").hide();
							}
						}

						/*dossierTemplateNo : function(e){
							dataSourceDossierTemplate.read({
								dossierPart : 201 //result.dossierTemplateNo
							});	
						}*/

					});

					kendo.bind($("#detailDossier"), viewModel);
					if (result['dossierReferenceNo']) {
						$("#mahsMCDT").show();
					} else {
						$("#mahsMCDT").hide();
					}
				},
				error : function(result){
					$("#paymentDossierContent").html("");
				}

			});
		}
	}

	printDetailDossier("${dossierId}");


	$("#dossier-payment-online").click(function(){
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

	
	$("#dossier-payment-confirm").click(function(){
		var referenceUid = $(this).attr("data-pk");
		if(referenceUid){

			var data = new FormData();

			data.append( 'file', $("#filePayment")[0].files[0]);
			data.append( 'confirmNote', $("textarea#confirmNote").val());
			data.append( 'paymentMethod', "Chuyển khoản");
			data.append( 'confirmPayload', null);
			$.ajax({
				url : "${api.server}/dossiers/${dossierId}/payments/"+referenceUid+"/confirm",
				dataType : "json",
				type : "PUT",
				headers : {"groupId": "${groupId}"},
				processData: false,
				contentType: false,
				cache: false,
				data : data,
				success : function(result){
					notification.show({
						message: "Yêu cầu được thực hiện thành công"
					}, "success");
					$("#dossier-payment-confirm").prop("disabled",true);
				},
				error :  function(result){
					notification.show({
						message: "Thực hiện không thành công, xin vui lòng thử lại"
					}, "error");
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

    // function openFileNewtab(url) {
    //     var urlOut = "";
    //     var urlReadFile = fileAttachmentUrl({
    //         method: "GET",
    //         url: url,
    //         async: false,
    //         success: function (options) {
    //             urlOut = options.url;
    //             window.open(urlOut, "_blank");
    //         },
    //         error: function () {
    //         }
    //     });
    // }

	$("#dossier-payment-viewpdf").click(function(){
		var referenceUid = $(this).attr("data-pk");
		if(referenceUid){
			var urlOut = "";
			var urlReadFile = fileAttachmentUrl({
				method: "GET",
				url: "${api.server}/dossiers/${dossierId}/payments/" + referenceUid + "/invoicefile",
				async: false,
				success: function (options) {
					urlOut = options.url;
					window.open(urlOut, "_blank");
				},
				error: function () {
				}
			});
			// $.ajax({
			// 	url : "${api.server}/dossiers/${dossierId}/payments/"+referenceUid+"/invoicefile",
			// 	dataType : "json",
			// 	type : "GET",
			// 	headers : {"groupId": "${groupId}"},
			// 	responseType: 'blob',
			// 	data : {

			// 	},
			// 	success : function(result){
			// 		var urlblob = window.URL.createObjectURL(response);
			// 		window.open(urlblob, '_blank');
			// 	},
			// 	error :  function(result){
					
			// 	}

			// });
		}
	});

	$("#filePayment").change(function(event){
		event.preventDefault();
		try{
			var fileName = $("#filePayment")[0].files[0].name;
			if(fileName){
				$("#fileNamePayment").html(fileName);
			}else {
				$("#fileNamePayment").html("");
			}


		}catch(e){
			$("#fileNamePayment").html("");
		}

	});
</script>