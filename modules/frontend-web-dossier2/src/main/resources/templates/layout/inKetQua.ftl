<div style="width: 100%;">
	<v-slide-x-transition>

    <div class="row-header flex-break" v-if="!detailPage">

      <div class="background-triangle-big"> <v-icon flat fab color="white" class="setting_action_all">settings</v-icon> In kết quả </div>

      <div class="layout row wrap header_tools w-100-xs">
        <div class="flex w-100-xs"></div>
        <v-btn v-if="navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen</v-icon></v-btn>

        <v-btn v-if="!navigationFilterview" v-on:click.native="navigationFilterview = !navigationFilterview" flat icon class="mr-4 hidden-sm-and-down"><v-icon>fullscreen_exit</v-icon></v-btn>

      </div>

    </div>

  	</v-slide-x-transition>

  	<v-slide-x-transition>
  		<v-layout row wrap class="ml-0">

        <v-flex xs12 sm2 class="text-xs-right py-0" v-if="typeInKetQua == 'phieu_xuat_xuong'">
          <label class="pt-1 pr-1">Đối tượng: </label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0" v-if="typeInKetQua == 'phieu_xuat_xuong'">
          <v-select
          :items="doiTuongPhieuItems"
          item-text="itemName"
          item-value="itemCode"
          autocomplete
          clearable
          v-model="doiTuongPhieuFilter"
          class="pt-0"
          ></v-select>
        </v-flex>

        <v-flex xs12 sm12 v-if="typeInKetQua == 'phieu_xuat_xuong'">
          
        </v-flex>


  			<#-- <v-flex xs12 sm2 class="text-xs-right py-0" v-if="typeInKetQua == 'phieu_xuat_xuong'">
          <label class="pt-1">Trạng thái: </label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0" v-if="typeInKetQua == 'phieu_xuat_xuong'">
          <v-select
          :items="trangThaiPhieuItems"
          item-text="itemName"
          item-value="itemCode"
          autocomplete
          clearable
          v-model="trangThaiPhieuFilter"
          class="pt-0"
          ></v-select>
        </v-flex> -->

        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-1">Số hồ sơ: </label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-text-field
            v-model="soHoSoInKQFilter"
            clearable
            class="px-0 py-0 mx-0 my-0"
          ></v-text-field>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-1">Tình trạng: </label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-select
          :items="trangThaiInKQItems"
          item-text="itemName"
          item-value="itemCode"
          autocomplete
          clearable
          v-model="trangThaiInFilter"
          class="pt-0"
          ></v-select>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>Ngày hồ sơ (Từ):</label>
        </v-flex>
        <v-flex xs12 sm4 class="text-xs-right pr-1">
          <v-menu
          :close-on-content-click="false"
          v-model="menuNgayHoSoFromFilter"
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
          v-model="ngayHoSoFromFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateNgayHoSoFromFilter" @input="parseNgay('ngayHoSoFromFilter', 'dateNgayHoSoFromFilter')"></v-date-picker>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>(Đến):</label>
        </v-flex>
        <v-flex xs12 sm4 class="text-xs-right pr-1">
          <v-menu
          :close-on-content-click="false"
          v-model="menuNgayHoSoToFilter"
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
          v-model="ngayHoSoToFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateNgayHoSoToFilter" @input="parseNgay('ngayHoSoToFilter', 'dateNgayHoSoToFilter')"></v-date-picker>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-1">Số chứng chỉ: </label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-text-field
            v-model="soChungChiInKQFilter"
            clearable
            class="px-0 py-0 mx-0 my-0"
          ></v-text-field>
        </v-flex>

        <v-flex xs12 sm6 class="text-xs-right py-0">
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>Ngày cấp CC (Từ):</label>
        </v-flex>
        <v-flex xs12 sm4 class="text-xs-right pr-1">
          <v-menu
          :close-on-content-click="false"
          v-model="menuChungChiFromFilter"
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
          v-model="ngayChungChiFromFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateNgayChungChiFromFilter" @input="parseNgay('ngayChungChiFromFilter', 'dateNgayChungChiFromFilter')"></v-date-picker>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right pr-1 pt-1">
          <label>(Đến):</label>
        </v-flex>
        <v-flex xs12 sm4 class="text-xs-right pr-1">
          <v-menu
          :close-on-content-click="false"
          v-model="menuNgayChungChiToFilter"
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
          v-model="ngayChungChiToFilter"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateNgayChungChiToFilter" @input="parseNgay('ngayChungChiToFilter', 'dateNgayChungChiToFilter')"></v-date-picker>
        </v-flex>

  			<v-flex xs12 sm12 class="text-xs-center">
          <!--<v-btn small color="primary" @click="inKetQua()">In phiếu</v-btn> -->
  			  <v-btn small color="primary" @click="timKiemDsInKetQua()">Tìm kiếm</v-btn>
  			</v-flex>

  		  <v-flex xs12 sm12 class="text-xs-right">
          <div id="printPDF" style="display: none;">
            
          </div>

          <div v-if="typeInKetQua == 'gcn_csbhbd' || typeInKetQua == 'thong_bao_ket_qua_dgcop' || typeInKetQua == 'tb_dinhky_bhbd'">
            <v-data-table
              :headers="headersDSInKetQua"
              :items="itemsDSInKetQua"
              no-data-text="Không có dữ liệu"
              hide-actions
              disable-initial-sort="true"
              class="table__overflow ml-0"
              loading="true"
              select-all
              hide-actions
              >
                <template slot="headers" slot-scope="props">
                  <tr>
                    <th style="background: #14BEF0;">
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
                    :class="['column text-xs-center']" v-html="header.text"
                    >
                  </th>
                </tr>
                </template>
                <template slot="items" slot-scope="props">
                  <td style="padding-top: 3px;"> 
                    <v-checkbox
                    primary
                    hide-details
                    :value="props.item"
                    v-model="selected"
                    ></v-checkbox> 
                  </td>
                  <td style="padding: 8px; padding-left: 0px; text-align: center;">{{ pageDSInKetQua * 15 - 15 + props.index + 1 }}</td>
                  <td style="padding: 8px;" class="text-xs-left">
                    <a href="javascript:;" @click.prevent.stop="toDetailHoSo(props.item)">
                      {{ props.item.serviceName }} 
                      <br>
                    </a>
                    {{ props.item.applicantName }} <br>
                    <#-- <i style="color: red;" v-if="props.item['specialNo'] == 0">
                      Hồ sơ chỉ được theo dõi
                    </i> -->
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item.dossierIdCTN }} 
                    <br v-if="props.item['inspectorSubmitDate']">
                    {{ props.item.inspectorSubmitDate}}
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item.dossierNo }} 
                    <br v-if="props.item['inspectorReceiveDate']">
                    {{ props.item.inspectorReceiveDate}}
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">

                    <span v-if="props.item.copReportNo">{{ props.item.copReportNo }}</span>
                    <span v-else>---</span> <br>
                    <span v-if="props.item.copReportDate">{{ props.item.copReportDate }}</span>
                    <span v-else>---</span>
                  </td>

                  <td style="padding: 8px;" class="text-xs-left" v-html="props.item.inspectionNote">


                  </td>
                  <td style="padding: 8px;" class="text-xs-left">
                    <div v-if="!props.item['loadingPrint']">
                      <a href="javascript:;" @click="inThu(props.item)">In</a> | <a href="javascript:;" @click="xemTruocIn(props.item)">Xem trước</a>
                    </div>
                    <div v-else>
                      <a href="javascript:;">Đang tải.....</a>
                    </div>
                  </td>
                </template>
            </v-data-table>   
            <v-pagination :length="lengthDSInKetQua" v-model="pageDSInKetQua" class="mt-3" @input="loadDsIn()">
            </v-pagination>
          </div>          

          <div v-else-if="typeInKetQua == 'tb_xnhl_xcg' || typeInKetQua == 'tb_xnhl_xm' || typeInKetQua == 'tb_xnhl_xdd' || typeInKetQua == 'tb_xnhl_lk_xm'">
            <v-data-table
              :headers="headersDSInKetQua"
              :items="itemsDSInKetQua"
              no-data-text="Không có dữ liệu"
              hide-actions
              disable-initial-sort="true"
              class="table__overflow ml-0"
              loading="true"
              select-all
              hide-actions
              >
                <template slot="headers" slot-scope="props">
                  <tr>
                    <th style="background: #14BEF0;">
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
                    :class="['column text-xs-center']" v-html="header.text"
                    >
                  </th>
                </tr>
                </template>
                <template slot="items" slot-scope="props">
                  <td style="padding-top: 3px;"> 
                    <v-checkbox
                    primary
                    hide-details
                    :value="props.item"
                    v-model="selected"
                    ></v-checkbox> 
                  </td>
                  <td style="padding: 8px; padding-left: 0px; text-align: center;">{{ pageDSInKetQua * 15 - 15 + props.index + 1 }}</td>
                  <td style="padding: 8px;" class="text-xs-left">
                    <a href="javascript:;" @click.prevent.stop="toDetailHoSo(props.item)">
                      {{ props.item.serviceName }} 
                      <br>
                    </a>
                    {{ props.item.applicantName }} <br>
                    <#-- <i style="color: red;" v-if="props.item['specialNo'] == 0">
                      Hồ sơ chỉ được theo dõi
                    </i> -->
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item.validDossierIdCTN }} 
                    <br v-if="props.item['inspectorSubmitDate']">
                    {{ props.item.inspectorSubmitDate}}
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item.validDossierNo }} 
                    <br v-if="props.item['inspectorReceiveDate']">
                    {{ props.item.inspectorReceiveDate}}
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">

                    <span v-if="props.item.copReportNo">{{ props.item.copReportNo }}</span>
                    <span v-else>---</span> <br>
                    <span v-if="props.item.copReportDate">{{ props.item.copReportDate }}</span>
                    <span v-else>---</span>
                  </td>

                  <td style="padding: 8px;" class="text-xs-left" v-html="props.item.inspectionNote">


                  </td>
                  <td style="padding: 8px;" class="text-xs-left">
                    <div v-if="!props.item['loadingPrint']">
                      <a href="javascript:;" @click="inThu(props.item)">In</a> | <a href="javascript:;" @click="xemTruocIn(props.item)">Xem trước</a>
                    </div>
                    <div v-else>
                      <a href="javascript:;">Đang tải.....</a>
                    </div>
                  </td>
                </template>
            </v-data-table>   
            <v-pagination :length="lengthDSInKetQua" v-model="pageDSInKetQua" class="mt-3" @input="loadDsIn()">
            </v-pagination>
          </div>

  		  	<div v-else-if="typeInKetQua != 'chi_tiet_phieu_xuat_xuong' && typeInKetQua != 'phieu_xuat_xuong'">
            <v-data-table
              :headers="headersDSInKetQua"
              :items="itemsDSInKetQua"
              no-data-text="Không có dữ liệu"
              hide-actions
              disable-initial-sort="true"
              class="table__overflow ml-0"
              loading="true"
              select-all
              hide-actions
              >
                <template slot="headers" slot-scope="props">
                  <tr>
                    <th style="background: #14BEF0;">
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
                    :class="['column text-xs-center']" v-html="header.text"
                    >
                  </th>
                </tr>
                </template>
                <template slot="items" slot-scope="props">
                  <td style="padding-top: 3px;"> 
                    <v-checkbox
                    primary
                    hide-details
                    :value="props.item"
                    v-model="selected"
                    ></v-checkbox> 
                  </td>
                  <td style="padding: 8px; padding-left: 0px; text-align: center;">{{ pageDSInKetQua * 15 - 15 + props.index + 1 }}</td>
                  <td style="padding: 8px;" class="text-xs-left">
                    <a href="javascript:;" @click.prevent.stop="toDetailHoSo(props.item)">
                      {{ props.item.serviceName }} 
                      <br>
                    </a>
                    {{ props.item.applicantName }} <br>
                    <#-- <i style="color: red;" v-if="props.item['specialNo'] == 0">
                      Hồ sơ chỉ được theo dõi
                    </i> -->
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item.dossierIdCTN }} 
                    <br v-if="props.item['inspectorSubmitDate']">
                    {{ props.item.inspectorSubmitDate}}
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item.dossierNo }} 
                    <br v-if="props.item['inspectorReceiveDate']">
                    {{ props.item.inspectorReceiveDate}}
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">

                    <span v-if="props.item.certificateRecordNo">{{ props.item.certificateRecordNo }}</span>
                    <span v-else>---</span> <br>
                    <span v-if="props.item.certificateRecordDate">{{ props.item.certificateRecordDate }}</span>
                    <span v-else>---</span>
                  </td>

                  <td style="padding: 8px;" class="text-xs-left" v-html="props.item.inspectionNote">


                  </td>
                  <td style="padding: 8px;" class="text-xs-left">
                    <div v-if="!props.item['loadingPrint']">
                      <a href="javascript:;" @click="inThu(props.item)">In</a> | <a href="javascript:;" @click="xemTruocIn(props.item)">Xem trước</a>
                    </div>
                    <div v-else>
                      <a href="javascript:;">Đang tải.....</a>
                    </div>
                  </td>
                </template>
            </v-data-table>   
            <v-pagination :length="lengthDSInKetQua" v-model="pageDSInKetQua" class="mt-3" @input="loadDsIn()">
            </v-pagination>
          </div>

          <div v-else-if="typeInKetQua == 'phieu_xuat_xuong'">
            <v-data-table
              :headers="headersDSPhieuXX"
              :items="itemsDSInKetQua"
              no-data-text="Không có dữ liệu"
              hide-actions
              select-all
              class="table__overflow ml-0"
              loading="true"
              hide-actions
              >
                <template slot="headers" slot-scope="props">
                  <tr>
                    <th style="background: #14BEF0;">
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
                    :class="['column text-xs-center']" v-html="header.text"
                    >
                  </th>
                </tr>
                </template>
                <template slot="items" slot-scope="props">
                  <td style="padding-top: 3px;"> 
                    <v-checkbox
                    primary
                    hide-details
                    :value="props.item"
                    v-model="selected"
                    ></v-checkbox> 
                  </td>
                  <td style="padding: 8px; padding-left: 0px; text-align: center;">{{ pageDSInKetQua * 15 - 15 + props.index + 1 }}</td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item.dossierNo }} 
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">
                    <span>{{ props.item.appliedDate }}</span>
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">
                    {{ getTextVehicleClass(props.item.vehicleClass) }} 
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">
                    {{ getTextIssueType(props.item.issueType) }} 
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">
                    <span>{{ props.item.totalInDocument }}</span>
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">
                    <span>{{ props.item.totalInUse }}</span>
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">
                    <div>
                      <a @click="typeInKetQua = 'chi_tiet_phieu_xuat_xuong'; loadDsChiTietPhieuXX(props.item)" href="javascript:;">Xem</a>
                    </div>
                  </td>
                </template>
            </v-data-table>

            <v-pagination :length="lengthDSInKetQua" v-model="pageDSInKetQua" class="mt-3" @input="loadDsIn()">
            </v-pagination>
          </div>

          <div v-else>
            <v-data-table
              :headers="headersDSChiTietPhieuXX"
              :items="itemsDSChiTietPhieuXX"
              no-data-text="Không có dữ liệu"
              hide-actions
              select-all
              class="table__overflow ml-0"
              loading="true"
              hide-actions
              >
                <template slot="headers" slot-scope="props">
                  <tr>
                    <th style="background: #14BEF0;">
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
                    :class="['column text-xs-center']" v-html="header.text"
                    >
                  </th>
                </tr>
                </template>
                <template slot="items" slot-scope="props">
                  <td style="padding-top: 3px;"> 
                    <v-checkbox
                    primary
                    hide-details
                    :value="props.item"
                    v-model="selected"
                    ></v-checkbox> 
                  </td>
                  <td style="padding: 8px; padding-left: 0px; text-align: center;">{{ pageDSChiTietPhieuXX * 15 - 15 + props.index + 1 }}</td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item['certificaterecordno'] }}
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item['certificateRecordDate'] }} 
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item['productionDate'] }} 
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item['FrameNo']}}
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item['EngineNo'] }} 
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    {{ props.item['Color']}}
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    <span>{{ props.item['boxNo'] }}</span>
                  </td>

                  <td style="padding: 8px;" class="text-xs-center">
                    <span>{{ props.item['serialNo'] }}</span>
                  </td>
                  <td style="padding: 8px;" class="text-xs-center">
                    <a href="javascript:;">In thử</a> | <a href="javascript:;">Xem trước</a>
                  </td>
                </template>
            </v-data-table>

            <v-pagination :length="lengthDSChiTietPhieuXX" v-model="pageDSChiTietPhieuXX" class="mt-3" @input="loadDsChiTietPhieuXX()"></v-pagination>
          </div>
  			
  		  </v-flex>
  		</v-layout>
  	</v-slide-x-transition>
</div>
