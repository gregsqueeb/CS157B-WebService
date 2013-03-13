
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recipient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recipient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendCc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendBcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendToAddressBook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendCcAddressBook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SendBccAddressBook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneMake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhoneModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MCC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MNC" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SendOptions" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}SendOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recipient", propOrder = {
    "sendTo",
    "sendCc",
    "sendBcc",
    "sendToAddressBook",
    "sendCcAddressBook",
    "sendBccAddressBook",
    "phoneMake",
    "phoneModel",
    "mcc",
    "mnc",
    "sendOptions"
})
public class Recipient {

    @XmlElementRef(name = "SendTo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendTo;
    @XmlElementRef(name = "SendCc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendCc;
    @XmlElementRef(name = "SendBcc", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendBcc;
    @XmlElementRef(name = "SendToAddressBook", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendToAddressBook;
    @XmlElementRef(name = "SendCcAddressBook", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendCcAddressBook;
    @XmlElementRef(name = "SendBccAddressBook", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sendBccAddressBook;
    @XmlElementRef(name = "PhoneMake", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneMake;
    @XmlElementRef(name = "PhoneModel", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneModel;
    @XmlElement(name = "MCC")
    protected Integer mcc;
    @XmlElement(name = "MNC")
    protected Integer mnc;
    @XmlElementRef(name = "SendOptions", type = JAXBElement.class, required = false)
    protected JAXBElement<SendOptions> sendOptions;

    /**
     * Gets the value of the sendTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendTo() {
        return sendTo;
    }

    /**
     * Sets the value of the sendTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendTo(JAXBElement<String> value) {
        this.sendTo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendCc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendCc() {
        return sendCc;
    }

    /**
     * Sets the value of the sendCc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendCc(JAXBElement<String> value) {
        this.sendCc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendBcc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendBcc() {
        return sendBcc;
    }

    /**
     * Sets the value of the sendBcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendBcc(JAXBElement<String> value) {
        this.sendBcc = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendToAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendToAddressBook() {
        return sendToAddressBook;
    }

    /**
     * Sets the value of the sendToAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendToAddressBook(JAXBElement<String> value) {
        this.sendToAddressBook = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendCcAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendCcAddressBook() {
        return sendCcAddressBook;
    }

    /**
     * Sets the value of the sendCcAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendCcAddressBook(JAXBElement<String> value) {
        this.sendCcAddressBook = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the sendBccAddressBook property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSendBccAddressBook() {
        return sendBccAddressBook;
    }

    /**
     * Sets the value of the sendBccAddressBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSendBccAddressBook(JAXBElement<String> value) {
        this.sendBccAddressBook = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneMake property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneMake() {
        return phoneMake;
    }

    /**
     * Sets the value of the phoneMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneMake(JAXBElement<String> value) {
        this.phoneMake = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the phoneModel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneModel() {
        return phoneModel;
    }

    /**
     * Sets the value of the phoneModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneModel(JAXBElement<String> value) {
        this.phoneModel = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the mcc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMCC() {
        return mcc;
    }

    /**
     * Sets the value of the mcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMCC(Integer value) {
        this.mcc = value;
    }

    /**
     * Gets the value of the mnc property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMNC() {
        return mnc;
    }

    /**
     * Sets the value of the mnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMNC(Integer value) {
        this.mnc = value;
    }

    /**
     * Gets the value of the sendOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SendOptions }{@code >}
     *     
     */
    public JAXBElement<SendOptions> getSendOptions() {
        return sendOptions;
    }

    /**
     * Sets the value of the sendOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SendOptions }{@code >}
     *     
     */
    public void setSendOptions(JAXBElement<SendOptions> value) {
        this.sendOptions = ((JAXBElement<SendOptions> ) value);
    }

}
