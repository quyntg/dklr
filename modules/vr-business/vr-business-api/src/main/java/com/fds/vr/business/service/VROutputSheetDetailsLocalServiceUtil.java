/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.fds.vr.business.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for VROutputSheetDetails. This utility wraps
 * {@link com.fds.vr.business.service.impl.VROutputSheetDetailsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author LamTV
 * @see VROutputSheetDetailsLocalService
 * @see com.fds.vr.business.service.base.VROutputSheetDetailsLocalServiceBaseImpl
 * @see com.fds.vr.business.service.impl.VROutputSheetDetailsLocalServiceImpl
 * @generated
 */
@ProviderType
public class VROutputSheetDetailsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.fds.vr.business.service.impl.VROutputSheetDetailsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the vr output sheet details to the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was added
	*/
	public static com.fds.vr.business.model.VROutputSheetDetails addVROutputSheetDetails(
		com.fds.vr.business.model.VROutputSheetDetails vrOutputSheetDetails) {
		return getService().addVROutputSheetDetails(vrOutputSheetDetails);
	}

	public static com.fds.vr.business.model.VROutputSheetDetails createVROutputSheetDetails(
		com.fds.vr.business.model.VROutputSheetDetails object)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().createVROutputSheetDetails(object);
	}

	/**
	* Creates a new vr output sheet details with the primary key. Does not add the vr output sheet details to the database.
	*
	* @param id the primary key for the new vr output sheet details
	* @return the new vr output sheet details
	*/
	public static com.fds.vr.business.model.VROutputSheetDetails createVROutputSheetDetails(
		long id) {
		return getService().createVROutputSheetDetails(id);
	}

	/**
	* Deletes the vr output sheet details from the database. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was removed
	*/
	public static com.fds.vr.business.model.VROutputSheetDetails deleteVROutputSheetDetails(
		com.fds.vr.business.model.VROutputSheetDetails vrOutputSheetDetails) {
		return getService().deleteVROutputSheetDetails(vrOutputSheetDetails);
	}

	/**
	* Deletes the vr output sheet details with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details that was removed
	* @throws PortalException if a vr output sheet details with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VROutputSheetDetails deleteVROutputSheetDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteVROutputSheetDetails(id);
	}

	public static com.fds.vr.business.model.VROutputSheetDetails fetchVROutputSheetDetails(
		long id) {
		return getService().fetchVROutputSheetDetails(id);
	}

	/**
	* Returns the vr output sheet details with the primary key.
	*
	* @param id the primary key of the vr output sheet details
	* @return the vr output sheet details
	* @throws PortalException if a vr output sheet details with the primary key could not be found
	*/
	public static com.fds.vr.business.model.VROutputSheetDetails getVROutputSheetDetails(
		long id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getVROutputSheetDetails(id);
	}

	public static com.fds.vr.business.model.VROutputSheetDetails updateOutputSheetDetails(
		long id, long mtCore, java.lang.Long inputSheetId,
		java.lang.Long outputSheetId, java.lang.Long bookId,
		java.lang.Long issueVehicleCertificateId, java.lang.Long certificateId,
		java.lang.String certificateNumber, java.util.Date certificateDate,
		java.lang.String vehicleClass, java.lang.String stampType,
		java.lang.String stampShortNo, java.lang.Long serialStartNo,
		java.lang.Long serialEndNo, java.lang.Long subTotalInDocument,
		java.lang.Long subTotalQuantities, java.lang.Long unitPrice,
		java.lang.Long totalAmount, java.lang.Long totalInUse,
		java.lang.Long totalNotUsed, java.lang.Long totalLost,
		java.lang.Long totalCancelled, java.lang.Long totalReturned,
		java.lang.String remark)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateOutputSheetDetails(id, mtCore, inputSheetId,
			outputSheetId, bookId, issueVehicleCertificateId, certificateId,
			certificateNumber, certificateDate, vehicleClass, stampType,
			stampShortNo, serialStartNo, serialEndNo, subTotalInDocument,
			subTotalQuantities, unitPrice, totalAmount, totalInUse,
			totalNotUsed, totalLost, totalCancelled, totalReturned, remark);
	}

	/**
	* Updates the vr output sheet details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vrOutputSheetDetails the vr output sheet details
	* @return the vr output sheet details that was updated
	* @throws SystemException
	*/
	public static com.fds.vr.business.model.VROutputSheetDetails updateVROutputSheetDetails(
		com.fds.vr.business.model.VROutputSheetDetails vrOutputSheetDetails)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateVROutputSheetDetails(vrOutputSheetDetails);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.json.JSONArray findData(
		java.lang.String sql, java.util.List<java.lang.String> columnNames,
		java.util.List<java.lang.String> dataTypes,
		java.lang.Class<?> modelClazz, java.lang.String modelClassName,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findData(sql, columnNames, dataTypes, modelClazz,
			modelClassName, start, end);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of vr output sheet detailses.
	*
	* @return the number of vr output sheet detailses
	*/
	public static int getVROutputSheetDetailsesCount() {
		return getService().getVROutputSheetDetailsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findByInputSheetId(
		long mtCore, long inputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByInputSheetId(mtCore, inputSheetId);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findByInputSheetIdAndBookId(
		long mtCore, long inputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByInputSheetIdAndBookId(mtCore, inputSheetId, bookId);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findByInputSheetIdAndBookIdAndStampType(
		long mtCore, long inputSheetId, long bookId, java.lang.String stampType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByInputSheetIdAndBookIdAndStampType(mtCore,
			inputSheetId, bookId, stampType);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findByOutputSheetId(
		long mtCore, long outputSheetId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findByOutputSheetId(mtCore, outputSheetId);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findByOutputSheetIdAndBookId(
		long mtCore, long outputSheetId, long bookId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByOutputSheetIdAndBookId(mtCore, outputSheetId, bookId);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findByOutputSheetIdAndBookIdAndStampType(
		long mtCore, long outputSheetId, long bookId, java.lang.String stampType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByOutputSheetIdAndBookIdAndStampType(mtCore,
			outputSheetId, bookId, stampType);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findBycertificateId(
		long mtCore, long certificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycertificateId(mtCore, certificateId);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findBycertificateNumber(
		long mtCore, java.lang.String certificateNumber)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().findBycertificateNumber(mtCore, certificateNumber);
	}

	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> findByissueVehicleCertificateId(
		long mtCore, long issueVehicleCertificateId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .findByissueVehicleCertificateId(mtCore,
			issueVehicleCertificateId);
	}

	/**
	* Returns a range of all the vr output sheet detailses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.fds.vr.business.model.impl.VROutputSheetDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr output sheet detailses
	* @param end the upper bound of the range of vr output sheet detailses (not inclusive)
	* @return the range of vr output sheet detailses
	*/
	public static java.util.List<com.fds.vr.business.model.VROutputSheetDetails> getVROutputSheetDetailses(
		int start, int end) {
		return getService().getVROutputSheetDetailses(start, end);
	}

	public static long counData(java.lang.String sql)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().counData(sql);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void updateJSONArray(long outputSheetId,
		java.lang.Long corporationId, java.lang.Long outputSheetType,
		java.lang.String details, java.lang.Long isApproval)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		getService()
			.updateJSONArray(outputSheetId, corporationId, outputSheetType,
			details, isApproval);
	}

	public static VROutputSheetDetailsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VROutputSheetDetailsLocalService, VROutputSheetDetailsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(VROutputSheetDetailsLocalService.class);
}