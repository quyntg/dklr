<template>
  <v-layout wrap>
    <v-flex xs12 sm8 style="border: 1px solid #ccc; position: relative;" class="mb-2">
      <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Thông tin chung</span> <br />
      <v-layout row wrap>
        <#-- <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-2">Đối tượng</label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-select
          :items="doiTuongPhieuItems"
          item-text="text"
          item-value="value"
          clearable
          autocomplete
          v-model="thongTinPhieu['vehicleClass']"
          class="pt-0"
          ></v-select>
        </v-flex> -->
        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-2">Xưởng: </label>
        </v-flex>
        <v-flex xs12 sm10 class="py-0">
          <v-text-field
          v-model="thongTinPhieu['productionPlantName']"
          clearable
          class="pt-0"
          ></v-text-field>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-2">Địa chỉ</label>
        </v-flex>
        <v-flex xs12 sm10 class="py-0">
          <v-text-field
          v-model="thongTinPhieu['receiverPlace']"
          clearable
          class="pt-0"
          ></v-text-field>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-2">Diễn giải</label>
        </v-flex>
        <v-flex xs12 sm10 class="py-0">
          <v-text-field
          v-model="thongTinPhieu['remark']"
          clearable
          class="pt-0"
          ></v-text-field>
        </v-flex>
        <#-- <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-2">Tham chiếu</label>
        </v-flex>
        <v-flex xs12 sm10 class="mb-2 py-0">
          <label class="pt-2">{{thongTinPhieu.maThamChieu}}</label>
        </v-flex> -->
      </v-layout>
    </v-flex>

    <v-flex xs12 sm4 style="border: 1px solid #ccc; position: relative;" class="mb-2">
      <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Chứng từ</span>
      <v-layout row wrap class="mt-2">
        <v-flex xs12 sm5 class="text-xs-right py-0">
          <label class="pt-1 pr-2">Số phiếu xuất</label>
        </v-flex>
        <v-flex xs12 sm7 class="mb-2 py-0">
          <v-text-field
          v-model="thongTinPhieu['outputSheetNo']"
          clearable
          class="pt-0"
          ></v-text-field>
        </v-flex>
        <v-flex xs12 sm5 class="text-xs-right py-0">
          <label class="pt-1 pr-2">Ngày xuất</label>
        </v-flex>
        <v-flex xs12 sm7 class="py-0">
          <v-menu
          ref="menuNN"
          :close-on-content-click="false"
          v-model="menuNgayXuat_Dossier"
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
          v-model="thongTinPhieu['outputSheetDate']"
          prepend-icon="event"
          clearable
          class="pt-0"
          readonly
          ></v-text-field>
          <v-date-picker v-model="dateNgayNhap" @input="parseNgayNhap()"></v-date-picker>
        </v-menu>
      </v-flex>
      <v-flex xs12 sm12 class="text-xs-right">
        <v-btn color="primary" small @click="inPhieuBanGiao()"><v-icon>print</v-icon>In phiếu bàn giao</v-btn>
      </v-flex>
    </v-layout>
  </v-flex>

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
              <v-list-tile v-for="(item, index) in detailSoatXetGCN['bang_khai']" v-bind:key="item['certificateId']" @click="selectSoGCNCapPhieu(item, index)" :class="{active: indexGCNXuatKho === index}">
                <v-list-tile-content>
                  <v-list-tile-title class="text-xs-center">{{item['so_gcn']}}</v-list-tile-title>
                </v-list-tile-content>
              </v-list-tile>
            </v-list>
          </div>
          <div class="flex xs12 sm8" style="border-right: 1px solid rgb(204, 204, 204);">
            <div class="layout row wrap ml-0">

              <#-- <div class="flex text-xs-left xs12 sm12 pl-1">
                Số GCN: <label class="pt-2"> {{thongTinGCN['so_gcn']}}</label> 
              </div>

              <div class="flex text-xs-left xs12 sm12 pl-1">
                Ngày cấp: <label class=""> {{filterNgayCap(thongTinGCN['ngay_cap'])}}</label>
              </div> -->

              <div class="flex text-xs-left xs12 sm4 pl-1 pt-2"><span>1. Loại phương tiện: </span></div>
              <div class="flex xs12 sm8"><label class="pl-2 pt-2"> {{thongTinGCN['loai_phuong_tien']}}</label></div>

              <div class="flex text-xs-left xs12 sm4 pl-1"><span>2. Nhãn hiệu: </span></div>
              <div class="flex xs12 sm8"><label class="pl-2"> {{thongTinGCN['nhan_hieu']}}</label></div>

              <div class="flex text-xs-left xs12 sm4 pl-1"><span>3. Tên thương mại: </span></div>
              <div class="flex xs12 sm8"><label class="pl-2"> {{thongTinGCN['ten_thuong_mai']}}</label></div>

              <div class="flex text-xs-left xs12 sm4 pl-1"><span>4. Mã kiểu loại: </span></div>
              <div class="flex xs12 sm8"><label class="pl-2"> {{thongTinGCN['ma_kieu_loai']}}</label></div>

              <div class="flex text-xs-left xs12 sm4 pl-1"><span>5. Xuất xứ: </span></div>
              <div class="flex xs12 sm8"><label class="pl-2"> {{thongTinGCN['xuat_xu']}}</label></div>


              <div class="flex text-xs-left xs12 sm5 pl-1"><span>5. SL chưa cấp: </span></div>
              <div class="flex xs12 sm7"><label class="pl-2"> {{totalChuaCap}}</label></div>

              <div class="flex text-xs-left xs12 sm5 pl-1"><span>6. SL duyệt cấp: </span></div>
              <div class="flex xs12 sm7"><label class="pl-2"> {{thongTinGCN['so_luong']}}</label></div>
            </div>
          </div>
        </div>
      </div>
      <div class="flex xs12 sm6" style="position: relative;">
        <span class="text-bold" style="position: absolute; top: -13px; padding: 0px 10px; background-color: rgb(255, 255, 255);">Bản kê phiếu</span>

          <v-data-table
            v-bind:headers="headersDSSPXuatXuong"
            v-bind:items="dsGCNItems"
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
            <td>
              <v-checkbox
              primary
              hide-details
              :value="props.item"
              v-model="selected"
              ></v-checkbox>
            </td>
            <td @click="suaVatTu(props.item)" class="pt-2">{{ props['index'] + 1 }}</td>
            <td @click="suaVatTu(props.item)" class="pt-2">{{ props.item['stampShortNo'] }}</td>
            <td class="text-xs-center pt-2">{{ props.item['serialStartNo'] }}</td>
            <td class="text-xs-left pt-2">{{ props.item['serialEndNo'] }}</td>
            <td class="text-xs-center pt-2">{{ props.item['subTotalInDocument'] }}</td>
            <td class="text-xs-left pt-2">{{ thongTinGCN['gia_ban'] }}</td>
            <td class="text-xs-center pt-2">{{ props.item['totalMoney'] }}</td>
          </template>
          <template slot="footer">
            <tr style="height: 35px;">
              <td colspan="2" class="text-xs-right">Số lượng: </td>
              <td colspan="2" class="text-xs-right">{{totalSubTotalInDocument}}</td>
              <td colspan="2" class="text-xs-right">Thành tiền: </td>
              <td colspan="2" class="text-xs-right">{{totalMoneyPhieuXuat}}</td>
            </tr>
          </template>
        </v-data-table>

        <v-btn color="primary" small @click="addNhapKho()"><v-icon>add</v-icon> Thêm dòng</v-btn>
        <v-btn color="primary" small @click="deleteVatTuSelect()" v-if="selected && selected['length']"><v-icon>delete</v-icon> Xóa dòng</v-btn>

      </div>

      <div class="flex xs12 sm6" style="position: relative; border-top: 1px solid #ccc; height: 350px; overflow: auto;">
        <br> <span class="text-bold pl-2">Danh sách xe</span> <br>

        <div id="dsXeCapPhieuHoSo"></div>
      </div>
    </div>
  </div>
</div>

<v-flex xs12 sm12>
  <#-- <v-btn color="primary" small @click="addNhapKho()"><v-icon>add</v-icon> Thêm dòng</v-btn>
  <v-btn color="primary" small @click="deleteVatTuSelect()"><v-icon>delete</v-icon> Xóa dòng</v-btn> -->
  <v-btn color="primary" small @click="luuPhieuXKHoSo(0, 'xuat_kho')"><v-icon>save</v-icon> Lưu phiếu</v-btn>
  <v-btn color="primary" small @click="luuPhieuXKHoSo(1, 'xuat_kho')"><v-icon>done</v-icon> Xác nhận</v-btn>
</v-flex>
</v-layout>
</template>