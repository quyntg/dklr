<template>
	<v-layout row wrap class="ml-0 mr-0">
	  <v-flex xs12 sm12>
	    <label class="pt-2 pr-1">1. Thông tin chung</label>
	  </v-flex>

	  <v-flex xs12 sm3>
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
	    <#-- <v-text-field
	      v-model="bienBanGSModel['leaderName']"
	      class="py-0 my-0"
	    ></v-text-field> -->
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Ngày phân công: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      v-model="bienBanGSModel['ngay_bat_dau_tham_dinh']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1"> Ngày kiểm tra giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      v-model="bienBanGSModel['inspectionRecordDate']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Số biên bản kiểm tra giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['inspectionRecordNo']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Đăng kiểm viên GS: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['inspectorname']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Cơ sở sản xuất: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['applicantName']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Địa điểm giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['receiverPlace']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Loại xe: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['loai_phuong_tien']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Nhãn hiệu: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      v-model="bienBanGSModel['nhan_hieu']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1">  Số loại: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      v-model="bienBanGSModel['so_loai']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Số Giấy chứng nhận chất lượng: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      disabled
	      v-model="bienBanGSModel['so_gcn']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1">  Ngày cấp GCN: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      disabled
	      v-model="bienBanGSModel['ngay_cap']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Loại hình lắp ráp: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['loai_hinh_lap_rap']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1"> Nơi đóng số khung/ số động cơ: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['noi_dong_so_khung']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Ngày đề nghị giám sát: </label>
	  </v-flex>
	  <v-flex xs12 sm9>
	    <v-text-field
	      v-model="bienBanGSModel['ngay_de_nghi']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3>
	    <label class="pt-2 pr-1">  Tên người liên hệ của CSSX: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      v-model="bienBanGSModel['ten_nguoi_lien_he']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm3 class="text-xs-right">
	    <label class="pt-2 pr-1">  Số điện thoại liên hệ: </label>
	  </v-flex>
	  <v-flex xs12 sm3>
	    <v-text-field
	      v-model="bienBanGSModel['sdt_nguoi_lien_he']"
	      class="py-0 my-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <label class="pt-2 pr-1">  2. Danh sách các xe đề nghị giám sát kiểm tra chất lượng xuất xưởng </label>
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
	    				<input type="checkbox" @change="tickAllLD(1)" name="datAllLD" class="check_radio" id="datAllLD" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="datAllLD" style="margin: 0">Đạt</label>

	    				<input type="checkbox" @change="tickAllLD(4)" name="kDatAllLD" class="check_radio" id="kDatAllLD" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="kDatAllLD" style="margin: 0">KĐ</label>
	    			</th>
	    			<th class="text-xs-center">
	    				<input type="checkbox" @change="tickAllGSL(1)" name="datAllGSL" class="check_radio" id="datAllGSL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="datAllGSL" style="margin: 0">Đạt</label>

	    				<input type="checkbox" @change="tickAllGSL(4)" name="kDatAllGSL" class="check_radio" id="kDatAllGSL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="kDatAllGSL" style="margin: 0">KĐ</label>
	    			</th>
	    			<th class="text-xs-center">
	    				<input type="checkbox" @change="tickAllKL(1)" name="datAllKL" class="check_radio" id="datAllKL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="datAllKL" style="margin: 0">Đạt</label>

	    				<input type="checkbox" @change="tickAllKL(4)" name="kDatAllKL" class="check_radio" id="kDatAllKL" style="margin: 0 5px 0 0">

	    				<label class="pt-2" class="label-radio" for="kDatAllKL" style="margin: 0">KĐ</label>
	    			</th>
	    		</tr>
	    	</thead>
	    	<tbody>
	    		<tr v-for="(item, index) in bienBanGSModel['chi_tiet_2']">
	    			<td class="text-xs-center" style="width: 5%;">
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

	    					<label class="pt-2" class="label-radio" :for="'kq_ld' + index + '_' + (indexKq + 1)" style="margin: 0">{{itemKq['text']}}</label>
	    				</div>
	    			</td>
	    			<td class="text-xs-center">
	    				<div v-for="(itemKq, indexKq) in kq2" class="text-xs-center">
	    					<input type="radio" :name="'kq_gsl' + index" class="check_radio" :id="'kq_gsl' + index + '_' + (indexKq + 1)" v-model="item['kq_gsl']" :value="itemKq['value']" style="margin: 0 5px 0 0">

	    					<label class="pt-2" class="label-radio" :for="'kq_gsl' + index + '_' + (indexKq + 1)" style="margin: 0">{{itemKq['text']}}</label>
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