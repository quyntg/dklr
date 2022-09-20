<!-- TODO detailTemplate page -->
<div v-if="detailPage" style="width: 100%;">
	<input type="hidden" id="dossierId__hidden" :value="detailModel.dossierId" />
	<input type="hidden" id="submitDate__hidden" :value="detailModel.submitDate" />
	
	<div class="row-header">
		<div class="background-triangle-big"> Tên thủ tục </div>
		<div class="layout row wrap header_tools row-blue">
	
			<div class="flex xs7 sm9 solo pl-4 text-ellipsis">
		
				{{detailModel.dossierNo}} {{detailModel.serviceName}}
		
			</div>
			<div class="flex xs5 sm3 text-right" style="margin-left: auto;">
		
				<v-btn flat class=" my-0 py-0 btn-border-left" color="grey darken-1" v-on:click.native.prevent.stop="undoDetailPage()">
					<v-icon class="mr-2">undo</v-icon>
				Quay lại
				</v-btn>
                <v-btn v-if="navigationFilterview" v-on:click.native.prevent.stop="navigationFilterview = !navigationFilterview" flat icon class="mr-3 my-0 hidden-sm-and-down"><v-icon>fullscreen</v-icon></v-btn>

                <v-btn v-if="!navigationFilterview" v-on:click.native.prevent.stop="navigationFilterview = !navigationFilterview" flat icon class="mr-3 my-0 hidden-sm-and-down"><v-icon>fullscreen_exit</v-icon></v-btn>

			</div>
	
		</div>
	
	</div>
	
	<v-expansion-panel expand class="my-0 opencps-dossier-info">
		<v-expansion-panel-content v-bind:value="true">
		<div slot="header" class="text-bold primary--text">Thông tin chung hồ sơ</div>
		<v-layout wrap class="px-4 pb-2">
			<v-flex xs12 sm4>
				<div class="pb-1">
					<span>
						Tên doanh nghiệp: 
					</span>
					<span class="text-bold">
						{{ detailModel.applicantName }} 
					</span>
				</div>
				<div class="pb-1">
					<span>
						Mã hồ sơ: 
					</span>
					<span class="text-bold">
						{{ detailModel.dossierIdCTN }}
					</span>
				</div>
				<div class="pb-1">
					<span>
						Số hồ sơ: 
					</span>
					<span class="text-bold">
						{{ detailModel.dossierNo }}
					</span>
				</div>
				<div class="pb-1" v-if="detailModel.dossierReferenceNo != ''">
					<span>
						Mã hồ sơ MCĐT: 
					</span>
					<span class="text-bold">
						{{ detailModel.dossierReferenceNo }}
					</span>
				</div>
				<div class="pb-1" v-if="statusCertificateInfo['state']">
					<span>
						Tình trạng hiệu lực {{statusCertificateInfo['certificateRecordNo']}}: 
					</span>
					<span class="text-bold" style="color: red;">
						{{ statusCertificateInfo['expiredStatusText'] }}
					</span>
				</div>
				<div class="pb-1" v-if="detailModel['corporationName']">
					<span>
						Nhận kết quả từ: 
					</span>
					<span class="text-bold">
						{{ detailModel['corporationName'] }} <label v-if="detailModel['viaPostal'] != 2">(Trực tiếp)</label> <label v-else>(Bưu điện)</label>
					</span>
				</div>

				<div>
					<a href="javascript:;" @click.prevent.stop="showContactDetail = !showContactDetail">
						Thông tin liên hệ: <v-icon color="primary" v-if="!showContactDetail">keyboard_arrow_down</v-icon>
						<v-icon color="primary" v-if="showContactDetail">keyboard_arrow_up</v-icon>
					</a>
					
					<v-slide-y-transition>
						<div v-if="showContactDetail">
							<div class="pb-1">
								<span>
									Tên doanh nghiệp: 
								</span> 
								<span class="text-bold">
									{{detailModel.contactName}}
								</span>
							</div>
							<div class="pb-1">
								<span>
									Địa chỉ email: 
								</span>
								<span class="text-bold">
									{{detailModel.contactEmail}}
								</span>
							</div>
							<div class="pb-1">
								<span>
									Số điện thoại: 
								</span>
								<span class="text-bold">
									{{detailModel.contactTelNo}}
								</span>
								
							</div>
							<div class="pb-1">
								<span>
									Địa chỉ: 
								</span>
								<span class="text-bold">
									{{detailModel.wardName}}/{{detailModel.districtName}}/{{detailModel.cityName}}
								</span>
							</div>
							
						</div>
					</v-slide-y-transition>
					
				</div>

				<div v-if="detailModel['viaPostal'] == 2">
					<a href="javascript:;" @click.prevent.stop="showContactPostalDetail = !showContactPostalDetail">
						Thông tin trả KQ trả qua đường bưu điện: <v-icon color="primary" v-if="!showContactPostalDetail">keyboard_arrow_down</v-icon>
						<v-icon color="primary" v-if="showContactPostalDetail">keyboard_arrow_up</v-icon>
					</a>
					 <a href="javascript:;" @click.prevent.stop="viewTTBD(detailModel['dossierId'])">
					 	<v-icon color="primary">print</v-icon>
					 </a>

					<v-slide-y-transition>
						<div v-if="showContactPostalDetail">
							<div class="pb-1">
								<span>
									Tên người nhận: 
								</span> 
								<span class="text-bold">
									{{detailModel.postalReceiverName || ''}}
								</span>
							</div>
							<div class="pb-1">
								<span>
									Địa chỉ: 
								</span>
								<span class="text-bold">
									{{detailModel.postalAddress || ''}}
								</span>
							</div>
							<div class="pb-1">
								<span>
									Tỉnh/Thành phố: 
								</span>
								<span class="text-bold">
									{{detailModel.postalCityName || ''}}
								</span>
							</div>
							<div class="pb-1">
								<span>
									Số điện thoại: 
								</span>
								<span class="text-bold">
									{{detailModel.postalTelNo || ''}}
								</span>
								
							</div>
							
							
						</div>
					</v-slide-y-transition>
					
				</div>
			</v-flex>

		<v-flex xs12 sm4>
			<div class="pb-1">
				<span>
					Thời gian gửi: 
				</span>
				<span class="text-bold">
					{{ detailModel.submitDate }}
				</span>

			</div>
			<div class="pb-1">
				<span >
					Thời gian tiếp nhận: 
				</span>
				<span class="text-bold">
					{{ detailModel.receiveDate }}
				</span>

			</div>
			<div class="pb-1">
				<span >
					Thời hạn xử lý: 
				</span>
				<span class="text-bold">
					{{ detailModel.dueDate}}
				</span>
			</div>
			<div class="pb-1">
				<span>
					Trạng thái: 
				</span>
				<span class="text-bold">
					{{detailModel.dossierStatusText}}
				</span>
			</div>

			<div class="pb-1">
				<span>
					Chuyển bởi: 
				</span>
				<span class="text-bold">
					{{detailModel.lastActionUser}}
				</span>
			</div>
			<div>
				{{detailModel.lastActionName}}
			</div>
				<#-- <div v-html="detailModel.applicantNote">
				
				</div> -->
			</v-flex>

			<v-flex xs12 sm4>
				<div class="text-bold primary--text expansion-panel__header pl-0 pt-0">Thông tin sản phẩm</div>
				<div class="pb-1" v-html="detailModel.briefNote"></div>
			</v-flex>
		</v-layout>
	
		<#-- <div class="text-bold primary--text expansion-panel__header">Thông tin sản phẩm</div>
		<v-layout wrap class="px-4 pb-2">
			<v-flex xs12 sm6>
			<div class="pb-1" v-html="detailModel.briefNote"></div>
			</v-flex>
		</v-layout> -->
		</v-expansion-panel-content>
	</v-expansion-panel>

	<v-tabs :scrollable="false" v-model="tabActive">
		<v-tabs-bar class="grey-opencps-panel" dark>
			<v-tabs-item :key="'tab-dossier-detail-1'" :href="'#tab-dossier-detail-1'">
			THÀNH PHẦN HỒ SƠ
			</v-tabs-item>
			<v-tabs-item :key="'tab-dossier-detail-2'" :href="'#tab-dossier-detail-2'" @click.prevent.stop="_initchangeProcessStep();">
			THỤ LÝ HỒ SƠ
			</v-tabs-item>
			<v-tabs-item :key="'tab-dossier-detail-3'" :href="'#tab-dossier-detail-3'" @click.prevent.stop="selectDossierActionTab(detailModel)">
			TIẾN TRÌNH XỬ LÝ
			</v-tabs-item>
			<v-tabs-item :key="'tab-dossier-detail-4'" :href="'#tab-dossier-detail-4'" onclick="getContacts(1)">
			TRAO ĐỔI THÔNG TIN
			</v-tabs-item>
			<v-tabs-slider color="primary"></v-tabs-slider>
		</v-tabs-bar>
		<v-tabs-items>
			<v-tabs-content :id="'tab-dossier-detail-1'" reverse-transition="slide-y-transition" transition="slide-y-transition">
			<v-expansion-panel expand class="my-0">
				<v-expansion-panel-content v-bind:value="true">
				<div slot="header" class="text-bold pl-2"> <span>I. </span>Tài liệu nộp</div>
				<small slot="header" class="text-gray text-right mr-4"> Những thành phần hồ sơ có dấu ( <span style="color: red;"> * </span> ) là thành phần bắt buộc</small>
				<div class="opencps_list_border_style" jx-bind="listDocumentIn"></div>
				</v-expansion-panel-content>
			</v-expansion-panel>
			<v-expansion-panel expand class="my-0">
				<v-expansion-panel-content v-bind:value="true">
				<div slot="header" class="text-bold pl-2"> <span>II. </span>Kết quả</div>
				<div class="opencps_list_border_style" jx-bind="listDocumentOut"></div> 
				</v-expansion-panel-content>
			</v-expansion-panel>

			<v-expansion-panel expand class="my-0">
				<v-expansion-panel-content v-bind:value="true">
				<div slot="header" class="text-bold pl-2"> <span>III. </span>Tài liệu pháp lý</div>
				<div class="class="opencps_list_border_style>
					<div class="pl-3 text-bold">
						Tài liệu doanh nghiệp
					</div>
					<v-layout row wrap class="pb-2">
					  <v-flex xs12 sm2>
					  </v-flex>
					  <v-flex xs12 sm8>
					  	<div>

					  		<span v-if="taiLieuDoanhNghiep['applicantIdentityType'] == 2">Giấy chứng nhận đăng ký doanh nghiệp</span>
					  		<span v-else>Giấy chứng nhận đăng ký kinh doanh</span>
					  		<span>
					  			<v-icon
					  			size="17"
					  			style="font-size: 15px"
					  			:color="taiLieuDoanhNghiep['applicantIdentityFileEntryId'] && taiLieuDoanhNghiep['applicantIdentityFileEntryId'] !== '0' ? 'green' : 'red'
					  			"
					  			>
					  			{{
					  				taiLieuDoanhNghiep['applicantIdentityFileEntryId'] && taiLieuDoanhNghiep['applicantIdentityFileEntryId'] !== '0' ? "done" : "cancel"
					  			}}
					  		    </v-icon>
					  		    <span style="cursor: pointer; color: blue;" @click="xemBBGS(taiLieuDoanhNghiep['applicantIdentityFileEntryId'])">	{{taiLieuDoanhNghiep['applicantIdentityFileName'] || ''}}
					  		    </span>
					  		</span>
					  	</div>
					  	
					  	<div>
					  		<span>Giấy chứng nhận đủ điều kiện sản xuất, lắp ráp ô tô</span>
					  		<span>
					  			<v-icon
					  			size="17"
					  			style="font-size: 15px"
					  			:color="taiLieuDoanhNghiep['applicantXcgFileEntryId'] && taiLieuDoanhNghiep['applicantXcgFileEntryId'] !== '0' ? 'green' : 'red'
					  			"
					  			>
					  			{{
					  				taiLieuDoanhNghiep['applicantXcgFileEntryId'] && taiLieuDoanhNghiep['applicantXcgFileEntryId'] !== '0' ? "done" : "cancel"
					  			}}
					  		    </v-icon>
					  		    <span style="cursor: pointer; color: blue;" @click="xemBBGS(taiLieuDoanhNghiep['applicantXcgFileEntryId'])">
					  		    	{{taiLieuDoanhNghiep['applicantXcgFileName'] || ''}}
					  			</span>
					  		</span>
					  	</div>
					  </v-flex>
					  <v-flex xs12 sm2>
					  </v-flex>
					</v-layout>

					<div class="pl-3 text-bold">
						Tài liệu nhà xưởng
					</div>
					<v-layout row wrap class="pb-2" v-for="(taiLieuXuongItem, indexNX) in taiLieuXuong" :key="'taiLieuXuongItem' + indexNX">
						<v-flex xs12 sm12 class="pl-5">
						  <span class="text-bold">{{indexNX + 1}}. {{taiLieuXuongItem['productionPlantName']}}</span>
						</v-flex>
						<v-flex xs12 sm2>
						</v-flex>
						<v-flex xs12 sm8>
							<div>
								<span v-if="taiLieuXuongItem['productionPlantIdentityType'] === 2 || taiLieuXuongItem['productionPlantIdentityType'] === '2'">Giấy chứng nhận đăng ký doanh nghiệp:</span>

								<span class="bold" v-else-if="taiLieuXuongItem['productionPlantIdentityType'] === 1 || taiLieuXuongItem['productionPlantIdentityType'] === '1'">Giấy chứng nhận đăng ký kinh doanh:</span>

								<span v-else-if="taiLieuXuongItem['productionPlantIdentityType'] === 3 || taiLieuXuongItem['productionPlantIdentityType'] === '3'">Giấy chứng nhận đầu tư:</span>

								<span class="bold" v-else-if="taiLieuXuongItem['productionPlantIdentityType'] === 4 || taiLieuXuongItem['productionPlantIdentityType'] === '4'">Giấy chứng nhận đăng ký địa điểm kinh doanh:</span>

								<span v-else>Giấy chứng nhận đăng ký hoạt động chi nhánh:</span>
								<span>
									<v-icon
									size="17"
									style="font-size: 15px"
									:color="taiLieuXuongItem['productionPlantIdentityFileEntryId'] && taiLieuXuongItem['productionPlantIdentityFileEntryId'] !== '0' ? 'green' : 'red'
									"
									>
									{{
										taiLieuXuongItem['productionPlantIdentityFileEntryId'] && taiLieuXuongItem['productionPlantIdentityFileEntryId'] !== '0' ? "done" : "cancel"
									}}
								</v-icon>
								<span style="cursor: pointer; color: blue;" @click="xemBBGS(taiLieuXuongItem['productionPlantIdentityFileEntryId'])">	{{taiLieuXuongItem['productionIdentityFileName'] || ''}}
								</span>
							</span>
						</div>
					</v-flex>
					<v-flex xs12 sm2>
					</v-flex>
				</v-layout>
				</div>
				
				</v-expansion-panel-content>
			</v-expansion-panel>

			<v-expansion-panel expand class="my-0" v-if="checkXNHL(detailModel['serviceCode'])">
				<v-expansion-panel-content v-bind:value="true">
				<div slot="header" class="text-bold pl-2"> <span>IV. </span>Danh sách các lần XNHL</div>
				<div class="opencps_list_border_style">
					<v-layout row wrap>
					  <v-flex xs12 sm2>
					    
					  </v-flex>
					  <v-flex xs12 sm8>
					    <table class="table-basic px-4 pb-2" style="width:100%;">
			          <tr>
			            <th style="text-align: center;border: 0.5px solid;">STT</th>
			            <th style="text-align: center;border: 0.5px solid;">Số hồ sơ</th>
			            <th style="text-align: center;border: 0.5px solid;">Ngày đề nghị</th>
			            <th style="text-align: center;border: 0.5px solid;">Ngày hiệu lực</th>
			            <th style="text-align: center;border: 0.5px solid;">Xem</th>
			          </tr>
			          <tr v-for="(item, index) in dsHSXNHL" :key="'dshsxnhl' + index">
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{index + 1}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	<span v-if="item['validdossierid'] == -1">{{item['dossierno']}}</span>
			            	<span v-else>{{item['validdossierno']}}</span>
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{item['validrequestdate']}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{item['certificaterecordexpiredate']}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	<#-- <a href="javascript:;" @click="toDetailHoSoXNHL({
			            		dossierId: item['dossierid'],
			            		dossierIdCTN: item['dossieridctn'],
			            		dossierNo: item['dossierno'],
			            		referenceUid: item['referenceuid']
			            	})">
			            		Xem
			            	</a> -->
			            	<a v-if="item['validdossierid'] != -1" href="javascript:;" @click="toDetailHoSoXNHL({
			            		dossierId: item['validdossierid'],
			            		dossierIdCTN: item['dossieridctn'],
			            		dossierNo: item['dossierno'],
			            		referenceUid: item['referenceuid']
			            	})">
			            		Xem
			            	</a>
			            	<a v-else href="javascript:;" @click="toDetailHoSoXNHL({
			            		dossierId: item['dossierid'],
			            		dossierIdCTN: item['dossieridctn'],
			            		dossierNo: item['dossierno'],
			            		referenceUid: item['referenceuid']
			            	})">
			            		Xem
			            	</a>
			            </td>
			          </tr>
			          
			        </table>
					  </v-flex>
					  <v-flex xs12 sm2>
					    
					  </v-flex>
					</v-layout>
				</div> 
				</v-expansion-panel-content>
			</v-expansion-panel>

			<v-expansion-panel expand class="my-0" v-if="checkXNHL_HangNam(detailModel['serviceCode'])">
				<v-expansion-panel-content v-bind:value="true">
				<div slot="header" class="text-bold pl-2"> <span>(*). </span>XNHL hàng năm</div>
				<div class="opencps_list_border_style">
					<v-layout row wrap>
					  <v-flex xs12 sm2>
					    
					  </v-flex>
					  <v-flex xs12 sm8>
					    <table class="table-basic px-4 pb-2" style="width:100%;">
			          <tr>
			            <th style="text-align: center;border: 0.5px solid;">STT</th>
			            <th style="text-align: center;border: 0.5px solid;">Số hồ sơ</th>
			            <th style="text-align: center;border: 0.5px solid;">Ngày đề nghị</th>
			            <th style="text-align: center;border: 0.5px solid;">Ngày hiệu lực</th>
			            <th style="text-align: center;border: 0.5px solid;">Xem</th>
			          </tr>
			          <tr v-for="(item, index) in dsHSXNHL" :key="'dshsxnhl_hangnam' + index">
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{index + 1}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	<span v-if="item['validdossierid'] == -1">{{item['dossierno']}}</span>
			            	<span v-else>{{item['validdossierno']}}</span>
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{item['validrequestdate']}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{item['certificaterecordexpiredate']}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">

			            	<a v-if="item['validdossierid'] != -1" href="javascript:;" @click="toDetailHoSoXNHL({
			            		dossierId: item['validdossierid'],
			            		dossierIdCTN: item['dossieridctn'],
			            		dossierNo: item['dossierno'],
			            		referenceUid: item['referenceuid']
			            	})">
			            		Xem
			            	</a>
			            	<a v-else href="javascript:;" @click="toDetailHoSoXNHL({
			            		dossierId: item['dossierid'],
			            		dossierIdCTN: item['dossieridctn'],
			            		dossierNo: item['dossierno'],
			            		referenceUid: item['referenceuid']
			            	})">
			            		Xem
			            	</a>
			            </td>
			          </tr>
			          
			        </table>
					  </v-flex>
					  <v-flex xs12 sm2>
					    
					  </v-flex>
					</v-layout>
				</div> 
				</v-expansion-panel-content>
			</v-expansion-panel>

			<v-expansion-panel expand class="my-0" v-if="isShowCacLanQuyetToan">
				<v-expansion-panel-content v-bind:value="true">
				<div slot="header" class="text-bold pl-2"> <span>(*). </span>Danh sách các lần quyết toán</div>
				<div class="opencps_list_border_style">
					<v-layout row wrap>
					  <v-flex xs12 sm2>
					    
					  </v-flex>
					  <v-flex xs12 sm8>
					    <table class="table-basic px-4 pb-2" style="width:100%;">
			          <tr>
			            <th style="text-align: center;border: 0.5px solid;">STT</th>
			            <th style="text-align: center;border: 0.5px solid;">Số hồ sơ</th>
			            <th style="text-align: center;border: 0.5px solid;">Ngày đề nghị quyết toán</th>
			            <th style="text-align: center;border: 0.5px solid;">Ngày duyệt cấp phiếu</th>
			            <th style="text-align: center;border: 0.5px solid;">Hành động</th>
			          </tr>
			          <tr v-for="(item, index) in dsCacLanQuyetToan" :key="'dscaclanquyettoan' + index">
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{index + 1}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	<span>{{item['dossierNo']}}</span>
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{item['appliedDate']}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">
			            	{{item['approvedDate']}}
			            </td>
			            <td style="	text-align: center;border: 0.5px solid;">

			            	<a href="javascript:;" @click="toDetailHoSoXNHL({
			            		dossierId: item['dossierId'],
			            		dossierIdCTN: item['dossierIdCTN'],
			            		dossierNo: item['dossierNo'],
			            		referenceUid: item['referenceUid']
			            	})">
			            		Xem
			            	</a>
			            </td>
			          </tr>
			          
			        </table>
					  </v-flex>
					  <v-flex xs12 sm2>
					    
					  </v-flex>
					</v-layout>
				</div> 
				</v-expansion-panel-content>
			</v-expansion-panel>
			</v-tabs-content>
			<v-tabs-content :id="'tab-dossier-detail-2'" reverse-transition="slide-y-transition" transition="slide-y-transition">
				<v-tabs :scrollable="false" v-if="processSteps && processSteps.length > 0">
					<v-tabs-bar dark class="grey-opencps-panel grey-opencps-panel-group-button">
					<v-tabs-item
						v-for="(step, indexStep) in processSteps"
						:key="step.processActionId"
						:href="'#tab-temp-' + step.processActionId"
						@click.prevent.stop="changeProcessStep(step, indexStep)"
						v-if="(detailModel.specialNo !== 0 && !stateOnlyFollow) || stateActionCOP"
					>
                        <v-btn
                            :loading="true"
                            :disabled="true"
                            v-if="stepLoading"
                        >
                            <span slot="loader">Loading...</span>
                        </v-btn>
                        <v-btn
                            color="primary"
                            class="mx-0 my-0"
                            v-else-if="step['actionName']"
                        >
                            {{ step.actionName }}
                        </v-btn>
						
					</v-tabs-item>

					<div v-if="(detailModel['specialNo'] == 0 && !stateActionCOP)">
						<i>Hồ sơ này chỉ được theo dõi</i>
					</div>

					<div v-else-if="stateOnlyFollow && !stateActionCOP">
						<i>Hồ sơ này chỉ được theo dõi</i>
					</div>
					<v-menu>
					</v-menu>
					</v-tabs-bar>
				</v-tabs>
				<v-card v-if="stepModel != null">
					<div v-if="stepModel.pending">
						Hồ sơ chờ đồng bộ ...
					</div>
					<div v-else-if="stepModel.plugin">

						<!-- <div class="flex xs12 sm12 text-center">
							<object id="dossierPDFViewPlugin" data="" width="100%" height="100%">
								<iframe :src="stepModel.url" width="100%" height="100%"> </iframe>
							</object>
							<div id="dossierPDFViewNotFound" class="text-center">{{ stepModel.no_pdf }}</div>
						</div> -->
						<div v-if="stepModel.pdf">
							<div class="flex xs12 sm12 text-center">
								<object id="dossierPDFViewPlugin" data="" width="100%" height="100%">
									<iframe :src="stepModel.url" width="100%" height="100%"> </iframe>
								</object>
								<div id="dossierPDFViewNotFound" class="text-center">{{ stepModel.no_pdf }}</div>
							</div>
						</div>
						
						<div v-if="stepModel.html">
							<input type="hidden" class="dossierFilePartNo" name="">
							<div id="alpacajs_form_plugin" class="expansion-panel__header"></div>
							<div id="dossierAlpacaNotFound" class="text-center">{{ stepModel.no_html }}</div>
						</div> 
						
					</div>
                    <div v-else>

                    	<#-- v-if="listProcessNoGCN.includes(detailModel['dossierTemplateNo']) && detailModel.dossierSubStatus != 'PROCESSING_72' && checkShowDsGCN()" -->
                    	<div class="flex mt-3 px-0 xs12 sm12" v-if="checkShowDsGCN()">

                    		<div>
                    			<table border="1" class="ftable" style="width: 100%;">
                    				<thead>
                    					<th class="text-xs-center">
                    						STT
                    					</th>
                    					<th class="text-xs-center">
                    						Số giấy chứng nhận <br>
                    						Ngày cấp
                    					</th>
                    					<th class="text-xs-center">
                    						Loại P.tiện
                    					</th>
                    					<th class="text-xs-center">
                    						Nhãn hiệu
                    					</th>
                    					<th class="text-xs-center">
                    						Tên thương mại
                    					</th>
                    					<th class="text-xs-center">
                    						Mã kiểu loại
                    					</th>
                    					<th class="text-xs-center">
                    						Số lượng
                    					</th>
                    					<#-- <th class="text-xs-center">
                    						SL duyệt cấp
                    					</th> -->
                    				</thead>

                    				<tbody>
                    					<tr v-for="(itemGCNView, indexGCN) in listGCNView">
                    						<td class="text-xs-center">
                    							{{indexGCN + 1}}
                    						</td>
                    						<td class="text-xs-center">
                    							{{itemGCNView['certificateRecordNo'] || ''}} <br> 
                    							<i style="font-size: 14px;">{{itemGCNView['certificateRecordDate'] || ''}}</i>
                    						</td>
                    						<td class="text-xs-center">
                    							{{itemGCNView['VR_VehicleTypeCertificate'] ? itemGCNView['VR_VehicleTypeCertificate']['certifiedVehicleTypeDescription'] : ''}}
                    						</td>
                    						<td class="text-xs-center">
                    							{{itemGCNView['VR_VehicleTypeCertificate'] ? itemGCNView['VR_VehicleTypeCertificate']['certifiedTrademarkName'] : ''}}
                    						</td>
                    						<td class="text-xs-center">
                    							{{itemGCNView['VR_VehicleTypeCertificate'] ? itemGCNView['VR_VehicleTypeCertificate']['certifiedCommercialName'] : ''}}
                    						</td>
                    						<td class="text-xs-center">
                    							{{itemGCNView['VR_VehicleTypeCertificate'] ? itemGCNView['VR_VehicleTypeCertificate']['certifiedModelCode'] : ''}}
                    						</td>
                    						<td class="text-xs-center">
                    							{{itemGCNView['VR_Issue_VehicleCertificate'] ? itemGCNView['VR_Issue_VehicleCertificate']['totalProduct'] : ''}}
                    						</td>
                    						<#-- <td class="text-xs-center">
                    							{{itemGCNView['totalDat'] || 0}}
                    						</td> -->
                    					</tr>
                    				</tbody>
                    			</table>
                    		</div>

                    		<#-- <div>
                    			<div class="layout ml-0 row wrap" style="border: 1px solid rgb(204, 204, 204);">
                    				<div class="flex pt-0 px-0 xs12 sm12" style="position: relative;">
                    					<span class="text-bold" style="position: absolute; top: -13px; left: 5px; padding: 0px 10px; background-color: rgb(255, 255, 255);">Danh sách giấy chứng nhận</span> 
                    					<div class="layout ml-0 row wrap">
                    						<div class="flex px-0 py-0 xs12 sm4" style="border-right: 1px solid rgb(204, 204, 204);">
                    							<div class="text-xs-center py-2" style="width: 100%;">
                    								<span>Số giấy chứng nhận</span>
                    							</div>
                    							<v-list class="list_li_active" style="max-height: 314px; overflow: auto;">
                    								<v-list-tile v-for="(item, index) in thongTinPhieu['VR_Issue_Vehiclecertificate']" v-bind:key="item['id'] + 'phieuXuatKho'" @click="selectSoGCNCapPhat(item['id'], index, thongTinPhieu['approvalCount'])" :class="{active: indexGCNXuatKho === index}">
                    									<v-list-tile-content>
                    										<v-list-tile-title class="text-xs-center">{{item['certificateRecordNo'] || ''}} <br> <i>{{item['certificateRecordDate'] || ''}}</i></v-list-tile-title>
                    									</v-list-tile-content>
                    								</v-list-tile>
                    							</v-list>
                    						</div>
                    						<div class="flex xs12 sm8" style="border-right: 1px solid rgb(204, 204, 204);">
                    							<div class="layout row wrap ml-0">

                    								<div class="flex text-xs-left xs12 sm12 pl-1">
                    									<span>Ngày cấp:</span> <label class=""> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certificateRecordDate'] : ''}}</label>
                    								</div>

                    								<div class="flex text-xs-left xs12 sm4 pl-1 pt-1"><span>1. Loại P.tiện: </span></div>
                    								<div class="flex xs12 sm8"><label class=" pl-2 pt-1"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedVehicleTypeDescription'] : ''}}</label></div>

                    								<div class="flex text-xs-left xs12 sm4 pl-1"><span>2. Nhãn hiệu: </span></div>
                    								<div class="flex xs12 sm8"><label class=" pl-2"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedTrademarkName'] : ''}}</label></div>

                    								<div class="flex text-xs-left xs12 sm4 pl-1"><span>3. Tên thương mại: </span></div>
                    								<div class="flex xs12 sm8"><label class=" pl-2"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedCommercialName'] : ''}}</label></div>

                    								<div class="flex text-xs-left xs12 sm4 pl-1"><span>4. Mã kiểu loại: </span></div>
                    								<div class="flex xs12 sm8"><label class=" pl-2"> {{thongTinGCN['VR_VehicleTypeCertificate'] ? thongTinGCN['VR_VehicleTypeCertificate']['certifiedModelCode'] : ''}}</label></div>

                    								<div class="flex text-xs-left xs12 sm5 pl-1"><span>5. SL chưa cấp: </span></div>
                    								<div class="flex xs12 sm7"><label class="pl-2"> {{totalChuaCap || 0}}</label></div>

                    								<div class="flex text-xs-left xs12 sm5 pl-1"><span>6. SL duyệt cấp: </span></div>
                    								<div class="flex xs12 sm7"><label class="pl-2"> {{totalDat || 0}} / {{thongTinPhieu['totalQuantity'] || 0}}</label></div>
                    							</div>
                    						</div>
                    					</div>
                    				</div>

                    			</div>
                    		</div> -->
                    	</div>

                    	<input type="hidden" name="processActionId" id="processActionId" :value="stepModel['processActionId']">
                    	
                    	<v-card-title primary-title class="mx-2 pb-0" v-if="stepModel.createFiles">
                            <v-layout wrap> 
                                <v-flex xs12 id="labelTPKQ">
                                    File đính kèm:
                                </v-flex>
                            </v-layout>
                        </v-card-title>
                        
                    	<v-expansion-panel class="my-0 expansion__list_style">
                            <v-expansion-panel-content v-for="(item, i) in stepModel.createFiles" v-if="item" :key="i" :data-pk="stepModel['processActionId'] + '_' + item['partNo']">
                            <div :key="item.partNo + i" slot="header" :id="'headerForm' + item.partNo" @click.prevent="showAlpacaJSFORM(item, stepModel['processActionId'])">{{i + 1}}. {{item.partName}} 
                            	<small v-if="item.eform && !stepModel['eSignature']">( Form trực tuyến )</small> 
                            </div>
							
							<input v-if="item.counter > 0" type="hidden" class="formDataRequired" :id="'requiredForm' + item.partNo" :name="'requiredForm' + item.partNo" value="1">

							<input v-else type="hidden" class="formDataRequired" :id="'requiredForm' + item.partNo" :name="'requiredForm' + item.partNo" value="0">

                            <div slot="header" class="text-right">
                                <v-btn v-if="!item.eform" flat icon light class="small-btn-x mx-0 my-0" v-on:click.native.prevent="singleFileUpload(item)">
                                    <v-icon>file_upload</v-icon>
                                </v-btn>

                                <input v-if="!item.eform" type="hidden" value="0" :id="'validCreateFile' + item.partNo" :data-pk="item.partNo" class="validCreateFile" v-if="item['required']">

                                <v-btn color="primary" fab small dark class="small-btn-x mx-0 my-0" v-on:click.native.prevent="viewDossierFileResult(item, i)" :id="'btn-count-partno'+item.partNo">
                                    {{item.counter}}
                                </v-btn>
                                
                                <v-btn flat icon light class="small-btn-x mx-0 my-0" v-on:click.native.prevent="deleteDossierFileVersion(item)">
                                    <v-icon>delete</v-icon>
                                </v-btn>
                            </div>
							
                            <input type="file" :id="'inputfile_'+item.dossierPartId" style="display:none" v-on:change="singleFileUploadInput($event, item, i)"/>

                            <div class="alert alert--outline success--text mx-4 hidden" :id="'message_success_'+item.referenceUid" >
                            	<i aria-hidden="true" class="material-icons icon alert__icon">check_circle</i>
	                            <div>
							    	Ghi lại {{item.partName}} Thành công!.
							  	</div>
						  	</div>

						  	<div class="alert alert--outline error--text mx-4 hidden" :id="'message_error_'+item.referenceUid" >
                            	<i aria-hidden="true" class="material-icons icon alert__icon">warning</i>
	                            <div>
							    	Ghi lại {{item.partName}} Thất bại!.
							  	</div>
						  	</div>

						  	<div class="alert alert--outline warning--text mx-4 hidden" :id="'message_warning_'+item.referenceUid" >
                            	<i aria-hidden="true" class="material-icons icon alert__icon">warning</i>
	                            <div>
							    	Vui lòng chờ trong giây lát!.
							  	</div>
						  	</div>

                            <div class="text-right pr-4 pt-2" v-if="item.eform || (item['dossierPartId'] === 18901 && item['partNo'] === 'KQ2')">
                            	<v-fab-transition>
                            		<#-- <v-btn color="primary" dark fixed bottom right fab ripple v-show="offsetTop > 200"
                            			v-on:click.native="onScrollTop">
                            			<v-icon>keyboard_arrow_up</v-icon>
                            		</v-btn> -->
                            		<v-btn :style="{top: offsetTop > 579 ? '20px' : '', right: offsetTop > 579 ? '133px' : ''}" dark :fixed="offsetTop > 579" bottom right ripple color="primary" :id="'btn-save-formalpaca'+item.partNo"
                            		:referenceUid="item.referenceUid"
                            		:dossierId="detailModel.dossierId"
                            		class="saveForm pt-2"
                            		v-if="!stepModel['eSignature'] && checkBtnSubmitCOP(item)"
                            		:loading="loadingAlpacajsForm"
                            		:disabled="loadingAlpacajsForm"
                            		v-on:click.native.prevent.stop="submitAlpacajsForm(item, stepModel['processActionId'])"> Ghi lại </v-btn>
                            	</v-fab-transition>

                            </div>
                            <div :key="'form' + item['dossierPartId'] + i" v-if="item['dossierPartId'] === 288 && item['partNo'] === 'KQ4'" id="formCOP" :referenceUid="item['referenceUid']" :processActionId="stepModel['processActionId']" :id="'headerForm' + item.partNo">

                            	<v-btn :color="activeAllCOP ? 'primary' : ''" @click="activeAllCOP = true; part1Active = false; part2Active = false; part3Active = false; part4Active = false; part5Active = false;">Preview</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn :color="part1Active ? 'primary' : ''" @click="activeAllCOP = false; part1Active = true; part2Active = false; part3Active = false; part4Active = false; part5Active = false;">Đánh giá chung</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn v-if="detailCOP['importerDomesticSite'] != 'NN' && listCodeKTTB.includes(detailCOP['copClassification'])" :color="part2Active ? 'primary' : ''" @click="activeAllCOP = false; part1Active = false; part2Active = true; part3Active = false; part4Active = false; part5Active = false;">Kiểm tra TB</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn v-if="detailCOP['importerDomesticSite'] != 'NN' && listCodePNDN.includes(detailCOP['copClassification'])" :color="part3Active ? 'primary' : ''" @click="activeAllCOP = false; part1Active = false; part2Active = false; part3Active = true; part4Active = false; part5Active = false;">Phân nhóm DN</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn v-if="listCodeKTSPXX.includes(detailCOP['copClassification'])" :color="part4Active ? 'primary' : ''" @click="activeAllCOP = false; part1Active = false; part2Active = false; part3Active = false; part4Active = true; part5Active = false;">Kiểm tra SPXX</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn :color="part5Active ? 'primary' : ''" @click="activeAllCOP = false; part1Active = false; part2Active = false; part3Active = false; part4Active = false; part5Active = true;">Kết luận chung</v-btn> &nbsp;&nbsp;&nbsp;

                            	<#include "formCop.ftl">
                            </div>

                            <div :key="'formxuLyKhongPhuHop' + item['dossierPartId'] + i" v-if="item['dossierPartId'] === 18901 && item['partNo'] === 'KQ2' || item['dossierPartId'] === 19001 && item['partNo'] === 'KQ8'" id="formCOP" :referenceUid="item['referenceUid']" :processActionId="stepModel['processActionId']" :id="'headerForm' + item.partNo">

                            	<#include "xuLyKhongPhuHop.ftl">
                            </div>

                            <div v-if="item['dossierPartId'] === 161 && item['partNo'] === 'KQ2'" id="formBaoCaoCSBHBD" :referenceUid="item['referenceUid']" :processActionId="stepModel['processActionId']">

                            	<v-btn :color="activeAllCOP ? 'primary' : ''" @click="activeAllCOP = true; part1BHBDActive = false; part2BHBDActive = false; part5BHBDActive = false;">Preview</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn :color="part1BHBDActive ? 'primary' : ''" @click="activeAllCOP = false; part1BHBDActive = true; part2BHBDActive = false; part5BHBDActive = false;">Đánh giá chung</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn :color="part2BHBDActive ? 'primary' : ''" @click="activeAllCOP = false; part1BHBDActive = false; part2BHBDActive = true; part5BHBDActive = false;">Kiểm tra TB</v-btn> &nbsp;&nbsp;&nbsp;

                            	<v-btn :color="part5BHBDActive ? 'primary' : ''" @click="activeAllCOP = false; part1BHBDActive = false; part2BHBDActive = false; part5BHBDActive = true;">Kết luận chung</v-btn> &nbsp;&nbsp;&nbsp;

                            	<#include "formBaoCaoCSBHBD.ftl">
                            </div>

                            <div :key="'bien_ban_kiem_tra_giam_sat_dot_xuat' + item['dossierPartId'] + i" v-else-if="(item['dossierTemplateNo'] === 'TT302011BGTVTCPPXCG' || item['dossierTemplateNo'] === 'TT302011BGTVTCPPXCD' || item['dossierTemplateNo'] === 'TT302011BGTVTCPPXMTGM' || item['dossierTemplateNo'] === 'TT302011BGTVTCPPXBBCN' || item['dossierTemplateNo'] === 'TT302011BGTVTCPPXDD' || item['dossierTemplateNo'] === 'TT302011BGTVTCPPXBBCH')" id="bbKiemTraGiamSatDotXuat" :referenceUid="item['referenceUid']" :processActionId="stepModel['processActionId']">
                            	<#include "bien_ban_kiem_tra_giam_sat_dot_xuat.ftl">
                            </div>

                            <#-- <div v-else :id="'alpacajs_form_' + item.partNo + '_' + stepModel['processActionId']"> -->

                           	<div v-else :id="'alpacajs_form_' + item.partNo">
                            	
                            </div>
							<input type="hidden" :id="'dossierFileId' + item.partNo" :value="item.dossierFileId" />
							
                            </v-expansion-panel-content>
                        </v-expansion-panel>

                        <v-expansion-panel class="my-0 pt-2 expansion__list_style" v-if="!stepModel['createFiles'] && (stepModel['actionCode'] === 1124 && stepModel['postStepCode'] === 205 || stepModel['actionCode'] === 1126 && stepModel['postStepCode'] === 206) && (detailModel['dossierSubStatus'] === 'PROCESSING_60' || detailModel['dossierSubStatus'] === 'PROCESSING_69')">
                        	<#-- <#include "soat_xet_gcn.ftl"> -->
                        </v-expansion-panel>
                        

                        <!-- <v-card-title primary-title class="mx-2 py-0">
                            <v-layout wrap> 
                            	<v-flex xs12 class="mb-3" v-if="stepModel.allowAssignUser">
                                    <div jx-bind="processAssignUserId"></div>
                                </v-flex>
                                <v-flex xs12>
                                    Nhập ý kiến {{stepModel.actionName}}:
                                    <div jx-bind="processActionNote"></div>
                                </v-flex>
                            </v-layout>
                        </v-card-title>
                        
                        <v-card-actions>
                            <v-btn flat color="primary" class="px-0" :loading="actionsSubmitLoading" :disabled="actionsSubmitLoading"
                            @click.prevent.stop="postNextActions(stepModel)">Xác nhận</v-btn>
                        </v-card-actions> -->
						
						<div v-if="stepModel.configNote && detailModel['specialNo'] != 0">
                        	<v-card-title primary-title class="mx-2 py-0" v-if="detailModel.dossierSubStatus != 'PROCESSING_72' && detailModel.dossierSubStatus != 'PROCESSING_111' && detailModel.dossierSubStatus != 'PROCESSING_112'">
                        		<v-layout wrap> 
                        			<v-flex xs12 class="mb-3" v-if="stepModel.allowAssignUser">
                        				<div jx-bind="processAssignUserId"></div>
                        			</v-flex>
                        			<v-flex xs12>
                        				<span v-if="stepModel.configNote.displayNote">{{ stepModel.configNote.titleNote }}</span>
                        					<!-- <div jx-bind="processActionNote" v-if="stepModel.configNote.displayNote">
                        						
                        					</div> -->
                        					<v-text-field
                        					name="processActionNote"
                        					id="processActionNote"
                        					multi-line
                        					 v-if="stepModel.configNote.displayNote"></v-text-field>
                        			</v-flex>
                        		</v-layout>
                        	</v-card-title>
                        
                        	<v-card-actions>
                        		<v-btn flat color="primary" class="px-0" :loading="actionsSubmitLoading" :disabled="actionsSubmitLoading" v-if="stepModel.configNote.confirmButton"
                        		@click.prevent.stop="postNextActions2(stepModel)">{{ stepModel.configNote.confirmButton }}</v-btn>
                        
                        		<v-btn flat class="px-0" @click.prevent.stop="refreshProcess()" v-if="stepModel.configNote.cancelButton">{{ stepModel.configNote.cancelButton }}</v-btn>
                        	</v-card-actions>
                        </div>
                        
                        <div v-else-if="detailModel['specialNo'] != 0">
                        	<v-card-title primary-title class="mx-2 py-0" v-if="detailModel.dossierSubStatus != 'PROCESSING_72' &&  detailModel.dossierSubStatus != 'PROCESSING_111' && detailModel.dossierSubStatus != 'PROCESSING_112'">
                        		<v-layout wrap> 
                        			<v-flex xs12 class="mb-3" v-if="stepModel.allowAssignUser">
                        				<div jx-bind="processAssignUserId"></div>
                        			</v-flex>
                        			<v-flex xs12>
                        				Nhập ý kiến {{stepModel.actionName}}:
                        				<!-- <div jx-bind="processActionNote">
                        						
                        				</div> -->
                        				<v-text-field
                        				name="processActionNote"
                        				id="processActionNote"
                        				multi-line
                        				></v-text-field>
                        			</v-flex>
                        		</v-layout>
                        	</v-card-title>
                        	
                        	<v-card-actions>
                        		<v-btn flat color="primary" class="px-0" :loading="actionsSubmitLoading" :disabled="actionsSubmitLoading"
                        		v-if="detailModel.dossierSubStatus != 'PROCESSING_72' && detailModel.dossierSubStatus != 'PROCESSING_111' && detailModel.dossierSubStatus != 'PROCESSING_112' && stepModel['actionCode'] != 1101 && stepModel['actionCode'] != 1102"
                        		@click.prevent.stop="postNextActions2(stepModel)">Xác nhận</v-btn>

                        		<v-btn flat color="primary" class="px-0" :loading="actionsSubmitLoading" :disabled="actionsSubmitLoading"
                        		v-else-if="detailModel.dossierSubStatus != 'PROCESSING_72' && detailModel.dossierSubStatus != 'PROCESSING_111' && detailModel.dossierSubStatus != 'PROCESSING_112'"
                        		@click.prevent.stop="kySoHSM(stepModel)">Đồng ý</v-btn>

                        		<#-- <v-btn flat color="primary" class="px-0" :loading="actionsSubmitLoading" :disabled="actionsSubmitLoading" v-if="stepModel['postStepCode'] === 300 || stepModel['postStepCode'] === '300'"
                        		@click.prevent.stop="kySoHSM(stepModel)">Ký số HSM</v-btn> -->
                        	</v-card-actions>
                        </div>
                       
                    </div>
				</v-card>
				<v-card v-if="detailModel.dossierSubStatus == 'PROCESSING_72' || detailModel.dossierSubStatus == 'PROCESSING_111' || detailModel.dossierSubStatus == 'PROCESSING_112'">
					<v-card-text>
						<#include "phieuXuatKho.ftl">
					</v-card-text>
				</v-card>
			</v-tabs-content>
			<v-tabs-content :id="'tab-dossier-detail-3'" reverse-transition="slide-y-transition" transition="slide-y-transition">
			<div class="opencps_list_border_style" jx-bind="listHistoryProcessing"></div>
			</v-tabs-content>
			<v-tabs-content :id="'tab-dossier-detail-4'" reverse-transition="slide-y-transition" transition="slide-y-transition">

				<div id="comments-container" class="pt-3 px-4" style="background: white;"></div>
				<div id="comments-container-pk" style="display: none;">{{detailModel.dossierId}}</div>

			</v-tabs-content>
		</v-tabs-items>
	</v-tabs>
</div>
			
<script type="text/javascript">
		
		function plugin0() {
            return document.getElementById('plugin0');
        }
        var plugin = plugin0;
            
		var fnSaveForm = function (id, value) {
			try {
				if (exportVM) {
					exportVM.actionsSubmitLoading = true;
				}
				var current = $("#btn-save-formalpaca"+id);
				var referentUid = current.attr("referenceUid");
				var dossierId = current.attr("dossierId");
				console.log('dossierId: '+dossierId);
				if(referentUid){
					$.ajax({
						url : "/o/rest/v2/dossiers/"+dossierId+"/files/"+referentUid+"/formdata",
						dataType : "json",
						type : "PUT",
						async : false,
						headers: {
							"groupId": themeDisplay.getScopeGroupId(),
							Accept : "application/json"
						},
						data : {
							formdata: JSON.stringify(value)
						},
						success : function(result){
							console.log(result);
							if (exportVM) {
								$("#validCreateFile" + id).val("1")
								$('#message_warning_' + referentUid).removeClass('hidden');
								setTimeout(
									function () { 
										$('#message_warning_' + referentUid).addClass('hidden');
										exportVM.actionsSubmitLoading = false;
									}, 
									3000);
								$('#message_success_' + referentUid).removeClass('hidden');
								setTimeout(
									function () { 
										$('#message_success_' + referentUid).addClass('hidden');
									}, 
									3000);
							} else {
								$("#validCreateFile" + id).val("1")
								$('#message_success_' + referentUid).removeClass('hidden');
								setTimeout(
									function () { 
										$('#message_success_' + referentUid).addClass('hidden');
									}, 
									3000);
							}
							

							$("#requiredForm"+id).val("1");
							/*var count = $("#btn-part-kq1 > div.btn__content").html().trim() || 0;
							count ++;*/
							//$("#btn-count-partno"+id).html("1");
						},
						error : function(result){
							$('#message_error_'+referentUid).removeClass('hidden');
							setTimeout(
								function(){ 
									$('#message_error_'+referentUid).addClass('hidden');
								}, 
							3000);
						}
					});
				}
			} catch (e) {
				console.log(e);
				if (exportVM) {
					exportVM.actionsSubmitLoading = false;
				}
			}
		};
		
	     var users = [];
	     
	     var getContacts = function(){
	     var dossierIdComment = $('#comments-container-pk').text().trim();
			 $.ajax({
	            url: '/o/rest/v2/dossiers/'+dossierIdComment+'/contacts',
	            type: 'GET',
	            headers: {
	                "groupId": themeDisplay.getScopeGroupId()
	            },
	            async: false,
	            dataType: 'json',
	            data: {
	                userMapping: true
	            },
	            
	            success: function(result) {
	                if(result != null && result.hasOwnProperty('data')){
	                    var contacts = result.data;
	                    
	                    $.each(contacts, function(index, contact){
	                        var user = {};
	                        user.id = contact.userId;
	                        user.fullname = contact.userName;
	                        user.email = contact.email;
	                        user.profilePictureURL = contact.profileUrl
	                        users.push(user);
	                    });
	                  }else{
	                    users = [];
	                }
	                
	                renderComment(users);
	            },
	            error: function(){
	                users = [];
	                renderComment(users);
	            }
	        });

		};
		
		function renderComment(users){

			var dossierId = $('#comments-container-pk').text().trim();
			var groupId = themeDisplay.getScopeGroupId();

            $('#comments-container').comments({
                profilePictureURL: 'https://viima-app.s3.amazonaws.com/media/user_profiles/user-icon.png',
                textareaRows: 1,
                enableAttachments: true,
                enableHashtags: true,
                enablePinging: true,
                postCommentOnEnter: false,
                forceResponsive: false,
                readOnly: false,
                newestText: "Mới nhất",
                oldestText: "Cũ nhất",
                popularText: "Phổ biến",
                attachmentsText: "Đính kèm",
                sendText: "Gửi",
                replyText: "Trả lời",
                editText: "Sửa",
                editedText: "Đã sửa",
                youText: "Bạn",
                saveText: "Ghi lại",
                deleteText: "Xóa",
                viewAllRepliesText: "Xem tất cả câu trả lời",
                hideRepliesText: "Ẩn câu trả lời",
                noCommentsText: "Không có bình luận nào",
                noAttachmentsText: "Không có tệp đính kèm",
                attachmentDropText: "Kéo thả tệp đính kèm",
                fieldMappings: {
                    id: 'commentId',
                    parent: 'parent',
                    userId: 'userId',
                    created: 'createdDate',
                    modified: 'modifiedDate',
                    content: 'content',
                    fileURL: 'fileUrl',
                    fileMimeType: 'fileType',
                    fileName: 'fileName',
                    pings: 'pings',
                    creator: 'userId',
                    fullname: 'fullname',
                    profileURL: 'profileUrl',
                    profilePictureURL: 'pictureUrl',
                    isNew: 'isNew',
                    createdByAdmin: 'isAdmin',
                    createdByCurrentUser: 'createdByCurrentUser',
                    upvoteCount: 'upvoteCount',
                    userHasUpvoted: 'userHasUpvoted',
                    email: 'email',
                    className: 'className',
                    classPK: 'classPK',
                },
                
                timeFormatter: function(time) {
                    
                    if(time != null){
                        
                        var dt  = time.split(/\ |\s/);
                        if(dt.length == 2){
                            var d = dt[0].split(/\-|\s/);
                        
                            return (d.slice(0,3).reverse().join('/')) + ' ' + dt[1];
                        }else{
                            return time;
                        }
                    }
                    
                    return '';
                },
                
                getUsers: function(onSuccess, onError) {
                   onSuccess(users);
                   onError();
                },
                
                getComments: function(onSuccess, onError) {
                    $.ajax({
                        url: '/o/rest/v2/comments/org.opencps.dossiermgt.model.Dossier/'+ dossierId,
                        type: 'GET',
                        headers: {
                            "groupId": groupId
                        },
                        async: false,
                        dataType: 'json',
                        data: {
                            
                        },
                        success: function(comments) {
                         
                            var data = [];

                            if (comments.hasOwnProperty('data')) {
                                $.each(comments.data, function(index, comment){
                                    data.push(formatComment(comment, users));
                                });
                                onSuccess(data);
                            }
                            
                        },
                        error: function(xhr){
                            onSuccess([]);
                            onError();
                        }
                    });
                },
                postComment: function(data, onSuccess, onError) {
                    var strPings = data.pings.join();
                    $.ajax({
                        url: '/o/rest/v2/comments',
                        type: 'POST',
                        headers: {
                            "groupId": groupId
                        },
                        async: false,
                        dataType: 'json',
                        data: {
                            className: 'org.opencps.dossiermgt.model.Dossier',
                            classPK: dossierId,
                            parent: data.parent != null ? data.parent : 0,
                            pings: strPings,
                            content: data.content,
                            upvoteCount: data.upvoteCount
                        },
                        success: function(comment) {
                            if(comment != null){
                                onSuccess(formatComment(comment, users));
                            }else{
                                onSuccess([]);
                            }
                            
                        },
                        error: function(xhr){
                            onError();
                        }
                    });
                },
                putComment: function(data, onSuccess, onError) { 
                    $.ajax({
                        url: '/o/rest/v2/comments/' + data.commentId,
                        type: 'PUT',
                        headers: {
                            "groupId": groupId
                        },
                        async: false,
                        dataType: 'json',
                        data: {
                            className: 'org.opencps.dossiermgt.model.Dossier',
                            classPK: dossierId,
                            parent: data.parent != null ? data.parent : 0,
                            pings: data.pings.join(),
                            content: data.content,
                            upvoteCount: data.upvoteCount
                        },
                        success: function (comment) {
                            onSuccess(formatComment(comment, users));
                        },
                        error: function (xhr) {
                            onError();
                        }
                    });
                },
                deleteComment: function(data, onSuccess, onError) {
                   	$.ajax({
                        url: '/o/rest/v2/comments/' + data.commentId,
                        type: 'DELETE',
                        data: data,
                        async: false,
                        dataType: 'json',
                        success: function(comment) {
                            onSuccess();
                        },
                        error: function(xhr){
                            onError();
                        }
                    });
                },
                upvoteComment: function(data, onSuccess, onError) {
                    
                    if(data.userHasUpvoted){
                        $.ajax({
                            url: '/o/rest/v2/comments/' + data.commentId + '/upvotes',
                            type: 'PUT',
                            headers: {
                                "groupId": groupId
                            },
                            async: false,
                            dataType: 'json',
                            data: {
                                commentId: data.commentId,
                                className: data.className,
                                classPK: data.classPK,
                                upvoteCount: data.upvoteCount
                            },
                            success: function(comment) {
                                onSuccess(formatComment(comment, users));
                            },
                            error: function(xhr){
                                onError();
                            }
                        });
                    }else{
                        $.ajax({
                            url: '/o/rest/v2/comments/' + data.commentId + '/upvotes',
                            type: 'DELETE',
                            data: {
                                commentId: data.commentId,
                                className: data.className,
                                classPK: data.classPK,
                                upvoteCount: data.upvoteCount
                            },
                            async: false,
                            dataType: 'json',
                            success: function(comment) {
                                onSuccess(formatComment(comment, users));
                                
                            },
                            error: function(xhr){
                                onError();
                            }
                        });
                    }
                },
                uploadAttachments: function(comments, onSuccess, onError) {
                    var responses = 0;
                    var successfulUploads = [];
                    var serverResponded = function () {
                        responses++;
                        if(responses == comments.length) {
                            if(successfulUploads.length == 0) {
                                onError()
                            } else {
                                onSuccess(successfulUploads)
                            }
                        }
                    }
                    $(comments).each(function(index, comment) {
                        var formData = new FormData();
                        
                        $(Object.keys(comment)).each(function(index, key) {
                            var value = comment[key];
                            if(value) formData.append(key, value);
                        });
                        
                        formData.append('className', 'org.opencps.dossiermgt.model.Dossier');
                        
                        formData.append('classPK', dossierId);
                        
                        formData.append('parent', comment.parent != null ? comment.parent : 0);
                        
                        formData.append('fileName', comment.file.name);
                        
                        formData.append('fileType', comment.file.type);
                        
                        formData.append('fileSize', comment.file.size);
                        
                        formData.append('pings', comment.pings.join());
                        
                        formData.append('email', themeDisplay.getUserId());
                        
                        formData.append('fullname', themeDisplay.getUserName());
    
                        $.ajax({
                            url: '/o/rest/v2/comments/uploads',
                            dataType: 'json',
                            type: 'POST',
                            headers: {
                                "groupId": groupId
                            },
                            data: formData,
                            cache: false,
                            contentType: false,
                            processData: false,
                            success: function(comment) {
                                comment = formatComment(comment, users);
                                successfulUploads.push(comment);
                                serverResponded();                      
                            },
                            error: function(xhr, data) {
                                serverResponded();
                            }
                        });
                    });
                }
            });
        }
		
		function formatComment(comment, users){
			
			if(comment.parent == 0){
				comment.parent = null;
			}
			
			if(comment.fileName == ""){
				comment.fileName = null;
			}
			
			if(comment.fileType == ""){
				comment.fileType = null;
			}
			
			if(comment.fileUrl == ""){
				comment.fileUrl = null;
			}
			
			if(comment.pictureUrl ==""){
			    comment.pictureUrl = null;
			}
			
			if(comment.profileUrl ==""){
                comment.profileUrl = null;
            }
            
            if(comment.pings ==""){
                comment.pings = null;
            }else{
                var pings = comment.pings.toString();
                var arrPings = pings.split(",");
                
               
                $(arrPings).each(function(index, id) {
                    
                    $(users).each(function(i, user) {
                       
                         if(id == user.id){
                             comment.content = comment.content.replace('@' + id, '@' + users[i].fullname);
                             return false; 
                        }
                        
                    });
                    
                });
                
            }
			
			var createdDate = new Date(comment.createDate);
			
			var createdDateText = "2017-12-12 12:12";
			
			var modifiedDate = new Date(comment.modifiedDate);
			
			var modifiedDateText = "2017-12-12 12:12";
			
			comment.createdDate = createdDateText;
			
			comment.modifiedDate = modifiedDateText;
			
			return comment;
		}

</script>
