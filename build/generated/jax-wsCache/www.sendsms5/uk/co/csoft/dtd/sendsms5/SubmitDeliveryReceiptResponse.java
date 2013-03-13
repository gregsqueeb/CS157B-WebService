
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitDeliveryReceiptResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitDeliveryReceiptResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MessageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Report" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitDeliveryReceiptResponse", propOrder = {
    "messageIdentifier",
    "report",
    "text"
})
public class SubmitDeliveryReceiptResponse {

    @XmlElement(name = "MessageIdentifier", required = true)
    protected String messageIdentifier;
    @XmlElement(name = "Report")
    protected int report;
    @XmlElementRef(name = "Text", type = JAXBElement.class, required = false)
    protected JAXBElement<String> text;

    /**
     * Gets the value of the messageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Sets the value of the messageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageIdentifier(String value) {
        this.messageIdentifier = value;
    }

    /**
     * Gets the value of the report property.
     * 
     */
    public int getReport() {
        return report;
    }

    /**
     * Sets the value of the report property.
     * 
     */
    public void setReport(int value) {
        this.report = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setText(JAXBElement<String> value) {
        this.text = ((JAXBElement<String> ) value);
    }

}
