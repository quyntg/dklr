<template>
  <v-slide-x-transition>

    <div class="row-header flex-break" v-if="!detailPage && !detailRegistPage">

      <div class="background-triangle-big"> khóa, mở khóa thông tin doanh nghiệp trong nước</div>

      <div class="layout row wrap header_tools w-100-xs">

        <div class="flex w-100-xs" jx-bind="keywordsSearchTraCuuDoanhNghiep"></div>

        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen_exit</v-icon></v-btn>
      </div>
      
    </div>

  </v-slide-x-transition>

<v-slide-x-transition>
    <div style="width: 100%; background-color: #fff;">
        <v-card>
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
                    <div>Nguồn</div>
                  </v-btn>
                  <v-radio-group class="pt-1 pl-2"  v-model="nguon" row>
                    <v-radio label="MTCORE" value="nguon1"></v-radio>
                    <v-radio label="ORACLE" value="nguon2"></v-radio>
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
                  <v-radio-group class="pt-1 pl-2"  v-model="row" row >
                    <v-radio ml-4 label="Không sẵn sàng" value="radio-1" ></v-radio>
                    <v-radio label="Sẵn sàng" value="radio-2"></v-radio>
                  </v-radio-group>
              </v-card>
              </v-flex>
            </v-flex>
          </v-flex>
           <v-flex xs10 d-flex  style="margin: 0px auto;">
             <v-flex xs12 sm9 >
               <v-flex xs12 style="display: flex; height:49px;">
                  <v-flex xs2 style="max-width:14%;"><p class="my-4" style="font-weight: bold; color:rgba(0,0,0,0.89);">Tên doanh nghiệp:</p></v-flex>
                  <v-flex  xs9 >
                    <v-text-field  name=""   placeholder="Nhập tên doanh nghiệp" chips  ></v-text-field>
                  </v-flex >
                </v-flex > 
                <v-flex xs12 style="display: flex;">
                  <v-flex xs style="max-width:14%;"><p class="my-4" style="font-weight: bold; color:rgba(0,0,0,0.89);">Địa chỉ:</p></v-flex>
                  <v-flex  xs9 class="">
                    <v-text-field  name=""  placeholder="Nhập địa chỉ" class=""  ></v-text-field>
                  </v-flex >
                </v-flex >
             </v-flex>
             <v-flex xs12 sm3>
               <v-flex xs12 style="display: flex; height:63px;">
                  <v-flex xs3><p class="my-4" style="font-weight: bold; color:rgba(0,0,0,0.89);">MST:</p></v-flex>
                  <v-flex  xs9 class="">
                    <v-text-field   name="" placeholder="Nhập MST" class="" ></v-text-field>
                  </v-flex >
                </v-flex >
                <v-flex xs12 >
                  <v-btn color="primary" small>Tìm kiếm</v-btn>
                </v-flex>
             </v-flex>
           </v-flex>
          <v-data-table
              v-bind:headers="headersTTDN"
              v-bind:items="thongTinDoanhNghiepTableItems"
              v-bind:search="search"
            >
            <template slot="items" slot-scope="props"  >
              <td class="text-xs-center">{{ props.item['stt'] }}</td>
              <td class="text-xs-center" @click="toDetailDsNhaXuong(props.item)">{{ props.item.applicantIdNo }}</td>
              <td class="text-xs-left" @click="toDetailDsNhaXuong(props.item)">{{ props.item.applicantName }}</td>
              <td class="text-xs-left">{{ props.item.address }}</td>
              <td class="text-xs-center">{{ props.item['nguon'] }}</td>
              <td class="text-xs-center">{{ props.item['trangthai'] }}</td>
              <td class="text-xs-center"><span><a href="#">Khóa</a> | <a href="">Mở khóa</a></span></td>
            </template>
            <template slot="pageText" slot-scope="{ pageStart, pageStop}">
              Từ {{ pageStart }} đến {{ pageStop }}
              
            </template>
            
          </v-data-table>
    
        </v-card>
    </div>
</v-slide-x-transition>

  
</template>