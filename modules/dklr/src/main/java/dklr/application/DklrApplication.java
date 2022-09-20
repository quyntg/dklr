package dklr.application;

import com.fds.vr.business.action.VRApplicantProfileAction;
import com.fds.vr.business.action.VRCOPReportRepositoryAction;
import com.fds.vr.business.action.VRHistoryProfileAction;
import com.fds.vr.business.action.VRIssueAction;
import com.fds.vr.business.action.VRProductionPlantAction;
import com.fds.vr.business.action.VRTrackchangesAction;
import com.fds.vr.business.action.VRVehicleTypeCertificateAction;
import com.fds.vr.business.action.impl.VRApplicantProfileActionImpl;
import com.fds.vr.business.action.impl.VRCOPReportRepositoryActionImpl;
import com.fds.vr.business.action.impl.VRHistoryProfileActionImpl;
import com.fds.vr.business.action.impl.VRIssueActionImpl;
import com.fds.vr.business.action.impl.VRProductionPlantActionImpl;
import com.fds.vr.business.action.impl.VRTrackchangesActionImpl;
import com.fds.vr.business.action.impl.VRVehicleTypeCertificateActionImpl;
import com.fds.vr.business.model.VRApplicantProfile;
import com.fds.vr.business.model.VRCOPReportRepository;
import com.fds.vr.business.model.VRES;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.model.VRProductionPlant;
import com.fds.vr.business.model.VRVehicleTypeCertificate;
import com.fds.vr.business.model.impl.VRApplicantProfileModelImpl;
import com.fds.vr.business.model.impl.VRProductionPlantModelImpl;
import com.fds.vr.business.service.VRApplicantProfileLocalServiceUtil;
import com.fds.vr.business.service.VRCOPReportRepositoryLocalServiceUtil;
import com.fds.vr.business.service.VRIssueLocalServiceUtil;
import com.fds.vr.business.service.VRVehicleTypeCertificateLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.service.util.FileUploadUtils;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.opencps.auth.api.BackendAuth;
import org.opencps.auth.api.BackendAuthImpl;
import org.opencps.auth.api.exception.UnauthenticationException;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import dklr.context.provider.CompanyContextProvider;
import dklr.context.provider.LocaleContextProvider;
import dklr.context.provider.ServiceContextProvider;
import dklr.context.provider.UserContextProvider;

/**
 * @author BinhTH
 */
@Component(immediate = true, property = { "jaxrs.application=true" }, service = Application.class)
public class DklrApplication extends Application {

	public static final String CLASS_NAME = VRES.class.getName();
	public static final Log _log = LogFactoryUtil.getLog(DklrApplication.class);

	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<Object>();

		// add service provider
		singletons.add(_serviceContextProvider);
		singletons.add(_companyContextProvider);
		singletons.add(_localeContextProvider);
		singletons.add(_userContextProvider);

		return singletons;
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "ping!";
	}

	@POST
	@Path("/_search")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public String getData(@Context HttpServletRequest request, @Context HttpHeaders header, @Context Company company,
			@Context Locale locale, @Context User user, @Context ServiceContext serviceContext, String body) {

		JSONObject result = JSONFactoryUtil.createJSONObject();
		result.put("total", 0);
		result.put("data", JSONFactoryUtil.createJSONArray());

		try {

			JSONObject bodyRoot = JSONFactoryUtil.createJSONObject(body);
			// String indice = bodyRoot.getString("indice");
			JSONObject queryObject = bodyRoot.getJSONObject("query");

			result = ElasticQueryWrapUtil.POST_search(queryObject.toJSONString(), CLASS_NAME, company.getCompanyId());
			// System.out.println("DklrApplication.bodyObject()" + result);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return result.toJSONString();
	};

	@POST
	@Path("/es")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public String putMapping(@Context HttpServletRequest request, @Context HttpHeaders header, @Context Company company,
			@Context Locale locale, @Context User user, @Context ServiceContext serviceContext, String body) {

		JSONObject result = JSONFactoryUtil.createJSONObject();

		try {

			JSONObject bodyRoot = JSONFactoryUtil.createJSONObject(body);
			String method = bodyRoot.getString("method");
			String bodyQuery = bodyRoot.has("body")
					? JSONFactoryUtil.createJSONObject(bodyRoot.getString("body")).toJSONString()
					: null;
			String urlQuery = bodyRoot.getString("url");

			result = ElasticQueryWrapUtil.queryES(urlQuery, method, bodyQuery);

		} catch (Exception e) {

			_log.error(e);
		}

		return result.toJSONString();
	};

	@POST
	@Path("/indexing/applicant")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response indexingApplicantProfile(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext) {
		try {
			List<VRApplicantProfile> vrApplicantProfiles = VRApplicantProfileLocalServiceUtil
					.getVRApplicantProfiles(QueryUtil.ALL_POS, QueryUtil.ALL_POS);

			if (vrApplicantProfiles != null && !vrApplicantProfiles.isEmpty()) {
				vrApplicantProfiles.parallelStream().forEach(vrApplicantProfile -> {
					VRApplicantProfileAction action = new VRApplicantProfileActionImpl();
					action.indexing(vrApplicantProfile, company);
				});
			}

			return Response.status(200).entity("done").build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity("Indexing failed!").build();
		}
	}

	@POST
	@Path("/indexing/vehicletypecertificate")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response indexingVehicleType(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @DefaultValue("-1") @QueryParam("start") int start,
			@DefaultValue("-1") @QueryParam("end") int end) {
		try {
			List<VRVehicleTypeCertificate> vrVehicleTypeCertificates = VRVehicleTypeCertificateLocalServiceUtil
					.getVRVehicleTypeCertificates(start, end);
			if (vrVehicleTypeCertificates != null && !vrVehicleTypeCertificates.isEmpty()) {
				vrVehicleTypeCertificates.parallelStream().forEach(vrVehicleTypeCertificate -> {
					VRVehicleTypeCertificateAction action = new VRVehicleTypeCertificateActionImpl();
					action.indexing(vrVehicleTypeCertificate, company);
				});
			}
			return Response.status(200).entity("done").build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity("Indexing failed").build();
		}
	}

	@POST
	@Path("/indexing/cop")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response indexingCOP(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext) {
		try {
			List<VRCOPReportRepository> vrcopReportRepositories = VRCOPReportRepositoryLocalServiceUtil
					.getVRCOPReportRepositories(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			if (vrcopReportRepositories != null && !vrcopReportRepositories.isEmpty()) {
				vrcopReportRepositories.parallelStream().forEach(vrcopReportRepository -> {
					VRCOPReportRepositoryAction action = new VRCOPReportRepositoryActionImpl();
					action.indexing(vrcopReportRepository, company);
				});
			}
			return Response.status(200).entity("done").build();
		} catch (Exception e) {
			_log.error(e);
			return Response.status(500).entity("Indexing failed!").build();
		}
	}

	// Nen convert JSON o Java, khong nen convert JSON o alpaca de khong bi bat dong
	// bo code voi Alpaca
	@POST
	@Path("/post")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response processData(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, String body) throws UnauthenticationException {

		JSONObject result = JSONFactoryUtil.createJSONObject();
		JSONObject status = JSONFactoryUtil.createJSONObject();
		status.put("code", 500);
		status.put("msg", "error");

		BackendAuth auth = new BackendAuthImpl();
		if (!auth.isAuth(serviceContext)) {
			throw new UnauthenticationException();
		}

		JSONObject data = JSONFactoryUtil.createJSONObject();
		try {

			JSONObject bodyRoot = JSONFactoryUtil.createJSONObject(body);
			String indice = bodyRoot.getString("indice");
			String postStatus = "draft";
			postStatus = bodyRoot.getString("postStatus");
			JSONObject bodyObject = bodyRoot.getJSONObject("body");
			JSONArray keys = bodyObject.names();
			JSONObject valueObject = JSONFactoryUtil.createJSONObject();
			JSONObject esData = JSONFactoryUtil.createJSONObject();
			esData.put(Field.MODIFIED_DATE + "_es", new Date().getTime());
			switch (indice) {
			case "vr_COPReportRepository":
				JSONObject objReportRepository = null;
				JSONArray arrayEmployee = null;
				JSONArray arrayEqipment = null;
				JSONArray arrayProdEqipment = null;
				JSONArray arrayProductType = null;
				JSONArray arrayReportAttach = null;
				for (int i = 0; i < keys.length(); ++i) {
					String key = keys.getString(i);
					if (key.toLowerCase().equalsIgnoreCase("vr_copreportrepository")) {
						objReportRepository = bodyObject.getJSONObject(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_ProductionPlantEmployee")) {
						arrayEmployee = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_ProductionPlantEquipment")) {
						arrayEqipment = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_ProductionPlantProdEquipment")) {
						arrayProdEqipment = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_ProductType")) {
						arrayProductType = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_COPReport_attach")) {
						arrayReportAttach = bodyObject.getJSONArray(key);
					}
				}
				JSONObject resp_COP = VRCOPReportRepositoryLocalServiceUtil.adminProcessData(objReportRepository,
						arrayEmployee, arrayEqipment, arrayProdEqipment, arrayProductType, arrayReportAttach);
				VRCOPReportRepository vrcopReportRepository = VRCOPReportRepositoryLocalServiceUtil
						.findByDossierId_MTCore(objReportRepository.getLong("dossierId"),
								objReportRepository.getLong("mtCore"));
				if (vrcopReportRepository != null) {
					VRCOPReportRepositoryAction vrcopReportRepositoryAction = new VRCOPReportRepositoryActionImpl();
					vrcopReportRepositoryAction.indexing(vrcopReportRepository, company);
					status.put("code", 200);
					status.put("msg", "success");
					result.put("status", status);
					result.put("data", resp_COP);
					return Response.status(200).entity(result.toJSONString()).build();
				}

			case "vr_ApplicantProfile":
				JSONObject respData_Applicatnt = JSONFactoryUtil.createJSONObject();
				for (int i = 0; i < keys.length(); ++i) {
					String key = keys.getString(i);
					if (key.toLowerCase().equalsIgnoreCase("vr_ApplicantProfile")) {
						valueObject = bodyObject.getJSONObject(key);
						esData.put("applicantCode", valueObject.getString("applicantCode"));
						// esData.put("registrationId", valueObject.getString("registrationId"));
						esData.put("type_es", key.toLowerCase());
						VRApplicantProfileAction vrApplicantProfileAction = new VRApplicantProfileActionImpl();
						VRApplicantProfile vrApplicantProfile = vrApplicantProfileAction.adminProcessData(valueObject,
								valueObject.getLong("mtCore"), valueObject.getString("applicantCode"), postStatus,
								serviceContext);
						esData.put("id", String.valueOf(vrApplicantProfile.getId()));
						JSONObject jVRApplicantProfile = BusinessUtil.object2Json_originValue(vrApplicantProfile,
								VRApplicantProfileModelImpl.class, StringPool.BLANK);
						respData_Applicatnt.put("vr_ApplicantProfile", jVRApplicantProfile);
						if (postStatus.equalsIgnoreCase("draft")) {
							status.put("code", 200);
							status.put("msg", "success");
							result.put("status", status);
							result.put("data", respData_Applicatnt);
							return Response.status(200).entity(result.toJSONString()).build();
						}
					}
				}

				if (postStatus.equalsIgnoreCase("draft")) {
					for (int i = 0; i < keys.length(); ++i) {
						String key = keys.getString(i);
						if (key.toLowerCase().equalsIgnoreCase("vr_ProductionPlant")) {
							JSONArray arrayData = bodyObject.getJSONArray(key);
							if (arrayData.length() > 0) {
								JSONObject obj = arrayData.getJSONObject(0);
								if (obj.length() > 0) {
									VRProductionPlantAction vrProductionPlantAction = new VRProductionPlantActionImpl();
									VRProductionPlant vrProductionPlant = vrProductionPlantAction.adminProcessData(obj,
											obj.getLong("mtCore"), obj.getLong("applicantProfileId"),
											obj.getString("productionPlantCode"));

									JSONObject jVRProductionPlant = BusinessUtil.object2Json_originValue(
											vrProductionPlant, VRProductionPlantModelImpl.class, StringPool.BLANK);
									respData_Applicatnt.put("vr_ProductionPlant", jVRProductionPlant);
									result.put("status", status);
									result.put("data", respData_Applicatnt);
									return Response.status(200).entity(result.toJSONString()).build();
								}
							}
						}
					}
				} else if (postStatus.equalsIgnoreCase("send")) {
					for (int i = 0; i < keys.length(); ++i) {
						String key = keys.getString(i);
						if (key.toLowerCase().equalsIgnoreCase("vr_ProductionPlant")) {
							JSONArray arrayData = bodyObject.getJSONArray(key);
							if (arrayData.length() > 0) {
								VRProductionPlantAction vrProductionPlantAction = new VRProductionPlantActionImpl();
								List<VRProductionPlant> vrProductionPlants = vrProductionPlantAction
										.adminProcessData(arrayData);
								if (vrProductionPlants != null && !vrProductionPlants.isEmpty()) {
									JSONArray array = JSONFactoryUtil.createJSONArray();
									for (VRProductionPlant vrProductionPlant : vrProductionPlants) {
										JSONObject obj = BusinessUtil.object2Json_originValue(vrProductionPlant,
												VRProductionPlantModelImpl.class, StringPool.BLANK);
										array.put(obj);
									}
									if (array.length() > 0) {
										respData_Applicatnt.put("vr_ProductionPlant", array);
									}
								}
							}
						}
					}
					VRTrackchangesAction vrTrackchangesAction = new VRTrackchangesActionImpl();
					FileEntry fileEntry = FileUploadUtils.uploadFileJSON(respData_Applicatnt, serviceContext);

					JSONObject jsonTrackchanges = vrTrackchangesAction.findByApplicantCode(
							respData_Applicatnt.getJSONObject("vr_ApplicantProfile").getString("applicantCode"),
							serviceContext);
					if (jsonTrackchanges != null && jsonTrackchanges.length() > 0) {
						vrTrackchangesAction.updateVRTrackchanges(jsonTrackchanges.getLong("id"),
								respData_Applicatnt.getJSONObject("vr_ApplicantProfile").getString("applicantCode"),
								null, 0L, null, null, "PROFILE", null,
								fileEntry != null ? fileEntry.getFileEntryId() : 0, null, serviceContext);
					} else {
						vrTrackchangesAction.updateVRTrackchanges(0L,
								respData_Applicatnt.getJSONObject("vr_ApplicantProfile").getString("applicantCode"),
								null, 0L, null, null, "PROFILE", null,
								fileEntry != null ? fileEntry.getFileEntryId() : 0, null, serviceContext);
					}
					VRHistoryProfileAction vrHistoryProfileAction = new VRHistoryProfileActionImpl();
					vrHistoryProfileAction.updateVRHistoryProfile(0L,
							respData_Applicatnt.getJSONObject("vr_ApplicantProfile").getString("applicantCode"), null,
							0L, null, null, "PROFILE", null, fileEntry != null ? fileEntry.getFileEntryId() : 0, 0,
							null, serviceContext);
				}
				esData.put("data", respData_Applicatnt);
				esData.put(Field.COMPANY_ID, String.valueOf(company.getCompanyId()));
				int deletex_Applicant = ElasticQueryWrapUtil.DELETE("applicantCode",
						valueObject.getString("applicantCode"), company.getCompanyId(), indice.toLowerCase());
				if (deletex_Applicant == 0) {
					ElasticQueryWrapUtil.POST(esData.toJSONString(), CLASS_NAME, company.getCompanyId());
				}
				status.put("code", 200);
				status.put("msg", "success");
				result.put("status", status);
				result.put("data", respData_Applicatnt);
				return Response.status(200).entity(result.toJSONString()).build();

			case "vr_VehicleTypeCertificate":
				JSONObject respData_Vehicle = JSONFactoryUtil.createJSONObject();
				JSONObject jVRVehicleTypeCertificate = null;
				JSONArray arrayVRVehicleSpecification = null;
				JSONArray arrayVRInspectionStandard = null;
				JSONArray arrayLKXCG = null;
				JSONArray arrayXCG = null;
				JSONArray arrayLKXMY = null;
				JSONArray arrayXMY = null;
				JSONArray arrayXCH = null;
				JSONArray arrayXCN = null;
				JSONArray arrayXDD = null;
				for (int i = 0; i < keys.length(); ++i) {
					String key = keys.getString(i);
					if (key.toLowerCase().equalsIgnoreCase("vr_VehicleTypeCertificate")) {
						jVRVehicleTypeCertificate = bodyObject.getJSONObject(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_VehicleSpecification")) {
						arrayVRVehicleSpecification = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_InspectionStandard")) {
						arrayVRInspectionStandard = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_technicalspec_lkxcg")) {
						arrayLKXCG = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_technicalspec_xcg")) {
						arrayXCG = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_technicalspec_lkxmy")) {
						arrayLKXMY = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_technicalspec_xmy")) {
						arrayXMY = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_technicalspec_xchbb")) {
						arrayXCH = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_technicalspec_xcnbb")) {
						arrayXCN = bodyObject.getJSONArray(key);
					} else if (key.toLowerCase().equalsIgnoreCase("vr_technicalspec_xdd")) {
						arrayXDD = bodyObject.getJSONArray(key);
					}
				}
				respData_Vehicle = VRVehicleTypeCertificateLocalServiceUtil.adminProcessData(jVRVehicleTypeCertificate,
						arrayVRVehicleSpecification, arrayVRInspectionStandard, arrayLKXCG, arrayXCG, arrayLKXMY,
						arrayXMY, arrayXCH, arrayXCN, arrayXDD);
				VRVehicleTypeCertificate vrVehicleTypeCertificate = VRVehicleTypeCertificateLocalServiceUtil
						.findByDossierId_MtCore(jVRVehicleTypeCertificate.getLong("dossierId"),
								jVRVehicleTypeCertificate.getLong("mtCore"));
				if (vrVehicleTypeCertificate != null) {
					VRVehicleTypeCertificateAction vrVehicleTypeCertificateAction = new VRVehicleTypeCertificateActionImpl();
					vrVehicleTypeCertificateAction.indexing(vrVehicleTypeCertificate, company);
					status.put("code", 200);
					status.put("msg", "success");
					result.put("status", status);
					result.put("data", respData_Vehicle);
				}
				return Response.status(200).entity(result.toJSONString()).build();

			case "vr_Issue":
				JSONObject respData_Issue = JSONFactoryUtil.createJSONObject();
				VRIssue vrIssue = null;
				for (int i = 0; i < keys.length(); ++i) {
					String key = keys.getString(i);
					if (key.toLowerCase().equalsIgnoreCase("vr_Issue")) {
						valueObject = bodyObject.getJSONObject(key);
						esData.put("dossierId", String.valueOf(valueObject.getLong("dossierId")));
						esData.put("dossierIdCTN", valueObject.getString("dossierIdCTN"));
						esData.put("dossierNo", valueObject.getString("dossierNo"));
						esData.put("type_es", key.toLowerCase());
						respData_Issue = VRIssueLocalServiceUtil.adminProcess(valueObject,
								valueObject.getLong("dossierId"), valueObject.getLong("mtCore"));
						vrIssue = VRIssueLocalServiceUtil.findByMT_DID(valueObject.getLong("mtCore"),
								valueObject.getLong("dossierId"));
						break;
					}
				}
				if (vrIssue != null) {
					VRIssueAction action = new VRIssueActionImpl();
					action.indexing(vrIssue, company);
					status.put("code", 200);
					status.put("msg", "success");
					result.put("status", status);
					result.put("data", respData_Issue);
				}
				return Response.status(200).entity(result.toJSONString()).build();

			default:
				break;
			}
		} catch (Exception e) {
			_log.error(e);
			status.put("code", e.getMessage());
			status.put("msg", "error");
		}
		result.put("status", status);
		result.put("data", data);
		return Response.status(200).entity(result.toJSONString()).build();
	};

	@Reference
	private CompanyContextProvider _companyContextProvider;

	@Reference
	private LocaleContextProvider _localeContextProvider;

	@Reference
	private UserContextProvider _userContextProvider;

	@Reference
	private ServiceContextProvider _serviceContextProvider;

}