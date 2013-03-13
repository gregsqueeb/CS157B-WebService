
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MOMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MOMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReplyTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Timestamp1" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Message" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}Message"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MOMessage", propOrder = {
    "sendTo",
    "replyTo",
    "timestamp1",
    "message"
})
public class MOMessage {

    @XmlElement(name = "SendTo", required = true)
    protected String sendTo;
    @XmlElement(name = "ReplyTo", required = true)
    protected String replyTo;
    @XmlElement(name = "Timestamp1", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp1;
    @XmlElement(name = "Message", required = true)
    protected Message message;

    /**
     * Gets the value of the sendTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTo() {
        return sendTo;
    }

    /**
     * Sets the value of the sendTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTo(String value) {
        this.sendTo = value;
    }

    /**
     * Gets the value of the replyTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets the value of the replyTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * Gets the value of the timestamp1 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp1() {
        return timestamp1;
    }

    /**
     * Sets the value of the timestamp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp1(XMLGregorianCalendar value) {
        this.timestamp1 = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link Message }
     *     
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message }
     *     
     */
    public void setMessage(Message value) {
        this.message = value;
    }

}
