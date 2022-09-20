<v-slide-x-transition>

<div class="row-header flex-break" v-if="!detailPage && !detailRegistPage">

    <div class="background-triangle-big"> Tra cứu doanh nghiệp</div>

    <div class="layout row wrap header_tools w-100-xs">

        <div class="flex w-100-xs" jx-bind="keywordsSearchTraCuuDoanhNghiep"></div>

        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen_exit</v-icon></v-btn>
		
		<!-- <v-btn flat class=" my-0 py-0 btn-border-left" color="grey darken-1" v-on:click.native="addRegistrations()">
					<v-icon class="mr-2">assignment</v-icon>
			Tạo mới
		</v-btn> -->
    </div>

</div>

</v-slide-x-transition>

<v-slide-x-transition>
    <div style="width: 100%; background-color: #fff;">
        <v-layout row wrap class="pt-2 pb-2">
          <v-flex xs12 sm2 class="text-xs-right">
            <label class="mr-3 my-0" style="padding-top: 15px;">Tên doanh nghiệp</label>
          </v-flex>
          <v-flex xs12 sm4>
            <v-text-field
            v-model="ttdnMaDoanhNghiep"
            placeholder="Nhập tên doanh nghiệp"
            clearable
            class="py-0"
            ></v-text-field>
          </v-flex>
          <v-flex xs12 sm2 class="text-xs-right">
            <label class="mr-3 my-0" style="padding-top: 15px;">Mã số thuế</label>
          </v-flex>
          <v-flex xs12 sm4>
            <v-text-field
            v-model="ttdnMaSoThue"
            placeholder="Nhập mã số thuế"
            clearable
            class="py-0 pr-3"
            ></v-text-field>
          </v-flex>

          <v-flex xs12 sm2 class="text-xs-right">
            <label class="mr-3 my-0" style="padding-top: 15px;">Loại hình</label>
          </v-flex>
          <v-flex xs12 sm4>
            <v-select
            item-text="itemName"
            clearable
            placeholder="Chọn loại hình"
            item-value="itemCode"
            :items="ttdnLoaiHinhItems"
            v-model="ttdnLoaiHinh"
            class="py-0"
            ></v-select>
          </v-flex>
          <v-flex xs12 sm2 class="text-xs-right">
            <label class="mr-3 my-0" style="padding-top: 15px;">Tình trạng</label>
          </v-flex>
          <v-flex xs12 sm4>
            <v-select
            item-text="itemName"
            clearable
            placeholder="Chọn tình trạng"
            item-value="itemCode"
            :items="ttdnTinhTrangItems"
            v-model="ttdnTinhTrang"
            class="py-0 pr-3"
            ></v-select>
          </v-flex>

          <v-flex xs12 sm2 class="text-xs-right">
            <label class="mr-3 my-0" style="padding-top: 15px;">Địa chỉ</label>
          </v-flex>
          <v-flex xs12 sm10>
            <v-text-field
            v-model="ttdnDiaChi"
            placeholder="Nhập địa chỉ"
            clearable
            class="py-0 pr-3"
            ></v-text-field>
          </v-flex>

          <v-flex xs12 sm12 class="text-xs-right">
            <v-btn color="primary" small @click="timKiemTTDN()">Tìm kiếm</v-btn>
          </v-flex>
        </v-layout>
    </div>
</v-slide-x-transition>

<v-slide-x-transition>
    
    <!-- <v-layout row wrap>
        <v-flex xs12 sm12>
          
        </v-flex>
    </v-layout>
 -->
    <div class="layout wrap" jx-bind="thongTinDoanhNghiepTable"></div>

</v-slide-x-transition>
