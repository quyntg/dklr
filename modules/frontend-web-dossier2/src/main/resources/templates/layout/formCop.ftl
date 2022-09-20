<v-layout row wrap class="ml-0" :style="{'pointer-events': activeAllCOP ? 'none' : 'auto'}">
    <v-flex xs12 sm12>
      <div>
    <div class="text-xs-center" style="width: 100%;">
     <label class="content-label"><strong>BÁO CÁO KẾT QUẢ ĐÁNH GIÁ ĐIỀU KIỆN ĐẢM BẢO CHẤT LƯỢNG TẠI CƠ SỞ SẢN XUẤT</strong><br><em>(REPORT OF THE CONFORMITY OF PRODUCTION (COP) AUDIT)</em></label> 
    </div>
    
    <!-- Part2 thiết bị kiểm tra -->

    <v-layout row wrap class="ml-0 pl-4" style="margin-left: 55px !important;">
      <v-flex xs12 sm12>
        <h4>Nội dung</h4>
        <p class="pl-3" style="color: blue; cursor: pointer;" @click="toPartActive('all')">- Thông tin đánh giá chung</p>
        <p v-if="listCodeKTTB.includes(detailCOP['copClassification'])" class="pl-3" style="color: blue; cursor: pointer;" @click="toPartActive('part2Active')">- Thiết bị kiểm tra</p>
        <p v-if="listCodeKTSPXX.includes(detailCOP['copClassification'])" class="pl-3" style="color: blue; cursor: pointer;" @click="toPartActive('part7Active')">- Kiểu loại sản phẩm</p>
        <p v-if="listCodePNDN.includes(detailCOP['copClassification'])" class="pl-3" style="color: blue; cursor: pointer;" v-if="detailCOP['copclassification']" @click="toPartActive('part6Active')">- Phân loại nhóm doanh nghiệp</p>
        <#-- <p class="pl-3" style="color: blue; cursor: pointer;" @click="toPartActive('')">- Kiểm tra sử dụng ấn chỉ</p> -->
      </v-flex>
    </v-layout>

    <v-layout row wrap class="ml-0 pl-2">
      <v-flex xs12 sm3>
        <label class="content-label">Đăng kiểm viên 1:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-select
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          :items="dangKiemVienItems"
          item-text="fullName"
          item-value="userId"
          v-model="detailCOP['dang_kiem_vien_1']"
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
          v-model="detailCOP['dang_kiem_vien_2']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Số Báo cáo đánh giá:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCOP['copReportNo']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Ngày kiểm tra (từ):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCOP['copReportDateFrom'] || detailCOP['inspectionDateFrom']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Đến ngày:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCOP['copReportDateTo'] || detailCOP['inspectionDateTo']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label"> Loại hình đánh giá:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9 style="pointer-events: none;">
        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaBS" v-model="detailCOP['loai_hinh_danh_gia']" value="BS">
        <label for="loaihinhDanhGiaBS"> Bổ sung (Additional audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaHN" v-model="detailCOP['loai_hinh_danh_gia']" value="HN">
        <label for="loaihinhDanhGiaHN"> Định kỳ (Annual audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaLD" v-model="detailCOP['loai_hinh_danh_gia']" value="LD">
        <label for="loaihinhDanhGiaLD"> Lần đầu (Initial audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaDX" v-model="detailCOP['loai_hinh_danh_gia']" value="DX">
        <label for="loaihinhDanhGiaDX"> Đột xuất (Occassional audit)</label>
      </v-flex>

      <#-- <v-flex xs12 sm3>
        <label class="content-label">Số tham chiếu:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCOP['so_tham_chieu']"
        ></v-text-field>
      </v-flex> -->

      <template v-if="detailCOP['importerDomesticSite'] == 'TN'">
        <div style="width: 100%;">
          <v-layout row wrap class="mx-0 px-0">
            <v-flex xs12 sm3>
              <label class="content-label">Tên cơ sở sản xuất (Manufacturer name):&nbsp;</label>
            </v-flex>
            <v-flex xs12 sm9>
              <v-text-field
              readonly
              style="width: 60%;"
              class="my-0 py-0"
              v-model="detailCOP['applicantName']"
              ></v-text-field>
            </v-flex>

            <v-flex xs12 sm3>
              <label class="content-label">Địa chỉ (Address):&nbsp;</label>
            </v-flex>
            <v-flex xs12 sm9>
              <v-text-field
              readonly
              style="width: 60%;"
              class="my-0 py-0"
              v-model="detailCOP['applicantAddress']"
              ></v-text-field>
            </v-flex>
          </v-layout>
        </div>
      </template>
      <template v-else>
        <div style="width: 100%;">
          <v-layout row wrap class="mx-0 px-0">
            <v-flex xs12 sm3>
              <label class="content-label">Tên cơ sở nhập khẩu (Importer name):&nbsp;</label>
            </v-flex>
            <v-flex xs12 sm9>
              <v-text-field
              readonly
              style="width: 60%;"
              class="my-0 py-0"
              v-model="detailCOP['applicantName']"
              ></v-text-field>
            </v-flex>

            <v-flex xs12 sm3>
              <label class="content-label">Địa chỉ trụ sở chính (Address):&nbsp;</label>
            </v-flex>
            <v-flex xs12 sm9>
              <v-text-field
              readonly
              style="width: 60%;"
              class="my-0 py-0"
              v-model="detailCOP['applicantAddress']"
              ></v-text-field>
            </v-flex>

            <v-flex xs12 sm3>
              <label class="content-label">Tên cơ sở sản xuất (Manufacturer name):&nbsp;</label>
            </v-flex>
            <v-flex xs12 sm9>
              <v-text-field
              readonly
              style="width: 60%;"
              class="my-0 py-0"
              v-model="detailCOP['overseasManufacturerName']"
              ></v-text-field>
            </v-flex>

            <v-flex xs12 sm3>
              <label class="content-label">Địa chỉ (Address):&nbsp;</label>
            </v-flex>
            <v-flex xs12 sm9>
              <v-text-field
              readonly
              style="width: 60%;"
              class="my-0 py-0"
              v-model="detailCOP['overseasManufacturerAddress']"
              ></v-text-field>
            </v-flex>
          </v-layout>
        </div>
      </template>
      

      <v-flex xs12 sm3>
        <label class="content-label">Tên xưởng sản xuất, lắp ráp (Factory/Site):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCOP['ten_xuong_san_xuat'] || detailCOP['productionPlantName']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Địa điểm đánh giá (Site):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCOP['dia_chi_xuong_san_xuat'] || detailCOP['inspectionSite']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Loại hình sản xuất, lắp ráp (Classification):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <#-- <v-text-field
          class="my-0 py-0"
          v-model="detailCOP['certifiedAssemblyType']"
        ></v-text-field> -->
        <v-select
          readonly
          style="width: 60%;"
          class="my-0 py-0"
          item-text="groupName"
          item-value="groupCode"
          :items="loaiHinhSanXuatItems"
          v-model="detailCOP['copclassification']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Căn cứ:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <#-- <v-text-field
          class="my-0 py-0"
          v-model="detailCOP['certifiedAssemblyType']"
        ></v-text-field> -->
        <v-select
          style="width: 60%;"
          class="my-0 py-0"
          item-text="itemName"
          item-value="itemCode"
          :items="canCuItems"
          v-model="detailCOP['can_cu']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label" id="kieuLoaiSanPham">Loại sản phẩm đánh giá (Product's types):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm12 class="pb-2">
        <table style="width: 100%;" border="1" class="ftable">
          <thead>
            <tr style="background: #d9d7d7;">
             <th class="text-xs-center">Loại sản phẩm</th>
             <th class="text-xs-center">Nhãn hiệu</th>
             <th class="text-xs-center">Tên thương mại</th>
             <th class="text-xs-center">Ký hiệu thiết kế</th>
             <th class="text-xs-center">Mô tả chi tiết</th>
           </tr>
         </thead>
         <tbody>
           <tr id="gen_4_2_1_1" v-for="(item, index) in detailCOP['loai_san_pham']">
              <td class="text-xs-center py-1">{{item['sp_XCG01050']}}</td>
              <td class="text-xs-center py-1">{{item['nhan_hieu']}}</td>
              <td class="text-xs-center py-1">{{item['ten_thuong_mai']}}</td>
              <td class="text-xs-center py-1">{{item['ky_hieu_thiet_ke']}}</td>
              <td class="text-xs-center py-1">{{item['ghi_chu']}}</td>
           </tr>
         </tbody>
       </table>
      </v-flex>

      <v-flex xs12 sm12>
        <table border="1" style="width: 100%; border-collapse: collapse;">
          <thead v-if="!part4Active && !part5Active">
            <tr>
              <th class="text-xs-center">STT <br> NO</th>
              <th class="text-xs-center">NỘI DUNG ĐÁNH GIÁ (ASSESSMENT CONTENTS)</th>
              <th class="text-xs-center">KQ <br>(Result)</th>
              <th class="text-xs-center">KL <br>(Conclusion)</th>
            </tr>
          </thead>
          <template v-if="part1Active || activeAllCOP">
            <tbody :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part1Active">
            <template v-for="(item, index) in part1" v-if="!item['items']">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
            </template>
            <template v-else >
              <tr :style="{background: checkColorCop(detailCOP_1[item['nd_result']], detailCOP_1[item['diem_nd']])}">
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="2" class="pl-1" v-html="item['noi_dung']"></td>
                <td :rowspan="item['items']['length'] + 1">
                  <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                    <input type="radio" :name="item['ky_hieu'] + '_result'" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1[item['nd_result']]">
                    <label class="label-radio" :for="item['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                  </div>
                </td>
              </tr>
              <tr v-for="(itemRd, indexRd) in item['items']" :style="{background: checkColorCop(detailCOP_1[item['nd_result']], detailCOP_1[item['diem_nd']])}">
                <td class="text-xs-center">
                  <input type="radio" class="tinh_diem" :name="item['ky_hieu']" :id="item['ky_hieu'] + indexRd" :value="itemRd['gia_tri']" v-model="detailCOP_1[item['ky_hieu']]" @click="setPointFormCop(itemRd, indexRd, item['diem_nd'], 'detailCOP_1')">
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

              <tr>
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
                        <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, item['ky_hieu'])" small>Xác nhận tải file</v-btn>
                      </v-flex>
                      <v-flex xs12 sm2 class="pt-1">
                        <span>Tài liệu đính kèm: </span>
                      </v-flex>
                      <v-flex xs12 sm10>
                        <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_' + item['ky_hieu']]">
                          - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                        </div>
                      </v-flex>
                    </v-layout>
                  </div>
                </td>
              </tr>
            </template>
          </tbody>
          </template>

          <tbody :style="{'pointer-events': disabledPart2 ? 'none' : ''}" id="part2Active">
            <template v-for="(item, index) in part2" v-if="!item['items'] && (part1Active || activeAllCOP)">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
            </template>

            <template v-else-if="item['ky_hieu'] === 'nd_4_2_1_1' && (part2Active || activeAllCOP) && listCodeKTTB.includes(detailCOP['copClassification'])">
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
                       <th style="width: 10%" class="text-xs-center">Tình trạng</th>
                       <th style="width: 50px" class="text-xs-center">Kết luận</th>
                     </tr>
                   </thead>
                   <tbody>
                     <tr id="gen_4_2_1_1" v-for="(itemTb, indexTb) in thiet_bi_xuat_xuongItems" :key="  'thiet_bi_xuat_xuong_4_1' + indexTb" :style="{background: checkColorCop(itemTb['nd_result'])}"
                     @click="toKetQuaKiemTra(itemTb, indexTb, item)"
                     >
                       <td class="text-xs-center" style="width: 3% !important;">
                         {{itemTb['sequenceNo']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
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
                        <div v-for="(itemKq, indexKq) in kqThietBi" class="text-xs-center">
                          <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTb" class="check_radio" :id="item['ky_hieu'] + '_result_' + (index + indexTb) + '_' + (indexKq + 1)" v-model="itemTb['nd_result']" :value="itemKq['value']" style="margin: 0 5px 0 0">
                          <label class="label-radio" :for="item['ky_hieu'] + '_result_' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div>
                       </td>
                     </tr>
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="10">
                        <span style="width: 47px;">Kết luận: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <input type="radio" name="kl_nd_4_2_1_1" id="kl_nd_4_2_1_1_1" value="1" v-model="detailCOP_2['kl_nd_4_2_1_1']">
                          <label class="mr-3" for="kl_nd_4_2_1_1_1">Đạt</label>

                          <input type="radio" name="kl_nd_4_2_1_1" id="kl_nd_4_2_1_1_2" value="2" v-model="detailCOP_2['kl_nd_4_2_1_1']">
                          <label for="kl_nd_4_2_1_1_2">Không đạt</label>
                        </div>
                      </td>
                     </tr>
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="10">
                        <span style="width: 47px;">Mô tả: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <v-text-field
                          v-model="detailCOP_2['mt_nd_4_2_1_1']"
                          class="my-0 py-0"
                          ></v-text-field>
                        </div>
                      </td>
                     </tr>

                    <tr v-if="detailCOP_2['kl_nd_4_2_1_1'] != 1">
                      <td></td>
                      <td class="" colspan="10">
                        <div>
                          <v-layout row wrap class="ml-0 pl-2">
                            <v-flex xs12 sm5>
                              <v-layout row wrap class="ml-0">
                                <v-flex xs12 sm5 class="pt-2">
                                  Thêm mới đính kèm
                                </v-flex>
                                <v-flex xs12 sm7>
                                  <v-text-field
                                  v-model="detailCOP_2['ten_file_nd_4_2_1_1']"
                                  class="py-0 my-0"
                                  ></v-text-field>
                                </v-flex>
                              </v-layout>
                            </v-flex>
                            <v-flex xs12 sm3 class="pl-2 pt-2">
                              <input type="file" name="chon-file_nd_4_2_1_1" id="chon-file_nd_4_2_1_1">
                            </v-flex>
                            <v-flex xs12 sm4>
                              <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_2, 'nd_4_2_1_1')" small>Xác nhận tải file</v-btn>
                            </v-flex>
                            <v-flex xs12 sm2 class="pt-1">
                              <span>Tài liệu đính kèm: </span>
                            </v-flex>
                            <v-flex xs12 sm10>
                              <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_2['uploadfile_nd_4_2_1_1']">
                                - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                              </div>
                            </v-flex>
                          </v-layout>
                        </div>
                      </td>
                    </tr>
                   </tbody>
                 </table>
                </td>
              </tr>
            </template>

            <template v-else-if="item['ky_hieu'] === 'nd_4_2_1_2' && (part1Active || activeAllCOP)">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
              <tr>
                <td></td>
                <td colspan="3">
                  <table style="width: 100%;" border="1" class="ftable">
                    <tbody>
                      <tr>
                       <th style="width: 3%" class="text-xs-center">TT</th>
                       <th class="text-xs-center">Thông tin về Trung tâm Đăng kiểm</th>
                       <th class="text-xs-center">Thông tin khai báo</th>
                       <th class="text-xs-center">Kết quả</th>
                       <th class="text-xs-center">Kết luận</th>
                     </tr>
                     <template v-for="(itemTb, indexTb) in detailCOP_1['hop_dong']" :key="'hop_dong' + index">
                        <#-- <tr id="gen_4_2_1_3" v-for="(itemTb, index) in detailCOP['hop_dong']" :key="'hop_dong' + index">
                           <td class="text-xs-center" style="width: 3% !important;">
                             {{itemTb['number']}}
                           </td>
                           <td style="width: 10% !important;" class="text-xs-center">
                             {{itemTb['sequenceNo']}}
                           </td>
                           <td style="width: 10% !important;" class="text-xs-center">
                             {{itemTb['code']}}
                           </td>
                           <td style="width: 10% !important;" class="text-xs-center">
                             {{itemTb['bonus']}}
                           </td>
                           <td style="width: 10% !important;" class="text-xs-center">
                             {{itemTb['time']}}
                           </td>
                        </tr> -->
                        <tr :style="{background: checkColorCop(itemTb['kl_4_2_1_2_result' + '_maso'])}">
                          <td rowspan="2" class="text-xs-center"> {{indexTb + 1}} </td>
                          <td class="text-xs-center">Mã số Trung tâm Đăng kiểm</td>
                          <td class="text-xs-center">{{itemTb['code']}}</td>
                          <td class="text-xs-center">
                            <v-text-field
                              v-model="itemTb['codeTest']"
                              class="my-0 py-0"
                            ></v-text-field>
                          </td>
                          <td class="text-xs-center">
                            <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                              <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTb" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexTb) + '_' + (indexKq + 1)" v-model="itemTb['kl_4_2_1_2_result' + '_maso']" :value="itemKq['value']" style="margin: 0 5px 0 0">
                              <label class="label-radio" :for="item['ky_hieu'] + '_result_' + indexTb + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                            </div>

                            <#-- <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                              <input type="radio" :name="'nd_4_2_1_2_result_' + indexTb + '__ms'" class="check_radio" :id="'nd_4_2_1_2_result_' + indexTb + '_' + (indexKq + 1) + '__ms'" v-model="itemTb['nd_result'] + '_' + indexTb + '_1'" :value="itemKq['value']" style="margin: 0 5px 0 0">
                              <label class="label-radio" :for="'nd_4_2_1_2_result_' + indexTb + '_' + (indexKq + 1) + '__ms'" style="margin: 0" v-html="itemKq['text']"></label>
                            </div> -->
                          </td>
                        </tr>

                        <tr :style="{background: checkColorCop(itemTb['kl_4_2_1_2_result' + '_thoihan'])}">
                          <td class="text-xs-center">Số/Thời hạn hợp đồng</td>
                          <td class="text-xs-center">{{itemTb['time']}}</td>
                          <td class="text-xs-center">
                            <v-text-field
                              v-model="itemTb['timeTest']"
                              class="my-0 py-0"
                            ></v-text-field>
                          </td>
                          <td class="text-xs-center">
                            <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                              <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTb + '_sothoihan'" class="check_radio" :id="item['ky_hieu'] + '_result_' + ( indexTb) + '_' + (indexKq + 1) + '_sothoihan'" v-model="itemTb['kl_4_2_1_2_result' + '_thoihan']" :value="itemKq['value']" style="margin: 0 5px 0 0">
                              <label class="label-radio" :for="item['ky_hieu'] + '_result_' + indexTb + '_' + (indexKq + 1) + '_sothoihan'" style="margin: 0" v-html="itemKq['text']"></label>
                            </div>
                            <#-- <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                              <input type="radio" :name="'nd_4_2_1_2_result_' + indexTb + '__tg'" class="check_radio" :id="'nd_4_2_1_2_result_' + indexTb + '_' + (indexKq + 1) + '__tg'" v-model="itemTb['nd_result'] + '_' + indexTb + '_2'" :value="itemKq['value']" style="margin: 0 5px 0 0">
                              <label class="label-radio" :for="'nd_4_2_1_2_result_' + indexTb + '_' + (indexKq + 1) + '__tg'" style="margin: 0" v-html="itemKq['text']"></label>
                            </div> -->
                          </td>
                        </tr>
                     </template>
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="9">
                        <span style="width: 47px;">Kết luận: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <input type="radio" name="kl_nd_4_2_1_2" id="kl_nd_4_2_1_2_1" value="1" v-model="detailCOP_1['kl_nd_4_2_1_2']">
                          <label class="mr-3" for="kl_nd_4_2_1_2_1">Đạt</label>

                          <input type="radio" name="kl_nd_4_2_1_2" id="kl_nd_4_2_1_2_2" value="2" v-model="detailCOP_1['kl_nd_4_2_1_2']">
                          <label for="kl_nd_4_2_1_2_2">Không đạt</label>
                        </div>
                      </td>
                     </tr>
                     <tr>
                        <td></td>
                        <td class="mo-ta pb-1" colspan="5">
                          <span style="width: 47px;">Mô tả: </span>
                          <div style="width: calc(100% - 53px); float: right;">
                            <v-text-field
                            v-model="detailCOP_1['mt_nd_4_2_1_2']"
                            class="my-0 py-0"
                            ></v-text-field>
                          </div>
                        </td>
                      </tr>

                      <tr>
                        <td></td>
                        <td class="" colspan="4">
                          <div>
                            <v-layout row wrap class="ml-0 pl-2">
                              <v-flex xs12 sm5>
                                <v-layout row wrap class="ml-0">
                                  <v-flex xs12 sm5 class="pt-2">
                                    Thêm mới đính kèm
                                  </v-flex>
                                  <v-flex xs12 sm7>
                                    <v-text-field
                                    v-model="detailCOP_1['ten_file_nd_4_2_1_2']"
                                    class="py-0 my-0"
                                    ></v-text-field>
                                  </v-flex>
                                </v-layout>
                              </v-flex>
                              <v-flex xs12 sm3 class="pl-2 pt-2">
                                <input type="file" name="chon-file_nd_4_2_1_2" id="chon-file_nd_4_2_1_2">
                              </v-flex>
                              <v-flex xs12 sm4>
                                <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_4_2_1_2')" small>Xác nhận tải file</v-btn>
                              </v-flex>
                              <v-flex xs12 sm2 class="pt-1">
                                <span>Tài liệu đính kèm: </span>
                              </v-flex>
                              <v-flex xs12 sm10>
                                <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_4_2_1_2']">
                                  - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                                </div>
                              </v-flex>
                            </v-layout>
                          </div>
                        </td>
                      </tr>
                   </tbody>
                 </table>
                </td>
              </tr>
            </template>

            <template v-else-if="item['ky_hieu'] === 'nd_4_2_1_3' && (part1Active || activeAllCOP)">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
              <tr>
                <td></td>
                <td colspan="3">
                  <table style="width: 100%;" border="1" class="ftable">
                    <tbody>
                      <tr>
                       <th style="width: 3%" class="text-xs-center">TT<br><em>No</em></th>
                       <th class="text-xs-center">Tên thiết bị, dụng cụ<br><em>Name of equiment/tools</em></th>
                       <th class="text-xs-center">Nhãn hiệu<br><em>Mark</em></th>
                       <th class="text-xs-center">Model<#-- Mã số<br><em>Serial No</em> --></th>
                       <th class="text-xs-center">Nước sản xuất<br><em>Origin country</em></th>
                       <th class="text-xs-center">Tình trạng<br><em>Status</em></th>
                       <th class="text-xs-center">Kiểm tra</em></th>
                       <th class="text-xs-center" style="width: 60px">Kết luận</th>
                     </tr>
                     <tr v-for="(itemTbxx, indexTbxx) in detailCOP_1['thiet_bi_dung_cu']" :key="'thiet_bi_xuat_xuong_4_2' + indexTbxx" :style="{background: checkColorCop(itemTbxx['nd_result'])}">
                       <td class="text-xs-center" style="width: 3% !important;">
                         {{itemTbxx['sequenceNo']}}
                       </td>
                       <td class="text-xs-center">
                         {{itemTbxx['name']}}
                       </td>
                       <td class="text-xs-center">
                         {{itemTbxx['mark']}}
                       </td>
                       <td class="text-xs-center">
                         {{itemTbxx['model']}}
                       </td>
                       <td style="width: 15% !important;" class="text-xs-center">
                         {{itemTbxx['country_text'] || itemTbxx['country']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         <#-- {{(itemTbxx['status'] === 1 || itemTbxx['status'] === '1') ? 'Hoạt động' : 'Không hđ'}} -->
                          {{itemTbxx['status']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         <v-select
                         @input="changeColorTbxx(itemTbxx)"
                         class="my-0 py-0"
                         :items="tbxxStatusItems"
                         item-text="name"
                         item-value="code"
                         v-model="itemTbxx['statusCheck']"
                         ></v-select>
                       </td>
                       <td class="text-xs-center" style="width: 60px !important;">
                        <#-- <div v-for="(itemKq, indexKq) in kq" :key="'thiet_bi_xuat_xuong_kq' + indexKq" class="text-xs-center">
                          <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTb" class="check_radio" :id="item['ky_hieu'] + '_result_' + index + '_' + (indexKq + 1)" v-model="itemTb['nd_result']" :value="itemKq['value']" style="margin: 0 5px 0 0">
                          <label class="label-radio" :for="item['ky_hieu'] + '_result_' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div> -->
                        <template>
                          <div v-for="(itemKq3, indexKq3) in kq2" class="text-xs-center">
                            <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTbxx" class="check_radio" :id="item['ky_hieu'] + '_result_' + (index + indexTbxx) + '_' + (indexKq3 + 1)" v-model="itemTbxx['nd_result']" :value="itemKq3['value']" style="margin: 0 5px 0 0">
                            <label class="label-radio" :for="item['ky_hieu'] + '_result_' + index + '_' + (indexKq3 + 1)" style="margin: 0" v-html="itemKq3['text']"></label>
                          </div>
                        </template>
                      </td>
                     </tr>
                     
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="9">
                        <span style="width: 47px;">Kết luận: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <input type="radio" name="kl_nd_4_2_1_3" id="kl_nd_4_2_1_3_1" value="1" v-model="detailCOP_1['kl_nd_4_2_1_3']">
                          <label class="mr-3" for="kl_nd_4_2_1_1_1">Đạt</label>

                          <input type="radio" name="kl_nd_4_2_1_3" id="kl_nd_4_2_1_3_2" value="2" v-model="detailCOP_1['kl_nd_4_2_1_3']">
                          <label for="kl_nd_4_2_1_1_2">Không đạt</label>
                        </div>
                      </td>
                     </tr>
                     <tr>
                        <td></td>
                        <td class="mo-ta pb-1" colspan="6">
                          <span style="width: 47px;">Mô tả: </span>
                          <div style="width: calc(100% - 53px); float: right;">
                            <v-text-field
                            v-model="detailCOP_1['mt_nd_4_2_1_3']"
                            class="my-0 py-0"
                            ></v-text-field>
                          </div>
                        </td>
                      </tr>

                      <tr>
                        <td></td>
                        <td class="" colspan="6">
                          <div>
                            <v-layout row wrap class="ml-0 pl-2">
                              <v-flex xs12 sm5>
                                <v-layout row wrap class="ml-0">
                                  <v-flex xs12 sm5 class="pt-2">
                                    Thêm mới đính kèm
                                  </v-flex>
                                  <v-flex xs12 sm7>
                                    <v-text-field
                                    v-model="detailCOP_1['ten_file_nd_4_2_1_3']"
                                    class="py-0 my-0"
                                    ></v-text-field>
                                  </v-flex>
                                </v-layout>
                              </v-flex>
                              <v-flex xs12 sm3 class="pl-2 pt-2">
                                <input type="file" name="chon-file_nd_4_2_1_3" id="chon-file_nd_4_2_1_3">
                              </v-flex>
                              <v-flex xs12 sm4>
                                <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_4_2_1_3')" small>Xác nhận tải file</v-btn>
                              </v-flex>
                              <v-flex xs12 sm2 class="pt-1">
                                <span>Tài liệu đính kèm: </span>
                              </v-flex>
                              <v-flex xs12 sm10>
                                <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_4_2_1_3']">
                                  - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                                </div>
                              </v-flex>
                            </v-layout>
                          </div>
                        </td>
                      </tr>
                   </tbody>
                 </table>
                </td>
              </tr>
            </template>
          </tbody>

          <tbody v-if="part1Active || activeAllCOP" :style="{'pointer-events': disabledPart2 ? 'none' : ''}" id="part2Active">
            <template v-for="(item, index) in part3" v-if="!item['items']">
              <tr>
                <td class="text-xs-center" style="font-weight: bold;">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
            </template>
            <template v-else>
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
                  <input type="radio" class="tinh_diem" :name="item['ky_hieu']" :id="item['ky_hieu'] + indexRd" :value="itemRd['gia_tri']" v-model="detailCOP_1[item['ky_hieu']]" @click="setPointFormCop(itemRd, indexRd, item['diem_nd'], 'detailCOP_1')">
                </td>
                <td class="pl-1">{{itemRd['noi_dung']}}</td>
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

              <tr>
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
                        <v-btn @click="uploadFileCop(detailCOP_1, item['ky_hieu'])" small>Xác nhận tải file</v-btn>
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

          <tbody v-if="part1Active || activeAllCOP" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part1Active">
            <!-- phần 5. Nhân lực -->
            <tr>
              <td style="font-weight: bold;" class="text-xs-center">{{part4[0]['stt']}}</td>
              <td colspan="3" class="pl-1" v-html="part4[0]['noi_dung']"></td>
            </tr>
            <tr>
              <td rowspan="15"></td>
              <td style="font-weight: bold;" class="" :style="{background: checkColorCop(detailCOP_1['nd_5_1_result'])}">Tổng số nhân lực</td>
              <td class="pl-1" :style="{background: checkColorCop(detailCOP_1['nd_5_1_result'])}">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_5_1']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td :style="{background: checkColorCop(detailCOP_1['nd_5_1_result'])}">
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" :name="'diem_nd_5_1' + '_result'" class="check_radio" :id="'nd_5_1' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_5_1_result']">
                  <label class="label-radio" :for="'nd_5_1' + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>

            <#-- Mô tả  nd_5_1_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_5_1']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_5_1']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_5_1" id="chon-file_nd_5_1">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_5_1')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_5_1']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr>
              <td style="font-weight: bold;" class="" :style="{background: checkColorCop(detailCOP_1['nd_5_1_1_result'])}">Tổng số nhân công</td>
              <td class="pl-1" :style="{background: checkColorCop(detailCOP_1['nd_5_1_1_result'])}">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_5_1_1']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td :style="{background: checkColorCop(detailCOP_1['nd_5_1_1_result'])}">
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" :name="'diem_nd_5_1_1' + '_result'" class="check_radio" :id="'nd_5_1_1' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_5_1_1_result']">
                  <label class="label-radio" :for="'nd_5_1_1' + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_5_1_1_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_5_1_1']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_5_1_1']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_5_1" id="chon-file_nd_5_1_1">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_5_1_1')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_5_1_1']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_5_1_2_result'])}">
              <td style="font-weight: bold;" class="">Tổng số cán bộ quản lý, kỹ thuật (Management, technican):</td>
              <td class="pl-1">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_5_1_2']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_5_1_2_result" class="check_radio" :id="'nd_5_1_2' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_5_1_2_result']">
                  <label class="label-radio" :for="'nd_5_1_2' + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_5_1_2_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_5_1_2']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_5_1_2']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_5_1_2" id="chon-file_nd_5_1_2">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_5_1_2')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_5_1_2']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_5_1_3_result'])}">
              <td style="font-weight: bold;" class="">Tổng số nhân viên kiểm tra chất lượng (Quality staff):</td>
              <td class="pl-1">
                <v-text-field
                  v-model="detailCOP_1['diem_nd_5_1_3']"
                  class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_5_1_3_result" class="check_radio" :id="'nd_5_1_3' + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_5_1_3_result']">
                  <label class="label-radio" :for="part4[0]['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>
            <#-- Mô tả  nd_5_1_3_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_5_1_3']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_5_1_3']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_5_1_3" id="chon-file_nd_5_1_3">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_5_1_3')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_5_1_3']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_5_1_4_result'])}">
              <td class="text-xs-center" colspan="2">
                <div style="width: 20%; border-right: 1px solid #111; float: left; min-height: 96px;">
                  Danh sách nhân viên kiểm tra chất lượng xe (*)
                  List of Q&A employees
                </div>
                <div style="width: 80%; float: left;">
                  <table style="width: 100%;" border="1" class="ftable">
                    <tbody>
                      <tr>
                        <th class="text-xs-center">Họ và tên<br><i style="font-size: 13px;">Full name</i></th>
                        <th class="text-xs-center">Số chứng chỉ đào tạo nghiệp vụ<br><i style="font-size: 13px;">Training cert No.</i></th>
                        <th class="text-xs-center">Nơi đào tạo<br><i style="font-size: 13px;">Traning places</i></th>
                        <th class="text-xs-center">Vị trí làm việc<br><i style="font-size: 13px;">Working position</i></th>
                      </tr>
                      <tr id="gen_4_2_1_3" v-for="(item, index) in detailCOP_1['danh_sach_nhan_vien']" :key="'nhan_luc' + index">
                       <td>{{item['name']}}</td>
                       <td>{{item['certNo']}}</td>
                       <td>{{item['place']}}</td>
                       <td>{{item['position']}}</td>
                     </tr>
                   </tbody>
                 </table>
                </div>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="ds_nhanvien_result" class="check_radio" :id="'ds_nhanvien_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_5_1_4_result']">
                  <label class="label-radio" :for="'ds_nhanvien_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>

            <#-- Mô tả  nd_5_1_4_result-->
            <tr>
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  v-model="detailCOP_1['mt_nd_5_1_4']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_5_1_4']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_5_1_4" id="chon-file_nd_5_1_4">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_5_1_4')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_5_1_4']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>
          </tbody>

          <tbody v-if="part1Active || activeAllCOP" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part1Active">
            <template v-for="(item, index) in part5" v-if="!item['items']">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-2" v-html="item['noi_dung']"></td>
              </tr>
              <#--<tr v-else>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td class="pl-2" v-html="item['noi_dung']"></td>
                <td class="text-xs-center">
                  Biên bản kiểm tra tính phù hợp
                </td>
                <td>
                  <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                    <input type="radio" :name="item['ky_hieu'] + '_result'" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1[item['nd_result']]">
                    <label class="label-radio" :for="item['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                  </div>
                </td>
              </tr> -->
            </template>
            <template v-else>
              <tr :style="{background: checkColorCop(detailCOP_1[item['nd_result']], detailCOP_1[item['diem_nd']])}">
                <td class="text-xs-center" style="font-weight: bold;">{{item['stt']}}</td>
                <td colspan="2" class="pl-2" v-html="item['noi_dung']"></td>
                <td :rowspan="item['items']['length'] + 1">
                  <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                    <input type="radio" :name="item['ky_hieu'] + '_result'" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1[item['nd_result']]">
                    <label class="label-radio" :for="item['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                  </div>
                </td>
              </tr>
              <tr v-for="(itemRd, indexRd) in item['items']" :style="{background: checkColorCop(detailCOP_1[item['nd_result']], detailCOP_1[item['diem_nd']])}">
                <td class="text-xs-center">
                  <input type="radio" class="tinh_diem" :name="item['ky_hieu']" :id="item['ky_hieu'] + indexRd" :value="itemRd['gia_tri']" v-model="detailCOP_1[item['ky_hieu']]" @click="setPointFormCop(itemRd, indexRd, item['diem_nd'], 'detailCOP_1')"> 
                </td>
                <td class="pl-1">{{itemRd['noi_dung']}}</td>
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

              <tr>
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
                        <v-btn @click="uploadFileCop(detailCOP_1, item['ky_hieu'])" small>Xác nhận tải file</v-btn>
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

            <#-- mục 8. => 10. -->
            <tr :style="{background: checkColorCop(detailCOP_1['nd_8_result'])}">
              <td rowspan="2" class="text-xs-center" style="font-weight: bold;">8</td>
              <td class="pl-2" style="font-weight: bold;">Kiểm tra tính phù hợp của sản phẩm xuất xưởng</td>
              <td class="text-xs-center">Biên bản kiểm tra tính phù hợp SP</td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_8_result" class="check_radio" :id="'nd_8_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_8_result']">
                  <label class="label-radio" :for="'nd_8_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_8_result'])}">
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  
                  v-model="detailCOP_1['mt_nd_8']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_8']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_8" id="chon-file_nd_8">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_8')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_8']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_9_result'])}">
              <td rowspan="2" class="text-xs-center" style="font-weight: bold;">9</td>
              <td class="pl-2" style="font-weight: bold;">Kiểm tra việc sử dụng phôi phiếu kiểm tra chất lượng xuất xưởng</td>
              <td class="text-xs-center">Biên bản kiểm tra sử dụng phôi phiếu</td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_9_result" class="check_radio" :id="'nd_9_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_9_result']">
                  <label class="label-radio" :for="'nd_9_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
              
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_9_result'])}">
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  
                  v-model="detailCOP_1['mt_nd_9']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_9']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_9" id="chon-file_nd_9">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_9')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_9']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_10_result'])}">
              <td rowspan="2" class="text-xs-center" style="font-weight: bold;">10</td>
              <td class="pl-2" style="font-weight: bold;">Các nội dung đánh giá khác:</td>
              <td>
                <v-text-field
                style="width: 130px;"
                v-model="detailCOP_1['mt_nd_10_remark_other']"
                class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_10_result" class="check_radio" :id="'nd_10_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_10_result']">
                  <label class="label-radio" :for="'nd_10_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_10_result'])}">
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  
                  v-model="detailCOP_1['mt_nd_10']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_10']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_10" id="chon-file_nd_10">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_10')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_10']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_11_result'])}">
              <td rowspan="2" class="text-xs-center" style="font-weight: bold;">11</td>
              <td class="pl-2" style="font-weight: bold;">Các khuyến cáo khác (nếu có) (Observations (If any)):</td>
              <td>
                <v-text-field
                multi-line
                rows="3"
                style="width: 130px;"
                v-model="detailCOP_1['mt_nd_11_observations_other']"
                class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_11_result" class="check_radio" :id="'nd_11_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_11_result']">
                  <label class="label-radio" :for="'nd_11_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_11_result'])}">
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <textarea rows='5' v-model="detailCOP_1['mt_nd_11']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                  </textarea>
                  <#-- <v-text-field
                  v-model="detailCOP['mt_nd_11']"
                  class="my-0 py-0"
                  ></v-text-field> -->
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_11']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_11" id="chon-file_nd_11">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_11')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_11']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_12_result'])}">
              <td rowspan="2" class="text-xs-center" style="font-weight: bold;">12</td>
              <td class="pl-2" style="font-weight: bold;">Công suất thực tế (Actual Capacity):</td>
              <td>
                <v-text-field
                style="width: 130px;"
                v-model="detailCOP_1['mt_nd_12_actual_capacity']"
                class="my-0 py-0"
                ></v-text-field>
              </td>
              <td>
                <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                  <input type="radio" name="nd_12_result" class="check_radio" :id="'nd_12_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_1['nd_12_result']">
                  <label class="label-radio" :for="'nd_12_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                </div>
              </td>
            </tr>

            <tr :style="{background: checkColorCop(detailCOP_1['nd_12_result'])}">
              <td class="mo-ta pb-1" colspan="3">
                <span style="width: 47px;">Mô tả: </span>
                <div style="width: calc(100% - 53px); float: right;">
                  <v-text-field
                  
                  v-model="detailCOP_1['mt_nd_12']"
                  class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>

            <tr>
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
                          v-model="detailCOP_1['ten_file_nd_12']"
                          class="py-0 my-0"
                          ></v-text-field>
                        </v-flex>
                      </v-layout>
                    </v-flex>
                    <v-flex xs12 sm3 class="pl-2 pt-2">
                      <input type="file" name="chon-file_nd_12" id="chon-file_nd_12">
                    </v-flex>
                    <v-flex xs12 sm4>
                      <v-btn style="font-style: normal; " @click="uploadFileCop(detailCOP_1, 'nd_12')" small>Xác nhận tải file</v-btn>
                    </v-flex>
                    <v-flex xs12 sm2 class="pt-1">
                      <span>Tài liệu đính kèm: </span>
                    </v-flex>
                    <v-flex xs12 sm10>
                      <div class="pb-1" v-for="(itemFile, indexFile) in detailCOP_1['uploadfile_nd_12']">
                        - <a @click="viewFileCop(itemFile['fileUrl'])" href="javascript:;"> {{itemFile['ten_file']}} </a>
                      </div>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr>

            <tr>
              <td rowspan="" class="text-xs-center" style="font-weight: bold;">13</td>
              <td class="pl-2" style="font-weight: bold;">Phân nhóm doanh nghiệp:</td>
              <td class="pl-2" class="text-xs-center">
                Biên bản phân nhóm doanh nghiệp
              </td>
              <td>
                <v-text-field
                style="width: 67px;"
                v-model="detailCOP['bb_nd_13']"
                class="my-0 py-0"
                ></v-text-field>
              </td>
            </tr>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;">14</td>
              <td colspan="3" class="pl-2" style="font-weight: bold;">
                Ghi chú biên bản: <br>
                <v-text-field
                multi-line
                rows="3"
                style=""
                v-model="detailCOP['inspectionNote']"
                class="my-0 py-0"
                ></v-text-field>
              </td>
            </tr>
          </tbody>

          <tbody v-if="(part3Active || activeAllCOP) && listCodePNDN.includes(detailCOP['copClassification'])" :style="{'pointer-events': disabledPart3 ? 'none' : ''}" id="part3Active">
            <tr>
              <td class="text-xs-center" style="font-weight: bold;">II.</td>
              <td colspan="3" class="text-xs-center" style="font-weight: bold;">
                PHÂN NHÓM DOANH NGHIỆP
              </td>
            </tr>
            <tr>
              <td class="text-xs-center" style="font-weight: bold;">TT</td>
              <td colspan="2" class="text-xs-center" style="font-weight: bold;">
                Tiêu chí đánh giá
              </td>
              <td class="text-xs-center" style="font-weight: bold;">
                Kết quả
              </td>
            </tr>
            <template v-for="(item, index) in part6">
              <tr>
                <td class="text-xs-center" style="font-weight: bold; background: #15ddf1;">{{item['stt']}}</td>
                <td colspan="2" class="pl-2" v-html="item['noi_dung']" style="font-weight: bold; background: #15ddf1;"></td>
                <td :rowspan="item['items']['length'] + 1" class="pt-4">
                  <div v-for="(itemKq, indexKq) in item['kqAB']" class="text-xs-center">
                    <input type="radio" :name="item['ky_hieu'] + '_result'" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCOP_3[item['ky_hieu']]" v-on:change="calToTalPointABC();" @click="calToTalPointABC()">
                    <label class="label-radio" :for="item['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']" @click="calToTalPointABC()"></label>
                  </div>
                </td>
              </tr>
              <tr v-for="(itemKq, index) in item['items']" :style="{background: checkColorCop(detailCOP_3[item['ky_hieu']])}">
                <td>
                </td>
                <td class="pl-2" colspan="2">
                  {{itemKq['noi_dung']}}
                </td>
              </tr>
            </template>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td colspan="3" class="text-xs-center" style="font-weight: bold;">
                Tổng điểm loại A: {{detailCOP['totalPointA'] || 0}} <br>
                Tổng điểm loại B: {{detailCOP['totalPointB'] || 0}} <br>
                Tổng điểm loại C: {{detailCOP['totalPointC'] || 0}}
              </td>
            </tr>

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td colspan="3" class="text-xs-center" style="font-weight: bold;">
                Kết luận Phân nhóm doanh nghiệp: {{detailCOP['productionPlantClassification'] || ''}}
              </td>
            </tr>
          </tbody>


          <tbody v-if="(part4Active || activeAllCOP) && listCodeKTSPXX.includes(detailCOP['copClassification'])" :style="{'pointer-events': disabledPart4 ? 'none' : ''}" id="part4Active">

            <#-- <tr>
              <td colspan="4">
                <div class="">
                  <v-layout row wrap class="ml-0">
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
                        v-model="detailCOP_4['dang_kiem_vien_kiem_tra_tinh_ph_1']"
                      ></v-select>
                    </v-flex>

                    <v-flex xs12 sm3>
                      <label class="content-label">Đăng kiểm viên phối hợp:&nbsp;</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <v-select
                        style="width: 60%;"
                        class="my-0 py-0"
                        item-text="fullName"
                        item-value="userId"
                        :items="dangKiemVienItems"
                        v-model="detailCOP_4['dang_kiem_vien_kiem_tra_tinh_ph_2']"
                      ></v-select>
                    </v-flex>

                    <v-flex xs12 sm3>
                      <label class="content-label">Số Báo cáo đánh giá:&nbsp;</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <v-text-field
                        style="width: 60%;"
                        class="my-0 py-0"
                        v-model="detailCOP_4['copReportNo']"
                      ></v-text-field>
                    </v-flex>

                    <v-flex xs12 sm3>
                      <label class="content-label">Ngày kiểm tra (từ):&nbsp;</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <v-text-field
                        style="width: 60%;"
                        class="my-0 py-0"
                        v-model="detailCOP_4['copReportDateFrom']"
                      ></v-text-field>
                    </v-flex>

                    <v-flex xs12 sm3>
                      <label class="content-label">Đến ngày:&nbsp;</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <v-text-field
                        style="width: 60%;"
                        class="my-0 py-0"
                        v-model="detailCOP_4['copReportDateTo']"
                      ></v-text-field>
                    </v-flex>
                  </v-layout>
                </div>
              </td>
            </tr> -->

            <tr>
              <td class="text-xs-center" style="font-weight: bold;">III.</td>
              <td colspan="3" class="text-xs-center" style="font-weight: bold;">
                KIỂM TRA TÍNH PHÙ HỢP CỦA SẢN PHẨM XUẤT XƯỞNG 
              </td>
            </tr>
            <tr>
              <td colspan="4">
                <table style="width: 100%;" border="1" class="ftable">
                    <tbody>
                      <tr style="background: #d9d7d7;">
                        <th class="text-xs-center">TT<br><i style="font-size: 13px;">No</i></th>
                        <th class="text-xs-center">Loại sản phẩm<br><i style="font-size: 13px;">Product type</i></th>
                        <th class="text-xs-center">Số giấy chứng nhận <br><i style="font-size: 13px;">Certificate Number</i></th>
                        <th class="text-xs-center">Nhãn hiệu<br><i style="font-size: 13px;">Mark</i></th>
                        <th class="text-xs-center">Mã kiểu loại<br><i style="font-size: 13px;">Model code</i></th>
                        <th class="text-xs-center">Ký hiệu thiết kế<br><i style="font-size: 13px;">Design code</i></th>
                        <#-- <th class="text-xs-center">Kết quả kiểm tra</th>
                        <th class="text-xs-center">Số tem kiểm tra</th> -->
                        <th class="text-xs-center">Kết luận</th>
                      </tr>
                      <tr style="cursor: pointer;" id="gen_4_2_1_3" v-for="(itemKlx, indexKlx) in detailCOP_4['danh_sach_san_pham']" :key="'loai_xe' + indexKlx">
                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(itemKlx, indexKlx)">{{indexKlx + 1}}</td>
                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(itemKlx, indexKlx)">{{itemKlx['type_text'] || itemKlx['type']}}</td>
                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(itemKlx, indexKlx)">{{itemKlx['cerNo_text']}}
                        </td>
                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(itemKlx, indexKlx)">{{itemKlx['mark']}}</td>
                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(itemKlx, indexKlx)">{{itemKlx['model']}}</td>
                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(itemKlx, indexKlx)">  {{itemKlx['code']}}
                        </td>

                        <#-- <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(item, index)"> 
                        </td>

                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(item, index)">
                          {{item['temp']}}
                        </td>

                         -->

                        <td class="text-xs-center py-1" @click="toDetailKieuLoaiXe(item, index)">  
                          {{mapTextKq(itemKlx['nd_result'])}}
                        </td>
                     </tr>
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="9">
                        <span style="width: 47px;">Kết luận: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <input type="radio" name="kl_nd_kt_tinh_phu_hop" id="kl_nd_kt_tinh_phu_hop_1" value="1" v-model="detailCOP_4['kl_nd_4_2_1_1']">
                          <label class="mr-3" for="kl_nd_kt_tinh_phu_hop_1">Đạt</label>

                          <input type="radio" name="kl_nd_4_2_1_1" id="kl_nd_kt_tinh_phu_hop_2" value="2" v-model="detailCOP_4['kl_nd_4_2_1_1']">
                          <label for="kl_nd_kt_tinh_phu_hop_2">Không đạt</label>
                        </div>
                      </td>
                     </tr>
                   </tbody>
                 </table>


                 <#-- <input type="radio" name="kl_nd_kt_tinh_phu_hop" id="kl_nd_kt_tinh_phu_hop_1" value="1" v-model="detailCOP_4['kl_nd_4_2_1_1']">
                 <label class="mr-3" for="kl_nd_kt_tinh_phu_hop_1">Đạt</label>

                 <input type="radio" name="kl_nd_4_2_1_1" id="kl_nd_kt_tinh_phu_hop_2" value="2" v-model="detailCOP_4['kl_nd_4_2_1_1']">
                 <label for="kl_nd_kt_tinh_phu_hop_2">Không đạt</label>

                 <input type="radio" name="kl_nd_4_2_1_1" id="kl_nd_kt_tinh_phu_hop_2" value="2" v-model="detailCOP_4['kl_nd_4_2_1_1']">
                 <label for="kl_nd_kt_tinh_phu_hop_2">Chưa đạt</label> -->
              </td>
            </tr>

          </tbody>


          <tbody v-if="part5Active || activeAllCOP" :style="{'pointer-events': disabledPart5 ? 'none' : ''}" id="part5Active">

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                Kết quả đánh giá COP ngày đầu:
              </td>
              <td class="pl-3">

                 <input type="radio" name="kl_ban_danh_gia_lan_dau" @click="setDefaultValueCopReportExpiredDate()" id="kl_ban_danh_gia_dat_lan_dau" value="1" v-model="detailCOP['copReportStatusFirst']">
                 <label class="mr-3" for="kl_ban_danh_gia_dat_lan_dau" @click="setDefaultValueCopReportExpiredDate()">Đạt</label>

                 <input type="radio" name="kl_ban_danh_gia_lan_dau" id="kl_ban_danh_gia_khong_dat_lan_dau" value="0" v-model="detailCOP['copReportStatusFirst']" @click="setDefaultValueCopReportExpiredDate()">
                 <label for="kl_ban_danh_gia_khong_dat_lan_dau" @click="setDefaultValueCopReportExpiredDate()">Không đạt</label>

                 <input type="radio" name="kl_ban_danh_gia_lan_dau" @click="setDefaultValueCopReportExpiredDate()" id="kl_ban_danh_gia_chua_dat_lan_dau" value="2" v-model="detailCOP['copReportStatusFirst']">
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
                    v-model="detailCOP['ngay_danh_gia_lan_dau']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copDateFirstPicker" no-title @input="menuCopDateFirst = false; detailCOP['ngay_danh_gia_lan_dau'] = parseDate2(copDateFirstPicker);" locale="vi"></v-date-picker>
                </v-menu>
                 
              </td>
            </tr>

            <tr v-if="checkFirstStatus(detailCOP['copReportStatusFirst'])">
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                Kết quả đánh giá COP ngày cuối:
              </td>
              <td class="pl-3">

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_dat" value="1" v-model="detailCOP['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label class="mr-3" for="kl_ban_danh_gia_dat" @click="setDefaultValueCopReportExpiredDate()">Đạt</label>

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_khong_dat" value="0" v-model="detailCOP['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label for="kl_ban_danh_gia_khong_dat" @click="setDefaultValueCopReportExpiredDate()">Không đạt</label>

                 <#-- <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_chua_dat" value="2" v-model="detailCOP['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
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
                    v-model="detailCOP['ngay_danh_gia_lan_cuoi']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copDateLastPicker" no-title @input="menuCopDateLast = false; detailCOP['ngay_danh_gia_lan_cuoi'] = parseDate2(copDateLastPicker);" locale="vi"></v-date-picker>
                </v-menu>
                 
              </td>
            </tr>
            <#-- <tr>
              <td colspan="4" class="pl-3">

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_dat" value="1" v-model="detailCOP['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label class="mr-3" for="kl_ban_danh_gia_dat" @click="setDefaultValueCopReportExpiredDate()">Đạt</label>

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_khong_dat" value="0" v-model="detailCOP['copReportStatus']">
                 <label for="kl_ban_danh_gia_khong_dat">Không đạt</label>

                 <input type="radio" name="kl_ban_danh_gia" id="kl_ban_danh_gia_chua_dat" value="2" v-model="detailCOP['copReportStatus']" @click="setDefaultValueCopReportExpiredDate()">
                 <label for="kl_ban_danh_gia_chua_dat" @click="setDefaultValueCopReportExpiredDate()">Chưa đạt</label>
              </td>
            </tr> -->

            <tr>
              <td class="text-xs-center" style="font-weight: bold;"></td>
              <td class="text-xs-center" style="font-weight: bold;">
                {{getTextKetQuaCOP()}} 
                
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
                    v-model="detailCOP['copReportExpiredDate']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copReportExpiredDatePicker" no-title @input="menuCopReportExpiredDate = false; detailCOP['copReportExpiredDate'] = parseDate2(copReportExpiredDatePicker);" locale="vi"></v-date-picker>
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
                    v-model="detailCOP['copReportExpiredDate']"
                    persistent-hint
                    prepend-icon="event"
                    style="width: 50%;"
                    clearable
                  ></v-text-field>
                  <v-date-picker v-model="copReportExpiredDatePicker" no-title @input="menuCopReportExpiredDate = false; detailCOP['copReportExpiredDate'] = parseDate2(copReportExpiredDatePicker);" locale="vi"></v-date-picker>
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
               v-model="detailCOP['inspectionAuditCycle']"
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
               multi-line
               rows="3"
               v-model="detailCOP['ghi_chu_in_thong_bao']"
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
               v-model="detailCOP['valueTest']"
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
