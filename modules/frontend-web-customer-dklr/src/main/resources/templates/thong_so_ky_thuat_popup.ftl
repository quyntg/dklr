<div>
	<v-layout row wrap class="ml-0 pl-0">
		<v-flex xs12 sm6>
			<span>Số chứng chỉ</span>: <label>{{thongTinChungTSKT['soChungChi']}}</label>
		</v-flex>
		<v-flex xs12 sm6>
			<span>Ngày ký</span>: <label>{{thongTinChungTSKT['soChungChi']}}</label>
		</v-flex>
		<v-flex xs12 sm6>
			<span>Đăng kiểm viên chính</span>: <label>{{thongTinChungTSKT['soChungChi']}}</label>
		</v-flex>
		<v-flex xs12 sm6>
			<span>Số biên bản kiểm tra</span>: <label>{{thongTinChungTSKT['soChungChi']}}</label>
		</v-flex>
		<v-flex xs12 sm6>
			<span>Ngày kiểm tra</span>: <label>từ {{thongTinChungTSKT['soChungChi']}}</label> <label>đến {{thongTinChungTSKT['soChungChi']}}</label> 
		</v-flex>
		<v-flex xs12 sm12>
			<span>Loại hồ sơ</span>: <label>{{thongTinChungTSKT['soChungChi']}}</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label>1. THÔNG TIN CHUNG</label>
		</v-flex>
		<v-flex xs12 sm12>
			<table class="table-basic px-4 pb-2" style="width:100%;">
				<thead>
					<tr>
						<th class="text-xs-center">STT</th>
						<th class="text-xs-center">Nội dung</th>
						<th class="text-xs-center">Kết quả kiểm tra</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td colspan="3">
							<label>1. Cơ sở thiết kế</label>
						</td>
					</tr>
					<tr>
						<td class="text-xs-center">1.1. Tên</td>
						<td class="text-xs-left">{{thongTinChungTSKT['designerName']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">1.2. Địa chỉ</td>
						<td class="text-xs-left">{{thongTinChungTSKT['designerAddress']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">1.3. Người đại diện</td>
						<td class="text-xs-left">{{thongTinChungTSKT['designerRepresentative']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">1.4. Số điện thoại</td>
						<td class="text-xs-left">{{thongTinChungTSKT['designerPhone']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">1.5. Thư điện tử (Email)</td>
						<td class="text-xs-left">{{thongTinChungTSKT['designerEmail']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>

					<tr>
						<td colspan="3">
							<label>2. Cơ sở sản xuất, lắp ráp, nhập khẩu</label>
						</td>
					</tr>
					<tr>
						<td class="text-xs-center">2.1. Tên</td>
						<td class="text-xs-left">{{thongTinChungTSKT['applicantName']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">2.2. Địa chỉ</td>
						<td class="text-xs-left">{{thongTinChungTSKT['applicantAddress']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>

					<tr>
						<td colspan="3">
							<label>3. Thông tin tham chiếu</label>
						</td>
					</tr>
					<tr>
						<td class="text-xs-center">3.1. Số tham chiếu của xe cơ sở: (lấy từ dữ liệu của xe SXLR hoặc nhập khẩu)</td>
						<td class="text-xs-left">{{thongTinChungTSKT['baseCertificateRecordNo']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">3.2. Số tham chiếu của xe gốc bổ sung/mở rộng: (lấy từ dữ liệu TĐTK)</td>
						<td class="text-xs-left">{{thongTinChungTSKT['referenceCertificateNo']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>

					<tr>
						<td colspan="3">
							<label>4. Thông tin Quy chuẩn áp dụng</label>
						</td>
					</tr>
					<tr>
						<td class="text-xs-center">4.1. Quy chuẩn an toàn chung</td>
						<td class="text-xs-left">{{thongTinChungTSKT['commonSafetyDescription']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">4.2. Quy chuẩn khí thải</td>
						<td class="text-xs-left">{{thongTinChungTSKT['emissionStandard']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>

					<tr>
						<td colspan="3">
							<label>5. Thông tin chung về kiểu loại xe</label>
						</td>
					</tr>
					<tr>
						<td class="text-xs-center">5.1. Ký hiệu thiết kế</td>
						<td class="text-xs-left">{{thongTinChungTSKT['designSymbol']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">5.2. Loại phương tiện</td>
						<td class="text-xs-left">{{thongTinChungTSKT['certifiedVehicleTypeDescription']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">5.3. Nhãn hiệu</td>
						<td class="text-xs-left">{{thongTinChungTSKT['certifiedTrademarkName']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">5.4. Tên thương mại</td>
						<td class="text-xs-left">{{thongTinChungTSKT['certifiedCommercialName']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>
					<tr>
						<td class="text-xs-center">5.5. Mã kiểu loại</td>
						<td class="text-xs-left">{{thongTinChungTSKT['certifiedModelCode']}}</td>
						<td class="text-xs-center">Đạt</td>
					</tr>

				</tbody>
			</table>

		</v-flex>

		<v-flex xs12 sm12>
			<label>2. THÔNG SỐ KỸ THUẬT SẢN PHẨM</label>
		</v-flex>
		<v-flex xs12 sm12>
			<table class="table-basic px-4 pb-2" style="width:100%;">
				<thead>
					<tr>
						<th class="text-xs-center">Hạng mục kiểm tra</th>
						<th class="text-xs-center">Kết quả kiểm tra</th>
					</tr>
				</thead>
				<tbody>
					<template v-for="(item, index) in listThongSoKyThuat" :key="'listThongSoKyThuat' + index">
						<tr>
							<td colspan="2">
								<label>{{item['title']}}</label>
							</td>
						</tr>
						<tr v-for="(itemTSKT, indexTSKT) in item['items']" :key="'listThongSoKyThuat_item' + indexTSKT">
							<td>
								<span>{{item['standard']}}</span>
							</td>
							<td class="text-xs-center">
								<span>{{item['value'] == 1 ? 'Đạt' : 'Không đạt'}}</span>
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
			<table class="table-basic px-4 pb-2" style="width:100%;">
				<tbody>
					<tr>
						<td class="text-xs-center">
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
						<td class="text-xs-center">
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
			<table class="table-basic px-4 pb-2" style="width:100%;">
				<tr>
					<th style="text-align: center;border: 0.5px solid;">STT</th>
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
			<table class="table-basic px-4 pb-2" style="width:100%;">
				<tr v-for="(item, index) in vr_VehicleEquipment" :key="'tongthanhhethong' + index">
					<td style="	text-align: center;border: 0.5px solid;">
						{{index + 1}}
					</td>
					<td style="	text-align: center;border: 0.5px solid;">
						<span>{{item['validdossierno']}}</span>
					</td>
					<td style="	text-align: center;border: 0.5px solid;">
						{{item['certificaterecordexpiredate']}}
					</td>
				</tr>
			</table>
		</v-flex>
	</v-layout>
</div>