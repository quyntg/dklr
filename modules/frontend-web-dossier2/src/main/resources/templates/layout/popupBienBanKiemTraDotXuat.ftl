<template>
	<v-layout row wrap class="ml-0">
		<v-flex xs12 sm12>
			<label>1. Thông tin chung</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label class="pl-2">1.1 Số biên bản: </label>
			<label>{{bienBanDXModel['inspectionRecordNo']}}</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label class="pl-2">1.1 Tên cơ sở sản xuất: </label>
			<label>{{bienBanDXModel['productionPlantName']}}</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label class="pl-2">1.2 Địa điểm kiểm tra:</label>
			<label>{{bienBanDXModel['productionPlantAddress']}}</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label class="pl-2">1.3 Danh sách GCN:</label>
		</v-flex>
		<v-flex xs12 sm12>
			<table border="1" class="ftable" style="width: 100%;">
				<thead>
					<tr style="background: #d9d7d7;">
						<th class="text-xs-center" style="width: 3%;">TT</th>
						<th class="text-xs-center">Số  GCN</th>
						<th class="text-xs-center">Ngày cấp</th>
						<th class="text-xs-center" v-if="!bienBanDXModel['id'] || bienBanDXModel['id'] == 0">Thao tác</th>
					</tr>
				</thead>
				<tbody v-if="!bienBanDXModel['id'] || bienBanDXModel['id'] == 0">
					<tr v-for="(item, index) in bienBanDXModel['VR_Issue_Vehiclecertificate']" :key="'bienBanDXModel_VR_Issue_Vehiclecertificate' + index">
						<td class="text-xs-center">
							{{index + 1}}
						</td>
						<td class="text-xs-center">
							{{item['certificateRecordNo']}}
						</td>
						<td class="text-xs-center">
							{{item['certificateRecordDate']}}
						</td>
						<td class="text-xs-center">
							<input type="checkbox" @change="chonGCN(item, index, $event)" :name="'datSelectGS_bbdx' + index" class="check_radio chonGCNBBDX" :id="'datSelectGS_bbdx' + index" style="margin: 0 5px 0 0">

							<label class="pt-2" class="label-radio" :for="'datSelectGS_bbdx' + index" style="margin: 0">Chọn</label>
						</td>
					</tr>
				</tbody>

				<tbody v-else>
					<tr v-for="(item, index) in bienBanDXModel['VR_Issue_Vehicle_Inspection']" :key="'bienBanDXModel_VR_Issue_Vehicle_Inspection' + index">
						<td class="text-xs-center">
							{{index + 1}}
						</td>
						<td class="text-xs-center">
							{{item['certificateRecordNo']}}
						</td>
						<td class="text-xs-center">
							{{item['certificateRecordDate']}}
						</td>
					</tr>
				</tbody>
			</table>
		</v-flex>

		<v-flex xs12 sm12>
			<template v-for="(item, index) in vr_Issue_Vehicle_InspectionItems" :key="'bbdx1423222vr_Issue_Vehicle_InspectionItems' + index">
				<div class="pl-2 py-2">
					<label>{{item['title']}}</label>
				</div>
				<div>
					<template v-if="item['key'] == 'BBKTDXKTPHSP01' || item['key'] == 'BBKTDXKTPHSP02'">
						<table border="1" class="ftable" style="width: 100%;">
							<thead>
								<tr style="background: #d9d7d7;">
									<th class="text-xs-center" style="width: 3%;">TT</th>
									<th class="text-xs-center">Mô tả</th>
									<th class="text-xs-center">Kết luận</th>
									<th class="text-xs-center">Ghi chú</th>
								</tr>
							</thead>
							<tbody>
								<tr v-for="(itemChild, indexChild) in item['items']" :key="'bbdx1423222sasa' + index + '_' + indexChild">
									<td class="text-xs-center">
										{{itemChild['sibling'] || (indexChild + 1)}}
									</td>
									<td class="text-xs-left pl-2">
										{{itemChild['title'] || ''}}
									</td>
									<td style="width: 15%;" class="text-xs-center">
										<v-select
										v-if="itemChild['key'] == 'BBKTDXKTPHSP04'"
										class="my-0 py-0"
										@input="changeStateShowKiemTraPhuHop(itemChild)"
										item-text="text"
										item-value="value"
										:items="tinhPhuHopCoKhongItems"
										v-model="itemChild['specificationResult']"
										></v-select>

										<v-select
										v-else
										class="my-0 py-0"
										item-text="text"
										item-value="value"
										:items="tinhPhuHopItems"
										v-model="itemChild['specificationResult']"
										></v-select>
									</td>

									<td style="width: 20%;" class="text-xs-center">
										<v-text-field
										class="my-0 py-0"
										v-model="itemChild['specificationValueDescription']"
										></v-text-field>
									</td>
								</tr>
							</tbody>
						</table>
					</template>

					<template v-else-if="showKiemTraTinhPhuHop">
						<table border="1" class="ftable" style="width: 100%;">
							<thead>
								<tr style="background: #d9d7d7;">
									<th class="text-xs-center" style="width: 3%;">TT</th>
									<th class="text-xs-center">Mô tả</th>
									<th class="text-xs-center">Theo thiết kế</th>
									<th class="text-xs-center">Theo xe mẫu</th>
									<th class="text-xs-center">Ghi chú</th>
								</tr>
							</thead>
							<tbody>
								<tr v-for="(itemChild, indexChild) in item['items']" :key="'bbdx1423222' + index + '_' + indexChild">
									<td class="text-xs-center">
										{{(indexChild + 1) || ''}}
									</td>
									<td class="text-xs-left pl-2">
										{{itemChild['title'] || ''}}
									</td>
									<td style="width: 15%;" class="text-xs-center">
										<v-select
										class="my-0 py-0"
										item-text="text"
										item-value="value"
										:items="tinhPhuHopItems"
										v-model="itemChild['specificationValue']"
										></v-select>
									</td>

									<td style="width: 15%;" class="text-xs-center">
										<v-select
										class="my-0 py-0"
										item-text="text"
										item-value="value"
										:items="tinhPhuHopItems"
										v-model="itemChild['specificationResult']"
										></v-select>
									</td>

									<td style="width: 25%;" class="text-xs-center">
										<v-text-field
										class="my-0 py-0"
										v-model="itemChild['specificationValueDescription']"
										></v-text-field>
									</td>
								</tr>
							</tbody>
						</table>
					</template>
				</div>

			</template>
		</v-flex>

		<v-flex xs12 sm12>
			<label>Ghi nhận: </label>
		</v-flex>
		<v-flex xs12>
			<v-text-field
			class="my-0 py-0"
			multi-line
			rows="4"
			v-model="bienBanDXModel['inspectionRemarks']"
			></v-text-field>
		</v-flex>

		<v-flex xs12 sm12>
			<label>Đề xuất, kiến nghị: </label>
		</v-flex>

		<v-flex xs12 sm12>
			<input type="checkbox" name="checkboxcap_cap" id="checkboxcap" @change="setValueKlDotXuat('checkboxcap')">
			<label for="checkboxcap" class="pl-1">(*) Cấp phôi phiếu KTCLXX</label>
		</v-flex>


		<v-flex xs12 sm12>
			<input type="checkbox" name="checkboxcap_kocap" @change="setValueKlDotXuat('checkboxkocap')" id="checkboxkocap">
			<label for="checkboxkocap" class="pl-1">(*) Không cấp phôi phiếu KTCLXX cho kiểu loại này</label>
		</v-flex>

		<v-flex xs12 sm12>
			<label class="pl-1">Đề xuất, kiến nghị khác:</label>
		</v-flex>
		<v-flex xs12 sm12>
			<v-text-field
			class="my-0 py-0"
			multi-line
			rows="4"
			v-model="bienBanDXModel['inspectionNote']"
			></v-text-field>
		</v-flex>

		
	</v-layout>
</template>