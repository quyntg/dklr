package backend.jasper.controller.util;


import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Locale;

public interface JasperManagement {
	
	@POST
	@Path("/createReportFile")
	@Consumes({MediaType.MULTIPART_FORM_DATA })
	@Produces({MediaType.APPLICATION_JSON})
	public Response createReportFile(@Context HttpServletRequest request, @Context HttpHeaders header,
		            @Context Company company, @Context Locale locale, @Context User user,
				    @Context ServiceContext serviceContext, @Multipart("formData") String formData,
									 @Multipart("formReport") String formReport);

}
