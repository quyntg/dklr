

var funLoadVue = function (stateWindowParam, dossierIdParam, dossierPartNo, emailAddress, urlAddCoSoNuocNgoai, urlGetDictGroup, portletNamespace) {
	const config = {
		headers: {
			'groupId': themeDisplay.getScopeGroupId()
		}
	};
	const itemCodeNuocNgoai = 'VR86';

	var dossierViewJX = new VueJX({
		el: 'dossierViewJX',
		pk: 1,
		groupid: themeDisplay.getScopeGroupId(),
		data: {
			offsetTop: 0,
			stageFilterView: null,
			detailPage: false,
			detailRegistPage: false,
			viewmore: false,
			detailModel: {},
			detailRegistModel: {},
			xem_them: 'Không tìm thấy hồ sơ nào',
			hoso_title_table: 'Danh sách hồ sơ',
			processSteps: [],
			stepModel: null,
			showContactDetail: false,
			dossierFiles: [],
			statusParamFilter: null,
			substatusParamFilter: null,
			loadingAlpacajsForm: false,
			stepLoading: false,
			actionsSubmitLoading: false,
			popupResultFile: false,
			traCuuFilter: false,
			registForms: [],
			alapcaJSRei: {},
			menu: false,
			dateFormatted: null,
			advanced_filter: false,
			advanced_filter_all: false,
			alpacaAssignUserId: 0,
			subUsers: [],
			currentCounter : 0,
			currentCounterTemp : 0,
			listgroupHoSoFilterselected: '',
			listgroupHoSoFilterselectedIndex: -1,
			advancedFilterServiceInfo : {},
			advancedFilterLoaiSanPham : {},
			advancedFilterNhanHieu : {},
			advancedFilterDossierStatus : {},
			stateOnlyFollow : false,
			stateButtonregistration : true,
			follow : true,
			doiPhongItems: [],
			searchDoiPhong: '',
			soSerial: '',
			mauPhoiItems: [],
			searchMauPhoi: '',
			namItems: [
				2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023
			],
			searchNam: '',
			headersPxx: [
			{
				text: 'STT',
				align: 'center',
				sortable: false,
				value: 'stt'
			},
			{
				text: 'Kiểm kê',
				align: 'center',
				sortable: false,
				value: 'kiemke'
			},
			{
				text: 'Năm',
				align: 'center',
				sortable: false,
				value: 'nam'
			},
			{
				text: 'Mẫu phôi',
				align: 'center',
				sortable: false,
				value: 'mauphoi'
			},
			{
				text: 'Số seri',
				align: 'center',
				sortable: false,
				value: 'soseri'
			},
			{
				text: 'Từ số',
				align: 'center',
				sortable: false,
				value: 'tuso'
			},
			{
				text: 'Đến số',
				align: 'center',
				sortable: false,
				value: 'denso'
			},
			{
				text: 'Nhập kho',
				align: 'center',
				sortable: false,
				value: 'nhapkho'
			},
			{
				text: 'Xuất kho',
				align: 'center',
				sortable: false,
				value: 'xuatkho'
			},
			{
				text: 'Tồn trên số',
				align: 'center',
				sortable: false,
				value: 'tontrenso'
			},
			{
				text: 'Kiểm kê',
				align: 'center',
				sortable: false,
				value: 'kiemke2'
			},
			{
				text: 'Chênh lệch',
				align: 'center',
				sortable: false,
				value: 'chenhlechtanggiam'
			},
			{
				text: 'Ngày kiểm kê <br> nguyên nhân',
				align: 'center',
				sortable: false,
				value: 'ngaykiemke,nguyennhan'
			}
			],
			headersXuatKhoDSSP: [
			{
				text: 'STT',
				align: 'center',
				sortable: false,
				value: 'stt'
			},
			{
				text: 'Số serial',
				align: 'center',
				sortable: false,
				value: 'soserial'
			},
			{
				text: 'Từ số',
				align: 'center',
				sortable: false,
				value: 'tuso'
			},
			{
				text: 'Đến số',
				align: 'center',
				sortable: false,
				value: 'denso'
			},
			{
				text: 'Số lượng',
				align: 'center',
				sortable: false,
				value: 'soluong'
			},
			{
				text: 'Đơn giá',
				align: 'center',
				sortable: false,
				value: 'dongia'
			},
			{
				text: 'Thành tiền',
				align: 'center',
				sortable: false,
				value: 'thanhtien'
			},
			{
				text: 'Ngày xuất xưởng',
				align: 'center',
				sortable: false,
				value: 'ngayxuatxuong'
			},
			{
				text: 'Hành động',
				align: 'center',
				sortable: false,
				value: 'hanhdong'
			}
			],
			dsGCNXuatKhoItems: [],
			itemsPxx: [],
			lengthPxx: 1,
			pagePxx: 1,
			chiTietKiemKeItems: [],
			chiTietKiemKeModel: {
				theoSoKeToan: 0,
				theoKiemKe: 0,
				chenhLech: 0
			},
			headersDSSP: [
			{
				text: 'STT',
				align: 'center',
				sortable: false,
				value: 'stt'
			},
			{
				text: 'Số serial',
				align: 'center',
				sortable: false,
				value: 'soserial'
			},
			{
				text: 'Từ số',
				align: 'center',
				sortable: false,
				value: 'tuso'
			},
			{
				text: 'Đến số',
				align: 'center',
				sortable: false,
				value: 'denso'
			},
			{
				text: 'Số lượng',
				align: 'center',
				sortable: false,
				value: 'soluong'
			}
			],
			dsGCNItems: [],
			selected: [],
			dieuChuyenItems: [],
			dieuChuyen: '',
			doiTuongItems: [],
			thongTinPhieu: {},
			tongTien: 0,
			stateAddPhieu: 'dieu_chuyen',
			soGCN_add: '',
			nhanHieu_add: '',
			soLoai_add: '',
			loaiPhuongTien_add: '',
			soLuong_add: '',
			donGia_add: '',
			ngayXuatXuong_add: '',
			popUpAddGCN: false,
			popUpDieuCHuyen: false,
			loadingPxx: false,
			detailGCN: {},
			headersChiTietPhieu: [
			{
				text: 'STT',
				align: 'center',
				sortable: false,
				value: 'stt'
			},
			{
				text: 'Số seri',
				align: 'center',
				sortable: false,
				value: 'soseri'
			},
			{
				text: 'Số phiếu quản lý',
				align: 'center',
				sortable: false,
				value: 'sophieuquanly'
			},
			{
				text: 'Ngày XX',
				align: 'center',
				sortable: false,
				value: 'ngayxx'
			},
			{
				text: 'Màu sơn',
				align: 'center',
				sortable: false,
				value: 'mauson'
			},
			{
				text: 'Số khung',
				align: 'center',
				sortable: false,
				value: 'sokhung'
			},
			{
				text: 'Số động cơ',
				align: 'center',
				sortable: false,
				value: 'sodongco'
			}
			],
			dsCTPItems: [
			],
			chiTietGCNModel: {},
			popUpChiTietKiemKe: false,
			hoSoItems: [],
			hoSo: '',
			popUpChiTietPhieu: false,
			coSoInItems: [],
			coSoIn: '',
			dateNgayXuatXuong_add : '',
			menuNgayXuatXuong_add: false,
			menuNgayNhap: false,
			dateNgayNhap: '',
			totalPxx: 0,
			tabActive: 'tab-dossier-detail-1',
			listGroupMenus: [],
			showGroupMenus: false,
			indexSelectMenu: -1,
			indexGroupMenu: -1,
			coSoSanXuatItems: [],
			headersDSPNK: [
				{
					text: 'STT',
					align: 'center',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Số phiếu',
					align: 'center',
					sortable: false,
					value: 'sophieu'
				},
				{
					text: 'Ngày nhập',
					align: 'center',
					sortable: false,
					value: 'ngaynhap'
				},
				{
					text: 'Đối tượng',
					align: 'center',
					sortable: false,
					value: 'doituong'
				},
				{
					text: 'Trạng thái',
					align: 'center',
					sortable: false,
					value: 'trangthai'
				}
			],
			itemsDSPNK: [],
			lengthDSPNK: 0,
			pageDSPNK: 1,
			headersDSPXK: [
				{
					text: 'STT',
					align: 'center',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Số phiếu',
					align: 'center',
					sortable: false,
					value: 'sophieu'
				},
				{
					text: 'Ngày xuất',
					align: 'center',
					sortable: false,
					value: 'ngaynhap'
				},
				{
					text: 'Đối tượng',
					align: 'center',
					sortable: false,
					value: 'doituong'
				},
				{
					text: 'Trạng thái',
					align: 'center',
					sortable: false,
					value: 'trangthai'
				}
			],
			itemsDSPXK: [],
			lengthDSPXK: 0,
			pageDSPXK: 1,
			stateNumberSerial: 1,
			dsSoSerialItems: [],
			headersPTSXLR: [
				{
					text: 'STT',
					align: 'center',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Số ĐKKT <br> Ngày ĐKKT',
					align: 'center',
					sortable: false,
					value: 'sodkkt'
				},
				{
					text: 'Số BBKT <br> Ngày BBKT',
					align: 'center',
					sortable: false,
					value: 'sobbkt'
				},
				{
					text: 'Số chứng chỉ <br> Ngày cấp',
					align: 'center',
					sortable: false,
					value: 'sochungchi'
				},
				{
					text: 'Số khung',
					align: 'center',
					sortable: false,
					value: 'sokhung'
				},
				{
					text: 'Số động cơ',
					align: 'center',
					sortable: false,
					value: 'sodongco'
				},
				{
					text: 'Màu sơn <br> Năm sản xuất',
					align: 'center',
					sortable: false,
					value: 'mauson'
				},
				{
					text: 'Tên doanh nghiệp',
					align: 'center',
					sortable: false,
					value: 'tendoanhnghiep'
				},
				{
					text: 'Thao tác Xem',
					align: 'center',
					sortable: false,
					value: 'thaotacxem'
				}
			],
			itemsPTSXLR: [],
			lengthPTSXLR: 0,
			pagePTSXLR: 0,

			tcDoiTuongItems: [],
			tcDoiTuong: '',
			tcPphuongTienItems: [],
			tcPhuongTien: '',
			tcSoHoSo: '',
			menuTcNgayNop: false,
			tcNgayNop: '',
			dateTcNgayNop: '',
			menuTcNgayNopDenNgay: false,
			tcNgayNopDenNgay: '',
			dateTcNgayNopDenNgay: '',
			tcNamItems: [2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2001, 2000],
			tcNam1: '',
			tcSoDKKT: '',
			menuTcNgayCapDKKTTuNgay: false,
			tcNgayCapDKKTTuNgay: '',
			dateTcNgayCapDKKTTuNgay: '',
			menuTcNGayKTDenNGay: false,
			tcNGayKTDenNGay: '',
			dateTcNGayKTDenNGay: '',
			tcNam2: '',
			tcSoBBKiemTra: '',
			menuTcNgayKT: false,
			tcNgayKT: '',
			dateTcNgayKT: '',
			menuTcNgayKTDenNgay: false,
			tcNgayKTDenNgay: '',
			dateTcNgayKTDenNgay: '',
			tcNam3: '',
			tcSoChungChi: '',
			menuTcNgayCapCC: false,
			tcNgayCapCC: '',
			dateTcNgayCapCC: '',
			menuTcNgayCapCcDEnNgay: false,
			tcNgayCapCcDEnNgay: '',
			dateTcNgayCapCcDEnNgay: '',
			tcNam4: '',
			tcSoToKhai: '',
			menuTcNgayToKhaiHQ: false,
			tcNgayToKhaiHQ: '',
			dateTcNgayToKhaiHQ: '',
			menuTcNgayToKhaiHqDenNgay: false,
			tcNgayToKhaiHqDenNgay: '',
			dateTcNgayToKhaiHqDenNgay: '',
			tcNam5: '',
			tcDiaDiemDKKT: '',
			tcMauXeCB: false,
			tcLoaiPhuongTienGT: '',
			tcDiaDiemItems: [],
			tcDiaDiemSL: '',
			unknowItems: [],
			tcUnknow: '',
			tcNhanHieu: '',
			tcMaKieuLoai: '',
			tcDonViKiemTraItems: [],
			tcDonViKiemTra: '',
			tcTenThuongMai: '',
			tcSoPinSoSerial: '',
			tcDangKiemVienItems: [],
			tcDangKiemVien: '',
			tcSoKhungSoVin: '',
			tcSoDongCo: '',
			tcDoanhNghiep: '',
			tcNuocSanXuat: '',
			tcNamSX: '',
			tcMaSoThue: '',
			tcSoHoaDon: '',
			tcMauSon: '',
			tcTinhTrangItems: [
				{
					itemCode: 'chuasudung',
					itemName: 'Chưa sử dụng'
				},
				{
					itemCode: 'dasudung',
					itemName: 'Đã sử dụng'
				},
				{
					itemCode: 'other',
					itemName: 'Loại khác'
				}
			],
			tcTinhTrang: '',
			tcSoBCTNAnToan: '',
			tcTenNhaMaySX: '',
			tcSoBCTNKhiThai: '',
			tcDiaChiNhaMaySX: '',
			tcSoBCCOP: '',
			tcTieuChuanKhiThai: '',
			tcPhuongThucCapPPItems: [],
			tcPhuongThucCapPP: '',
			tcDoiTuongCb: false,
			tcLoaiPhuongTienCb: false,
			tcKetQuaItems: [],
			tcKetQua: '',
			headersThemDieuKien: [
				{
					text: 'Thêm điều kiện',
					align: 'center',
					sortable: false,
					value: 'themdieukien'
				},
				{
					text: 'Loại phương tiện <span style="color: red;">(*)</span>',
					align: 'center',
					sortable: false,
					value: 'loaiphuongtien'
				},
				{
					text: 'Tên thông số kỹ thuật',
					align: 'center',
					sortable: false,
					value: 'tenthongsokythuat'
				},
				{
					text: 'So Sánh',
					align: 'center',
					sortable: false,
					value: 'sosanh'
				},
				{
					text: 'Giá trị',
					align: 'center',
					sortable: false,
					value: 'giatri'
				}
			],
			itemsThemDieuKien: [],
			tcLoaiPhuongTienItems: [],
			tcThongSoKyThuatItems: [],
			tcSoSanhItems: [
				{
					itemCode: '=',
					itemName: 'Bằng ='
				},
				{
					itemCode: '~',
					itemName: 'Gần giống ~'
				},
				{
					itemCode: '>',
					itemName: 'Lớn hơn >'
				},
				{
					itemCode: '<',
					itemName: 'Nhỏ hơn <'
				}
			],
			loadingPTSXLR: false,
			tcSoSerial: '',
			tcTuSo: '',
			tcDenSo: '',
			headersCoSoNuocNgoai: [
				{
					text: 'STT',
					align: 'center',
					sortable: false,
					value: 'stt'
				},
				{
					text: ' Mã CSSX/Nhà Xưởng',
					align: 'center',
					sortable: false,
					value: 'macssx'
				},
				{
					text: 'Tên CSSX/Nhà Xưởng',
					align: 'center',
					sortable: false,
					value: 'tencssx'
				},
				{
					text: 'Địa chỉ CSSX/Nhà Xưởng',
					align: 'center',
					sortable: false,
					value: 'diachicssx'
				},
				{
					text: 'Thao tác',
					align: 'center',
					sortable: false,
					value: 'thaotac'
				}
			],
			itemsCoSoNuocNgoai: [],
			lengthCoSoNuocNgoai: 0,
			pageCoSoNuocNgoai: 1,
			cssxModel: {},
			loadingCoSoNuocNgoai: false,

			ttdnMaDoanhNghiep: '',
			ttdnMaSoThue: '',
			ttdnLoaiHinhItems: [],
			ttdnLoaiHinh: '',
			ttdnTinhTrangItems: [],
			ttdnTinhTrang: '',
			ttdnDiaChi: '',
			loaiHinhCSSXItems: [],
			loaiHinhCSSX: '',
			cssxChaItems: [],
			cssxCha: '',
			headersCoSoNuocNgoai_Regis: [
				{
					text: 'STT',
					align: 'center',
					sortable: false,
					value: 'stt'
				},
				{
					text: ' Mã CSSX/Nhà Xưởng',
					align: 'center',
					sortable: false,
					value: 'macssx'
				},
				{
					text: 'Tên CSSX/Nhà Xưởng',
					align: 'center',
					sortable: false,
					value: 'tencssx'
				},
				{
					text: 'Địa chỉ CSSX/Nhà Xưởng',
					align: 'center',
					sortable: false,
					value: 'diachicssx'
				}
			],
			itemsCoSoNuocNgoai_Regis: [],
			loadingCoSoNuocNgoai_Regis: false,
			loadingDoanhNghiepTT_NN: false,
			headersDoanhNghiepTT_NN: [
				{
					text: 'STT',
					align: 'left',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Tên, địa chỉ cơ sở sản xuất. Cơ sở nhập khẩu',
					align: 'left',
					sortable: true,
					value: 'address'
				},
				{
					text: 'Mã số thuế. điện thoại. fax. email',
					align: 'left',
					sortable: true,
					value: 'contactEmail'
				},
				{
					text: 'Người đại diện. chức danh',
					align: 'left',
					sortable: true,
					value: 'applicantName'
				},
				{
					text: 'Thông tin chung',
					align: 'left',
					sortable: true,
					value: 'thongtinchung'
				}
			],
			itemsDoanhNghiepTT_NN: [],
			loadingLichSuDanhGiaCOP: false,
			headersLichSuDanhGiaCOP: [
				{
					text: 'STT',
					align: 'left',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Số báo cáo đánh giá COP',
					align: 'left',
					sortable: false,
					value: 'sobaocaoCOP'
				},
				{
					text: 'Ngày đánh giá',
					align: 'left',
					sortable: false,
					value: 'ngaydanhgia'
				},
				{
					text: 'Nhà xưởng/ địa chỉ',
					align: 'left',
					sortable: false,
					value: 'nhãuongdiachi'
				},
				{
					text: 'Còn hạn/ hết hạn',
					align: 'left',
					sortable: false,
					value: 'conhanhethan'
				},
				{
					text: 'Tổng điểm',
					align: 'left',
					sortable: false,
					value: 'tongdiem'
				},
				{
					text: 'Kết quả',
					align: 'left',
					sortable: false,
					value: 'ketqua'
				},
				{
					text: 'Ngày đánh giá kế tiếp',
					align: 'left',
					sortable: false,
					value: 'ngaydanhgiaketiep'
				}
			],
			itemsLichSuDanhGiaCOP: [],
			loadingHSDenHanXacNhan: false,
			headersHSDenHanXacNhan: [
				{
					text: 'STT',
					align: 'center',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Tên thủ tục <br> Tên doanh nghiệp',
					align: 'left',
					sortable: false,
					value: 'applicantName'
				},
				{
					text: 'Mã hồ sơ <br> Số hồ sơ',
					align: 'left',
					sortable: false,
					value: 'dossierId'
				},
				{
					text: 'Ngày gửi <br> Ngày tiếp nhận <br> Hạn xử lý',
					align: 'left',
					sortable: false,
					value: 'submitDate'
				},
				{
					text: 'Số chứng chỉ <br> Ngày cấp',
					align: 'center',
					sortable: false,
					value: 'action'
				},
				{
					text: 'Nội dung',
					align: 'left',
					sortable: false,
					value: 'action'
				},
				{
					text: 'Ghi chú',
					align: 'left',
					sortable: false,
					value: 'lastActionNote'
				}
			],
			itemsHSDenHanXacNhan: [],
			loadingSpDungSanXuat: false,
			headersSpDungSanXuat: [
				{
					text: 'STT',
					align: 'left',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Nhóm sản phẩm',
					align: 'left',
					sortable: false,
					value: 'nhomsanpham'
				},
				{
					text: 'Loại sản phẩm',
					align: 'left',
					sortable: false,
					value: 'loaisanpham'
				},
				{
					text: 'Nhãn hiệu',
					align: 'left',
					sortable: false,
					value: 'nhanhieu'
				},
				{
					text: 'Tên thương mại',
					align: 'left',
					sortable: false,
					value: 'tenthuongmai'
				},
				{
					text: 'Mã kiểu loại',
					align: 'left',
					sortable: false,
					value: 'makieuloai'
				}
			],
			itemsSpDungSanXuat: [],
			loadingPtCapPhieuXX: false,
			headersPtCapPhieuXX: [
				{
					text: 'STT',
					align: 'left',
					sortable: false,
					value: 'stt'
				},
				{
					text: 'Thủ tục',
					align: 'left',
					sortable: false,
					value: 'thutuc'
				},
				{
					text: 'Phương thức cấp',
					align: 'left',
					sortable: false,
					value: 'phuongthuccap'
				},
				{
					text: 'Tần suất kiểm tra trong 1 chu kỳ <br> (90 ngày)',
					align: 'left',
					sortable: false,
					value: 'tanxuatkiemtra'
				},
				{
					text: 'Điểm cấp phát <br> (Luồng xanh, đỏ, vàng)',
					align: 'left',
					sortable: false,
					value: 'diemcapphat'
				},
				{
					text: 'Ghi chú (5)...(14)',
					align: 'left',
					sortable: false,
					value: 'ghichu'
				}
			],
			itemsPtCapPhieuXX: [],
			loadingAnhXaTK: false,
			itemsAnhXaOracle: [],
			anhXaOracle: '',
			tcDoiTuongHS: '',
			tcPhuongTienHS: '',
			tcSoHoSoHS: '',
			menuTcNgayNopHS: false,
			tcNgayNopHS: '',
			dateTcNgayNopHS: '',
			menuTcNgayNopDenNgayHS: false,
			tcNgayNopDenNgayHS: '',
			dateTcNgayNopDenNgayHS: '',
			tcNamHS1: '',
			tcSoDKKTHS: '',
			menuTcNgayCapDKKTTuNgayHS: false,
			tcNgayCapDKKTTuNgayHS: '',
			dateTcNgayCapDKKTTuNgayHS: '',
			menuTcNGayKTDenNGayHS: false,
			tcNGayKTDenNGayHS: '',
			dateTcNGayKTDenNGayHS: '',
			tcNamHS2: '',
			tcSoBBKiemTraHS: '',
			menuTcNgayKTHS: false,
			tcNgayKTHS: '',
			dateTcNgayKTHS: '',
			menuTcNgayKTDenNgayHS: false,
			tcNgayKTDenNgayHS: '',
			dateTcNgayKTDenNgayHS: '',
			tcNamHS3: '',
			tcSoChungChiHS: '',
			menuTcNgayCapCCHS: false,
			tcNgayCapCCHS: '',
			dateTcNgayCapCCHS: '',
			menuTcNgayCapCcDEnNgayHS: false,
			tcNgayCapCcDEnNgayHS: '',
			dateTcNgayCapCcDEnNgayHS: '',
			tcNamHS4: '',
			tcSoToKhaiHS: '',
			menuTcNgayToKhaiHQHS: false,
			tcNgayToKhaiHQHS: '',
			dateTcNgayToKhaiHQHS: '',
			menuTcNgayToKhaiHqDenNgayHS: false,
			tcNgayToKhaiHqDenNgayHS: '',
			dateTcNgayToKhaiHqDenNgayHS: '',
			tcNamHS5: '',
			tcTinhTrangHS: '',
			tcSoSerialHS: '',
			tcTuSoHS: '',
			tcDenSoHS: '',
			tcDiaDiemDKKTHS: '',
			tcMauXeCBHS: false,
			tcLoaiPhuongTienGTHS: '',
			tcDiaDiemSLHS: '',
			tcNhanHieuHS: '',
			tcMaKieuLoaiHS: '',
			tcDonViKiemTraHS: '',
			tcTenThuongMaiHS: '',
			tcSoPinSoSerialHS: '',
			tcDangKiemVienHS: '',
			tcSoKhungSoVinHS: '',
			tcSoDongCoHS: '',
			tcDoanhNghiepHS: '',
			tcNuocSanXuatHS: '',
			tcNamSXHS: '',
			tcMaSoThueHS: '',
			tcSoHoaDonHS: '',
			tcMauSonHS: '',
			tcSoBCTNAnToanHS: '',
			tcTenNhaMaySXHS: '',
			tcSoBCTNKhiThaiHS: '',
			tcDiaChiNhaMaySXHS: '',
			tcSoBCCOPHS: '',
			tcTieuChuanKhiThaiHS: '',
			tcPhuongThucCapPPHS: '',
			tcDoiTuongCbHS: false,
			tcLoaiPhuongTienCbHS: false,
			indexBtnProcess: -1,
			stateExpan: true,
			showProductDetail: true,
			dataItemsMenu: []
		},
		watch: {
			dateNgayXuatXuong_add (val) {
				var vm = this;
				console.log('this.dateNgayXuatXuong_add +++++++++', this.dateNgayXuatXuong_add);
				vm.detailGCN['ngayXuatXuong_add'] = vm.parseDate2(this.dateNgayXuatXuong_add);
			}
		},
		created: function () {
			
		},
		onScroll: 'onScroll',
		schema: {
				// TODO menu filter
				'navigationFilter': {
					'id': 'navigationFilter',
					'name': 'navigationFilter',
					"type": "navigation",
					'cssClass': 'pr-4 pt-0',
					"template": "menu_template",
					"template_content": "dossierViewJX_form_template",
					'events': {
						deleteDossierFileVersion: function (item) {
							var vm = this;

							vm.$dialog.confirm('Bạn có muốn xóa file toàn bộ file của thành phần này!', {
								html: true,
								loader: true,
								okText: 'Xác nhận',
								cancelText: 'Quay lại',
								animation: 'fade'
							}).then((dialog) => {
								console.log("Run delete");
								var urlFiles = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid + "/resetformdata";
								$.ajax({
									url : urlFiles,
									dataType : "json",
									type : "PUT",
									headers : {
										groupId : themeDisplay.getScopeGroupId()
									},
									success : function (result) {
										item.counter = 0;
									},
									error : function (xhr) {
										console.log(xhr);
									}
								});
								dialog.close();
								return false;
							}).catch((e) => {
								console.log(e)
							})
						},
						parseNgayXuatXuong_add (val) {
							var vm = this;
							vm.detailGCN['ngayXuatXuong_add'] = vm.parseDate2(vm.dateNgayXuatXuong_add);
							vm.menuNgayXuatXuong_add = false;
						},
						parseNgayNhap (val) {
							var vm = this;
							vm.thongTinPhieu['ngayNhap'] = vm.parseDate2(vm.dateNgayNhap);
							vm.menuNgayNhap = false;
						},
						setStateOnlyFollow : function (emailAddress) {
							var vm = this;
							var url = '/o/rest/v2/dictcollections/VR_AUDIT/dictitems';
							axios.get(url, config).then(function (response) {
								var serializable = response.data;
								console.log("emailAddress======",emailAddress);
								if (serializable) {
									for (var i = 0; i < serializable.data.length; i++) {
										var model = serializable.data[i];
										if (emailAddress && emailAddress === model.itemName) {
											vm.stateOnlyFollow = true;
											break;
										}
									}
								}
							}).catch(function (error) {
								console.log(error);
							});
						},
						toggleAll () {
							if (this.selected.length) {
								this.selected = []
							} else {
								this.selected = this.dsGCNItems.slice()
							}
						},
						parseTcNgayNop: function () {
							var vm = this;
							vm.tcNgayNop = vm.parseDate2(vm.dateTcNgayNop);
							vm.menuTcNgayNop = false;
						},
						parseTcNgayNopDenNgay: function () {
							var vm = this;
							vm.tcNgayNopDenNgay = vm.parseDate2(vm.dateTcNgayNopDenNgay);
							vm.menuTcNgayNopDenNgay = false;
						},
						parseTcNgayCapDKKTTuNgay: function () {
							var vm = this;
							vm.tcNgayCapDKKTTuNgay = vm.parseDate2(vm.dateTcNgayCapDKKTTuNgay);
							vm.menuTcNgayCapDKKTTuNgay = false;
						},
						parseTcNGayKTDenNGay: function () {
							var vm = this;
							vm.tcNGayKTDenNGay = vm.parseDate2(vm.dateTcNGayKTDenNGay);
							vm.menuTcNGayKTDenNGay = false;
						},
						parseNgayKT: function () {
							var vm = this;
							vm.tcNgayKT = vm.parseDate2(vm.dateTcNgayKT);
							vm.menuTcNgayKT = false;
						},
						parseNgayKTDenNgay: function () {
							var vm = this;
							vm.tcNgayKTDenNgay = vm.parseDate2(vm.dateTcNgayKTDenNgay);
							vm.menuTcNgayKTDenNgay = false;
						},
						parseNgayCapCC: function () {
							var vm = this;
							vm.tcNgayCapCC = vm.parseDate2(vm.dateTcNgayCapCC);
							vm.menuTcNgayCapCC = false;
						},
						parseNgayCapCcDEnNgay: function () {
							var vm = this;
							vm.tcNgayCapCcDEnNgay = vm.parseDate2(vm.dateTcNgayCapCcDEnNgay);
							vm.menuTcNgayCapCcDEnNgay = false;
						},
						parseNgayToKhaiHQ: function () {
							var vm = this;
							vm.tcNgayToKhaiHQ = vm.parseDate2(vm.dateTcNgayToKhaiHQ);
							vm.menuTcNgayToKhaiHQ = false;
						},
						parseNgayToKhaiHqDenNgay: function () {
							var vm = this;
							vm.tcNgayToKhaiHqDenNgay = vm.parseDate2(vm.dateTcNgayToKhaiHqDenNgay);
							vm.menuTcNgayToKhaiHqDenNgay = false;
						},
						parseTcNgayNopHS: function () {
							var vm = this;
							vm.tcNgayNopHS = vm.parseDate2(vm.dateTcNgayNopHS);
							vm.menuTcNgayNopHS = false;
						},
						parseTcNgayNopDenNgayHS: function () {
							var vm = this;
							vm.tcNgayNopDenNgayHS = vm.parseDate2(vm.dateTcNgayNopDenNgayHS);
							vm.menuTcNgayNopDenNgayHS = false;
						},
						parseTcNgayCapDKKTTuNgayHS: function () {
							var vm = this;
							vm.tcNgayCapDKKTTuNgayHS = vm.parseDate2(vm.dateTcNgayCapDKKTTuNgayHS);
							vm.menuTcNgayCapDKKTTuNgayHS = false;
						},
						parseTcNGayKTDenNGayHS: function () {
							var vm = this;
							vm.tcNGayKTDenNGayHS = vm.parseDate2(vm.dateTcNGayKTDenNGayHS);
							vm.menuTcNGayKTDenNGayHS = false;
						},
						parseNgayKTHS: function () {
							var vm = this;
							vm.tcNgayKTHS = vm.parseDate2(vm.dateTcNgayKTHS);
							vm.menuTcNgayKTHS = false;
						},
						parseNgayKTDenNgayHS: function () {
							var vm = this;
							vm.tcNgayKTDenNgayHS = vm.parseDate2(vm.dateTcNgayKTDenNgayHS);
							vm.menuTcNgayKTDenNgayHS = false;
						},
						parseNgayCapCCHS: function () {
							var vm = this;
							vm.tcNgayCapCCHS = vm.parseDate2(vm.dateTcNgayCapCCHS);
							vm.menuTcNgayCapCCHS = false;
						},
						parseNgayCapCcDEnNgayHS: function () {
							var vm = this;
							vm.tcNgayCapCcDEnNgayHS = vm.parseDate2(vm.dateTcNgayCapCcDEnNgayHS);
							vm.menuTcNgayCapCcDEnNgayHS = false;
						},
						parseNgayToKhaiHQHS: function () {
							var vm = this;
							vm.tcNgayToKhaiHQHS = vm.parseDate2(vm.dateTcNgayToKhaiHQHS);
							vm.menuTcNgayToKhaiHQHS = false;
						},
						parseNgayToKhaiHqDenNgayHS: function () {
							var vm = this;
							vm.tcNgayToKhaiHqDenNgayHS = vm.parseDate2(vm.dateTcNgayToKhaiHqDenNgayHS);
							vm.menuTcNgayToKhaiHqDenNgayHS = false;
						},
						changeDoiTuongHS: function () {
							var vm = this;
							vm.loadDSPhuongTien(data);
							vm.loadDSThongSoKyThuat(data);
						},
						advanceFilterAll: function () {
							var vm = this;
							vm.advanced_filter_all = !vm.advanced_filter_all;
							if (typeof(Storage) !== "undefined") {
								sessionStorage.setItem("advanced_filter_all", vm.advanced_filter_all);
							} else {
								console.log('browser not support sessionStorage :(');
							}
						},
						deleteDieuKienLoc: function (index) {
							var vm = this;
							if (!vm.itemsThemDieuKien.length) {
								return;
							}
							vm.itemsThemDieuKien.splice(index, 1);
						},
						themDieuKienLoc: function () {
							var vm = this;
							vm.itemsThemDieuKien.push({
								addLoaiPhuongTien: '',
								addTenThongSoKT: '',
								addSoSanh: '',
								addGiaTri: ''
							});
						},
						checkHasEform: function (items) {
							var vm = this
							for (var i = 0; i < items.length; i++) {
								if (items[i]['eform']) {
									return true;
								}
							}
							return false;
						},
						donDep: function () {
							var vm = this;
							vm.tcDoiTuong = "";
							vm.tcPhuongTien = "";
							vm.tcSoHoSo = "";
							vm.tcNgayNop = "";
							vm.tcNgayNopDenNgay = "";
							vm.tcSoDKKT = "";
							vm.tcNgayCapDKKTTuNgay = "";
							vm.tcNGayKTDenNGay = "";
							vm.tcNam2 = "";
							vm.tcSoBBKiemTra = "";
							vm.tcNgayKT = "";
							vm.tcNgayKTDenNgay = "";
							vm.tcNam2 = "";
							vm.tcSoChungChi = "";
							vm.tcNgayCapCC = "";
							vm.tcNgayCapCcDEnNgay = "";
							vm.tcNam3 = "";
							vm.tcSoToKhai = "";
							vm.tcNgayToKhaiHQ = "";
							vm.tcNgayToKhaiHqDenNgay = "";
							vm.tcNam4 = "";
							vm.tcDiaDiemDKKT = "";
							vm.tcMauXeCB = "";
							vm.tcLoaiPhuongTienGT = "";
							vm.tcDiaDiemSL = "";
							vm.tcUnknow = "";
							vm.tcNhanHieu = "";
							vm.tcMaKieuLoai = "";
							vm.tcDonViKiemTra = "";
							vm.tcTenThuongMai = "";
							vm.tcSoPinSoSerial = "";
							vm.tcDangKiemVien = "";
							vm.tcSoKhungSoVin = "";
							vm.tcSoDongCo = "";
							vm.tcDoanhNghiep = "";
							vm.tcNuocSanXuat = "";
							vm.tcNamSX = "";
							vm.tcMaSoThue = "";
							vm.tcSoHoaDon = "";
							vm.tcMauSon = "";
							vm.tcTinhTrang = "";
							vm.tcSoBCTNAnToan = "";
							vm.tcTenNhaMaySX = "";
							vm.tcSoBCTNKhiThai = "";
							vm.tcDiaChiNhaMaySX = "";
							vm.tcSoBCCOP = "";
							vm.tcTieuChuanKhiThai = "";
							vm.tcPhuongThucKtra = "";
							vm.tcDoiTuongCb = "";
							vm.tcLoaiPhuongTienCb = "";
							vm.tcKetQua = "";
							vm.itemsThemDieuKien = [];
							vm.tcSoSerial = "";
							vm.tcTuSo = "";
							vm.tcDenSo = "";
						},
						timKiem: function () {
							var vm = this;
							// if (!vm.tcDoiTuong) {
							// 	return;
							// }
							vm.loadingPTSXLR = true;
							var start = (vm.pagePTSXLR - 1) * 15;
							var end = (vm.pagePTSXLR - 1) * 15 + 15;
							var data = {
								tcDoiTuong: vm.tcDoiTuong,
								tcPhuongTien: vm.tcPhuongTien,
								tcSoHoSo: vm.tcSoHoSo,
								tcNgayNop: vm.tcNgayNop,
								tcNgayNopDenNgay: vm.tcNgayNopDenNgay,
								tcSoDKKT: vm.tcSoDKKT,
								tcNgayCapDKKTTuNgay: vm.tcNgayCapDKKTTuNgay,
								tcNGayKTDenNGay: vm.tcNGayKTDenNGay,
								tcNam2: vm.tcNam2,
								tcSoBBKiemTra: vm.tcSoBBKiemTra,
								tcNgayKT: vm.tcNgayKT,
								tcNgayKTDenNgay: vm.tcNgayKTDenNgay,
								tcNam2: vm.tcNam2,
								tcSoChungChi: vm.tcSoChungChi,
								tcNgayCapCC: vm.tcNgayCapCC,
								tcNgayCapCcDEnNgay: vm.tcNgayCapCcDEnNgay,
								tcNam3: vm.tcNam3,
								tcSoToKhai: vm.tcSoToKhai,
								tcNgayToKhaiHQ: vm.tcNgayToKhaiHQ,
								tcNgayToKhaiHqDenNgay: vm.tcNgayToKhaiHqDenNgay,
								tcNam4: vm.tcNam4,
								tcDiaDiemDKKT: vm.tcDiaDiemDKKT,
								tcMauXeCB: vm.tcMauXeCB,
								tcLoaiPhuongTienGT: vm.tcLoaiPhuongTienGT,
								tcDiaDiemSL: vm.tcDiaDiemSL,
								tcUnknow: vm.tcUnknow,
								tcNhanHieu: vm.tcNhanHieu,
								tcMaKieuLoai: vm.tcMaKieuLoai,
								tcDonViKiemTra: vm.tcDonViKiemTra,
								tcTenThuongMai: vm.tcTenThuongMai,
								tcSoPinSoSerial: vm.tcSoPinSoSerial,
								tcDangKiemVien: vm.tcDangKiemVien,
								tcSoKhungSoVin: vm.tcSoKhungSoVin,
								tcSoDongCo: vm.tcSoDongCo,
								tcDoanhNghiep: vm.tcDoanhNghiep,
								tcNuocSanXuat: vm.tcNuocSanXuat,
								tcNamSX: vm.tcNamSX,
								tcMaSoThue: vm.tcMaSoThue,
								tcSoHoaDon: vm.tcSoHoaDon,
								tcMauSon: vm.tcMauSon,
								tcTinhTrang: vm.tcTinhTrang,
								tcSoBCTNAnToan: vm.tcSoBCTNAnToan,
								tcTenNhaMaySX: vm.tcTenNhaMaySX,
								tcSoBCTNKhiThai: vm.tcSoBCTNKhiThai,
								tcDiaChiNhaMaySX: vm.tcDiaChiNhaMaySX,
								tcSoBCCOP: vm.tcSoBCCOP,
								tcTieuChuanKhiThai: vm.tcTieuChuanKhiThai,
								tcPhuongThucKtra: vm.tcPhuongThucKtra,
								tcDoiTuongCb: vm.tcDoiTuongCb,
								tcLoaiPhuongTienCb: vm.tcLoaiPhuongTienCb,
								tcKetQua: vm.tcKetQua,
								start: start,
								end: end
							}
							var arrLoaiPT = [];
							var arrThongSo = [];
							var arrSoSanh = [];
							var arrGiaTri = [];
							console.log('vm.itemsThemDieuKien++++++++++++++++', vm.itemsThemDieuKien);
							if (vm.itemsThemDieuKien.length) {
								arrLoaiPT = vm.itemsThemDieuKien.map(function (item) {
									if (item.addLoaiPhuongTien) {
										return item.addLoaiPhuongTien;
									}
									return "";
								});
								arrThongSo = vm.itemsThemDieuKien.map(function (item) {
									if (item.addTenThongSoKT) {
										return item.addTenThongSoKT;
									}
									return "";
								});
								arrSoSanh = vm.itemsThemDieuKien.map(function (item) {
									if (item.addSoSanh) {
										return item.addSoSanh;
									}
									return "";
								});
								arrGiaTri = vm.itemsThemDieuKien.map(function (item) {
									if (item.addGiaTri) {
										return item.addGiaTri;
									}
									return "";
								});
							}
							data['loaiPhuongTien'] = arrLoaiPT.join(',');
							data['thongSoKyThuat'] = arrThongSo.join(',');
							data['soSanh'] = arrSoSanh.join(',');
							data['giaTri'] = arrGiaTri.join(',');
							var url = '/o/rest/v2/tracuuphuongtien';
							var configTraCuuPT = {
								headers: {
									'groupId': themeDisplay.getScopeGroupId()
								},
								params: data
							}
							axios.get(url, configTraCuuPT).then(function (response) {
								var serializable = response.data;
								vm.itemsPTSXLR = serializable.data;
								vm.lengthPTSXLR = Math.ceil(serializable.total / 15);
								vm.loadingPTSXLR = false;
							}).catch(function (error) {
								console.log(error);
								vm.loadingPTSXLR = false;
							});
						},
						getLastedStateUserInfo : function (callBack) {
							var vm = this;
							var promise = new Promise(function (resolve, reject) {
								var url = '/o/rest/v2/userInfologs';
								axios.get(url, config).then(function (response) {
									var serializable = response.data;

									console.log("serializable========",serializable);

									var serviceCode = serializable.serviceInfo;
									var applicantIdNo = serializable.applicant;
									var dossierNo = serializable.dossierNo;

									console.log("serviceCode========",serviceCode);
									console.log("applicantIdNo========",applicantIdNo);
									console.log("dossierNo========",dossierNo);
									if (serviceCode) {
										vm.serviceInfoFilter = {
											serviceCode : serviceCode,
											serviceName : ""
										}
									}
									if (applicantIdNo) {
										vm.applicantNameFilter = {
											applicantIdNo : applicantIdNo,
											applicantName : ""
										}
									}
									if (dossierNo) {
										vm.dossierNoFilter = dossierNo
									}
									resolve(true);
								}).catch(function (error) {
									console.log(error);
									reject(false);
								});
							});
							promise.then(function (success) {
								callBack();
							}, function (error) {

							});
						},
						changeQuanLyPhieuXX: function () {
							var vm = this;
							vm.stageFilterView = "quan_ly_pxx";
							vm.detailPage = false;
							vm.detailRegistPage = false;
							vm.loadPhieuXX();
							vm.loadDoiPhong();
							vm.loadMauPhoi();
							vm.loadDoiTuong();
						},
						loadDoiPhong: function () {
							var vm = this;
							var url = "/o/rest/v2/dictcollections/DOIPHONG/dictitems?sort=sibling";
							axios.get(url, config).then(function (response) {
								vm.doiPhongItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.doiPhongItems = [{
									itemName: 'Phòng VAQ',
									itemCode: 'vaq'
								}, {
									itemName: 'Phòng ABC',
									itemCode: 'vaq1'
								}, {
									itemName: 'Phòng DEF',
									itemCode: 'vaq2'
								}, {
									itemName: 'Phòng AGGG',
									itemCode: 'vaq3'
								}, {
									itemName: 'Phòng NHJ',
									itemCode: 'vaq4'
								}]
							});
						},
						loadLoaiHinhCSSX: function () {
							var vm = this;
							var url = "/o/rest/v2/temp/dictcollections/" + itemCodeNuocNgoai + "/dictgroups?sort=groupName&level=0";
							axios.get(url, config).then(function (response) {
								vm.loaiHinhCSSXItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.loaiHinhCSSXItems = [];
							});
						},
						loadCSSXCha: function () {
							var vm = this;
							var url = "/o/rest/v2/temp/dictcollections/" + itemCodeNuocNgoai + "/dictitems?sort=sibling&level=0";
							axios.get(url, config).then(function (response) {
								vm.cssxChaItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.cssxChaItems = [];
							});
						},
						loadSelectLoaiHinhCSSX: function (dictItemId) {
							var vm = this;
							var type = "POST";
							var url = urlGetDictGroup + "&" + portletNamespace + "dictItemId=" + dictItemId;

							var data = {};
							$.ajax({
								url: url,
								type: type,
								dataType: 'json',
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								data: data,
								success: function (result) {
									console.log('CSSX loai hinh nuoc ngoai+++++++++', result);
									vm.loaiHinhCSSX	= result.groupCode;
								},
								error: function (result) {
									console.log(result);
									vm.loaiHinhCSSX = '';
								}
							})
						},
						loadMauPhoi: function () {
							var vm = this;
							var url = "/o/rest/v2/dictcollections/MAUPHOI/dictitems?sort=sibling";
							axios.get(url, config).then(function (response) {
								vm.mauPhoiItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.mauPhoiItems = [
									{
										itemName: 'Mẫu GCN',
										itemCode: 'gcn'
									},
									{
										itemName: 'Mẫu PXX',
										itemCode: 'gcn'
									},
									{
										itemName: 'Mẫu ECK',
										itemCode: 'eck'
									},
									{
										itemName: 'Mẫu IMO',
										itemCode: 'imo'
									},
									{
										itemName: 'Mẫu QWE',
										itemCode: 'qwe'
									}
								]
							});
						},
						loadCoSoSanXuat: function () {
							var vm = this;
							var url = "/o/rest/v2/dictcollections/COSOSANXUAT/dictitems?sort=sibling";
							axios.get(url, config).then(function (response) {
								vm.mauPhoiItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.coSoSanXuatItems = [
									{
										itemName: 'Cơ sở 1',
										itemCode: 'cs1'
									},
									{
										itemName: 'Cơ sở 2',
										itemCode: 'cs2'
									},
									{
										itemName: 'Cơ sở 3',
										itemCode: 'cs3'
									},
									{
										itemName: 'Cơ sở 4',
										itemCode: 'cs4'
									},
									{
										itemName: 'Cơ sở 5',
										itemCode: 'cs5'
									}
								]
							});
						},
						loadDoiTuong: function () {
							var vm = this;
							var url = "/o/rest/v2/dictcollections/MAUPHOI/dictitems?sort=sibling";
							axios.get(url, config).then(function (response) {
								vm.doiTuongItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							});
						},
						timKiemTTDN: function () {
							var vm = this;
							vm._inithongTinDoanhNghiepTable();
						},
						nhapKhoAction: function () {
							var vm = this;
							vm.stateAddPhieu = 'nhap_kho';
							vm.dsGCNItems = [];
							vm.thongTinPhieu = {};
							vm.selected = [];
							vm.popUpDieuCHuyen = !vm.popUpDieuCHuyen;
						},
						xuatKhoAction: function () {
							var vm = this;
							vm.stateAddPhieu = 'xuat_kho';
							vm.dsGCNItems = [];
							vm.thongTinPhieu = {};
							vm.selected = [];
							vm.popUpDieuCHuyen = !vm.popUpDieuCHuyen;
						},
						dieuChuyenAction: function () {
							var vm = this;
							vm.stateAddPhieu = 'dieu_chuyen';
							vm.dsGCNItems = [];
							vm.thongTinPhieu = {};
							vm.selected = [];
							vm.popUpDieuCHuyen = !vm.popUpDieuCHuyen;
						},
						changeDoiPhong: function () {
							var vm = this;
							vm.pagePxx = 1;
							vm.soSerial = "";
							vm.searchMauPhoi = "";
							vm.searchNam = "";
							vm.loadPhieuXX();
						},
						loadPhieuXX: function () {
							var vm = this;
							vm.loadingPxx = true;
							var url = "/abc123";
							var start = (vm.pagePxx - 1) * 15;
							var end = (vm.pagePxx - 1) * 15 + 15;
							let configPXX = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									start: start,
									end: end,
									searchDoiPhong: vm.searchDoiPhong,
									soSerial: vm.soSerial,
									searchMauPhoi: vm.searchMauPhoi,
									searchNam: vm.searchNam
								}
							}
							axios.get(url, configPXX).then(function (response) {
								var data = response.data.data;
								var total = response.data.total;
								if (data) {
									vm.itemsPxx = data;
								} else {
									vm.itemsPxx = [];
								}
								// vm.lengthPxx = Math.ceil(total / 15);
								vm.lengthPxx = 0;
								vm.loadingPxx = false;
								vm.totalPxx = total;
							}).catch(function (xhr) {
								vm.itemsPxx = [
									{
										btnText: 'Kiểm kê',
										mauPhoi: 'MAU_1',
										nam: '2018',
										soSerial: 'AQ',
										tuSo: '10001',
										denSo: '20000',
										nhapKho: '100000',
										xuatKho: '0',
										tonTrenSo: '10000',
										kiemKe: '10000',
										chenhLechTang: '0',
										chenhLechGiam: '0',
										ngayKiemKe: '1/4/2018',
										lyDo: '30/2/2018'
									},
									{
										btnText: 'Kiểm kê',
										mauPhoi: 'MAU_2',
										nam: '2018',
										soSerial: 'AQ',
										tuSo: '20000',
										denSo: '30000',
										nhapKho: '450000',
										xuatKho: '0',
										tonTrenSo: '10000',
										kiemKe: '10000',
										chenhLechTang: '0',
										chenhLechGiam: '0',
										ngayKiemKe: '1/4/2018',
										lyDo: '30/4/2018'
									},
									{
										btnText: 'Kiểm kê',
										mauPhoi: 'MAU_1',
										nam: '2018',
										soSerial: 'AQ',
										tuSo: '10001',
										denSo: '62000',
										nhapKho: '100000',
										xuatKho: '0',
										tonTrenSo: '10000',
										kiemKe: '601545',
										chenhLechTang: '0',
										chenhLechGiam: '0',
										ngayKiemKe: '1/4/2018',
										lyDo: '30/2/2018'
									}
								];
								vm.lengthPxx = 1;
								vm.loadingPxx = false;
							})
						},
						loadDSDangKiemVien: function () {
							var vm = this;
							var url = '/o/rest/v2/temp/dictcollections/DANG_KIEM_VIEN/dictitems?sort=sibling';
							axios.get(url, config).then(function (response) {
								vm.tcDangKiemVienItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						loadDSTinhThanh: function () {
							var vm = this;
							var url = '/o/rest/v2/temp/dictcollections/ADMINISTRATIVE_REGION/dictitems?sort=sibling';
							axios.get(url, config).then(function (response) {
								vm.tcDiaDiemItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						loadDSDoiTuong: function () {
							var vm = this;
							var url = '/o/rest/v2/temp/dictcollections/VR88/dictitems?sort=sibling';
							axios.get(url, config).then(function (response) {
								vm.tcDoiTuongItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						changeDoiTuong: function (data) {
							var vm = this;
							vm.loadDSPhuongTien(data);
							vm.loadDSThongSoKyThuat(data);
						},
						loadDSDonViKiemTra: function () {
							var vm = this;
							var url = '/o/rest/v2/temp/dictcollections/VR30/dictitems?sort=sibling';
							axios.get(url, config).then(function (response) {
								vm.tcDonViKiemTraItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						loadDSPhuongThucCapPP: function () {
							var vm = this;
							var url = '/o/rest/v2/temp/dictcollections/VR89/dictitems?sort=sibling';
							axios.get(url, config).then(function (response) {
								vm.tcPhuongThucCapPPItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						loadDSKQChungChi: function () {
							var vm = this;
							var url = '/o/rest/v2/temp/dictcollections/KET_QUA_CC/dictitems?sort=sibling';
							axios.get(url, config).then(function (response) {
								vm.tcKetQuaItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						loadDSPhuongTien: function (parent) {
							var vm = this;
							var url = '/o/rest/v2/temp/dictcollections/VR02/dictitems?sort=sibling';
							var configDSPT = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									parent: parent
								}
							}
							axios.get(url, configDSPT).then(function (response) {
								var arrLevel2 = [];
								if (response.data.data) {
									arrLevel2 = response.data.data.filter(function (item) {
										return item.level == 2;
									});
								}
								vm.tcPphuongTienItems = arrLevel2;
								vm.tcLoaiPhuongTienItems = arrLevel2;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						saveCoSoNuocNgoai: function () {
							var vm = this;
							var type = "POST";
							var url = urlAddCoSoNuocNgoai + "&" + portletNamespace + "collectionCode=" + itemCodeNuocNgoai;
							var dictCollectionCode = portletNamespace + 'dictCollectionCode';
							var itemCode = portletNamespace + 'itemCode';
							var itemName = portletNamespace + 'itemName';
							var itemNameEN = portletNamespace + 'itemNameEN';
							var parentItemId = portletNamespace + 'parentItemId';
							var sibling = portletNamespace + 'sibling';
							var level = portletNamespace + 'level';
							var metaData = portletNamespace + 'metaData';
							var parentItemCode = portletNamespace + 'parentItemCode';
							var itemDescription = portletNamespace + 'itemDescription';
							var itemCodeOld = portletNamespace + 'itemCodeOld';
							var groupCode = portletNamespace + 'groupCode';

							var data = {};
							data[itemCode] = vm.cssxModel.itemCode;
							data[itemName] = vm.cssxModel.itemName;
							data[itemNameEN] = vm.cssxModel.itemName;
							data[parentItemId] = '';
							data[sibling] = 0;
							data[level] = '';
							data[metaData]= '';
							data[parentItemCode] = vm.cssxModel.parentItemCode;
							data[itemDescription] = vm.cssxModel.itemDescription;
							data[groupCode] = vm.loaiHinhCSSX;

							if (vm.cssxModel.dictItemId) {
								data[itemCodeOld] = vm.cssxModel.itemCode;
								url = urlAddCoSoNuocNgoai + "&" + portletNamespace + "collectionCode=" + itemCodeNuocNgoai 
								+ "&" + portletNamespace + "itemCodeOld=" + vm.cssxModel.itemCode;
							}

							console.log('urlAddCoSoNuocNgoai++++++++++', urlAddCoSoNuocNgoai);
							$.ajax({
								url: url,
								type: type,
								dataType: 'json',
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								data: data,
								success: function (result) {
									vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thành công!";
									vm.snackbardossierViewJX = true;
									vm.backCSSXNuocNgoai();			
								},
								error: function (result) {
									vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thất bại, vui lòng thử lại!";
									vm.snackbarerordossierViewJX = true;
								}
							})
						},
						deleteCoSoNuocNgoai: function (itemCode) {
							var vm = this;
							vm.$dialog.confirm('Bạn có chắc chắn muốn xóa!', {
								html: true,
								loader: true,
								okText: 'Xác nhận',
								cancelText: 'Hủy bỏ',
								animation: 'fade'
							}).then((dialog) => {
								var url = "/o/rest/v2/temp/dictcollections/" + itemCodeNuocNgoai + "/dictitems/" + itemCode;
								$.ajax({
									url: url,
									type: "DELETE",
									dataType: 'json',
									headers: {
										groupId: themeDisplay.getScopeGroupId()
									},
									data: {
									},
									success: function (result) {
										vm.snackbartextdossierViewJX = "Xoá dữ liệu thành công!";
										vm.snackbardossierViewJX = true;
										vm.loadDSCoSoNuocNgoai();
									},
									error: function (xhr) {
										// vm.snackbartextdossierViewJX = "Xoá dữ liệu thất bại!";
										// vm.snackbarerordossierViewJX = true;
										vm.loadDSCoSoNuocNgoai();
									}
								})
								dialog.close();
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						loadDSCoSoNuocNgoai: function () {
 							var vm = this;
 							var url = '/o/rest/v2/temp/dictcollections/' + itemCodeNuocNgoai + '/dictitems';
 							var start = (vm.pageCoSoNuocNgoai - 1) * 15;
							var end = (vm.pageCoSoNuocNgoai - 1) * 15 + 15;
							var configDSCoSoNuocNgoai = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									keyword: vm.keywordsSearchTraCuuDoanhNghiepNuocNgoai
									// start: start,
									// end: end
								}
							}
							vm.loadingCoSoNuocNgoai = true;
							axios.get(url, configDSCoSoNuocNgoai).then(function (response) {
								vm.itemsCoSoNuocNgoai = response.data.data;
								vm.lengthCoSoNuocNgoai = Math.ceil(response.data.total / 15);
								console.log('vm.lengthCoSoNuocNgoai+++++', vm.lengthCoSoNuocNgoai);
								vm.loadingCoSoNuocNgoai = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.lengthCoSoNuocNgoai = 0;
								vm.loadingCoSoNuocNgoai = false;
							})
						},
						loadDSCoSoNuocNgoai_Regis: function (registrationId) {
 							var vm = this;
 							var url = '/o/rest/v2/temp/dictcollections/' + itemCodeNuocNgoai + '/dictitems';
 							var start = (vm.pageCoSoNuocNgoai - 1) * 15;
							var end = (vm.pageCoSoNuocNgoai - 1) * 15 + 15;
							var configDSCoSoNuocNgoai = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									registrationId: registrationId
									// start: start,
									// end: end
								}
							}
							vm.loadingCoSoNuocNgoai_Regis = true;
							axios.get(url, configDSCoSoNuocNgoai).then(function (response) {
								vm.itemsCoSoNuocNgoai_Regis = response.data.data;
								vm.loadingCoSoNuocNgoai_Regis = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.loadingCoSoNuocNgoai_Regis = false;
							})
						},
						loadDSCoSoNuocNgoai_Regis: function (registrationId) {
 							var vm = this;
 							var url = '/o/rest/v2/temp/dictcollections/' + itemCodeNuocNgoai + '/dictitems';
 							var start = (vm.pageCoSoNuocNgoai - 1) * 15;
							var end = (vm.pageCoSoNuocNgoai - 1) * 15 + 15;
							var configDSCoSoNuocNgoai = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									registrationId: registrationId
									// start: start,
									// end: end
								}
							}
							vm.loadingCoSoNuocNgoai_Regis = true;
							axios.get(url, configDSCoSoNuocNgoai).then(function (response) {
								vm.itemsCoSoNuocNgoai_Regis = response.data.data;
								vm.loadingCoSoNuocNgoai_Regis = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.loadingCoSoNuocNgoai_Regis = false;
							})
						},
						loadDSLichSuDanhGiaCOP: function (registrationId) {
 							var vm = this;
 							var url = '/o/rest/v2/temp/dictcollections/' + itemCodeNuocNgoai + '/dictitems';
							var configDSCoSoNuocNgoai = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									registrationId: registrationId
								}
							}
							vm.loadingLichSuDanhGiaCOP = true;
							axios.get(url, configDSCoSoNuocNgoai).then(function (response) {
								vm.itemsLichSuDanhGiaCOP = response.data.data;
								vm.loadingLichSuDanhGiaCOP = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.loadingLichSuDanhGiaCOP = false;
							})
						},
						loadDSHSDenHanXacNhan: function (registrationId) {
 							var vm = this;
 							var url = '/o/rest/v2/dossiers/dossiersTest';
							var configDSCoSoNuocNgoai = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									registrationId: registrationId,
									follow: true,
									start: 0,
									end: 15,
									status: 'processing',
									substatus: '',
									sort: 'modified',
									order: false
								}
							}
							vm.loadingHSDenHanXacNhan = true;
							axios.get(url, configDSCoSoNuocNgoai).then(function (response) {
								vm.itemsHSDenHanXacNhan = response.data.data;
								vm.loadingHSDenHanXacNhan = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.loadingHSDenHanXacNhan = false;
							})
						},
						loadDSSpDungSanXuat: function (registrationId) {
 							var vm = this;
 							var url = '/o/rest/v2/temp/dictcollections/' + itemCodeNuocNgoai + '/dictitems';
							var configDSCoSoNuocNgoai = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									registrationId: registrationId
								}
							}
							vm.loadingSpDungSanXuat = true;
							axios.get(url, configDSCoSoNuocNgoai).then(function (response) {
								vm.itemsSpDungSanXuat = response.data.data;
								vm.loadingSpDungSanXuat = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.loadingSpDungSanXuat = false;
							})
						},
						loadDSPtCapPhieuXX: function (registrationId) {
 							var vm = this;
 							var url = '/o/rest/v2/temp/dictcollections/' + itemCodeNuocNgoai + '/dictitems';
							var configDSCoSoNuocNgoai = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									registrationId: registrationId
								}
							}
							vm.loadingPtCapPhieuXX = true;
							axios.get(url, configDSCoSoNuocNgoai).then(function (response) {
								vm.itemsPtCapPhieuXX = response.data.data;
								vm.loadingPtCapPhieuXX = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.loadingPtCapPhieuXX = false;
							})
						},
						loadDoanhNghiepTT_NN: function (dictItemId) {
 							var vm = this;
 							var paramsBuilder = {
								start: 0,
								end: 15
							};
							vm.loadingDoanhNghiepTT_NN = true;
							const config_registrations = {
								params: paramsBuilder,
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								}
							};
							var url = '/o/rest/v2/registrations';
							axios.get(url, config_registrations).then(function (response) {
								var serializable = response.data;
								var arrResult = [];
								if (serializable.data) {
									for (var i = 0; i < serializable.data.length; i++) {
										if (!serializable.data[i].removed) {
											arrResult.push(serializable.data[i]);
										}
									}
								}
								vm.itemsDoanhNghiepTT_NN = arrResult;
								vm.loadingDoanhNghiepTT_NN = false;
							}).catch(function (error) {
								console.log(error);
								vm.itemsDoanhNghiepTT_NN = [];
								vm.loadingDoanhNghiepTT_NN = false;
							});
						},
						searchAnhXaTK: function () {
 							var vm = this;
 							var url = '/o/rest/v2/applicants';
							var configDSSeachAnhXa = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									keyword: vm.anhXaOracle
								}
							}
							vm.loadingAnhXaTK = true;
							axios.get(url, configDSSeachAnhXa).then(function (response) {
								vm.itemsAnhXaOracle = response.data.data;
								vm.loadingAnhXaTK = false;
							}).catch(function (xhr) {
								console.log(xhr);
								vm.itemsAnhXaOracle = false;
							})
						},
						changeAnhXaTK: function (data) {
 							var vm = this;
 							var url = '/o/rest/v2/applicants';
							var configDSSeachAnhXa = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									keyword: data
								}
							}
							axios.get(url, configDSSeachAnhXa).then(function (response) {
								
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						toAddCoSoNuocNgoai: function (item) {
							var vm = this;
							vm.cssxModel = {};
							vm.detailPage = true;
							vm.loaiHinhCSSX = '';
							vm.stageFilterView = 'co_so_nuoc_ngoai';
						},
						toDetailCoSoNuocNgoai: function (item) {
							var vm = this;
							vm.detailPage = true;
							vm.cssxModel = item;
							if (item.parentItemId) {
								var parentItem = vm.cssxChaItems.find(function (cssxCha) {
									return cssxCha.dictItemId == item.parentItemId;
								});
								console.log('parentItem+++++++', parentItem);
								if (parentItem) {
									vm.cssxModel['parentItemCode'] = parentItem.itemCode;
								}
							}
							vm.loadDoanhNghiepTT_NN(item.dictItemId);
							vm.loadSelectLoaiHinhCSSX(item.dictItemId);
							vm.onScrollTop();
						},
						backCSSXNuocNgoai: function () {
							var vm = this;
							vm.stageFilterView = 'co_so_nuoc_ngoai'
							vm.detailPage = false;
							vm.loadDSCoSoNuocNgoai();
						},
						loadDSThongSoKyThuat: function (parent) {
							var vm = this;
							if (!parent) {
								console.log('loadDSThongSoKyThuat error not parent!');
								return;
							}
							var url = '/o/rest/vr-app/techspecs/vehicleclass/' + parent;
							var configThongSoKT = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								}
							}
							axios.get(url, config).then(function (response) {
								vm.tcThongSoKyThuatItems = response.data.data;
							}).catch(function (xhr) {
								console.log(xhr);
							})
						},
						loadDSPNK: function () {
							var vm = this;
							vm.loadingPxx = true;
							var url = "/abc123";
							var start = (vm.pagePxx - 1) * 15;
							var end = (vm.pagePxx - 1) * 15 + 15;
							let configPNK = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									start: start,
									end: end
								}
							}
							axios.get(url, configPNK).then(function (response) {
								var data = response.data.data;
								var total = response.data.total;
								if (data) {
									vm.itemsDSPNK = data;
								} else {
									vm.itemsDSPNK = [];
								}
								// vm.lengthPxx = Math.ceil(total / 15);
								vm.lengthDSPNK = 0;
								// vm.loadingPxx = false;
							}).catch(function (xhr) {
								vm.itemsDSPNK = [
									{
										soPhieu: 'Kiểm kê',
										ngayNhap: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									},
									{
										soPhieu: 'Kiểm kê',
										ngayNhap: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									},
									{
										soPhieu: 'Kiểm kê',
										ngayNhap: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									},
									{
										soPhieu: 'Kiểm kê',
										ngayNhap: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									}
								];
								vm.lengthDSPNK = 1;
								// vm.loadingPxx = false;
							})
						},
						loadDSPXK: function () {
							var vm = this;
							vm.loadingPxx = true;
							var url = "/abc123";
							var start = (vm.pagePxx - 1) * 15;
							var end = (vm.pagePxx - 1) * 15 + 15;
							let configPXK = {
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								params: {
									start: start,
									end: end
								}
							}
							axios.get(url, configPXK).then(function (response) {
								var data = response.data.data;
								var total = response.data.total;
								if (data) {
									vm.itemsDSPXK = data;
								} else {
									vm.itemsDSPXK = [];
								}
								// vm.lengthPxx = Math.ceil(total / 15);
								vm.lengthDSPXK = 0;
								// vm.loadingPxx = false;
							}).catch(function (xhr) {
								vm.itemsDSPXK = [
									{
										soPhieu: 'Kiểm kê',
										ngayXuat: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									},
									{
										soPhieu: 'Kiểm kê',
										ngayXuat: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									},
									{
										soPhieu: 'Kiểm kê',
										ngayXuat: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									},
									{
										soPhieu: 'Kiểm kê',
										ngayXuat: 'MAU_1',
										doiTuong: '2018',
										trangThai: 'AQ'
									}
								];
								vm.lengthDSPXK = 1;
								// vm.loadingPxx = false;
							})
						},
						xemPhieuXX: function () {
							var vm = this;
							vm.pagePxx = 1;
							vm.loadPhieuXX();
						},
						xuatExel: function () {
							var vm = this;

						},
						kiemKeAction: function () {
							var vm = this;
							vm.popUpChiTietKiemKe = true;
							var url = "";
							axios.get(url, config).then(function (response) {
								if (response.data.data) {
									vm.chiTietKiemKeItems = response.data.data;
									var totalTheoSoKeToan = 0;
									var totalTheoKiemKe = 0;
									var totalChenhLech = 0;
									for (var i = 0; i < vm.chiTietKiemKeItems.length; i++) {
										totalTheoSoKeToan += vm.chiTietKiemKeItems[i].theoSoKeToan;
										totalTheoKiemKe += vm.chiTietKiemKeItems[i].theoKiemKe;
										totalChenhLech += vm.chiTietKiemKeItems[i].chenhLech;
									}
									vm.chiTietKiemKeModel = {
										theoSoKeToan: totalTheoSoKeToan,
										theoKiemKe: totalTheoKiemKe,
										chenhLech: totalChenhLech
									}
								} else {
									vm.chiTietKiemKeModel = {
										theoSoKeToan: 0,
										theoKiemKe: 0,
										chenhLech: 0
									}
									vm.chiTietKiemKeItems = [];
								}
							}).catch(function (xhr) {
								vm.chiTietKiemKeItems = [];
								vm.chiTietKiemKeModel = {
									theoSoKeToan: 0,
									theoKiemKe: 0,
									chenhLech: 0
								}
							})
						},
						suaVatTu: function (item) {
							var vm = this;
							vm.detailGCN = item;
						},
						deleteVatTuSelect: function () {
							var vm = this;
							if (vm.selected.length === 0) {
								vm.snackbartextdossierViewJX = "Bạn chưa chọn dòng nào để xóa!";
								vm.snackbarerordossierViewJX = true;
								return;
							} else {
								vm.$dialog.confirm('Bạn có chắc chắn muốn xóa!', {
									html: true,
									loader: true,
									okText: 'Xác nhận',
									cancelText: 'Hủy bỏ',
									animation: 'fade'
								}).then((dialog) => {
									var arrAction = [];
									for (var i = 0; i < vm.selected.length; i++) {
										arrAction.push(vm.deleteItemVatTu(vm.selected[i]));
									}
									Promise.all(arrAction).then(function (results) {
										vm.selected = [];
										vm.dsGCNItems = [];
										vm.snackbartextdossierViewJX = "Xoá dữ liệu thành công!";
										vm.snackbardossierViewJX = true;
									}).catch(function (xhr) {
										vm.dsGCNItems = [];
										vm.snackbartextdossierViewJX = "Xoá dữ liệu thất bại!";
										vm.snackbarerordossierViewJX = true;
									})
									dialog.close();
								}).catch(function (xhr) {
									console.log(xhr);
								})
							}
						},
						deleteItemVatTu: function (item) {
							return new Promise(function (resolve, reject) {
								$.ajax({
									url : "/o/rest/v2/delete/" + item.id,
									dataType : "json",
									type : "DELETE",
									headers : {
										"groupId" : themeDisplay.getScopeGroupId()
									},
									success :  function (result) {
										resolve(result);
									},
									error : function (result) {
										reject(result);
									}
								});
							})
						},
						luuPhieu: function (state) {
							var vm = this;
							var url = "";
							$.ajax({
								url: url,
								dataType: "json",
								type: "POST",
								data: {
									doiTuong: vm.thongTinPhieu.doiTuong ? vm.thongTinPhieu.doiTuong : '',
									coSoSanXuat: vm.thongTinPhieu.coSoSanXuat ? vm.thongTinPhieu.coSoSanXuat : '',
									diaChi: vm.thongTinPhieu.diaChi ? vm.thongTinPhieu.diaChi : '',
									diaChiXuong: vm.thongTinPhieu.diaChiXuong ? vm.thongTinPhieu.diaChiXuong : '',
									soPhieuNhap: vm.thongTinPhieu.soPhieuNhap ? vm.thongTinPhieu.soPhieuNhap : '',
									ngayNhap: vm.thongTinPhieu.ngayNhap ? vm.thongTinPhieu.ngayNhap : '',
									state: state
								},
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								success: function (result) {
									vm.dsGCNItems = result.data ? result.data : [];
									vm.thongTinPhieu = result;
									vm.snackbartextdossierViewJX = "Thêm thành công!";
									vm.snackbardossierViewJX = true;
									vm.popUpDieuCHuyen = false;
								},
								error: function (result) {
									vm.snackbartextdossierViewJX = "Thêm thất bại, Vui lòng thử lại!";
									vm.snackbarerordossierViewJX = true;
								}
							})
						},
						chonChungTu: function () {
							var vm = this;
							var url = "";
							$.ajax({
								url: url,
								dataType: "json",
								type: "GET",
								data: {
								},
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								success: function (result) {
									vm.dsGCNItems = result.data ? result.data : [];
									vm.thongTinPhieu = result;
									vm.snackbartextdossierViewJX = "Thêm thành công!";
									vm.snackbardossierViewJX = true;
									vm.popUpAddGCN = false;
								},
								error: function (result) {
									vm.snackbartextdossierViewJX = "Thêm thất bại, Vui lòng thử lại!";
									vm.snackbarerordossierViewJX = true;
								}
							})
						},
						chonHoSo: function (dossierId) {
							var vm = this;
							if (!dossierId) {
								vm.snackbartextdossierViewJX = "Bạn phải chọn một hồ sơ!";
								vm.snackbarerordossierViewJX = true;
								return;
							}
							var url = "/" + dossierId;
							$.ajax({
								url: url,
								dataType: "json",
								type: "GET",
								data: {
								},
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								success: function (result) {
									vm.dsGCNItems = result.data ? result.data : [];
									vm.thongTinPhieu = result;
									vm.snackbartextdossierViewJX = "Thêm thành công!";
									vm.snackbardossierViewJX = true;
									vm.popUpAddGCN = false;
									vm.calTongTien();
								},
								error: function (result) {
								}
							})
						},
						addGCN: function () {
							var vm = this;
							vm.detailGCN = {};
							vm.popUpAddGCN = !vm.popUpAddGCN;
						},
						calTongTien: function () {
							var vm = this;
							var total = 0;
							if (vm.dsGCNItems.length) {
								for (var i = 0; i < vm.dsGCNItems.length; i++) {
									total += vm.dsGCNItems[i].thanhtien;
								}
							}
							vm.tongTien = total;
						},
						chiTietGCN: function (item) {
							var vm = this;
							vm.popUpChiTietPhieu = !vm.popUpChiTietPhieu;
							vm.chiTietGCNModel = item;
							vm.stateNumberSerial = 1
							$('#chiTietPhieuTable').jexcel({
								data: vm.dsCTPItems,
								colWidths: [ 120, 120, 150, 150, 150, 150 ],
								colHeaders: ['Số seri', 'Số phiếu quản lý', 'Ngày XX', 'Màu sơn', 'Số khung', 'Số động cơ']
							});
							$('#dsSoSerial').jexcel({
								data: vm.dsSoSerialItems,
								colWidths: [ 240, 240, 240 ],
								onchange: vm.checkStateNumberGCN(item),
								colHeaders: ['Số seri', 'Từ số', 'Đến số'],
								columns: [
									{ type: 'text' },
									{ type: 'numeric' },
									{ type: 'numeric' }
								]
							});
						},
						checkStateNumberGCN: function (item) {
							var vm = this;
							var number = vm.chiTietGCNModel['soLuong'] ? vm.chiTietGCNModel['soLuong'] : 0;
							var totalNumber = 0;
							if (vm.dsSoSerialItems.length) {
								for (var i = 0; i < vm.dsSoSerialItems.length; i++) {
									var tuSo = vm.dsSoSerialItems[i][1] ? vm.dsSoSerialItems[i][1] : 0;
									var denSo = vm.dsSoSerialItems[i][2] ? vm.dsSoSerialItems[i][2] : 0;
									totalNumber += ((denSo - tuSo) + 1);
								}
							}
							if (totalNumber === number) {
								vm.stateNumberSerial = 2
							} else if (totalNumber > number) {
								vm.stateNumberSerial = 3
							} else {
								vm.stateNumberSerial = 1
							}
						},
						saveSoSerial: function () {
							var vm = this;
							if (vm.stateNumberSerial = 2) {
								$.ajax({
									url: url,
									dataType: "json",
									type: "POST",
									data: {
										data: vm.dsSoSerialItems
									},
									headers: {
										groupId: themeDisplay.getScopeGroupId()
									},
									success: function (result) {
										vm.snackbartextdossierViewJX = "Thêm thành công!";
										vm.snackbardossierViewJX = true;
										vm.popUpChiTietPhieu = false;
									},
									error: function (result) {
										vm.snackbartextdossierViewJX = "Thêm thất bại, Vui lòng thử lại!";
										vm.snackbarerordossierViewJX = true;
									}
								})
							} else {
								vm.snackbartextdossierViewJX = "Số lượng chưa đủ vui lòng kiểm tra lại!";
								vm.snackbarerordossierViewJX = true;
							}
						},
						addRowVatTu: function () {
							var vm = this
							var url = "";
							$.ajax({
								url: url,
								dataType: "json",
								type: "POST",
								data: {
									soSerial: vm.detailGCN.soSerial_add ? vm.detailGCN.soSerial_add : "",
									tuSo: vm.detailGCN.tuSo_add ? vm.detailGCN.tuSo_add : "",
									denSo: vm.detailGCN.denSo_add ? vm.detailGCN.denSo_add : "",
									soLuong: vm.detailGCN.soLuong_add ? vm.detailGCN.soLuong_add : ""
								},
								headers: {
									groupId: themeDisplay.getScopeGroupId()
								},
								success: function (result) {
									vm.dsGCNItems.push(result);
									vm.snackbartextdossierViewJX = "Thêm thành công!";
									vm.snackbardossierViewJX = true;
									vm.popUpAddGCN = false;
								},
								error: function (result) {
									vm.dsGCNItems.push({
										id: Math.random(),
										soSerial: vm.detailGCN['soSerial_add'],
										tuSo: vm.detailGCN['tuSo_add'],
										denSo: vm.detailGCN['denSo_add'],
										soLuong: vm.detailGCN['soLuong_add']
									})
									vm.calTongTien();
									vm.snackbartextdossierViewJX = "Thêm thất bại, Vui lòng thử lại!";
									vm.snackbarerordossierViewJX = true;
								}
							})
						},
						putStateUserInfo: function () {
							var vm = this;
							var stateModel = {
								"serviceInfo" : vm.serviceInfoFilter.serviceCode,
								"applicant" : vm.applicantNameFilter.applicantIdNo,
								"dossierNo" : vm.dossierNoFilter
							}
							$.ajax({
								url : "/o/rest/v2/userInfologs",
								dataType : "json",
								type : "POST",
								headers : {
									"groupId" : themeDisplay.getScopeGroupId()
								},
								data : stateModel,
								success :  function (result) {

								},
								error : function (result) {

								}
							});
						},
						deleteDossierPDF: function (item, index) {
							var vm = this;
							vm.$dialog.confirm('Bạn có muốn xóa tài liệu này!', {
								html: true,
								loader: true,
								okText: 'Xác nhận',
								cancelText: 'Quay lại',
								animation: 'fade'
							}).then((dialog) => {
								$.ajax({
									url : "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid,
									dataType : "json",
									type : "DELETE",
									headers: {
										"groupId": themeDisplay.getScopeGroupId()
									},
									success : function (result) {
										vm.snackbartextdossierViewJX = "Xoá dữ liệu thành phần hồ sơ thành công!";
										vm.snackbardossierViewJX = true;
										vm.listDocumentOutStepItems.splice(index, 1);
										vm.stepModel.createFiles[item.index].counter = vm.stepModel.createFiles[item.index].counter - 1;
									},
									error : function (result) {
										vm.snackbartextdossierViewJX = "Xoá dữ liệu thành phần hồ sơ thất bại!";
										vm.snackbarerordossierViewJX = true;
									}
								});
								dialog.close();
							}).catch((e) => {
								console.log(e)
							})
						},
						submitAlpacajsForm: function (item) {
							var vm = this;
							return new Promise(function (resolve, reject) {
								console.log('run submitApacal');
								vm.loadingAlpacajsForm = true;
								try {
									console.log("$('#alpacajs_form_' + item.partNo + ' .formType').val()============",$("#alpacajs_form_" + item.partNo + " .formType").val());
									if ( $("#alpacajs_form_" + item.partNo + " .formType").val() == null ||
										$("#alpacajs_form_" + item.partNo + " .formType").val() == 'undefined' ) {
										console.log("formType 1");
									vm.loadingAlpacajsForm = true;

									var control = $("#alpacajs_form_" + item.partNo).alpaca("get");
									var formData = control.getValue();

									$.ajax({
										url : "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid + "/formdata",
										dataType : "json",
										type : "PUT",
										headers: {
											"groupId": themeDisplay.getScopeGroupId(),
											Accept : "application/json"
										},
										data : {
											formdata: JSON.stringify(formData)
										},
										success : function (result) {
											vm.snackbartextdossierViewJX = "Lưu form thành công!";
											vm.snackbardossierViewJX = true;
											vm.loadingAlpacajsForm = false;
											$("#validCreateFile" + item.partNo).val("1");
											resolve(true);
											try {

												if (item.hasSubmit) {

												} else {

													item.counter ++;
													item.hasSubmit = true;
												}


											} catch (e) {

											}
										},
										error : function (result) {
											vm.snackbartextdossierViewJX = "Lưu form thất bại!";
											vm.snackbarerordossierViewJX = true;
											vm.loadingAlpacajsForm = false;
											reject(false);
										}
									});

								} else if ( $("#alpacajs_form_" + item.partNo + " .formType").val() != null &&
									$("#alpacajs_form_" + item.partNo + " .formType").val() === 'assign' ) {
									console.log("formType 2");
									vm.loadingAlpacajsForm = true;

									var control = $("#alpacajs_form_" + item.partNo).alpaca("get");
									var formData = control.getValue();
									vm.subUsers = formData['subUsers'];
									vm.alpacaAssignUserId = formData['userAction'];
									$.ajax({
										url : "/o/rest/v2/dossiers/"+vm.detailModel.dossierId+"/files/"+item.referenceUid+"/formdata",
										dataType : "json",
										type : "PUT",
										headers: {
											"groupId": themeDisplay.getScopeGroupId(),
											Accept : "application/json"
										},
										data : {
											formdata: JSON.stringify(formData)
										},
										success : function (result) {
											vm.snackbartextdossierViewJX = "Lưu form thành công!";
											vm.snackbardossierViewJX = true;
											vm.loadingAlpacajsForm = false;
											$("#validCreateFile" + item.partNo).val("1")
											try {
												if (item.hasSubmit) {

												} else {

													item.counter ++;
													item.hasSubmit = true;
												}
											} catch (e) {

											}
											resolve(true);
										},
										error : function (result) {
											vm.snackbartextdossierViewJX = "Lưu form thất bại!";
											vm.snackbarerordossierViewJX = true;
											vm.loadingAlpacajsForm = false;
											reject(false);
										}
									});


									} else {
										vm.loadingAlpacajsForm = true;
										// $("#btn-save-formalpaca" + item.partNo).click();
										setTimeout(
											function() {
												try {
													vm.loadingAlpacajsForm = false;
													if (item.hasSubmit) {

													} else {

														item.counter ++;
														item.hasSubmit = true;
													}
													setTimeout(function () {
	                                                   resolve(item);
													}, 300);
												} catch (e) {
													reject(false);
												}
											},
											3000);
									}
								} catch (e) {
									vm.loadingAlpacajsForm = false;
									reject(false);
									console.log(e);
								}
							})
					},
					showAlpacaJSFORM: function (item) {
						var vm = this;
						var alpacajsForm = document.getElementById("alpacajs_form_" + item.partNo);
						if (alpacajsForm.innerHTML == '' && item.eform) {
							console.log(item);
							var alapcaJS = eval('('+item.formScript+')');
							alapcaJS['data'] = item.formData;

							$("#alpacajs_form_" + item.partNo).alpaca(alapcaJS);
						}
					},
					viewOnNewTab : function (item) {
						var vm = this;
						if (item.counter > 0) {
							if (item.counter === 1) {
								let configBob = {
									headers: {
										groupId: themeDisplay.getScopeGroupId()
									},
									responseType: 'blob'
								}
								var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/files/' + item.referenceUid;
								axios.get(url, configBob).then(function (response) {
									var url = window.URL.createObjectURL(response.data);
									window.open(url);
								})
								.catch(function (error) {
									console.log(error);
								});
								return;
							}
							console.log("vm.detailModel========", vm.detailModel);
							var url = "/group/cong-xu-ly/xu-ly-ho-so?stateWindow=stateWindow&dossierId=" + vm.detailModel.dossierId +
							"&dossierPartNo=" + item.partNo;
							console.log("url============", url);
							window.open(url, "_blank");

						}

					},
					previewNewTab: function (item) {
						var vm = this;
						let configBob = {
							headers: {
								groupId: themeDisplay.getScopeGroupId()
							},
							responseType: 'blob'
						}
						var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/files/' + item.referenceUid;
						axios.get(url, configBob).then(function (response) {
							var url = window.URL.createObjectURL(response.data);
							window.open(url);
						})
						.catch(function (error) {
							console.log(error);
						});
					},
					parseDateUtc : function (date) {
						return moment(String(date)).utc().format('DD/MM/YYYY HH:mm:ss');
					},
					showAlpacaJSFORMRegist: function (item) {
						var vm = this;
						var url = '/o/rest/v2/registrations/'+vm.detailRegistModel.registrationId+'/forms/' + item.referenceUid +"/formscript";
						vm.alapcaJSRei = {};
						axios.get(url, config).then(function (response) {
							var serializable = response.data;

							vm.alapcaJSRei = eval('('+serializable+')');

							axios.get('/o/rest/v2/registrations/'+vm.detailRegistModel.registrationId+'/forms/' + item.referenceUid +"/formdata", config).then(function (responseFormData) {
								vm.alapcaJSRei['data'] = responseFormData.data;
								$("#regist_form_"+item.referenceUid).alpaca(vm.alapcaJSRei);
							}).catch(function (error) {
								console.log(error);
							});
						}).catch(function (error) {
							console.log(error);
							vm.stepLoading = false;
						});
						return false;

					},
					changeProcessStep: function (item, scroll, index) {
						var vm = this;
						console.log(item);
						var status = vm.statusParamFilter;
						var subStatus = vm.substatusParamFilter;
						$("#alpacajs_form_plugin").empty();
						vm.indexBtnProcess = index;
						if (item.type === 1) {
							if (item.autoEvent !== 'submit' && item.autoEvent !== 'timer') {
								vm.stepModel = item;
							} else {
								vm.stepModel = null;
							}
							vm.processAssignUserIdItems = item.toUsers;
							$("textarea#processActionNote").val("");
							console.log('run apacalForm')
							if (vm.stepModel.hasOwnProperty('createFiles')) {
								if (!(vm.stepModel.createFiles instanceof Array)) {
									var createFilesTemp = vm.stepModel.createFiles;
									vm.stepLoading = true;
									vm.stepModel.createFiles = [];
									vm.stepModel.createFiles.push(createFilesTemp);
								}
								$(vm.stepModel.createFiles).each(function (index, createFileItems) {
									createFileItems['save'] = false;
									console.log('run apacalForm')
									var formScriptNew;
									var formDataNew;
									var urlFormData = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/files/'+createFileItems.referenceUid+'/formdata';
									var urlFormScript = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/files/'+createFileItems.referenceUid+'/formscript';
									var config_plugins = {
										headers: {
											'groupId': themeDisplay.getScopeGroupId()
										}
									};
									axios.all([
										axios.get(urlFormScript, config_plugins),
										axios.get(urlFormData, config_plugins)
										]).then( axios.spread(function (responesFormScript, responesFormData) {
											// console.log('responesFormScript', responesFormScript)
											// console.log('responesFormData', responesFormData)
											formScriptNew = responesFormScript.data;
											formDataNew = responesFormData.data;
											// console.log('createFileItems', createFileItems)
											// console.log('formScriptNew', formScriptNew)
											// console.log('vm.stepModel.createFiles', vm.stepModel.createFiles)
											createFileItems.formScript = formScriptNew
											createFileItems.formData = formDataNew
											// console.log('vm.stepModel', vm.stepModel)
											vm.stepLoading = false;
											if (vm.stepModel.hasOwnProperty('createFiles') && 
												vm.stepModel.createFiles.length === 1 && 
												vm.stepModel.createFiles[0]['eform']) {
												setTimeout(function () {
													console.log('vm.stepModel.createFiles[0]++++++++++', vm.stepModel.createFiles[0]);
													$("#alpacajs_form_" + vm.stepModel.createFiles[0].partNo).empty();
													vm.showAlpacaJSFORM(vm.stepModel.createFiles[0]);
												}, 500);
											}
										}))
										.catch(function (error) {
											console.log(error);
											vm.stepLoading = false;
										});
									})
								// console.log('++++++++++++++createFiles--------------', vm.stepModel.createFiles)
							}
						} else {
							var urlPluginFormData = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/plugins/'+item.processActionId+'/formdata';
							var urlPluginFormScript = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/plugins/'+item.processActionId+'/formscript';
							var config_plugins = {
								headers: {
									'groupId': themeDisplay.getScopeGroupId()
								},
								dataType : "text"
							};
							axios.all([
								axios.get(urlPluginFormScript, config_plugins),
								axios.get(urlPluginFormData, config_plugins)
								]).then( axios.spread(function (urlResponesFormScript, urlResponesFormData) {
									var responseScript = urlResponesFormScript.data;
									var responseData = urlResponesFormData.data;

									console.log("responseScript==============",responseScript);
									item.plugin = true;

									if (responseScript.indexOf("#preview@pdf") !== -1) {
										console.log("view pdf");
										var url ="/o/rest/v2/dossiers/"+vm.detailModel.dossierId+"/plugins/"+item.processActionId+"/preview" ;

										var config_blob =  {
											headers: {
												'groupId': themeDisplay.getScopeGroupId(),
											},
											responseType: 'blob'
										};
										vm.stepLoading = true;
										axios.get(url, config_blob).then(function (response) {
											var urlblob = window.URL.createObjectURL(response.data);
											item.pdf = true;
											item.url = urlblob;
											item.no_pdf = '';
											vm.stepModel = item;
											vm.stepLoading = false;
											window.open(urlblob, "_blank")
										})
										.catch(function (error) {
											console.log(error);
											item.pdf = true;
											item.url = '';
											item.no_pdf = 'Tài liệu đính kèm không tồn tại!';
											vm.stepModel = item;
											vm.stepLoading = false;
										});

									}


									if (responseScript.indexOf("#preview@html") !== -1) {
										console.log("view html");
										var config_view = {
											headers: {
												'groupId': themeDisplay.getScopeGroupId(),
											},
											dataType : "json"
										};
										item.html = true;
										item.no_html = "";
										vm.stepModel = item;

										var url = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/plugins/'+item.processActionId+'/previewhtml';
										axios.get(url, config_view).then(function (response) {
											item.no_html = "";
											vm.stepModel = item;

											var serializable = response.data ;

											var partNo = serializable.partNo;
											var dossierFileId = serializable.dossierFileId;

											$(".dossierFilePartNo").val("");
											$(".dossierFilePartNo").attr('id','dossierFileId'+partNo);
											$(".dossierFilePartNo").val(dossierFileId);

											var formReport = eval('('+serializable.formReport+')');
											var formData = eval('('+serializable.formData+')');

											// console.log("formReport======",formReport);
											// console.log("formData======",formData);
											/*var formData = serializable.formData;*/


											formReport.data = formData;
											// console.log("formReport_____FINAL=======",formReport);
											$("#alpacajs_form_plugin").alpaca(formReport);
										})
										.catch(function (error) {
											console.log(error);
											item.html = true;
											item.no_html = "Tài liệu đính kèm không tồn tại!";
											vm.stepModel = item;
										});
									}

								})).catch(function (error) {
									console.log(error);
								});

							}
							console.log('scroll+++++++++++', scroll);
							if (scroll) {
								$('html, body').animate({
									scrollTop: $("#tab-dossier-detail-1").offset().top
								}, 200);
							}
						},
						refreshProcess : function () {
							var vm = this;
							vm._initchangeProcessStep();
							vm.stepModel = null;
						},
						postNextActions2 : function (item) {
							console.log("itempostNextActions2============", item);
							var vm = this;
							var createFiles = item.createFiles;
							console.log("createFiles============", createFiles);
							var valid = {
								partNo: 0,
								isValid: true
							};
							if ($('.validCreateFile').length > 0) {
								$('.validCreateFile').each(function (item) {
									if ($(this).val() === "0") {
										valid.isValid = false;
										valid.partNo = $(this).attr("data-pk");
										return;
									}
								})
							}
							if (!valid.isValid && createFiles) {
								let itemFile = createFiles.find(item => {
									return item['partNo'] === valid['partNo']
								})
								if (itemFile) {
									vm.snackbartextdossierViewJX = "Thành phần " + itemFile.partName + " là thành phần bắt buộc!";
									vm.snackbarerordossierViewJX = true;
								}
								return;
							}
							var submitAlpacajsFns = new Array();
							// var promise = new Promise(function (resolve, reject) {
							// 	try {
							// 		vm.actionsSubmitLoading = true;
							// 		$(".saveForm").click();
							// 		resolve(true);
							// 	} catch (e) {
							// 		resolve(false);
							// 	}
							// });

							vm.actionsSubmitLoading = true;
							var arrSaveForm = [];
							if (createFiles && createFiles.length) {
								for (var i = 0; i < createFiles.length; i++) {
									if (createFiles[i].eform) {
										arrSaveForm.push(vm.submitAlpacajsForm(createFiles[i]));
									}
								}
							}
							if (arrSaveForm && arrSaveForm.length) {
								Promise.all(arrSaveForm).then(function (result) {
									console.log('result+++++++++++', result);
									if (result.length) {
										for (var i = 0; i < result.length; i++) {
											if (result[i].hasOwnProperty('partNo') && result[i].hasOwnProperty('referenceUid')) {
												$("#btn-save-formalpaca" + result[i].partNo).click();
											}
										}
									}
									vm.postNextActions(item);
									vm.actionsSubmitLoading = false;
								}).catch(function (reject) {
									vm.snackbartextdossierViewJX = "Lưu form lỗi, vui lòng thử lại!";
									vm.snackbarerordossierViewJX = true;
									vm.actionsSubmitLoading = false;
								})
							} else {
								vm.postNextActions(item);
								// vm.actionsSubmitLoading = false;
							}
							// promise.then(function (success) {
							// 	setTimeout(function () {
									

							// 	}, 500);
							// }).catch(function (error) {
							// });
						},
						postNextActions: function (item) {
							console.log(item);
							var vm = this;
							vm.actionsSubmitLoading = true;
							var fileArr = item.createFiles;
							var idArr = [];
							if (fileArr) {
								var length = fileArr.length;
								for (var i = 0; i < length; i++) {
									var fileDetail = fileArr[i];

									var dossierFileId = fileDetail.dossierFileId;
									var dossierPartId = fileDetail.dossierPartId;
									if (dossierFileId && dossierPartId) {
										var strId = dossierFileId + ',' + dossierPartId;
										idArr.push(strId);
									}
								}
							}

							if (item.configNote) {
								if (item.configNote.requiredNote && !$("textarea#processActionNote").val()) {
									vm.snackbartextdossierViewJX = "Bạn phải nhập ý kiến trước khi gửi";
									vm.snackbarerordossierViewJX = true;
									vm.actionsSubmitLoading = false;
									return;
								}
							}

							console.log(idArr);

							var url = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/actions';

							var assignUserId = 0;
							var subUsers = '';

							if (vm.alpacaAssignUserId != 0) {
								assignUserId = vm.alpacaAssignUserId;
								subUsers = JSON.stringify(vm.subUsers);
							} else if (vm.processAssignUserId.userId > 0) {
								assignUserId = vm.processAssignUserId.userId;
							}
							var isKyOk = item.eSignature;
							if (isKyOk) {
								if (!plugin().valid) {
									alert("Plugin is not working :(");
									vm.actionsSubmitLoading = false;
									isKyOk = false;
									return;
								}
							}
							if (!isKyOk) {
								$.ajax({
									url: url,
									headers: {
										"groupId": themeDisplay.getScopeGroupId()
									},
									data: {
										"actionCode": item.actionCode,
										"actionUser": themeDisplay.getUserName(),
										"actionNote": $("textarea#processActionNote").val(),
										"assignUserId": assignUserId,
										"subUsers": subUsers
									},
									type: 'POST',
									dataType: 'json',
									contentType: 'application/x-www-form-urlencoded; charset=utf-8',
									success: function (data, textStatus, xhr) {
										vm.snackbartextdossierViewJX = item.actionName + " thành công!";
										vm.snackbardossierViewJX = true;


										setTimeout(function() {
											vm._inidanhSachHoSoTable();
											vm.reloadCounter();
										}, 1000);
										vm.detailPage = false;
										vm.actionsSubmitLoading = false;
										vm.onScrollTop();
									},
									error: function (xhr, textStatus, errorThrown) {

										vm.snackbartextdossierViewJX = item.actionName + " thất bại!";
										vm.snackbarerordossierViewJX = true;
										vm.actionsSubmitLoading = false;
									}
								});
							} else {
								if (idArr) {
									var paramObj = {};
									paramObj.actionCode = item.actionCode;
									paramObj.actionUser = themeDisplay.getUserName();
									paramObj.actionNote = $("textarea#processActionNote").val();
									paramObj.assignUserId = assignUserId;
									paramObj.subUsers = subUsers;
									paramObj.postStepCode = item.postStepCode;

									var strIdArr = idArr.join(";");
									var actionName = item.actionName;
									console.log(strIdArr);
									vm.kyDuyetYCGiamDinh(strIdArr,paramObj, actionName);
								}
							}

						},
						kyDuyetYCGiamDinh: function (strIdArr,paramObj, actionName) {

							var vm = this;
							var url = '/o/rest/v2/digitalSignature/'+vm.detailModel.dossierId+'/hashComputed';
							console.log(vm.detailModel.dossierId);

							$.ajax({
								type : 'POST',
								url : url,
								async: false,//bat dong bo = fale, dong bo voi client
								dataType: 'json',
								data : {
									// type: 'kyDuyetYCGiamDinh',
									strIdArr: strIdArr,
									actionCode: paramObj.actionCode,
									postStepCode: paramObj.postStepCode
									// strDossierPartId: strDossierPartId
									/*id : controlRequirementId*/
								},
								success : function (result) {
									console.log(result);
									/*var jsonData = JSON.parse(result);*/
									var msgs = result.msg;
									if (msgs !== 'fileEntryId') {
										var hashComputers = result.hashComputers;
										var signFieldNames = result.signFieldNames;
										var fileNames = result.fileNames;
										var fileEntryId = result.fileEntryId;
										console.log("hashComputers: "+hashComputers);
										console.log("signFieldNames: "+signFieldNames);
										console.log("fileNames: "+fileNames);
										console.log("msgs: "+msgs);
										vm.actionsSubmitLoading = false;
										if (plugin().valid) {

											for ( var i = 0; i < hashComputers.length; i++) {

												var hashComputer = hashComputers[i];
												var code = plugin().Sign(hashComputer);

												if (code === 0 || code === 7) {
													var sign = plugin().Signature;
													var signFieldName = signFieldNames[i];
													var fileName = fileNames[i];
													console.log("sign: "+sign);
													console.log("signFieldName: "+signFieldName);
													console.log("fileName: "+fileName);
													var msg = msgs[i];
													if (msg == 'success') {
														try {
															vm.completeKyDuyetYCGiamDinh(sign, signFieldName, fileName, fileEntryId, paramObj, actionName);
														}
														catch(err) {
															console.log(err);
														}
													} else{
														alert(msg);
													}
												} else{
													alert(plugin().ErrorMessage);
												}
											}
										} else {
											alert("Plugin is not working");
										}
									} else {
										alert("Cảnh báo: Không tìm thấy file bản thảo. Tạm dừng tiến trình ký số");
									}
								},
								error : function (result) {
									vm.actionsSubmitLoading = false;
								}
							});
						},
						completeKyDuyetYCGiamDinh: function (sign, signFieldName, fileName, fileEntryId,paramObj, actionName) {
							var vm = this;
							var url = '/o/rest/v2/digitalSignature/' + vm.detailModel.dossierId + '/dossierFile';
							$.ajax({
								type : 'PUT',
								url : url,
								async: false,//bat dong bo = fale, dong bo voi client
								dataType : 'json',
								headers: {
									"groupId": themeDisplay.getScopeGroupId()
								},
								data: {
									actionCode: paramObj.actionCode,
									actionUser: paramObj.actionUser,
									actionNote: paramObj.actionNote,
									assignUserId: paramObj.assignUserId,
									postStepCode: paramObj.postStepCode,
									subUsers: paramObj.subUsers,
									sign: sign,
									signFieldName: signFieldName,
									fileName: fileName,
									fileEntryId: fileEntryId
								},
								success : function (result) {
									console.log(result);
									/*var jsonData = JSON.parse(result);*/
									var msg = result.msg;
									if (msg == 'success') {
										//	alert('ký số thành công!');
										vm.snackbartextdossierViewJX = actionName + " thành công!";
										vm.snackbardossierViewJX = true;

										vm._inidanhSachHoSoTable();
										setTimeout(function() {
											vm._initlistgroupHoSoFilter();
										}, 1000);

										vm.detailPage = false;
										vm.actionsSubmitLoading = false;
										vm.onScrollTop();
									} else if (msg == 'fileEntryId') {
										alert("Cảnh báo: Không tìm thấy file bản thảo. Tạm dừng tiến trình đóng dấu số");
									} else {
										alert(msg);
									}
								},
								error: function() {
									alert('ky so false');
								}
							})
						},
						_initchangeProcessStep: function () {
							var vm = this;
							vm.stepLoading = true;

							var url = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/nextactions';
							var urlPlugin = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/plugins';
                            // var url = '/o/frontendwebdossier/json/steps.json';

                            axios.all([
                            	axios.get(url, config),
                            	axios.get(urlPlugin, config)
                            	]).then( axios.spread(function (urlRespones, urlPluginsRespones) {

                            		var serializable = urlRespones.data.data;
                            		var serializablePlugins = urlPluginsRespones.data.data;
                            		var serializablePluginsConvert = [];
                            		var serializableNextActionConvert = [];

                            		if (serializable) {
                            			for (var i = 0; i < serializable.length; i++) {
                            				serializable[i].type = 1;
                            				if (!serializable[i].autoEvent) {
                            					if (serializable[i].configNote) {
                            						var configNote = JSON.parse(serializable[i].configNote);
                            						serializable[i].configNote = configNote;

                            					}
                            					serializableNextActionConvert.push(serializable[i]);
                            				}

                            			}
                            		} else {
                            			serializable = [];
                            			serializableNextActionConvert = [];
                            		}

                            		if (serializablePlugins) {
                            			for (var i = 0; i < serializablePlugins.length; i++) {
                            				var plugin = {
                            					type : 2,
                            					processActionId : serializablePlugins[i].processPluginId,
                            					actionName : serializablePlugins[i].pluginName
                            				};
                            				serializablePluginsConvert.push(plugin);
                            			}
                            		}
                            		var nextactions = serializableNextActionConvert;
                            		var plugins = serializablePluginsConvert;
                            		vm.processSteps = $.merge( nextactions, plugins );
                            		vm.stepLoading = false;
                            		console.log(vm.processSteps);

                            		if (vm.processSteps.length === 1) {
                            			vm.changeProcessStep(vm.processSteps[0]);
                            		}

                            	})).catch(function (error) {
                            		console.log(error);
                            		vm.stepLoading = false;

                            	});
                            	return false;
                            },
                            filterAllDossierWithOutStatus: function () {
                            	this.stageFilterView = 'danh_sach';
                            	this.listgroupHoSoFilterselectedIndex = -1;
                            	this.traCuuFilter = false;
                            	this.detailRegistPage = false;
                            	this._inidanhSachHoSoTable(false);
                            },
                            filterTraCuu: function () {
                            	this.traCuuFilter = true;
                            	this.detailRegistPage = false;
                            },
                            singleFileUpload: function (item) {
                            	var vm = this;
                            	vm.actionsSubmitLoading = true;
                            	document.getElementById('inputfile_'+item.dossierPartId).click();
                            	setTimeout(function() {
                            		vm.actionsSubmitLoading = false;
                            	}, 400);
                            },
                            singleFileUploadLeave: function () {
                            	var vm = this;
                            	vm.actionsSubmitLoading = false;
                            },
                            singleFileUploadInput: function (e, item, index) {

                            	var files = e.target.files || e.dataTransfer.files;

                            	var file = files[0];

                            	var vm = this;
                            	vm.actionsSubmitLoading = true;

                            	var url = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/files';

                            	var data = new FormData();
                            	data.append( 'displayName', file.name );
                            	data.append( 'file', file );
                            	data.append( 'dossierPartNo', item.partNo );
                            	data.append( 'dossierTemplateNo', vm.detailModel.dossierTemplateNo );
                            	data.append( 'fileTemplateNo', item.templateFileNo );
                            	data.append( 'fileType', '' );
                            	data.append( 'isSync', item.returned );
                            	data.append( 'referenceUid', '' );
                            	data.append( 'formData', '' );

                            	$.ajax({
                            		type : 'POST',
                            		url  : url,
                            		data : data,
                            		headers: {"groupId": themeDisplay.getScopeGroupId()},
                            		processData: false,
                            		contentType: false,
                            		cache: false,
                            		success :  function (result) {
                            			vm.actionsSubmitLoading = false;
                            			vm.snackbartextdossierViewJX = " Tải file thành công!";
                            			vm.snackbardossierViewJX = true;
                            			vm.stepModel.createFiles[index].counter = vm.stepModel.createFiles[index].counter + 1;

                            		},
                            		error:function (result) {
                            			vm.actionsSubmitLoading = false;
                            			vm.snackbartextdossierViewJX = "Tải file thất bại!";
                            			vm.snackbarerordossierViewJX = true;
                            		}
                            	});
                            },
                            undoDetailPage: function () {

                            	this.detailPage = !this.detailPage;
                            	setTimeout(function() {
								$('.danhSachHoSoTable__class th[role="columnheader"]').each(function( index ) {
									if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
										$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
									} else {
										$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
									}
								});
							}, 300);
                            },
                            undoDetailRegistPage: function () {
                            	var vm = this;
                            	this.detailRegistPage = !this.detailRegistPage;
                            	vm.detailPage = false;
                            	vm.stageFilterView = 'doanh_nghiep_trong_nuoc';
                            	setTimeout(function() {
                            		$('.thongTinDoanhNghiepTable__class th[role="columnheader"]').each(function( index ) {
                            			if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
                            				$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
                            			} else {
                            				$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
                            			}
                            		});
                            	}, 300);
                            },
                            onScroll(e) {
                            	this.offsetTop = window.pageYOffset || document.documentElement.scrollTop
                            },
                            onScrollTop (e) {
                            	window.scrollBy(0, -99999)
                            },
                            newTabOrNewWindown : function() {
                            	var vm = this;
                            	console.log("===============run newTabOrNewWindown============");
                            	console.log("=============stateWindow==========", stateWindowParam)
                            	if (stateWindowParam === "stateWindow") {

                            		if (dossierIdParam) {
                            			var urlDetailDossier = '/o/rest/v2/dossiers/'+dossierIdParam;

                            			axios.get(urlDetailDossier, config).then(function (response) {
                            				var detailDossier = response.data;
                            				vm.detailModel = detailDossier;

                            				var url = "/o/rest/v2/dossiertemplates/"+detailDossier.dossierTemplateNo;
                            				var urlFiles = "/o/rest/v2/dossiers/"+dossierIdParam+"/files";

                            				axios.all([
                            					axios.get(url, config),
                            					axios.get(urlFiles, config)
                            					])
                            				.then(axios.spread(function (urlRespones, urlFilesRespones) {

                            					var serializableTemplate = urlRespones.data;
                            					var serializableFiles = urlFilesRespones.data.data;

                            					for (var i = 0; i < serializableTemplate.dossierParts.length; i++) {
                            						var itemPart = serializableTemplate.dossierParts[i];
                            						if (itemPart.partNo === dossierPartNo) {
                            							vm.dossierViewJXTitle = itemPart.partName;
                            						}

                            					}

                            					var listFilesUpload = [];
                            					for (var key in serializableFiles) {
                            						if (serializableFiles[key].dossierPartNo === dossierPartNo) {
                            							if (serializableFiles[key].fileSize > 0) {
                            								listFilesUpload.push(serializableFiles[key]);
                            							}

                            						}
                            					}
                            					vm.listDocumentInPartNoItems = listFilesUpload;

                            					vm.popUpViewDossierFile = !vm.popUpViewDossierFile;

                            					vm._initCbxDocumentNewTab(listFilesUpload);

                            				})).catch(function (error) {
                            					console.log(error);

                            				});

                            			}).catch(function (error) {
                            				console.log(error);

                            			});

                            		}
                            	}
                            }
                        }
                    },
                    'listgroupHoSoFilter': {
                    	'id': 'listgroupHoSoFilter',
                    	'name': 'listgroupHoSoFilter',
                    	"type": "listgroup",
                    	'show_counter': true,
                    	'counter': 'count',
                    	"child_items": "items",
                    	"data_title": "title",
                    	"data_value": "id",
                    	"onLoad": "_initlistgroupHoSoFilter",
                    	"onClick": "groupHoSoFilter",
                    	"events": {
                    		groupHoSoFilter: function (item) {
                    			var vm = this;
                    			console.log("item status",item);

                    			if (item.id === 'special') {
                    				vm.detailPage = false;
                    				vm.detailRegistPage = false;
                    				if (item.idSub === 'special') {
                    					vm.stageFilterView = "quan_ly_pxx";
                    					vm.loadPhieuXX();
                    					vm.loadDoiPhong();
                    					vm.loadMauPhoi();
                    					vm.loadDoiTuong();
                    				} else if (item.idSub === 'ds_nhap_kho') {
                    					vm.stageFilterView = item.idSub;
                    					vm.loadDSPNK();
                    				} else {
                    					vm.stageFilterView = item.idSub;
                    					vm.loadDSPXK();
                    				}
                    				return;
                    			}
                    			vm.reloadCounter();
                    			vm.detailPage = false;
                    			vm.detailRegistPage = false;
                    			vm.listgroupHoSoFilterselected = item.id;
                    			vm.danhSachHoSoTablepage = 1;

                    			vm.listgroupHoSoFilterselectedIndex = item.index - 1;

                    			if ( item.id !== 'tra_cuu' ) {
                    				vm.stageFilterView = item.id;
                    				vm.hoso_title_table = item.title;
                    				if (item.level === 1) {
                    					vm.statusParamFilter = item.idSub;
                    					vm.substatusParamFilter = item.id;
                    				} else {
                    					vm.statusParamFilter = item.id;
                    					vm.substatusParamFilter = item.idSub;
                    				}

                    			}
                    			if (item.id == 'tra_cuu_hoso') {
                    				vm._initraCuuHoSoTable(false);
                    			} else if (item.id == 'tra_cuu_phuong_tien') {

                    			} else if (item.id == 'tra_cuu_thong_tin_doanh_nghiep') {
                    				vm._inithongTinDoanhNghiepTable(false);
                    				vm.detailRegistPage = false;
                    			} else {
                    				vm._inidanhSachHoSoTable(false);
                    			}

                    			for (var i = 0; i < vm.listGroupMenus.length; i++) {
                    				if (vm.listGroupMenus[i].hasOwnProperty('lsGroupMenus') && vm.listGroupMenus[i].lsGroupMenus.length > 0) {
                    					var indexTmp = vm.listGroupMenus[i].lsGroupMenus.findIndex(function (itemChild) {
                                           return itemChild.id === item.id
                    					});
                    					if (indexTmp !== -1) {
                    						vm.indexSelectMenu = indexTmp;
                    						vm.indexGroupMenu = i;
                    						return;
                    					}
                    				}
                    			}
                    			vm.onScrollTop();

                    		},
                    		reloadCounter: function () {
                    			var vm = this;
                    			// return;
                    			if (sessionStorage.getItem("advanced_filter_all") === 'true') {
                    				vm.advanced_filter_all = true;
                    			} else {
                    				vm.advanced_filter_all = false;
                    			}
                    			var url = '/o/rest/v2/statistics/dossiers/todo';
                    			var url2 = '/o/rest/v2/temp/dictcollections/VR_MENU/dictitems?sort=sibling';
                    			axios.all([axios.get(url, config), axios.get(url2, config)]).then( axios.spread(function (responesToDo, responesDataItem) {
                    				var todos = responesToDo.data;
                    				var dataItems = responesDataItem.data;

                    				//////////////////////////////////////////////
                    				vm.listgroupHoSoFilterItems = [];
                    				var serializable = todos;
                    				var indexTree = -1;
                    				var index = 0;
                    				var is_PROCESSING_72 = false;
                    				for (var key in serializable.data) {
                    					if (serializable.data[key].dossierStatus === 'PROCESSING_72' || serializable.data[key].dossierSubStatus === 'PROCESSING_72') {
                    						is_PROCESSING_72 = true;
                    					}
                    					if ( serializable.data[key].level === 0) {

                    						if (serializable.data[key].dossierStatus === 'cancelling' || serializable.data[key].dossierStatus === 'cancelled' || serializable.data[key].dossierStatus === 'processing' || serializable.data[key].dossierStatus === 'paid') {
                    							serializable.data[key].items = [];

                    							vm.listgroupHoSoFilterItems.push({
                    								id: serializable.data[key].dossierStatus,
                    								idSub: serializable.data[key].dossierSubStatus,
                    								title: serializable.data[key].statusName,
                    								level: serializable.data[key].level,
                    								count: serializable.data[key].count,

                    								action: 'folder',
                    								action_active: 'folder_open',
                    								items: [],
                    								index: index
                    							});
                    						}

                    					} else {

                    						vm.listgroupHoSoFilterItems.push({
                    							id: serializable.data[key].dossierSubStatus,
                    							idSub: serializable.data[key].dossierStatus,
                    							title: serializable.data[key].statusName,
                    							level: serializable.data[key].level,
                    							count: serializable.data[key].count,
                    							action: 'folder',
                    							action_active: 'folder_open',
                    							items: [],
                    							index: index
                    						});
                    					}

                    				}
                    				if (is_PROCESSING_72) {
                    					vm.listgroupHoSoFilterItems.push({
                    						id: 'special',
                    						idSub: 'special',
                    						title: 'Quản lý phiếu xuất xưởng',
                    						level: 1,
                    						count: '',
                    						action: 'folder',
                    						action_active: 'folder_open',
                    						items: [
                    							{
                    								id: 'special',
                    								idSub: 'ds_nhap_kho',
                    								title: 'Danh sách phiếu nhập',
                    								level: 2,
                    								count: '',
                    								action: 'folder',
                    								action_active: 'folder_open'
                    							},
                    							{
                    								id: 'special',
                    								idSub: 'ds_xuat_kho',
                    								title: 'Danh sách phiếu xuất',
                    								level: 2,
                    								count: '',
                    								action: 'folder',
                    								action_active: 'folder_open'
                    							}
                    						],
                    						index: index
                    					});
                    				}

                    				//////////////////////////////////////////////

                    				if (todos.data && dataItems.data) {
                    					var todosTmp = todos.data;
                    					var dataItemsTmp = dataItems.data;

                    					for (var h = 0; h < dataItemsTmp.length; h++) {
                    						if (dataItemsTmp[h].level === 0) {
                    							var itemTemp = dataItemsTmp.filter(function (value) {
                    								return value.level === 1 && value.parentItemId ==  dataItemsTmp[h].dictItemId
                    							})
                    							dataItemsTmp[h]['items'] = itemTemp ? itemTemp : []
                    						}
                    					}
                    					dataItemsTmp = dataItemsTmp.filter(function (value) {
                    						return value.level === 0
                    					})

                    					for (var i = 0; i < dataItemsTmp.length; i++) {
                    						var items = [];
                    						var listStatusTmp = dataItemsTmp[i].items;
                    						for (var j = 0; j < listStatusTmp.length; j++) {
                    							var indexTmp = todosTmp.findIndex(function (item) {
                    								return item.dossierSubStatus === listStatusTmp[j].itemCode;
                    							});
                    							if (indexTmp !== -1) {
                    								items.push({
                    									id: todosTmp[indexTmp].dossierSubStatus,
                    									idSub: todosTmp[indexTmp].dossierStatus,
                    									title: todosTmp[indexTmp].statusName,
                    									level: todosTmp[indexTmp].level,
                    									count: todosTmp[indexTmp].count,
                    									action: 'folder',
                    									action_active: 'folder_open',
                    									items: [],
                    									index: 0
                    								});
                    							}
                    						}
                    						dataItemsTmp[i]['lsGroupMenus'] = items;
                    					}
                    					vm.listGroupMenus = dataItemsTmp;
                    				} else {
                    					vm.listGroupMenus = [];
                    				}
                    				var countGroup = 0;
                    				for (var k = 0; k < vm.listGroupMenus.length; k++) {
                    					if (vm.listGroupMenus[k].items.length > 0) {
                    						countGroup ++;
                    					}
                    				}
                    				if (countGroup >= 2) {
                    					vm.showGroupMenus = true;
                    				} else {
                    					vm.showGroupMenus = false;
                    				}
                    			})).catch(function (error) {
									console.log(error);
                    			});
                    			return false;
                    		},
                    		_initlistgroupHoSoFilter: function (select) {
                    			var vm = this;
                    			vm.newTabOrNewWindown();
                    			vm.setStateOnlyFollow(emailAddress);
                    			vm.getLastedStateUserInfo(function() {
                    				vm._inidanhSachHoSoTable(false);
                    			});
                    			if (sessionStorage.getItem("advanced_filter_all") === 'true') {
                    				vm.advanced_filter_all = true;
                    			} else {
                    				vm.advanced_filter_all = false;
                    			}
                    			vm.stageFilterView = 'danh_sach';
                    			vm.listgroupHoSoFilterItems = [];
                    			var url = '/o/rest/v2/statistics/dossiers/todo';
                    			var url2 = '/o/rest/v2/temp/dictcollections/VR_MENU/dictitems?sort=sibling';
                    			axios.all([axios.get(url, config), axios.get(url2, config)]).then( axios.spread(function (responesToDo, responesDataItem) {
                    				var todos = responesToDo.data;
                    				var dataItems = responesDataItem.data;

                    				//////////////////////////////////////////////
                    				
                    				var serializable = todos;
                    				var indexTree = -1;
                    				var index = 0;
                    				var is_PROCESSING_72 = false;
                    				for (var key in serializable.data) {
                    					if (serializable.data[key].dossierStatus === 'PROCESSING_72' || serializable.data[key].dossierSubStatus === 'PROCESSING_72') {
                    						is_PROCESSING_72 = true;
                    					}
                    					if ( serializable.data[key].level === 0) {

                    						if (serializable.data[key].dossierStatus === 'cancelling' || serializable.data[key].dossierStatus === 'cancelled' || serializable.data[key].dossierStatus === 'processing' || serializable.data[key].dossierStatus === 'paid') {
                    							serializable.data[key].items = [];

                    							vm.listgroupHoSoFilterItems.push({
                    								id: serializable.data[key].dossierStatus,
                    								idSub: serializable.data[key].dossierSubStatus,
                    								title: serializable.data[key].statusName,
                    								level: serializable.data[key].level,
                    								count: serializable.data[key].count,

                    								action: 'folder',
                    								action_active: 'folder_open',
                    								items: [],
                    								index: index
                    							});
                    						}

                    					} else {

                    						vm.listgroupHoSoFilterItems.push({
                    							id: serializable.data[key].dossierSubStatus,
                    							idSub: serializable.data[key].dossierStatus,
                    							title: serializable.data[key].statusName,
                    							level: serializable.data[key].level,
                    							count: serializable.data[key].count,
                    							action: 'folder',
                    							action_active: 'folder_open',
                    							items: [],
                    							index: index
                    						});
                    					}

                    				}
                    				if (is_PROCESSING_72) {
                    					vm.listgroupHoSoFilterItems.push({
                    						id: 'special',
                    						idSub: 'special',
                    						title: 'Quản lý phiếu xuất xưởng',
                    						level: 1,
                    						count: '',
                    						action: 'folder',
                    						action_active: 'folder_open',
                    						items: [
                    							{
                    								id: 'special',
                    								idSub: 'ds_nhap_kho',
                    								title: 'Danh sách phiếu nhập',
                    								level: 2,
                    								count: '',
                    								action: 'folder',
                    								action_active: 'folder_open'
                    							},
                    							{
                    								id: 'special',
                    								idSub: 'ds_xuat_kho',
                    								title: 'Danh sách phiếu xuất',
                    								level: 2,
                    								count: '',
                    								action: 'folder',
                    								action_active: 'folder_open'
                    							}
                    						],
                    						index: index
                    					});
                    				}

                    				//////////////////////////////////////////////

                    				if (todos.data && dataItems.data) {
                    					var todosTmp = todos.data;
                    					var dataItemsTmp = dataItems.data;
                    					vm.dataItemsMenu = dataItemsTmp;
                    					for (var h = 0; h < dataItemsTmp.length; h++) {
                    						if (dataItemsTmp[h].level === 0) {
                    							var itemTemp = dataItemsTmp.filter(function (value) {
                    								return value.level === 1 && value.parentItemId ==  dataItemsTmp[h].dictItemId
                    							})
                    							dataItemsTmp[h]['items'] = itemTemp ? itemTemp : []
                    						}
                    					}
                    					dataItemsTmp = dataItemsTmp.filter(function (value) {
                    						return value.level === 0
                    					})

                    					for (var i = 0; i < dataItemsTmp.length; i++) {
                    						var items = [];
                    						var listStatusTmp = dataItemsTmp[i].items;
                    						for (var j = 0; j < listStatusTmp.length; j++) {
                    							var indexTmp = todosTmp.findIndex(function (item) {
                    								return item.dossierSubStatus === listStatusTmp[j].itemCode;
                    							});
                    							if (indexTmp !== -1) {
                    								items.push({
                    									id: todosTmp[indexTmp].dossierSubStatus,
                    									idSub: todosTmp[indexTmp].dossierStatus,
                    									title: todosTmp[indexTmp].statusName,
                    									level: todosTmp[indexTmp].level,
                    									count: todosTmp[indexTmp].count,
                    									action: 'folder',
                    									action_active: 'folder_open',
                    									items: [],
                    									index: 0
                    								});
                    							}
                    						}
                    						dataItemsTmp[i]['lsGroupMenus'] = items;
                    					}
                    					vm.listGroupMenus = dataItemsTmp;
                    				} else {
                    					vm.listGroupMenus = [];
                    				}
                    				var countGroup = 0;
                    				for (var k = 0; k < vm.listGroupMenus.length; k++) {
                    					if (vm.listGroupMenus[k].items.length > 0) {
                    						countGroup ++;
                    					}
                    				}
                    				if (countGroup >= 2) {
                    					vm.showGroupMenus = true;
                    				} else {
                    					vm.showGroupMenus = false;
                    				}
                    			})).catch(function (error) {
									console.log(error);
                    			});
                    			return false;
                    		}
                    		// _initlistgroupHoSoFilter: function (select) {
                    		// 	var vm = this;
                    		// 	vm.newTabOrNewWindown();
                    		// 	vm.setStateOnlyFollow(emailAddress);
                    		// 	vm.getLastedStateUserInfo(function() {
                    		// 		vm._inidanhSachHoSoTable(false);
                    		// 	});
                    		// 	vm.stageFilterView = 'danh_sach';
                    		// 	vm.listgroupHoSoFilterItems = [];
                    		// 	var url = '/o/rest/v2/statistics/dossiers/todo';
                    		// 	axios.get(url, config).then(function (response) {
                    		// 		var serializable = response.data;
                    		// 		var indexTree = -1;
                    		// 		var index = 0;
                    		// 		var is_PROCESSING_72 = false;
                    		// 		for (var key in serializable.data) {
                    		// 			if (serializable.data[key].dossierStatus === 'PROCESSING_72' || serializable.data[key].dossierSubStatus === 'PROCESSING_72') {
                    		// 				is_PROCESSING_72 = true;
                    		// 			}
                    		// 			if ( serializable.data[key].level === 0) {

                    		// 				if (serializable.data[key].dossierStatus === 'cancelling' || serializable.data[key].dossierStatus === 'cancelled' || serializable.data[key].dossierStatus === 'processing' || serializable.data[key].dossierStatus === 'paid') {
                    		// 					serializable.data[key].items = [];

                    		// 					vm.listgroupHoSoFilterItems.push({
                    		// 						id: serializable.data[key].dossierStatus,
                    		// 						idSub: serializable.data[key].dossierSubStatus,
                    		// 						title: serializable.data[key].statusName,
                    		// 						level: serializable.data[key].level,
                    		// 						count: serializable.data[key].count,

                    		// 						action: 'folder',
                    		// 						action_active: 'folder_open',
                    		// 						items: [],
                    		// 						index: index
                    		// 					});
                    		// 				}

                    		// 			} else {

                    		// 				vm.listgroupHoSoFilterItems.push({
                    		// 					id: serializable.data[key].dossierSubStatus,
                    		// 					idSub: serializable.data[key].dossierStatus,
                    		// 					title: serializable.data[key].statusName,
                    		// 					level: serializable.data[key].level,
                    		// 					count: serializable.data[key].count,
                    		// 					action: 'folder',
                    		// 					action_active: 'folder_open',
                    		// 					items: [],
                    		// 					index: index
                    		// 				});
                    		// 			}

                    		// 		}
                    		// 		if (is_PROCESSING_72) {
                    		// 			vm.listgroupHoSoFilterItems.push({
                    		// 				id: 'special',
                    		// 				idSub: 'special',
                    		// 				title: 'Quản lý phiếu xuất xưởng',
                    		// 				level: 1,
                    		// 				count: '',
                    		// 				action: 'folder',
                    		// 				action_active: 'folder_open',
                    		// 				items: [],
                    		// 				index: index
                    		// 			});
                    		// 		}
                    		// 		if (select) {
                    		// 			console.log("selected========",select);
                    		// 			vm.listgroupHoSoFilterselected = select;
                    		// 		}

                    		// 	}).catch(function (error) {
                    		// 		console.log(error);
                    		// 	});
                    		// 	return false;
                    		// }
                    	}
                    },
                    'listgroupTraCuuFilter': {
                    	'id': 'listgroupTraCuuFilter',
                    	'name': 'listgroupTraCuuFilter',
                    	"type": "listgroup",
                    	'cssClass': 'pb-5',
                    	"child_items": "items",
                    	"data_title": "title",
                    	"data_value": "id",
                    	"onLoad": "_initlistgroupTraCuuFilter",
                    	"onClick": "filterChange",
                    	"events": {
                    		filterChange: function (item) {
                    			var vm = this;
                    			vm.detailPage = false;
                    			vm.detailRegistPage = false;
                    			vm.listgroupTraCuuFilterselected = item.id;
                    			if ( item.id !== 'tra_cuu' ) {
                    				vm.stageFilterView = item.id;
                    				vm.hoso_title_table = item.title;
                    			}

                    			if (item.id == 'tra_cuu_hoso') {
                    				vm._initraCuuHoSoTable(false);
                    				vm._initAdvanced_filter_serviceInfo();
                    				vm._initAdvanced_filter_loaiSanPham();
                    				vm._initAdvanced_filter_nhanHieu();
                    				vm._initAdvanced_filter_dossierStatus();

                    			} else if (item.id == 'tra_cuu_phuong_tien') {
                    				vm.loadDSDangKiemVien();
                    				vm.loadDSTinhThanh();
                    				vm.loadDSDoiTuong();
                    				vm.loadDSDonViKiemTra();
                    				vm.loadDSPhuongThucCapPP();
                    				vm.loadDSKQChungChi();
                    				vm.loadDSPhuongTien();
                    				vm.loadDSThongSoKyThuat();
                    				vm.timKiem();
                    			} else if (item.id === 'tat_ca_hoso') {
                    				vm.loadDSDangKiemVien();
                    				vm.loadDSTinhThanh();
                    				vm.loadDSDoiTuong();
                    				vm.loadDSDonViKiemTra();
                    				vm.loadDSPhuongThucCapPP();
                    				vm.loadDSKQChungChi();
                    				vm.loadDSPhuongTien();
                    				vm.loadDSThongSoKyThuat();
                    				vm.detailPage = false;
                    				vm.detailRegistPage = false;
                    				vm.listgroupHoSoFilterselected = item.id;
                    				vm.danhSachHoSoTablepage = 1;
                    				vm.listgroupHoSoFilterselectedIndex = item.index - 1;

                    				vm.statusParamFilter = '';
                    				vm.substatusParamFilter = '';

                    				vm.follow = false;

                    				vm._inidanhSachHoSoTable(false);
                    				vm.onScrollTop();
                    			}

                    		},
                    		_initlistgroupTraCuuFilter: function() {
                    			var vm = this;

                    			vm.listgroupTraCuuFilterItems = [
                    			{
                    				id: 'tat_ca_hoso',
                    				title: 'Tất cả hồ sơ'
                    			},
                    			// {
                    			// 	id: 'tra_cuu_hoso',
                    			// 	title: 'Tra cứu kết quả'
                    			// },
                    			{
                    				id: 'tra_cuu_phuong_tien',
                    				title: 'Phương tiện sản xuất lắp ráp'
                    			},
                    			// {
                    			// 	id: 'tra_cuu_thong_tin_doanh_nghiep',
                    			// 	title: 'Thông tin doanh nghiệp'
                    			// }
                    			];

                    		}
                    	}
				},
				'listgroupQuanTriFilter': {
                    	'id': 'listgroupQuanTriFilter',
                    	'name': 'listgroupQuanTriFilter',
                    	"type": "listgroup",
                    	'cssClass': 'pb-5',
                    	"child_items": "items",
                    	"data_title": "title",
                    	"data_value": "id",
                    	"onLoad": "_initlistgroupQuanTriFilter",
                    	"onClick": "filterQuanTriChange",
                    	"events": {
                    		filterQuanTriChange: function (item) {
                    			var vm = this;
                    			vm.detailPage = false;
                    			vm.detailRegistPage = false;
                    			vm.listgroupQuanTriFilterselected = item.id;
                    			vm.stageFilterView = item.id;
                    			vm.hoso_title_table = item.title;

                    			if (item.id == 'doanh_nghiep_trong_nuoc') {
                    				vm._inithongTinDoanhNghiepTable(false);
                    				vm.onScrollTop();
                    			} else if (item.id === 'co_so_nuoc_ngoai') {

                    				vm.detailPage = false;
                    				vm.detailRegistPage = false;
                    				vm.listgroupQuanTriFilterselected = item.id;
                    				vm.danhSachHoSoTablepage = 1;
                    				vm.listgroupQuanTriFilterselectedIndex = item.index - 1;
                    				vm.pageCoSoNuocNgoai = 1;
                    				vm.loadDSCoSoNuocNgoai();
                    				vm.loadLoaiHinhCSSX();
                    				vm.loadCSSXCha();
                    				vm.onScrollTop();
                    			}

                    		},
                    		_initlistgroupQuanTriFilter: function() {
                    			var vm = this;

                    			vm.listgroupQuanTriFilterItems = [
                    			{
                    				id: 'doanh_nghiep_trong_nuoc',
                    				title: 'Doanh nghiệp trong nước'
                    			},
                    			{
                    				id: 'co_so_nuoc_ngoai',
                    				title: 'Cơ sở sản xuất nước ngoài'
                    			}
                    			];

                    		}
                    	}
				},
				'listgroupBaoCaoFilter': {
					'id': 'listgroupBaoCaoFilter',
					'name': 'listgroupBaoCaoFilter',
					"type": "listgroup",
					"child_items": "items",
					"data_title": "title",
					"data_value": "id",
					"onLoad": "_initlistgroupBaoCaoFilter",
					"onClick": "filterChangeBaoCao",
					"events": {
						filterChangeBaoCao: function (item) {
							var vm = this;
							/*vm.detailPage = false;
							vm.detailRegistPage = false;
							vm.listgroupTraCuuFilterselected = item.id;
							if ( item.id !== 'tra_cuu' ) {
								vm.stageFilterView = item.id;
								vm.hoso_title_table = item.title;
							}

							if (item.id == 'tra_cuu_hoso') {
								vm._initraCuuHoSoTable(false);
								vm._initAdvanced_filter_serviceInfo();
								vm._initAdvanced_filter_loaiSanPham();
								vm._initAdvanced_filter_nhanHieu();

							} else if (item.id == 'tra_cuu_phuong_tien') {
								// TODO vm._inidanhSachHoSoTable(false);
							} else if (item.id == 'tra_cuu_thong_tin_doanh_nghiep') {
								vm._inithongTinDoanhNghiepTable(false);
							}*/

						},
						_initlistgroupBaoCaoFilter: function() {
							var vm = this;

							vm.listgroupBaoCaoFilterItems = [
							{
								id: 'tham_dinh_bao_cao',
								title: 'Thẩm định thiết kế'
							},
							{
								id: 'kiem_tra_san_pham_mau',
								title: 'Kiểm tra sản phẩm mẫu'
							},
							{
								id: 'danh_gia_cop_thiet_bi_ktxx',
								title: 'Đánh giá COP, Thiết bị KTXX'
							},
							{
								id: 'cncl_kieu_loai',
								title: 'CNCL kiểu loại'
							},
							{
								id: 'cap_phat_su_dung_an_chi',
								title: 'Cấp phát, sử dụng ấn chỉ'
							},
							{
								id: 'thu_tuc_khac',
								title: 'Thủ tục khác'
							}
							];

						}
					}
				},
				'keywordsSearchTraCuuHoSo': {
					'id': 'keywordsSearchTraCuuHoSo',
					'name': 'keywordsSearchTraCuuHoSo',
					'type': 'text',
					'cssClass': 'pt-1',
					'placeholder': 'Tìm kiếm theo từ khoá...',
					'solo': true,
					'append_icon': 'search',
					'onKeyup': 'filterTraCuuHoSoKeywords',
					'events': {
						filterTraCuuHoSoKeywords: function (event) {
							var vm = this;
							if (event.keyCode === 13 || vm.keywordsSearchTraCuuHoSo.length > 3 || vm.keywordsSearchTraCuuHoSo.length === 0) {
								vm._initraCuuHoSoTable(false);
							}

						}
					}
				},
				'keywordsSearchTraCuuPhuongTien': {
					'id': 'keywordsSearchTraCuuPhuongTien',
					'name': 'keywordsSearchTraCuuPhuongTien',
					'type': 'text',
					'cssClass': 'pt-1',
					'placeholder': 'Tìm kiếm theo từ khoá...',
					'solo': true,
					'append_icon': 'search',
					'onKeyup': 'filterTraCuuPhuongTienKeywords',
					'events': {
						filterTraCuuPhuongTienKeywords: function (event) {
							var vm = this;
							if (event.keyCode === 13 || vm.keywordsSearchTraCuuPhuongTien.length > 3 || vm.keywordsSearchTraCuuPhuongTien.length === 0) {

							}

						}
					}
				},
				'keywordsSearchTraCuuDoanhNghiep': {
					'id': 'keywordsSearchTraCuuDoanhNghiep',
					'name': 'keywordsSearchTraCuuDoanhNghiep',
					'type': 'text',
					'cssClass': 'pt-1',
					'placeholder': 'Tìm kiếm theo từ khoá...',
					'solo': true,
					'append_icon': 'search',
					'onKeyup': 'filterTraCuuDoanhNghiepKeywords',
					'events': {
						filterTraCuuDoanhNghiepKeywords: function (event) {
							var vm = this;
							if (event.keyCode === 13 || vm.keywordsSearchTraCuuDoanhNghiep.length > 3 || vm.keywordsSearchTraCuuDoanhNghiep.length === 0) {
								vm._inithongTinDoanhNghiepTable(false);
							}

						}
					}
				},
				'keywordsSearchTraCuuDoanhNghiepNuocNgoai': {
					'id': 'keywordsSearchTraCuuDoanhNghiepNuocNgoai',
					'name': 'keywordsSearchTraCuuDoanhNghiepNuocNgoai',
					'type': 'text',
					'cssClass': 'pt-1',
					'placeholder': 'Tìm kiếm theo từ khoá...',
					'solo': true,
					'append_icon': 'search',
					'onKeyup': 'filterTraCuuDoanhNghiepNNKeywords',
					'events': {
						filterTraCuuDoanhNghiepNNKeywords: function (event) {
							var vm = this;
							if (event.keyCode === 13 || vm.keywordsSearchTraCuuDoanhNghiepNuocNgoai.length > 3 || vm.keywordsSearchTraCuuDoanhNghiepNuocNgoai.length === 0) {
								vm.loadDSCoSoNuocNgoai(false);
							}

						}
					}
				},
				'keywordsSearchDanhSachHoSo': {
					'id': 'keywordsSearchDanhSachHoSo',
					'name': 'keywordsSearchDanhSachHoSo',
					'type': 'text',
					'cssClass': 'pt-1',
					'placeholder': 'Tìm kiếm theo từ khoá...',
					'solo': true,
					'append_icon': 'search',
					'onKeyup': '_filterDanhSachHoSoKeyup($event)',
					'events': {
						_filterDanhSachHoSoKeyup: function (event) {
							var vm = this;
							if (event.keyCode === 13 || vm.keywordsSearchDanhSachHoSo.length > 3 || vm.keywordsSearchDanhSachHoSo.length === 0) {
								vm._inidanhSachHoSoTable(false);
							}

						}
					}
				},
				"serviceInfoFilter": {
					'id': 'serviceInfoFilter',
					'name': 'serviceInfoFilter',
					"type": "select",
					'label': 'Lựa chọn thủ tục hành chính ',
					"item_text": "serviceName",
					"item_value": "serviceCode",
					"single_line": true,
					"hide_selected": true,
					"multiple": false,
					"tags": false, //custom input not avaliable in select
					"chips": true,
					"deletable_chips": true,
					"loading": false,
					"no_data_text": "Lua chon selected",
					"items": [],
					"onLoad": "_initServiceInfoFilterData",
					"onChange": "_filterDanhSachHoSoOnchange($event)",
					"onRemove": "_filterDanhSachHoSoOnRemove",
					'onClick': '_filterDanhSachHoSoOnClear',
					"events": {
						_initServiceInfoFilterData: function() {
							var vm = this;

							//TODO: API
							var url = '/o/rest/v2/serviceinfos';

							axios.get(url, config).then(function (response) {
								var serializable = response.data;

								vm.serviceInfoFilterItems = serializable.data;

							})
							.catch(function (error) {
								console.log(error);

							});
							return false;

						},
						_filterDanhSachHoSoOnchange: function (data) {
							var vm = this;
							vm.serviceInfoFilter = data;
							vm._inidanhSachHoSoTable(false);
							vm.putStateUserInfo();
						},
						_filterDanhSachHoSoOnRemove: function() {
							var vm = this;
							vm.serviceInfoFilter = [];
							vm.putStateUserInfo();
							vm._inidanhSachHoSoTable(false);
						},
						_filterDanhSachHoSoOnClear: function() {
							this.serviceInfoFilter = [];
						}

					}
				},
				"applicantNameFilter": {
					'id': 'applicantNameFilter',
					'name': 'applicantNameFilter',
					"type": "select",
					'label': 'Chủ hồ sơ ',
					"item_text": "applicantName",
					"item_value": "applicantIdNo",
					"single_line": true,
					"hide_selected": true,
					"multiple": false,
					"tags": false, //custom input not avaliable in select
					"chips": true,
					"deletable_chips": true,
					"loading": false,
					"no_data_text": "Lua chon selected",
					"items": [],
					"onLoad": "_initApplicantNameFilterData",
					"onChange": "_applicantFilterDanhSachHoSoOnchange($event)",
					"onRemove": "_applicantFilterDanhSachHoSoOnRemove",
					'onClick': '_applicantFilterDanhSachHoSoOnClear',
					"events": {
						_initApplicantNameFilterData: function() {
							var vm = this;

							//TODO: API
							var url = '/o/rest/v2/applicants';

							axios.get(url, config).then(function (response) {
								var serializable = response.data;

								vm.applicantNameFilterItems = serializable.data;

							})
							.catch(function (error) {
								console.log(error);

							});
							return false;
						},
						_applicantFilterDanhSachHoSoOnchange: function (data) {
							var vm = this;
							vm.applicantNameFilter = data;
							vm._inidanhSachHoSoTable(false);
							vm.putStateUserInfo();
						},
						_applicantFilterDanhSachHoSoOnRemove: function() {
							var vm = this;
							vm.applicantNameFilter = [];
							vm._inidanhSachHoSoTable(false);
							vm.putStateUserInfo();
						},
						_applicantFilterDanhSachHoSoOnClear: function() {
							this.applicantNameFilter = [];
						}
					}
				},
				"dossierNoFilter": {
					'id': 'dossierNoFilter',
					'name': 'dossierNoFilter',
					"type": "text",
					'label': 'Nhập mã tiếp nhận (Số hồ sơ)',
					"onChange": "_filterDanhSachHoSoOnchange3",
					"events": {
						_filterDanhSachHoSoOnchange3: function() {
							var vm = this;
							vm._inidanhSachHoSoTable(false);
							vm.putStateUserInfo();
						}
					}
				},
				'thongTinDoanhNghiepTable': {
					'id': 'thongTinDoanhNghiepTable',
					'name': 'thongTinDoanhNghiepTable',
					'type': 'table',
					'no_data_text': 'Không tìm thấy hồ sơ thương nhân nào!',
					'cssClass': 'thongTinDoanhNghiepTable__class',
					'item_key': 'registrationId',
					'headers': 'headers',
					'template': 'thong_tin_doanh_nghiep_table_template',
					'pagging': '_paggingThongTinDoanhNghiepTable',
					'next': '_nextThongTinDoanhNghiepTable',
					'previous': '_previousThongTinDoanhNghiepTable',
					'events': {
						_inithongTinDoanhNghiepTable: function (append) {

							var vm = this;
							vm.traCuuFilter = true;
							vm.viewmore = true;
							this.thongTinDoanhNghiepTableheaders = [
							{
								text: 'STT',
								align: 'left',
								sortable: false,
								value: 'stt'
							},
							{
								text: 'Tên, địa chỉ cơ sở sản xuất. Cơ sở nhập khẩu',
								align: 'left',
								sortable: true,
								value: 'address'
							},
							{
								text: 'Mã số thuế. điện thoại. fax. email',
								align: 'left',
								sortable: true,
								value: 'contactEmail'
							},
							{
								text: 'Người đại diện. chức danh',
								align: 'left',
								sortable: true,
								value: 'applicantName'
							},
							// {
							// 	text: 'Thông tin nhà xưởng. (SL, địa chỉ, diện tích, nhân lực, công suất theo tháng)',
							// 	align: 'left',
							// 	sortable: false,
							// 	value: 'action'
							// },
							// {
							// 	text: 'Tên sản phẩm',
							// 	align: 'left',
							// 	sortable: true,
							// 	value: 'action'
							// },
							{
								text: 'Thông tin chung',
								align: 'left',
								sortable: true,
								value: 'thongtinchung'
							},
							{
								text: 'Tình trạng đăng ký',
								align: 'left',
								sortable: true,
								value: 'registrationState'
							}
							];

							var paramsBuilder = {
								keyword: vm.keywordsSearchTraCuuDoanhNghiep,
								start: vm.thongTinDoanhNghiepTablepage * 15 - 15,
								end: vm.thongTinDoanhNghiepTablepage * 15,
								ttdnMaDoanhNghiep: vm.ttdnMaDoanhNghiep,
								ttdnMaSoThue: vm.ttdnMaSoThue,
								ttdnLoaiHinh: vm.ttdnLoaiHinh,
								ttdnTinhTrang: vm.ttdnTinhTrang,
								ttdnDiaChi: vm.ttdnDiaChi
							};

							//TODO
							const config_registrations = {
								params: paramsBuilder,
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								}
							};

							var url = '/o/rest/v2/registrations';

							axios.get(url, config_registrations).then(function (response) {
								var serializable = response.data;
								var arrResult = [];

								if (serializable.data) {
									for (var i = 0; i < serializable.data.length; i++) {
										if (!serializable.data[i].removed) {
											arrResult.push(serializable.data[i]);
										}
									}
								}

								vm.thongTinDoanhNghiepTableItems = arrResult;
								vm.thongTinDoanhNghiepTableTotal = Math.ceil(serializable.total / 15);

								// temp fix header
								$('.thongTinDoanhNghiepTable__class th[role="columnheader"]').each(function( index ) {
									if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
										$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
									} else {
										$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
									}
								});

								$('.thongTinDoanhNghiepTable__class').removeClass('elevation-1')

							})
							.catch(function (error) {
								console.log(error);
								vm.thongTinDoanhNghiepTableItems = [];

							});
							return false;
						},
						_paggingThongTinDoanhNghiepTable: function() {

							this._inithongTinDoanhNghiepTable(false);
						},
						_nextThongTinDoanhNghiepTable: function() {

						},
						_previousThongTinDoanhNghiepTable: function() {

						},
						toDetailHoSoDoanhNghiep: function (item) {

							var vm = this;
							// call DetailAPI.

							var url = '/o/rest/v2/registrations/' + item.registrationId;
							vm.detailPage = true;
							vm.loadDSCoSoNuocNgoai_Regis(item.registrationId);
							vm.loadDSHSDenHanXacNhan();
							axios.get(url, config).then(function (response) {
								var serializable = response.data;

								vm.detailRegistModel = serializable;
								vm.detailRegistPage = true;
								window.scrollBy(0, -99999);
								vm._getListForms();
								vm.stateButtonregistration = true;

							})
							.catch(function (error) {
								console.log(error);

							});
							return false;
						},
						_getListForms: function () {
							var vm = this;
							// call DetailAPI.

							var url = '/o/rest/v2/registrations/'+vm.detailRegistModel.registrationId+'/forms';

							axios.get(url, config).then(function (response) {
								var serializable = response.data;
								var arrFormnotRemmove = [];
								if (serializable.data) {
									for (var i = 0; i < serializable.data.length; i++) {
										if (!serializable.data[i].removed) {
											arrFormnotRemmove.push(serializable.data[i]);
										}
									}
								}
								vm.registForms = arrFormnotRemmove;
								vm.detailRegistPage = true;

							})
							.catch(function (error) {
								console.log(error);

							});
							return false;
						},
						formatDate (date) {
							if (!date) {
								return null
							}
							const [year, month, day] = date.split('-');
							return '${month}/${day}/${year}';
						},
						parseDate (date) {
							if (!date) {
								return null;
							}

							const [month, day, year] = date.split('/');
							return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`;
						},
						parseDate2 (date) {
							if (!date) return null;
				            const [year, month, day] = date.split('-');
				            return `${day}/${month}/${year}`;
						},
						addRegistrations: function() {
							var vm = this;
							vm.$dialog.confirm('Bạn có muốn thêm mới hồ sơ Doanh Nghiệp!', {
								html: true,
								loader: true,
								okText: 'Xác nhận',
								cancelText: 'Quay lại',
								animation: 'fade'
							})
							.then((dialog) => {

								// call API get file by dossierId
								var url = "/o/rest/v2/registrations";

								$.ajax({
									url: url,
									headers: {
										"groupId": themeDisplay.getScopeGroupId()
									},
									data: {
										"applicantName": "",
										"applicantIdType": "",
										"applicantIdNo": "",
										"applicantIdDate": "",
										"address": "",
										"cityCode": "",
										"districtCode": "",
										"wardCode": "",
										"contactName": "",
										"contactTelNo": "",
										"contactEmail": "",
										"govAgencyCode": "",
										"registrationState": 2,
										"registrationClass": ""
									},
									type: 'POST',
									dataType: 'json',
									contentType: 'application/x-www-form-urlencoded; charset=utf-8',
									success: function (data, textStatus, xhr) {
										vm.detailRegistModel = data.data;
										console.log(vm.detailRegistModel);
									},
									error: function (xhr, textStatus, errorThrown) {
										vm.detailRegistModel = {};
									}
								});

								dialog.close();
								return false;
							})
							.catch((e) => {
								console.log(e)
							})
						},
						registrationPheDuyet: function (registrationState) {


							var vm = this;
							vm.stateButtonregistration = false;
							var defaultMessage = 'Đồng ý phê duyệt hồ sơ doanh nghiệp này?';

							if (registrationState === 3) {
								defaultMessage = 'Gửi thông báo yêu cầu bổ sung thông tin doanh nghiệp?';
							}

							vm.$dialog.confirm(defaultMessage, {
								html: true,
								loader: true,
								okText: 'Xác nhận',
								cancelText: 'Quay lại',
								animation: 'fade'
							})
							.then((dialog) => {

								// call API get file by dossierId
								var url = "/o/rest/v2/registrations/"+vm.detailRegistModel.registrationId;

								$.ajax({
									url: url,
									headers: {
										"groupId": themeDisplay.getScopeGroupId()
									},
									data: {
										"registrationState": registrationState,
									},
									type: 'PUT',
									dataType: 'json',
									contentType: 'application/x-www-form-urlencoded; charset=utf-8',
									success: function (data, textStatus, xhr) {
										vm.detailRegistModel = data;
										console.log(vm.detailRegistModel);
										vm.snackbartextdossierViewJX = "Yêu cầu xử lý thành công thành công!";
										vm.snackbardossierViewJX = true;
										vm.stateButtonregistration = false;

									},
									error: function (xhr, textStatus, errorThrown) {
										vm.detailRegistModel = {};
										vm.snackbartextdossierViewJX = "Yêu cầu xử lý thành công thất bại!";
										vm.snackbarerordossierViewJX = true;
										vm.stateButtonregistration = true;
									}
								});

								dialog.close();
								return false;
							}).catch((e) => {
								console.log(e);
								vm.stateButtonregistration = true;
							})
						}
					}
				},
				'traCuuHoSoTable': {
					'id': 'traCuuHoSoTable',
					'name': 'traCuuHoSoTable',
					'type': 'table',
					'no_data_text': 'Không tìm thấy hồ sơ nào!',
					'cssClass': 'danhSachHoSoTable__class',
					'select_all': true,
					'item_key': 'dossierId',
					'headers': 'headers',
					'template': 'tra_cuu_hoso_table_template',
					'pagging': '_paggingTraCuuHoSoTable',
					'next': '_nextTraCuuHoSoTable',
					'previous': '_previousTraCuuHoSoTable',
					'events': {
						_initraCuuHoSoTable: function (append) {
							var vm = this;
							vm.traCuuFilter = true;
							vm.viewmore = true;
							this.traCuuHoSoTableheaders = [
							{
								text: 'STT',
								align: 'left',
								sortable: false,
								value: 'stt'
							},
							{
								text: 'Tên chứng chỉ',
								align: 'left',
								sortable: true,
								value: 'applicantName'
							},
							{
								text: 'Mã hồ sơ. Số hồ sơ',
								align: 'left',
								sortable: true,
								value: 'dossierId'
							},
							{
								text: 'Ngày gửi. Ngày tiếp nhận. Hạn xử lý',
								align: 'left',
								sortable: true,
								value: 'submitDate'
							},
							{
								text: 'Số chứng chỉ. Ngày cấp',
								align: 'left',
								sortable: false,
								value: 'action'
							},
							{
								text: 'Tên doanh nghiệp',
								align: 'left',
								sortable: false,
								value: 'action'
							},
							{
								text: 'Hành động',
								align: 'center',
								sortable: true,
								value: 'lastActionNote'
							}
							];

							var url = '/o/rest/v2/deliverables';
							var method = "GET";

							var paramsBuilder = {
								start: vm.traCuuHoSoTablepage * 15 - 15,
								end: vm.traCuuHoSoTablepage * 15,
								sort: 'modified',
								order: 'false',
								state: 2
							};
							var loai_chung_chi = vm.advancedFilterServiceInfo.deliverableType;
							try {
								if (vm.advanced_filter) {
									var ten_doanh_nghiep = vm.advanced_filter_applicantName;
									var so_ho_so = vm.advanced_filter_dossierIdCTN;
									var so_chung_chi = vm.advanced_filter_dossierNo;
									var loai_san_pham = vm.advancedFilterLoaiSanPham.itemName;
									var nhan_hieu = vm.advancedFilterNhanHieu.itemName;
									var ten_thuong_mai = vm.advanced_filter_tenThuongMai;
									var ma_kieu_loai = vm.advanced_filter_maKieuLoai;

									if (!loai_chung_chi && !ten_doanh_nghiep && !so_ho_so && !so_chung_chi && !loai_san_pham && !nhan_hieu &&
										!ten_thuong_mai && !ma_kieu_loai) {
										paramsBuilder.keyword = vm.keywordsSearchTraCuuHoSo;
								} else {
									var queryKey = '"query": "';
									var queryValue = '"values": "';
									var queryType = '"type": "';
									var queryKeyArr = new Array();
									var queryValueArr = new Array();
									var queryTypeArr = new Array();

									if (ten_doanh_nghiep) {

										queryKeyArr.push('(ten_doanh_nghiep like ?)');
										queryValueArr.push('*'+ten_doanh_nghiep+'*');
										queryTypeArr.push('String');

									}

									if (so_ho_so) {

										queryKeyArr.push('(so_ho_so = ?)');
										queryValueArr.push(so_ho_so);
										queryTypeArr.push('String');
									}

									if (so_chung_chi) {

										queryKeyArr.push('(so_chung_chi = ?)');
										queryValueArr.push(so_chung_chi);
										queryTypeArr.push('String');
									}

									if (loai_san_pham) {
										queryKeyArr.push('(loai_san_pham = ?)');
										queryValueArr.push(loai_san_pham);
										queryTypeArr.push('String');
									}
									if (nhan_hieu) {

										queryKeyArr.push('(nhan_hieu = ?)');
										queryValueArr.push(nhan_hieu);
										queryTypeArr.push('String');
									}

									if (ten_thuong_mai) {

										queryKeyArr.push('(ten_thuong_mai like ?)');
										queryValueArr.push('*'+ten_thuong_mai + '*');
										queryTypeArr.push('String');
									}

									if (ma_kieu_loai) {

										queryKeyArr.push('(ma_kieu_loai like ?)');
										queryValueArr.push('*'+ma_kieu_loai + '*');
										queryTypeArr.push('String');
									}

									var query = '{ "query": "' + queryKeyArr.join(" [and] ") + '", "values": " ' + queryValueArr.join("#") + '", "type": " ' + queryTypeArr.join(",") + '"}';
									paramsBuilder.keyword = query;
									url = "/o/rest/v2/deliverables/agency/BGTVTCDKVN/type/"+loai_chung_chi;
									method = "POST";
								}

							} else {
								paramsBuilder.keyword = vm.keywordsSearchTraCuuHoSo;
							}
						} catch (e) {
							url = "/o/rest/v2/deliverables";
							method = "GET";
						}

						if (method === "POST") {
							if (!loai_chung_chi) {
								vm.snackbartextdossierViewJX = "Bạn phải chọn loại chứng chỉ trước khi tìm kiếm";
								vm.snackbarerordossierViewJX = true;
							}
						}

						$.ajax({
							url : url,
							type : method,
							dataType : "json",
							headers: {
								'groupId': themeDisplay.getScopeGroupId(),
							},
							data : paramsBuilder,
							success : function (result) {
								var serializable = result;

								if (append) {
									vm.traCuuHoSoTableItems.push.apply(vm.traCuuHoSoTableItems, serializable.data);
								} else {
									vm.traCuuHoSoTableItems = serializable.data;

									vm.traCuuHoSoTableTotal = Math.ceil(serializable.total / 15);
								}

								vm.xem_them = 'Xem thêm 8+ bản ghi';
								if (!serializable.data || serializable.data.length === 0) {
									vm.xem_them = 'Tổng số ( ' + serializable.total + ' ) bản ghi'
								}
								vm.viewmore = false;

									// temp fix header
									$('.danhSachHoSoTable__class th[role="columnheader"]').each(function( index ) {
										if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
											$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
										} else {
											$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
										}
									});

									/*var resData = serializable.data;
									if (resData) {
										for (var i = 0; i < resData.length; i++) {
											var deliverableId = resData[i].deliverableId;
											console.log("deliverableId======",deliverableId);
											if (deliverableId) {
												$.ajax({
													url : "/o/rest/v2/deliverables/"+deliverableId+"/formdata",
													dataType : "json",
													type : "GET",
													headers: {"groupId": themeDisplay.getScopeGroupId()},
													async : false,
													success : function (result) {
														$("#ma_ho_so"+deliverableId).html(result.ma_ho_so);
														$("#so_ho_so"+deliverableId).html(result.so_ho_so);
														$("#ngay_gui"+deliverableId).html(result.ngay_gui);
														$("#ngay_tiep_nhan"+deliverableId).html(result.ngay_tiep_nhan);
														$("#so_chung_chi"+deliverableId).html(result.so_chung_chi);
														$("#ngay_ky_cc"+deliverableId).html(result.ngay_ky_cc);
													},
													error : function (result) {

													}
												});
											}

										}
									}*/
								},
								error : function (result) {
									console.log(result);
									vm.traCuuHoSoTableItems = [];
								}
							});


						return false;
					},
					toViewDelivableFile : function (item) {
						var deliverableCode = item.deliverableCode;
						if (deliverableCode) {
							var url = "/o/rest/v2/dossiers/file/"+deliverableCode;

							const config_blob = {
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								},
								responseType: 'blob'
							};
							axios.get(url, config).then(function (response) {

								var result = response.data;
								var urlGetFile = "/o/rest/v2/dossiers/"+result.dossierId+"/files/"+result.referenceUid;

								axios.get(urlGetFile, config_blob).then(function (response) {
									var url = window.URL.createObjectURL(response.data);
									//console.log("url===========>",url);
									window.open(url , '_blank');
								})
								.catch(function (error) {
									console.log(error);

								});

							})
							.catch(function (error) {
								console.log(error);

							});

						}
						return false;
					},
					toDetailHoSoDelivable: function (item) {

						var vm = this;
						vm.stepModel = null;

						var ma_ho_so = item.ma_ho_so;
						var urlDossierId = '/o/rest/v2/dossiers/number/'+ma_ho_so;

						axios.get(urlDossierId, config).then(function (response) {
							var serializable = response.data;

							var url = '/o/rest/v2/dossiers/'+serializable.dossierId;

							axios.get(url, config).then(function (response) {
								var serializable = response.data;
								var dossierStatus = serializable.dossierStatus;
								var dossierSubStatus = serializable.dossierSubStatus;

								if (dossierStatus === 'cancelling' ||
									dossierStatus === 'cancelled' ||
									dossierStatus === 'processing' ||
									dossierStatus === 'paid') {
									vm.listgroupHoSoFilterselected = dossierStatus;
									vm.statusParamFilter = dossierStatus;
									vm.substatusParamFilter = dossierSubStatus;
								} else {

									vm.listgroupHoSoFilterselected = dossierSubStatus;
									vm.statusParamFilter = dossierSubStatus;
									vm.substatusParamFilter = dossierStatus;
								}

								vm.detailModel = serializable;
								vm.detailPage = true;
								window.scrollBy(0, -99999);

								vm._inilistDocumentIn(vm.detailModel);
								vm._inilistDocumentOut(vm.detailModel);

							}).catch(function (error) {
								console.log(error);

							});

						}).catch(function (error) {
							console.log(error);

						});

						return false;
					},
					advanced_filter_btn_click : function() {
						var vm = this;
						vm._initraCuuHoSoTable(false);
					},
					_paggingTraCuuHoSoTable: function() {

						this._initraCuuHoSoTable(false);
					},
					_nextTraCuuHoSoTable: function() {

					},
					_previousTraCuuHoSoTable: function() {

					}
				}
			},
			'danhSachHoSoTable': {
				'id': 'danhSachHoSoTable',
				'name': 'danhSachHoSoTable',
				'type': 'table',
				'no_data_text': 'Không tìm thấy hồ sơ nào!',
				'cssClass': 'danhSachHoSoTable__class',
				'select_all': true,
				'item_key': 'dossierId',
				'headers': 'headers',
				'template': 'danh_sach_hoso_table_template',
				/*'onLoad': '_inidanhSachHoSoTable',*/
				'pagging': '_paggingDanhSachHoSo',
				'next': '_nextDanhSachHoSo',
				'previous': '_previousDanhSachHoSo',
				'events': {
					_inidanhSachHoSoTable: function (append) {
						var vm = this;
						vm.traCuuFilter = false;
						vm.viewmore = true;

						this.danhSachHoSoTableheaders = [
						{
							text: 'STT',
							align: 'center',
							sortable: false,
							value: 'stt'
						},
						{
							text: 'Tên thủ tục. Tên doanh nghiệp',
							align: 'left',
							sortable: true,
							value: 'applicantName'
						},
						{
							text: 'Mã hồ sơ. Số hồ sơ',
							align: 'left',
							sortable: true,
							value: 'dossierId'
						},
						{
							text: 'Ngày gửi. Ngày tiếp nhận. Hạn xử lý',
							align: 'left',
							sortable: true,
							value: 'submitDate'
						},
						{
							text: 'Số chứng chỉ. Ngày cấp',
							align: 'center',
							sortable: false,
							value: 'action'
						},
						{
							text: 'Nội dung',
							align: 'left',
							sortable: false,
							value: 'action'
						},
						{
							text: 'Ghi chú',
							align: 'left',
							sortable: true,
							value: 'lastActionNote'
						}
						];

						var statusParam = vm.statusParamFilter;
						var substatusParam = vm.substatusParamFilter;

							/*if (vm.stageFilterView !== 'danh_sach') {
								statusParam = vm.statusParamFilter;
								substatusParam = vm.substatusParamFilter;
							}*/

							var paramsBuilder = {
								keyword: vm.keywordsSearch,
								owner: vm.applicantNameFilter.applicantIdNo,
								service: vm.serviceInfoFilter.serviceCode,
								follow: vm.follow,
								dossierNo: vm.dossierNoFilter,
								start: vm.danhSachHoSoTablepage * 15 - 15,
								end: vm.danhSachHoSoTablepage * 15,
								status: statusParam,
								substatus: substatusParam,
								sort: 'modified',
								order: 'false'
							};
							if ( vm.keywordFilter != null ) {
								paramsBuilder['keyword'] = vm.keywordFilter;
							} else {
								paramsBuilder['keyword'] = vm.keywordsSearchDanhSachHoSo;
							}
							const config_dossiers = {
								params: paramsBuilder,
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								}
							};
							var url = '/o/rest/v2/dossiers/dossiersTest';

							if (vm.follow) {
								url = '/o/rest/v2/dossiers/dossiersTest';
							} else {
								url = '/o/rest/v2/dossiers';
							}
							axios.get(url, config_dossiers).then(function (response) {
								var serializable = response.data;
								vm.follow = true;

								if (append) {
									vm.danhSachHoSoTableItems.push.apply(vm.danhSachHoSoTableItems, serializable.data);
								} else if (serializable.data) {
									/*for (var i = 0; i < serializable.data.length; i++) {

										if (serializable.data[i].certNumber) {
											if (serializable.data[i].certNumber.length) {

												var certNumber = $.grep(serializable.data[i].certNumber, function( value, index ) {
													return ( value.certNo && value.certDate );
												});
												serializable.data[i].certNumber = certNumber;

											} else {

												var certNumbers = new Array();
												var certNumber = serializable.data[i].certNumber;

												if (certNumber.certNo && certNumber.certDate) {
													certNumbers.push(certNumber);
													serializable.data[i].certNumber = certNumbers;
												}
											}
										} else {
											serializable.data[i].certNumber = '';
										}

									}*/

									vm.danhSachHoSoTableItems = serializable.data;

									vm.danhSachHoSoTableTotal = Math.ceil(serializable.total / 15);

								} else {
									vm.danhSachHoSoTableItems = [];

									vm.danhSachHoSoTableTotal = 0;
								}

								if (vm.listgroupHoSoFilterselectedIndex >= 0) {
									console.log('reindex counting ...');
									vm.listgroupHoSoFilterItems[vm.listgroupHoSoFilterselectedIndex]['count'] = serializable.total;
								}

								vm.xem_them = 'Xem thêm 8+ bản ghi';
								if (!serializable.data) {
									vm.xem_them = 'Tổng số ( ' + serializable.total + ' ) bản ghi'
								}
								vm.viewmore = false;

								// temp fix header
								$('.danhSachHoSoTable__class th[role="columnheader"]').each(function( index ) {
									if ($( this ).attr('aria-label').indexOf("Activate") > 0) {
										$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
									} else {
										$( this ).html($( this ).attr('aria-label').substring(0, $( this ).attr('aria-label').indexOf(":")).replace(/\./g,"<br/>"));
									}
								});
								$("div[jx-bind=danhSachHoSoTable]>div.text-xs-right.pt-2.btn-block").find("b").remove();
								$("div[jx-bind=danhSachHoSoTable]>div.text-xs-right.pt-2.btn-block").prepend('<b class="pr-2">Tổng số: ' + serializable.total + '</b>')
								console.log(vm.danhSachHoSoTableItems);
							}).catch(function (error) {
								console.log(error);
								vm.danhSachHoSoTableItems = [];

							});
							return false;
						},
						toDetailHoSo: function (item) {

							var vm = this;
							vm.stepModel = null;
							// call DetailAPI.

							var url = '/o/rest/v2/dossiers/'+item.dossierId;
							axios.get(url, config).then(function (response) {
								var serializable = response.data;

								vm.detailModel = serializable;
								vm.detailModel.dossierIdCTN = item.dossierIdCTN;
								vm.detailPage = true;

								vm.dsGCNItems = [];
								vm.thongTinPhieu = {};
								vm.selected = [];
								vm.chonHoSo(serializable.dossierId);
								window.scrollBy(0, -99999);
								if (serializable.dossierStatus === 'PROCESSING_72' || serializable.dossierSubStatus === 'PROCESSING_72') {
									vm.tabActive = 'tab-dossier-detail-2';
								} else {
									vm.tabActive = 'tab-dossier-detail-1';
								}
								vm._inilistDocumentIn(vm.detailModel);
								vm._inilistDocumentOut(vm.detailModel);
								vm._initchangeProcessStep();

							}).catch(function (error) {
								console.log(error);

							});
							return false;
						},
						_paggingDanhSachHoSo: function() {
							this._inidanhSachHoSoTable(false);
						},
						_nextDanhSachHoSo: function() {

						},
						_previousDanhSachHoSo: function() {

						}
					}
				},
				// TODO detail
				'listDocumentIn': {
					'id': 'listDocumentIn',
					'name': 'listDocumentIn',
					'type': 'listview',
					'template': 'list_document_in_template',
					'events': {
						_inilistDocumentIn: function (item) {
							var vm = this;
//							vm.listDocumentInItems = [];
//							vm.listDocumentOutItems = [];

								var url = "/o/rest/v2/dossiertemplates/"+item.dossierTemplateNo;
								var urlFiles = "/o/rest/v2/dossiers/"+item.dossierId+"/files";

								axios.all([axios.get(url, config), axios.get(urlFiles, config)]).then(axios.spread(function (urlRespones, urlFilesRespones) {
							    vm.dossierFiles = urlFilesRespones.data.data;

							    var serializable = urlRespones.data;

							    var listIn = [], listOut = [], listAll = [];

							    for(var key in serializable.dossierParts) {

							    	var countData = 0;
							    	for(var keyFile in vm.dossierFiles) {

							    		if ( vm.dossierFiles[keyFile].dossierPartNo === serializable.dossierParts[key].partNo ) {
							    			countData = countData + 1;
							    			serializable.dossierParts[key].referenceUid = vm.dossierFiles[keyFile].referenceUid;
							    			serializable.dossierParts[key].fileEntryId = vm.dossierFiles[keyFile].fileEntryId;
							    			serializable.dossierParts[key].displayName = vm.dossierFiles[keyFile].displayName;

							    			listAll.push(serializable.dossierParts[key]);
							    		}

							    	}

							    	serializable.dossierParts[key].counter = countData;

							    	if ( serializable.dossierParts[key].partType === 2 ) {
							    		listOut.push(serializable.dossierParts[key]);
							    	} else {
							    		listIn.push(serializable.dossierParts[key]);
							    	}

							    }

							    vm.listDocumentInItems = listIn;
							    vm.listDocumentOutItems = listOut;
								vm._initCbxDocumentNewTab(listAll);

								return Promise.reject();

							})).catch(function (error) {
								console.log(error);

							});
							return false;
						},
						viewDossierFileVersion: function (item) {
							var vm = this;

							vm.dossierViewJXTitle = item.partName;
							var listFilesUpload = [];
							for (var key in vm.dossierFiles) {
								if (vm.dossierFiles[key].dossierPartNo === item.partNo) {
									if (vm.dossierFiles[key].fileSize > 0) {
										listFilesUpload.push(vm.dossierFiles[key]);
									}

								}
							}
							vm.listDocumentInPartNoItems = listFilesUpload;
							if (item.counter > 0) {
								vm.popUpViewDossierFile = !vm.popUpViewDossierFile;
							}

						},
						viewDossierFileVersionNewTabOrWindow: function (item) {
							var vm = this;
							if (item.counter > 0) {
								if (item.counter === 1) {
									let configBob = {
										headers: {
											groupId: themeDisplay.getScopeGroupId()
										},
										responseType: 'blob'
									}
									var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/files/' + item.referenceUid;
									axios.get(url, configBob).then(function (response) {
										var url = window.URL.createObjectURL(response.data);
										window.open(url);
									}).catch(function (error) {
										console.log(error);
									});
									return;
								}
								console.log("vm.detailModel========",vm.detailModel);

								var url = "/group/cong-xu-ly/xu-ly-ho-so?stateWindow=stateWindow&dossierId="+vm.detailModel.dossierId+
								"&dossierPartNo="+item.partNo;

								vm.$dialog.confirm('Bạn muốn mở trong tab mới hay cửa sổ mới!', {
									html: true,
									loader: true,
									okText: 'Cửa sổ mới',
									cancelText: 'Tab mới',
									animation: 'fade'
								}).then((dialog) => {
									console.log("dialog============",dialog);
									window.open(url, "_blank", "ccc");

									dialog.close();
									return false;
								}).catch((e) => {
									console.log(e);
									window.open(url, "_blank");
								})
							}

						},
						viewDossierFileResult: function (item, index) {
							var vm = this;
							if (item.counter > 0) {
								vm.popupResultFile = true;
								// call API get file by dossierId
								var urlFiles = "/o/rest/v2/dossiers/"+vm.detailModel.dossierId+"/files";

								axios.get(urlFiles, config).then(function (response) {
									var serializable = response.data;
									var resultsFiles = [];
									for (var key in serializable.data) {
										if (serializable.data[key].dossierPartType === 2 && serializable.data[key].dossierPartNo === item.partNo) {
											serializable.data[key].index = index;
											resultsFiles.push(serializable.data[key]);
										}
									}
									vm.listDocumentOutStepItems = resultsFiles;
									vm.popUpViewDossierFile = !vm.popUpViewDossierFile;

								}).catch(function (error) {
									console.log(error);

								});
							}
							return false;
						}
					}
				},
				'listDocumentInPartNo': {
					'id': 'listDocumentInPartNo',
					'name': 'listDocumentInPartNo',
					'type': 'listview',
					'template': 'list_document_in_part_no_template'
				},
				'listDocumentOut': {
					'id': 'listDocumentOut',
					'name': 'listDocumentOut',
					'type': 'listview',
					'template': 'list_document_out_template',
					'events': {
						downloadReferenceFile: function (item) {
							var vm = this;
							const config_blob = {
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								},
								responseType: 'blob'
							};

							var url = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/files/'+item.referenceUid;

							axios.get(url, config_blob).then(function (response) {
								var url = window.URL.createObjectURL(response.data);
								//console.log(url);
								window.open(url);
							}).catch(function (error) {
								console.log(error);

							});
							return false;
						},
						_inilistDocumentOut: function (item) {
							var vm = this;
//							vm.listDocumentInItems = [];
//							vm.listDocumentOutItems = [];

							var url = "/o/rest/v2/dossiertemplates/"+item.dossierTemplateNo;
							var urlFiles = "/o/rest/v2/dossiers/"+item.dossierId+"/files";

							axios.all([axios.get(url, config), axios.get(urlFiles, config)]).then(axios.spread(function (urlRespones, urlFilesRespones) {
							    vm.dossierFiles = urlFilesRespones.data.data;

							    var serializable = urlRespones.data;

							    var listIn = [], listOut = [], listAll = [];

							    for(var key in serializable.dossierParts) {

							    	var countData = 0;
							    	for(var keyFile in vm.dossierFiles) {

							    		if ( vm.dossierFiles[keyFile].dossierPartNo === serializable.dossierParts[key].partNo ) {
							    			countData = countData + 1;
							    			serializable.dossierParts[key].referenceUid = vm.dossierFiles[keyFile].referenceUid;
							    			serializable.dossierParts[key].fileEntryId = vm.dossierFiles[keyFile].fileEntryId;
							    			serializable.dossierParts[key].displayName = vm.dossierFiles[keyFile].displayName;

							    			if (vm.dossierFiles[keyFile].fileSize <= 0) {

							    				countData = countData -1;

							    			}

							    		}

							    	}

							    	serializable.dossierParts[key].counter = countData;

							    	if ( serializable.dossierParts[key].partType === 2 ) {
							    		if (serializable.dossierParts[key].partNo.indexOf("KQ") !== -1) {

							    			listOut.push(serializable.dossierParts[key]);
							    		}

							    	}

							    }

							    vm.listDocumentOutItems = listOut;

							    return Promise.reject();

							})).catch(function (error) {
								console.log(error);

							});
							return false;
						}
					}
				},
				'listDocumentOutStep': {
					'id': 'listDocumentOutStep',
					'name': 'listDocumentOutStep',
					'type': 'listview',
					'template': 'list_document_out_part_no_template'
				},
				'listHistoryProcessing': {
					'id': 'listHistoryProcessing',
					'name': 'listHistoryProcessing',
					'type': 'table',
					'cssClass': 'table_history_style',
					'hide_headers': true,
					'template': 'list_history_processing_template',
					'onLoad': '_inilistHistoryProcessing',
					'events': {
						_inilistHistoryProcessing: function () {

							var vm = this;
							vm.listHistoryProcessingItems = [];

						},
						selectDossierActionTab () {
							var vm = this;
							var url = "/o/rest/v2/dossierlogs/"+vm.detailModel.dossierId+"/logs";
							vm.listHistoryProcessingItems = [];
							axios.get(url, config).then(function (response) {
								var serializable = response.data;
								for (var key in serializable.data) {
									if (serializable.data[key].notificationType === 'PROCESS_TYPE') {
										serializable.data[key].createDate = vm.parseDateUtc(serializable.data[key].createDate);
										var stepNameTmp = serializable.data[key].payload.stepName;
										if (stepNameTmp) {
											if (stepNameTmp === "type_cancelling") {
												stepNameTmp = "Yêu cầu hủy";
											} else if (stepNameTmp === "type_submit") {
												stepNameTmp = "Yêu cầu sửa thành phần hồ sơ";
											} else if (stepNameTmp === "type_submitting") {
												stepNameTmp = "Yêu cầu sửa đổi bổ sung";
											} else if (stepNameTmp === "type_correcting") {
												stepNameTmp = "Yêu cầu chỉnh sửa kết quả";
											} else if (stepNameTmp === "type_reject_cancelling") {
												stepNameTmp = "Từ chối yêu cầu hủy";
											} else if (stepNameTmp === "type_reject_submit") {
												stepNameTmp = "Hủy yêu cầu sửa thành phần hồ sơ";
											} else if (stepNameTmp === "type_reject_submitting") {
												stepNameTmp = "Từ chối yêu cầu bổ sung";
											} else if (stepNameTmp === "type_reject_correcting") {
												stepNameTmp = "Hủy yêu cầu chỉnh sửa kết quả";
											}
										}
										serializable.data[key].payload.stepName = stepNameTmp;

										vm.listHistoryProcessingItems.push(serializable.data[key]);
									}
								}
							}).catch(function (error) {
								console.log(error);

							});
							return false;
						},
						downloadFile( fileAttachId) {
							var vm = this;
							var url = "/o/rest/v2/dossiers/"+vm.detailModel.dossierId+"/files/"+fileAttachId;
							const config_blob = {
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								},
								responseType: 'blob'
							};
							axios.get(url, config_blob).then(function (response) {
								var url = window.URL.createObjectURL(response.data);
								window.open(url);
							}).catch(function (error) {
								console.log(error);

							});
							return false;
						}
					}
				},
                // TODO PROCESS ACTION
                /*"processActionNote": {
                	'id': 'processActionNote',
                	'name': 'processActionNote',
                	"type": "text",
                	'placeholder': 'ý kiến cán bộ ... ',
                	'multi_line': true,
                	'textarea': true
                },*/
                "processAssignUserId": {
                	'id': 'processAssignUserId',
                	'name': 'processAssignUserId',
                	"type": "select",
                	'required': true,
                	'label': 'Lựa chọn cán bộ phân công xử lý ',
                	"item_text": "userName",
                	"item_value": "userId",
                	"hide_selected": true,
                	"chips": true,
                	"deletable_chips": true,
                	"loading": false,
                	"no_data_text": "Lua chon selected",
                	"items": [],
                	'onLoad': '_initprocessAssignUserId',
                	'events': {
                		_initprocessAssignUserId: function () {

                			this.processAssignUserIdItems = [
                			{
                				"userId": 1,
                				"userName": "userName1",
                				"moderator": false
                			},
                			{
                				"userId": 2,
                				"userName": "userName2",
                				"moderator": false
                			},
                			{
                				"userId": 3,
                				"userName": "userName3",
                				"moderator": false
                			},
                			{
                				"userId": 4,
                				"userName": "userName4",
                				"moderator": false
                			}
                			];
                		}
                	}
                },
				// TODO POPUP
				'popUpViewDossierFile' : {
					'id': 'popUpViewDossierFile',
					'name': 'popUpViewDossierFile',
					"type": "dialog",
					"type_dialog": "fullScreen",
					'icon_save': 'undo',
					'label_save': 'Quay lại',
					"color": "primary",
					"template": "popUpViewDossierFileTemplate",
					"events": {
						popUpViewDossierFileClose: function () {
							console.log("close popup");
							var iFrame = document.getElementById("dossierPDFView");
							var dossierPDFViewNotFound = document.getElementById("dossierPDFViewNotFound");
							iFrame.innerHTML = '';
							this.popUpViewDossierFile = false;
							this.popupResultFile = false;
						},
						popUpViewDossierFileSave: function () {
							console.log("save popup");
							var vm = this;
							var iFrame = document.getElementById("dossierPDFView");
							iFrame.innerHTML = '';
							dossierPDFViewNotFound.innerHTML = '';
							vm.popUpViewDossierFile = false;
							vm.popupResultFile = false;
						},
						previewDossierPDF: function (item) {
							var vm = this;
							vm.dossierViewJXTitle = item.displayName;
							var url ="/o/rest/v2/dossiers/"+vm.detailModel.dossierId+"/files/"+item.referenceUid ;
							vm._showFile({
								config : {
									headers: {
										'groupId': themeDisplay.getScopeGroupId(),
									},
									responseType: 'blob'
								},
								url : url
							});

						},
						_showFile: function (options) {
							var iFrame = document.getElementById("dossierPDFView");
							var dossierPDFViewNotFound = document.getElementById("dossierPDFViewNotFound");
							axios.get(options.url, options.config).then(function (response) {
								var url = window.URL.createObjectURL(response.data);
								iFrame.className = "";
								iFrame.innerHTML = '<iframe src="'+url+'" width="100%" height="100%"> </iframe>';
								dossierPDFViewNotFound.innerHTML = '';
							}).catch(function (error) {
								console.log(error);
								dossierPDFViewNotFound.innerHTML = 'Tài liệu đính kèm không tồn tại!';

							});
							return false;
						},
						previewDossierPDFNewTab: function (item) {
							var vm = this;
							var url ="/o/rest/v2/dossiers/"+vm.detailModel.dossierId+"/files/"+item.referenceUid ;

							const config_blob = {
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								},
								responseType: 'blob'
							};

							axios.get(url, config_blob).then(function (response) {
								var url = window.URL.createObjectURL(response.data);
								window.open(url);
							}).catch(function (error) {
								console.log(error);

							});
							return false;
						}
					}
				},
				"cbxDocumentNewTab": {
					'id': 'cbxDocumentNewTab',
					'name': 'cbxDocumentNewTab',
					"type": "select",
					'label': 'Xem tài liệu trong tabs mới',
					"item_text": "displayName",
					"item_value": "referenceUid",
					"single_line": true,
					"hide_selected": true,
					"loading": false,
					"no_data_text": "Lua chon selected",
					"items": [],
					"onChange": "_newTabCbxDocumentNewTab($event)",
					"events": {
						_initCbxDocumentNewTab: function (listAll) {
							var vm = this;

							vm.cbxDocumentNewTabItems = listAll;
						},
						_newTabCbxDocumentNewTab: function (data) {
							var vm = this;
							const config_blob = {
								headers: {
									'groupId': themeDisplay.getScopeGroupId(),
								},
								responseType: 'blob'
							};

							var url = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/files/'+data.referenceUid;

							axios.get(url, config_blob).then(function (response) {
								var url = window.URL.createObjectURL(response.data);
								//console.log(url);
								window.open(url);
							}).catch(function (error) {
								console.log(error);

							});
							return false;
						}

					}
				},
                // TODO ADVANCED SEARCH
                "advanced_filter_serviceInfo": {
                	'id': 'advanced_filter_serviceInfo',
                	'name': 'advanced_filter_serviceInfo',
                	"type": "select",
                	'cssClass': 'no-wrap',
                	"item_text": "deliverableName",
                	"item_value": "deliverableType",
                	'label': 'Lựa chọn loại chứng chỉ',
                	"hide_selected": true,
                	"combobox": true,
                	"loading": false,
                	"no_data_text": "Lua chon selected",
                	"items": [],
                	"onChange": "_filterAdvancedServiceInfoOnchange($event)",
                	'events': {
                		_initAdvanced_filter_serviceInfo: function () {
                			var vm = this;
                			var url = "/o/rest/v2/deliverabletypes";
                			axios.get(url, config).then(function (response) {
                				var serializable = response.data;
                				vm.advanced_filter_serviceInfoItems = serializable.data;
                				console.log(vm.advanced_filter_serviceInfoItems);
                			}).catch(function (error) {
                				console.log(error);

                			});
                		},
                		_filterAdvancedServiceInfoOnchange : function (data) {
                			var vm = this;
                			vm.advancedFilterServiceInfo = data;
                		}
                	}
                },
                "advanced_filter_applicantName": {
                	'id': 'advanced_filter_applicantName',
                	'name': 'advanced_filter_applicantName',
                	"type": "text",
                	'label': 'Tên doanh nghiệp'
                },
                "advanced_filter_dossierIdCTN": {
                	'id': 'advanced_filter_dossierIdCTN',
                	'name': 'advanced_filter_dossierIdCTN',
                	"type": "text",
                	'label': 'Số hồ sơ'
                },
                "advanced_filter_startDate" : {
                	'id' : 'advanced_filter_startDate',
                	'name' : 'advanced_filter_startDate',
                	'type' : 'date',
                	'label' : 'Từ ngày'
                },
                "advanced_filter_endDate" : {
                	'id' : 'advanced_filter_endDate',
                	'name' : 'advanced_filter_endDate',
                	'type' : 'date',
                	'label' : 'Đến ngày'
                },
                "advanced_filter_dossierStatus" : {
                	'id' : 'advanced_filter_dossierStatus',
                	'name' : 'advanced_filter_dossierStatus',
                	'type' : 'select',
                	'cssClass': 'no-wrap',
                	"item_text": "statusName",
                	"item_value": "dossierStatus",
                	'label': 'Trạng thái hồ sơ',
                	"hide_selected": true,
                	"combobox": true,
                	"loading": false,
                	"no_data_text": "Lua chon selected",
                	"onChange": "_filterAdvancedDossierStatusOnchange($event)",
                	'events': {
                		_initAdvanced_filter_dossierStatus: function () {
                			var vm = this;
                			if (!vm.advanced_filter_dossierStatusItems) {

                				var url = '/o/rest/v2/statistics/dossiers/todo';

                				axios.get(url, config).then(function (response) {
                					var serializable = response.data;

                					var serializable = response.data;
                					vm.advanced_filter_dossierStatusItems = serializable.data;
                					console.log(vm.advanced_filter_dossierStatusItems);

                				}).catch(function (error) {
                					console.log(error);

                				});
                			}
                			return false;
                		},
                		_filterAdvancedDossierStatusOnchange : function (data) {
                			var vm = this;
                			vm.advancedFilterDossierStatus = data;
                		}
                	}
                },
                "advanced_filter_loaiSanPham": {
                	'id': 'advanced_filter_loaiSanPham',
                	'name': 'advanced_filter_loaiSanPham',
                	"type": "select",
                	'cssClass': 'no-wrap',
                	"item_text": "itemName",
                	"item_value": "itemCode",
                	'label': 'Loại sản phẩm',
                	"hide_selected": true,
                	"combobox": true,
                	"loading": false,
                	"no_data_text": "Lua chon selected",
                	"items": [],
                	"onChange": "_filterAdvancedLoaiSanPhamOnchange($event)",
                	'events': {
                		_initAdvanced_filter_loaiSanPham: function () {
                			var vm = this;
                			if (vm.advanced_filter_loaiSanPhamItems.length <= 0) {

                				var url = '/o/rest/v2/dictcollections/VR02/dictitems?sort=sibling';

                				axios.get(url, config).then(function (response) {
                					var serializable = response.data;
                					vm.advanced_filter_loaiSanPhamItems = serializable.data;
                					console.log(vm.advanced_filter_loaiSanPhamItems);
                				}).catch(function (error) {
                					console.log(error);

                				});
                			}
                			return false;
                		},
                		_filterAdvancedLoaiSanPhamOnchange : function (data) {
                			var vm = this;
                			vm.advancedFilterLoaiSanPham = data;
                		}
                	}
                },
                "advanced_filter_nhanHieu": {
                	'id': 'advanced_filter_nhanHieu',
                	'name': 'advanced_filter_nhanHieu',
                	"type": "select",
                	'cssClass': 'no-wrap',
                	"item_text": "itemName",
                	"item_value": "itemCode",
                	'label': 'Nhãn hiệu',
                	"hide_selected": true,
                	"combobox": true,
                	"loading": false,
                	"no_data_text": "Lua chon selected",
                	"items": [],
                	"onChange": "_filterAdvancedNhanHieuOnchange($event)",
                	'events': {
                		_initAdvanced_filter_nhanHieu: function () {
                			var vm = this;
                			if (vm.advanced_filter_nhanHieuItems.length <= 0) {

                				var url = '/o/rest/v2/dictcollections/VR03/dictitems?sort=sibling';

                				axios.get(url, config).then(function (response) {
                					var serializable = response.data;
                					vm.advanced_filter_nhanHieuItems = serializable.data;
                				}).catch(function (error) {
                					console.log(error);

                				});
                			}
                			return false;
                		},
                		_filterAdvancedNhanHieuOnchange : function (data) {
                			var vm = this;
                			vm.advancedFilterNhanHieu = data;
                		}
                	}
                },
                "advanced_filter_tenThuongMai": {
                	'id': 'advanced_filter_tenThuongMai',
                	'name': 'advanced_filter_tenThuongMai',
                	"type": "text",
                	'label': 'Tên thương mại'
                },
                "advanced_filter_maKieuLoai": {
                	'id': 'advanced_filter_maKieuLoai',
                	'name': 'advanced_filter_maKieuLoai',
                	"type": "text",
                	'label': 'Mã kiểu loại'
                }
            }
        });

	dossierViewJX._builder('dossierViewJX');
}



		/*window.onload = function (event) {
			var vm = dossierViewJX;
			setInterval(function() {

				vm._initlistgroupHoSoFilter();
				vm._inidanhSachHoSoTable();


			}, 10000);
		}*/
