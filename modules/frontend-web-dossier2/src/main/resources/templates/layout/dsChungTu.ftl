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
  		  <v-flex xs12 sm12 class="text-xs-right">
  		  	<v-data-table
  		  	:headers="stageFilterView === 'ds_chung_tu_nhap' ? headersDSPNK : headersDSPXK"
  		  	:items="itemDsChungTu"
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
		  			<tr v-if="stageFilterView === 'ds_chung_tu_nhap'">
		  				<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
		  					{{ pageDsChungTu * 15 - 15 + props.index + 1 }}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.inputSheetNo}}
		  				</td>
		  				<td style="padding: 8px;;" class="text-xs-center">
		  					{{parseTimeStamp(props.item.inputSheetDate)}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.vehicleClass}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.isApproval == 1 ? 'Đã duyệt' : 'Chưa duyệt'}}
		  				</td>
		  			</tr>

		  			<tr v-else-if="stageFilterView === 'ds_chung_tu_dieu_chuyen'">
		  				<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
		  					{{ pageDsChungTu * 15 - 15 + props.index + 1 }}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.outputSheetNo}}
		  				</td>
		  				<td style="padding: 8px;;" class="text-xs-center">
		  					{{parseTimeStamp(props.item.outputSheetDate)}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.vehicleClass}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.isApproval == 1 ? 'Đã duyệt' : 'Chưa duyệt'}}
		  				</td>
		  			</tr>

		  			<tr v-else-if="stageFilterView === 'ds_chung_tu_xuat_ung'">
		  				<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
		  					{{ pageDsChungTu * 15 - 15 + props.index + 1 }}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.outputSheetNo}}
		  				</td>
		  				<td style="padding: 8px;;" class="text-xs-center">
		  					{{parseTimeStamp(props.item.outputSheetDate)}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.vehicleClass}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.isApproval == 1 ? 'Đã duyệt' : 'Chưa duyệt'}}
		  				</td>
		  			</tr>

		  			<tr v-else>
		  				<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">
		  					{{ pageDsChungTu * 15 - 15 + props.index + 1 }}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.outputSheetNo}}
		  				</td>
		  				<td style="padding: 8px;;" class="text-xs-center">
		  					{{parseTimeStamp(props.item.outputSheetDate)}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.vehicleClass}}
		  				</td>
		  				<td style="padding: 8px;" class="text-xs-center">
		  					{{props.item.isApproval == 1 ? 'Đã duyệt' : 'Chưa duyệt'}}
		  				</td>
		  			</tr>
		  		</template>
  			</v-data-table>
  			<v-pagination :length="lengthDsChungTu" v-model="pageDsChungTu" class="mt-3"></v-pagination>
  		  </v-flex>
  		</v-layout>
  	</v-slide-x-transition>
</div>