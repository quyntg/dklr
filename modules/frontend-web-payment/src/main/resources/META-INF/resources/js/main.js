var exportVM = null;
document.addEventListener('DOMContentLoaded', function (event) {

	var paymentViewJX = new VueJX({
		el: 'paymentViewJX',
		pk: 1,
		groupid: themeDisplay.getScopeGroupId(),
		data: {
			offsetTop: 0,
			detailPage: false,
			viewmore: false,
			showmore: false,
			detailModel: {
				hasFile: true
			},
			xem_them: 'Không tìm thấy phiếu thanh toán nào'

		},
		onScroll: 'onScroll',
		schema: {
			/** TODO menu filter */
			'navigationFilter': {
				'id': 'navigationFilter',
				'name': 'navigationFilter',
				'type': 'navigation',
				'template': 'menu_template',
				'template_content': 'paymentViewJX_form_template'
			},
			'listgroupFilter': {
				'id': 'listgroupFilter',
				'name': 'listgroupFilter',
				'type': 'listgroup',
				'child_items': 'items',
				'data_title': 'title',
				'data_value': 'id',
				'onLoad': '_initlistgroupFilter',
				'onClick': 'filterChange',
				'events': {
					filterChange: function (item) {
						var vm = this;

						vm.paymentListpage = 1;
						vm.listgroupFilterselected = item.id;
						vm._inipaymentList(false);
						vm.detailPage = false;

					},
					_initlistgroupFilter: function () {
						var vm = this;
						this.listgroupFilterItems = [
							{
								action: 'folder',
								action_active: 'folder_open',
								id: '0,1',
								title: 'Xác nhận thanh toán',
								active: true
							},
							{
								action: 'folder',
								action_active: 'folder_open',
								id: '2',
								title: 'Đã thanh toán'
							},
							{
								action: 'folder',
								action_active: 'folder_open',
								id: '4',
								title: 'Đã cấp hoá đơn điện tử'
							}
						];
						vm.listgroupFilterselected = '0,1';
					}
				}
			},
			/** TODO filter component */
			'paymentMethodSearch': {
				'id': 'paymentMethodSearch',
				'name': 'paymentMethodSearch',
				'type': 'radio',
				'label': '',
				'labelClass': '',
				'controlClass': 'xs12',
				'switch_inline': true,
				'tabindex': 0,
				'items': [
					{
						'label': 'Tiền mặt',
						'color': 'blue darken-2',
						'value': 2,
					},
					{
						'label': 'Chuyển khoản',
						'color': 'blue darken-2',
						'value': 1,
					}
				],
				'onLoad': '_initpaymentMethodSearch',
				'events': {
					_initpaymentMethodSearch: function () {

						this.paymentMethodSearch = 'Nộp trực tiếp';

					}
				}
			},
			'paymentConfirm': {
				'id': 'paymentConfirm',
				'name': 'paymentConfirm',
				'cssClass': 'btn--flat ml-0 pl-0',
				'label': 'Xác nhận',
				'type': 'button',
				'left_icon': 'done_all',
				'onClick': 'paymentConfirmAction',
				'events': {
					paymentConfirmAction: function () {
						var vm = this;

						if (vm.paymentListselected.length === 0) {
							alert('Chưa chọn phiếu thanh toán nào?. ');
							return;
						}

						var labelBtn = 'Xác nhận';

						var dateConfirmPayment = new Date();
						var month = dateConfirmPayment.getMonth() + 1;
						var day = dateConfirmPayment.getDate();
						var year = dateConfirmPayment.getFullYear();

						var dialogContent = '<strong>Ngày xác nhận thu phí: </strong> ' + day + '/' + month + '/' + year + ' <br/>';
						dialogContent += '<strong>Người thực hiện: </strong> ' + themeDisplay.getUserName() + ' <br/>';
						dialogContent += '<strong>Hình thức thanh toán: </strong> ' + vm.paymentMethodSearch == 1 ? 'Chuyển khoản' : 'Tiền mặt' + ' <br/>';
						dialogContent += '<strong>Xác nhận thu phí cho: </strong> ' + vm.paymentListselected.length + ' phiếu thanh toán. <br/>';

						vm.$dialog.confirm(dialogContent, {
							html: true,
							loader: true,
							okText: labelBtn,
							cancelText: 'Quay lại',
							animation: 'fade'
						})
							.then(function (dialog) {

								for (var i = vm.paymentListItems.length - 1; i >= 0; i--) {
									for (var j = 0; j < vm.paymentListselected.length; j++) {

										var currentItem = vm.paymentListItems[i];
										var currentItemSelected = vm.paymentListselected[j];

										if (currentItem != null && currentItemSelected != null
											&& currentItem.dossierId === currentItemSelected.dossierId) {

											var url = '/o/rest/v2/dossiers/' + vm.paymentListselected[j].dossierId + '/payments/' + vm.paymentListselected[j].referenceUid + '/approval/noattachment';


											$.ajax({
												url: url,
												headers: {
													"groupId": themeDisplay.getScopeGroupId()
												},
												data: {
													confirmNote: vm.paymentListselected[j].confirmNote,
													paymentMethod: vm.paymentMethodSearch == 1 ? 'Chuyển khoản' : 'Tiền mặt',
													paymentMethodCode: vm.paymentMethodSearch == 1 ? 'Chuyển khoản' : 'Tiền mặt',
													confirmPayload: '',
													approveDatetime: vm.paymentListselected[j].approveDatetime,
													accountUserName: vm.paymentListselected[j].accountUserName,
													govAgencyTaxNo: vm.paymentListselected[j].govAgencyTaxNo,
													invoiceTemplateNo: vm.paymentListselected[j].invoiceTemplateNo,
													invoiceIssueNo: vm.paymentListselected[j].invoiceIssueNo,
													invoiceNo: vm.paymentListselected[j].invoiceNo,
													isSync: "true"
												},
												type: "PUT",
												dataType: 'json',
												contentType: 'application/x-www-form-urlencoded; charset=utf-8',
												success: function (result) {
													vm.snackbartextpaymentViewJX = "Xác nhận thanh toán thành công!";
													vm.snackbarpaymentViewJX = true;
												},
												error: function (result) {
													vm.snackbartextpaymentViewJX = "Xác nhận thanh toán thất bại!";
													vm.snackbarerorpaymentViewJX = true;
												}
											});

											vm.paymentListItems.splice(i, 1);

										}

									}
								}

								vm.paymentListselected = [];
								dialog.close();
							})
							.catch(function (e) {
								console.log(e)
							})
					},
					paymentConfirmSingle: function (index) {
						var vm = this;
						console.log(vm.paymentMethodSearch);


						console.log("detail+++++++", vm.detailModel);
						var labelBtn = 'Xác nhận';
						console.log("call333333");
						var dateConfirmPayment = new Date();
						var month = dateConfirmPayment.getMonth() + 1;
						var day = dateConfirmPayment.getDate();
						var year = dateConfirmPayment.getFullYear();

						var dialogContent = '<strong>Ngày xác nhận thu phí: </strong> ' + day + '/' + month + '/' + year + ' <br/>';
						dialogContent += '<strong>Người thực hiện: </strong> ' + themeDisplay.getUserName() + ' <br/>';

						vm.$dialog.confirm(dialogContent, {
							html: true,
							loader: true,
							okText: labelBtn,
							cancelText: 'Quay lại',
							animation: 'fade'
						})
							.then(function (dialog) {

								var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/payments/' + vm.detailModel.referenceUid + '/approval/noattachment';

								/* TODO: confirmPayload tam thoi khong truyen len*/

								$.ajax({
									url: url,
									headers: {
										"groupId": themeDisplay.getScopeGroupId()
									},
									data: {
										confirmNote: vm.detailModel.confirmNote,
										paymentMethodCode: vm.paymentMethodSearch == 1 ? 'Chuyển khoản' : 'Tiền mặt',
										paymentMethod: vm.paymentMethodSearch == 1 ? 'Chuyển khoản' : 'Tiền mặt',
										confirmPayload: '',
										approveDatetime: vm.detailModel.approveDatetime,
										accountUserName: vm.detailModel.accountUserName,
										govAgencyTaxNo: vm.detailModel.govAgencyTaxNo,
										invoiceTemplateNo: vm.detailModel.invoiceTemplateNo,
										invoiceIssueNo: vm.detailModel.invoiceIssueNo,
										invoiceNo: vm.detailModel.invoiceNo,
										isSync: "true"
									},
									type: "PUT",
									dataType: 'json',
									contentType: 'application/x-www-form-urlencoded; charset=utf-8',
									success: function (result) {
										vm.snackbartextpaymentViewJX = "Xác nhận thanh toán thành công!";
										vm.snackbarpaymentViewJX = true;
										vm.detailPage = false;
									},
									error: function (result) {
										vm.snackbartextpaymentViewJX = "Xác nhận thanh toán thất bại!";
										vm.snackbarerorpaymentViewJX = true;
									}
								});



								vm.paymentListItems.splice(index, 1);

								dialog.close();
							})
							.catch(function () {
								console.log('process aborted');
							})
					},
					paymentCapLai: function (dossierId) {
						var vm = this;
						console.log(dossierId);

						var labelBtn = 'Xác nhận';

						var dialogContent = 'Xác nhận cấp lại Hoá đơn điện tử';

						vm.$dialog.confirm(dialogContent, {
							html: true,
							loader: true,
							okText: labelBtn,
							cancelText: 'Quay lại',
							animation: 'fade'
						})
						.then(function (dialog) {

							var url = '/o/rest/vr-app/cap/hddt/' + dossierId;

							$.ajax({
								url: url,
								headers: {
									"groupId": themeDisplay.getScopeGroupId()
								},
								data: {
									paymentMethod: vm.detailModel.paymentMethod
								},
								type: "GET",
								dataType: 'json',
								contentType: 'application/x-www-form-urlencoded; charset=utf-8',
								success: function (result) {
									vm.snackbartextpaymentViewJX = "Xác nhận thành công!";
									vm.snackbarpaymentViewJX = true;
									vm.detailPage = false;

									vm.paymentListItems.forEach(function(item, index){
										if (item['dossierId'] == dossierId) {
											vm.paymentListItems.splice(index, 1);
										}
									});
								},
								error: function (result) {
									vm.snackbartextpaymentViewJX = "Xác nhận thất bại!";
									vm.snackbarerorpaymentViewJX = true;
								}
							});

							dialog.close();
						})
						.catch(function () {
							console.log('process aborted');
						})
					}
				}
			},
			'keywordsSearch': {
				'id': 'keywordsSearch',
				'name': 'keywordsSearch',
				'type': 'text',
				'placeholder': 'Tìm kiếm theo mã hồ sơ / số hồ sơ',
				'solo': true,
				'append_icon': 'search',
				'onKeyup': 'filterTableKeywords',
				'events': {
					filterTableKeywords: function (event) {
						var vm = this;
						if (event.keyCode === 13 || vm.keywordsSearch.length > 3 || vm.keywordsSearch.length === 0) {
							vm._inipaymentList(false);
						}

					}
				}
			},
			/** TODO menu filter */
			'paymentList': {
				'id': 'paymentList',
				'name': 'paymentList',
				'type': 'table',
				'cssClass': 'danhSachPaymentTable__class',
				'select_all': true,
				'item_key': 'dossierId',
				'headers': 'headers',
				'template': 'activity_expand_list_template',
				'pagging': '_paggingPaymentList',
				'next': '_nextPaymentList',
				'previous': '_previousPaymentList',
				'onLoad': '_inipaymentList',
				'events': {
					_inipaymentList: function (append) {

						var vm = this;
						exportVM = this;
						vm.viewmore = true;
						this.paymentListheaders = [
							{
								text: 'STT',
								align: 'center',
								sortable: false,
								value: 'stt'
							},
							{
								text: 'Tên thủ tục',
								align: 'left',
								sortable: true,
								value: 'serviceName'
							},
							{
								text: 'Số phiếu tính tiền \nHình thức thanh toán',
								align: 'center',
								sortable: true,
								value: 'dossierNo'
							},
							{
								text: 'Ngày lập phiếu',
								align: 'center',
								sortable: true,
								value: 'createDate'
							},
							{
								text: 'Tổng tiền',
								align: 'center',
								sortable: true,
								value: 'paymentAmount'
							},
							{
								text: 'Tên doanh nghiệp',
								align: 'center',
								sortable: true,
								value: 'applicantName'
							},
							{
								text: 'Mã hồ sơ / \nSố hồ sơ / \nMã hồ sơ MCĐT',
								align: 'center',
								sortable: false,
								value: 'dossierId'
							},
							{
								text: 'Thông tin sản phẩm',
								align: 'center',
								sortable: false,
								value: 'action'
							}
						];

						var paramsBuilder = {
							keyword: vm.keywordsSearch,
							start: vm.paymentListpage * 15 - 15,
							end: vm.paymentListpage * 15,
						};


						if (vm.listgroupFilterselected == 4) {
							// TODO
							// paramsBuilder['statusTEMP'] = vm.listgroupFilterselected;
							paramsBuilder['eInvoiceStatus'] = 1;
						} else {
							paramsBuilder['status'] = vm.listgroupFilterselected;
						}

						var config = {
							params: paramsBuilder,
							headers: {
								'groupId': themeDisplay.getScopeGroupId()
							}

						};

						var url = '/o/rest/v2/dossiers/paymentfiles';

						axios.get(url, config).then(function (response) {
							var serializable = response.data;
							var data = serializable.data;
							if (data) {
								for (var i = 0; i < data.length; i++) {

									data[i].createDate = vm.parseDateUtc(data[i].createDate);
									data[i].modifiedDate = vm.parseDateUtc(data[i].modifiedDate);
									var referenceUid = data[i].referenceUid;
									var refs = referenceUid.split("-");
									var referenceUidKey = refs[refs.length - 1];
									data[i].referenceUidKey = referenceUidKey.toUpperCase();

								}

							}

							if (append) {
								vm.paymentListItems.push.apply(vm.paymentListItems, data);

							} else {

								vm.paymentListTotal = Math.ceil(serializable.total / 15);
								vm.paymentListItems = data;

							}

							vm.xem_them = 'Xem thêm 15+ bản ghi';
							if (serializable['data'] && serializable['data']['length'] === 0) {
								vm.xem_them = 'Tổng số ( ' + vm.paymentListItems.length + ' ) bản ghi'
							}
							vm.viewmore = false;
						})
							.catch(function (error) {
								console.log(error);
								vm.paymentListItems = [];
								vm.viewmore = false;
							});

					},
					parseDateUtc: function (date) {
						return moment(String(date)).utc().format('DD/MM/YYYY HH:mm:ss');
					},
					_paggingPaymentList: function () {

						this._inipaymentList(false);
					},
					_nextPaymentList: function () {

					},
					_previousPaymentList: function () {

					},
					toPaymentDetail: function (item) {
						var vm = this;
						vm.detailPage = !vm.detailPage;

						vm.detailModel = item;
						//vm.detailModel.index = index;

						console.log("detail================", vm.detailModel);

						// TODO: call API lay file
						var url = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/payments/" + vm.detailModel.referenceUid + "/invoicefile";
						vm._showFile({
							config: {
								headers: { 'groupId': themeDisplay.getScopeGroupId() },
								responseType: 'blob'
							},
							url: url
						});

						window.scrollBy(0, -99999);
					},
					_showFile: function (options) {
						var vm = this;
						vm.detailModel['hasFile'] = true;
						console.log('options-----', options)
						axios.get(options.url, options.config).then(function (response) {
							console.log('detailModel-----', vm.detailModel)
							var url = window.URL.createObjectURL(response.data);
							console.log('data-----', response.data)
							console.log('url-----', url)
							$('#objectView2').html('<iframe src="' + url + '" width="100%" height="100%"> </iframe>')
						})
							.catch(function (error) {
								vm.detailModel.hasFile = false;
								console.log(error);
							});

					},
					backToList: function () {
						var vm = this;
						vm.detailPage = !vm.detailPage;
						vm._inipaymentList(false);

					},
					paggingPaymentList: function () {
						this.start = this.start + 15;
						this.end = this.end + 15;

						this._inipaymentList(false);
					},
					onScroll: function (e) {
						this.offsetTop = window.pageYOffset || document.documentElement.scrollTop
						console.log('offsetTop====', this.offsetTop);
					},
					onScrollTop: function (e) {
						window.scrollBy(0, -99999)
					}
				}
			}

		}
	});

	paymentViewJX._builder('paymentViewJX');

});