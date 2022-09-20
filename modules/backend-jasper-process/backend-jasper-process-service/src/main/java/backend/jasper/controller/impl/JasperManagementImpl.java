package backend.jasper.controller.impl;

import backend.jasper.controller.util.JasperManagement;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.StringPool;
import org.opencps.jasper.utils.JRReportUtil;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;

public class JasperManagementImpl implements JasperManagement {

    @Override
    public Response createReportFile(HttpServletRequest request, HttpHeaders header, Company company,
                                     Locale locale, User user, ServiceContext serviceContext,
                                     String formData, String formReport) {
        File file = FileUtil.createTempFile(JRReportUtil.DocType.PDF.toString());
        String reportFile = StringPool.BLANK;
        try {

//            JSONObject bodyJson = JSONFactoryUtil.createJSONObject(body);
//
//
//            String formData = bodyJson.getString("formData");
//
//            String formReport = bodyJson.getString("formReport");

//            _log.info("=====>body "+body);


//            String formReportDecode = new String(Base64.getMimeDecoder().decode(formReport.getBytes()), StandardCharsets.UTF_8);

            _log.info("=======>formData "+formData);
            _log.info("=======>formReport "+formReport);
            reportFile = JRReportUtil.createReportFile(formReport,
                    formData, null, file.getCanonicalPath());

            _log.info("====>reportFile "+reportFile);
        } catch (Exception e) {
            _log.error("Generate file exception........."+e);
        }
        return Response.status(200).entity(reportFile).build();
    }

    private Log _log = LogFactoryUtil.getLog(JasperManagementImpl.class);

}
