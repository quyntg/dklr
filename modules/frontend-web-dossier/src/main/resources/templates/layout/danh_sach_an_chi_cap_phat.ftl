<v-slide-x-transition>
<div class="row-header flex-break">

    <div class="background-triangle-big">Danh sách ấn chỉ đã cấp phát</div>

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
                    <v-flex xs3><label>Số hồ sơ</label></v-flex>
                    <v-flex xs9>
                        <v-text-field  v-model="stampissueNoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Tên số ấn chỉ</label></v-flex>
                    <v-flex xs9>
                        <v-text-field v-model="framenoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Năm</label></v-flex>
                    <v-flex xs9>
                        <v-text-field  v-model="serialnoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Ngày nộp(từ)</label></v-flex>
                    <v-flex xs9>
                        <v-text-field  v-model="serialnoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Ngày nộp đến</label></v-flex>
                    <v-flex xs9>
                        <v-text-field  v-model="enginenoFilter"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Tình trạng</label></v-flex>
                    <v-flex xs9>
                        <v-select
                            v-model="vehicleclassFilter"
                            :items="danhSachTinhTrang"
                            item-text="text"
                            item-value="value"
                            autocomplete
                            clearable
                        >
                        </v-select>
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
      v-bind:headers="headersDSAnChiDaCapPhat"
      :items="danhSachAnChiDaCapPhat"
      hide-actions
      class="elevation-1 table-xuatxuong"
    >
        <template slot="items" scope="props">
        <td>{{ props.index }}</td>
        <td>{{ props.item.applicantname}}</td>  
        <td>{{ props.item.vehicleclass }}</td>
        <td>{{ props.item.stampissueno }}</td>
        <td>{{ props.item.applieddate }}</td>
        <td>{{ props.item.stampshortno }}</td>
        <td>{{ props.item.stampserialno }}</td>
        <td>{{ props.item.applieddate }}</td>
        <td>{{ props.item.stampstatus }}</td>
        <td class="text-center" style="color: #0b72ba; font-weight: bold;"  @click="xemChiTietAnChiDaCapPhat(props.item.id2)" ><span>Xem</span></td>
        </template>
  </v-data-table>

</v-slide-x-transition>