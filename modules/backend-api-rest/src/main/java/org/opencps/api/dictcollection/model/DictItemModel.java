//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.28 at 12:30:35 AM ICT 
//


package org.opencps.api.dictcollection.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="itemCode " type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemName " type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemNameEN " type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="itemDescription " type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="level " type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sibling" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="treeIndex " type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://benchresources.in/cdm/Player}ParentItemModel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://benchresources.in/cdm/Player}DictGroupModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "createDate",
    "modifiedDate",
    "itemCode0020",
    "itemName0020",
    "itemNameEN0020",
    "itemDescription0020",
    "level0020",
    "sibling",
    "treeIndex0020",
    "parentItemModel",
    "dictGroupModel"
})
@XmlRootElement(name = "DictItemModel")
public class DictItemModel {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar createDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modifiedDate;
    @XmlElement(name = "itemCode ", required = true)
    protected String itemCode0020;
    @XmlElement(name = "itemName ", required = true)
    protected String itemName0020;
    @XmlElement(name = "itemNameEN ", required = true)
    protected String itemNameEN0020;
    @XmlElement(name = "itemDescription ", required = true)
    protected String itemDescription0020;
    @XmlElement(name = "level ")
    protected int level0020;
    protected int sibling;
    @XmlElement(name = "treeIndex ", required = true)
    protected String treeIndex0020;
    @XmlElement(name = "ParentItemModel")
    protected List<ParentItemModel> parentItemModel;
    @XmlElement(name = "DictGroupModel")
    protected List<DictGroupModel> dictGroupModel;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the itemCode0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode_0020() {
        return itemCode0020;
    }

    /**
     * Sets the value of the itemCode0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode_0020(String value) {
        this.itemCode0020 = value;
    }

    /**
     * Gets the value of the itemName0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName_0020() {
        return itemName0020;
    }

    /**
     * Sets the value of the itemName0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName_0020(String value) {
        this.itemName0020 = value;
    }

    /**
     * Gets the value of the itemNameEN0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNameEN_0020() {
        return itemNameEN0020;
    }

    /**
     * Sets the value of the itemNameEN0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNameEN_0020(String value) {
        this.itemNameEN0020 = value;
    }

    /**
     * Gets the value of the itemDescription0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription_0020() {
        return itemDescription0020;
    }

    /**
     * Sets the value of the itemDescription0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription_0020(String value) {
        this.itemDescription0020 = value;
    }

    /**
     * Gets the value of the level0020 property.
     * 
     */
    public int getLevel_0020() {
        return level0020;
    }

    /**
     * Sets the value of the level0020 property.
     * 
     */
    public void setLevel_0020(int value) {
        this.level0020 = value;
    }

    /**
     * Gets the value of the sibling property.
     * 
     */
    public int getSibling() {
        return sibling;
    }

    /**
     * Sets the value of the sibling property.
     * 
     */
    public void setSibling(int value) {
        this.sibling = value;
    }

    /**
     * Gets the value of the treeIndex0020 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeIndex_0020() {
        return treeIndex0020;
    }

    /**
     * Sets the value of the treeIndex0020 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeIndex_0020(String value) {
        this.treeIndex0020 = value;
    }

    /**
     * Gets the value of the parentItemModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parentItemModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParentItemModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParentItemModel }
     * 
     * 
     */
    public List<ParentItemModel> getParentItemModel() {
        if (parentItemModel == null) {
            parentItemModel = new ArrayList<ParentItemModel>();
        }
        return this.parentItemModel;
    }

    /**
     * Gets the value of the dictGroupModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dictGroupModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDictGroupModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DictGroupModel }
     * 
     * 
     */
    public List<DictGroupModel> getDictGroupModel() {
        if (dictGroupModel == null) {
            dictGroupModel = new ArrayList<DictGroupModel>();
        }
        return this.dictGroupModel;
    }

}
