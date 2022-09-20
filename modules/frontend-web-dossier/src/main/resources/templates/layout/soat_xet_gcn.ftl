<template>
	<v-layout row wrap class="ml-0 px-3 mr-0" style="pointer-events: none;">
	  <v-flex xs12 sm12>
	    <label>1. Thông tin về cơ sở sản xuất, lắp ráp</label>
	  </v-flex>
	  <v-flex xs12 sm12>
	    <v-text-field
	      v-model="detailSoatXetGCN['ten_doanh_nghiep']"
	      class="my-0 py-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <label>1. Địa chỉ</label>
	  </v-flex>
	  <v-flex xs12 sm12>
	    <v-text-field
	      v-model="detailSoatXetGCN['dia_chi']"
	      class="my-0 py-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <label>2. Thông tin về nhà máy sản xuất</label>
	  </v-flex>
	  <v-flex xs12 sm12>
	    <v-text-field
	      v-model="detailSoatXetGCN['ten_nha_xuong_text']"
	      class="my-0 py-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <label>3. Địa chỉ xưởng sản xuất lắp ráp</label>
	  </v-flex>
	  <v-flex xs12 sm12>
	    <v-text-field
	      v-model="detailSoatXetGCN['dia_chi_nha_xuong']"
	      class="my-0 py-0"
	    ></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <label>4. Phương thức cấp</label>
	  </v-flex>
	  <v-flex xs12 sm6>
	    <v-select
	      :items="phuongThucCapSoatXetItems"
	      item-text="text"
	      item-value="value"
	      v-model="detailSoatXetGCN['phuong_thuc_cap']"
	      class="my-0 py-0"
	    ></v-select>
	  </v-flex>
	  <v-flex xs12 sm4 class="text-xs-right pr-4">
	    <input type="checkbox" name="cbxQuyetToan" id="cbxQuyetToan" v-model="detailSoatXetGCN['quyet_toan']">
	    <label for="cbxQuyetToan">Quyết toán</label>
	  </v-flex>

	  <v-flex xs12 sm12 v-if="detailSoatXetGCN['quyet_toan']">
	    <label>5. Hình thức cấp</label>
	  </v-flex>
	  <v-flex xs12 sm6 v-if="detailSoatXetGCN['quyet_toan']">
	    <v-select
	      :items="hinhThucCapSoatXetItems"
	      item-text="text"
	      item-value="value"
	      v-model="detailSoatXetGCN['hinh_thuc_cap']"
	      class="my-0 py-0"
	    ></v-select>
	  </v-flex>
	  <v-flex xs12 sm6 v-if="detailSoatXetGCN['quyet_toan']">
	  </v-flex>

	  <v-flex xs12 sm6>
	  	<label>{{titleTableSoatXet}}</label>
	  </v-flex>
	  <v-flex xs12 sm6 class="text-xs-right pr-4">
	  	<i style="font-size: 13px;">Tổng số lượng xe:</i> <label> {{totalXe}}</label>
	  </v-flex>
	  <v-flex xs12 sm12 class="py-2">
	    <table border="1" class="ftable" style="width: 100%;">
	    	<thead>
	    		<tr style="background: #316BB6; color: #fff;">
	    			<th class="text-xs-center py-1" width="3%;">
	    				STT
	    			</th>
	    			<th class="text-xs-center">
	    				Số GCN
	    			</th>
	    			<th class="text-xs-center">
	    				Nhãn hiệu
	    			</th>
	    			<th class="text-xs-center">
	    				Tên thương mại
	    			</th>
	    			<th class="text-xs-center">
	    				Giá bán
	    			</th>
	    			<th class="text-xs-center">
	    				Số lượng
	    			</th>
	    			<th class="text-xs-center">
	    				Danh sách xe
	    			</th>
	    		</tr>
	    	</thead>
	    	<tbody>
	    		<tr v-for="(item, index) in detailSoatXetGCN['bang_khai']" :key="'bang_khai' + index">
	    			<td class="text-xs-center py-1">{{index + 1}}</td>
	    			<td class="text-xs-center">{{item['so_gcn']}}</td>
	    			<td class="text-xs-center">{{item['nhan_hieu']}}</td>
	    			<td class="text-xs-center">{{item['ten_thuong_mai']}}</td>
	    			<td class="text-xs-center">{{item['gia_ban']}}</td>
	    			<td class="text-xs-center">{{item['so_luong']}}</td>
	    			<td class="text-xs-center" style="cursor: pointer; color: blue; pointer-events: auto;" @click="toDetailSoatXetGCN(item, index)">	Chi tiết
	    			</td>
	    		</tr>
	    	</tbody>
	    </table>
	  </v-flex>
	</v-layout>
</template>