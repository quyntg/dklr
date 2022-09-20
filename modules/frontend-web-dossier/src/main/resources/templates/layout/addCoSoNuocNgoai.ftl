<v-slide-x-transition>
	
	  <v-layout row wrap class="ml-3" style="background-color: #fff;">
	  <v-flex xs12 sm12 class="pb-2">
	  	<div class="row-header">
	  		<div class="background-triangle-big" v-if="cssxModel.dictItemId"> Sửa đổi cơ sở sản xuất nước ngoài</div>
	  		<div class="background-triangle-big" v-else> Thêm mới cơ sở sản xuất nước ngoài</div>
	  		<div class="layout row wrap header_tools row-blue">

	  		</div>

	  	</div>
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 15px;">Mã CSSX/Nhà Xưởng</label>
	  </v-flex>
	  <v-flex xs12 sm4>
	  	<v-text-field
	  	:disabled="cssxModel.dictItemId"
	  	v-model="cssxModel.itemCode"
	  	placeholder="Nhập mã CSSX/Nhà xưởng"
	  	clearable
	  	class="py-0"
	  	></v-text-field>
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 15px;"> Tên CSSX/Nhà Xưởng</label>
	  </v-flex>
	  <v-flex xs12 sm4>
	    <v-text-field
	  	v-model="cssxModel.itemName"
	  	placeholder="Nhập tên CSSX/Nhà xưởng"
	  	clearable
	  	class="py-0 pr-3"
	  	></v-text-field>
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 15px;">Loại hình</label>
	  </v-flex>
	  <v-flex xs12 sm10>
	  	<v-select
	  	  :items="loaiHinhCSSXItems"
	  	  v-model="loaiHinhCSSX"
	  	  item-text="groupName"
	  	  item-value="groupCode"
	  	  clearable
	  	  class="py-0 pr-3"
	  	></v-select>
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right" v-if="loaiHinhCSSX === 'NHAXUONG'">
	    <label class="mr-3 my-0" style="padding-top: 15px;">CSSX cha</label>
	  </v-flex>
	  <v-flex xs12 sm10 v-if="loaiHinhCSSX === 'NHAXUONG'">
	  	<v-select
	  	  :items="cssxChaItems"
	  	  v-model="cssxModel.parentItemCode"
	  	  item-text="itemName"
	  	  item-value="itemCode"
	  	  clearable
	  	  class="py-0 pr-3"
	  	></v-select>
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 30px;">Địa chỉ CSSX/Nhà Xưởng</label>
	  </v-flex>
	  <v-flex xs12 sm10>
	  	<v-text-field
	  	multi-line
	  	v-model="cssxModel.itemDescription"
	  	placeholder="Nhập mã CSSX/Nhà xưởng"
	  	clearable
	  	class="py-0 pr-3"
	  	></v-text-field>
	  </v-flex>
	  <v-flex xs12 sm12 class="pb-2">
	    <v-btn color="primary" small @click="saveCoSoNuocNgoai()">Lưu lại</v-btn>
	    <v-btn color="primary" small @click="backCSSXNuocNgoai()">Quay lại</v-btn>
	  </v-flex>
	</v-layout>
</v-slide-x-transition>