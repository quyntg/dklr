<v-slide-x-transition>

<div class="row-header flex-break" v-if="!detailPage && !detailRegistPage">

    <div class="background-triangle-big"> Cơ sở sản xuất nước ngoài</div>

    <div class="layout row wrap header_tools w-100-xs">

        <div class="flex w-100-xs" jx-bind="keywordsSearchTraCuuDoanhNghiepNuocNgoai"></div>

        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4"><v-icon>fullscreen_exit</v-icon></v-btn>
		
		<v-btn flat class=" my-0 py-0 btn-border-left" color="grey darken-1" v-on:click.native="toAddCoSoNuocNgoai()">
					<v-icon class="mr-2">assignment</v-icon>
			Tạo mới
		</v-btn>
    </div>

</div>

</v-slide-x-transition>

<v-slide-x-transition>

	<div v-if="loadingCoSoNuocNgoai" class="text-xs-center" style="width: 100%;">
		<v-progress-circular indeterminate v-bind:size="70" v-bind:width="2" color="purple"></v-progress-circular>
	</div>
	<div style="width: 100%;" class="text-xs-right" v-else>
		<v-data-table
		:headers="headersCoSoNuocNgoai"
		:items="itemsCoSoNuocNgoai"
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
				<!-- {{ header.text }} -->
			</th>
		</tr>
	</template>
	<template slot="items" slot-scope="props">
		<td style="padding: 8px 0px 8px 0px; width: 3%; " class="text-xs-center">
			{{ pageCoSoNuocNgoai * 15 - 15 + props.index + 1 }}
		</td>
		<td style="padding: 8px;" class="text-xs-center">
			{{ props.item._source['groupCode'] == 'NHAXUONG' ? props.item._source['productionPlantCOP'] : props.item._source['applicantProfileCOP']}}
		</td>
		<td style="padding: 8px;" class="text-xs-center">
			{{props.item._source['itemCode']}}
		</td>
		<td style="padding: 8px; width: 30%;" class="text-xs-center">
			{{props.item._source['itemName']}}
		</td>
		<td style="padding: 8px; width: 40%;" class="text-xs-center">
			{{props.item._source['itemNameEN']}}
		</td>
		<td style="padding: 8px; width: 40%;" class="text-xs-center">
			{{props.item._source['itemDescription']}}
		</td>
		<td style="padding: 8px;" class="text-xs-center">
			{{props.item._source['parentItemId'] != 0 ? 'NX' : 'CSSX'}}
		</td>
		<td style="padding: 8px; width: 10%;" class="text-xs-center">
			<v-icon class="mr-2" style="cursor: pointer; font-size: 16px;" @click="toDetailCoSoNuocNgoai(props.item._source)">edit</v-icon>
			<v-icon style="cursor: pointer; font-size: 16px;" @click="deleteCoSoNuocNgoai(props.item._source ? props.item._source['itemCode'] : '')">delete</v-icon>
		</td>
	</template>
	</v-data-table>
	<v-pagination :length="lengthCoSoNuocNgoai" @input="pageCoSoNuocNgoaiChange" v-model="pageCoSoNuocNgoai" class="mr-3 mt-3"></v-pagination>
	</div>
</v-slide-x-transition>