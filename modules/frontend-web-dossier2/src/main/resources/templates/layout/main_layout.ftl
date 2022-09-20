  <!-- TODO paymentViewJX template one page -->
  <div id="dossierViewJX_form_template" class="hidden">
    <div class="jx-content-wrap">
  
			<v-dialog v-model="popUpChiTietKiemKe" persistent fullscreen hide-overlay transition="dialog-bottom-transition">
				<v-card>
					<v-toolbar dark color="primary" height="50">
						<div class="text-bold">Chi tiết kiểm kê</div>
						<v-spacer></v-spacer>
						<v-toolbar-items>
							<v-btn icon dark @click.native="popUpChiTietKiemKe = false">
								<v-icon>close</v-icon>
							</v-btn>
						</v-toolbar-items>
					</v-toolbar>
					<v-card-text class="pt-0">
						
					</v-card-text>
				</v-card>
			</v-dialog>

      <#-- <v-dialog v-model="dialogTSKT" persistent fullscreen hide-overlay transition="dialog-bottom-transition">
        <v-card>
          <v-card-title class="text-xs-center" style="height: 63px; background: #2C4577; color: #fff; font-size: 20px;">
            THÔNG SỐ KỸ THUẬT {{tenModuleTSKT}}
            <v-btn dark icon style="position: absolute !important; right: 19px;" class="mx-0 my-0 btn-close-dialog-tskt" v-on:click.native="closeDialogTSKT()">
              <v-icon>clear</v-icon>
            </v-btn>
          </v-card-title>
          <div style="max-height: 690px; overflow: auto;" v-if="dialogTSKT">
            
            <v-progress-linear v-if="loadingDialog" :indeterminate="true"></v-progress-linear>

            <div>
               <#include "thong_so_ky_thuat_popup.ftl">
            </div>

          </div>
        </v-card>
      </v-dialog> -->

      <v-dialog v-model="popUpNhap_Xuat_DieuChuyen" persistent fullscreen transition="dialog-bottom-transition" :overlay=false>
        <v-card>
          <v-toolbar dark color="primary" height="50" class="mb-0">
            <v-btn icon @click.native="popUpNhap_Xuat_DieuChuyen = false" dark>
              <v-icon>close</v-icon>
            </v-btn>
            <v-toolbar-title style="font-size: 117%;">
              <span v-if="stateAddPhieu === 'phieu_hong'">Phiếu hỏng, gửi Cảnh sát</span>
              <span v-if="stateAddPhieu === 'dieu_chuyen'">Phiếu điều chuyển</span>
              <span v-else-if="stateAddPhieu === 'xuat_kho'">Phiếu xuất kho</span>
              <span v-else>Phiếu nhập kho</span>
            </v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn dark flat @click.native="popUpNhap_Xuat_DieuChuyen = false">Thoát</v-btn>
              <!-- <v-btn dark flat @click.native="luuPhieu()">Lưu phiếu</v-btn> -->
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text class="pt-0">
            <v-container grid-list-md>
              <v-layout row wrap v-if="stateAddPhieu === 'nhap_kho'">
                <#include "popUpNhapKho.ftl">
              </v-layout>

              <v-layout row wrap v-else-if="stateAddPhieu === 'xuat_kho'">
                <#include "popUpXuatKho.ftl">
              </v-layout>

              <v-layout row wrap v-else>
                <#include "popUpDieuChuyen.ftl">
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpVrInventoryReport" persistent fullscreen transition="dialog-bottom-transition" :overlay=false>
        <v-card>
          <v-toolbar dark color="primary" height="50" class="mb-0">
            <v-btn icon @click.native="popUpVrInventoryReport = false" dark>
              <v-icon>close</v-icon>
            </v-btn>
            <v-toolbar-title style="font-size: 117%;">
              <span>Kiểm kê phiếu</span>
            </v-toolbar-title>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn dark flat @click.native="popUpVrInventoryReport = false">Thoát</v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text class="pt-0">
            <v-container grid-list-md>
              <v-layout row wrap>
                <#include "popupKiemKe.ftl">
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpHistoryDossierPart" persistent max-width="850px;">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">{{titleHistory}}</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpHistoryDossierPart = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <div>
              <v-layout wrap>
                <v-flex xs12 sm12 class="text-cs-right">
                  <div id="formHistory">
                    
                  </div>
                  <div style="width: 100%;" class="text-xs-center" v-if="!urlPdfHistory">
                     <v-progress-circular indeterminate v-bind:size="70" v-bind:width="2" color="purple"></v-progress-circular> <br>
                     Đang tải dữ liệu
                  </div>
                  <div v-else>
                    <object :data="urlPdfHistory" type="application/pdf" style="width:100%; height:550px;">
                      <embed :src="urlPdfHistory" type="application/pdf" />
                    </object>
                  </div>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="success" @click="popUpHistoryDossierPart = false">Quay lại</v-btn>
                </v-flex>
              </v-layout>
            </div>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpViewFormBanKhai" persistent max-width="600px;">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">{{partNameForm}}</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpViewFormBanKhai = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <v-container grid-list-md>
              <v-layout wrap>
                <v-flex xs12 sm12 class="text-cs-right">
                  <div id="viewFormBanKhai">
                    
                  </div>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="success" @click="popUpViewFormBanKhai = false">Quay lại</v-btn>
                </v-flex>
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="dialogAlert" persistent max-width="250px" style="width: 290px !important; max-width: 290px !important">
        <v-card style="">
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Thông báo</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <#-- <v-btn icon dark @click.native="dialogAlert = false">
                <v-icon>close</v-icon>
              </v-btn> -->
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text style="">
            <v-layout wrap>
              <v-flex xs12 sm12 class="text-cs-center">
                <span :style="{color: colorAlert}">{{alertMessage}}</span>
              </v-flex>
              <v-flex xs12 sm12>
              </v-flex>
            </v-layout>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpkieuLoaiXe" persistent max-width="850px;">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Biên bản kiểm tra</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpkieuLoaiXe = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <v-container grid-list-md>
              <v-layout wrap>
                <v-flex xs12 sm12 class="text-cs-right">
                  <#include "kieuLoaiXe.ftl">
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="success" @click="xacNhanKieuLoaiXe()">Đồng ý</v-btn>
                  <v-btn small color="success" @click="popUpkieuLoaiXe = false">Quay lại</v-btn>
                </v-flex>
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpThietBiCOP" persistent max-width="850px;">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Biên bản {{labelMauCOP}}</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpThietBiCOP = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <div>
              <v-layout wrap>
                <#-- <v-flex xs12 sm12 class="text-cs-right" v-if="statePopupCOP === 'MAU_1'">
                  <#include "thietBiCOP_Mau1.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_2'">
                  <#include "thietBiCOP_Mau2.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_3'">
                  <#include "thietBiCOP_Mau3.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_4'">
                  <#include "thietBiCOP_Mau4.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_5'">
                  <#include "thietBiCOP_Mau5.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_6'">
                  <#include "thietBiCOP_Mau6.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_7'">
                  <#include "thietBiCOP_Mau7.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_8'">
                  <#include "thietBiCOP_Mau8.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_9'">
                  <#include "thietBiCOP_Mau9.ftl">
                </v-flex> -->
                <v-flex xs12 sm12 class="text-cs-right">
                  <#include "thietBiCOP_MauChung.ftl">
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="primary" @click="xacNhanCOP(indexThietBi)">Đồng ý</v-btn>
                  <v-btn small @click="popUpThietBiCOP = false">Quay lại</v-btn>
                </v-flex>
              </v-layout>
            </div>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpBienBanKiemTraGS" persistent max-width="850px;">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">
              <label v-if="stateKiemTraDotXuat === -1"> Biên bản kiểm tra giám sát</label>
              <label v-else> Biên bản kiểm tra đột xuất</label>
            </div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpBienBanKiemTraGS = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <div>
              <v-layout wrap>
                <v-flex xs12 sm12 class="text-cs-right" v-if="stateKiemTraDotXuat === -1">
                  <#include "popupBienBanKiemTraGS.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else>
                  <#include "popupBienBanKiemTraDotXuat.ftl">
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="primary" :disabled="disabledXacNhanBBKtraGS" @click="xacNhanBBKiemTraGSKT()">Đồng ý</v-btn>
                  <v-btn small @click="popUpBienBanKiemTraGS = false">Quay lại</v-btn>
                </v-flex>
              </v-layout>
            </div>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpThietBiXuatXuongCSBHBD" persistent max-width="850px;">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Biên bản {{labelMauCOP}}</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpThietBiXuatXuongCSBHBD = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <div>
              <v-layout wrap>
                <#-- <v-flex xs12 sm12 class="text-cs-right" v-if="statePopupCOP === 'MAU_1'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau1.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_2'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau1.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_3'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau3.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_4'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau4.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_5'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau5.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_6'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau6.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_7'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau7.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_8'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau8.ftl">
                </v-flex>
                <v-flex xs12 sm12 class="text-cs-right" v-else-if="statePopupCOP === 'MAU_9'">
                  <#include "thiet_bi_xuat_xuong_CSBHBD_Mau9.ftl">
                </v-flex> -->
                <v-flex xs12 sm12 class="text-cs-right">
                  <#include "thietBiBHBD_MauChung.ftl">
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="primary" @click="xacNhanCSBHBD()">Đồng ý</v-btn>
                  <v-btn small @click="popUpThietBiXuatXuongCSBHBD = false">Quay lại</v-btn>
                </v-flex>
              </v-layout>
            </div>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpChiTietPhieu" persistent max-width="950px">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Chi tiết phiếu</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpChiTietPhieu = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text>
            <v-container grid-list-md>
              <v-layout wrap>
                <!-- <v-flex xs12 sm12>
                  <v-layout row wrap>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">CSSX: </label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ thongTinPhieu.coSoSanXuat }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Nhà máy sản xuất</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ thongTinPhieu.nhaMaySanXuat }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Giấy chứng nhận</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.giayChungNhan }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Loại phương tiện</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.loaiPhuongTien }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Nhãn hiệu</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.nhanHieu }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Số loại</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.soLoai }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">Xuất xưởng từ ngày</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.tuNgay }}</span>
                    </v-flex>
                    <v-flex xs12 sm3 class="text-xs-right">
                      <label class="pt-2">đến ngày</label>
                    </v-flex>
                    <v-flex xs12 sm9>
                      <span class="pt-2">{{ chiTietGCNModel.denNgay }}</span>
                    </v-flex>
                  </v-layout>
                </v-flex>
                <v-flex xs12 sm12>
                  <div id="chiTietPhieuTable"></div>
                </v-flex> -->
                <v-flex xs12 sm12 class="text-cs-right">
                  <span style="color: blue;" v-if="stateNumberSerial === 3">Thừa</span>
                  <span style="color: blue;" v-else-if="stateNumberSerial === 2">Đủ</span>
                  <span style="color: blue;" v-else>Thiếu</span>
                </v-flex>
                <v-flex xs12 sm12>
                  <div id="dsSoSerial"></div>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="success" @click="saveSoSerial()">Lưu lại</v-btn>
                </v-flex>
              </v-layout>
            </v-container>
          </v-card-text>
        </v-card>
      </v-dialog>


      <v-dialog v-model="dialogCheckRole" persistent max-width="800px">
            <v-card>
               <v-toolbar dark color="primary" height="50">
                  <div class="text-bold">Chi tiết phân quyền</div>
                  <v-spacer></v-spacer>
                  <v-toolbar-items>
                     <v-btn icon dark @click.native="dialogCheckRole = false">
                        <v-icon>close</v-icon>
                     </v-btn>
                  </v-toolbar-items>
               </v-toolbar>
               <v-card-text class="py-0 px-1">
                  <v-container grid-list-md>
                     <v-layout wrap>
                        <v-flex xs12 sm12 style="height: 500px; overflow: auto;">
                         <table class="table-basic" border="1" style="width:100%;">
                           <thead>
                              <tr style="background: #14BEF0; color: #fff;">
                                 <th class="text-xs-center pl-1" style="">
                                    <label>
                                       Phân quyền ký <br>
                                       chứng chỉ
                                    </label>
                                 </th>
                                 <th class="text-xs-left pl-1">
                                    <label>{{itemSelectUserRole['title'] || ''}}</label> <br>
                                    <label>{{itemSelectUserRole['fullName'] || ''}}</label> <br>
                                    <label>{{itemSelectUserRole['email'] || ''}}</label> <br>
                                 </th>
                              </tr>
                           </thead>

                           <tbody>
                              <tr v-for="(itemClass, indexClass) in listClass">
                                 <td class="text-xs-left pl-1 py-2" v-if="itemClass['level'] == 1">
                                    {{itemClass['processName']}}
                                 </td>
                                 <td class="text-xs-left pl-1 py-2" v-else-if="itemClass['level'] == 2" style="padding-left: 20px!important;">
                                    {{itemClass['itemName']}}
                                 </td>
                                 <td class="text-xs-center" v-if="itemClass['level'] == 1 && itemClass['dictitem'].length != 0">
                                 </td>
                                 <td class="text-xs-center" :id="itemClass['serviceProcessId']" v-else>
                                    <input v-if="itemClass['level'] == 2" :id="itemClass['itemCode'] + '_' + indexClass" type="checkbox" @change="selectPhanQuyen(itemClass, itemSelectUserRole, $event)" :checked="itemClass['mappingUserIds'] && itemClass['mappingUserIds'].includes(itemSelectUserRole['mappingUserId'])">
                                    <input v-else-if="itemClass['level'] == 1" :id="itemClass['processNo']" type="checkbox" @change="selectPhanQuyen(itemClass, itemSelectUserRole, $event)" :checked="itemClass['mappingUserIds'] && itemClass['mappingUserIds'].includes(itemSelectUserRole['mappingUserId'])">
                                    <#-- <v-checkbox v-model="itemSelectUserRole['listClass'][indexClass]['isChecked']"></v-checkbox> -->
                                 </td>
                              </tr>
                           </tbody>
                         </table>
                        </v-flex>

                        <v-flex xs12 sm12 class="mt-3 text-xs-center mb-2">
                           <v-btn color="primary" small @click="saveRoleUser()"><v-icon>save</v-icon> Đồng ý</v-btn>
                           <v-btn color="primary" small @click="dialogCheckRole = false"> Hủy bỏ</v-btn>
                        </v-flex>
                     </v-layout>
                  </v-container>
               </v-card-text>
            </v-card>
         </v-dialog>

      <v-dialog v-model="popUpAddKiemKe" persistent max-width="800px">
            <v-card>
               <v-toolbar dark color="primary" height="50">
                  <div class="text-bold">Kiểm kê phiếu</div>
                  <v-spacer></v-spacer>
                  <v-toolbar-items>
                     <v-btn icon dark @click.native="popUpAddKiemKe = false">
                        <v-icon>close</v-icon>
                     </v-btn>
                  </v-toolbar-items>
               </v-toolbar>
               <v-card-text class="py-0">
                  <v-container grid-list-md>
                     <v-layout wrap>

                        <v-flex xs12 sm2 class="text-xs-right py-0">
                           <label class="pt-2">Đối tượng</label>
                        </v-flex>
                        <v-flex xs12 sm4 class="py-0">
                           <v-select
                           :items="doiTuongPhieuItems"
                           item-text="itemName"
                           item-value="itemCode"
                           clearable
                           autocomplete
                           v-model="detailAnChi['vehicleClass']"
                           class="pt-0"
                           ></v-select>
                        </v-flex>

                        <v-flex xs12 sm12>
                        </v-flex>

                        <v-flex xs12 sm2 class="text-xs-right py-0">
                           <label class="pt-2">Số serial</label>
                        </v-flex>
                        <v-flex xs12 sm4 class="py-0">
                           <v-text-field
                           v-model="detailAnChi['stampShortNo']"
                           class="pt-0"
                           clearable
                           ></v-text-field>

                        </v-flex>

                        <v-flex xs12 sm2 class="text-xs-right py-0">
                           <label class="pt-2">Số lượng</label>
                        </v-flex>
                        <v-flex xs12 sm4 class="py-0">
                           <v-text-field
                           @keyup.enter="calSoLuongKiemKe()"
                           v-model="detailAnChi['totalQuantities']"
                           class="pt-0"
                           clearable
                           ></v-text-field>
                        </v-flex>
                        
                        <v-flex xs12 sm2 class="text-xs-right py-0">
                           <label class="pt-2">Từ số</label>
                        </v-flex>
                        <v-flex xs12 sm4 class="py-0">
                           <v-text-field
                           @keyup.enter="calSoLuongKiemKe()"
                           v-model="detailAnChi['serialStartNo']"
                           class="pt-0"
                           clearable
                           ></v-text-field>
                        </v-flex>
                        
                        <v-flex xs12 sm2 class="text-xs-right py-0">
                           <label class="pt-2">Đến số</label>
                        </v-flex>

                        <v-flex xs12 sm4 class="py-0">
                           <v-text-field
                           @keyup.enter="calSoLuongKiemKe()"
                           v-model="detailAnChi['serialEndNo']"
                           class="pt-0"
                           clearable
                           ></v-text-field>
                        </v-flex>

                        <v-flex xs12 sm12 class="mt-3 text-xs-center mb-2">
                           <v-btn color="primary" small @click="addPhieuKiemKe()"><v-icon>add</v-icon> Thêm</v-btn>
                           <v-btn color="primary" small @click="popUpAddKiemKe = false"> Hủy bỏ</v-btn>
                        </v-flex>
                     </v-layout>
                  </v-container>
               </v-card-text>
            </v-card>
         </v-dialog>

      <v-dialog v-model="popUpAddPhieu" persistent max-width="800px">
				<v-card>
					<v-toolbar dark color="primary" height="50">
						<div class="text-bold">Kê khai phiếu</div>
						<v-spacer></v-spacer>
						<v-toolbar-items>
							<v-btn icon dark @click.native="popUpAddPhieu = false">
								<v-icon>close</v-icon>
							</v-btn>
						</v-toolbar-items>
					</v-toolbar>
					<v-card-text class="py-0">
						<v-container grid-list-md>
							<v-layout wrap>
								<v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Số serial</label>
								</v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    v-if="stateAddPhieu === 'nhap_kho'"
                    v-model="detailAnChi['stampShortNo']"
                    class="pt-0"
                    clearable
                  ></v-text-field>

                  <v-select
                    v-else
                    @input="bindStamp()"
                    :items="phieuConItems"
                    item-text="stampShortNoText"
                    item-value="bookId"
                    clearable
                    return-object
                    autocomplete
                    v-model="stampBook"
                    class="pt-0"
                  ></v-select>
               </v-flex>

               <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Số lượng</label>
               </v-flex>
               <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                  @keyup.enter="bindSLWarning()"
                  v-model="detailAnChi['subTotalInDocument']"
                  clearable
                  class="pt-0"
                  ></v-text-field>
               </v-flex>
               <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Từ số</label>
               </v-flex>
               <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                  @keyup.enter="bindSLWarning()"
                  v-model="detailAnChi['serialStartNo']"
                  class="pt-0"
                  clearable
                  ></v-text-field>
               </v-flex>
               <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Đến số</label>
               </v-flex>
               <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                  @keyup.enter="bindSLWarning()"
                  v-model="detailAnChi['serialEndNo']"
                  class="pt-0"
                  clearable
                  ></v-text-field>
               </v-flex>
                
                <v-flex xs12 sm12 class="mt-3 text-xs-center mb-2">
                  <v-btn color="primary" small @click="addPhieu()"><v-icon>add</v-icon> Thêm</v-btn>

                  <#-- <v-btn color="primary" small @click="addPhieuXuat()" v-if="stateAddPhieu === 'xuat_kho'"><v-icon>add</v-icon> Thêm</v-btn>

                  <v-btn color="primary" small @click="addPhieuDieuChuyen()" v-if="stateAddPhieu === 'dieu_chuyen'"><v-icon>add</v-icon> Thêm</v-btn> -->
                  <v-btn color="primary" small @click="popUpAddPhieu = false"> Hủy bỏ</v-btn>
                </v-flex>
							</v-layout>
						</v-container>
					</v-card-text>
				</v-card>
			</v-dialog>

      <v-dialog v-model="popUpPhieuXX" persistent max-width="800px">
        <v-card>
          <v-toolbar dark color="primary" height="50">
						<div class="text-bold">Phiếu xuất xưởng</div>
						<v-spacer></v-spacer>
						<v-toolbar-items>
							<v-btn icon dark @click.native="popUpPhieuXX = false">
								<v-icon>close</v-icon>
							</v-btn>
						</v-toolbar-items>
					</v-toolbar>
          <v-card-text class="py-0">
            <object data="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" style="width:100%; height:500px;">
              <embed src="https://www.w3docs.com/uploads/media/default/0001/01/540cb75550adf33f281f29132dddd14fded85bfc.pdf" type="application/pdf" />
            </object>
          </v-card-text>
        </v-card>
      </v-dialog>


      <v-dialog v-model="popUpDsXeCapPhieu" persistent max-width="900px">
        <v-card>
          <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Danh sách xe</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpDsXeCapPhieu = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar>
          <v-card-text class="py-0">
            <div id="dsXePopUpCapPhieu" class="pb-2">
              
            </div>
          </v-card-text>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpPhoiXCG" persistent>
        <div id="dialog-cauhinh" oncontextmenu="return false;" style="width: 100%;background: #fff;position: relative;">
          <div id="nav-filter" style="position: absolute;top: 64px;right: 0; width: 280px;height: calc(100% - 64px); background-color: #fff; box-shadow: -3px 6px 16px #888888;">
            <div style="width: 87%;padding: 10px;">
              <input id="input-label" style="width: 100%;height: 30px; border-radius: 5px;border: 1px solid;padding: 2px 10px;" type="" name="">

            </div>
            <hr>
            <div id="list-label" style="width: 100%; box-sizing: border-box;">
              <div v-for="(item, index) in listLabelTemp" v-bind:key="index" style="width: 100%; height: 30px; padding: 5px;display: flex;align-items: center;justify-content: space-between;border-bottom: 1px solid;box-sizing: border-box;">
                <span>{{item.name}}</span>
                <i class="fa fa-plus" aria-hidden="true" style="color: #2196f3;" @click="addLabel(item.name)"></i>
              </div>
            </div>
          </div>
          <div style="width: 100%;">
            <div style="width: 100%;background: #2196f3;color: #fff; height: 64px; line-height: 64px; display: flex; justify-content: space-between; box-shadow: 0px 2px 4px -1px rgba(0,0,0,0.2), 0px 4px 5px 0px rgba(0,0,0,0.14), 0px 1px 10px 0px rgba(0,0,0,0.12); padding: 0 15px;">
              <div>
                <button id="btn-close-cauhinh" style="width: 36px; height: 36px; color: #fff; font-weight: bold; background: none; border: none; cursor: pointer;"  @click="popUpPhoiXCG = false">X</button>
                <strong style="font-size: 25px; margin-left: 20px;font-family: 'Roboto', sans-serif;">Cấu hình phôi</strong>
              </div>
              
              <div style="padding-right: 61px;">
                <v-btn color="primary">Lưu lại</v-btn>
              </div>
            </div>
            <div style="width: 100%;height: 700px;overflow: auto;" >
              <div id="page" style="width: 21cm;min-height: 29.7cm;margin: 1cm auto;border: 1px #D3D3D3 solid;">
                <div id="printTraCuu" style="background-size: cover;height: 297mm;width: 210mm;margin-left: auto;margin-right: auto;position: relative;">
                  
                </div>
              </div>
            </div>
          </div>
        </div>
      </v-dialog>
      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'tra_cuu_hoso' && !detailPage">

          <#include "tra_cuu_hoso.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'tra_cuu_phuong_tien' && !detailPage">

          <#include "tra_cuu_phuong_tien.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'tra_cuu_phuong_tien_2' && !detailPage">

          <#include "tra_cuu_phuong_tien_2.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'tra_cuu_thongke' && !detailPage">

          <#include "tra_cuu_thong_ke.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'thong_ke_chuyen_doi_du_lieu' && !detailPage">

          <#include "thong_ke_chuyen_doi_du_lieu.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'doanh_nghiep_trong_nuoc' && !detailPage">

          <#include "tra_cuu_thong_tin_doanh_nghiep.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'co_so_nuoc_ngoai' && !detailPage ">

          <#include "dsCoSoNuocNgoai.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'quan_ly_pxx' && !detailPage">

          <#include "quanly_pxx.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'kiemKeThucTe' && !detailPage">

          <#include "kiemKePhieuXX.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'phanQuyenQuanLy' && !detailPage">

          <#include "phanQuyenCanBo.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'quanLyYeuCauSuaDoiSerial' && !detailPage">

          <#include "qlycSuaDoiSerial.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'ds_nhap_kho' && !detailPage">

          <#include "dsNhapKho.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'ds_xuat_kho' && !detailPage">

          <#include "dsXuatKho.ftl">

        </div>

        <div class="layout wrap" v-else-if="(stageFilterView === 'ds_dieu_chuyen' || stageFilterView === 'ds_phieu_hong') && !detailPage">

          <#include "dsDieuChuyen.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'in_ket_qua' && !detailPage">

          <#include "inKetQua.ftl">

        </div>
        

        <div class="layout wrap" v-else-if="!detailPage && stageFilterView !== 'danh_sach_xe_da_xuat_xuong'  && stageFilterView !== 'thong_so_ky_thuat'  && stageFilterView !== 'danh_sach_an_chi_da_cap_phat'   && stageFilterView !== 'chi_tiet_an_chi_da_cap_phat'  && stageFilterView !== 'danh_xe_cho_in_phieu'">

          <#include "danh_sach_hoso.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
          <div class="layout wrap" v-if="detailPage && stageFilterView === 'doanh_nghiep_trong_nuoc'">

            <#include "regist_detail.ftl">

          </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
          <div class="layout wrap" v-if="detailPage && stageFilterView === 'thong_so_ky_thuat_popup'">

            <#include "thong_so_ky_thuat_popup.ftl">

          </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="detailPage && stageFilterView === 'co_so_nuoc_ngoai'">
          <#include "addCoSoNuocNgoai.ftl">
        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="detailPage && stageFilterView !== 'doanh_nghiep_trong_nuoc' && stageFilterView !== 'co_so_nuoc_ngoai' && stageFilterView !== 'quan_ly_pxx' && stageFilterView !== 'ds_nhap_kho' && stageFilterView !== 'ds_xuat_kho' && stageFilterView !== 'danh_sach_xe_da_xuat_xuong' && stageFilterView !== 'in_ket_qua' && stageFilterView !== 'thong_so_ky_thuat' && stageFilterView !== 'thong_so_ky_thuat_popup'  && stageFilterView !== 'danh_sach_an_chi_da_cap_phat'  && stageFilterView !== 'chi_tiet_an_chi_da_cap_phat' && stageFilterView !== 'danh_xe_cho_in_phieu'">

          <#include "dossier_detail.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'danh_sach_xe_da_xuat_xuong'">

          <#include "danh_sach_xe_da_xuat_xuong.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'thong_so_ky_thuat'">

          <#include "thong_so_ky_thuat.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'danh_sach_an_chi_da_cap_phat'">

          <#include "danh_sach_an_chi_cap_phat.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'chi_tiet_an_chi_da_cap_phat'">

          <#include "chi_tiet_an_chi_da_cap_phat.ftl">

        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="stageFilterView === 'danh_xe_cho_in_phieu'">

          <#include "danh_sach_xe_cho_in_phieu.ftl">

        </div>
      </v-slide-x-transition>

      <v-fab-transition>
        <div>
          <v-btn color="primary" dark fixed bottom right fab ripple v-show="offsetTop > 300"
             v-on:click.native="onScrollTop">
             <v-icon>keyboard_arrow_up</v-icon>
          </v-btn>

          <v-btn color="primary" dark fixed top right fab ripple v-show="offsetTop < 300"
          v-on:click.native="onScrollBottom">
            <v-icon>keyboard_arrow_down</v-icon>
          </v-btn>
        </div>
      </v-fab-transition>

    </div>
  </div>
