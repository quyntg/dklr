<div style="width: 100%;">
	<v-slide-x-transition>

    <div class="row-header flex-break" v-if="!detailPage">

      <div class="background-triangle-big"> <v-icon flat fab color="white" class="setting_action_all">settings</v-icon> Danh sách phiếu nhập kho </div>

      <div class="layout row wrap header_tools w-100-xs">
        <div class="flex w-100-xs"></div>
        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen_exit</v-icon></v-btn>

      </div>

    </div>

  	</v-slide-x-transition>

  	<v-slide-x-transition>
  		<v-layout row wrap class="ml-0">

        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-2">Đối tượng: </label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-select
          :items="doiTuongPhieuItems"
          item-text="itemName"
          item-value="itemCode"
          autocomplete
          v-model="doiTuongPhieuFilter"
          class="pt-0"
          ></v-select>
        </v-flex>

  			<v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
  			  <label>Số phiếu nhập: </label>
  			</v-flex>
  			<v-flex xs12 sm4 class="text-xs-right pr-1">
  			  <v-text-field
  			    v-model="soPhieuNhapFilter"
  			    clearable
  			    class="px-0 py-0 mx-0 my-0"
  			  ></v-text-field>
  			</v-flex>

  			<v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
  			  <label>Ngày nhập phiếu (Từ):</label>
  			</v-flex>
  			<v-flex xs12 sm4 class="text-xs-right pr-1">
  			  <v-menu
          :close-on-content-click="false"
          v-model="menuinputSheetDateFromFilter"
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
          v-model="inputSheetDateFromFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateInputSheetDateFromFilter" @input="parseNgay('inputSheetDateFromFilter', 'dateInputSheetDateFromFilter')"></v-date-picker>
  			</v-flex>
  			<v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
  			  <label>(Đến):</label>
  			</v-flex>
  			<v-flex xs12 sm4 class="text-xs-right pr-1">
  			  <v-menu
          :close-on-content-click="false"
          v-model="menuinputSheetDateToFilter"
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
          v-model="inputSheetDateToFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateInputSheetDateToFilter" @input="parseNgay('inputSheetDateToFilter', 'dateInputSheetDateToFilter')"></v-date-picker>
  			</v-flex>
  			<v-flex xs12 sm12 class="text-xs-center">
  			  <v-btn small color="primary" @click="timKiemDsNhapKho()">Tìm kiếm</v-btn>
  			</v-flex>
  		  <v-flex xs12 sm12 class="text-xs-right">
  		  	<v-data-table
  		  	:headers="headersDSPNK"
  		  	:items="itemsDSPNK"
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
		  		  		{{ pageDSPNK * 15 - 15 + props.index + 1 }}
		  		  	</td>
		  		  	<td style="padding: 8px;" class="text-xs-center">
		  		  		{{props.item['inputSheetNo']}}
		  		  	</td>
		  		  	<td style="padding: 8px;;" class="text-xs-center">
		  		  		{{props.item['inputSheetDate']}}
		  		  	</td>
		  		  	<td style="padding: 8px;" class="text-xs-center">
		  		  		{{getDoiTuongText(props.item['vehicleClass'])}}
		  		  	</td>
		  		  	<td @click="toDetailNhapKho(props.item)" style="padding: 8px;" class="text-xs-center">
		  		  		{{(props.item['isApproval'] === 1 || props.item['isApproval'] === '1') ? 'Đã xác nhận' : 'Chưa xác nhận'}}
		  		  	</td>
		  		  	<td style="padding: 8px;" class="text-xs-center">
		  		  		<a @click="toDetailNhapKho(props.item)" href="javascript:;" style="color: blue;">Xem</a> | <a href="javascript:;" @click="deleteDsNhapKho(props.item)" :style="{color: (!props.item['checkDelete'] || props.item['checkDelete'] == '0') ? 'blue' : 'grey'}">Xóa</a>
		  		  	</td>
		  		</template>
  			</v-data-table>
  			<v-pagination :length="lengthDSPNK" v-model="pageDSPNK" class="mt-3" @input="loadDSPNK()"></v-pagination>
  		  </v-flex>
  		</v-layout>
  	</v-slide-x-transition>
</div>