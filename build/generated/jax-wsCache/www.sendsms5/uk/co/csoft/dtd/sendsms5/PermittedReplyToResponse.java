
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
 *         &lt;element name="PermittedReplyTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Reserved" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}Reserved" minOccurs="0"/>
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
    "permittedReplyTo",
    "reserved"
})
@XmlRootElement(name = "PermittedReplyToResponse")
public class PermittedReplyToResponse {

    @XmlElement(name = "PermittedReplyTo", required = true)
    protected String permittedReplyTo;
    @XmlElement(name = "Reserved")
    protected Reserved reserved;

    /**
     * Gets the value of the permittedReplyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermittedReplyTo() {
        return permittedReplyTo;
    }

    /**
     * Sets the value of the permittedReplyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermittedReplyTo(String value) {
        this.permittedReplyTo = value;
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link Reserved }
     *     
     */
    public Reserved getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reserved }
     *     
     */
    public void setReserved(Reserved value) {
        this.reserved = value;
    }

}
