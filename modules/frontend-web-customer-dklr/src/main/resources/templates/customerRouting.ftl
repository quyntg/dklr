<#if (Request)??>
<#include "init.ftl">
</#if>
<#-- Routing SPA-->

<script type="text/javascript">

	var checkIsSaveDossier = function(dossierId){
		var isSave = true;
		$.ajax({
			url : "${api.server}/dossiers/"+dossierId,
			dataType : "json",
			type : "GET",
			headers : {"groupId": ${groupId}},
			async : false,
			success : function(result){
				
			},
			error : function(result){

			}
		});
	}

	var layout = new kendo.Layout("layoutTemplate");
	var manageDossier = new kendo.Router({
		init: function() {
			layout.render("#appManagerDossier");
			layout.showIn("#panel_list", viewPanel);
			layout.showIn("#main_section", viewMainList);
		}
	});
	// Show màn hình start
	manageDossier.route("/", function() {
		$("#panel_list").show();
		$(".fa-expand").css("display","block");
		$(".fa-compress").css("display","none");
		$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
		$("#mainType1").show();
		$(".filterField").show();
		$("#mainType2").hide();
		$("#noInput").hide();
		resetValueFilter();
		layout.showIn("#main_section", viewMainList);

		getTotal();
		
		dataSourceProfile.read({
			"status": "new,receiving,processing,waiting,paying,done,cancelling,cancelled,expired",
			"start": 0,
			"end": 10
		});
		

		// $(".itemStatus").css("pointer-events","auto");
		$('#searchCC').removeClass('active');
		$("#profileStatus li").removeClass('active');
		$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
		$('#profileStatus li[dataPk= "all"]').children("i").removeClass("fa fa-folder").addClass("fa fa-folder-open");
		modelMain.set("visibleHeader", $('#profileStatus li[dataPk= "all"] .dossierStatus').text());
		modelMain.set("isInvestigated", false);
		
		// $('#profileStatus li[dataPk= "all"]').css("pointer-events","none");
		$('#profileStatus li[dataPk= "all"]').addClass('active');

		var statusDossier = $("li.itemStatus.active").attr("dataPk");
		console.log("statusDossier==========displayCheckBox", statusDossier)
		if (statusDossier == "HSDHXNHL") {
			$(".displayCheckBox").css("display", "inline-block");
			$(".displayCheckBoxTable").css("display", "none");
		} else {
			$(".displayCheckBox").css("display", "none");
			$(".displayCheckBoxTable").css("display", "none");
		}
	});
	// Show màn hình thông báo chi tiết
	manageDossier.route("/thongbao", function(){
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#noInput").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.notification}",function(result){
        	// dataSourceNotify2.read();
        });
		$('#searchCC').removeClass('active');
		$("#profileStatus li").removeClass('active');
		$("#profileStatus li>i").removeClass("fa fa-folder-open").addClass("fa fa-folder");
        // $(".itemStatus").css("pointer-events","auto");
    });
	manageDossier.route("/taohosomoi/chuanbihoso/(:dossierId)", function(dossierId){
		$("#panel_list").show();
		$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
		$("#mainType1").hide();
		$("#noInput").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.customer_dossier_detail}&${portletNamespace}dossierId="+dossierId,function(result){

		});
	});
	manageDossier.route("/taohosomoi/nophoso/(:dossierId)", function(dossierId){
		$("#panel_list").show();
		$("#mainType1").removeClass("col-sm-12").addClass("col-sm-10");
		$("#mainType1").hide();
		$("#noInput").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.customer_dossier_detail_2}&${portletNamespace}dossierId="+dossierId,function(result){

		});
	});
	manageDossier.route("/danh-sach-xe-xuat-xuong", function() {
		console.log('danh-sach-xe-xuat-xuong')
		$("#mainType2").html("");
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.danh_sach_xe_xuat_xuong}",function(result){
		});
		
	})
	manageDossier.route("/an-chi-dang-kiem/(:methodOfIssue)", function(methodOfIssue) {
		$("#mainType2").html("");
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.danh_sach_an_chi_dang_kiem}&${portletNamespace}methodOfIssue=" + methodOfIssue,function(result){
		});
		
	})
	
	manageDossier.route("/danh-sach-an-chi-da-cap-phap", function() {
		console.log('danh-sach-an-chi-da-cap-phap')
		$("#mainType2").html("");
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.danh_sach_an_chi_da_cap_phat}",function(result){
		});
		
	})
	manageDossier.route("/danh-sach-xe-cho-in-phieu-xuat-xuong", function() {
		console.log('danh-sach-xe-xuat-xuong')
		$("#mainType2").html("");
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.danh_sach_xe_cho_in_phieu_xuat_xuong}",function(result){
		});
		
	})
	manageDossier.route("/danh-sach-xe-cho-in-phieu-xuat-xuong/(:dossierId)", function(dossierId) {
		console.log('danh-sach-xe-xuat-xuong')
		$("#mainType2").html("");
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.danh_sach_xe_cho_in_phieu_xuat_xuong_chi_tiet}&${portletNamespace}dossierId="+dossierId, function(result){
		});
		
	})
	manageDossier.route("/chi-tiet-xe-xuat-xuong", function() {
		console.log('chi-tiet-xe-xuat-xuong')
		$("#mainType2").html("");
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.chi_tiet_xe_xuat_xuong}",function(result){
		});
		
	})
	manageDossier.route("/chi-tiet-an-chi-cap-phat", function() {
		console.log('chi-tiet-an-chi-cap-phat')
		$("#mainType2").html("");
		$("#mainType1").hide();
		$(".filterField").hide();
		$("#mainType2").show();
		$("#mainType2").load("${ajax.chi_tiet_an_chi_cap_phat}",function(result){
		});
		
	})
</script>
<#-- Include Router Component -->
<#include "manageDossierRouter.ftl">

<#--  -->
<script type="text/javascript">
	$(function(){
    	// Run Routing
    	var flagSort = true;
    	manageDossier.start();
    	// 
    	var sortItem;
    	var sortType;
    	var sortFieldDossier = function(selected){
    		sortItem = $(selected).attr("sort");
    		sortType = $(selected).attr("sort-type");
			// 
			if (sortType == "desc") {
				dataSourceProfile.sort({ field: sortItem, dir: "desc" });
				$(selected).attr("sort-type","asc")
			} else {
				dataSourceProfile.sort({ field: sortItem, dir: "asc" });
				$(selected).attr("sort-type","desc")
			}
		};
		$(".fieldDossier").click(function(){
			sortFieldDossier(this);
	  		// $(this).children(".icon-sort").children().toggle();
	  		$("#pagerProfile .k-link").css({"border-radius":"0","border-color":"#ddd","height":"27px","margin-right":"0px"});	
	  	});
	});
</script>