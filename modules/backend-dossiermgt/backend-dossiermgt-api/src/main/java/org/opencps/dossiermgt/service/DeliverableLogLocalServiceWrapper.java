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

package org.opencps.dossiermgt.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DeliverableLogLocalService}.
 *
 * @author huymq
 * @see DeliverableLogLocalService
 * @generated
 */
@ProviderType
public class DeliverableLogLocalServiceWrapper
	implements DeliverableLogLocalService,
		ServiceWrapper<DeliverableLogLocalService> {
	public DeliverableLogLocalServiceWrapper(
		DeliverableLogLocalService deliverableLogLocalService) {
		_deliverableLogLocalService = deliverableLogLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _deliverableLogLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _deliverableLogLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _deliverableLogLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _deliverableLogLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLogLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLogLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of deliverable logs.
	*
	* @return the number of deliverable logs
	*/
	@Override
	public int getDeliverableLogsCount() {
		return _deliverableLogLocalService.getDeliverableLogsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _deliverableLogLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _deliverableLogLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DeliverableLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _deliverableLogLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DeliverableLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _deliverableLogLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns a range of all the deliverable logs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link org.opencps.dossiermgt.model.impl.DeliverableLogModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of deliverable logs
	* @param end the upper bound of the range of deliverable logs (not inclusive)
	* @return the range of deliverable logs
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DeliverableLog> getDeliverableLogs(
		int start, int end) {
		return _deliverableLogLocalService.getDeliverableLogs(start, end);
	}

	/**
	* Returns all the deliverable logs matching the UUID and company.
	*
	* @param uuid the UUID of the deliverable logs
	* @param companyId the primary key of the company
	* @return the matching deliverable logs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DeliverableLog> getDeliverableLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _deliverableLogLocalService.getDeliverableLogsByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of deliverable logs matching the UUID and company.
	*
	* @param uuid the UUID of the deliverable logs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of deliverable logs
	* @param end the upper bound of the range of deliverable logs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching deliverable logs, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<org.opencps.dossiermgt.model.DeliverableLog> getDeliverableLogsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<org.opencps.dossiermgt.model.DeliverableLog> orderByComparator) {
		return _deliverableLogLocalService.getDeliverableLogsByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _deliverableLogLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _deliverableLogLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the deliverable log to the database. Also notifies the appropriate model listeners.
	*
	* @param deliverableLog the deliverable log
	* @return the deliverable log that was added
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog addDeliverableLog(
		org.opencps.dossiermgt.model.DeliverableLog deliverableLog) {
		return _deliverableLogLocalService.addDeliverableLog(deliverableLog);
	}

	/**
	* Creates a new deliverable log with the primary key. Does not add the deliverable log to the database.
	*
	* @param deliverableLogId the primary key for the new deliverable log
	* @return the new deliverable log
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog createDeliverableLog(
		long deliverableLogId) {
		return _deliverableLogLocalService.createDeliverableLog(deliverableLogId);
	}

	/**
	* Deletes the deliverable log with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverableLogId the primary key of the deliverable log
	* @return the deliverable log that was removed
	* @throws PortalException if a deliverable log with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog deleteDeliverableLog(
		long deliverableLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLogLocalService.deleteDeliverableLog(deliverableLogId);
	}

	/**
	* Deletes the deliverable log from the database. Also notifies the appropriate model listeners.
	*
	* @param deliverableLog the deliverable log
	* @return the deliverable log that was removed
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog deleteDeliverableLog(
		org.opencps.dossiermgt.model.DeliverableLog deliverableLog) {
		return _deliverableLogLocalService.deleteDeliverableLog(deliverableLog);
	}

	@Override
	public org.opencps.dossiermgt.model.DeliverableLog fetchDeliverableLog(
		long deliverableLogId) {
		return _deliverableLogLocalService.fetchDeliverableLog(deliverableLogId);
	}

	/**
	* Returns the deliverable log matching the UUID and group.
	*
	* @param uuid the deliverable log's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable log, or <code>null</code> if a matching deliverable log could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog fetchDeliverableLogByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _deliverableLogLocalService.fetchDeliverableLogByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Returns the deliverable log with the primary key.
	*
	* @param deliverableLogId the primary key of the deliverable log
	* @return the deliverable log
	* @throws PortalException if a deliverable log with the primary key could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog getDeliverableLog(
		long deliverableLogId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLogLocalService.getDeliverableLog(deliverableLogId);
	}

	/**
	* Returns the deliverable log matching the UUID and group.
	*
	* @param uuid the deliverable log's UUID
	* @param groupId the primary key of the group
	* @return the matching deliverable log
	* @throws PortalException if a matching deliverable log could not be found
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog getDeliverableLogByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _deliverableLogLocalService.getDeliverableLogByUuidAndGroupId(uuid,
			groupId);
	}

	/**
	* Updates the deliverable log in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param deliverableLog the deliverable log
	* @return the deliverable log that was updated
	*/
	@Override
	public org.opencps.dossiermgt.model.DeliverableLog updateDeliverableLog(
		org.opencps.dossiermgt.model.DeliverableLog deliverableLog) {
		return _deliverableLogLocalService.updateDeliverableLog(deliverableLog);
	}

	@Override
	public DeliverableLogLocalService getWrappedService() {
		return _deliverableLogLocalService;
	}

	@Override
	public void setWrappedService(
		DeliverableLogLocalService deliverableLogLocalService) {
		_deliverableLogLocalService = deliverableLogLocalService;
	}

	private DeliverableLogLocalService _deliverableLogLocalService;
}