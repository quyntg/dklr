<template>
	<v-layout wrap>
		<v-flex xs12 sm6 style="border: 1px solid #ccc; position: relative;" class="mb-2">
			<span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Thông tin chung</span> <br />
			<v-layout row wrap>
				<v-flex xs12 sm2 class="text-xs-right py-0">
					<label class="pt-2">Số phiếu kiểm kê</label>
				</v-flex>
				<v-flex xs12 sm4 class="py-0">
					<#-- <v-select
					:items="doiTuongPhieuItems"
					item-text="itemName"
					item-value="itemCode"
					clearable
					autocomplete
					v-model="thongTinPhieu['vehicleClass']"
					class="pt-0"
					></v-select> -->
					<v-text-field
					v-model="thongTinPhieu['inventoryTransactionNo']"
					clearable
					class="pt-0"
					></v-text-field>
				</v-flex>
				<v-flex xs12 sm2 class="text-xs-right py-0">
					<label class="pt-2">Ngày kiểm kê</label>
				</v-flex>
				<v-flex xs12 sm4 class="py-0">
                        <v-menu
	            			ref="menuNN"
	            			:close-on-content-click="false"
	            			v-model="menuInventoryTransactionDate"
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
		            			v-model="thongTinPhieu['inventoryTransactionDate']"
		            			prepend-icon="event"
		            			clearable
		            			class="pt-0"
		            			readonly
	            			></v-text-field>
	            			<v-date-picker v-model="dateInventoryTransactionDate" @input="parseInventoryTransactionDate()"></v-date-picker>
	            		</v-menu>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0">
                    	<label class="pt-2">Đơn vị kiểm kê</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="py-0">
                    	<v-select
                    	@input="bindCorporation()"
                        :items="donViNhapItems"
                        item-text="itemName"
                        item-value="itemCode"
                        clearable
                        autocomplete
                        v-model="thongTinPhieu['corporationCode']"
                        class="pt-0"
                        ></v-select>
                    	<#-- <v-text-field
                    	v-model="thongTinPhieu['corporationName']"
                    	clearable
                    	class="pt-0"
                    	></v-text-field> -->
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0">
                    	<label class="pt-2">Ban kiểm kê</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="py-0">
                    	<v-text-field
                    	v-model="thongTinPhieu['inventoryCommittee']"
                    	clearable
                    	class="pt-0"
                    	></v-text-field>
                    </v-flex>
                    <v-flex xs12 sm2 class="text-xs-right py-0">
                    	<label class="pt-2">Trạng thái</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="py-0">
                    	<v-select
                        :items="trangThaiKiemKeItems"
                        item-text="itemName"
                        item-value="itemCode"
                        clearable
                        autocomplete
                        v-model="thongTinPhieu['batchJobStatus']"
                        class="pt-0"
                        ></v-select>
                    </v-flex>
                    <#-- <v-flex xs12 sm2 class="text-xs-right py-0">
                    	<label class="pt-2">Tham chiếu</label>
                    </v-flex>
                    <v-flex xs12 sm10 class="mb-2 py-0">
                    	<label class="pt-2">{{thongTinPhieu['inputSheetId']}}</label>
                    </v-flex> -->
                </v-layout>
            </v-flex>

            <v-flex xs12 sm6 style="border: 1px solid #ccc; position: relative;" class="mb-2">
            	<#-- <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Chứng từ</span>
            	<v-layout row wrap class="mt-2">
            		<v-flex xs12 sm5 class="text-xs-right py-0">
            			<label class="pt-2">Số phiếu nhập</label>
            		</v-flex>
            		<v-flex xs12 sm7 class="mb-2 py-0">
            			<v-text-field
            			v-model="thongTinPhieu['inputSheetNo']"
            			clearable
            			class="pt-0"
            			></v-text-field>
            		</v-flex>
            		<v-flex xs12 sm5 class="text-xs-right py-0">
            			<label class="pt-2">Ngày nhập</label>
            		</v-flex>
            		<v-flex xs12 sm7 class="py-0">
            			<v-menu
	            			ref="menuNN"
	            			:close-on-content-click="false"
	            			v-model="menuNgayNhap"
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
		            			v-model="thongTinPhieu['inputSheetDate']"
		            			prepend-icon="event"
		            			clearable
		            			class="pt-0"
		            			readonly
	            			></v-text-field>
	            			<v-date-picker v-model="dateNgayNhap" @input="parseNgayNhap()"></v-date-picker>
	            		</v-menu> -->
            	</v-flex>

            </v-layout>
        </v-flex>
        <v-flex xs12 sm12 class="mt-3 px-0">
        	<v-data-table
	        	v-bind:headers="headersKiemKe"
	        	v-bind:items="dsKiemKePopupItems"
	        	v-model="selected"
	        	item-key="name"
	        	no-data-text="Không có dữ liệu"
	        	select-all
	        	class="table__overflow"
	        	hide-actions
	        	>
	        	<template slot="headers" slot-scope="props">
	        		<tr>
	        			<th style="width: 25px;" class="my-0 py-0">
	        				<v-checkbox
		        				primary
		        				hide-details
		        				@click.native="toggleAll"
		        				:input-value="props.all"
		        				:indeterminate="props.indeterminate"
		        				class="my-0 py-0"
		        				></v-checkbox>
		        			</th>
		        			<th v-for="header in props.headers" :key="header.text"
		        			:class="['column text-xs-center']"
		        			>
		        			{{ header.text }}
		        		</th>
		        	</tr>
		        </template>
		        <template slot="items" slot-scope="props">
		        	<td>
		        		<v-checkbox
		        		primary
		        		hide-details
		        		:value="props.item"
		        		v-model="selected"
		        		></v-checkbox>
		        	</td>
		        	<td class="text-xs-center">{{props.index + 1}}</td>
		        	<td @click="suaVatTu(props.item)" class="pt-2">{{ props.item['stampShortNo'] }}</td>
		        	<td @click="suaVatTu(props.item)" class="pt-2">{{ getDoiTuongText(props.item['vehicleClass']) }}</td>
		        	<td class="text-xs-center pt-2">{{ props.item['serialStartNo'] }}</td>
		        	<td class="text-xs-left pt-2">{{ props.item['serialEndNo'] }}</td>
		        	<td class="text-xs-left pt-2">{{ props.item['totalQuantities'] }}</td>
		        </template>
            </v-data-table>
       </v-flex>
		<v-flex xs12 sm12>
			<v-btn color="primary" small @click="addVrInventory()"><v-icon>add</v-icon> Thêm dòng</v-btn>
			<v-btn color="primary" small @click="deleteVrInventory()" v-if="selected && selected['length']"><v-icon>delete</v-icon> Xóa dòng</v-btn>
			<v-btn color="primary" small @click="luuVrInventoryReport(1)"><v-icon>done</v-icon> Xác nhận</v-btn>
			<v-btn color="primary" small @click="popUpVrInventoryReport = false"><v-icon>save</v-icon> Thoát</v-btn>
		</v-flex>
	</v-layout>
</template>