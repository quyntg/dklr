<template>
    <div style="width:100%">   
        <div id="title-danhsachpt" class="row-header" style="height: 38px; overflow: hidden;display: flex; justify-content: space-between;">
          <div class="background-triangle-big view_tp_pdf" ><span>Tra cứu phương tiện sản xuất, lắp ráp</span></div>
          <div class="collapsible1 mr-3" style="cursor: pointer;">
            <span @click="isToggle=!isToggle" style="font-weight: bold; color: blue;">Tìm kiếm </span>
          </div>
        </div>     
        <div class="collapsible-content" v-if="isToggle">
            <v-layout wrap style="background: #fff;">
                <v-flex xs12 sm3 style="font-weight: bold;  margin-top: 24px; text-align: right; padding-right: 10px;">
                  <span class="text-xs-right">Chọn đối tượng: </span>
                </v-flex>
                <v-flex xs12 sm9>
                  <v-select
                      @input="selectObjectPTAction()"
                      v-model="selectObjectPT"
                      :items="objectPT"
                      return-object
                      item-text="name"
                      item-value="module"
                      autocomplete
                      placeholder="Tên đối tượng"
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
                            @click="addSearchPT"
                            >
                            <v-icon size="17" style="color: #fff; font-size: 16px">add</v-icon> Thêm
                        </v-chip> -->
                    
                        <span style="float: right; font-weight: bold; padding-right: 10px; margin-top: 6px;">Điều kiện tìm kiếm: </span>
                    </div>
                </v-flex>
                <v-flex md9>
                    <div class="filter-item" v-for="(item, index) in listSearchPT" :key="index" style="clear: both;">
                        <v-select
                            style="display: inline-block; width: 36%; float: left;"
                            outlined
                            autocomplete
                            class="py-0 my-0 pr-2"
                            @input="changeConditionPT(item)"
                            :items="conditionsPT"
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
                            ref="menuDateTraCuuFromPT"
                            :close-on-content-click="false"
                            v-if="item['conditionsSelect'] && item['conditionsSelect']['type'] === 'date'"
                            v-model="menuDateTraCuuFromPT"
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
                            <v-date-picker v-model="item['fromDateTraCuuPT']" @input="parseDateTraCuuFromPT(item)"></v-date-picker>
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
                            ref="menuDateTraCuuToPT"
                            :close-on-content-click="false"
                            v-if="item['conditionsSelect'] && item['conditionsSelect']['type'] === 'date'"
                            v-model="menuDateTraCuuToPT"
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
                            <v-date-picker v-model="item['toDateTraCuuPT']" @input="parseDateTraCuuToPT(item)"></v-date-picker>
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

                        <!-- <v-select
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
                        ></v-select> -->

                        <v-chip
                          class="mt-2"
                          style="height: 22px; float: right;"
                          label
                          @click="removeSearchPT(item, index)"
                          >
                          <v-icon size="18" style="font-size: 17px;" color="red">delete_outline</v-icon>
                        </v-chip>
                        <br>
                    </div>
                </v-flex>
                <v-flex xs12 sm12 class="text-xs-center">                    
                    <v-btn small @click="addSearchPT" color="primary" class="ml-0" style="">
                        <v-icon size="17" style="color: #fff; font-size: 16px">add</v-icon>
                        Thêm điều kiện
                    </v-btn>
                    <v-btn small color="primary" class="ml-0"  @click="traCuuPhuongTien" style="">
                        <v-icon size="17" style="color: #fff; font-size: 17px">search</v-icon> 
                        Tìm kiếm
                    </v-btn>
                </v-flex>
                <!-- <v-btn small color="primary"  @click="search" style="margin: 0 10px;">Xuất Excel  <v-icon>mdi-file-excel</v-icon></v-btn>  -->

                <v-data-table
                    :headers="headersPT"
                    :items="listsTraCuuPT"
                    :loading="loadingTableTraCuuPT"
                    no-data-text = "Không có dữ liệu"
                    :hide-default-header="false"
                    hide-default-footer
                    hide-actions
                    class="datatablePT"
                  >
                    <template slot="items" slot-scope="props">
                      <tr>
                        <td v-for="(itemHeader, index) in headersPT" class="text-xs-center">
                          <span v-if="itemHeader['display'] === 'stt'">{{pageTraCuuThongKePT * 20 - 20 + props.index + 1}}</span>
                          <div v-else-if="itemHeader['display'] === 'action'">

                           <v-chip label outline color="blue" v-if="checkMtCore(props.item)" @click="xemHoSoCapPhieu(props.item)"><v-icon
                                    size="17"
                                    style="font-size: 15px;"
                                    color="green"
                                    >
                                    done
                                </v-icon>Xem HSCP
                            </v-chip>
                            <v-chip label outline color="blue" v-if="checkMtCore(props.item)" @click="xemThongTinPXX(props.item)"><v-icon
                                    size="17"
                                    style="font-size: 15px;"
                                    color="green"
                                    >
                                    done
                                </v-icon>Xem thông tin PXX
                            </v-chip>                    
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
                      <span><i>Tổng số: </i> <label>{{totalTraCuuPT}}</label></span>
                      <v-pagination :length="lengthPageTraCuuPhuongTien" v-model="pageTraCuuThongKePT" class="mt-3" @input="pagingTraCuuPhuongTien"></v-pagination>
                  </div>
            </v-layout>


        </div>
    </div>
</template>