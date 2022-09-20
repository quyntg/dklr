<v-slide-x-transition>
<div class="row-header flex-break">

    <div class="background-triangle-big">Quản lý yêu cầu sửa đổi Serial</div>

</div>

</v-slide-x-transition>

<v-slide-y-transition>
	<div id="quanlySuaDoiSerialFilter" class="panel" style="height: auto;width: 100%;margin: 0;border-radius: 0;border-top: 1px solid white;background-color: white;padding: 15px;">
        <v-layout wrap>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Cơ sở sản xuất</label></v-flex>
                    <v-flex xs9>
                        <v-select
                            v-model="filterSerial['cssxFilter']"
                            :items="coSoSanXuatItems"
                            item-text="applicantName"
                            item-value="applicantCode"
                            style="padding-top: 0px"
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
                            v-model="filterSerial['dtFilter']"
                            :items="doiTuongSerialItems"
                            item-text="text"
                            item-value="value"
                            style="padding-top: 0px"
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
                        <v-text-field  v-model="filterSerial['shsFilter']"
                            style="padding-top: 0px"></v-text-field>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Ngày nộp từ </label></v-flex>
                    <v-flex xs9>
                        <v-menu
                          :close-on-content-click="true"
                          v-model="menuSerialDateFrom"
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
                          v-model="filterSerial['ngaytuFilter']"
                          prepend-icon="event"
                          clearable
                          class="pt-0"
                          readonly
                          ></v-text-field>
                          <v-date-picker v-model="ngaytuFilter" @input="parseSerialDateFrom()"></v-date-picker>
                        </v-menu>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Ngày nộp đến</label></v-flex>
                    <v-flex xs9>
                        <v-menu
                          :close-on-content-click="true"
                          v-model="menuSerialDateTo"
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
                          v-model="filterSerial['ngaydenFilter']"
                          prepend-icon="event"
                          clearable
                          class="pt-0"
                          readonly
                          ></v-text-field>
                          <v-date-picker v-model="ngaydenFilter" @input="parseSerialDateTo()"></v-date-picker>
                        </v-menu>
                    </v-flex>
                </v-layout>
            </v-flex>
            <v-flex xs12 md4>
                <v-layout wrap>
                    <v-flex xs3><label>Trạng thái</label></v-flex>
                    <v-flex xs9>
                        <v-select
                            v-model="filterSerial['ttFilter']"
                            :items="trangThaiSerial"
                            item-text="text"
                            item-value="value"
                            style="padding-top: 0px"
                            autocomplete
                            clearable
                        >
                        </v-select>
                    </v-flex>
                </v-layout>
            </v-flex>
        </v-layout>
		<v-layout wrap>
			<v-flex xs12 style="text-align: center;">
			 	<v-btn color="primary" class="mx-0 my-0 mt-2"  @click="getDanhSachSuaDoiSerial()">Tìm kiếm</v-btn>
			</v-flex>
		</v-layout>
        <span class="ml-4 mb-2">Tổng số: {{totalSerial}}</span>
	</div>
</v-slide-y-transition>

<v-slide-x-transition>

    <v-data-table
      :headers="headersDSSuaDoiSerial"
      :items="danhSachSuaDoiSerial"
      hide-actions
      class="elevation-1 table-serial"
    >
        <template slot="items" scope="props">
        <td>{{ props.index + 1 }}</td>
        <td>{{ props.item.applicantName }}</td>  
        <td>{{ props.item.dossierNo }}</td>
        <td>{{ props.item.appliedDate }}</td>
        <td>{{ getTextVehicleClass(props.item.vehicleClass) }}</td>
        <td>{{ getTextDigitalIssueStatus(props.item.digitalIssueStatus) }}</td>
        <td class="text-center" >
            <span v-if="props.item.digitalIssueStatus == '9'" style="color: #0b72ba; font-weight: bold; cursor: pointer;" @click="closeSuaDoiSerial(props.item)">Đóng HS</span>
            <span v-if="props.item.digitalIssueStatus == '5'" style="color: #0b72ba; font-weight: bold; cursor: pointer;" @click="acceptSuaDoiSerial(props.item)">Đồng ý</span>
            <span v-if="props.item.digitalIssueStatus == '5'" style="margin-left: 5px; margin-right: 5px;">||</span>
            <span v-if="props.item.digitalIssueStatus == '5'" style="color: #0b72ba; font-weight: bold; cursor: pointer;" @click="cancelSuaDoiSerial(props.item)">Từ chối</span>
        </td>
        </template>
  </v-data-table>

</v-slide-x-transition>

<v-slide-x-transition>
    <v-layout wrap style="justify-content: flex-end;">
        <v-pagination :length="lengthPageSerial" v-model="pageSerial" class="mt-3" @input="pagingSerial"></v-pagination>
    </v-layout>
</v-slide-x-transition>