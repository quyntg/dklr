<template>

  <div class="flex mt-3 px-0 xs12 sm12">
    <div>
      <div class="layout ml-0 row wrap" style="border: 1px solid rgb(204, 204, 204);">
       <div class="flex pt-0 px-0 xs12 sm6" style="position: relative;">
        <span class="text-bold" style="position: absolute; top: -13px; left: 5px; padding: 0px 10px; background-color: rgb(255, 255, 255);">Danh sách giấy chứng nhận</span> 
        <div class="layout ml-0 row wrap">
          <div class="flex px-0 py-0 xs12 sm4" style="border-right: 1px solid rgb(204, 204, 204);">
            <div class="text-xs-center py-2" style="width: 100%;">
              <span>Số giấy chứng nhận</span>
            </div>
            <v-list class="list_li_active" style="max-height: 314px; overflow: auto;">
              <v-list-tile v-for="(item, index) in detailSoatXetGCN['danh_sach_gcn']" v-bind:key="item['id']" @click="selectSoGCNCapPhieu(item['id'], index)" :class="{active: indexGCNXuatKho === index}">
                <v-list-tile-content>
                  <v-list-tile-title class="text-xs-center">{{item['certificateRecordNo'] || ''}} <br> <i>{{item['certificateRecordDate'] || ''}}</i></v-list-tile-title>
                </v-list-tile-content>
              </v-list-tile>
            </v-list>
          </div>
          <div class="flex xs12 sm8" style="border-right: 1px solid rgb(204, 204, 204);">
            <div class="layout row wrap ml-0">

              <#-- <div class="flex text-xs-left xs12 sm12 pl-1">
                <span>Số GCN:</span> <label> {{thongTinGCN['so_gcn']}}</label> 
              </div> -->

              <div class="flex text-xs-left xs12 sm12 pl-1">
                <span>Ngày cấp:</span> <label class=""> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certificateRecordDate'] : ''}}</label>
              </div>

              <div class="flex text-xs-left xs12 sm4 pl-1 pt-1"><span>1. Loại P.tiện: </span></div>
              <div class="flex xs12 sm8"><label class=" pl-2 pt-1"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedVehicleTypeDescription'] : ''}}</label></div>

              <div class="flex text-xs-left xs12 sm4 pl-1"><span>2. Nhãn hiệu: </span></div>
              <div class="flex xs12 sm8"><label class=" pl-2"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedTrademarkName'] : ''}}</label></div>

              <div class="flex text-xs-left xs12 sm4 pl-1"><span>3. Tên thương mại: </span></div>
              <div class="flex xs12 sm8"><label class=" pl-2"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedCommercialName'] : ''}}</label></div>

              <div class="flex text-xs-left xs12 sm4 pl-1"><span>4. Mã kiểu loại: </span></div>
              <div class="flex xs12 sm8"><label class=" pl-2"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedModelCode'] : ''}}</label></div>

              <#-- <div class="flex text-xs-left xs12 sm4 pl-1"><span>5. Xuất xứ: </span></div>
              <div class="flex xs12 sm8"><label class=" pl-2"></label></div> -->


              <#-- <div class="flex text-xs-left xs12 sm6 pl-1"><span>6. Số lượng biên bản  {{stateKiemTraDotXuat === -1 ? 'KTGS' : 'KTĐX'}}: </span></div>
              <div class="flex xs12 sm6"><label class="pl-2"> {{dsBBKiemTraGS['length']}}</label></div> -->

              <div class="flex text-xs-left xs12 sm5 pl-1"><span>7. Số lượng {{stateKiemTraDotXuat === -1 ? ' chờ GS' : 'đề nghị ĐX'}}: </span></div>
              <div class="flex xs12 sm7"><label class=" pl-2"> {{totalKoDat || 0}}</label></div>

              <div class="flex text-xs-left xs12 sm5 pl-1"><span>8. Số lượng đã đạt: </span></div>
              <div class="flex xs12 sm7"><label class="pl-2"> {{totalDat || 0}}</label></div>
            </div>
          </div>
        </div>
      </div>
      <div class="flex xs12 sm6" style="position: relative;">
        <span class="text-bold" style="position: absolute; top: -13px; padding: 0px 10px; background-color: rgb(255, 255, 255);">
          {{stateKiemTraDotXuat === -1 ? 'Kết quả giám sát' : 'Kết quả kiểm tra đột xuất'}}
        </span>

          <v-data-table
            v-bind:headers="headersBBKiemTraGS"
            v-bind:items="dsBBKiemTraGS"
            v-model="selected"
            item-key="name"
            no-data-text="Không có dữ liệu"
            select-all
            class="table__overflow pt-2"
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
            <tr :class="{active: indexBBKTGS == props.index || !props.item['inspectionSeq']}">
              <td>
                <v-checkbox
                :disabled="props.item['inspectionSeq'] != 0"
                primary
                hide-details
                :value="props.item"
                v-model="selected"
                ></v-checkbox>
              </td>
              <td @click="toDetailBienBanKTGS_DotXuat(props.item['id'], props.index)" class="pt-2" style="width: 5%;">{{ props['index'] + 1 }}</td>
              <td @click="toDetailBienBanKTGS_DotXuat(props.item['id'], props.index)" class="pt-2">
              {{ props.item['inspectionSeq'] ? props.item['inspectionSeq'] : '*' }}
              </td>
              <td @click="toDetailBienBanKTGS_DotXuat(props.item['id'], props.index)" class="pt-2">{{ props.item['inspectionRecordNo'] || '' }}</td>
              <td @click="toDetailBienBanKTGS_DotXuat(props.item['id'], props.index)" class="pt-2">{{ props.item['inspectionRecordDate'] || '' }}</td>
              <td @click="toDetailBienBanKTGS_DotXuat(props.item['id'], props.index)" class="pt-2">{{ props.item['postReviewRecordDate'] || '' }}</td>
              <td class="text-xs-center pt-2">{{ props.item['totalQuantity'] || '0' }}</td>
              <td class="text-xs-center pt-2"><a href="javascript:;" @click="xemBBGS(props.item['deliverableFileEntryId'])">Xem pdf</a></td>
            </tr>
          </template>
        </v-data-table>

        <v-btn color="primary" small :disabled="stateShowBtnGs" @click="addBienBanKTGS(-1)" v-if="stateKiemTraDotXuat === -1"><v-icon>add</v-icon> Thêm</v-btn>

        <v-btn color="primary" small :disabled="stateShowBtnDx" @click="addBienBanKTGS(1)" v-else-if="stateKiemTraDotXuat === 1 && countListGCNDx > 0"><v-icon>add</v-icon> Thêm BBĐX </v-btn>

        <#-- <v-btn color="primary" small :disabled="stateShowBtnDx" @click="addBienBanKTGS(2)" v-else><v-icon>add</v-icon> Thêm BBĐX mẫu 2</v-btn> -->

        <v-btn color="primary" small @click="deleteBienBanKTGS()" v-if="selected && selected['length']"><v-icon>delete</v-icon> Xóa dòng</v-btn>

        <span>Số lượng biên bản: {{dsBBKiemTraGS['length']}}</span> 
      </div>

      <#-- <div class="flex xs12 sm12" style="position: relative; border-top: 1px solid #ccc;">
        <br> <span class="text-bold pl-2">Danh sách xe</span> <br>

        <div id="dsXeCapPhieuHoSo"></div>
      </div> -->
    </div>
  </div>
</div>

</v-layout>
</template>