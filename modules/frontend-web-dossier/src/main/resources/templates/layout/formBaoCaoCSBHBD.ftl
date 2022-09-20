<v-layout row wrap class="ml-0">
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
          v-model="detailCSBHBD['dang_kiem_vien_1']"
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
          v-model="detailCSBHBD['dang_kiem_vien_2']"
        ></v-select>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Số Báo cáo đánh giá:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCSBHBD['dossierNo']"
        ></v-text-field>
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Ngày kiểm tra (từ):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-menu
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
      </v-menu>
        <#--  <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCSBHBD['copReportDateFrom']"
        ></v-text-field>  -->
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label">Đến ngày:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <v-menu
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
      </v-menu>
        <#--  <v-text-field
          style="width: 60%;"
          class="my-0 py-0"
          v-model="detailCSBHBD['copReportDateTo']"
        ></v-text-field>  -->
      </v-flex>

      <v-flex xs12 sm3>
        <label class="content-label"> Loại hình đánh giá:&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm9>
        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaBS" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="BS">
        <label for="loaihinhDanhGiaBS"> Bổ sung (Additional audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaHN" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="HN">
        <label for="loaihinhDanhGiaHN"> Hàng năm (Annual audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaLD" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="LD">
        <label for="loaihinhDanhGiaLD"> Lần đầu (Initial audit)</label> <br>

        <input type="radio" name="loai_hinh_danh_gia" id="loaihinhDanhGiaDX" v-model="detailCSBHBD['loai_hinh_danh_gia']" value="DX">
        <label for="loaihinhDanhGiaDX"> Đột xuất (Occassional audit)</label>
      </v-flex>
      <v-flex xs12>
        <label class="content-label">1.1 Thông tin về cơ sở bảo hành, bảo dưỡng&nbsp;</label>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.1.1 Tên:&nbsp;</label>
          <v-text-field
            class="my-0 py-0"
            v-model="detailCSBHBD['ten_doanh_nghiep']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.1.2 Địa chỉ trụ sở chính:&nbsp;</label>
          <v-text-field
            class="my-0 py-0"
            v-model="detailCSBHBD['dia_chi_chinh_doanh_nghiep']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.1.3 Địa chỉ xưởng bảo hành, bảo dưỡng (địa chỉ kiểm tra):&nbsp;</label>
          <v-text-field
            class="my-0 py-0"
            v-model="detailCSBHBD['dia_chi_xuong']"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <label class="content-label">1.2 Thông tin về cơ sở sản xuất, lắp ráp, nhập khẩu ô tô(nếu có)&nbsp;</label>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">1.2.1 Loại hình:&nbsp;</label>
          <input type="radio" name="loai_hinh" id="loaihinhSX" v-model="detailCSBHBD['loai_hinh']" value="SX">
          <label for="loaihinhSX"> Doanh nghiệp sản xuất, lắp ráp</label> <br>

          <input type="radio" name="loai_hinh" id="loaihinhNK" v-model="detailCSBHBD['loai_hinh']" value="NK">
          <label for="loaihinhNK"> Doanh nghiệp nhập khẩu</label>
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
        <label class="content-label" id="kieuLoaiSanPham">1.3 Loại sản phẩm đánh giá (Product's types):&nbsp;</label>
      </v-flex>
      <v-flex xs12 sm12 class="pb-2">
        <table style="width: 100%;" border="1" class="ftable">
          <thead>
            <tr style="background: #d9d7d7;">
             <th class="text-xs-center">Loại sản phẩm</th>
             <th class="text-xs-center">Nhãn hiệu</th>
             <th class="text-xs-center">Tên thương mại</th>
             <th class="text-xs-center">Mã kiểu loại</th>
             <th class="text-xs-center">Mô tả chi tiết</th>
           </tr>
         </thead>
         <tbody>
           <tr id="gen_4_2_1_1" v-for="(item, index) in detailCSBHBD['loai_phuong_tien_bhbd']">
              <td class="text-xs-center py-1">{{item['loaiPhuongTien']}}</td>
              <td class="text-xs-center py-1">{{item['nhanHieu']}}</td>
              <td class="text-xs-center py-1">{{item['tenThuongMai']}}</td>
              <td class="text-xs-center py-1">{{item['maKieuLoai']}}</td>
              <td class="text-xs-center py-1"></td>
           </tr>
         </tbody>
       </table>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">2. Các nội dung cần bổ sung, sửa đổi:&nbsp;</label>
        </div>
      </v-flex>
      <v-flex xs12>
        <table class="table-basic" style="width:100%;">
          <tr>
            <th rowspan="2" style="	text-align: center;border: 0.5px solid;">STT</th>
            <th rowspan="2" style="	text-align: center;border: 0.5px solid;">Số mục</th>
            <th rowspan="2" style="	text-align: center;border: 0.5px solid;">Mô tả chi tiết</th>
            <th colspan="2" style="	text-align: center;border: 0.5px solid;">Đánh giá lại</th>
          </tr>
          <tr>
            <th  style="	text-align: center;border: 0.5px solid;">Ngày</th>
            <th  style="	text-align: center;border: 0.5px solid;">Kết luận</th>
          </tr>
          <tr v-for="(item, index) in detailCSBHBD['noiDungSuaDoi']">
            <td style="	text-align: center;border: 0.5px solid;">
              {{index + 1}}
            </td>
            <td style="	text-align: center;border: 0.5px solid;" v-html="item['noi_dung']">
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              {{item.mt_nd}}
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="item['ngay']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="item['ket_luan']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
          </tr>
        </table>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">3. Kết luận:&nbsp;</label>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label>Kết quả kiểm tra lần đầu:&nbsp;</label>
          <v-text-field
            v-model="detailCSBHBD['kl_lan_dau_kiem_tra']"
            class="my-0 py-0"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label>Kết quả kiểm tra lần cuối:&nbsp;</label>
          <v-text-field
            v-model="detailCSBHBD['kl_lan_cuoi_kiem_tra']"
            class="my-0 py-0"
          ></v-text-field>
        </div>
      </v-flex>
      <v-flex xs12>
        <div style="display: flex; align-items: center">
          <label class="content-label">4. Ký xác nhận:&nbsp;</label>
        </div>
      </v-flex>
      <v-flex xs12>
        <table class="table-basic" style="width:100%;">
          <tr>
            <th colspan="2" style="text-align: center;border: 0.5px solid;">4. Ký xác nhận</th>
            <th style="text-align: center;border: 0.5px solid;">Họ tên</th>
            <th style="text-align: center;border: 0.5px solid;">Chữ ký</th>
            <th style="text-align: center;border: 0.5px solid;">Ngày</th>
          </tr>
          <tr>
            <th colspan="2" style="	text-align: center;border: 0.5px solid;">Đại diện Cơ sở BHBD</th>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['ho_ten_dai_dien_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['chu_ky_dai_dien_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['ngay_ky_dai_dien_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td> 
          </tr>
          <tr>
            <th rowspan="2" style="	text-align: center;border: 0.5px solid;">Cục Đăng kiểm Việt Nam</th>
            <th style="	text-align: center;border: 0.5px solid;">Người kiểm tra</th>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['ho_ten_nguoi_kiem_tra_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['chu_ky_nguoi_kiem_tra_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['ngay_ky_nguoi_kiem_tra_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td> 
          </tr>
          <tr style="	text-align: center;border: 0.5px solid;">
            <th style="	text-align: center;border: 0.5px solid;">Xác nhận</th>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['ho_ten_xac_nhan_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['chu_ky_xac_nhan_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td>
            <td style="	text-align: center;border: 0.5px solid;">
              <v-text-field
                v-model="detailCSBHBD['ngay_ky_xac_nhan_CS_BHBD']"
                class="my-0 py-0"
              ></v-text-field>
            </td> 
          </tr>
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
          <tbody v-if="part1Active" :style="{'pointer-events': disabledPart1 ? 'none' : ''}" id="part1Active">
            <template v-for="(item, index) in part1CSBHBD" v-if="!item['items']">
              <tr>
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="3" class="pl-1" v-html="item['noi_dung']"></td>
              </tr>
            </template>
            <template v-else >
              <tr :style="{background: checkColorCop(detailCSBHBD[item['nd_result']])}">
                <td style="font-weight: bold;" class="text-xs-center">{{item['stt']}}</td>
                <td colspan="2" class="pl-1" v-html="item['noi_dung']"></td>
                <td :rowspan="item['items']['length'] + 1">
                  <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                    <input type="radio" :name="item['ky_hieu'] + '_result'" class="check_radio" :id="item['ky_hieu'] + '_result_' + (indexKq + 1)" :value="itemKq['value']" style="margin: 0 5px 0 0" v-model="detailCSBHBD[item['nd_result']]">
                    <label class="label-radio" :for="item['ky_hieu'] + '_result_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                  </div>
                </td>
              </tr>
              <tr v-for="(itemRd, indexRd) in item['items']" :style="{background: checkColorCop(detailCSBHBD[item['nd_result']])}">
                <td class="text-xs-center">
                  <input type="radio" class="tinh_diem" :name="item['ky_hieu']" :id="item['ky_hieu'] + indexRd" :value="itemRd['gia_tri']" v-model="detailCSBHBD[item['ky_hieu']]" @click="setPointFormCSBHBD(itemRd, indexRd, item['diem_nd'])">
                </td>
                <td class="pl-1" v-html="itemRd['noi_dung']"></td>
                <td :rowspan="item['items']['length']" v-if="indexRd === 0">
                  <v-text-field
                    v-model="detailCSBHBD[item['diem_nd']]"
                    class="my-0 py-0 px-2"
                  ></v-text-field>
                </td>
              </tr>
              <tr v-if="detailCSBHBD[item['nd_result']] !== 1 && detailCSBHBD[item['nd_result']] !== '1'">
                <td></td>
                <td class="mo-ta pb-1" colspan="3">
                  <span style="width: 47px;">Mô tả: </span>
                  <div style="width: calc(100% - 53px); float: right;">
                    <v-text-field
                      v-model="detailCSBHBD[item['mt_nd']]"
                      class="my-0 py-0"
                    ></v-text-field>
                  </div>
                </td>
              </tr>

              <tr v-if="detailCSBHBD[item['nd_result']] !== 1 && detailCSBHBD[item['nd_result']] !== '1'">
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
                              v-model="detailCSBHBD['ten_file_' + item['ky_hieu']]"
                              class="py-0 my-0"
                            ></v-text-field>
                          </v-flex>
                        </v-layout>
                      </v-flex>
                      <v-flex xs12 sm3 class="pl-2 pt-2">
                        <input type="file" :name="'chon-file_' + item['ky_hieu']" :id="'chon-file_' + item['ky_hieu']">
                      </v-flex>
                      <v-flex xs12 sm4>
                        <v-btn @click="uploadFileCop(item['ky_hieu'])" small>Xác nhận tải file</v-btn>
                      </v-flex>
                      <v-flex xs12 sm2 class="pt-1">
                        <span>Tài liệu đính kèm: </span>
                      </v-flex>
                      <v-flex xs12 sm10>
                        <div class="pb-1" v-for="(itemFile, indexFile) in detailCSBHBD['uploadfile_' + item['ky_hieu']]">
                          - <a :href="itemFile['fileUrl']" target="_blank"> {{itemFile['ten_file']}} </a>
                        </div>
                      </v-flex>
                    </v-layout>
                  </div>
                </td>
              </tr>
            </template>
          </tbody>
          <tbody v-if="part2Active" :style="{'pointer-events': disabledPart2 ? 'none' : ''}" id="part2Active">
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
                     <tr id="gen_4_2_1_1" v-for="(itemTb, indexTb) in detailCSBHBD['thiet_bi_xuat_xuong']" :key="  'thiet_bi_xuat_xuong' + index" :style="{background: checkColorCop(itemTb['nd_result'])}"
                      @click="toKetQuaKiemTraCSBHBD(itemTb, indexTb, item)"
                     >
                       <td class="text-xs-center" style="width: 3% !important;">
                         {{indexTb + 1}}
                       </td>                      
                       <td class="text-xs-center" style="width: 3% !important;">
                         {{itemTb['name']}}
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
                         {{itemTb['country']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         <span style="color: blue; cursor: pointer;">Kết quả kiểm tra</span>
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['temp']}}
                       </td>
                       <td style="width: 10% !important;" class="text-xs-center">
                         {{itemTb['status']}}
                       </td>
                       <td class="text-xs-center" style="width: 60px !important;">
                        <div v-for="(itemKq, indexKq) in kq" class="text-xs-center">
                          <input type="radio" :name="item['ky_hieu'] + '_result_' + indexTb" class="check_radio" :id="item['ky_hieu'] + '_result_' + (index + indexTb) + '_' + (indexKq + 1)" v-model="itemTb['nd_result']" :value="itemKq['value']" style="margin: 0 5px 0 0">
                          <label class="label-radio" :for="item['ky_hieu'] + '_result_' + index + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
                        </div>
                       </td>
                     </tr>
                     <tr>
                       <td></td>
                       <td class="mo-ta pb-1" colspan="9">
                        <span style="width: 47px;">Kết luận: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <input type="radio" name="kl_nd_8" id="kl_nd_8" value="1" v-model="detailCSBHBD['kl_nd_8']">
                          <label class="mr-3" for="kl_nd_8">Đạt</label>

                          <input type="radio" name="kl_nd_8" id="kl_nd_8" value="2" v-model="detailCSBHBD['kl_nd_8']">
                          <label for="kl_nd_8">Không đạt</label>
                        </div>
                      </td>
                     </tr>
                     <tr v-if="detailCSBHBD['kl_nd_8'] !== 1 && detailCSBHBD['kl_nd_8'] !== '1'">
                       <td></td>
                       <td class="mo-ta pb-1" colspan="9">
                        <span style="width: 47px;">Mô tả: </span>
                        <div style="width: calc(100% - 53px); float: right;">
                          <v-text-field
                          v-model="detailCSBHBD['mt_nd_8']"
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
          </tbody>
          <tbody v-if="part5Active" :style="{'pointer-events': disabledPart5 ? 'none' : ''}" id="part5Active">
            <#-- mục 8. => 10. -->
            <tr>
              <td><strong>9</strong></td>
              <td colspan="3">Các ghi nhận đánh giá khác (nếu có)</td>
            </tr>
            <tr>
              <td></td>
              <td colspan="3">
                <div v-for="(item8, index8) in detailCSBHBD['nd_9_result']">
                  <span>{{item8.text}}</span>
                  <v-text-field
                    v-model="item8.value"
                    class="my-0 py-0"
                  ></v-text-field>
                </div>
              </td>
            </tr>
            <#--  mục 9  -->
            <tr>
              <td><strong>10</strong></td>
              <td colspan="3">Các nội dung kiểm tra khác</td>
            </tr>
            <tr>
              <td></td>
              <td colspan="3">
                  <textarea rows='5' v-model="detailCSBHBD['nd_10_result']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                  </textarea>
              </td>
            </tr>
            <#--  mục 10  -->
            <tr>
              <td><strong>11</strong></td>
              <td colspan="3">Các khuyến cáo (nếu có)</td>
            </tr>
            <tr>
              <td></td>
              <td colspan="3">
                  <textarea rows='5' v-model="detailCSBHBD['nd_11_result']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                  </textarea>
              </td>
            </tr>
            <#--  mục 11  -->
            <tr>
              <td><strong>12</strong></td>
              <td colspan="3">Ghi chú</td>
            </tr>
            <tr>
              <td></td>
              <td colspan="3">
                  <textarea rows='5' v-model="detailCSBHBD['nd_12_result']" style="width: 100%; border-bottom: 1px solid #111;">
                    
                  </textarea>
              </td>
            </tr>
          </tbody>
        </table>
      </v-flex>
    </v-layout>
  </div>
    </v-flex>
  </v-layout>
