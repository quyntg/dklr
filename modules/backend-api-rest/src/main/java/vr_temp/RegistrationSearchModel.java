//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.19 at 02:26:49 PM ICT 
//


package vr_temp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="keyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttdnMaDoanhNghiep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttdnMaSoThue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttdnLoaiHinh" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttdnTinhTrang" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ttdnDiaChi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "keyword",
    "owner",
    "start",
    "end",
    "sort",
    "order",
    "ttdnMaDoanhNghiep",
    "ttdnMaSoThue",
    "ttdnLoaiHinh",
    "ttdnTinhTrang",
    "ttdnDiaChi"
})
@XmlRootElement(name = "RegistrationSearchModel")
public class RegistrationSearchModel {

    protected String keyword;
    protected String owner;
    protected Integer start;
    protected Integer end;
    protected String sort;
    protected String order;
    protected String ttdnMaDoanhNghiep;
    protected String ttdnMaSoThue;
    protected String ttdnLoaiHinh;
    protected String ttdnTinhTrang;
    protected String ttdnDiaChi;

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
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyword(String value) {
        this.keyword = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEnd(Integer value) {
        this.end = value;
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
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSort(String value) {
        this.sort = value;
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
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

    /**
     * Gets the value of the ttdnMaDoanhNghiep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtdnMaDoanhNghiep() {
        return ttdnMaDoanhNghiep;
    }

    /**
     * Sets the value of the ttdnMaDoanhNghiep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtdnMaDoanhNghiep(String value) {
        this.ttdnMaDoanhNghiep = value;
    }

    /**
     * Gets the value of the ttdnMaSoThue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtdnMaSoThue() {
        return ttdnMaSoThue;
    }

    /**
     * Sets the value of the ttdnMaSoThue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtdnMaSoThue(String value) {
        this.ttdnMaSoThue = value;
    }

    /**
     * Gets the value of the ttdnLoaiHinh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtdnLoaiHinh() {
        return ttdnLoaiHinh;
    }

    /**
     * Sets the value of the ttdnLoaiHinh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtdnLoaiHinh(String value) {
        this.ttdnLoaiHinh = value;
    }

    /**
     * Gets the value of the ttdnTinhTrang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtdnTinhTrang() {
        return ttdnTinhTrang;
    }

    /**
     * Sets the value of the ttdnTinhTrang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtdnTinhTrang(String value) {
        this.ttdnTinhTrang = value;
    }

    /**
     * Gets the value of the ttdnDiaChi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtdnDiaChi() {
        return ttdnDiaChi;
    }

    /**
     * Sets the value of the ttdnDiaChi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtdnDiaChi(String value) {
        this.ttdnDiaChi = value;
    }

}
