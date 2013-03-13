
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Recipient" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}Recipient" minOccurs="0"/>
 *         &lt;element name="Message" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}Message" minOccurs="0"/>
 *         &lt;element name="ReplyTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "username",
    "pin",
    "recipient",
    "message",
    "replyTo",
    "messageIdentifier",
    "reserved"
})
@XmlRootElement(name = "SubmitMessage")
public class SubmitMessage {

    @XmlElementRef(name = "Username", type = JAXBElement.class, required = false)
    protected JAXBElement<String> username;
    @XmlElementRef(name = "PIN", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pin;
    @XmlElementRef(name = "Recipient", type = JAXBElement.class, required = false)
    protected JAXBElement<Recipient> recipient;
    @XmlElementRef(name = "Message", type = JAXBElement.class, required = false)
    protected JAXBElement<Message> message;
    @XmlElementRef(name = "ReplyTo", type = JAXBElement.class, required = false)
    protected JAXBElement<String> replyTo;
    @XmlElementRef(name = "MessageIdentifier", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageIdentifier;
    @XmlElementRef(name = "Reserved", type = JAXBElement.class, required = false)
    protected JAXBElement<Reserved> reserved;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsername(JAXBElement<String> value) {
        this.username = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPIN(JAXBElement<String> value) {
        this.pin = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Recipient }{@code >}
     *     
     */
    public JAXBElement<Recipient> getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Recipient }{@code >}
     *     
     */
    public void setRecipient(JAXBElement<Recipient> value) {
        this.recipient = ((JAXBElement<Recipient> ) value);
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Message }{@code >}
     *     
     */
    public JAXBElement<Message> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Message }{@code >}
     *     
     */
    public void setMessage(JAXBElement<Message> value) {
        this.message = ((JAXBElement<Message> ) value);
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReplyTo(JAXBElement<String> value) {
        this.replyTo = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the messageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * Sets the value of the messageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageIdentifier(JAXBElement<String> value) {
        this.messageIdentifier = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the reserved property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Reserved }{@code >}
     *     
     */
    public JAXBElement<Reserved> getReserved() {
        return reserved;
    }

    /**
     * Sets the value of the reserved property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Reserved }{@code >}
     *     
     */
    public void setReserved(JAXBElement<Reserved> value) {
        this.reserved = ((JAXBElement<Reserved> ) value);
    }

}
