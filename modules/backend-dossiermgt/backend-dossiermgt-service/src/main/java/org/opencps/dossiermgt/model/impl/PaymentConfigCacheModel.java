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

import org.opencps.dossiermgt.model.PaymentConfig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PaymentConfig in entity cache.
 *
 * @author huymq
 * @see PaymentConfig
 * @generated
 */
@ProviderType
public class PaymentConfigCacheModel implements CacheModel<PaymentConfig>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PaymentConfigCacheModel)) {
			return false;
		}

		PaymentConfigCacheModel paymentConfigCacheModel = (PaymentConfigCacheModel)obj;

		if (paymentConfigId == paymentConfigCacheModel.paymentConfigId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, paymentConfigId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", paymentConfigId=");
		sb.append(paymentConfigId);
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
		sb.append(", govAgencyCode=");
		sb.append(govAgencyCode);
		sb.append(", govAgencyName=");
		sb.append(govAgencyName);
		sb.append(", govAgencyTaxNo=");
		sb.append(govAgencyTaxNo);
		sb.append(", invoiceTemplateNo=");
		sb.append(invoiceTemplateNo);
		sb.append(", invoiceIssueNo=");
		sb.append(invoiceIssueNo);
		sb.append(", invoiceLastNo=");
		sb.append(invoiceLastNo);
		sb.append(", invoiceForm=");
		sb.append(invoiceForm);
		sb.append(", bankInfo=");
		sb.append(bankInfo);
		sb.append(", epaymentConfig=");
		sb.append(epaymentConfig);
		sb.append(", invoiceDetailForm=");
		sb.append(invoiceDetailForm);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PaymentConfig toEntityModel() {
		PaymentConfigImpl paymentConfigImpl = new PaymentConfigImpl();

		if (uuid == null) {
			paymentConfigImpl.setUuid(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setUuid(uuid);
		}

		paymentConfigImpl.setPaymentConfigId(paymentConfigId);
		paymentConfigImpl.setGroupId(groupId);
		paymentConfigImpl.setCompanyId(companyId);
		paymentConfigImpl.setUserId(userId);

		if (userName == null) {
			paymentConfigImpl.setUserName(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			paymentConfigImpl.setCreateDate(null);
		}
		else {
			paymentConfigImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			paymentConfigImpl.setModifiedDate(null);
		}
		else {
			paymentConfigImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (govAgencyCode == null) {
			paymentConfigImpl.setGovAgencyCode(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setGovAgencyCode(govAgencyCode);
		}

		if (govAgencyName == null) {
			paymentConfigImpl.setGovAgencyName(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setGovAgencyName(govAgencyName);
		}

		if (govAgencyTaxNo == null) {
			paymentConfigImpl.setGovAgencyTaxNo(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setGovAgencyTaxNo(govAgencyTaxNo);
		}

		if (invoiceTemplateNo == null) {
			paymentConfigImpl.setInvoiceTemplateNo(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setInvoiceTemplateNo(invoiceTemplateNo);
		}

		if (invoiceIssueNo == null) {
			paymentConfigImpl.setInvoiceIssueNo(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setInvoiceIssueNo(invoiceIssueNo);
		}

		if (invoiceLastNo == null) {
			paymentConfigImpl.setInvoiceLastNo(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setInvoiceLastNo(invoiceLastNo);
		}

		if (invoiceForm == null) {
			paymentConfigImpl.setInvoiceForm(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setInvoiceForm(invoiceForm);
		}

		if (bankInfo == null) {
			paymentConfigImpl.setBankInfo(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setBankInfo(bankInfo);
		}

		if (epaymentConfig == null) {
			paymentConfigImpl.setEpaymentConfig(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setEpaymentConfig(epaymentConfig);
		}

		if (invoiceDetailForm == null) {
			paymentConfigImpl.setInvoiceDetailForm(StringPool.BLANK);
		}
		else {
			paymentConfigImpl.setInvoiceDetailForm(invoiceDetailForm);
		}

		paymentConfigImpl.resetOriginalValues();

		return paymentConfigImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		paymentConfigId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		govAgencyCode = objectInput.readUTF();
		govAgencyName = objectInput.readUTF();
		govAgencyTaxNo = objectInput.readUTF();
		invoiceTemplateNo = objectInput.readUTF();
		invoiceIssueNo = objectInput.readUTF();
		invoiceLastNo = objectInput.readUTF();
		invoiceForm = objectInput.readUTF();
		bankInfo = objectInput.readUTF();
		epaymentConfig = objectInput.readUTF();
		invoiceDetailForm = objectInput.readUTF();
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

		objectOutput.writeLong(paymentConfigId);

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

		if (invoiceLastNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invoiceLastNo);
		}

		if (invoiceForm == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invoiceForm);
		}

		if (bankInfo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankInfo);
		}

		if (epaymentConfig == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(epaymentConfig);
		}

		if (invoiceDetailForm == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(invoiceDetailForm);
		}
	}

	public String uuid;
	public long paymentConfigId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String govAgencyCode;
	public String govAgencyName;
	public String govAgencyTaxNo;
	public String invoiceTemplateNo;
	public String invoiceIssueNo;
	public String invoiceLastNo;
	public String invoiceForm;
	public String bankInfo;
	public String epaymentConfig;
	public String invoiceDetailForm;
}