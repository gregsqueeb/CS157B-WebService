
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="GetSupplierByCityResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SupplierDataLists" type="{http://www.webservicex.net/}SupplierDataList"/>
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
    "getSupplierByCityResult",
    "supplierDataLists"
})
@XmlRootElement(name = "GetSupplierByCityResponse")
public class GetSupplierByCityResponse {

    @XmlElement(name = "GetSupplierByCityResult")
    protected boolean getSupplierByCityResult;
    @XmlElement(name = "SupplierDataLists", required = true)
    protected SupplierDataList supplierDataLists;

    /**
     * Gets the value of the getSupplierByCityResult property.
     * 
     */
    public boolean isGetSupplierByCityResult() {
        return getSupplierByCityResult;
    }

    /**
     * Sets the value of the getSupplierByCityResult property.
     * 
     */
    public void setGetSupplierByCityResult(boolean value) {
        this.getSupplierByCityResult = value;
    }

    /**
     * Gets the value of the supplierDataLists property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierDataList }
     *     
     */
    public SupplierDataList getSupplierDataLists() {
        return supplierDataLists;
    }

    /**
     * Sets the value of the supplierDataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDataList }
     *     
     */
    public void setSupplierDataLists(SupplierDataList value) {
        this.supplierDataLists = value;
    }

}
