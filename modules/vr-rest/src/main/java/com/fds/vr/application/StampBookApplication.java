package com.fds.vr.application;

import com.fds.vr.business.action.VRInputStampbookAction;
import com.fds.vr.business.action.impl.VRInputStampbookActionImpl;
import com.fds.vr.business.model.VRInputSheet;
import com.fds.vr.business.model.VRInputStampbook;
import com.fds.vr.business.model.VRInventory;
import com.fds.vr.business.model.VRIssue;
import com.fds.vr.business.model.VROutputSheet;
import com.fds.vr.business.model.VROutputSheetDetails;
import com.fds.vr.business.model.impl.VRInputSheetModelImpl;
import com.fds.vr.business.model.impl.VRInputStampbookModelImpl;
import com.fds.vr.business.model.impl.VRIssueModelImpl;
import com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl;
import com.fds.vr.business.model.impl.VROutputSheetModelImpl;
import com.fds.vr.business.service.VRInputSheetLocalServiceUtil;
import com.fds.vr.business.service.VRInputStampbookDetailsLocalServiceUtil;
import com.fds.vr.business.service.VRInputStampbookLocalServiceUtil;
import com.fds.vr.business.service.VRInventoryLocalServiceUtil;
import com.fds.vr.business.service.VRIssueLocalServiceUtil;
import com.fds.vr.business.service.VROutputSheetDetailsLocalServiceUtil;
import com.fds.vr.business.service.VROutputSheetLocalServiceUtil;
import com.fds.vr.service.util.BusinessUtil;
import com.fds.vr.util.DateTimeUtils;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringPool;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@ApplicationPath("/vr-stamp")
@Component(immediate = true, service = Application.class)
public class StampBookApplication extends Application {
	public Set<Object> getSingletons() {

		Set<Object> singletons = new HashSet<Object>();
		singletons.add(this);

		singletons.add(_serviceContextProvider);
		singletons.add(_companyContextProvider);
		singletons.add(_localeContextProvider);
		singletons.add(_userContextProvider);

		return singletons;
	}

	@GET
	@Path("/inventory/{yearofPeriod}/{corporationId}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getInventory(@Context HttpHeaders header, @PathParam("corporationId") Long corporationId,
			@PathParam("yearofPeriod") Long yearofPeriod) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			List<VRInventory> inventory = VRInventoryLocalServiceUtil.findByYearofPeriodAndCorporationId(1,
					yearofPeriod, corporationId);

			return Response.status(200).entity(JSONFactoryUtil.looseSerialize(inventory)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Path("/inputStampbooks/inventory")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getInputStampbooks(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @QueryParam("vehicleClass") String vehicleClass,
			@QueryParam("stampType") String stampType, @QueryParam("start") int start, @QueryParam("end") int end) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			VRInputStampbookAction action = new VRInputStampbookActionImpl();
			jsObj = action.findInputStampbookInventorys(user, serviceContext, vehicleClass, stampType, start, end);

			return Response.status(200).entity(jsObj.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Path("/inputStampbooks")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getInputStampbooks(@Context HttpHeaders header, @QueryParam("start") int start,
			@QueryParam("end") int end) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			List<VRInputStampbook> inputStambooks = VRInputStampbookLocalServiceUtil.getVRInputStampbooks(start, end);
			int total = VRInputStampbookLocalServiceUtil.getVRInputStampbooksCount();
			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRInputStampbook vrInputStampbook : inputStambooks) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrInputStampbook,
							VRInputStampbookModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
				}
			}
			jsObj.put("total", total);
			jsObj.put("data", array);

			return Response.status(200).entity(jsObj.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@DELETE
	@Path("/inputStampbook/{id}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteInputStampbook(@Context HttpHeaders header, @PathParam("id") long id) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			VRInputStampbook vrInputStampbook = VRInputStampbookLocalServiceUtil.deleteInputStampbook(id);

			return Response.status(200).entity(BusinessUtil.object2Json_originColumnName(vrInputStampbook,
					VRInputStampbookModelImpl.class, StringPool.BLANK)).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Path("/inputStampbookDetails/{inputStampbookId}/startEndSequenceNo")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getInputStampbookDetails(@Context HttpHeaders header,
			@PathParam("inputStampbookId") long inputStampbookId) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Long[] startEndSequenceNo = VRInputStampbookDetailsLocalServiceUtil
					.findStartNoEndNoBySequence(inputStampbookId);

			if (startEndSequenceNo != null) {
				jsObj.put("start", startEndSequenceNo[0]);
				jsObj.put("end", startEndSequenceNo[1]);
			}

			return Response.status(200).entity(jsObj.toString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Path("/inputsheet")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getInputSheets(@Context HttpHeaders header, @QueryParam("start") int start,
			@QueryParam("end") int end) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			List<VRInputSheet> results = VRInputSheetLocalServiceUtil.getVRInputSheets(start, end);
			int total = VRInputSheetLocalServiceUtil.getVRInputSheetsCount();

			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRInputSheet vrInputSheet : results) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrInputSheet,
							VRInputSheetModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
				}
			}

			jsObj.put("total", total);
			jsObj.put("data", array);

			return Response.status(200).entity(jsObj.toString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@POST
	@Path("/inputsheet")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addInputSheet(@Context HttpHeaders header, @Context Company company,
			@FormParam("inputSheetNo") String inputSheetNo, @FormParam("inputSheetDate") String paramInputSheetDate,
			@FormParam("originalDocumentNo") String originalDocumentNo, @FormParam("corporationId") Long corporationId,
			@FormParam("inputSheetType") Long inputSheetType, @FormParam("maker") String maker,
			@FormParam("checker") String checker, @FormParam("approver") String approver,
			@FormParam("deliveryName") String deliveryName, @FormParam("inventoryName") String inventoryName,
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String paramInventoryDate,
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval,
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount,
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark,
			@FormParam("stampbooks") String stampbooks) {

		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date inputSheetDate = DateTimeUtils.stringToDate(paramInputSheetDate);
			Date inventoryDate = DateTimeUtils.stringToDate(paramInventoryDate);

			VRInputSheet inputSheet = VRInputSheetLocalServiceUtil.updateInputSheet(0l, 1l, inputSheetNo,
					inputSheetDate, originalDocumentNo, corporationId, inputSheetType, maker, checker, approver,
					deliveryName, inventoryName, inventoryPlace, inventoryDate, bookIDList, isApproval, totalQuantities,
					totalAmount, amountInWords, remark, stampbooks, company);

			List<VRInputStampbook> vrInputStampbooks = VRInputStampbookLocalServiceUtil
					.findByInputSheetId(inputSheet.getMtCore(), inputSheet.getPrimaryKey());

			jsObj.put("VRInputSheet", BusinessUtil.object2Json_originColumnName(inputSheet, VRInputSheetModelImpl.class,
					StringPool.BLANK));
			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRInputStampbook vrInputStampbook : vrInputStampbooks) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrInputStampbook,
							VRInputStampbookModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
					_log.error(e);
				}
			}
			jsObj.put("VRInputStampbook", array);

			return Response.status(200).entity(jsObj.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			String msg = e.getMessage();
			jsObj.put("msg", msg == null ? e.getClass().getName() : msg);
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@PUT
	@Path("/inputsheet/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateInputSheet(@Context HttpServletRequest request, @Context HttpHeaders header,
			@Context Company company, @Context Locale locale, @Context User user,
			@Context ServiceContext serviceContext, @PathParam("id") long inputSheetId,
			@FormParam("inputSheetNo") String inputSheetNo, @FormParam("inputSheetDate") String paramInputSheetDate,
			@FormParam("originalDocumentNo") String originalDocumentNo, @FormParam("corporationId") Long corporationId,
			@FormParam("inputSheetType") Long inputSheetType, @FormParam("maker") String maker,
			@FormParam("checker") String checker, @FormParam("approver") String approver,
			@FormParam("deliveryName") String deliveryName, @FormParam("inventoryName") String inventoryName,
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String paramInventoryDate,
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval,
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount,
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark,
			@FormParam("stampbooks") String stampbooks) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date inputSheetDate = DateTimeUtils.stringToDate(paramInputSheetDate);
			Date inventoryDate = DateTimeUtils.stringToDate(paramInventoryDate);

			VRInputSheet inputSheet = VRInputSheetLocalServiceUtil.updateInputSheet(inputSheetId, 1l, inputSheetNo,
					inputSheetDate, originalDocumentNo, corporationId, inputSheetType, maker, checker, approver,
					deliveryName, inventoryName, inventoryPlace, inventoryDate, bookIDList, isApproval, totalQuantities,
					totalAmount, amountInWords, remark, stampbooks, company);
			
			List<VRInputStampbook> vrInputStampbooks = VRInputStampbookLocalServiceUtil
					.findByInputSheetId(inputSheet.getMtCore(), inputSheet.getPrimaryKey());

			jsObj.put("VRInputSheet", BusinessUtil.object2Json_originColumnName(inputSheet, VRInputSheetModelImpl.class,
					StringPool.BLANK));
			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRInputStampbook vrInputStampbook : vrInputStampbooks) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrInputStampbook,
							VRInputStampbookModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
					_log.error(e);
				}
			}
			jsObj.put("VRInputStampbook", array);

			return Response.status(200).entity(jsObj.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			String msg = e.getMessage();
			jsObj.put("msg", msg == null ? e.getClass().getName() : msg);
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Path("/outputsheet")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getOutputSheets(@Context HttpHeaders header, @QueryParam("start") int start,
			@QueryParam("end") int end) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			List<VROutputSheet> results = VROutputSheetLocalServiceUtil.getVROutputSheets(start, end);
			int total = VROutputSheetLocalServiceUtil.getVROutputSheetsCount();

			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VROutputSheet vrOutputSheet : results) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrOutputSheet,
							VROutputSheetModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
				}
			}

			jsObj.put("total", total);
			jsObj.put("data", array);

			return Response.status(200).entity(jsObj.toString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@POST
	@Path("/outputsheet")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response addOutputSheet(@Context HttpHeaders header, @Context Company company,
			@FormParam("outputSheetNo") String outputSheetNo, @FormParam("outputSheetDate") String outputSheetDate,
			@FormParam("originalDocumentNo") String originalDocumentNo,
			@FormParam("supplierCorporationId") Long supplierCorporationId,
			@FormParam("outputSheetType") Long outputSheetType, @FormParam("maker") String maker,
			@FormParam("checker") String checker, @FormParam("approver") String approver,
			@FormParam("receiverName") String receiverName, @FormParam("receiverPlace") String receiverPlace,
			@FormParam("receiverRequest") String receiverRequest, @FormParam("inventoryName") String inventoryName,
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String inventoryDate,
			@FormParam("dossierId") Long dossierId, @FormParam("issueId") Long issueId,
			@FormParam("purchaserId") Long purchaserId,
			@FormParam("purchaserCorporationId") Long purchaserCorporationId,
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval,
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount,
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark,
			@FormParam("details") String details) {

		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date _outputSheetDate = DateTimeUtils.stringToDate(outputSheetDate);
			Date _inventoryDate = DateTimeUtils.stringToDate(inventoryDate);

			VROutputSheet outputSheet = VROutputSheetLocalServiceUtil.updateOutputSheet(0l, 1l, outputSheetNo,
					_outputSheetDate, originalDocumentNo, supplierCorporationId, outputSheetType, maker, checker,
					approver, receiverName, receiverPlace, receiverRequest, inventoryName, inventoryPlace,
					_inventoryDate, dossierId, issueId, purchaserId, purchaserCorporationId, bookIDList, isApproval,
					totalQuantities, totalAmount, amountInWords, remark, details, company);

			List<VROutputSheetDetails> vrOutputSheetDetails = VROutputSheetDetailsLocalServiceUtil
					.findByOutputSheetId(outputSheet.getMtCore(), outputSheet.getPrimaryKey());

			jsObj.put("VROutputSheet", BusinessUtil.object2Json_originColumnName(outputSheet, VROutputSheetModelImpl.class,
					StringPool.BLANK));
			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VROutputSheetDetails sheetDetails : vrOutputSheetDetails) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(sheetDetails,
							VROutputSheetDetailsModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
					_log.error(e);
				}
			}
			jsObj.put("VROutputSheetDetails", array);

			return Response.status(200).entity(jsObj.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			String msg = e.getMessage();
			jsObj.put("msg", msg == null ? e.getClass().getName() : msg);
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@PUT
	@Path("/outputsheet/{id}")
	@Consumes({ MediaType.APPLICATION_FORM_URLENCODED })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response updateOutputSheet(@Context HttpHeaders header, @Context Company company, @PathParam("id") long id,
			@FormParam("outputSheetNo") String outputSheetNo, @FormParam("outputSheetDate") String outputSheetDate,
			@FormParam("originalDocumentNo") String originalDocumentNo,
			@FormParam("supplierCorporationId") Long supplierCorporationId,
			@FormParam("outputSheetType") Long outputSheetType, @FormParam("maker") String maker,
			@FormParam("checker") String checker, @FormParam("approver") String approver,
			@FormParam("receiverName") String receiverName, @FormParam("receiverPlace") String receiverPlace,
			@FormParam("receiverRequest") String receiverRequest, @FormParam("inventoryName") String inventoryName,
			@FormParam("inventoryPlace") String inventoryPlace, @FormParam("inventoryDate") String inventoryDate,
			@FormParam("dossierId") Long dossierId, @FormParam("issueId") Long issueId,
			@FormParam("purchaserId") Long purchaserId,
			@FormParam("purchaserCorporationId") Long purchaserCorporationId,
			@FormParam("bookIDList") String bookIDList, @FormParam("isApproval") Long isApproval,
			@FormParam("totalQuantities") Long totalQuantities, @FormParam("totalAmount") Long totalAmount,
			@FormParam("amountInWords") String amountInWords, @FormParam("remark") String remark,
			@FormParam("details") String details) {

		// long groupId = GetterUtil.getLong(header.getHeaderString(Field.GROUP_ID));

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			Date _outputSheetDate = DateTimeUtils.stringToDate(outputSheetDate);
			Date _inventoryDate = DateTimeUtils.stringToDate(inventoryDate);

			VROutputSheet outputSheet = VROutputSheetLocalServiceUtil.updateOutputSheet(id, 1l, outputSheetNo,
					_outputSheetDate, originalDocumentNo, supplierCorporationId, outputSheetType, maker, checker,
					approver, receiverName, receiverPlace, receiverRequest, inventoryName, inventoryPlace,
					_inventoryDate, dossierId, issueId, purchaserId, purchaserCorporationId, bookIDList, isApproval,
					totalQuantities, totalAmount, amountInWords, remark, details, company);
			
			List<VROutputSheetDetails> vrOutputSheetDetails = VROutputSheetDetailsLocalServiceUtil
					.findByOutputSheetId(outputSheet.getMtCore(), outputSheet.getPrimaryKey());

			jsObj.put("VROutputSheet", BusinessUtil.object2Json_originColumnName(outputSheet, VROutputSheetModelImpl.class,
					StringPool.BLANK));
			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VROutputSheetDetails sheetDetails : vrOutputSheetDetails) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(sheetDetails,
							VROutputSheetDetailsModelImpl.class, StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
					_log.error(e);
				}
			}
			jsObj.put("VROutputSheetDetails", array);

			return Response.status(200).entity(jsObj.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			String msg = e.getMessage();
			jsObj.put("msg", msg == null ? e.getClass().getName() : msg);
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@DELETE
	@Path("/outputsheet/{id}/details/{outputsheetDetailId}")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response deleteOutputSheetDetails(@Context HttpHeaders header, @PathParam("id") long outputsheetId,
			@PathParam("outputsheetDetailId") long outputsheetDetailId) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			VROutputSheetDetailsLocalServiceUtil.deleteVROutputSheetDetails(outputsheetDetailId);
			jsObj.put("status", "done");

			return Response.status(200).entity(jsObj.toString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Path("/issues")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getIssues(@Context HttpHeaders header, @QueryParam("issueCorporationId") int issueCorporationId,
			@QueryParam("digitalIssueStatus") int digitalIssueStatus, @QueryParam("start") int start,
			@QueryParam("end") int end) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			List<VRIssue> results = VRIssueLocalServiceUtil.findByIC_IS(issueCorporationId, digitalIssueStatus);
			int total = results.size();
			// get issue . vehicleclass

			// if MethodOfIssue = 10 khong quan tam vr_issue_vehiclecertificate,
			// vr_vehiclerecord, TotalInDocument

			// if MethodOfIssue = 20, 30 vr_issue_vehiclecertificate.totalquantity

			// vr_issue_vehiclecertificate

			// vr_vehiclerecord

			// lay inputstampbook where totalInDocument > sum1 and vehicleClass =
			// issue.vehicleclass

			// lay inputstampbookDetails where bookId = inputstampbook.bookId
			// and inputstampbook.corporationId = workingUnitId and issuingStatus = 0 or = 1
			// startNo = min(sequenceNo) , endNo = max(sequenceNo)

			JSONArray array = JSONFactoryUtil.createJSONArray();
			for (VRIssue vrIssue : results) {
				try {
					JSONObject obj = BusinessUtil.object2Json_originColumnName(vrIssue, VRIssueModelImpl.class,
							StringPool.BLANK);
					array.put(obj);
				} catch (Exception e) {
				}
			}
			jsObj.put("total", total);
			jsObj.put("data", array);

			return Response.status(200).entity(jsObj.toJSONString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Path("/issues/{id}/stampbook")
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getOutputSheetsByIssue(@Context HttpHeaders header, @PathParam("id") long issueId,
			@PathParam("corporationId") long corporationId, @QueryParam("start") int start,
			@QueryParam("end") int end) {

		JSONObject jsObj = JSONFactoryUtil.createJSONObject();
		try {
			VRIssue issue = VRIssueLocalServiceUtil.getVRIssue(issueId);

			List<Object[]> books = VRInputStampbookDetailsLocalServiceUtil
					.findStampbookByVehicleClass(issue.getVehicleClass(), issue.getIssueCorporationId());

			JSONArray results = JSONFactoryUtil.createJSONArray();

			for (Object[] obj : books) {
				JSONObject tmp = JSONFactoryUtil.createJSONObject();

				tmp.put("bookId", GetterUtil.getLong(obj[0]));
				tmp.put("stampShortNo", GetterUtil.getString(obj[1]));
				tmp.put("start", GetterUtil.getLong(obj[2]));
				tmp.put("end", GetterUtil.getLong(obj[3]));

				results.put(tmp);
			}

			return Response.status(200).entity(results.toString()).build();
		} catch (Exception e) {
			_log.error(e);
			jsObj.put("status", "error");
			jsObj.put("msg", e.getClass().getName());
			return Response.status(500).entity(jsObj.toString()).build();
		}
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}

	@Reference
	private com.fds.vr.provider.CompanyContextProvider _companyContextProvider;

	@Reference
	private com.fds.vr.provider.LocaleContextProvider _localeContextProvider;

	@Reference
	private com.fds.vr.provider.UserContextProvider _userContextProvider;

	@Reference
	private com.fds.vr.provider.ServiceContextProvider _serviceContextProvider;

	private static final Log _log = LogFactoryUtil.getLog(StampBookApplication.class);
}
