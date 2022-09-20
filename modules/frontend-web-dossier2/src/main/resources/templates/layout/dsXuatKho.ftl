<div style="width: 100%;">
	<v-slide-x-transition>

    <div class="row-header flex-break" v-if="!detailPage">

      <div class="background-triangle-big"> <v-icon flat fab color="white" class="setting_action_all">settings</v-icon> Danh sách phiếu xuất kho </div>

      <div class="layout row wrap header_tools w-100-xs">
        <div class="flex w-100-xs"></div>
        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen_exit</v-icon></v-btn>

      </div>

    </div>

  	</v-slide-x-transition>

  	<v-slide-x-transition>
  		<v-layout row wrap class="ml-0">

        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>Số phiếu xuất: </label>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right pr-1">
          <v-text-field
            v-model="soPhieuXuatFilter"
            class="px-0 py-0 mx-0 my-0"
            clearable
          ></v-text-field>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>Ngày xuất phiếu (Từ):</label>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right pr-1">
          <v-menu
          :close-on-content-click="false"
          v-model="menuoutputSheetDateFromFilter"
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
          v-model="outputSheetDateFromFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateOutputSheetDateFromFilter" @input="parseNgay('outputSheetDateFromFilter', 'dateOutputSheetDateFromFilter')"></v-date-picker>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>(Đến):</label>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right pr-1">
          <v-menu
          :close-on-content-click="false"
          v-model="menuoutputSheetDateToFilter"
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
          v-model="outputSheetDateToFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateOutputSheetDateToFilter" @input="parseNgay('outputSheetDateToFilter', 'dateOutputSheetDateToFilter')"></v-date-picker>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>Đơn vị: </label>
        </v-flex>
        <v-flex xs12 sm4 class="text-xs-right pr-1">
          <v-select
          :items="doiPhongItems"
          item-text="itemName"
          item-value="itemCode"
          autocomplete
          clearable
          v-model="corporationIdFilter"
          class="pt-0"
          ></v-select>
        </v-flex>

        <v-flex xs12 sm6>
          
        </v-flex>

        <v-flex xs12 sm12 class="text-xs-center">
          <v-btn small color="primary" @click="timKiemDsXuatKho()">Tìm kiếm</v-btn>
        </v-flex>

  		  <v-flex xs12 sm12 class="text-xs-right">
  		  	<v-data-table
  		  	:headers="headersDSPXK"
  		  	:items="itemsDSPXK"
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
  	  		  	<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
                {{ pageDSPXK * 15 - 15 + props.index + 1 }}
              </td>
              <td style="padding: 8px;" class="text-xs-center">
                {{props.item['outputSheetNo']}}
              </td>
              <td style="padding: 8px;;" class="text-xs-center">
                {{props.item['outputSheetDate']}}
              </td>
              <td style="padding: 8px;" class="text-xs-center">
                {{props.item['receiverRequest']}}
              </td>
              <#-- <td style="padding: 8px;" class="text-xs-center">
                {{(props.item['isApproval'] === 1 || props.item['isApproval'] === '1') ? 'Đã duyệt' : 'Chưa duyệt'}}
              </td> -->
              <td style="padding: 8px;" class="text-xs-center">
                <a @click="toDetailXuatKho(props.item)" href="javascript:;" style="color: blue;">Xem</a>
              </td>
  	  		</template>
  			</v-data-table>
  			<v-pagination :length="lengthDSPXK" v-model="pageDSPXK" class="mt-3" @input="loadDSPXK()"></v-pagination>
  		  </v-flex>
  		</v-layout>
  	</v-slide-x-transition>
</div>