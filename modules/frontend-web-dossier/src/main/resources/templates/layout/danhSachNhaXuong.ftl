<template> 
  <v-slide-x-transition>

    <div class="row-header flex-break">

      <div class="background-triangle-big"> Ánh xạ thông tin doanh nghiệp</div>

      <div class="layout row wrap header_tools w-100-xs">

        <div class="flex w-100-xs" jx-bind="keywordsSearchTraCuuDoanhNghiep"></div>

        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen_exit</v-icon></v-btn>

        <v-btn flat class=" my-0 py-0 btn-border-left" color="grey darken-1" v-on:click.native="quayLaiTTDN()">
          Quay lại
        </v-btn>
      </div>
      
    </div>

  </v-slide-x-transition>
  <v-slide-x-transition>
    <v-card>
      <v-layout row wrap class="ml-0 pt-2"  id="main">

            <v-flex xs12 sm6>
              <v-layout row wrap class="ml-0">
                <v-flex xs12 sm3 class="text-xs-right">
                  <span style="padding: 10px 10px 0;">Tài khoản: </span>
                </v-flex>
                <v-flex xs12 sm9>
                  <label>{{detailRegistModel.applicantIdNo}}</label>
                </v-flex>
              </v-layout>
            </v-flex>

            <v-flex xs12 sm6>
              <span style="padding: 10px 10px 0;">Tình trạng: </span> <label>{{detailRegistModel['lock'] ? 'Khóa' : 'Mở khóa'}}</label>
            </v-flex>

            
            <v-flex xs12 sm6>
              <v-layout row wrap class="ml-0">
                <v-flex xs12 sm3 class="text-xs-right">
                  <p style="padding: 5px 10px 0px">Tên doanh nghiệp</p>
                </v-flex>
                <v-flex xs12 sm9>
                  <v-text-field
                  class="pt-0"
                  v-model="detailRegistModel['applicantName']"
                  ></v-text-field>
                  <label>{{applicantOracle.applicantName ? '[ORACLE]' : ''}} {{applicantOracle.applicantName}}</label>
                </v-flex>
              </v-layout>
              
              <v-layout row wrap class="ml-0">
                <v-flex xs12 sm3 class="text-xs-right">
                  <p style="padding: 5px 10px 0px;">Địa chỉ doanh nghiệp</p>
                </v-flex>
                <v-flex xs12 sm9>
                  <v-text-field
                  class="pt-0"
                  rows="8"
                  v-model="detailRegistModel['address']"
                  multi-line
                  ></v-text-field>
                  <label>{{applicantOracle.address ? '[ORACLE]' : ''}} {{applicantOracle.address}}</label>
                </v-flex>
              </v-layout>

            </v-flex>

            <v-flex xs12 sm6>
              <v-layout row wrap class="ml-0 pr-2">
                <v-flex xs12 sm12 class="ml-2" style="height: 210px; border-radius: 3px; border: 1px solid #ccc;">
                  <v-layout row wrap class="ml-0">
                    <v-flex xs12 sm6 class="px-1">
                      <v-text-field
                        class="py-0"
                        placeholder="Tên"
                        @keyup.enter="searchApplicantOracle()"
                      ></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm6>
                      <v-text-field
                        class="py-0"
                        placeholder="Địa chỉ"
                        append-icon="search"
                        @keyup.enter="searchApplicantOracle()"
                      ></v-text-field>
                    </v-flex>
                  </v-layout>
                  <v-list class="list_li_active" style="height: 100%; height: 172px; overflow: auto;">
                    <v-list-tile :class="{active: indexListDnOracle === index}" v-for="(doanhnghiep, index) in doanhNghiepOracles" v-bind:key="doanhnghiep.name" @click="anhXaOracle(doanhnghiep, index)">
                      <v-list-tile-content>
                        <v-list-tile-title>{{doanhnghiep.applicantName}} - {{doanhnghiep.applicantIdNo}}</v-list-tile-title>
                      </v-list-tile-content>
                    </v-list-tile>
                  </v-list>
                </v-flex>
              </v-layout>
            </v-flex>

            <v-flex xs12 sm1></v-flex>
            <v-flex xs12 sm2>
              <v-checkbox label="CS Thiết kế"
              v-model="csthietke"
              hide-details></v-checkbox>
            </v-flex>
            <v-flex xs12 sm2>
              <v-checkbox label="CS Nhập khẩu"
              v-model="csnhapkhau"
              hide-details></v-checkbox>
            </v-flex>
            <v-flex xs12 sm2>
              <v-checkbox label="CS Sản xuất lắp ráp"
              v-model="cssanxuat"
              hide-details></v-checkbox>
            </v-flex>
            <v-flex xs12 sm3>
              <v-checkbox label="CS Bảo hành bảo dưỡng"
              v-model="csbaohanh"
              hide-details></v-checkbox>
            </v-flex>

            <v-flex xs12 sm2></v-flex>
            
            <v-flex xs12 sm1></v-flex>
            <v-flex xs12 sm11>
                  <p>- Giấy chứng nhận đăng ký doanh nghiệp : <a href="javascript:;">Xem link</a></p>
            </v-flex>
            
            <v-flex xs12 sm1></v-flex>
            <v-flex xs12 sm11>
                  <p>- Giấy chứng nhận đủ điều kiện sản xuất, lắp ráp ôtô : <a href="javascript:;">Xem link</a></p>
            </v-flex>

            <v-flex xs12 sm3 class="px-1" id="abc" style="height: 200px;">
              <!-- <label>Nhà xưởng nguồn</label> -->
              <div style="border:1px solid #ccc; border-radius: 3px;">
                <v-text-field
                class="py-0"
                placeholder="Nhà xưởng nguồn"
                append-icon="search"
                @keyup.enter="searchNxSource()"
                ></v-text-field>
                <v-list class="list_li_active" style="height: 100%; height: 150px; overflow: auto;">
                  <v-list-tile :class="{active: indexListNxSource === index}" v-for="(item, index) in itemsAnhXaNguon" v-bind:key="item.name" @click="anhXaNguon(item, index)">
                    <v-list-tile-content>
                      <v-list-tile-title>{{item.name}}</v-list-tile-title>
                    </v-list-tile-content>
                  </v-list-tile>
                </v-list>
              </div>
            </v-flex>

            <v-flex xs12 sm6 class="text-xs-center" style="height: 196px; border:1px solid #ccc; border-radius: 3px;">
              <!-- <label>Ánh xạ</label> -->
              <v-layout row wrap class="ml-0">
                <v-flex xs12 sm6>
                  <v-text-field
                  class="py-0 px-1"
                  placeholder="Tên"
                  @keyup.enter="searchNxMap()"
                  ></v-text-field>
                </v-flex>
                <v-flex xs12 sm6>
                  <v-text-field
                  class="py-0"
                  placeholder="Địa chỉ"
                  append-icon="search"
                  @keyup.enter="searchNxMap()"
                  ></v-text-field>
                </v-flex>
              </v-layout>
              <v-list class="list_li_active" style="height: 100%; height: 150px; overflow: auto;">
                <v-list-tile :class="{active: indexListNxMap === index}" v-for="(item, index) in itemsAnhXa" v-bind:key="item.name" @click="anhXaMap(item, index)">
                  <v-list-tile-content>
                    <v-list-tile-title>{{item.name}}</v-list-tile-title>
                  </v-list-tile-content>
                </v-list-tile>
              </v-list>
            </v-flex>

            <v-flex xs12 sm3 class="px-1" id="abc" style="height: 200px;">
              <!-- <label>Nhà xưởng đích</label> -->
              <div style="border:1px solid #ccc; border-radius: 3px;">
                <v-text-field
                class="py-0"
                placeholder="Nhà xưởng đích"
                append-icon="search"
                @keyup.enter="searchNxDestination()"
                ></v-text-field>
                <v-list class="list_li_active" style="height: 100%; height: 150px; overflow: auto;">
                  <v-list-tile :class="{active: indexListNxDestination === index}" v-for="(item, index) in itemsAnhXaDich" v-bind:key="item.title" @click="anhXaDestination(item, index)">
                    <v-list-tile-content>
                      <v-list-tile-title>{{item.name}}</v-list-tile-title>
                    </v-list-tile-content>
                  </v-list-tile>
                </v-list>

              </div>
            </v-flex>
        </v-layout>
    </v-card>
  </v-slide-x-transition>
</template>

