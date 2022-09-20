<div style="width: 100%;">
  <v-slide-x-transition>

    <div class="row-header flex-break" v-if="!detailPage">

      <div class="background-triangle-big"> <v-icon flat fab color="white" class="setting_action_all">settings</v-icon> Danh sách phiếu xuất xưởng </div>

      <div class="layout row wrap header_tools w-100-xs">
        <div class="flex w-100-xs"></div>
        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen_exit</v-icon></v-btn>

      </div>

    </div>

  </v-slide-x-transition>
  <v-slide-x-transition>
    <div>
      <v-layout row wrap class="ml-0" style="background-color: #fff;">
        <v-flex xs12 sm12>
          <v-layout row wrap class="ml-4">
            <v-flex xs12 sm2 class="">
              <v-subheader class="pl-0">Kiểm kê kho phiếu </v-subheader>
            </v-flex>
            <v-flex xs12 sm4 class="mb-2">
              <v-select
              :items="doiPhongItems"
              item-text="itemName"
              item-value="itemCode"
              placeholder="Chọn đội/ phòng"
              v-model="searchDoiPhong"
              @change="changeDoiPhong()"
              clearable
              ></v-select>
            </v-flex>
            <v-flex xs12 sm6 class="mb-2 mt-3">
              <v-btn color="primary" small @click="nhapKhoAction()"><!-- <v-icon>add</v-icon> --> Nhập kho</v-btn>
              <#-- <v-btn color="primary" small @click="xuatKhoAction()"> Xuất kho</v-btn> -->
              <v-btn color="primary" small @click="dieuChuyenAction()"><!-- <v-icon>add</v-icon> --> Điều chuyển</v-btn>

              <v-btn color="primary" small @click="phieuHongAction()"><!-- <v-icon>add</v-icon> --> Phiếu hỏng, gửi CS</v-btn>
            </v-flex>
          </v-layout>
          <v-layout row wrap class="ml-4">
            <v-flex xs12 sm4 class="mb-2">
              <v-text-field
              v-model="soSerial"
              placeholder="Nhập số serial"
              clearable
              class="pr-3"
              ></v-text-field>
            </v-flex>
            <v-flex xs12 sm3 class="mb-2">
              <v-select
              :items="mauPhoiItems"
              item-text="itemName"
              item-value="itemCode"
              placeholder="Mẫu phôi"
              clearable
              v-model="searchMauPhoi"
              class="pr-3"
              ></v-select>
            </v-flex>
            <v-flex xs12 sm2 class="mb-2">
              <v-select
              :items="namItems"
              placeholder="Chọn năm"
              clearable
              v-model="searchNam"
              ></v-select>
            </v-flex>
            <v-flex xs12 sm3 class="mb-2 mt-3">
              <v-btn color="primary" small @click="xemPhieuXX()"><!-- <v-icon>search</v-icon> --> Xem</v-btn>
              <v-btn color="primary" small @click="xuatExel()"><!-- <v-icon>import_export</v-icon> --> Xuất Exel</v-btn>
            </v-flex>
          </v-layout>
          <span class="ml-4 mb-2">Tổng số: {{totalPxx}}</span>
        </v-flex>
      </v-layout>
      <v-layout row wrap class="ml-0">
        <v-flex xs12 sm12 class="text-xs-right">
          <div v-if="loadingPxx" class="text-xs-center">
            <v-progress-circular indeterminate v-bind:size="70" v-bind:width="2" color="purple"></v-progress-circular>
          </div>
          <v-data-table
          :headers="headersPxx"
          :items="itemsPxx"
          no-data-text="Không có dữ liệu"
          hide-actions
          class="table__overflow ml-0"
          loading="true"
          hide-actions
          v-else
          >
          <template slot="headers" slot-scope="props">
            <tr>
              <th v-for="header in props.headers" :key="header.text"
              :class="['column text-xs-center']" v-html="header.text"
              >
              <!-- {{ header.text }} -->
              </th>
            </tr>
          </template>
          <template slot="items" slot-scope="props">
            <td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
              {{ pagePxx * 15 - 15 + props.index + 1 }}
            </td>
            <#-- <td style="padding: 8px;" class="text-xs-center">
              <v-chip label outline color="primary" small style="cursor: pointer;" @click="kiemKeAction(props.item)">Kiểm kê</v-chip>
              
            </td> -->
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['nam'] || '---'}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['stampType']}}
            </td>
            <td style="padding: 8px;;" class="text-xs-center">
              {{props.item['stampShortNo']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['serialStartNo']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['serialEndNo']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['subTotalInDocument']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{parseInt(props.item['sum1']) + parseInt(props.item['sum2'])}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['sum3']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['sum3']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              <span v-if="tonTrenSo(props.item) >= 0">
                {{tonTrenSo(props.item)}} <i class="material-icons" style="color: #8cea20; font-size: x-large;">arrow_drop_up</i>
              </span>
              <span v-else>
                {{Math.abs(tonTrenSo(props.item))}} <i class="material-icons" style="color: #f13737; font-size: x-large;">arrow_drop_down</i>
              </span>
            </td>
            <!-- <td style="padding: 8px;" class="text-xs-center">
              {{props.item.chenhLechGiam}}
            </td> -->
            <td style="padding: 8px;" class="text-xs-center">
              <#-- <br v-if="props.item.lyDo" />
              {{props.item['remark']}} -->
            </td>
          </template>
        </v-data-table>
        <v-pagination :length="lengthPxx" v-model="pagePxx" class="mt-3"></v-pagination>
      </v-flex>
    </v-layout>
    </div>

  </v-slide-x-transition>
  </div>
  <style>
  button.btn.btn--small.primary > div.btn__content {
    text-transform: none !important;
  }
  </style>
