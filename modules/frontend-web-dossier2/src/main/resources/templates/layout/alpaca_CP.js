{
    "schema": {
        "type": "object",
        "required": false,
        "properties": {
            "bang_trung": {
                "type": "array",
                "required": false,
                "items": {
                    "type": "object",
                    "properties": {
                        "sequence": {
                            "type": "string"
                        },
                        "content": {
                            "type": "string"
                        },
                        "date": {
                            "type": "string"
                        },
                        "employee": {
                            "type": "string"
                        },
                        "result": {
                            "type": "string"
                        },
                        "value": {
                            "type": "string"
                        }
                    }
                }
            },
            "duplicatealert": {
                "type": "object",
                "required": "false"
            },
            "dossierIdDnQuyetToan": {
                "type": "object",
                "required": "false"
            },
            "dossierNoPattern": {
                "type": "object",
                "required": "false"
            },
            "formType_hidden": {
                "type": "object",
                "required": "false"
            },
            "nguoi_dai_dien": {
                "type": "object",
                "required": "false"
            },
            "so_dien_thoai_nguoi_lien_he": {
                "type": "object",
                "required": "false"
            },
            "bang_khai": {
                "required": false,
                "type": "object",
                "items": {
                    "properties": {
                        "certificateId": {
                            "type": "string",
                            "title": "certificateId"
                        },
                        "so_gcn": {
                            "type": "string",
                            "title": "Số GCN"
                        },
                        "ngay_cap": {
                            "type": "string",
                            "title": "Ngày cấp"
                        },
                        "nhan_hieu": {
                            "type": "string",
                            "title": "Nhãn hiệu"
                        },
                        "ten_thuong_mai": {
                            "type": "string",
                            "title": "Tên thương mại"
                        },
                        "gia_ban": {
                            "type": "string",
                            "title": "Giá bán (<span style='color: red'>*</span>)"
                        },
                        "so_luong_pxx": {
                            "type": "string",
                            "title": "Số lượng PXX ô tô"
                        },
                        "so_luong": {
                            "type": "string",
                            "title": "Số lượng"
                        },
                        "ma_kieu_loai": {
                            "type": "string",
                            "title": "Mã kiểu loại"
                        },
                        "loai_hinh_lap_rap": {
                            "type": "string",
                            "title": "Loại hình lắp ráp"
                        },
                        "xuat_xu": {
                            "type": "string",
                            "title": "Xuất xứ"
                        },
                        "loai_phuong_tien": {
                            "type": "string",
                            "title": "Loại phương tiện"
                        },
                        "chi_tiet": {
                            "type": "string",
                            "title": "DS xe"
                        },
                        "chi_tiet_2": {
                            "type": "string",
                            "title": " "
                        },
                        "ke_khai": {
                            "type": "string",
                            "title": "Kê khai LK"
                        },
                        "ke_khai_2": {
                            "type": "string",
                            "title": " "
                        },
                        "gcn_id": {
                            "type": "string",
                            "title": " "
                        },
                        "ten_doanh_nghiep": {
                            "type": "string",
                            "title": " "
                        },
                        "so_ho_so": {
                            "type": "string",
                            "title": " "
                        },
                        "loai_san_pham": {
                            "type": "string",
                            "title": " "
                        },
                        "loai_hinh_lap_rap_text": {
                            "type": "string",
                            "title": " "
                        },
                        "so_gcn": {
                            "type": "string",
                            "title": " "
                        },
                        "ngay_gcn": {
                            "type": "string",
                            "title": " "
                        },
                        "nguoi_dai_dien": {
                            "type": "string",
                            "title": " "
                        },
                        "so_dien_thoai_nguoi_lien_he": {
                            "type": "string",
                            "title": " "
                        },
                        "phuong_thuc_cap": {
                            "type": "string",
                            "title": " "
                        },
                        "phuong_thuc_cap_text": {
                            "type": "string",
                            "title": " "
                        },
                        "ngay_hieu_luc": {
                            "type": "string",
                            "title": " "
                        },
                        "loai_an_chi_text": {
                            "type": "string",
                            "title": " "
                        },
                        "dia_diem_nhan_phieu_text": {
                            "type": "string",
                            "title": " "
                        }
                    }
                }
            },
            "danh_sach_cap_doi": {
                "required": false,
                "type": "string"
            },
            "danh_sach_cap_doi_2": {
                "required": false,
                "type": "string"
            },
            "ten_doanh_nghiep": {
                "required": false,
                "type": "string"
            },
            "hinh_thuc_cap_text": {
                "required": false,
                "type": "string"
            },
            "phuong_thuc_cap_text": {
                "required": false,
                "type": "string"
            },
            "hinh_thuc_cap": {
                "required": false,
                "type": "string"
            },
            "phuong_thuc_cap": {
                "required": false,
                "type": "string"
            },
            "dia_chi": {
                "required": false,
                "type": "string"
            },
            "ten_nha_xuong": {
                "required": false,
                "type": "string"
            },
            "ten_nha_xuong_text": {
                "required": false,
                "type": "string"
            },
            "ten_nha_xuong_hidden": {
                "required": false,
                "type": "string"
            },
            "dia_chi_nha_xuong": {
                "required": false,
                "type": "string"
            },
            "ma_so_tai_khoan": {
                "required": false,
                "type": "string"
            },
            "so_luong": {
                "required": false,
                "type": "string",
                "default": 0
            },
            "so_luong_dau_ky": {
                "required": false,
                "type": "string"
            },
            "so_luong_trong_ky": {
                "required": false,
                "type": "string"
            },
            "so_luong_da_su_dung": {
                "required": false,
                "type": "string"
            },
            "so_luong_hong": {
                "required": false,
                "type": "string"
            },
            "so_luong_ton_tai": {
                "required": false,
                "type": "string"
            },
            "quyet_toan": {
                "required": false,
                "type": "string"
            },
            "quyet_toan_text": {
                "required": false,
                "type": "string",
                "enum": ["1"]
            },
            "loai_hinh_san_xuat": {
                "required": false,
                "type": "string"
            },
            "can_cu": {
                "required": false,
                "type": "string"
            },
            "can_cu_text": {
                "required": false,
                "type": "string"
            },  
            "loai_an_chi": {
                "required": false,
                "type": "string"
            }, 
            "loai_an_chi_text": {
                "required": false,
                "type": "string"
            }, 
            "dia_diem_nhan_phieu": {
                "required": false,
                "type": "string"
            },  
            "dia_diem_nhan_phieu_text": {
                "required": false,
                "type": "string"
            }, 
            "so_ho_so": {
                "required": false,
                "type": "string"
            }, 
            "loai_hinh_san_xuat_text": {
                "required": false,
                "type": "string"
            },                                                                                                                    
            "initEvent": {
                "required": false,
                "type": "string"
            }
        }
    },
    "options": {
        "type": "object",
        "legendStyle": "",
        "fields": {
            "bang_trung": {
                "type": "table",
                "id": "bang_trung",
                "name": "bang_trung"
            },
            "duplicatealert": {
                "type": "hidden",
                "id": "duplicatealert",
                "name": "duplicatealert"
            },
            "formType_hidden": {
                "type": "hidden",
                "id": "formType_hidden",
                "name": "formType_hidden"
            },
            "nguoi_dai_dien": {
                "type": "hidden",
                "id": "nguoi_dai_dien",
                "name": "nguoi_dai_dien"
            },
            "so_dien_thoai_nguoi_lien_he": {
                "type": "hidden",
                "id": "so_dien_thoai_nguoi_lien_he",
                "name": "so_dien_thoai_nguoi_lien_he"
            },
            "bang_khai": {
                "id": "bang_khai",
                "name": "bang_khai",
                "type": "table",
                "items": {
                    "fields": {
                        "certificateId": {
                            "type": "select",
                            "label": "Số GCN",
                            "noneLabel": "Chọn ...",
                            "fieldClass": "certificate-class center-class select2",
                            "datasource": function(callback) {
                                id_dn = $('#ma_so_tai_khoan').val();
                                if (!id_dn) {
                                    id_dn = $('#applicantIdNo').val()
                                }
                                
                                $.ajaxSetup({
                                  headers : {   
                                    'groupId': Liferay.ThemeDisplay.getScopeGroupId()
                                  }
                                });
                                console.log('ccccccc')
                                // if (!$('#loai_hinh_san_xuat').val()) {
                                //     callback([]);
                                //     return;
                                // }
                                $.getJSON('/o/rest/vr-app/certificate/vehicleClass/', {"applicantIdNo": id_dn, "vehicleClass": "XCG", "expiredStatus": 1, "serviceCode": "'TT302011BGTVTCNCLKLTXXCG'", "certifiedAssemblyType": "", "module": 3, "circularCode ": $('#can_cu').val()}, function(response) {
                                    var reviewArray = [];
                                    $.each(response, function(key,obj){
                                        if(key == 'data'){
                                            $.each (obj, function(k,v){
                                                var sub_key = v['id'];
                                                var sub_val = v['certificateRecordNo'];
                                                reviewArray.push({
                                                    "value": sub_key,
                                                    "text": sub_val
                                                })
                                            });
                                        }
                                    });
                                    callback(reviewArray);
                                });
                            }
                        },
                        "ngay_cap": {
                            "fieldClass": "center-class",
                            "disabled": true
                        },
                        "nhan_hieu": {
                            "fieldClass": "center-class",
                            "disabled": true
                        },
                        "ten_thuong_mai": {
                            "fieldClass": "center-class",
                            "disabled": true
                        },
                        "so_luong_pxx": {
                            "fieldClass": "number-class",
                            "disabled": true
                        },
                        "so_luong": {
                            "fieldClass": "number-class"
                        },
                        "gia_ban": {
                            "fieldClass": "number-class"
                        },
                        "chi_tiet": {
                            "fieldClass": "chi-tiet center-class",
                            "type": "json",
                            "label": "DS xe"
                        },
                        "ke_khai": {
                            "fieldClass": "ke-khai center-class",
                            "type": "json",
                            "label": "DS LK"
                        },
                        "chi_tiet_2": {
                            "type": "json",
                            "label": ""
                        },
                        "ke_khai_2": {
                            "type": "json",
                            "label": " "
                        },
                        "gcn_id": {
                            "fieldClass": ""
                        },
                        "ten_doanh_nghiep": {
                            "fieldClass": ""
                        },
                        "so_ho_so": {
                            "fieldClass": ""
                        },
                        "loai_san_pham": {
                            "fieldClass": ""
                        },
                        "loai_hinh_lap_rap_text": {
                            "fieldClass": ""
                        },
                        "so_gcn": {
                            "fieldClass": ""
                        },
                        "ngay_gcn": {
                            "fieldClass": ""
                        },
                        "nguoi_dai_dien": {
                            "fieldClass": ""
                        },
                        "so_dien_thoai_nguoi_lien_he": {
                            "fieldClass": ""
                        },
                        "phuong_thuc_cap": {
                            "fieldClass": ""
                        },
                        "phuong_thuc_cap_text": {
                            "fieldClass": ""
                        },
                        "ngay_hieu_luc": {
                            "fieldClass": ""
                        },
                        "loai_an_chi_text": {
                            "fieldClass": ""
                        },
                        "dia_diem_nhan_phieu_text": {
                            "fieldClass": ""
                        }
                    }
                }
            },
            "danh_sach_cap_doi": {
                "type": "json",
                "id": "danh_sach_cap_doi",
                "name": "danh_sach_cap_doi"
            },
            "danh_sach_cap_doi_2": {
                "type": "json",
                "id": "danh_sach_cap_doi_2",
                "name": "danh_sach_cap_doi_2"
            },
            "ten_doanh_nghiep": {
                "type": "text",
                "id": "ten_doanh_nghiep",
                "name": "ten_doanh_nghiep"
            },
            "dia_chi": {
                "type": "text",
                "id": "dia_chi",
                "name": "dia_chi"
            },
            "ten_nha_xuong": {
                "type": "select",
                "id": "ten_nha_xuong",
                "name": "ten_nha_xuong",
                "noneLabel": "Chọn nhà máy sản xuất",
                "hideNone": false
            },
            "ten_nha_xuong_text": {
                "type": "hidden",
                "id": "ten_nha_xuong_text",
                "name": "ten_nha_xuong_text"
            },
            "ten_nha_xuong_hidden": {
                "type": "hidden",
                "id": "ten_nha_xuong_hidden",
                "name": "ten_nha_xuong_hidden"
            },
            "dia_chi_nha_xuong": {
                "type": "text",
                "id": "dia_chi_nha_xuong",
                "name": "dia_chi_nha_xuong"
            },
            "ma_so_tai_khoan": {
                "type": "hidden",
                "id": "ma_so_tai_khoan",
                "name": "ma_so_tai_khoan"
            },
            "so_luong": {
                "type": "text",
                "id": "so_luong",
                "name": "so_luong"
            },
            "so_luong_dau_ky": {
                "type": "text",
                "id": "so_luong_dau_ky",
                "name": "so_luong_dau_ky"
            },
            "so_luong_trong_ky": {
                "type": "text",
                "id": "so_luong_trong_ky",
                "name": "so_luong_trong_ky"
            },
            "so_luong_da_su_dung": {
                "type": "text",
                "id": "so_luong_da_su_dung",
                "name": "so_luong_da_su_dung"
            },
            "so_luong_hong": {
                "type": "text",
                "id": "so_luong_hong",
                "name": "so_luong_hong"
            },
            "so_luong_ton_tai": {
                "type": "text",
                "id": "so_luong_ton_tai",
                "name": "so_luong_ton_tai"
            },
            "quyet_toan": {
                "type": "checkbox",
                "id": "quyet_toan",
                "name": "quyet_toan"
            },
            "quyet_toan_text": {
                "type": "hidden",
                "id": "quyet_toan_text",
                "name": "quyet_toan_text"
            },
            "doi_tuong": {
                "type": "hidden",
                "id": "doi_tuong",
                "name": "doi_tuong"
            },
            "hinh_thuc_cap_text": {
                "type": "hidden",
                "id": "hinh_thuc_cap_text",
                "name": "hinh_thuc_cap_text"
            },
            "phuong_thuc_cap_text": {
                "type": "hidden",
                "id": "phuong_thuc_cap_text",
                "name": "phuong_thuc_cap_text"
            },
            "loai_hinh_san_xuat": {
                "type": "select",
                "id": "loai_hinh_san_xuat",
                "name": "loai_hinh_san_xuat",
                "noneLabel": "",
                "datasource": function(callback) {
                    $.ajaxSetup({
                        headers : {   
                            'groupId': Liferay.ThemeDisplay.getScopeGroupId()
                        }
                    });
                    var vehicleClass = 'PXXXCG'
                    $.getJSON('/o/rest/v2/dictcollections/VR77/dictgroups/' + vehicleClass + '/dictitems', 
                        function(response) {
                        var reviewArray = [];
                        $.each(response, function(key,obj){
                            if(key == 'data'){
                                $.each (obj, function(k,v){
                                    var sub_key = v['itemCode'];
                                    var sub_val = v['itemName'];
                                    reviewArray.push({
                                        "value": sub_key,
                                        "text": sub_val
                                    })
                                });
                            }
                        });
                        callback(reviewArray);
                    });
                }
            },
            "loai_hinh_san_xuat_text": {
                "type": "hidden",
                "id": "loai_hinh_san_xuat_text",
                "name": "loai_hinh_san_xuat_text"
            },
            "can_cu": {
                "type": "select",
                "id": "can_cu",
                "name": "can_cu",
                "noneLabel": "--- Chọn ---",
                "datasource": function(callback) {
                    $.ajaxSetup({
                        headers : {   
                            'groupId': Liferay.ThemeDisplay.getScopeGroupId()
                        }
                    });
                    $.getJSON('/o/rest/v2/dictcollections/VR94/dictgroups/XCG/dictitems?isReverse=1', 
                        function(response) {
                        var reviewArray = [];
                        $.each(response, function(key,obj){
                            if(key == 'data'){
                                $.each (obj, function(k,v){
                                    var sub_key = v['itemCode'];
                                    var sub_val = v['itemName'];
                                    reviewArray.push({
                                        "value": sub_key,
                                        "text": sub_val
                                    })
                                });
                            }
                        });
                        callback(reviewArray);
                    });
                }
            },
            "can_cu_text": {
                "type": "hidden",
                "id": "can_cu_text",
                "name": "can_cu_text"
            },
            "so_luong_an_chi": {
                "type": "text",
                "id": "so_luong_an_chi",
                "name": "so_luong_an_chi"
            },
            "so_ho_so": {
                "type": "text",
                "id": "so_ho_so",
                "name": "so_ho_so"
            },
            "dossierIdDnQuyetToan": {
                "type": "hidden",
                "id": "dossierIdDnQuyetToan",
                "name": "dossierIdDnQuyetToan"
            },
            "dossierNoPattern": {
                "type": "hidden",
                "id": "dossierNoPattern",
                "name": "dossierNoPattern"
            },
            "phuong_thuc_cap": {
                "type": "select",
                "id": "phuong_thuc_cap",
                "name": "phuong_thuc_cap",
                "hideNone": true,
                "datasource": [
                    {"text": "", "value": ""},
                    {"text": "    Đề nghị cấp theo kế hoạch sản xuất", "value": "10"},
                    {"text": "Đề nghị cấp theo lô", "value": "20"},
                    {"text": "Đề nghị giám sát", "value": "30"},
                    {"text": "   Đề nghị quyết toán", "value": "40"}
                ]
            },
            "hinh_thuc_cap": {
                "type": "select",
                "id": "hinh_thuc_cap",
                "name": "hinh_thuc_cap",
                "hideNone": false,
                "noneLabel": "",
                /*"datasource": [
                    {"text": "", "value": ""},
                    {"text": "Cấp mới lần đầu", "value": "1"},
                    {"text": "Cấp thay thế (đổi phiếu hỏng)", "value": "2"},
                    {"text": "Cấp thay thế (cho phiếu mất)", "value": "3"},
                    {"text": "Cấp thay thế", "value": "4"},
                    {"text": "Trả ấn chỉ", "value": "5"},
                    {"text": "Hủy ấn chỉ", "value": "6"}
                ]*/
                "datasource": function(callback) {
                    $.ajaxSetup({
                        headers : {   
                            'groupId': Liferay.ThemeDisplay.getScopeGroupId()
                        }
                    });
                    var ptc = $('#phuong_thuc_cap').val();
                    $.getJSON('/o/rest/v2/dictcollections/VR77/dictgroups/' + ptc + '/dictitems', 
                        function(response) {
                        var reviewArray = [];
                        $.each(response, function(key,obj){
                            if(key == 'data'){
                                $.each (obj, function(k,v){
                                    var sub_key = v['itemCode'];
                                    var sub_val = v['itemName'];
                                    reviewArray.push({
                                        "value": sub_key,
                                        "text": sub_val
                                    })
                                });
                            }
                        });
                        callback(reviewArray);
                    });
                }
            },
            "loai_an_chi": {
                "type": "select",
                "id": "loai_an_chi",
                "name": "loai_an_chi",
                "hideNone": false,
                "noneLabel": "",
                "datasource": function(callback) {
                    $.ajaxSetup({
                        headers : {   
                            'groupId': Liferay.ThemeDisplay.getScopeGroupId()
                        }
                    });
                    $.getJSON('/o/rest/v2/dictcollections/VR92/dictgroups/XCG/dictitems', 
                        function(response) {
                        var reviewArray = [];
                        $.each(response, function(key,obj){
                            if(key == 'data'){
                                $.each (obj, function(k,v){
                                    var sub_key = v['itemCode'];
                                    var sub_val = v['itemName'];
                                    reviewArray.push({
                                        "value": sub_key,
                                        "text": sub_val
                                    })
                                });
                            }
                        });
                        callback(reviewArray);
                    });
                }
            },
            "loai_an_chi_text": {
                "type": "hidden",
                "id": "loai_an_chi_text",
                "name": "loai_an_chi_text"
            },
            "dia_diem_nhan_phieu": {
                "type": "select",
                "id": "dia_diem_nhan_phieu",
                "name": "dia_diem_nhan_phieu",
                "hideNone": false,
                "noneLabel": "",
                "datasource": function(callback) {
                    $.ajaxSetup({
                        headers : {   
                            'groupId': Liferay.ThemeDisplay.getScopeGroupId()
                        }
                    });
                    $.getJSON('/o/rest/v2/dictcollections/VR30/dictgroups/CPP/dictitems', 
                        function(response) {
                        var reviewArray = [];
                        $.each(response, function(key,obj){
                            if(key == 'data'){
                                $.each (obj, function(k,v){
                                    var sub_key = v['itemCode'];
                                    var sub_val = v['itemName'];
                                    reviewArray.push({
                                        "value": sub_key,
                                        "text": sub_val
                                    })
                                });
                            }
                        });
                        callback(reviewArray);
                    });
                }
            },
            "dia_diem_nhan_phieu_text": {
                "type": "hidden",
                "id": "dia_diem_nhan_phieu_text",
                "name": "dia_diem_nhan_phieu_text"
            },
            "initEvent": {
                "type": "hidden",
                "id": "initEvent",
                "name": "initEvent",
                "validateData": function(validateDataForm) {
                    validateDataForm = true;
                    dossierIdCTN = $('#dossierIdCTN').val();
                    var data = $("#formPartNoTP2").alpaca('get').getValue();
                    var msg = '';
                    $.each(data.bang_khai, function(k, v){
                        if (!v['gia_ban'] || v['gia_ban'] == '0') {
                            msg += 'Giá bán xe ' + v['ten_thuong_mai'] + ' không được bỏ trống! \n'
                            validateDataForm = false;
                        }
                        if (!v['so_luong'] || v['so_luong'] == '0') {
                            validateDataForm = false;
                            msg += 'Số lượng xe ' + v['ten_thuong_mai'] + ' đang trống, vui lòng kiểm tra lại! \n'
                        }
                    });

                    $.ajax({
                        headers: {
                            "groupId": Liferay.ThemeDisplay.getScopeGroupId()
                        },
                        data: {},
                        type: 'get',
                        async: false,
                        dataType: 'json',
                        url: '/o/rest/vr-app/record/check/duplicate/sksdc?dossierIdCTN=' + dossierIdCTN,
                        success: function(response) {
                            if (response.total == 0) {
                                $('#duplicatealert').val('');
                            } else {
                                $('#duplicatealert').val('Trùng số khung, số động cơ');
                                msg += 'Trùng số khung, số động cơ (' + response.total + ' xe)'
                                // alert('Trùng số khung, số động cơ (' + response.total + ' xe)');
                            }
                        }
                    });
                    alert(msg);
                    return validateDataForm;
                },
                "postData": function(jsonData) {

                    $('#formType_hidden').addClass('formType');
                    $('#formType_hidden').val('dklr');
                    var dossierId = $('#dossierId__hidden').val();
                    var var_partNo = 'TP2';
                    var checktc = 0;
                    var jsonData = JSON.parse('{}');
                    var controll = $('#formPartNo' + var_partNo).alpaca('get').children;
                    var data = $("#formPartNoTP2").alpaca('get').getValue();
                    var totalInDocument = 0;
                    var dossierIdCTN = $('#dossierIdCTN').val();
                    var duplicatealert;
                    var bang_trung = [];
                    var jsonCurrent;

                    if($('#phuong_thuc_cap').val() == "10"){
                        totalInDocument = $('#so_luong').val();
                    } else {
                        $.each(data.bang_khai, function(k, v){
                            totalInDocument += parseInt(v['so_luong']);
                            v['certificateId'] =  $('input[name="bang_khai_'+k+'_gcn_id"]').val();
                        });                                                          
                    }

                    $.ajax({
                        headers: {
                            "groupId": Liferay.ThemeDisplay.getScopeGroupId()
                        },
                        data: {},
                        type: 'get',
                        async: false,
                        dataType: 'json',
                        url: '/o/rest/vr-app/record/check/duplicate/sksdc?dossierIdCTN=' + dossierIdCTN,
                        success: function(response) {
                            if (response.total == 0) {
                               duplicatealert = '';
                            } else {
                               duplicatealert = 'Trùng số khung, số động cơ';
                               var data = response.data;
                               $.each(data, function(k, v){
                                    var obj = {};
                                    obj['sequenceNo'] = k; 
                                    obj['certificaterecordno'] = v['certificaterecordno']; 
                                    obj['frameNo'] = v['frameNo']; 
                                    obj['engineNo'] = v['engineNo']; 
                                    obj['color'] = v['color'];
                                    bang_trung.push(obj);
                               });
                            }
                        }
                    });

                    $.each(controll, function(k, v) {
                        var element = $(this)[0];
                        if (element.data == null || element.data == '') {
                            if ($('#' + element.id).val() == null || $('#' + element.id).val() == '') {
                                jsonData[element.id] = "";
                            } else {
                                jsonData[element.id] = $('#' + element.id).val();
                            }
                            if (element.id == 'bang_trung'){
                                console.log('bang_trung___', bang_trung);
                                jsonData[element.id] = bang_trung;
                            }
                        } else {
                            if (element.id == 'bang_khai'){
                                // var data2 = data.bang_khai;
                                // $.each(data2, function(k, v){
                                //     if(data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1].length == 5 && (data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1][4] == " " || data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1][4] == "\u0000")){
                                //         data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1][4] == "";
                                //     }
                                //     if(data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1].length == 5 && (data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1]['so_seri'] == " " || data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1]['so_seri'] == "\u0000")){
                                //         data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1]['so_seri'] == "";
                                //     }
                                // });
                                // jsonData[element.id] = data2;

                                $.each(data.bang_khai, function(k, v){
                                    v['dia_diem_nhan_phieu_text'] =  $('#dia_diem_nhan_phieu_text').val();
                                    v['loai_an_chi_text'] =  $('#loai_an_chi_text').val();
                                }); 

                                jsonData[element.id] = data.bang_khai;
                            } else if (element.id == 'bang_trung'){
                                console.log('bang_trung___', bang_trung);
                                jsonData[element.id] = bang_trung;
                            }else {
                                jsonData[element.id] = element.data;
                            }
                        }
                    });
                    jsonData['duplicatealert'] = duplicatealert;
                    jsonData['so_luong'] = totalInDocument;
                    jsonData['dossierNoPattern'] = 'OT';

                    if(dossierIdDnQuyetToan == '0' || dossierIdDnQuyetToan == undefined || dossierIdDnQuyetToan == '' || dossierIdDnQuyetToan == null || !dossierIdDnQuyetToan){
                        
                    } else {
                        jsonData['dossierIdDnQuyetToan'] = dossierIdDnQuyetToan;
                    }

                    console.log(JSON.stringify(jsonData));
                    console.log(jsonData);

                    return jsonData;
                },
                "events": {
                    "ready": function() {
                        //$('.certificate-class').find('select').change()
                        var var_partNo = 'TP2';
                        $('#formType_hidden').addClass('formType');
                        $('#formType_hidden').val('dklr');
                        $('#dossierNoPattern').val('OT');
                        $('.hosodoanhnghiep').find('select').select2();
                        $("#doi_tuong").val("XCG");
                        document.getElementById("ten_doanh_nghiep").disabled = true;
                        document.getElementById("dia_chi").disabled = true;
                        document.getElementById("dia_chi_nha_xuong").disabled = true;
                        var dossierIdGCN = 0
                        var hasResponse = false;
                        var dossierId = $('#dossierId_Hidden').val();
                        var fileEntryId = 0;
                        var lhsx = '';
                        var cancu = '';
                        var dossierIdCTN = $('#dossierIdCTN').val();                    
                        var bang_trung = [];

                        if(dossierIdDnQuyetToan == '0' || dossierIdDnQuyetToan == undefined || dossierIdDnQuyetToan == '' || dossierIdDnQuyetToan == null || !dossierIdDnQuyetToan){
                            dossierIdDnQuyetToan = $('#dossierIdDnQuyetToan').val();
                        } else {
                            $('#dossierIdDnQuyetToan').val(dossierIdDnQuyetToan);
                        }
                        
                        var checkDupCer = function(){
                            $.ajax({
                                headers: {
                                    "groupId": Liferay.ThemeDisplay.getScopeGroupId()
                                },
                                data: {},
                                type: 'get',
                                async: false,
                                dataType: 'json',
                                url: '/o/rest/vr-app/record/check/duplicate/sksdc?dossierIdCTN=' + dossierIdCTN,
                                success: function(response) {
                                    if (response.total == 0) {
                                        $('#duplicatealert').val('');
                                    } else {
                                        bang_trung = []
                                        $('#duplicatealert').val('Trùng số khung, số động cơ');
                                       var data = response.data;
                                       $.each(data, function(k, v){
                                            var obj = {};
                                            obj['sequenceNo'] = k; 
                                            obj['certificaterecordno'] = v['certificaterecordno']; 
                                            obj['frameNo'] = v['frameNo']; 
                                            obj['engineNo'] = v['engineNo']; 
                                            obj['color'] = v['color'];
                                            bang_trung.push(obj);
                                       });
                                    }
                                }
                            });
                        }

                        var changeDisplay_init = function(i){
                            id_ = $('textarea[name=bang_khai_'+i+'_chi_tiet]').attr('id');
                            $('label[for='+id_+']').css('display','block');
                            $('label[for='+id_+']').html('<input class="button-edit-row" data-row-stt="'+i+'" type="button" value="Chi tiết" />')
                            
                        }

                        $.ajax({
                            headers: {
                                "groupId": Liferay.ThemeDisplay.getScopeGroupId()
                            },
                            data: "",
                            type: 'get',
                            async: false,
                            dataType: 'json',
                            url: '/o/rest/v2/dossiers/' + dossierId + '/files',
                            success: function(response) {
                                var data = response.data;
                                $.each(data, function(k, v) {
                                    if (v.dossierPartNo == 'TP2') {
                                        if(v.fileEntryId != 0){
                                            var formdata = JSON.parse(v.formData.replace(/[\u0000-\u0019]+/g, ""));
                                            fileEntryId = v.fileEntryId;
                                            lhsx = formdata.loai_hinh_san_xuat;
                                            cancu = formdata.can_cu;
                                        }
                                    }
                                });
                            }
                        });
                        
                        var maso_taikhoan = $('#ma_so_tai_khoan').val();
                        if (!maso_taikhoan) {
                            maso_taikhoan = $('#applicantIdNo').val();
                        }
                        var list_ttnx = new Array();
                        var applicantProfile = {}
                        var ttnx = function(callback) {
                            $.ajax({
                                headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                data: {
                                    "keyword": "",
                                    "applicantcode": maso_taikhoan
                                },
                                type: 'GET',
                                dataType: 'json',
                                url: '/o/rest/vr-app/applicant/profile/detail',
                                success: function(response) {
                                    applicantProfile = response
                                    callback(response);
                                }
                            });
                        }
                        
                        ttnx(function(response){
                            $.ajax({
                                headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                data: {
                                    "keyword": "",
                                    "applicantcode": maso_taikhoan,
                                    "start": -1,
                                    "end": -1,
                                    "productionplantstatus": 1
                                },
                                type: 'GET',
                                async: false,
                                dataType: 'json',
                                url: '/o/rest/vr-app/production/plant/search',
                                success: function(response) {
                                    list_ttnx = response;
                                    gt_hidden = $('#ten_nha_xuong_hidden').val();
                                    $(response['data']).each(function(k,v){
                                        tg = response['data'][k]['productionPlantCode'];
                                        if(gt_hidden == tg)
                                            $('#ten_nha_xuong').append('<option value="'+response['data'][k]['productionPlantCode'].toString()+'" selected>' + response['data'][k]['productionPlantName'] + '</option>');
                                        else
                                            $('#ten_nha_xuong').append('<option value="'+response['data'][k]['productionPlantCode'].toString()+'" >' + response['data'][k]['productionPlantName'] + '</option>');
                                    });
                                    if(fileEntryId != 0) {
                                        $('#ten_nha_xuong').val(gt_hidden).change();
                                        $('#loai_hinh_san_xuat').val(lhsx).change();
                                        $('#can_cu').val(cancu).change();
                                    }
                                }
                            });
                        });

                        var productionPlantId;

                        $('#ten_nha_xuong').change(function(){
                            gt_xuong = $(this).val();
                            $('#ten_nha_xuong_hidden').val(gt_xuong);
                            $('#ten_nha_xuong_text').val($('#ten_nha_xuong option:selected').text());
                            $(list_ttnx.data).each(function(k,v){
                                if(v['productionPlantCode'] == gt_xuong){
                                    $('#dia_chi_nha_xuong').val(v['productionPlantAddress']);
                                    applicantProfile = Object.assign(applicantProfile, {
                                        productionPlantCode: v['productionPlantCode'],
                                        productionPlantName: v['productionPlantName'],
                                        productionPlantAddress: v['productionPlantAddress'],
                                        productionPlantRegion: v['productionPlantRegion'],
                                        productionPlantId:v['id'],
                                        productionPlantProvinceCode:v['productionPlantProvinceCode'],
                                        productionPlantProvinceName:v['productionPlantProvinceName'],
                                        productionPlantStatus:v['productionPlantStatus']
                                    });
                                    productionPlantId = v['id'];
                                }
                            });
                        });

                        var genDisplay = function(){
                            if($('#phuong_thuc_cap option:selected').val() == "40"){ 
                                //tạm ứng: có check quyết toán
                                //$('#div-quyet-toan').css('display','block');
                                
                                if($('#div-quyet-toan input[name="quyet_toan"]').is(':checked')){
                                    $('#div-so-luong').css('display','none');
                                    $('#div-hinh-thuc-cap').css('display','none');
                                    $('#div-ds-cap-doi').css('display','none');
                                    $('#div-bang').css('display','block');
                                    $('#div-bang-khai').removeClass('table-cap-tam');
                                    $('#quyet_toan_text').val('ĐN quyết toán');
                                }else{
                                    $('#quyet_toan_text').val('');
                                    
                                    $('#div-hinh-thuc-cap').css('display','block');
                                    
                                    if($('#hinh_thuc_cap option:selected').val() == "1"){
                                        // cấp mới
                                        $('#div-bang').css('display','block');
                                        $('#div-ds-cap-doi').css('display','none');
                                        $('#div-bang-khai').addClass('table-cap-tam');
                                        $('#div-so-luong').css('display','block');
                                    }else
                                        if($('#hinh_thuc_cap option:selected').val() == "2"){
                                            $('#div-bang').css('display','none');
                                            $('#div-ds-cap-doi').css('display','block');
                                            $('#div-so-luong').css('display','block');
                                            $('#div-bang-khai').removeClass('table-cap-tam');
                                        }else
                                            if($('#hinh_thuc_cap option:selected').val() == "3"){
                                                $('#div-bang').css('display','block');
                                                $('#div-ds-cap-doi').css('display','none');
                                                $('#div-bang-khai').removeClass('table-cap-tam');
                                                $('#div-so-luong').css('display','none');
                                            }else{
                                                $('#div-bang').css('display','none');
                                                $('#div-ds-cap-doi').css('display','none');
                                                $('#div-so-luong').css('display','none');
                                            }
                                }
                            }else
                                if($('#phuong_thuc_cap option:selected').val() == "20" ||
                                 $('#phuong_thuc_cap option:selected').val() == "30" ||
                                 $('#phuong_thuc_cap option:selected').val() == "10"){
                                    $('#quyet_toan_text').val('');
                                    //$('#div-quyet-toan').css('display','none');
                                    $('#div-so-luong').css('display','none');
                                    $('#div-hinh-thuc-cap').css('display','block');
                                    if($('#hinh_thuc_cap option:selected').val() == "10" ||
                                     $('#hinh_thuc_cap option:selected').val() == "30"){
                                        $('#div-bang').css('display','block');
                                        $('#div-ds-cap-doi').css('display','none');
                                        $('#div-so-luong').css('display','none');
                                        $('#div-bang-khai').removeClass('table-cap-tam');
                                    }else
                                        if($('#hinh_thuc_cap option:selected').val() == "20"){
                                            $('#div-bang').css('display','none');
                                            $('#div-ds-cap-doi').css('display','block');
                                            $('#div-so-luong').css('display','block');
                                            $('#div-bang-khai').removeClass('table-cap-tam');
                                        }else{
                                            $('#div-ds-cap-doi').css('display','none');
                                            $('#div-bang').css('display','none');
                                        }
                                }else{
                                    $('#quyet_toan_text').val('');
                                    //$('#div-quyet-toan').css('display','none');
                                    $('#div-so-luong').css('display','none');
                                    $('#div-hinh-thuc-cap').css('display','none');
                                    $('#div-ds-cap-doi').css('display','none');
                                    $('#div-bang').css('display','none');
                                }
                        }
                        
                        // genDisplay();
                        
                        // $('#hinh_thuc_cap').change(function(){
                        //  genDisplay();
                        //  $('#hinh_thuc_cap_text').val($('#hinh_thuc_cap option:selected').text());
                        // });
                        
                        // $(".hosodoanhnghiep").delegate('#div-quyet-toan input[name="quyet_toan"]', "click", function(e) {
                        //  genDisplay();
                            
                        // });
                        // 
                        // var genDisplay1 = function () {

                        // }
                        // if ($('#phuong_thuc_cap').val() == '20' || $('#phuong_thuc_cap').val() == '30') {
                        //  $("#div-quyet-toan").hide()
                        // } else {
                        //  $("#div-quyet-toan").show()
                        // }

                        var changeptc = function(phuong_thuc_cap){
                            if (phuong_thuc_cap == '20' || phuong_thuc_cap == '30') {
                                //$("#div-quyet-toan").hide()
                                $('#div-quyet-toan input[name="quyet_toan"]').prop('checked', false);
                                $('#column-so_ho_so').parent().parent().hide();
                                $('#column-so_luong').parent().parent().hide();
                                $('#column-so_luong_dau_ky').parent().parent().hide();
                                $('#column-so_luong_trong_ky').parent().parent().hide();
                                $('#column-so_luong_da_su_dung').parent().parent().hide();
                                $('#column-so_luong_hong').parent().parent().hide();
                                $('#column-so_luong_ton_tai').parent().parent().hide();

                                $('#column-bang_khai td:nth-child(6)').show();
                                $('#column-bang_khai th:nth-child(6)').show();

                                $('#column-bang_khai td:nth-child(7)').hide();
                                $('#column-bang_khai th:nth-child(7)').hide();

                                $('#column-bang_khai td:nth-child(8)').show();
                                $('#column-bang_khai th:nth-child(8)').show();

                                $('#column-bang_khai td:nth-child(12)').show();
                                $('#column-bang_khai th:nth-child(12)').show();

                                $('#column-bang_khai td:nth-child(13)').show();
                                $('#column-bang_khai th:nth-child(13)').show();

                                $('#column-bang_khai td:nth-child(14)').hide();
                                $('#column-bang_khai th:nth-child(14)').hide();

                                $('#column-bang_khai td:nth-child(15)').show();
                                $('#column-bang_khai th:nth-child(15)').show();
                            } else  if (phuong_thuc_cap == '40'){
                               //$("#div-quyet-toan").show()
                                $('#div-quyet-toan input[name="quyet_toan"]').prop('checked', true);
                                $('#column-so_ho_so').parent().parent().show();
                                $('#column-so_luong').parent().parent().hide();
                                $('#column-so_luong_dau_ky').parent().parent().hide();
                                $('#column-so_luong_trong_ky').parent().parent().hide();
                                $('#column-so_luong_da_su_dung').parent().parent().hide();
                                $('#column-so_luong_hong').parent().parent().hide();
                                $('#column-so_luong_ton_tai').parent().parent().hide();

                                $('#column-bang_khai td:nth-child(6)').show();
                                $('#column-bang_khai th:nth-child(6)').show();

                                $('#column-bang_khai td:nth-child(7)').hide();
                                $('#column-bang_khai th:nth-child(7)').hide();

                                $('#column-bang_khai td:nth-child(8)').show();
                                $('#column-bang_khai th:nth-child(8)').show();

                                $('#column-bang_khai td:nth-child(12)').show();
                                $('#column-bang_khai th:nth-child(12)').show();

                                $('#column-bang_khai td:nth-child(13)').show();
                                $('#column-bang_khai th:nth-child(13)').show();

                                $('#column-bang_khai td:nth-child(15)').show();
                                $('#column-bang_khai th:nth-child(15)').show();
                            } else  if (phuong_thuc_cap == '10'){
                               //$("#div-quyet-toan").show()
                                $('#div-quyet-toan input[name="quyet_toan"]').prop('checked', false);
                                $('#column-so_ho_so').parent().parent().hide();
                                $('#column-so_luong').parent().parent().show();
                                $('#column-so_luong_dau_ky').parent().parent().show();
                                $('#column-so_luong_trong_ky').parent().parent().show();
                                $('#column-so_luong_da_su_dung').parent().parent().show();
                                $('#column-so_luong_hong').parent().parent().show();
                                $('#column-so_luong_ton_tai').parent().parent().show();

                                $('#column-bang_khai td:nth-child(6)').hide();
                                $('#column-bang_khai th:nth-child(6)').hide();

                                $('#column-bang_khai td:nth-child(7)').hide();
                                $('#column-bang_khai th:nth-child(7)').hide();

                                $('#column-bang_khai td:nth-child(8)').hide();
                                $('#column-bang_khai th:nth-child(8)').hide();

                                $('#column-bang_khai td:nth-child(12)').hide();
                                $('#column-bang_khai th:nth-child(12)').hide();

                                $('#column-bang_khai td:nth-child(13)').hide();
                                $('#column-bang_khai th:nth-child(13)').hide();

                                $('#column-bang_khai td:nth-child(15)').hide();
                                $('#column-bang_khai th:nth-child(15)').hide();
                            }
                        }

                        var setHTC = function(ptc){
                            $('option', '#hinh_thuc_cap').not(':eq(0)').remove();

                            $.ajax({
                                headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                data: {},
                                type: 'GET',
                                async: false,
                                dataType: 'json',
                                url: '/o/rest/v2/dictcollections/VR105/dictgroups/' + ptc + '/dictitems',
                                success: function(response) {
                                    if(response.data) {
                                        $.each(response.data, function(k, v){
                                            var id = v['itemCode'];
                                            var name = v['itemName'];
                                            if (response.total == 1){
                                                $('#hinh_thuc_cap').append('<option value="' + id + '" selected>' + name + '</option>');
                                                $('#hinh_thuc_cap_text').val(name);
                                            } else {
                                                if (name == $('#hinh_thuc_cap_text').val()) {
                                                    $('#hinh_thuc_cap').append('<option value="' + id + '" selected>' + name + '</option>');
                                                } else {
                                                    $('#hinh_thuc_cap').append('<option value="' + id + '">' + name + '</option>');
                                                }
                                            }
                                        });
                                    }
                                }
                            });

                        }

                        if($('#hinh_thuc_cap_text').val() != ""){
                            setHTC($('#phuong_thuc_cap').val());
                        }
                        
                        $('#phuong_thuc_cap').change(function () {
                            changeptc($(this).val());
                            $('#so_ho_so').val('');
                            $('#phuong_thuc_cap_text').val($('#phuong_thuc_cap option:selected').text());

                            var ptc = $(this).val();
                            setHTC(ptc);
                        });

                        $("#div-bang-khai").delegate('.alpaca-array-actionbar-action', "click", function(){ 
                            if($(this).attr('data-alpaca-array-actionbar-action') == 'add'){
                                setTimeout(function(){
                                    changeptc($('#phuong_thuc_cap').val());
                                }, 1000);
                            }
                        });
                        
                        $('#hinh_thuc_cap').change(function () {
                            $('#hinh_thuc_cap_text').val($('#hinh_thuc_cap option:selected').text());
                        });
                        
                        $('#loai_an_chi').change(function () {
                            $('#loai_an_chi_text').val($('#loai_an_chi option:selected').text());
                        });
                        
                        $('#dia_diem_nhan_phieu').change(function () {
                            $('#dia_diem_nhan_phieu_text').val($('#dia_diem_nhan_phieu option:selected').text());
                        });
                        
                        
                        var indexRow = -1;
                        //$("#div-bang-khai td:nth-child(2)").delegate('input', "change", function(e) {
                        $('#div-bang-khai').delegate('.certificate-class select','change',function(){   
                            ten = $(this).attr('name');
                            idd = $(this).attr('id');
                            tg = ten.split('_');
                            dong = tg[2];
                            gt = $('#' + idd).val();
                            if(gt == ""){
                                id_ = $('textarea[name=bang_khai_'+dong+'_chi_tiet]').attr('id');
                                console.log('id____', id_);
                                // $('label[for='+id_+']').html('<input class="btn btn-default chi-tiet" data-row-stt="'+dong+'" type="button" value="Chi tiết" />')
                            }
                        });
                        var changed = function(instance, cell, x, y, value) {
                            var data = $('#my_excel').jexcel('getData') || [];
                            $("#soLuongXe").text(data['length'])
                        }
                        var deletedRow = function(instance) {
                            var data = $('#my_excel').jexcel('getData') || [];
                            $("#soLuongXe").text(data['length'])
                        }
                        var genExcel = function (dong, data, loai){
                            $('#current_row').val(dong);
                            $('#loai_ds').val(loai);
                            $('#my_excel').html('');
                            if (!data || !data['length']) {
                                data = [[]]
                            }   
                            if (loai == 1) {
                                jexcel(document.getElementById('my_excel'), {
                                    data: data,
                                    columns:  [ 
                                        {
                                            type: 'text',
                                            title:'Số khung', 
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số máy',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Mầu sơn',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Ngày xuất xưởng',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số thùng xe',
                                            width:150
                                        }
                                    ],
                                    onchange: changed,
                                    ondeleterow: deletedRow
                                });
                            }else if (loai == 2) {
                                jexcel(document.getElementById('my_excel'), {
                                    data: data,
                                    columns:  [ 
                                        {
                                            type: 'text',
                                            title:'Số khung', 
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số máy',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Mầu sơn',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Ngày xuất xưởng',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số serial',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số thùng xe',
                                            width:150
                                        }
                                    ],
                                    onchange: changed,
                                    ondeleterow: deletedRow
                                });
                            } else if (loai == 3) {
                                jexcel(document.getElementById('my_excel'), {
                                    data: data,
                                    columns:  [ 
                                        {
                                            type: 'text',
                                            title:'Số khung', 
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số máy',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Mầu sơn',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Ngày xuất xưởng',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số serial hỏng/mất',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số serial mới',
                                            width:150
                                        }
                                    ],
                                    onchange: changed,
                                    ondeleterow: deletedRow
                                });
                            } else if (loai == 4) {
                                jexcel(document.getElementById('my_excel'), {
                                    data: data,
                                    columns:  [ 
                                        {
                                            type: 'text',
                                            title:'Số khung', 
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số máy',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Mầu sơn',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Ngày xuất xưởng',
                                            width:150
                                        },
                                        {
                                            type: 'text',
                                            title:'Số serial cần thay thế',
                                            width:150
                                        }
                                    ],
                                    onchange: changed,
                                    ondeleterow: deletedRow
                                });
                            }
                        }
                        
                        var modal = document.getElementById('mymodal-cps');
                        $("#bt-cap-doi").click(function(){
                            if($('#danh_sach_cap_doi').val() != 'null' && $('#danh_sach_cap_doi').val() != '')
                                gt = $('#danh_sach_cap_doi').val();
                            else
                                gt=[];
                            genExcel(0, gt, 1);
                            $('#mymodal-cps').css('display','block');
                            
                        });
                        var state = ''

                        $(".hosodoanhnghiep").delegate('table .chi-tiet', 'click', function(){
                            console.log('dialog!!!!!!!!!!')
                            var indexRowTmp = $(this).parent().parent().attr('data-alpaca-container-item-index');
                            indexRow = parseInt(indexRowTmp)
                            state = 'ds_xe'
                            console.log('indexRow===========', indexRow)
                            id_ = $('textarea[name=bang_khai_'+indexRow+'_chi_tiet]').attr('id');
                            var data = $("#formPartNoTP2").alpaca('get').getValue() || {}
                            console.log('data===========', data)
                            // var dataDsXe = []
                            // if (data['bang_khai'] && data['bang_khai']['length']) {
                            //  dataDsXe = data['bang_khai'][indexRow] ? data['bang_khai'][indexRow]['dsXe'] : []
                            // }
                            if($('#'+id_).val() != 'null' && $('#'+id_).val() != '') {
                                gt = JSON.parse($('#'+id_).val());
                            } else {
                                gt = [];
                            }
                            console.log('gt____', gt);
                            var total = $('#my_excel').jexcel('getData')['length']
                            $('input[name="bang_khai_'+indexRow+'_so_luong"]').val(total);
                            // console.log('dataDsXe===========', dataDsXe)
                            if ($('#phuong_thuc_cap option:selected').val() == "40" && 
                                $('#div-quyet-toan input[name="quyet_toan"]').is(':checked')) {
                                genExcel(indexRow, gt, 2);
                            } else if (!$('#div-quyet-toan input[name="quyet_toan"]').is(':checked')) {
                                if (gt != []) {
                                    $.each(gt, function(k, v){
                                        if (v.length == 5) {
                                            v.pop();
                                        }
                                    })
                                }
                                console.log('gt2___', gt);
                                genExcel(indexRow, gt, 1);
                            } else if ($('#phuong_thuc_cap option:selected').val() == "40" &&
                                        ($('#hinh_thuc_cap option:selected').val() == "2" ||
                                        $('#hinh_thuc_cap option:selected').val() == "3")) {
                                genExcel(indexRow, gt, 3);
                            } else {
                                genExcel(indexRow, gt, 4);
                            }
                            // if($('#phuong_thuc_cap option:selected').val() == "10"){
                            //  if($('#div-quyet-toan input[name="quyet_toan"]').is(':checked')){
                            //      genExcel(indexRow, gt,0);
                            //  }else{
                            //      if($('#hinh_thuc_cap option:selected').val() == "2")
                            //          genExcel(indexRow, gt,1);
                            //      else
                            //          if($('#hinh_thuc_cap option:selected').val() == "3")
                            //              genExcel(indexRow, gt,2);
                            //          else
                            //              genExcel(indexRow, gt,0);
                            //  }
                            // }else{
                            //  if($('#hinh_thuc_cap option:selected').val() == "2")
                            //      genExcel(indexRow, gt,1);
                            //  else
                            //      if($('#hinh_thuc_cap option:selected').val() == "3")
                            //          genExcel(indexRow, gt,2);
                            //      else
                            //          genExcel(indexRow, gt,0);
                            // }
                            $('#mymodal-cps').css('display','block');
                            //modal.style.display = "block";
                        });
                        var listKeKhai = []

                        var getRequired = function (certificateRecordNo, callback) {
                            // var idKeKhai = $('textarea[name=bang_khai_'+indexRow+'_ke_khai_2]').attr('id');
                            // console.log('idKeKhai==========1111111====', idKeKhai)
                            // if (idKeKhai && $("#"+ idKeKhai).val() && $("#"+ idKeKhai).val() !== 'null') {
                            //     var data = $("#"+ idKeKhai).val()
                            //     if (data) {
                            //         console.log('data==========1111111====', data)
                            //         data = JSON.parse(data)
                            //         callback(data);
                            //         return
                            //     }
                            // }
                            // $.ajax({
                            //     headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                            //     type: 'get',
                            //     dataType: 'json',
                            //     data: {
                            //         "start" : -1,
                            //         "end" : -1
                            //     },
                            //     async: false,
                            //     url: '/o/rest/vr-app/vehicle/equipment/' + dossierIdGCN,
                            //     success: function(response) {
                            //         listKeKhai = []
                            //         hasResponse = true
                            //         if (response['data'] && response['data']['length']) {
                            //             for (var i = 0; i < response['data'].length; i++) {
                            //                 var tmp = response['data'][i]
                            //                 // listKeKhai.push({
                            //                 //  "dossierIdCTN": $('#dossierIdCTN').val(),
                            //                 //  "modifyDate": "",
                            //                 //  "equipmentCode": tmp['itemCode'],
                            //                 //  "productionAddress": "",
                            //                 //  "syncDate": "",
                            //                 //  "sequenceNo": 0,
                            //                 //  "dossierId": $('#dossierId').val(),
                            //                 //  "col4": "",
                            //                 //  "equipmentName": tmp['itemName'],
                            //                 //  "col2": "",
                            //                 //  "col3": "",
                            //                 //  "isMandatory": 1,
                            //                 //  "col1": tmp['itemCode']
                            //                 // })
                            //                 listKeKhai.push(tmp)
                            //             }
                            //             callback(listKeKhai, hasResponse);
                            //         } else {
                            //             $.ajax({
                            //                 headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                            //                 type: 'get',
                            //                 dataType: 'json',
                            //                 async: false,
                            //                 url: '/o/rest/vr-app/vehicle/equipment/' + dossierIdGCN,
                            //                 success: function(response) {
                            //                     listKeKhai = []
                            //                     hasResponse = false
                            //                     for (var i = 0; i < response['data'].length; i++) {
                            //                         var tmp = response['data'][i]
                            //                         listKeKhai.push({
                            //                             "dossierIdCTN": $('#dossierIdCTN').val(),
                            //                             "modifyDate": "",
                            //                             "equipmentCode": tmp['itemCode'],
                            //                             "productionAddress": "",
                            //                             "syncDate": "",
                            //                             "sequenceNo": 0,
                            //                             "dossierId": $('#dossierId').val(),
                            //                             "col4": "",
                            //                             "productionCountry": "",
                            //                             "certifiedTrademarkName": "",
                            //                             "equipmentName": tmp['itemName'],
                            //                             "col2": "",
                            //                             "col3": "",
                            //                             "isMandatory": 1,
                            //                             "col1": tmp['itemCode']
                            //                         })
                            //                         listKeKhai.push(tmp)
                            //                     }
                            //                     callback(listKeKhai, hasResponse);
                            //                     console.log('listKeKhai============', listKeKhai)
                            //                 }
                                            
                            //             });
                            //         }
                            //         console.log('listKeKhai============', listKeKhai)
                            //     }
                                
                            // });

                            if(fileEntryId == 0) {
                                $.ajax({
                                    headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                    type: 'get',
                                    dataType: 'json',
                                    async: false,
                                    //url: '/o/rest/vr-app/certificate/vehicleClass',
                                    url: '/o/rest/vr-app/certificate/vehicleClass',
                                    data: {"certifiedVehicleType": "", "serviceCode": "'TT302011BGTVTCNCLKLLKOTO'", "vehicleClass": "LKXCG", "expiredStatus": 1, "certificateNo": certificateRecordNo},
                                    success: function(response) {
                                        callback(response);
                                    }
                                });
                            } else {
                                $.ajax({
                                    headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                    type: 'get',
                                    dataType: 'json',
                                    async: false,
                                    //url: '/o/rest/vr-app/certificate/vehicleClass',
                                    url: '/o/rest/vr-app/issue/get/equipmentcertificate?dossierId=' + dossierId,
                                    data: {},
                                    success: function(response) {
                                        callback(response);
                                    }
                                });
                            }
                        }
                        // changeInputKeKhai = function (index, id) {
                        //  console.log('index changeInputKeKhai ===================', index)
                        //  console.log('id ===================', id)
                        //  if (index) {
                        //      index = parseInt(index)
                        //      if (id && id.indexOf('nhanHieu') !== -1) {
                        //          listKeKhai[index]['nhanHieu'] = $('#' + id).val()
                        //      } else if (id && id.indexOf('noiSanXuat') !== -1) {
                        //          listKeKhai[index]['noiSanXuat'] = $('#' + id).val()
                        //      }
                        //  }
                        //  var data = $("#formPartNoTP2").alpaca('get').getValue() || {}
                        //  var bangKhai = data['bang_khai']
                        //  bangKhai[indexRow]['listKeKhai'] = listKeKhai
                        //  data['bang_khai'] = bangKhai
                        //  $("#formPartNoTP2").alpaca('get').setValue(data)
                        // }
                        var genDataTableKeKhaiLK = function (listRequired/*, response*/) {
                            // if (!listRequired || !listRequired['length']) {
                            //     return
                            // }
                            // listKeKhai = listRequired
                            // $("#dataTableKeKhaiLK").empty();
                            // console.log('indexRow==========', indexRow)
                            // for (var i = 0; i < listRequired.length; i ++) {
                            //     var html = ''
                            //     var tmp = listRequired[i]
                            //     var idSoGCN = 'so_gcn' + i
                            //     var so_gcn = tmp['certificateRecordNo'] || ''
                            //     html += '<tr><td style="width:20%; padding: 5px;">' + tmp['equipmentName'] + '</td>'
                            //     if (!response) {
                            //         html += '<td style="width:20%; padding: 5px; text-align: center;"><input type="text" id="' + idSoGCN + '" value="' + so_gcn + '"/></td>'
                            //     } else {
                            //         html += '<td style="width:20%; padding: 5px; text-align: center;">' + tmp['certificateRecordNo'] + '</td>'
                            //     }
                            //     var idNhanHieu = 'nhanHieu' + i
                            //     var idNoiSanXuat = 'noiSanXuat' + i
                            //     listKeKhai[i]['certificateRecordNo'] = tmp['certificateRecordNo']
                            //     listKeKhai[i]['certificateRecordDate'] = tmp['certificateRecordDate']
                            //     listKeKhai[i]['certificateRecordId'] = tmp['certificateRecordId']
                            //     listKeKhai[i]['vehicleClass'] = tmp['vehicleClass']
                            //     // if (indexRow !== -1) {
                            //     //  var data = $("#formPartNoTP2").alpaca('get').getValue() || {}
                            //     //  var bangKhai = data['bang_khai']
                            //     //  // listKeKhai[i]['certificateId'] = bangKhai[indexRow]['certificateId']
                            //     //  listKeKhai[i]['loai_hinh_lap_rap'] = bangKhai[indexRow]['loai_hinh_lap_rap']
                            //     //  listKeKhai[i]['ngay_cap'] = bangKhai[indexRow]['ngay_cap']
                            //     // }
                            //     var nhanHieu = listKeKhai[i]['certifiedTrademarkName'] || ''
                            //     var noiSanXuat = listKeKhai[i]['productionCountry'] || ''
                            //     if (tmp['certificateRecordNo']) {
                            //         html += '<td style="width:20%; padding: 5px;"><input disabled type="text" id="' + idNhanHieu + '" value="' + nhanHieu + '"/></td>'
                            //     } else {
                            //         html += '<td style="width:20%; padding: 5px;"><input type="text" id="' + idNhanHieu + '" value="' + nhanHieu + '"/></td>'
                            //     }
                            //     if (tmp['certificateRecordNo']) {
                            //         html += '<td style="width:20%; padding: 5px;"><input disabled type="text" id="' + idNoiSanXuat + '" value="' + noiSanXuat + '"/></td></tr>'
                            //     } else {
                            //         html += '<td style="width:20%; padding: 5px;"><input type="text" id="' + idNoiSanXuat + '" value="' + noiSanXuat + '"/></td></tr>'
                            //     }
                                
                            //     $("#dataTableKeKhaiLK").append(html)
                            // }
                            //$('#table-ke-khai').empty('');

                            $("#table-ke-khai").find("tr:gt(1)").remove();
                            $("#tr-ke-khai").empty();
                            listKeKhai = listRequired.data;

                            var html = '';
                            var html2 = '';
                            var length = listRequired.total;
                            var listRequireddata = listRequired.data;

                            for (var i = 0; i < length; i++){
                                if ( i == 0 ) {
                                    var data = listRequireddata[i];
                                    html = '<td style="width:5%;">' + (i + 1) + '</td>';
                                    html += '<td style="width:15%;">' + data["certifiedVehicleTypeDescription"] + '</td>';

                                    if(data["testingReportType"] == "01") {
                                        html += '<td style="width:30%;">' + data["certificateRecordNo"] + '<br><span style="color: red;">' + data["testingReportTypeDescription"] + '</span></td>';
                                    } else {
                                        html += '<td style="width:30%;">' + data["certificateRecordNo"] + '</td>';
                                    }
                                    
                                    html += '<td style="width:10%;">' + data["certificateRecordDate"] + '</td>';
                                    html += '<td style="width:10%;">' + data["importerQuantity"] + '</td>';
                                    html += '<td style="width:10%;">' + data["inuseQuantity"] + '</td>';
                                    html += '<td style="width:10%;">' + data["totalNotUsed"] + '</td>';

                                    if(data["testingReportType"] == "01") {
                                        if (data["totalProductUsed"]) {
                                            html += '<td style="width:10%; background-color: yellow;"><input id="table_ke_khai_' + i + '_totalProductUsed" value="' + data["totalProductUsed"] + '"></input></td>';
                                        } else {                                            
                                            html += '<td style="width:10%; background-color: yellow;"><input id="table_ke_khai_' + i + '_totalProductUsed"></input></td>';
                                        }
                                    } else {
                                        html += '<td style="width:10%;"></td>';
                                    }
                                    
                                    $('#tr-ke-khai').append(html);
                                    
                                } else {
                                    var data = listRequireddata[i];
                                    html2 += '<tr><td style="width:5%;">' + (i + 1) + '</td>';
                                    html2 += '<td style="width:15%;">' + data["certifiedVehicleTypeDescription"] + '</td>';

                                    if(data["testingReportType"] == "01") {
                                        html2 += '<td style="width:30%;">' + data["certificateRecordNo"] + '<br><span style="color: red;">' + data["testingReportTypeDescription"] + '</span></td>';
                                    } else {
                                        html2 += '<td style="width:30%;">' + data["certificateRecordNo"] + '</td>';
                                    }                                    
                                   
                                    html2 += '<td style="width:10%;">' + data["certificateRecordDate"] + '</td>';
                                    html2 += '<td style="width:10%;">' + data["importerQuantity"] + '</td>';
                                    html2 += '<td style="width:10%;">' + data["inuseQuantity"] + '</td>';
                                    html2 += '<td style="width:10%;">' + data["totalNotUsed"] + '</td>';

                                    if(data["testingReportType"] == "01") {
                                        if (data["totalProductUsed"]) {
                                            html2 += '<td style="width:10%; background-color: yellow;"><input id="table_ke_khai_' + i + '_totalProductUsed" value="' + data["totalProductUsed"] + '"></input></td>';
                                        } else {                                            
                                            html2 += '<td style="width:10%; background-color: yellow;"><input id="table_ke_khai_' + i + '_totalProductUsed"></input></td>';
                                        }
                                    } else {
                                        html2 += '<td style="width:10%;"></td>';
                                    }
                                    html2 += '</tr>';
                                    
                                }                             
                            }
                            $('#tr-ke-khai').after(html2);  
                        }

                        $('input[name="quyet_toan"]').click(function(){
                            if (!$('input[name="quyet_toan"]').is(':checked')){
                                $('#div-bang-khai').find('textarea').each(function(){
                                    var name = $(this).attr('name');
                                    var id = $(this).attr('id');

                                    if(name.includes('_chi_tiet_2')){
                                        var gt = JSON.parse($('#' + id).val());
                                        $.each(gt, function(k, v){
                                            if (v.length == 5) {
                                                v.pop();
                                            }
                                        })
                                        $('#' + id).val(JSON.stringify(gt));
                                    } else if(name.includes('_chi_tiet')){
                                        var gt = JSON.parse($('#' + id).val());
                                        $.each(gt, function(k, v){
                                            if (v.length == 5) {
                                                v.pop();
                                            }
                                        })
                                        $('#' + id).val(JSON.stringify(gt));
                                    }
                                });
                            } else {
                                $('#div-bang-khai').find('textarea').each(function(){
                                    var name = $(this).attr('name');
                                    var id = $(this).attr('id');
                                    if(name.includes('_chi_tiet')){
                                        $('#' + id).val([]);
                                    }
                                });
                                $('#div-bang-khai').find('input').each(function(){
                                    var name = $(this).attr('name');
                                    var id = $(this).attr('id');
                                    if(name.includes('_so_luong')){
                                        $('#' + id).val('');
                                    }
                                });
                            }
                            alert('Danh sách xe đã cập nhật lại');
                        });

                        $("#update-row-ke-khai").click(function (events) {
                            if (listKeKhai) {
                                for (var i = 0; i < listKeKhai.length; i++) {
                                    // var idNhanHieu = 'nhanHieu' + i
                                    // var idNoiSanXuat = 'noiSanXuat' + i
                                    // var idSoGCN = 'idSoGCN' + i
                                    // listKeKhai[i]['certifiedTrademarkName'] = $('#' + idNhanHieu).val()
                                    // listKeKhai[i]['productionCountry'] = $('#' + idNoiSanXuat).val()
                                    // if (!listKeKhai[i]['certificateRecordNo']) {
                                    //     listKeKhai[i]['certificateRecordNo'] = $('#' + idSoGCN).val()
                                    // }
                                    if (listKeKhai[i]['testingReportType'] == "01") {
                                        listKeKhai[i]['totalProductUsed'] = parseInt($("#table_ke_khai_" + i + "_totalProductUsed").val());
                                    }
                                }
                            }
                            console.log('listKeKhai==============', listKeKhai)
                            var idKeKhai = $('textarea[name=bang_khai_'+indexRow+'_ke_khai_2]').attr('id');
                            console.log('idKeKhai==============', idKeKhai)
                            $("#" + idKeKhai).val(JSON.stringify(listKeKhai))
                            console.log('getValue==============', $("#formPartNoTP2").alpaca('get').getValue())
                            $("#mymodal-cps-ke-khai").css("display", "none")
                            $('#mymodal-cps').css('display','none');
                        })
                        
                        //$(".hosodoanhnghiep").delegate('table .ke-khai', 'click', function(){
                        $(".hosodoanhnghiep").delegate('table tbody label', 'click', function(){
                            if($(this).text() == 'DS LK') {
                                console.log('dialog!!!!!!!!!!')
                                var indexRowTmp = $(this).parent().parent().attr('data-alpaca-container-item-index');
                                indexRow = parseInt(indexRowTmp)
                                state = 'ke_khai'
                                console.log('indexRow===========', indexRow)
                                id_ = $('textarea[name=bang_khai_'+indexRow+'_chi_tiet]').attr('id');
                                var data = $("#formPartNoTP2").alpaca('get').getValue() || {}

                                console.log('data===========', data)
                                // var dataDsXe = []
                                // if (data['bang_khai'] && data['bang_khai']['length']) {
                                //  dataDsXe = data['bang_khai'][indexRow] ? data['bang_khai'][indexRow]['dsXe'] : []
                                // }
                                if($('#'+id_).val() != 'null' && $('#'+id_).val() != '') {

                                    gt = $('#'+id_).val();
                                } else {
                                    gt = [];
                                }
                                console.log('gt____', gt);
                                var id__ = $(this).parent().find('textarea').attr('name').split('_')[2];
                                var certificateRecordNo = '---';
                                if($('select[name=bang_khai_'+id__+'_certificateId]').val() == '') {

                                } else {
                                   certificateRecordNo = $('select[name=bang_khai_'+id__+'_certificateId] option:selected').text();
                                } 
                                
                                getRequired(certificateRecordNo, function (response) {
                                    genDataTableKeKhaiLK(response/*, hasResponse*/)
                                })
                                $('#mymodal-cps-ke-khai').css('display','block');
                                //modal.style.display = "block";

                                var name = $(this).next().attr('name');
                                indexRow = name.split('_')[2]
                            }
                        });

                        $('.close-cps').click(function(){
                            modal.style.display = "none";
                        });

                        $("#closeDialog,#closeDialogHeader").click(function () {
                            $("#mymodal-cps-ke-khai").css("display", "none")
                            $('#mymodal-cps').css('display','none');
                        });

                        function array_is_unique( array){
                            var flag = 0;
                            for (var i = 0; i < array['length'] - 1; ++i) {
                                for (var j = i + 1; j < array['length']; ++j) {
                                    if (array[i]['so_khung'] == array[j]['so_khung'] || array[i]['so_may'] == array[j]['so_may']) {
                                        flag = 1;
                                        break;
                                    }
                                }
                            }

                            return flag;
                        }
                        
                        $('#update-row').click(function(){
                          var data = $('#my_excel').jexcel('getData');
                            dong = $('#current_row').val();
                            loai = $('#loai_ds').val();
                            console.log('dong============', dong)
                            console.log('loai============', loai)
                            if (state == 'ds_xe') {
                                var checkDate = 0;
                                $(data).each(function(k,v){
                                    var date = v[3];
                                    var compareDate = new Date(date.split('/')[2], date.split('/')[1], date.split('/')[0]);
                                    var currentDate = new Date();

                                    if(compareDate > currentDate){
                                        checkDate = 1;
                                    } else {
                                        
                                    }
                                });

                                if (!data || !data['length'] || (data['length'] == 1 && !data[0][0])) {
                                    alert('Dữ liệu đang bị trống');
                                    return;
                                }
                                
                                if(checkDate == 1) {
                                    alert('Kiểm tra lại ngày xuất xưởng (ngày/tháng/năm)');
                                    return;
                                } else {
                                    if(loai=="1"){
                                        id_ = $('textarea[name=bang_khai_'+dong+'_chi_tiet]').attr('id');
                                        id_2 = $('textarea[name=bang_khai_'+dong+'_chi_tiet_2]').attr('id');
                                        mang=[];
                                        i=0;
                                        $(data).each(function(k,v){
                                            mang[i]={"so_khung": v[0], "so_may": v[1], "mau_son": v[2], "ngay_xuat_xuong": v[3], "so_thung": v[4]}
                                            i++;
                                        });
                                        var flagDuplicate = array_is_unique(mang);
                                        if (flagDuplicate) {
                                            alert('Số khung hoặc số động cơ bị trùng, vui lòng kiểm tra lại!');
                                        } else {
                                            $('#'+id_2).val(JSON.stringify(mang));
                                            $('#'+id_).val(JSON.stringify(data));
                                            $("#soLuongXe").text(data['length'])
                                            $('input[name="bang_khai_'+dong+'_so_luong"]').val(data['length']);
                                        }
                                    }
                                    else if(loai=="2"){
                                        id_ = $('textarea[name=bang_khai_'+dong+'_chi_tiet]').attr('id');
                                        id_2 = $('textarea[name=bang_khai_'+dong+'_chi_tiet_2]').attr('id');
                                        mang=[];
                                        i=0;
                                        $(data).each(function(k,v){
                                            mang[i]={"so_khung": v[0], "so_may": v[1], "mau_son": v[2], "ngay_xuat_xuong": v[3], "so_seri": v[4], "so_thung": v[5]}
                                            i++;
                                        });
                                        var flagDuplicate = array_is_unique(mang);
                                        if (flagDuplicate) {
                                            alert('Số khung hoặc số động cơ bị trùng, vui lòng kiểm tra lại!');
                                        } else {
                                            $('#'+id_2).val(JSON.stringify(mang));
                                            $('#'+id_).val(JSON.stringify(data));
                                            $("#soLuongXe").text(data['length'])
                                            $('input[name="bang_khai_'+dong+'_so_luong"]').val(data['length']);
                                        }
                                    }
                                }
                            }

                            modal.style.display = "none";
                            // if (state == 'ds_xe') {
                            //  if(loai=="1"){
                                
                            //  mang=[];
                            //  i=0;
                            //  $(data).each(function(k,v){
                            //      mang[i]={"so_khung": v[0], "so_may": v[1], "mau_son": v[2], "so_seri": v[3]}
                            //      i++;
                            //  });
                            //  // if (indexRow > -1) {
                            //  //  var data = $("#formPartNoTP2").alpaca('get').getValue() || {}
                            //  //  data['bang_khai'][indexRow]['dsXe'] = mang
                            //  //  $("#formPartNoTP2").alpaca('get').setValue(data)
                            //  // } 
                            //  $('#danh_sach_cap_doi_2').val(JSON.stringify(mang));
                            //  $('#danh_sach_cap_doi').val(JSON.stringify(data));
                            //  $("#soLuongXe").text(data['length'])
                            //  $('input[name="bang_khai_'+dong+'_so_luong"]').val(data['length']);
                            // }else
                            //  if(loai=="2"){
                            //      id_ = $('textarea[name=bang_khai_'+dong+'_chi_tiet]').attr('id');
                            //      id_2 = $('textarea[name=bang_khai_'+dong+'_chi_tiet_2]').attr('id');
                            //      mang=[];
                            //      i=0;
                            //      $(data).each(function(k,v){
                            //          mang[i]={"so_khung": v[0], "so_may": v[1], "mau_son": v[2], "so_seri": v[3]}
                            //          i++;
                            //      });
                            //      // if (indexRow > -1) {
                            //      //  var data = $("#formPartNoTP2").alpaca('get').getValue() || {}
                            //      //  data['bang_khai'][indexRow]['dsXe'] = mang
                            //      //  $("#formPartNoTP2").alpaca('get').setValue(data)
                            //      // } 
                            //      $('#'+id_2).val(JSON.stringify(mang));
                            //      $('#'+id_).val(JSON.stringify(data));
                            //      $("#soLuongXe").text(data['length'])
                            //      $('input[name="bang_khai_'+dong+'_so_luong"]').val(data['length']);
                            //  }else{
                            //      id_ = $('textarea[name=bang_khai_'+dong+'_chi_tiet]').attr('id');
                            //      id_2 = $('textarea[name=bang_khai_'+dong+'_chi_tiet_2]').attr('id');
                            //      mang=[];
                            //      i=0;
                            //      $(data).each(function(k,v){
                            //          mang[i]={"so_khung": v[0], "so_may": v[1], "mau_son": v[2]}
                            //          i++;
                            //      });
                            //      // if (indexRow > -1) {
                            //      //  var data = $("#formPartNoTP2").alpaca('get').getValue() || {}
                            //      //  data['bang_khai'][indexRow]['dsXe'] = mang
                            //      //  $("#formPartNoTP2").alpaca('get').setValue(data)
                            //      // } 
                            //      $('#'+id_2).val(JSON.stringify(mang));
                            //      $('#'+id_).val(JSON.stringify(data));
                            //      $("#soLuongXe").text(data['length'])
                            //      $('input[name="bang_khai_'+dong+'_so_luong"]').val(data['length']);
                            //  }
                            // } else {

                            // }
                        });

                        $('.hosodoanhnghiep').delegate('select','click',function () {
                            $(this).addClass('my-select');
                            $(this).select2();
                        });

                        var gcn;
                        var getGCN = function(so_gcn_, callback) {
                            // "expiredStatus": 1
                            //certifiedassemblytype = $('#loai_hinh_san_xuat').val();
                            circularCode = $('#can_cu').val();
                            $.ajax({
                                headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                data: {
                                    "applicantIdNo": maso_taikhoan,
                                    "vehicleClass": "XCG",
                                    "expiredStatus": 1,
                                    "certificateRecordNo": so_gcn_,
                                    "serviceCode": "'TT302011BGTVTCNCLKLTXXCG'",
                                    "module": 3,
                                    "certifiedassemblytype": "",
                                    "circularCode": circularCode
                                },
                                type: 'GET',
                                async: false,
                                dataType: 'json',
                                url: '/o/rest/vr-app/certificate/vehicleClass',
                                success: function(response) {
                                    callback(response);
                                    // if (response['data'] && response['data']['length']) {
                                    //     gcn = response['data'][0];
                                    // }
                                }
                            });
                        }

                        // $('#div-bang-khai').delegate('.chi-tiet-phuong-tien label', 'click', function () {
                        //  // dialog
                        //  $('#mymodal-cps').css('display','block');
                        // });
                        // 
                        // <button id='bt-cap-doi' type='button' >Danh sách cấp đổi</button>

                        // $('#loai_hinh_san_xuat').change(function () {
                        //     //$('.certificate-class').find('select').change();
                        //     $('#loai_hinh_san_xuat_text').val($('#loai_hinh_san_xuat option:selected').text());
                        //     $('#div-bang-khai').find('select').each(function(){
                        //         $(this).find('option').remove().end();
                        //         $(this).append(new Option('Chọn ...', ''));
                        //         var id = $(this).attr('id');
                        //         var name = $(this).attr('name');
                        //         var name2 = name.replace('certificateId', 'so_gcn');
                        //         var id2 = $("*[name='" + name2 + "']").attr('id');
                        //         var gcn = '';
                        //         getGCN('', function(res){
                        //             if (res && res['data'] && res['data']['length']) {
                        //                 $.each(res['data'], function(k, v){
                        //                     $('#' + id).append(new Option(v['certificateRecordNo'], v['certificateId']));
                        //                     if(v['certificateRecordNo'] == $('#' + id2).val()){
                        //                         gcn = v['certificateId'];
                        //                     }
                        //                 });
                        //                 if(fileEntryId != 0) {
                        //                     $('#' + id).val(gcn).change();
                        //                 }
                        //             }
                        //         });
                        //     });
                        // });

                        $('#can_cu').change(function () {
                            $('#div-bang-khai').find('select').each(function(){
                                $(this).find('option').remove().end();
                                $(this).append(new Option('Chọn ...', ''));
                                var id = $(this).attr('id');
                                var name = $(this).attr('name');
                                var name2 = name.replace('certificateId', 'so_gcn');
                                var id2 = $("*[name='" + name2 + "']").attr('id');
                                var gcn = '';
                                getGCN('', function(res){
                                    if (res && res['data'] && res['data']['length']) {
                                        $.each(res['data'], function(k, v){
                                            $('#' + id).append(new Option(v['certificateRecordNo'], v['id']));
                                            if(v['certificateRecordNo'] == $('#' + id2).val()){
                                                gcn = v['id'];
                                            }
                                        });
                                        if(fileEntryId != 0) {
                                            $('#' + id).val(gcn).change();
                                        }
                                    }
                                });
                            });

                            if ($(this).val() == '') {
                                $('#can_cu_text').val('');
                            } else {
                                $('#can_cu_text').val($('#can_cu option:selected').text());
                            }
                        });

                        $('#div-bang-khai').delegate('.certificate-class select','change',function(){
                            id_= $(this).attr('id');
                            var vt_dong = 0
                            $('input[name="bang_khai_'+vt_dong+'_so_gcn"]').focus();
                            gt = $('#'+id_+' option:selected').text();
                            console.log('vt_dong===========', vt_dong)
                            ten = $(this).attr("name");
                            m = ten.split('_certificateId');
                            m2 = m[0].split('_');
                            vt_dong = m2[m2.length-1];
                            console.log('___', vt_dong);
                            console.log('_gt__', gt);
                            $('input[name="bang_khai_'+vt_dong+'_so_gcn"]').val($(this).find(":selected").text());
                            console.log('_selected__', $(this).find(":selected").text());
                            
                            getGCN(gt,function(res){
                                 console.log('___res____', res);
                                 console.log('____res[data]___', res['data']);
                                 console.log('____res[length]___', res['data']['length']);
                                if (res && res['data'] && res['data']['length']) {
                                    $.each(res['data'], function(k, v){
                                        if(gt == v['certificateRecordNo']) {
                                            console.log('_v__' + vt_dong + '___' +v['certificateRecordNo']);
                                            dossierIdGCN = v['dossierId'] || 0
                                            $('input[name="bang_khai_'+vt_dong+'_nhan_hieu"]').val(v['certifiedTrademarkName']);
                                            $('input[name="bang_khai_'+vt_dong+'_ten_thuong_mai"]').val(v['certifiedCommercialName']);
                                            $('input[name="bang_khai_'+vt_dong+'_ma_kieu_loai"]').val(v['certifiedModelCode']);
                                            $('input[name="bang_khai_'+vt_dong+'_loai_hinh_lap_rap"]').val(v['vehicleClass']);
                                            $('input[name="bang_khai_'+vt_dong+'_xuat_xu"]').val(v['productionCountry']);
                                            $('input[name="bang_khai_'+vt_dong+'_loai_phuong_tien"]').val(v['certifiedVehicleTypeDescription']);
                                            $('input[name="bang_khai_'+vt_dong+'_ngay_cap"]').val(v['certificateRecordDate']);
                                            $('input[name="bang_khai_'+vt_dong+'_gcn_id"]').val(v['id']);
                                            $('input[name="bang_khai_'+vt_dong+'_ten_doanh_nghiep"]').val(v['applicantName']);
                                            $('input[name="bang_khai_'+vt_dong+'_so_ho_so"]').val(v['dossierNo']);
                                            $('input[name="bang_khai_'+vt_dong+'_loai_san_pham"]').val(v['certifiedVehicleTypeDescription']);
                                            $('input[name="bang_khai_'+vt_dong+'_loai_hinh_lap_rap_text"]').val(v['certifiedAssemblyTypeDescription']);
                                            $('input[name="bang_khai_'+vt_dong+'_so_gcn"]').val(v['certificateRecordNo']);
                                            $('input[name="bang_khai_'+vt_dong+'_ngay_gcn"]').val(v['certificateRecordDate']);
                                            $('input[name="bang_khai_'+vt_dong+'_nguoi_dai_dien"]').val(v['applicantContactName']);
                                            $('input[name="bang_khai_'+vt_dong+'_so_dien_thoai_nguoi_lien_he"]').val(v['applicantContactTelNo']);
                                            $('input[name="bang_khai_'+vt_dong+'_phuong_thuc_cap"]').val($('#phuong_thuc_cap').val());
                                            $('input[name="bang_khai_'+vt_dong+'_phuong_thuc_cap_text"]').val($('#phuong_thuc_cap_text').val());
                                            $('input[name="bang_khai_'+vt_dong+'_ngay_hieu_luc"]').val(v['certificateRecordExpireDate']);
                                            $('input[name="bang_khai_'+vt_dong+'_loai_an_chi_text"]').val($('#loai_an_chi_text').val());
                                            $('input[name="bang_khai_'+vt_dong+'_dia_diem_nhan_phieu_text"]').val($('#dia_diem_nhan_phieu_text').val());
                                            $('#nguoi_dai_dien').val(v['applicantContactName']);
                                            $('#so_dien_thoai_nguoi_lien_he').val(v['applicantContactTelNo']);
                                            // $('input[name="bang_khai_'+vt_dong+'_nhan_hieu"]').prop('disabled', true);
                                            // $('input[name="bang_khai_'+vt_dong+'_ten_thuong_mai"]').prop('disabled', true);
                                            // $('input[name="bang_khai_'+vt_dong+'_ma_kieu_loai"]').prop('disabled', true);
                                        }
                                    });
                                }
                                // $.each(res, function(key, obj){
                                //      if(key == 'data'){
                                //          console.log('___res', res);
                                //          $.each (obj, function(k,v){
                                //              $('input[name="bang_khai_'+vt_dong+'_nhan_hieu"]').val(v['certifiedTrademarkName']);
                                //              $('input[name="bang_khai_'+vt_dong+'_ten_thuong_mai"]').val(v['certifiedCommercialName']);
                                //              $('input[name="bang_khai_'+vt_dong+'_ma_kieu_loai"]').val(v['certifiedModelCode']);
                                //              $('input[name="bang_khai_'+vt_dong+'_nhan_hieu"]').prop('disabled', true);
                                //              $('input[name="bang_khai_'+vt_dong+'_ten_thuong_mai"]').prop('disabled', true);
                                //              $('input[name="bang_khai_'+vt_dong+'_ma_kieu_loai"]').prop('disabled', true);
                                //          });
                                //      }
                                //  });
                            });
                            $('input[name="bang_khai_'+vt_dong+'_so_gcn"]').blur();
                        });
                        
                        $('#div-bang-khai').delegate('.number-class input','click', function () {
                            
                            $(this).keypress(function (e){
                              var charCode = (e.which) ? e.which : e.keyCode;
                              if (charCode > 31 && (charCode < 48 || charCode > 57)) {
                                return false;
                              }
                            });
                        });

                        var setThamChieu = function(VR_Issue_Vehiclecertificate, VR_Issue){
                            //var data = $("#formPartNoTP2").alpaca('get').getValue();

                            $('#ten_doanh_nghiep').val(VR_Issue.applicantName);
                            $('#dia_chi').val(VR_Issue.applicantAddress);
                            $('#ten_nha_xuong').val(VR_Issue.productionPlantCode).change();
                            $('#ten_nha_xuong_text').val(VR_Issue.productionPlantName);
                            $('#dia_chi_nha_xuong').val(VR_Issue.productionPlantAddress);
                            $('#can_cu').val(VR_Issue.circularCode).change();
                            $('#can_cu_text').val(VR_Issue.circularDescription);
                            $('#phuong_thuc_cap').val(40).change();
                            $('#phuong_thuc_cap_text').val("Đề nghị quyết toán");
                            //$('#hinh_thuc_cap').val(1).change();
                            //$('#hinh_thuc_cap_text').val("Cấp mới lần đầu");
                            setHTC(40);

                            var bang = [];
                            $.each(VR_Issue_Vehiclecertificate, function(k, v){
                               // var obj = {};
                               // obj['so_gcn'] = v['certificateRecordNo'];
                               // obj['ngay_cap'] = v['certificateRecordDate'];
                               // obj['nhan_hieu'] = v['certifiedTrademarkName'];
                               // obj['ten_thuong_mai'] = v['certifiedCommercialName'];
                               // obj['gia_ban'] = v['vehiclePrice'];
                               // obj['so_luong_pxx'] = v['totalProduct'];
                               // obj['so_luong'] = v['totalQuantity'];
                               // obj['ma_kieu_loai'] = v['certifiedModelCode'];
                               // obj['loai_hinh_lap_rap'] = v['vehicleClass'];
                               // obj['xuat_xu'] = v['productionCountry'];
                               // obj['loai_phuong_tien'] = v['certifiedVehicleTypeDescription'];
                               // obj['gcn_id'] = v['certificateRecordNo'];
                               // obj['ten_doanh_nghiep'] = v['applicantName'];
                               // obj['so_ho_so'] = v['dossierNo'];
                               // obj['loai_san_pham'] = v['certifiedVehicleTypeDescription'];
                               // obj['loai_hinh_lap_rap_text'] = v['certifiedAssemblyTypeDescription'];
                               // obj['so_gcn'] = v['certificateRecordNo'];
                               // obj['ngay_gcn'] = v['certificateRecordDate'];
                               // obj['nguoi_dai_dien'] = v['applicantContactName'];
                               // obj['so_dien_thoai_nguoi_lien_he'] = v['applicantContactTelNo'];

                               // bang.push(obj);

                               $('select[name="bang_khai_'+k+'_certificateId"]').val(v['certificateId']).change();

                            });
                        }

                        $('#get-tham-chieu').click(function(){
                            var dossierIdCTN = $('#so_ho_so').val();

                            if(dossierIdCTN || dossierIdCTN != '' || dossierIdCTN != ' ' || dossierIdCTN != null){
                                $.ajax({
                                    headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                    data: {},
                                    type: 'GET',
                                    async: false,
                                    dataType: 'json',
                                    url: '/o/rest/vr-app/vehicle/vrissuevehicle/getGCN?dossierNo=' + dossierIdCTN,
                                    success: function(response) {
                                        var VR_Issue_Vehiclecertificate = response.VR_Issue_Vehiclecertificate;
                                        var VR_Issue = response.VR_Issue;

                                        setThamChieu(VR_Issue_Vehiclecertificate, VR_Issue);
                                    }
                                });
                            }
                        });
                        
                        var postData = function (vr_issue) {                          

                            var data = $("#formPartNoTP2").alpaca('get').getValue().bang_khai;
                            var totalInDocument = 0;

                            if($('#phuong_thuc_cap').val() == "10"){
                                totalInDocument = $('#so_luong').val();
                            } else {
                                $.each(data, function(k, v){
                                    totalInDocument += parseInt(v['so_luong']);
                                });                                                               
                            }

                            $(list_ttnx.data).each(function(k,v){
                                if(v['productionPlantCode'] == $('#ten_nha_xuong').val()){
                                    productionPlantId = v['id'];
                                }
                            });

                            var vr_issue = Object.assign(vr_issue, applicantProfile, {
                                mtCore: 1,
                                dossierId: $('#dossierId').val(),
                                appliedDate: '',
                                approvedDate: '',
                                vehicleClass: 'XCG',
                                certificateAssemblyType: $('#loai_hinh_san_xuat').val(),
                                //certificateAssemblyDescription: $('#loai_hinh_san_xuat option:selected').text(),
                                certificateAssemblyDescription: '',
                                applicantProfileId: applicantProfile['id'],
                                issueType: $('#hinh_thuc_cap').val(),
                                methodOfIssue: $('#phuong_thuc_cap').val(),
                                totalInDocument: totalInDocument,
                                dossierIdCTN: $('#dossierIdCTN').val(),
                                applicantIdNo: $('#applicantIdNo').val(),
                                circularCode: $('#can_cu').val(),
                                circularDescription: $('#can_cu option:selected').text(),
                                productionPlantId: productionPlantId,
                                productionPlantCode: $('#ten_nha_xuong').val(),
                                productionPlantAddress: $('#dia_chi_nha_xuong').val(),
                                productionPlantName: $('#ten_nha_xuong option:selected').text(),
                                issueCorporationId: $('#dia_diem_nhan_phieu').val(),
                                inspectionProvinceCode: applicantProfile['productionPlantProvinceCode'],
                                inspectionProvinceName: applicantProfile['productionPlantProvinceName'],
                                stampIssueNo: $('#so_ho_so').val()
                            })
                            var vr_Issue_VehicleCertificate = []
                            var vr_VehicleRecord = []
                            var vr_Issue_EquipmentCertificate = []
                            var data = $("#formPartNoTP2").alpaca('get').getValue()

                            if (data && data['bang_khai'] && data['bang_khai']['length']) {
                                for (var i = 0; i < data['bang_khai'].length; i++) {
                                    vr_VehicleRecord = []
                                    vr_Issue_EquipmentCertificate = []
                                    var tmp = data['bang_khai'][i]
                                    var totalXe = 0
                                    if (tmp['chi_tiet'] && tmp['chi_tiet']['length']) {
                                        totalXe = tmp['chi_tiet']['length']
                                    }
                                    let tmpVr_Issue_VehicleCertificate = {
                                        mtCore: 1,
                                        issueId: vr_issue['id'],
                                        dossierId: $('#dossierId').val(),
                                        dossierIdCTN: $('#dossierIdCTN').val(),
                                        certificateId: tmp['certificateId'],
                                        vehiclePrice: tmp['gia_ban'],
                                        totalProduct: totalXe,
                                        certificateRecordNo: tmp['so_gcn'],
                                        certificateRecordDate: tmp['ngay_cap']
                                    }
                                    if (tmp && tmp['chi_tiet_2']) {
                                        for (var j = 0; j < tmp['chi_tiet_2'].length; j++) {
                                            var tmpXe =  tmp['chi_tiet_2'][j]
                                            vr_VehicleRecord.push({
                                                mtCore: 1,
                                                issueId: vr_issue['id'],
                                                dossierId: $('#dossierId').val(),
                                                applicantProfileId: applicantProfile['id'],
                                                applicantName: applicantProfile['applicantName'],
                                                applicantAddress: applicantProfile['applicantAddress'],
                                                certificateId: tmp['certificateId'],
                                                certificateRecordNo: tmp['so_gcn'],
                                                certificateRecordDate: tmp['ngay_cap'],
                                                frameNo: tmpXe['so_khung'],
                                                boxNo: tmpXe['so_thung'],
                                                engineNo: tmpXe['so_may'],
                                                color: tmpXe['mau_son'],
                                                serialNo: tmp['so_seri'],
                                                productionDate: tmpXe['ngay_xuat_xuong'],
                                                certificateId: tmp['certificateId']
                                            })
                                        }
                                    }
                                    if (tmp && tmp['ke_khai_2']) {
                                        for (var k = 0; k < tmp['ke_khai_2'].length; k++) {
                                            var tmpKiemKe =  tmp['ke_khai_2'][k]
                                            vr_Issue_EquipmentCertificate.push({
                                                mtCore: 1,
                                                issueId: vr_issue['id'],
                                                issueVehicleCertificateId: '',
                                                vehicleCertificateRecordNo: tmpKiemKe['certificateRecordNo'],
                                                vehicleCertificateRecordDate: tmpKiemKe['ngay_cap'],
                                                equipmentName: tmpKiemKe['equipmentName'],
                                                equipmentType: 1,
                                                equipmentCertificateType: $('#loai_hinh_san_xuat').val(),
                                                equipmentCertificateRecordNo: tmpKiemKe['equipmentCertificateRecordNo'],
                                                equipmentCertificateRecordDate: tmpKiemKe['equipmentCertificateRecordDate'],
                                                applicantNo: applicantProfile['applicantCode'],
                                                applicantName: applicantProfile['applicantName'],
                                                applicantAddress: applicantProfile['applicantAddress'],
                                                productionPlantName: applicantProfile['productionPlantName'],
                                                productionPlantAddress: applicantProfile['productionPlantAddress'],
                                                certificateId: tmpKiemKe['certificateId'],
                                                importerQuantity: tmpKiemKe['importerQuantity'],
                                                inuseQuantity: tmpKiemKe['inuseQuantity'],
                                                totalNotUsed: tmpKiemKe['totalNotUsed'],
                                                totalProductUsed: tmpKiemKe['totalProductUsed'],
                                                testingReportType: tmpKiemKe['testingReportType'],
                                                testingReportTypeDescription: tmpKiemKe['testingReportTypeDescription']
                                            })
                                        }
                                    }
                                    tmpVr_Issue_VehicleCertificate['vr_VehicleRecord'] = vr_VehicleRecord
                                    tmpVr_Issue_VehicleCertificate['vr_Issue_EquipmentCertificate'] = vr_Issue_EquipmentCertificate
                                    vr_Issue_VehicleCertificate.push(tmpVr_Issue_VehicleCertificate)
                                }
                            }
                            vr_issue['vr_Issue_VehicleCertificate'] = vr_Issue_VehicleCertificate
                            console.log('vr_issue==============', vr_issue);
                            console.log('applicantProfile==============', applicantProfile);
                            console.log('vr_Issue_VehicleCertificate==============', vr_Issue_VehicleCertificate);
                            console.log('vr_VehicleRecord==============', vr_VehicleRecord);
                            $.ajax({
                                headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                data: JSON.stringify({
                                    "indice":"vr_Issue",
                                    "body": {
                                        "vr_Issue": vr_issue
                                    }
                                }),
                                async: false,
                                type: 'POST',
                                processData: false,
                                'contentType': 'application/json',
                                url: '/o/rest/vr-app/post',
                                success: function (response) {
                                    // var data = $("#formPartNoTP2").alpaca('get').getValue()
                                    // if (response && response['data'] && response['data']['vr_Issue']) {
                                    //  data = Object.assign(data, response['data']['vr_Issue'])
                                    //  $("#formPartNoTP2").alpaca('get').setValue(data)
                                    //  var referentUid = $("#btn-save-formalpacaTP2").attr("referenceUid");
                                    //  var dossierId = $("#dossierId").val();
                                    //  console.log("referentUid===========", referentUid);
                                    //  if (referentUid) {
                                    //      $.ajax({
                                    //          url : "/o/rest/v2/dossiers/" + dossierId + "/files/" + referentUid + "/formdata",
                                    //          dataType : "json",
                                    //          type : "PUT",
                                    //          headers: {
                                    //              "groupId": Liferay.ThemeDisplay.getScopeGroupId(),
                                    //              Accept : "application/json"
                                    //          },
                                    //          data : {
                                    //              formdata: JSON.stringify(data)
                                    //          },
                                    //          success : function (result) {
                                    //              if (result && result['status']) {
                                    //                  if (result['status']['code'] == 505) {
                                    //                      notification.show({
                                    //                          message: "Trùng số khung, số động cơ, vui lòng kiểm tra lại!"
                                    //                      }, "error");
                                    //                  } else if (result['status']['code'] == 506) {
                                    //                      notification.show({
                                    //                          message: "Xe không tồn tại, vui lòng kiểm tra lại!"
                                    //                      }, "error");
                                    //                  } else if (result['status']['code'] == 507) {
                                    //                      notification.show({
                                    //                          message: "Phiếu không tồn tại, vui lòng kiểm tra lại!"
                                    //                      }, "error");
                                    //                  }
                                    //              }
                                                    
                                    //          },
                                    //          error : function (result) {
                                    //              notification.show({
                                    //                  message: result
                                    //              }, "error");
                                    //          }
                                    //      });
                                    //  }
                                    // }
                                }
                            });
                        }

                        if(dossierIdDnQuyetToan == '0' || dossierIdDnQuyetToan == undefined || dossierIdDnQuyetToan == '' || dossierIdDnQuyetToan == null || !dossierIdDnQuyetToan){
                            
                        } else {
                            if (fileEntryId == 0) {
                                $.ajax({
                                    headers: {
                                        "groupId": Liferay.ThemeDisplay.getScopeGroupId()
                                    },
                                    data: "",
                                    type: 'get',
                                    async: false,
                                    dataType: 'json',
                                    url: '/o/rest/v2/dossiers/' + dossierIdDnQuyetToan + '/files',
                                    success: function(response) {
                                        var data = response.data;
                                        $.each(data, function(k, v) {
                                            if (v.dossierPartNo == 'TP2') {
                                                jsonCurrent = JSON.parse(v.formData.replace(/[\u0000-\u0019]+/g, ""));
                                                jsonCurrent.phuong_thuc_cap_text = '   Đề nghị quyết toán';
                                                var control = $("#formPartNoTP2").alpaca('get');
                                                control.setValue(jsonCurrent);

                                                $('#can_cu').val(jsonCurrent['can_cu']).change();
                                                $('#phuong_thuc_cap').val("40").change();
                                                $('#phuong_thuc_cap_text').val("   Đề nghị quyết toán");
                                                $('#loai_an_chi').val(jsonCurrent['loai_an_chi']).change();
                                                setHTC(40);

                                                $.each(jsonCurrent.bang_khai, function(k, v){
                                                    $('select[name="bang_khai_'+k+'_certificateId"]').val(v['certificateId']).change();
                                                    $('input[name="bang_khai_'+k+'_phuong_thuc_cap_text"]').val("   Đề nghị quyết toán");
                                                });

                                                $.ajax({
                                                    headers: {
                                                        "groupId": Liferay.ThemeDisplay.getScopeGroupId()
                                                    },
                                                    data: "",
                                                    type: 'get',
                                                    dataType: 'json',
                                                    url: '/o/rest/v2/dossiers/' + dossierIdDnQuyetToan,
                                                    success: function(response) {
                                                        $('#so_ho_so').val(response.dossierNo);
                                                        setTimeout(function(){
                                                            changeptc($('#phuong_thuc_cap').val());
                                                            console.log('fffff');
                                                        }, 3000);
                                                    }
                                                });
                                            }
                                        });
                                    }
                                });
                            }
                        }

                        changeptc($('#phuong_thuc_cap').val());

                        $('#btn-save-formalpacaTP2').click(function () {
                            if($('#hinh_thuc_cap').val () == '') {
                                alert('Chưa chọn hình thức cấp phiếu!');
                            } else {
                                if($('#ten_nha_xuong').val() == '') {
                                    alert('Chưa chọn nhà máy sản xuất!');
                                }
                                
                                $.ajax({
                                    headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                    data: {
                                        "productionPlantCode": applicantProfile["productionPlantCode"],
                                        "productionPlantStatus": applicantProfile["productionPlantStatus"],
                                        "applicantProfileId": applicantProfile["id"],
                                        "applicantLock": applicantProfile["applicantLock"],
                                        "vehicleClass": $("#loai_an_chi").val(),
                                        "circularCode": $("#can_cu").val()
                                    },
                                    type: 'GET',
                                    async: false,
                                    dataType: 'json',
                                    url: '/o/rest/vr-app/methodofissue',
                                    success: function(response) {
                                        if (applicantProfile["productionPlantStatus"] == "2" || applicantProfile["applicantLock"] == "1" || response.total == 0) {
                                            alert("Cơ quan quản lý chưa cập nhật phương thức cấp phiếu\nNhà xưởng hoặc Cơ sở sản xuất bị khóa");
                                        }
                                    }
                                });  

                                var data = $("#formPartNoTP2").alpaca('get').getValue();
                                var totalInDocument = 0;

                                $.each(data.bang_khai, function(k, v){
                                    v['dia_diem_nhan_phieu_text'] =  $('#dia_diem_nhan_phieu_text').val();
                                    v['loai_an_chi_text'] =  $('#loai_an_chi_text').val();
                                }); 

                                if($('#phuong_thuc_cap').val() == "10"){
                                    totalInDocument = $('#so_luong').val();
                                } else {
                                    $.each(data.bang_khai, function(k, v){
                                        totalInDocument += parseInt(v['so_luong']);
                                        v['certificateId'] =  $('input[name="bang_khai_'+k+'_gcn_id"]').val();
                                    });                                                              
                                }
                                data['so_luong'] = totalInDocument;
                                var issueId = data['issueId'] || 0
                                if (issueId) {
                                    $.ajax({
                                        headers: {"groupId": Liferay.ThemeDisplay.getScopeGroupId()},
                                        data: {
                                        },
                                        type: 'GET',
                                        dataType: 'json',
                                        url: '/o/rest/vr-app/issue/' + issueId,
                                        success: function(response) {
                                            let dataTmp = response || {}
                                            postData(dataTmp)
                                        }
                                    });
                                } else {
                                    postData({})
                                }
                                checkDupCer();

                                var jsonData = {};
                                var controll = $('#formPartNo' + var_partNo).alpaca('get').children;

                                $.each(controll, function(k, v) {
                                    var element = $(this)[0];
                                    if (element.data == null || element.data == '') {
                                        if ($('#' + element.id).val() == null || $('#' + element.id).val() == '') {
                                            jsonData[element.id] = "";
                                        } else {
                                            jsonData[element.id] = $('#' + element.id).val();
                                        }
                                        if (element.id == 'bang_trung'){
                                            console.log('bang_trung___', bang_trung);
                                            jsonData[element.id] = bang_trung;
                                        }
                                    } else {
                                        if (element.id == 'bang_khai'){
                                            // var data2 = data.bang_khai;
                                            // $.each(data2, function(k, v){
                                            //     if(data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1].length == 5 && (data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1][4] == " " || data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1][4] == "\u0000")){
                                            //         data2[k]['chi_tiet'][data2[k]['chi_tiet'].length - 1][4] == "";
                                            //     }
                                            //     if(data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1].length == 5 && (data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1]['so_seri'] == " " || data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1]['so_seri'] == "\u0000")){
                                            //         data2[k]['chi_tiet_2'][data2[k]['chi_tiet_2'].length - 1]['so_seri'] == "";
                                            //     }
                                            // });
                                            // jsonData[element.id] = data2;
                                            jsonData[element.id] = data.bang_khai;
                                        } else if (element.id == 'bang_trung'){
                                            console.log('bang_trung___', bang_trung);
                                            jsonData[element.id] = bang_trung;
                                        } else {
                                            jsonData[element.id] = element.data;
                                        }
                                    }
                                });
                                jsonData['so_luong'] = totalInDocument;

                                if(dossierIdDnQuyetToan == '0' || dossierIdDnQuyetToan == undefined || dossierIdDnQuyetToan == '' || dossierIdDnQuyetToan == null || !dossierIdDnQuyetToan){
                                    
                                } else {
                                    jsonData['dossierIdDnQuyetToan'] = dossierIdDnQuyetToan;
                                }

                                console.log('jsonData___', JSON.stringify(jsonData));
                                console.log(jsonData);
                                fnSaveForm(var_partNo, jsonData);
                            }
                        })
                        /*<div class='lv-object' id='div-so-luong' style='width: 60%; float: left;'>  <div class='lv-content'> <label class='content-label'>5. Số lượng</label> <div class='content-object' id='column-so_luong'></div></div></div>*/
                    }
                }
            }
        }
    },
    "view": {
        "layout": {
            "template": "<div class='row-fluid hosodoanhnghiep'> <style> .jexcel {width: 100%} .jexcel>tbody>tr, .jexcel>thead>tr {display: table-row!important} .hosodoanhnghiep .select2{width: 100%!important} .hosodoanhnghiep #div-bang th:nth-child(1) { width: 20%; } .hosodoanhnghiep #div-bang td:nth-child(1) { width: 20%;  } .hosodoanhnghiep #div-bang th:nth-child(2) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(2) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(8) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(8) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(9) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(9) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(10) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(10) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(11) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(11) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(13) { width: 8%; } .hosodoanhnghiep #div-bang td:nth-child(13) { width: 8%; } .hosodoanhnghiep #div-bang th:nth-child(7) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(7) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(14) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(14) { display: none; }  .hosodoanhnghiep #div-bang th:nth-child(15) { width: 8%; } .hosodoanhnghiep #div-bang td:nth-child(15) { width: 8%; } .hosodoanhnghiep #div-bang th:nth-child(16) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(16) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(17) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(17) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(18) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(18) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(19) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(19) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(20) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(20) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(21) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(21) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(22) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(22) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(23) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(23) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(24) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(24) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(25) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(25) { display: none; }.hosodoanhnghiep #div-bang th:nth-child(26) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(26) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(27) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(27) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(28) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(28) { display: none; } .hosodoanhnghiep #div-bang th:nth-child(29) { display: none; } .hosodoanhnghiep #div-bang td:nth-child(29) { display: none; } .hosodoanhnghiep .table-cap-tam th:nth-child(14) { display: none; } .hosodoanhnghiep .table-cap-tam td:nth-child(14) { display: none; } .hosodoanhnghiep textarea { display: none; } .hosodoanhnghiep table th[data-header-id='chi_tiet'] { width: 65px; } .hosodoanhnghiep table .checkbox label { display: block !important; } .hosodoanhnghiep table .alpaca-field-json label { display: block !important; } .hosodoanhnghiep button[data-alpaca-array-actionbar-action=up], .hosodoanhnghiep button[data-alpaca-array-actionbar-action=down] { display: none; } .hosodoanhnghiep .eq-height { display: flex; display: -webkit-flex; } .hosodoanhnghiep input { width: 100% !important; margin-left: 0; } .hosodoanhnghiep .lv-title { font-weight: bold; padding: 4px 10px 4px 10px; background: #645d7f; color: white; } .hosodoanhnghiep .lv-content {display: flex; align-items: center; margin-bottom: 10px;} .hosodoanhnghiep .lv-content .alpaca-layout-binding-holder, .hosodoanhnghiep .lv-content .form-group {margin-bottom: 0;} .hosodoanhnghiep .lv-content .content-label {flex-shrink: 0; margin-right: 10px; margin-bottom: 0;} .hosodoanhnghiep .lv-content .content-object {width: 100%;} .hosodoanhnghiep .lv-content input[type='text'] {border: 0; border-bottom: 1px solid #ccc; border-radius: 0; height: 30px} .hosodoanhnghiep .lv-content-left-50 { width: 40%; float: left; } .hosodoanhnghiep .lv-content-right-50 { width: 40%; float: right; } .hosodoanhnghiep .lv-content-left-30 { width: 30%; float: left; } .hosodoanhnghiep .lv-content-right-30 { width: 30%; float: right; } .modal-cps { display: none; position: fixed; z-index: 1; left: 0; top: 0; width: 100%; height: 100%; overflow: auto; background-color: rgb(0, 0, 0); background-color: rgba(0, 0, 0, 0.56); } .modal-cps-content { background-color: #fefefe; margin: 5% auto; padding: 20px; border: 1px solid #888; width: 85%; } .close { color: #aaa; float: right; font-size: 28px; font-weight: bold; } .close:hover, .close:focus { color: black; text-decoration: none; cursor: pointer; } .navigation-drawer { z-index: 1 !important; } #column-hinh_thuc_cap .select2 { width: 100%!important } div.number-class input { padding-right: 10px !important; text-align: right; } div.center-class input, label { text-align: center; }  #table-ke-khai td{border: 1px solid black; height: 30px!important; text-align: center; padding: 5px;}</style> <div style='display:none;' id='column-hidden'></div><div id='column-formType_hidden'></div> <div class='lv-object'> <div class='lv-content'> <label class='content-label'>1. Thông tin về cơ sở sản xuất, lắp ráp</label> <div class='content-object' id='column-ten_doanh_nghiep'></div> </div> </div> <div class='lv-object'> <div class='lv-content'> <label class='content-label'>2. Địa chỉ</label> <div class='content-object' id='column-dia_chi'></div> </div> </div> <div class='lv-object'> <div class='lv-content'> <label class='content-label'>3. Thông tin về nhà máy sản xuất</label> <div class='content-object' id='column-ten_nha_xuong'></div> </div> </div> <div class='lv-object'> <div class='lv-content'> <label class='content-label'>4. Địa chỉ</label> <div class='content-object' id='column-dia_chi_nha_xuong'></div> </div> </div> <div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>3. Loại hình sản xuất</label> <div class='content-object' id='column-loai_hinh_san_xuat'></div> </div> </div><div class='lv-object'> <div class='lv-content'> <label class='content-label'>5. Căn cứ</label> <div class='content-object' id='column-can_cu'></div> </div> </div><div class='lv-object''> <div class='lv-content'> <label class='content-label'>6. Loại ấn chỉ: </label> <div class='content-object' id='column-loai_an_chi'></div> </div> </div> <div class='lv-object' style='width: 40%; float: left;'> <div class='lv-content'> <label class='content-label'>7. Phương thức cấp</label> <div class='content-object' id='column-phuong_thuc_cap'></div> </div> </div> <div id='div-quyet-toan' class='lv-object' style='width: 30%; float: right; display: none;'> <div class='' style='display: inline-flex;'> <span style='padding: 35px 20px 0px 0px;'>Quyết toán</span> <div class='content-object' id='column-quyet_toan' style='padding: 25px 0px 0px 0px;'></div><!-- <span style='padding: 35px 20px 0px 35px; display: none;' id='labelqt'>Cập nhật lại <br>danh sách xe?</span><button type='button' class='btn' id='del' style='padding: 0px 20px 0px 0px; display: none; height: 30px; margin-top: 30px'>  Yes</button><button type='button' class='btn' id='cancel' style='padding: 0px 20px 0px 0px; display: none; height: 30px; margin-top: 30px; maring-left: 10px'>  No</button> --> </div> </div> <div style='clear:both;'></div> <div class='lv-object' id='div-hinh-thuc-cap'> <div class='lv-content' style='width: 40%;'> <label class='content-label'>8. Hình thức </label> <div class='content-object' id='column-hinh_thuc_cap'></div> </div> </div><div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>&nbsp;&nbsp;&nbsp;&nbsp; Số lượng Ấn chỉ đề nghị cấp: </label> <div class='content-object' id='column-so_luong'></div> </div> </div><div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Số lượng Ấn chỉ tồn đầu kỳ: </label> <div class='content-object' id='column-so_luong_dau_ky'></div> </div> </div><div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Số lượng Ấn chỉ nhận trong kỳ: </label> <div class='content-object' id='column-so_luong_trong_ky'></div> </div> </div><div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Số lượng Ấn chỉ đã sử dụng trong kỳ: </label> <div class='content-object' id='column-so_luong_da_su_dung'></div> </div> </div><div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Số lượng Ấn chỉ hỏng trong kỳ: </label> <div class='content-object' id='column-so_luong_hong'></div> </div> </div><div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Số lượng Ấn chỉ còn tồn lại cuối kỳ: </label> <div class='content-object' id='column-so_luong_ton_tai'></div> </div> </div><div class='lv-object' style='display: none;'> <div class='lv-content'> <label class='content-label'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Số hồ sơ Cấp theo KHSX: </label> <div class='content-object' id='column-so_ho_so'></div><button id='get-tham-chieu' type='button' class='btn btn-default'>Tham chiếu</button> </div> </div><div id='div-ds-cap-doi' class='lv-object' style='width: 30%; float: right;'> <div class='' style='display: inline-flex;'><span style='padding: 35px 20px 0px 0px;'></span></div> </div> <div style='clear:both;'></div> <div class='lv-object' style='display:none'> <div class='lv-content' > <div class='content-object' id='column-danh_sach_cap_doi'></div> </div> </div> <div class='lv-object' id='div-bang'> <div class='lv-content' id='div-bang-khai'> <div class='content-object' id='column-bang_khai'></div> </div> </div><div class='lv-object'> <div class='lv-content'> <label class='content-label'>9. Địa điểm nhận ấn chỉ: </label> <div class='content-object' id='column-dia_diem_nhan_phieu'></div> </div> </div> <div id='mymodal-cps' class='modal-cps'> <div class='modal-cps-content'> <div class='modal-cps-header'> <span class='close close-cps'>&times;</span></div> <div class='modal-cps-body'> <input type='hidden' name='current_row' id='current_row' /> <input type='hidden' name='loai_ds' id='loai_ds' /> <label style='margin-top: 15px;'>Số lượng: <span id='soLuongXe'>0</span></label> <div id='my_excel' style='max-height: 400px; overflow: auto;'></div> </div> <div class='modal-footer'><button type='button' class='btn btn-primary ' id='update-row'>Lưu</button><button type='button' class='btn btn-default close-cps' >Đóng</button></div> </div> </div> <div id='mymodal-cps' class='modal-cps'> <div class='modal-cps-content'> <div class='modal-cps-header'> <span class='close close-cps'>&times;</span></div> <div class='modal-cps-body'> <input type='hidden' name='current_row' id='current_row' /> <input type='hidden' name='loai_ds' id='loai_ds' /> <label style='margin-top: 15px;'>Số lượng: <span id='soLuongXe'>0</span></label> <div id='my_excel' style='max-height: 400px; overflow: auto;'></div> </div> <div class='modal-footer'><button type='button' class='btn btn-primary ' id='update-row'>Lưu</button><button type='button' class='btn btn-default close-cps' >Đóng</button></div> </div> </div> <div id='mymodal-cps-ke-khai' class='modal-cps'> <div class='modal-cps-content'> <div class='modal-cps-header'> <span class='close close-cps' id='closeDialogHeader'>&times;</span></div> <div class='modal-cps-body'> <label style='padding-bottom: 12px;'>Kê khai linh kiện sử dụng</label> <!--<table border='1'> <thead> <tr> <th> <span style='text-align: center;'>Tổng thành, hệ thống</span> </th> <th> <span style='text-align: center;'>Số giấy chứng nhận</span> </th> <th> <span style='text-align: center;'>Nhãn hiệu, số loại/ mã hiệu</span> </th> <th> <span style='text-align: center;'>Nơi sản xuất</span> </th> </tr> </thead> <tbody id='dataTableKeKhaiLK'> </tbody> </table> --><table style='width: 100%; border: 1px solid black;' id='table-ke-khai'><tbody><tr><td style='width:5%;'><span style='text-align:center; font-weight:bold'>STT</span></td><td style='width:15%;'><span style='text-align:center; font-weight:bold'>Loại linh kiện</span></td><td style='width:30%;'><span style='text-align:center; font-weight:bold'>Số GCN</span></td><td style='width:10%;'><span style='text-align:center; font-weight:bold'>Ngày cấp</span></td><td style='width:10%;'><span style='text-align:center; font-weight:bold'>Số lượng ban đầu</span></td><td style='width:10%;'><span style='text-align:center; font-weight:bold'>Số lượng đã sử dụng</span></td><td style='width:10%'><span style='text-align:center; font-weight:bold'>Số lượng chưa sử dụng đến</span></td><td style='width:10%'><span style='text-align:center; font-weight:bold'>Số lượng đề nghị sử dụng</span></td></tr><tr id='tr-ke-khai'></tr></tbody></table></div> <div class='modal-footer'><button type='button' class='btn btn-primary ' id='update-row-ke-khai'>Lưu</button><button type='button' id='closeDialog' class='btn btn-default close-cps'>Đóng</button></div> </div> </div> <div id='column-initEvent'></div><div id='column-duplicatealert'></div><div style='display: none;' id='column-dossierIdDnQuyetToan'></div><div style='display: none;' id='column-bang_trung'></div> <p>&nbsp;</p> <p>&nbsp;</p> </div>",
            "bindings": {
                "bang_trung": "column-bang_trung",
                "duplicatealert": "column-duplicatealert",
                "formType_hidden": "column-formType_hidden",
                "nguoi_dai_dien": "column-formType_hidden",
                "so_dien_thoai_nguoi_lien_he": "column-formType_hidden",
                "ma_so_tai_khoan": "column-hidden",
                "dia_chi": "column-dia_chi",
                "ten_doanh_nghiep": "column-ten_doanh_nghiep",
                "ma_so_tai_khoan": "column-ten_doanh_nghiep",
                "dia_chi_nha_xuong": "column-dia_chi_nha_xuong",
                "ten_nha_xuong": "column-ten_nha_xuong",
                "ten_nha_xuong_text": "column-ten_nha_xuong",
                "ten_nha_xuong_hidden": "column-ten_nha_xuong",
                "phuong_thuc_cap": "column-phuong_thuc_cap",
                "phuong_thuc_cap_text": "column-phuong_thuc_cap",
                "hinh_thuc_cap": "column-hinh_thuc_cap",
                "hinh_thuc_cap_text": "column-hinh_thuc_cap",
                "so_luong": "column-so_luong",
                "so_luong_dau_ky": "column-so_luong_dau_ky",
                "so_luong_trong_ky": "column-so_luong_trong_ky",
                "so_luong_da_su_dung": "column-so_luong_da_su_dung",
                "so_luong_hong": "column-so_luong_hong",
                "so_luong_ton_tai": "column-so_luong_ton_tai",
                "bang_khai": "column-bang_khai",
                "quyet_toan": "column-quyet_toan",
                "quyet_toan_text": "column-quyet_toan",
                "danh_sach_cap_doi": "column-danh_sach_cap_doi",
                "danh_sach_cap_doi_2": "column-danh_sach_cap_doi",
                "loai_hinh_san_xuat": "column-loai_hinh_san_xuat",
                "loai_hinh_san_xuat_text": "column-loai_hinh_san_xuat",
                "can_cu": "column-can_cu",
                "can_cu_text": "column-can_cu",
                "so_luong_an_chi": "column-so_luong_an_chi",
                "so_ho_so": "column-so_ho_so",
                "dossierIdDnQuyetToan": "column-dossierIdDnQuyetToan",
                "dossierNoPattern": "column-dossierIdDnQuyetToan",
                "loai_an_chi": "column-loai_an_chi",
                "loai_an_chi_text": "column-loai_an_chi",
                "dia_diem_nhan_phieu": "column-dia_diem_nhan_phieu",
                "dia_diem_nhan_phieu_text": "column-dia_diem_nhan_phieu",
                "initEvent": "column-initEvent"
            }
        },
        "parent": "bootstrap-edit",
        "fields": {}
    }
}