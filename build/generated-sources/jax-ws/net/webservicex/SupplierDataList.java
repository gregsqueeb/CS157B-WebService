
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupplierDataList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierDataList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierDatas" type="{http://www.webservicex.net/}ArrayOfSupplierData" minOccurs="0"/>
 *         &lt;element name="TotalRecords" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierDataList", propOrder = {
    "supplierDatas",
    "totalRecords"
})
public class SupplierDataList {

    @XmlElement(name = "SupplierDatas")
    protected ArrayOfSupplierData supplierDatas;
    @XmlElement(name = "TotalRecords")
    protected int totalRecords;

    /**
     * Gets the value of the supplierDatas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSupplierData }
     *     
     */
    public ArrayOfSupplierData getSupplierDatas() {
        return supplierDatas;
    }

    /**
     * Sets the value of the supplierDatas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSupplierData }
     *     
     */
    public void setSupplierDatas(ArrayOfSupplierData value) {
        this.supplierDatas = value;
    }

    /**
     * Gets the value of the totalRecords property.
     * 
     */
    public int getTotalRecords() {
        return totalRecords;
    }

    /**
     * Sets the value of the totalRecords property.
     * 
     */
    public void setTotalRecords(int value) {
        this.totalRecords = value;
    }

}
