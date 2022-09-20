
<div class="row-header flex-break">
    <div class="background-triangle-big">Danh sách xe chờ in phiếu xuất xưởng</div>
</div>

<v-card class="xuatXuong">
    <v-layout wrap>
        <v-flex xs12>
            <div style="display: flex;align-items: center;"><div class="triangle-right" style="width: 0;height: 0;border-top: 7px solid transparent;border-left: 21px solid #4e839d;border-bottom: 6px solid transparent;"></div><strong>Danh sách hồ sơ</strong></div>
        </v-flex>
        <v-flex xs12 style="justify-content: flex-start; display: flex;align-items: center;">
            <label style="margin-right: 5px;">Đối tượng</label>
            <div style="width: 200px;">
                <v-select
                    v-model="vehicleclassFilter"
                    :items="danhSachDoiTuong"
                    item-text="groupCode"
                    item-value="groupCode"
                    autocomplete
                    clearable
                >
                </v-select>
            </div>
            <label style="margin-right: 5px;">Loại hồ sơ</label>
            <div style="width: 200px;">
                <v-text-field  v-model="serialnoFilter"></v-text-field>
            </div>
        </v-flex>
        <v-flex xs12>
            <v-data-table
                v-bind:headers="headersDSHoSoFilter"
                :items="danhSachHoSoFilter"
                hide-actions
            >
                <template slot="items" scope="props">
                    <td><input type="radio" name="radioHoSo"></td>
                    <td>{{ props.item.stampissueno}}</td>  
                    <td>{{ props.item.applieddate }}</td>
                    <td>{{ props.item.vehicleclass }}</td>
                    <td>{{ props.item.issuetype }}</td>
                    <td>{{ props.item.totalindocument }}</td>
                    <td>{{ props.item.totalnotused }}</td>
                </template>
            </v-data-table>
        </v-flex>
        <v-flex xs12 style="justify-content: center; display: flex;">
                <v-btn color="primary">Import Excel</v-btn>
                <v-btn color="primary">Export Excel</v-btn>
                <v-btn color="primary">In phiếu</v-btn>
                <v-btn color="primary">Báo hỏng, báo mất</v-btn>
                <v-btn color="primary" @click="openPopUpPhoiXCG()"> Cấu hình phôi XCG</v-btn>
        </v-flex>
        <v-flex xs12 style="border-top: 0.5px solid; padding-top: 10px;">
            <div style="display: flex;align-items: center;"><div class="triangle-right" style="width: 0;height: 0;border-top: 7px solid transparent;border-left: 21px solid #4e839d;border-bottom: 6px solid transparent;"></div><strong>Danh sách xe</strong></div>
        </v-flex>
        <v-flex xs6 style="justify-content: flex-start; display: flex;align-items: center;">
            <label style="margin-right: 5px;">Số GCN</label>
            <div style="width: 100px;">
                <v-text-field  v-model="serialnoFilter"></v-text-field>
            </div>
            <label style="margin-right: 5px;">Trạng thái</label>
            <div style="width: 100px;">
                <v-select
                    v-model="vehicleclassFilter"
                    :items="danhSachTrangThai"
                    item-text="text"
                    item-value="value"
                    autocomplete
                    clearable
                >
                </v-select>
            </div>
        </v-flex>
        <v-flex xs6>
            <label style="margin-right: 5px;">Xem bản thảo: </label>
            <input type="radio" name="previewBanThao" value="PDF" style="margin-left: 5px;">PDF
            <input type="radio" name="previewBanThao" value="HTML" style="margin-left: 5px;">HTML
        </v-flex>
        <v-flex xs6>
            <v-data-table
                v-bind:headers="headerDanhSachXe"
                :items="danhSachXe"
                hide-actions
            >
                <template slot="items" scope="props">
                    <td><input type="checkbox" value="false"></td>
                    <td>{{ props.index }}</td>  
                    <td>{{ props.item.certificaterecordno }}</td>
                    <td>{{ props.item.frameno }}</td>
                    <td>{{ props.item.engineno }}</td>
                    <td>{{ props.item.color }}</td>
                    <td><span style="color: #0b72ba; font-weight: bold;">Xem</span></td>
                </template>
            </v-data-table>
        </v-flex>
        <v-flex xs6>
            <v-layout wrap>
                <v-flex xs12>
                    <object data="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" style="width:100%; height: 400px;">
						<embed src="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" />
					</object>
                </v-flex>
                <v-flex xs12 v-if="preview === 'HTML'">
                </v-flex>               
            </v-layout>
        </v-flex>
    </v-layout>
</v-card>


