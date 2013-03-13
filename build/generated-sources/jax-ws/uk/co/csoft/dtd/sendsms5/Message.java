
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TextMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlashMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ringtone" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}SmartMessage" minOccurs="0"/>
 *         &lt;element name="OperatorLogo" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}SmartMessage" minOccurs="0"/>
 *         &lt;element name="PictureMessage" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}SmartMessage" minOccurs="0"/>
 *         &lt;element name="GroupGraphic" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}SmartMessage" minOccurs="0"/>
 *         &lt;element name="SmsSubmitPdu" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}SMS-SUBMIT-PDU" minOccurs="0"/>
 *         &lt;element name="WAPPush" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}WAPPush" minOccurs="0"/>
 *         &lt;element name="MMSNotification" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}MMSNotification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "textMessage",
    "flashMessage",
    "ringtone",
    "operatorLogo",
    "pictureMessage",
    "groupGraphic",
    "smsSubmitPdu",
    "wapPush",
    "mmsNotification"
})
public class Message {

    @XmlElementRef(name = "TextMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textMessage;
    @XmlElementRef(name = "FlashMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> flashMessage;
    @XmlElementRef(name = "Ringtone", type = JAXBElement.class, required = false)
    protected JAXBElement<SmartMessage> ringtone;
    @XmlElementRef(name = "OperatorLogo", type = JAXBElement.class, required = false)
    protected JAXBElement<SmartMessage> operatorLogo;
    @XmlElementRef(name = "PictureMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<SmartMessage> pictureMessage;
    @XmlElementRef(name = "GroupGraphic", type = JAXBElement.class, required = false)
    protected JAXBElement<SmartMessage> groupGraphic;
    @XmlElementRef(name = "SmsSubmitPdu", type = JAXBElement.class, required = false)
    protected JAXBElement<SMSSUBMITPDU> smsSubmitPdu;
    @XmlElementRef(name = "WAPPush", type = JAXBElement.class, required = false)
    protected JAXBElement<WAPPush> wapPush;
    @XmlElementRef(name = "MMSNotification", type = JAXBElement.class, required = false)
    protected JAXBElement<MMSNotification> mmsNotification;

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

    /**
     * Gets the value of the flashMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFlashMessage() {
        return flashMessage;
    }

    /**
     * Sets the value of the flashMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFlashMessage(JAXBElement<String> value) {
        this.flashMessage = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the ringtone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public JAXBElement<SmartMessage> getRingtone() {
        return ringtone;
    }

    /**
     * Sets the value of the ringtone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public void setRingtone(JAXBElement<SmartMessage> value) {
        this.ringtone = ((JAXBElement<SmartMessage> ) value);
    }

    /**
     * Gets the value of the operatorLogo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public JAXBElement<SmartMessage> getOperatorLogo() {
        return operatorLogo;
    }

    /**
     * Sets the value of the operatorLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public void setOperatorLogo(JAXBElement<SmartMessage> value) {
        this.operatorLogo = ((JAXBElement<SmartMessage> ) value);
    }

    /**
     * Gets the value of the pictureMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public JAXBElement<SmartMessage> getPictureMessage() {
        return pictureMessage;
    }

    /**
     * Sets the value of the pictureMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public void setPictureMessage(JAXBElement<SmartMessage> value) {
        this.pictureMessage = ((JAXBElement<SmartMessage> ) value);
    }

    /**
     * Gets the value of the groupGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public JAXBElement<SmartMessage> getGroupGraphic() {
        return groupGraphic;
    }

    /**
     * Sets the value of the groupGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SmartMessage }{@code >}
     *     
     */
    public void setGroupGraphic(JAXBElement<SmartMessage> value) {
        this.groupGraphic = ((JAXBElement<SmartMessage> ) value);
    }

    /**
     * Gets the value of the smsSubmitPdu property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SMSSUBMITPDU }{@code >}
     *     
     */
    public JAXBElement<SMSSUBMITPDU> getSmsSubmitPdu() {
        return smsSubmitPdu;
    }

    /**
     * Sets the value of the smsSubmitPdu property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SMSSUBMITPDU }{@code >}
     *     
     */
    public void setSmsSubmitPdu(JAXBElement<SMSSUBMITPDU> value) {
        this.smsSubmitPdu = ((JAXBElement<SMSSUBMITPDU> ) value);
    }

    /**
     * Gets the value of the wapPush property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WAPPush }{@code >}
     *     
     */
    public JAXBElement<WAPPush> getWAPPush() {
        return wapPush;
    }

    /**
     * Sets the value of the wapPush property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WAPPush }{@code >}
     *     
     */
    public void setWAPPush(JAXBElement<WAPPush> value) {
        this.wapPush = ((JAXBElement<WAPPush> ) value);
    }

    /**
     * Gets the value of the mmsNotification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MMSNotification }{@code >}
     *     
     */
    public JAXBElement<MMSNotification> getMMSNotification() {
        return mmsNotification;
    }

    /**
     * Sets the value of the mmsNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MMSNotification }{@code >}
     *     
     */
    public void setMMSNotification(JAXBElement<MMSNotification> value) {
        this.mmsNotification = ((JAXBElement<MMSNotification> ) value);
    }

}
