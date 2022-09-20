<div style="width: 100%;">
  <v-slide-x-transition>

    <div class="row-header flex-break" v-if="!detailPage">

      <div class="background-triangle-big"> <v-icon flat fab color="white" class="setting_action_all">settings</v-icon> Kiểm kê thực tế </div>

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
            <v-flex xs12 sm2 class="text-xs-right">
              <label class="pr-2 text-xs-right pt-2">Đơn vị </label>
            </v-flex>
            <v-flex xs12 sm4 class="mb-2">
              <v-select
              :items="donViNhapItems"
              item-text="itemName"
              item-value="itemCode"
              clearable
              autocomplete
              v-model="filterKiemKe['corporationCode']"
              class="pt-0"
              ></v-select>
            </v-flex>
            <v-flex xs12 sm6 class="mb-2 mt-3">
              
            </v-flex>
          </v-layout>
          <v-layout row wrap class="ml-4">

            <v-flex xs12 sm2 class="text-xs-right">
              <label class="pr-2 text-xs-right pt-2">Từ ngày </label>
            </v-flex>
            <v-flex xs12 sm2 class="mb-2">
              <v-menu
                ref="menuNN"
                :close-on-content-click="false"
                v-model="menuInventoryTransactionDateFrom"
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
                v-model="filterKiemKe['inventoryTransactionDateFrom']"
                prepend-icon="event"
                clearable
                class="pt-0"
                readonly
                ></v-text-field>
                <v-date-picker v-model="dateInventoryTransactionDateFrom" @input="parseInventoryTransactionDateFrom()"></v-date-picker>
              </v-menu>
            </v-flex>

            <v-flex xs12 sm1 class="text-xs-right">
              <label class="pr-2 text-xs-right pt-2">Đến ngày </label>
            </v-flex>
            <v-flex xs12 sm2 class="mb-2">
              <v-menu
                ref="menuNN"
                :close-on-content-click="false"
                v-model="menuInventoryTransactionDateTo"
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
                v-model="filterKiemKe['inventoryTransactionDateTo']"
                prepend-icon="event"
                clearable
                class="pt-0"
                readonly
                ></v-text-field>
                <v-date-picker v-model="dateInventoryTransactionDateTo" @input="parseInventoryTransactionDateTo()"></v-date-picker>
              </v-menu>
            </v-flex>

            <v-flex xs12 sm4 class="mb-2">
              <v-btn color="primary" small @click="loadDSKiemKePhieu()">Tìm kiếm</v-btn>
              <v-btn color="primary" small @click="addVrInventoryReport()">Tạo mới</v-btn>
            </v-flex>
          </v-layout>
          <span class="ml-4 mb-2">Tổng số: {{totalkiemKe}}</span>
        </v-flex>
      </v-layout>
      <v-layout row wrap class="ml-0">
        <v-flex xs12 sm12 class="text-xs-right">
          <div v-if="loadingKiemKe" class="text-xs-center">
            <v-progress-circular indeterminate v-bind:size="70" v-bind:width="2" color="purple"></v-progress-circular>
          </div>
          <v-data-table
          :headers="headersKiemKeVrInventory"
          :items="itemsKiemKe"
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
              {{ pageKiemKe * 15 - 15 + props.index + 1 }}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              <v-chip label outline color="primary" small style="cursor: pointer;" @click="editKiemKe(props.item)">Kiểm kê</v-chip>
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['inventoryTransactionDate'] || ''}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['inventoryCommittee']}}
            </td>
            <td style="padding: 8px;;" class="text-xs-center">
              {{props.item['corporationName']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['totalInStockQuantity']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['totalMatchingQuantity']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['totalMissingQuantity']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['totalExcessQuantity']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              {{props.item['totalNonCounting']}}
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              <span v-if="props.item['inventoryTransactionType'] == 1">Định kỳ</span>
              <span v-else-if="props.item['inventoryTransactionType'] == 2">Đột xuất</span>
            </td>
            <td style="padding: 8px;" class="text-xs-center">
              <a href="javascript:;" style="color: blue;" @click="editKiemKe(props.item)">Sửa</a> | <a href="javascript:;" style="color: blue;" @click="xemKiemKe(props.item)">Xem</a> | <a href="javascript:;" style="color: blue;" @click="deleteKiemKe(props.item)">Xóa</a>
            </td>
          </template>
        </v-data-table>
        <v-pagination :length="lengthPageKiemKe" v-model="pageKiemKe" class="mt-3"></v-pagination>
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
