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

package com.fds.vr.business.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.exception.NoSuchVRIssueEquipmentCertificateException;
import com.fds.vr.business.model.VRIssueEquipmentCertificate;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the vr issue equipment certificate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LamTV
 * @see com.fds.vr.business.service.persistence.impl.VRIssueEquipmentCertificatePersistenceImpl
 * @see VRIssueEquipmentCertificateUtil
 * @generated
 */
@ProviderType
public interface VRIssueEquipmentCertificatePersistence extends BasePersistence<VRIssueEquipmentCertificate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VRIssueEquipmentCertificateUtil} to access the vr issue equipment certificate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId);

	/**
	* Returns a range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByIssueVehicleCertificateId(
		long issueVehicleCertificateId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByIssueVehicleCertificateId_First(
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByIssueVehicleCertificateId_First(
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByIssueVehicleCertificateId_Last(
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByIssueVehicleCertificateId_Last(
		long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where issueVehicleCertificateId = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate[] findByIssueVehicleCertificateId_PrevAndNext(
		long id, long issueVehicleCertificateId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Removes all the vr issue equipment certificates where issueVehicleCertificateId = &#63; from the database.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	*/
	public void removeByIssueVehicleCertificateId(
		long issueVehicleCertificateId);

	/**
	* Returns the number of vr issue equipment certificates where issueVehicleCertificateId = &#63;.
	*
	* @param issueVehicleCertificateId the issue vehicle certificate ID
	* @return the number of matching vr issue equipment certificates
	*/
	public int countByIssueVehicleCertificateId(long issueVehicleCertificateId);

	/**
	* Returns all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo);

	/**
	* Returns a range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo, int start, int end);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByvehicleCertificateRecordNo_First(
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the first vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByvehicleCertificateRecordNo_First(
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the last vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByvehicleCertificateRecordNo_Last(
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the last vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByvehicleCertificateRecordNo_Last(
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where vehicleCertificateRecordNo = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate[] findByvehicleCertificateRecordNo_PrevAndNext(
		long id, java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Removes all the vr issue equipment certificates where vehicleCertificateRecordNo = &#63; from the database.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	*/
	public void removeByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo);

	/**
	* Returns the number of vr issue equipment certificates where vehicleCertificateRecordNo = &#63;.
	*
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the number of matching vr issue equipment certificates
	*/
	public int countByvehicleCertificateRecordNo(
		java.lang.String vehicleCertificateRecordNo);

	/**
	* Returns all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo);

	/**
	* Returns a range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo, int start, int end);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByApplicantNo_CertificateRecordNo_First(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByApplicantNo_CertificateRecordNo_First(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByApplicantNo_CertificateRecordNo_Last(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByApplicantNo_CertificateRecordNo_Last(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate[] findByApplicantNo_CertificateRecordNo_PrevAndNext(
		long id, java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Removes all the vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63; from the database.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	*/
	public void removeByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo);

	/**
	* Returns the number of vr issue equipment certificates where applicantNo = &#63; and vehicleCertificateRecordNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param vehicleCertificateRecordNo the vehicle certificate record no
	* @return the number of matching vr issue equipment certificates
	*/
	public int countByApplicantNo_CertificateRecordNo(
		java.lang.String applicantNo,
		java.lang.String vehicleCertificateRecordNo);

	/**
	* Returns all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo);

	/**
	* Returns a range of all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo, int start, int end);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where applicantNo = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param applicantNo the applicant no
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByApplicantNo(
		java.lang.String applicantNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByApplicantNo_First(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the first vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByApplicantNo_First(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByApplicantNo_Last(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the last vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByApplicantNo_Last(
		java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where applicantNo = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param applicantNo the applicant no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate[] findByApplicantNo_PrevAndNext(
		long id, java.lang.String applicantNo,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Removes all the vr issue equipment certificates where applicantNo = &#63; from the database.
	*
	* @param applicantNo the applicant no
	*/
	public void removeByApplicantNo(java.lang.String applicantNo);

	/**
	* Returns the number of vr issue equipment certificates where applicantNo = &#63;.
	*
	* @param applicantNo the applicant no
	* @return the number of matching vr issue equipment certificates
	*/
	public int countByApplicantNo(java.lang.String applicantNo);

	/**
	* Returns all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore);

	/**
	* Returns a range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findBydossierID_MtCore(
		long dossierId, long mtCore, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findBydossierID_MtCore_First(
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the first vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchBydossierID_MtCore_First(
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the last vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findBydossierID_MtCore_Last(
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the last vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchBydossierID_MtCore_Last(
		long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where dossierId = &#63; and mtCore = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate[] findBydossierID_MtCore_PrevAndNext(
		long id, long dossierId, long mtCore,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Removes all the vr issue equipment certificates where dossierId = &#63; and mtCore = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	*/
	public void removeBydossierID_MtCore(long dossierId, long mtCore);

	/**
	* Returns the number of vr issue equipment certificates where dossierId = &#63; and mtCore = &#63;.
	*
	* @param dossierId the dossier ID
	* @param mtCore the mt core
	* @return the number of matching vr issue equipment certificates
	*/
	public int countBydossierID_MtCore(long dossierId, long mtCore);

	/**
	* Returns all the vr issue equipment certificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByissueId(
		long issueId);

	/**
	* Returns a range of all the vr issue equipment certificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByissueId(
		long issueId, int start, int end);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByissueId(
		long issueId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue equipment certificates where issueId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param issueId the issue ID
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findByissueId(
		long issueId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the first vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByissueId_First(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate findByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the last vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching vr issue equipment certificate, or <code>null</code> if a matching vr issue equipment certificate could not be found
	*/
	public VRIssueEquipmentCertificate fetchByissueId_Last(long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns the vr issue equipment certificates before and after the current vr issue equipment certificate in the ordered set where issueId = &#63;.
	*
	* @param id the primary key of the current vr issue equipment certificate
	* @param issueId the issue ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate[] findByissueId_PrevAndNext(long id,
		long issueId,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Removes all the vr issue equipment certificates where issueId = &#63; from the database.
	*
	* @param issueId the issue ID
	*/
	public void removeByissueId(long issueId);

	/**
	* Returns the number of vr issue equipment certificates where issueId = &#63;.
	*
	* @param issueId the issue ID
	* @return the number of matching vr issue equipment certificates
	*/
	public int countByissueId(long issueId);

	/**
	* Caches the vr issue equipment certificate in the entity cache if it is enabled.
	*
	* @param vrIssueEquipmentCertificate the vr issue equipment certificate
	*/
	public void cacheResult(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate);

	/**
	* Caches the vr issue equipment certificates in the entity cache if it is enabled.
	*
	* @param vrIssueEquipmentCertificates the vr issue equipment certificates
	*/
	public void cacheResult(
		java.util.List<VRIssueEquipmentCertificate> vrIssueEquipmentCertificates);

	/**
	* Creates a new vr issue equipment certificate with the primary key. Does not add the vr issue equipment certificate to the database.
	*
	* @param id the primary key for the new vr issue equipment certificate
	* @return the new vr issue equipment certificate
	*/
	public VRIssueEquipmentCertificate create(long id);

	/**
	* Removes the vr issue equipment certificate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the vr issue equipment certificate
	* @return the vr issue equipment certificate that was removed
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate remove(long id)
		throws NoSuchVRIssueEquipmentCertificateException;

	public VRIssueEquipmentCertificate updateImpl(
		VRIssueEquipmentCertificate vrIssueEquipmentCertificate);

	/**
	* Returns the vr issue equipment certificate with the primary key or throws a {@link NoSuchVRIssueEquipmentCertificateException} if it could not be found.
	*
	* @param id the primary key of the vr issue equipment certificate
	* @return the vr issue equipment certificate
	* @throws NoSuchVRIssueEquipmentCertificateException if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate findByPrimaryKey(long id)
		throws NoSuchVRIssueEquipmentCertificateException;

	/**
	* Returns the vr issue equipment certificate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the vr issue equipment certificate
	* @return the vr issue equipment certificate, or <code>null</code> if a vr issue equipment certificate with the primary key could not be found
	*/
	public VRIssueEquipmentCertificate fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, VRIssueEquipmentCertificate> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the vr issue equipment certificates.
	*
	* @return the vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findAll();

	/**
	* Returns a range of all the vr issue equipment certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @return the range of vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the vr issue equipment certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator);

	/**
	* Returns an ordered range of all the vr issue equipment certificates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link VRIssueEquipmentCertificateModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of vr issue equipment certificates
	* @param end the upper bound of the range of vr issue equipment certificates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of vr issue equipment certificates
	*/
	public java.util.List<VRIssueEquipmentCertificate> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<VRIssueEquipmentCertificate> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the vr issue equipment certificates from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of vr issue equipment certificates.
	*
	* @return the number of vr issue equipment certificates
	*/
	public int countAll();
}