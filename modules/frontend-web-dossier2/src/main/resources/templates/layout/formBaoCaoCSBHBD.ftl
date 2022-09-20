<v-layout row wrap class="ml-0" :style="{'pointer-events': activeAllCOP ? 'none' : 'auto'}">
    <v-flex xs12 sm12>
      <div>
    <div class="text-xs-center" style="width: 100%;">
     <label class="content-label"><strong>BÁO CÁO KẾT QUẢ KIỂM TRA, ĐÁNH GIÁ CƠ SỞ</strong><br><em>BẢO HÀNH, BẢO DƯỠNG Ô TÔ</em></label> 
    </div>
    <v-layout row wrap class="ml-0 pl-2">
      <v-flex xs12>
        <label class="content-label">1. Thông tin chung&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm3>
        <label class="content-label">Đăng kiểm viên 1:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-select
          style="width: 60%;"
          class="my-0 py-0"
          :items="dangKiemVienItems"
          item-text="fullName"
          item-value="userId"
          readonly
          v-model="detailCSBHBD['dang_kiem_vien_1']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Đăng kiểm viên phối hợp:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-select
          readonly
          return-object
          style="width: 60%;"
          class="my-0 py-0"
          item-text="fullName"
          item-value="userId"
          :items="dangKiemVienItems"
          multiple
          v-model="detailCSBHBD['dang_kiem_vien_2']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Số báo cáo đánh giá:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          readonly
          v-model="detailCSBHBD['inspectionRecordNo']"
        ></v-text-field>
      </v-flex>
      

      <v-flex xs12 sm3>
        <label class="content-label">Số giấy chứng nhận:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm3 v-if="detailCSBHBD['copReportType'] == 'LD'">
        <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          readonly
          v-model="copReportNo"
        ></v-text-field>
      </v-flex>
      <v-flex xs12 sm3 v-else-if="detailCSBHBD['dossierType'] == 'endorse' || detailCSBHBD['dossierType'] == 'expand'">
        <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCSBHBD['copReportPreviousNo']"
        ></v-text-field>
      </v-flex>
      <v-flex xs12 sm9 v-else>
        <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCSBHBD['copReportRefNo']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3 v-if="detailCSBHBD['copReportType'] == 'LD'">
        <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCSBHBD['sbc_lan_dau']"
        ></v-text-field>
      </v-flex>
      <v-flex xs12 sm3 v-if="detailCSBHBD['copReportType'] == 'LD'">
        
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Ngày kiểm tra (từ):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <#-- <v-menu
          ref="menuNgayKiemTraBHBD"
          :close-on-content-click="false"
          v-model="menuNgayKiemTraBHBD"
          :nudge-right="40"
          lazy
          transition="scale-transition"
          offset-y
          full-width
          max-width="290px"
          min-width="290px"
          >
          <v-text-field
          slot="activator"
          v-model="detailCSBHBD['copReportDateFrom']"
          persistent-hint
          prepend-icon="event"
          style="width: 60%;"
          clearable
        ></v-text-field>
        <v-date-picker v-model="detailCSBHBD['copReportDateFrom']" no-title @input="menuNgayKiemTraBHBD = false" locale="vi"></v-date-picker>
      </v-menu> -->
        <#--  <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCSBHBD['copReportDateFrom']"
        ></v-text-field>  -->
        <v-text-field
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          readonly
          v-model="detailCSBHBD['copReportDateFrom'] || detailCSBHBD['inspectionDateFrom']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Đến ngày:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <#-- <v-menu
          ref="menuNgayDenNgayBHBD"
          :close-on-content-click="false"
          v-model="menuNgayDenNgayBHBD"
          :nudge-right="40"
          lazy
          transition="scale-transition"
          offset-y
          full-width
          max-width="290px"
          min-width="290px"
          >
          <v-text-field
          slot="activator"
          v-model="detailCSBHBD['copReportDateTo']"
          persistent-hint
          prepend-icon="event"
          style="width: 60%;"
          clearable
        ></v-text-field>
          <v-date-picker v-model="detailCSBHBD['copReportDateTo']" no-title @input="menuNgayDenNgayBHBD = false" locale="vi"></v-date-picker>
        </v-menu> -->
         <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          readonly
          v-model="detailCSBHBD['copReportDateTo'] || detailCSBHBD['inspectionDateTo']"
        ></v-text-field> 
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label"> Loại hình đánh giá:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9 style="pointer-events: none;">
        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaBS" v-model="detailCSBHBD['loai_hinh_danh_gia'] || detailCSBHBD['copReportType']" value="LD">
        <label for="loaihinhDanhGiaBS"> Lần đầu</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaHN" v-model="detailCSBHBD['loai_hinh_danh_gia'] || detailCSBHBD['copReportType']" value="BS">
        <label for="loaihinhDanhGiaHN"> Bổ sung </label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaLD" v-model="detailCSBHBD['loai_hinh_danh_gia'] || detailCSBHBD['copReportType']" value="HN">
        <label for="loaihinhDanhGiaLD"> Định kỳ </label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaDX" v-model="detailCSBHBD['loai_hinh_danh_gia'] || detailCSBHBD['copReportType']" value="DX">
        <label for="loaihinhDanhGiaDX"> Đột xuất </label>

        <#-- <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaBS" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="BS">
        <label for="loaihinhDanhGiaBS"> Bổ sung (Additional audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaHN" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="HN">
        <label for="loaihinhDanhGiaHN"> Định kỳ (Annual audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaLD" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="LD">
        <label for="loaihinhDanhGiaLD"> Lần đầu (Initial audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaDX" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="DX">
        <label for="loaihinhDanhGiaDX"> Đột xuất (Occassional audit)</label> -->
      </v-flex>
      <v-flex xs12>
        <label class="content-label">1.1 Thông tin về cơ sở bảo hành, bảo dưỡng&nbsp;</label>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.1.1 Tên:&nbsp;</label>
          <v-text-field
            readonly
            class="my-0 py-0"
            v-model="detailCSBHBD['ten_doanh_nghiep'] || detailCSBHBD['applicantName']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.1.2 Địa chỉ trụ sở chính:&nbsp;</label>
          <v-text-field
            readonly
            class="my-0 py-0"
            v-model="detailCSBHBD['dia_chi_chinh_doanh_nghiep'] || detailCSBHBD['applicantAddress']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.1.3 Tên xưởng:&nbsp;</label>
          <v-text-field
            readonly
            class="my-0 py-0"
            v-model="detailCSBHBD['ten_nha_xuong_text'] || detailCSBHBD['productionPlantName']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.1.4 Địa chỉ xưởng bảo hành, bảo dưỡng (địa chỉ kiểm tra):&nbsp;</label>
          <v-text-field
            readonly
            class="my-0 py-0"
            v-model="detailCSBHBD['inspectionSite'] || detailCSBHBD['dia_chi_xuong']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <label class="content-label">1.2 Thông tin về cơ sở sản xuất, lắp ráp, nhập khẩu ô tô(nếu có)&nbsp;</label>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.2.1 Loại hình:&nbsp;</label>
          <span v-if="detailCSBHBD['loai_hinh'] == 'SX'">
            Sản xuất, lắp ráp
          </span>
          <span v-else-if="detailCSBHBD['loai_hinh'] == 'NK'">
            Nhập khẩu
          </span>
          <span v-else-if="detailCSBHBD['loai_hinh'] == 'ALL'">
            Sản xuất, lắp ráp + Nhập khẩu
          </span>
          <#-- <input style="margin-left: 10px;" type="radio" name="loai_hinh" id="loaihinhSX" v-model="detailCSBHBD['loai_hinh']" value="SX">
          <label for="loaihinhSX"> Doanh nghiệp sản xuất, lắp ráp</label> <br>

          <input type="radio" name="loai_hinh" id="loaihinhNK" v-model="detailCSBHBD['loai_hinh']" value="NK">
          <label for="loaihinhNK" style="margin-right: 20px;"> Doanh nghiệp nhập khẩu</label> -->
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.2.2 Tên:&nbsp;</label>
          <v-text-field
            class="my-0 py-0"
            v-model="detailCSBHBD['ten_dn_sxlr']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.2.3 Địa chỉ:&nbsp;</label>
          <v-text-field
            class="my-0 py-0"
            v-model="detailCSBHBD['dia_chi_dn_sxlr']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12 sm3>
        <label class="content-label" id="kieuLoaiSanPham">1.3 Loại phương tiện đánh giá (Product's types):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm12 class="pb-2">
        <table style="width: 100%;" border="1" class="ftable">
          <thead>
            <tr style="background: #d9d7d7;">
             <th class="text-xs-center">Loại phương tiện</th>
             <th class="text-xs-center">Nhãn hiệu</th>
             <th class="text-xs-center">Loại hình</th>
           </tr>
         </thead>
         <tbody>
           <tr id="gen_4_2_1_1" v-for="(item, index) in detailCSBHBD['loai_phuong_tien_bhbd']">
              <td class="text-xs-center py-1">{{item['loaiPhuongTien_text'] || item['loaiPhuongTien'] }}</td>
              <td class="text-xs-center py-1">{{item['nhanHieu_text'] || item['nhanHieu'] || ''}}</td>
              <td class="text-xs-center py-1">
                {{item['loaiHinh_text'] || item['loaiHinh'] || ''}}
                <#-- <span v-if="item['loaiHinh'] == 1">
                  Sản xuất, lắp ráp
                </span>
                <span v-else-if="item['loaiHinh'] == 2">
                  Nhập khẩu
                </span>
                <span v-else-if="item['loaiHinh'] == 3">
                  Sản xuất, lắp ráp + Nhập khẩu
                </span> -->
              </td>
           </tr>
         </tbody>
       </table>
      </v-flex>
      
      <v-flex xs12 sm12 my-2>
        <table border="1" style="width: 100%; border-collapse: collapse;">
          <thead>
            <tr>
              <th class="text-xs-center">STT <br> NO</th>
              <th class="text-xs-center">NỘI DUNG ĐÁNH GIÁ (ASSESSMENT CONTENTS)</th>
              <th class="text-xs-center">KQ <br>(Result)</th>
              <th class="text-xs-center">KL <br>(Conclusion)</th>
            </tr>
          </thead>
          <tbody v-if="part1BHBDActive || activeAllCOP" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part1BHBDActive">
            <template v-for="(item, index) in part1CSBHBD" v-if="!item['items']">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
            </template>
            <template v-else >
              <tr :style="{background: checkColorCop(detailCOP_1[item['nd_result']], detailCOP_1[item['diem_nd']] || '')}">
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="2" class="pl-1" v-html="item['noi_dung']"></td>
                <td :rowspan="item['items']['length'] + 1">
                  <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                    <input type="radio" :name="item['ky_hieu'] + '_result'" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1[item['nd_result']]">
                    <label class="label-radio" :for="item['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                  </div>
                </td>
              </tr>
              <tr v-for="(itemRd, indexRd) in item['items']" :style="{background: checkColorCop(detailCOP_1[item['nd_result']], detailCOP_1[item['diem_nd']] || '')}">
                <td class="text-xs-center">
                  <input type="radio" class="tinh_diem" :name="item['ky_hieu']" :id="item['ky_hieu'] + indexRd" :value="itemRd['gia_tri']" v-model="detailCOP_1[item['ky_hieu']]" @click="setPointFormCSBHBD(itemRd, indexRd, item['diem_nd'])">
                </td>
                <td class="pl-1" v-html="itemRd['noi_dung']"></td>
                <td :rowspan="item['items']['length']" v-if="indexRd === 0">
                  <v-text-field
                    v-model="detailCOP_1[item['diem_nd']]"
                    class="my-0 py-0 px-2"
                  ></v-text-field>
                </td>
              </tr>
              <tr>
                <td></td>
                <td class="mo-ta pb-1" colspan="3">
                  <span style="width: 47px;">Mô tả: </span>
                  <div style="width: calc(100% - 53px); float: right;">
                    <v-text-field
                      v-model="detailCOP_1[item['mt_nd']]"
                      class="my-0 py-0"
                    ></v-text-field>
                  </div>
                </td>
              </tr>

              <tr v-if="detailCOP_1[item['nd_result']] !== 1 && detailCOP_1[item['nd_result']] !== '1'">
                <td></td>
                <td class="" colspan="3">
                  <div>
                    <v-layout row wrap class="ml-0 pl-2">
                      <v-flex xs12 sm5>
                        <v-layout row wrap class="ml-0">
                          <v-flex xs12 sm5 class="pt-2">
                            Thêm mới đính kèm
                          </v-flex>
                          <v-flex xs12 sm7>
                            <v-text-field
                              v-model="detailCOP_1['ten_file_' + item['ky_hieu']]"
                              class="py-0 my-0"
                            ></v-text-field>
                          </v-flex>
                        </v-layout>
                      </v-flex>
                      <v-flex xs12 sm3 class="pl-2 pt-2">
                        <input type="file" :name="'chon-file_' + item['ky_hieu']" :id="'chon-file_' + item['ky_hieu']">
                      </v-flex>
                      <v-flex xs12 sm4>
                        <v-btn @click="uploadFileBHBD(detailCOP_1, item['ky_hieu'])" small>Xác nhận tải file</v-btn>
                      </v-flex>
                      <v-flex xs12 sm2 class="pt-1">
                        <span>Tài liệu đính kèm: </span>
                      </v-flex>
                      <v-flex xs12 sm10>
                        <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_' + item['ky_hieu']]">
                          - <a :href="itemFile['fileUrl']" target="_blank"> {{itemFile['ten_file']}} </a>
                        </div>
                      </v-flex>
                    </v-layout>
                  </div>
                </td>
              </tr>
            </template>
          </tbody>
          <tbody v-if="part2BHBDActive || activeAllCOP" :style="{'pointer-events': disabledPart2 ? 'none' : ''}" id="part2BHBDActive">
            <template v-for="(item, index) in part2CSBHBD" v-if="!item['items']">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
            </template>

            <template v-else-if="item['ky_hieu'] === 'nd_8'">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
              <tr>
                <td></td>
                <td colspan="3">
                  <table style="width: 100%;" border="1" class="ftable">
                    <thead>
                      <tr>
                       <th style="width: 3%" class="text-xs-center">TT<br><em>No</em></th>
                       <th class="text-xs-center">Tên thiết bị, dụng cụ<br><em>Name of equiment/tools</em></th>
                       <th style="width: 10%" class="text-xs-center">Nhãn hiệu</th>
                       <th style="width: 10%" class="text-xs-center">Model</th>
                       <th style="width: 10%" class="text-xs-center">Mã số<br><em>Serial No</em></th>
                       <th style="width: 10%" class="text-xs-center">Năm SX<br><em>Manufacture year</em></th>
                       <th style="width: 10%" class="text-xs-center">Nước SX<br><em>Origin country</em></th>
                       <th style="width: 10%" class="text-xs-center">Kết quả kiểm tra</th>
                       <th style="width: 10%" class="text-xs-center">Số tem kiểm tra</th>
                       <th style="width: 10%" class="text-xs-center">Tình trạng <br> hoạt động</th>
                       <th style="width: 50px" class="text-xs-center">Kết luận</th>
                     </tr>
                   </thead>
                   <tbody>
                     <tr id="gen_4_2_1_1" v-for="(itemTb, indexTb) in thiet_bi_xuat_xuongItems" :key="  'thiet_bi_xuat_xuong' + itemTb" :style="{background: checkColorCop(itemTb['nd_result'])}"
                      @click="toKetQuaKiemTraCSBHBD(itemTb, indexTb, item)"
                     >
                       <td class="text-xs-center" style="width: 3% !important;">
                         {{indexTb + 1}}
                       </td>                      
                       <td class="text-xs-center" style="width: 3% !important;">
                         {{itemTb['name_text'] || itemTb['name']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['mark']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['model']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['seri']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['year']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['country_text'] || itemTb['country']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         <span style="color: blue; cursor: pointer;">Kết quả kiểm tra</span>
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['temp']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{(itemTb['status'] === 1 || itemTb['status'] === '1') ? 'Hoạt động' : 'Không hđ'}}
                       </td>
                       <td class="text-xs-center" style="width: 60px !important;">
                        <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                          <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTb" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexTb) + '_' + (indexKq + 1)" v-model="itemTb['nd_result']" :value="itemKq['value']" style="margin: 0 5px 0 0">
                          <label class="label-radio" :for="item['ky_hieu'] + '_result_' + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div>
                       </td>
                     </tr>
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="10">
                        <span style="width: 47px;">Kết luận: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <input type="radio" name="kl_nd_8" id="kl_nd_8_1" value="1" v-model="detailCOP_2['kl_nd_8']">
                          <label class="mr-3" for="kl_nd_8_1">Đạt</label>

                          <input type="radio" name="kl_nd_8" id="kl_nd_8_2" value="2" v-model="detailCOP_2['kl_nd_8']">
                          <label for="kl_nd_8_2">Không đạt</label>
                        </div>
                      </td>
                     </tr>
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="10">
                        <span style="width: 47px;">Mô tả: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <v-text-field
                          v-model="detailCOP_2['mt_nd_8']"
                          class="my-0 py-0"
                          ></v-text-field>
                        </div>
                      </td>
                     </tr>
                   </tbody>
                 </table>
                </td>
              </tr>
            </template>

            <#-- <template>
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">8.1</td>
                <td colspan="3" class="pl-1">Thiết bị dụng cụ</td>
              </tr>
            </template> -->

            <#-- <template>
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">8.1</td>
                <td colspan="3" class="pl-1">Thiết bị dụng cụ</td>
              </tr>
              <tr>
                <td></td>
                <td colspan="3">
                  <table style="width: 100%;" border="1" class="ftable">
                    <tbody>
                      <tr>
                       <th style="width: 3%" class="text-xs-center">TT<br><em>No</em></th>
                       <th class="text-xs-center">Tên thiết bị, dụng cụ<br><em>Name of equiment/tools</em></th>
                       <th class="text-xs-center">Nhãn hiệu<br><em>model</em></th>
                       <th class="text-xs-center">Mã số<br><em>Serial No</em></th>
                       <th class="text-xs-center">Nước sản xuất<br><em>Origin country</em></th>
                       <th class="text-xs-center">Tình trạng<br><em>Status</em></th>
                       <th class="text-xs-center" style="width: 60px">Kết luận</th>
                     </tr>
                     <tr v-for="(itemTbxx, indexTbxx) in detailCOP_2['thiet_bi_dung_cu']" :key="'thiet_bi_xuat_xuong' + indexTbxx" :style="{background: checkColorCop(itemTbxx['nd_result'])}">
                       <td class="text-xs-center" style="width: 3% !important;">
                         {{itemTbxx['sequenceNo']}}
                       </td>
                       <td style="width: 30% !important;" class="text-xs-center">
                         {{itemTbxx['name_text'] || itemTbxx['name']}}
                       </td>
                       <td style="width: 15% !important;" class="text-xs-center">
                         {{itemTbxx['model']}}
                       </td>
                       <td style="width: 15% !important;" class="text-xs-center">
                         {{itemTbxx['seri']}}
                       </td>
                       <td style="width: 15% !important;" class="text-xs-center">
                         {{itemTbxx['country_text'] || itemTbxx['country']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{(itemTbxx['status'] === 1 || itemTbxx['status'] === '1') ? 'Hoạt động' : 'Không hđ'}}
                       </td>
                       <td class="text-xs-center" style="width: 60px !important;">
                        <div v-for="(itemKq, indexKq) in kq" :key="'thiet_bi_xuat_xuong_kq' + indexKq" class="text-xs-center">
                          <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTb" class="check_radio" :id="item['ky_hieu'] + '_result_' + index + '_' + (indexKq + 1)" v-model="itemTb['nd_result']" :value="itemKq['value']" style="margin: 0 5px 0 0">
                          <label class="label-radio" :for="item['ky_hieu'] + '_result_' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div>

                        <div v-for="(itemKq3, indexKq3) in kq" class="text-xs-center">
                          <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTbxx + '_tbdc'" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexTbxx) + '_' + (indexKq3 + 1) + '_tbdc'" v-model="itemTbxx['nd_result']" :value="itemKq3['value']" style="margin: 0 5px 0 0">
                          <label class="label-radio" :for="item['ky_hieu'] + '_result_' + '_' + (indexKq3 + 1) + '_tbdc'" style="margin: 0" v-html="itemKq3['text']"></label>
                        </div>
                      </td>
                     </tr>
                     
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="9">
                        <span style="width: 47px;">Kết luận: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <input type="radio" name="kl_nd_8_1" id="kl_nd_8_1_1" value="1" v-model="detailCOP_2['kl_nd_8_1']">
                          <label class="mr-3" for="kl_nd_8_1_1">Đạt</label>

                          <input type="radio" name="kl_nd_8_1" id="kl_nd_8_1_2" value="2" v-model="detailCOP_2['kl_nd_8_1']">
                          <label for="kl_nd_8_1_2">Không đạt</label>
                        </div>
                      </td>
                     </tr>
                     <tr>
                        <td></td>
                        <td class="mo-ta pb-1" colspan="6">
                          <span style="width: 47px;">Mô tả: </span>
                          <div style="width: calc(100% - 53px); float: right;">
                            <v-text-field
                            v-model="detailCOP_2['mt_nd_8_1']"
                            class="my-0 py-0"
                            ></v-text-field>
                          </div>
                        </td>
                      </tr>
                   </tbody>
                 </table>
                </td>
              </tr>
            </template> -->
          </tbody>
          <tbody v-if="part1BHBDActive || activeAllCOP" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part1BHBDActive" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part5Activecccccccccc">
            <#-- mục 8. => 10. -->

            <tr>
              <td class="text-xs-center"><strong>9</strong></td>
              <td colspan="3">Các ghi nhận đánh giá khác (nếu có)</td>
            </tr>

            <tr>
              <td class="text-xs-center">9.1</td>
              <td colspan="3">Tổng số nhân lực: {{detailCOP_1['nd_9_1_result']}}</td>
            </tr>

            <tr>
              <td></td>
              <td style="font-weight: bold;" class="" :style="{background: checkColorCop(detailCOP_1['nd_9_2_result'])}">Kỹ thuật viên bảo dưỡng, sửa chữa:</td>
              <td class="pl-1" :style="{background: checkColorCop(detailCOP_1['nd_9_2_result'])}">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_9_2']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td :style="{background: checkColorCop(detailCOP_1['nd_9_2_result'])}">
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" :name="'diem_nd_9_2' + '_result'" class="check_radio" :id="'nd_9_2' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_9_2_result']">
                  <label class="label-radio" :for="'nd_9_2' + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_9_2_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_9_2']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_9_3_result'])}">
              <td></td>
              <td style="font-weight: bold;" class="">Kỹ thuật viên gò hàn:</td>
              <td class="pl-1">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_9_3']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_9_3_result" class="check_radio" :id="'nd_9_3' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_9_3_result']">
                  <label class="label-radio" :for="'nd_9_3' + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_9_3_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_9_3']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_9_4_result'])}">
              <td></td>
              <td style="font-weight: bold;" class="">Kỹ thuật viên sơn:</td>
              <td class="pl-1">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_9_4']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_9_4_result" class="check_radio" :id="'nd_9_4' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_9_4_result']">
                  <label class="label-radio" :for="part4[0]['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_9_4_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_9_4']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_9_5_result'])}">
              <td></td>
              <td style="font-weight: bold;" class="">Kỹ thuật viên kiểm tra xuất xưởng:</td>
              <td class="pl-1">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_9_5']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_9_5_result" class="check_radio" :id="'nd_9_5' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_9_5_result']">
                  <label class="label-radio" :for="part4[0]['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_9_5_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_9_5']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_9_6_result'])}">
              <td></td>
              <td style="font-weight: bold;" class="">Cán bộ quản lý:</td>
              <td class="pl-1">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_9_6']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_9_6_result" class="check_radio" :id="'nd_9_6' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_9_6_result']">
                  <label class="label-radio" :for="part4[0]['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_9_6_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_9_6']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>


            <#--  mục 9  -->
            <tr>
              <td class="text-xs-center"><strong>10</strong></td>
              <td colspan="3">Các nội dung kiểm tra khác</td>
            </tr>
            <tr>
              <td></td>
              <td colspan="3">
                  <textarea rows='5' v-model="detailCOP_1['nd_10_result']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                  </textarea>
              </td>
            </tr>
            <#--  mục 10  -->
            <tr>
              <td class="text-xs-center"><strong>11</strong></td>
              <td colspan="3">Các khuyến cáo (nếu có)</td>
            </tr>
            <tr>
              <td></td>
              <td colspan="3">
                  <textarea rows='5' v-model="detailCOP_1['nd_11_result']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                  </textarea>
              </td>
            </tr>
            <#--  mục 11  -->
            <tr>
              <td class="text-xs-center"><strong>12</strong></td>
              <td colspan="3">Ghi chú</td>
            </tr>
            <tr>
              <td></td>
              <td colspan="3">
                  <textarea rows='5' v-model="detailCOP_1['nd_12_result']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                  </textarea>
              </td>
            </tr>
          </tbody>

          <tbody v-if="part1BHBDActive || activeAllCOP" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part1BHBDActive" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part5Activeaaaaa">

            <template>
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">III</td>
                <td colspan="3" class="pl-1">XÁC NHẬN CHI PHÍ PHÁT SINH</td>
              </tr>
            </template>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;">3.1</td>
              <td class="text-xs-center" style="font-weight: bold;">
                Xác nhận chi phí đi lại bằng ô tô
              </td>
              <td colspan="4" class="pl-3">

                <v-select
                  style="width: 60%;"
                  class="my-0 py-0"
                  item-text="text"
                  item-value="value"
                  :items="coThuPhiItems"
                  v-model="detailCSBHBD['xac_nhan_thu_phi']"
                ></v-select>
                 
              </td>
            </tr>


            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                <#-- Phương tiện di chuyển (ô tô) -->
              </td>
              <td colspan="4" class="pl-3">

                <v-select
                  :disabled="!detailCSBHBD['xac_nhan_thu_phi']"
                  style="width: 60%;"
                  class="my-0 py-0"
                  item-text="text"
                  item-value="value"
                  :items="ptdcItems"
                  @input="changePtdc(detailCSBHBD['phuong_tien_di_chuyen'])"
                  v-model="detailCSBHBD['phuong_tien_di_chuyen']"
                ></v-select>
                 
              </td>
            </tr>


            <tr v-if="detailCSBHBD['phuong_tien_di_chuyen'] == 'cucdkvn'">
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                Quãng đường
              </td>
              <td colspan="4" class="pl-3">

                <v-select
                  :disabled="!detailCSBHBD['xac_nhan_thu_phi']"
                  style="width: 60%;"
                  class="my-0 py-0"
                  item-text="text"
                  item-value="value"
                  :items="quangDuongItems"
                  v-model="detailCSBHBD['quang_duong']"
                ></v-select>

              </td>
            </tr>

            <#-- <tr>
              <td class="text-xs-center" style="font-weight: bold;">3.2</td>
              <td class="text-xs-center" style="font-weight: bold;">
                Ghi chú
              </td>
              <td colspan="4" class="pl-3">

                <textarea rows='3' v-model="detailCSBHBD['ghi_chu_chi_phi']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                </textarea>
                 
              </td>
            </tr> -->

            <tr>
              <td class="text-xs-center" style="font-weight: bold;">3.2</td>
              <td class="text-xs-center" style="font-weight: bold;">
                Chi phí phương tiện khác (VNĐ)
              </td>
              <td colspan="4" class="pl-3">

                <v-text-field
                  style="width: 60%;"
                  class="my-0 py-0"
                  type="number"
                  v-model="detailCSBHBD['chi_phi_pt_khac']"
                ></v-text-field>
                 
              </td>
            </tr>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;">3.3</td>
              <td class="text-xs-center" style="font-weight: bold;">
                Chi phí phát sinh khác (VNĐ)
              </td>
              <td colspan="4" class="pl-3">

                <v-text-field
                  style="width: 60%;"
                  class="my-0 py-0"
                  type="number"
                  v-model="detailCSBHBD['chi_phi_phat_sinh_khac']"
                ></v-text-field>
                 
              </td>
            </tr>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;">3.4</td>
              <td class="text-xs-center" style="font-weight: bold;">
                Tổng chi phí phát sinh
              </td>
              <td colspan="4" class="pl-3">

                <v-text-field
                  style="width: 60%;"
                  class="my-0 py-0"
                  type="number"
                  v-model="detailCSBHBD['tong_chi_phi_phat_sinh']"
                ></v-text-field>
                 
              </td>
            </tr>
            <#-- <tr>
              <td colspan="4" class="pl-3">

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_dat" value="1" v-model="detailCSBHBD['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label class="mr-3" for="kl_ban_danh_gia_dat" @click="setDefaultValueCopReportExpiredDate()">Đạt</label>

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_khong_dat" value="0" v-model="detailCSBHBD['copReportStatus']">
                 <label for="kl_ban_danh_gia_khong_dat">Không đạt</label>

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_chua_dat" value="2" v-model="detailCSBHBD['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label for="kl_ban_danh_gia_chua_dat" @click="setDefaultValueCopReportExpiredDate()">Chưa đạt</label>
              </td>
            </tr> -->
          </tbody>

          <tbody v-if="part5BHBDActive || activeAllCOP" :style="{'pointer-events': disabledPart5 ? 'none' : ''}" id="part5BHBDActive">

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                Kết quả đánh giá CSBHBD ngày đầu:
              </td>
              <td class="pl-3">

                 <input type="radio" name="kl_ban_danh_gia_lan_dau" @click="setDefaultValueCopReportExpiredDate()" id="kl_ban_danh_gia_dat_lan_dau" value="1" v-model="detailCSBHBD['copReportStatusFirst']">
                 <label class="mr-3" for="kl_ban_danh_gia_dat_lan_dau" @click="setDefaultValueCopReportExpiredDate()">Đạt</label>

                 <input type="radio" name="kl_ban_danh_gia_lan_dau" id="kl_ban_danh_gia_khong_dat_lan_dau" value="0" v-model="detailCSBHBD['copReportStatusFirst']" @click="setDefaultValueCopReportExpiredDate()">
                 <label for="kl_ban_danh_gia_khong_dat_lan_dau" @click="setDefaultValueCopReportExpiredDate()">Không đạt</label>

                 <input type="radio" name="kl_ban_danh_gia_lan_dau" @click="setDefaultValueCopReportExpiredDate()" id="kl_ban_danh_gia_chua_dat_lan_dau" value="2" v-model="detailCSBHBD['copReportStatusFirst']">
                 <label for="kl_ban_danh_gia_chua_dat_lan_dau" @click="setDefaultValueCopReportExpiredDate()">Chưa đạt</label>
              </td>

              <td class="pl-3">
                <v-menu
                    ref="menuCopDateFirst"
                    :close-on-content-click="false"
                    v-model="menuCopDateFirst"
                    :nudge-right="40"
                    lazy
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                    >
                    <v-text-field
                    slot="activator"
                    v-model="detailCSBHBD['ngay_danh_gia_lan_dau']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copDateFirstPicker" no-title @input="menuCopDateFirst = false; detailCSBHBD['ngay_danh_gia_lan_dau'] = parseDate2(copDateFirstPicker);" locale="vi"></v-date-picker>
                </v-menu>
                 
              </td>
            </tr>

            <tr v-if="checkFirstStatus(detailCSBHBD['copReportStatusFirst'])">
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                Kết quả đánh giá CSBHBD ngày cuối:
              </td>
              <td class="pl-3">

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_dat" value="1" v-model="detailCSBHBD['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label class="mr-3" for="kl_ban_danh_gia_dat" @click="setDefaultValueCopReportExpiredDate()">Đạt</label>

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_khong_dat" value="0" v-model="detailCSBHBD['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label for="kl_ban_danh_gia_khong_dat" @click="setDefaultValueCopReportExpiredDate()">Không đạt</label>

                 <#-- <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_chua_dat" value="2" v-model="detailCSBHBD['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label for="kl_ban_danh_gia_chua_dat" @click="setDefaultValueCopReportExpiredDate()">Chưa đạt</label> -->
              </td>
              <td class="pl-3">
                <v-menu
                    ref="menuCopDateLast"
                    :close-on-content-click="false"
                    v-model="menuCopDateLast"
                    :nudge-right="40"
                    lazy
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                    >
                    <v-text-field
                    slot="activator"
                    v-model="detailCSBHBD['ngay_danh_gia_lan_cuoi']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copDateLastPicker" no-title @input="menuCopDateLast = false; detailCSBHBD['ngay_danh_gia_lan_cuoi'] = parseDate2(copDateLastPicker);" locale="vi"></v-date-picker>
                </v-menu>
                 
              </td>
            </tr>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                {{(detailCSBHBD['copReportStatus'] === 1 || detailCSBHBD['copReportStatus'] === '1') ? 'Có hiệu lực đến ngày' : 'Hết hiêụ lực kể từ ngày'}} 
              </td>
              <td colspan="4" class="pl-3">

                 <v-menu
                    ref="menuCopReportExpiredDate"
                    :close-on-content-click="false"
                    v-model="menuCopReportExpiredDate"
                    :nudge-right="40"
                    lazy
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                    >
                    <v-text-field
                    slot="activator"
                    v-model="detailCSBHBD['copReportExpiredDate']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copReportExpiredDatePicker" no-title @input="menuCopReportExpiredDate = false; detailCSBHBD['copReportExpiredDate'] = parseDate2(copReportExpiredDatePicker);" locale="vi"></v-date-picker>
                </v-menu>
              </td>
            </tr>
            <#-- <tr>
              <td colspan="4" class="pl-3">

                 <v-menu
                    ref="menuCopReportExpiredDate"
                    :close-on-content-click="false"
                    v-model="menuCopReportExpiredDate"
                    :nudge-right="40"
                    lazy
                    transition="scale-transition"
                    offset-y
                    full-width
                    max-width="290px"
                    min-width="290px"
                    >
                    <v-text-field
                    slot="activator"
                    v-model="detailCSBHBD['copReportExpiredDate']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copReportExpiredDatePicker" no-title @input="menuCopReportExpiredDate = false; detailCSBHBD['copReportExpiredDate'] = parseDate2(copReportExpiredDatePicker);" locale="vi"></v-date-picker>
                </v-menu>
              </td>
            </tr> -->

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                Chu kỳ đánh giá
              </td>
              <td colspan="4" class="pl-3">

               <v-select
               class="my-0 py-0"
               style="width: 50%;"
               :items="chuKyDanhGiaItems"
               item-text="itemName"
               item-value="itemCode"
               v-model="detailCSBHBD['inspectionAuditCycle']"
               ></v-select>
              </td>
            </tr>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                Ghi chú (để in vào thông báo)
              </td>
              <td colspan="4" class="pl-3">

               <v-text-field
               v-model="detailCSBHBD['ghi_chu_in_thong_bao']"
               class="my-0 py-0"
               ></v-text-field>
              </td>
            </tr>
            <#-- <tr>
              <td colspan="4" class="pl-3">

               <v-select
               class="my-0 py-0"
               :items="chuKyDanhGiaItems"
               item-text="itemName"
               item-value="itemCode"
               v-model="detailCSBHBD['valueTest']"
               ></v-select>
              </td>
            </tr> -->
          </tbody>
        </table>
      </v-flex>
    </v-layout>
  </div>
    </v-flex>
  </v-layout>
