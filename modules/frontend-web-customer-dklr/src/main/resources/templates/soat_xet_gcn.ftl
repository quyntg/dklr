<template>
	<v-layout row wrap>
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
	    <label>3. Phương thức cấp</label>
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
	  <v-flex xs12 sm6>
	    <input type="checkbox" name="cbxQuyetToan" id="cbxQuyetToan" v-model="detailSoatXetGCN['quyet_toan']">
	    <label for="cbxQuyetToan">Quyết toán</label>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <label>4. Hình thức cấp</label>
	  </v-flex>
	  <v-flex xs12 sm6>
	    <v-select
	      :items="hinhThucCapSoatXetItems"
	      item-text="text"
	      item-value="value"
	      v-model="detailSoatXetGCN['hinh_thuc_cap']"
	      class="my-0 py-0"
	    ></v-select>
	  </v-flex>
	  <v-flex xs12 sm6>
	  </v-flex>

	  <v-flex xs12 sm12>
	    <table>
	    	<thead>
	    		<tr>
	    			<th>
	    				Số GCN
	    			</th>
	    			<th>
	    				Nhãn hiệu
	    			</th>
	    			<th>
	    				Tên thương mại
	    			</th>
	    			<th>
	    				Giá bán
	    			</th>
	    			<th>
	    				Chi tiết
	    			</th>
	    		</tr>
	    	</thead>
	    	<tbody>
	    		<tr v-for="(item, index) in detailSoatXetGCN['bang_khai']" :key="'bang_khai' + index">
	    			<td class="text-xs-center">{{item['certificateId']}}</td>
	    			<td class="text-xs-center">{{item['nhan_hieu']}}</td>
	    			<td class="text-xs-center">{{item['ten_thuong_mai']}}</td>
	    			<td class="text-xs-center">{{item['gia_ban']}}</td>
	    			<td class="text-xs-center" @click="toDetailSoatXetGCN(item, index)">Chi tiết</td>
	    		</tr>
	    	</tbody>
	    </table>
	  </v-flex>
	</v-layout>
</template>