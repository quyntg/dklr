<v-slide-x-transition>
	<v-form
	ref="formAddCSNN"
	v-model="formAddCSNN"
	lazy-validation
	>
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
	    <label class="mr-3 my-0" style="padding-top: 5px;">Loại hình (<span style="color: red;">*</span>)</label>
	  </v-flex>
	  <v-flex xs12 sm10>
	  	<#-- <v-select
	  	  v-if="cssxModel['dictItemId'] && cssxModel['dictItemId'] != '0'"
	  	  multiple
	  	  :disabled="cssxModel['dictItemId']"
	  	  :items="loaiHinhCSSXItems"
	  	  v-model="cssxModel['groupCode']"
	  	  item-text="groupName"
	  	  item-value="groupCode"
	  	  class="py-0 pr-3"
	  	></v-select> -->

	  	<v-select
	  	  autocomplete
	  	  :items="loaiHinhCSSXItems"
	  	  v-model="cssxModel['groupCode']"
	  	  item-text="groupName"
	  	  item-value="groupCode"
	  	  :disabled="cssxModel['dictItemId']"
	  	  class="py-0 pr-3"
	  	  :rules="[v => !!v || 'Trường dữ liệu bắt buộc']"
	  		required
	  	></v-select>
	  </v-flex>
	  <template v-if="cssxModel['dictItemId']">
	  	<v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<label class="mr-3 my-0" style="padding-top: 5px;">Head office (<span style="color: red;">*</span>)</label>
	  	</v-flex>
	  	<v-flex xs12 sm10 v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<v-select
	  		autocomplete
	  		:items="cssxChaItems"
	  		v-model="cssxModel['parentItemCode']"
	  		item-text="itemName"
	  		item-value="itemCode"
	  		clearable
	  		:rules="[v => !!v || 'Trường dữ liệu bắt buộc']"
	  	    required
	  		@input="binDcHeadOfficeItemCode"
	  		class="py-0 pr-3"
	  		></v-select>
	  	</v-flex>

	  	<v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<label class="mr-3 my-0" style="padding-top: 5px;">Địa chỉ head office</label>
	  	</v-flex>
	  	<v-flex xs12 sm10 v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<v-text-field
	  		multi-line
	  		v-model="cssxModel['diaChiHeadOffice']"
	  		placeholder="Nhập mã CSSX/Nhà xưởng"
	  		clearable
	  		class="py-0 pr-3"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  <template v-else>
	  	<v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<label class="mr-3 my-0" style="padding-top: 5px;">Head office (<span style="color: red;">*</span>)</label>
	  	</v-flex>
	  	<v-flex xs12 sm10 v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<v-select
	  		:rules="[v => !!v || 'Trường dữ liệu bắt buộc']"
	  	    required
	  		:items="cssxChaItems"
	  		v-model="cssxModel.parentItemCode"
	  		item-text="itemName"
	  		item-value="itemCode"
	  		clearable
	  		autocomplete
	  		@input="binDcHeadOfficeItemCode"
	  		class="py-0 pr-3"
	  		></v-select>
	  	</v-flex>

	  	<v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<label class="mr-3 my-0" style="padding-top: 5px;">Địa chỉ head office</label>
	  	</v-flex>
	  	<v-flex xs12 sm10 v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  		<v-text-field
	  		multi-line
	  		v-model="cssxModel['diaChiHeadOffice']"
	  		placeholder="Nhập mã CSSX/Nhà xưởng"
	  		clearable
	  		class="py-0 pr-3"
	  		></v-text-field>
	  	</v-flex>
	  </template>

	  <v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'CSSX' && cssxModel['dictItemId']">
	    <label class="mr-3 my-0" style="padding-top: 5px;">Mã</label>
	  </v-flex>
	  <v-flex xs12 sm4 v-if="cssxModel['groupCode'] == 'CSSX' && cssxModel['dictItemId']">
	  	<v-text-field
	  	readonly
	  	v-model="cssxModel['applicantProfileCOP']"
	  	placeholder="Nhập mã"
	  	class="py-0"
	  	></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'NHAXUONG' && cssxModel['dictItemId']">
	    <label class="mr-3 my-0" style="padding-top: 5px;">Mã</label>
	  </v-flex>
	  <v-flex xs12 sm4 v-if="cssxModel['groupCode'] == 'NHAXUONG' && cssxModel['dictItemId']">
	  	<v-text-field
	  	readonly
	  	v-model="cssxModel['productionPlantCOP']"
	  	placeholder="Nhập mã"
	  	class="py-0"
	  	></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm6 v-if="cssxModel['dictItemId'] && cssxModel['groupCode']">
	    
	  </v-flex>

	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 5px;">Mã CSSX/Nhà Xưởng (<span style="color: red;">*</span>)</label>
	  </v-flex>
	  <v-flex xs12 sm4>
	  	<v-text-field
	  	:rules="[v => !!v || 'Trường dữ liệu bắt buộc']"
	  	required
	  	readonly
	  	:disabled="cssxModel['dictItemId']"
	  	v-model="cssxModel.itemCode"
	  	placeholder="Nhập mã CSSX/Nhà xưởng"
	  	class="py-0"
	  	></v-text-field>
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 5px;"> Tên CSSX/Nhà Xưởng (<span style="color: red;">*</span>)</label>
	  </v-flex>
	  <v-flex xs12 sm4>
	    <v-text-field
	    :rules="[v => !!v || 'Trường dữ liệu bắt buộc']"
	  	required
	  	v-model="cssxModel.itemName"
	  	placeholder="Nhập tên CSSX/Nhà xưởng"
	  	clearable
	  	class="py-0 pr-3"
	  	></v-text-field>
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 5px;">Địa chỉ CSSX/Nhà Xưởng</label>
	  </v-flex>
	  <v-flex xs12 sm10>
	  	<v-text-field
	  	v-model="cssxModel.itemNameEN"
	  	placeholder="Nhập địa chỉ CSSX/Nhà xưởng"
	  	clearable
	  	class="py-0 pr-3"
	  	></v-text-field>
	  </v-flex>
	  
	  

	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3 my-0" style="padding-top: 5px;">Quốc gia</label>
	  </v-flex>
	  <v-flex xs12 sm10>
	  	<v-select
	  	  @input="selectQuocGiaCSSXNN(cssxModel.itemDescription)"
	  	  :items="nuocCSSXItems"
	  	  v-model="cssxModel.itemDescription"
	  	  item-text="itemNameEN"
	  	  item-value="itemNameEN"
	  	  autocomplete
	  	  clearable
	  	  class="py-0 pr-3"
	  	></v-select>
	  </v-flex>

	  <template v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  	<v-flex xs12 sm2 class="text-xs-right">
	  		<label class="mr-3" style="padding-top: 5px;">Email</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['productionPlantEmail']"
	  		placeholder="Nhập địa chỉ email"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>

	  <template v-else>
	  	<v-flex xs12 sm2 class="text-xs-right">
	  		<label class="mr-3" style="padding-top: 5px;">Số điện thoại</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['applicantPhone']"
	  		placeholder="Nhập số điện thoại"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  
	  <template v-if="cssxModel['groupCode'] == 'NHAXUONG'">
	  	<v-flex xs12 sm2 class="text-xs-right">
	  		<label class="mr-3" style="padding-top: 5px;">Website</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['productionPlantWebsite']"
	  		placeholder="Nhập website"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  
	  <template v-else>
	  	<v-flex xs12 sm2 class="text-xs-right">
	  		<label class="mr-3" style="padding-top: 5px;">Số fax</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['applicantFax']"
	  		placeholder="Nhập số fax"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  
	  <v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'CSSX'">
	    <label class="mr-3" style="padding-top: 5px;">Địa chỉ email</label>
	  </v-flex>
	  <v-flex xs12 sm2 v-if="cssxModel['groupCode'] == 'CSSX'">
	  	<v-text-field
	  	v-model="cssxModel['applicantEmail']"
	  	placeholder="Nhập địa chỉ email"
	  	clearable
	  	class="py-0 pr-1"
	  	></v-text-field>
	  </v-flex>

	  <v-flex xs12 sm2 class="text-xs-right" v-if="cssxModel['groupCode'] == 'CSSX'">
	    <label class="mr-3" style="padding-top: 5px;">Website</label>
	  </v-flex>
	  <v-flex xs12 sm2 v-if="cssxModel['groupCode'] == 'CSSX'">
	  	<v-text-field
	  	v-model="cssxModel['applicantWebsite']"
	  	placeholder="Nhập website"
	  	clearable
	  	class="py-0"
	  	></v-text-field>
	  </v-flex>

	  <template v-if="cssxModel['groupCode'] == 'CSSX'">
	  	<v-flex xs12 sm2 class="text-xs-right">
	  	  <label class="mr-3" style="padding-top: 5px;">Người đại diện</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['applicantRepresentative']"
	  		placeholder="Nhập tên người đại diện"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>

	  <template v-else>
	  	<v-flex xs12 sm2 class="text-xs-right">
	  	  <label class="mr-3" style="padding-top: 5px;">Người đại diện</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['productionPlantRepresentative']"
	  		placeholder="Nhập tên người đại diện"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  
	  <template v-if="cssxModel['groupCode'] == 'CSSX'">
	  	<v-flex xs12 sm2 class="text-xs-right">
	  	  <label class="mr-3" style="padding-top: 5px;">Chức danh</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['applicantRepresentativeTitle']"
	  		placeholder="Nhập chức danh"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>

	  <template v-else>
	  	<v-flex xs12 sm2 class="text-xs-right">
	  	  <label class="mr-3" style="padding-top: 5px;">Chức danh</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['productionPlantRepresentativeTitle']"
	  		placeholder="Nhập chức danh"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  

	  
	  <template v-if="cssxModel['groupCode'] == 'CSSX'">
	  	<v-flex xs12 sm2 class="text-xs-right">
	  		<label class="mr-3" style="padding-top: 5px;">Số điện thoại người đại diện</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['applicantRepresentativePhone']"
	  		placeholder="Nhập số điện thoại"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  
	  <template v-else>
	  	<v-flex xs12 sm2 class="text-xs-right">
	  	  <label class="mr-3" style="padding-top: 5px;">Số điện thoại người đại diện</label>
	  	</v-flex>
	  	<v-flex xs12 sm2>
	  		<v-text-field
	  		v-model="cssxModel['productionPlantRepresentativePhone']"
	  		placeholder="Nhập số điện thoại"
	  		clearable
	  		class="py-0 pr-1"
	  		></v-text-field>
	  	</v-flex>
	  </template>
	  <v-flex xs12 sm12>
	    
	  </v-flex>
	  <v-flex xs12 sm2 class="text-xs-right">
	    <label class="mr-3">Người liên hệ</label>
	  </v-flex>
	  <v-flex xs12 sm10 class="text-xs-right pr-2">
	    <v-chip class="mb-1" label outline color="blue" @click="addContact()">Thêm mới</v-chip>
	  </v-flex>
	  <v-flex xs12 sm12>
	  	
	  	<v-data-table
	  	:headers="headersNguoiDaiDien"
	  	:items="dataNguoiDaiDienItems"
	  	class="table-bordered danhSachHoSoTable__class"
	  	hide-actions
	  	:no-data-text="'Không có dữ liệu'"
	  	:no-results-text="'Không có dữ liệu'"
	  	>
	  	<template slot="headers" slot-scope="props">
	  		<th v-for="header in props.headers" class="text-xs-center" v-html="header['text']">

	  		</th>
	  	</template>
	  	<template slot="items" slot-scope="props">
	  		<tr>
	  			<td class="text-xs-center" style="">
	  				<v-text-field
		  				v-if="cssxModel['groupCode'] == 'NHAXUONG'"
		  				v-model="props.item['productionPlantContactName']"
		  				placeholder="Nhập tên người đại diện"
		  				clearable
		  				class="py-0 px-2"
	  				></v-text-field>
	  				<v-text-field
		  				v-else
		  				v-model="props.item['applicantContactName']"
		  				placeholder="Nhập tên người đại diện"
		  				clearable
		  				class="py-0 px-2"
	  				></v-text-field>
	  			</td>
	  			<td class="text-xs-center">
	  				<v-text-field
	  				v-if="cssxModel['groupCode'] == 'NHAXUONG'"
	  				v-model="props.item['productionPlantContactPhone']"
	  				placeholder="Nhập số điện thoại"
	  				clearable
	  				class="py-0"
	  				></v-text-field>

	  				<v-text-field
	  				v-else
	  				v-model="props.item['applicantContactPhone']"
	  				placeholder="Nhập số điện thoại"
	  				clearable
	  				class="py-0"
	  				></v-text-field>
	  			</td>
	  			<td class="text-xs-center">
	  				<v-text-field
	  				v-if="cssxModel['groupCode'] == 'NHAXUONG'"
	  				v-model="props.item['productionPlantContactEmail']"
	  				placeholder="Nhập email"
	  				clearable
	  				class="py-0"
	  				></v-text-field>

	  				<v-text-field
	  				v-else
	  				v-model="props.item['applicantContactEmail']"
	  				placeholder="Nhập email"
	  				clearable
	  				class="py-0"
	  				></v-text-field>
	  			</td>
	  			<td class="text-xs-center">
	  				<v-chip label outline color="blue" @click="deleteContact(props.item, props.index)">Xóa</v-chip>
	  			</td>
	  		</tr>
	  	</template>

	  </v-data-table>
	</v-flex>

	  <v-flex xs12 sm12 class="pb-2">
	    <v-btn color="primary" small @click="saveCoSoNuocNgoai()">Lưu lại</v-btn>
	    <v-btn color="primary" small @click="backCSSXNuocNgoai()">Quay lại</v-btn>
	  </v-flex>
	</v-layout>
</v-form>
</v-slide-x-transition>