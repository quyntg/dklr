<template>
  <!-- Dùng cho kiểm tra độ ồn, sai số đồng hồ tốc độ -->
  <div class="px-2">
    <v-layout row wrap class="ml-0">
      <#-- <v-flex xs12 sm3>
        <label class="content-label">Cơ sở sản xuất:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-select
          readonly
          class="my-0 py-0"
          item-text="fullName"
          item-value="userId"
          :items="dangKiemVienItems"
          v-model="chiTieuChatLuong['applicantName']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Địa điểm:&nbsp;</label>
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
          v-model="chiTieuChatLuong['receiverPlace']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Ngày:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="chiTieuChatLuong['copReportNo']"
        ></v-text-field>
      </v-flex> -->

      <#-- <v-flex xs12 sm3>
        <label class="content-label">Loại xe:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm3>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="chiTieuChatLuong['copReportDateFrom']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Nhãn hiệu:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm3>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="chiTieuChatLuong['copReportDateTo']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Số khung:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm3>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="chiTieuChatLuong['copReportDateFrom']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Màu sơn:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm3>
        <v-text-field
          readonly
          class="my-0 py-0"
          v-model="chiTieuChatLuong['copReportDateTo']"
        ></v-text-field>
      </v-flex> -->
      
    </v-layout>

    <#-- <v-flex xs12 sm12>
      <label class="content-label">Danh sách xe lập biên bản:&nbsp;</label>
    </v-flex> -->
    <table border="1" class="ftable" style="width: 100%;">
      <thead>
        <tr style="background: #d9d7d7;">
          <th class="text-xs-center" style="width: 3%;">STT</th>
          <#-- <th class="text-xs-center">Ngày xuất xưởng</th> -->
          <th class="text-xs-center">Số khung</th>
          <th class="text-xs-center">Số động cơ </th>
          <th class="text-xs-center">Màu sơn</th>
          <th class="text-xs-center">Số thùng xe</th>
          <#-- <th class="text-xs-center">Số serial</th> -->
          <th class="text-xs-center">Ghi chú</th>
          <th class="text-xs-center">Kết luận</th>
        </tr>
        
      </thead>
      <tbody>
        <tr v-for="(item, index) in chiTieuChatLuong['VR_VehicleRecord']" :key="'VR_VehicleRecordccc' + index">
          <td class="text-xs-center" style="width: 5%;">
            {{index + 1}}
          </td>
          <#-- <td class="text-xs-center">
            {{item['productionDate']}}
          </td> -->
          <td class="text-xs-center">
            {{item['frameNo']}}
          </td>
          <td class="text-xs-center">
            {{item['engineNo']}}
          </td>
          <td class="text-xs-center">
            {{item['color']}}
          </td>
          <td class="text-xs-center">
            {{item['boxNo']}}
          </td>
          <#-- <td class="text-xs-center">
            {{item['serialNo']}}
          </td> -->
          <td class="text-xs-center">
            {{item['ghi_chu'] || ''}}
          </td>
          <td class="text-xs-center">
            {{getNameVehicleRecordStatus(item['vehicleRecordStatus'])}}
          </td>

        </tr>
      </tbody>
    </table>

    <table style="width: 100%; border-collapse: collapse; margin-top: 15px;" border="1" class="ftable">
    <thead>
      <tr>
       <th class="text-xs-center" style="width: 3%">TT</th>
       <th class="text-xs-center" colspan="2">Nội dung kiểm tra</th>
       <th class="text-xs-center">Yêu cầu</th>
       <th class="text-xs-center">Ghi chú</th>
       <th class="text-xs-center">Kết luận</th>
     </tr>
   </thead>
   <tbody>
      <#-- chiTieuChatLuong['VR_Issue_Vehicle_Inspection'] -->
      <template v-for="(item, index) in vr_Issue_Vehicle_InspectionItems" :key="'VR_Issue_Vehicle_Inspection' + index">
        <tr>
          <td colspan="5" class="text-xs-left pl-2" v-html="item['title']"></td>
        </tr>
        <tr :style="{background: checkColorCop(itemChild['value'])}" v-for="(itemChild, indexChild) in item['items']" :key="'VR_Issue_Vehicle_Inspection_Child' + indexChild">
          <td class="text-xs-center">
            {{itemChild['sibling'] || ''}}
          </td>
          <td class="text-xs-left" v-if="itemChild['type'] == 'text'" :colspan="itemChild['type'] == 'text' ? 0 : 2">
            {{itemChild['title'] || ''}}
          </td>
          <td class="text-xs-left" v-else colspan="2">
            {{itemChild['title'] || ''}}
          </td>
          <td v-if="itemChild['type'] == 'text'" class="text-xs-center">
            <v-text-field
            class="my-0 py-0"
            v-model="itemChild['specificationValue']"
            ></v-text-field>
          </td>
          <td v-if="indexChild == 0 && item['key'] == 'BBKQGSXCG13'" class="text-xs-center" style="width: 16%;" :rowspan="item['items'] ? item['items']['length'] : 0">
            Phù hợp với các chỉ tiêu chất lượng đã đăng ký trong hồ sơ chứng nhận và thoả mãn tiêu chuẩn, quy chuẩn hiện hành
          </td>
          <td v-else-if="indexChild == 0 && item['key'] == 'BBKQGSXCG14'" class="text-xs-center" style="width: 16%;" :rowspan="item['items'] ? item['items']['length'] : 0">
            Thoả mãn tiêu chuẩn hiện hành
          </td>
          <td v-else-if="indexChild == 0" class="text-xs-center" style="width: 16%;" :rowspan="item['items'] ? item['items']['length'] : 0">
            Phù hợp với thiết kế và thoả mãn tiêu chuẩn, quy chuẩn hiện hành
          </td>
          <td class="text-xs-center">
            <v-text-field
            class="my-0 py-0"
            v-model="itemChild['specificationValueDescription']"
            ></v-text-field>
          </td>

          <#-- <td v-else-if="itemChild['type'] == 'text'" class="text-xs-center">
            <v-text-field
            class="my-0 py-0"
            v-model="item['value']"
            ></v-text-field>
          </td> -->
          
          <td style="width: 7%;" class="text-xs-center">
            <span v-for="(itemKq, indexKq) in kqThietBi" class="text-xs-center" :key="'VR_Issue_Vehicle_Inspectionjjj' + index">
              <input type="radio" :name="itemChild['key'] + '_' + index" class="check_radio" :id="itemChild['key'] + (indexKq) + '_' + index" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="itemChild['specificationResult']">
              <label class="label-radio" :for="itemChild['key'] + (indexKq) + '_' + index" style="margin: 0" v-html="itemKq['text']"></label>
            </span>
          </td>
        </tr>
      </template>

    </tbody>
  </table>

  <v-flex xs12 sm12>
    <label class="content-label">Nội dung cần giải quyết:&nbsp;</label>
  </v-flex>

  <#-- <table border="1" class="ftable" style="width: 100%;">
      <thead>
        <tr style="background: #d9d7d7;">
          <th class="text-xs-center" style="width: 3%;">STT</th>
          <th class="text-xs-center">Ngày xuất xưởng</th>
          <th class="text-xs-center">Số khung</th>
          <th class="text-xs-center">Số động cơ </th>
          <th class="text-xs-center">Số thùng xe</th>
          <th class="text-xs-center">Màu sơn</th>
          <th class="text-xs-center">Số serial</th>
          <th class="text-xs-center">Ghi chú</th>
          <th class="text-xs-center">Kết luận</th>
        </tr>
        
      </thead>
      <tbody>
        <tr v-for="(item, index) in chiTieuChatLuong['VR_Issue_Inspection_Specification']" :key="'VR_Issue_Inspection_Specification' + index">
          <td class="text-xs-center" style="width: 5%;">
            {{index + 1}}
          </td>
          <td class="text-xs-center">
            {{item['productionDate']}}
          </td>
          <td class="text-xs-center">
            {{item['frameNo']}}
          </td>
          <td class="text-xs-center">
            {{item['engineNo']}}
          </td>
          <td class="text-xs-center">
            {{item['boxNo']}}
          </td>
          <td class="text-xs-center">
            {{item['color']}}
          </td>
          <td class="text-xs-center">
            {{item['serialNo']}}
          </td>
          <td class="text-xs-center">
            {{item['ghi_chu'] || ''}}
          </td>
          <td class="text-xs-center">
            {{getNameVehicleRecordStatus(item['vehicleRecordStatus'])}}
          </td>

        </tr>
      </tbody>
    </table> -->
  <v-layout row wrap class="ml-0 pl-3">
    
    <v-flex xs12 sm2 class="pt-2">
      <i style="font-weight: bold; font-size: 13px;">Ghi chú biên bản:</i>
    </v-flex>
    <v-flex xs12 sm10>
      <v-text-field
        multi-line
        class="my-0 py-0"
        v-model="chiTieuChatLuong['inspectionNote']"
      ></v-text-field>
    </v-flex>

    <v-flex xs12 sm2 class="pt-2">
      <i style="font-weight: bold; font-size: 13px;">Kết luận biên bản:</i>
    </v-flex>
    <v-flex xs12 sm10>
      <v-text-field
        multi-line
        class="my-0 py-0"
        v-model="chiTieuChatLuong['inspectionRemarks']"
      ></v-text-field>
    </v-flex>

    <v-flex xs12 sm1 class="pb-2 pt-2 text-xs-right pr-2">
      <i style="font-weight: bold; font-size: 13px;">Kết quả lần đầu:</i>
    </v-flex>
    <v-flex xs12 sm2 class="pb-2 pt-2">

      <span v-for="(itemKq, indexKq) in kqPhieu" class="text-xs-center pr-2" :key="'kqPhieu_bb_xe_cap_phieu' + indexKq">
        <input type="radio" name="kqPhieu_bb_xe_cap_phieu_ld" v-model="chiTieuChatLuong['checkStatus1st']" :id="'kqPhieu_bb_xe_cap_phieu_ld' + indexKq" :value="itemKq['value']" style="margin: 0 5px 0 0">
        <label class="label-radio" :for="'kqPhieu_bb_xe_cap_phieu_ld' + indexKq" style="margin: 0" v-html="itemKq['text']"></label>
      </span>
    </v-flex>

    <v-flex xs12 sm1 class="pb-2 pt-2 text-xs-right pr-2">
      <i style="font-weight: bold; font-size: 13px;">Kết quả lần cuối:</i>
    </v-flex>
    <v-flex xs12 sm2 class="pb-2 pt-2">

      <span v-for="(itemKq, indexKq) in kqPhieu" class="text-xs-center pr-2" :key="'kqPhieu_bb_xe_cap_phieu' + indexKq">
        <input type="radio" name="kqPhieu_bb_xe_cap_phieu_lc" v-model="chiTieuChatLuong['checkStatus2nd']" :id="'kqPhieu_bb_xe_cap_phieu_lc' + indexKq" :value="itemKq['value']" style="margin: 0 5px 0 0">
        <label class="label-radio" :for="'kqPhieu_bb_xe_cap_phieu_lc' + indexKq" style="margin: 0" v-html="itemKq['text']"></label>
      </span>
    </v-flex>

    <v-flex xs12 sm1 class="pb-2 pt-2 text-xs-right pr-2">
      <i style="font-weight: bold; font-size: 13px;">Kết luận:</i>
    </v-flex>
    <v-flex xs12 sm2 class="pb-2 pt-2">

      <span v-for="(itemKq, indexKq) in kqPhieu" class="text-xs-center pr-2" :key="'kqPhieu_bb_xe_cap_phieu' + indexKq">
        <input type="radio" name="kqPhieu_bb_xe_cap_phieu_kl" v-model="chiTieuChatLuong['vehicleRecordStatus']" :id="'kqPhieu_bb_xe_cap_phieu_kl' + indexKq" @change="checkDisabledBBGSDX()" :value="itemKq['value']" style="margin: 0 5px 0 0">
        <label class="label-radio" :for="'kqPhieu_bb_xe_cap_phieu_kl' + indexKq" style="margin: 0" v-html="itemKq['text']"></label>
      </span>
    </v-flex>

  </v-layout>
  </div>
</template>