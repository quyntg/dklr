//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.11 at 06:53:24 PM ICT 
//


package org.opencps.api.paymentfile.model;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.liferay.portal.kernel.util.StringPool;


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
 *         &lt;element name="service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}String" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "service",
    "agency",
    "keyword",
    "isnew",
    "status",
    "start",
    "end",
    "sort",
    "order"
})
@XmlRootElement(name = "ServiceInfoSearchModel")
public class PaymentFileSearchModel {
	@QueryParam(value = "service")
    private String service;
	@DefaultValue(StringPool.BLANK) @QueryParam(value = "agency")
    private String agency;
	@QueryParam(value = "keyword")
	private String keyword;
	@QueryParam(value = "status")
    private String status;
	@QueryParam(value = "isnew")
    private String isnew;
	@QueryParam(value = "start")
	private int start;
	@QueryParam(value = "end")
	private int end;
	@DefaultValue("modifiedDate") @QueryParam("sort")
	private String sort;
	@QueryParam(value = "order")
	private String order;
	
	/**
     * Gets the value of the isnew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsNew() {
        return isnew;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param isnew
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsNew(String isnew) {
        this.isnew = isnew;
    }

    /**
     * Gets the value of the keyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * Sets the value of the keyword property.
     * 
     * @param keyword
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
		return service;
	}

    /**
     * Sets the value of the service property.
     * 
     * @param service
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setService(String service) {
		this.service = service;
	}

    /**
     * Gets the value of the agency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getAgency() {
		return agency;
	}

    /**
     * Sets the value of the agency property.
     * 
     * @param agency
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setAgency(String agency) {
		this.agency = agency;
	}

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getStatus() {
		return status;
	}

    /**
     * Sets the value of the status property.
     * 
     * @param status
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param start
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param end
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setEnd(int end) {
        this.end = end;
    }

    /**
     * Gets the value of the sort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSort() {
        return sort;
    }

    /**
     * Sets the value of the sort property.
     * 
     * @param sort
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param order
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }
}
