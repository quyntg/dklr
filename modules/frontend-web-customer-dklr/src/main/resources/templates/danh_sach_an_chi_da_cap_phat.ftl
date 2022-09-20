<#if (Request)??>
<#include "init.ftl">
	
</#if>
<div id="contentMain" class="row panel M0" style="border: none;box-shadow: none">
	<div style="width: 100%;" id="manHinhDanhSach">
		<div class="panel-heading P0">
			<div class="row PL15 PR15">
				<div class="row-header align-middle-lg" style="justify-content: space-between;align-items: center;line-height: 32px;">
					<div>
						<div class="background-triangle-big">
							<i class="fa fa-file-text"></i>
						</div>
						<span class="text-bold" id="statusName" style="text-transform:uppercase;">Danh sách ấn chỉ đã nhận</span> &nbsp;&nbsp;&nbsp;
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
            <div class="" style="width:100%;margin-left: -15px;margin-right: -15px;padding-top: 5px;">
				<div class="" style="width:100%;padding-left:15px;">
                    <div class="filter-group">
                        <label for="vehicleclassFilter">Đối tượng</label>
						<select class="form-control" id="vehicleclassFilter" onchange="changeDoiTuong()">
							<option value="">Tất cả</option>
							<option value="XCG">Xe cơ giới</option>
							<option value="XMY">Xe mô tô, xe gắn máy</option>
							<option value="XMY2">Xe mô tô, xe gắn máy (điện)</option>
							<option value="XDD">Xe đạp điện</option>
							<option value="XCN">Xe chở người 4 bánh</option>
							<option value="XCH">Xe chở hàng 4 bánh</option>
						</select>
                    </div>
                    <div class="filter-group">
                        <label for="dossierNoFilter">Số hồ sơ</label>
                        <input class="form-control" id="dossierNoFilter" >
                    </div>
					
                    <div class="filter-group">
                        <label for="stampShortNoFilter">Tên số ấn chỉ</label>
                        <input type="text" class="form-control" id="stampShortNoFilter" >
                    </div>
                    <#-- <div class="filter-group">
                        <label for="serialNoFilter">Số ấn chỉ</label>
                        <input type="text" class="form-control" id="serialNoFilter" >
                    </div> -->
                    <div class="filter-group">
                        <label for="appliedyear">Năm</label>
                        <input type="text" class="form-control" id="outputsheetyear" >
                    </div>
                    <div class="filter-group">
                        <label for="applieddatefrom">Ngày cấp(từ)</label>
                        <input type="date" class="form-control" id="outputsheetdatefrom" >
                    </div>  
                    <div class="filter-group">
                        <label for="applieddateto">Ngày cấp(đến)</label>
                        <input type="date" class="form-control" id="outputsheetdateto" >
                    </div>
                    <#-- <div class="filter-group">
                        <label for="usedFilter">Tình trạng</label>
						<select class="form-control" id="usedFilter">
							<option value=""></option>
							<option value="true">Đã sử dụng hết</option>
							<option value="false">Chưa sử dụng hết</option>
						</select>
                    </div>  -->             	
				</div>
                <div style="width:100%;margin-left:15px;display:flex;justify-content: center">
                    <button type="button" onclick="search()" class="btn btn-active">Tìm kiếm</button>
                    <button type="button" onclick="xuatExcel()" class="btn btn-active">Xuất Excel</button>
                </div>
			</div>
		</div>
		
		<#--	-->
		<div id="wrapMain" class="table-responsive">
			<table class="table table-bordered M0">
				<#-- Table header -->
				<thead>
					<tr>
						<th class="text-center hover-pointer">
							<strong>STT</strong>
						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<strong>Đối tượng</strong>

						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<strong>Số hồ sơ</strong>

						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<strong>Ngày cấp</strong>

						</th>
						<th class="fieldDossier text-center hover-pointer" sort="serviceName" sort-type="desc">
							<strong>Tên sổ</strong>

						</th>
						<th class="fieldDossier text-center hover-pointer PL0 PR5" sort="dossierId" sort-type="desc">
							<strong>Số ấn chỉ </strong>
						</th>
						<th class="fieldDossier text-center hover-pointer" sort="submitDate" sort-type="desc">
							<strong>Năm cấp phát</strong>
						</th>
						<#-- <th class="text-center hover-pointer">
                            <strong>Trạng thái</strong>
						</th> -->
						<th class="text-center hover-pointer">
							<strong>Hành động</strong>
						</th>
					</tr>
				</thead>
				<#-- Table body -->
				<tbody class="" id="listViewDsAnChiDaCapPhat">

				</tbody>


				<script type="text/x-kendo-template" id="dsAnChiDaCapPhatproFileTemplate">

							<tr class="rowTable">

								<td class="text-center count" style="width: 1%; text-align: center;">
									#:count#
								</td>

								<td class="text-center" style="width: 15%">
									<span style="cursor: pointer;">
										<a href="javascript:;" class="link-detail-employee text-hover-blue">
											#=getTextVehicleClass(vehicleClass)#
										</a>
									</span>

								</td>

								<td class="text-center" style="width: 8%">
									<p>
										<span style="cursor: pointer;">#=dossierNo#</span>
									</p>

								</td>

								<td class="text-center" style="width: 14%"> 

									<p>
										<span style="cursor: pointer;">#=outputSheetDate#</span>
									</p>

								</td>

								<td class="text-center" style="width: 10%">
									<p style="cursor: pointer;">#=stampShortNo#
								</td>

								<td class="text-center">
									Từ #=serialStartNo# đến #=serialEndNo#</p>
								</td>

								<td class="text-center">
									<span style="cursor: pointer;" class="">#=outputSheetYear#</span>
								</td>


								<td class="text-center">
									<a href="javascript:;" style="color: blue;" onclick="xemChiTiet(#=id#)">Xem</a>
								</td>

							</tr>
						</script>
			</table>

		</div>
		<div class="row-header col-sm-12 PT20 PR0" style="background: #f6f6f6">
			<div class="clearfix align-middle" style="float: right">
				<span class="text-light-gray MR15"><i>Tổng số <span id="total" class="red"></span> kết quả được tìm thấy</i></span>
				<#-- <span class="show-per-page MT0">Hiển thị
					<span class="select-wrapper">
						<select class="ML5" id="listPage" onchange="changePageSize()" style="background-color: #ffffff">

						</select>
					</span>
				</span> -->
				<span id="pagerAnChiDaCapPhat" class="M0 P0" style="background: #ffffff"></span>
				<#-- <span id="btn-page" class="M0 P0" style="background: #ffffff"></span> -->
			</div>	
		</div>
	</div>
</div>
<script>
	console.log('manageDossier:',manageDossier)
	document.body.scrollTop = 0;
	document.documentElement.scrollTop = 0;
	document.getElementById("danhSachAnChiCapPhat").style.background= "linear-gradient(to right, #ffeaa0 0%,rgba(246,246,246,0) 100%)"
	document.getElementById("danhSachXeXuatXuong").style.background= "#fff0"
	document.getElementById("danhSachXeChoInPhieuXuatXuong").style.background= "#fff0"
	var originUrl = window.location.href.substr(0, window.location.href.lastIndexOf('/group'))
	var	groupId = window.themeDisplay.getScopeGroupId()
	var total = 0
	var pagesize = 10
	var page = 1
	var pageMax = Math.ceil(total/pagesize)
	function fullScreen(){
		$("#fullScreen").children().toggle();
		$("#panel_list").toggle();
		$("#mainType2").toggleClass("col-sm-10","col-sm-12");

	}
	function getTextVehicleClass(data) {
		if (!data) {
			return ''
		}
		if (data == 'XCG') {
			return 'XE CƠ GIỚI'
		} else if (data == 'XMY') {
			return 'XE MÔ TÔ, XE GẮN MÁY'
		} else if (data == 'XDD') {
			return 'XE ĐẠP ĐIỆN'
		} else if (data == 'XCN') {
			return 'XE CHỞ NGƯỜI 4 BÁNH'
		} else if (data == 'XCH') {
			return 'XE CHỞ HÀNG 4 BÁNH'
		} else {
			return ''
		}
	}
	// function getList(){
	// 	var applieddatefrom = document.getElementById("applieddatefrom").value
	// 	var tmp = applieddatefrom.split('-')
	// 	var applieddatefromFormat = ''
	// 	if(typeof day !== 'undefined'){
	// 		applieddatefromFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
	// 	}
	// 	var applieddateto = document.getElementById("applieddateto").value
	// 	var tmp2 = applieddateto.split('-')
	// 	var applieddatetoFormat = ''
	// 	if(typeof day2 !== 'undefined'){
	// 		applieddatetoFormat = tmp2[2] + '/' + tmp2[1] + '/' + tmp2[0]
	// 	}
	// 	var params = {
	// 		vehicleclass: document.getElementById("vehicleclassFilter").value,
	// 		dossierNo: document.getElementById("dossierNoFilter").value,
	// 		stampserialno: document.getElementById("serialNoFilter").value,
	// 		stampshortno: document.getElementById("stampShortNoFilter").value,
	// 		used: document.getElementById("usedFilter").value,
	// 		appliedyear: document.getElementById("appliedyear").value,
	// 		applieddatefrom: applieddatefromFormat,
	// 		applieddateto: applieddatetoFormat,
	// 		applicantCode: window.applicantCode
	// 	}
	// 	var Url = originUrl + '/o/rest/vr-app/outputsheetdetail/find/data'
	// 	// for (var key in params) {
	// 	// 	if (params[key] !== '') {
	// 	// 		Url += '&' + key + '=' + params[key]
	// 	// 	}
	// 	// }
	
	// 	$.ajax({
	// 		url: Url,
	// 		type: "GET",
	// 		data: params,
	// 		success: function (success) {
	// 			var html = '';
	// 			if (!success['data'] || !success['data']['length']) {
	// 				document.getElementById("danhSach").innerHTML = '<tr><td class="text-center PT5 PB5" colspan="">Không có dữ liệu</td></tr>'
	// 				return;
	// 			}
	// 			for(var i=0; i< success.data.length; i++){
	// 				html += '<tr class="rowTable">' + 
	// 						'<td class="text-center">'+ (page*pagesize-pagesize+i+1) +'</td>' +
	// 						'<td class="text-center">'+ success.data[i].vehicleClass + '</td>' +
	// 						'<td class="text-center">'+ success.data[i].stampIssueNo + '</td>' +
	// 						'<td class="text-center">'+ success.data[i].appliedDate + '</td>' +
	// 						'<td class="text-center">'+ success.data[i].stampShortNo + 'từ ' + success.data[i].serialStartNo + 'đến '+ success.data[i].serialEndNo +'</td>' +
	// 						'<td class="text-center">'+ success.data[i].stampSerialNo + '</td>' +
	// 						'<td class="text-center">'+ success.data[i].appliedDate + '</td>' +
	// 						'<td class="text-center">'+ success.data[i].stampStatus + '</td>' +
	// 						'<td class="text-center" style="color: #0b72ba; font-weight: bold;" onclick="xemChiTiet('+ success.data[i].id +')"><span>Xem</span></td>' +
	// 						'</tr>'
	// 			}
	// 			document.getElementById("danhSach").innerHTML = html
	// 			total = success.total
	// 			pageMax =  Math.ceil(total/pagesize)
	// 			$("#profileStatusAnChi li[dataPk='anChiDaCapPhat'] .bagde").html(total);
	// 			document.getElementById("total").innerHTML = total
	// 			document.querySelector("#listPage").innerHTML = ''
	// 			for(var i=10; i<=total; i+=10){
	// 				var option = document.createElement("option");
	// 				option.text = i;
	// 				option.value = i;
	// 				document.querySelector("#listPage").appendChild(option);
	// 			}
	// 			document.getElementById('listPage').value = pagesize
	// 			document.getElementById("btn-page").innerHTML = '<ul class="k-pager-numbers k-reset">' +
	// 					'<li onclick="lastPageLast()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;"><span class="k-icon k-i-arrow-w"></span></a></li>' + 
	// 					'<li onclick="lastPage()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;">...</a></li>' + 
	// 					'<li><span class="k-state-selected" style="height: 27px;">'+page+'</span></li>'
	// 					'<li onclick="nextPage()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;">...</a></li>' + 
	// 					'<li onclick="nextPageLast()"><a class="k-link" style="border-radius: 0px; border-color: rgb(221, 221, 221); height: 27px; margin-right: 0px;"><span class="k-icon k-i-arrow-e"></span></li>' + 
	// 				'</ul>'
	// 		},
	// 	});
	// }
	// function lastPageLast() {
	// 	if(page > 1){
	// 		page = 1
	// 		getList()
	// 	}
	// }
	// function lastPage() {
	// 	if(page > 1 ){
	// 		page -= 1
	// 		getList()
	// 	}
	// }
	// function nextPage() {
	// 	if(page !== pageMax){
	// 		page += 1
	// 		getList()
	// 	}
	// }
	// function nextPageLast() {
	// 	if(page < pageMax){
	// 		page = pageMax
	// 		getList()
	// 	}
		
	// }
	// function changePageSize() {
	// 	var x = document.getElementById("listPage").value;
	// 	pagesize =  x
	// 	getList()
	// }
	
	function getDictGroups(){
		$.ajax({
			url: originUrl + '/o/rest/v2/dictcollections/VR84/dictgroups',
			type: "GET",
			headers: {
				groupId: groupId,
				Accept: 'application/json'
			},
			success: function(success) {
				console.log('success',success)
				console.log('success',success.data)
				dictGroups = success.data
				var select = document.getElementById("vehicleclassFilter");
				dictGroups.forEach(function(item){
					var option = document.createElement("option");
					option.text = item.groupCode;
					option.value = item.dictGroupId;
					select.appendChild(option);
				})
			},
		})
	}
	function changeDoiTuong() {
		var value = document.getElementById("vehicleclassFilter").value;
		console.log(value)
	}
	
	function xuatExcel () {
		var outputsheetdatefrom = document.getElementById("outputsheetdatefrom").value
		var tmp = outputsheetdatefrom.split('-')
		var outputsheetdatefromFormat = ''
		if(typeof day !== 'undefined'){
			outputsheetdatefromFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
		}
		var outputsheetdateto = document.getElementById("outputsheetdateto").value
		var tmp2 = outputsheetdateto.split('-')

		var outputsheetdatetoFormat = ''
		if(typeof day2 !== 'undefined'){
			outputsheetdatetoFormat = tmp2[2] + '/' + tmp2[1] + '/' + tmp2[0]
		}
		var params = {
			vehicleClass: document.getElementById("vehicleclassFilter").value,
			dossierNo: document.getElementById("dossierNoFilter").value,
			// stampserialno: document.getElementById("serialNoFilter").value,
			stampShortNo: document.getElementById("stampShortNoFilter").value,
			outputSheetYear: document.getElementById("outputsheetyear").value || 0,
			outputSheetDateFrom: outputsheetdatefromFormat,
			outputSheetDateTo: outputsheetdatetoFormat,
			applicantIdNo: window.applicantCode
		}
		var Url = originUrl + '/o/rest/vr-app/issue/stampbook/export?'
		for (var key in params) {
			if (params[key] !== '') {
				Url += '&' + key + '=' + params[key]
			}
		}
		var data = {
			headercodes: '{auto},vehicleclass,stampissueno,applieddate,,{stampshortno} từ {serialstartno} đến {serialendno},applieddate,stampstatus',
			headerlabels: 'STT, Đối tượng, Số hồ sơ, Ngày nộp, Tên sổ, Số ân chỉ, Năm cấp phát, Trạng thái'
		}
		var dataPost = new URLSearchParams()
		for(key in data){
			dataPost.append(key, data[key])
		}
		axios.post(Url, dataPost, {
			header: {
				'Content-Type': 'application/x-www-form-urlencoded',
				'Accept': '*'
			},
			responseType: 'blob'
		}).then(function (req) {
			var url = window.URL.createObjectURL(req.data);
            var link = document.createElement('a');
            link.href = url;
            link.setAttribute('download', 'Danh sách ấn chỉ đã cấp phát.xls'); //or any other extension
			console.log('url:',url)
			console.log(link)
            document.body.appendChild(link);
            link.click();
		})
	}
	
	// getDictGroups()
	var table =  $('#danhSach')
	function xemChiTiet (outputsheetdetailid) {
		window.outputsheetdetailid= outputsheetdetailid
		manageDossier.navigate("/chi-tiet-an-chi-cap-phat")
	}

	var dataSourceDsAnChiDaCapPhatTemplate = new kendo.data.DataSource({
		transport: {
			read: function (options) {
				var outputsheetdatefrom = document.getElementById("outputsheetdatefrom").value
				var tmp = outputsheetdatefrom.split('-')
				var outputsheetdatefromFormat = ''
				if(typeof day !== 'undefined'){
					outputsheetdatefromFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
				}
				var outputsheetdateto = document.getElementById("outputsheetdateto").value
				var tmp2 = outputsheetdateto.split('-')

				var outputsheetdatetoFormat = ''
				if(typeof day2 !== 'undefined'){
					outputsheetdatetoFormat = tmp2[2] + '/' + tmp2[1] + '/' + tmp2[0]
				}
				var params = {
					vehicleClass: document.getElementById("vehicleclassFilter").value,
					dossierNo: document.getElementById("dossierNoFilter").value,
					// stampSerialno: document.getElementById("serialNoFilter").value,
					stampShortNo: document.getElementById("stampShortNoFilter").value,
					outputSheetYear: document.getElementById("outputsheetyear").value || 0,
					outputSheetDateFrom: outputsheetdatefromFormat,
					outputSheetDateTo: outputsheetdatetoFormat,
					applicantIdNo: window.applicantCode,
					start: options['data']['start'] || 0,
					end: options['data']['end'] || 20
				}
				var Url = originUrl + '/o/rest/vr-app/outputsheetdetail/find/data'

				console.log('options+++++++++', options['data'])
				$.ajax({
					url : Url,
					dataType : "json",
					type : "GET",
					headers : {"groupId": "${groupId}"},
					data : params,
					success : function (result) {
						if (!result['data']) {
							result = {
								data: [],
								total: 0
							}
						}
						result.data.forEach(function (item) {
							item['outputSheetYear'] = ''
							if (!item['dossierNo']) {
								item['dossierNo'] = ''
							}
							if (!item['outputSheetDate']) {
								item['outputSheetDate'] = ''
							}
							if (item['outputSheetDate']) {
								item['outputSheetYear'] = item['outputSheetDate'].substring(item['outputSheetDate']['length'] - 4, item['outputSheetDate']['length']);
							}
						});
						options.success(result);
						$("#total").html(result['total'] || 0);
					},
					error : function (result) {
						options.error(result);
						$("#total").html(0);
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
	$("#listViewDsAnChiDaCapPhat").kendoListView({
		dataSource: dataSourceDsAnChiDaCapPhatTemplate,
		autoBind: false,
		change: function () {

		},
		template: function (data) {
			count ++;
			data['count'] = count;
			return kendo.template($("#dsAnChiDaCapPhatproFileTemplate").html())(data);
		},
		dataBound: function () {
			count = 0;
		}
	});
	// dataSourceDsAnChiDaCapPhatTemplate.read();

	var pageTmp = 1;
	var pager = $("#pagerAnChiDaCapPhat").kendoPager({
		dataSource: dataSourceDsAnChiDaCapPhatTemplate,
		pageSizes: false,
		info: false,
		change: function (e) {
			var page = e['index'] || 1;
			pageTmp = page;
			var start = page * dataSourceDsAnChiDaCapPhatTemplate.pageSize() - dataSourceDsAnChiDaCapPhatTemplate.pageSize();
			var end = page * dataSourceDsAnChiDaCapPhatTemplate.pageSize();
			count = start;
			dataSourceDsAnChiDaCapPhatTemplate.read({
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

	function search() {
		dataSourceDsAnChiDaCapPhatTemplate.read();
	}

	function getApplicantsProfileID (applicantIdNo) {
		var Url = originUrl + '/o/rest/vr-app/applicant/profile/'+applicantIdNo
		$.ajax({
			url: Url,
			headers: {
				Accept: 'application/json'
			},
			type: "GET",
			success: function (success) {
				console.log('getApplicantsProfileID')
				window.applicantCode = success['applicantCode']
				dataSourceDsAnChiDaCapPhatTemplate.read();
			},
		});
	}

	function getApplicants () {
		var Url = originUrl + '/o/rest/v2/applicants/selfdetail'
		$.ajax({
			url: Url,
			headers: {
				Accept: 'application/json'
			},
			type: "GET",
			success: function (success) {
				console.log('getApplicants')
				if(success.applicantIdType === 'business'){
					getApplicantsProfileID(success.applicantIdNo)
				}
			},
		});
	}

	getApplicants()
	// $.ajax({
	// 	url: originUrl + '/o/rest/vr-app/vehicle/record/count',
	// 	type: "GET",
	// 	data: {
	// 		applicantCode: "${(registration.id)!}",
	// 		start: 0,
	// 		end: 1
	// 	},
	// 	success : function(result){
	// 		console.log('aaaaaa:', document.getElementById("countDSXeDaXuatXuong"))
	// 		document.getElementById("countDSXeDaXuatXuong").innerHTML = result['total'] || 0
	// 	},
	// })
	// $.ajax({
	// 	url: originUrl + '/o/rest/vr-app/issue/stampbook/count',
	// 	type: "GET",
	// 	success : function(result){
	// 		$("#countDSAnChiDaCapPhat").html(result['total'] || 0);
	// 	},
	// })
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
	.form-control{
		padding: 0px 10px!important;
	}
</style>
