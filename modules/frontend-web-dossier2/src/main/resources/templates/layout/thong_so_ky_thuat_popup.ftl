<div>
	<!-- TODO detailTemplate page -->
	<div v-if="detailPage" style="width: 100%; background: #fff;">

		<div class="row-header">
			<div class="background-triangle-big"> KẾT QUẢ </div>
			<div class="layout row wrap header_tools row-blue">

				<div class="flex xs7 sm9 solo pl-4 text-ellipsis">

					THÔNG SỐ KỸ THUẬT {{tenModuleTSKT}}

				</div>
				<div class="flex xs5 sm3 text-right" style="margin-left: auto;">

					<v-btn flat class=" my-0 py-0 btn-border-left" color="grey darken-1" v-on:click.native.prevent.stop="undoDetailPageTSKT()">
						<v-icon class="mr-2">undo</v-icon>
						Quay lại
					</v-btn>
					<v-btn v-if="navigationFilterview" v-on:click.native.prevent.stop="navigationFilterview = !navigationFilterview" flat icon class="mr-3 my-0 hidden-sm-and-down"><v-icon>fullscreen</v-icon></v-btn>

					<v-btn v-if="!navigationFilterview" v-on:click.native.prevent.stop="navigationFilterview = !navigationFilterview" flat icon class="mr-3 my-0 hidden-sm-and-down"><v-icon>fullscreen_exit</v-icon></v-btn>

				</div>

			</div>

		</div>

		<v-expansion-panel expand class="my-0 opencps-dossier-info">
			<v-layout row wrap class="ml-0 pl-0" style="padding-right: 15px;">
				<v-flex xs12 sm3>
					<span>Số chứng chỉ</span>: <label>{{thongTinChungTSKT['certificateRecordNo']}}</label>
				</v-flex>
				<v-flex xs12 sm3>
					<span>Ngày ký</span>: <label>{{parseTimeStampToDate(thongTinChungTSKT['certificateRecordDate'])}}</label>
				</v-flex>
				<v-flex xs12 sm6>

				</v-flex>

				<v-flex xs12 sm3>
					<span>Đăng kiểm viên chính</span>: <label>{{thongTinChungTSKT['inspectorName'] || thongTinChungTSKT['inspectorSignName']}}</label>
				</v-flex>
				<v-flex xs12 sm3>
					<span>Số biên bản kiểm tra</span>: <label>{{thongTinChungTSKT['inspectionRecordNo'] || thongTinChungTSKT['verificationRefNo']}}</label>
				</v-flex>
				<v-flex xs12 sm6>

				</v-flex>

				<v-flex xs12 sm3>
					<span>Ngày kiểm tra</span>: <label>{{thongTinChungTSKT['inspectionRecordNo'] ? parseTimeStampToDate(thongTinChungTSKT['inspectionDate']) : parseTimeStampToDate(thongTinChungTSKT['verificationRefDate'])}}</label>
				</v-flex>
				<v-flex xs12 sm3>
					<span>Loại hồ sơ</span>: <label>{{thongTinChungTSKT['dossierTypeDescription']}}</label>
				</v-flex>
				<v-flex xs12 sm6>

				</v-flex>

				<v-flex xs12 sm12 v-if="thongTinChungTSKT['serviceCode'] == 'TT302011BGTVTTDTKXCG' && thongTinChungTSKT['designModelDescription']">
				  Loại hình thiết kế: <label>{{thongTinChungTSKT['designModelDescription']}}</label>
				</v-flex>

				<#-- thẩm định -->
				<template v-if="thongTinChungTSKT['serviceCode'] == 'TT302011BGTVTTDTKXCG'">
					<v-layout row wrap class="ml-0 pl-0" style="padding-right: 15px;">
						
						<v-flex xs12 sm12>
							<label>1. THÔNG TIN CHUNG</label>
						</v-flex>
						<v-flex xs12 sm12>
							<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
								<thead>
									<tr>
										<th class="text-xs-center">TT</th>
										<th class="text-xs-center">Nội dung</th>
										<th class="text-xs-center">Kết quả kiểm tra</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<label>1.</label>
										</td>
										<td colspan="2">
											<label>Cơ sở thiết kế</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1. </td>
										<td class="text-xs-left">Tên</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2. </td>
										<td class="text-xs-left">Địa chỉ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantAddress']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.3. </td>
										<td class="text-xs-left">Người đại diện</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantRepresentative']}} <br>
											{{thongTinChungTSKT['applicantRepresentativeTitle']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.4. </td>
										<td class="text-xs-left">Số điện thoại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantPhone']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.5. </td>
										<td class="text-xs-left">Thư điện tử (Email)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantEmail']}}</td>
									</tr>

									<tr>
										<td>
											<label>2.</label>
										</td>
										<td colspan="2">
											<label>Cơ sở sản xuất lắp ráp, nhập khẩu</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.1. </td>
										<td class="text-xs-left">Tên</td>
										<td class="text-xs-center">{{thongTinChungTSKT['manufacturerName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.2. </td>
										<td class="text-xs-left">Địa chỉ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['manufacturerAddress']}}</td>
									</tr>

									<tr>
										<td>
											<label>3.</label>
										</td>
										<td colspan="2">
											<label>Thông tin tham chiếu</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.1. </td>
										<td class="text-xs-left">Số tham chiếu của xe cơ sở (dùng cho loại hình sản xuất lắp ráp từ xe cơ sở)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['baseCertificateRecordNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.2. </td>
										<td class="text-xs-left">Số giấy chứng nhận tham chiếu (dùng cho cấp lại, mở rộng) (nếu có)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['referenceCertificateNo']}}</td>
									</tr>

									<tr>
										<td>
											<label>4.</label>
										</td>
										<td colspan="2">
											<label>Thông tin Quy chuẩn áp dụng</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1. </td>
										<td class="text-xs-left">Quy chuẩn an toàn chung</td>
										<td class="text-xs-center">{{thongTinChungTSKT['commonSafetyDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2. </td>
										<td class="text-xs-left">Quy chuẩn khí thải</td>
										<td class="text-xs-center">{{thongTinChungTSKT['emissionDescription']}}</td>
									</tr>

									<tr>
										<td>
											<label>5.</label>
										</td>
										<td colspan="2">
											<label>Thông tin chung về kiểu loại xe</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.1. </td>
										<td class="text-xs-left">Ký hiệu thiết kế</td>
										<td class="text-xs-center">{{thongTinChungTSKT['designSymbol']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.2. </td>
										<td class="text-xs-left">Loại phương tiện</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3. </td>
										<td class="text-xs-left">Nhãn hiệu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedTrademarkName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.4. </td>
										<td class="text-xs-left">Tên thương mại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedCommercialName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.5. </td>
										<td class="text-xs-left">Mã kiểu loại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedModelCode']}}</td>
									</tr>

								</tbody>
							</table>

						</v-flex>
					</v-layout>
				</template>

				<#-- toàn xe và xác nhận hiệu lực của toàn xe (10) -->
				<template v-else-if="listServiceToanXe.includes(thongTinChungTSKT['serviceCode'])">
					<v-layout row wrap class="ml-0 pl-0" style="padding-right: 15px;">

						<v-flex xs12 sm12>
							<label>1. THÔNG TIN CHUNG</label>
						</v-flex>
						<v-flex xs12 sm12>
							<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
								<thead>
									<tr>
										<th class="text-xs-center">TT</th>
										<th class="text-xs-center">Nội dung</th>
										<th class="text-xs-center">Kết quả kiểm tra</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<label>1.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về cơ sở sản xuất</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1. </td>
										<td class="text-xs-left">Cơ sở sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.1 </td>
										<td class="text-xs-left">Địa chỉ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantAddress']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2 </td>
										<td class="text-xs-left">Người đại diện</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantRepresentative']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2.1 </td>
										<td class="text-xs-left">Chức danh</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantRepresentativeTitle']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2.2 </td>
										<td class="text-xs-left">Số điện thoại</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantPhone']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2.3 </td>
										<td class="text-xs-left">Thư điện tử</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantEmail']}}
										</td>
									</tr>


									<tr>
										<td class="text-xs-left">1.2 </td>
										<td class="text-xs-left">Nhà máy sản xuất</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['productionPlantName']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.1</td>
										<td class="text-xs-left">Địa chỉ nhà máy sản xuất</td>
										<td class="text-xs-center">{{thongTinChungTSKT['productionPlantAddress']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2</td>
										<td class="text-xs-left">Người đại diện</td>
										<td class="text-xs-center">{{thongTinChungTSKT['productionPlantRepresentative']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2.1 </td>
										<td class="text-xs-left">Chức danh</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['productionPlantRepresentativeTitle']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2.2 </td>
										<td class="text-xs-left">Số điện thoại</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactPhone']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2.3 </td>
										<td class="text-xs-left">Thư điện tử</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactEmail']}}
										</td>
									</tr>

									<tr>
										<td class="text-xs-left">1.3 </td>
										<td class="text-xs-left">Người liên hệ</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactName']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.3.1 </td>
										<td class="text-xs-left">Số điện thoại</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactTelNo']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.3.2 </td>
										<td class="text-xs-left">Thư điện tử</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactEmail']}}
										</td>
									</tr>



									<tr>
										<td>
											<label>2.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về kết quả đánh giá COP</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.1. </td>
										<td class="text-xs-left">Số báo cáo đánh giá COP</td>
										<td class="text-xs-center">{{thongTinChungTSKT['copReportNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.2. </td>
										<td class="text-xs-left">Ngày báo cáo </td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['copReportDate'])}}</td>
									</tr>


									<tr>
										<td class="text-xs-left">3. </td>
										<td class="text-xs-left" colspan="2">Thông tin về loại hồ sơ và giấy chứng nhận xe</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.1. </td>
										<td class="text-xs-left"> Loại hồ sơ xin cấp GCN</td>
										<td class="text-xs-center">{{thongTinChungTSKT['dossierTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.2. </td>
										<td class="text-xs-left">Số GCN của loại xe gốc</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certificateRecordNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.2.1. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['certificateRecordDate'])}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.3. </td>
										<td class="text-xs-left">Số GCN tham chiếu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['referenceCertificateNo']}}</td>
									</tr>

									<tr>
										<td>
											<label>4.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về chứng chỉ thẩm định thiết kế</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1. </td>
										<td class="text-xs-left">Số chứng chỉ thẩm định thiết kế</td>
										<td class="text-xs-center">{{thongTinChungTSKT['verificationCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['verificationCertificateDate'])}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.3. </td>
										<td class="text-xs-left">Ký hiệu thiết kế</td>
										<td class="text-xs-center">{{thongTinChungTSKT['designSymbol']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.4. </td>
										<td class="text-xs-left">Số giấy chứng nhận phê duyệt kiểu loại tại nước ngoài</td>
										<td class="text-xs-center">{{thongTinChungTSKT['typeApprovalCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.4. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['typeApprovalCertificateDate'])}}</td>
									</tr>





									<tr>
										<td>
											<label>4.</label>
										</td>
										<td colspan="2">
											<label>Thông tin tiêu chuẩn, quy chuẩn áp dụng, Báo cáo kết quả thử nghiệm </label>
										</td>
									</tr>
									<tr>
										<td colspan="3">
											<label>4.1 Thông tin tiêu chuẩn, quy chuẩn áp dụng</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1.1. </td>
										<td class="text-xs-left">Tiêu chuẩn an toàn chung</td>
										<td class="text-xs-center">{{thongTinChungTSKT['commonSafetyDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1.2. </td>
										<td class="text-xs-left">Tiêu chuẩn khí thải</td>
										<td class="text-xs-center">{{thongTinChungTSKT['emissionDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2. </td>
										<td class="text-xs-left">Báo cáo kết quả kiểm tra, thử nghiệm an toàn kỹ thuật và bảo vệ môi trường</td>
									</tr>

									<tr>
										<td class="text-xs-left">4.2.1. </td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm an toàn 1/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['safetyTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['safetyTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm an toàn 2/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['secondSafetyTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['secondSafetyTestReportDate'])}}</span>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm an toàn 3/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['thirdSafetyTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['thirdSafetyTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td class="text-xs-left">4.2.2. </td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm môi trường 1/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['emissionTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['emissionTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm môi trường 2/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['secondEmissionTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['secondEmissionTestReportDate'])}}</span>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm môi trường 3/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['thirdEmissionTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['thirdEmissionTestReportDate'])}}</span>
										</td>
									</tr>



									<tr>
										<td class="text-xs-left">4.2.3. </td>
										<td class="text-xs-left">Báo cáo kết quả thử nghiệm liên quan khác </td>
										<td class="text-xs-center"></td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2.4. </td>
										<td class="text-xs-left">Biên bản kiểm tra xác nhận/ ngày      /</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['otherTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['otherTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td>
											<label>5.</label>
										</td>
										<td colspan="2">
											<label>Thông tin xe mẫu</label>
										</td>
									</tr>
									<tr>
										<td>
											<label>5.1</label>
										</td>
										<td colspan="2">
											<label>Xe mẫu thử nghiệm an toàn 1</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.1.1 </td>
										<td class="text-xs-left">Số khung (số VIN)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleVINNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.1.2</td>
										<td class="text-xs-left">Số động cơ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleEngineNo']}}</td>
									</tr>
									<tr>
										<td>
											<label>5.2</label>
										</td>
										<td colspan="2">
											<label>Xe mẫu thử nghiệm an toàn 2</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.2.1 </td>
										<td class="text-xs-left">Số khung (số VIN)</td>
										<td class="text-xs-center"><#-- {{thongTinChungTSKT['sampleVINNo']}} --></td>
									</tr>
									<tr>
										<td class="text-xs-left">5.2.2</td>
										<td class="text-xs-left">Số động cơ</td>
										<td class="text-xs-center"><#-- {{thongTinChungTSKT['sampleEngineNo']}} --></td>
									</tr>
									<tr>
										<td>
											<label>5.3</label>
										</td>
										<td colspan="2">
											<label>Xe mẫu thử nghiệm khí thải 1</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.1 </td>
										<td class="text-xs-left">Số khung (số VIN)</td>
										<td class="text-xs-center"><#-- {{thongTinChungTSKT['sampleVINNo']}} --></td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.2</td>
										<td class="text-xs-left">Số động cơ</td>
										<td class="text-xs-center"><#-- {{thongTinChungTSKT['sampleEngineNo']}} --></td>
									</tr>
									<tr>
										<td>
											<label>5.4</label>
										</td>
										<td colspan="2">
											<label>Xe mẫu thử nghiệm khí thải 2</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.4.1 </td>
										<td class="text-xs-left">Số khung (số VIN)</td>
										<td class="text-xs-center"><#-- {{thongTinChungTSKT['sampleVINNo']}} --></td>
									</tr>
									<tr>
										<td class="text-xs-left">5.4.2</td>
										<td class="text-xs-left">Số động cơ</td>
										<td class="text-xs-center"><#-- {{thongTinChungTSKT['sampleEngineNo']}} --></td>
									</tr>



									<tr>
										<td>
											<label>6.</label>
										</td>
										<td colspan="2">
											<label>Thông tin chung về kiểu loại xe</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.1. </td>
										<td class="text-xs-left">Loại phương tiện</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.2. </td>
										<td class="text-xs-left">Nhãn hiệu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedTrademarkName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.3. </td>
										<td class="text-xs-left">Tên thương mại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedCommercialName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.4. </td>
										<td class="text-xs-left">Mã kiểu loại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedModelCode']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.5. </td>
										<td class="text-xs-left">Loại hình sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedAssemblyTypeDescription']}}</td>
									</tr>

									<tr>
										<td class="text-xs-left">6.6. </td>
										<td class="text-xs-left">Mã số VIN</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedVINNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.6.1 </td>
										<td class="text-xs-left">Mô tả vị trí đóng</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedVINPosition']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.7. </td>
										<td class="text-xs-left">Mã số khung</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedFrameNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.7.1. </td>
										<td class="text-xs-left">Nơi đóng số khung</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedFrameAttachPlace']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.8. </td>
										<td class="text-xs-left">Mã số động cơ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedEngineNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">6.8.1. </td>
										<td class="text-xs-left">Nơi đóng số động cơ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedEngineAttachPlace']}}</td>
									</tr>
									
								</tbody>
							</table>

						</v-flex>
					</v-layout>
				</template>

				<#-- linh kiện và xn hiệu lực (4) -->
				<template v-else-if="listServiceLinhKien.includes(thongTinChungTSKT['serviceCode'])">
					<v-layout row wrap class="ml-0 pl-0" style="padding-right: 15px;">

						<v-flex xs12 sm12>
							<label>1. THÔNG TIN CHUNG</label>
						</v-flex>
						<v-flex xs12 sm12>
							<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
								<thead>
									<tr>
										<th class="text-xs-center">TT</th>
										<th class="text-xs-center">Nội dung</th>
										<th class="text-xs-center">Kết quả kiểm tra</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<label>1.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về cơ sở sản xuất</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1. </td>
										<td class="text-xs-left">Cơ sở sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.1 </td>
										<td class="text-xs-left">Địa chỉ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantAddress']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2 </td>
										<td class="text-xs-left">Người đại diện</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantRepresentative']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2.1 </td>
										<td class="text-xs-left">Chức danh</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantRepresentativeTitle']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2.2 </td>
										<td class="text-xs-left">Số điện thoại</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantPhone']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1.2.3 </td>
										<td class="text-xs-left">Thư điện tử</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantEmail']}}
										</td>
									</tr>


									<tr>
										<td class="text-xs-left">1.2 </td>
										<td class="text-xs-left">Nhà máy sản xuất</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['productionPlantName']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.1</td>
										<td class="text-xs-left">Địa chỉ nhà máy sản xuất</td>
										<td class="text-xs-center">{{thongTinChungTSKT['productionPlantAddress']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2</td>
										<td class="text-xs-left">Người đại diện</td>
										<td class="text-xs-center">{{thongTinChungTSKT['productionPlantRepresentative']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2.1 </td>
										<td class="text-xs-left">Chức danh</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['productionPlantRepresentativeTitle']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2.2 </td>
										<td class="text-xs-left">Số điện thoại</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactPhone']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2.2.3 </td>
										<td class="text-xs-left">Thư điện tử</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactEmail']}}
										</td>
									</tr>

									<tr>
										<td class="text-xs-left">1.3 </td>
										<td class="text-xs-left">Người liên hệ</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactName']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.3.1 </td>
										<td class="text-xs-left">Số điện thoại</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactTelNo']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.3.2 </td>
										<td class="text-xs-left">Thư điện tử</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['applicantContactEmail']}}
										</td>
									</tr>



									<tr>
										<td>
											<label>2.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về kết quả đánh giá COP</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.1. </td>
										<td class="text-xs-left">Số báo cáo đánh giá COP</td>
										<td class="text-xs-center">{{thongTinChungTSKT['copReportNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.2. </td>
										<td class="text-xs-left">Ngày báo cáo </td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['copReportDate'])}}</td>
									</tr>


									<tr>
										<td class="text-xs-left">3. </td>
										<td class="text-xs-left" colspan="2">Thông tin về loại hồ sơ và giấy chứng nhận xe</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.1. </td>
										<td class="text-xs-left"> Loại hồ sơ xin cấp GCN</td>
										<td class="text-xs-center">{{thongTinChungTSKT['dossierTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.2. </td>
										<td class="text-xs-left">Số GCN của loại xe gốc</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certificateRecordNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.2.1. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['certificateRecordDate'])}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.3. </td>
										<td class="text-xs-left">Số GCN tham chiếu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['referenceCertificateNo']}}</td>
									</tr>

									<tr>
										<td>
											<label>4. </label>
										</td>
										<td colspan="2">
											<label>Thông tin tiêu chuẩn, quy chuẩn áp dụng, Báo cáo kết quả thử nghiệm </label>
										</td>
									</tr>
									<tr>
										<td colspan="3">
											<label>4.1 Thông tin tiêu chuẩn, quy chuẩn áp dụng</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1.1. </td>
										<td class="text-xs-left">Tiêu chuẩn an toàn chung</td>
										<td class="text-xs-center">{{thongTinChungTSKT['commonSafetyDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1.2. </td>
										<td class="text-xs-left">Tiêu chuẩn khí thải</td>
										<td class="text-xs-center">{{thongTinChungTSKT['emissionDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2. </td>
										<td class="text-xs-left">Báo cáo kết quả kiểm tra, thử nghiệm an toàn kỹ thuật và bảo vệ môi trường</td>
									</tr>

									<tr>
										<td class="text-xs-left">4.2.1. </td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm an toàn 1/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['safetyTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['safetyTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm an toàn 2/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['secondSafetyTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['secondSafetyTestReportDate'])}}</span>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm an toàn 3/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['thirdSafetyTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['thirdSafetyTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td class="text-xs-left">4.2.2. </td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm môi trường 1/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['emissionTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['emissionTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm môi trường 2/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['secondEmissionTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['secondEmissionTestReportDate'])}}</span>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left"></td>
										<td class="text-xs-left"> 
											Báo cáo kết quả thử nghiệm môi trường 3/ Ngày cấp
										</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['thirdEmissionTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['thirdEmissionTestReportDate'])}}</span>
										</td>
									</tr>



									<tr>
										<td class="text-xs-left">4.2.3. </td>
										<td class="text-xs-left">Báo cáo kết quả thử nghiệm liên quan khác </td>
										<td class="text-xs-center"></td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2.4. </td>
										<td class="text-xs-left">Biên bản kiểm tra xác nhận/ ngày      /</td>
										<td class="text-xs-center">
											<span>{{thongTinChungTSKT['otherTestReportNo']}}</span> <br>
											<span>{{parseTimeStampToDate(thongTinChungTSKT['otherTestReportDate'])}}</span>
										</td>
									</tr>

									<tr>
										<td>
											<label>5.</label>
										</td>
										<td colspan="2">
											<label>Thông tin chung về kiểu loại sản phẩm</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.1. </td>
										<td class="text-xs-left">Loại sản phẩm</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.2. </td>
										<td class="text-xs-left">Nhãn hiệu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedTrademarkName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3. </td>
										<td class="text-xs-left">Tên thương mại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedCommercialName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.4. </td>
										<td class="text-xs-left">Mã kiểu loại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedModelCode']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.5. </td>
										<td class="text-xs-left">Loại hình sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedAssemblyTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.5. </td>
										<td class="text-xs-left">Ký hiệu thiết kế/ ký hiệu sản phẩm</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['designSymbol']}}
										</td>
									</tr>
									
								</tbody>
							</table>

						</v-flex>
					</v-layout>
				</template>

				<#-- kiểm tra sp mẫu (2)xe cơ giới và xe 4 bánh -->
				<template v-else-if="listServiceSPM.includes(thongTinChungTSKT['serviceCode'])">
					<v-layout row wrap class="ml-0 pl-0" style="padding-right: 15px;">

						<v-flex xs12 sm12>
							<label>1. THÔNG TIN CHUNG</label>
						</v-flex>
						<v-flex xs12 sm12>
							<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
								<thead>
									<tr>
										<th class="text-xs-center">TT</th>
										<th class="text-xs-center">Nội dung</th>
										<th class="text-xs-center">Kết quả kiểm tra</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<label>1.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về cơ sở sản xuất</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1. </td>
										<td class="text-xs-left">Cơ sở sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2. </td>
										<td class="text-xs-left">Địa chỉ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantAddress']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.3. </td>
										<td class="text-xs-left">Nhà máy sản xuất</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['productionPlantName']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.4. </td>
										<td class="text-xs-left">Địa chỉ nhà máy sản xuất</td>
										<td class="text-xs-center">{{thongTinChungTSKT['productionPlantAddress']}}</td>
									</tr>

									<tr>
										<td>
											<label>2.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về chứng chỉ thẩm định thiết kế</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.1. </td>
										<td class="text-xs-left">Số chứng chỉ thẩm định thiết kế</td>
										<td class="text-xs-center">{{thongTinChungTSKT['verificationCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.2. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['verificationCertificateDate'])}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.3. </td>
										<td class="text-xs-left">Ký hiệu thiết kế</td>
										<td class="text-xs-center">{{thongTinChungTSKT['designSymbol']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.4. </td>
										<td class="text-xs-left">Số giấy chứng nhận phê duyệt kiểu loại tại nước ngoài</td>
										<td class="text-xs-center">{{thongTinChungTSKT['typeApprovalCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.4. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['typeApprovalCertificateDate'])}}</td>
									</tr>

									<tr>
										<td>
											<label>3.</label>
										</td>
										<td colspan="2">
											<label>Thông tin tiêu chuẩn, quy chuẩn áp dụng</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.1. </td>
										<td class="text-xs-left">Tiêu chuẩn an toàn chung</td>
										<td class="text-xs-center">{{thongTinChungTSKT['commonSafetyDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.2. </td>
										<td class="text-xs-left">Tiêu chuẩn khí thải</td>
										<td class="text-xs-center">{{thongTinChungTSKT['emissionDescription']}}</td>
									</tr>

									<tr>
										<td>
											<label>4.</label>
										</td>
										<td colspan="2">
											<label>Thông tin chung về kiểu loại xe</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1. </td>
										<td class="text-xs-left">Loại hình sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedAssemblyTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2. </td>
										<td class="text-xs-left">Loại phương tiện</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3. </td>
										<td class="text-xs-left">Nhãn hiệu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedTrademarkName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.4. </td>
										<td class="text-xs-left">Tên thương mại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedCommercialName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.5. </td>
										<td class="text-xs-left">Mã kiểu loại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedModelCode']}}</td>
									</tr>


									<tr>
										<td>
											<label>5.</label>
										</td>
										<td colspan="2">
											<label>Thông tin xe mẫu, loại xe cở sở</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.1. </td>
										<td class="text-xs-left">Số khung xe mẫu (số VIN)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleVINNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.2. </td>
										<td class="text-xs-left">Số động cơ xe mẫu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleEngineNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3. </td>
										<td class="text-xs-left">Xe ô tô cơ sở (áp dụng cho xe đóng thùng)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.1 </td>
										<td class="text-xs-left">Số GCN xe cơ sở</td>
										<td class="text-xs-center">{{thongTinChungTSKT['referenceCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.2 </td>
										<td class="text-xs-left">Loại xe ô tô cơ sở</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.3 </td>
										<td class="text-xs-left">Nhãn hiệu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleTrademarkName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.4 </td>
										<td class="text-xs-left">Tên thương mại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleCommercialName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.5 </td>
										<td class="text-xs-left">Mã kiểu loại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleModelCode']}}</td>
									</tr>
								</tbody>
							</table>

						</v-flex>
					</v-layout>
				</template>

				<#-- tổng thể -->
				<template v-else>
					<v-layout row wrap class="ml-0 pl-0" style="padding-right: 15px;">

						<v-flex xs12 sm12>
							<label>1. THÔNG TIN CHUNG</label>
						</v-flex>
						<v-flex xs12 sm12>
							<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
								<thead>
									<tr>
										<th class="text-xs-center">TT</th>
										<th class="text-xs-center">Nội dung</th>
										<th class="text-xs-center">Kết quả kiểm tra</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>
											<label>1.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về cơ sở sản xuất</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.1. </td>
										<td class="text-xs-left">Cơ sở sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.2. </td>
										<td class="text-xs-left">Địa chỉ</td>
										<td class="text-xs-center">{{thongTinChungTSKT['applicantAddress']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.3. </td>
										<td class="text-xs-left">Nhà máy sản xuất</td>
										<td class="text-xs-center">
											{{thongTinChungTSKT['productionPlantName']}}
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">1.4. </td>
										<td class="text-xs-left">Địa chỉ nhà máy sản xuất</td>
										<td class="text-xs-center">{{thongTinChungTSKT['productionPlantAddress']}}</td>
									</tr>

									<tr>
										<td>
											<label>2.</label>
										</td>
										<td colspan="2">
											<label>Thông tin về chứng chỉ thẩm định thiết kế</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.1. </td>
										<td class="text-xs-left">Số chứng chỉ thẩm định thiết kế</td>
										<td class="text-xs-center">{{thongTinChungTSKT['verificationCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.2. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['verificationCertificateDate'])}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.3. </td>
										<td class="text-xs-left">Ký hiệu thiết kế</td>
										<td class="text-xs-center">{{thongTinChungTSKT['designSymbol']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.4. </td>
										<td class="text-xs-left">Số giấy chứng nhận phê duyệt kiểu loại tại nước ngoài</td>
										<td class="text-xs-center">{{thongTinChungTSKT['typeApprovalCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">2.4. </td>
										<td class="text-xs-left">Ngày cấp</td>
										<td class="text-xs-center">{{parseTimeStampToDate(thongTinChungTSKT['typeApprovalCertificateDate'])}}</td>
									</tr>

									<tr>
										<td>
											<label>3.</label>
										</td>
										<td colspan="2">
											<label>Thông tin tiêu chuẩn, quy chuẩn áp dụng</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.1. </td>
										<td class="text-xs-left">Tiêu chuẩn an toàn chung</td>
										<td class="text-xs-center">{{thongTinChungTSKT['commonSafetyDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">3.2. </td>
										<td class="text-xs-left">Tiêu chuẩn khí thải</td>
										<td class="text-xs-center">{{thongTinChungTSKT['emissionDescription']}}</td>
									</tr>

									<tr>
										<td>
											<label>4.</label>
										</td>
										<td colspan="2">
											<label>Thông tin chung về kiểu loại xe</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.1. </td>
										<td class="text-xs-left">Loại hình sản xuất, lắp ráp</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedAssemblyTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.2. </td>
										<td class="text-xs-left">Loại phương tiện</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3. </td>
										<td class="text-xs-left">Nhãn hiệu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedTrademarkName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.4. </td>
										<td class="text-xs-left">Tên thương mại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedCommercialName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">4.5. </td>
										<td class="text-xs-left">Mã kiểu loại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['certifiedModelCode']}}</td>
									</tr>


									<tr>
										<td>
											<label>5.</label>
										</td>
										<td colspan="2">
											<label>Thông tin xe mẫu, loại xe cở sở</label>
										</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.1. </td>
										<td class="text-xs-left">Số khung xe mẫu (số VIN)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleVINNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.2. </td>
										<td class="text-xs-left">Số động cơ xe mẫu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleEngineNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3. </td>
										<td class="text-xs-left">Xe ô tô cơ sở (áp dụng cho xe đóng thùng)</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.1 </td>
										<td class="text-xs-left">Số GCN xe cơ sở</td>
										<td class="text-xs-center">{{thongTinChungTSKT['referenceCertificateNo']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.2 </td>
										<td class="text-xs-left">Loại xe ô tô cơ sở</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleVehicleTypeDescription']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.3 </td>
										<td class="text-xs-left">Nhãn hiệu</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleTrademarkName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.4 </td>
										<td class="text-xs-left">Tên thương mại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleCommercialName']}}</td>
									</tr>
									<tr>
										<td class="text-xs-left">5.3.5 </td>
										<td class="text-xs-left">Mã kiểu loại</td>
										<td class="text-xs-center">{{thongTinChungTSKT['sampleModelCode']}}</td>
									</tr>
								</tbody>
							</table>

						</v-flex>
					</v-layout>
				</template>

				<v-flex xs12 sm12>
					<label>2. THÔNG SỐ KỸ THUẬT SẢN PHẨM</label>
				</v-flex>
				<v-flex xs12 sm12>
					<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
						<thead>
							<tr>
								<th class="text-xs-center">TT</th>
								<th class="text-xs-center">Hạng mục kiểm tra</th>
								<th class="text-xs-center">Kết quả kiểm tra</th>
							</tr>
						</thead>
						<tbody>
							<template v-for="(item, index) in listThongSoKyThuat" :key="'listThongSoKyThuat' + index">
								<tr>
									<td colspan="3">
										<label>{{item['title']}}</label>
									</td>
								</tr>
								<tr v-for="(itemTSKT, indexTSKT) in item['items']" :key="'listThongSoKyThuat_item' + indexTSKT">
									<td class="text-xs-center">
										{{indexTSKT + 1}}
									</td>
									<td>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span v-html="itemTSKT['title']"></span>
									</td>
									<td class="text-xs-center">
									    {{itemTSKT['value']}}
									</td>
								</tr>
							</template>
						</tbody>
					</table>
				</v-flex>

				<v-flex xs12 sm12>
					<label>3.	GHI CHÚ</label>
				</v-flex>
				<v-flex xs12 sm12>
					<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
						<tbody>
							<tr>
								<td class="text-xs-left">
									<span>3.1</span>
								</td>
								<td class="text-xs-left">
									<span>Ghi chú để in chứng chỉ</span>
								</td>
								<td class="text-xs-left">
									<span>{{thongTinChungTSKT['certificateNote']}}</span>
								</td>
							</tr>
							<tr>
								<td class="text-xs-left">
									<span>3.2</span>
								</td>
								<td class="text-xs-left">
									<span>Ghi chú khác</span>
								</td>
								<td class="text-xs-left">
									<span>{{thongTinChungTSKT['inspectionNote']}}</span>
								</td>
							</tr>
						</tbody>
					</table>
				</v-flex>

				<v-flex xs12 sm12>
					<label>4.	HẠN XÁC NHẬN HIỆU LỰC</label>
				</v-flex>
				<v-flex xs12 sm12>
					<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
						<tr>
							<th style="text-align: center;border: 0.5px solid;">TT</th>
							<th style="text-align: center;border: 0.5px solid;">Số hồ sơ</th>
							<th style="text-align: center;border: 0.5px solid;">Ngày hiệu lực</th>
						</tr>
						<tr v-for="(item, index) in dsHSXNHL" :key="'dshsxnhl' + index">
							<td style="	text-align: center;border: 0.5px solid;">
								{{index + 1}}
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span v-if="item['validdossierid'] == -1">{{item['dossierno']}}</span>
								<span v-else>{{item['validdossierno']}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								{{item['certificaterecordexpiredate']}}
							</td>
						</tr>
					</table>
				</v-flex>

				<v-flex xs12 sm12 v-if="showTongThanhTSKT">
					<label>5.	DANH MỤC TỔNG THÀNH HỆ THỐNG</label>
				</v-flex>
				<v-flex xs12 sm12 v-if="showTongThanhTSKT">
					<label>Danh mục tổng thành phải kiểm tra chứng nhận</label>
					<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
						<thead>
							<tr>
								<th class="text-xs-center">TT</th>
								<th class="text-xs-center">Tổng thành, hệ thống</th>
								<th class="text-xs-center">Số GCN</th>
								<th class="text-xs-center">Nhãn hiệu, số loại/ mã hiệu</th>
								<th class="text-xs-center">Nguồn gốc</th>
								<th class="text-xs-center">Nước sản xuất</th>
							</tr>
						</thead>
						<tr v-for="(item, index) in vr_VehicleEquipment_BatBuoc" :key="'tongthanhhethongbatbuoc' + index">
							<td style="	text-align: center;border: 0.5px solid;">
								{{index + 1}}
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['certifiedVehicleTypeDescription']}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['certificateRecordNo']}}</span> <br>
								<span>{{parseTimeStampToDate(item['certificateRecordDate'])}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['certifiedTrademarkName']}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['originalName']}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								{{item['productionCountry']}}
							</td>
						</tr>
					</table>

					<label>Danh mục tổng thành không phải kiểm tra chứng nhận</label>
					<table class="table-basic px-4 pb-2 table-tskt" style="width:100%;">
						<thead>
							<tr>
								<th class="text-xs-center">TT</th>
								<th class="text-xs-center">Tổng thành, hệ thống</th>
								<th class="text-xs-center">Số BCTN</th>
								<th class="text-xs-center">Nhãn hiệu, số loại/ mã hiệu</th>
								<th class="text-xs-center">Nguồn gốc</th>
								<th class="text-xs-center">Nơi sản xuất</th>
								<th class="text-xs-center">Nước sản xuất</th>
							</tr>
						</thead>
						<tr v-for="(item, index) in vr_VehicleEquipment_KoBatBuoc" :key="'tongthanhhethongkobatbuoc' + index">
							<td style="	text-align: center;border: 0.5px solid;">
								{{index + 1}}
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['certifiedVehicleTypeDescription']}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['safetytestReportNo']}}</span> <br>
								<span>{{parseTimeStampToDate(item['safetytestReportDate'])}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['certifiedTrademarkName']}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<span>{{item['originalName']}}</span>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								<template v-if="item['originalName'] == 3">
									<div>
										<span>{{item['manufacturerName']}}</span> <br>
										<span>{{item['manufacturerAddress']}}</span>
									</div>
								</template>
								<template v-else>
									<div>
										<span>{{item['productionName']}}</span> <br>
										<span>{{item['productionAddress']}}</span>
									</div>
								</template>
							</td>
							<td style="	text-align: center;border: 0.5px solid;">
								{{item['productionCountry']}}
							</td>
						</tr>
					</table>
				</v-flex>
			</v-layout>
		</v-expansion-panel>

	</div>
	
</div>