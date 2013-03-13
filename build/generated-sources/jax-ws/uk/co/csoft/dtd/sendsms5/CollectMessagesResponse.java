
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
 *         &lt;element name="Report" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MessageList" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}CollectedMessagesList"/>
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
    "report",
    "messageList"
})
@XmlRootElement(name = "CollectMessagesResponse")
public class CollectMessagesResponse {

    @XmlElement(name = "Report")
    protected int report;
    @XmlElement(name = "MessageList", required = true)
    protected CollectedMessagesList messageList;

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
     * Gets the value of the messageList property.
     * 
     * @return
     *     possible object is
     *     {@link CollectedMessagesList }
     *     
     */
    public CollectedMessagesList getMessageList() {
        return messageList;
    }

    /**
     * Sets the value of the messageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectedMessagesList }
     *     
     */
    public void setMessageList(CollectedMessagesList value) {
        this.messageList = value;
    }

}
