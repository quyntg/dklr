  <!-- TODO paymentViewJX template one page -->
  <div id="dossierViewJX_form_template" class="hidden">
    <div class="jx-content-wrap">
  
			<v-dialog v-model="popUpChiTietKiemKe" persistent max-width="800px">
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
						<v-container grid-list-md>
							<v-layout wrap>
								<v-flex xs12 sm12>
                  <table class="table table-bordered">
                    <thead style="border-top: 1px solid #ecdbdb;">
                      <tr>
                        <th rowspan="2">Mã hàng</th>
                        <th rowspan="2">Tên hàng</th>
                        <th rowspan="2">DVT</th>
                        <th colspan="3">
                          Số lượng
                        </th>
                        <th rowspan="2" class="text-xs-center">
                          Xử lý
                        </th>
                      </tr>
                      <tr>
                        <th>
                          Theo số kế toán
                        </th>
                        <th>
                          Theo kiểm kê
                        </th>
                        <th>
                          Chênh lệch
                        </th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr v-for="(item, index) in chiTietKiemKeItems" :key="index">
                        <td style="padding: 8px;" class="text-xs-left">{{item.maHang}}</td>
                        <td style="padding: 8px;" class="text-xs-left">{{item.tenHang}}</td>
                        <td style="padding: 8px;" class="text-xs-left">{{item.dvt}}</td>
                        <td style="padding: 8px;" class="text-xs-right"><span :style="{'color': item.theoSoKeToan < 0 ? 'red' : ''}">{{Math.abs(item.theoSoKeToan)}}</span></td>
                        <td style="padding: 8px;" class="text-xs-right"><span :style="{'color': item.theoKiemKe < 0 ? 'red' : ''}">{{Math.abs(item.theoKiemKe)}}</span></td>
                        <td style="padding: 8px;" class="text-xs-right"><span :style="{'color': item.chenhLech < 0 ? 'red' : ''}">{{Math.abs(item.chenhLech)}}</span></td>
                        <td style="padding: 8px;" class="text-xs-right">{{item.xuLy}}</td>
                      </tr>
                      <tr>
                        <td style="padding: 8px; text-decoration: underline;">
                          Số dòng: {{chiTietKiemKeItems.length}}
                        </td>
                        <td colspan="2">

                        </td>
                        <td style="padding: 8px;" class="text-xs-right">
                          <span class="text-bold" :style="{'color': chiTietKiemKeModel.theoSoKeToan < 0 ? 'red' : ''}">{{Math.abs(chiTietKiemKeModel.theoSoKeToan)}}</span>
                        </td>
                        <td style="padding: 8px;" class="text-xs-right">
                          <span class="text-bold" :style="{'color': chiTietKiemKeModel.theoKiemKe < 0 ? 'red' : ''}">{{Math.abs(chiTietKiemKeModel.theoKiemKe)}}</span>
                        </td>
                        <td style="padding: 8px;" class="text-xs-right">
                          <span class="text-bold" :style="{'color': chiTietKiemKeModel.chenhLech < 0 ? 'red' : ''}">{{Math.abs(chiTietKiemKeModel.chenhLech)}}</span>
                        </td>
                        <td>
                        </td>
                      </tr>
                    </tbody>
                  </table>
								</v-flex>
							</v-layout>
						</v-container>
					</v-card-text>
				</v-card>
			</v-dialog>

      <v-dialog v-model="dialogTSKT" persistent fullscreen hide-overlay transition="dialog-bottom-transition">
        <v-card>
          <v-card-title class="" style="height: 63px; background: #2C4577; color: #fff; font-size: 20px; position: relative;">
            Thông số kỹ thuật
            <v-btn dark icon style="position: absolute; right: 19px;" class="mx-0 my-0" v-on:click.native="closeDialogTSKT()">
              <v-icon>clear</v-icon>
            </v-btn>
          </v-card-title>
          <div style="max-height: 690px; overflow: auto;" v-if="dialogTSKT">
            <style>
              div.lv-one {
                  width: 95%;
                  margin: auto;
                  border-left: 1px #e9e9e9 solid;
                  border-right: 1px #e9e9e9 solid;
                  border-top: 0px;
              }

              .lv-one > .lv-content > div:nth-child(odd) {
                  background-color: #fafafa;
              }

              div.top-bb, .top-bb-header, .top-bb-content {
                  border: 0 !important;
              }
              div.top-bb {
                  width: 85%;
                  margin: auto;
                  border: 1px #e9e9e9 solid;
                  border-bottom: 0px;
              }

              .top-bb div.top-bb-header, .top-bb div.top-bb-title, .top-bb div.top-bb-left, .top-bb div.top-bb-right, .top-bb div.top-bb-ndtd-left, .top-bb div.top-bb-ndtd-mid, .top-bb div.top-bb-ndtd-right {
                  padding: 5px;
                  overflow: visible;
                  border-top: 1px solid #e9e9e9;
                  border-bottom: 0px solid #e9e9e9;
              }
              .top-bb-title {
                  margin-top: 15px;
              }
              .top-bb-title {
                  border: 1px solid black !important;
                  border-width: 1px 1px 0 !important;
              }
              .top-bb div.top-bb-title {
                  font-weight: bold;
              }
              .top-bb div.top-bb-ndtd-left {
                  width: 30%;
                  float: left;
                  font-weight: bold;
                  -webkit-justify-content: center;
                  justify-content: center;
              }
              .top-bb div.top-bb-ndtd-mid {
                  width: 26%;
                  float: left;
                  border-left: 1px solid #e9e9e9;
                  font-weight: bold;
                  -webkit-justify-content: center;
                  justify-content: center;
              }
              .top-bb div.top-bb-ndtd-right {
                  width: 18%;
                  float: right;
                  border-left: 1px solid #e9e9e9;
                  font-weight: bold;
                  -webkit-justify-content: center;
                  justify-content: center;
              }
              div[class*="top-bb"] {
                  overflow: visible;
                  display: -webkit-box;
                  display: flex;
                  -webkit-flex-wrap: wrap;
                  flex-wrap: wrap;
                  width: 100%;
              }

              .top-bb .form-control, .top-bb ~ div .form-control {
                height: 28px;
                line-height: normal;
              }
              .top-bb *:not(.fa), .top-bb ~ div *:not(.fa) {
                font-size: 12px !important;
                font-family: Arial, sans-serif !important;
                color: black !important;
              }
              .lv-one div select {
                width: 100%;
              }
              .bien-ban-tham-dinh select {
                font-size: 13px;
              }
              .alpaca-field select {
                background-color: #fff!important;
                border-bottom: 1px solid #dcdcdc!important;
                border-top: 1px solid #dcdcdc!important;
                border-left: 1px solid #dcdcdc!important;
                border-right: 1px solid #dcdcdc!important;
                box-shadow: none;
                -moz-appearance: menulist;
                -webkit-appearance: menulist;
              }
              .form-control {
                border-width: 1px 1px 1px 1px;
              }
              .form-control {
                display: block;
                width: 100%;
                height: 34px;
                padding: 6px 12px;
                font-size: 14px;
                line-height: 1.42857;
                color: #555555;
                background-color: #fff;
                background-image: none;
                border: 1px solid #ccc;
                border-radius: 4px;
                -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
                box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
                -webkit-transition: border-color ease-in-out 0.15s, box-shadow ease-in-out 0.15s;
                -o-transition: border-color ease-in-out 0.15s, box-shadow ease-in-out 0.15s;
                transition: border-color ease-in-out 0.15s, box-shadow ease-in-out 0.15s;
              }
              .alpaca-field .lv-one .text-thiet-ke textarea, .alpaca-field .text-thiet-ke input, .alpaca-field textarea {
                width: 100%;
                box-shadow: none !important;
              }
              .lv-one .text-thiet-ke textarea, .text-thiet-ke input {
                width: 100%;
              }
              .lv-one div.lv-title, .lv-one div.content-label-full, .lv-one div.content-label, .lv-one div.content-thiet-ke, .lv-one div.content-ket-luan, .lv-one div.content-order {
                  border-color: black;
                  height: 100%;
                  display: flex;
                  align-items: center;
                  justify-content: center;
              }
              .lv-one div.lv-title, .lv-one div.content-label, .lv-one div.content-thiet-ke, .lv-one div.content-ket-luan, .lv-one div.content-order {
                  padding: 5px;
                  overflow: visible;
                  border-top: 1px solid #e9e9e9;
                  border-bottom: 0px solid #e9e9e9;
              }
              .lv-one .content-order {
                  border-right: 1px solid #e9e9e9;
                  width: 4%;
              }

              .lv-one div.lv-title, .lv-one .content-label {
                  justify-content: flex-start !important;
              }
              .lv-one .content-label {
                  border-right: 1px solid #e9e9e9;
              }
              .lv-one .content-label {
                  width: 30%;
                  float: left;
              }

              .bien-ban-tham-dinh .not-pass {
                color: #0000CC !important;
                background-color: #f3acac !important;
              }
              div[class*="lv-"] {
                overflow: visible;
                display: -webkit-box;
                display: flex;
                -webkit-flex-wrap: wrap;
                flex-wrap: wrap;
                width: 100%;
              }

              .lv-one div.lv-title, .lv-one .content-label {
                justify-content: flex-start !important;
              }
              .lv-one div.lv-title {
                font-weight: bold;
                cursor: pointer;
              }
              .lv-one .content-ket-luan {
                width: 18%;
                float: right;
              }
              .lv-one .content-thiet-ke {
                border-right: 1px solid #e9e9e9;
              }
              .lv-one .content-thiet-ke {
                width: 26%;
                float: left;
              }
              .bien-ban-tham-dinh .ob-focus {
                  color: #0000CC !important;
                  background-color: #E6E6E6 !important;
              }
              .bien-ban-tham-dinh .nil {
                  color: #0000CC !important;
                  background-color: #fff1ae !important;
              }
              div.bot-bb {
                  border: 1px black solid;
              }

              div.bot-bb {
                  width: 85%;
                  margin: auto;
                  border: 1px #e9e9e9 solid;
                  border-bottom: 0px;
              }
              div[class*="bot-bb"] {
                  overflow: visible;
                  display: -webkit-box;
                  display: flex;
                  -webkit-flex-wrap: wrap;
                  flex-wrap: wrap;
                  width: 100%;
              }

              /*.v-menu__content.theme--light.menuable__content__active {
                min-width: 290px !important;
                margin-top: -117px;
                margin-left: -12px;
              }*/

              .v-chip.v-chip.v-chip--outline {
                height: 21px !important;
              }

              .v-chip--label, .v-chip--label .v-chip__content {
                font-size: 12px;
              }

              .bot-bb div.bot-bb-title {
                font-weight: bold;
              }

              .bot-bb .content-stt {
                width: 5%;
              }

              .bot-bb .content-label {
                width: 25%;
              }

              .bot-bb .content-ket-luan {
                width: 70%;
              }

              .bot-bb .content-label, .bot-bb .content-stt, .bot-bb .content-ket-luan, div.bot-bb-title {
                padding: 5px;
                overflow: visible;
                border-top: 1px solid #e9e9e9;
                border-bottom: 0px solid #e9e9e9;
              }

              .bot-bb .content-chung {
                padding: 5px;
                overflow: visible;
                width: 85%;
              }

              .top-bb div.top-bb-content {
                  padding: 5px 0;
                  align-items: baseline;
                  flex-wrap: nowrap;
              }

              .top-bb div.top-bb-header:not(:first-child) {
                  padding: 5px 0;
              }

              .top-bb div.top-bb-header {
                -webkit-justify-content: center;
                justify-content: center;
                font-weight: bold;
              }

              .top-bb div.top-bb-header, .top-bb div.top-bb-header label {
                  flex-wrap: wrap;
                  font-weight: normal;
              }

              .top-bb div.top-bb-header > span:last-child {
                margin-left: 5px;
              }

              .top-bb-content label {
                width: 140px;
                flex-shrink: 0;
                font-weight: normal;
              }

              .top-bb-content [id*="column"] {
                width: 100%;
              }

              #phien_ban_gcn {
                width: 50px;
              }
            </style>
            <v-progress-linear v-if="loadingDialog" :indeterminate="true"></v-progress-linear>
            <div id="alpacajs_form_KQ1111" style="">
              <div class="top-bb">
                <div class="top-bb-header">
                  <h3 style="font-size: 15px !important;">Biên bản thẩm định thiết kế của <span id="tenBienBanTSKT"></span></h3>
                </div>
                <div class="top-bb-header" style="line-height: 32px">
                  <label>Số biên bản:</label>
                  <span id="column-so_bien_ban">
                    <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="so_bien_ban">
                      <div id="so_bien_ban">ccccccccc </div>
                    </div>
                  </span>
                </div>
                <div class="top-bb-header" style="line-height: 32px">
                  <label>Số Giấy chứng nhận:</label><span id="gcn-auto">00109/VAQ09-04/20-</span><span id="phien_ban_gcn"> </span>
                </div>
                <div class="top-bb-content pl-2">
                  <label>Đăng kiểm viên chính:</label>
                  <span id="column-dang_kiem_vien_chinh">
                    <div id="dang_kiem_vien_chinh"> </div>
                  </span>
                </div>
                <div class="top-bb-content pl-2">
                  <label>Đăng kiểm viên hỗ trợ:</label>
                  <span id="column-dang_kiem_vien_ho_tro">
                    <div id="dang_kiem_vien_ho_tro"> </div>
                  </span>
                </div>
                <div class="top-bb-content pl-2">
                  <label>Ngày thẩm định: từ</label>
                  <span id="column-ngay_bat_dau_tham_dinh">
                    <div id="ngay_bat_dau_tham_dinh"> </div>
                  </span>
                  <label style="width: auto;">&nbsp; đến &nbsp;</label>
                  <span id="column-ngay_ket_thuc_tham_dinh">
                    <div id="ngay_ket_thuc_tham_dinh"> </div>
                  </span>
                </div>
                <div class="top-bb-content pl-2">
                  <label>Loại hình thiết kế:</label>
                  <span id="column-loai_hinh_thiet_ke">
                    <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="loai_hinh_thiet_ke_text">
                      <div id="loai_hinh_thiet_ke_text"></div>
                    </div>
                  </span>
                </div>
                <div class="top-bb-content pl-2">
                  <label>Loại hồ sơ:</label>
                  <span id="column-hinh_thuc_cap_giay">
                    <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="hinh_thuc_cap_giay">
                      <div id="hinh_thuc_cap_giay_text"></div>
                    </div>
                  </span>
                </div>
                <div class="top-bb-content pl-2">
                  <label>Tài liệu đính kèm:</label>
                  <div id="div-uploadfile" style="padding: 0px 10px;"></div>
                </div>
                <div class="top-bb-title"> I. THÔNG TIN CHUNG</div>
                <div class="top-bb-ndtd-left" style="border-left: 1px solid #ccc;"> Nội dung </div>
                <div class="top-bb-ndtd-mid"> Thông tin khai báo </div>
                <div class="top-bb-ndtd-mid"> Thông tin xác nhận </div>
                <div class="top-bb-ndtd-right" style="border-right: 1px solid #ccc;"></div>

                <div class="lv-one">
                   <div class="lv-title">1. Cơ sở thiết kế</div>
                   <div class="lv-content">
                      <div class="lv-three">
                         <div class="content-label">1.1. Tên</div>
                         <div class="content-thiet-ke">
                            <div id="column-ten_co_so_thiet_ke">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_ten_co_so_thiet_ke">
                                  <span class="alpaca-control" id="ten_co_so_thiet_ke" name="lb_ten_co_so_thiet_ke" autocomplete="off">Công ty Cổ phần Phát triển Nguồn mở và Dịch vụ FDS</span>
                               </div>
                            </div>
                         </div>
                         <div class="content-thiet-ke">
                            <div id="column-bb-ten_co_so_thiet_ke">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_ten_co_so_thiet_ke">
                                  <div id="bb_ten_co_so_thiet_ke"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-ket-luan">
                            <div id="column-kl-ten_co_so_thiet_ke">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_ten_co_so_thiet_ke">
                                  <div id="kl_ten_co_so_thiet_ke">Đạt</div>
                               </div>
                            </div>
                         </div>
                      </div>
                      <div class="lv-three">
                         <div class="content-label">1.2. Địa chỉ</div>
                         <div class="content-thiet-ke">
                            <div id="column-dia_chi_co_so_thiet_ke">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_dia_chi_co_so_thiet_ke">
                                  <span class="alpaca-control" id="dia_chi_co_so_thiet_ke" name="lb_dia_chi_co_so_thiet_ke" autocomplete="off">Ngõ 3 Tôn Thất thuyết, Dịch Vọng Hậu, Cầu Giấy, Hà Nội</span>
                               </div>
                            </div>
                         </div>
                         <div class="content-thiet-ke">
                            <div id="column-bb-dia_chi_co_so_thiet_ke">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_dia_chi_co_so_thiet_ke">
                                  <div id="bb_dia_chi_co_so_thiet_ke"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-ket-luan">
                            <div id="column-kl-dia_chi_co_so_thiet_ke">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_dia_chi_co_so_thiet_ke">
                                  <div id="kl_dia_chi_co_so_thiet_ke">Đạt</div>
                               </div>
                            </div>
                         </div>
                      </div>
                      <div class="lv-three">
                         <div class="content-label">1.3. Người đại diện</div>
                         <div class="content-thiet-ke">
                            <div id="column-XCG01003">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01003">
                                  <span class="alpaca-control" id="lb_XCG01003" name="lb_XCG01003" autocomplete="off">Ông: Trần Kiêm Dũng</span>
                               </div>
                            </div>
                         </div>
                         <div class="content-thiet-ke">
                            <div id="column-bb-XCG01003">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01003">
                                  <div id="bb_XCG01003"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-ket-luan">
                            <div id="column-kl-XCG01003">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01003">
                                  <div id="kl_XCG01003">Đạt</div>
                               </div>
                            </div>
                         </div>
                      </div>
                      <div class="lv-three">
                         <div class="content-label">1.4. Số điện thoại</div>
                         <div class="content-thiet-ke">
                            <div id="column-XCG01005">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01005">
                                  <span class="alpaca-control" id="lb_XCG01005" name="lb_XCG01005" autocomplete="off">024 6262 7617</span>
                               </div>
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="XCG01004">
                                  <div id="XCG01004"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-thiet-ke">
                            <div id="column-bb-XCG01005">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01005">
                                  <div id="bb_XCG01005"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-ket-luan">
                            <div id="column-kl-XCG01005">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01005">
                                  <div id="kl_XCG01005">Đạt</div>
                               </div>
                            </div>
                         </div>
                      </div>
                      <div class="lv-three">
                         <div class="content-label">1.5. Thư điện tử (Email)</div>
                         <div class="content-thiet-ke">
                            <div id="column-XCG01006">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01006">
                                  <span class="alpaca-control" id="lb_XCG01006" name="lb_XCG01006" autocomplete="off">sonvh@fds.vn</span>
                               </div>
                            </div>
                         </div>
                         <div class="content-thiet-ke">
                            <div id="column-bb-XCG01006">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01006">
                                  <div id="bb_XCG01006"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-ket-luan">
                            <div id="column-kl-XCG01006">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01006">
                                  <div id="kl_XCG01006">Đạt</div>
                               </div>
                            </div>
                         </div>
                      </div>
                   </div>
                </div>


                <div class="lv-one">
                   <div class="lv-title">2. Cơ sở sản xuất, lắp ráp, nhập khẩu</div>
                   <div class="lv-content">
                      <div class="lv-three">
                         <div class="content-label">2.1. Tên</div>
                         <div class="content-thiet-ke">
                            <div id="column-XCG01001">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01001">
                                  <span class="alpaca-control" id="lb_XCG01001" name="lb_XCG01001" autocomplete="off">Công ty TNHH DAEHAN MOTORS</span>
                               </div>
                            </div>
                         </div>
                         <div class="content-thiet-ke">
                            <div id="column-bb-XCG01001">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01001">
                                  <div id="bb_XCG01001"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-ket-luan">
                            <div id="column-kl-XCG01001">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01001">
                                  <div id="kl_XCG01001">Đạt</div>
                               </div>
                            </div>
                         </div>
                      </div>
                      <div class="lv-three">
                         <div class="content-label">2.2. Địa chỉ</div>
                         <div class="content-thiet-ke">
                            <div id="column-XCG01002">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01002">
                                  <span class="alpaca-control" id="lb_XCG01002" name="lb_XCG01002" autocomplete="off">Lô D2, D3, D4, D5, đường số 8, khu công nghiệp cơ khí ô tô TPHCM, xã Hòa Phú, Củ Chi, TP.HCM</span>
                               </div>
                            </div>
                         </div>
                         <div class="content-thiet-ke">
                            <div id="column-bb-XCG01002">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01002">
                                  <div id="bb_XCG01002"></div>
                               </div>
                            </div>
                         </div>
                         <div class="content-ket-luan">
                            <div id="column-kl-XCG01002">
                               <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01002">
                                  <div id="kl_XCG01002">Đạt</div>
                               </div>
                            </div>
                         </div>
                      </div>
                   </div>
                </div>
              </div>

              <div class="lv-one">
                 <div class="lv-title">3. Thông tin tham chiếu</div>
                 <div class="lv-content">
                    <div class="lv-three">
                       <div class="content-label">3.1. Số tham chiếu của xe cơ sở: (lấy từ  dữ liệu của xe SXLR hoặc nhập khẩu)</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01020">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01020">
                                <span class="alpaca-control" id="lb_XCG01020" name="lb_XCG01020" autocomplete="off"></span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01020">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01020">
                                <div id="bb_XCG01020"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01020">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01020">
                                <div id="kl_XCG01020">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                    <div class="lv-three">
                       <div class="content-label">3.2. Số tham chiếu của xe gốc bổ sung/mở rộng: (lấy từ  dữ liệu TĐTK)</div>
                       <div class="content-thiet-ke">
                          <div id="column-"></div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-"></div>
                       </div>
                       <div class="content-ket-luan">Đạt</div>
                    </div>
                 </div>
              </div>

              <div class="lv-one">
                 <div class="lv-title">4. Thông tin Quy chuẩn áp dụng</div>
                 <div class="lv-content">
                    <div class="lv-three">
                       <div class="content-label">4.1. Quy chuẩn an toàn chung</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01031">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01031">
                                <span class="alpaca-control" id="lb_XCG01031" name="lb_XCG01031" autocomplete="off">QCVN 09 : 2015/BGTVT</span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01031">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01031">
                                <div id="bb_XCG01031_text"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01031">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01031">
                                <div id="kl_XCG01031">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                    <div class="lv-three">
                       <div class="content-label">4.2. Quy chuẩn khí thải</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01032">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01032">
                                <span class="alpaca-control" id="lb_XCG01032" name="lb_XCG01032" autocomplete="off">QCVN 86 : 2015/BGTVT</span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01032">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01032">
                                <div id="bb_XCG01032_text"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01032">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01032">
                                <div id="kl_XCG01032">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                 </div>
              </div>

              <div class="lv-one">
                 <div class="lv-title">5. Thông tin chung về kiểu loại xe</div>
                 <div class="lv-content" style="border-bottom: 1px solid black;">
                    <div class="lv-three">
                       <div class="content-label">5.1. Ký hiệu thiết kế</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01026">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01026">
                                <span class="alpaca-control" id="lb_XCG01026" name="lb_XCG01026" autocomplete="off">AYH36L-LFXVB</span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01026">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01026">
                                <div id="bb_XCG01026"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01026">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01026">
                                <div id="kl_XCG01026">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                    <div class="lv-three">
                       <div class="content-label">5.2. Loại phương tiện</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01050">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01050">
                                <span class="alpaca-control" id="lb_XCG01050" name="lb_XCG01050" autocomplete="off">Ô tô tải</span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01050">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01050">
                                <div id="bb_XCG01050_text"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01050">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01050">
                                <div id="kl_XCG01050">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                    <div class="lv-three">
                       <div class="content-label">5.3. Nhãn hiệu</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01051">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01051">
                                <span class="alpaca-control" id="lb_XCG01051" name="lb_XCG01051" autocomplete="off">HUYUE</span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01051">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01051">
                                <div id="bb_XCG01051_text"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01051">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01051">
                                <div id="kl_XCG01051">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                    <div class="lv-three">
                       <div class="content-label">5.4. Tên thương mại</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01052">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01052">
                                <span class="alpaca-control" id="lb_XCG01052" name="lb_XCG01052" autocomplete="off">HUYED AYH36L/LFXVB</span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01052">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01052">
                                <div id="bb_XCG01052"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01052">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01052">
                                <div id="kl_XCG01052">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                    <div class="lv-three">
                       <div class="content-label">5.5. Mã kiểu loại</div>
                       <div class="content-thiet-ke">
                          <div id="column-XCG01053">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="lb_XCG01053">
                                <span class="alpaca-control" id="lb_XCG01053" name="lb_XCG01053" autocomplete="off">AYH36L-LFXVB</span>
                             </div>
                          </div>
                       </div>
                       <div class="content-thiet-ke">
                          <div id="column-bb-XCG01053">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="bb_XCG01053">
                                <div id="bb_XCG01053"></div>
                             </div>
                          </div>
                       </div>
                       <div class="content-ket-luan">
                          <div id="column-kl-XCG01053">
                             <div class="alpaca-layout-binding-holder" alpaca-layout-binding-field-name="kl_XCG01053">
                                <div id="kl_XCG01053">Đạt</div>
                             </div>
                          </div>
                       </div>
                    </div>
                 </div>
              </div>

              <div class="top-bb">
                <div class="top-bb-title" style="margin-top: 0;"> II. Thẩm định thiết kế: </div>
                <div class="top-bb-ndtd-left"> Nội dung </div>
                <div class="top-bb-ndtd-mid"> Thông tin khai báo </div>
                <div class="top-bb-ndtd-mid"> Thông tin xác nhận </div>
                <div class="top-bb-ndtd-right"> Kết luận</div>
              </div>
              <div id="column-auto-2-view">

              </div>
              <div class="bot-bb">
                <div class="bot-bb-title" style="border-bottom: 0;"> III. GHI CHÚ:</div>
                <div class="content-stt"> 1</div>
                <div class="content-label"> Ghi chú để in chứng chỉ</div>
                <div class="content-ket-luan">
                  <div></div>
                </div>

                <div class="content-stt"> 2</div>
                <div class="content-label"> Ghi chú khác</div>
                <div class="content-ket-luan">
                  <div></div>
                </div>

                <div class="content-stt"> 3</div>
                <div class="content-label"> Ghi chú không đạt (nếu có)</div>
                <div class="content-ket-luan">
                  <div id="ghi_chu_khong_dat_view"></div>
                </div>

                <div style="width: 100%;border-top:1px solid black;">
                  <div class="bot-bb-title">IV. KẾT LUẬN CHUNG</div>
                  <div class="content-chung"><div id="dem-ket-qua-view"></div> </div>
                  <div class="content-chung">
                    <div id="ket_luan_chung_view" style="font-size: 15px !important; padding-left: 30px; font-weight: bold;">

                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </v-card>
      </v-dialog>

      <v-dialog v-model="popUpNhap_Xuat_DieuChuyen" persistent fullscreen transition="dialog-bottom-transition" :overlay=false>
        <v-card>
          <!-- <v-toolbar dark color="primary" height="50">
            <div class="text-bold">Chi tiết kiểm kê</div>
            <v-spacer></v-spacer>
            <v-toolbar-items>
              <v-btn icon dark @click.native="popUpNhap_Xuat_DieuChuyen = false">
                <v-icon>close</v-icon>
              </v-btn>
            </v-toolbar-items>
          </v-toolbar> -->
          <v-toolbar dark color="primary" height="50" class="mb-0">
            <v-btn icon @click.native="popUpNhap_Xuat_DieuChuyen = false" dark>
              <v-icon>close</v-icon>
            </v-btn>
            <v-toolbar-title style="font-size: 117%;">
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
            <v-container grid-list-md>
              <v-layout wrap>
                <v-flex xs12 sm12 class="text-cs-right">
                  <div id="formHistory">
                    
                  </div>
                  <div>
                    <object :data="urlPdfHistory" type="application/pdf" style="width:100%; height:500px;">
                      <embed :src="urlPdfHistory" type="application/pdf" />
                    </object>
                  </div>
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="success" @click="popUpHistoryDossierPart = false">Quay lại</v-btn>
                </v-flex>
              </v-layout>
            </v-container>
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
                <v-flex xs12 sm12 class="text-cs-right" v-if="statePopupCOP === 'MAU_1'">
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
                </v-flex>
                <v-flex xs12 sm12>
                  <v-btn small color="primary" @click="xacNhanCOP()">Đồng ý</v-btn>
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
                  <v-btn small color="primary" @click="xacNhanBBKiemTraGSKT()">Đồng ý</v-btn>
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
                <v-flex xs12 sm12 class="text-cs-right" v-if="statePopupCOP === 'MAU_1'">
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
                    item-text="stampShortNo"
                    item-value="stampShortNo"
                    clearable
                    return-object
                    autocomplete
                    v-model="stampBook"
                    class="pt-0"
                  ></v-select>
								</v-flex>
                <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Từ số</label>
								</v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    @keyup.enter="autoFillSerial()"
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
                    @keyup.enter="autoFillSerial()"
                    v-model="detailAnChi['serialEndNo']"
                    class="pt-0"
                    clearable
                  ></v-text-field>
								</v-flex>
                <v-flex xs12 sm2 class="text-xs-right py-0">
                  <label class="pt-2">Số lượng</label>
								</v-flex>
                <v-flex xs12 sm4 class="py-0">
                  <v-text-field
                    @keyup.enter="autoFillSerial()"
                    v-model="detailAnChi['subTotalInDocument']"
                    clearable
                    class="pt-0"
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

        <div class="layout wrap" v-else-if="stageFilterView === 'ds_nhap_kho' && !detailPage">

          <#include "dsNhapKho.ftl">

        </div>

        <div class="layout wrap" v-else-if="stageFilterView === 'ds_xuat_kho' && !detailPage">

          <#include "dsXuatKho.ftl">

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
        <div class="layout wrap" v-if="detailPage && stageFilterView === 'co_so_nuoc_ngoai'">
          <#include "addCoSoNuocNgoai.ftl">
        </div>
      </v-slide-x-transition>

      <v-slide-x-transition>
        <div class="layout wrap" v-if="detailPage && stageFilterView !== 'doanh_nghiep_trong_nuoc' && stageFilterView !== 'co_so_nuoc_ngoai' && stageFilterView !== 'quan_ly_pxx' && stageFilterView !== 'ds_nhap_kho' && stageFilterView !== 'ds_xuat_kho' && stageFilterView !== 'danh_sach_xe_da_xuat_xuong'  && stageFilterView !== 'thong_so_ky_thuat'  && stageFilterView !== 'danh_sach_an_chi_da_cap_phat'  && stageFilterView !== 'chi_tiet_an_chi_da_cap_phat' && stageFilterView !== 'danh_xe_cho_in_phieu'">

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
        <v-btn color="primary" dark fixed bottom right fab ripple v-show="offsetTop > 200"
        v-on:click.native="onScrollTop">
          <v-icon>keyboard_arrow_up</v-icon>
        </v-btn>
      </v-fab-transition>

    </div>
  </div>
