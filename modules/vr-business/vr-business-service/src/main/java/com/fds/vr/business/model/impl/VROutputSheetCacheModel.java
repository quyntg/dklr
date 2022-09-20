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

package com.fds.vr.business.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.fds.vr.business.model.VROutputSheet;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing VROutputSheet in entity cache.
 *
 * @author LamTV
 * @see VROutputSheet
 * @generated
 */
@ProviderType
public class VROutputSheetCacheModel implements CacheModel<VROutputSheet>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VROutputSheetCacheModel)) {
			return false;
		}

		VROutputSheetCacheModel vrOutputSheetCacheModel = (VROutputSheetCacheModel)obj;

		if (id == vrOutputSheetCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(57);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", outputSheetNo=");
		sb.append(outputSheetNo);
		sb.append(", outputSheetDate=");
		sb.append(outputSheetDate);
		sb.append(", originalDocumentNo=");
		sb.append(originalDocumentNo);
		sb.append(", supplierCorporationId=");
		sb.append(supplierCorporationId);
		sb.append(", outputSheetType=");
		sb.append(outputSheetType);
		sb.append(", maker=");
		sb.append(maker);
		sb.append(", checker=");
		sb.append(checker);
		sb.append(", approver=");
		sb.append(approver);
		sb.append(", receiverName=");
		sb.append(receiverName);
		sb.append(", receiverPlace=");
		sb.append(receiverPlace);
		sb.append(", receiverRequest=");
		sb.append(receiverRequest);
		sb.append(", inventoryName=");
		sb.append(inventoryName);
		sb.append(", inventoryPlace=");
		sb.append(inventoryPlace);
		sb.append(", inventoryDate=");
		sb.append(inventoryDate);
		sb.append(", dossierId=");
		sb.append(dossierId);
		sb.append(", issueId=");
		sb.append(issueId);
		sb.append(", purchaserId=");
		sb.append(purchaserId);
		sb.append(", purchaserCorporationId=");
		sb.append(purchaserCorporationId);
		sb.append(", bookIDList=");
		sb.append(bookIDList);
		sb.append(", isApproval=");
		sb.append(isApproval);
		sb.append(", totalQuantities=");
		sb.append(totalQuantities);
		sb.append(", totalAmount=");
		sb.append(totalAmount);
		sb.append(", amountInWords=");
		sb.append(amountInWords);
		sb.append(", remark=");
		sb.append(remark);
		sb.append(", modifyDate=");
		sb.append(modifyDate);
		sb.append(", syncDate=");
		sb.append(syncDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public VROutputSheet toEntityModel() {
		VROutputSheetImpl vrOutputSheetImpl = new VROutputSheetImpl();

		vrOutputSheetImpl.setId(id);
		vrOutputSheetImpl.setMtCore(mtCore);

		if (outputSheetNo == null) {
			vrOutputSheetImpl.setOutputSheetNo(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setOutputSheetNo(outputSheetNo);
		}

		if (outputSheetDate == Long.MIN_VALUE) {
			vrOutputSheetImpl.setOutputSheetDate(null);
		}
		else {
			vrOutputSheetImpl.setOutputSheetDate(new Date(outputSheetDate));
		}

		if (originalDocumentNo == null) {
			vrOutputSheetImpl.setOriginalDocumentNo(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setOriginalDocumentNo(originalDocumentNo);
		}

		vrOutputSheetImpl.setSupplierCorporationId(supplierCorporationId);
		vrOutputSheetImpl.setOutputSheetType(outputSheetType);

		if (maker == null) {
			vrOutputSheetImpl.setMaker(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setMaker(maker);
		}

		if (checker == null) {
			vrOutputSheetImpl.setChecker(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setChecker(checker);
		}

		if (approver == null) {
			vrOutputSheetImpl.setApprover(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setApprover(approver);
		}

		if (receiverName == null) {
			vrOutputSheetImpl.setReceiverName(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setReceiverName(receiverName);
		}

		if (receiverPlace == null) {
			vrOutputSheetImpl.setReceiverPlace(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setReceiverPlace(receiverPlace);
		}

		if (receiverRequest == null) {
			vrOutputSheetImpl.setReceiverRequest(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setReceiverRequest(receiverRequest);
		}

		if (inventoryName == null) {
			vrOutputSheetImpl.setInventoryName(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setInventoryName(inventoryName);
		}

		if (inventoryPlace == null) {
			vrOutputSheetImpl.setInventoryPlace(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setInventoryPlace(inventoryPlace);
		}

		if (inventoryDate == Long.MIN_VALUE) {
			vrOutputSheetImpl.setInventoryDate(null);
		}
		else {
			vrOutputSheetImpl.setInventoryDate(new Date(inventoryDate));
		}

		vrOutputSheetImpl.setDossierId(dossierId);
		vrOutputSheetImpl.setIssueId(issueId);
		vrOutputSheetImpl.setPurchaserId(purchaserId);
		vrOutputSheetImpl.setPurchaserCorporationId(purchaserCorporationId);

		if (bookIDList == null) {
			vrOutputSheetImpl.setBookIDList(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setBookIDList(bookIDList);
		}

		vrOutputSheetImpl.setIsApproval(isApproval);
		vrOutputSheetImpl.setTotalQuantities(totalQuantities);
		vrOutputSheetImpl.setTotalAmount(totalAmount);

		if (amountInWords == null) {
			vrOutputSheetImpl.setAmountInWords(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setAmountInWords(amountInWords);
		}

		if (remark == null) {
			vrOutputSheetImpl.setRemark(StringPool.BLANK);
		}
		else {
			vrOutputSheetImpl.setRemark(remark);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrOutputSheetImpl.setModifyDate(null);
		}
		else {
			vrOutputSheetImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrOutputSheetImpl.setSyncDate(null);
		}
		else {
			vrOutputSheetImpl.setSyncDate(new Date(syncDate));
		}

		vrOutputSheetImpl.resetOriginalValues();

		return vrOutputSheetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		outputSheetNo = objectInput.readUTF();
		outputSheetDate = objectInput.readLong();
		originalDocumentNo = objectInput.readUTF();

		supplierCorporationId = objectInput.readLong();

		outputSheetType = objectInput.readLong();
		maker = objectInput.readUTF();
		checker = objectInput.readUTF();
		approver = objectInput.readUTF();
		receiverName = objectInput.readUTF();
		receiverPlace = objectInput.readUTF();
		receiverRequest = objectInput.readUTF();
		inventoryName = objectInput.readUTF();
		inventoryPlace = objectInput.readUTF();
		inventoryDate = objectInput.readLong();

		dossierId = objectInput.readLong();

		issueId = objectInput.readLong();

		purchaserId = objectInput.readLong();

		purchaserCorporationId = objectInput.readLong();
		bookIDList = objectInput.readUTF();

		isApproval = objectInput.readLong();

		totalQuantities = objectInput.readLong();

		totalAmount = objectInput.readLong();
		amountInWords = objectInput.readUTF();
		remark = objectInput.readUTF();
		modifyDate = objectInput.readLong();
		syncDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(mtCore);

		if (outputSheetNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(outputSheetNo);
		}

		objectOutput.writeLong(outputSheetDate);

		if (originalDocumentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(originalDocumentNo);
		}

		objectOutput.writeLong(supplierCorporationId);

		objectOutput.writeLong(outputSheetType);

		if (maker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maker);
		}

		if (checker == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(checker);
		}

		if (approver == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(approver);
		}

		if (receiverName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverName);
		}

		if (receiverPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverPlace);
		}

		if (receiverRequest == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverRequest);
		}

		if (inventoryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inventoryName);
		}

		if (inventoryPlace == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inventoryPlace);
		}

		objectOutput.writeLong(inventoryDate);

		objectOutput.writeLong(dossierId);

		objectOutput.writeLong(issueId);

		objectOutput.writeLong(purchaserId);

		objectOutput.writeLong(purchaserCorporationId);

		if (bookIDList == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bookIDList);
		}

		objectOutput.writeLong(isApproval);

		objectOutput.writeLong(totalQuantities);

		objectOutput.writeLong(totalAmount);

		if (amountInWords == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(amountInWords);
		}

		if (remark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(remark);
		}

		objectOutput.writeLong(modifyDate);
		objectOutput.writeLong(syncDate);
	}

	public long id;
	public long mtCore;
	public String outputSheetNo;
	public long outputSheetDate;
	public String originalDocumentNo;
	public long supplierCorporationId;
	public long outputSheetType;
	public String maker;
	public String checker;
	public String approver;
	public String receiverName;
	public String receiverPlace;
	public String receiverRequest;
	public String inventoryName;
	public String inventoryPlace;
	public long inventoryDate;
	public long dossierId;
	public long issueId;
	public long purchaserId;
	public long purchaserCorporationId;
	public String bookIDList;
	public long isApproval;
	public long totalQuantities;
	public long totalAmount;
	public String amountInWords;
	public String remark;
	public long modifyDate;
	public long syncDate;
}