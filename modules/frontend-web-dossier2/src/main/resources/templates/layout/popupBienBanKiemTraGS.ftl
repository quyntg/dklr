<template>
	<v-layout row wrap class="ml-0 mr-0">
	  <v-flex xs12 sm12>
	    <label class="pt-2 pr-1">1. THÔNG TIN CHUNG</label>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Số biên bản kiểm tra giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['inspectionRecordNo']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <#-- <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Đội kiểm tra hiện trường: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-select
	    :items="doiPhongItems"
	    item-text="itemName"
	    item-value="itemCode"
	    clearable
	    autocomplete
	    v-model="bienBanGSModel['corporationId']"
	    class="pt-0"
	    ></v-select>
	  </v-flex> -->

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Ngày kiểm tra giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['inspectionRecordDate']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <#-- <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Ngày phân công: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      v-model="bienBanGSModel['postReviewRecordDate']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex> -->

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1"> Đăng kiểm viên GS: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['inspectorName']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Tên nhà xưởng: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['productionPlantName']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Địa điểm giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['productionPlantAddress']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Loại xe: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	  	<#-- VR_VehicleTypeCertificate certifiedVehicleType -->
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['certifiedVehicleTypeDescription']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Nhãn hiệu: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['certifiedTrademarkName']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1">  Tên thương mại: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	    	readonly
	      v-model="bienBanGSModel['certifiedCommercialName']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="">
	    <label class="pt-2 pr-1">  Mã kiểu loại: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	    	readonly
	      v-model="bienBanGSModel['certifiedModelCode']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1">  Căn cứ: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['circularDescription']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Số Giấy chứng nhận chất lượng: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      readonly
	      v-model="bienBanGSModel['certificateRecordNo']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1">  Ngày cấp GCN: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      readonly
	      v-model="bienBanGSModel['certificateRecordDate']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Loại hình sản xuất, lắp ráp: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	    	readonly
	      v-model="bienBanGSModel['certifiedAssemblyTypeDescription']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Nơi đóng số khung/ số động cơ: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	  	<#-- certifiedFrameAttachPlace -->
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['noi_dong_so_khung_dc']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <#-- <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Ngày đề nghị giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['inspectionRecordDate']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex> -->

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Tên người liên hệ của CSSX: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	  	<#-- VR_Issue -->
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['applicantContactName']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1">  Số điện thoại liên hệ: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	  	<#-- VR_Issue -->
	    <v-text-field
	    readonly
	      v-model="bienBanGSModel['applicantContactPhone']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <label class="pt-2 pr-1">  2. DANH SÁCH CÁC XE ĐỀ NGHỊ GIÁM SÁT KIỂM TRA CHẤT LƯỢNG XUẤT XƯỞNG </label>
	  </v-flex>

	  <v-flex xs12 sm12>
	  	<v-tabs :scrollable="false">
		  	<v-tabs-bar class="grey-opencps-panel" dark>
				<v-tabs-item key="tab-ds-xe-detail-1" href="#tab-ds-xe-detail-1" v-if="!bienBanGSModel['id'] || bienBanGSModel['id'] == 0">
				Danh sách xe
				</v-tabs-item>

				<v-tabs-item key="tab-ds-xe-detail-2" href="#tab-ds-xe-detail-2">
				Kết quả giám sát
				</v-tabs-item>
				
				<v-tabs-slider color="primary"></v-tabs-slider>
			</v-tabs-bar>

			<v-tabs-items>
				<v-tabs-content v-if="!bienBanGSModel['id'] || bienBanGSModel['id'] == 0" id="tab-ds-xe-detail-1" reverse-transition="slide-y-transition" transition="slide-y-transition">
					<table border="1" class="ftable" style="width: 100%;">
						<thead>
							<tr style="background: #d9d7d7;">
								<th rowspan="3" class="text-xs-center">STT</th>
								<#-- <th rowspan="3" class="text-xs-center">Ngày xuất xưởng</th> -->
								<th rowspan="3" class="text-xs-center">Số khung</th>
								<th rowspan="3" class="text-xs-center">Số động cơ </th>
								<th rowspan="3" class="text-xs-center">Màu sơn</th>
								<th rowspan="3" class="text-xs-center">Số thùng xe</th>
								<#-- <th rowspan="3" class="text-xs-center">Số serial</th> -->
								<th class="text-xs-center" colspan="2">Kết quả giám sát</th>
								<th rowspan="3" class="text-xs-center">Ghi chú</th>
								<th rowspan="2" class="text-xs-center">Kết luận</th>
								<th rowspan="2" class="text-xs-center">Chọn xe GS</th>
							</tr>
							<tr style="background: #d9d7d7;">
								<th class="text-xs-center">KQ lần đầu</th>
								<th class="text-xs-center">GS lại</th>
							</tr>
							<tr style="background: #d9d7d7;">
								<th class="text-xs-center">
									(Đạt/ Không đạt)
									<#-- <input type="checkbox" @change="tickAllLD(1)" name="datAllLD" class="check_radio" id="datAllLD" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" for="datAllLD" style="margin: 0">Đạt</label>

									<input type="checkbox" @change="tickAllLD(2)" name="kDatAllLD" class="check_radio" id="kDatAllLD" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" for="kDatAllLD" style="margin: 0">KĐ</label> -->
								</th>
								<th class="text-xs-center">
									(Đạt/ Không đạt)
									<#-- <input type="checkbox" @change="tickAllGSL(1)" name="datAllGSL" class="check_radio" id="datAllGSL" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" for="datAllGSL" style="margin: 0">Đạt</label>

									<input type="checkbox" @change="tickAllGSL(2)" name="kDatAllGSL" class="check_radio" id="kDatAllGSL" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" for="kDatAllGSL" style="margin: 0">KĐ</label> -->
								</th>
								<th class="text-xs-center">
									(Đạt/ Không đạt)
									<#-- <input type="checkbox" @change="tickAllKL(1)" name="datAllKL" class="check_radio" id="datAllKL" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" for="datAllKL" style="margin: 0">Đạt</label>

									<input type="checkbox" @change="tickAllKL(2)" name="kDatAllKL" class="check_radio" id="kDatAllKL" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" for="kDatAllKL" style="margin: 0">KĐ</label> -->
								</th>
								<th class="text-xs-center">

									<input type="checkbox" @change="tickAllXe($event)" name="kDatAllXe" class="check_radio" id="kDatAllXe" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" for="kDatAllXe" style="margin: 0">Chọn</label>
								</th>
							</tr>
						</thead>
						<tbody>
							<tr v-for="(item, index) in bienBanGSModel['VR_VehicleRecord']" :key="'VR_VehicleRecordccc' + index">
								<td class="text-xs-center">
									{{index + 1}}
								</td>
								<#-- <td class="text-xs-center">
									{{item['productionDate']}}
								</td> -->
								<td class="text-xs-center">
									{{item['frameNo']}}
								</td>
								<td class="text-xs-center">
									{{item['engineNo']}}
								</td>
								<td class="text-xs-center">
									{{item['color']}}
								</td>
								<td class="text-xs-center">
									{{item['boxNo']}}
								</td>
								<#-- <td class="text-xs-center">
									{{item['serialNo']}}
								</td> -->
								<td class="text-xs-center">
									<span v-if="item['checkStatus1st'] == 1">Đạt</span>
									<span v-else-if="item['checkStatus1st'] == 2">Không đạt</span>
									<#-- <div v-for="(itemKq, indexKq) in kqPhieu" class="text-xs-center">
										<input type="radio" :name="'kl_ld' + index" class="check_radio" :id="'kq_ld' + index + '_' + (indexKq + 1)" v-model="item['checkStatus1st']" :value="itemKq['value']" style="margin: 0 5px 0 0">

										<label class="pt-2" class="label-radio" :for="'kq_ld' + index + '_' + (indexKq + 1)" style="margin: 0">{{itemKq['text']}}</label>
									</div> -->
								</td>
								<td class="text-xs-center">
									<span v-if="item['checkStatus2nd'] == 1">Đạt</span>
									<span v-else-if="item['checkStatus2nd'] == 2">Không đạt</span>
									<#-- <div v-for="(itemKq, indexKq) in kqPhieu" class="text-xs-center">
										<input type="radio" :name="'kq_gsl' + index" class="check_radio" :id="'kq_gsl' + index + '_' + (indexKq + 1)" v-model="item['checkStatus2nd']" :value="itemKq['value']" style="margin: 0 5px 0 0">

										<label class="pt-2" class="label-radio" :for="'kq_gsl' + index + '_' + (indexKq + 1)" style="margin: 0">{{itemKq['text']}}</label>
									</div> -->
								</td>
								<td class="text-xs-center">
									<v-text-field
									multi-line
									rows="2"
									class="my-0 py-0"
									v-model="item['inspectionNote']"
									></v-text-field>
									<#-- {{item['ghi_chu'] || ''}} -->
								</td>
								<td class="text-xs-center">
									<span v-if="item['vehicleRecordStatus'] == 1">Đạt</span>
									<span v-else-if="item['vehicleRecordStatus'] == 2">Không đạt</span>
									<#-- <div v-for="(itemKq, indexKq) in kqPhieu" class="text-xs-center">
										<input type="radio" :name="'kl_' + index" class="check_radio" :id="'kl_' + index + '_' + (indexKq + 1)" v-model="item['vehicleRecordStatus']" :value="itemKq['value']" style="margin: 0 5px 0 0">

										<label class="pt-2" class="label-radio" :for="'kl_' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
									</div> -->
								</td>
								<td class="text-xs-center">
									<input type="checkbox" @change="chonXeGS(item, index, $event)" :name="'datSelectGS' + index" class="check_radio checkXeGS" :id="'datSelectGS' + index" style="margin: 0 5px 0 0">

									<label class="pt-2" class="label-radio" :for="'datSelectGS' + index" style="margin: 0">Chọn</label>
								</td>
							</tr>
						</tbody>
					</table>
				</v-tabs-content>

				<v-tabs-content id="tab-ds-xe-detail-2" reverse-transition="slide-y-transition" transition="slide-y-transition" v-if="chiTieuChatLuong['VR_VehicleRecord'] && chiTieuChatLuong['VR_VehicleRecord']['length']">
					<#include "bien_ban_kiem_tra_xe_cap_phieu.ftl">
				</v-tabs-content>
			</v-tabs-items>
	    </v-tabs>
	  </v-flex>
	</v-layout>
</template>