//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.12.16 at 03:30:29 PM ICT 
//


package org.opencps.api.dossieraction.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DossierActionNextActionModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DossierActionNextActionModel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processActionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postStepCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="autoEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowAssignUser" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="assignUserId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="toUsers" type="{}DossierActionNextActiontoUser" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createFiles" type="{}DossierActionNextActioncreateFiles" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DossierActionNextActionModel", propOrder = {
    "processActionId",
    "actionCode",
    "actionName",
    "preStepCode",
    "postStepCode",
    "autoEvent",
    "preCondition",
    "allowAssignUser",
    "assignUserId",
    "toUsers",
    "createFiles",
    "createDossierNo",
    "eSignature",
    "pending",
    "configNote"
})
public class DossierActionNextActionModel {

    protected Long processActionId;
    protected String actionCode;
    protected String actionName;
    protected String preStepCode;
    protected String postStepCode;
    protected String autoEvent;
    protected String preCondition;
    protected Boolean pending;
    protected Boolean allowAssignUser;
    protected Long assignUserId;
    protected List<DossierActionNextActiontoUser> toUsers;
    protected List<DossierActionNextActioncreateFiles> createFiles;
    protected Boolean createDossierNo;
    protected Boolean eSignature;
    public String getConfigNote() {
		return configNote;
	}

	public void setConfigNote(String configNote) {
		this.configNote = configNote;
	}

	protected String configNote;
    
    /**
     * Gets the value of the pending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean getPending() {
        return pending;
    }

    /**
     * Sets the value of the pending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPending(Boolean value) {
        this.pending = value;
    }

    /**
     * Gets the value of the processActionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProcessActionId() {
        return processActionId;
    }

    /**
     * Sets the value of the processActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProcessActionId(Long value) {
        this.processActionId = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the actionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionName() {
        return actionName;
    }

    /**
     * Sets the value of the actionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionName(String value) {
        this.actionName = value;
    }

    /**
     * Gets the value of the preStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreStepCode() {
        return preStepCode;
    }

    /**
     * Sets the value of the preStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreStepCode(String value) {
        this.preStepCode = value;
    }

    /**
     * Gets the value of the postStepCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostStepCode() {
        return postStepCode;
    }

    /**
     * Sets the value of the postStepCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostStepCode(String value) {
        this.postStepCode = value;
    }

    /**
     * Gets the value of the autoEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoEvent() {
        return autoEvent;
    }

    /**
     * Sets the value of the autoEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoEvent(String value) {
        this.autoEvent = value;
    }

    /**
     * Gets the value of the preCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCondition() {
        return preCondition;
    }

    /**
     * Sets the value of the preCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCondition(String value) {
        this.preCondition = value;
    }

    /**
     * Gets the value of the allowAssignUser property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Boolean getAllowAssignUser() {
        return allowAssignUser;
    }

    /**
     * Sets the value of the allowAssignUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAllowAssignUser(Boolean value) {
        this.allowAssignUser = value;
    }

    /**
     * Gets the value of the assignUserId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Long getAssignUserId() {
        return assignUserId;
    }

    /**
     * Sets the value of the assignUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssignUserId(Long value) {
        this.assignUserId = value;
    }

    /**
     * Gets the value of the toUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DossierActionNextActiontoUser }
     * 
     * 
     */
    public List<DossierActionNextActiontoUser> getToUsers() {
        if (toUsers == null) {
            toUsers = new ArrayList<DossierActionNextActiontoUser>();
        }
        return this.toUsers;
    }

    /**
     * Gets the value of the createFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DossierActionNextActioncreateFiles }
     * 
     * 
     */
    public List<DossierActionNextActioncreateFiles> getCreateFiles() {
        if (createFiles == null) {
            createFiles = new ArrayList<DossierActionNextActioncreateFiles>();
        }
        return this.createFiles;
    }

    /**
     * Gets the value of the createDossierNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
	public Boolean getCreateDossierNo() {
		return createDossierNo;
	}

    /**
     * Sets the value of the createDossierNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
	public void setCreateDossierNo(Boolean createDossierNo) {
		this.createDossierNo = createDossierNo;
	}

    /**
     * Gets the value of the eSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
	public Boolean geteSignature() {
		return eSignature;
	}

    /**
     * Sets the value of the eSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
	public void seteSignature(Boolean eSignature) {
		this.eSignature = eSignature;
	}

}
