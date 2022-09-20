<v-slide-x-transition>
<div class="row-header flex-break" style="justify-content: space-between;">

    <div class="background-triangle-big">Chi tiết ấn chỉ đã cấp phát</div>
    <div class="">
        <v-btn color="primary" @click.native="stageFilterView = 'danh_sach_an_chi_da_cap_phat'"  class="mr-4 hidden-sm-and-down">Quay lại</v-btn>
    </div>

</div>

</v-slide-x-transition>

<v-slide-y-transition>
    <v-card>
        <div id="danhSachXeDaXuatXuongFilter" class="panel" style="height: auto;width: 100%;margin: 0;border-radius: 0;border-top: 1px solid white;background-color: #e1e2e1;padding: 15px;">
            <v-layout wrap>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>Đối tượng</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.vehicleclass}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>Loại mẫu in</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.stamptype}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>Tên phôi</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.stampshortno}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>SL ấn chỉ yêu cầu</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.subtotalindocument}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>SL ấn chỉ thực xuất</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.subtotalquantities}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>Đơn giá</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.unitprice}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>Thành tiền</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.totalamount}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>SL đã dùng</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.totalinuse}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>SL chưa dùng</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.totalnotused}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>SL báo mất</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.totallost}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>SL báo hủy</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.totalcancelled}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>SL báo trả lại</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.totalreturned}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>

                <v-flex xs12 md4>
                    <v-layout wrap>
                        <v-flex xs3><label>Ghi chú</label></v-flex>
                        <v-flex xs9>
                            <strong>{{chiTietAnChiDaCapPhat.remark}}</strong>
                        </v-flex>
                    </v-layout>
                </v-flex>
            </v-layout>
            <v-layout wrap>
                <v-flex xs12>
                    <v-btn color="primary" class="mx-0 my-0 mt-2"  @click="getDanhSachXeDaXuatXuong()">Tìm kiếm</v-btn>
                    <v-btn color="primary" class="mx-0 my-0 mt-2">Xuất Excel</v-btn>
                </v-flex>
            </v-layout>
        </div>
    </v-card>
</v-slide-y-transition>
