<#if (Request)??>
<#include "init.ftl">
	
</#if>

<div id="contentMain" class="row panel M0" style="border: none;box-shadow: none">
	<div style="width: 100%;" id="manHinhChiTiet">
		<div class="panel-heading P0">
			<div class="row PL15 PR15">
				<div class="row-header align-middle-lg" style="justify-content: space-between;align-items: center;line-height: 32px;">
					<div>
						<div class="background-triangle-big">
							<i class="fa fa-file-text"></i>
						</div>
						<span class="text-bold" id="statusName" style="text-transform:uppercase;">Thông số kỹ thuật</span> &nbsp;&nbsp;&nbsp;
						<#if registration?has_content>
							
						<#else>
							<span class="text-bold red" style="text-transform:uppercase;"></span>
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
 
            
		</div>
        <div style="width:100%;margin-left:15px;display:flex;justify-content: center">
             <button type="button" onclick="quayLai()" class="btn btn-active">Quay lại</button>
        </div>
		<div id="wrapMain" class="table-responsive">
			<table class="table table-bordered M0">
				<#-- Table header -->
				<thead>
					<tr>
						<th class="text-center hover-pointer">
							<strong>STT</strong>
						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<strong>Mã TSKT</strong>

						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<strong>Tên TSKT</strong>

						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<strong>Giá trị TSKT</strong>

						</th>
						<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
							<strong>Số thứ tự hiển thị</strong>
						</th>
						<th class="fieldDossier text-center hover-pointer" sort="submitDate" sort-type="desc">
							<strong>Đơn vị</strong>
						</th>
						<th class="text-center hover-pointer">
                            <strong>TT quy chuẩn</strong>
						</th>
						<th class="text-center hover-pointer">
							<strong>Nhóm TSKT</strong>
						</th>
					</tr>
				</thead>
				<#-- Table body -->
				<tbody class="" id="danhSach">

				</tbody>
			</table>

		</div>
		<div class="row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
			<div class="clearfix align-middle" style="float: right">
				<span class="text-light-gray MR15"><i>Tổng số <span id="total" class="red"></span> kết quả được tìm thấy</i></span>
				<span class="show-per-page MT0">Hiển thị
					<span class="select-wrapper">
						<select class="ML5" id="listPage" onchange="changePageSize()" style="background-color: #ffffff">

						</select>
					</span>
				</span>
				<span id="btn-page" class="M0 P0" style="background: #ffffff"></span>
			</div>	
		</div>	
	</div>
</div>
<script>
	document.body.scrollTop = 0;
	document.documentElement.scrollTop = 0;
	var originUrl = window.location.href.substr(0, window.location.href.lastIndexOf('/group'))
	var	groupId = window.themeDisplay.getScopeGroupId()
    var total = 0
	var pagesize = 10
	var page = 1
	var pageMax = Math.ceil(total/pagesize)
	var dictGroups = []
    console.log('certificateid:', window.certificateid)
    function quayLai() {
        manageDossier.navigate("/danh-sach-xe-xuat-xuong")
    }
    function getVehicleSpecification() {
        let Url = originUrl + '/o/rest/vr-app/vehicle/specification/search?vehiclecertificateid=' + window.certificateid
		$.ajax({
			url: Url,
			type: "GET",
			success: function (success) {
				let html = '';
				console.log('33333')
				for(let i=0; i< success.data.length; i++){
					html += '<tr class="rowTable">'
						+	'<td class="text-center">'+ (page*pagesize-pagesize+i+1) +'</td>'
							+	'<td class="text-center">'+ success.data[i].specificationcode + '</td>'
							+	'<td class="text-center">'+ success.data[i].specificationname + '</td>'
							+	'<td class="text-center">'+ success.data[i].specificationvalue + '</td>'
							+	'<td class="text-center">'+ success.data[i].sequenceno + '</td>'
							+	'<td class="text-center">'+ success.data[i].specificationbasicunit + '</td>'
							+	'<td class="text-center">'+ success.data[i].specificationstandard + '</td>'
                            +	'<td class="text-center">'+ success.data[i].specificationgroup + '</td>'
						+	'</tr>'
				}
				document.getElementById("danhSach").innerHTML = html
				total = success.total
				pageMax =  Math.ceil(total/pagesize)
				document.getElementById("total").innerHTML = total
				document.querySelector("#listPage").innerHTML = ''
				for(let i=10; i<=total; i+=10){
					let option = document.createElement("option");
					option.text = i;
					option.value = i;
					document.querySelector("#listPage").appendChild(option);
				}
				document.getElementById('listPage').value = pagesize
				document.getElementById("btn-page").innerHTML = `
					<ul class="k-pager-numbers k-reset">
						<li onclick="lastPageLast()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;"><span class="k-icon k-i-arrow-w"></span></a></li>
						<li onclick="lastPage()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;">...</a></li>
						<li><span class="k-state-selected" style="height: 27px;">`+page+`</span></li>
						<li onclick="nextPage()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;">...</a></li>
						<li onclick="nextPageLast()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;"><span class="k-icon k-i-arrow-e"></span></li>
					</ul>
				`
			},
		});
    }
	function fullScreen(){
		$("#fullScreen").children().toggle();
		$("#panel_list").toggle();
		$("#mainType2").toggleClass("col-sm-10","col-sm-12");

	}
    getVehicleSpecification()
</script>

<style>
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
	.span-thaotac{
		color: #0b72ba; 
		font-weight: bold;
		cursor: pointer;
		margin: 0 5px;
	}
</style>
