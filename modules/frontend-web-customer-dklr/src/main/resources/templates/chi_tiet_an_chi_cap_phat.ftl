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
						<span class="text-bold" id="statusName" style="text-transform:uppercase;">Chi tiết ấn chỉ cấp phát</span> &nbsp;&nbsp;&nbsp;
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
                        <label for="vehicleclassDetail">Đối tượng</label>
                        <strong class="blue-text" id="vehicleclassDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="stampTypeDetail">Loại mẫu in</label>
                        <strong class="blue-text" id="stampTypeDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="stampShortNoDetail">Tên phôi</label>
                        <strong class="blue-text" id="stampShortNoDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="subTotalInDocumentDetail">SL ấn chỉ yêu cầu</label>
                        <strong class="blue-text" id="subTotalInDocumentDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="subTotalQuantitiesDetail">SL ấn chỉ thực xuất</label>
                        <strong class="blue-text" id="subTotalQuantitiesDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="unitPriceDetail">Đơn giá</label>
                        <strong class="blue-text" id="unitPriceDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="totalAmountDetail">Thành tiền</label>
                        <strong class="blue-text" id="totalAmountDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="totalInUseDetail">SL đã dùng</label>
                        <strong class="blue-text" id="totalInUseDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="totalNotUsedDetail">SL chưa dùng</label>
                        <strong class="blue-text" id="totalNotUsedDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="totalLostDetail">SL báo mất</label>
                        <strong class="blue-text" id="totalLostDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="totalCancelledDetail">SL báo hủy</label>
                        <strong class="blue-text" id="totalCancelledDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="totalReturnedDetail">SL báo trả lại</label>
                        <strong class="blue-text" id="totalReturnedDetail"></strong>
                    </div>
                    <div class="filter-group">
                        <label for="remarkDetail">Ghi chú</label>
                        <strong class="blue-text" id="remarkDetail"></strong>
                    </div>              	
				</div>
                <div style="width:100%;margin-left:15px;display:flex;justify-content: center">
                    <button type="button" onclick="quayLai()" class="btn btn-active">Quay lại</button>
                </div>
			</div>
            
		</div>
	</div>
</div>
<script>
	document.body.scrollTop = 0;
	document.documentElement.scrollTop = 0;
	var originUrl = window.location.href.substr(0, window.location.href.lastIndexOf('/group'))
	var	groupId = window.themeDisplay.getScopeGroupId()
    console.log('issueId:', window.issueId)
    function quayLai() {
        manageDossier.navigate("/danh-sach-an-chi-da-cap-phap")
    }
    function getDetail() {
        let Url = originUrl + '/o/rest/vr-app/outputsheetdetail/' + window.outputsheetdetailid
		$.ajax({
			url: Url,
			type: "GET",
			success: function (success) {
                $("#vehicleclassDetail").html(success.content.vehicleclass)
                $("#stampTypeDetail").html(success.content.stamptype)
                $("#stampShortNoDetail").html(success.content.stampshortno)
                $("#subTotalInDocumentDetail").html(success.content.subtotalindocument)
                $("#subTotalQuantitiesDetail").html(success.content.subtotalquantities)
                $("#unitPriceDetail").html(success.content.unitprice)
                $("#totalAmountDetail").html(success.content.totalamount)
                $("#totalInUseDetail").html(success.content.totalinuse)
                $("#totalNotUsedDetail").html(success.content.totalnotused)
                $("#totalLostDetail").html(success.content.totallost)
                $("#totalCancelledDetail").html(success.content.totalcancelled)
                $("#totalReturnedDetail").html(success.content.totalreturned)
                $("#remarkDetail").html(success.content.remark)

			},
		});
    }
    getDetail()
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
    .blue-text{
        color: blue;
    }
</style>
