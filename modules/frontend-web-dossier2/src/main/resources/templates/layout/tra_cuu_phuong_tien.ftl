<v-slide-x-transition>
  <v-layout row wrap class="ml-3 pt-3" style="width: 100%; background-color: #fff;">
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="my-0" style="padding-top: 15px;">Đối tượng</label> <span class="mr-3" style="color: red;">(*)</span>
  </v-flex>
  <v-flex xs12 sm5>
    <v-select
      item-text="itemName"
      item-value="itemCode"
      :items="tcDoiTuongItems"
      clearable
      v-model="tcDoiTuong"
      class="py-0"
      @change="changeDoiTuong"
    ></v-select>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Phương tiện SXLR</label>
  </v-flex>
  <v-flex xs12 sm3 class="pr-3">
    <v-select
      item-text="itemName"
      clearable
      item-value="itemCode"
      :items="tcPphuongTienItems"
      v-model="tcPhuongTien"
      class="py-0"
    ></v-select>
  </v-flex>
  <!-- ---------------------- -->
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Số hồ sơ</label>
  </v-flex>
  <v-flex xs12 sm2>
    <v-text-field
      v-model="tcSoHoSo"
      placeholder="Nhập mã số hồ sơ"
      clearable
      class="py-0"
    ></v-text-field>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Ngày nộp</label>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
	  	<v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayNop"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayNop"
	  	placeholder="Từ ngày"
	  	clearable
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayNop" @input="parseTcNgayNop()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayNopDenNgay"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayNopDenNgay"
	  	placeholder="Đến ngày"
	  	clearable
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayNopDenNgay" @input="parseTcNgayNopDenNgay()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-select
      :items="tcNamItems"
      placeholder="Năm"
      v-model="tcNam1"
      clearable
      class="py-0"
    ></v-select>
  </v-flex>

  <!-- ----------------------------- -->
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Số ĐKKT</label>
  </v-flex>
  <v-flex xs12 sm2>
    <v-text-field
      v-model="tcSoDKKT"
      placeholder="Nhập số đăng ký kiểm tra"
      clearable
      class="py-0"
    ></v-text-field>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Ngày cấp ĐKKT</label>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayCapDKKTTuNgay"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayCapDKKTTuNgay"
	  	clearable
	  	placeholder="Từ ngày"
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayCapDKKTTuNgay" @input="parseTcNgayCapDKKTTuNgay()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNGayKTDenNGay"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNGayKTDenNGay"
	  	clearable
	  	placeholder="Đến ngày"
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNGayKTDenNGay" @input="parseTcNGayKTDenNGay()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-select
      :items="tcNamItems"
      placeholder="Năm"
      v-model="tcNam2"
      clearable
      class="py-0"
    ></v-select>
  </v-flex>
  <!-- -------------------------------- -->
  
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Số biên bản KT</label>
  </v-flex>
  <v-flex xs12 sm2>
    <v-text-field
      v-model="tcSoBBKiemTra"
      placeholder="Nhập số biên bản kiểm tra"
      clearable
      class="py-0"
    ></v-text-field>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Ngày kiểm tra</label>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
	  	<v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayKT"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayKT"
	  	placeholder="Từ ngày"
	  	clearable
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayKT" @input="parseNgayKT()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayKTDenNgay"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayKTDenNgay"
	  	placeholder="Đến ngày"
	  	clearable
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayKTDenNgay" @input="parseNgayKTDenNgay()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-select
      :items="tcNamItems"
      placeholder="Năm"
      v-model="tcNam3"
      clearable
      class="py-0"
    ></v-select>
  </v-flex>
  <!-- ---------------------------------- -->
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Số chứng chỉ</label>
  </v-flex>
  <v-flex xs12 sm2>
    <v-text-field
      v-model="tcSoChungChi"
      placeholder="Nhập số chứng chỉ"
      class="py-0"
      clearable
    ></v-text-field>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Ngày cấp CC</label>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayCapCC"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayCapCC"
	  	clearable
	  	placeholder="Từ ngày"
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayCapCC" @input="parseNgayCapCC()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayCapCcDEnNgay"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayCapCcDEnNgay"
	  	placeholder="Từ ngày"
	  	clearable
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayCapCcDEnNgay" @input="parseNgayCapCcDEnNgay()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-select
      :items="tcNamItems"
      placeholder="Năm"
      v-model="tcNam4"
      clearable
      class="py-0"
    ></v-select>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Số tờ khai HQ</label>
  </v-flex>
  <!-- ------------------------------- -->
  <v-flex xs12 sm2>
    <v-text-field
      class="py-0"
      clearable
      v-model="tcSoToKhai"
      placeholder="Nhập số tờ khai hải quan"
    ></v-text-field>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Ngày tờ khai HQ</label>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayToKhaiHQ"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayToKhaiHQ"
	  	clearable
	  	placeholder="Từ ngày"
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayToKhaiHQ" @input="parseNgayToKhaiHQ()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-menu
	  	ref="menuNN"
	  	:close-on-content-click="false"
	  	v-model="menuTcNgayToKhaiHqDenNgay"
	  	:nudge-right="40"
	  	:return-value.sync="date"
	  	lazy
	  	transition="scale-transition"
	  	offset-y
	  	full-width
	  	min-width="290px"
	  	>
	  	<v-text-field
	  	slot="activator"
	  	v-model="tcNgayToKhaiHqDenNgay"
	  	placeholder="Đến ngày"
	  	clearable
	  	class="py-0"
	  	readonly
	  	></v-text-field>
	  	<v-date-picker v-model="dateTcNgayToKhaiHqDenNgay" @input="parseNgayToKhaiHqDenNgay()"></v-date-picker>
	  </v-menu>
  </v-flex>
  <v-flex xs12 sm2 class="pr-3">
    <v-select
      :items="tcNamItems"
      placeholder="Năm"
      clearable
      v-model="tcNam5"
      class="py-0"
    ></v-select>
  </v-flex>
  
  <v-flex xs12 sm2 class="text-xs-right">
  	<label class="mr-3 my-0" style="padding-top: 15px;">Tình trạng CC</label>
  </v-flex>
  <v-flex xs12 sm2>
  	<v-select
  	item-text="itemName"
  	item-value="itemCode"
  	clearable
  	:items="tcTinhTrangItems"
  	placeholder="------Lựa chọn--------"
  	v-model="tcTinhTrang"
  	class="py-0"
  	></v-select>
  </v-flex>
  <v-flex xs12 sm2 class="text-xs-right">
    <label class="mr-3 my-0" style="padding-top: 15px;">Số phiếu</label>
  </v-flex>
  <v-flex xs12 sm2>
    <v-text-field
      class="py-0 pr-3"
      clearable
      v-model="tcSoSerial"
      placeholder="Nhập số serial"
    ></v-text-field>
  </v-flex>
  <v-flex xs12 sm2>
    <v-text-field
      class="py-0 pr-3"
      clearable
      v-model="tcTuSo"
      placeholder="Từ số"
    ></v-text-field>
  </v-flex>
  <v-flex xs12 sm2>
    <v-text-field
      class="py-0 pr-3"
      clearable
      v-model="tcDenSo"
      placeholder="Đến số"
    ></v-text-field>
  </v-flex>

  <v-flex xs12 sm12>
    <v-layout row wrap class="mx-0 px-0 mt-3" style="height: 180px; overflow: auto;">
      <v-flex xs12 sm2 class="text-xs-right">
        <label class="mr-3 my-0" style="padding-top: 15px;">Địa điểm ĐKKT</label>
      </v-flex>
      <v-flex xs12 sm4>
        <v-text-field
        class="py-0 pr-3"
        v-model="tcDiaDiemDKKT"
        clearable
         placeholder="Nhập địa điểm kiểm tra"
        ></v-text-field>
      </v-flex>
      <v-flex xs12 sm2 class="text-xs-center">
      	<input type="checkbox" class="mt-3" id="checkboxMauXe" v-model="tcMauXeCB"> <label for="checkboxMauXe">Chọn mẫu xe</label>
        <!-- <v-checkbox label="Chọn mẫu xe" v-model="tcMauXeCB" light></v-checkbox> -->
      </v-flex>
      <v-flex xs12 sm4>
        <v-text-field
        class="py-0 pr-3"
        clearable
        v-model="tcLoaiPhuongTienGT"
         placeholder="Gõ tay [loại phương tiện /loại động cơ nhập khẩu]"
        ></v-text-field>
      </v-flex>
      <!-- ---------------- -->
      <v-flex xs12 sm2 class="text-xs-right">
        <label class="mr-3 my-0" style="padding-top: 15px;">Địa điểm ĐKKT</label>
      </v-flex>
      <v-flex xs12 sm4>
      	<v-select
      	item-text="itemName"
      	item-value="itemCode"
      	clearable
      	:items="tcDiaDiemItems"
      	placeholder="-------Lựa chọn--------"
      	v-model="tcDiaDiemSL"
      	class="py-0 pr-3"
      	></v-select>
      </v-flex>
      <!-- <v-flex xs12 sm2>
      	<v-select
      	item-text="itemName"
      	item-value="itemCode"
      	:items="unknowItems"
      	clearable
      	placeholder="-------Lựa chọn--------"
      	v-model="tcUnknow"
      	class="py-0 pr-2"
      	></v-select>
      </v-flex> -->

      <v-flex xs12 sm6 class="pl-3">
      	<v-layout row wrap>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Nhãn hiệu</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	clearable
      	  	v-model="tcNhanHieu"
      	  	placeholder="Nhập nhãn hiệu"
      	  	></v-text-field>
      	  </v-flex>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Mã kiểu loại</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	clearable
      	  	v-model="tcMaKieuLoai"
      	  	placeholder="Nhập mã kiểu loại"
      	  	></v-text-field>
      	  </v-flex>
      	</v-layout>
      </v-flex>

      <v-flex xs12 sm2 class="text-xs-right">
        <label class="mr-3 my-0" style="padding-top: 15px;">Đơn vị kiểm tra</label>
      </v-flex>
      <v-flex xs12 sm4>
        <v-select
        item-text="itemName"
        item-value="itemCode"
      	:items="tcDonViKiemTraItems"
      	clearable
      	placeholder="------Lựa chọn--------"
      	v-model="tcDonViKiemTra"
      	class="py-0 pr-2"
      	></v-select>
      </v-flex>

      <v-flex xs12 sm6 class="pl-3">
      	<v-layout row wrap>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Tên thương mại</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	v-model="tcTenThuongMai"
      	  	clearable
      	  	placeholder="Nhập tên thương mại"
      	  	></v-text-field> 
      	  </v-flex>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Số PIN /Sê ri</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	v-model="tcSoPinSoSerial"
      	  	clearable
      	  	placeholder="Nhập số PIN hoặc số serial"
      	  	></v-text-field>
      	  </v-flex>
      	</v-layout>
      </v-flex>

      <v-flex xs12 sm2 class="text-xs-right">
        <label class="mr-3 my-0" style="padding-top: 15px;">Đăng kiểm viên</label>
      </v-flex>
      <v-flex xs12 sm4>
        <v-select
      	:items="tcDangKiemVienItems"
      	clearable
      	placeholder="------Lựa chọn--------"
      	v-model="tcDangKiemVien"
      	class="py-0 pr-2"
      	></v-select>
      </v-flex>

      <v-flex xs12 sm6 class="pl-3">
      	<v-layout row wrap>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Số khung/ số Vin</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	v-model="tcSoKhungSoVin"
      	  	clearable
      	  	placeholder="Nhập số khung số VIN"
      	  	></v-text-field>
      	  </v-flex>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Số động cơ</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	v-model="tcSoDongCo"
      	  	clearable
      	  	placeholder="Nhập số động cơ"
      	  	></v-text-field>
      	  </v-flex>
      	</v-layout>
      </v-flex>
      
      <v-flex xs12 sm2 class="text-xs-right">
        <label class="mr-3 my-0" style="padding-top: 15px;">Doanh nghiệp</label>
      </v-flex>
      <v-flex xs12 sm4>
        <v-text-field
      	class="py-0 pr-2"
      	v-model="tcDoanhNghiep"
      	clearable
      	placeholder="Nhập tên doanh nghiệp"
      	></v-text-field> 
      </v-flex>

		<v-flex xs12 sm6 class="pl-3">
      	<v-layout row wrap>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Nước sản xuất</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	clearable
      	  	v-model="tcNuocSanXuat"
      	  	placeholder="Nhập nước sản xuất"
      	  	></v-text-field> 
      	  </v-flex>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Năm sản xuất</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-select
      	  	:items="tcNamItems"
      	  	clearable
      	  	placeholder="------Lựa chọn--------"
      	  	v-model="tcNamSX"
      	  	class="py-0"
      	  	></v-select>
      	  </v-flex>
      	</v-layout>
      </v-flex>

      <v-flex xs12 sm2 class="text-xs-right">
        <label class="mr-3 my-0" style="padding-top: 15px;">Mã số thuế</label>
      </v-flex>
      <v-flex xs12 sm4 class="pl-3">
      	<v-layout row wrap>
      	  <v-flex xs12 sm4>
      	  	<v-text-field
      	  	class="py-0"
      	  	clearable
      	  	v-model="tcMaSoThue"
      	  	placeholder="Nhập mã số thuế"
      	  	></v-text-field> 
      	  </v-flex>
      	  <v-flex xs12 sm4 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Số hóa đơn</label>
      	  </v-flex>
      	  <v-flex xs12 sm4>
      	  	<v-text-field
      	  	class="py-0"
      	  	clearable
      	  	v-model="tcSoHoaDon"
      	  	placeholder="Nhập số hóa đơn"
      	  	></v-text-field> 
      	  </v-flex>
      	</v-layout>
      </v-flex>

      <v-flex xs12 sm6 class="pl-3">
      	<v-layout row wrap>
      	  <v-flex xs12 sm3>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  </v-flex>
      	  <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Màu sơn</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-text-field
      	  	class="py-0"
      	  	clearable
      	  	v-model="tcMauSon"
      	  	placeholder="Nhập màu sơn"
      	  	></v-text-field> 
      	  </v-flex>
      	  <!-- <v-flex xs12 sm3 class="text-xs-right">
      	    <label class="mr-3 my-0" style="padding-top: 15px;">Tình trạng CC</label>
      	  </v-flex>
      	  <v-flex xs12 sm3>
      	  	<v-select
      	  	item-text="itemName"
      	  	item-value="itemCode"
      	  	clearable
      	  	:items="tcTinhTrangItems"
      	  	placeholder="------Lựa chọn--------"
      	  	v-model="tcTinhTrang"
      	  	class="py-0"
      	  	></v-select>
      	  </v-flex> -->
      	</v-layout>
      </v-flex>

      <v-flex xs12 sm2 class="text-xs-right">
      	<label class="mr-3 my-0" style="padding-top: 15px;">Số BCTN an toàn</label>
      </v-flex>

      <v-flex xs12 sm4>
      	<v-text-field
      	class="py-0"
      	clearable
      	v-model="tcSoBCTNAnToan"
      	placeholder="Nhập số báo cáo thử nghiệm an toàn"
      	></v-text-field> 
      </v-flex>

      <v-flex xs12 sm6 class="pl-3">
        <v-layout row wrap>
          <v-flex xs12 sm3 class="text-xs-right">
            <label class="mr-3 my-0" style="padding-top: 15px;">Tên nhà máy SX</label>
          </v-flex>
          <v-flex xs12 sm9>
          	<v-text-field
          	class="py-0"
          	clearable
          	v-model="tcTenNhaMaySX"
          	placeholder="Nhập tên nhà máy sản xuất"
          	></v-text-field>
          </v-flex>
        </v-layout>
      </v-flex>
      
		
      <v-flex xs12 sm2 class="text-xs-right">
      	<label class="mr-3 my-0" style="padding-top: 15px;">Số BCTN khí thải</label>
      </v-flex>

      <v-flex xs12 sm4>
      	<v-text-field
      	class="py-0 pr-2"
      	clearable
      	v-model="tcSoBCTNKhiThai"
      	placeholder="Nhập số báo cáo thử nghiệm khí thải"
      	></v-text-field>
      </v-flex>

	 <v-flex xs12 sm6 class="pl-3">
        <v-layout row wrap>
          <v-flex xs12 sm3 class="text-xs-left">
            <label class="my-0" style="padding-top: 15px;">Đ.chỉ nhà máy SX</label>
          </v-flex>
          <v-flex xs12 sm9>
          	<v-text-field
          	class="py-0"
          	clearable
          	v-model="tcDiaChiNhaMaySX"
          	placeholder="Nhập địa chỉ nhà máy sản xuất"
          	></v-text-field>
          </v-flex>
        </v-layout>
      </v-flex>

      <v-flex xs12 sm2 class="text-xs-right">
      	<label class="mr-3 my-0" style="padding-top: 15px;">Số BC COP</label>
      </v-flex>

      <v-flex xs12 sm4>
      	<v-text-field
      	class="py-0 pr-2"
      	clearable
      	v-model="tcSoBCCOP"
      	placeholder="Nhập số báo cáo COP"
      	></v-text-field>
      </v-flex>
		
	   <v-flex xs12 sm6 class="pl-3">
        <v-layout row wrap>
          <v-flex xs12 sm3 class="text-xs-left">
            <label class="my-0" style="padding-top: 15px;">Tiêu chuẩn khí thải</label>
          </v-flex>
          <v-flex xs12 sm9>
          	<v-text-field
          	class="py-0"
          	clearable
          	v-model="tcTieuChuanKhiThai"
          	placeholder="Nhập tiêu chuẩn khí thải"
          	></v-text-field>
          </v-flex>
        </v-layout>
      </v-flex>

      <v-flex xs12 sm2 class="text-xs-right">
      	<label class="mr-3 my-0" style="padding-top: 15px;">Phương thức cấp phôi phiếu</label>
      </v-flex>

      <v-flex xs12 sm4>
      	<v-select
      	item-text="itemName"
      	item-value="itemCode"
      	clearable
      	:items="tcPhuongThucCapPPItems"
      	placeholder="------Lựa chọn--------"
      	v-model="tcPhuongThucCapPP"
      	class="py-0 pr-2"
      	></v-select>
      </v-flex>

		<v-flex xs12 sm6 class="pl-3">
        <v-layout row wrap class="ml-0">
          <v-flex xs12 sm7 class="text-xs-left">
          	<label class="mt-3">Ghi chú &nbsp;&nbsp;&nbsp; <span style="color: red;">(*)</span> Chỉ lọc thông số kỹ thuật theo </label>
          </v-flex>
          <v-flex xs12 sm5>
          	<input type="checkbox" class="mt-3" id="checkboxDoiTuong" v-model="tcDoiTuongCb"> <label for="checkboxDoiTuong">Đối tượng</label>
          	<input type="checkbox" id="checkboxLoaiPT" v-model="tcLoaiPhuongTienCb"> <label for="checkboxLoaiPT">Loại phương tiện</label>
          	<!-- <v-checkbox label="Đối tượng" v-model="tcDoiTuongCb" light></v-checkbox>
          	<v-checkbox label="Loại phương tiện" v-model="tcLoaiPhuongTienCb" light></v-checkbox> -->
          </v-flex>
        </v-layout>
      </v-flex>

      <!-- <v-flex xs12 sm2 class="text-xs-right">
      	<label class="mr-3 my-0" style="padding-top: 15px;">KQ cấp chứng chỉ</label>
      </v-flex>
      <v-flex xs12 sm4>
      	<v-select
      	item-text="itemName"
      	item-value="itemCode"
      	:items="tcKetQuaItems"
      	clearable
      	placeholder="------Lựa chọn--------"
      	v-model="tcKetQua"
      	class="py-0 pr-2"
      	></v-select>
      </v-flex> -->

      <v-flex xs12 sm12>
        <v-data-table
          :headers="headersThemDieuKien"
          :items="itemsThemDieuKien"
          no-data-text="Không có dữ liệu"
          hide-actions
          class="table__overflow pl-3 pr-3 mt-3 mb-2"
          loading="true"
          hide-actions
          >
          <template slot="headers" slot-scope="props">
            <tr>
              <th v-for="header in props.headers" :key="header.text"
              :class="['column text-xs-center']" v-html="header.text"
              >
              </th>
            </tr>
          </template>
          <template slot="items" slot-scope="props">
            <td style="padding: 8px;" class="text-xs-center">
              <v-chip label small outline color="red" style="cursor: pointer;" @click="deleteDieuKienLoc(props.index)">Xóa</v-chip>
            </td>
            <td style="padding: 8px;" class="text-xs-center">
            	<v-select
            	item-text="itemName"
            	item-value="itemCode"
            	clearable
            	:items="tcLoaiPhuongTienItems"
            	placeholder="------Lựa chọn--------"
            	v-model="props.item['addLoaiPhuongTien']"
            	class="py-0"
            	></v-select>
            </td>
            <td style="padding: 8px;" class="text-xs-center">
            	<v-select
            	item-text="itemName"
            	item-value="itemCode"
            	clearable
            	:items="tcThongSoKyThuatItems"
            	placeholder="------Lựa chọn--------"
            	v-model="props.item['addTenThongSoKT']"
            	class="py-0"
            	></v-select>
            </td>
            <td style="padding: 8px;" class="text-xs-center">
            	<v-select
            	item-text="itemName"
            	item-value="itemCode"
            	clearable
            	:items="tcSoSanhItems"
            	placeholder="------Lựa chọn--------"
            	v-model="props.item['addSoSanh']"
            	class="py-0"
            	></v-select>
            </td>
            <td style="padding: 8px;" class="text-xs-center">
            	<v-text-field
            	class="py-0"
            	clearable
            	v-model="props.item['addGiaTri']"
            	></v-text-field>
            </td>
          </template>
        </v-data-table>
      </v-flex>
    </v-layout>
  </v-flex>
  <v-flex xs12 sm6>
  	<v-btn color="primary" class="pr-3" @click="themDieuKienLoc()" small>Thêm điều kiện</v-btn>
  	<v-btn color="primary" small @click="timKiem()">Tìm kiếm</v-btn>
  </v-flex>
  <v-flex xs12 sm6 class="text-xs-right pr-2">
  	<v-btn color="primary" small @click="donDep()">Dọn dẹp</v-btn>
  </v-flex>
</v-layout>

<div class="row-header flex-break" v-if="!detailPage">

    <div class="background-triangle-big"> Tra cứu phương tiện</div>

    <div class="layout row wrap header_tools w-100-xs">

        <div class="flex w-100-xs" jx-bind="keywordsSearchTraCuuPhuongTien"></div>

        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen_exit</v-icon></v-btn>

    </div>

</div>

</v-slide-x-transition>

<v-slide-x-transition>

    <!-- <div class="layout wrap" jx-bind="paymentList" v-if="!detailPage"></div> -->
    <v-layout row wrap class="ml-3">
      <v-flex xs12 sm12 class="text-xs-right">
      	<div v-if="loadingPTSXLR" class="text-xs-center">
      		<v-progress-circular indeterminate v-bind:size="70" v-bind:width="2" color="purple"></v-progress-circular>
      	</div>
      	<v-data-table
      	:headers="headersPTSXLR"
      	:items="itemsPTSXLR"
      	no-data-text="Không có dữ liệu"
      	hide-actions
      	class="table__overflow ml-0"
      	loading="true"
      	hide-actions
      	>
      	<template slot="headers" slot-scope="props">
      		<tr>
      			<th v-for="header in props.headers" :key="header.text"
      			:class="['column text-xs-center']" v-html="header.text"
      			>
      		</th>
      	</tr>
      </template>
      <template slot="items" slot-scope="props">
      	<td style="padding: 8px; padding-left: 0px; width: 3%; " class="text-xs-center">
      		{{ pagePTSXLR * 15 - 15 + props.index + 1 }}
      	</td>
      	<td style="padding: 8px;" class="text-xs-center">
      		<span>{{props.item.soDKKT}}</span>
      		<br v-if="props.item.ngayDKKT">
      		<span>{{props.item.ngayDKKT}}</span>
      	</td>
      	<td style="padding: 8px;" class="text-xs-center">
      		<span>{{props.item.soBBKT}}</span>
      		<br v-if="props.item.ngayBBKT">
      		<span>{{props.item.ngayBBKT}}</span>
      	</td>
      	<td style="padding: 8px;" class="text-xs-center">
      		<span>{{props.item.soChungChi}}</span>
      		<br v-if="props.item.ngayCap">
      		<span>{{props.item.ngayCap}}</span>
      	</td>
      	<td style="padding: 8px;;" class="text-xs-center">
      		{{props.item.soKhung}}
      	</td>
      	<td style="padding: 8px;" class="text-xs-center">
      		{{props.item.soDongCo}}
      	</td>
      	<td style="padding: 8px;" class="text-xs-center">
      		<span>{{props.item.mauSon}}</span>
      		<br v-if="props.item.namSanXuat">
      		<span>{{props.item.namSanXuat}}</span>
      	</td>
      	<td style="padding: 8px;" class="text-xs-center">
      		{{props.item.tenDoanhNghiep}}
      	</td>
      	<td style="padding: 8px;" class="text-xs-center">
      		<span style="cursor: pointer;">Xem</span>
      	</td>
      </template>
  </v-data-table>
  <v-pagination :length="lengthPTSXLR" v-model="pagePTSXLR" class="mr-3 mt-3"></v-pagination>
</v-flex>
    </v-layout>
	
</v-slide-x-transition>
