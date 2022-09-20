<template>
  <v-layout wrap>
    <#-- <v-flex xs12 sm2 class="mb-2">
    </v-flex>
    <v-flex xs12 sm2>
      <v-select
      :items="coSoInItems"
      v-model="coSoIn"
      clearable
      placeholder="Chọn tổ tổng hợp, đơn vị khai thác"
      placeholder
      class="pt-0"
      ></v-select>
    </v-flex>
    <v-flex xs12 sm2>
      <v-btn color="primary" @click="chonChungTu()" small>Chọn chứng từ</v-btn>
    </v-flex>
    <v-flex xs12 sm6>

    </v-flex> -->
    <v-flex xs12 sm12 style="border: 1px solid #ccc; position: relative;" class="mb-2">
      <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Thông tin chung</span> <br />
      <v-layout row wrap>
        <#-- <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-2">Đối tượng</label>
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
          <label class="pt-2">Số phiếu xuất</label>
        </v-flex>
        <v-flex xs12 sm4 class="mb-2 py-0">
          <v-text-field
          readonly
          v-model="thongTinPhieu['outputSheetNo']"
          class="pt-0"
          ></v-text-field>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-2">Ngày xuất</label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-text-field
          v-model="thongTinPhieu['outputSheetDate']"
          class="pt-0"
          readonly
          ></v-text-field>
      </v-flex>

        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-1 pr-2">Xưởng: </label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-text-field
          readonly
          v-model="thongTinPhieu['receiverName']"
          class="pt-0"
          ></v-text-field>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-2">Phương thức</label>
        </v-flex>
        <v-flex xs12 sm4 class="py-0">
          <v-text-field
          readonly
          v-model="thongTinPhieu['receiverRequest']"
          class="pt-0"
          ></v-text-field>
        </v-flex>

        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-2">Địa chỉ</label>
        </v-flex>
        <v-flex xs12 sm10 class="py-0">
          <v-text-field
          readonly
          v-model="thongTinPhieu['receiverPlace']"
          class="pt-0"
          ></v-text-field>
        </v-flex>
        <v-flex xs12 sm2 class="text-xs-right py-0">
          <label class="pt-2">Diễn giải</label>
        </v-flex>
        <v-flex xs12 sm10 class="py-0">
          <v-text-field
          readonly
          v-model="thongTinPhieu['remark']"
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

    <#-- <v-flex xs12 sm4 style="border: 1px solid #ccc; position: relative;" class="mb-2">
      <span class="text-bold" style="position: absolute; top: -13px; padding: 0 10px; background-color: #fff;">Chứng từ</span>
      <v-layout row wrap class="mt-2">
        <v-flex xs12 sm5 class="text-xs-right py-0">
          <label class="pt-2">Số phiếu xuất</label>
        </v-flex>
        <v-flex xs12 sm7 class="mb-2 py-0">
          <v-text-field
          readonly
          v-model="thongTinPhieu['outputSheetNo']"
          class="pt-0"
          ></v-text-field>
        </v-flex>
        <v-flex xs12 sm5 class="text-xs-right py-0">
          <label class="pt-2">Ngày xuất</label>
        </v-flex>
        <v-flex xs12 sm7 class="py-0">
          <v-text-field
          v-model="thongTinPhieu['outputSheetDate']"
          class="pt-0"
          readonly
          ></v-text-field>
      </v-flex>

    </v-layout>
  </v-flex> -->
  <v-flex xs12 sm12 class="mt-3 px-0">
    <v-data-table
    v-bind:headers="headersDSSP"
    v-bind:items="dsGCNItems"
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
    <td class="pt-2">{{ props['index'] + 1 }}</td>
    <td class="pt-2">{{ props.item['stampShortNo'] }}</td>
    <td class="text-xs-center pt-2">{{ props.item['serialStartNo'] }}</td>
    <td class="text-xs-left pt-2">{{ props.item['serialEndNo'] }}</td>
    <td class="text-xs-center pt-2">{{ props.item['subTotalInDocument'] }}</td>
  </template>
  <#-- <template slot="footer">
    <tr style="height: 35px;">
      <td colspan="2"></td>
      <td class="text-xs-center"></td>
      <td class="text-xs-left"></td>
    </tr>
  </template>
 --></v-data-table>

</v-flex>
<v-flex xs12 sm12>
  <#-- <v-btn color="primary" small @click="addNhapKho()"><v-icon>add</v-icon> Thêm dòng</v-btn>
  <v-btn color="primary" small @click="deleteVatTuSelect()" v-if="selected && selected['length']"><v-icon>delete</v-icon> Xóa dòng</v-btn>
  <v-btn color="primary" small @click="luuPhieu(0, '')"><v-icon>save</v-icon> Lưu phiếu</v-btn>
  <v-btn color="primary" small @click="luuPhieu(1, '')"><v-icon>done</v-icon> Xác nhận</v-btn>
  <v-btn color="primary" small @click="popUpChiTietPhieu = false"><v-icon>save</v-icon> Thoát</v-btn> -->
</v-flex>
</v-layout>
</template>