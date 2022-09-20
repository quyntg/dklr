<v-layout row wrap class="ml-0" >
	<v-flex xs12 sm12 class="text-xs-center">
		<div class="text-xs-center" style="width: 100%;">
			<strong><span style="font-family:times new roman,serif;">
				<span style="font-size:14.0pt;">XỬ LÝ SỰ KHÔNG PHÙ HỢP <br>
					<i>(NON CONFORMITY SOVLE RECORD)</i></span>
				</span>
			</strong>
		</div>
		<v-layout row wrap class="ml-0 pl-2">
			<v-flex xs12 sm3>
				<label class="content-label">Đăng kiểm viên:&nbsp;</label>
			</v-flex>
			<v-flex xs12 sm9>
				<v-select
				readonly
				style="width: 60%;"
				class="my-0 py-0"
				:items="dangKiemVienItems"
				item-text="fullName"
				item-value="userId"
				v-model="detailXuLyKoPhuhop['dang_kiem_vien_1']"
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
				v-model="detailXuLyKoPhuhop['copReportNo'] || detailXuLyKoPhuhop['inspectionRecordNo']"
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
				v-model="detailXuLyKoPhuhop['copReportDateFrom'] || detailXuLyKoPhuhop['inspectionDateFrom']"
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
				v-model="detailXuLyKoPhuhop['copReportDateTo'] || detailXuLyKoPhuhop['inspectionDateTo']"
				></v-text-field>
			</v-flex>

			<v-flex xs12 sm12>
				<table class="mt-3 mb-3" style="width: 100%;" border="1" class="ftable">
					<thead>
						<tr>
							<th style="width: 3%" class="text-xs-center">TT<br><em>No</em></th>
							<th class="text-xs-center">Số mục <br><em>(Item No)</em></th>
							<th style="" class="text-xs-center">1. Các nội dung không phù hợp (Non-conformities)</th>
							<th style="" class="text-xs-center">Ngày thực hiện</th>
							<th style="" class="text-xs-center">Người thực hiện</th>
							<th style="" class="text-xs-center">Ngày đánh giá</th>
							<th style="" class="text-xs-center">Mô tả</th>
							<th style="" class="text-xs-center">Kết luận</th>
							<#-- <th style="width: 10%" class="text-xs-center">Nước SX<br><em>Origin country</em></th>
							<th style="width: 10%" class="text-xs-center">Kết quả kiểm tra</th> -->
						</tr>
					</thead>
					<tbody>
						<template v-for="(itemTb, indexTb) in detailXuLyKoPhuhop['noi_dung_chua_phu_hop']" :key="  'noi_dung_chua_phu_hop' + indexTb">
							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">
								<td rowspan="4" class="text-xs-center" style="width: 3% !important;">
									{{indexTb + 1}}
								</td>
								<td rowspan="4" style="" class="text-xs-center">
									<span>
										{{itemTb['itemNo']}}
									</span>
								</td>
								<td colspan="5" style="" class="text-xs-left pl-1">
									<label>Mô tả không phù hợp</label>: {{itemTb['mo_ta'] || ''}}
								</td>
								
								<td rowspan="4" class="text-xs-left">
									<div v-for="(itemKq, indexKq) in kqXuLyKhongPhuHop" class="text-xs-left pl-1">
										<input type="radio" :name="itemTb['key'] + '_result_' + indexTb" class="check_radio" :id="itemTb['key'] + '_result_' + (indexTb) + '_' + (indexKq + 1)" v-model="itemTb['nd_result']" :value="itemKq['value']" style="margin: 0 5px 0 0">
										<label class="label-radio" :for="itemTb['key'] + '_result_' + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
									</div>
								</td>
							</tr>

							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">
								<td style="" class="text-xs-left pl-1">
									<label>Nguyên nhân</label>: {{itemTb['nguyen_nhan']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['ngay_nguyen_nhan']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['nguoi_nguyen_nhan']}}
								</td>
								<td rowspan="2" style="" class="text-xs-center">
									<v-menu
										:close-on-content-click="false"
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
										v-model="itemTb['ngay_danh_gia']"
										persistent-hint
										prepend-icon="event"
										clearable
										></v-text-field>
										<v-date-picker v-model="itemTb['ngayDanhGiaKPHDatePicker']" no-title @input="itemTb['ngay_danh_gia'] = parseDate2(itemTb['ngayDanhGiaKPHDatePicker']);" locale="vi"></v-date-picker>
									</v-menu>
								</td>
								<td style="" class="text-xs-center">
									<v-text-field
									class="my-0 py-0"
									v-model="itemTb['ghi_chu_nn']"
									></v-text-field>
								</td>
							</tr>
							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">

								<td style="" class="text-xs-left pl-1">
									<label>Biện pháp</label>: {{itemTb['bien_phap']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['ngay_bien_phap']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['nguoi_bien_phap']}} <br>
								</td>
								
								<td style="" class="text-xs-center">
									<v-text-field
									class="my-0 py-0"
									v-model="itemTb['ghi_chu_bp']"
									></v-text-field>
								</td>
							</tr>

							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">

								<td class="text-xs-left pl-1">
									<label>Bằng chứng khắc phục</label>:
								</td>

								<td colspan="4" class="text-xs-center">
									<a id="bang1_1_bang_chung" class="bangchung" :href="itemTb['bang_chung_url']" target="_blank" style="color: #00e0e0">{{itemTb['bang_chung']}}</a>
								</td>

							</tr>
						</template>
						
					<tbody>
				</table>

				<table class="mt-3 mb-3" style="width: 100%;" border="1" class="ftable">
					<thead>
						<tr>
							<th style="width: 3%" class="text-xs-center">TT<br><em>No</em></th>
							<th class="text-xs-center">Số mục <br><em>(Item No)</em></th>
							<th style="" class="text-xs-center">2. Các nội dung khuyến cáo (Observations)</th>
							<th style="" class="text-xs-center">Ngày thực hiện</th>
							<th style="" class="text-xs-center">Người thực hiện</th>
							<th style="" class="text-xs-center">Ngày đánh giá</th>
							<th style="" class="text-xs-center">Mô tả</th>
							<th style="" class="text-xs-center">Kết luận</th>
							<#-- <th style="width: 10%" class="text-xs-center">Nước SX<br><em>Origin country</em></th>
							<th style="width: 10%" class="text-xs-center">Kết quả kiểm tra</th> -->
						</tr>
					</thead>
					<tbody>
						<template v-for="(itemTb, indexTb) in detailXuLyKoPhuhop['noi_dung_khuyen_cao']" :key="  'noi_dung_khuyen_cao' + indexTb">
							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">
								<td rowspan="4" class="text-xs-center" style="width: 3% !important;">
									{{indexTb + 1}}
								</td>
								<td rowspan="4" style="" class="text-xs-center">
									<span>
										{{itemTb['itemNo']}}
									</span>
								</td>
								<td colspan="5" style="" class="text-xs-left pl-1">
									<label>Mô tả không phù hợp</label>: {{itemTb['mo_ta'] || ''}}
								</td>
								<td rowspan="4" class="text-xs-left">
									<div v-for="(itemKq, indexKq) in kqXuLyKhongPhuHopKC" class="text-xs-left pl-1">
										<input type="radio" :name="itemTb['key'] + '_result_' + indexTb" class="check_radio" :id="itemTb['key'] + '_result_' + (indexTb) + '_' + (indexKq + 1)" v-model="itemTb['nd_result']" :value="itemKq['value']" style="margin: 0 5px 0 0">
										<label class="label-radio" :for="itemTb['key'] + '_result_' + '_' + (indexKq + 1)" style="margin: 0" v-html="itemKq['text']"></label>
									</div>
								</td>
							</tr>

							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">
								<td style="" class="text-xs-left pl-1">
									<label>Nguyên nhân</label>: {{itemTb['nguyen_nhan']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['ngay_nguyen_nhan']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['nguoi_nguyen_nhan']}}
								</td>
								<td rowspan="2" style="" class="text-xs-center">
									<v-menu
										:close-on-content-click="true"
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
										v-model="itemTb['ngay_danh_gia']"
										persistent-hint
										prepend-icon="event"
										clearable
										></v-text-field>
										<v-date-picker v-model="itemTb['ngayDanhGiaKCDatePicker']" no-title @input="itemTb['ngay_danh_gia'] = parseDate2(itemTb['ngayDanhGiaKCDatePicker']);" locale="vi"></v-date-picker>
									</v-menu>
								</td>
								<td style="" class="text-xs-center">
									<v-text-field
									class="my-0 py-0"
									v-model="itemTb['ghi_chu_nn']"
									></v-text-field>
								</td>
							</tr>

							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">

								<td style="" class="text-xs-left pl-1">
									<label>Biện pháp</label>: {{itemTb['bien_phap']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['ngay_bien_phap']}}
								</td>
								<td style="" class="text-xs-center">
									{{itemTb['nguoi_bien_phap']}} <br>
								</td>
								<td style="" class="text-xs-center">
									<v-text-field
									class="my-0 py-0"
									v-model="itemTb['ghi_chu_bp']"
									></v-text-field>
								</td>
							</tr>

							<tr :style="{background: checkColorCop(itemTb['nd_result'])}">

								<td style="" class="text-xs-left pl-1">
									<label>Bằng chứng khắc phục</label>:
								</td>
								
								<td colspan="4" class="text-xs-center">
									<a id="bang1_1_bang_chung" class="bangchung" :href="itemTb['bang_chung_url']" target="_blank" style="color: #00e0e0">{{itemTb['bang_chung']}}</a>
								</td>

							</tr>
						</template>
					<tbody>
				</table>

			</v-flex>

			<v-flex xs12 sm2 class="pb-2 pt-2">
				<i style="font-weight: bold; font-size: 13px;">Kết luận:</i>
			</v-flex>
			<v-flex xs12 sm4 class="pb-2 pt-2">

				<span v-for="(itemKq, indexKq) in kqXuLyKhongPhuHopFinal" class="text-xs-center pr-2" :key="'kl_mau1' + indexKq">
					<input type="radio" :name="'xuLyKhongPhuHop' + '_result_' + '_cop'" v-model="detailXuLyKoPhuhop['nd_result']" :id="'xuLyKhongPhuHop' + '_result_' + (indexKq + 1) + 'cop'" :value="itemKq['value']" style="margin: 0 5px 0 0">
					<label class="label-radio" :for="'xuLyKhongPhuHop' + '_result_' + (indexKq + 1) + 'cop'" style="margin: 0" v-html="itemKq['text']"></label>
				</span>
			</v-flex>
		</v-layout>
	</v-flex>
</v-layout>