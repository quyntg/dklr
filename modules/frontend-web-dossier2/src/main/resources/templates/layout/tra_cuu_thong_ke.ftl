<template>
    <div style="width:100%">   
        <div id="title-danhsach" class="row-header" style="height: 38px; overflow: hidden;display: flex; justify-content: space-between;">
          <div class="background-triangle-big view_tp_pdf" ><span>Tra cứu thông tin {{ selectModule['pathParent']}}</span></div>
          <div class="collapsible1 mr-3" style="cursor: pointer;">
            <span @click="isToggle=!isToggle" style="font-weight: bold; color: blue;">Tìm kiếm </span>
          </div>
        </div>     
        <div class="collapsible-content" v-if="isToggle">
            <v-layout wrap style="background: #fff;">
                <v-flex xs12 sm3 style="font-weight: bold;  margin-top: 24px; text-align: right; padding-right: 10px;">
                  <span class="text-xs-right">Chọn hồ sơ: </span>
                </v-flex>
                <v-flex xs12 sm9>
                  <v-select
                      @input="selectModuleAction()"
                      v-model="selectModule"
                      :items="modules"
                      return-object
                      item-text="name"
                      item-value="module"
                      autocomplete
                      placeholder="Tên Module"
                  >
                    <#-- <template v-slot:append-outer>
                        <v-icon>
                            mdi-magnify
                        </v-icon> 
                    </template> -->
                </v-select>
                </v-flex>
                <v-flex md3>
                    <div>
                        <#-- <v-chip
                            style="height: 22px; color: #fff;"
                            color="primary"
                            label
                            @click="addSearch"
                            >
                            <v-icon size="17" style="color: #fff; font-size: 16px">add</v-icon> Thêm
                        </v-chip> -->
                    
                        <span style="float: right; font-weight: bold; padding-right: 10px; margin-top: 6px;">Điều kiện tìm kiếm: </span>
                    </div>
                </v-flex>
                <v-flex md9>
                    <div class="filter-item" v-for="(item, index) in listSearch" :key="index" style="clear: both;">
                        <v-select
                            style="display: inline-block; width: 36%; float: left;"
                            outlined
                            autocomplete
                            class="py-0 my-0 pr-2"
                            @input="changeCondition(item)"
                            :items="conditions"
                            item-text="value"
                            clearable
                            v-model="item['conditionsSelect']"
                            height="15"
                            return-object
                        ></v-select>
                        <v-text-field
                            style="display: inline-block; width: 35%;"
                            v-if="item['conditionsSelect'] && (item['conditionsSelect']['type'] === 'string' || item['conditionsSelect']['type'] === 'keyword')"
                            outlined
                            class="py-0 my-0 pr-1"
                            placeholder="Nhập từ khóa"
                            v-model="item['valueSearch']"
                            height="15"
                        >
                        </v-text-field>
                        <v-text-field
                            style="display: inline-block; width: 35%;"
                            v-if="item['conditionsSelect'] && item['conditionsSelect']['type'] === 'number'"
                            outlined
                            class="py-0 my-0"
                            type="number"
                            placeholder="Nhập số"
                            v-model="item['valueSearch']"
                            height="15"
                        >
                        </v-text-field>

                        <v-menu
                            ref="menuDateTraCuuFrom"
                            :close-on-content-click="false"
                            v-if="item['conditionsSelect'] && item['conditionsSelect']['type'] === 'date'"
                            v-model="menuDateTraCuuFrom"
                            :nudge-right="40"
                            :return-value.sync="date"
                            lazy
                            transition="scale-transition"
                            offset-y
                            full-width
                            style="width: 27%; display: normal;"
                            >
                            <v-text-field
                            slot="activator"
                            v-model="item['fromDate']"
                            prepend-icon="event"
                            clearable
                            class="pt-0"
                            readonly
                            ></v-text-field>
                            <v-date-picker v-model="item['fromDateTraCuu']" @input="parseDateTraCuuFrom(item)"></v-date-picker>
                        </v-menu>
                        <#-- <DateTimePicker
                            style="display: inline-block; width: 25%;"
                            v-if="item['conditionsSelect']['type'] === 'date'"
                            v-model="item['fromDate']"
                            :first-day="1"
                            class="py-0 my-0"
                            :show-dst="false"
                            :show-hours="true"
                            :show-minutes="true"
                            :show-seconds="false"
                        ></DateTimePicker> -->

                        <v-menu
                            ref="menuDateTraCuuTo"
                            :close-on-content-click="false"
                            v-if="item['conditionsSelect'] && item['conditionsSelect']['type'] === 'date'"
                            v-model="menuDateTraCuuTo"
                            :nudge-right="40"
                            :return-value.sync="date"
                            lazy
                            transition="scale-transition"
                            offset-y
                            full-width
                            style="width: 28%; display: normal;"
                            >
                            <v-text-field
                            slot="activator"
                            v-model="item['toDate']"
                            prepend-icon="event"
                            clearable
                            class="pt-0"
                            readonly
                            ></v-text-field>
                            <v-date-picker v-model="item['toDateTraCuu']" @input="parseDateTraCuuTo(item)"></v-date-picker>
                        </v-menu>

                        <#-- <DateTimePicker
                            style="display: inline-block; width: 25%;"
                            v-if="item['conditionsSelect']['type'] === 'date'"
                            v-model="item['toDate']"
                            :first-day="1"
                            class="py-0 my-0"
                            :show-dst="false"
                            :show-hours="true"
                            :show-minutes="true"
                            :show-seconds="false"
                        ></DateTimePicker> -->

                        <v-select
                            style="display: inline-block; width: 30%;"
                            v-if="item['conditionsSelect'] && item['conditionsSelect']['type'] === 'select'"
                            v-model="item['valueSearch']"
                            :items="item['conditionsSelect']['items']"
                            outlined
                            autocomplete
                            class="py-0 my-0"
                            item-text="itemText"
                            item-value="itemValue"
                            height="15"
                        >
                        </v-select>

                        <v-select
                            v-if="item['conditionsSelect'] && (item['conditionsSelect']['type'] === 'string' || item['conditionsSelect']['type'] === 'number' || item['conditionsSelect']['type'] === 'keyword')"
                            v-model="item['typeSearch']"
                            :items="item['typeSearchItems']"
                            item-text="name"
                            class="py-0 my-0"
                            item-value="altername"
                            autocomplete
                            style="display: inline-block; width: 20%;"
                            outlined
                            height="15"
                        ></v-select>

                        <v-chip
                          class="mt-2"
                          style="height: 22px; float: right;"
                          label
                          @click="removeSearch(item, index)"
                          >
                          <v-icon size="18" style="font-size: 17px;" color="red">delete_outline</v-icon>
                        </v-chip>
                        <br>
                    </div>
                </v-flex>
                <v-flex xs12 sm12 class="text-xs-center">                    
                    <v-btn small @click="addSearch" color="primary" class="ml-0" style="">
                        <v-icon size="17" style="color: #fff; font-size: 16px">add</v-icon>
                        Thêm điều kiện
                    </v-btn>
                    <v-btn small color="primary" class="ml-0"  @click="traCuuThongKe" style="">
                        <v-icon size="17" style="color: #fff; font-size: 17px">search</v-icon> 
                        Tìm kiếm
                    </v-btn>
                </v-flex>
                <!-- <v-btn small color="primary"  @click="search" style="margin: 0 10px;">Xuất Excel  <v-icon>mdi-file-excel</v-icon></v-btn>  -->

                <v-data-table
                    :headers="headersTraCuu"
                    :items="listsTraCuu"
                    :loading="loadingTableTraCuu"
                    no-data-text = "Không có dữ liệu"
                    :hide-default-header="false"
                    hide-default-footer
                    hide-actions
                  >
                    <template slot="items" slot-scope="props">
                      <tr>
                        <td v-for="(itemHeader, index) in headersTraCuu" class="text-xs-center">
                          <span v-if="itemHeader['display'] === 'stt'">{{pageTraCuuThongKe * 20 - 20 + props.index + 1}}</span>
                          <div v-else-if="itemHeader['display'] === 'action'">

                            <v-chip label outline color="blue" v-if="checkMtCore(props.item)" @click="xemHoSo(props.item)"><v-icon
                                    size="17"
                                    style="font-size: 15px;"
                                    color="green"
                                    >
                                    done
                                </v-icon>Xem hồ sơ</v-chip> <br v-if="checkMtCore(props.item)">

                            <v-chip label outline color="blue" v-if="checkMtCore(props.item) && checkShowBtn(props.item)" @click="xemGiayChungNhan(props.item)" v-if="selectModule['module'] !== 'COP'">
                                <v-icon
                                    size="17"
                                    style="font-size: 15px;"
                                    :color="(props.item['vr_VehicleTypeCertificate'] && props.item['vr_VehicleTypeCertificate']['deliverableFileEntryId'] && props.item['vr_VehicleTypeCertificate']['deliverableFileEntryId'] != '0') ? 'green' : 'red'"
                                    >
                                    {{(props.item['vr_VehicleTypeCertificate'] && props.item['vr_VehicleTypeCertificate']['deliverableFileEntryId'] && props.item['vr_VehicleTypeCertificate']['deliverableFileEntryId'] != '0') ? 'done' : 'cancel'}}
                                </v-icon>
                                Xem GCN
                            </v-chip>

                            <v-chip label outline color="blue" v-if="checkMtCore(props.item) && checkShowBtn(props.item)" @click="xemGiayChungNhan(props.item)" v-else>
                                <v-icon
                                    size="17"
                                    style="font-size: 15px;"
                                    :color="(props.item['vr_COPReportRepository'] && props.item['vr_COPReportRepository']['COPFileEntryId'] && props.item['vr_COPReportRepository']['COPFileEntryId'] != '0') ? 'green' : 'red'"
                                    >
                                    {{(props.item['vr_COPReportRepository'] && props.item['vr_COPReportRepository']['COPFileEntryId'] && props.item['vr_COPReportRepository']['COPFileEntryId'] != '0') ? 'done' : 'cancel'}}
                                </v-icon>
                                TBKQ
                            </v-chip> <br v-if="checkMtCore(props.item) && checkShowBtn(props.item)">

                            <v-chip label outline color="blue" v-if="checkMtCore(props.item) && checkShowBtn(props.item)" @click="xemBienBan(props.item)">
                                <v-icon
                                    size="17"
                                    style="font-size: 15px;"
                                    :color="(props.item['vr_VehicleTypeCertificate'] && props.item['vr_VehicleTypeCertificate']['inspectionDossierFileId'] && props.item['vr_VehicleTypeCertificate']['inspectionDossierFileId'] != '0') ? 'green' : 'red'"
                                    >
                                    {{(props.item['vr_VehicleTypeCertificate'] && props.item['vr_VehicleTypeCertificate']['inspectionDossierFileId'] && props.item['vr_VehicleTypeCertificate']['inspectionDossierFileId'] != '0') ? 'done' : 'cancel'}}
                                </v-icon>
                                Xem biên bản
                            </v-chip> <br v-if="checkMtCore(props.item) && checkShowBtn(props.item)">

                            <v-chip label outline color="blue" @click="xemTSKT(props.item)" v-if="selectModule['module'] !== 'COP'">
                                <v-icon
                                    size="17"
                                    style="font-size: 15px;"
                                    color="green"
                                    >
                                    done
                                </v-icon>
                                Xem TSKT
                            </v-chip>

                            <#-- <span style="color: blue; cursor: pointer;" v-if="checkMtCore(props.item)" @click="xemHoSo(props.item)">Xem hồ sơ</span> -->
                            <#-- <span style="color: blue; cursor: pointer;" v-if="checkMtCore(props.item)" @click="xemGiayChungNhan(props.item)">Xem giấy chứng nhận</span>
                            <span style="color: blue; cursor: pointer;" v-if="checkMtCore(props.item)" @click="xemBienBan(props.item)">Xem biên bản</span>
                            <span style="color: blue; cursor: pointer;" @click="xemBienBan(props.item)">Xem TSKT</span> -->
                            
                          </div>
                          <span v-else-if="itemHeader['display'] === 'vr_VehicleTypeCertificate.certificateRecordNo' || itemHeader['display'] === 'vr_VehicleTypeCertificate.certificateRecordDate'">
                              <span v-if="props.item['vr_VehicleTypeCertificate'] && props.item['vr_VehicleTypeCertificate']['certificateRecordStatus'] === 2 || props.item['vr_VehicleTypeCertificate']['certificateRecordStatus'] === '2' || props.item['vr_VehicleTypeCertificate']['certificateRecordStatus'] === 3 || props.item['vr_VehicleTypeCertificate']['certificateRecordStatus'] === '3'">
                                  {{getDisplay(props.item, itemHeader['display'], itemHeader['type'])}}
                              </span>
                          </span>

                          <span v-else-if="itemHeader['display'] === 'vr_Issue.methodOfIssue'">
                                {{getTextMethodOfIssue(getDisplay(props.item, itemHeader['display'], itemHeader['type']))}}
                          </span>
                          <span v-else-if="itemHeader['display'].indexOf('.dossierNo') != -1">
                                <span v-if="!getDisplay(props.item, itemHeader['display'], itemHeader['type']) && checkInspectorReceiveDate(props.item)">
                                    <#-- Nháp -->
                                </span>
                                <span v-else>{{getDisplay(props.item, itemHeader['display'], itemHeader['type'])}}</span>
                          </span>

                          <span v-else>{{getDisplay(props.item, itemHeader['display'], itemHeader['type'])}}</span>
                        </td>
                      </tr>
                    </template>
                  </v-data-table>


                  <div class="text-xs-right" style="width: 100%;">
                      <span><i>Tổng số: </i> <label>{{totalTraCuu}}</label></span>
                      <v-pagination :length="lengthPageTraCuuThongKe" v-model="pageTraCuuThongKe" class="mt-3" @input="pagingTraCuu"></v-pagination>
                  </div>
            </v-layout>


        </div>
    </div>
</template>