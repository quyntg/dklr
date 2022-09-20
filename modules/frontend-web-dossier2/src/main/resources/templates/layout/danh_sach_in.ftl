<template>
	<v-container fluid grid-list-md>
		<v-layout row>
			<v-flex sm12 xs12 class="">
				<v-card style="padding-bottom: 10px;">
						<v-layout row style="margin-top:8px;">
							<v-flex sm5 xs12 class="pl-4">
								<v-select
								:items="serviceInfoFilterItems"
								v-model="serviceInfoSelect"
								item-text="serviceName"
								item-value="serviceCode"
								label="Lựa chọn thủ tục"
								clearable
								></v-select>
							</v-flex>
							<v-flex sm5 xs12 class="pl-3">
								<v-text-field
								label="Nhập từ khóa"
								v-model="keywordTraCuuGiayPhep"
								></v-text-field>
							</v-flex>
							<v-flex sm2 xs12>
								<v-btn small color="primary" @click="searchTraCuuGiayPhep()">Tìm kiếm</v-btn>
							</v-flex>
						</v-layout>
						<v-layout row wrap>
							<v-flex xs12 sm5 class="pl-4">
								<v-select
								:items="govAgencys"
								v-model="govAgencySelect"
								item-text="itemName"
								item-value="itemCode"
								label="Cơ quan cấp phép"
								clearable
								></v-select>
							</v-flex>
						</v-layout>
						<v-layout row wrap>
							<v-flex xs12 sm5 class="pl-4">
								<v-menu
								ref="menuTuNgay"
								:close-on-content-click="false"
								v-model="menuTuNgay"
								:nudge-right="40"
								lazy
								transition="scale-transition"
								offset-y
								full-width
								max-width="290px"
								min-width="290px"
								>
								<v-text-field
								slot="activator"
								v-model="searchTuNgay"
								persistent-hint
								prepend-icon="event"
								label="Từ ngày"
								clearable
								></v-text-field>
								<v-date-picker v-model="searchTuNgay" no-title @input="menuTuNgay = false"></v-date-picker>
							</v-menu>
						</v-flex>
						<v-flex xs3 sm5 class="pl-3">
							<v-menu
							ref="menuDenNgay"
							:close-on-content-click="false"
							v-model="menuDenNgay"
							:nudge-right="40"
							lazy
							transition="scale-transition"
							offset-y
							full-width
							max-width="290px"
							min-width="290px"
							>
							<v-text-field
							slot="activator"
							v-model="searchDenNgay"
							persistent-hint
							prepend-icon="event"
							label="Đến ngày"
							clearable
							></v-text-field>
								<v-date-picker v-model="searchDenNgay" no-title @input="menuDenNgay = false"></v-date-picker>
							</v-menu>
						</v-flex>
					</v-layout>
				</v-card>
	  		</v-flex>
		</v-layout>		
		<v-layout row wrap>
			<v-flex xs12 sm12 class="text-xs-right pt-3">
				<div>
					<v-data-table
						:headers="giayPhepVanTaiQuocTeTableheaders"
						:items="giayPhepVanTaiQuocTeTableItems"
						hide-actions
						id="tableGiayPhepVanTaiQuocTe"
						class="elevation-1">
						<template slot="items" slot-scope="props">
							<td style="padding: 8px; padding-left: 0px;width: 3%; " class="text-xs-center">{{ pageGiayPhepVanTaiQuocTeTable * 15 - 15 + props.index + 1 }}</td>
							<td style="padding: 8px;" class="text-xs-left">
								{{ props.item.licenceName }} 
								<br v-if="props.item.licenceNo">
								{{ props.item.licenceNo }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-left">
								{{ props.item.applicantName }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-left">
								{{ props.item.govAgencyName }} 
							</td>
							<td style="padding: 8px; width: 15%;" class="text-xs-left">
								{{ props.item.validFrom }} 
								<br v-if="props.item.validUntil">
								{{ props.item.validUntil }} 
							</td>
							<td style="padding: 8px; width: 10%;" class="text-xs-center">
								<v-btn class="ml-0 mr-0 btn__info" flat icon style="color: #14BEF0;" @click="printGiayPhep(props.item)">
									<v-icon style="font-size: 16px;">print</v-icon>
								</v-btn> 
								
								<v-btn class="ml-0 mr-0 btn__info" flat icon style="color: #14BEF0;" @click="toDetailGiayPhep(props.item)">
									<v-icon style="font-size: 16px;">visibility</v-icon>
								</v-btn>
							</td>
						</template>
					</v-data-table>
					<v-pagination @input="changePageGPVTQT()" :length="pageGiayPhepVanTaiQuocTeTableLength" v-model="pageGiayPhepVanTaiQuocTeTable" class="pt-3"></v-pagination>
				</div>
			</v-flex>
		</v-layout>
	</v-container>
</template>

<script>
	$(function () {
		document.addEventListener('DOMContentLoaded', function (event) {
			$("#listTraCuuGiayPhep > li").click(function (event) {
				event.preventDefault();
				console.log('item list click');
				$(this).addClass('active');
			})
		});
	})
</script>
<style>
	.toolbar__content {
		height: 50px
	}
</style>