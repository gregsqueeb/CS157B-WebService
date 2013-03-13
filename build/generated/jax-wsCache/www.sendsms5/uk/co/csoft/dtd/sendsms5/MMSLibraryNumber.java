
package uk.co.csoft.dtd.sendsms5;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMSLibraryNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMSLibraryNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LibraryNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="TextMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMSLibraryNumber", propOrder = {
    "libraryNumber",
    "textMessage"
})
public class MMSLibraryNumber {

    @XmlElement(name = "LibraryNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger libraryNumber;
    @XmlElementRef(name = "TextMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textMessage;

    /**
     * Gets the value of the libraryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLibraryNumber() {
        return libraryNumber;
    }

    /**
     * Sets the value of the libraryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLibraryNumber(BigInteger value) {
        this.libraryNumber = value;
    }

    /**
     * Gets the value of the textMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextMessage() {
        return textMessage;
    }

    /**
     * Sets the value of the textMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextMessage(JAXBElement<String> value) {
        this.textMessage = ((JAXBElement<String> ) value);
    }

}
