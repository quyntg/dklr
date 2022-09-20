package backend.jasper.rest.application;

import backend.jasper.controller.impl.JasperManagementImpl;
import backend.jasper.rest.context.provider.CompanyContextProvider;
import backend.jasper.rest.context.provider.LocaleContextProvider;
import backend.jasper.rest.context.provider.ServiceContextProvider;
import backend.jasper.rest.context.provider.UserContextProvider;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/v3")
@Component(immediate = true, property={"jaxrs.application=true"}, service = Application.class)
public class JasperAPIRestApplication extends Application {

    public static final Log _log = LogFactoryUtil.getLog(JasperAPIRestApplication.class);

    public Set<Object> getSingletons() {
        Set<Object> singletons = new HashSet<Object>();

        // add service provider
        singletons.add(new JasperManagementImpl());

        // add service provider
        singletons.add(_serviceContextProvider);
        singletons.add(_companyContextProvider);
        singletons.add(_localeContextProvider);
        singletons.add(_userContextProvider);
        return singletons;

    }

    @GET
    @Path("/test")
    public String working() {
        return "ping!";
    }

    @Reference
    private CompanyContextProvider _companyContextProvider;

    @Reference
    private LocaleContextProvider _localeContextProvider;

    @Reference
    private UserContextProvider _userContextProvider;

    @Reference
    private ServiceContextProvider _serviceContextProvider;
}
