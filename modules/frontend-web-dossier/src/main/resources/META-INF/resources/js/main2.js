var funLoadVue = function (stateWindowParam, dossierIdParam, dossierPartNo, emailAddress, urlAddCoSoNuocNgoai, urlGetDictGroup, portletNamespace) {
  var config = {
    headers: {
      'groupId': themeDisplay.getScopeGroupId()
    }
  };
  var sampleDataCOP = {
    "count": 0,
    "dang_kiem_vien_1": "#userAction@PPC",
    "1_1_1": "#ten_doanh_nghiep@TT302011BGTVTCOPTTDN",
    "1_1_2": "#dia_chi_chinh_doanh_nghiep@TT302011BGTVTCOPTTDN",
    "ma_so_tai_khoan": "#ma_so_tai_khoan@TT302011BGTVTCOPTTDN",
    "ma_so_nha_xuong": "#ma_so_xuong@TT302011BGTVTCOPTTDN",
    "productionplantcode": "#list_nha_xuong@TT302011BGTVTCOPTTDN",
    "copclassification": "#loai_hinh_san_xuat@TT302011BGTVTCOPTTDN",
    "loai_hinh_danh_gia": "#loai_ho_so_cop@TT302011BGTVTCOPTTDN",
    "1_1_3": "#ten_xuong_san_xuat@TT302011BGTVTCOPTTDN",
    "1_1_4": "#dia_chi_xuong_san_xuat@TT302011BGTVTCOPTTDN",
    "thiet_bi_xuat_xuong": "#thiet_bi_xuat_xuong@TT302011BGTVTCOPTTDN",
    "hop_dong": "#hop_dong@TT302011BGTVTCOPTTDN",
    "kl_1_1_1": 2,
    "kl_1_1_2": 2,
    "kl_1_1_3": 2,
    "kl_1_1_4": 2,
    "kl_1_1_5": 2,
    "kl_1_1_6": 2,
    "part1": [{
      "stt": "1",
      "noi_dung": "<span style='font-weight:bold;'>Đánh giá về tính pháp lý (Bussiness scope)</span>",
      "ky_hieu": "",
      "items": "",
      "ket_luan": ""

    },
    {
      "stt": "1.1",
      "noi_dung": "<span style='font-weight:bold;'>Có tài liệu thể hiện tư cách pháp nhân ( Bussiness licence / Certification)</span>",
      "ky_hieu": "",
      "items": "",
      "ket_luan": ""

    },
    {
      "stt": "1.1.1",
      "noi_dung": "<span style='font-weight:bold;'>Tên cơ sở sản xuất, địa chỉ chủ sở chính (Name / address of manufacturer):</span>",
      "ky_hieu": "nd_1_1_1",
      "diem_nd": "diem_nd_1_1_1",
      "nd_result": "nd_1_1_1_result",
      "mt_nd": "mt_nd_1_1_1",
      "nd_1_1_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) khác hồ sơ (Different from declaration)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) khác hồ sơ do khai nhầm (Wrong with declaration)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) khác hồ sơ do đổi tên (Different from declaration due to changing name )"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) đúng hồ sơ (Accurate declaration)"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"
    },
    {
      "stt": "1.1.2",
      "noi_dung": "<span style='font-weight:bold;'>Ngành nghề sản xuất kinh doanh (Production and business fields):</span>",
      "ky_hieu": "nd_1_1_2",
      "diem_nd": "diem_nd_1_1_2",
      "nd_result": "nd_1_1_2_result",
      "mt_nd": "mt_nd_1_1_2",
      "nd_1_1_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không đăng ký kinh doanh (Non-licensed)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có đăng kí kinh doanh, ngành nghề không phù hợp (Licensed, insufficient)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đăng kí kinh doanh, ngành nghề phù hợp (Licensed, sufficient)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có đăng kí kinh doanh, ngành nghề phù hợp, đã sản xuất kinh doanh (Included (3), taken into effect)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "1.2",
      "noi_dung": "<span style='font-weight:bold;'>Tài liệu thể hiện tính hợp pháp của địa điểm kinh doanh/sản xuất, lắp ráp <br>(Documents present the legality of manufacturing site)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "1.2.1",
      "noi_dung": "<span style='font-weight:bold;'>Địa điểm đánh giá (Site address):</span>",
      "ky_hieu": "nd_1_2_1",
      "diem_nd": "diem_nd_1_2_1",
      "nd_result": "nd_1_2_1_result",
      "nd_1_2_1_result": 1,
      "mt_nd": "mt_nd_1_2_1",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) khác hồ sơ (Different from declaration)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) khác hồ sơ do khai nhầm (Wrong with declaration)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) khác hồ sơ do đổi tên (Different from declaration due to changing name )"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) đúng hồ sơ (Accurate declaration)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "1.2.2",
      "noi_dung": "<span style='font-weight:bold;'>Ngành nghề sản xuất và thời hạn sử dụng (Production field registered and Period of validity)</span>",
      "ky_hieu": "nd_1_2_2",
      "diem_nd": "diem_nd_1_2_2",
      "nd_result": "nd_1_2_2_result",
      "mt_nd": "mt_nd_1_2_2",
      "nd_1_2_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) chưa được phép (disapproved)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) được phép nhưng không phù hợp (Licensed, insufficient)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) được phép và phù hợp (Licensed, sufficient)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và đã sản xuất (Included (3), taken into effect)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2",
      "noi_dung": "<span style='font-weight:bold;'>Đánh giá tài liệu quản lý chất lượng (Quality documents)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.1",
      "noi_dung": "<span style='font-weight:bold;'>Quy trình sản xuất (Production procedure)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.1.1",
      "noi_dung": "<span style=''><strong>Tính phù hợp:</strong> áp dụng cho đúng kiểu loại sản phẩm, thể hiện đầy đủ các yếu tố về vật tư, thiết bị, trình tự thực hiện, trách nhiệm, thời điểm. Các yêu cầu và tiêu chí thực hiện phù hợp với yêu cầu của loại hình sản xuất.<br><strong>Conformity:</strong> Apply for specific type of products, present full elements of incoming materials, machineries, sequent performing methods, responsibilities and timing. Requirements and performance criterions shall be complied with type of production demands.</span>",
      "ky_hieu": "nd_2_1_1",
      "diem_nd": "diem_nd_2_1_1",
      "nd_result": "nd_2_1_1_result",
      "mt_nd": "mt_nd_2_1_1",
      "nd_2_1_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không sản xuất theo được (Available, non-applicable)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có và sản xuất theo được (Available, Applicable)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có khả năng thống kê phân tích để cải tiến <br>(Included (5), have ability to carry out the statistic and analysis for improvement)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng cải tiến liên tục nâng cao chất lượng, năng suất <br>(Included (6), have ability to carry out the continuous improvements for quality and productivity)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },

    {
      "stt": "2.1.2",
      "noi_dung": "<span style='font-weight:bold;'>Tính hiệu lực (Effectiveness):</span>",
      "ky_hieu": "nd_2_1_2",
      "diem_nd": "diem_nd_2_1_2",
      "nd_result": "nd_2_1_2_result",
      "mt_nd": "mt_nd_2_1_2",
      "nd_2_1_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) người liên quan không biết (People involved unknow)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có soạn thảo, chưa phê duyệt (Edited, unapproved)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ và được phê duyệt áp dụng đến cấp quản lý (Approved and distributed to manager levels)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3), phổ biến đến người thực hiện và làm được (Included (3), distributed to implementors and followable)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và thực hiện thành thạo (Included (4) and can be done skillfully)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và người thực hiện có thể đào tạo (Included (5), trainable by implementors)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và người thực hiện có thể xây dựng, cải tiến (Included (6), creational and improvable by implementors)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.2",
      "noi_dung": "<span style='font-weight:bold;'>Quy định kiểm soát chất lượng ( Quality control)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.2.1",
      "noi_dung": "<span style='font-weight:bold;'>Tính phù hợp:</span> Áp dụng cho đúng kiểu loại sản phẩm. Đủ các công đoạn kiểm tra từ đầu vào, trong sản xuất đến thành phẩm (xuất xưởng). Các công đoạn kiểm tra thể hiện được đầy đủ các yếu tố như trình tự thực hiện, tiêu chuẩn kiểm tra, thiết bị, dụng cụ kiểm tra, phương pháp thực hiện, người thực hiện. Các yêu cầu, tiêu chí và các biểu mẫu kiểm tra phù hợp các quy định hiện hành và thực tế sản xuất, kiểm tra.<br><span style='font-weight:italic;'>Áp dụng cho đúng kiểu loại sản phẩm. Đủ các công đoạn kiểm tra từ đầu vào, trong sản xuất đến thành phẩm (xuất xưởng). Các công đoạn kiểm tra thể hiện được đầy đủ các yếu tố như trình tự thực hiện, tiêu chuẩn kiểm tra, thiết bị, dụng cụ kiểm tra, phương pháp thực hiện, người thực hiện. Các yêu cầu, tiêu chí và các biểu mẫu kiểm tra phù hợp các quy định hiện hành và thực tế sản xuất, kiểm tra.</span> ",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.2.1.1",
      "noi_dung": "<span style='font-weight:bold;'>Quy định kiểm soát vật tư đầu vào (Incoming materials control):</span>",
      "ky_hieu": "nd_2_2_1_1",
      "diem_nd": "diem_nd_2_2_1_1",
      "nd_result": "nd_2_2_1_1_result",
      "mt_nd": "mt_nd_2_2_1_1",
      "nd_2_2_1_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có quy định (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không kiểm soát được (Available, uncontrolled)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ tài liệu để kiểm soát (Available, controlled)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có đánh giá nhà cung cấp (Included (5), have external audits performed on suppliers)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng thống kê phân tích để cải tiến (Included (6), have ability to carry out the statistic and analysis for improvement)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.2.1.2",
      "noi_dung": "<span style='font-weight:bold;'>Quy định kiểm soát trong sản xuất (Processing control):</span>",
      "ky_hieu": "nd_2_2_1_2",
      "diem_nd": "diem_nd_2_2_1_2",
      "nd_result": "nd_2_2_1_2_result",
      "mt_nd": "mt_nd_2_2_1_2",
      "nd_2_2_1_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có quy định (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không kiểm soát được (Available, uncontrolled)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ tài liệu để kiểm soát (Approved, controlled)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có khả năng thống kê phân tích để cải tiến (Included (5), have ability to carry out the statistic and analysis for improvement) "
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng cải tiến liên tục nâng cao chất lượng, năng suất (Included (6), have ability to carry out the continuous improvements for quality and productivity)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.2.1.3",
      "noi_dung": "<span style='font-weight:bold;'>Quy định kiểm tra xuất xưởng (Final control):</span>",
      "ky_hieu": "nd_2_2_1_3",
      "diem_nd": "diem_nd_2_2_1_3",
      "nd_result": "nd_2_2_1_3_result",
      "mt_nd": "mt_nd_2_2_1_3",
      "nd_2_2_1_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có quy định (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không kiểm soát được (Available, uncontrolled)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ tài liệu để kiểm soát (Approved, controlled )"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có khả năng thống kê phân tích để cải tiến (Included (5), have ability to carry out the statistic and analysis for improvement) "
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng cải tiến liên tục nâng cao chất lượng, năng suất (Included (6), have ability to carry out continuous improvements for quality and productivity)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.2.2",
      "noi_dung": "<span style='font-weight:bold;'>Tính hiệu lực (Effectiveness):</span>",
      "ky_hieu": "nd_2_2_2",
      "diem_nd": "diem_nd_2_2_2",
      "nd_result": "nd_2_2_2_result",
      "mt_nd": "mt_nd_2_2_2",
      "nd_2_2_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) người liên quan không biết (People involved unknow)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có soạn thảo, chưa phê duyệt (Edited, unapproved)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ và được phê duyệt áp dụng đến cấp quản lý (Approved and distributed to manager levels)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3), phổ biến đến người thực hiện và làm được (Included (3), distributed to implementors and followable)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và thực hiện thành thạo (Included (4), could be done skillfully)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và người thực hiện có thể đào tạo (Included (5), trainable by implementors)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và người thực hiện có thể xây dựng, cải tiến (Included (6), creational and improvable by implementors)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.3",
      "noi_dung": "<span style='font-weight:bold;'>Quy định bảo hành (Warranty documents)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.3.1",
      "noi_dung": "<span style=''><strong>Tính phù hợp:</strong> có quy trình thực hiện bảo hành, có điều khoản cụ thể về bảo hành sản phẩm để khách hàng biết và thực hiện được quyền và nghĩa vụ.<br><strong>Conformity:</strong> have warranty processes, with specific provisions for product warranty, in order to var customers know and implement their rights and obligations.</span>",
      "ky_hieu": "nd_2_3_1",
      "diem_nd": "diem_nd_2_3_1",
      "nd_result": "nd_2_3_1_result",
      "mt_nd": "mt_nd_2_3_1",
      "nd_2_3_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không thực hiện được (Available, unexecuted)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ tài liệu để thực hiện bảo hành sản phẩm (Approved, executed)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có khả năng thống kê phân tích để cải tiến (Included (5), have ability to carry out the statistic and analysis for improvement) "
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng cải tiến liên tục nâng cao chất lượng (Included (6), have ability to carry out continuous improvements for quality)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.3.2",
      "noi_dung": "<span style='font-weight:bold;'>Tính hiệu lực (Effectiveness):</span>",
      "ky_hieu": "nd_2_3_2",
      "diem_nd": "diem_nd_2_3_2",
      "nd_result": "nd_2_3_2_result",
      "mt_nd": "mt_nd_2_3_2",
      "nd_2_3_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) người liên quan không biết (People involved unknow)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có soạn thảo, chưa phê duyệt (Edited, unapproved)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ và được phê duyệt áp dụng đến cấp quản lý (Approved and distributed to manager levels)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có đủ, dược phê duyệt, phổ biến đến người thực hiện (Approved and distributed to implementors)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và thực hiện làm được (Included (4), followable)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và người thực hiện làm thành thạo (Included (5), could be done skillfully)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và người thực hiện hiểu rõ, có thể cải tiến (Included (6), comprehensible and improvable by implementors)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.4",
      "noi_dung": "<span style='font-weight:bold;'>Quy định kiểm soát không phù hợp (Non-conformity control documents)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.4.1",
      "noi_dung": "<span style=''><strong>Tính phù hợp:</strong> có thể nhận biết, theo dõi cách ly và xử lý không phù hợp. Có thể phân tích nguyên nhân, đưa ra biện pháp khắc phục - phòng ngừa.<br><strong>Conformity:</strong> Could be able to identify, to classify, to isolate and to handle all type of non-conformities. Could be able to analyze the root causes and take the corrective and preventive actions.</span>",
      "ky_hieu": "nd_2_4_1",
      "diem_nd": "diem_nd_2_4_1",
      "nd_result": "nd_2_4_1_result",
      "mt_nd": "mt_nd_2_4_1",
      "nd_2_4_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không thực hiện được (Available, unexecuted)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ nội dung để kiểm soát không phù hợp (Approved, controlled)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có khả năng thống kê phân tích nguyên nhân và khắc phục (Included (5), have ability to carry out the statistics and analysis of root causes and corrective actions)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng phòng ngừa (Included (6), have ability to carry out the preventive actions)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.4.2",
      "noi_dung": "<span style='font-weight:bold;'>Tính hiệu lực (Effectiveness):</span>",
      "ky_hieu": "nd_2_4_2",
      "diem_nd": "diem_nd_2_4_2",
      "nd_result": "nd_2_4_2_result",
      "mt_nd": "mt_nd_2_4_2",
      "nd_2_4_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) người liên quan không biết (People involved unknow)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có soạn thảo, chưa phê duyệt (Edited, unapproved)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ và được phê duyệt áp dụng đến cấp quản lý (Approved and distributed to manager levels)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có đủ, dược phê duyệt, phổ biến đến người thực hiện (Approved and distributed to implementors)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và thực hiện làm được (Included (4), followable)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và người thực hiện làm thành thạo (Included (5), could be done skillfully)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và người thực hiện hiểu rõ, có thể cải tiến (Included (6), comprehensible and improvable by implementors)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },

    {
      "stt": "2.5",
      "noi_dung": "<span style='font-weight:bold;'>Quy định triệu hồi sản phẩm (Recall documents)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.5.1",
      "noi_dung": "<span style=''><strong>Tính phù hợp:</strong> có thể nhận biết, theo dõi và xử lý khi sản phẩm có lỗi thuộc phạm vi phải triệu hồi sản phẩm.<br><strong>Conformity:</strong> could be able to identify, to track and to handle the faulty products within the range of products recalled.</span>",
      "ky_hieu": "nd_2_5_1",
      "diem_nd": "diem_nd_2_5_1",
      "nd_result": "nd_2_5_1_result",
      "mt_nd": "mt_nd_2_5_1",
      "nd_2_5_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không thực hiện được (Available, unexecuted)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ nội dung để xử lý sản phẩm bị triệu hồi (Meet requirements and applicable)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có khả năng thống kê phân tích nguyên nhân và khắc phục (Included (5), have ability to carry out the statistics and analysis of root causes and corrective actions)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng phòng ngừa (Included (6), have ability to carry out the preventive actions)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.5.2",
      "noi_dung": "<span style='font-weight:bold;'>Tính hiệu lực (Effectiveness):</span>",
      "ky_hieu": "nd_2_5_2",
      "diem_nd": "diem_nd_2_5_2",
      "nd_result": "nd_2_5_2_result",
      "mt_nd": "mt_nd_2_5_2",
      "nd_2_5_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) người liên quan không biết (People involved unknow)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có soạn thảo, chưa phê duyệt (Edited, unapproved)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ và được phê duyệt áp dụng đến cấp quản lý (Approved and distributed to manager levels)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có đủ, dược phê duyệt, phổ biến đến người thực hiện (Approved and distributed to implementors)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và thực hiện làm được (Included (4), followable)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và người thực hiện làm thành thạo (Included (5), could be done skillfully)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và người thực hiện hiểu rõ, có thể cải tiến (Included (6), comprehensible and improvable by implementors)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.6",
      "noi_dung": "<span style='font-weight:bold;'>Quy định về kiểm soát tài liệu, hồ sơ chất lượng (Documents, records control regulations)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "2.6.1",
      "noi_dung": "<span style=''><strong>Tính phù hợp:</strong>> thể hiện phương pháp rõ ràng để phân biệt, theo dõi tài liệu và hồ sơ chất lượng. Quy định rõ cách thức lưu trữ, bảo quản của tài liệu và hồ sơ. <br><strong>Conformity:</strong> Could be able to classify and to track the documents and quality records. Specify the practical method to store and preserve them.</span>",
      "ky_hieu": "nd_2_6_1",
      "diem_nd": "diem_nd_2_6_1",
      "nd_result": "nd_2_6_1_result",
      "mt_nd": "mt_nd_2_6_1",
      "nd_2_6_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có nhưng không thực hiện được (Available, unexecuted)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ tài liệu để kiểm soát tài liệu, hồ sơ (Available, sufficient)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và phù hợp với thực tế (Included (3), comply with reality)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và dễ thực hiện (Included (4), easily get done)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có khả năng thống kê phân tích nguyên nhân và khắc phục (Included (5), have ability to carry out the statistics and analysis of root causes and corrective actions)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có khả năng cải tiến liên tục (Included (6), have ability to carry out continuous improvements)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.6.2",
      "noi_dung": "<span style='font-weight:bold;'>Tính hiệu lực (Effectiveness):</span>",
      "ky_hieu": "nd_2_6_2",
      "diem_nd": "diem_nd_2_6_2",
      "nd_result": "nd_2_6_2_result",
      "mt_nd": "mt_nd_2_6_2",
      "nd_2_6_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) người liên quan không biết (People involved unknow)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có soạn thảo, chưa phê duyệt (Edited, unapproved)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ và được phê duyệt áp dụng đến cấp quản lý (Approved and distributed to manager levels)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có đủ, dược phê duyệt, phổ biến đến người thực hiện (Approved and distributed to implementors)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và thực hiện làm được (Included (4), followable)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và người thực hiện làm thành thạo (Included (5), could be done skillfully)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và người thực hiện hiểu rõ, có thể cải tiến (Included (6), comprehensible and improvable by implementors)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },

    {
      "stt": "3",
      "noi_dung": "<span style='font-weight:bold;'>Nhà xưởng, mặt bằng phục vụ sản xuất (Workshop space/area)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "3.1",
      "noi_dung": "<span style='font-weight:bold;'>Nhà xưởng (Plant layout): </span>",
      "ky_hieu": "nd_3_1",
      "diem_nd": "diem_nd_3_1",
      "nd_result": "nd_3_1_result",
      "mt_nd": "mt_nd_3_1",
      "nd_3_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không đủ để sản xuất (Non applicable for prodution procedure)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) bố trí không hợp lý gây khó khăn cho sản xuất (Not meet requirements of production procedure)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) chỉ phù hợp với quy mô sản xuất nhỏ, lẻ (Conformable with small scale production)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có thể sản xuất hàng loạt, nhỏ (Conformable with mass production)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) có thể sản xuất hàng loạt, lớn (Conformable with large-scale mass production)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và tối ưu cho sản xuất hàng loạt (Included (5) and optimal for mass production)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có thể dễ dàng nâng cấp mở rộng (Included (6), could be able to upgrade and enlarge)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "3.2",
      "noi_dung": "<span style='font-weight:bold;'>Môi trường (Working condition):</span>",
      "ky_hieu": "nd_3_2",
      "diem_nd": "diem_nd_3_2",
      "nd_result": "nd_3_2_result",
      "mt_nd": "mt_nd_3_2",
      "nd_3_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không làm việc được (Unable to work)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) không đảm bảo khả năng làm việc lâu dài (Bad condition)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có thể làm việc được (Acceptable)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và có cảnh báo, chỉ dẫn an toàn PCCC, an toàn lao động (Included (3), have warning, notices of  fire-extinguishing and working safety)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và có xác nhận của cơ quan chức năng về PCCC, môi trường, an toàn lao động (Included (4) and have of authorized bodies certifications)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có kiểm soát PCCC, môi trường, an toàn lao động chủ động (Included (5), have active control in fire-extinguishing, environment and working safety)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và không có nguy cơ rủi ro nghề nghiệp nào (Included (6), without occupational risks)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "3.3",
      "noi_dung": "<span style='font-weight:bold;'>Kho (Warehouse/ storage):</span>",
      "ky_hieu": "nd_3_3",
      "diem_nd": "diem_nd_3_3",
      "nd_result": "nd_3_3_result",
      "mt_nd": "mt_nd_3_3",
      "nd_3_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không bố trí kho (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) không đủ diện tích kho cho vật tư và thành phẩm (insufficient)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ diện tích nhưng bố trí chưa thuận tiện di chuyển (Sufficient, untidy)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có đủ diện tích, có thể di chuyển thuận lợi (Sufficient, tidy)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) gọn gàng, ngăn nắp, dễ dàng tìm kiếm (Tidy and easy for retrieving)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) thực hiện tốt 5S, an toàn và FIFO (Applied 5S, safety and FIFO)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) Sản xuất tinh gọn (Applied methodology lean manufacturing)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4",
      "noi_dung": "<span style='font-weight:bold;'>Thiết bị (Machineries)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "4.1",
      "noi_dung": "<span style='font-weight:bold;'>Thiết bị sản xuất (Production machineries)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "4.1.1",
      "noi_dung": "<span style='font-weight:bold;'>Năng lực thiết bị (Capacity):</span>",
      "ky_hieu": "nd_4_1_1",
      "diem_nd": "diem_nd_4_1_1",
      "nd_result": "nd_4_1_1_result",
      "mt_nd": "mt_nd_4_1_1",
      "nd_4_1_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không đủ thiết bị để sản xuất theo quy trình sản xuất (Insufficient)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có các thiết bị sản xuất nhưng không phù hợp quy trình sản xuất (Sufficient, not meet the requirements of production procedure)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có các thiết bị sản xuất phù hợp quy trình sản xuất (Sufficient, meet the requirements of production procedure)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) nhưng điều khiển bằng thủ công (Included (3) operated by manual control)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (3) và được điều khiển bán tự động (Included (3) and operated by semi automatic control)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (3), được điều khiển hoàn toàn tự động (Included (3) and operated by fully automatic control)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) nhưng có tích hợp thiết bị kiểm tra (Included (6) intergrated with measuring equipments)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.1.2",
      "noi_dung": "<span style='font-weight:bold;'>Tình trạng hoạt động (Operation status):</span>",
      "ky_hieu": "nd_4_1_2",
      "diem_nd": "diem_nd_4_1_2",
      "nd_result": "nd_4_1_2_result",
      "mt_nd": "mt_nd_4_1_2",
      "nd_4_1_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không thể hoạt động (Unable to operate)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) hoạt động được nhưng không phù hợp (Operate, not meet requirements of production procedure)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) hoạt động không ổn định (Unstable)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) hoạt động bình thường, không thường xuyên (Regular and infrequent)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) hoạt động bình thường, thường xuyên một ca (Regular and frequent in one-shift)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) hoạt động bình thường, cả ngày (All day)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) hoạt động bình thường, hết công suất (At full capacity)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.1.3",
      "noi_dung": "<span style='font-weight:bold;'>Bảo dưỡng (Maintenance):</span>",
      "ky_hieu": "nd_4_1_3",
      "diem_nd": "diem_nd_4_1_3",
      "nd_result": "nd_4_1_3_result",
      "mt_nd": "mt_nd_4_1_3",
      "nd_4_1_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không bảo dưỡng (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có kế hoạch nhưng không có nội dung bảo dưỡng cụ thể (Have plan available without detailed contents)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có kế hoạch và có nội dung bảo dưỡng cụ thể (Have plan available with detailed contents)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và có thực hiện đúng (Included (3) and done correctly)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và có người chuyên trách để thực hiện bảo dưỡng (Included (4), have mantenance operator)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và có bộ phận chuyên trách để thực hiện bảo dưỡng (Included (5), have mantenance department)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có sử dụng chương trình quản lý để thực hiện, kiểm soát (Included (6) and utilized preventive maintenance program)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    }
    ],
    "part2": [{
      "stt": "4.2",
      "noi_dung": "<span style='font-weight:bold;'>Thiết bị kiểm tra (Testing equipments)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "4.2.1",
      "noi_dung": "<span style='font-weight:bold;'>Thiết bị kiểm tra xe xuất xưởng  (Căn cứ vào thông tin về thiết bị kiểm tra ở mục 9.1 của Bản thông tin DN mà hiển thị mục 4.2.1.1 hoặc 4.2.1.2 tương ứng)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "4.2.1.1",
      "noi_dung": "<span style='font-weight:bold;'>Có trang bị</span>",
      "ky_hieu": "nd_4_2_1_1",
      "diem_nd": "diem_nd_4_2_1_1",
      "nd_result": "nd_4_2_1_1_result",
      "mt_nd": "mt_nd_4_2_1_1",
      "items": [{}],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.1.2",
      "noi_dung": "<span style='font-weight:bold;'>Hợp đồng với Trung tâm Đăng kiểm</span>",
      "ky_hieu": "nd_4_2_1_2",
      "diem_nd": "diem_nd_4_2_1_2",
      "nd_result": "nd_4_2_1_2_result",
      "mt_nd": "mt_nd_4_2_1_2",
      "items": [{}],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.1.3",
      "noi_dung": "<span style='font-weight:bold;'>Thiết bị kiểm tra chính khác</span>",
      "ky_hieu": "nd_4_2_1_3",
      "diem_nd": "diem_nd_4_2_1_3",
      "nd_result": "nd_4_2_1_3_result",
      "mt_nd": "mt_nd_4_2_1_3",
      "items": [{}],
      "gia_tri": "",
      "ket_luan": "1"

    }
    ],
    "part3": [{
      "stt": "4.2.2",
      "noi_dung": "<span style='font-weight:bold;'>Năng lực thiết bị (capacity): </span>",
      "ky_hieu": "nd_4_2_2",
      "diem_nd": "diem_nd_4_2_2",
      "nd_result": "nd_4_2_2_result",
      "nd_4_2_2_result": 1,
      "mt_nd": "mt_nd_4_2_2",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có thiết bị cần thiết để kiểm tra theo quy trình (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) không đủ thiết bị để kiểm tra theo quy trình (Insufficient)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có đủ thiết bị nhưng không phù hợp để kiểm tra theo quy trình (Sufficient, not meet requirements)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có đủ các thiết bị để thục hiện kiểm tra theo loại hình, quy mô sản xuất (Sufficient, complied with production structure)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (3) và được điều khiển bán tự động (Included (3), operated by semi-automatic control)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (3) và được điều khiển hoàn toàn tự động, con người thực hiện đánh giá kết quả (Included (3), operated by fully automatic control and results manually evaluated)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và được kiểm tra bằng thiết bị tự động, có phân tích đánh giá (Included (6), results automatically analyzed)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.3",
      "noi_dung": "<span style='font-weight:bold;'>Tình trạng hoạt động (Operation status):</span>",
      "ky_hieu": "nd_4_2_3",
      "diem_nd": "diem_nd_4_2_3",
      "nd_result": "nd_4_2_3_result",
      "nd_4_2_3_result": 1,
      "mt_nd": "mt_nd_4_2_3",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không thể hoạt động (Unable to operate)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) hoạt động được nhưng không phù hợp (Operate, not meet requirements of production procedure)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) hoạt động không ổn định (Unstable)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) hoạt động bình thường, không thường xuyên (Regular and infrequent)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) hoạt động bình thường, thường xuyên một ca (Regular and frequent in one-shift)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) hoạt động bình thường, cả ngày (All day)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) hoạt động bình thường, hết công suất (At full capacity)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.4",
      "noi_dung": "<span style='font-weight:bold;'>kiểm tra, hiệu chuẩn (Calibration)</span>",
      "ky_hieu": "nd_4_2_4",
      "diem_nd": "diem_nd_4_2_4",
      "nd_result": "nd_4_2_4_result",
      "nd_4_2_4_result": 1,
      "mt_nd": "mt_nd_4_2_4",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "Kiểm tra độ ồn, âm lượng còi 1"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "Kiểm tra độ ồn, âm lượng còi …"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có kế hoạch để thực hiện được (Have plan available with detailed contents)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có thực hiện theo kế hoạch bởi đơn vị có chức năng bên ngoài (Outsourced followed to the plan)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và tự thực hiện (có đủ quy trình và dụng cụ mẫu chuẩn) (Included (4) and self-performed (have full approved process and standard samples))"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) có bộ phận chuyên trách để kiểm soát (Controlled by calibration department)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có phần mềm quản lý (Included (6), utilized the management programs)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    ],
    "part4": [{
      "stt": "5",
      "noi_dung": "<span style='font-weight:bold;'>Nhân lực (Manpower)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""
    },
    {
      "stt": "5.1",
      "noi_dung": "<span style='font-weight:bold;'>Tổng số nhân lực (Total number of employees)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": "",
      "nd_result": "nd_5_1_result",
      "diem_nd": "diem_nd_5_1"
    }
    ],
    "part5": [{
      "stt": "5.2",
      "noi_dung": "<span style='font-weight:bold;'>Đào tạo (Training)</span>",
      "ky_hieu": "nd_5_2",
      "diem_nd": "diem_nd_5_2",
      "nd_result": "nd_5_2_result",
      "nd_5_2_result": 1,
      "mt_nd": "mt_nd_5_2",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không đào tạo (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) tự đào tạo truyền tay theo kinh nghiệm (Hand to hand training)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) như (2) và làm được theo quy trình (Included (2), trainees follow the process)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và có tài liệu được phê duyệt (Included (3), followed the approved document)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) có kế hoạch và tài liệu đào tạo nâng cao (Have plan and approved document for advanced training)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và thực hiện theo kế hoạch và tài liệu đào tạo nâng cao (Included (5), followed the trainnig plan)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và có bộ phận chuyên trách đào tạo (Included (6), have a training department)"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.3",
      "noi_dung": "<span style='font-weight:bold;'>Kỹ năng nghiệp vụ (Professional skills / Job skills)</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "5.3.1",
      "noi_dung": "<span style='font-weight:bold;'>Cán bộ quản lý, kỹ thuật (Managements, technicians):</span>",
      "ky_hieu": "nd_5_3_1",
      "diem_nd": "diem_nd_5_3_1",
      "nd_result": "nd_5_3_1_result",
      "nd_5_3_1_result": 1,
      "mt_nd": "mt_nd_5_3_1",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không hiểu về quy định, quy trình sản xuất, kiểm soát chất lượng (Unaware of the control process)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có biết về quy định, quy trình sản xuất, kiểm soát chất lượng (Aware the control plan)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có được đào tạo và hiểu biết về quản lý sản xuất, kiểm soát chất lượng (Have been trained, understood the operation process and quality control)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) như (3) và thực hiện đúng các quy định, quy trình về sản xuất và kiểm soát chất lượng (Included (3), followed to the control process)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và có thể hướng dẫn, đào tạo người khác thực hiện công việc do mình phụ trách (Included (4), could be able to train others)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) xây dựng được các quy trình quy định phù hợp với thực tế và yêu cầu của các tiêu chuẩn quản lý, áp dụng tốt (Able to create the process complied with reality and requirements of management standard, execution done well)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) đào tạo được người khác xây dựng quy định, quy trình quản lý (Able to train others to create regulations and managements process)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.3.2",
      "noi_dung": "<span style='font-weight:bold;'>Nhân lực trực tiếp tham gia sản xuất, lắp ráp (Personel directly involved in the production):</span>",
      "ky_hieu": "nd_5_3_2",
      "diem_nd": "diem_nd_5_3_2",
      "nd_result": "nd_5_3_2_result",
      "nd_5_3_2_result": 1,
      "mt_nd": "mt_nd_5_3_2",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không thực hiện được (Unable to implement)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) không hiểu yêu cầu của tài liệu (Not understand the requirements of process)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có thể làm được theo tài liệu (Able to follow process)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có thể làm đúng theo tài liệu (Able to follow process correctly)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) làm tốt theo tài liệu (Able to implement the document's requirements precisely)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) có thể đào tạo hướng dẫn người khác làm được việc theo tài liệu (Able to instruct others to implement in accordance with the process)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) có thể cải tiển trong sản xuất, lắp ráp (Able to improve in production and assembling)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.3.3",
      "noi_dung": "<span style='font-weight:bold;'>Nhân lực kiểm tra chất lượng (Product quality control staff):</span>",
      "ky_hieu": "nd_5_3_3",
      "diem_nd": "diem_nd_5_3_3",
      "nd_result": "nd_5_3_3_result",
      "mt_nd": "mt_nd_5_3_3",
      "nd_5_3_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không thực hiện được (Unable to implement)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) không hiểu yêu cầu của tài liệu (Not understand the requirements of process)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có thể làm được theo tài liệu (Able to follow the process)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) có thể làm đúng theo tài liệu (Able to follow process correctly)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) làm tốt theo tài liệu (Able to implement document's requirements precisely)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) có thể đào tạo hướng dẫn người khác làm được việc theo tài liệu (Able to instruct others to implement in accordance with the process)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) có thể cải tiển trong sản xuất, lắp ráp và kiểm tra (Able to improve in production, assembling and inspection)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "6",
      "noi_dung": "<span style='font-weight:bold;'>Chọn mẫu và kiểm tra, thử nghiệm (Selecting samples, Inspection and testing )</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "6.1",
      "noi_dung": "<span style='font-weight:bold;'>Chọn mẫu (Sampling): </span>",
      "ky_hieu": "nd_6_1",
      "diem_nd": "diem_nd_6_1",
      "nd_result": "nd_6_1_result",
      "mt_nd": "mt_nd_6_1",
      "nd_6_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không chọn mẫu (Non sampling) "
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có chọn mẫu không có quy định (Sampling without process)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) có quy định không thực hiện đúng (Sampling process unfollowed)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) thực hiện đúng quy định về số lượng (Sampling process followed)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) bao gồm (4) và khách quan (Included (4) by objective method)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) bao gồm (5) và bảo quản tốt (Included (5) and have sample kept in good condition)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) bao gồm (6) và đúng thời điểm (Included (6) and implement at exact timing)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "6.2",
      "noi_dung": "<span style='font-weight:bold;'>Kiểm tra, thử nghiệm (Inspection, Testing): </span>",
      "ky_hieu": "nd_6_2",
      "diem_nd": "diem_nd_6_2",
      "nd_result": "nd_6_2_result",
      "nd_6_2_result": 1,
      "mt_nd": "mt_nd_6_2",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không kiểm tra, thử nghiệm (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) kiểm tra, thử nghiệm sai phương pháp (Carried out by unreliable method)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) kiểm tra, thử nghiệm bởi người không có quyền hạn (Carried out by unauthorized people)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) người được phân công thực hiện đúng phương pháp có ghi chép kết quả (Carried out by authorized person, correct methods with records)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) bao gồm (4) và có lưu kết quả  (Included (4) and stored the records)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) bao gồm (5) và có thống kê, phân tích (Included (5) and  have ability to carry out the statistic and analysis)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) bao gồm (6) và có khả năng cải tiến (Included (6), have ability to carry out the improvement)"
      }

      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "6.3",
      "noi_dung": "<span style='font-weight:bold;'>Tiêu chuẩn áp dụng (Applied Standards):</span>",
      "ky_hieu": "nd_6_3",
      "diem_nd": "diem_nd_6_3",
      "nd_result": "nd_6_3_result",
      "nd_6_3_result": 1,
      "mt_nd": "mt_nd_6_3",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có tiêu chuẩn, tiêu chí (Not available)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) có tiêu chí nhưng không phù hợp tiêu chuẩn, quy chuẩn Quốc gia (Available, non-conformable with the national standards and regulations)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) phù hợp với tiêu chuẩn, quy chuẩn Quốc gia (conformable with the national standards and regulations)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) phù hợp với tiêu chuẩn Quốc tế (EC, ECE..) (conformable with the international standards (EC,ECE...))"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) phù hợp với tiêu chuẩn nhà sản xuất toàn cầu (conformable with the standards of global manufacturers)"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "7",
      "noi_dung": "<span style='font-weight:bold;'>Kiểm soát tài liệu, hồ sơ (Documents and records control)</span>",
      "ky_hieu": "nd_7",
      "diem_nd": "diem_nd_7",
      "nd_result": "nd_7_result",
      "nd_7_result": 1,
      "mt_nd": "mt_nd_7",
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không lưu trữ (Unstored)"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) lưu trữ nhưng không có quy định (Stored without process)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) lưu trữ không đúng quy định (Irregular stored)"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) lưu trữ đúng quy định nhưng mất nhiều thời gian để tìm kiếm (Regular stored, difficult for retrieving)"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) lưu trữ đúng quy định, dễ tìm kiếm sử dụng (Regular stored, easy for retrieving)"
      },
      {
        "gia_tri": "6",
        "chon": "",
        "noi_dung": "(6) như (5) và khoa học, các bộ phận có thể tiếp cận sử dụng (Included (5) and logical storing, convinient for other dept to ultilize)"
      },
      {
        "gia_tri": "7",
        "chon": "",
        "noi_dung": "(7) như (6) và lưu trữ bằng điện tử (Included (6) and stored by electronical storing)"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"
    }
      // {
      // 	"stt": "8",
      // 	"noi_dung": "<span style='font-weight:bold;'>Kiểm tra tính phù hợp của sản phẩm xuất xưởng</span>",
      // 	"ky_hieu": "nd_8",
      // 	"items": "",
      // 	"diem_nd": "diem_nd_8",
      // 	"nd_result": "nd_8_result",
      // 	"mt_nd": "mt_nd_8",
      // 	"gia_tri": "",
      // 	"ket_luan": "1"
      // },
      // {
      // 	"stt": "9",
      // 	"noi_dung": "<span style='font-weight:bold;'>Kiểm tra việc sử dụng phôi phiếu kiểm tra chất lượng xuất xưởng</span>",
      // 	"ky_hieu": "nd_9",
      // 	"diem_nd": "diem_nd_9",
      // 	"nd_result": "nd_9_result",
      // 	"mt_nd": "mt_nd_9",
      // 	"items": "",
      // 	"gia_tri": "",
      // 	"ket_luan": "1"
      // }
    ],
    "part6": [{
      "stt": 1,
      "noi_dung": "Địa điểm sản xuất ổn định, lâu dài",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_1",
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ],
      "items": [{
        "noi_dung": "(A) Địa điểm sản xuất có tính ổn định cao, có quyền sử dụng hợp pháp trong thời gian từ 10 năm trở lên",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(A)  Địa điểm sản xuất có tính ổn định trung bình, có quyền sử dụng hợp pháp trong thời gian từ 5- dưới 10 năm",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(A)  Địa điểm sản xuất có tính ổn định thấp, có quyền sử dụng hợp pháp trong thời gian dưới 5 năm",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 2,
      "noi_dung": "Quy mô sản xuất theo thiết kế theo dự án triển khai (sản lượng thiết kế)",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_2",
      "items": [{
        "noi_dung": "(A)  Lớn: từ 10.000 xe/năm trở lên",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Trung bình: từ 500 đến dưới 10.000 xe/năm",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": " (C) Nhỏ: dưới 500 xe/năm  ",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ],
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ]
    },
    {
      "stt": 3,
      "noi_dung": "Công nghệ sản xuất, lắp ráp",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_3",
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ],
      "items": [{
        "noi_dung": "(A)  Hiện đại, được chuyển giao công nghệ từ các hãng sản xuất thuộc khối các nước thuộc EU, G7 (Hoa Kỳ, Đức, Nhật Bản, Pháp, Anh, Ý, Canada)",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Được chuyển giao công nghệ từ các hãng sản xuất thuộc khối các nước thuộc khối G20 (không bao gồm các nước thuộc EU, G7 đã nêu trên: Hàn Quốc, Argentina, Úc, Brasil, Trung Quốc, Ấn Độ, Indonesia, México, Nga, Ả Rập Xê Út, Nam Phi và Thổ Nhĩ Kỳ) hoặc doanh nghiệp không được chuyển giao công nghệ nhưng có Trung tâm nghiên cứu phát triển sản phẩm riêng",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(C)  Không thuộc 02 đối tượng trên",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 4,
      "noi_dung": "Trang thiết bị sản xuất",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_4",
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ],
      "items": [{
        "noi_dung": "(A)  Được trang bị dây chuyền sản xuất hiện đại, mức độ tự động hóa cao (robot công đoạn hàn, sơn…)",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Được trang bị dây chuyền sản xuất đồng bộ, có một số phần điều khiển bán tự động",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(C)  Hoàn toàn thủ công",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 5,
      "noi_dung": "Nhân lực kiểm tra chất lượng xuất xưởng",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_5",
      "items": [{
        "noi_dung": "(A)  Có nhân lực được Cơ quan QLCL hoặc nhà sản xuất nước ngoài (bên chuyển giao công nghệ) đào tạo, bồi dưỡng",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Có nhân lực được đào tạo bởi các hình thức khác (không thuộc nhóm trên)",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ],
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      }
      ]
    },
    {
      "stt": 6,
      "noi_dung": "Hệ thống quản lý chất lượng",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_6",
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ],
      "items": [{
        "noi_dung": "(A)  Có chứng chỉ hệ thống quản lý chất lượng ISO 9001:2015 hoặc IATF16949 hoặc tương đương còn hiệu lực và được duy trì tốt",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Có chứng chỉ hệ thống quản lý chất lượng ISO 9001:2015 hoặc IATF 16949 hoặc tương đương còn hiệu lực",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(C)  Có chứng chỉ hệ thống quản lý chất lượng ISO 9001:2015 hoặc IATF 16949 hoặc tương đương còn hiệu lực nhưng không được duy trì tốt hoặc chưa có chứng chỉ hệ thống quản lý chất lượng",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 7,
      "noi_dung": "Kết quả đánh giá COP (kết quả của lần đánh giá hiện tại)",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_7",
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ],
      "items": [{
        "noi_dung": "(A)  Không có nội dung cần khắc phục",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Có đến 03 nội dung cần khắc phục",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(C)  Có trên 03 nội dung cần khắc phục",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 8,
      "noi_dung": "Tuân thủ trong quá trình sản xuất, lắp ráp và cung ứng sản phẩm  (lấy tự động dữ liệu từ VR)",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_8",
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ],
      "items": [{
        "noi_dung": "(A)  Không bị tạm dừng xuất xưởng sản phẩm ",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Bị tạm dừng xuất xưởng 01 kiểu loại sản phẩm",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(C)  Bị tạm dừng xuất xưởng một kiểu loại sản phẩm từ 02 lần trở lên hoặc bị tạm dừng xuất xưởng đồng thời từ 02 kiểu loại sản phẩm trở lên",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 9,
      "noi_dung": "Thực hiện việc triệu hồi sản phẩm bị lỗi kỹ thuật (lấy tự động dữ liệu từ VR)",
      "id": "doi_chieu_D_1",
      "ky_hieu": "danh_gia_9",
      "kqAB": [{
        text: 'A',
        value: 'a'
      },
      {
        text: 'B',
        value: 'b'
      },
      {
        text: 'C',
        value: 'c'
      }
      ],
      "items": [{
        "noi_dung": "(A)  Không có sản phẩm triệu hồi hoặc chủ động thực hiện triệu hồi và báo cáo đúng quy định",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(B)  Chậm chễ trong việc thực hiện triệu hồi theo kế hoạch, báo cáo không kịp thời",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "(C)  Cơ quan QLCL bắt buộc thực hiện triệu hồi",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    }
    ],
    "doi_chieu_A": [{
      "stt": 1,
      "noi_dung": "Nhà xưởng được xây dựng trên khu đất thuộc quyền sử dụng hợp pháp của doanh nghiệp.",
      "id": "doi_chieu_A_1",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 2,
      "noi_dung": "Nhà xưởng phải có đủ diện tích để bố trí các dây chuyền sản xuất, lắp ráp, kiểm tra phù hợp quy trình công nghệ sản xuất, lắp ráp ô tô",
      "id": "doi_chieu_A_2",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 3,
      "noi_dung": "Nền nhà xưởng phải được sơn chống trơn hoặc có biện pháp khác nhằm chống trơn trượt và có vạch chỉ giới phân biệt lối đi an toàn và khu vực lắp đặt, bố trí các dây chuyền sản xuất.",
      "id": "doi_chieu_A_3",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 4,
      "noi_dung": "Các sơ đồ quy trình công nghệ tổng thể và theo từng công đoạn sản xuất, lắp ráp phải được bố trí ở nơi thuận tiện thực hiện, theo dõi và kiểm soát quy trình.",
      "id": "doi_chieu_A_4",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 5,
      "noi_dung": "Nhà xưởng phải được trang bị các hệ thống, trang thiết bị phụ trợ khác như: Hệ thống điện công nghiệp - điện sinh hoạt; hệ thống cấp nước công nghiệp - sinh hoạt; hệ thống thông gió; hệ thống cung cấp và phân phối khí nén; máy phát điện dự phòng, bãi đậu xe, khu vực thu hồi, xử lý sản phẩm thải bỏ",
      "id": "doi_chieu_A_5",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    }
    ],
    "doi_chieu_B": [{
      "stt": 1,
      "noi_dung": "Dây chuyền lắp ráp khung, thân xe",
      "id": "doi_chieu_B_1",
      "items": [{
        "noi_dung": "+ Hệ thống nâng hạ, xe vận chuyển gá đẩy chuyên dụng theo dây chuyền, hệ thống ray dẫn hướng dùng cho xe gá đẩy",
        "id": "doi_chieu_B_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Đối với ô tô con: Các đồ gá hàn lắp cho sườn trái, sườn phải, mui xe, sàn xe, đuôi xe và cho lắp các cụm khung, vỏ",
        "id": "doi_chieu_B_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Đối với ô tô khách: các đồ gá cho hàn lắp các dầm ngang dọc của khung",
        "id": "doi_chieu_B_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Đối với ô tô tải: Đồ gá lắp thùng chở hàng vào thân",
        "id": "doi_chieu_B_1_4",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Các đồ gá chuyên dụng cho ghép mảng, cụm vỏ ô tô vào khung",
        "id": "doi_chieu_B_1_5",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Các trang thiết bị phụ, sửa chữa đi kèm",
        "id": "doi_chieu_B_1_6",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 2,
      "noi_dung": "Dây chuyền lắp ráp tổng thành: Lắp ráp các cụm tổng thành, hệ thống gầm, cầu sau, cầu trước và động cơ vào khung, các cụm điều khiển chính",
      "id": "doi_chieu_B_2",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 3,
      "noi_dung": "Dây chuyền lắp ráp tổng thành: Lắp ráp các cụm tổng thành, hệ thống gầm, cầu sau, cầu trước và động cơ vào khung, các cụm điều khiển chính",
      "id": "doi_chieu_B_3",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 4,
      "noi_dung": "Dây chuyền lắp ráp tổng thành: Lắp ráp các cụm tổng thành, hệ thống gầm, cầu sau, cầu trước và động cơ vào khung, các cụm điều khiển chính",
      "id": "doi_chieu_B_4",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    }
    ],
    "doi_chieu_C": [{
      "stt": 1,
      "noi_dung": "Máy hàn, thiết bị hàn và đồ gá chuyên dùng",
      "id": "doi_chieu_C_1",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 2,
      "noi_dung": "Hệ thống nâng, hạ, vận chuyển gá đẩy chuyên dụng theo dây chuyền",
      "id": "doi_chieu_C_2",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 3,
      "noi_dung": "Đồ gá hàn các mảng thân ô tô",
      "id": "doi_chieu_C_3",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    }
    ],
    "doi_chieu_D": [{
      "stt": 1,
      "noi_dung": "Dây chuyền sơn tự động hoặc bán tự động",
      "id": "doi_chieu_D_1",
      "items": [{
        "noi_dung": "+ Làm sạch và xử lý bề mặt",
        "id": "doi_chieu_D_1_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Rửa, loại bỏ khoáng chất và điều hòa thể tích",
        "id": "doi_chieu_D_1_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Sơn nhúng điện ly, sơn phun, sơn áp lực, sấy",
        "id": "doi_chieu_D_1_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Chống thấm nước",
        "id": "doi_chieu_D_1_4",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Sơn trang trí, sơn bóng lớp ngoài cùng và phủ sáp để bảo vệ nước sơn",
        "id": "doi_chieu_D_1_5",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 2,
      "noi_dung": "Kỹ thuật công nghệ sơn",
      "id": "doi_chieu_D_2",
      "items": [{
        "noi_dung": "+ Đối với ô tô con: Thân vỏ ô tô phải được sơn nhúng điện ly lớp bên trong; lớp ngoài thân vỏ ô tô được sơn phun",
        "id": "doi_chieu_D_2_1",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Đối với ô tô khách: Thân vỏ ô tô phải được sơn nhúng điện ly toàn bộ hoặc từng phần trước khi được sơn màu",
        "id": "doi_chieu_D_2_2",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      },
      {
        "noi_dung": "+ Đối với ô tô tải: Cabin ô tô được sơn nhúng điện ly lớp bên trong và sơn phun lớp bên ngoài; khung ô tô được sơn phun",
        "id": "doi_chieu_D_2_3",
        "thong_bao": 2,
        "ket_qua": 2,
        "ket_luan": 1
      }
      ]
    },
    {
      "stt": 3,
      "noi_dung": "Các thiết bị kiểm tra các chỉ tiêu chất lượng lớp sơn: Độ dày, độ bóng, độ bám dính bề mặt",
      "id": "doi_chieu_D_3",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    }
    ],
    "doi_chieu_E": [{
      "stt": 1,
      "noi_dung": "Các thiết bị kiểm tra chuyên dùng theo tùng công đoạn lắp ráp",
      "id": "doi_chieu_E_1",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 2,
      "noi_dung": "Các thiết bị kiểm tra các chỉ tiêu xuất xưởng",
      "id": "doi_chieu_E_2",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 3,
      "noi_dung": "Hệ thống máy tính lưu trữ các kết quả kiểm tra chỉ tiêu ô tô lắp ráp xuất xưởng",
      "id": "doi_chieu_E_3",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    }
    ],
    "doi_chieu_F": [{
      "stt": 1,
      "noi_dung": "Đường bằng phẳng",
      "id": "doi_chieu_F_1",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 2,
      "noi_dung": "Đường sỏi đá",
      "id": "doi_chieu_F_2",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 3,
      "noi_dung": "Đường gồ ghề",
      "id": "doi_chieu_F_3",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 4,
      "noi_dung": "Đường gợn sóng",
      "id": "doi_chieu_F_4",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 5,
      "noi_dung": "Đường dốc lên xuống",
      "id": "doi_chieu_F_5",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 6,
      "noi_dung": "Đường trơn ướt",
      "id": "doi_chieu_F_6",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    },
    {
      "stt": 7,
      "noi_dung": "Đường cua",
      "id": "doi_chieu_F_7",
      "thong_bao": 2,
      "ket_qua": 2,
      "ket_luan": 1
    }
    ],
    "phan_nhom_1": [{
      "noi_dung": "(A) Địa điểm sản xuất có tính ổn định cao, có quyền sử dụng hợp pháp trong thời gian từ 10 năm trở lên",
      "id": "phan_nhom_1_1",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(B) Địa điểm sản xuất có tính ổn định trung bình, có quyền sử dụng hợp pháp trong thời gian từ 5- dưới 10 năm",
      "id": "phan_nhom_1_2",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(C) Địa điểm sản xuất có tính ổn định thấp, có quyền sử dụng hợp pháp trong thời gian dưới 5 năm",
      "id": "phan_nhom_1_3",
      "thong_bao": 1,
      "ket_qua": 1
    }
    ],
    "phan_nhom_2": [{
      "noi_dung": "(A) Lớn: từ 10.000 xe/năm trở lên",
      "id": "phan_nhom_2_1",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(B) Trung bình: từ 500 đến dưới 10.000 xe/năm",
      "id": "phan_nhom_2_2",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(C) Nhỏ: dưới 500 xe/năm",
      "id": "phan_nhom_2_3",
      "thong_bao": 1,
      "ket_qua": 1
    }
    ],
    "phan_nhom_3": [{
      "noi_dung": "(A) Hiện đại, được chuyển giao công nghệ từ các hãng sản xuất thuộc khối các nước thuộc EU, G7 (Hoa Kỳ, Đức, Nhật Bản, Pháp, Anh, Ý, Canada)",
      "id": "phan_nhom_3_1",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(B) Được chuyển giao công nghệ từ các hãng sản xuất thuộc khối các nước thuộc khối G20 (không bao gồm các nước thuộc EU, G7 đã nêu trên: Hàn Quốc, Argentina, Úc, Brasil, Trung Quốc, Ấn Độ, Indonesia, México, Nga, Ả Rập Xê Út, Nam Phi và Thổ Nhĩ Kỳ) hoặc doanh nghiệp không được chuyển giao công nghệ nhưng có Trung tâm nghiên cứu phát triển sản phẩm riêng",
      "id": "phan_nhom_3_2",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(C) Không thuộc 02 đối tượng trên",
      "id": "phan_nhom_3_3",
      "thong_bao": 1,
      "ket_qua": 1
    }
    ],
    "phan_nhom_4": [{
      "noi_dung": "(A) Được trang bị dây chuyền sản xuất hiện đại, mức độ tự động hóa cao (robot công đoạn hàn, sơn…)",
      "id": "phan_nhom_4_1",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(B) Được trang bị dây chuyền sản xuất đồng bộ, có một số phần điều khiển bán tự động",
      "id": "phan_nhom_4_2",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(C) Hoàn toàn thủ công",
      "id": "phan_nhom_4_3",
      "thong_bao": 1,
      "ket_qua": 1
    }
    ],
    "phan_nhom_5": [{
      "noi_dung": "(A) Có nhân lực được Cơ quan QLCL hoặc nhà sản xuất nước ngoài (bên chuyển giao công nghệ) đào tạo, bồi dưỡng",
      "id": "phan_nhom_5_1",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(B) Có nhân lực được đào tạo bởi các hình thức khác (không thuộc nhóm trên)",
      "id": "phan_nhom_5_2",
      "thong_bao": 1,
      "ket_qua": 1
    }
    ],
    "phan_nhom_6": [{
      "noi_dung": "(A) Có chứng chỉ hệ thống quản lý chất lượng ISO 9001:2015 hoặc IATF16949 hoặc tương đương còn hiệu lực và được duy trì tốt",
      "id": "phan_nhom_6_1",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(B) Có chứng chỉ hệ thống quản lý chất lượng ISO 9001:2015 hoặc IATF 16949 hoặc tương đương còn hiệu lực",
      "id": "phan_nhom_6_2",
      "thong_bao": 1,
      "ket_qua": 1
    },
    {
      "noi_dung": "(C) Có chứng chỉ hệ thống quản lý chất lượng ISO 9001:2015 hoặc IATF 16949 hoặc tương đương còn hiệu lực nhưng không được duy trì tốt hoặc chưa có chứng chỉ hệ thống quản lý chất lượng",
      "id": "phan_nhom_6_3",
      "thong_bao": 1,
      "ket_qua": 1
    }
    ],
    "phan_nhom_7": [{
      "noi_dung": "(A)Không có nội dung cần khắc phục",
      "id": "phan_nhom_7_1",
      "ket_qua": 1
    },
    {
      "noi_dung": "(B)Có đến 03 nội dung cần khắc phục",
      "id": "phan_nhom_7_2",
      "ket_qua": 1
    },
    {
      "noi_dung": "(C)Có trên 03 nội dung cần khắc phục",
      "id": "phan_nhom_7_3",
      "ket_qua": 1
    }
    ],
    "phan_nhom_8": [{
      "noi_dung": "(A)Không bị tạm dừng xuất xưởng sản phẩm",
      "id": "phan_nhom_8_1",
      "ket_qua": 1
    },
    {
      "noi_dung": "(B)Bị tạm dừng xuất xưởng 01 kiểu loại sản phẩm",
      "id": "phan_nhom_8_2",
      "ket_qua": 1
    },
    {
      "noi_dung": "(C)Bị tạm dừng xuất xưởng một kiểu loại sản phẩm từ 02 lần trở lên hoặc bị tạm dừng xuất xưởng đồng thời từ 02 kiểu loại sản phẩm trở lên",
      "id": "phan_nhom_8_3",
      "ket_qua": 1
    }
    ],
    "phan_nhom_9": [{
      "noi_dung": "(A)Không có sản phẩm triệu hồi hoặc chủ động thực hiện triệu hồi và báo cáo đúng quy định",
      "id": "phan_nhom_9_1",
      "ket_qua": 1
    },
    {
      "noi_dung": "(B)Chậm chễ trong việc thực hiện triệu hồi theo kế hoạch, báo cáo không kịp thời",
      "id": "phan_nhom_9_2",
      "ket_qua": 1
    },
    {
      "noi_dung": "(C)Cơ quan QLCL bắt buộc thực hiện triệu hồi",
      "id": "phan_nhom_9_3",
      "ket_qua": 1
    }
    ]
  };
  var sampleDataCSBHBD = {
    "count": 0,
    "dang_kiem_vien_1": "#userAction@PPC",
    "1_1_1": "#ten_doanh_nghiep@TT302011BGTVTCOPTTDN",
    "1_1_2": "#dia_chi_chinh_doanh_nghiep@TT302011BGTVTCOPTTDN",
    "ma_so_tai_khoan": "#ma_so_tai_khoan@TT302011BGTVTCOPTTDN",
    "ma_so_nha_xuong": "#ma_so_xuong@TT302011BGTVTCOPTTDN",
    "productionplantcode": "#list_nha_xuong@TT302011BGTVTCOPTTDN",
    "copclassification": "#loai_hinh_san_xuat@TT302011BGTVTCOPTTDN",
    "loai_hinh_danh_gia": "#loai_ho_so_cop@TT302011BGTVTCOPTTDN",
    "1_1_3": "#ten_xuong_san_xuat@TT302011BGTVTCOPTTDN",
    "1_1_4": "#dia_chi_xuong_san_xuat@TT302011BGTVTCOPTTDN",
    "thiet_bi_xuat_xuong": "#thiet_bi_xuat_xuong@TT302011BGTVTCOPTTDN",
    "hop_dong": "#hop_dong@TT302011BGTVTCOPTTDN",
    "kl_1_1_1": 2,
    "kl_1_1_2": 2,
    "kl_1_1_3": 2,
    "kl_1_1_4": 2,
    "kl_1_1_5": 2,
    "kl_1_1_6": 2,
    "part1": [{
      "stt": "1",
      "noi_dung": "<span style='font-weight:bold;'>Tài liệu chứng minh tư cách pháp nhân của doanh nghiệp và các tài liệu liên quan</span>",
      "ky_hieu": "",
      "items": "",
      "ket_luan": ""

    },
    {
      "stt": "1.1",
      "noi_dung": "<span style='font-weight:bold;'>Sự phù hợp của giấy chứng nhận đăng ký doanh nghiệp hoặc giấy tờ có giá trị pháp lý tương đương</span>",
      "ky_hieu": "",
      "items": "",
      "ket_luan": ""

    },
    {
      "stt": "1.1.1",
      "noi_dung": "<span style='font-weight:bold;'>Tên và địa chỉ trụ sở chính:</span>",
      "ky_hieu": "nd_1_1_1",
      "diem_nd": "diem_nd_1_1_1",
      "nd_result": "nd_1_1_1_result",
      "mt_nd": "mt_nd_1_1_1",
      "nd_1_1_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Khác hồ sơ"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Đúng hồ sơ"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"
    },
    {
      "stt": "1.1.2",
      "noi_dung": "<span style='font-weight:bold;'>Địa điểm kinh doanh:</span>",
      "ky_hieu": "nd_1_1_2",
      "diem_nd": "diem_nd_1_1_2",
      "nd_result": "nd_1_1_2_result",
      "mt_nd": "mt_nd_1_1_2",
      "nd_1_1_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Khác hồ sơ"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Đúng hồ sơ"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "1.1.3",
      "noi_dung": "<span style='font-weight:bold;'>Địa điểm kinh doanh:</span>",
      "ky_hieu": "nd_1_1_3",
      "diem_nd": "diem_nd_1_1_3",
      "nd_result": "nd_1_1_3_result",
      "mt_nd": "mt_nd_1_1_3",
      "nd_1_1_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không phù hợp"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Phù hợp"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "1.2",
      "noi_dung": "<span style='font-weight:bold;'>Tài liệu chứng minh quyền sử dụng hợp pháp khu đất xây dựng nhà xưởng của cơ sở</span>",
      "ky_hieu": "nd_1_2",
      "diem_nd": "diem_nd_1_2",
      "nd_result": "nd_1_2_result",
      "mt_nd": "mt_nd_1_2",
      "nd_1_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không phù hợp"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Phù hợp"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "1.3",
      "noi_dung": "<span style='font-weight:bold;'>Tài liệu chứng minh cam kết hỗ trợ kỹ thuật và cung cấp linh kiện, phụ kiện phục vụ việc bảo hành, bảo dưỡng ô tô của DN SXLR hoặc DN SXLR ô tô nước ngoài </span>",
      "ky_hieu": "nd_1_3",
      "diem_nd": "diem_nd_1_3",
      "nd_result": "nd_1_3_result",
      "mt_nd": "mt_nd_1_3",
      "nd_1_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không phù hợp"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Phù hợp"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2",
      "noi_dung": "<span style='font-weight:bold;'>Đánh giá về mặt bằng và các khu vực cơ sở</span>",
      "ky_hieu": "",
      "items": "",
      "ket_luan": ""

    },
    {
      "stt": "2.1",
      "noi_dung": "<span style='font-weight:bold;'>Mặt bằng tổng thể của cơ sở gồm: nhà xưởng, phòng điều hòa, kho phụ tùng, đường giao thông nội bộ, khu vực rửa xe, khu vực bàn giao xe, nơi tập kết rác công nghiệp</span>",
      "ky_hieu": "nd_2_1",
      "diem_nd": "diem_nd_2_1",
      "nd_result": "nd_2_1_result",
      "mt_nd": "mt_nd_2_1",
      "nd_2_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có đủ các hạng mục nêu trên"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có đủ các hạng mục nhưng không đảm bảo khả năng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có đủ các hạng mục và có thể hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và được bố trí phân cách thành các khu vực theo không gian riêng biệt"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và bố trí các khu vực hợp lý, thuận tiện"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.2",
      "noi_dung": "<span style='font-weight:bold;'>Nhà xưởng được xây dựng chắc chắn, có mái che, cửa ra vào phù hợp với loại xe bảo hành bảo dưỡng</span>",
      "ky_hieu": "nd_2_2",
      "diem_nd": "diem_nd_2_2",
      "nd_result": "nd_2_2_result",
      "mt_nd": "mt_nd_2_2",
      "nd_2_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không đảm bảo yêu cầu"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Đảm bảo yêu cầu nhưng không phù hợp với kiểu loại xe đăng ký bảo hành, bảo dưỡng"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Đảm bảo yêu cầu, phù hợp với kiểu loại xe đăng ký bảo hành, bảo dưỡng, chỉ phù hợp với bảo hành, bảo dưỡng quy mô nhỏ"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Đảm bảo yêu cầu,  phù hợp với kiểu loại xe đăng ký bảo hành, bảo dưỡng,  có thể thực hiện bảo hành, bảo dưỡng quy mô trung bình"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Đảm bảo yêu cầu, phù hợp với kiểu loại xe đăng ký bảo hành, bảo dưỡng, có khả năng bảo hành, bảo dưỡng quy mô lớn"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.3",
      "noi_dung": "<span style='font-weight:bold;'>Nhà xưởng được bố trí thông thoáng hoặc có hệ thống gió, có hệ thống chiếu sáng phù hợp với điều kiện làm việc, phù hợp với điều kiện vệ sinh công nghiệp, không bị ảnh hưởng bởi các điều kiện thời tiết</span>",
      "ky_hieu": "nd_2_3",
      "diem_nd": "diem_nd_2_3",
      "nd_result": "nd_2_3_result",
      "mt_nd": "mt_nd_2_3",
      "nd_2_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có đủ các điều kiện yêu cầu"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có đủ các điều kiện yêu cầu"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Như (2) và có các trang bị hệ thống điều hòa hoặc có dụng cụ chuyên dụng để giảm thiểu tối đa độc hại cho KTV ở từng vị trí làm việc"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thêm hệ thống điều hòa hoặc có dụng cụ chuyên dụng để giảm thiểu tối đa độc hại cho KTV ở từng vị trí làm việc"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.4",
      "noi_dung": "<span style='font-weight:bold;'>Các khu vực phục vụ công việc bảo dưỡng, sửa chữa và các khu vực khác có số lượng tối thiểu theo quy định tại phụ lục I. Các khu vực được phân chia rõ ràng, có biển báo, chỉ dẫn phù hợp</span>",
      "ky_hieu": "nd_2_4",
      "diem_nd": "diem_nd_2_4",
      "nd_result": "nd_2_4_result",
      "mt_nd": "mt_nd_2_4",
      "nd_2_4_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Số lượng không thỏa mãn yêu cầu hoặc không có hệ thống biển báo, chỉ dẫn"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Số lượng thỏa mãn yêu cầu nhưng không đảm bảo để thực hiện công việc hoặc hệ thống biển báo, chỉ dẫn không phù hợp"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Số lượng thỏa mãn yêu cầu, đảm bảo thực hiện công việc bình thường và có biển báo, chỉ dẫn phù hợp. "
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và  được bố trí hợp lý, thuận tiện, đảm bảo lưu thông tốt trong quá trình hoạt động."
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.5",
      "noi_dung": "<span style='font-weight:bold;'>Giải pháp ngăn cách khu vực sơn, khu vực rửa xe với những khu vực khác (trong trường hợp các khu vực này được bố trí trong cùng nhà xưởng)</span>",
      "ky_hieu": "nd_2_5",
      "diem_nd": "diem_nd_2_5",
      "nd_result": "nd_2_5_result",
      "mt_nd": "mt_nd_2_5",
      "nd_2_5_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có giải pháp ngăn cách tại khu vực sơn và rửa xe với các khu vực khác"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có giải pháp ngăn cách nhưng không triệt để"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có giải pháp ngăn cách, đảm bảo không gây ảnh hưởng tới các khu vực xung quanh. "
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Có giải pháp ngăn cách tách biệt hoàn toàn với khu vực xung quanh. "
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.6",
      "noi_dung": "<span style='font-weight:bold;'>Các khu vực của Cơ sở có thể được bố trí tại các nhà xưởng khác nhau. Các nhà xưởng này có thể nằm trong cùng khuôn viên đất hoặc trong các khuôn viên đất khác nhau trong cùng một cụm công nghiệp hoặc khu công nghiệp</span>",
      "ky_hieu": "nd_2_6",
      "diem_nd": "diem_nd_2_6",
      "nd_result": "nd_2_6_result",
      "mt_nd": "mt_nd_2_6",
      "nd_2_6_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không phù hợp"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Phù hợp"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "2.7",
      "noi_dung": "<span style='font-weight:bold;color: red;'>Kích thước tối thiểu đối với từng vị trí làm việc phù hợp với loại xe thực hiện bảo dưỡng, sửa chữa và không nhỏ hơn các giá trị quy định tại TCVN 11794:2017</span>",
      "ky_hieu": "nd_2_7",
      "diem_nd": "diem_nd_2_7",
      "nd_result": "nd_2_7_result",
      "mt_nd": "mt_nd_2_7",
      "nd_2_7_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Kích thước các vị trị làm việc không thỏa mãn yêu cầu"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Kích thước các vị trí làm việc thỏa mãn yêu cầu đối với tất cả kiểu lại xe đăng ký của cơ sở"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "3",
      "noi_dung": "<span style='font-weight:bold;color: red;'>Đánh giá về khả năng thực hiện các công việc tối thiểu tại cơ sở (Cơ sở có khả năng thực hiện các công việc tối thiểu theo quy định tại TCVN 11794:2017).</span>",
      "ky_hieu": "nd_3",
      "diem_nd": "diem_nd_3",
      "nd_result": "nd_3_result",
      "mt_nd": "mt_nd_3",
      "nd_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không thực hiện đủ"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Thực hiện đủ nhưng không phù hợp với loại xe đăng ký bảo hành, bảo dưỡng"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Thực hiện đủ, phù hợp với loại xe đăng ký bảo hành, bảo dưỡng"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và được thực hiện bằng thiết bị, dụng cụ hiện đại, năng suất cao"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và được hỗ trợ việc bảo dưỡng, sửa chữa trực tuyến bởi nhà sản xuất xe."
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4",
      "noi_dung": "<span style='font-weight:bold;'>Đánh giá về các trang thiết bị phụ vụ bảo hành bảo dưỡng</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "4.1",
      "noi_dung": "<span style=''><strong>Dụng cụ đồ nghề phục vụ bảo dưỡng có số lượng và chủng loại phù hợp với quy mô của cơ sở và loại xe thực hiện bảo dưỡng, sửa chữa</strong></span>",
      "ky_hieu": "nd_4_1",
      "diem_nd": "diem_nd_4_1",
      "nd_result": "nd_4_1_result",
      "mt_nd": "mt_nd_4_1",
      "nd_4_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Số lượng và chủng loại không phù hợp với quy mô của cơ sở và loại xe thực hiện bảo dưỡng, sửa chữa"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Đủ số lượng, chủng loại nhưng không phù hợp với kiểu loai xe hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Đầy đủ số lượng, chủng loại , phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và trang bị tới tất cả các vị trí làm việc"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có trang bị dự phòng"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2",
      "noi_dung": "<span style='font-weight:bold;'>Dụng cụ và thiết bị chuyên dùng</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "4.2.1",
      "noi_dung": "<span><strong>Cầu nâng hoặc bàn nâng xe</strong>(áp dụng đối với cơ sở bảo hành, bảo dưỡng các loại xe ô tô con, ô tô khách từ 16 chỗ trở xuống, ô tô VAN, ô tô PICKUP, ô tô tải và ô tô chuyên dùng có khối lượng toàn bộ đến 3,5 tấn)</span>",
      "ky_hieu": "nd_4_2_1",
      "diem_nd": "diem_nd_4_2_1",
      "nd_result": "nd_4_2_1_result",
      "mt_nd": "mt_nd_4_2_1",
      "nd_4_2_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và được kiểm định định kỳ"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.2",
      "noi_dung": "<span><strong>Hầm kiểm tra xe</strong>(áp dụng đối với cơ sở bảo hành, bảo dưỡng các loại ô tô khác trong trường hợp cơ sở không trang bị cầu nâng hoặc bàn nâng xe phù hợp)</span>",
      "ky_hieu": "nd_4_2_1",
      "diem_nd": "diem_nd_4_2_1",
      "nd_result": "nd_4_2_1_result",
      "mt_nd": "mt_nd_4_2_1",
      "nd_4_2_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và được kiểm định định kỳ"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.3",
      "noi_dung": "<span><strong>Kích nâng, mễ kê</strong></span>",
      "ky_hieu": "nd_4_2_3",
      "diem_nd": "diem_nd_4_2_3",
      "nd_result": "nd_4_2_3_result",
      "mt_nd": "mt_nd_4_2_3",
      "nd_4_2_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không đầy đủ, không phù hợp với loại xe đăng ký bảo hành, bảo dưỡng hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có đầy đủ, phù hợp, hoạt động bình thường"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.4",
      "noi_dung": "<span><strong>Dụng cụ hứng dầu thải, bơm dầu, bơm mỡ</strong></span>",
      "ky_hieu": "nd_4_2_4",
      "diem_nd": "diem_nd_4_2_4",
      "nd_result": "nd_4_2_4_result",
      "mt_nd": "mt_nd_4_2_4",
      "nd_4_2_4_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2)  Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có tối thiểu một bơm dầu động cơ cho 2 khoang sửa chữa."
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.5",
      "noi_dung": "<span><strong>Các dụng cụ chuyên dùng phục vụ tháo lắp</strong></span>",
      "ky_hieu": "nd_4_2_5",
      "diem_nd": "diem_nd_4_2_5",
      "nd_result": "nd_4_2_5_result",
      "mt_nd": "mt_nd_4_2_5",
      "nd_4_2_5_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có hệ thống quản lý (cấp phát, lưu trữ) hiệu quả."
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.6",
      "noi_dung": "<span><strong>Các dụng cụ kiểm tra lực siết</strong></span>",
      "ky_hieu": "nd_4_2_6",
      "diem_nd": "diem_nd_4_2_6",
      "nd_result": "nd_4_2_6_result",
      "mt_nd": "mt_nd_4_2_6",
      "nd_4_2_6_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và trang bị tại từng vị trí thực hiện công việc bảo dưỡng"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.7",
      "noi_dung": "<span><strong>Các loại thiết bị, dụng cụ kiểm tra hệ thống điện</strong></span>",
      "ky_hieu": "nd_4_2_7",
      "diem_nd": "diem_nd_4_2_7",
      "nd_result": "nd_4_2_7_result",
      "mt_nd": "mt_nd_4_2_7",
      "nd_4_2_7_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có có thiết bị, dụng cụ kiểm tra chuyên dùng hiện đại"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.8",
      "noi_dung": "<span><strong>Thiết bị sạc ác quy</strong></span>",
      "ky_hieu": "nd_4_2_8",
      "diem_nd": "diem_nd_4_2_8",
      "nd_result": "nd_4_2_8_result",
      "mt_nd": "mt_nd_4_2_8",
      "nd_4_2_8_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thêm các chức năng hỗ trợ khác"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.9",
      "noi_dung": "<span><strong>Các thiết bị kiểm tra hệ thông nhiên liệu</strong></span>",
      "ky_hieu": "nd_4_2_9",
      "diem_nd": "diem_nd_4_2_9",
      "nd_result": "nd_4_2_9_result",
      "mt_nd": "mt_nd_4_2_9",
      "nd_4_2_9_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thiết bị kiểm tra hiện đại"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.10",
      "noi_dung": "<span><strong>Thiết bị kiểm tra bảo dưỡng hệ thống điều hòa (đối với cơ sở bảo hành, bảo dưỡng xe ô tô có hệ thống điều hòa)</strong></span>",
      "ky_hieu": "nd_4_2_10",
      "diem_nd": "diem_nd_4_2_10",
      "nd_result": "nd_4_2_10_result",
      "mt_nd": "mt_nd_4_2_10",
      "nd_4_2_10_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thiết bị kiểm tra hiện đại"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.11",
      "noi_dung": "<span><strong>Thiết bị chẩn đoán động cơ và tình trạng kỹ thuật của xe</strong></span>",
      "ky_hieu": "nd_4_2_11",
      "diem_nd": "diem_nd_4_2_11",
      "nd_result": "nd_4_2_11_result",
      "mt_nd": "mt_nd_4_2_11",
      "nd_4_2_11_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường, phần mềm tuân thủ quy định sở hữu trí tuệ"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thể tra cứu tài liệu sửa chữa trên thiết bị"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có thể kết nối trực tuyến với hệ thống mạng của nhà sản xuất để hướng dẫn, hỗ trợ và kiểm soát trong quá trình bảo hành, bảo dưỡng"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.12",
      "noi_dung": "<span><strong>Thiết bị động cơ</strong></span>",
      "ky_hieu": "nd_4_2_12",
      "diem_nd": "diem_nd_4_2_12",
      "nd_result": "nd_4_2_12_result",
      "mt_nd": "mt_nd_4_2_12",
      "nd_4_2_12_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.13",
      "noi_dung": "<span><strong>Dụng cụ hoặc thiết bị đo dộ chụm xe dẫn hướng</strong></span>",
      "ky_hieu": "nd_4_2_13",
      "diem_nd": "diem_nd_4_2_13",
      "nd_result": "nd_4_2_13_result",
      "mt_nd": "mt_nd_4_2_13",
      "nd_4_2_13_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và là thiết bị điện tử"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có khả năng in và lưu trữ kết quả kiểm tra"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.14",
      "noi_dung": "<span><strong>Dụng cụ, thiết bị bảo dưỡng, sửa chữa thân vỏ</strong></span>",
      "ky_hieu": "nd_4_2_14",
      "diem_nd": "diem_nd_4_2_14",
      "nd_result": "nd_4_2_14_result",
      "mt_nd": "mt_nd_4_2_14",
      "nd_4_2_14_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có các thiết bị hiện đại hỗ trợ KTV trong hoạt động sửa chữa"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.15",
      "noi_dung": "<span><strong>Bơm nước rửa xe</strong></span>",
      "ky_hieu": "nd_4_2_15",
      "diem_nd": "diem_nd_4_2_15",
      "nd_result": "nd_4_2_15_result",
      "mt_nd": "mt_nd_4_2_15",
      "nd_4_2_15_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thêm chức năng rửa xe bằng nước nóng"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.16",
      "noi_dung": "<span><strong>Máy nén khí</strong></span>",
      "ky_hieu": "nd_4_2_16",
      "diem_nd": "diem_nd_4_2_16",
      "nd_result": "nd_4_2_16_result",
      "mt_nd": "mt_nd_4_2_16",
      "nd_4_2_16_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và được bố trí tại khu vực riêng biệt, giảm ồn và ảnh hưởng tới các khu vực khác"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.17",
      "noi_dung": "<span><strong>Thiết bị phun sơn</strong></span>",
      "ky_hieu": "nd_4_2_17",
      "diem_nd": "diem_nd_4_2_17",
      "nd_result": "nd_4_2_17_result",
      "mt_nd": "mt_nd_4_2_17",
      "nd_4_2_17_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường, có trang bị bảo hộ cho KTV"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thiết bị pha sơn tại cơ sở"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có thiết bị kiểm tra chất lượng sơn (chiều dày lớp sơn, màu sắc..)"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "4.2.18",
      "noi_dung": "<span><strong>Thiết bị sấy phục vụ sơn</strong></span>",
      "ky_hieu": "nd_4_2_18",
      "diem_nd": "diem_nd_4_2_18",
      "nd_result": "nd_4_2_18_result",
      "mt_nd": "mt_nd_4_2_18",
      "nd_4_2_18_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và là phòng sấy kín"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và là phòng sấy áp dụng công nghệ giảm thiểu tác động xấu đến môi trường"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5",
      "noi_dung": "<span style='font-weight:bold;'>Đánh giá về thiết bị kiểm tra xuất xưởng</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "5.1",
      "noi_dung": "<span style=''><strong>Thiết bị kiểm tra độ trượt ngang</strong></span>",
      "ky_hieu": "nd_5_1",
      "diem_nd": "diem_nd_5_1",
      "nd_result": "nd_5_1_result",
      "mt_nd": "mt_nd_5_1",
      "nd_5_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thể in kết quả kiểm tra"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có thể lưu trữ dữ liệu kiểm tra của các lần kiểm tra trước đó"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.2",
      "noi_dung": "<span style=''><strong>Thiết bị kiểm tra góc đặt bánh xe(với cơ sở đăng ký bảo hành, bảo dưỡng ô tô có hệ thống treo độc lập)</strong></span>",
      "ky_hieu": "nd_5_2",
      "diem_nd": "diem_nd_5_2",
      "nd_result": "nd_5_2_result",
      "mt_nd": "mt_nd_5_2",
      "nd_5_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và là thiết bị điện tử"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có khả năng in và lưu trữ kết quả kiểm tra"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.3",
      "noi_dung": "<span style=''><strong>Thiết bị kiểm tra góc quay lại của bánh xe dẫn hướng</strong></span>",
      "ky_hieu": "nd_5_3",
      "diem_nd": "diem_nd_5_3",
      "nd_result": "nd_5_3_result",
      "mt_nd": "mt_nd_5_3",
      "nd_5_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và là thiết bị điện tử"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có khả năng in và lưu trữ kết quả kiểm tra"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.4",
      "noi_dung": "<span style=''><strong>Thiết bị kiểm tra lực phanh</strong></span>",
      "ky_hieu": "nd_5_4",
      "diem_nd": "diem_nd_5_4",
      "nd_result": "nd_5_4_result",
      "mt_nd": "mt_nd_5_4",
      "nd_5_4_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và là thiết bị điện tử"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có thể lưu trữ dữ liệu kiểm tra của các lần kiểm tra trước đó"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.5",
      "noi_dung": "<span style=''><strong>Thiết bị kiểm đèn chiếu sáng phía trước</strong></span>",
      "ky_hieu": "nd_5_5",
      "diem_nd": "diem_nd_5_5",
      "nd_result": "nd_5_5_result",
      "mt_nd": "mt_nd_5_5",
      "nd_5_5_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thể in kết quả kiểm tra"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có thể lưu trữ dữ liệu kiểm tra của các lần kiểm tra trước đó"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.6",
      "noi_dung": "<span style=''><strong>Thiết bị kiểm tra khí thải động cơ</strong></span>",
      "ky_hieu": "nd_5_6",
      "diem_nd": "diem_nd_5_6",
      "nd_result": "nd_5_6_result",
      "mt_nd": "mt_nd_5_6",
      "nd_5_6_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không phù hợp hoặc không đảm bảo tình trạng hoạt động"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có, phù hợp, hoạt động bình thường"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thể in kết quả kiểm tra"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) Như (4) và có thể lưu trữ dữ liệu kiểm tra của các lần kiểm tra trước đó"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.7",
      "noi_dung": "<span style=''><strong>Việc bảo dưỡng, kiểm tra xác nhận tình trạng hoạt động của các thiết bị kiểm tra xuất xưởng</strong></span>",
      "ky_hieu": "nd_5_7",
      "diem_nd": "diem_nd_5_7",
      "nd_result": "nd_5_7_result",
      "mt_nd": "mt_nd_5_7",
      "nd_5_7_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không thực hiện."
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có thực hiện bảo dưỡng nhưng không kiểm tra xác nhận tình trạng hoạt động định kỳ hoặc ngược lại."
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Thực hiện đầy đủ việc bảo dưỡng và kiểm tra xác nhận tình trạng hoạt động định kỳ"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và việc kiểm tra xác nhận tình trạng hoạt động được thực hiện bởi các cơ quan có chức năng"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "5.8",
      "noi_dung": "<span style=''><strong>Việc bảo dưỡng, kiểm tra xác nhận tình trạng hoạt động của các thiết bị kiểm tra xuất xưởng</strong></span>",
      "ky_hieu": "nd_5_8",
      "diem_nd": "diem_nd_5_8",
      "nd_result": "nd_5_8_result",
      "mt_nd": "mt_nd_5_8",
      "nd_5_8_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có bộ phận che chắn."
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có nhưng không đầy đủ cho tất cả các thiết bị."
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có đầy đủ"
      },
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "6",
      "noi_dung": "<span style='font-weight:bold;'>Cơ sở có ít nhất một người phụ trách kỹ thuật.Người phụ trách kỹ thuật có bằng, chứng chỉ liên quan đến kỹ thuật về bảo dưỡng, sửa chữa xe hoặc tương đương và có ít nhất 05 năm kinh nghiệm</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "6.1",
      "noi_dung": "<span style=''><strong>Việc bảo dưỡng, kiểm tra xác nhận tình trạng hoạt động của các thiết bị kiểm tra xuất xưởng</strong></span>",
      "ky_hieu": "nd_6_1",
      "diem_nd": "diem_nd_6_1",
      "nd_result": "nd_6_1_result",
      "mt_nd": "mt_nd_6_1",
      "nd_6_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có phụ trách kỹ thuật."
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có phụ trách kỹ thuật nhưng bằng, chứng chỉ liên quan, và số năm kinh nghiệm không đáp ứng yêu cầu"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Phụ trách kỹ thuật có bằng, chứng chỉ và kinh nghiệm đáp ứng quy định"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có chứng chỉ đào tạo của hãng sản xuất ô tô"
      },
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "6.2",
      "noi_dung": "<span style=''><strong>Các kỹ thuật viên thực hiện thành thạo công việc được giao, số lượng kỹ thuật viên (KTV) phù hợp với quy mô của cơ sở bảo hành, bảo dưỡng (tối thiểu mỗi vị trí làm việc có một KTV)</strong></span>",
      "ky_hieu": "nd_6_2",
      "diem_nd": "diem_nd_6_2",
      "nd_result": "nd_6_2_result",
      "mt_nd": "mt_nd_6_2",
      "nd_6_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có đủ số lượng KTV"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Đủ số lượng nhưng không thành thạo công việc"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Đủ số lượng, thành thạo công việc"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và đào tạo nâng cao bởi nhà sản xuất"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và có thể đào tạo người khác công việc"
      },
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "6.3",
      "noi_dung": "<span style=''><strong>Kỹ thuật viên thực hiện kiểm tra xuất xưởng phải nắm vững các quy định về an toàn kỹ thuật và bảo vệ môi trường đối với xe cơ giới & sử dụng thành thạo các thiết bị kiểm tra xuất xưởng</strong></span>",
      "ky_hieu": "nd_6_3",
      "diem_nd": "diem_nd_6_3",
      "nd_result": "nd_6_3_result",
      "mt_nd": "mt_nd_6_3",
      "nd_6_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không nắm vữn các quy định và không biết sử dụng thiết bị"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Chỉ nắm vững các quy định hoặc chỉ biết sử dụng thiết bị"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Nắm vững quy định và biết sử dụng thiết bị"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thể hướng dẫn người khác thực hiện công việc"
      },
      {
        "gia_tri": "5",
        "chon": "",
        "noi_dung": "(5) như (4) và có thể thực hiện kiểm tra, hiệu chỉnh độ chính xác của thiết bị"
      },
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "6.4",
      "noi_dung": "<span style=''><strong>Các kỹ thuật viên thực hiện nhiệm vụ chạy thử xe phải có giấy phép lái xe phù hợp, còn hiệu lực</strong></span>",
      "ky_hieu": "nd_6_4",
      "diem_nd": "diem_nd_6_4",
      "nd_result": "nd_6_4_result",
      "mt_nd": "mt_nd_6_4",
      "nd_6_4_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có giấy phép lái xe"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có  giấy phép lái xe nhưng không phù hợp với loại xe đăng ký bảo hành, bảo dưỡng hoặc hết hiệu lực"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có giấy phép lái xe phù hợp, còn hiệu lực"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) được sát hạch định kỳ (nội bộ hoặc đơn vị bên ngoài)"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "7",
      "noi_dung": "<span style='font-weight:bold;'>Đánh giá về thực hiện công việc và biểu mẫu</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "7.1",
      "noi_dung": "<span style='font-weight:bold;'>Quy định về thực hiện công việc và biểu mẫu</span>",
      "ky_hieu": "",
      "items": "",
      "gia_tri": "",
      "ket_luan": ""

    },
    {
      "stt": "7.1.1",
      "noi_dung": "<span style='color: red;'><strong>Quy định về thực hiện công việc và các biểu mẫu sử dụng trong hoạt động thực tế.</strong><i>(Quy định về thực hiện công việc phù hợp với quy mô, mô hình hoạt động, phải quy định trách nhiệm nội dung cụ thể và phân chia thành các bước công việc từ  khi tiếp nhận xe đầu vào đến khi bàn giao xe cho khách hàng, đáp ứng được việc quản lý chất lượng bảo dưỡng, sửa chữa và phụ tùng thay thế phù hợp với quy định sản xuất, lắp ráp, nhập khẩu (nếu có))</i></span>",
      "ky_hieu": "nd_7_1_1",
      "diem_nd": "diem_nd_7_1_1",
      "nd_result": "nd_7_1_1_result",
      "mt_nd": "mt_nd_7_1_1",
      "nd_7_1_1_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có quy định về thực hiện công việc và biểu mẫu"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có quy định nhưng không phù hợp"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có quy định và phù hợp"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và thực hiện việc cải tiến liên tục"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "7.1.2",
      "noi_dung": "<span style='color: red;'><strong>Việc áp dụng quy định về thực hiện công việc và các biểu mẫu sử dụng trong hoạt động thực tế</strong></span>",
      "ky_hieu": "nd_7_1_2",
      "diem_nd": "diem_nd_7_1_2",
      "nd_result": "nd_7_1_2_result",
      "mt_nd": "mt_nd_7_1_2",
      "nd_7_1_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không áp dụng"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có áp dụng nhưng không đầy đủ(chỉ áp dụng một phần)"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Áp dụng đầy đủ đúng quy định đã đề ra"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và có thực hiện thống kê, phân tích, cải tiến"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "7.2",
      "noi_dung": "<span style=''><strong>Quy định về bảo hành sau bảo dưỡng, sửa chữa</strong><br/><p>Đảm bảo các phụ tùng do cơ sở cung cấp cho khách hành có chất lượng, nguồn gốc xuất xứ rõ ràng</p><p>Cam kết về bảo hành các mục bảo dưỡng, sửa chữa và phụ tùng do cơ sở cung cấp</p><p>Cam kết được thông tin đầy đủ, công khai đến khách hàng</p></span>",
      "ky_hieu": "nd_7_2",
      "diem_nd": "diem_nd_7_2",
      "nd_result": "nd_7_2_result",
      "mt_nd": "mt_nd_7_2",
      "nd_7_2_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có quy định về bảo hành hoặc quy định bảo hành không đầy đủ các nội dung yêu cầu"
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có những không công khai hoặc công khai những nội dung không rõ ràng, đầy đủ"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có và công bố đầy đủ, công khai về chính sách bảo hành, đảm bảo các nội dung yêu cầu"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và công khai bằng nhiều hình thức để khách hàng dễ dàng tiếp cận"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    {
      "stt": "7.3",
      "noi_dung": "<span style=''><strong>Hệ thống lưu trữ hồ sơ</strong><br/><p>Quy định và thực hiện việc lưu trữ hồ sơ dịch vụ của các xe vào xưởng, bao gồm các nội dung sau:</p><p>-Bộ phận chịu trách nhiệm lưu trữ</p><p>-Các loại hồ sơ, tài liệu lưu trữ và phương pháp lưu trữ tương ứng với từng hồ sơ, tài liệu, cách thức lưu trữ hồ sơ (giấy hoặc máy tính)</p><p>-Cơ sở lưu trữ được các hồ sơ liên quan đến công tác bảo hành, bảo dưỡng, sửa chữa và thể hiện được các nội dung: biển số(nếu có), số khung(số VIN), ngày vào xưởng, ngày ra xưởng, nội dung công việc thực hiện</p><p>Thời gian lưu trữ: tối thiểu 12 tháng kể từ ngày phương tiện được xuất xưởng</p></span>",
      "ky_hieu": "nd_7_3",
      "diem_nd": "diem_nd_7_3",
      "nd_result": "nd_7_3_result",
      "mt_nd": "mt_nd_7_3",
      "nd_7_3_result": 1,
      "items": [{
        "gia_tri": "1",
        "chon": "",
        "noi_dung": "(1) Không có quy định về lưu trữ hồ sơ "
      },
      {
        "gia_tri": "2",
        "chon": "",
        "noi_dung": "(2) Có quy định nhưng không đầy đủ các yêu cầu, hoặc có đầy đủ nhưng không áp dụng"
      },
      {
        "gia_tri": "3",
        "chon": "",
        "noi_dung": "(3) Có quy định phù hợp và thực hiện đầy đủ"
      },
      {
        "gia_tri": "4",
        "chon": "",
        "noi_dung": "(4) Như (3) và dễ tìm kiếm, tra cứu"
      }
      ],
      "gia_tri": "",
      "ket_luan": "1"

    },
    ],
    "part2": [{
      "stt": "8",
      "noi_dung": "<span style='font-weight:bold;'>Có trang bị</span>",
      "ky_hieu": "nd_8",
      "diem_nd": "diem_nd_8",
      "nd_result": "nd_8_result",
      "mt_nd": "mt_nd_8",
      "items": [{}],
      "gia_tri": "",
      "ket_luan": "1"

    },],
  };
  var itemCodeNuocNgoai = 'VR86';

  var dossierViewJX = new VueJX({
    el: 'dossierViewJX',
    pk: 1,
    groupid: themeDisplay.getScopeGroupId(),
    data: {
      loadingInitListGroup: true,
      loadingDialog: false,
      fileTemplateNo: "",
      dossierId: 0,
      dossierFileId: 0,
      dialogTSKT: false,
      menuNgayKiemTraBHBD: false,
      menuNgayDenNgayBHBD: false,
      detailCSBHBD: {},
      popUpThietBiXuatXuongCSBHBD: false,
      indexBBKTGS: -1,
      phanCongDangKiemVien: {},
      phanCongDoiPhong: {},
      totalTraCuu: 0,
      busy: false,
      limit: 15,
      totalXe: 0,
      totalChuaCap: 0,
      kq2: [{
        text: 'Đạt',
        value: 1
      },
      {
        text: 'KĐ',
        value: 4
      },
      ],
      kq3: [{
        text: 'Đạt',
        value: 1
      },
      {
        text: '---',
        value: 4
      }
      ],
      totalSubTotalInDocument: 0,
      indexGCNXuatKho: -1,
      totalMoneyPhieuXuat: 0,
      thongTinGCN: {},
      titleTableSoatXet: 'Đề nghị cấp phiếu',
      detailSoatXetGCN: {},
      popUpDsXeCapPhieu: false,
      phuongThucCapSoatXetItems: [{
        text: 'Phương thức 1',
        value: '1'
      },
      {
        text: 'Phương thức 2',
        value: '2'
      },
      {
        text: 'Phương thức 3',
        value: '3'
      }
      ],
      hinhThucCapSoatXetItems: [{
        text: 'Cấp mới lần đầu',
        value: '1'
      },
      {
        text: 'Cấp thay thế (cho phiếu mất)',
        value: '2'
      },
      {
        text: 'Cấp thay thế (đổi phiếu hỏng)',
        value: '3'
      }
      ],
      donViNhapItems: [],
      stateActionCOP: false,
      indexThietBi: -1,
      popUpkieuLoaiXe: false,
      labelMauCOP: '',
      labelKiemTraMauCOP: '',
      loaiXe: '',
      doOn: '',
      statePopupCOP: '',
      labelPopupThietBiCOP: '',
      popUpThietBiCOP: false,
      labelMucKiemTra: '',
      donVi: '',
      loaiHinhSanXuatItems: [{
        text: 'Khác',
        value: 'KHAC'
      },
      {
        text: 'Linh kiện Xe cơ giới',
        value: 'LKXCG'
      },
      {
        text: 'Linh kiện Xe mô tô, xe gắn máy',
        value: 'LKXMY'
      },
      {
        text: 'Rơ mooc, Sơmi rơ mooc',
        value: 'SMRM'
      },
      {
        text: 'Xe chở hàng bốn bánh có gắn động cơ',
        value: 'XCH'
      },
      {
        text: 'Xe chở người bốn bánh có gắn động cơ',
        value: 'XCN'
      },
      {
        text: 'Xe mô tô, xe gắn máy',
        value: 'XMY'
      },
      {
        text: 'Xe đạp điện',
        value: 'XDD'
      },
      {
        text: 'Ô tô SXLR từ linh kiện rời',
        value: 'XCG'
      },
      {
        text: 'Ô tô SXLR từ xe cơ sở',
        value: 'XCGNK'
      }
      ],
      doiTuongPhieuItems: [{
        text: 'Ô tô SXLR từ linh kiện rời',
        value: 'XCG'
      },
      {
        text: 'Ô tô từ ô tô cơ sở, ô tô sát xi đã được cấp giấy chứng nhận',
        value: 'XCGNK'
      },
      {
        text: 'Rơ moóc, Sơ mi rơ moóc',
        value: 'SMRM'
      },
      {
        text: 'Xe mô tô, xe gắn máy',
        value: 'XMY'
      },
      {
        text: 'Xe mô tô, xe gắn máy động cơ xăng',
        value: 'XMYDCOXANG'
      },
      {
        text: 'Xe mô tô, xe gắn máy điện',
        value: 'XMYDCODIEN'
      },
      {
        text: 'Xe đạp điện',
        value: 'XDD'
      },
      {
        text: 'Xe 4 bánh',
        value: 'XBB'
      }
      ],
      tinhPhuHopItems: [{
        text: 'Phù hợp',
        value: 'PH'
      },
      {
        text: 'Không phù hợp',
        value: 'KPH'
      },
      {
        text: 'NA',
        value: 'NA'
      }
      ],
      thietBiKiemTra: {
        totalD: 0,
        totalKD: 0,
        totalNA: 0
      },
      dangKiemVienItems: [],
      kqThietBi: [{
        text: 'Đ &nbsp;',
        value: 1
      },
      {
        text: 'KĐ &nbsp;',
        value: 4
      },
      {
        text: 'NA',
        value: 5
      }
      ],
      kq: [{
        text: 'Đ &nbsp;',
        value: 1
      },
      {
        text: 'KC',
        value: 2
      },
      {
        text: 'CĐ',
        value: 3
      },
      {
        text: 'KĐ',
        value: 4
      },
      {
        text: 'NA',
        value: 5
      }
      ],
      kqFullText: [{
        text: 'Đạt',
        value: 1
      },
      {
        text: 'Khuyến cáo',
        value: 2
      },
      {
        text: 'Chưa đạt',
        value: 3
      },
      {
        text: 'Không đạt',
        value: 4
      },
      {
        text: 'Không xác định',
        value: 5
      }
      ],
      kiemTraTinhPhuHop: {},
      sanPhamXuatXuongItems: [{
        hangMuc: 'Khung xe',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Động cơ',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Đèn chiếu sáng phía trước',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Ống xả',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Gương chiếu hậu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Vành',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Lốp',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Thùng nhiên liệu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Thùng nhiên liệu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Ắc quy',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kính chắn gió, kính bên, kính hậu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Bình khí nén HTP',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Vật liệu chính thùng, xe chuyên dùng,',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Cơ cấu chuyên dùng',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kết cấu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kiểu dáng xe',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kích thước',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Khối lượng bản thân',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      }
      ],
      kiemTraDotXuatMau1Items: [{
        hangMuc: 'Khung xe',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Động cơ',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Đèn chiếu sáng phía trước',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Ống xả',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Gương',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Vành',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Lốp',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Thùng nhiên liệu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kính chắn gió, kính bên, kính hậu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Bình khí HTP',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Vật liệu chính thùng, xe chuyên dùng',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Cơ cấu chuyên dùng',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kích thước',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kết cấu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Khối lượng',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kiểu dáng',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      }
      ],
      kiemTraDotXuatMau2Items: [{
        hangMuc: 'Hồ sơ kiểm tra xuất xưởng tại CSXX',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Đối chiếu: số khung, số động cơ, số lượng xe xuất xưởng hiện có tại CSXX so với đề nghị cấp phiếu',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Kiểu dáng sản phẩm phù hợp với thiết kế',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      },
      {
        hangMuc: 'Lập biên bản kiểm tra tính phù hợp của sản phẩm (nếu phát hiện có vi phạm)',
        doiChieuGCN: 'PH',
        noiDungkoPhuHop: ''
      }
      ],
      sanPhanXuatXuong: [],
      indexSpXuatXuong: -1,
      dsXePopUpKieuLoai: [{
        'so_khung': '',
        'so_dong_co': ''
      },
      {
        'so_khung': '',
        'so_dong_co': ''
      },
      {
        'so_khung': '',
        'so_dong_co': ''
      }
      ],
      detailCOP: {
        nd_1_1_1_result: 1,
        nd_1_1_2_result: 1,
        nd_1_2_1_result: 1,
        nd_1_2_2_result: 1,
        nd_2_1_1_result: 1,
        nd_2_1_2_result: 1,
        nd_2_2_1_1_result: 1,
        nd_2_2_1_2_result: 1,
        nd_2_2_1_3_result: 1,
        nd_2_2_2_result: 1,
        nd_2_3_1_result: 1,
        nd_2_3_2_result: 1,
        nd_2_4_1_result: 1,
        nd_2_4_2_result: 1,
        nd_2_5_1_result: 1,
        nd_2_5_2_result: 1,
        nd_2_6_1_result: 1,
        nd_2_6_2_result: 1,
        nd_3_1_result: 1,
        nd_3_2_result: 1,
        nd_3_3_result: 1,
        nd_4_1_1_result: 1,
        nd_4_1_2_result: 1,
        nd_4_1_3_result: 1,
        nd_4_2_1_1_result: 1,
        nd_4_2_1_2_result: 1,
        nd_4_2_1_3_result: 1,
        nd_4_2_2_result: 1,
        nd_4_2_3_result: 1,
        nd_4_2_4_result: 1,
        nd_5_1_result: 1,
        nd_5_1_1_result: 1,
        nd_5_1_2_result: 1,
        nd_5_1_3_result: 1,
        nd_5_1_4_result: 1,
        nd_5_2_result: 1,
        nd_5_3_1_result: 1,
        nd_5_3_2_result: 1,
        nd_5_3_3_result: 1,
        nd_6_1_result: 1,
        nd_6_2_result: 1,
        nd_6_3_result: 1,
        nd_7_result: 1,
        nd_8_result: 1,
        nd_9_result: 1,
        nd_10_result: 1,
        nd_11_result: 1,
        nd_12_result: 1
      },
      loaiSPItems: [],
      part1: sampleDataCOP['part1'] || [],
      part2: sampleDataCOP['part2'] || [],
      part3: sampleDataCOP['part3'] || [],
      part4: sampleDataCOP['part4'] || [],
      part5: sampleDataCOP['part5'] || [],
      part6: sampleDataCOP['part6'] || [],
      part1CSBHBD: sampleDataCSBHBD['part1'] || [],
      part2CSBHBD: sampleDataCSBHBD['part2'] || [],
      part1Active: true,
      part2Active: true,
      part3Active: true,
      part4Active: true,
      part5Active: true,
      part6Active: true,
      part7Active: true,
      disabledPart1: false,
      disabledPart2: false,
      disabledPart3: false,
      disabledPart4: false,
      disabledPart5: false,
      disabledPart6: false,
      disabledPart7: false,
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
      alpacaAssignUserId: 0,
      subUsers: [],
      currentCounter: 0,
      currentCounterTemp: 0,
      listgroupHoSoFilterselectedIndex: -1,
      advancedFilterServiceInfo: {},
      advancedFilterLoaiSanPham: {},
      advancedFilterNhanHieu: {},
      advancedFilterDossierStatus: {},
      stateOnlyFollow: false,
      stateButtonregistration: true,
      follow: true,
      doiPhongItems: [],
      searchDoiPhong: '',
      soSerial: '',
      mauPhoiItems: [{
        itemName: 'Phiếu xuất xưởng',
        itemCode: 'PXX'
      },
      {
        itemName: 'Giấy chứng nhận',
        itemCode: 'GCN'
      },
      {
        itemName: 'Tem hợp quy',
        itemCode: 'THQ'
      }
      ],
      searchMauPhoi: '',
      namItems: [
        2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023
      ],
      searchNam: '',
      headersPxx: [{
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
        text: 'Tồn trên sổ',
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
        text: 'Ngày kiểm kê',
        align: 'center',
        sortable: false,
        value: 'ngaykiemke'
      }
      ],
      headersXuatKhoDSSP: [{
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
      headersDSSP: [{
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
        // {
        // 	text: 'Đơn giá',
        // 	align: 'center',
        // 	sortable: false,
        // 	value: 'dongia'
        // },
        // {
        // 	text: 'Thành tiền',
        // 	align: 'center',
        // 	sortable: false,
        // 	value: 'thanhtien'
        // },
        // {
        // 	text: 'Ngày xuất xưởng',
        // 	align: 'center',
        // 	sortable: false,
        // 	value: 'ngayxuatxuong'
        // },
        // {
        // 	text: 'Hành động',
        // 	align: 'center',
        // 	sortable: false,
        // 	value: 'hanhdong'
        // }
      ],
      headersDSSPXuatXuong: [{
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
      }
      ],
      headersBBKiemTraGS: [{
        text: 'STT',
        align: 'center',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Ngày đề nghị',
        align: 'center',
        sortable: false,
        value: 'ngaydenghi'
      },
      {
        text: 'SL đạt',
        align: 'center',
        sortable: false,
        value: 'sldat'
      }
      ],
      stateKiemTraDotXuat: -1,
      popUpBienBanKiemTraGS: false,
      bienBanDXModel: {},
      bienBanGSModel: {},
      totalDat: 0,
      dsBBKiemTraGS: [],
      phieuConItems: [],
      dsGCNItems: [],
      selected: [],
      dieuChuyenItems: [],
      dieuChuyen: '',
      doiTuongItems: [],
      thongTinPhieu: {
        outputSheetNo: '',
        outputSheetDate: ''
      },
      stateAddPhieu: 'dieu_chuyen',
      soGCN_add: '',
      nhanHieu_add: '',
      soLoai_add: '',
      loaiPhuongTien_add: '',
      soLuong_add: '',
      donGia_add: '',
      ngayXuatXuong_add: '',
      popUpAddPhieu: false,
      popUpNhap_Xuat_DieuChuyen: false,
      loadingPxx: false,
      detailAnChi: {
        serialStartNo: '',
        serialEndNo: ''
      },
      listsTraCuu: [],
      lengthPageTraCuu: 0,
      pageTraCuu: 1,
      lengthPageTraCuuThongKe: 0,
      pageTraCuuThongKe: 1,
      headersTraCuu: headersThamDinh,
      menuDateTraCuuFrom: false,
      fromDateTraCuu: '',
      menuDateTraCuuTo: false,
      toDateTraCuu: '',
      dataItemString: [{
        id: 29891,
        dataGroupId: 70,
        code_0: 24,
        code_1: '',
        code_2: '',
        code_3: '',
        level: 2,
        name: 'Gần giống ~',
        altername: 'like',
        description: '',
        validatedFrom: '01/01/2015 00:00',
        validatedTo: '',
        status: 1,
        syncDate: '18/09/2017 02:05'
      }],
      dataItemKeyword: [{
        id: 29861,
        dataGroupId: 70,
        code_0: 21,
        code_1: '',
        code_2: '',
        code_3: '',
        level: 2,
        name: 'Bằng =',
        altername: '=',
        description: '',
        validatedFrom: '01/01/2015 00:00',
        validatedTo: '',
        status: 1,
        syncDate: '18/09/2017 02:05'
      }],
      dataItem: [{
        id: 29891,
        dataGroupId: 70,
        code_0: 24,
        code_1: '',
        code_2: '',
        code_3: '',
        level: 2,
        name: '>=',
        altername: 'gte',
        description: '',
        validatedFrom: '01/01/2015 00:00',
        validatedTo: '',
        status: 1,
        syncDate: '18/09/2017 02:05'
      },
      {
        id: 29861,
        dataGroupId: 70,
        code_0: 21,
        code_1: '',
        code_2: '',
        code_3: '',
        level: 2,
        name: '<=',
        altername: 'lte',
        description: '',
        validatedFrom: '01/01/2015 00:00',
        validatedTo: '',
        status: 1,
        syncDate: '18/09/2017 02:05'
      },
      {
        id: 29861,
        dataGroupId: 70,
        code_0: 21,
        code_1: '',
        code_2: '',
        code_3: '',
        level: 2,
        name: 'Bằng =',
        altername: '=',
        description: '',
        validatedFrom: '01/01/2015 00:00',
        validatedTo: '',
        status: 1,
        syncDate: '18/09/2017 02:05'
      }
      ],
      conditions: conditionsTDTKXCG,
      listSearch: [{
        index: 0,
        value: null,
        searchType: null,
        dataitem: null,
        dataCollection: [],
        conditionsSelect: {}
      }],
      headersChiTietPhieu: [{
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
      dsCTPItems: [],
      chiTietPhieuModel: {},
      popUpChiTietKiemKe: false,
      hoSoItems: [],
      hoSo: '',
      popUpChiTietPhieu: false,
      coSoInItems: [],
      coSoIn: '',
      dateNgayXuatXuong_add: '',
      menuNgayXuatXuong_add: false,
      menuNgayNhap: false,
      menuNgayXuat_Dossier: false,
      dateNgayNhap: '',
      totalPxx: 0,
      tabActive: null,
      listGroupMenus: [],
      showGroupMenus: false,
      indexSelectMenu: -1,
      indexGroupMenu: -1,
      coSoSanXuatItems: [],
      isToggle: true,
      headersDSPNK: [{
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
      headersDSPXK: [{
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
      headersPTSXLR: [{
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
      dossierIdFormDN: 0,
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
      titleHistory: '',
      tcTinhTrangItems: [{
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
      headersThemDieuKien: [{
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
      tcSoSanhItems: [{
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
      stampBook: {},
      headersCoSoNuocNgoai: [{
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
      popUpPhieuXX: false,
      groupXuatXuong: [{
        title: 'Xe đã xuất xưởng',
      }, {
        title: 'Ấn chỉ đã cấp phát'
      }, {
        title: 'Xe chờ in phiếu'
      }],
      headersDSXeXuatXuong: [{
        text: 'STT',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Doanh nghiệp',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Đối tượng',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số ấn chỉ',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số GCN',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số khung',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số động cơ',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Mà sơn',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Thao tác',
        sortable: false,
        value: 'stt'
      }
      ],
      headersDSHoSoFilter: [{
        text: 'Chọn',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số hồ sơ',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Ngày hồ sơ',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Đối tượng',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Loại hồ sơ',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'SL đã cấp',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'SL chưa sử dụng',
        sortable: false,
        value: 'stt'
      },
      ],
      danhSachHoSoFilter: [],
      headersTSKT: [{
        text: 'STT',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Mã TSKT',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Tên TSKT',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Giá trị TSKT',
        sortable: false,
        value: 'stt'
      }, {
        text: 'STT hiển thị',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Đơn vị',
        sortable: false,
        value: 'stt'
      }, {
        text: 'TT quy chuẩn',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Nhóm TSKT',
        sortable: false,
        value: 'stt'
      }],
      danhSachTSKT: [],
      danhSachXeXuatXuong: [],
      headerDanhSachXe: [{
        text: 'Chọn',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'STT',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số GCN',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số khung',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Số động cơ',
        sortable: false,
        value: 'stt'
      },
      {
        text: 'Màu sơn',
        sortable: false,
        value: 'stt'
      },
      {
        text: '',
        sortable: false,
        value: 'stt'
      },

      ],
      danhSachXe: [],
      vehicleclassFilter: '',
      stampissueNoFilter: '',
      certificaterecordnoFilter: '',
      productiondateFilter: null,
      framenoFilter: '',
      enginenoFilter: '',
      serialnoFilter: '',
      applicantprofileidFilter: '',
      danhSachDoanhNghiep: [],
      danhSachDoiTuong: [],
      danhSachTinhTrang: [{
        text: 'Đã sử dụng hết',
        value: 0
      }, {
        text: 'Chưa sử dụng hết',
        value: 1
      }],
      danhSachTrangThai: [{
        text: 'Đã in',
        value: 1
      }, {
        text: 'Chưa in',
        value: 0
      }],
      headersDSAnChiDaCapPhat: [{
        text: 'STT',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Doanh nghiệp',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Đối tượng',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Số hồ sơ',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Ngày nộp',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Tên sổ',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Số ấn chỉ',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Năm cấp phát',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Trạng thái',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Ghi chú',
        sortable: false,
        value: 'stt'
      }, {
        text: 'Thao tác',
        sortable: false,
        value: 'stt'
      }],
      danhSachAnChiDaCapPhat: [],
      chiTietAnChiDaCapPhat: {},
      preview: '',
      popUpPhoiXCG: false,
      listLabel: [{
        name: 'nhanhieu'
      }, {
        name: 'loaixe'
      }],
      listLabelTemp: [],
      popUpHistoryDossierPart: false,
      urlPdfHistory: '',
      selectModule: {
        "name": "Thẩm định thiết kế Xe cơ giới",
        "children": [],
        "level": 1,
        "id": "TT302011BGTVTTDTKXCG",
        "showLableSearch": false,
        "doanhNghiep": null,
        "listDoanhNghiep": [],
        "module": "TT302011BGTVTTDTKXCG",
        "pathParent": "Thẩm định thiết kế Xe cơ giới"
      },
      modules: modules,
      soureTable: 'vr_VehicleTypeCertificate',
      headersLanChuyenDoi: [{
        text: 'Lần',
        sortable: false,
        value: 'stt',
        align: 'center'
      },
      {
        text: 'Nội dung',
        sortable: false,
        value: 'noiDung',
        align: 'center'
      },
      {
        text: 'Từ ngày',
        sortable: false,
        value: 'tuNgay',
        align: 'center'
      }
      ],
      itemsLanChuyenDoi: [],
      headersKQChuyenDoi: [{
        text: 'Tên bảng',
        sortable: false,
        value: 'tenBang',
        align: 'center'
      },
      {
        text: 'Lượt',
        sortable: false,
        value: 'luot',
        align: 'center'
      },
      {
        text: 'Số lượng',
        sortable: false,
        value: 'soLuong',
        align: 'center'
      },
      {
        text: 'Ghi chú',
        sortable: false,
        value: 'ghiChu',
        align: 'center'
      }
      ],
      itemsKQChuyenDoi: [],
      headersChuyenDoiMapping: [{
        text: 'STT',
        sortable: false,
        value: 'stt',
        align: 'center'
      },
      {
        text: 'ID',
        sortable: false,
        value: 'id',
        align: 'center'
      },
      {
        text: 'Mã',
        sortable: false,
        value: 'ma',
        align: 'center'
      },
      {
        text: 'Tên',
        sortable: false,
        value: 'ten',
        align: 'center'
      },
      {
        text: 'Mã bảng',
        sortable: false,
        value: 'maBang',
        align: 'center'
      },
      {
        text: 'Mã CD',
        sortable: false,
        value: 'maCD',
        align: 'center'
      },
      {
        text: 'Tên chuyển đổi',
        sortable: false,
        value: 'tenChuyenDoi',
        align: 'center'
      },
      {
        text: 'Đối tượng',
        sortable: false,
        value: 'doiTuong',
        align: 'center'
      }
      ],
      itemsMapping: [],
      migrateTaskSelect: {},
      migrateReviewSelect: {},
      rowPerPage: [
        15,
        25,
        40,
        50,
        {
          text: "Tất cả",
          value: -1
        }
      ],
      loadingLanChuyenDoi: false,
      loadingKQChuyenDoi: false,
      loadingChuyenDoiMapping: false,
      loadingTableTraCuu: false
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
          parseDateTraCuuFrom: function (item) {
            var vm = this
            item['fromDate'] = vm.parseDate2(item['fromDateTraCuu'])
          },
          parseDateTraCuuTo: function (item) {
            var vm = this
            item['toDate'] = vm.parseDate2(item['toDateTraCuu'])
          },
          toPartActive: function (id) {
            console.log('anchorage==========', id);
            // $('html,body').animate({
            // 	scrollTop: $('#' + id).offset().top
            // });​
            window.scrollTo(0, $("#" + id).offset().top);
          },
          // checkDatKoDat (type) {
          // 	if (type === 5) {
          // 		// kc cam
          // 		// na vàng
          // 		// kđ đỏ
          // 		// cđ xanh lam
          // 	} 
          // 	if (type === 3 || type === 4 || type === 5) {
          // 		return true
          // 	} else {
          // 		return false
          // 	}
          // },
          checkColorCop: function (type) {
            if (type === 5) {
              return 'yellow';
            } else if (type === 4) {
              return '#fa6363';
            } else if (type === 3) {
              return '#47a9fe';
            } else if (type === 2) {
              return 'orange';
            } else {
              return 'white';
            }
          },
          controlLimit: function (id_, response) {
            $("." + id_ + "Class").show('fast');
            $.each(response, function (k, v) {
              if (k == 'TechSpecs') {
                $.each(v, function (key, ob) {
                  $("#" + ob).val('');
                  $("#div-" + ob).addClass(id_ + "Class");
                  $("#div-" + ob).hide('fast');
                });
              }
            });
          },
          getDataLimit: function (id_, vehicletype, formulatype, callback) {
            var vm = this;
            $.ajax({
              headers: {
                "module": "1",
                "dossierId": "",
                "dossierFileId": vm.dossierFileId,
                "groupId": 55301
              },
              data: "",
              type: 'get',
              dataType: 'json',
              url: '/o/rest/vr-app/techspecslimit/vehicleclass/XCG/vehicletype/' + vehicletype + '/formulatype/' + formulatype,
              success: function (response) {
                callback(response);
              }
            });
          },
          getTrackChanges: function (callback) {
            var vm = this;
            $.ajax({
              headers: {
                "groupId": 55301
              },
              data: {
                dossierid: vm.dossierId,
                contentfiletemplate: 'KQ1'
              },
              type: 'get',
              dataType: 'json',
              url: '/o/rest/vr-app/trackchanges/dossier',
              success: function (response) {
                var data = response['nextContentFileEntryId'] ? JSON.parse(response['nextContentFileEntryId']) : '';
                if (data) {
                  var tmp = {
                    dang_kiem_vien_chinh: data['dang_kiem_vien_chinh'],
                    dang_kiem_vien_ho_tro: data['dang_kiem_vien_ho_tro'],
                    ngay_bat_dau_tham_dinh: data['ngay_bat_dau_tham_dinh'],
                    ngay_ket_thuc_tham_dinh: data['ngay_ket_thuc_tham_dinh'],
                    loai_hinh_thiet_ke_text: data['loai_hinh_thiet_ke_text'],
                    hinh_thuc_cap_giay_text: data['hinh_thuc_cap_giay_text'],
                    so_bien_ban: data['so_bien_ban'],
                    phien_ban_gcn: data['phien_ban_gcn'],
                    ten_co_so_thiet_ke: data['ten_co_so_thiet_ke'],
                    bb_ten_co_so_thiet_ke: data['bb_ten_co_so_thiet_ke'],
                    dia_chi_co_so_thiet_ke: data['dia_chi_co_so_thiet_ke'],
                    bb_dia_chi_co_so_thiet_ke: data['bb_dia_chi_co_so_thiet_ke'],
                    lb_XCG01003: data['lb_XCG01003'],
                    bb_XCG01003: data['bb_XCG01003'],
                    lb_XCG01005: data['lb_XCG01005'],
                    bb_XCG01005: data['bb_XCG01005'],
                    lb_XCG01006: data['lb_XCG01006'],
                    bb_XCG01006: data['bb_XCG01006'],
                    lb_XCG01001: data['lb_XCG01001'],
                    bb_XCG01001: data['bb_XCG01001'],
                    lb_XCG01002: data['lb_XCG01002'],
                    bb_XCG01002: data['bb_XCG01002'],
                    lb_XCG01020: data['lb_XCG01020'],
                    bb_XCG01020: data['bb_XCG01020'],
                    lb_XCG01031: data['lb_XCG01031'],
                    bb_XCG01031: data['bb_XCG01031'],
                    lb_XCG01032: data['lb_XCG01032'],
                    XCG01032_text: data['XCG01032_text'],
                    bb_XCG01031_text: data['bb_XCG01031_text'],
                    bb_XCG01032_text: data['bb_XCG01032_text'],
                    lb_XCG01026: data['lb_XCG01026'],
                    bb_XCG01026: data['bb_XCG01026'],
                    lb_XCG01050: data['lb_XCG01050'],
                    bb_XCG01050_text: data['bb_XCG01050_text'],
                    lb_XCG01051: data['lb_XCG01051'],
                    bb_XCG01051: data['bb_XCG01051'],
                    bb_XCG01051_text: data['bb_XCG01051_text'],
                    lb_XCG01052: data['lb_XCG01052'],
                    bb_XCG01052: data['bb_XCG01052'],
                    lb_XCG01053: data['lb_XCG01053'],
                    bb_XCG01053: data['bb_XCG01053']
                  };
                  $('#tenBienBanTSKT').text(data['bb_XCG01050_text']);
                  for (var key in tmp) {
                    $('#' + key).text(tmp[key]);
                  }
                  if (data['ket_luan_chung'] === 1 || data['ket_luan_chung'] === '1') {
                    $('#ket_luan_chung_view').text('Đạt yêu cầu');
                  } else {
                    $('#ket_luan_chung_view').text('Không đạt yêu cầu');
                  }
                  if (data['ghi_chu_khong_dat']) {
                    $('#ghi_chu_khong_dat_view').html(data['ghi_chu_khong_dat'].replace(/\n/g, "<br />"));
                  }
                  console.log('tmp==================', tmp);
                }
              }
            })
          },
          getSchema2: function (callback) {
            var vm = this;
            $.ajax({
              headers: {
                "apikey": '1234567890',
                "module": "",
                "fileTemplateNo": vm.fileTemplateNo,
                "dossierId": vm.dossierId,
                "dossierFileId": vm.dossierFileId,
                "groupId": 55301,
                "flag": "bb"
              },
              data: "",
              type: 'get',
              dataType: 'json',
              url: '/o/rest/vr-app/techspecs/XCG/vehicleclassexts',
              success: function (response) {
                callback(response);
              }
            })
          },
          getSchema3: function (callback) {
            var vm = this;
            $.ajax({
              headers: {
                "apikey": '1234567890',
                "module": "",
                "fileTemplateNo": vm.fileTemplateNo,
                "dossierId": vm.dossierId,
                "dossierFileId": vm.dossierFileId,
                "groupId": 55301,
                "flag": "bb"
              },
              data: "",
              type: 'get',
              dataType: 'json',
              url: '/o/rest/vr-app/techspecs/TDTKXCG/vehicleclassexts',
              success: function (response2) {
                callback(response2);
              }
            });
          },
          generalHtml2: function (mang_ts) {
            var vm = this;
            // $('#formType_hidden').addClass('formType');
            // $('#formType_hidden').val('dklr');
            // $('.formSchema').val(JSON.stringify(mang_ts));
            $('#column-auto').html('');
            var var_array = [];
            var html_code = '',
              html_code1 = '',
              html_code2 = '',
              html_code3 = '';
            var var_lv, var_lv1, var_lv2, var_lv3;
            var var_type, var_key, var_title, var_value, var_items, var_basicunit, var_standard, var_result;
            var var_datasource, var_value_text, var_resultTD, var_placeholder;
            var index_var = 0,
              check_loai_dong_co = 0,
              html_loai_dong_co = '';

            var_array[index_var] = 'trackChange_ghi_chu_in_chung_chi';
            index_var++;
            var_array[index_var] = 'trackChange_ghi_chu_khac';
            index_var++;
            var_array[index_var] = 'trackChange_ghi_chu_khong_dat';
            index_var++;
            var tong_no = 0;
            var tong_yes = 0;
            var tong_nil = 0;
            var value_text = '';

            $(mang_ts).each(function (key, value) {
              var_lv1 = mang_ts[key];
              html_code3 = '';
              $(var_lv1['items']).each(function (key1, value1) {
                var_lv2 = var_lv1['items'][key1];
                var_type = var_lv2['type'];
                var_key = var_lv2['key'];
                var_title = var_lv2['title'];
                var_value = var_lv2['value'];
                var_value_text = var_lv2['value_text'];
                var_standard = var_lv2['standard'];
                var_basicunit = var_lv2['basicunit'];
                var_resultTD = var_lv2['resultTD'];
                var_result = var_lv2['result'];
                var_placeholder = var_lv2['placeholder'];
                var_array[index_var] = var_key;
                index_var++;
                var_array[index_var] = 'bb_' + var_key;
                index_var++;
                var_array[index_var] = 'kl_' + var_key;
                index_var++;
                var check_key = 'trackChange_bb_' + var_key;
                var_array[index_var] = check_key;
                var_array.check_key = "";
                index_var++;
                var check_key = 'trackChange_kl_' + var_key;
                var_array[index_var] = check_key;
                var_array.check_key = "";
                index_var++;
                if (var_key == 'loai_dong_co' && check_loai_dong_co == 0) {
                  check_loai_dong_co = 1;
                  html_loai_dong_co = '';
                  var_datasource = var_lv2['datasource'];
                  value_text = '';
                  if (var_result == '') {
                    if (var_value == '')
                      html_loai_dong_co += '<div class="lv-three nil" id="div-' + var_key + '">';
                    else
                      html_loai_dong_co += '<div class="lv-three" id="div-' + var_key + '">';
                  } else
                    if (var_result == 'no')
                      html_loai_dong_co += '<div class="lv-three not-pass" id="div-' + var_key + '">';
                    else
                      if (var_result == 'nil')
                        html_loai_dong_co += '<div class="lv-three nil" id="div-' + var_key + '">';
                      else
                        html_loai_dong_co += '<div class="lv-three" id="div-' + var_key + '">';

                  if (var_standard == '' && var_basicunit == '')
                    html_loai_dong_co += '<div class="content-label"><div><span>' + var_title + '</span></div></div>';
                  else if (var_standard != '')
                    html_loai_dong_co += '<div class="content-label"><div><span>' + var_title + '</span> &nbsp;<span class="fa fa-info-circle" title="' + var_standard + '"></span></div></div>';
                  else if (var_basicunit != '')
                    html_loai_dong_co += '<div class="content-label"><div><span>' + var_title + '</span>&nbsp;<i style="font-size: 13px;">' + var_basicunit + '</i></div></div>';

                  html_loai_dong_co += '<div class="content-thiet-ke">' + var_value_text + '<input type="hidden" name="' + var_key + '" id="' + var_key + '" value="' + var_value + '" /><input type="hidden" name="' + var_key + '_text" id="' + var_key + '_text" value="' + var_value_text + '" /></div>';
                  html_loai_dong_co += '<div class="content-thiet-ke">';

                  // html_loai_dong_co += '<select class="alpaca-control form-control my-select" id="bb_' + var_key + '" name="bb_' + var_key + '">';
                  // html_loai_dong_co += '<option value="">'+var_placeholder+'</option>';
                  // $.each(var_datasource, function (k, vl) {
                  //   if (var_resultTD.toString() == var_datasource[k]['value'].toString()) {
                  //     html_loai_dong_co += '<option selected value="' + var_datasource[k]['value'] + '">' + var_datasource[k]['text'] + '</option>';
                  //     value_text = var_datasource[k]['text'];
                  //   } else
                  //     html_loai_dong_co += '<option value="' + var_datasource[k]['value'] + '">' + var_datasource[k]['text'] + '</option>';
                  // });
                  // html_loai_dong_co += '</select>';

                  $.each(var_datasource, function (k, vl) {
                    if (var_resultTD.toString() == var_datasource[k]['value'].toString()) {
                      value_text = var_datasource[k]['text'];
                      html_loai_dong_co += var_datasource[k]['text'];
                    }
                  });

                  html_loai_dong_co += '<input type="hidden" id="bb_' + var_key + '_text" name="bb_' + var_key + '_text" value="' + value_text + '" />';

                  html_loai_dong_co += '</div>';
                  html_loai_dong_co += '<div class="content-ket-luan">';
                  if (var_result == 'no') {
                    tong_no++;
                    html_loai_dong_co += 'Không đạt'
                  } else if (var_result == 'nil') {
                    tong_nil++;
                    html_loai_dong_co += 'Không áp dụng'
                  } else if (var_result !== '' && var_result !== null && var_result !== undefined) {
                    tong_yes++;
                    html_loai_dong_co += 'Đạt'
                  }
                  // html_loai_dong_co+='<select class="alpaca-control form-control check-result" name="kl_'+var_key+'" id="kl_'+var_key+'">';
                  //   if (var_result == '') {
                  //     if (var_value == '') {
                  //       tong_nil++;
                  //       html_loai_dong_co+='<option value="yes">Đạt</option>';
                  //       html_loai_dong_co+='<option value="no">Không đạt</option>';
                  //       html_loai_dong_co+='<option value="nil"  selected>Không áp dụng</option>';
                  //     } else {
                  //       tong_yes++;
                  //       html_loai_dong_co+='<option value="yes" selected>Đạt</option>';
                  //       html_loai_dong_co+='<option value="no">Không đạt</option>';
                  //       html_loai_dong_co+='<option value="nil" >Không áp dụng</option>';
                  //     }
                  //   } else
                  //   if (var_result == 'no') {
                  //     tong_no++;
                  //     html_loai_dong_co+='<option value="yes">Đạt</option>';
                  //     html_loai_dong_co+='<option value="no" selected>Không đạt</option>';
                  //     html_loai_dong_co+='<option value="nil" >Không áp dụng</option>';
                  //   } else
                  //   if (var_result == 'nil') {
                  //     tong_nil++;
                  //     html_loai_dong_co+='<option value="yes">Đạt</option>';
                  //     html_loai_dong_co+='<option value="no" >Không đạt</option>';
                  //     html_loai_dong_co+='<option value="nil" selected>Không áp dụng</option>';
                  //   } else {
                  //     tong_yes++;
                  //     html_loai_dong_co+='<option selected value="yes">Đạt</option>';
                  //     html_loai_dong_co+='<option value="no">Không đạt</option>';
                  //     html_loai_dong_co+='<option value="nil" >Không áp dụng</option>';
                  //   }
                  // html_loai_dong_co+='</select>';
                  html_loai_dong_co += '</div>';
                  html_loai_dong_co += '</div>';
                  var_array[index_var] = 'bb_' + var_key + '_text';
                  index_var++;
                  var_array[index_var] = var_key + '_text';
                  index_var++;
                } else {
                  switch (var_type) {
                    case 'text':
                    case 'text1':
                    case 'text2':
                    case 'text3': {
                      if (var_result == '') {
                        if (var_value == '')
                          html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                        else
                          html_code3 += '<div class="lv-three" id="div-' + var_key + '">';
                      } else if (var_result == 'no')
                        html_code3 += '<div class="lv-three not-pass" id="div-' + var_key + '">';
                      else if (var_result == 'nil')
                        html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                      else
                        html_code3 += '<div class="lv-three" id="div-' + var_key + '">';

                      if (var_standard == '' && var_basicunit == '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span></div></div>';
                      else if (var_standard != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span> &nbsp;<span class="fa fa-info-circle" title="' + var_standard + '"></span></div></div>';
                      else if (var_basicunit != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span>&nbsp;<i style="font-size: 13px;">' + var_basicunit + '</i></div></div>';

                      html_code3 += '<div class="content-thiet-ke">' + var_value + '<input type="hidden" name="' + var_key + '" id="' + var_key + '" value="' + var_value + '" /></div>';
                      // html_code3+='<div class="content-thiet-ke text-thiet-ke"><input class="alpaca-control form-control" name="bb_'+var_key+'" id="bb_'+var_key+'" value="'+var_resultTD+'" /></div>';
                      html_code3 += '<div class="content-thiet-ke text-thiet-ke">' + var_resultTD + '</div>';
                      html_code3 += '<div class="content-ket-luan">';
                      if (var_result == 'no') {
                        tong_no++;
                        html_code3 += 'Không đạt';
                      } else if (var_result == 'nil') {
                        tong_nil++;
                        html_code3 += 'Không áp dụng';
                      } else if (var_result !== '' && var_result !== null && var_result !== undefined) {
                        tong_yes++;
                        html_code3 += 'Đạt'
                      }
                      // html_code3+='<select class="alpaca-control form-control check-result" name="kl_'+var_key+'" id="kl_'+var_key+'">';

                      //   if (var_result == '') {
                      //     if (var_value == '') {
                      //       tong_nil++;
                      //       html_code3+='<option value="yes">Đạt</option>';
                      //       html_code3+='<option value="no">Không đạt</option>';
                      //       html_code3+='<option value="nil"  selected>Không áp dụng</option>';
                      //     } else {
                      //       tong_yes++;
                      //       html_code3+='<option value="yes" selected>Đạt</option>';
                      //       html_code3+='<option value="no">Không đạt</option>';
                      //       html_code3+='<option value="nil" >Không áp dụng</option>';
                      //     }
                      //   } else
                      //   if (var_result == 'no') {
                      //     tong_no++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" selected>Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   } else
                      //   if (var_result == 'nil') {
                      //     tong_nil++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" >Không đạt</option>';
                      //     html_code3+='<option value="nil" selected>Không áp dụng</option>';
                      //   } else {
                      //     tong_yes++;
                      //     html_code3+='<option selected value="yes">Đạt</option>';
                      //     html_code3+='<option value="no">Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   }
                      // html_code3+='</select>';
                      html_code3 += '</div>';
                      html_code3 += '</div>';
                      break;
                    }
                    case 'number':
                    case 'number1':
                    case 'number2':
                    case 'number3': {
                      if (var_result == '') {
                        if (var_value == '')
                          html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                        else
                          html_code3 += '<div class="lv-three" id="div-' + var_key + '">';
                      } else
                        if (var_result == 'no')
                          html_code3 += '<div class="lv-three not-pass" id="div-' + var_key + '">';
                        else
                          if (var_result == 'nil')
                            html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                          else
                            html_code3 += '<div class="lv-three" id="div-' + var_key + '">';

                      if (var_standard == '' && var_basicunit == '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span></div></div>';
                      else if (var_standard != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span> &nbsp;<span class="fa fa-info-circle" title="' + var_standard + '"></span></div></div>';
                      else if (var_basicunit != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span>&nbsp;<i style="font-size: 13px;">' + var_basicunit + '</i></div></div>';

                      html_code3 += '<div class="content-thiet-ke">' + var_value + '<input type="hidden" name="' + var_key + '" id="' + var_key + '" value="' + var_value + '" /></div>';
                      html_code3 += '<div class="content-thiet-ke text-thiet-ke"><input class="alpaca-control form-control" name="bb_' + var_key + '" id="bb_' + var_key + '" value="' + var_resultTD + '" /></div>';
                      html_code3 += '<div class="content-ket-luan">';
                      if (var_result == 'no') {
                        tong_no++;
                        html_code3 += 'Không đạt';
                      } else if (var_result == 'nil') {
                        tong_nil++;
                        html_code3 += 'Không áp dụng';
                      } else if (var_result !== '' && var_result !== null && var_result !== undefined) {
                        tong_yes++;
                        html_code3 += 'Đạt';
                      }
                      // html_code3+='<select class="alpaca-control form-control check-result" name="kl_'+var_key+'" id="kl_'+var_key+'">';
                      //   if (var_result == 'no') {
                      //     if (var_value == '') {
                      //       tong_nil++;
                      //       html_code3+='<option value="yes">Đạt</option>';
                      //       html_code3+='<option value="no">Không đạt</option>';
                      //       html_code3+='<option value="nil"  selected>Không áp dụng</option>';
                      //     } else {
                      //       tong_yes++;
                      //       html_code3+='<option value="yes" selected>Đạt</option>';
                      //       html_code3+='<option value="no">Không đạt</option>';
                      //       html_code3+='<option value="nil" >Không áp dụng</option>';
                      //     }
                      //   } else
                      //   if (var_result == 'no') {
                      //     tong_no++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" selected>Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   } else
                      //   if (var_result == 'nil') {
                      //     tong_nil++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" >Không đạt</option>';
                      //     html_code3+='<option value="nil" selected>Không áp dụng</option>';
                      //   } else {
                      //     tong_yes++;
                      //     html_code3+='<option selected value="yes">Đạt</option>';
                      //     html_code3+='<option value="no">Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   }
                      // html_code3+='</select>';
                      html_code3 += '</div>';
                      html_code3 += '</div>';
                      break;
                    }
                    case 'select':
                    case 'select1':
                    case 'select2':
                    case 'select3': {
                      var_datasource = var_lv2['datasource'];
                      value_text = '';
                      if (var_result == '') {
                        if (var_value == '')
                          html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                        else
                          html_code3 += '<div class="lv-three" id="div-' + var_key + '">';
                      } else
                        if (var_result == 'no')
                          html_code3 += '<div class="lv-three not-pass" id="div-' + var_key + '">';
                        else
                          if (var_result == 'nil')
                            html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                          else
                            html_code3 += '<div class="lv-three" id="div-' + var_key + '">';

                      if (var_standard == '' && var_basicunit == '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span></div></div>';
                      else if (var_standard != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span> &nbsp;<span class="fa fa-info-circle" title="' + var_standard + '"></span></div></div>';
                      else if (var_basicunit != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span>&nbsp;<i style="font-size: 13px;">' + var_basicunit + '</i></div></div>';

                      html_code3 += '<div class="content-thiet-ke">' + var_value_text + '<input type="hidden" name="' + var_key + '" id="' + var_key + '" value="' + var_value + '" /><input type="hidden" name="' + var_key + '_text" id="' + var_key + '_text" value="' + var_value_text + '" /></div>';
                      html_code3 += '<div class="content-thiet-ke">';

                      // html_code3 += '<select class="alpaca-control form-control my-select" id="bb_' + var_key + '" name="bb_' + var_key + '">';
                      // html_code3 += '<option value="">'+var_placeholder+'</option>';
                      // $.each(var_datasource, function (k, vl) {
                      //   if (var_resultTD.toString() == var_datasource[k]['value'].toString()) {
                      //     html_code3 += '<option selected value="' + var_datasource[k]['value'] + '">' + var_datasource[k]['text'] + '</option>';
                      //     value_text = var_datasource[k]['text'];
                      //   } else
                      //     html_code3 += '<option value="' + var_datasource[k]['value'] + '">' + var_datasource[k]['text'] + '</option>';
                      // });
                      // html_code3 += '</select>';
                      $.each(var_datasource, function (k, vl) {
                        if (var_resultTD.toString() == var_datasource[k]['value'].toString()) {
                          value_text = var_datasource[k]['text'];
                          html_code3 += var_datasource[k]['text'];
                        }
                      });

                      html_code3 += '<input type="hidden" id="bb_' + var_key + '_text" name="bb_' + var_key + '_text" value="' + value_text + '" />';

                      html_code3 += '</div>';
                      html_code3 += '<div class="content-ket-luan">';
                      if (var_result == 'no') {
                        tong_no++;
                        html_code3 += 'Không đạt';
                      } else if (var_result == 'nil') {
                        tong_nil++;
                        html_code3 += 'Không áp dụng';
                      } else if (var_result !== '' && var_result !== null && var_result !== undefined) {
                        tong_yes++;
                        html_code3 += 'Đạt';
                      }
                      // html_code3+='<select class="alpaca-control form-control check-result" name="kl_'+var_key+'" id="kl_'+var_key+'">';
                      //   if (var_result == '') {
                      //     if (var_value == '') {
                      //       tong_nil++;
                      //       html_code3+='<option value="yes">Đạt</option>';
                      //       html_code3+='<option value="no">Không đạt</option>';
                      //       html_code3+='<option value="nil" selected >Không áp dụng</option>';
                      //     } else {
                      //       tong_yes++;
                      //       html_code3+='<option value="yes" selected>Đạt</option>';
                      //       html_code3+='<option value="no">Không đạt</option>';
                      //       html_code3+='<option value="nil" >Không áp dụng</option>';
                      //     }
                      //   } else
                      //   if (var_result == 'no') {
                      //     tong_no++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" selected>Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   } else
                      //   if (var_result == 'nil') {
                      //     tong_nil++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" >Không đạt</option>';
                      //     html_code3+='<option value="nil" selected>Không áp dụng</option>';
                      //   } else {
                      //     tong_yes++;
                      //     html_code3+='<option selected value="yes">Đạt</option>';
                      //     html_code3+='<option value="no">Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   }
                      // html_code3+='</select>';
                      html_code3 += '</div>';
                      html_code3 += '</div>';

                      var_array[index_var] = 'bb_' + var_key + '_text';
                      index_var++;
                      var_array[index_var] = var_key + '_text';
                      index_var++;

                      break;
                    }
                    case 'textarea':
                    case 'textarea1':
                    case 'textarea2':
                    case 'textarea3': {
                      if (var_result == '') {
                        if (var_value == '')
                          html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                        else
                          html_code3 += '<div class="lv-three" id="div-' + var_key + '">';
                      } else
                        if (var_result == 'no')
                          html_code3 += '<div class="lv-three not-pass" id="div-' + var_key + '">';
                        else
                          if (var_result == 'nil')
                            html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                          else
                            html_code3 += '<div class="lv-three" id="div-' + var_key + '">';

                      if (var_standard == '' && var_basicunit == '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span></div></div>';
                      else if (var_standard != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span> &nbsp;<span class="fa fa-info-circle" title="' + var_standard + '"></span></div></div>';
                      else if (var_basicunit != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span>&nbsp;<i style="font-size: 13px;">' + var_basicunit + '</i></div></div>';

                      html_code3 += '<div class="content-thiet-ke">' + var_value + '<input type="hidden" name="' + var_key + '" id="' + var_key + '" value="' + var_value + '" /></div>';
                      html_code3 += '<div class="content-thiet-ke text-thiet-ke"><textarea name="bb_' + var_key + '" id="bb_' + var_key + '">' + var_resultTD + ' </textarea></div>';
                      html_code3 += '<div class="content-ket-luan">';
                      if (var_result == 'no') {
                        tong_no++;
                        html_code3 += 'Không đạt';
                      } else if (var_result == 'nil') {
                        tong_nil++;
                        html_code3 += 'Không áp dụng';
                      } else if (var_result !== '' && var_result !== null && var_result !== undefined) {
                        tong_yes++;
                        html_code3 += 'Đạt';
                      }
                      // html_code3+='<select class="alpaca-control form-control check-result" name="kl_'+var_key+'" id="kl_'+var_key+'">';
                      //   if (var_result == 'no') {
                      //     if (var_value == '') {
                      //       tong_nil++;
                      //       html_code3+='<option value="yes">Đạt</option>';
                      //       html_code3+='<option value="no" >Không đạt</option>';
                      //       html_code3+='<option value="nil" selected>Không áp dụng</option>';
                      //     } else {
                      //       tong_yes++;
                      //       html_code3+='<option value="yes" selected>Đạt</option>';
                      //       html_code3+='<option value="no">Không đạt</option>';
                      //       html_code3+='<option value="nil" >Không áp dụng</option>';
                      //     }
                      //   } else if (var_result == 'no') {
                      //     tong_no++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" selected>Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   } else if (var_result == 'nil') {
                      //     tong_nil++;
                      //     html_code3+='<option value="yes">Đạt</option>';
                      //     html_code3+='<option value="no" >Không đạt</option>';
                      //     html_code3+='<option value="nil" selected>Không áp dụng</option>';
                      //   } else {
                      //     tong_yes++;
                      //     html_code3+='<option selected value="yes">Đạt</option>';
                      //     html_code3+='<option value="no">Không đạt</option>';
                      //     html_code3+='<option value="nil" >Không áp dụng</option>';
                      //   }
                      // html_code3+='</select>';
                      html_code3 += '</div>';
                      html_code3 += '</div>';
                      break;
                    }
                    default: {
                      if (var_result == '') {
                        if (var_value == '')
                          html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                        else
                          html_code3 += '<div class="lv-three" id="div-' + var_key + '">';
                      } else
                        if (var_result == 'no')
                          html_code3 += '<div class="lv-three not-pass" id="div-' + var_key + '">';
                        else
                          if (var_result == 'nil')
                            html_code3 += '<div class="lv-three nil" id="div-' + var_key + '">';
                          else
                            html_code3 += '<div class="lv-three" id="div-' + var_key + '">';

                      if (var_standard == '' && var_basicunit == '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span></div></div>';
                      else if (var_standard != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span> &nbsp;<span class="fa fa-info-circle" title="' + var_standard + '"></span></div></div>';
                      else if (var_basicunit != '')
                        html_code3 += '<div class="content-label"><div><span>' + var_title + '</span>&nbsp;<i style="font-size: 13px;">' + var_basicunit + '</i></div></div>';

                      html_code3 += '<div class="content-thiet-ke">' + var_value + '<input type="hidden" name="' + var_key + '" id="' + var_key + '" value="' + var_value + '" /></div>';
                      html_code3 += '<div class="content-thiet-ke text-thiet-ke"><input type="hidden" class="alpaca-control form-control" name="bb_' + var_key + '" id="bb_' + var_key + '" value="' + var_resultTD + '" /></div>';
                      html_code3 += '<div class="content-ket-luan">';
                      html_code3 += '<input type="hidden" name="kl_' + var_key + '" id="kl_' + var_key + '" value="" />';

                      html_code3 += '</div>';
                      html_code3 += '</div>';
                      break;
                    }
                  }
                }

              });
              if (html_code3 == '') {
                var_key = var_lv1['key'];
                var_array[index_var] = var_key;
                index_var++;

                var_type = var_lv1['type'];
                var_title = var_lv1['title'];
                var_value = var_lv1['value'];
                var_standard = var_lv1['standard'];
                var_result = var_lv1['result'];
                var_basicunit = var_lv1['basicunit'];
                html_code += '<div class="lv-one">';
                html_code += '<div class="lv-title">' + var_title + '</div>';
                html_code += html_code3;
                html_code += '</div>';
                if (check_loai_dong_co == 1) {
                  check_loai_dong_co = 2;
                  html_code += '<div class="lv-one">';
                  html_code += '<div class="lv-title"></div>';
                  html_code += html_loai_dong_co;
                  html_code += '</div>';
                }

              } else {
                var_key = var_lv1['key'];
                var_array[index_var] = var_key;
                index_var++;
                var_title = var_lv1['title'];
                html_code += '<div class="lv-one">';
                html_code += '<div class="lv-title">' + var_title + '</div>';
                html_code += '<div class="lv-content">';
                html_code += html_code3;
                html_code += '</div>';
                html_code += '</div>';

                if (check_loai_dong_co == 1) {
                  check_loai_dong_co = 2;
                  html_code += '<div class="lv-one">';
                  html_code += '<div class="lv-title"></div>';
                  html_code += html_loai_dong_co;
                  html_code += '</div>';
                }
              }
            });

            $('#column-auto-2-view').html(html_code);

            $(".lv-three").mouseover(function () {
              $(this).addClass('ob-focus');
            });
            $(".lv-three").mouseout(function () {
              $(this).removeClass('ob-focus');
            });

            $('#loai_hinh_thiet_ke').addClass('my-select');
            $('#hinh_thuc_cap_giay').addClass('my-select');
            $('#bb_XCG01050').addClass('my-select');
            $('#bb_XCG01051').addClass('my-select');
            $('#bb_XCG01031').addClass('my-select');
            $('#bb_XCG01032').addClass('my-select');
            $('#bb_loai_dong_co').addClass('my-select');

            var bien = 'kl_ten_co_so_thiet_ke,kl_dia_chi_co_so_thiet_ke,kl_XCG01003,kl_XCG01005,kl_XCG01006,kl_XCG01001,kl_XCG01002,kl_XCG01020,kl_XCG01031,kl_XCG01032,kl_XCG01026,kl_XCG01050,kl_XCG01051,kl_XCG01052,kl_XCG01053';
            var m = bien.split(',');
            for (var i = 0; i < m.length; i++) {
              $('#' + m[i]).addClass('check-result2');
              if ($('#' + m[i]).val() == 'no')
                $('#' + m[i]).parent().parent().parent().parent().parent().parent().addClass('not-pass');
              if ($('#' + m[i]).val() == 'nil')
                $('#' + m[i]).parent().parent().parent().parent().parent().parent().addClass('nil');
            }
            for (var z = 1; z < 10; z++) {
              var text = "bb_TDTKXCG00" + parseInt(z);
              $("#" + text).hide();
            }
            for (var y = 10; y < 37; y++) {
              var text = "bb_TDTKXCG0" + parseInt(y);
              $("#" + text).hide();
            }
            $('.my-select').change(function () {
              var id_ = $(this).attr('id');
              var gt = $("#" + id_ + " option:selected").text();
              $("#" + id_ + "_text").val(gt);

            });
            $("#bb_loai_dong_co").change(function () {
              var dong_co = $('#bb_loai_dong_co').val();
              if (dong_co == '') {
                $('#XCG01277').parent().parent().parent().parent().show();
                $('#XCG01300').parent().parent().parent().parent().show();
                $('#XCG01255').parent().parent().parent().parent().show();

                $('#XCG01277').parent().parent().parent().hide();
                $('#XCG01300').parent().parent().parent().hide();
                $('#XCG01255').parent().parent().parent().hide();

                $('#XCG01277').parent().parent().parent().parent().find('.lv-title').click(false);
                $('#XCG01300').parent().parent().parent().parent().find('.lv-title').click(false);
                $('#XCG01255').parent().parent().parent().parent().find('.lv-title').click(false);
              }
              if (dong_co == 'hybrid') {
                for (var i = 79; i < 100; i++) {
                  var key = 'bb_XCG012' + parseInt(i);
                  $('#' + key).val('');

                }
                $('#XCG01277').parent().parent().parent().find('.lv-title').click(true);
                $('#XCG01277').parent().parent().parent().parent().show();
                $('#XCG01277').parent().parent().parent().show();
                $('#XCG01300').parent().parent().parent().parent().hide();
                $('#XCG01255').parent().parent().parent().parent().hide();
              }
              if (dong_co == 'chay_dien') {
                for (var i = 2; i < 9; i++) {
                  var key = 'bb_XCG0130' + parseInt(i);
                  $('#' + key).val('');

                }
                $('#XCG01300').parent().parent().parent().find('.lv-title').click(true);
                $('#XCG01300').parent().parent().parent().parent().show();
                $('#XCG01300').parent().parent().parent().show();
                $('#XCG01277').parent().parent().parent().parent().hide();
                $('#XCG01255').parent().parent().parent().parent().hide();
              }
              if (dong_co == 'dot_trong') {
                for (var i = 57; i < 77; i++) {
                  var key = 'bb_XCG012' + parseInt(i);
                  $('#' + key).val('');

                }
                $('#XCG01255').parent().parent().parent().find('.lv-title').click(true);
                $('#XCG01255').parent().parent().parent().parent().show();
                $('#XCG01255').parent().parent().parent().show();
                $('#XCG01300').parent().parent().parent().parent().hide();
                $('#XCG01277').parent().parent().parent().parent().hide();
              }
            });
            $('.lv-one .lv-label:contains("II.5.4")').css('display', 'none');
            $('#kl_loai_dong_co').hide();
            $('#loai_dong_co').parent().hide();
            $('#XCG140').parent().parent().hide();
            $('#XCG140').parent().parent()
            $('#XCG054').parent().parent().hide();
            var func_ket_luan = function () {
              var tg_dem = '<table border="0" style="width:600px" cellpadding="5"><tr><td>Kết luận đạt: <b>' + tong_yes + '</b></td><td>Kết luận không đạt: <b>' + tong_no + '</b></td><td>Kết luận không áp dụng: <b>' + tong_nil + '</b></td></tr></table>';
              $('#dem-ket-qua-view').html(tg_dem);
              console.log('tg_dem============', tg_dem)
            }

            var f_count_result = function () {
              tong_yes = 0;
              tong_no = 0;
              tong_nil = 0;
              $('.bien-ban-tham-dinh').find('.check-result').each(function () {
                var id_ = $(this).attr('id');
                var gt = $("#" + id_ + " option:selected").val();
                if (gt == 'no') {
                  tong_no++;
                } else if (gt == 'nil') {
                  tong_nil++;
                } else {
                  tong_yes++;
                }
              });
              func_ket_luan();
            }

            $('.check-result').change(function () {
              var id_ = $(this).attr('id');
              var gt = $("#" + id_ + " option:selected").val();
              if (gt == 'no') {
                $("#" + id_).parent().parent().addClass('not-pass');

              } else {
                $("#" + id_).parent().parent().removeClass('not-pass');
              }
              if (gt == 'nil') {
                $("#" + id_).parent().parent().addClass('nil');
              } else {
                $("#" + id_).parent().parent().removeClass('nil');
              }
              f_count_result();
            });

            func_ket_luan();

            $('.check-result2').change(function () {
              var id_ = $(this).attr('id');
              var gt = $("#" + id_ + " option:selected").val();
              if (gt == 'no') {
                $("#" + id_).parent().parent().parent().parent().parent().parent().addClass('not-pass');
              } else
                $("#" + id_).parent().parent().parent().parent().parent().parent().removeClass('not-pass');
              if (gt == 'nil') {
                $("#" + id_).parent().parent().parent().parent().parent().parent().addClass('nil');
              } else
                $("#" + id_).parent().parent().parent().parent().parent().parent().removeClass('nil');

            });
            var id_ = 'bb_XCG01070';
            var lpt = $('#bb_XCG01050').val();
            var val_ = $("#bb_XCG01070").val();
            if (val_ != '' && lpt != '') {
              vm.getDataLimit(id_, lpt, val_, function (response) {
                vm.getDataLimitcontrolLimit(id_, response);
              });
            }
            $("#bb_XCG01070").change(function () {
              var id_ = $(this).attr('id');
              var val_ = $(this).val();
              var lpt = $("#bb_XCG01050").val();
              if (val_ != '' && lpt != '') {
                vm.getDataLimit(id_, lpt, val_, function (response) {
                  vm.controlLimit(id_, response);
                });
              } else {
                $("." + id_ + "Class").show('fast');
              }
            });

            $('#bb_XCG01050_text').val($("#bb_XCG01050 option:selected").text());
            $('#bb_XCG01051_text').val($("#bb_XCG01051 option:selected").text());

          },
          getFormDataSoatXetGCN: function () {
            var vm = this
            console.log('vm.listDocumentInItems=======', vm.listDocumentInItems)
            console.log('vm.detailModel=======', vm.detailModel)
            // trường hợp soát xét hồ sơ cấp phiếu
            if (vm.detailModel['dossierSubStatus'] === 'PROCESSING_60' ||
              vm.detailModel['dossierSubStatus'] === 'PROCESSING_69' ||
              vm.detailModel['dossierSubStatus'] === 'PROCESSING_72' ||
              vm.detailModel['dossierSubStatus'] === 'PROCESSING_57') {
              if (vm.listDocumentInItems && vm.listDocumentInItems['length']) {
                var itemTP2 = vm.listDocumentInItems.find(function (item) {
                  if (item && item['partNo'] === 'TP2') {
                    return true;
                  }
                })
                if (itemTP2 && itemTP2['formData']) {
                  var formData = JSON.parse(itemTP2['formData']) || {};
                  vm.detailSoatXetGCN = formData;
                }
              }
              console.log('vm.detailSoatXetGCN=======', vm.detailSoatXetGCN)
              if (vm.detailModel['dossierSubStatus'] === 'PROCESSING_72') {
                vm.dsGCNItems = [];
                vm.thongTinPhieu = {
                  stampType: 'PXX',
                  productionPlantName: vm.detailSoatXetGCN['ten_nha_xuong_text'],
                  applicantName: vm.detailSoatXetGCN['ten_doanh_nghiep'],
                  receiverPlace: vm.detailSoatXetGCN['dia_chi'],
                  outputSheetNo: '---',
                  outputSheetDate: vm.getCurrentTime() || ''
                };
                vm.selected = [];
                vm.loadCoSoSanXuat()
              }
              if (vm.detailSoatXetGCN['bang_khai']) {
                for (var i = 0; i < vm.detailSoatXetGCN['bang_khai'].length; i++) {
                  var tmp = vm.detailSoatXetGCN['bang_khai'][i]
                  if (tmp && tmp['chi_tiet']) {
                    if (tmp['so_luong']) {
                      vm.totalXe += parseInt(tmp['so_luong'])
                    }
                  }
                }
              }
            }
            //  else if (vm.detailModel['dossierSubStatus'] === 'PROCESSING_61') {

            // } else if (vm.detailModel['dossierSubStatus'] === 'PROCESSING_62') {

            // }
          },
          toDetailSoatXetGCN: function (item, index) {
            var vm = this;
            vm.popUpDsXeCapPhieu = !vm.popUpDsXeCapPhieu;
            $('#dsXePopUpCapPhieu').empty();
            console.log('chi tiet=========', item);
            var colHeaders = [];
            var colWidths = [];
            var columns = [];
            if (item['chi_tiet']) {
              if (vm.detailSoatXetGCN['hinh_thuc_cap'] === 1 || vm.detailSoatXetGCN['hinh_thuc_cap'] === '1') {
                columns = [{
                  type: 'text'
                },
                {
                  type: 'text'
                },
                {
                  type: 'text'
                }
                ];
                colHeaders = ['Số khung', 'Số máy', 'Mầu sơn'];
                colWidths = [200, 200, 200];
              } else if (vm.detailSoatXetGCN['hinh_thuc_cap'] === 2 || vm.detailSoatXetGCN['hinh_thuc_cap'] === '2') {
                columns = [{
                  type: 'text'
                },
                {
                  type: 'text'
                },
                {
                  type: 'text'
                },
                {
                  type: 'text'
                }
                ];
                colHeaders = ['Số khung', 'Số máy', 'Mầu sơn', 'Số seri mất'];
                colWidths = [150, 150, 150, 150];
              } else {
                columns = [{
                  type: 'text'
                },
                {
                  type: 'text'
                },
                {
                  type: 'text'
                },
                {
                  type: 'text'
                }
                ];
                colHeaders = ['Số khung', 'Số máy', 'Mầu sơn', 'Số seri hỏng'];
                colWidths = [150, 150, 150, 150];
              }

              // $('#chiTietPhieuTable').jexcel({
              // 	data: item['chi_tiet'],
              // 	onchange: vm.checkStateNumberGCN(item),
              // 	columns: columns
              // })

              // jexcel(document.getElementById('chiTietPhieuTable'), {
              // 	data: item['chi_tiet'],
              // 	onchange: vm.checkStateNumberGCN(item),
              // 	columns: columns
              // })
              $('#dsXePopUpCapPhieu').empty();
              $('#dsXePopUpCapPhieu').jexcel({
                data: item['chi_tiet'],
                colHeaders: colHeaders,
                colWidths: colWidths,
                columns: columns
              });
              $('#dsXePopUpCapPhieu table.jexcel.jexcel_overflow > colgroup>col').each(function (index, item) {
                console.log('item====', $(item).attr('width'));
                $("tbody.draggable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px');
                $("thead.resizable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px');
              });
            } else {
              // $('#chiTietPhieuTable').jexcel({
              // 	data: [],
              // 	columns: [
              // 		{ 
              // 			type: 'text',
              // 			title: 'Không có dữ liệu',
              // 			width: 600
              // 		}
              // 	]
              // })
              // jexcel(document.getElementById('chiTietPhieuTable'), {
              // 	data: [],
              // 	columns: [
              // 		{ 
              // 			type: 'text',
              // 			title: 'Không có dữ liệu',
              // 			width: 600
              // 		}
              // 	]
              // })
              $('#dsXePopUpCapPhieu').empty();
              $('#dsXePopUpCapPhieu').jexcel({
                data: [],
                columns: [{
                  type: 'text',
                  title: 'Không có dữ liệu',
                  width: 600
                }]
              });
              $('#dsXePopUpCapPhieu table.jexcel.jexcel_overflow > colgroup>col').each(function (index, item) {
                console.log('item====', $(item).attr('width'));
                $("tbody.draggable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px');
                $("thead.resizable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px');
              });
            }
          },
          uploadFileCop: function (key) {
            var vm = this
            console.log('key upload cop', key)
            var keyUpload = 'uploadfile_' + key
            var idInputFile = 'chon-file_' + key
            var inputFile = $('#' + idInputFile)[0]
            vm.detailCOP[keyUpload] = []
            var dataTmp = new FormData()
            dataTmp.append('file', inputFile.files[0])
            $.ajax({
              headers: {
                'groupId': themeDisplay.getScopeGroupId()
              },
              type: 'POST',
              url: '/o/rest/v2/dossiers/formfiles',
              data: dataTmp,
              processData: false,
              contentType: false,
              dataType: 'json',
              cache: false,
              timeout: 600000,
              success: function (data) {
                vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thành công!";
                vm.snackbardossierViewJX = true;
                var tenFile = vm.detailCOP['ten_file_' + key];
                vm.detailCOP[keyUpload].push({
                  "ten_file": tenFile || '',
                  "fileUrl": data['fileUrl'],
                  "fileId": data['fileId']
                });
              },
              error: function (xhr) {
                vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thất bại, vui lòng thử lại!";
                vm.snackbarerordossierViewJX = true;
              }
            })
          },
          closeAndSaveCop: function (argument) {
            var vm = this;
            vm.popUpThietBiCOP = false;
            if (vm.indexThietBi < 0) {
              console.log('can not set item thiet bi');
              return null;
            }
            vm.thietBiKiemTra['don_vi'] = vm.donVi;
            vm.detailCOP['thiet_bi_xuat_xuong'][vm.indexThietBi] = Object.assign({}, vm.thietBiKiemTra);
            var referenceUid = $("#formCOP").attr('referenceUid') || '';
            var processActionId = $("#formCOP").attr('processActionId') || '';
            vm.submitAlpacajsForm({
              eform: true,
              dossierPartId: 288,
              partNo: 'KQ4',
              referenceUid: referenceUid
            }, processActionId || 0)
          },
          closeAndSaveCSBHBD: function (argument) {
            var vm = this;
            vm.popUpThietBiXuatXuongCSBHBD = false;
            if (vm.indexThietBi < 0) {
              console.log('can not set item thiet bi');
              return null;
            }
            vm.thietBiKiemTra['don_vi'] = vm.donVi;
            vm.detailCSBHBD['thiet_bi_xuat_xuong'][vm.indexThietBi] = Object.assign({}, vm.thietBiKiemTra);
            var referenceUid = $("#formBaoCaoCSBHBD").attr('referenceUid') || '';
            var processActionId = $("#formBaoCaoCSBHBD").attr('processActionId') || '';
            vm.submitAlpacajsForm({
              eform: true,
              dossierPartId: 161,
              partNo: 'KQ2',
              referenceUid: referenceUid
            }, processActionId || 0)
          },
          xacNhanBBKiemTraGSKT: function () {
            var vm = this;
            if (vm.bienBanGSModel && vm.bienBanGSModel['chi_tiet_2']) {
              var sld = 0;
              vm.bienBanGSModel['chi_tiet_2'].forEach(function (item) {
                if (item['kl'] === 1 || item['kl'] === '1') {
                  sld++;
                }
              })
              vm.bienBanGSModel['so_luong_dat'] = sld;
            }
            console.log('stateKiemTraDotXuat=====', vm.stateKiemTraDotXuat);
            console.log('indexBBKTGS=====', vm.indexBBKTGS);
            if (vm.stateKiemTraDotXuat === -1) {
              if (vm.indexBBKTGS !== -1) {
                vm.dsBBKiemTraGS[vm.indexBBKTGS] = Object.assign({}, vm.bienBanGSModel);
              } else {
                vm.dsBBKiemTraGS.push(Object.assign({}, vm.bienBanGSModel));
              }
            } else {
              if (vm.indexBBKTGS !== -1) {
                vm.dsBBKiemTraGS[vm.indexBBKTGS] = Object.assign({}, vm.bienBanDXModel);
              } else {
                vm.dsBBKiemTraGS.push(Object.assign({}, vm.bienBanDXModel));
              }
            }
            console.log('indexGCNXuatKho=====', vm.indexGCNXuatKho);
            console.log('vm.detailSoatXetGCN_indexGCNXuatKho=====', vm.detailSoatXetGCN['bang_khai']);
            if (vm.indexGCNXuatKho !== -1) {
              vm.detailSoatXetGCN['bang_khai'][vm.indexGCNXuatKho]['dsBBKiemTraGS_DX'] = vm.dsBBKiemTraGS;
            }
            vm.popUpBienBanKiemTraGS = !vm.popUpBienBanKiemTraGS;
          },
          toDetailBienBanKTGS_DotXuat: function (item, index) {
            var vm = this;
            vm.indexBBKTGS = index;
            vm.popUpBienBanKiemTraGS = !vm.popUpBienBanKiemTraGS;
            if (vm.stateKiemTraDotXuat === 1) {
              vm.bienBanDXModel = Object.assign({}, item);
              vm.bienBanDXModel['applicantName'] = vm.detailSoatXetGCN['ten_nha_xuong_text'];
              vm.bienBanDXModel['receiverPlace'] = vm.detailSoatXetGCN['dia_chi_nha_xuong'];
            } else {
              vm.bienBanGSModel = Object.assign({}, item)
              vm.bienBanGSModel['applicantName'] = vm.detailSoatXetGCN['ten_nha_xuong_text'];
              vm.bienBanGSModel['receiverPlace'] = vm.detailSoatXetGCN['dia_chi_nha_xuong'];
            }
          },
          addBienBanKTGS: function (state) {
            var vm = this;
            vm.popUpBienBanKiemTraGS = !vm.popUpBienBanKiemTraGS;
            vm.stateKiemTraDotXuat = state;
            vm.indexBBKTGS = -1;
            if (vm.stateKiemTraDotXuat === -1) {
              vm.bienBanGSModel = Object.assign({}, vm.thongTinGCN);
              vm.bienBanGSModel = Object.assign({}, vm.bienBanGSModel, vm.phanCongDoiPhong, vm.phanCongDangKiemVien);
              console.log('vm.phanCongDangKiemVien========2', vm.phanCongDangKiemVien);
              console.log('vm.phanCongDoiPhong========2', vm.phanCongDoiPhong);
              vm.bienBanGSModel['inspectorname'] = vm.bienBanGSModel['userNameAction'];
              vm.bienBanGSModel['applicantName'] = vm.detailSoatXetGCN['ten_nha_xuong_text'];
              vm.bienBanGSModel['receiverPlace'] = vm.detailSoatXetGCN['dia_chi_nha_xuong'];
            } else {
              vm.bienBanDXModel = Object.assign({}, vm.detailSoatXetGCN);
              vm.bienBanDXModel = Object.assign({}, vm.bienBanDXModel, vm.phanCongDoiPhong, vm.phanCongDangKiemVien);
              if (vm.stateKiemTraDotXuat === 1) {
                vm.bienBanDXModel['noiDungKiemTra'] = vm.kiemTraDotXuatMau1Items.slice();
              } else {
                vm.bienBanDXModel['noiDungKiemTra'] = vm.kiemTraDotXuatMau2Items.slice();
              }
              console.log('vm.phanCongDangKiemVien========2', vm.phanCongDangKiemVien);
              console.log('vm.phanCongDoiPhong========2', vm.phanCongDoiPhong);
              vm.bienBanDXModel['inspectorname'] = vm.bienBanDXModel['userNameAction'];
              vm.bienBanDXModel['applicantName'] = vm.detailSoatXetGCN['ten_nha_xuong_text'];
              vm.bienBanDXModel['receiverPlace'] = vm.detailSoatXetGCN['dia_chi_nha_xuong'];
            }
            console.log('bienBanGSModel=========', vm.bienBanGSModel);
            vm.getDoiPhongItems();
            // if (vm.dsBBKiemTraGS && vm.dsBBKiemTraGS['length']) {
            // 	for (var i = 0; i < vm.dsBBKiemTraGS.length; i++) {
            // 		vm.totalDat += vm.dsBBKiemTraGS[i]
            // 	}
            // }
          },
          filterNgayCapfunction: function (date) {
            if (!date) {
              return ''
            }
            var index = date.indexOf(' ')
            if (date.indexOf(':') !== -1) {
              return date.substring(0, index)
            }
          },
          xacNhanCOP: function () {
            var vm = this
            vm.calPointCop()
            vm.closeAndSaveCop()
          },
          setPointFormCop: function (item, index, key) {
            var vm = this
            vm.detailCOP[key] = (item['gia_tri'] || 0)
          },
          setPointFormCSBHBD: function (item, index, key) {
            var vm = this
            vm.detailCSBHBD[key] = (item['gia_tri'] || 0)
          },
          gopMoTa: function () {
            var vm = this
            vm.detailCOP['mt_nd_12'] = ''
            for (var key in vm.detailCOP) {
              if (key && key.indexOf('mt_nd') !== -1) {
                vm.detailCOP['mt_nd_12'] += '- ' + vm.detailCOP[key] + ' \n'
              }
            }
          },
          calPointCop: function () {
            var vm = this
            setTimeout(function () {
              var totalD = 0
              var totalKD = 0
              var totalNA = 0
              if (vm.thietBiKiemTra['resultTest'] && vm.thietBiKiemTra['resultTest']['length']) {
                var dat = vm.thietBiKiemTra['resultTest'].forEach(function (item) {
                  if (item['result'] === 1 || item['result'] === '1') {
                    totalD++
                  } else if (item['result'] === 4 || item['result'] === '4') {
                    totalKD++
                  } else if (item['result'] === 5 || item['result'] === '5') {
                    totalNA++
                  }
                })
              }
              var arrTmp = ['resultMark', 'resultModel', 'resultSeri', 'yearTest', 'resultCountry', 'resultStatus']
              for (var i = 0; i < arrTmp.length; i++) {
                var key = arrTmp[i]
                if (vm.thietBiKiemTra[key] === 1 || vm.thietBiKiemTra[key] === '1') {
                  totalD++
                } else if (vm.thietBiKiemTra[key] === 4 || vm.thietBiKiemTra[key] === '4') {
                  totalKD++
                } else if (vm.thietBiKiemTra[key] === 5 || vm.thietBiKiemTra[key] === '5') {
                  totalNA++
                }
              }
              vm.thietBiKiemTra['totalD'] = (totalD || 0)
              vm.thietBiKiemTra['totalKD'] = (totalKD || 0)
              vm.thietBiKiemTra['totalNA'] = (totalNA || 0)
            }, 300)
          },
          mapTextKq: function (kq) {
            if (kq === 1 || kq === '1') {
              return 'Đ'
            } else if (kq === 2 || kq === '2') {
              return 'KC'
            } else if (kq === 3 || kq === '3') {
              return 'CĐ'
            } else if (kq === 4 || kq === '4') {
              return 'KĐ'
            } else if (kq === 5 || kq === '5') {
              return 'NA'
            }
            return ''
          },
          toDetailKieuLoaiXe: function (item, index) {
            var vm = this
            vm.popUpkieuLoaiXe = !vm.popUpkieuLoaiXe
            vm.indexSpXuatXuong = index
            vm.kiemTraTinhPhuHop = {
              dang_kiem_vien_1: vm.detailCOP['dang_kiem_vien_1'],
              dang_kiem_vien_2: vm.detailCOP['dang_kiem_vien_2'],
              copReportNo: vm.detailCOP['copReportNo'],
              copReportDateFrom: vm.detailCOP['copReportDateFrom'],
              copReportDateTo: vm.detailCOP['copReportDateTo']
            }
            vm.kiemTraTinhPhuHop = Object.assign(vm.kiemTraTinhPhuHop, item)
            if (!vm.kiemTraTinhPhuHop['chiTietKieuLoai'] || !vm.kiemTraTinhPhuHop['chiTietKieuLoai']['length']) {
              vm.kiemTraTinhPhuHop['chiTietKieuLoai'] = vm.sanPhamXuatXuongItems.slice()
            }
            if (!vm.kiemTraTinhPhuHop['dsXePopUpKieuLoai'] || !vm.kiemTraTinhPhuHop['dsXePopUpKieuLoai']['length']) {
              vm.kiemTraTinhPhuHop['dsXePopUpKieuLoai'] = vm.dsXePopUpKieuLoai.slice()
            }
            // if (item['chiTietKieuLoai'] && item['chiTietKieuLoai']['length']) {
            // 	vm.sanPhanXuatXuong = item['chiTietKieuLoai']
            // } else {
            // 	vm.sanPhanXuatXuong = vm.sanPhamXuatXuongItems.slice()
            // }
          },
          xacNhanKieuLoaiXe: function () {
            var vm = this
            console.log('vm.indexSpXuatXuong========', vm.indexSpXuatXuong)
            if (vm.indexSpXuatXuong !== -1) {
              vm.detailCOP['danh_sach_san_pham'][vm.indexSpXuatXuong] = Object.assign({}, vm.kiemTraTinhPhuHop)
            }
            vm.popUpkieuLoaiXe = !vm.popUpkieuLoaiXe
          },
          getDossierIdFromCTN: function (_dossierIdCTN) {
            var vm = this
            return new Promise(function (resolve, reject) {
              $.ajax({
                url: "/o/rest/v2/dossiers?dossierIdCTN=" + _dossierIdCTN + "&status=new,receiving,processing,waiting,paying,done,cancelling,cancelled,expired",
                type: 'GET',
                dataType: 'json',
                headers: {
                  'groupId': 55217
                },
                success: function (response) {
                  if (response.data) {
                    var myObjStr = JSON.stringify(response.data);
                    var array = JSON.parse(myObjStr);
                    var tempDossierId = array[0].dossierId;
                    resolve(tempDossierId)
                  } else {
                    resolve(0)
                  }
                },
                error: function (err) {
                  reject(0)
                }
              });
            })
          },
          getDonViNhapItems: function () {
            var vm = this
            if (vm.donViNhapItems && vm.donViNhapItems['length']) {
              console.log('Đã có đơn vị nhập')
              return
            }
            $.ajax({
              url: '/o/rest/v2/dictcollections/VR30/dictgroups/DVHANHCHINHCONG/dictitems',
              type: 'GET',
              dataType: 'json',
              data: {
                sort: 'sibling',
                full: true
              },
              headers: {
                'groupId': themeDisplay.getScopeGroupId()
              },
              success: function (response) {
                vm.donViNhapItems = response['data'].map(function (item) {
                  item['dictItemId'] = String(item['dictItemId']) || ''
                  return item
                }) || []
              },
              error: function (err) {
                console.log(err)
              }
            });
          },
          getPhieuConItems: function (vehicleClass, stampType) {
            var vm = this
            $.ajax({
              url: '/o/rest/vr-stamp/inputStampbooks/inventory',
              type: 'GET',
              dataType: 'json',
              data: {
                vehicleClass: vehicleClass,
                stampType: stampType,
                start: -1,
                end: -1
              },
              headers: {
                'groupId': themeDisplay.getScopeGroupId()
              },
              success: function (response) {
                vm.phieuConItems = response['data'] || []
              },
              error: function (err) {
                console.log(err)
                vm.phieuConItems = []
              }
            });
          },
          getDoiPhongItems: function () {
            var vm = this
            if (vm.doiPhongItems && vm.doiPhongItems['length']) {
              console.log('Đã có đơn vị nhập')
              return
            }
            $.ajax({
              url: '/o/rest/v2/temp/dictcollections/VR30/dictitems',
              type: 'GET',
              dataType: 'json',
              data: {
                sort: 'itemName'
              },
              headers: {
                'groupId': themeDisplay.getScopeGroupId()
              },
              success: function (response) {
                vm.doiPhongItems = response['data'].map(function (item) {
                  item['dictItemId'] = String(item['dictItemId'])
                  return item
                }) || []
              },
              error: function (err) {
                console.log(err)
                vm.doiPhongItems = []
              }
            });
          },
          getFormDataBanKhai: function (dossierIdCTN) {
            var vm = this
            vm.getDossierIdFromCTN(dossierIdCTN).then(function (result) {
              vm.dossierIdFormDN = result || 0
              console.log('dossierId CTN====', result)
              $.ajax({
                url: '/o/rest/vr-app/cop/reportrepository/' + result + '/1',
                type: 'GET',
                dataType: 'json',
                headers: {
                  'groupId': 55217
                },
                success: function (response) {
                  if (response && Object.keys(response).length !== 0 && response.constructor === Object) {
                    vm.detailCOP = Object.assign(vm.detailCOP, response)
                  }
                  if (!vm.detailCOP['copReportNo']) {
                    vm.genSoBaoCao(vm.detailCOP['copReportDateFrom'],
                      vm.detailCOP['applicantCode'],
                      vm.detailCOP['productionPlantCode'],
                      vm.detailCOP['copclassification'])
                  }
                  vm.getThietBiKiemTra(result)
                },
                error: function (err) {
                  console.log(err)
                }
              });
            }).catch(function (xhr) {
              console.log(xhr)
            })
          },
          convertDataCOP: function () {
            var vm = this
            var tmp = Object.assign({}, vm.detailCOP)
            // TO DO
            return tmp
          },
          convertDataCOPProductionPlantEmployee: function () {
            var vm = this
            var vr_COPProductionPlantEmployee = vm.detailCOP['danh_sach_nhan_vien'] || []
            if (vr_COPProductionPlantEmployee && vr_COPProductionPlantEmployee['length']) {
              vr_COPProductionPlantEmployee = vr_COPProductionPlantEmployee.map(function (item) {
                return {
                  mtCore: 1,
                  copReportNo: vm.detailCOP['copReportNo'],
                  sequenceNo: item['sequenceNo'],
                  employeeName: item['name'],
                  employeeCertificateNo: item['certNo'],
                  trainningAt: item['place'],
                  workingPosition: item['position'],
                  dossierId: vm.dossierIdFormDN,
                  dossierIdCTN: vm.detailModel['dossierIdCTN'],
                  dossierNo: vm.detailModel['dossierNo']
                }
              })
            }
            return vr_COPProductionPlantEmployee
          },
          convertCOPProductionPlantEquipment: function () {
            var vm = this
            var vr_COPProductionPlantEquipment = vm.detailCOP['thiet_bi_xuat_xuong'] || []
            if (vr_COPProductionPlantEquipment && vr_COPProductionPlantEquipment['length']) {
              vr_COPProductionPlantEquipment = vr_COPProductionPlantEquipment.map(function (item) {
                var MarkupXCG = 0
                var MarkupXCGNK = 0
                var MarkupSMRM = 0
                var MarkupXCH = 0
                var MarkupXCN = 0
                var MarkupXMY = 0
                var MarkupXDD = 0
                if (vm.detailCOP['copclassification'] === 'XCG') {
                  MarkupXCG = 1
                } else if (vm.detailCOP['copclassification'] === 'XCGNK') {
                  MarkupXCGNK = 1
                } else if (vm.detailCOP['copclassification'] === 'SMRM') {
                  MarkupSMRM = 1
                } else if (vm.detailCOP['copclassification'] === 'XCH') {
                  MarkupXCH = 1
                } else if (vm.detailCOP['copclassification'] === 'XCN') {
                  MarkupXCN = 1
                } else if (vm.detailCOP['copclassification'] === 'XMY') {
                  MarkupXMY = 1
                } else if (vm.detailCOP['copclassification'] === 'XDD') {
                  MarkupXDD = 1
                }
                return {
                  vrcopProductionPlantEquipmentId: item['id'],
                  mtCore: 1,
                  copReportNo: vm.detailCOP['copReportNo'],
                  productionPlantId: vm.detailCOP['productionPlantId'],
                  productionPlantCode: vm.detailCOP['productionPlantCode'],
                  sequenceNo: item['sequenceNo'],
                  equipmentCode: item['name'],
                  equipmentName: item['name_text'],
                  equipmentType: 0,
                  trademark: item['mark'],
                  trademarkName: item['mark'],
                  commercialName: '',
                  modelCode: item['model'],
                  equipmentSerialNo: item['seri'],
                  productionYear: item['year'],
                  registrationYear: 0,
                  markupXCG: MarkupXCG,
                  markupXCGNK: MarkupXCGNK,
                  markupSMRM: MarkupSMRM,
                  markupXCH: MarkupXCH,
                  markupXCN: MarkupXCN,
                  markupXMY: MarkupXMY,
                  markupXDD: MarkupXDD,
                  testingResult: item['nd_result'],
                  description: item['mt_nd_4_2_1_3'],
                  inspectionRecordNumber: item['inspectionRecordNumber'],
                  inspectionRecordDate: item['inspectionRecordDate'],
                  expiredStatus: item['expiredStatus'] || '',
                  stampTestingNo: item['temp'],
                  productionCountryCode: item['countryTest'],
                  equipmentStatus: item['statusActive'],
                  notes: item['ghi_chu'],
                  dossierId: vm.dossierIdFormDN,
                  dossierIdCTN: vm.detailModel['dossierIdCTN'],
                  dossierNo: vm.detailModel['dossierNo']
                }
              })
            }
            return vr_COPProductionPlantEquipment
          },
          calToTalPointABC: function () {
            var vm = this
            var totalPointA = 0
            var totalPointB = 0
            var totalPointC = 0
            for (var key in vm.detailCOP) {
              if (key && key.indexOf('danh_gia_') !== -1) {
                if (vm.detailCOP[key] === 'a') {
                  totalPointA++
                } else if (vm.detailCOP[key] === 'b') {
                  totalPointB++
                } else if (vm.detailCOP[key] === 'c') {
                  totalPointC++
                }
              }
            }
            vm.detailCOP['totalPointA'] = totalPointA
            vm.detailCOP['totalPointB'] = totalPointB
            vm.detailCOP['totalPointC'] = totalPointC
          },
          calToTalPointCSBHBD: function () {
            var vm = this
            var totalPointA = 0
            var totalPointB = 0
            var totalPointC = 0
            for (var key in vm.detailCSBHBD) {
              if (key && key.indexOf('danh_gia_') !== -1) {
                if (vm.detailCSBHBD[key] === 'a') {
                  totalPointA++
                } else if (vm.detailCSBHBD[key] === 'b') {
                  totalPointB++
                } else if (vm.detailCSBHBD[key] === 'c') {
                  totalPointC++
                }
              }
            }
            vm.detailCSBHBD['totalPointA'] = totalPointA
            vm.detailCSBHBD['totalPointB'] = totalPointB
            vm.detailCSBHBD['totalPointC'] = totalPointC
          },
          convertCOPReportRepository: function () {
            var vm = this
            var markupDesigner = 0
            var markupOverseasManufacturer = 0
            var markupDomesticsManufacturer = 0
            var markupMaintainer = 0
            var markupImporter = 0
            vm.calToTalPointABC()
            if (vm.detailModel['list_COP_TrongNuoc_NuocNgoai'] === 'TK') {
              markupDesigner = 1
            } else if (vm.detailModel['list_COP_TrongNuoc_NuocNgoai'] === 'NN') {
              markupOverseasManufacturer = 1
            } else if (vm.detailModel['list_COP_TrongNuoc_NuocNgoai'] === 'TN') {
              markupDomesticsManufacturer = 1
            } else if (vm.detailModel['list_COP_TrongNuoc_NuocNgoai'] === 'BHBD') {
              markupMaintainer = 1
            } else if (vm.detailModel['list_COP_TrongNuoc_NuocNgoai'] === 'NK') {
              markupImporter = 1
            }
            return {
              mtCore: 1,
              convertAssembleId: 0,
              dossierId: vm.dossierIdFormDN,
              dossierIdCTN: vm.detailModel['dossierIdCTN'],
              dossierNo: vm.detailModel['dossierNo'],
              applicantprofileid: vm.detailCOP['dossierNo'],
              applicantCode: vm.detailCOP['applicantCode'],
              applicantName: vm.detailCOP['applicantName'],
              applicantAddress: vm.detailCOP['applicantAddress'],
              applicantRepresentative: vm.detailCOP['applicantRepresentative'],
              applicantRepresentativeTitle: vm.detailCOP['applicantRepresentativeTitle'],
              applicantEmail: vm.detailCOP['applicantEmail'],
              applicantPhone: vm.detailCOP['applicantPhone'],
              applicantTelNo: vm.detailCOP['applicantTelNo'],
              applicantFax: vm.detailCOP['applicantFax'],
              applicantContactName: vm.detailCOP['applicantContactName'],
              applicantContactEmail: vm.detailCOP['applicantContactEmail'],
              applicantContactPhone: vm.detailCOP['applicantContactPhone'],
              applicantContactTelNo: vm.detailCOP['applicantContactTelNo'],
              applicantBusinessType: vm.detailCOP['applicantBusinessType'],
              markupDesigner: markupDesigner,
              markupOverseasManufacturer: markupOverseasManufacturer,
              markupDomesticsManufacturer: markupDomesticsManufacturer,
              markupMaintainer: markupMaintainer,
              markupImporter: markupImporter,
              importerDomesticSite: vm.detailCOP['importerDomesticSite'],
              siteOfNationality: vm.detailCOP['siteOfNationality'],
              siteOfNationalityCode: vm.detailCOP['siteOfNationalityCode'],
              siteOfRegion: vm.detailCOP['siteOfRegion'],
              siteOfRegionCode: vm.detailCOP['siteOfRegionCode'],
              siteOfCity: vm.detailCOP['siteOfCity'],
              siteOfCityCode: vm.detailCOP['siteOfCityCode'],
              manufacturerRepresentative: vm.detailCOP['manufacturerRepresentative'],
              manufacturerRepresentativeTitle: vm.detailCOP['manufacturerRepresentativeTitle'],
              manufacturerEmail: vm.detailCOP['manufacturerEmail'],
              manufacturerPhone: vm.detailCOP['manufacturerPhone'],
              manufacturerFax: vm.detailCOP['manufacturerFax'],
              overseasManufacturerCode: vm.detailCOP['overseasManufacturerCode'],
              overseasManufacturerName: vm.detailCOP['overseasManufacturerName'],
              overseasmanufacturerAddress: vm.detailCOP['overseasmanufacturerAddress'],
              productionPlantId: vm.detailCOP['productionPlantId'] || 0,
              productionPlantCode: vm.detailCOP['ma_so_xuong'],
              productionPlantName: vm.detailCOP['ten_xuong_san_xuat'],
              productionPlantAddress: vm.detailCOP['dia_chi_xuong'],
              productionPlantEmail: vm.detailCOP['email_xuong'],
              productionPlantWebsite: vm.detailCOP['web_doanh_nghiep'],
              productionPlantRepesentative: vm.detailCOP['nguoi_dai_dien_xuong'],
              productionPlantRepresentativeTitle: vm.detailCOP['chuc_danh_dai_dien_xuong'],
              importerManufacturerCode: vm.detailCOP['importerManufacturerCode'],
              importerManufacturerName: vm.detailCOP['importerManufacturerName'],
              importerManufacturerAddress: vm.detailCOP['importerManufacturerAddress'],
              markupdomesticsmanufacturer: vm.detailCOP['markupdomesticsmanufacturer'],
              copReportNo: vm.detailCOP['copReportNo'],
              copReportDate: vm.detailCOP['copReportDateFrom'],
              copReportStatus: vm.detailCOP['copReportStatus'],
              copReportType: vm.detailCOP['loai_hinh_danh_gia'],
              copClassification: vm.detailCOP['copclassification'],
              productClassificationDescription: vm.detailCOP['productClassificationDescription'],
              copReportMetadata: vm.detailCOP['copReportMetadata'],
              copReportSignName: vm.detailCOP['copReportSignName'],
              copReportSignTitle: vm.detailCOP['copReportSignTitle'],
              copReportSignPlace: vm.detailCOP['copReportSignPlace'],
              copReportApprovedDate: vm.detailCOP['copReportApprovedDate'],
              copReportExpiredDate: vm.detailCOP['copReportExpiredDate'],
              copFileEntryId: vm.detailCOP['copFileEntryId'],
              totalPointA: vm.detailCOP['totalPointA'],
              totalPointB: vm.detailCOP['totalPointB'],
              totalPointC: vm.detailCOP['totalPointC'],
              copNonConformity: vm.detailCOP['copNonConformity'],
              inspectionRecordno: vm.detailCOP['inspectionRecordno'],
              inspectionRecorddate: vm.detailCOP['inspectionRecorddate'],
              corporationId: vm.detailCOP['corporationId'],
              inspectorId: vm.detailCOP['inspectorId'],
              inspectionSite: vm.detailCOP['inspectionSite'],
              inspectionDateFrom: vm.detailCOP['inspectionDateFrom'],
              inspectionDateTo: vm.detailCOP['inspectionDateTo'],
              subInspector: vm.detailCOP['subInspector'],
              inspectionRecordFileEntryId: vm.detailCOP['inspectionRecordFileEntryId'],
              copReportRefNo: vm.detailCOP['copReportRefNo'],
              copReportRefDate: vm.detailCOP['copReportRefDate'],
              copReportPreviousNo: vm.detailCOP['copReportPreviousNo'],
              copReportPreviousDate: vm.detailCOP['copReportPreviousDate'],
              expiredStatus: vm.detailCOP['expiredStatus'],
              description: vm.detailCOP['description'],
              corporationName: vm.detailCOP['corporationName'],
              inspectorContactCode: vm.detailCOP['inspectorContactCode'],
              inspectorName: vm.detailCOP['inspectorName'],
              inspectorEndorsementDate: vm.detailCOP['inspectorEndorsementDate'],
              inspectorDeadline: vm.detailCOP['inspectorDeadline'],
              resolvedStatus: vm.detailCOP['resolvedStatus'],
              numberOfNonConformity: vm.detailCOP['numberOfNonConformity'],
              numberOfResolved: vm.detailCOP['numberOfResolved'],
              observationDescription: vm.detailCOP['observationDescription'],
              inspectionAuditCycle: vm.detailCOP['inspectionAuditCycle'],
              inspectionNote: vm.detailCOP['inspectionNote'],
              productionConformityChecking: vm.detailCOP['productionConformityChecking'],
              productionStampChecking: vm.detailCOP['productionStampChecking'],
              testingEquipmentChecking: vm.detailCOP['testingEquipmentChecking'],
              productionPlantClassification: vm.detailCOP['productionPlantClassification'],
              actualCapacity: vm.detailCOP['actualCapacity'],
              maxCapacity: vm.detailCOP['maxCapacity'],
              averageCapacity: vm.detailCOP['averageCapacity'],
              totalEmployee: vm.detailCOP['totalEmployee'],
              totalWorker: vm.detailCOP['diem_nd_5_1_1'],
              totalManager: vm.detailCOP['diem_nd_5_1_2'],
              totalTechnical: vm.detailCOP['diem_nd_5_1_2'],
              totalQaEmployee: vm.detailCOP['diem_nd_5_1_3'],
              totalSquaremeter: vm.detailCOP['totalSquaremeter'],
              warehouseSquare: vm.detailCOP['warehouseSquare'],
              officeSquare: vm.detailCOP['officeSquare'],
              productionSquare: vm.detailCOP['productionSquare'],
              machiningArea: vm.detailCOP['machiningArea'],
              weldingArea: vm.detailCOP['weldingArea'],
              paintingArea: vm.detailCOP['paintingArea'],
              productionAssembleArea: vm.detailCOP['productionAssembleArea'],
              finishProductArea: vm.detailCOP['finishProductArea'],
              testingArea: vm.detailCOP['testingArea'],
              selfEquipment: vm.detailCOP['selfEquipment'],
              contractEquipment: vm.detailCOP['contractEquipment'],
              circularNo: vm.detailCOP['circularNo'],
              circularDate: vm.detailCOP['circularDate'],
              circularNo2: vm.detailCOP['circularNo2'],
              circularDate2: vm.detailCOP['circularDate2'],
              module: '01'
            }
          },
          postDataCOP: function () {
            var vm = this
            var dklrData = {}
            // dklrData['vr_COPProductionPlantEmployee'] = vm.convertDataCOPProductionPlantEmployee()
            dklrData['vr_COPReportRepository'] = vm.convertCOPReportRepository()
            dklrData['vr_COPProductionPlantEquipment'] = vm.convertCOPProductionPlantEquipment()
            var jsonData = new Object();
            jsonData['body'] = dklrData;
            jsonData['indice'] = 'vr_COPReportRepository';
            $.ajax('/o/rest/vr-app/post', {
              type: 'POST',
              data: JSON.stringify(jsonData),
              dataType: 'json',
              contentType: 'application/json',
              processData: false,
              success: function (data) {
                if (data['status'] && data['status']['err_msg'] == 'success') {
                  console.log('POST API thanh cong');
                  vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thành công!";
                  vm.snackbardossierViewJX = true;
                }
              },
              error: function (data) {
                if (!data['status'] || !(data['status']['err_msg'] == 'success')) {
                  console.log('POST API that bai');
                  vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thất bại, vui lòng thử lại!";
                  vm.snackbarerordossierViewJX = true;
                }
              }
            });
          },
          getCurrentTime: function () {
            var date = new Date()
            return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear()
          },
          genSoBaoCao: function (copReportDateFrom, applicantCode, productionPlantCode, copclassification) {
            var vm = this
            $.ajax({
              url: '/o/rest/vr-app/cop/reportrepository/count',
              type: 'GET',
              data: {
                copreportdate: copReportDateFrom,
                applicantcode: applicantCode,
                productionplantcode: productionPlantCode,
                copclassification: copclassification
              },
              dataType: 'json',
              success: function (data) {
                console.log('genSoBaoCao=========', data)
                vm.detailCOP['copReportNo'] = vm.detailCOP['applicantCode'] + '/' +
                  vm.detailCOP['ma_so_nha_xuong'] + '/' +
                  vm.detailCOP['copclassification'] + '/' +
                  vm.detailCOP['copReportDateFrom'] + '/' +
                  data
              },
              error: function (data) { }
            });
          },
          getThietBiKiemTra: function (dossierId) {
            var vm = this
            $.ajax({
              url: '/o/rest/vr-app/cop/productionplant/prodequipment/' + dossierId + '/1',
              type: 'GET',
              data: {},
              dataType: 'json',
              success: function (data) {
                if (data && data['data']) {
                  // vm.detailCOP['thiet_bi_xuat_xuong'] = data['data'] || []
                  for (var i = 0; i < vm.detailCOP['thiet_bi_xuat_xuong']['length']; i++) {
                    var tmp = vm.detailCOP['thiet_bi_xuat_xuong'][i]
                    for (var j = 0; j < data['data'].length; j++) {
                      var tmpTb = data['data'][j]
                      if (tmp && tmp['name'] === tmpTb['name'] &&
                        tmp['model'] === tmpTb['model'] &&
                        tmp['seri'] === tmpTb['seri'] &&
                        tmp['mark'] === tmpTb['mark']) {
                        console.log('===========')
                        vm.detailCOP['thiet_bi_xuat_xuong'][i] = Object.assign({}, tmpTb, tmp)
                      }
                    }
                  }
                  vm.initFormPopupBienBanThietBi()
                  // for (var i = 0; i < vm.detailCOP['thiet_bi_xuat_xuong'].length; i++) {
                  // 	vm.detailCOP['thiet_bi_xuat_xuong'][i] = Object.assign(vm.detailCOP['thiet_bi_xuat_xuong'][i], data['data'][i])
                  // }
                }
              },
              error: function (data) { }
            });
          },
          toKetQuaKiemTra: function (item, index, itemParent) {
            var vm = this
            console.log('toKetQuaKiemTra==========', item)
            vm.indexThietBi = index
            vm.labelPopupThietBiCOP = item['name']
            vm.thietBiKiemTra = {
              totalD: 0,
              totalKD: 0,
              totalNA: 0,
              dang_kiem_vien_1: vm.detailCOP['dang_kiem_vien_1'],
              dang_kiem_vien_2: vm.detailCOP['dang_kiem_vien_2'],
              copReportNo: vm.detailCOP['copReportNo'],
              copReportDateFrom: vm.detailCOP['copReportDateFrom'],
              copReportDateTo: vm.detailCOP['copReportDateTo']
            }
            item['ky_hieu'] = itemParent['ky_hieu']
            if (item['name'] === '1009' ||
              item['name'] === 'LRTBKT3' ||
              item['name'] === 'LRTBKT2' ||
              item['name'] === '1001' ||
              item['name'] === '1019' ||
              item['name'] === 'LRTBKT44' ||
              item['name'] === 'LRTBKT70') {
              vm.statePopupCOP = 'MAU_1'
              if (item['name'] === '1009' || item['name'] === 'LRTBKT2' || item['name'] === '1001') {
                vm.labelMauCOP = 'thiết bị kiểm tra độ ồn'
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị tạo độ ồn chuẩn'
                vm.donVi = 'db(A)'
              } else if (item['name'] === '1019') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đo tốc độ vòng quay chuyên dùng'
                vm.labelMauCOP = 'thiết bị kiểm tra đồng hồ tốc độ'
                vm.donVi = 'km/h'
              } else {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đo tốc độ vòng quay chuyên dùng'
                vm.labelMauCOP = 'thiết bị kiểm tra đồng hồ tốc độ'
                vm.donVi = 'km/h'
              }
            } else if (item['name'] === '1007' ||
              item['name'] === '1011' ||
              item['name'] === 'LRTBKT43') {
              vm.statePopupCOP = 'MAU_2'
              vm.labelMauCOP = 'thiết bị kiểm tra lực phanh'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng cách tạo lực phanh chuẩn thông qua các khối lượng chuẩn và đồ gá'
              vm.donVi = 'N'
            } else if (item['name'] === '1013' ||
              item['name'] === '1016' ||
              item['name'] === '1005' ||
              item['name'] === '1018' ||
              item['name'] === '1020' ||
              item['name'] === 'LRTBKT7' ||
              item['name'] === 'LRTBKT42' ||
              item['name'] === 'LRTBKT45') {
              vm.statePopupCOP = 'MAU_3'
              if (item['name'] === '1016') {
                vm.donVi = 'độ'
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị bằng thước đo góc chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra góc quay lái của bánh xe dẫn hướng'
              } else if (item['name'] === '1020') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng cách tạo lực phanh chuẩn thông qua các khối lượng chuẩn và dồ gá'
                vm.labelMauCOP = 'thiết bị kiểm tra phanh'
              } else if (item['name'] === '1018' || item['name'] === 'LRTBKT42') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng các khối lượng chuẩn/ lực chuẩn'
                vm.labelMauCOP = 'kiểm tra thiết bị cân'
              } else {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị tạo độ sáng chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra đèn pha'
              }
            } else if (item['name'] === 'LRTBKT5' || item['name'] === '1012') {
              vm.statePopupCOP = 'MAU_4'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đồng hồ đo và đồ gá chuẩn'
              vm.labelMauCOP = 'thiết bị kiểm tra độ trượt ngang'
            } else if (item['name'] === '1004' || item['name'] === 'LRTBKT22' || item['name'] === '1021') {
              vm.statePopupCOP = 'MAU_5'
              if (item['name'] === '1021') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị hồ sơ và đồ gá chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra độ không trùng vết'
              } else {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đồng hồ đo và đồ gá chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra độ không trùng vết bánh xe'
              }
            } else if (item['name'] === '1015' || item['name'] === 'LRTBKT1') {
              vm.statePopupCOP = 'MAU_6'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng giấy chuẩn (kính chuẩn)'
              vm.labelMauCOP = 'thiết bị đo khói động cơ Diesel'
              if (item['resultTest'] && item['resultTest']['length']) {
                item['resultTest'].map(function (itemTmp) {
                  if (!itemTmp['unit_1']) {
                    itemTmp['unit_1'] = 'm^1'
                  }
                  if (!itemTmp['unit_2']) {
                    itemTmp['unit_2'] = '% HSU'
                  }
                  return itemTmp
                })
              }
            } else if (item['name'] === 'LRTBKT21' ||
              item['name'] === '1006' ||
              item['name'] === '1014' ||
              item['name'] === 'LRTBKT46') {
              vm.statePopupCOP = 'MAU_7'
              vm.labelMauCOP = 'thiết bị phân tích khí thải động cơ xăng'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng bình khí chuẩn'
            } else if (item['name'] === '1010' || item['name'] === 'LRTBKT3') {
              vm.statePopupCOP = 'MAU_8'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đo tốc độ vòng quay chuyên dùng'
              vm.labelMauCOP = 'thiết bị kiểm tra sai số đồng hồ tốc độ'
            } else if (item['name'] === '1017') {
              vm.statePopupCOP = 'MAU_9'
              vm.labelKiemTraMauCOP = 'Kiểm tra sự đầy đủ các chức năng hoạt động của thiết bị'
              vm.labelMauCOP = 'thiết bị kiểm tra góc đặt bánh xe'
            }
            item = vm.setDefaultValue(item)
            vm.thietBiKiemTra = Object.assign(vm.thietBiKiemTra, item)
            vm.calPointCop()
            vm.popUpThietBiCOP = true
            vm.labelPopupThietBiCOP = ''
          },
          toKetQuaKiemTraCSBHBD: function (item, index, itemParent) {
            var vm = this
            console.log('toKetQuaKiemTraCSBHBD==========', item)
            vm.indexThietBi = index
            vm.labelPopupThietBiCOP = item['name']
            vm.thietBiKiemTra = {
              totalD: 0,
              totalKD: 0,
              totalNA: 0,
              dang_kiem_vien_1: vm.detailCSBHBD['dang_kiem_vien_1'],
              dang_kiem_vien_2: vm.detailCSBHBD['dang_kiem_vien_2'],
              copReportNo: vm.detailCSBHBD['copReportNo'],
              dossierNo: vm.detailCSBHBD['dossierNo'],
              copReportDateFrom: vm.detailCSBHBD['copReportDateFrom'],
              copReportDateTo: vm.detailCSBHBD['copReportDateTo']
            }
            item['ky_hieu'] = itemParent['ky_hieu']
            if (item['name'] === '1009' ||
              item['name'] === 'LRTBKT3' ||
              item['name'] === 'LRTBKT2' ||
              item['name'] === '1001' ||
              item['name'] === '1019' ||
              item['name'] === 'LRTBKT44' ||
              item['name'] === 'LRTBKT70') {
              vm.statePopupCOP = 'MAU_1'
              if (item['name'] === '1009' || item['name'] === 'LRTBKT2' || item['name'] === '1001') {
                vm.labelMauCOP = 'thiết bị kiểm tra độ ồn'
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị tạo độ ồn chuẩn'
                vm.donVi = 'db(A)'
              } else if (item['name'] === '1019') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đo tốc độ vòng quay chuyên dùng'
                vm.labelMauCOP = 'thiết bị kiểm tra đồng hồ tốc độ'
                vm.donVi = 'km/h'
              } else {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đo tốc độ vòng quay chuyên dùng'
                vm.labelMauCOP = 'thiết bị kiểm tra đồng hồ tốc độ'
                vm.donVi = 'km/h'
              }
            } else if (item['name'] === '1007' ||
              item['name'] === '1011' ||
              item['name'] === 'LRTBKT43') {
              vm.statePopupCOP = 'MAU_2'
              vm.labelMauCOP = 'thiết bị kiểm tra lực phanh'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng cách tạo lực phanh chuẩn thông qua các khối lượng chuẩn và đồ gá'
              vm.donVi = 'N'
            } else if (item['name'] === '1013' ||
              item['name'] === '1016' ||
              item['name'] === '1005' ||
              item['name'] === '1018' ||
              item['name'] === '1020' ||
              item['name'] === 'LRTBKT7' ||
              item['name'] === 'LRTBKT42' ||
              item['name'] === 'LRTBKT45') {
              vm.statePopupCOP = 'MAU_3'
              if (item['name'] === '1016') {
                vm.donVi = 'độ'
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị bằng thước đo góc chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra góc quay lái của bánh xe dẫn hướng'
              } else if (item['name'] === '1020') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng cách tạo lực phanh chuẩn thông qua các khối lượng chuẩn và dồ gá'
                vm.labelMauCOP = 'thiết bị kiểm tra phanh'
              } else if (item['name'] === '1018' || item['name'] === 'LRTBKT42') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng các khối lượng chuẩn/ lực chuẩn'
                vm.labelMauCOP = 'kiểm tra thiết bị cân'
              } else {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị tạo độ sáng chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra đèn pha'
              }
            } else if (item['name'] === 'LRTBKT5' || item['name'] === '1012') {
              vm.statePopupCOP = 'MAU_4'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đồng hồ đo và đồ gá chuẩn'
              vm.labelMauCOP = 'thiết bị kiểm tra độ trượt ngang'
            } else if (item['name'] === '1004' || item['name'] === 'LRTBKT22' || item['name'] === '1021') {
              vm.statePopupCOP = 'MAU_5'
              if (item['name'] === '1021') {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị hồ sơ và đồ gá chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra độ không trùng vết'
              } else {
                vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đồng hồ đo và đồ gá chuẩn'
                vm.labelMauCOP = 'thiết bị kiểm tra độ không trùng vết bánh xe'
              }
            } else if (item['name'] === '1015' || item['name'] === 'LRTBKT1') {
              vm.statePopupCOP = 'MAU_6'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng giấy chuẩn (kính chuẩn)'
              vm.labelMauCOP = 'thiết bị đo khói động cơ Diesel'
              if (item['resultTest'] && item['resultTest']['length']) {
                item['resultTest'].map(function (itemTmp) {
                  if (!itemTmp['unit_1']) {
                    itemTmp['unit_1'] = 'm^1'
                  }
                  if (!itemTmp['unit_2']) {
                    itemTmp['unit_2'] = '% HSU'
                  }
                  return itemTmp
                })
              }
            } else if (item['name'] === 'LRTBKT21' ||
              item['name'] === '1006' ||
              item['name'] === '1014' ||
              item['name'] === 'LRTBKT46') {
              vm.statePopupCOP = 'MAU_7'
              vm.labelMauCOP = 'thiết bị phân tích khí thải động cơ xăng'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng bình khí chuẩn'
            } else if (item['name'] === '1010' || item['name'] === 'LRTBKT3') {
              vm.statePopupCOP = 'MAU_8'
              vm.labelKiemTraMauCOP = 'Kiểm tra độ chính xác của thiết bị bằng thiết bị đo tốc độ vòng quay chuyên dùng'
              vm.labelMauCOP = 'thiết bị kiểm tra sai số đồng hồ tốc độ'
            } else if (item['name'] === '1017') {
              vm.statePopupCOP = 'MAU_9'
              vm.labelKiemTraMauCOP = 'Kiểm tra sự đầy đủ các chức năng hoạt động của thiết bị'
              vm.labelMauCOP = 'thiết bị kiểm tra góc đặt bánh xe'
            }
            console.log('222222222222222222222222')
            item = vm.setDefaultValue(item)
            console.log('33333333333333333333')
            vm.thietBiKiemTra = Object.assign(vm.thietBiKiemTra, item)
            vm.calPointCop()
            console.log('444444444444444444')
            vm.popUpThietBiXuatXuongCSBHBD = true
            vm.labelPopupThietBiCOP = ''
          },
          setDefaultValue: function (item) {
            var vm = this
            var arrKeyBase = ['mark', 'model', 'seri', 'year', 'country']
            var arrKey = ['markTest', 'modelTest', 'seriTest', 'yearTest', 'countryTest']
            var arrKeyResult = ['resultMark', 'resultModel', 'resultSeri', 'resultYear', 'resultCountry']
            // copy thông số chuẩn vào thông số đo khi chưa có dữ liệu
            for (var i = 0; i < arrKey.length; i++) {
              if (!item[arrKey[i]]) {
                item[arrKey[i]] = item[arrKeyBase[i]]
              }
            }
            //set default value 'đạt' cho 5 mục đầu khi chưa có dữ liệu
            for (var i = 0; i < arrKeyResult.length; i++) {
              if (!item[arrKeyResult[i]]) {
                item[arrKeyResult[i]] = 1 // 1 là đạt
              }
            }
            return item
          },
          getDangKiemVien: function () {
            var vm = this
            return new Promise(function (resolve, reject) {
              $.ajax({
                url: '/o/rest/v2/employees/role/62111',
                dataType: "json",
                type: "GET",
                data: {
                  'active': true
                },
                headers: {
                  "groupId": themeDisplay.getScopeGroupId()
                },
                success: function (result) {
                  vm.dangKiemVienItems = result['data'].map(function (item) {
                    if (item['mappingUser'] && item['mappingUser']['userId']) {
                      item['userId'] = item['mappingUser']['userId'] ? String(item['mappingUser']['userId']) : ''
                    }
                    return item
                  }) || []
                  console.log('vm.dangKiemVienItems========', vm.dangKiemVienItems)
                  resolve(result);
                },
                error: function (result) {
                  vm.dangKiemVienItems = []
                  reject(result);
                }
              });
            })
          },
          getTSKT: function (vehicleclass, table) {
            var vm = this
            if (!vehicleclass) {
              return new Promise()
            }
            var url = '/o/rest/vr-app/techspecs/' + vehicleclass + '/vehicleclassexts'
            var urlTDTK = '/o/rest/vr-app/techspecs/' + 'TDTK' + vehicleclass + '/vehicleclassexts'
            var configTSKT = {
              headers: {
                apikey: "1234567890",
                module: "",
                groupId: themeDisplay.getScopeGroupId()
              }
            }
            var tskt = axios.get(url, configTSKT)
            var tsktExts = axios.get(urlTDTK, configTSKT)
            Promise.all([tskt, tsktExts]).then(function (results) {
              var resTSKT = results[0]['data'] || []
              var resTSKT2 = results[1]['data'] || []
              console.log("resTSKT============", resTSKT)
              console.log("resTSKT2============", resTSKT2)
              var resTmp = resTSKT.concat(resTSKT2)
              var res = []
              for (var i = 0; i < resTmp.length; i++) {
                var items = resTmp[i]['items'] || []
                for (var j = 0; j < items.length; j++) {
                  if (items[j] && items[j]['datasource']) {
                    res.push({
                      "key": "data." + table + "." + items[j]['key'],
                      "value": items[j]['title'],
                      "type": "select",
                      "itemText": "text",
                      "itemValue": "value",
                      "items": items[j]['datasource']
                    })
                  } else {
                    res.push({
                      "key": "data." + table + "." + items[j]['key'],
                      "value": items[j]['title'],
                      "type": "string"
                    })
                  }
                }
              }
              console.log("res============", res)
              vm.conditions = vm.conditions.concat(res)
            })
          },
          selectModuleAction: function () {
            var vm = this
            console.log('selectModule+++++', vm.selectModule)
            vm.listsTraCuu = []
            vm.lengthPageTraCuuThongKe = 0
            vm.pageTraCuuThongKe = 1
            vm.listSearch = [{
              index: 0,
              value: null,
              searchType: null,
              dataitem: null,
              dataCollection: [],
              conditionsSelect: {}
            }]
            if (vm.selectModule && vm.selectModule['module'] === 'COP') {
              vm.headersTraCuu = headersCOP
              vm.conditions = conditionsCOP
              vm.soureTable = 'vr_COPReportRepository'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTTDTKXCG') {
              vm.headersTraCuu = headersThamDinh
              vm.conditions = conditionsTDTKXCG
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTTDTKXMCD') {
              vm.headersTraCuu = headersThamDinh
              vm.conditions = conditionsTDTKXMCD
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTKTSPMXCG') {
              vm.headersTraCuu = headersKiemTraSanPhamMau
              vm.conditions = conditionsKTSPMXCG
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTKTSPMXCNBB') {
              vm.headersTraCuu = headersKiemTraSanPhamMau
              vm.conditions = conditionsKTSPMXCNBB
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXCG') {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKLXCG
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXMTGM') {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKLXMY
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTCNCLKLLKOTO') {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKLLKXCG
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTCNCLKLLKXM') {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKLLKXMY
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXBBCN') {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKLXCN
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXBBCH') {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKLXCH
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXDD') {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKLXDD
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else if (vm.selectModule && (vm.selectModule['module'] === 'TT302011BGTVTKTSPMXBBCN' || vm.selectModule['module'] === 'TT302011BGTVTKTSPMXCG')) {
              vm.headersTraCuu = headersThamDinh
              vm.conditions = conditionsKTSPMXCG
              vm.soureTable = 'vr_VehicleTypeCertificate'
            } else {
              vm.headersTraCuu = headersCNCLKL
              vm.conditions = conditionsCNCLKL
              vm.soureTable = 'vr_VehicleTypeCertificate'
            }
            // load thông số kỹ thuật từ api cho vào điều kiện tìm kiếm
            if (vm.selectModule['vehicleClass'] && vm.selectModule['table']) {
              vm.getTSKT(vm.selectModule['vehicleClass'], vm.selectModule['table'])
            }
          },
          closeDialogTSKT: function () {
            this.dialogTSKT = false
            $("#column-auto-2-view").empty();
          },
          xemGiayChungNhan: function (item) {
            var vm = this
            console.log('item=====xemGiayChungNhan', item)
            if (!item['vr_VehicleTypeCertificate'] || !item['vr_VehicleTypeCertificate']['deliverableFileEntryid']) {
              console.log('not deliverableFileEntryid', item['vr_VehicleTypeCertificate']['deliverableFileEntryid'])
              return;
            }
            var url = '/o/rest/v2/dossiers/fileEntryId/' + item['vr_VehicleTypeCertificate']['deliverableFileEntryid']
            var configs = {
              headers: {},
              responseType: 'blob'
            }
            axios.get(url, configs).then(function (response) {
              var urlRes = window.URL.createObjectURL(response.data);
              window.open(urlRes, '_blank');
            }).catch(function (xhr) {
              console.log(xhr)
            })
          },
          xemBienBan: function (item) { },
          checkMtCore: function (item) {
            var vm = this
            var result = ''
            var ref = vm.soureTable + '.mtCore'
            var arrKey = ref.split('.')
            for (var i = 0; i < arrKey.length; i++) {
              var key = arrKey[i]
              if (typeof result === 'object' && result.constructor === Object) {
                result = result[key]
              } else {
                result = item[key]
              }
            }
            // console.log('mtCore==========', result)
            if (result && (result === 1 || result === '1')) {
              return true
            } else {
              return false
            }
          },
          getDisplay: function (item, link, type) {
            var result = ''
            if (!link) {
              return ''
            } else {
              var arrKey = link.split('.')
              for (var i = 0; i < arrKey.length; i++) {
                var key = arrKey[i]
                if (typeof result === 'object' && result.constructor === Object) {
                  result = result[key]
                } else {
                  result = item[key]
                }
              }
            }
            if (type && type === 'date' && result) {
              var date = new Date(result)
              var strDate = date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear()
              result = strDate
            }
            return result
          },
          parseTimestamp: function (str) {
            if (!str) {
              return 0
            }
            var dateString = str;
            var dateMomentObject = moment(dateString, "DD/MM/YYYY");
            var dateObject = dateMomentObject.toDate();
            return dateObject.getTime() || 0
          },
          generateQuery: function (query) {
            var vm = this
            var mustQuery = [{
              'match': {
                'type_es': vm.soureTable
              }
            }]
            var temQuery = []
            var queries = {
              'indice': vm.soureTable,
              'query': {
                'size': 20,
                'from': this.pageTraCuuThongKe * 20 - 20,
                "_source": {
                  "excludes": [
                    "data.vr_VehicleSpecification"
                  ]
                },
                'query': {
                  'bool': {
                    'must': mustQuery
                  }
                }
              }
            }
            for (var i = 0; i < vm.listSearch.length; i++) {
              if (vm.listSearch[i] && vm.listSearch[i]['conditionsSelect']) {
                var conditionsSelect = vm.listSearch[i]['conditionsSelect']
                var key = conditionsSelect['key']
                if (key && key.indexOf('data.') === -1) {
                  key = "data." + key
                }
                if (vm.listSearch[i]['conditionsSelect']['type'] === 'string') {
                  if (conditionsSelect) {
                    var tmpObj = {}
                    tmpObj[key] = vm.listSearch[i]['valueSearch'] ? vm.listSearch[i]['valueSearch'].trim() : ''
                    mustQuery.push({
                      'match_phrase': tmpObj
                    })
                  }
                } else if (vm.listSearch[i]['conditionsSelect']['type'] === 'keyword') {
                  if (conditionsSelect) {
                    var tmpObj = {
                      term: {}
                    }
                    tmpObj['term'][key] = vm.listSearch[i]['valueSearch'] ? vm.listSearch[i]['valueSearch'].trim() : ''
                    mustQuery.push(tmpObj)
                  }
                } else if (vm.listSearch[i]['conditionsSelect']['type'] === 'date') {
                  if (conditionsSelect) {
                    var tmpObj = {}
                    var fromDate = vm.parseTimestamp(vm.listSearch[i]['fromDate'])
                    var toDate = vm.parseTimestamp(vm.listSearch[i]['toDate'])
                    // tmpObj[key] = {
                    // 	timestamp: {
                    // 		gte: fromDate,
                    //   	lte: toDate
                    // 	}
                    // }
                    tmpObj[key] = {
                      gte: fromDate,
                      lte: toDate
                    }
                    mustQuery.push({
                      'range': tmpObj
                    })
                  }
                } else if (vm.listSearch[i]['conditionsSelect']['type'] === 'number') {
                  console.log('typeSearch+++++++++++++++++++', vm.listSearch[i]['typeSearch'])
                  if (conditionsSelect) {
                    var tmpObj = {}
                    tmpObj[key] = {}
                    if (vm.listSearch[i]['typeSearch'] === 'gte') {
                      tmpObj[key] = {
                        gte: parseFloat(vm.listSearch[i]['valueSearch'])
                      }
                      mustQuery.push({
                        'range': tmpObj
                      })
                    } else if (vm.listSearch[i]['typeSearch'] === 'lte') {
                      tmpObj[key] = {
                        lte: parseFloat(vm.listSearch[i]['valueSearch'])
                      }
                      mustQuery.push({
                        'range': tmpObj
                      })
                    } else if (vm.listSearch[i]['typeSearch'] === '=') {
                      tmpObj[key] = {
                        lte: parseFloat(vm.listSearch[i]['valueSearch']),
                        gte: parseFloat(vm.listSearch[i]['valueSearch'])
                      }
                      // tmpObj['term'][key + '.keyword'] = vm.listSearch[i]['valueSearch']
                      // tmpObj['term'][key] = vm.listSearch[i]['valueSearch'] ? vm.listSearch[i]['valueSearch'].trim() : ''
                      // mustQuery.push(tmpObj)
                      mustQuery.push({
                        'range': tmpObj
                      })
                    } else {
                      tmpObj[key] = vm.listSearch[i]['valueSearch'] ? vm.listSearch[i]['valueSearch'].trim() : ''
                      mustQuery.push({
                        'match_phrase': tmpObj
                      })
                    }
                  }
                } else if (vm.listSearch[i]['conditionsSelect']['type'] === 'select') {
                  if (conditionsSelect) {
                    var tmpObj = {
                      term: {

                      }
                    }
                    // tmpObj['term'][key + '.keyword'] = vm.listSearch[i]['valueSearch']
                    tmpObj['term'][key] = vm.listSearch[i]['valueSearch'] ? vm.listSearch[i]['valueSearch'].trim() : ''
                    mustQuery.push(tmpObj)
                    // if (vm.listSearch[i]['typeSearch'] === '=') {

                    //  } else {
                    //  	var tmpObj = {}
                    //  	tmpObj[key] = vm.listSearch[i]['valueSearch']
                    //  	mustQuery.push({
                    //  		'match_phrase': tmpObj
                    //  	})
                    //  }
                  }
                }
              }
            }
            var tmpObj = {
              term: {

              }
            }
            tmpObj['term']['data.vr_VehicleTypeCertificate.serviceCode'] = vm.selectModule['module'] || ''
            mustQuery.push(tmpObj)
            // // module Kiểm tra sản phẩm mẫu Xe cơ giới
            // if (vm.selectModule && (vm.selectModule['module'] === 'TT302011BGTVTKTSPMXCG' || vm.selectModule['module'] === 'TT302011BGTVTKTSPMXBBCN')) {
            // 	var tmpObj = {}
            // 	tmpObj['data.vr_VehicleTypeCertificate.serviceCode'] = '02'
            // 	mustQuery.push({
            // 		'match': tmpObj
            // 	})
            // // Thẩm định thiết kế
            // } else if (vm.selectModule && (vm.selectModule['module'] === 'TT302011BGTVTTDTKXMCD' || vm.selectModule['module'] === 'TT302011BGTVTTDTKXCG')) {
            // 	var tmpObj = {}
            // 	tmpObj['data.vr_VehicleTypeCertificate.serviceCode'] = '01'
            // 	mustQuery.push({
            // 		'match': tmpObj
            // 	})
            // // Xác nhận hiệu lực GCN kiểu loại toàn xe
            // } else if (vm.selectModule && (vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXBBCHXNHL' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXBBCNXNHL' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXCGXNHL' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXMTGMXNHL' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXDDXNHL')) {
            // 	var tmpObj = {}
            // 	tmpObj['data.vr_VehicleTypeCertificate.serviceCode'] = '03'
            // 	mustQuery.push({
            // 		'match': tmpObj
            // 	})
            // // XNHL GCN Chứng nhận chất lượng kiểu loại linh kiện
            // } else if (vm.selectModule && (vm.selectModule['module'] === 'TT302011BGTVTCNCLKLLKXCGXNHL' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLLKXMXNHL')) {
            // 	var tmpObj = {}
            // 	tmpObj['data.vr_VehicleTypeCertificate.serviceCode'] = '04'
            // 	mustQuery.push({
            // 		'match': tmpObj
            // 	})
            // // Chứng nhận kiểu loại toàn xe
            // } else if (vm.selectModule && (vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXBBCH' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXBBCN' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXCG' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXMTGM' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLTXXDD')) {
            // 	var tmpObj = {}
            // 	tmpObj['data.vr_VehicleTypeCertificate.serviceCode'] = '03'
            // 	mustQuery.push({
            // 		'match': tmpObj
            // 	})
            // // Chứng nhận chất lượng kiểu loại linh kiện
            // } else if (vm.selectModule && (vm.selectModule['module'] === 'TT302011BGTVTCNCLKLLKXCG' || vm.selectModule['module'] === 'TT302011BGTVTCNCLKLLKXM')) {
            // 	var tmpObj = {}
            // 	tmpObj['data.vr_VehicleTypeCertificate.serviceCode'] = '04'
            // 	mustQuery.push({
            // 		'match': tmpObj
            // 	})
            // }
            queries = {
              'indice': vm.soureTable,
              'query': {
                'size': 20,
                'from': this.pageTraCuuThongKe * 20 - 20,
                "_source": {
                  "excludes": [
                    "data.vr_VehicleSpecification"
                  ]
                },
                'query': {
                  'bool': {
                    'must': mustQuery
                  }
                }
              }
            }
            console.log('query ========222222222222', queries)
            return queries
          },
          xemHoSo: function (item) {
            var vm = this
            vm.toDetailHoSo({
              dossierId: item['dossierId'],
              dossierIdCTN: item['dossierIdCTN'],
              dossierNo: item['dossierNo'],
              referenceUid: item['vr_VehicleTypeCertificate']['referenceUid']
            }, 'tra_cuu')
          },
          convertModelCOP: function (model) {
            if (!model) {
              return []
            }
            return model.map(function (item) {
              return {
                vr_COPProductionPlantEquipment: item['_source']['data']['vr_COPProductionPlantEquipment'],
                vr_COPProductType: item['_source']['data']['vr_COPProductType'],
                vr_COPReportRepository: item['_source']['data']['vr_COPReportRepository'],
                vr_COPProductionPlantEmployee: item['_source']['data']['vr_COPProductionPlantEmployee'],
                vr_COPReport_Attach: item['_source']['data']['vr_COPReport_Attach'],
                vr_COPProductLine: item['_source']['data']['vr_COPProductLine'],
                vr_COPProductionPlantProdEquipment: item['_source']['data']['vr_COPProductionPlantProdEquipment'],
                dossierId: item['_source']['dossierId'],
                dossierIdCTN: item['_source']['dossierIdCTN'],
                dossierNo: item['_source']['dossierNo'],
                companyId: item['_source']['companyId'],
                id: item['_source']['id']
              }
            })
          },
          convertModelCNCLKL: function (model) {
            if (!model) {
              return []
            }
            return model.map(function (item) {
              return {
                vr_technicalspec_xmy: item['_source']['data']['vr_technicalspec_xmy'],
                vr_cfg_technicalspec: item['_source']['data']['vr_cfg_technicalspec'],
                vr_VehicleSpecification: item['_source']['data']['vr_VehicleSpecification'],
                vr_inspectionstandard: item['_source']['data']['vr_inspectionstandard'],
                vr_technicalspec_xcg: item['_source']['data']['vr_technicalspec_xcg'],
                vr_VehicleEquipment: item['_source']['data']['vr_VehicleEquipment'],
                vr_technicalspec_lkxmy: item['_source']['data']['vr_technicalspec_lkxmy'],
                vr_technicalspec_xdd: item['_source']['data']['vr_technicalspec_xdd'],
                vr_technicalspec_xcnbb: item['_source']['data']['vr_technicalspec_xcnbb'],
                vr_cfg_limit_technicalspec: item['_source']['data']['vr_cfg_limit_technicalspec'],
                vr_technicalspec_lkxcg: item['_source']['data']['vr_technicalspec_lkxcg'],
                vr_technicalspec_xchbb: item['_source']['data']['vr_technicalspec_xchbb'],
                vr_VehicleTypeCertificate: item['_source']['data']['vr_VehicleTypeCertificate'],
                dossierId: item['_source']['dossierId'],
                dossierIdCTN: item['_source']['dossierIdCTN'],
                dossierNo: item['_source']['dossierNo'],
                companyId: item['_source']['companyId'],
                id: item['_source']['id']
              }
            })
          },
          pagingTraCuu: function (page) {
            var vm = this
            console.log('vm.pageTraCuuThongKe==============', vm.pageTraCuuThongKe)
            vm.traCuuThongKeAction()
          },
          loadMore: function () {
            var vm = this;
            console.log('load more!!')
          },
          checkSearch: function () {
            var vm = this
            if (vm.listSearch && vm.listSearch['length']) {
              for (var i = 0; i < vm.listSearch.length; i++) {
                var item = vm.listSearch[i];
                if (item && item['conditionsSelect'] && item['conditionsSelect']['value']) {
                  return true;
                }
              }
            }
            return false;
          },
          traCuuThongKe: function (callBack) {
            var vm = this;
            console.log('load more!!')
            if (!vm.checkSearch()) {
              vm.snackbartextdossierViewJX = "Vui lòng chọn một điều kiện tìm kiếm!";
              vm.snackbarerordossierViewJX = true;
              return;
            }
            vm.pageTraCuuThongKe = 1
            vm.traCuuThongKeAction()
          },
          traCuuThongKeAction: function (callBack) {
            var vm = this;
            var queries = vm.generateQuery({})
            vm.listsTraCuu = []
            vm.loadingTableTraCuu = true
            var promise = new Promise(function (resolve, reject) {
              var url = '/o/rest/vr-app/_search';
              axios.post(url, queries).then(function (response) {
                var serializable = response.data;
                if (typeof serializable['hits']['total'] === 'number') {
                  vm.totalTraCuu = serializable['hits']['total'] || 0
                  vm.lengthPageTraCuuThongKe = Math.ceil((serializable['hits']['total'] || 0) / 20);
                } else {
                  vm.totalTraCuu = serializable['hits']['total'] ? serializable['hits']['total']['value'] : 0
                  var totalTmp = serializable['hits']['total'] ? serializable['hits']['total']['value'] : 0
                  vm.lengthPageTraCuuThongKe = Math.ceil(totalTmp / 20);
                }
                var tmpData = serializable['hits']['hits'] || []
                if (tmpData && tmpData['length']) {
                  if (vm.selectModule && vm.selectModule['module'] === 'COP') {
                    tmpData = vm.convertModelCOP(tmpData)
                  } else {
                    tmpData = vm.convertModelCNCLKL(tmpData)
                  }
                  // tmpData = tmpData.map(function(item)  {
                  // 	return {
                  // 		vr_COPProductionPlantEquipment: item['_source']['data']['vr_COPProductionPlantEquipment'],
                  // 		vr_COPProductType: item['_source']['data']['vr_COPProductType'],
                  // 		vr_COPReportRepository: item['_source']['data']['vr_COPReportRepository'],
                  // 		vr_COPProductionPlantEmployee: item['_source']['data']['vr_COPProductionPlantEmployee'],
                  // 		vr_COPReport_Attach: item['_source']['data']['vr_COPReport_Attach'],
                  // 		vr_COPProductLine: item['_source']['data']['vr_COPProductLine'],
                  // 		vr_COPProductionPlantProdEquipment: item['_source']['data']['vr_COPProductionPlantProdEquipment'],
                  // 		dossierId: item['_source']['dossierId'],
                  // 		id: item['_source']['id']
                  // 	}
                  // })
                }
                vm.listsTraCuu = tmpData || []
                vm.loadingTableTraCuu = false
                resolve(true);
              }).catch(function (error) {
                console.log(error);
                vm.loadingTableTraCuu = false
                reject(false);
              });
            });
            promise.then(function (success) {
              // callBack();
            }, function (error) {

            });
          },
          removeSearch: function (item, index) {
            if (this.listSearch && this.listSearch['length'] === 1) {
              return
            }
            this.listSearch.splice(index, 1)
          },
          addSearch: function () {
            var index = this.listSearch.length + 1;
            var item = {
              index: index,
              value: null,
              searchType: null,
              dataitem: null,
              dataCollection: [],
              conditionsSelect: {}
            };
            this.listSearch.push(item);
          },
          getSelect: function (item) {
            if (item['url']) {
              $.ajax({
                url: item['url'],
                headers: {
                  groupId: window.themeDisplay.getScopeGroupId()
                },
                dataType: 'json',
                success: function (result) {
                  var data = result['data'] || []
                  if (data && data['length']) {
                    data = data.map(function (itemResponse) {
                      return {
                        itemText: itemResponse[item['itemText']],
                        itemValue: itemResponse[item['itemValue']]
                      }
                    })
                  }
                  if (item['conditionsSelect']) {
                    item['conditionsSelect']['items'] = data || []
                  }
                }
              })
            } else {
              if (item['conditionsSelect']) {
                item['conditionsSelect']['items'] = data || []
              }
            }
          },
          changeCondition: function (item) {
            var conditionsSelect = item['conditionsSelect']
            if (conditionsSelect && conditionsSelect['type']) {
              if (conditionsSelect['type'] === 'string') {
                if (conditionsSelect['keyword']) {
                  item['typeSearch'] = "="
                } else {
                  item['typeSearch'] = 'like'
                }
                item['typeSearchItems'] = this.dataItemString
                item['valueSearch'] = ''
              } else if (conditionsSelect['type'] === 'keyword') {
                item['typeSearch'] = '='
                item['typeSearchItems'] = this.dataItemKeyword
                item['valueSearch'] = ''
              } else if (conditionsSelect['type'] === 'number') {
                item['typeSearch'] = '='
                item['typeSearchItems'] = this.dataItem
                item['valueSearch'] = 0
              } else if (conditionsSelect['type'] === 'select') {
                item['typeSearch'] = '='
                item['typeSearchItems'] = this.dataItemString
                if (conditionsSelect['url']) {
                  vm.getSelect(item)
                }
                item['valueSearch'] = ''
              } else if (conditionsSelect['type'] === 'date') {
                var curTime = this.getCurrentTime()
                if (curTime && !item['fromDate']) {
                  item['fromDate'] = curTime
                }
                if (curTime && !item['toDate']) {
                  item['toDate'] = curTime
                }
              }
            } else {
              item['typeSearch'] = '='
            }
          },
          getDossierFile: function (dossierId) {
            var vm = this
            var dossierFileId = 0;
            $.ajax({
              url: "/o/rest/v2/dossiers/" + dossierId + "/files",
              type: "GET",
              headers: {
                groupId: window.themeDisplay.getScopeGroupId()
              },
              dataType: 'json',
              async: false,
              success: function (result) {
                var files = result['data'] || [];
                if (files && files['length']) {
                  for (var i = 0; i < files.length; i++) {
                    if (files[i] && files[i]['dossierPartNo'] == 'KQ1') {
                      dossierFileId = files[i]['dossierFileId'];
                      break;
                    }
                  }
                }
              }
            });
            return dossierFileId;
          },
          xemTSKT: function (item) {
            var vm = this
            vm.dialogTSKT = true
            vm.dossierId = item['dossierId'] || 0;
            vm.dossierFileId = vm.getDossierFile(item['dossierId']) || 0;
            vm.fileTemplateNo = item['vr_VehicleTypeCertificate']['serviceCode'] || '';
            vm.getTrackChanges()
            vm.getSchema2(function (response) {
              var sum_res = response;
              vm.getSchema3(function (response2) {
                sum_res = $.merge(sum_res, response2);
                vm.generalHtml2(sum_res);
                $('.lv-one .lv-label:contains("II.5.4")').css('display', 'none');
                var dong_co = $('#bb_loai_dong_co').val();
                if (dong_co == '') {
                  $('#XCG01277').parent().parent().parent().parent().show();
                  $('#XCG01300').parent().parent().parent().parent().show();
                  $('#XCG01255').parent().parent().parent().parent().show();

                  $('#XCG01277').parent().parent().parent().hide();
                  $('#XCG01300').parent().parent().parent().hide();
                  $('#XCG01255').parent().parent().parent().hide();

                  $('#XCG01277').parent().parent().parent().parent().find('.lv-title').click(false);
                  $('#XCG01300').parent().parent().parent().parent().find('.lv-title').click(false);
                  $('#XCG01255').parent().parent().parent().parent().find('.lv-title').click(false);
                }
                if (dong_co == 'hybrid') {
                  $('#XCG01277').parent().parent().parent().find('.lv-title').click(true);
                  $('#XCG01277').parent().parent().parent().parent().show();
                  $('#XCG01277').parent().parent().parent().show();
                  $('#XCG01300').parent().parent().parent().parent().hide();
                  $('#XCG01255').parent().parent().parent().parent().hide();
                }
                if (dong_co == 'chay_dien') {

                  $('#XCG01300').parent().parent().parent().find('.lv-title').click(true);
                  $('#XCG01300').parent().parent().parent().parent().show();
                  $('#XCG01300').parent().parent().parent().show();
                  $('#XCG01277').parent().parent().parent().parent().hide();
                  $('#XCG01255').parent().parent().parent().parent().hide();
                }
                if (dong_co == 'dot_trong') {

                  $('#XCG01255').parent().parent().parent().find('.lv-title').click(true);
                  $('#XCG01255').parent().parent().parent().parent().show();
                  $('#XCG01255').parent().parent().parent().show();
                  $('#XCG01300').parent().parent().parent().parent().hide();
                  $('#XCG01277').parent().parent().parent().parent().hide();
                }
              });

            });
          },
          xemChiTietAnChiDaCapPhat: function (id2) {
            var vm = this
            var originUrl = window.location.href.substr(0, window.location.href.lastIndexOf('/group'))
            var Url = originUrl + '/o/rest/vr-app/outputsheetdetail/' + id2
            $.ajax({
              url: Url,
              type: "GET",
              success: function (success) {
                vm.chiTietAnChiDaCapPhat = success.data

              },
            });
            this.stageFilterView = 'chi_tiet_an_chi_da_cap_phat'
          },
          groupXuatXuongFilter: function (item) {
            console.log('111111111111:', item)
            if (item.title === 'Xe đã xuất xưởng') {
              this.stageFilterView = 'danh_sach_xe_da_xuat_xuong'
              this.getDanhSachDoanhNghiep()
              this.getDanhSachDoiTuong()
              this.getDanhSachXeDaXuatXuong()
            } else if (item.title === 'Ấn chỉ đã cấp phát') {
              this.stageFilterView = 'danh_sach_an_chi_da_cap_phat'
              this.getDanhSachDoanhNghiep()
              this.getDanhSachDoiTuong()
              this.getDanhSachAnChiDaCapPhat()
            } else if (item.title === 'Xe chờ in phiếu') {
              this.stageFilterView = 'danh_xe_cho_in_phieu'

            }

          },
          getDanhSachDoanhNghiep: function () {
            var vm = this
            var orginURL = window.location.href
            var endPoit = orginURL.substr(0, orginURL.lastIndexOf('/group'))
            var url = endPoit + '/o/rest/vr-app/applicant/profile/search?start=-1&end=-1'
            $.ajax({
              url: url,
              type: "GET",
              success: function (result) {
                vm.danhSachDoanhNghiep = result.data
              },
              error: function (xhr) {
                console.log(xhr);
              }
            });
          },
          viewHistoryPdf: function (item) {
            var vm = this
            var config = {
              headers: {
                groupId: window.themeDisplay.getScopeGroupId()
              },
              responseType: 'blob',
              params: {}
            }
            var url = '/o/rest/v2/dossiers/formfiles/' + (item['contentFileEntryId'] || 0)
            axios.get(url, config).then(function (result) {
              var url = window.URL.createObjectURL(result.data);
              var link = document.createElement('a')
              document.body.appendChild(link)
              link.download = vm.detailModel['dossierNo'] + '_' + item['contentType'] + '_' + item['createdDate'];
              link.href = url
              link.click()
              document.body.removeChild(link)
            }).catch(function (xhr) {
              console.log('xhr==========', xhr)
            })
          },
          getHistoryDossierPart: function (dossierId, partNo, index, type) {
            var vm = this
            var config = {
              headers: {
                groupId: window.themeDisplay.getScopeGroupId()
              },
              params: {
                dossierid: dossierId,
                contentfiletemplate: partNo
              }
            }
            var url = '/o/rest/vr-app/historyprofile/dossier'
            axios.get(url, config).then(function (result) {
              console.log("result.data==========", result['data'])
              console.log("index==========", index)
              if (index !== -1 && result['data'] && result['data']['data']) {
                if (type === 'IN') {
                  vm.listDocumentInItems[index]['historyDossierPart'] = result['data']['data'] || [];
                } else {
                  vm.listDocumentOutItems[index]['historyDossierPart'] = result['data']['data'] || [];
                }
              }
            }).catch(function (xhr) {
              console.log('xhr==========', xhr);
            })
          },
          getDanhSachDoiTuong: function () {
            var vm = this
            var orginURL = window.location.href
            var endPoit = orginURL.substr(0, orginURL.lastIndexOf('/group'))
            $.ajax({
              url: endPoit + '/o/rest/v2/dictcollections/VR84/dictgroups',
              type: "GET",
              headers: {
                groupId: window.themeDisplay.getScopeGroupId(),
                Accept: 'application/json'
              },
              success: function (success) {
                vm.danhSachDoiTuong = success.data
              },
            })
          },
          getDanhSachXeDaXuatXuong: function () {
            console.log('vehicleclassFilter', this.vehicleclassFilter)
            console.log('stampissueNoFilter', this.stampissueNoFilter)
            console.log('productiondateFilter', this.productiondateFilter)
            console.log('frameno', this.framenoFilter)
            console.log('engineno', this.enginenoFilter)
            console.log('serialno', this.serialnoFilter)
            console.log('applicantprofileidFilter', this.applicantprofileidFilter)
            console.log('certificaterecordnoFilter', this.certificaterecordnoFilter)
            var vm = this
            var orginURL = window.location.href
            var endPoit = orginURL.substr(0, orginURL.lastIndexOf('/group'))
            var productiondateFormat = ''
            if (this.productiondateFilter) {
              var tmp = this.productiondateFilter.split('-')
              productiondateFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
            }
            var params = {
              vehicleclass: this.vehicleclassFilter,
              stampissueno: this.stampissueNoFilter,
              certificaterecordno: this.certificaterecordnoFilter,
              productiondate: productiondateFormat,
              frameno: this.framenoFilter,
              engineno: this.enginenoFilter,
              serialno: this.serialnoFilter,
              applicantprofileid: this.applicantprofileidFilter
            }
            var Url = endPoit + '/o/rest/vr-app/vehicle/record/search?'
            for (var key in params) {
              if (params[key] !== '') {
                Url += '&' + key + '=' + params[key]
              }
            }
            $.ajax({
              url: Url,
              type: "GET",
              success: function (success) {
                vm.danhSachXeXuatXuong = success.data
              },
            });

          },
          deleteDossierFileVersion: function (item) {
            var vm = this;

            vm.$dialog.confirm('Bạn có muốn xóa file toàn bộ file của thành phần này!', {
              html: true,
              loader: true,
              okText: 'Xác nhận',
              cancelText: 'Quay lại',
              animation: 'fade'
            }).then(function (dialog) {
              console.log("Run delete");
              var urlFiles = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid + "/resetformdata";
              $.ajax({
                url: urlFiles,
                dataType: "json",
                type: "PUT",
                headers: {
                  groupId: themeDisplay.getScopeGroupId()
                },
                success: function (result) {
                  item.counter = 0;
                },
                error: function (xhr) {
                  console.log(xhr);
                }
              });
              dialog.close();
              return false;
            }).catch(function (e) {
              console.log(e)
            })
          },
          getDanhSachAnChiDaCapPhat: function () {
            var vm = this
            var orginURL = window.location.href
            var endPoit = orginURL.substr(0, orginURL.lastIndexOf('/group'))
            var productiondateFormat = ''
            if (this.productiondateFilter) {
              var tmp = this.productiondateFilter.split('-')
              productiondateFormat = tmp[2] + '/' + tmp[1] + '/' + tmp[0]
            }
            var params = {
              vehicleclass: this.vehicleclassFilter,
              stampissueno: this.stampissueNoFilter,
              certificaterecordno: this.certificaterecordnoFilter,
              productiondate: productiondateFormat,
              frameno: this.framenoFilter,
              engineno: this.enginenoFilter,
              serialno: this.serialnoFilter,
              applicantprofileid: this.applicantprofileidFilter
            }
            var Url = endPoit + '/o/rest/vr-app/issue/stampbook/search?'
            for (var key in params) {
              if (params[key] !== '') {
                Url += '&' + key + '=' + params[key]
              }
            }
            $.ajax({
              url: Url,
              type: "GET",
              success: function (result) {
                vm.danhSachAnChiDaCapPhat = result.data
              },
              error: function (xhr) {
                console.log(xhr);
              }
            });
          },
          openPopUpPhoiXCG: function () {
            this.popUpPhoiXCG = true
            this.listLabelTemp = this.listLabel

          },
          addLabel: function (name) {
            for (var j = 0; j < this.listLabelTemp.length; j++) {
              if (this.listLabelTemp[j].name === name) {
                this.listLabelTemp.splice(j, 1)
              }
            }
            // Thêm label vào phôi
            $("#printTraCuu").append('<div id=' + name + ' title=' + name + ' style="z-index: 99; position:absolute; left : ' + 490 + 'px; top : ' + 123 + 'px;">' + name + '</div>');
            // Thêm event draggable vào label
            $('#' + name).draggable({
              stop: function () {


              }
            });
            // Thêm event mousedown vào label
            $('#' + name).mousedown(function (event) {
              if (event.which === 3) {
                // $('#dialog-cauhinh').append(`
                // 		<div id="tooltip-` + name + `" style="position: absolute;top: 0px; left: 0px; width: 180px;box-shadow: -3px 6px 16px #888888;background-color: #fff; padding: 10px;display: none;z-index: inherit;">
                // 			<i id="close-tooltip-` + name + `" class="fa fa-times" aria-hidden="true" style="position: absolute; top: 0px; right: 0px;"></i>
                // 			<div style="width: 100%; height: 30px;display: flex;">
                // 				<strong style="width: 50%;">Font size:</strong>
                // 				<div style="width: 50%;padding: 3px; box-sizing: border-box;"><input  id="input-size-` + name + `"  style="width: 100%;" type="" name=""></div>

                // 			</div>
                // 			<div style="width: 100%;height: 30px;display: flex;">
                // 				<strong style=" width: 50%;">Màu sắc:</strong>
                // 				<div style="width: 50%;padding: 3px; box-sizing: border-box;"><input id="input-mau-` + name + `" type="color" style="width: 100%;" type="" name=""></div>
                // 			</div>
                // 			<div style="width: 100%;height: 30px;display: flex;">
                // 				<strong style=" width: 50%;">Chiều dài:</strong>
                // 				<div style="width: 50%;padding: 3px; box-sizing: border-box;"><input id="input-width-` + name + `" style="width: 100%;" type="" name=""></div>
                // 			</div>
                // 			<div style="width: 100%;height: 30px;display: flex;">
                // 				<strong style=" width: 50%;">Chiều rộng:</strong>
                // 				<div style="width: 50%;padding: 3px; box-sizing: border-box;"><input id="input-height-` + name + `" style="width: 100%;" type="" name=""></div>
                // 			</div>
                // 		</div>
                // 	`)
                $('#tooltip-' + name).css({
                  top: event.pageY + 'px',
                  left: event.pageX + 'px'
                }).fadeIn(250);
                $("#input-size-" + name).change(function () {
                  $('#' + name).css('font-size', $("#input-size-" + name).val() + 'px')
                })
                $("#input-mau-" + name).change(function () {
                  $('#' + name).css('color', $("#input-mau-" + name).val())
                })
                $("#input-width-" + name).change(function () {
                  $('#' + name).css('width', $("#input-width-" + name).val())
                })
                $("#input-height-" + name).change(function () {
                  $('#' + name).css('height', $("#input-height-" + name).val())
                })
                $("#close-tooltip-" + name).click(function () {
                  $("#tooltip-" + name).remove()
                })
              }
            });
          },
          parseNgayXuatXuong_add: function (val) {
            var vm = this;
            vm.detailAnChi['ngayXuatXuong_add'] = vm.parseDate2(vm.dateNgayXuatXuong_add);
            vm.menuNgayXuatXuong_add = false;
          },
          parseNgayNhap: function (val) {
            var vm = this;
            vm.thongTinPhieu['inputSheetDate'] = vm.parseDate2(vm.dateNgayNhap);
            vm.thongTinPhieu['outputSheetDate'] = vm.parseDate2(vm.dateNgayNhap);
            vm.menuNgayNhap = false;
            vm.menuNgayXuat_Dossier = false;
          },
          setStateOnlyFollow: function (emailAddress) {
            var vm = this;
            var url = '/o/rest/v2/dictcollections/VR_AUDIT/dictitems';
            axios.get(url, config).then(function (response) {
              var serializable = response.data;
              console.log("emailAddress======", emailAddress);
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
          toggleAll: function () {
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
          getLastedStateUserInfo: function (callBack) {
            var vm = this;
            var promise = new Promise(function (resolve, reject) {
              var url = '/o/rest/v2/userInfologs';
              axios.get(url, config).then(function (response) {
                var serializable = response.data;

                console.log("serializable========", serializable);

                var serviceCode = serializable.serviceInfo;
                var applicantIdNo = serializable.applicant;
                var dossierNo = serializable.dossierNo;

                console.log("serviceCode========", serviceCode);
                console.log("applicantIdNo========", applicantIdNo);
                console.log("dossierNo========", dossierNo);
                if (serviceCode) {
                  vm.serviceInfoFilter = {
                    serviceCode: serviceCode,
                    serviceName: ""
                  }
                }
                if (applicantIdNo) {
                  vm.applicantNameFilter = {
                    applicantIdNo: applicantIdNo,
                    applicantName: ""
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
          tonTrenSo: function (item) {
            if (item && item['sum3'] && item['sum3']) {
              return item['sum3'] - item['sum3']
            }
            return 0
          },
          changeQuanLyPhieuXX: function () {
            var vm = this;
            vm.stageFilterView = "quan_ly_pxx";
            vm.detailPage = false;
            vm.detailRegistPage = false;
            vm.loadPhieuXX();
            vm.loadDoiPhong();
            // vm.loadMauPhoi();
            vm.loadDoiTuong();
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
                vm.loaiHinhCSSX = result.groupCode;
              },
              error: function (result) {
                console.log(result);
                vm.loaiHinhCSSX = '';
              }
            })
          },
          loadCoSoSanXuat: function () {
            var vm = this;
            var url = "/o/rest/vr-app/applicant/profile/search";
            var configTmp = {
              headers: {
                'groupId': themeDisplay.getScopeGroupId()
              },
              params: {
                start: -1,
                end: -1
              }
            }
            axios.get(url, configTmp).then(function (response) {
              vm.coSoSanXuatItems = response.data['data'] || [];
            }).catch(function (xhr) {
              console.log(xhr);
              vm.coSoSanXuatItems = []
            });
          },
          chuyenDoiDuLieu: function () {
            var vm = this
            vm.stageFilterView = 'thong_ke_chuyen_doi_du_lieu'
            vm.detailPage = false
            vm.loadVrmigrateTask()
          },
          toDetailMigrateReview: function (item) {
            var vm = this
            vm.migrateTaskSelect = item
            vm.migrateReviewSelect = {}
            vm.itemsMapping = []
            vm.loadVrmigrateReview(item['task_id'])
          },
          toDetailMigratemapping: function (item) {
            var vm = this
            vm.migrateReviewSelect = item
            vm.loadVrmigrateMapping(item['taskMigrationID'], item['dataGroupID'], item['sequenceNo'])
          },
          loadVrmigrateTask: function () {
            var vm = this;
            var url = "/o/rest/vr-app/vrmigrate/task";
            vm.loadingLanChuyenDoi = true
            var config = {
              params: {
                start: -1,
                end: -1
              }
            }
            axios.get(url, config).then(function (response) {
              vm.itemsLanChuyenDoi = response.data['data'] || [];
              vm.loadingLanChuyenDoi = false
            }).catch(function (xhr) {
              console.log(xhr);
              vm.loadingLanChuyenDoi = false
            });
          },
          loadVrmigrateReview: function (taskMigrationId) {
            var vm = this;
            var url = "/o/rest/vr-app/vrmigrate/review";
            vm.loadingKQChuyenDoi = true
            vm.itemsKQChuyenDoi = []
            var config = {
              params: {
                start: -1,
                end: -1,
                taskMigrationId: taskMigrationId
              }
            }
            axios.get(url, config).then(function (response) {
              vm.itemsKQChuyenDoi = response.data['data'] || [];
              vm.loadingKQChuyenDoi = false
            }).catch(function (xhr) {
              vm.loadingKQChuyenDoi = false
              console.log(xhr);
            });
          },
          loadVrmigrateMapping: function (taskMigrationId, dataGroupId, sequenceNo) {
            var vm = this;
            var url = "/o/rest/vr-app/vrmigrate/mapping";
            vm.itemsMapping = []
            vm.loadingChuyenDoiMapping = true
            var config = {
              params: {
                start: -1,
                end: -1,
                taskMigrationId: taskMigrationId,
                dataGroupId: dataGroupId,
                sequenceNo: sequenceNo
              }
            }
            axios.get(url, config).then(function (response) {
              vm.itemsMapping = response.data['data'] || [];
              vm.loadingChuyenDoiMapping = false
            }).catch(function (xhr) {
              console.log(xhr);
              vm.loadingChuyenDoiMapping = false
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
            vm.popUpNhap_Xuat_DieuChuyen = !vm.popUpNhap_Xuat_DieuChuyen;
            vm.getDonViNhapItems()
          },
          xuatKhoAction: function () {
            var vm = this;
            vm.stateAddPhieu = 'xuat_kho';
            vm.dsGCNItems = [];
            vm.thongTinPhieu = {
              stampType: 'PXX',
              outputSheetNo: '---'
            };
            vm.selected = [];
            vm.popUpNhap_Xuat_DieuChuyen = !vm.popUpNhap_Xuat_DieuChuyen;
            vm.loadCoSoSanXuat()
          },
          dieuChuyenAction: function () {
            var vm = this;
            vm.stateAddPhieu = 'dieu_chuyen';
            vm.dsGCNItems = [];
            vm.thongTinPhieu = {};
            vm.selected = [];
            vm.popUpNhap_Xuat_DieuChuyen = !vm.popUpNhap_Xuat_DieuChuyen;
            vm.getDoiPhongItems()
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
            var url = "/o/rest/vr-stamp/inputStampbooks";
            var start = (vm.pagePxx - 1) * 15;
            var end = (vm.pagePxx - 1) * 15 + 15;
            var configPXX = {
              headers: {
                groupId: themeDisplay.getScopeGroupId()
              },
              params: {
                start: start,
                end: end,
                purchaserCorporationId: vm.searchDoiPhong,
                stampShortNo: vm.soSerial,
                stampType: vm.searchMauPhoi,
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
              vm.lengthPxx = Math.ceil(total / 15);
              // vm.lengthPxx = 0;
              vm.loadingPxx = false;
              vm.totalPxx = total;
            }).catch(function (xhr) {
              vm.itemsPxx = [];
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
          saveBienBanKtraDotXuatGS: function () {
            var vm = this
            var data = {
              vr_IssueInspectionRecord: vm.dsBBKiemTraGS
            }
            $.ajax({
              url: '/o/rest/vr-app/post',
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
            data[metaData] = '';
            data[parentItemCode] = vm.cssxModel.parentItemCode;
            data[itemDescription] = vm.cssxModel.itemDescription;
            data[groupCode] = vm.loaiHinhCSSX;

            if (vm.cssxModel.dictItemId) {
              data[itemCodeOld] = vm.cssxModel.itemCode;
              url = urlAddCoSoNuocNgoai + "&" + portletNamespace + "collectionCode=" + itemCodeNuocNgoai +
                "&" + portletNamespace + "itemCodeOld=" + vm.cssxModel.itemCode;
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
            }).then(function (dialog) {
              var url = "/o/rest/v2/temp/dictcollections/" + itemCodeNuocNgoai + "/dictitems/" + itemCode;
              $.ajax({
                url: url,
                type: "DELETE",
                dataType: 'json',
                headers: {
                  groupId: themeDisplay.getScopeGroupId()
                },
                data: {},
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
                keyword: vm.keywordsSearchTraCuuDoanhNghiepNuocNgoai,
                start: start,
                end: end
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
            var url = "/o/rest/vr-stamp/inputsheet";
            var start = (vm.pagePxx - 1) * 15;
            var end = (vm.pagePxx - 1) * 15 + 15;
            var configPNK = {
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
              vm.lengthPxx = Math.ceil(total / 15);
              vm.lengthDSPNK = 0;
              vm.loadingPxx = false;
            }).catch(function (xhr) {
              vm.itemsDSPNK = [];
              vm.lengthDSPNK = 1;
              vm.loadingPxx = false;
            })
          },
          loadDSPXK: function () {
            var vm = this;
            vm.loadingPxx = true;
            var url = " /o/rest/vr-stamp/outputsheet";
            var start = (vm.pagePxx - 1) * 15;
            var end = (vm.pagePxx - 1) * 15 + 15;
            var configPXK = {
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
              vm.lengthPxx = Math.ceil(total / 15);
              vm.lengthDSPXK = 0;
              vm.loadingPxx = false;
            }).catch(function (xhr) {
              vm.itemsDSPXK = [];
              vm.lengthDSPXK = 1;
              vm.loadingPxx = false;
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
            vm.detailAnChi = item;
          },
          tickAll_DX_LD: function (val) {
            var vm = this
            if (val === 1 || val === '1') {
              $("#kDatAllLD").prop("checked", false);
            } else {
              $("#datAllLD").prop("checked", false);
            }
            if (vm.bienBanDXModel['chi_tiet_2'] && vm.bienBanDXModel['chi_tiet_2']['length']) {
              vm.bienBanDXModel['chi_tiet_2'] = vm.bienBanDXModel['chi_tiet_2'].map(function (item) {
                item['kq_ld'] = val
                return item
              })
            }
          },
          tickAll_DX_GSL: function (val) {
            var vm = this
            if (val === 1 || val === '1') {
              $("#kDatAllGSL").prop("checked", false);
            } else {
              $("#datAllGSL").prop("checked", false);
            }
            if (vm.bienBanDXModel['chi_tiet_2'] && vm.bienBanDXModel['chi_tiet_2']['length']) {
              vm.bienBanDXModel['chi_tiet_2'] = vm.bienBanDXModel['chi_tiet_2'].map(function (item) {
                item['kq_gsl'] = val
                return item
              })
            }
          },
          tickAll_DX_KL: function (val) {
            var vm = this
            console.log(typeof val)
            if (val === 1 || val === '1') {
              $("#kDatAllKL").prop("checked", false);
            } else {
              $("#datAllKL").prop("checked", false);
            }
            if (vm.bienBanDXModel['chi_tiet_2'] && vm.bienBanDXModel['chi_tiet_2']['length']) {
              vm.bienBanDXModel['chi_tiet_2'] = vm.bienBanDXModel['chi_tiet_2'].map(function (item) {
                item['kl'] = val
                return item
              })
            }
          },
          tickAllKL: function (val) {
            var vm = this
            console.log(typeof val)
            if (val === 1 || val === '1') {
              $("#kDatAllKL").prop("checked", false);
            } else {
              $("#datAllKL").prop("checked", false);
            }
            if (vm.bienBanGSModel['chi_tiet_2'] && vm.bienBanGSModel['chi_tiet_2']['length']) {
              vm.bienBanGSModel['chi_tiet_2'] = vm.bienBanGSModel['chi_tiet_2'].map(function (item) {
                item['kl'] = val
                return item
              })
            }
          },
          tickAllLD: function (val) {
            var vm = this
            if (val === 1 || val === '1') {
              $("#kDatAllLD").prop("checked", false);
            } else {
              $("#datAllLD").prop("checked", false);
            }
            if (vm.bienBanGSModel['chi_tiet_2'] && vm.bienBanGSModel['chi_tiet_2']['length']) {
              vm.bienBanGSModel['chi_tiet_2'] = vm.bienBanGSModel['chi_tiet_2'].map(function (item) {
                item['kq_ld'] = val
                return item
              })
            }
          },
          tickAllGSL: function (val) {
            var vm = this
            if (val === 1 || val === '1') {
              $("#kDatAllGSL").prop("checked", false);
            } else {
              $("#datAllGSL").prop("checked", false);
            }
            if (vm.bienBanGSModel['chi_tiet_2'] && vm.bienBanGSModel['chi_tiet_2']['length']) {
              vm.bienBanGSModel['chi_tiet_2'] = vm.bienBanGSModel['chi_tiet_2'].map(function (item) {
                item['kq_gsl'] = val
                return item
              })
            }
          },
          deleteBienBanKTGS: function () {
            var vm = this
            vm.$dialog.confirm('Bạn có chắc chắn muốn xóa!', {
              html: true,
              loader: true,
              okText: 'Xác nhận',
              cancelText: 'Hủy bỏ',
              animation: 'fade'
            }).then(function (dialog) {
              dialog.close();
              vm.selected.forEach(function (itemSelect) {
                var index = vm.dsBBKiemTraGS.findIndex(function (item) {
                  console.log('item======', item)
                  if (item['inspectionRecordNo'] == itemSelect['inspectionRecordNo'] &&
                    item['so_gcn'] == itemSelect['so_gcn']) {
                    return true
                  }
                })
                console.log('index=====', index)
                if (index !== -1) {
                  vm.dsBBKiemTraGS.splice(index, 1)
                }
              })
              vm.selected = []
            }).catch(function (xhr) {
              console.log(xhr)
            })
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
              }).then(function (dialog) {
                var arrAction = [];
                for (var i = 0; i < vm.selected.length; i++) {
                  if (vm.selected[i]['id']) {
                    arrAction.push(vm.deleteItemVatTu(vm.selected[i]));
                  } else {
                    var index = vm.dsGCNItems.findIndex(function (item) {
                      if (item['stampShortNo'] == vm.selected[i]['stampShortNo'] &&
                        item['serialStartNo'] == vm.selected[i]['serialStartNo'] &&
                        item['serialEndNo'] == vm.selected[i]['serialEndNo'] &&
                        item['subTotalInDocument'] == vm.selected[i]['subTotalInDocument']
                      ) {
                        return true
                      }
                    })
                    if (index !== -1) {
                      vm.dsGCNItems.splice(index, 1)
                    }
                  }
                }
                vm.calTotalMoneyPhieuXuat()
                Promise.all(arrAction).then(function (results) {
                  vm.selected = [];
                  var index = vm.dsGCNItems.findIndex(function (item) {
                    if (item['stampShortNo'] == vm.selected[i]['stampShortNo'] &&
                      item['serialStartNo'] == vm.selected[i]['serialStartNo'] &&
                      item['serialEndNo'] == vm.selected[i]['serialEndNo'] &&
                      item['subTotalInDocument'] == vm.selected[i]['subTotalInDocument']
                    ) {
                      return true
                    }
                  })
                  if (index !== -1) {
                    vm.dsGCNItems.splice(index, 1)
                  }
                  vm.snackbartextdossierViewJX = "Xoá dữ liệu thành công!";
                  vm.snackbardossierViewJX = true;
                  vm.calTotalMoneyPhieuXuat()
                }).catch(function (xhr) {
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
                url: " /o/rest/vr-stamp/inputStampbook/" + item['id'],
                dataType: "json",
                type: "DELETE",
                headers: {
                  "groupId": themeDisplay.getScopeGroupId()
                },
                success: function (result) {
                  resolve(result);
                },
                error: function (result) {
                  reject(result);
                }
              });
            })
          },
          selectSoGCNCapPhieu: function (item, index) {
            var vm = this
            vm.thongTinGCN = item
            console.log('selectSoGCNCapPhieu=============', item)
            if (vm.indexGCNXuatKho != -1) {
              var data = $('#dsXeCapPhieuHoSo').jexcel('getData');
              if (data && data['length']) {
                var mang = []
                var i = 0;
                $(data).each(function (k, v) {
                  mang[i] = {
                    "so_khung": v[0],
                    "so_may": v[1],
                    "mau_son": v[2],
                    "so_seri": v[3]
                  }
                  i++;
                });
                if (vm.detailSoatXetGCN['bang_khai'] && vm.detailSoatXetGCN['bang_khai']['length']) {
                  vm.detailSoatXetGCN['bang_khai'][vm.indexGCNXuatKho]['chi_tiet'] = data
                  vm.detailSoatXetGCN['bang_khai'][vm.indexGCNXuatKho]['chi_tiet_2'] = mang
                }
              }
            }
            if (item['loai_hinh_lap_rap']) {
              vm.thongTinPhieu['vehicleClass'] = item['loai_hinh_lap_rap']
            }
            vm.indexGCNXuatKho = index
            $('#dsXePopUpCapPhieu').empty()
            if (item) {
              var colHeaders = []
              var columns = []
              var colWidths = []
              var colHeaders_loai3 = ['Số khung', 'Số máy', 'Mầu sơn', 'Số seri hỏng', 'Số seri mới']
              var colHeaders_loai2 = ['Số khung', 'Số máy', 'Mầu sơn', 'Số seri mất', 'Số seri mới']
              var colHeaders_loai1 = ['Số khung', 'Số máy', 'Mầu sơn', 'Số seri']
              if (vm.detailSoatXetGCN['hinh_thuc_cap'] === 1 || vm.detailSoatXetGCN['hinh_thuc_cap'] === '1') {
                colHeaders = ['Số khung', 'Số máy', 'Mầu sơn', 'Số seri']
                colWidths = [150, 150, 150, 150]
                columns = [{
                  type: 'text'
                },
                {
                  type: 'text'
                },
                {
                  type: 'text'
                },
                {
                  type: 'text'
                }
                ]
                // columns = [
                // 	{
                // 		type:'text',
                // 		width:'150',
                // 		name:'Số khung'
                // 	},
                // 	{
                // 		type:'text',
                // 		width:'150',
                // 		name:'Số máy'
                // 	},
                // 	{
                // 		type:'text',
                // 		width:'150',
                // 		name:'Mầu sơn'
                // 	},
                // 	{
                // 		type:'text',
                // 		width:'150',
                // 		name:'Số seri'
                // 	},
                // ]
              }
              if ($('#dsXeCapPhieuHoSo').html()) {
                $('#dsXeCapPhieuHoSo').jexcel('setData', item['chi_tiet'], true);
              } else {
                $('#dsXeCapPhieuHoSo').jexcel({
                  data: item['chi_tiet'],
                  colHeaders: colHeaders,
                  colWidths: colWidths,
                  columns: columns
                });
              }

              $('#dsXeCapPhieuHoSo table.jexcel.jexcel_overflow > colgroup>col').each(function (index, item) {
                console.log('item====', $(item).attr('width'))
                $("tbody.draggable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px')
                $("thead.resizable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px')
              });
              // $('#dsXeCapPhieuHoSo').jexcel({
              // 	json: item['chi_tiet'],
              // 	columns: columns
              // });
            }
            if (item && item['dsBBKiemTraGS_DX'] && item['dsBBKiemTraGS_DX']['length']) {
              vm.dsBBKiemTraGS = item['dsBBKiemTraGS_DX']
            } else {
              vm.dsBBKiemTraGS = []
            }
          },
          inPhieuBanGiao: function () {
            // var vm = this
          },
          luuPhieuXKHoSo: function (state, stateAddPhieu) {
            var vm = this
            // Tổ TH Tạm ứng trực tiếp cho CSSX (outputSheetType = 4)
            vm.thongTinPhieu['outputSheetType'] = 4
            vm.luuPhieu(state, stateAddPhieu)
            var itemTP2 = vm.listDocumentInItems.find(function (item) {
              if (item && item['partNo'] === 'TP2') {
                return true
              }
            })
            var indexGCNXuatKho = vm.indexGCNXuatKho
            if (vm.indexGCNXuatKho != -1) {
              var data = $('#dsXeCapPhieuHoSo').jexcel('getData');
              var mang = []
              var i = 0;
              var notSeri = 0
              $(data).each(function (k, v) {
                mang[i] = {
                  "so_khung": v[0],
                  "so_may": v[1],
                  "mau_son": v[2],
                  "so_seri": v[3]
                }
                if (!mang[i]['so_seri']) {
                  notSeri++
                }
                i++;
              });
              vm.detailSoatXetGCN['bang_khai'][vm.indexGCNXuatKho]['chi_tiet'] = data
              vm.detailSoatXetGCN['bang_khai'][vm.indexGCNXuatKho]['chi_tiet_2'] = mang
              if (notSeri) {
                vm.snackbartextdossierViewJX = "Có " + notSeri + " số seri chưa điền, vui lòng kiểm tra lại!";
                vm.snackbarerordossierViewJX = true;
              }
            }
            if (itemTP2) {
              // vm.getDossierIdFromCTN(vm.detailModel['dossierIdCTN']).then(function(resultId)  {

              // })
              var idCTN = vm.detailModel['dossierId'] || 0
              $.ajax({
                url: "/o/rest/v2/dossiers/" + idCTN + "/files/" + itemTP2['referenceUid'] + "/formdata",
                dataType: "json",
                type: "PUT",
                headers: {
                  "groupId": themeDisplay.getScopeGroupId(),
                  Accept: "application/json"
                },
                data: {
                  formdata: JSON.stringify(vm.detailSoatXetGCN)
                },
                success: function (result) {
                  // vm.snackbartextdossierViewJX = "Lưu form thành công!";
                  // vm.snackbardossierViewJX = true;
                },
                error: function (result) {
                  // vm.snackbartextdossierViewJX = "Lưu form thất bại!";
                  // vm.snackbarerordossierViewJX = true;
                }
              });
            }
          },
          luuPhieu: function (state, stateAddPhieu) {
            var vm = this;
            var url = "";
            var data = Object.assign({}, vm.thongTinPhieu)
            data['isApproval'] = state
            if (stateAddPhieu) {
              vm.stateAddPhieu = stateAddPhieu
            }
            console.log('vm.stateAddPhieu==========', vm.stateAddPhieu)
            if (vm.stateAddPhieu === 'nhap_kho') {
              url = '/o/rest/vr-stamp/inputsheet'
              vm.dsGCNItems = vm.dsGCNItems.map(function (item) {
                item['vehicleClass'] = vm.thongTinPhieu['vehicleClass']
                item['stampType'] = 'PXX'
                item['stampType'] = 'PXX'
                return item
              })
              data['stampbooks'] = JSON.stringify(vm.dsGCNItems)
            } else if (vm.stateAddPhieu === 'xuat_kho' || vm.stateAddPhieu === 'dieu_chuyen') {
              url = '/o/rest/vr-stamp/outputsheet'
              data['details'] = JSON.stringify(vm.dsGCNItems)
            }
            if (vm.stateAddPhieu === 'dieu_chuyen') {
              data['outputSheetType'] = 5
            }
            var type = 'POST'
            if (vm.thongTinPhieu['id']) {
              type = 'PUT'
              url += '/' + vm.thongTinPhieu['id']
            }
            $.ajax({
              url: url,
              dataType: "json",
              type: type,
              data: data,
              headers: {
                groupId: themeDisplay.getScopeGroupId()
              },
              success: function (result) {
                if (result['VRInputSheet']) {
                  vm.thongTinPhieu = Object.assign(vm.thongTinPhieu, result['VRInputSheet'])
                }
                if (result['VROutputSheet']) {
                  vm.thongTinPhieu = Object.assign(vm.thongTinPhieu, result['VROutputSheet'])
                }
                if (result['VRInputStampbook'] && result['VRInputStampbook']['length'] && state == 1) {
                  vm.dsGCNItems = result['VRInputStampbook']
                  vm.calTotalMoneyPhieuXuat()
                }
                if (result['VROutputSheetDetails'] && result['VROutputSheetDetails']['length'] && state == 1) {
                  vm.dsGCNItems = result['VROutputSheetDetails']
                  vm.calTotalMoneyPhieuXuat()
                }
                if (!vm.thongTinPhieu['id']) {
                  vm.snackbartextdossierViewJX = "Thêm thành công!";
                } else {
                  vm.snackbartextdossierViewJX = "Lưu thành công!";
                }
                vm.snackbardossierViewJX = true;
              },
              error: function (result) {
                // if (!vm.thongTinPhieu['id']) {
                // 	vm.snackbartextdossierViewJX = "Thêm thất bại, Vui lòng thử lại!";
                // } else {
                // 	vm.snackbartextdossierViewJX = "Lưu thất bại, Vui lòng thử lại!";
                // }
                vm.snackbartextdossierViewJX = result['msg'] || '';
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
              data: {},
              headers: {
                groupId: themeDisplay.getScopeGroupId()
              },
              success: function (result) {
                vm.dsGCNItems = result.data ? result.data : [];
                vm.thongTinPhieu = result;
                vm.snackbartextdossierViewJX = "Thêm thành công!";
                vm.snackbardossierViewJX = true;
                vm.popUpAddPhieu = false;
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
              data: {},
              headers: {
                groupId: themeDisplay.getScopeGroupId()
              },
              success: function (result) {
                vm.dsGCNItems = result.data ? result.data : [];
                vm.thongTinPhieu = result;
                vm.snackbartextdossierViewJX = "Thêm thành công!";
                vm.snackbardossierViewJX = true;
                vm.popUpAddPhieu = false;
              },
              error: function (result) { }
            })
          },
          addNhapKho: function () {
            var vm = this;
            vm.detailAnChi = {
              serialStartNo: '',
              serialEndNo: '',
              subTotalInDocument: ''
            };
            vm.popUpAddPhieu = !vm.popUpAddPhieu;
            if (vm.stateAddPhieu === 'xuat_kho' || vm.stateAddPhieu === 'dieu_chuyen') {
              vm.getPhieuConItems(vm.thongTinPhieu['vehicleClass'], 'PXX')
            }
          },
          chiTietPhieu: function (item) {
            var vm = this;
            vm.popUpChiTietPhieu = !vm.popUpChiTietPhieu;
            vm.chiTietPhieuModel = item;
            vm.stateNumberSerial = 1
            if ($('#chiTietPhieuTable').html()) {
              $('#chiTietPhieuTable').jexcel('setData', vm.dsCTPItems, true);
            } else {
              $('#chiTietPhieuTable').jexcel({
                data: vm.dsCTPItems,
                colWidths: [120, 120, 150, 150, 150, 150],
                colHeaders: ['Số seri', 'Số phiếu quản lý', 'Ngày XX', 'Màu sơn', 'Số khung', 'Số động cơ']
              });
            }
            $('#chiTietPhieuTable table.jexcel.jexcel_overflow > colgroup>col').each(function (index, item) {
              console.log('item====', $(item).attr('width'))
              $("tbody.draggable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px')
              $("thead.resizable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px')
            });
            // $('#chiTietPhieuTable').jexcel({
            // 	data: vm.dsCTPItems,
            // 	columns: [
            // 		{
            // 			type: 'text',
            // 			title: 'Số seri',
            // 			width: 120
            // 		},
            // 		{
            // 			type: 'text',
            // 			title: 'Số phiếu quản lý',
            // 			width: 120
            // 		},
            // 		{
            // 			type: 'text',
            // 			title: 'Ngày XX',
            // 			width: 150
            // 		},
            // 		{
            // 			type: 'text',
            // 			title: 'Màu sơn',
            // 			width: 150
            // 		},
            // 		{
            // 			type: 'text',
            // 			title: 'Số khung',
            // 			width: 150
            // 		},
            // 		{
            // 			type: 'text',
            // 			title: 'Số động cơ',
            // 			width: 150
            // 		}
            // 	]
            // });

            // $('#chiTietPhieuTable').jexcel({
            // 	data: vm.dsCTPItems,
            // 	onchange: vm.checkStateNumberGCN(item),
            // 	columns: [
            // 		{
            // 			type: 'text',
            // 			title: 'Số seri',
            // 			width: 240
            // 		},
            // 		{
            // 			type: 'numeric',
            // 			title: 'Từ số',
            // 			width: 240
            // 		},
            // 		{
            // 			type: 'numeric',
            // 			title: 'Đến số',
            // 			width: 240
            // 		}
            // 	]
            // })
            if ($('#dsSoSerial').html()) {
              $('#dsSoSerial').jexcel('setData', vm.dsSoSerialItems, true);
            } else {
              $('#dsSoSerial').jexcel({
                data: vm.dsSoSerialItems,
                colWidths: [240, 240, 240],
                onchange: vm.checkStateNumberGCN(item),
                colHeaders: ['Số seri', 'Từ số', 'Đến số'],
                columns: [{
                  type: 'text'
                },
                {
                  type: 'numeric'
                },
                {
                  type: 'numeric'
                }
                ]
              });
            }
            $('#dsSoSerial table.jexcel.jexcel_overflow > colgroup>col').each(function (index, item) {
              console.log('item====', $(item).attr('width'))
              $("tbody.draggable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px')
              $("thead.resizable>tr>td:nth-child(" + (index + 1) + ")").css('min-width', $(item).attr('width') + 'px')
            });
          },
          checkStateNumberGCN: function (item) {
            var vm = this;
            var number = vm.chiTietPhieuModel['soLuong'] ? vm.chiTietPhieuModel['soLuong'] : 0;
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
            if (vm.stateNumberSerial === 2) {
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
          autoFillSerial: function () {
            var vm = this
            if (vm.detailAnChi['serialStartNo'] && vm.detailAnChi['serialEndNo']) {
              var serialStartNo = parseInt(vm.detailAnChi['serialStartNo'])
              var serialEndNo = parseInt(vm.detailAnChi['serialEndNo'])
              if (serialEndNo < serialStartNo) {
                return
              }
              vm.detailAnChi['subTotalInDocument'] = serialEndNo - serialStartNo + 1
              console.log('serialStartNo========', vm.detailAnChi['serialStartNo'])
              console.log('serialEndNo========', vm.detailAnChi['serialEndNo'])
              console.log('subTotalInDocument========', vm.detailAnChi['subTotalInDocument'])
              return
            }

            if (vm.detailAnChi['serialStartNo'] && vm.detailAnChi['subTotalInDocument']) {
              var serialStartNo = parseInt(vm.detailAnChi['serialStartNo'])
              var subTotalInDocument = parseInt(vm.detailAnChi['subTotalInDocument'])
              vm.detailAnChi['serialEndNo'] = subTotalInDocument + serialStartNo - 1
              return
            }

            if (vm.detailAnChi['serialEndNo'] && vm.detailAnChi['subTotalInDocument']) {
              var serialEndNo = parseInt(vm.detailAnChi['serialEndNo'])
              var subTotalInDocument = parseInt(vm.detailAnChi['subTotalInDocument'])
              vm.detailAnChi['serialStartNo'] = serialEndNo + 1 - subTotalInDocument
              return
            }
          },
          calTotalMoneyPhieuXuat: function () {
            var vm = this
            var total = 0
            var totalSubTotalInDocument = 0
            if (vm.dsGCNItems && vm.dsGCNItems['length']) {
              for (var i = 0; i < vm.dsGCNItems.length; i++) {
                if (!vm.dsGCNItems[i]['totalMoney']) {
                  var soLuong = vm.dsGCNItems[i]['subTotalInDocument'] ? parseInt(vm.dsGCNItems[i]['subTotalInDocument']) : 0
                  var donGia = vm.thongTinGCN['gia_ban'] ? parseInt(vm.thongTinGCN['gia_ban']) : 0
                  var thanhTien = (soLuong * donGia) || 0
                  vm.dsGCNItems[i]['totalMoney'] = thanhTien
                }
                totalSubTotalInDocument += (vm.dsGCNItems[i]['subTotalInDocument'] || 0)
                total += vm.dsGCNItems[i]['totalMoney']
              }
            }
            vm.totalSubTotalInDocument = totalSubTotalInDocument || 0
            vm.totalMoneyPhieuXuat = total || 0
            if (vm.thongTinGCN['so_luong']) {
              vm.thongTinGCN['so_luong'] = parseInt(vm.thongTinGCN['so_luong'])
              if (vm.thongTinGCN['so_luong'] >= totalSubTotalInDocument) {
                vm.totalChuaCap = vm.thongTinGCN['so_luong'] - vm.totalSubTotalInDocument
              }
            }
          },
          addPhieu: function () {
            var vm = this
            var url = "";
            // var soLuong = vm.detailAnChi['subTotalInDocument'] ? parseInt(vm.detailAnChi['subTotalInDocument']) : 0
            // var donGia = vm.thongTinGCN['gia_ban'] ? parseInt(vm.thongTinGCN['gia_ban']) : 0
            // var thanhTien = (soLuong * donGia) || 0
            // vm.detailAnChi['totalMoney'] = thanhTien
            vm.dsGCNItems.push(vm.detailAnChi)
            vm.calTotalMoneyPhieuXuat()
            vm.detailAnChi = {
              serialStartNo: '',
              serialEndNo: '',
              subTotalInDocument: ''
            }
            vm.stampBook = {}
            if (vm.totalSubTotalInDocument && vm.thongTinGCN['so_luong'] && vm.totalSubTotalInDocument > vm.thongTinGCN['so_luong']) {
              vm.snackbartextdossierViewJX = "SL kê khai vượt quá SL duyệt cấp!";
              vm.snackbarerordossierViewJX = true;
            }
            vm.popUpAddPhieu = !vm.popUpAddPhieu
          },
          bindStamp: function () {
            var vm = this
            var url = "";
            vm.detailAnChi = Object.assign(vm.detailAnChi, {
              stampShortNo: vm.stampBook['stampShortNo'],
              bookId: vm.stampBook['bookId']
            })
          },
          putStateUserInfo: function () {
            var vm = this;
            var stateModel = {
              "serviceInfo": vm.serviceInfoFilter.serviceCode,
              "applicant": vm.applicantNameFilter.applicantIdNo,
              "dossierNo": vm.dossierNoFilter
            }
            $.ajax({
              url: "/o/rest/v2/userInfologs",
              dataType: "json",
              type: "POST",
              headers: {
                "groupId": themeDisplay.getScopeGroupId()
              },
              data: stateModel,
              success: function (result) {

              },
              error: function (result) {

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
            }).then(function (dialog) {
              $.ajax({
                url: "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid,
                dataType: "json",
                type: "DELETE",
                headers: {
                  "groupId": themeDisplay.getScopeGroupId()
                },
                success: function (result) {
                  vm.snackbartextdossierViewJX = "Xoá dữ liệu thành phần hồ sơ thành công!";
                  vm.snackbardossierViewJX = true;
                  vm.listDocumentOutStepItems.splice(index, 1);
                  vm.stepModel.createFiles[item.index].counter = vm.stepModel.createFiles[item.index].counter - 1;
                },
                error: function (result) {
                  vm.snackbartextdossierViewJX = "Xoá dữ liệu thành phần hồ sơ thất bại!";
                  vm.snackbarerordossierViewJX = true;
                }
              });
              dialog.close();
            }).catch(function (e) {
              console.log(e)
            })
          },
          genNoiDungSuaDoiCSBHBD: function () {
            var vm = this
            vm.detailCSBHBD['noiDungSuaDoi'] = []
            console.log(vm.part1CSBHBD)
            console.log(vm.detailCSBHBD)
            for (var i = 0; i < vm.part1CSBHBD.length; i++) {
              if (vm.part1CSBHBD[i].hasOwnProperty('nd_result') && vm.part1CSBHBD[i]['nd_result']) {
                console.log('1', vm.part1CSBHBD[i]['nd_result'])
                console.log('2', vm.detailCSBHBD[vm.part1CSBHBD[i]['nd_result']])
                if (vm.detailCSBHBD[vm.part1CSBHBD[i]['nd_result']] === 2 || vm.detailCSBHBD[vm.part1CSBHBD[i]['nd_result']] === 3 || vm.detailCSBHBD[vm.part1CSBHBD[i]['nd_result']] === 4) {
                  var obj = Object.assign({}, vm.part1CSBHBD[i])
                  obj['mt_nd'] = vm.detailCSBHBD[vm.part1CSBHBD[i]['mt_nd']]
                  obj['ngay'] = ''
                  obj['ket_luan'] = ''
                  console.log(obj)
                  vm.detailCSBHBD['noiDungSuaDoi'].push(obj)
                }
              }
            }
            console.log("vm.detailCSBHBD['noiDungSuaDoi']", vm.detailCSBHBD['noiDungSuaDoi'])
            console.log(vm.detailCSBHBD)
          },
          convertCSBHBDReportRepository: function () {
            var vm = this
            var markupDesigner = 0
            var markupOverseasManufacturer = 0
            var markupDomesticsManufacturer = 1
            var markupMaintainer = 0
            var markupImporter = 0
            vm.calToTalPointCSBHBD()
            return {
              mtCore: 1,
              convertAssembleId: 0,
              dossierId: vm.dossierIdFormDN,
              dossierIdCTN: vm.detailModel['dossierIdCTN'],
              dossierNo: vm.detailModel['dossierNo'],
              applicantprofileid: vm.detailCSBHBD['dossierNo'],
              applicantCode: vm.detailCSBHBD['applicantCode'],
              applicantName: vm.detailCSBHBD['applicantName'],
              applicantAddress: vm.detailCSBHBD['applicantAddress'],
              applicantRepresentative: vm.detailCSBHBD['applicantRepresentative'],
              applicantRepresentativeTitle: vm.detailCSBHBD['applicantRepresentativeTitle'],
              applicantEmail: vm.detailCSBHBD['applicantEmail'],
              applicantPhone: vm.detailCSBHBD['applicantPhone'],
              applicantTelNo: vm.detailCSBHBD['applicantTelNo'],
              applicantFax: vm.detailCSBHBD['applicantFax'],
              applicantContactName: vm.detailCSBHBD['applicantContactName'],
              applicantContactEmail: vm.detailCSBHBD['applicantContactEmail'],
              applicantContactPhone: vm.detailCSBHBD['applicantContactPhone'],
              applicantContactTelNo: vm.detailCSBHBD['applicantContactTelNo'],
              applicantBusinessType: vm.detailCSBHBD['applicantBusinessType'],
              markupDesigner: markupDesigner,
              markupOverseasManufacturer: markupOverseasManufacturer,
              markupDomesticsManufacturer: markupDomesticsManufacturer,
              markupMaintainer: markupMaintainer,
              markupImporter: markupImporter,
              importerDomesticSite: vm.detailCSBHBD['importerDomesticSite'],
              siteOfNationality: vm.detailCSBHBD['siteOfNationality'],
              siteOfNationalityCode: vm.detailCSBHBD['siteOfNationalityCode'],
              siteOfRegion: vm.detailCSBHBD['siteOfRegion'],
              siteOfRegionCode: vm.detailCSBHBD['siteOfRegionCode'],
              siteOfCity: vm.detailCSBHBD['siteOfCity'],
              siteOfCityCode: vm.detailCSBHBD['siteOfCityCode'],
              manufacturerRepresentative: vm.detailCSBHBD['manufacturerRepresentative'],
              manufacturerRepresentativeTitle: vm.detailCSBHBD['manufacturerRepresentativeTitle'],
              manufacturerEmail: vm.detailCSBHBD['manufacturerEmail'],
              manufacturerPhone: vm.detailCSBHBD['manufacturerPhone'],
              manufacturerFax: vm.detailCSBHBD['manufacturerFax'],
              overseasManufacturerCode: vm.detailCSBHBD['overseasManufacturerCode'],
              overseasManufacturerName: vm.detailCSBHBD['overseasManufacturerName'],
              overseasmanufacturerAddress: vm.detailCSBHBD['overseasmanufacturerAddress'],
              productionPlantId: vm.detailCSBHBD['productionPlantId'] || 0,
              productionPlantCode: vm.detailCSBHBD['ma_so_xuong'],
              productionPlantName: vm.detailCSBHBD['ten_xuong_san_xuat'],
              productionPlantAddress: vm.detailCSBHBD['dia_chi_xuong'],
              productionPlantEmail: vm.detailCSBHBD['email_xuong'],
              productionPlantWebsite: vm.detailCSBHBD['web_doanh_nghiep'],
              productionPlantRepesentative: vm.detailCSBHBD['nguoi_dai_dien_xuong'],
              productionPlantRepresentativeTitle: vm.detailCSBHBD['chuc_danh_dai_dien_xuong'],
              importerManufacturerCode: vm.detailCSBHBD['importerManufacturerCode'],
              importerManufacturerName: vm.detailCSBHBD['importerManufacturerName'],
              importerManufacturerAddress: vm.detailCSBHBD['importerManufacturerAddress'],
              markupdomesticsmanufacturer: vm.detailCSBHBD['markupdomesticsmanufacturer'],
              copReportNo: vm.detailCSBHBD['copReportNo'],
              copReportDate: vm.detailCSBHBD['copReportDateFrom'],
              copReportStatus: vm.detailCSBHBD['copReportStatus'],
              copReportType: vm.detailCSBHBD['loai_hinh_danh_gia'],
              copClassification: vm.detailCSBHBD['copclassification'],
              productClassificationDescription: vm.detailCSBHBD['productClassificationDescription'],
              copReportMetadata: vm.detailCSBHBD['copReportMetadata'],
              copReportSignName: vm.detailCSBHBD['copReportSignName'],
              copReportSignTitle: vm.detailCSBHBD['copReportSignTitle'],
              copReportSignPlace: vm.detailCSBHBD['copReportSignPlace'],
              copReportApprovedDate: vm.detailCSBHBD['copReportApprovedDate'],
              copReportExpiredDate: vm.detailCSBHBD['copReportExpiredDate'],
              copFileEntryId: vm.detailCSBHBD['copFileEntryId'],
              totalPointA: vm.detailCSBHBD['totalPointA'],
              totalPointB: vm.detailCSBHBD['totalPointB'],
              totalPointC: vm.detailCSBHBD['totalPointC'],
              copNonConformity: vm.detailCSBHBD['copNonConformity'],
              inspectionRecordno: vm.detailCSBHBD['inspectionRecordno'],
              inspectionRecorddate: vm.detailCSBHBD['inspectionRecorddate'],
              corporationId: vm.detailCSBHBD['corporationId'],
              inspectorId: vm.detailCSBHBD['inspectorId'],
              inspectionSite: vm.detailCSBHBD['inspectionSite'],
              inspectionDateFrom: vm.detailCSBHBD['inspectionDateFrom'],
              inspectionDateTo: vm.detailCSBHBD['inspectionDateTo'],
              subInspector: vm.detailCSBHBD['subInspector'],
              inspectionRecordFileEntryId: vm.detailCSBHBD['inspectionRecordFileEntryId'],
              copReportRefNo: vm.detailCSBHBD['copReportRefNo'],
              copReportRefDate: vm.detailCSBHBD['copReportRefDate'],
              copReportPreviousNo: vm.detailCSBHBD['copReportPreviousNo'],
              copReportPreviousDate: vm.detailCSBHBD['copReportPreviousDate'],
              expiredStatus: vm.detailCSBHBD['expiredStatus'],
              description: vm.detailCSBHBD['description'],
              corporationName: vm.detailCSBHBD['corporationName'],
              inspectorContactCode: vm.detailCSBHBD['inspectorContactCode'],
              inspectorName: vm.detailCSBHBD['inspectorName'],
              inspectorEndorsementDate: vm.detailCSBHBD['inspectorEndorsementDate'],
              inspectorDeadline: vm.detailCSBHBD['inspectorDeadline'],
              resolvedStatus: vm.detailCSBHBD['resolvedStatus'],
              numberOfNonConformity: vm.detailCSBHBD['numberOfNonConformity'],
              numberOfResolved: vm.detailCSBHBD['numberOfResolved'],
              observationDescription: vm.detailCSBHBD['observationDescription'],
              inspectionAuditCycle: vm.detailCSBHBD['inspectionAuditCycle'],
              inspectionNote: vm.detailCSBHBD['inspectionNote'],
              productionConformityChecking: vm.detailCSBHBD['productionConformityChecking'],
              productionStampChecking: vm.detailCSBHBD['productionStampChecking'],
              testingEquipmentChecking: vm.detailCSBHBD['testingEquipmentChecking'],
              productionPlantClassification: vm.detailCSBHBD['productionPlantClassification'],
              actualCapacity: vm.detailCSBHBD['actualCapacity'],
              maxCapacity: vm.detailCSBHBD['maxCapacity'],
              averageCapacity: vm.detailCSBHBD['averageCapacity'],
              totalEmployee: vm.detailCSBHBD['totalEmployee'],
              totalWorker: vm.detailCSBHBD['diem_nd_5_1_1'],
              totalManager: vm.detailCSBHBD['diem_nd_5_1_2'],
              totalTechnical: vm.detailCSBHBD['diem_nd_5_1_2'],
              totalQaEmployee: vm.detailCSBHBD['diem_nd_5_1_3'],
              totalSquaremeter: vm.detailCSBHBD['totalSquaremeter'],
              warehouseSquare: vm.detailCSBHBD['warehouseSquare'],
              officeSquare: vm.detailCSBHBD['officeSquare'],
              productionSquare: vm.detailCSBHBD['productionSquare'],
              machiningArea: vm.detailCSBHBD['machiningArea'],
              weldingArea: vm.detailCSBHBD['weldingArea'],
              paintingArea: vm.detailCSBHBD['paintingArea'],
              productionAssembleArea: vm.detailCSBHBD['productionAssembleArea'],
              finishProductArea: vm.detailCSBHBD['finishProductArea'],
              testingArea: vm.detailCSBHBD['testingArea'],
              selfEquipment: vm.detailCSBHBD['selfEquipment'],
              contractEquipment: vm.detailCSBHBD['contractEquipment'],
              circularNo: vm.detailCSBHBD['circularNo'],
              circularDate: vm.detailCSBHBD['circularDate'],
              circularNo2: vm.detailCSBHBD['circularNo2'],
              circularDate2: vm.detailCSBHBD['circularDate2'],
              module: '02'
            }
          },
          convertCSBHBDProductionPlantEquipment: function () {
            var vm = this
            var vr_COPProductionPlantEquipment = vm.detailCSBHBD['thiet_bi_xuat_xuong'] || []
            if (vr_COPProductionPlantEquipment && vr_COPProductionPlantEquipment['length']) {
              vr_COPProductionPlantEquipment = vr_COPProductionPlantEquipment.map(function (item) {
                var MarkupXCG = 1
                var MarkupXCGNK = 0
                var MarkupSMRM = 0
                var MarkupXCH = 0
                var MarkupXCN = 0
                var MarkupXMY = 0
                var MarkupXDD = 0

                return {
                  vrcopProductionPlantEquipmentId: item['id'],
                  mtCore: 1,
                  copReportNo: vm.detailCSBHBD['copReportNo'],
                  productionPlantId: vm.detailCSBHBD['productionPlantId'],
                  productionPlantCode: vm.detailCSBHBD['productionPlantCode'],
                  sequenceNo: item['sequenceNo'],
                  equipmentCode: item['name'],
                  equipmentName: item['name_text'],
                  equipmentType: 0,
                  trademark: item['mark'],
                  trademarkName: item['mark'],
                  commercialName: '',
                  modelCode: item['model'],
                  equipmentSerialNo: item['seri'],
                  productionYear: item['year'],
                  registrationYear: 0,
                  markupXCG: MarkupXCG,
                  markupXCGNK: MarkupXCGNK,
                  markupSMRM: MarkupSMRM,
                  markupXCH: MarkupXCH,
                  markupXCN: MarkupXCN,
                  markupXMY: MarkupXMY,
                  markupXDD: MarkupXDD,
                  testingResult: item['nd_result'],
                  description: item['mt_nd_4_2_1_3'],
                  inspectionRecordNumber: item['inspectionRecordNumber'],
                  inspectionRecordDate: item['inspectionRecordDate'],
                  expiredStatus: item['expiredStatus'] || '',
                  stampTestingNo: item['temp'],
                  productionCountryCode: item['countryTest'],
                  equipmentStatus: item['statusActive'],
                  notes: item['ghi_chu'],
                  dossierId: vm.dossierIdFormDN,
                  dossierIdCTN: vm.detailModel['dossierIdCTN'],
                  dossierNo: vm.detailModel['dossierNo']
                }
              })
            }
            return vr_COPProductionPlantEquipment
          },
          postDataCSBHBD: function () {
            var vm = this
            var dklrData = {}
            // dklrData['vr_COPProductionPlantEmployee'] = vm.convertDataCOPProductionPlantEmployee()
            dklrData['vr_COPReportRepository'] = vm.convertCSBHBDReportRepository()
            dklrData['vr_COPProductionPlantEquipment'] = vm.convertCSBHBDProductionPlantEquipment()
            var jsonData = new Object();
            jsonData['body'] = dklrData;
            jsonData['indice'] = 'vr_COPReportRepository';
            $.ajax('/o/rest/vr-app/post', {
              type: 'POST',
              data: JSON.stringify(jsonData),
              dataType: 'json',
              contentType: 'application/json',
              processData: false,
              success: function (data) {
                if (data['status'] && data['status']['err_msg'] == 'success') {
                  console.log('POST API thanh cong');
                  vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thành công!";
                  vm.snackbardossierViewJX = true;
                }
              },
              error: function (data) {
                if (!data['status'] || !(data['status']['err_msg'] == 'success')) {
                  console.log('POST API that bai');
                  vm.snackbartextdossierViewJX = "Yêu cầu thực hiện thất bại, vui lòng thử lại!";
                  vm.snackbarerordossierViewJX = true;
                }
              }
            });
          },
          submitAlpacajsForm: function (item, dossierActionId) {
            var vm = this;
            console.log('run submitApacal');
            vm.loadingAlpacajsForm = true;
            try {
              // console.log("$('#alpacajs_form_' + item.partNo + '_' + dossierActionId + ' .formType').val()============",$("#alpacajs_form_" + item.partNo + '_' + dossierActionId + " .formType").val());
              // if ( $("#alpacajs_form_" + item.partNo + '_' + dossierActionId + " .formType").val() == null ||
              // 	$("#alpacajs_form_" + item.partNo + '_' + dossierActionId + " .formType").val() == 'undefined' ) {
              if ($("#alpacajs_form_" + item.partNo + " .formType").val() == null ||
                $("#alpacajs_form_" + item.partNo + " .formType").val() == 'undefined') {
                console.log("formType 1");
                vm.loadingAlpacajsForm = true;
                var formData = {}
                if (item.eform && item['dossierPartId'] === 288 && item['partNo'] === 'KQ4') {
                  formData = vm.detailCOP
                  vm.postDataCOP()
                  console.log("formType COPPPPP");
                } else if (item.eform && item['dossierPartId'] === 161 && item['partNo'] === 'KQ2') {
                  console.log('submitAlpacajsForm ========== detailCSBHBD', vm.detailCSBHBD)
                  vm.genNoiDungSuaDoiCSBHBD()
                  formData = vm.detailCSBHBD
                  vm.postDataCSBHBD()
                  console.log("formType CS BHBD");
                } else {
                  // var control = $("#alpacajs_form_" + item.partNo + '_' + dossierActionId).alpaca("get");
                  var control = $("#alpacajs_form_" + item.partNo).alpaca("get");
                  formData = control.getValue();
                }

                $.ajax({
                  url: "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid + "/formdata",
                  dataType: "json",
                  type: "PUT",
                  async: false,
                  headers: {
                    "groupId": themeDisplay.getScopeGroupId(),
                    Accept: "application/json"
                  },
                  data: {
                    formdata: JSON.stringify(formData)
                  },
                  success: function (result) {
                    vm.snackbartextdossierViewJX = "Lưu form thành công!";
                    vm.snackbardossierViewJX = true;
                    vm.loadingAlpacajsForm = false;
                    $("#validCreateFile" + item.partNo).val("1")
                    try {

                      if (item.hasSubmit) {

                      } else {

                        item.counter++;
                        item.hasSubmit = true;
                      }


                    } catch (e) {
                      console.log(e)
                    }
                  },
                  error: function (result) {
                    vm.snackbartextdossierViewJX = "Lưu form thất bại!";
                    vm.snackbarerordossierViewJX = true;
                    vm.loadingAlpacajsForm = false;
                  }
                });

              } else if ($("#alpacajs_form_" + item.partNo + " .formType").val() != null &&
                $("#alpacajs_form_" + item.partNo + " .formType").val() === 'assign') {

                // } else if ( $("#alpacajs_form_" + item.partNo + '_' + dossierActionId + " .formType").val() != null &&
                // 	$("#alpacajs_form_" + item.partNo + '_' + dossierActionId + " .formType").val() === 'assign' ) {
                console.log("formType 2");
                vm.loadingAlpacajsForm = true;

                // var control = $("#alpacajs_form_" + item.partNo + '_' + dossierActionId).alpaca("get");
                var control = $("#alpacajs_form_" + item.partNo).alpaca("get");
                var formData = control.getValue();
                vm.subUsers = formData['subUsers'];
                vm.alpacaAssignUserId = formData['userAction'];
                $.ajax({
                  url: "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid + "/formdata",
                  dataType: "json",
                  type: "PUT",
                  headers: {
                    "groupId": themeDisplay.getScopeGroupId(),
                    Accept: "application/json"
                  },
                  async: false,
                  data: {
                    formdata: JSON.stringify(formData)
                  },
                  success: function (result) {
                    vm.snackbartextdossierViewJX = "Lưu form thành công!";
                    vm.snackbardossierViewJX = true;
                    vm.loadingAlpacajsForm = false;
                    $("#validCreateFile" + item.partNo).val("1")
                    try {
                      if (item.hasSubmit) {

                      } else {
                        item.counter++;
                        item.hasSubmit = true;
                      }
                    } catch (e) {

                    }
                  },
                  error: function (result) {
                    vm.snackbartextdossierViewJX = "Lưu form thất bại!";
                    vm.snackbarerordossierViewJX = true;
                    vm.loadingAlpacajsForm = false;
                  }
                });


              } else {
                vm.loadingAlpacajsForm = true;
                setTimeout(
                  function () {
                    try {
                      vm.loadingAlpacajsForm = false;
                      if (item.hasSubmit) {

                      } else {

                        item.counter++;
                        item.hasSubmit = true;
                      }
                    } catch (e) {

                    }

                  },
                  3000);
              }
            } catch (e) {
              console.log(e);
              vm.loadingAlpacajsForm = false;
            }
          },
          initFormPopupBienBanThietBi: function () {
            var vm = this
            if (vm.detailCOP['hop_dong'] && vm.detailCOP['hop_dong']['length']) {
              if (typeof vm.detailCOP['hop_dong'] === 'string') {
                vm.detailCOP['hop_dong'] = JSON.parse(vm.detailCOP['hop_dong'])
              }
            }
            if (vm.detailCOP['loai_san_pham_xuong'] && vm.detailCOP['loai_san_pham_xuong']['length']) {
              if (typeof vm.detailCOP['loai_san_pham_xuong'] === 'string') {
                vm.detailCOP['loai_san_pham_xuong'] = JSON.parse(vm.detailCOP['loai_san_pham_xuong'])
              }
            }
            if (vm.detailCOP['danh_sach_nhan_vien'] && vm.detailCOP['danh_sach_nhan_vien']['length']) {
              if (typeof vm.detailCOP['danh_sach_nhan_vien'] === 'string') {
                vm.detailCOP['danh_sach_nhan_vien'] = JSON.parse(vm.detailCOP['danh_sach_nhan_vien'])
              }
            }
            if (vm.detailCOP['thiet_bi_xuat_xuong'] && vm.detailCOP['thiet_bi_xuat_xuong']['length']) {
              if (typeof vm.detailCOP['thiet_bi_xuat_xuong'] === 'string') {
                vm.detailCOP['thiet_bi_xuat_xuong'] = JSON.parse(vm.detailCOP['thiet_bi_xuat_xuong'])
              }
              for (var i = 0; i < vm.detailCOP['thiet_bi_xuat_xuong'].length; i++) {
                if (!vm.detailCOP['thiet_bi_xuat_xuong'][i]['resultTest'] || !vm.detailCOP['thiet_bi_xuat_xuong'][i]['resultTest']['length']) {
                  vm.detailCOP['thiet_bi_xuat_xuong'][i]['resultTest'] = [{}, {}, {}, {}, {}, {}, {}, {}, {}, {}]
                }
              }
            }
            if (vm.detailCOP['danh_sach_san_pham'] && vm.detailCOP['danh_sach_san_pham']['length']) {
              if (typeof vm.detailCOP['danh_sach_san_pham'] === 'string') {
                vm.detailCOP['danh_sach_san_pham'] = JSON.parse(vm.detailCOP['danh_sach_san_pham'])
              }
              for (var i = 0; i < vm.detailCOP['danh_sach_san_pham'].length; i++) {
                if (!vm.detailCOP['danh_sach_san_pham'][i]['resultTest'] || !vm.detailCOP['danh_sach_san_pham'][i]['resultTest']['length']) {
                  vm.detailCOP['danh_sach_san_pham'][i]['resultTest'] = [{}, {}, {}, {}, {}, {}, {}, {}, {}, {}]
                }
              }
            }
            if (vm.detailCOP['danh_sach_tai_lieu'] && vm.detailCOP['danh_sach_tai_lieu']['length']) {
              if (typeof vm.detailCOP['danh_sach_tai_lieu'] === 'string') {
                vm.detailCOP['danh_sach_tai_lieu'] = JSON.parse(vm.detailCOP['danh_sach_tai_lieu'])
              }
              for (var i = 0; i < vm.detailCOP['danh_sach_tai_lieu'].length; i++) {
                if (!vm.detailCOP['danh_sach_tai_lieu'][i]['resultTest'] || !vm.detailCOP['danh_sach_tai_lieu'][i]['resultTest']['length']) {
                  vm.detailCOP['danh_sach_tai_lieu'][i]['resultTest'] = [{}, {}, {}, {}, {}, {}, {}, {}, {}, {}]
                }
              }
            }
            if (vm.detailCOP['thiet_bi_dung_cu'] && vm.detailCOP['thiet_bi_dung_cu']['length']) {
              if (typeof vm.detailCOP['thiet_bi_dung_cu'] === 'string') {
                vm.detailCOP['thiet_bi_dung_cu'] = JSON.parse(vm.detailCOP['thiet_bi_dung_cu'])
              }
              for (var i = 0; i < vm.detailCOP['thiet_bi_dung_cu'].length; i++) {
                if (!vm.detailCOP['thiet_bi_dung_cu'][i]['resultTest'] || !vm.detailCOP['thiet_bi_dung_cu'][i]['resultTest']['length']) {
                  vm.detailCOP['thiet_bi_dung_cu'][i]['resultTest'] = [{}, {}, {}, {}, {}, {}, {}, {}, {}, {}]
                }
              }
            }
          },
          initFormPopupBienBanThietBiCSBHBD: function () {
            var vm = this
            if (vm.detailCSBHBD['thiet_bi_xuat_xuong'] && vm.detailCSBHBD['thiet_bi_xuat_xuong']['length']) {
              if (typeof vm.detailCSBHBD['thiet_bi_xuat_xuong'] === 'string') {
                console.log('1111111111111111111111111', vm.detailCSBHBD['thiet_bi_xuat_xuong'])
                vm.detailCSBHBD['thiet_bi_xuat_xuong'] = JSON.parse(vm.detailCSBHBD['thiet_bi_xuat_xuong'])
              }
              for (var i = 0; i < vm.detailCSBHBD['thiet_bi_xuat_xuong'].length; i++) {
                if (!vm.detailCSBHBD['thiet_bi_xuat_xuong'][i]['resultTest'] || !vm.detailCSBHBD['thiet_bi_xuat_xuong'][i]['resultTest']['length']) {
                  vm.detailCSBHBD['thiet_bi_xuat_xuong'][i]['resultTest'] = [{}, {}, {}, {}, {}, {}, {}, {}, {}, {}]
                }
              }
            }
            if (vm.detailCSBHBD['loai_phuong_tien_bhbd'] && vm.detailCSBHBD['loai_phuong_tien_bhbd']['length']) {
              if (typeof vm.detailCSBHBD['loai_phuong_tien_bhbd'] === 'string') {
                vm.detailCSBHBD['loai_phuong_tien_bhbd'] = JSON.parse(vm.detailCSBHBD['loai_phuong_tien_bhbd'])
              }
            }

          },
          showAlpacaJSFORM: function (item, dossierActionId) {
            var vm = this;
            console.log('item show form======', item)
            // var alpacajsForm = $("#alpacajs_form_" + item.partNo + '_' + dossierActionId);
            var alpacajsForm = $("#alpacajs_form_" + item.partNo);
            if (alpacajsForm) {
              alpacajsForm.empty()
            }
            if (item['partNo'] === 'KQ4') {
              vm.stateKiemTraDotXuat = 1
            } else {
              vm.stateKiemTraDotXuat = -1
            }
            if (item.eform && item['dossierPartId'] === 288 && item['partNo'] === 'KQ4') {
              // set default đạt vào ô tick đạt ko đạt
              for (var i = 0; i < vm.part1.length; i++) {
                if (vm.part1[i] && vm.part1[i]['nd_result']) {
                  vm.detailCOP[vm.part1[i]['nd_result']] = 1
                }
              }
              for (var j = 0; j < vm.part3.length; j++) {
                if (vm.part3[j] && vm.part3[j]['nd_result']) {
                  vm.detailCOP[vm.part3[j]['nd_result']] = 1
                }
              }
              for (var k = 0; k < vm.part5.length; k++) {
                if (vm.part5[k] && vm.part5[k]['nd_result']) {
                  vm.detailCOP[vm.part5[k]['nd_result']] = 1
                }
              }
              var formData = JSON.parse(item['formData'])
              var tmpObj = Object.assign({}, formData)
              tmpObj['dang_kiem_vien_1'] = tmpObj['dang_kiem_vien_1'] ? String(tmpObj['dang_kiem_vien_1']) : ''
              tmpObj['dang_kiem_vien_2'] = tmpObj['dang_kiem_vien_2'] ? String(tmpObj['dang_kiem_vien_2']) : ''
              vm.initFormPopupBienBanThietBi()
              console.log('tmpObj===========', tmpObj)
              vm.detailCOP = Object.assign(vm.detailCOP, tmpObj)
              vm.getFormDataBanKhai(vm.detailModel['dossierIdCTN'])
              console.log('detailCOP===========', vm.detailCOP)
              if (alpacajsForm) {
                alpacajsForm.empty()
              }
            } else if (item.eform && item['dossierPartId'] === 161 && item['partNo'] === 'KQ2') {
              // set default đạt vào ô tick đạt ko đạt
              for (var f = 0; f < vm.part1CSBHBD.length; f++) {
                if (vm.part1CSBHBD[f] && vm.part1CSBHBD[f]['nd_result']) {
                  vm.detailCSBHBD[vm.part1CSBHBD[f]['nd_result']] = vm.part1CSBHBD[f][vm.part1CSBHBD[f]['nd_result']]
                }
              }
              var formData = JSON.parse(item['formData'])
              console.log('formData CSBHBD', formData)
              var tmpObj = Object.assign({}, formData)
              tmpObj['dang_kiem_vien_1'] = tmpObj['dang_kiem_vien_chinh_userId'] ? String(tmpObj['dang_kiem_vien_chinh_userId']) : ''
              tmpObj['dang_kiem_vien_1_text'] = tmpObj['dang_kiem_vien_chinh'] ? String(tmpObj['dang_kiem_vien_chinh']) : ''
              if (tmpObj['dang_kiem_vien_ho_tro_sample'] && tmpObj['dang_kiem_vien_ho_tro_sample']['length']) {
                tmpObj['dang_kiem_vien_2'] = tmpObj['dang_kiem_vien_ho_tro_sample'][0]['userId']
                tmpObj['dang_kiem_vien_2_text'] = tmpObj['dang_kiem_vien_ho_tro_sample'][0]['fullName']
              }
              vm.detailCSBHBD = Object.assign(vm.detailCSBHBD, tmpObj)
              vm.detailCSBHBD['loai_hinh_danh_gia'] = vm.detailCSBHBD['loai_ho_so_cop']
              vm.initFormPopupBienBanThietBiCSBHBD()
              vm.getFormDataBanKhai(vm.detailModel['dossierIdCTN'])
              console.log('detailCSBHBD===========', vm.detailCSBHBD)
              if (alpacajsForm) {
                alpacajsForm.empty()
              }
            } else if (item.eform && item['partNo'] === 'KQ6' && item['dossierTemplateNo'] === 'TT302011BGTVTCPPXCG') {
              // TODO
            } else if (alpacajsForm && item.eform) {
              try {
                console.log('alpacajsForm=======', alpacajsForm)
                alpacajsForm.empty()
                // $("#alpacajs_form_" + item.partNo + '_' + dossierActionId).empty();
                $("#alpacajs_form_" + item.partNo).empty();
                console.log(item);
                var alapcaJS = eval('(' + item.formScript + ')');
                alapcaJS['data'] = item.formData;
                // $("#alpacajs_form_" + item.partNo + '_' + dossierActionId).alpaca(alapcaJS);
                $("#alpacajs_form_" + item.partNo).alpaca(alapcaJS);
              } catch (e) {
                console.log(e);
              }
            }
          },
          viewOnNewTab: function (item) {
            var vm = this;
            if (item.counter > 0) {
              if (item.counter === 1) {
                var configBob = {
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
          parseDateUtc: function (date) {
            return moment(String(date)).utc().format('DD/MM/YYYY HH:mm:ss');
          },
          showAlpacaJSFORMRegist: function (item) {
            var vm = this;
            var url = '/o/rest/v2/registrations/' + vm.detailRegistModel.registrationId + '/forms/' + item.referenceUid + "/formscript";
            vm.alapcaJSRei = {};
            axios.get(url, config).then(function (response) {
              var serializable = response.data;

              vm.alapcaJSRei = eval('(' + serializable + ')');

              axios.get('/o/rest/v2/registrations/' + vm.detailRegistModel.registrationId + '/forms/' + item.referenceUid + "/formdata", config).then(function (responseFormData) {
                vm.alapcaJSRei['data'] = responseFormData.data;
                $("#regist_form_" + item.referenceUid).alpaca(vm.alapcaJSRei);
              }).catch(function (error) {
                console.log(error);
              });
            }).catch(function (error) {
              console.log(error);
              vm.stepLoading = false;
            });
            return false;

          },
          changeProcessStep: function (item) {
            var vm = this;
            console.log(item);
            var status = vm.statusParamFilter;
            var subStatus = vm.substatusParamFilter;
            $("#alpacajs_form_plugin").empty();
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
                  // console.log('run apacalForm')
                  // var formScriptNew;
                  // var formDataNew;
                  // var urlFormData = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/files/'+createFileItems.referenceUid+'/formdata';
                  // var urlFormScript = '/o/rest/v2/dossiers/'+vm.detailModel.dossierId+'/files/'+createFileItems.referenceUid+'/formscript';
                  // var config_plugins = {
                  // 	headers: {
                  // 		'groupId': themeDisplay.getScopeGroupId()
                  // 	}
                  // };
                  // axios.all([
                  // 	axios.get(urlFormScript, config_plugins),
                  // 	axios.get(urlFormData, config_plugins)
                  // 	]).then( axios.spread(function (responesFormScript, responesFormData) {
                  // 		console.log('responesFormScript', responesFormScript)
                  // 		console.log('responesFormData', responesFormData)
                  // 		formScriptNew = responesFormScript.data;
                  // 		formDataNew = responesFormData.data;
                  // 		console.log('createFileItems', createFileItems)
                  // 		console.log('formScriptNew', formScriptNew)
                  // 		console.log('vm.stepModel.createFiles', vm.stepModel.createFiles)
                  // 		createFileItems.formScript = formScriptNew
                  // 		createFileItems.formData = formDataNew
                  // 		console.log('vm.stepModel', vm.stepModel)
                  // 		vm.stepLoading = false;
                  // 	}))
                  // 	.catch(function (error) {
                  // 		console.log(error);
                  // 		vm.stepLoading = false;
                  // 	});
                  vm.stepLoading = false;
                })
                console.log('++++++++++++++createFiles--------------', vm.stepModel.createFiles)
              }
              if (vm.stepModel['actionCode'] === 1124 && vm.stepModel['postStepCode'] === 205) {
                vm.titleTableSoatXet = 'Đề nghị cấp phiếu'
              } else if (vm.stepModel['actionCode'] === 1126 && vm.stepModel['postStepCode'] === 206) {
                vm.titleTableSoatXet = 'Duyệt đề nghị cấp phiếu'
              }
            } else {

              var urlPluginFormData = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/plugins/' + item.processActionId + '/formdata';
              var urlPluginFormScript = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/plugins/' + item.processActionId + '/formscript';
              var config_plugins = {
                headers: {
                  'groupId': themeDisplay.getScopeGroupId()
                },
                dataType: "text"
              };
              axios.all([
                axios.get(urlPluginFormScript, config_plugins),
                axios.get(urlPluginFormData, config_plugins)
              ]).then(axios.spread(function (urlResponesFormScript, urlResponesFormData) {
                var responseScript = urlResponesFormScript.data;
                var responseData = urlResponesFormData.data;

                console.log("responseScript==============", responseScript);
                item.plugin = true;

                if (responseScript.indexOf("#preview@pdf") !== -1) {
                  console.log("view pdf");
                  var url = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/plugins/" + item.processActionId + "/preview";

                  var config_blob = {
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
                    dataType: "json"
                  };
                  item.html = true;
                  item.no_html = "";
                  vm.stepModel = item;

                  var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/plugins/' + item.processActionId + '/previewhtml';
                  axios.get(url, config_view).then(function (response) {
                    item.no_html = "";
                    vm.stepModel = item;

                    var serializable = response.data;

                    var partNo = serializable.partNo;
                    var dossierFileId = serializable.dossierFileId;

                    $(".dossierFilePartNo").val("");
                    $(".dossierFilePartNo").attr('id', 'dossierFileId' + partNo);
                    $(".dossierFilePartNo").val(dossierFileId);

                    var formReport = eval('(' + serializable.formReport + ')');
                    var formData = eval('(' + serializable.formData + ')');

                    console.log("formReport======", formReport);
                    console.log("formData======", formData);
                    /*var formData = serializable.formData;*/


                    formReport.data = formData;
                    console.log("formReport_____FINAL=======", formReport);
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
          },
          refreshProcess: function () {
            var vm = this;
            vm._initchangeProcessStep();
            vm.stepModel = null;
          },
          kySoHSM: function (item) {
            console.log("itempostNextActions2============", item);
            var vm = this;
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
            var assignUserId = 0;
            var subUsers = '';

            if (vm.alpacaAssignUserId != 0) {
              assignUserId = vm.alpacaAssignUserId;
              subUsers = JSON.stringify(vm.subUsers);
            } else if (vm.processAssignUserId.userId > 0) {
              assignUserId = vm.processAssignUserId.userId;
            }
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
              vm.kyDuyetYCGiamDinh(strIdArr, paramObj, actionName, true);
            }
          },
          postNextActions2: function (item) {
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
              var itemFile = createFiles.find(function (item) {
                return item['partNo'] === valid['partNo']
              })
              if (itemFile) {
                vm.snackbartextdossierViewJX = "Thành phần " + itemFile.partName + " là thành phần bắt buộc!";
                vm.snackbarerordossierViewJX = true;
              }
              return;
            }
            var submitAlpacajsFns = new Array();
            var promise = new Promise(function (resolve, reject) {
              try {
                vm.actionsSubmitLoading = true;
                // $(".saveForm").click();
                resolve(true);
              } catch (e) {
                resolve(false);
              }
            });

            promise.then(function (success) {
              vm.postNextActions(item);
            }).catch(function (error) { });
          },
          // getNameDKV () {
          // 	var vm = this
          // 	var userId = vm.detailCSBHBD['dang_kiem_vien_1']
          // 	var itemDkv = vm.dangKiemVienItems.find(function (item)  {
          // 		if (userId === item['userId']) {
          // 			return true
          // 		} else {
          // 			return false
          // 		}
          // 	})
          // 	if (itemDkv) {
          // 		vm.detailCSBHBD['dang_kiem_vien_1_text'] = itemDkv['fullName']
          // 	}
          // 	return
          // },
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

            if (item['postStepCode'] === 139) {
              var arrData = []
              if (vm.detailSoatXetGCN['bang_khai'] && vm.detailSoatXetGCN['bang_khai']['length']) {
                vm.detailSoatXetGCN['bang_khai'].forEach(function (item) {
                  arrData = arrData.concat(item['dsBBKiemTraGS_DX'] || []);
                })
              }
              console.log('arrData_____inspectionrecord===========', arrData)
              var dataTmp = {
                jsons: arrData
              }
              var url = "/o/rest/vr-app/issue/inspectionrecord/" + vm.detailModel['dossierId']
              axios.post(url, dataTmp).then(function (response) {
                vm.snackbartextdossierViewJX = "Lưu thành công!";
                vm.snackbardossierViewJX = true;
              }).catch(function (xhr) {
                vm.snackbartextdossierViewJX = "Xử lý không thành công!";
                vm.snackbarerordossierViewJX = true;
                console.log(xhr)
              })
              // vm.actionsSubmitLoading = false;
              // return
            } else {
              if (item && item['createFiles']) {
                for (var i = 0; i < item['createFiles'].length; i++) {
                  vm.submitAlpacajsForm(item['createFiles'][i], item['processActionId'])
                }
              }
            }
            // if (item['postStepCode'] === 137) {

            // }
            console.log(idArr);

            var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/actions';

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


                  setTimeout(function () {
                    vm._inidanhSachHoSoTable();
                    vm.reloadCounter();
                  }, 1000);
                  vm.detailPage = false;
                  vm.actionsSubmitLoading = false;

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
                vm.kyDuyetYCGiamDinh(strIdArr, paramObj, actionName, false);
              }
            }

          },
          kyDuyetYCGiamDinh: function (strIdArr, paramObj, actionName, useHSM) {

            var vm = this;
            var url = '/o/rest/v2/digitalSignature/' + vm.detailModel.dossierId + '/hashComputed';
            console.log(vm.detailModel.dossierId);

            $.ajax({
              type: 'POST',
              url: url,
              async: false, //bat dong bo = fale, dong bo voi client
              dataType: 'json',
              data: {
                // type: 'kyDuyetYCGiamDinh',
                strIdArr: strIdArr,
                actionCode: paramObj.actionCode,
                postStepCode: paramObj.postStepCode,
                useHSM: useHSM
                // strDossierPartId: strDossierPartId
                /*id : controlRequirementId*/
              },
              success: function (result) {
                console.log(result);
                /*var jsonData = JSON.parse(result);*/
                var msgs = result.msg;
                vm.actionsSubmitLoading = false;
                if (msgs !== 'fileEntryId') {
                  var hashComputers = result.hashComputers;
                  var signFieldNames = result.signFieldNames;
                  var fileNames = result.fileNames;
                  var fileEntryId = result.fileEntryId;
                  console.log("hashComputers: " + hashComputers);
                  console.log("signFieldNames: " + signFieldNames);
                  console.log("fileNames: " + fileNames);
                  console.log("msgs: " + msgs);
                  if (plugin().valid) {

                    for (var i = 0; i < hashComputers.length; i++) {

                      var hashComputer = hashComputers[i];
                      var code = plugin().Sign(hashComputer);

                      if (code === 0 || code === 7) {
                        var sign = plugin().Signature;
                        var signFieldName = signFieldNames[i];
                        var fileName = fileNames[i];
                        console.log("sign: " + sign);
                        console.log("signFieldName: " + signFieldName);
                        console.log("fileName: " + fileName);
                        var msg = msgs[i];
                        if (msg == 'success') {
                          try {
                            vm.completeKyDuyetYCGiamDinh(sign, signFieldName, fileName, fileEntryId, paramObj, actionName);
                          } catch (err) {
                            console.log(err);
                          }
                        } else {
                          alert(msg);
                        }
                      } else {
                        alert(plugin().ErrorMessage);
                      }
                    }
                    vm.snackbartextdossierViewJX = actionName + " thành công!";
                    vm.snackbardossierViewJX = true;
                  } else {
                    alert("Plugin is not working");
                  }
                } else {
                  alert("Cảnh báo: Không tìm thấy file bản thảo. Tạm dừng tiến trình ký số");
                }
              },
              error: function (result) {
                vm.actionsSubmitLoading = false;
              }
            });
          },
          completeKyDuyetYCGiamDinh: function (sign, signFieldName, fileName, fileEntryId, paramObj, actionName) {
            var vm = this;
            vm.actionsSubmitLoading = true;
            var url = '/o/rest/v2/digitalSignature/' + vm.detailModel.dossierId + '/dossierFile';
            $.ajax({
              type: 'PUT',
              url: url,
              async: false, //bat dong bo = fale, dong bo voi client
              dataType: 'json',
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
              success: function (result) {
                console.log(result);
                /*var jsonData = JSON.parse(result);*/
                var msg = result.msg;
                vm.actionsSubmitLoading = false;
                if (msg == 'success') {
                  //	alert('ký số thành công!');
                  vm.snackbartextdossierViewJX = actionName + " thành công!";
                  vm.snackbardossierViewJX = true;

                  vm._inidanhSachHoSoTable();
                  setTimeout(function () {
                    vm._initlistgroupHoSoFilter();
                  }, 1000);

                  vm.detailPage = false;
                } else if (msg == 'fileEntryId') {
                  alert("Cảnh báo: Không tìm thấy file bản thảo. Tạm dừng tiến trình đóng dấu số");
                } else {
                  alert(msg);
                }
              },
              error: function () {
                vm.actionsSubmitLoading = false;
                alert('ky so false');
              }
            })
          },
          _initchangeProcessStep: function () {
            var vm = this;
            vm.stepLoading = true;

            var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/nextactions';
            var urlPlugin = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/plugins';
            // var url = '/o/frontendwebdossier/json/steps.json';

            axios.all([
              axios.get(url, config),
              axios.get(urlPlugin, config)
            ]).then(axios.spread(function (urlRespones, urlPluginsRespones) {

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
                    type: 2,
                    processActionId: serializablePlugins[i].processPluginId,
                    actionName: serializablePlugins[i].pluginName
                  };
                  serializablePluginsConvert.push(plugin);
                }
              }
              var nextactions = serializableNextActionConvert;
              var plugins = serializablePluginsConvert;
              vm.processSteps = $.merge(nextactions, plugins);
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
            document.getElementById('inputfile_' + item.dossierPartId).click();
            setTimeout(function () {
              vm.actionsSubmitLoading = false;
            }, 4000);
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

            var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/files';

            var data = new FormData();
            data.append('displayName', file.name);
            data.append('file', file);
            data.append('dossierPartNo', item.partNo);
            data.append('dossierTemplateNo', vm.detailModel.dossierTemplateNo);
            data.append('fileTemplateNo', item.templateFileNo);
            data.append('fileType', '');
            data.append('isSync', item.returned);
            data.append('referenceUid', '');
            data.append('formData', '');

            $.ajax({
              type: 'POST',
              url: url,
              data: data,
              headers: {
                "groupId": themeDisplay.getScopeGroupId()
              },
              processData: false,
              contentType: false,
              cache: false,
              async: false,
              success: function (result) {
                vm.actionsSubmitLoading = false;
                vm.snackbartextdossierViewJX = " Tải file thành công!";
                vm.snackbardossierViewJX = true;
                vm.stepModel.createFiles[index].counter = vm.stepModel.createFiles[index].counter + 1;

              },
              error: function (result) {
                vm.actionsSubmitLoading = false;
                vm.snackbartextdossierViewJX = "Tải file thất bại!";
                vm.snackbarerordossierViewJX = true;
              }
            });
          },
          undoDetailPage: function () {

            this.detailPage = !this.detailPage;
            setTimeout(function () {
              $('.danhSachHoSoTable__class th[role="columnheader"]').each(function (index) {
                if ($(this).attr('aria-label').indexOf("Activate") > 0) {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
                } else {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>"));
                }
              });
            }, 300);
          },
          undoDetailRegistPage: function () {
            var vm = this;
            this.detailRegistPage = !this.detailRegistPage;
            vm.detailPage = false;
            vm.stageFilterView = 'doanh_nghiep_trong_nuoc';
            setTimeout(function () {
              $('.thongTinDoanhNghiepTable__class th[role="columnheader"]').each(function (index) {
                if ($(this).attr('aria-label').indexOf("Activate") > 0) {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
                } else {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>"));
                }
              });
            }, 300);
          },
          onScroll: function (e) {
            this.offsetTop = window.pageYOffset || document.documentElement.scrollTop
            // console.log("offsetTop=========", this.offsetTop)
          },
          onScrollTop: function (e) {
            window.scrollBy(0, -99999)
          },
          newTabOrNewWindown: function () {
            var vm = this;
            console.log("===============run newTabOrNewWindown============");
            console.log("=============stateWindow==========", stateWindowParam)
            if (stateWindowParam === "stateWindow") {

              if (dossierIdParam) {
                var urlDetailDossier = '/o/rest/v2/dossiers/' + dossierIdParam;

                axios.get(urlDetailDossier, config).then(function (response) {
                  var detailDossier = response.data;
                  vm.detailModel = detailDossier;

                  var url = "/o/rest/v2/dossiertemplates/" + detailDossier.dossierTemplateNo;
                  var urlFiles = "/o/rest/v2/dossiers/" + dossierIdParam + "/files";

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
            console.log("item status", item);
            var stateFilterCOP = ['PROCESSING_26', 'PROCESSING_27', 'PROCESSING_29', 'waiting_6', 'PROCESSING_30']
            if (stateFilterCOP.includes(item['idSub']) || stateFilterCOP.includes(item['id'])) {
              vm.stateActionCOP = true
            } else {
              vm.stateActionCOP = false
            }

            if (item.id === 'special') {
              vm.detailPage = false;
              vm.detailRegistPage = false;
              if (item.idSub === 'special') {
                vm.stageFilterView = "quan_ly_pxx";
                vm.loadPhieuXX();
                // vm.loadMauPhoi();
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

            if (item.id !== 'tra_cuu') {
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
            vm.stageFilterView = 'danh_sach';
            var url = '/o/rest/v2/statistics/dossiers/todo';
            $.ajax({
              url: url,
              dataType: "json",
              type: "GET",
              headers: {
                'groupId': themeDisplay.getScopeGroupId(),
              },
              success: function (result) {
                var serializable = result;

                var indexTree = -1;
                var index = 0;
                console.log("listgroupHoSoFilterItems=======FISRT", vm.listgroupHoSoFilterItems);
                console.log("serializable=======", serializable.data);
                for (var key in serializable.data) {
                  for (var i in vm.listgroupHoSoFilterItems) {
                    if (serializable.data[key].level === 0) {

                      if (serializable.data[key].dossierStatus === 'cancelling' || serializable.data[key].dossierStatus === 'cancelled' || serializable.data[key].dossierStatus === 'processing' || serializable.data[key].dossierStatus === 'paid') {
                        serializable.data[key].items = [];

                        if (serializable.data[key].dossierStatus === vm.listgroupHoSoFilterItems[i].id) {
                          vm.listgroupHoSoFilterItems[i].count = serializable.data[key].count;
                        }
                      }

                    } else {

                      if (serializable.data[key].dossierSubStatus === vm.listgroupHoSoFilterItems[i].id) {
                        vm.listgroupHoSoFilterItems[i].count = serializable.data[key].count;
                      }
                    }
                  }

                }
                console.log("listgroupHoSoFilterItems=======LAST", vm.listgroupHoSoFilterItems);

              },
              error: function (result) {

              }
            });
          },
          _initlistgroupHoSoFilter: function (select) {
            var vm = this;
            vm.newTabOrNewWindown();
            vm.setStateOnlyFollow(emailAddress);
            vm.getLastedStateUserInfo(function () {
              vm._inidanhSachHoSoTable(false);
            });
            vm.loadingInitListGroup = true;
            vm.getDoiPhongItems()
            vm.stageFilterView = 'danh_sach';
            vm.listgroupHoSoFilterItems = [];
            var url = '/o/rest/v2/statistics/dossiers/todo';
            var url2 = '/o/rest/v2/temp/dictcollections/VR_MENU/dictitems?sort=sibling';
            axios.all([axios.get(url, config), axios.get(url2, config)]).then(axios.spread(function (responesToDo, responesDataItem) {
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
                if (serializable.data[key].level === 0) {

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
                  items: [{
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
                      return value.level === 1 && value.parentItemId == dataItemsTmp[h].dictItemId
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
                  countGroup++;
                }
              }
              if (countGroup >= 2) {
                vm.showGroupMenus = true;
              } else {
                vm.showGroupMenus = false;
              }

              var itemTmp = vm.listgroupHoSoFilterItems[0] ? vm.listgroupHoSoFilterItems[0] : {}
              var stateFilterCOP = ['PROCESSING_26', 'PROCESSING_27', 'PROCESSING_29', 'waiting_6', 'PROCESSING_30']
              if (stateFilterCOP.includes(itemTmp['idSub']) || stateFilterCOP.includes(itemTmp['id'])) {
                vm.stateActionCOP = true
              } else {
                vm.stateActionCOP = false
              }
              vm.loadingInitListGroup = false;
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
            if (item.id !== 'tra_cuu') {
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
          _initlistgroupTraCuuFilter: function () {
            var vm = this;

            vm.listgroupTraCuuFilterItems = [{
              id: 'tat_ca_hoso',
              title: 'Tất cả hồ sơ'
            },
            {
              id: 'tra_cuu_thongke',
              title: 'Tra cứu kết quả'
            },
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
          _initlistgroupQuanTriFilter: function () {
            var vm = this;

            vm.listgroupQuanTriFilterItems = [{
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
          _initlistgroupBaoCaoFilter: function () {
            var vm = this;

            vm.listgroupBaoCaoFilterItems = [{
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
            // var vm = this;
            // if (event.keyCode === 13 || vm.keywordsSearchTraCuuPhuongTien.length > 3 || vm.keywordsSearchTraCuuPhuongTien.length === 0) {
            // }

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
          _initServiceInfoFilterData: function () {
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
          _filterDanhSachHoSoOnRemove: function () {
            var vm = this;
            vm.serviceInfoFilter = [];
            vm.putStateUserInfo();
            vm._inidanhSachHoSoTable(false);
          },
          _filterDanhSachHoSoOnClear: function () {
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
          _initApplicantNameFilterData: function () {
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
          _applicantFilterDanhSachHoSoOnRemove: function () {
            var vm = this;
            vm.applicantNameFilter = [];
            vm._inidanhSachHoSoTable(false);
            vm.putStateUserInfo();
          },
          _applicantFilterDanhSachHoSoOnClear: function () {
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
          _filterDanhSachHoSoOnchange3: function () {
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
            this.thongTinDoanhNghiepTableheaders = [{
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
            var config_registrations = {
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
              $('.thongTinDoanhNghiepTable__class th[role="columnheader"]').each(function (index) {
                if ($(this).attr('aria-label').indexOf("Activate") > 0) {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
                } else {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>"));
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
          _paggingThongTinDoanhNghiepTable: function () {

            this._inithongTinDoanhNghiepTable(false);
          },
          _nextThongTinDoanhNghiepTable: function () {

          },
          _previousThongTinDoanhNghiepTable: function () {

          },
          toDetailHoSoDoanhNghiep: function (item) {

            var vm = this;
            // call DetailAPI.

            var url = '/o/rest/v2/registrations/' + item.registrationId;
            vm.detailPage = true;
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

            var url = '/o/rest/v2/registrations/' + vm.detailRegistModel.registrationId + '/forms';

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
          formatDate: function (date) {
            if (!date) {
              return null
            }
            var tmp = date.split('-');
            return tmp[1] + '/' + tmp[2] + '/' + tmp[0];
          },
          parseDate: function (date) {
            if (!date) {
              return null;
            }

            // var [month, day, year] = date.split('/');
            // return `${year}-${month.padStart(2, '0')}-${day.padStart(2, '0')}`;
            var tmp = date.split('/');
            return tmp[2] + '-' + tmp[0].padStart(2, '0') + '-' + tmp[1].padStart(2, '0');
          },
          parseDate2: function (date) {
            if (!date) return null;
            // var [year, month, day] = date.split('-');
            // return `${day}/${month}/${year}`;

            var tmp = date.split('-');
            return tmp[0] + '/' + tmp[1] + '/' + tmp[2];
          },
          addRegistrations: function () {
            var vm = this;
            vm.$dialog.confirm('Bạn có muốn thêm mới hồ sơ Doanh Nghiệp!', {
              html: true,
              loader: true,
              okText: 'Xác nhận',
              cancelText: 'Quay lại',
              animation: 'fade'
            })
              .then(function (dialog) {

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
              .catch(function (e) {
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
              .then(function (dialog) {

                // call API get file by dossierId
                var url = "/o/rest/v2/registrations/" + vm.detailRegistModel.registrationId;

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
              }).catch(function (e) {
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
            this.traCuuHoSoTableheaders = [{
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
                    queryValueArr.push('*' + ten_doanh_nghiep + '*');
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
                    queryValueArr.push('*' + ten_thuong_mai + '*');
                    queryTypeArr.push('String');
                  }

                  if (ma_kieu_loai) {

                    queryKeyArr.push('(ma_kieu_loai like ?)');
                    queryValueArr.push('*' + ma_kieu_loai + '*');
                    queryTypeArr.push('String');
                  }

                  var query = '{ "query": "' + queryKeyArr.join(" [and] ") + '", "values": " ' + queryValueArr.join("#") + '", "type": " ' + queryTypeArr.join(",") + '"}';
                  paramsBuilder.keyword = query;
                  url = "/o/rest/v2/deliverables/agency/BGTVTCDKVN/type/" + loai_chung_chi;
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
              url: url,
              type: method,
              dataType: "json",
              headers: {
                'groupId': themeDisplay.getScopeGroupId(),
              },
              data: paramsBuilder,
              success: function (result) {
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
                $('.danhSachHoSoTable__class th[role="columnheader"]').each(function (index) {
                  if ($(this).attr('aria-label').indexOf("Activate") > 0) {
                    $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
                  } else {
                    $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>"));
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
              error: function (result) {
                console.log(result);
                vm.traCuuHoSoTableItems = [];
              }
            });


            return false;
          },
          toViewDelivableFile: function (item) {
            var deliverableCode = item.deliverableCode;
            if (deliverableCode) {
              var url = "/o/rest/v2/dossiers/file/" + deliverableCode;

              var config_blob = {
                headers: {
                  'groupId': themeDisplay.getScopeGroupId(),
                },
                responseType: 'blob'
              };
              axios.get(url, config).then(function (response) {

                var result = response.data;
                var urlGetFile = "/o/rest/v2/dossiers/" + result.dossierId + "/files/" + result.referenceUid;

                axios.get(urlGetFile, config_blob).then(function (response) {
                  var url = window.URL.createObjectURL(response.data);
                  //console.log("url==========",url);
                  window.open(url, '_blank');
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
            var urlDossierId = '/o/rest/v2/dossiers/number/' + ma_ho_so;

            axios.get(urlDossierId, config).then(function (response) {
              var serializable = response.data;

              var url = '/o/rest/v2/dossiers/' + serializable.dossierId;

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
          advanced_filter_btn_click: function () {
            var vm = this;
            vm._initraCuuHoSoTable(false);
          },
          _paggingTraCuuHoSoTable: function () {

            this._initraCuuHoSoTable(false);
          },
          _nextTraCuuHoSoTable: function () {

          },
          _previousTraCuuHoSoTable: function () {

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

            this.danhSachHoSoTableheaders = [{
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
              text: 'Mã hồ sơ. Ngày gửi',
              align: 'left',
              sortable: true,
              value: 'dossierId'
            },
            {
              text: 'Số hồ sơ. Ngày tiếp nhận. Hạn xử lý',
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
            if (vm.keywordFilter != null) {
              paramsBuilder['keyword'] = vm.keywordFilter;
            } else {
              paramsBuilder['keyword'] = vm.keywordsSearchDanhSachHoSo;
            }
            var config_dossiers = {
              params: paramsBuilder,
              headers: {
                'groupId': themeDisplay.getScopeGroupId(),
              }
            };
            var url = '/o/rest/v2/dossiers/todo';

            // if (vm.follow) {
            // 	url = '/o/rest/v2/dossiers/todo';
            // } else {
            // 	url = '/o/rest/v2/dossiers';
            // }
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
              $('.danhSachHoSoTable__class th[role="columnheader"]').each(function (index) {
                if ($(this).attr('aria-label').indexOf("Activate") > 0) {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>") + ' <i aria-hidden="true" class="material-icons icon">arrow_upward</i>');
                } else {
                  $(this).html($(this).attr('aria-label').substring(0, $(this).attr('aria-label').indexOf(":")).replace(/\./g, "<br/>"));
                }
              });
              console.log(vm.danhSachHoSoTableItems);
            }).catch(function (error) {
              console.log(error);
              vm.danhSachHoSoTableItems = [];

            });
            return false;
          },
          toDetailHoSo: function (item, type) {

            var vm = this;
            vm.stepModel = null;
            // call DetailAPI.
            var url = '/o/rest/v2/dossiers/' + item.dossierId;
            if (type == 'tra_cuu') {
              url = '/o/rest/v2/dossiers/detail/' + item['referenceUid']
            }

            axios.get(url, config).then(function (response) {
              var serializable = response.data;

              vm.detailModel = serializable;
              vm.detailModel.dossierIdCTN = item.dossierIdCTN;
              vm.detailPage = true;
              vm.stateAddPhieu = 'xuat_kho'
              vm.dsGCNItems = [];
              vm.thongTinPhieu = {
                outputSheetNo: '---',
                outputSheetDate: vm.getCurrentTime() || ''
              };
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
              vm.getDangKiemVien()

            }).catch(function (error) {
              console.log(error);

            });
            return false;
          },
          _paggingDanhSachHoSo: function () {
            this._inidanhSachHoSoTable(false);
          },
          _nextDanhSachHoSo: function () {

          },
          _previousDanhSachHoSo: function () {

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

            var url = "/o/rest/v2/dossiertemplates/" + item.dossierTemplateNo;
            var urlFiles = "/o/rest/v2/dossiers/" + item.dossierId + "/files";

            axios.all([axios.get(url, config), axios.get(urlFiles, config)]).then(axios.spread(function (urlRespones, urlFilesRespones) {
              vm.dossierFiles = urlFilesRespones.data.data;

              var serializable = urlRespones.data;

              var listIn = [],
                listOut = [],
                listAll = [];

              for (var key in serializable.dossierParts) {

                var countData = 0;
                for (var keyFile in vm.dossierFiles) {

                  if (vm.dossierFiles[keyFile].dossierPartNo === serializable.dossierParts[key].partNo) {
                    countData = countData + 1;
                    serializable.dossierParts[key].referenceUid = vm.dossierFiles[keyFile].referenceUid;
                    serializable.dossierParts[key].fileEntryId = vm.dossierFiles[keyFile].fileEntryId;
                    serializable.dossierParts[key].displayName = vm.dossierFiles[keyFile].displayName;
                    // if (item && (item['dossierSubStatus'] === 'PROCESSING_60' || 
                    // 	item['dossierSubStatus'] === 'PROCESSING_69' || 
                    // 	item['dossierSubStatus'] === 'PROCESSING_72' || 
                    // 	item['dossierSubStatus'] === 'PROCESSING_57')) {
                    // 	serializable.dossierParts[key]['formData'] = vm.dossierFiles[keyFile]['formData'];
                    // }
                    serializable.dossierParts[key]['formData'] = vm.dossierFiles[keyFile]['formData'];
                    serializable.dossierParts[key].displayName = vm.dossierFiles[keyFile].displayName;

                    listAll.push(serializable.dossierParts[key]);
                  }

                }

                serializable.dossierParts[key].counter = countData;

                if (serializable.dossierParts[key].partType === 2) {
                  listOut.push(serializable.dossierParts[key]);
                } else {
                  listIn.push(serializable.dossierParts[key]);
                }

              }



              vm.listDocumentInItems = listIn;
              vm.listDocumentOutItems = listOut;
              vm.getFormDataSoatXetGCN()
              for (var i = 0; i < vm.listDocumentInItems['length']; i++) {
                vm.getHistoryDossierPart(item.dossierId, vm.listDocumentInItems[i]['partNo'], i, 'IN')
              }
              for (var j = 0; j < vm.listDocumentOutItems['length']; j++) {
                vm.getHistoryDossierPart(item.dossierId, vm.listDocumentOutItems[j]['partNo'], j, 'OUT')
              }

              vm._initCbxDocumentNewTab(listAll);
              vm.listDocumentOutItems.forEach(function (item) {
                if (item['partNo'] === 'KQ12' && item['formData']) {
                  vm.phanCongDangKiemVien = JSON.parse(item['formData']) || {}
                  console.log('vm.phanCongDangKiemVien========1', vm.phanCongDangKiemVien)
                }
                if (item['partNo'] === 'KQ13' && item['formData']) {
                  vm.phanCongDoiPhong = JSON.parse(item['formData']) || {}
                  console.log('vm.phanCongDoiPhong========1', vm.phanCongDoiPhong)
                }
              })
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
                var configBob = {
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
              console.log("vm.detailModel========", vm.detailModel);

              var url = "/group/cong-xu-ly/xu-ly-ho-so?stateWindow=stateWindow&dossierId=" + vm.detailModel.dossierId +
                "&dossierPartNo=" + item.partNo;

              vm.$dialog.confirm('Bạn muốn mở trong tab mới hay cửa sổ mới!', {
                html: true,
                loader: true,
                okText: 'Cửa sổ mới',
                cancelText: 'Tab mới',
                animation: 'fade'
              }).then(function (dialog) {
                console.log("dialog============", dialog);
                window.open(url, "_blank", "ccc");

                dialog.close();
                return false;
              }).catch(function (e) {
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
              var urlFiles = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files";

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
            var config_blob = {
              headers: {
                'groupId': themeDisplay.getScopeGroupId(),
              },
              responseType: 'blob'
            };

            var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/files/' + item.referenceUid;

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

            var url = "/o/rest/v2/dossiertemplates/" + item.dossierTemplateNo;
            var urlFiles = "/o/rest/v2/dossiers/" + item.dossierId + "/files";

            axios.all([axios.get(url, config), axios.get(urlFiles, config)]).then(axios.spread(function (urlRespones, urlFilesRespones) {
              vm.dossierFiles = urlFilesRespones.data.data;

              var serializable = urlRespones.data;

              var listIn = [],
                listOut = [],
                listAll = [];

              for (var key in serializable.dossierParts) {

                var countData = 0;
                for (var keyFile in vm.dossierFiles) {

                  if (vm.dossierFiles[keyFile].dossierPartNo === serializable.dossierParts[key].partNo) {
                    countData = countData + 1;
                    serializable.dossierParts[key].referenceUid = vm.dossierFiles[keyFile].referenceUid;
                    serializable.dossierParts[key].fileEntryId = vm.dossierFiles[keyFile].fileEntryId;
                    serializable.dossierParts[key].displayName = vm.dossierFiles[keyFile].displayName;

                    if (vm.dossierFiles[keyFile].fileSize <= 0) {

                      countData = countData - 1;

                    }

                  }

                }

                serializable.dossierParts[key].counter = countData;

                if (serializable.dossierParts[key].partType === 2) {
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
          selectDossierActionTab: function () {
            var vm = this;
            var url = "/o/rest/v2/dossierlogs/" + vm.detailModel.dossierId + "/logs";
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
          downloadFile: function (fileAttachId) {
            var vm = this;
            var url = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + fileAttachId;
            var config_blob = {
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

            this.processAssignUserIdItems = [{
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
      'popUpViewDossierFile': {
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
            var url = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid;
            vm._showFile({
              config: {
                headers: {
                  'groupId': themeDisplay.getScopeGroupId(),
                },
                responseType: 'blob'
              },
              url: url
            });

          },
          _showFile: function (options) {
            var iFrame = document.getElementById("dossierPDFView");
            var dossierPDFViewNotFound = document.getElementById("dossierPDFViewNotFound");
            axios.get(options.url, options.config).then(function (response) {
              var url = window.URL.createObjectURL(response.data);
              iFrame.className = "";
              iFrame.innerHTML = '<iframe src="' + url + '" width="100%" height="100%"> </iframe>';
              dossierPDFViewNotFound.innerHTML = '';
            }).catch(function (error) {
              console.log(error);
              dossierPDFViewNotFound.innerHTML = 'Tài liệu đính kèm không tồn tại!';

            });
            return false;
          },
          previewDossierPDFNewTab: function (item) {
            var vm = this;
            var url = "/o/rest/v2/dossiers/" + vm.detailModel.dossierId + "/files/" + item.referenceUid;

            var config_blob = {
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
            var config_blob = {
              headers: {
                'groupId': themeDisplay.getScopeGroupId(),
              },
              responseType: 'blob'
            };

            var url = '/o/rest/v2/dossiers/' + vm.detailModel.dossierId + '/files/' + data.referenceUid;

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
          _filterAdvancedServiceInfoOnchange: function (data) {
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
      "advanced_filter_startDate": {
        'id': 'advanced_filter_startDate',
        'name': 'advanced_filter_startDate',
        'type': 'date',
        'label': 'Từ ngày'
      },
      "advanced_filter_endDate": {
        'id': 'advanced_filter_endDate',
        'name': 'advanced_filter_endDate',
        'type': 'date',
        'label': 'Đến ngày'
      },
      "advanced_filter_dossierStatus": {
        'id': 'advanced_filter_dossierStatus',
        'name': 'advanced_filter_dossierStatus',
        'type': 'select',
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
          _filterAdvancedDossierStatusOnchange: function (data) {
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
          _filterAdvancedLoaiSanPhamOnchange: function (data) {
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
          _filterAdvancedNhanHieuOnchange: function (data) {
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
