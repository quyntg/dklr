<template>
	<div style="width: 100%">
		<v-layout row wrap class="ml-0">
		  <v-flex xs12 sm5 style="max-height: 500px; overflow: auto;">
		  	<div class="row-header flex-break">

		  		<div class="background-triangle-big"> Lần chuyển đổi</div>

		  		<div class="layout row wrap header_tools w-100-xs">

		  		</div>
		  	</div>

		  	<v-data-table
		  		:loading="loadingLanChuyenDoi"
		  		:rows-per-page-items="rowPerPage"
			  	v-bind:headers="headersLanChuyenDoi"
			  	v-bind:items="itemsLanChuyenDoi"
			  	rows-per-page-text="Số bản ghi/ trang"
			  	>
			  	<template slot="items" slot-scope="props"  >
			  		<tr :style="{'background-color': (migrateTaskSelect['task_id'] === props.item['task_id']) ? '#ebeaea' : '#fff'}">
			  			<td class="text-xs-center" style="cursor: pointer;" @click="toDetailMigrateReview(props.item, props.index)">{{ props.index + 1 }}</td>
			  			<td class="text-xs-center" style="cursor: pointer;" @click="toDetailMigrateReview(props.item, props.index)">{{ props.item.task_name }}</td>
			  			<td class="text-xs-center" style="cursor: pointer;" @click="toDetailMigrateReview(props.item, props.index)">{{ props.item['date'] }}</td>
			  		</tr>
			  	</template>
			  	<template slot="pageText" slot-scope="{ pageStart, pageStop}">
			  		Từ {{ pageStart }} đến {{ pageStop }}
			  	</template>
			 </v-data-table>
		  </v-flex>
		  <v-flex xs12 sm7 class="pl-2" style="max-height: 500px; overflow: auto;">
		    <div class="row-header flex-break">

		  		<div class="background-triangle-big"> Kết quả chuyển đổi</div>

		  		<div class="layout row wrap header_tools w-100-xs">

		  		</div>
		  	</div>

		  	<v-data-table
		  		:loading="loadingKQChuyenDoi"
		  		:rows-per-page-items="rowPerPage"
			  	v-bind:headers="headersKQChuyenDoi"
			  	v-bind:items="itemsKQChuyenDoi"
			  	rows-per-page-text="Số bản ghi/ trang"
			  	>
			  	<template slot="items" slot-scope="props"  >
			  		<tr :style="{'background-color': (migrateReviewSelect['id'] === props.item['id']) ? '#ebeaea' : '#fff'}">
			  			<td class="text-xs-center" style="cursor: pointer;" @click="toDetailMigratemapping(props.item)">{{ props.item['migrateTableName'] }}</td>
				  		<td class="text-xs-center" style="cursor: pointer;" @click="toDetailMigratemapping(props.item)">{{ props.item['sequenceNo'] }}</td>
				  		<td class="text-xs-center" style="cursor: pointer;" @click="toDetailMigratemapping(props.item)">{{ props.item['migrateRows'] }}</td>
				  		<td class="text-xs-center" style="cursor: pointer;" @click="toDetailMigratemapping(props.item)">{{ props.item['migrateRemarks'] }}</td>
			  		</tr>
			  	</template>
			  	<template slot="pageText" slot-scope="{ pageStart, pageStop}">
			  		Từ {{ pageStart }} đến {{ pageStop }}
			  	</template>
			 </v-data-table>
		  </v-flex>
		</v-layout>

		<v-layout row wrap class="ml-0">
		  <v-flex xs12 sm12>
		    <div class="row-header flex-break">

		  		<div class="background-triangle-big"> {{migrateReviewSelect['migrateTableName'] || '...'}}</div>

		  		<div class="layout row wrap header_tools w-100-xs">

		  		</div>
		  	</div>

		  	<v-data-table
		  		:loading="loadingChuyenDoiMapping"
		  		:rows-per-page-items="rowPerPage"
			  	v-bind:headers="headersChuyenDoiMapping"
			  	v-bind:items="itemsMapping"
			  	rows-per-page-text="Số bản ghi/ trang"
			  	>
			  	<template slot="items" slot-scope="props"  >
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.index + 1 }}</td>
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.item['dataItemID'] }}</td>
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.item['itemCode'] }}</td>
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.item['itemDescription'] }}</td>
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.item['alterCollectionCode'] }}</td>
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.item['alterItemCode'] }}</td>
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.item['alterItemName'] }}</td>
			  		<td class="text-xs-center" style="cursor: pointer;">{{ props.item['alterGroupCode'] }}</td>
			  	</template>
			  	<template slot="pageText" slot-scope="{ pageStart, pageStop}">
			  		Từ {{ pageStart }} đến {{ pageStop }}
			  	</template>
			 </v-data-table>
		  </v-flex>
		</v-layout>
	</div>
</template>