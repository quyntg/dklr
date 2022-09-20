<template>
  
  <v-slide-x-transition>

    <div class="row-header flex-break">

      <div class="background-triangle-big"> Lịch sử chuyển đổi</div>

      <div class="layout row wrap header_tools w-100-xs">

        <div class="flex w-100-xs"></div>

        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen_exit</v-icon></v-btn>

        <v-btn flat class=" my-0 py-0 btn-border-left" color="grey darken-1" v-on:click.native="backToDnTrongNuoc()">
          Quay lại
        </v-btn>
      </div>
    </div>

  </v-slide-x-transition>
    
  <v-slide-x-transition>
    <v-card  style="margin: 0px auto;  " >
      <v-flex xs10 d-flex style="margin: 0px auto; margin-top: 30px;">
            <v-flex xs6 >
              <v-flex xs8 style="margin: 0px auto;">
                <v-card style="height: 58px!important;">
                  <v-btn
                  absolute
                  top
                  left 
                  small
                  >
                  <div>Phân loại</div>
                </v-btn>
                <v-radio-group class="pt-1 pl-2" v-model="nguon" row>
                  <v-radio label="Trong nước" value="nguon1"></v-radio>
                  <v-radio label="Ngoài nước" value="nguon2"></v-radio>
                </v-radio-group>
              </v-card>
            </v-flex>
          </v-flex>
          <v-flex xs6>
            <v-flex xs8 style="margin: 0px auto;">
              <v-card style="height: 58px!important;">
                <v-btn
                absolute
                top
                left
                small
                >
                <div>Trạng thái</div>
              </v-btn>
              <v-radio-group class="pt-1 pl-2" v-model="row" row >
                <v-radio ml-4 label="Không sẵn sàng" value="radio-1" ></v-radio>
                <v-radio label="Sẵn sàng" value="radio-2"></v-radio>
              </v-radio-group>
            </v-card>
          </v-flex>
        </v-flex>
      </v-flex>
      <v-flex xs10 d-flex  style="margin: 0px auto;">
       <v-flex xs9 >
         <v-flex xs12 d-flex style=" height:49px;">
          <v-flex xs2 style="max-width:14%;"><label class="my-4" style="font-weight: bold; color:rgba(0,0,0,0.89);">Tên nhà xưởng:</label></v-flex>
          <v-flex  xs9 class="">
            <v-text-field  name="" placeholder="Nhập tên nhà xưởng" class=""  ></v-text-field>
          </v-flex >
        </v-flex > 
        <v-flex xs12 d-flex >
          <v-flex xs2 style="max-width:14%;"><label class="my-4" style="font-weight: bold; color:rgba(0,0,0,0.89);">Địa chỉ nhà xưởng:</label></v-flex>
          <v-flex  xs9 class="">
            <v-text-field   name="" placeholder="Nhập địa chỉ nhà xưởng" class=""  ></v-text-field>
          </v-flex >
        </v-flex >
      </v-flex>
      <v-flex xs3>
       <v-flex xs12 style="display: flex; height:63px;">
        <v-flex xs4><label class="my-4" style="font-weight: bold; color:rgba(0,0,0,0.89);">Mã NX:</label></v-flex>
        <v-flex  xs9 class="">
          <v-text-field  v-model="search"  name="" placeholder="Nhập MST" class=""></v-text-field>
        </v-flex >
      </v-flex >
      <v-flex xs12 >
        <v-btn color="primary" small>Tìm kiếm</v-btn>
      </v-flex>
    </v-flex>
    </v-flex>
      <v-data-table
          v-bind:headers="headersTTDN"
          v-bind:items="itemsThongTinNX"
          v-bind:search="search" 
          pagination.sync 
          >
          <template slot="items" slot-scope="props"  >
            <td class="text-xs-center">{{ props.item.id }}</td>
            <td class="text-xs-center">{{ props.item.name }}</td>
            <td class="text-xs-left">{{ props.item.tendoanhnghiep }}</td>
            <td class="text-xs-left">{{ props.item.diachi }}</td>
            <td class="text-xs-center">{{ props.item.phanloai }}</td>
            <td class="text-xs-center">{{ props.item.trangthai }}</td>
            <td class="text-xs-center"><span><a href="#">Khóa</a> | <a href="">Mở khóa</a></span></td>
          </template>
          <template slot="pageText" slot-scope="{ pageStart, pageStop}">
            Từ {{ pageStart }} đến {{ pageStop }}
          </template>
      </v-data-table>

    </v-card>
  </v-slide-x-transition>
</template>
<!-- <style>
body{
  font-size: 13px;
}
.btn--loader .btn__loading span{
  font-size: 12px;
}
  .background-triangle-big {
  background-color: #0b72ba;
  display: inline-block;
  padding: 9px 15px;
  width: auto;
  text-align: right;
  color: white;
  position: relative;
  margin-right: 20px;
  text-transform: uppercase;
  cursor: pointer;
}
.background-triangle-small {
  background-color: #0b72ba;
  display: inline-block;
  padding: 3px;
  width: 25px;
  text-align: right;
  color: white;
  position: relative;
  margin-right: 20px;
  text-transform: uppercase;
}

.background-triangle-small + div.header_tools, .background-triangle-big + div.header_tools {
  width: -webkit-calc( 100% - 100% );
  width: calc(100% - 100% );
  align-items: center
}
.background-triangle-big:before {
  content: "";
  position: absolute;
  top: 1px;
  -webkit-transform: rotate(45deg);
  transform: rotate(45deg);
  right: -4px;
  border-top: 28px solid #0b72ba;
  border-left: 28px solid transparent;
  border-bottom: 28px solid transparent;
}
.background-triangle-small:before {
  content: "";
  position: absolute;
  top: 1px;
  -webkit-transform: rotate(45deg);
  transform: rotate(45deg);
  right: -2px;
  border-top: 19px solid #0b72ba;
  border-left: 19px solid transparent;
  border-bottom: 19px solid transparent
}
.text-right {
  text-align: right;
}
table td{
  border: 1px solid #dee2e6;
  border-right: none;
}
.table thead th{
  border-bottom: none;
}
table th{
  border: 1px solid #dee2e6;
  border-top:none;
  vertical-align: inherit!important;
}
table.table thead th:first-child{
  padding: 0px;
}
td{
  vertical-align: inherit!important;
}
.btn--top.btn--absolute{
  top:-22px;
}
.accent--text{
  color: #005caf!important;
  caret-color: #005caf!important;
}
.input-group {
  margin-left: 15px;
}
.input-group.input-group--selection-controls:not(.input-group--disabled) label{
  color: black;
}
.input-group--text-field input{
  border-bottom: 1px solid;
}
.btn:not(.btn--depressed){
  -webkit-box-shadow: none;
  box-shadow: none;
}
.input-group.input-group--solo{
  margin: 0px;
  min-height: 0px;
  height: 19px;
}
.timkiem.input-group--text-field input{
  border: none;
}
label{
  opacity: 0.5;
}
</style>
 -->