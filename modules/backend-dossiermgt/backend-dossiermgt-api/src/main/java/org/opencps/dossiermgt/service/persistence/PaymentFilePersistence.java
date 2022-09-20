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

package org.opencps.dossiermgt.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.opencps.dossiermgt.exception.NoSuchPaymentFileException;
import org.opencps.dossiermgt.model.PaymentFile;

/**
 * The persistence interface for the payment file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author huymq
 * @see org.opencps.dossiermgt.service.persistence.impl.PaymentFilePersistenceImpl
 * @see PaymentFileUtil
 * @generated
 */
@ProviderType
public interface PaymentFilePersistence extends BasePersistence<PaymentFile> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PaymentFileUtil} to access the payment file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the payment files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid(java.lang.String uuid);

	/**
	* Returns a range of all the payment files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid(java.lang.String uuid,
		int start, int end);

	/**
	* Returns an ordered range of all the payment files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns an ordered range of all the payment files where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid(java.lang.String uuid,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the first payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the last payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the last payment file in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the payment files before and after the current payment file in the ordered set where uuid = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile[] findByUuid_PrevAndNext(long paymentFileId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Removes all the payment files where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of payment files where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching payment files
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the payment file where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchPaymentFileException;

	/**
	* Returns the payment file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the payment file where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the payment file where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the payment file that was removed
	*/
	public PaymentFile removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchPaymentFileException;

	/**
	* Returns the number of payment files where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching payment files
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid_C(java.lang.String uuid,
		long companyId);

	/**
	* Returns a range of all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

	/**
	* Returns an ordered range of all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns an ordered range of all the payment files where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the first payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByUuid_C_First(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the last payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the last payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByUuid_C_Last(java.lang.String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the payment files before and after the current payment file in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile[] findByUuid_C_PrevAndNext(long paymentFileId,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Removes all the payment files where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of payment files where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching payment files
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the payment files where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching payment files
	*/
	public java.util.List<PaymentFile> findByF_DUID(long dossierId,
		java.lang.String referenceUid);

	/**
	* Returns a range of all the payment files where dossierId = &#63; and referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public java.util.List<PaymentFile> findByF_DUID(long dossierId,
		java.lang.String referenceUid, int start, int end);

	/**
	* Returns an ordered range of all the payment files where dossierId = &#63; and referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByF_DUID(long dossierId,
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns an ordered range of all the payment files where dossierId = &#63; and referenceUid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByF_DUID(long dossierId,
		java.lang.String referenceUid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first payment file in the ordered set where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByF_DUID_First(long dossierId,
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the first payment file in the ordered set where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByF_DUID_First(long dossierId,
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the last payment file in the ordered set where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByF_DUID_Last(long dossierId,
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the last payment file in the ordered set where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByF_DUID_Last(long dossierId,
		java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the payment files before and after the current payment file in the ordered set where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile[] findByF_DUID_PrevAndNext(long paymentFileId,
		long dossierId, java.lang.String referenceUid,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Removes all the payment files where dossierId = &#63; and referenceUid = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	*/
	public void removeByF_DUID(long dossierId, java.lang.String referenceUid);

	/**
	* Returns the number of payment files where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the number of matching payment files
	*/
	public int countByF_DUID(long dossierId, java.lang.String referenceUid);

	/**
	* Returns the payment file where dossierId = &#63; and referenceUid = &#63; or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByD_RUID(long dossierId,
		java.lang.String referenceUid) throws NoSuchPaymentFileException;

	/**
	* Returns the payment file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByD_RUID(long dossierId,
		java.lang.String referenceUid);

	/**
	* Returns the payment file where dossierId = &#63; and referenceUid = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByD_RUID(long dossierId,
		java.lang.String referenceUid, boolean retrieveFromCache);

	/**
	* Removes the payment file where dossierId = &#63; and referenceUid = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the payment file that was removed
	*/
	public PaymentFile removeByD_RUID(long dossierId,
		java.lang.String referenceUid) throws NoSuchPaymentFileException;

	/**
	* Returns the number of payment files where dossierId = &#63; and referenceUid = &#63;.
	*
	* @param dossierId the dossier ID
	* @param referenceUid the reference uid
	* @return the number of matching payment files
	*/
	public int countByD_RUID(long dossierId, java.lang.String referenceUid);

	/**
	* Returns all the payment files where groupId = &#63; and isNew = &#63;.
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @return the matching payment files
	*/
	public java.util.List<PaymentFile> findByISN_GID(long groupId, boolean isNew);

	/**
	* Returns a range of all the payment files where groupId = &#63; and isNew = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public java.util.List<PaymentFile> findByISN_GID(long groupId,
		boolean isNew, int start, int end);

	/**
	* Returns an ordered range of all the payment files where groupId = &#63; and isNew = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByISN_GID(long groupId,
		boolean isNew, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns an ordered range of all the payment files where groupId = &#63; and isNew = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByISN_GID(long groupId,
		boolean isNew, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first payment file in the ordered set where groupId = &#63; and isNew = &#63;.
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByISN_GID_First(long groupId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the first payment file in the ordered set where groupId = &#63; and isNew = &#63;.
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByISN_GID_First(long groupId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the last payment file in the ordered set where groupId = &#63; and isNew = &#63;.
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByISN_GID_Last(long groupId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the last payment file in the ordered set where groupId = &#63; and isNew = &#63;.
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByISN_GID_Last(long groupId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the payment files before and after the current payment file in the ordered set where groupId = &#63; and isNew = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param groupId the group ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile[] findByISN_GID_PrevAndNext(long paymentFileId,
		long groupId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Removes all the payment files where groupId = &#63; and isNew = &#63; from the database.
	*
	* @param groupId the group ID
	* @param isNew the is new
	*/
	public void removeByISN_GID(long groupId, boolean isNew);

	/**
	* Returns the number of payment files where groupId = &#63; and isNew = &#63;.
	*
	* @param groupId the group ID
	* @param isNew the is new
	* @return the number of matching payment files
	*/
	public int countByISN_GID(long groupId, boolean isNew);

	/**
	* Returns all the payment files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the matching payment files
	*/
	public java.util.List<PaymentFile> findByDossierId(long dossierId);

	/**
	* Returns a range of all the payment files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public java.util.List<PaymentFile> findByDossierId(long dossierId,
		int start, int end);

	/**
	* Returns an ordered range of all the payment files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByDossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns an ordered range of all the payment files where dossierId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByDossierId(long dossierId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first payment file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the first payment file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByDossierId_First(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the last payment file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the last payment file in the ordered set where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByDossierId_Last(long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the payment files before and after the current payment file in the ordered set where dossierId = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param dossierId the dossier ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile[] findByDossierId_PrevAndNext(long paymentFileId,
		long dossierId,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Removes all the payment files where dossierId = &#63; from the database.
	*
	* @param dossierId the dossier ID
	*/
	public void removeByDossierId(long dossierId);

	/**
	* Returns the number of payment files where dossierId = &#63;.
	*
	* @param dossierId the dossier ID
	* @return the number of matching payment files
	*/
	public int countByDossierId(long dossierId);

	/**
	* Returns all the payment files where dossierId = &#63; and isNew = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @return the matching payment files
	*/
	public java.util.List<PaymentFile> findByDID_ISN(long dossierId,
		boolean isNew);

	/**
	* Returns a range of all the payment files where dossierId = &#63; and isNew = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of matching payment files
	*/
	public java.util.List<PaymentFile> findByDID_ISN(long dossierId,
		boolean isNew, int start, int end);

	/**
	* Returns an ordered range of all the payment files where dossierId = &#63; and isNew = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByDID_ISN(long dossierId,
		boolean isNew, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns an ordered range of all the payment files where dossierId = &#63; and isNew = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching payment files
	*/
	public java.util.List<PaymentFile> findByDID_ISN(long dossierId,
		boolean isNew, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first payment file in the ordered set where dossierId = &#63; and isNew = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByDID_ISN_First(long dossierId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the first payment file in the ordered set where dossierId = &#63; and isNew = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByDID_ISN_First(long dossierId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the last payment file in the ordered set where dossierId = &#63; and isNew = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByDID_ISN_Last(long dossierId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Returns the last payment file in the ordered set where dossierId = &#63; and isNew = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByDID_ISN_Last(long dossierId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns the payment files before and after the current payment file in the ordered set where dossierId = &#63; and isNew = &#63;.
	*
	* @param paymentFileId the primary key of the current payment file
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile[] findByDID_ISN_PrevAndNext(long paymentFileId,
		long dossierId, boolean isNew,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator)
		throws NoSuchPaymentFileException;

	/**
	* Removes all the payment files where dossierId = &#63; and isNew = &#63; from the database.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	*/
	public void removeByDID_ISN(long dossierId, boolean isNew);

	/**
	* Returns the number of payment files where dossierId = &#63; and isNew = &#63;.
	*
	* @param dossierId the dossier ID
	* @param isNew the is new
	* @return the number of matching payment files
	*/
	public int countByDID_ISN(long dossierId, boolean isNew);

	/**
	* Returns the payment file where groupId = &#63; and dossierId = &#63; or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching payment file
	* @throws NoSuchPaymentFileException if a matching payment file could not be found
	*/
	public PaymentFile findByG_ID(long groupId, long dossierId)
		throws NoSuchPaymentFileException;

	/**
	* Returns the payment file where groupId = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByG_ID(long groupId, long dossierId);

	/**
	* Returns the payment file where groupId = &#63; and dossierId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching payment file, or <code>null</code> if a matching payment file could not be found
	*/
	public PaymentFile fetchByG_ID(long groupId, long dossierId,
		boolean retrieveFromCache);

	/**
	* Removes the payment file where groupId = &#63; and dossierId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the payment file that was removed
	*/
	public PaymentFile removeByG_ID(long groupId, long dossierId)
		throws NoSuchPaymentFileException;

	/**
	* Returns the number of payment files where groupId = &#63; and dossierId = &#63;.
	*
	* @param groupId the group ID
	* @param dossierId the dossier ID
	* @return the number of matching payment files
	*/
	public int countByG_ID(long groupId, long dossierId);

	/**
	* Caches the payment file in the entity cache if it is enabled.
	*
	* @param paymentFile the payment file
	*/
	public void cacheResult(PaymentFile paymentFile);

	/**
	* Caches the payment files in the entity cache if it is enabled.
	*
	* @param paymentFiles the payment files
	*/
	public void cacheResult(java.util.List<PaymentFile> paymentFiles);

	/**
	* Creates a new payment file with the primary key. Does not add the payment file to the database.
	*
	* @param paymentFileId the primary key for the new payment file
	* @return the new payment file
	*/
	public PaymentFile create(long paymentFileId);

	/**
	* Removes the payment file with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file that was removed
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile remove(long paymentFileId)
		throws NoSuchPaymentFileException;

	public PaymentFile updateImpl(PaymentFile paymentFile);

	/**
	* Returns the payment file with the primary key or throws a {@link NoSuchPaymentFileException} if it could not be found.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file
	* @throws NoSuchPaymentFileException if a payment file with the primary key could not be found
	*/
	public PaymentFile findByPrimaryKey(long paymentFileId)
		throws NoSuchPaymentFileException;

	/**
	* Returns the payment file with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param paymentFileId the primary key of the payment file
	* @return the payment file, or <code>null</code> if a payment file with the primary key could not be found
	*/
	public PaymentFile fetchByPrimaryKey(long paymentFileId);

	@Override
	public java.util.Map<java.io.Serializable, PaymentFile> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the payment files.
	*
	* @return the payment files
	*/
	public java.util.List<PaymentFile> findAll();

	/**
	* Returns a range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @return the range of payment files
	*/
	public java.util.List<PaymentFile> findAll(int start, int end);

	/**
	* Returns an ordered range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of payment files
	*/
	public java.util.List<PaymentFile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator);

	/**
	* Returns an ordered range of all the payment files.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PaymentFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of payment files
	* @param end the upper bound of the range of payment files (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of payment files
	*/
	public java.util.List<PaymentFile> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PaymentFile> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the payment files from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of payment files.
	*
	* @return the number of payment files
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}