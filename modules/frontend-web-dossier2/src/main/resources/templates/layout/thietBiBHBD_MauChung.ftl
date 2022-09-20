<template>
  <!-- Dùng cho kiểm tra độ ồn, sai số đồng hồ tốc độ -->
  <div>
    <v-layout row wrap class="ml-0">
      <v-flex xs12 sm3>
        <label class="content-label">Đăng kiểm viên 1:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-select
          readonly
          class="my-0 py-0"
          item-text="fullName"
          item-value="userId"
          :items="dangKiemVienItems"
          v-model="thietBiKiemTra['dang_kiem_vien_1']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Đăng kiểm viên phối hợp:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-select
          readonly
          return-object
          multiple
          class="my-0 py-0"
          :items="dangKiemVienItems"
          item-text="fullName"
          item-value="userId"
          v-model="thietBiKiemTra['dang_kiem_vien_2']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Số Báo cáo đánh giá:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="thietBiKiemTra['inspectionRecordNo']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Ngày kiểm tra (từ):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="thietBiKiemTra['copReportDateFrom']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Đến ngày:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="thietBiKiemTra['copReportDateTo']"
        ></v-text-field>
      </v-flex>
      
    </v-layout>
    <div style="text-align: right;">
      <span class="pt-2 pr-2">Đơn vị đo:</span>
      <v-text-field
      style="float: right; max-width: 80px;"
      class="my-0 py-0"
      v-model="donVi"
      ></v-text-field>
    </div>
    <table style="width: 100%; border-collapse: collapse;" border="1" class="ftable">
    <thead>
      <tr>
       <th class="text-xs-center" style="width: 3%">TT</th>
       <th class="text-xs-center">Nội dung kiểm tra</th>
       <th class="text-xs-center">Thông số khai báo/Thông số chuẩn</th>
       <th class="text-xs-center">Kết quả</th>
       <th class="text-xs-center">Kết luận</th>
     </tr>
   </thead>
   <tbody>
      <tr :style="{background: checkColorCop(item['valueResult'])}" v-for="(item, index) in thietBiKiemTra['ket_qua_kiem_tra']" :key="'vr_cfg_technicalspecItems' + index">
        <td class="text-xs-center">{{item['stt'] || (index + 1)}}</td>
        <td class="text-xs-left pl-2" v-html="item['specificationDisplayName']"></td>
        <template v-if="item['specificationEntryType'] == 'text'">
          <td class="pl-2">
            <v-text-field
            class="my-0 py-0"
            v-model="item['value']"
            ></v-text-field>
          </td>
          <td class="pl-2">
            <v-text-field
            class="my-0 py-0"
            v-model="item['valueTest']"
            ></v-text-field>
          </td>
        </template>
        <template v-if="item['specificationEntryType'] == 'select' && item['specificationName'] == 'status'">
          <td class="pl-2" colspan="2">
            <v-select
              class="my-0 py-0 px-4"
              :items="item['dataDm']"
              item-text="itemName"
              item-value="itemName"
              v-model="item['value']"
            ></v-select>
          </td>
        </template>
        <template v-else-if="item['specificationEntryType'] == 'select' && item['specificationName'] != 'status'">
          <td class="pl-2">
            <v-select
              class="my-0 py-0 px-2"
              :items="item['dataDm']"
              item-text="itemName"
              item-value="itemName"
              v-model="item['value']"
            ></v-select>
          </td>
          <td class="pl-2">
            <v-select
              class="my-0 py-0 px-2"
              :items="item['dataDm']"
              item-text="itemName"
              item-value="itemName"
              v-model="item['valueTest']"
            ></v-select>
          </td>
        </template>
        <template v-if="item['specificationEntryType'] == ''">
          <td class="pl-2" colspan="3">
            
          </td>
        </template>

        <td class="text-xs-center" @click="calPointCop()" v-if="item['specificationEntryType'] !== ''">
          <span v-for="(itemKq, indexKq) in kqThietBi" class="text-xs-center">
            <input type="radio" :name="item['specificationName'] + '_' + index + 'bhbd'" class="check_radio" :id="item['specificationName'] + (indexKq) + '_' + index + 'bhbd'" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="item['valueResult']">
            <label class="label-radio" :for="item['specificationName'] + (indexKq) + '_' + index + 'bhbd'" style="margin: 0" v-html="itemKq['text']"></label>
          </span>
        </td>
      </tr>

    </tbody>
  </table>
  <v-layout row wrap class="ml-0 pl-3">
    
    <v-flex xs12 sm12 class="pt-2">
      <i v-if="detailCSBHBD['serviceCode'] == 'TT192012TTBGTVTDGLD'" style="font-weight: bold; font-size: 13px;">Thiết bị này thuộc quyền sử dụng hợp pháp của cơ sở sản xuất và có đầy đủ tài liệu của nhà sản xuất</i>
      
      <i v-else style="font-weight: bold; font-size: 13px;">Thiết bị này thuộc quyền sử dụng hợp pháp của cơ sở sản xuất và có đầy đủ tài liệu của nhà sản xuất</i>
    </v-flex>
    <#-- <v-flex xs12 sm12>
      <v-text-field
        class="my-0 py-0"
        v-model="thietBiKiemTra['ghi_chu']"
      ></v-text-field>
    </v-flex> -->
    
    <v-flex xs12 sm2 class="pb-2 pt-2">
      <i style="font-weight: bold; font-size: 13px;">Kết luận:</i>
    </v-flex>
    <v-flex xs12 sm4 class="pb-2 pt-2">
      <#-- <input type="radio" name="ketluantb" id="ketluantb1" value="1" v-model="thietBiKiemTra['ketLuan']">
      <label class="mr-3" for="ketluantb1">Đạt</label>

      <input type="radio" name="ketluantb" id="ketluantb2" value="2" v-model="thietBiKiemTra['ketLuan']">
      <label for="ketluantb2">Không đạt</label> -->

      <span v-for="(itemKq, indexKq) in kqFullText" class="text-xs-center pr-2" :key="'kl_mau1' + indexKq">
        <input type="radio" :name="thietBiKiemTra['ky_hieu'] + '_result_' + '_bhbd'" v-model="thietBiKiemTra['nd_result']" :id="thietBiKiemTra['ky_hieu'] + '_result_' + (indexKq + 1) + 'bhbd'" @change="changeKQTB()" :value="itemKq['value']" style="margin: 0 5px 0 0">
        <label class="label-radio" :for="thietBiKiemTra['ky_hieu'] + '_result_' + (indexKq + 1) + 'bhbd'" style="margin: 0" v-html="itemKq['text']"></label>
      </span>
    </v-flex>

    <v-flex xs12 sm6 class="text-xs-right" class="pb-2 pt-2">
      <span style="font-weight: bold;">{{thietBiKiemTra['totalD']}}</span> Đ, <span style="font-weight: bold;">{{thietBiKiemTra['totalKD']}}</span> KĐ, <span style="font-weight: bold;">{{thietBiKiemTra['totalNA']}}</span> NA
    </v-flex>

    <v-flex xs12 sm2 class="pt-2">
      <i style="font-weight: bold; font-size: 13px;">{{thietBiKiemTra['nd_result'] != 1 ? 'Mô tả  không đạt' : 'Ghi chú'}}</i>
    </v-flex>
    <v-flex xs12 sm10>
      <v-text-field
        class="my-0 py-0"
        v-model="thietBiKiemTra['ghi_chu']"
      ></v-text-field>
    </v-flex>

    <v-flex xs12 sm2 class="pb-2 pt-2">
      <i style="font-weight: bold; font-size: 13px;">Người thực hiện:</i>
    </v-flex>
    <v-flex xs12 sm4 class="pb-2 pt-2">
      <v-text-field
        class="my-0 py-0"
        v-model="thietBiKiemTra['nguoi_thuc_hien']"
      ></v-text-field>
    </v-flex>
    <v-flex xs12 sm6>
    </v-flex>

    <v-flex xs12 sm2 class="pt-2">
      <i style="font-weight: bold; font-size: 13px;">Số tem kiểm tra:</i>
    </v-flex>
    <v-flex xs12 sm1>
      <v-text-field
        :disabled="thietBiKiemTra['nd_result'] == 4"
        class="my-0 py-0"
        v-model="thietBiKiemTra['temp']"
      ></v-text-field>
    </v-flex>
  </v-layout>
  </div>
</template>