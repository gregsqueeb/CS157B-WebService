
package uk.co.csoft.dtd.sendsms5;

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
 *         &lt;element name="AddressBookEntryList" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}AddressBookEntryList"/>
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
    "addressBookEntryList"
})
@XmlRootElement(name = "QueryAddressBookResponse")
public class QueryAddressBookResponse {

    @XmlElement(name = "AddressBookEntryList", required = true)
    protected AddressBookEntryList addressBookEntryList;

    /**
     * Gets the value of the addressBookEntryList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressBookEntryList }
     *     
     */
    public AddressBookEntryList getAddressBookEntryList() {
        return addressBookEntryList;
    }

    /**
     * Sets the value of the addressBookEntryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressBookEntryList }
     *     
     */
    public void setAddressBookEntryList(AddressBookEntryList value) {
        this.addressBookEntryList = value;
    }

}
