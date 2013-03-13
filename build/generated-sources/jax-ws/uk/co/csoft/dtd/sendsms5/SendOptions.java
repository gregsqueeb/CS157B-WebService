
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SendOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SendTimeAbsolute" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SendTimeDelay" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="DeliveryOption" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}DeliveryOption" minOccurs="0"/>
 *         &lt;element name="DisableRepurposing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisableWalledGardenRule" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOptions", propOrder = {
    "sendTimeAbsolute",
    "sendTimeDelay",
    "deliveryOption",
    "disableRepurposing",
    "disableWalledGardenRule"
})
public class SendOptions {

    @XmlElementRef(name = "SendTimeAbsolute", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> sendTimeAbsolute;
    @XmlElementRef(name = "SendTimeDelay", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sendTimeDelay;
    @XmlElement(name = "DeliveryOption")
    protected DeliveryOption deliveryOption;
    @XmlElement(name = "DisableRepurposing")
    protected Boolean disableRepurposing;
    @XmlElement(name = "DisableWalledGardenRule")
    protected Boolean disableWalledGardenRule;

    /**
     * Gets the value of the sendTimeAbsolute property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSendTimeAbsolute() {
        return sendTimeAbsolute;
    }

    /**
     * Sets the value of the sendTimeAbsolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSendTimeAbsolute(JAXBElement<XMLGregorianCalendar> value) {
        this.sendTimeAbsolute = ((JAXBElement<XMLGregorianCalendar> ) value);
    }

    /**
     * Gets the value of the sendTimeDelay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSendTimeDelay() {
        return sendTimeDelay;
    }

    /**
     * Sets the value of the sendTimeDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSendTimeDelay(JAXBElement<Integer> value) {
        this.sendTimeDelay = ((JAXBElement<Integer> ) value);
    }

    /**
     * Gets the value of the deliveryOption property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryOption }
     *     
     */
    public DeliveryOption getDeliveryOption() {
        return deliveryOption;
    }

    /**
     * Sets the value of the deliveryOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryOption }
     *     
     */
    public void setDeliveryOption(DeliveryOption value) {
        this.deliveryOption = value;
    }

    /**
     * Gets the value of the disableRepurposing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableRepurposing() {
        return disableRepurposing;
    }

    /**
     * Sets the value of the disableRepurposing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableRepurposing(Boolean value) {
        this.disableRepurposing = value;
    }

    /**
     * Gets the value of the disableWalledGardenRule property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableWalledGardenRule() {
        return disableWalledGardenRule;
    }

    /**
     * Sets the value of the disableWalledGardenRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableWalledGardenRule(Boolean value) {
        this.disableWalledGardenRule = value;
    }

}
