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

package org.opencps.dossiermgt.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import org.opencps.dossiermgt.model.PaymentFile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentFile in entity cache.
 *
 * @author huymq
 * @see PaymentFile
 * @generated
 */
@ProviderType
public class PaymentFileCacheModel implements CacheModel<PaymentFile>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentFileCacheModel)) {
			return false;
		}

		PaymentFileCacheModel paymentFileCacheModel = (PaymentFileCacheModel)obj;

		if (paymentFileId == paymentFileCacheModel.paymentFileId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, paymentFileId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(69);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", paymentFileId=");
		sb.append(paymentFileId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", referenceUid=");
		sb.append(referenceUid);
		sb.append(", govAgencyCode=");
		sb.append(govAgencyCode);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", isNew=");
		sb.append(isNew);
		sb.append(", paymentFee=");
		sb.append(paymentFee);
		sb.append(", paymentAmount=");
		sb.append(paymentAmount);
		sb.append(", paymentNote=");
		sb.append(paymentNote);
		sb.append(", epaymentProfile=");
		sb.append(epaymentProfile);
		sb.append(", bankInfo=");
		sb.append(bankInfo);
		sb.append(", paymentStatus=");
		sb.append(paymentStatus);
		sb.append(", paymentMethod=");
		sb.append(paymentMethod);
		sb.append(", confirmDatetime=");
		sb.append(confirmDatetime);
		sb.append(", confirmPayload=");
		sb.append(confirmPayload);
		sb.append(", confirmFileEntryId=");
		sb.append(confirmFileEntryId);
		sb.append(", confirmNote=");
		sb.append(confirmNote);
		sb.append(", approveDatetime=");
		sb.append(approveDatetime);
		sb.append(", accountUserName=");
		sb.append(accountUserName);
		sb.append(", govAgencyTaxNo=");
		sb.append(govAgencyTaxNo);
		sb.append(", invoiceTemplateNo=");
		sb.append(invoiceTemplateNo);
		sb.append(", invoiceIssueNo=");
		sb.append(invoiceIssueNo);
		sb.append(", invoiceNo=");
		sb.append(invoiceNo);
		sb.append(", invoiceFileEntryId=");
		sb.append(invoiceFileEntryId);
		sb.append(", invoicePayload=");
		sb.append(invoicePayload);
		sb.append(", einvoice=");
		sb.append(einvoice);
		sb.append(", paymentFormData=");
		sb.append(paymentFormData);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentFile toEntityModel() {
		PaymentFileImpl paymentFileImpl = new PaymentFileImpl();

		if (uuid == null) {
			paymentFileImpl.setUuid(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setUuid(uuid);
		}

		paymentFileImpl.setPaymentFileId(paymentFileId);
		paymentFileImpl.setGroupId(groupId);
		paymentFileImpl.setCompanyId(companyId);
		paymentFileImpl.setUserId(userId);

		if (userName == null) {
			paymentFileImpl.setUserName(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			paymentFileImpl.setCreateDate(null);
		}
		else {
			paymentFileImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			paymentFileImpl.setModifiedDate(null);
		}
		else {
			paymentFileImpl.setModifiedDate(new Date(modifiedDate));
		}

		paymentFileImpl.setDossierId(dossierId);

		if (referenceUid == null) {
			paymentFileImpl.setReferenceUid(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setReferenceUid(referenceUid);
		}

		if (govAgencyCode == null) {
			paymentFileImpl.setGovAgencyCode(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setGovAgencyCode(govAgencyCode);
		}

		if (govAgencyName == null) {
			paymentFileImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setGovAgencyName(govAgencyName);
		}

		paymentFileImpl.setIsNew(isNew);

		if (paymentFee == null) {
			paymentFileImpl.setPaymentFee(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setPaymentFee(paymentFee);
		}

		paymentFileImpl.setPaymentAmount(paymentAmount);

		if (paymentNote == null) {
			paymentFileImpl.setPaymentNote(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setPaymentNote(paymentNote);
		}

		if (epaymentProfile == null) {
			paymentFileImpl.setEpaymentProfile(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setEpaymentProfile(epaymentProfile);
		}

		if (bankInfo == null) {
			paymentFileImpl.setBankInfo(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setBankInfo(bankInfo);
		}

		paymentFileImpl.setPaymentStatus(paymentStatus);

		if (paymentMethod == null) {
			paymentFileImpl.setPaymentMethod(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setPaymentMethod(paymentMethod);
		}

		if (confirmDatetime == Long.MIN_VALUE) {
			paymentFileImpl.setConfirmDatetime(null);
		}
		else {
			paymentFileImpl.setConfirmDatetime(new Date(confirmDatetime));
		}

		if (confirmPayload == null) {
			paymentFileImpl.setConfirmPayload(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setConfirmPayload(confirmPayload);
		}

		paymentFileImpl.setConfirmFileEntryId(confirmFileEntryId);

		if (confirmNote == null) {
			paymentFileImpl.setConfirmNote(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setConfirmNote(confirmNote);
		}

		if (approveDatetime == Long.MIN_VALUE) {
			paymentFileImpl.setApproveDatetime(null);
		}
		else {
			paymentFileImpl.setApproveDatetime(new Date(approveDatetime));
		}

		if (accountUserName == null) {
			paymentFileImpl.setAccountUserName(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setAccountUserName(accountUserName);
		}

		if (govAgencyTaxNo == null) {
			paymentFileImpl.setGovAgencyTaxNo(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setGovAgencyTaxNo(govAgencyTaxNo);
		}

		if (invoiceTemplateNo == null) {
			paymentFileImpl.setInvoiceTemplateNo(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setInvoiceTemplateNo(invoiceTemplateNo);
		}

		if (invoiceIssueNo == null) {
			paymentFileImpl.setInvoiceIssueNo(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setInvoiceIssueNo(invoiceIssueNo);
		}

		if (invoiceNo == null) {
			paymentFileImpl.setInvoiceNo(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setInvoiceNo(invoiceNo);
		}

		paymentFileImpl.setInvoiceFileEntryId(invoiceFileEntryId);

		if (invoicePayload == null) {
			paymentFileImpl.setInvoicePayload(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setInvoicePayload(invoicePayload);
		}

		if (einvoice == null) {
			paymentFileImpl.setEinvoice(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setEinvoice(einvoice);
		}

		if (paymentFormData == null) {
			paymentFileImpl.setPaymentFormData(StringPool.BLANK);
		}
		else {
			paymentFileImpl.setPaymentFormData(paymentFormData);
		}

		paymentFileImpl.resetOriginalValues();

		return paymentFileImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		paymentFileId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		dossierId = objectInput.readLong();
		referenceUid = objectInput.readUTF();
		govAgencyCode = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();

		isNew = objectInput.readBoolean();
		paymentFee = objectInput.readUTF();

		paymentAmount = objectInput.readLong();
		paymentNote = objectInput.readUTF();
		epaymentProfile = objectInput.readUTF();
		bankInfo = objectInput.readUTF();

		paymentStatus = objectInput.readInt();
		paymentMethod = objectInput.readUTF();
		confirmDatetime = objectInput.readLong();
		confirmPayload = objectInput.readUTF();

		confirmFileEntryId = objectInput.readLong();
		confirmNote = objectInput.readUTF();
		approveDatetime = objectInput.readLong();
		accountUserName = objectInput.readUTF();
		govAgencyTaxNo = objectInput.readUTF();
		invoiceTemplateNo = objectInput.readUTF();
		invoiceIssueNo = objectInput.readUTF();
		invoiceNo = objectInput.readUTF();

		invoiceFileEntryId = objectInput.readLong();
		invoicePayload = objectInput.readUTF();
		einvoice = objectInput.readUTF();
		paymentFormData = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(paymentFileId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(dossierId);

		if (referenceUid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(referenceUid);
		}

		if (govAgencyCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyCode);
		}

		if (govAgencyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyName);
		}

		objectOutput.writeBoolean(isNew);

		if (paymentFee == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paymentFee);
		}

		objectOutput.writeLong(paymentAmount);

		if (paymentNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paymentNote);
		}

		if (epaymentProfile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(epaymentProfile);
		}

		if (bankInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankInfo);
		}

		objectOutput.writeInt(paymentStatus);

		if (paymentMethod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paymentMethod);
		}

		objectOutput.writeLong(confirmDatetime);

		if (confirmPayload == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(confirmPayload);
		}

		objectOutput.writeLong(confirmFileEntryId);

		if (confirmNote == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(confirmNote);
		}

		objectOutput.writeLong(approveDatetime);

		if (accountUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(accountUserName);
		}

		if (govAgencyTaxNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(govAgencyTaxNo);
		}

		if (invoiceTemplateNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invoiceTemplateNo);
		}

		if (invoiceIssueNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invoiceIssueNo);
		}

		if (invoiceNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invoiceNo);
		}

		objectOutput.writeLong(invoiceFileEntryId);

		if (invoicePayload == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invoicePayload);
		}

		if (einvoice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(einvoice);
		}

		if (paymentFormData == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(paymentFormData);
		}
	}

	public String uuid;
	public long paymentFileId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long dossierId;
	public String referenceUid;
	public String govAgencyCode;
	public String govAgencyName;
	public boolean isNew;
	public String paymentFee;
	public long paymentAmount;
	public String paymentNote;
	public String epaymentProfile;
	public String bankInfo;
	public int paymentStatus;
	public String paymentMethod;
	public long confirmDatetime;
	public String confirmPayload;
	public long confirmFileEntryId;
	public String confirmNote;
	public long approveDatetime;
	public String accountUserName;
	public String govAgencyTaxNo;
	public String invoiceTemplateNo;
	public String invoiceIssueNo;
	public String invoiceNo;
	public long invoiceFileEntryId;
	public String invoicePayload;
	public String einvoice;
	public String paymentFormData;
}