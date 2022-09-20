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

import com.fds.vr.business.model.VRInputSheet;

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
 * The cache model class for representing VRInputSheet in entity cache.
 *
 * @author LamTV
 * @see VRInputSheet
 * @generated
 */
@ProviderType
public class VRInputSheetCacheModel implements CacheModel<VRInputSheet>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VRInputSheetCacheModel)) {
			return false;
		}

		VRInputSheetCacheModel vrInputSheetCacheModel = (VRInputSheetCacheModel)obj;

		if (id == vrInputSheetCacheModel.id) {
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
		StringBundler sb = new StringBundler(45);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mtCore=");
		sb.append(mtCore);
		sb.append(", inputSheetNo=");
		sb.append(inputSheetNo);
		sb.append(", inputSheetDate=");
		sb.append(inputSheetDate);
		sb.append(", originalDocumentNo=");
		sb.append(originalDocumentNo);
		sb.append(", corporationId=");
		sb.append(corporationId);
		sb.append(", inputSheetType=");
		sb.append(inputSheetType);
		sb.append(", maker=");
		sb.append(maker);
		sb.append(", checker=");
		sb.append(checker);
		sb.append(", approver=");
		sb.append(approver);
		sb.append(", deliveryName=");
		sb.append(deliveryName);
		sb.append(", inventoryName=");
		sb.append(inventoryName);
		sb.append(", inventoryPlace=");
		sb.append(inventoryPlace);
		sb.append(", inventoryDate=");
		sb.append(inventoryDate);
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
	public VRInputSheet toEntityModel() {
		VRInputSheetImpl vrInputSheetImpl = new VRInputSheetImpl();

		vrInputSheetImpl.setId(id);
		vrInputSheetImpl.setMtCore(mtCore);

		if (inputSheetNo == null) {
			vrInputSheetImpl.setInputSheetNo(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setInputSheetNo(inputSheetNo);
		}

		if (inputSheetDate == Long.MIN_VALUE) {
			vrInputSheetImpl.setInputSheetDate(null);
		}
		else {
			vrInputSheetImpl.setInputSheetDate(new Date(inputSheetDate));
		}

		if (originalDocumentNo == null) {
			vrInputSheetImpl.setOriginalDocumentNo(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setOriginalDocumentNo(originalDocumentNo);
		}

		vrInputSheetImpl.setCorporationId(corporationId);
		vrInputSheetImpl.setInputSheetType(inputSheetType);

		if (maker == null) {
			vrInputSheetImpl.setMaker(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setMaker(maker);
		}

		if (checker == null) {
			vrInputSheetImpl.setChecker(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setChecker(checker);
		}

		if (approver == null) {
			vrInputSheetImpl.setApprover(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setApprover(approver);
		}

		if (deliveryName == null) {
			vrInputSheetImpl.setDeliveryName(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setDeliveryName(deliveryName);
		}

		if (inventoryName == null) {
			vrInputSheetImpl.setInventoryName(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setInventoryName(inventoryName);
		}

		if (inventoryPlace == null) {
			vrInputSheetImpl.setInventoryPlace(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setInventoryPlace(inventoryPlace);
		}

		if (inventoryDate == Long.MIN_VALUE) {
			vrInputSheetImpl.setInventoryDate(null);
		}
		else {
			vrInputSheetImpl.setInventoryDate(new Date(inventoryDate));
		}

		if (bookIDList == null) {
			vrInputSheetImpl.setBookIDList(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setBookIDList(bookIDList);
		}

		vrInputSheetImpl.setIsApproval(isApproval);
		vrInputSheetImpl.setTotalQuantities(totalQuantities);
		vrInputSheetImpl.setTotalAmount(totalAmount);

		if (amountInWords == null) {
			vrInputSheetImpl.setAmountInWords(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setAmountInWords(amountInWords);
		}

		if (remark == null) {
			vrInputSheetImpl.setRemark(StringPool.BLANK);
		}
		else {
			vrInputSheetImpl.setRemark(remark);
		}

		if (modifyDate == Long.MIN_VALUE) {
			vrInputSheetImpl.setModifyDate(null);
		}
		else {
			vrInputSheetImpl.setModifyDate(new Date(modifyDate));
		}

		if (syncDate == Long.MIN_VALUE) {
			vrInputSheetImpl.setSyncDate(null);
		}
		else {
			vrInputSheetImpl.setSyncDate(new Date(syncDate));
		}

		vrInputSheetImpl.resetOriginalValues();

		return vrInputSheetImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mtCore = objectInput.readLong();
		inputSheetNo = objectInput.readUTF();
		inputSheetDate = objectInput.readLong();
		originalDocumentNo = objectInput.readUTF();

		corporationId = objectInput.readLong();

		inputSheetType = objectInput.readLong();
		maker = objectInput.readUTF();
		checker = objectInput.readUTF();
		approver = objectInput.readUTF();
		deliveryName = objectInput.readUTF();
		inventoryName = objectInput.readUTF();
		inventoryPlace = objectInput.readUTF();
		inventoryDate = objectInput.readLong();
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

		if (inputSheetNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(inputSheetNo);
		}

		objectOutput.writeLong(inputSheetDate);

		if (originalDocumentNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(originalDocumentNo);
		}

		objectOutput.writeLong(corporationId);

		objectOutput.writeLong(inputSheetType);

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

		if (deliveryName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(deliveryName);
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
	public String inputSheetNo;
	public long inputSheetDate;
	public String originalDocumentNo;
	public long corporationId;
	public long inputSheetType;
	public String maker;
	public String checker;
	public String approver;
	public String deliveryName;
	public String inventoryName;
	public String inventoryPlace;
	public long inventoryDate;
	public String bookIDList;
	public long isApproval;
	public long totalQuantities;
	public long totalAmount;
	public String amountInWords;
	public String remark;
	public long modifyDate;
	public long syncDate;
}