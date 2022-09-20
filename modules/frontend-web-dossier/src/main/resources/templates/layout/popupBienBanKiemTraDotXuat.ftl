<template>
	<v-layout row wrap class="ml-0">
		<v-flex xs12 sm12>
			<label>1. Thông tin chung</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label>1.1 Số biên bản: </label>
			<label>{{bienBanDXModel['so_bien_ban']}}</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label>1.1 Tên cơ sở sản xuất (2): </label>
			<label>{{bienBanDXModel['applicantName']}}</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label>1.2 Địa điểm kiểm tra (3):</label>
			<label>{{bienBanDXModel['receiverPlace']}}</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label>1.3	Kiểu loại sản phẩm kiểm tra:</label>
		</v-flex>

		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<table border="1" class="ftable">
				<thead>
					<tr style="background: #d9d7d7;">
						<th class="text-xs-center" style="width: 3%;">TT <br> (4)</th>
						<th class="text-xs-center">Loại SP <br> (5)</th>
						<th class="text-xs-center">Số  GCN <br> (6)</th>
					</tr>
				</thead>
				<tbody>
					<tr v-for="(item, index) in bienBanDXModel['bang_khai']">
						<td class="text-xs-center">
							{{index + 1}}
						</td>
						<td class="text-xs-center">
							{{item['loai_sp']}}
						</td>
						<td class="text-xs-center">
							{{item['so_gcn']}}
						</td>
					</tr>
				</tbody>
			</table>
		</v-flex>

		<v-flex xs12 sm12 v-else-if="stateKiemTraDotXuat === 2">
			<table border="1" class="ftable">
				<thead>
					<tr style="background: #d9d7d7;">
						<th class="text-xs-center" style="width: 3%;">TT <br> (4)</th>
						<th class="text-xs-center">Loại SP <br> (5)</th>
						<th class="text-xs-center">Số khung <br> (6)</th>
						<th class="text-xs-center">Số động cơ <br> (7)</th>
						<th class="text-xs-center">Số  GCN <br> (8)</th>
					</tr>
				</thead>
				<tbody>
					<tr v-for="(item, index) in bienBanDXModel['chi_tiet_2']">
						<td class="text-xs-center">
							{{index + 1}}
						</td>
						<td class="text-xs-center">
							{{item['loai_sp']}}
						</td>
						<td class="text-xs-center">
							{{item['so_khung']}}
						</td>
						<td class="text-xs-center">
							{{item['so_may']}}
						</td>
						<td class="text-xs-center">
							{{item['so_gcn']}}
						</td>
					</tr>
				</tbody>
			</table>
		</v-flex>

		<v-flex xs12 sm12>
			<label>1.4	Các nội dung kiểm tra <span> {{stateKiemTraDotXuat === 1 ? '(7)' : '(9)'}}</span>:</label>
		</v-flex>

		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<table style="width: 100%;" border="1" class="ftable">
				<thead>
					<tr style="background: #d9d8d8;">
						<th class="text-xs-center py-1">TT</th>
						<th class="text-xs-center py-1">Mô tả</th>
						<th class="text-xs-center py-1">Đánh giá</th>
						<th class="text-xs-center py-1">Ghi chú (8)</th>
					</tr>
				</thead>
				<tbody>
					<tr v-for="(item, index) in bienBanDXModel['noiDungKiemTra']" :key="'noiDungKiemTra' + index">
						<td class="text-xs-center">
							{{index + 1}}
						</td>
						<td class="text-xs-center">{{item['hangMuc']}}</td>
						<td class="text-xs-center">
							<v-select
							class="my-0 py-0"
							item-text="text"
							item-value="value"
							:items="tinhPhuHopItems"
							v-model="item['doiChieuGCN']"
							></v-select>
						</td>
						<td class="text-xs-center">
							<v-text-field
							class="py-0 my-0"
							v-model="item['noiDungKoPhuHop']"
							></v-text-field>
						</td>
					</tr>
				</tbody>
			</table>
		</v-flex>

		<v-flex xs12 sm12 v-else-if="stateKiemTraDotXuat === 2">
			<table style="width: 100%;" border="1" class="ftable">
				<thead>
					<tr style="background: #d9d8d8;">
						<th class="text-xs-center py-1">TT</th>
						<th class="text-xs-center py-1">Mô tả</th>
						<th class="text-xs-center py-1">Theo Thiết kế</th>
						<th class="text-xs-center py-1">Theo xe mẫu </th>
						<th class="text-xs-center py-1">Ghi chú (10)</th>
					</tr>
				</thead>
				<tbody>
					<tr v-for="(item, index) in bienBanDXModel['noiDungKiemTra']" :key="'noiDungKiemTra' + index">
						<td class="text-xs-center">
							{{index + 1}}
						</td>
						<td class="text-xs-center">{{item['hangMuc']}}</td>
						<td class="text-xs-center">
							<v-select
							class="my-0 py-0"
							item-text="text"
							item-value="value"
							:items="tinhPhuHopItems"
							v-model="item['theoThietKe']"
							></v-select>
						</td>
						<td class="text-xs-center">
							<v-select
							class="my-0 py-0"
							item-text="text"
							item-value="value"
							:items="tinhPhuHopItems"
							v-model="item['theoXeMau']"
							></v-select>
						</td>
						<td class="text-xs-center">
							<v-text-field
							class="py-0 my-0"
							v-model="item['ghiChu']"
							></v-text-field>
						</td>
					</tr>
				</tbody>
			</table>
		</v-flex>

		<v-flex xs12 sm12>
			<label>1.5 	Ghi nhận {{stateKiemTraDotXuat === 1 ? '(9)' : '(11)'}}: </label>
		</v-flex>
		<v-flex xs12>
			<v-text-field
			class="my-0 py-0"
			multi-line
			rows="4"
			v-model="bienBanDXModel['remarks']"
			></v-text-field>
		</v-flex>

		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<label>1.6.  Xác nhận TSKT (theo danh sách kiểu loại sản phẩm mục 1.3) (10)</label>
		</v-flex>
		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<#-- v-for="(item, index) in bienBanDXModel['remarks']" :key="'xacNhanTSKT' + index" -->
			<div class="py-1">
				<v-layout row wrap class="ml-0 mr-0 px-2">
					<v-flex xs12 sm3 class="text-xs-center">
						- Khối lượng bản thân sp 1:
					</v-flex>
					<v-flex xs12 sm3>
						<v-layout row wrap class="ml-0 mr-0">
							<v-flex xs12 sm6>
								<i>Theo thiết kế:</i>
							</v-flex>
							<v-flex xs12 sm6>
								<v-text-field
								class="my-0 py-0"
								v-model="bienBanDXModel['theo_thiet_ke']"
								></v-text-field>
							</v-flex>
						</v-layout>
					</v-flex>
					<v-flex xs12 sm3>
						<v-layout row wrap class="ml-0 mr-0">
							<v-flex xs12 sm6>
								<i>Thực tế:</i>
							</v-flex>
							<v-flex xs12 sm6>
								<v-text-field
								class="my-0 py-0"
								v-model="bienBanDXModel['thuc_te']"
								></v-text-field>
							</v-flex>
						</v-layout>
					</v-flex>
					<v-flex xs12 sm3>
						<v-layout row wrap class="ml-0 mr-0">
							<v-flex xs12 sm6>
								<i>Kết luận:</i>
							</v-flex>
							<v-flex xs12 sm6>
								<div v-for="(itemKq, indexKq) in kqThietBi" class="text-xs-center">
									<input type="radio" :name="'kq_khoi_luong_bt'" class="check_radio" :id="'kq_khoi_luong_bt' + '_' + (indexKq + 1)" v-model="bienBanDXModel['kq_khoi_luong_bt']" :value="itemKq['value']" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" :for="'kq_khoi_luong_bt' + '_' + (indexKq + 1)" style="margin: 0" v-html="bienBanDXModel['text']"></label>
								</div>
							</v-flex>
						</v-layout>
					</v-flex>
				</v-layout>
			</div>
		</v-flex>

		<v-flex xs12 sm12>
			<label>{{stateKiemTraDotXuat === 1 ? '(1.7)' : '(1.6)'}}.  Đề xuất, kiến nghị {{stateKiemTraDotXuat === 1 ? '(11)' : '(12)'}}: </label>
		</v-flex>

		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 2">
			<v-text-field
			class="my-0 py-0"
			multi-line
			rows="2"
			v-model="bienBanDXModel['de_xuat_kien_nghi']"
			></v-text-field>
		</v-flex>

		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<input type="checkbox" name="checkboxcap_kocap" id="checkboxcap" v-model="bienBanDXModel['cap']">
			<label for="checkboxcap" class="pl-1">(*) Cấp phôi phiếu KTCLXX</label>
		</v-flex>
		<#-- <v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<v-text-field
			class="my-0 py-0"
			multi-line
			rows="2"
			v-model="bienBanDXModel['cap_phoi']"
			></v-text-field>
		</v-flex> -->

		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<input type="checkbox" name="checkboxcap_kocap" id="checkboxkocap" v-model="bienBanDXModel['cap']">
			<label for="checkboxkocap" class="pl-1">(*) Không cấp phôi phiếu KTCLXX cho kiểu loại này</label>
		</v-flex>
		<#-- <v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<v-text-field
			class="my-0 py-0"
			multi-line
			rows="2"
			v-model="bienBanDXModel['khong_cap_phoi']"
			></v-text-field>
		</v-flex> -->

		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<label class="pl-1">Đề xuất, kiến nghị khác:</label>
		</v-flex>
		<v-flex xs12 sm12 v-if="stateKiemTraDotXuat === 1">
			<v-text-field
			class="my-0 py-0"
			multi-line
			rows="4"
			v-model="bienBanDXModel['de_xuat_khac']"
			></v-text-field>
		</v-flex>

		<v-flex xs12 sm12>
		  <label>Danh sách xe</label>
		</v-flex>
		<v-flex xs12 sm12>
		  <table border="1" class="ftable" style="width: 100%;">
	    	<thead>
	    		<tr style="background: #d9d7d7;">
	    			<th rowspan="3" class="text-xs-center" style="width: 3%;">STT</th>
	    			<th rowspan="3" class="text-xs-center">Số khung</th>
	    			<th rowspan="3" class="text-xs-center">Số động cơ</th>
	    			<th rowspan="3" class="text-xs-center">Màu sơn</th>
	    			<th class="text-xs-center" colspan="2">Kết quả giám sát</th>
	    			<th rowspan="2" class="text-xs-center">Kết luận</th>
	    		</tr>
	    		<tr style="background: #d9d7d7;">
	    			<th class="text-xs-center">Lần đầu</th>
	    			<th class="text-xs-center">Giám sát lại</th>
	    		</tr>
	    		<tr style="background: #d9d7d7;">
	    			<th class="text-xs-center">
	    				<input type="checkbox" @change="tickAll_DX_LD(1)" name="datAllLD" class="check_radio" id="datAllLD" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="datAllLD" style="margin: 0">Đạt</label>

	    				<input type="checkbox" @change="tickAll_DX_LD(4)" name="kDatAllLD" class="check_radio" id="kDatAllLD" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="kDatAllLD" style="margin: 0">KĐ</label>
	    			</th>
	    			<th class="text-xs-center">
	    				<input type="checkbox" @change="tickAll_DX_GSL(1)" name="datAllGSL" class="check_radio" id="datAllGSL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="datAllGSL" style="margin: 0">Đạt</label>

	    				<input type="checkbox" @change="tickAll_DX_GSL(4)" name="kDatAllGSL" class="check_radio" id="kDatAllGSL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="kDatAllGSL" style="margin: 0">KĐ</label>
	    			</th>
	    			<th class="text-xs-center">
	    				<input type="checkbox" @change="tickAll_DX_KL(1)" name="datAllKL" class="check_radio" id="datAllKL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="datAllKL" style="margin: 0">Đạt</label>

	    				<input type="checkbox" @change="tickAll_DX_KL(4)" name="kDatAllKL" class="check_radio" id="kDatAllKL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="kDatAllKL" style="margin: 0">KĐ</label>
	    			</th>
	    		</tr>
	    	</thead>
	    	<tbody>
	    		<tr v-for="(item, index) in bienBanDXModel['chi_tiet_2']">
	    			<td class="text-xs-center">
	    				{{index + 1}}
	    			</td>
	    			<td class="text-xs-center">
	    				{{item['so_khung']}}
	    			</td>
	    			<td class="text-xs-center">
	    				{{item['so_may']}}
	    			</td>
	    			<td class="text-xs-center">
	    				{{item['mau_son']}}
	    			</td>
	    			<td class="text-xs-center">
	    				<div v-for="(itemKq, indexKq) in kq2" class="text-xs-center">
                          <input type="radio" :name="'kl_ld' + index" class="check_radio" :id="'kq_ld' + index + '_' + (indexKq + 1)" v-model="item['kq_ld']" :value="itemKq['value']" style="margin: 0 5px 0 0">

                          <label class="pt-2" class="label-radio" :for="'kq_ld' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div>
	    			</td>
	    			<td class="text-xs-center">
	    				<div v-for="(itemKq, indexKq) in kq2" class="text-xs-center">
                          <input type="radio" :name="'kl_gsl' + index" class="check_radio" :id="'kl_gsl' + index + '_' + (indexKq + 1)" v-model="item['kq_gs_lai']" :value="itemKq['value']" style="margin: 0 5px 0 0">

                          <label class="pt-2" class="label-radio" :for="'kl_gsl' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div>
	    			</td>
	    			<td class="text-xs-center">
	    				<div v-for="(itemKq, indexKq) in kq3" class="text-xs-center">
                          <input type="radio" :name="'kl_' + index" class="check_radio" :id="'kl_' + index + '_' + (indexKq + 1)" v-model="item['kl']" :value="itemKq['value']" style="margin: 0 5px 0 0">

                          <label class="pt-2" class="label-radio" :for="'kl_' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div>
	    			</td>
	    		</tr>
	    	</tbody>
	    </table>
		</v-flex>
	</v-layout>
</template>