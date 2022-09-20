<v-slide-x-transition>
<div class="row-header flex-break">

    <div class="background-triangle-big">Danh sách xe đã xuất xưởng</div>

</div>

</v-slide-x-transition>

<v-slide-y-transition>
	<div id="danhSachXeDaXuatXuongFilter" class="panel" style="height: auto;width: 100%;margin: 0;border-radius: 0;border-top: 1px solid white;background-color: #e1e2e1;padding: 15px;">
        <v-layout wrap>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Doanh nghiệp</label></v-flex>
                    <v-flex xs9>
                        <v-select
                            v-model="applicantprofileidFilter"
                            :items="danhSachDoanhNghiep"
                            item-text="mappingten_cty"
                            item-value="id"
                            autocomplete
                            clearable
                        >
                        </v-select>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Đối tượng</label></v-flex>
                    <v-flex xs9>
                        <v-select
                            v-model="vehicleclassFilter"
                            :items="danhSachDoiTuong"
                            item-text="groupCode"
                            item-value="groupCode"
                            autocomplete
                            clearable
                        >
                        </v-select>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Số GCN</label></v-flex>
                    <v-flex xs9>
                        <v-text-field v-model="certificaterecordnoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Số khung</label></v-flex>
                    <v-flex xs9>
                        <v-text-field v-model="framenoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Số hồ sơ</label></v-flex>
                    <v-flex xs9>
                        <v-text-field  v-model="stampissueNoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Số ấn chỉ</label></v-flex>
                    <v-flex xs9>
                        <v-text-field  v-model="serialnoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Số động cơ</label></v-flex>
                    <v-flex xs9>
                        <v-text-field  v-model="enginenoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Ngày in phiếu</label></v-flex>
                    <v-flex xs9>
                        <input type="date" v-model="productiondateFilter">
                    </v-flex>
                </v-layout>
            </v-flex>
        </v-layout>
		<v-layout wrap>
			<v-flex xs12>
			 	<v-btn color="primary" class="mx-0 my-0 mt-2"  @click="getDanhSachXeDaXuatXuong()">Tìm kiếm</v-btn>
                <v-btn color="primary" class="mx-0 my-0 mt-2">Xuất Excel</v-btn>
			</v-flex>
		</v-layout>
	</div>
</v-slide-y-transition>

<v-slide-x-transition>

    <v-data-table
      v-bind:headers="headersDSXeXuatXuong"
      :items="danhSachXeXuatXuong"
      hide-actions
      class="elevation-1 table-xuatxuong"
    >
        <template slot="items" scope="props">
        <td>{{ props.index }}</td>
        <td>{{ props.item.applicantname}}</td>  
        <td>{{ props.item.vehicleclass }}</td>
        <td>{{ props.item.serialno }}</td>
        <td>{{ props.item.certificaterecordno }}</td>
        <td>{{ props.item.frameno }}</td>
        <td>{{ props.item.engineno }}</td>
        <td>{{ props.item.color }}</td>
        <td><span class="span-thaotac">Hồ sơ</span><span class="span-thaotac" @click="xemTSKT(props.item.certificateid)">TSKT</span><span @click="popUpPhieuXX = true" class="span-thaotac">Phiếu XX</span></td>
        </template>
  </v-data-table>

</v-slide-x-transition>
