<#if (Request)??>
	<#include "init.ftl">
</#if>
<#-- Routing trang Quanlyhoso -->
	<script type="text/javascript">
		var viewPanel = new kendo.View("panelTemplate", {model: modelPanel});
		var viewMainList = new kendo.View("mainTemplate", {model: modelMain});
		var viewMainList_2 = new kendo.View("mainTemplate_2", {model: modelMain});
		var mainTemplate_3 = new kendo.View("mainTemplate_3", {model: modelDanhSachXeXuatXuong});
		var statusRouteTem = {
			status : "",
			subStatus : ""
		};
		var firstLoadDataSource = true;
		// Show màn hình chi tiết hồ sơ
		manageDossier.route("/(:dossierItemStatus)/dossiers/(:id)", function(dossierItemStatus, id){
			$("#mainType2").html("");
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#noInput").hide();
			$("#mainType2").show();
			$(".filterField").hide();

			
			layout.showIn("#main_section", viewMainList);
			if (dossierItemStatus == "new") {
				$("#mainType2").load("${ajax.customer_dossier_detail_2}&${portletNamespace}dossierId="+id+"",function(result){
				})
				window.sessionStorage.setItem("editInput", false);
			} else if(dossierItemStatus == "paying"){
				$("#mainType2").load("${ajax.customer_dossier_waitpaying}&${portletNamespace}dossierId="+id+"",function(result){
				})
				window.sessionStorage.setItem("editInput", false);
			} else {
				$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"",function(result){
					if (dossierItemStatus === 'waiting_3') {
						$("#btn-submit-dossier").html('<i class="fa fa-paper-plane" ></i> Xác nhận kế hoạch')
					}
				});
			};
			getTotal();

			statusRouteTem.status = dossierItemStatus;
			$('#searchCC').removeClass('active');
			/*$("#profileStatus li").removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			$('#profileStatus li[dataPk='+dossierItemStatus+']').children("i").removeClass("fa fa-folder").addClass("fa fa-folder-open");
			$('#profileStatus li[dataPk='+dossierItemStatus+']').addClass('active');*/
		});

		manageDossier.route("/(:dossierItemStatus)/sub/(:idSub)/dossiers/(:id)", function(dossierItemStatus, idSub, id){
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#noInput").hide();
			$("#mainType2").show();
			$(".filterField").hide();
			layout.showIn("#main_section", viewMainList);
			if (dossierItemStatus == "new") {
				$("#mainType2").load("${ajax.customer_dossier_detail_2}&${portletNamespace}dossierId="+id+"",function(result){
				})
				window.sessionStorage.setItem("editInput", false);
			} else if(dossierItemStatus == "paying"){
				$("#mainType2").load("${ajax.customer_dossier_waitpaying}&${portletNamespace}dossierId="+id+"",function(result){
				})
				window.sessionStorage.setItem("editInput", false);
			} else {
				$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"",function(result){
				})
			};

			statusRouteTem.status = dossierItemStatus;
			statusRouteTem.subStatus = idSub;
			$('#searchCC').removeClass('active');
			$("#profileStatus li").removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			$('#profileStatus li[dataPk='+dossierItemStatus+'][dataPkSub='+idSub+']').children("i").removeClass("fa fa-folder").addClass("fa fa-folder-open");
			$('#profileStatus li[dataPk='+dossierItemStatus+'][dataPkSub='+idSub+']').addClass('active');
		});
		
		// Show
		manageDossier.route("/dossiers/(:id)/yeucauhuy", function(id){
			$("#mainType2").html("");
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"&${portletNamespace}resCancelling=true",function(result){
			});
			getTotal();
			window.sessionStorage.setItem("editInput", false);
		});

		
		manageDossier.route("/dossiers/(:id)/guibosung", function(id){
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"&${portletNamespace}sendAdd=true",function(result){
			});
			getTotal();
			window.sessionStorage.setItem("editInput", true);
		});

		manageDossier.route("/dossiers/(:id)/denghikiemtra", function(id){
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"&${portletNamespace}dnKiemTra=true",function(result){
			});
			getTotal();
			window.sessionStorage.setItem("editInput", true);
		});

		manageDossier.route("/dossiers/(:id)/denghigiamsat", function(id){
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"&${portletNamespace}dnGiamSat=true",function(result){
			});
			getTotal();
			window.sessionStorage.setItem("editInput", true);
		});

		manageDossier.route("/dossiers/(:id)/denghihuy/(:issueType)", function(id, issueType){
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"&${portletNamespace}dnHuy=true&${portletNamespace}issueType=" + issueType,function(result){
			});
			getTotal();
			window.sessionStorage.setItem("editInput", true);
		});

		manageDossier.route("/dossiers/(:id)/denghitrahuy", function(id){
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"&${portletNamespace}dnTraHuy=true",function(result){
			});
			getTotal();
			window.sessionStorage.setItem("editInput", true);
		});
		// 
		manageDossier.route("/dossiers/(:id)/yeucaucaplai", function(id){
			$("#mainType2").html("");
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.customer_dossier_detail_4}&${portletNamespace}dossierId="+id+"&${portletNamespace}sendReissue=true",function(result){
			});

			getTotal();
			window.sessionStorage.setItem("editInput", true);
		});

		// Show màn hình chọn dịch vụ công
		manageDossier.route("/taohosomoi", function(id){
			console.log('taohosomoi')
			$("#mainType2").html("");
			$("#mainType1").hide();
			$(".filterField").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.serviceconfigDKLR}",function(result){
			});
			$("#profileStatus li").removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			window.sessionStorage.setItem("editInput", false);
		});
		
		// Show danh sách hồ sơ lọc theo các trạng thái
		manageDossier.route("/(:id)", function(id) {
			$(".fa-expand").css("display","block");
			$(".fa-compress").css("display","none");
			$("#mainType1").show();
			$("#noInput").hide();
			$(".filterField").show();
			$("#mainType2").hide();
			window.sessionStorage.setItem("editInput", false);
			window.sessionStorage.setItem("isXNHL", "");
			if (firstLoadDataSource === true) {
				if (id == "all") {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service":$("#serviceInfo").val(),
						"govAgencyCode":$("#govAgency").val(),
						"status": "new,receiving,processing,waiting,paying,done,cancelling,cancelled,expired",
						"start": 0,
						"end": 10
					});
				} else if(id == "HSDHXNHL"){
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"dossierStatus": "new",
						"applicantIdNo": "${(registration.applicantCode)!}",
						"stateFilter": "EXPIRED",
						"id": "HSDHXNHL",
						"start": 0,
						"end": 10
					});
					window.sessionStorage.setItem("isXNHL", "true");
				} else if(id == "DNXNHL"){
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"dossierStatus": "processing",
						"id": "DNXNHL",
						"start": 0,
						"end": 10
					});
					window.sessionStorage.setItem("isXNHL", "true");
				} else if(id == "XNHL"){
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"dossierStatus": "DONE_4",
						"id": "XNHL",
						"start": 0,
						"end": 10
					});
					window.sessionStorage.setItem("isXNHL", "true");
				} else if(id == "TBDSX"){
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"dossierStatus": "---",
						"id": "TBDSX",
						"start": 0,
						"end": 10
					});
				} else if (id == "cancelling") {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service":$("#serviceInfo").val(),
						"govAgencyCode":$("#govAgency").val(),
						"state":"cancelling",
						"start": 0,
						"end": 10
					});
				}else if(id == "correcting"){
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"state": "correcting",
						"statusReg" : 3,
						"start": 0,
						"end": 10

					});
				} else if (id == "endorsement") {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"state" : "endorsement",
						"statusReg" : 3,
						"start": 0,
						"end": 10
					});
				}else if (id == "done") {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"status" : "done",
						"notStatusReg" : 3,
						"start": 0,
						"end": 10
					});
				}else {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service" : $("#serviceInfo").val(),
						"govAgencyCode" : $("#govAgency").val(),
						"status" : id,
						"start": 0,
						"end": 10
					});
				};
			}

			if(firstLoadDataSource === true){
				getTotal();
			}
			if (id == "HSDHXNHL") {
				$(".displayCheckBox").css("display", "inline-block");
				$(".displayCheckBoxTable").css("display", "none");
			} else {
				$(".displayCheckBox").css("display", "none");
				$(".displayCheckBoxTable").css("display", "none");
			}

			layout.showIn("#main_section", viewMainList);
			

			
			statusRouteTem.status = id;
			$("#profileStatus li").removeClass('active');
			$('#searchCC').removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			$('#profileStatus li[dataPk='+id+']').children("i").removeClass("fa fa-folder").addClass("fa fa-folder-open");
			$('#profileStatus li[dataPk='+id+']').addClass('active');
			modelMain.set("visibleHeader", $('#profileStatus li[dataPk='+id+'] .dossierStatus').text());
			modelMain.set("isInvestigated", false);

		}); 

		manageDossier.route("/(:id)/sub/(:idSub)", function(id,idSub) {
			$(".fa-expand").css("display","block");
			$(".fa-compress").css("display","none");
			$("#mainType1").show();
			$("#noInput").hide();
			$(".filterField").show();
			$("#mainType2").hide();
			window.sessionStorage.setItem("editInput", false);
			layout.showIn("#main_section", viewMainList);

			if(idSub === 0){
				idSub = "";
			}

			if(firstLoadDataSource === true){
				if (id == "all") {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service":$("#serviceInfo").val(),
						"govAgencyCode":$("#govAgency").val(),
						"status": "new,receiving,processing,waiting,paying,done,cancelling,cancelled,expired",
						"start": 0,
						"end": 10
					});
				} else if (id == "cancelling") {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service":$("#serviceInfo").val(),
						"govAgencyCode":$("#govAgency").val(),
						"state":"cancelling",
						"start": 0,
						"end": 10
					});
				}else {
					dataSourceProfile.read({
						"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
						"service":$("#serviceInfo").val(),
						"govAgencyCode":$("#govAgency").val(),
						"status":id,
						"substatus" : idSub,
						"start": 0,
						"end": 10
					});
				};
			}
			

			
			statusRouteTem.status = id;
			statusRouteTem.subStatus = idSub;
			$("#profileStatus li").removeClass('active');
			$('#searchCC').removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			$('#profileStatus li[dataPk='+id+'][dataPkSub='+idSub+']').children("i").removeClass("fa fa-folder").addClass("fa fa-folder-open");
			$('#profileStatus li[dataPk='+id+'][dataPkSub='+idSub+']').addClass('active');
			modelMain.set("visibleHeader", $('#profileStatus li[dataPk='+id+'][dataPkSub='+idSub+'] .dossierStatus').text());
			modelMain.set("isInvestigated", false);

		});

		// Show màn hình chọn dịch vụ công
		manageDossier.route("/taohosomoi/admin", function(){
			$("#mainType2").html("");
			$("#mainType1").hide();
			$(".filterField").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.serviceconfig}",function(result){
				$('#btn_fillter_by_admintration').addClass('btn-active');
				$('#btn_fillter_by_domain').removeClass('btn-active');
				$('#serviceconfig_container').load("${ajax.serviceconfig_administration}");
				$('#input_search').val('');
			});
			$('#searchCC').removeClass('active');
			$("#profileStatus li").removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			window.sessionStorage.setItem("editInput", false);
		});

		manageDossier.route("/taohosomoi/doman", function(){
			$("#mainType1").hide();
			$(".filterField").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.serviceconfig}",function(result){
				$('#btn_fillter_by_admintration').removeClass('btn-active');
				$('#btn_fillter_by_domain').addClass('btn-active');
				$('#serviceconfig_container').load("${ajax.serviceconfig_domain}");
				$('#input_search').val('');
			});
			$("#profileStatus li").removeClass('active');
			$('#searchCC').removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			window.sessionStorage.setItem("editInput", false);
		});

		manageDossier.route("/keyPay/(:id)/(:refUid)", function(id,refUid,params){
			$("#panel_list").show();
			$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
			$("#mainType1").hide();
			$("#mainType2").show();
			$(".filterField").hide();
			$("#mainType2").load("${ajax.notificationPaying}&${portletNamespace}dossierUUid="+id+"&${portletNamespace}paymentFileUUid="+refUid+"&${portletNamespace}trans_id="+params.trans_id+"&${portletNamespace}good_code="+params.good_code,function(result){
			});
			window.sessionStorage.setItem("editInput", false);
			
		});

		// View file trong Thành phần hồ sơ
		manageDossier.route("/(:dossierId)/files/(:dossierTemplateNo)/(:partNo)", function(dossierId,dossierTemplateNo,partNo){
			$(".mWrapper").load("${ajax.customer_dossier_component_profiles}&${portletNamespace}dossierPartNo="+partNo+"&${portletNamespace}dossierId="+dossierId+"&${portletNamespace}dossierTemplateNo="+dossierTemplateNo,function(result){
				
			});
		});

	// Show màn hình tra cứu
		manageDossier.route("/tra-cuu/tra-cuu-ho-so", function() {
			/*$(".fa-expand").css("display","block");
			$(".fa-compress").css("display","none");
			$("#mainType1").show();
			$(".filterField").hide();
			$("#noInput").show();
			$("#mainType2").hide();
			resetValueFilter();
			layout.showIn("#main_section", viewMainList_2);
			$("#profileStatus li").removeClass('active');
			$('#searchCC').addClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");*/

			$(".fa-expand").css("display","block");
			$(".fa-compress").css("display","none");
			$("#mainType1").show();
			$("#noInput").hide();
			$(".filterField").show();
			$("#mainType2").hide();
			layout.showIn("#main_section", viewMainList);

			if(firstLoadDataSource === true){
				dataSourceProfile.read({
					"dossierNo" : $("#dossier-emp-nav-selectbox-by-dossierNo").val(),
					"service" : $("#serviceInfo").val(),
					"govAgencyCode" : $("#govAgency").val(),
					"status": "new,receiving,processing,waiting,paying,done,cancelling,cancelled,expired",
					"start": 0,
					"end": 10
				});
			}

			statusRouteTem.status = "all";


			$("#profileStatus li").removeClass('active');
			$('#searchCC').removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			/*$('#profileStatus li[dataPk='+id+']').children("i").removeClass("fa fa-folder").addClass("fa fa-folder-open");
			$('#profileStatus li[dataPk='+id+']').addClass('active');*/
			/*modelMain.set("visibleHeader", $('#profileStatus li[dataPk='+id+'] .dossierStatus').text());*/
			modelMain.set("isInvestigated", false);
			window.sessionStorage.setItem("editInput", false);
		});
		manageDossier.route("/danh-sach-xe-xuat-xuong", function() {
			console.log('danh-sach-xe-xuat-xuong')
			$("#mainType2").html("");
			$("#mainType1").hide();
			$(".filterField").hide();
			$("#mainType2").show();
			$("#mainType2").load("${ajax.danh_sach_xe_xuat_xuong}",function(result){
			});
			$("#profileStatus li").removeClass('active');
			$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
			window.sessionStorage.setItem("editInput", false);
		})
	</script>

