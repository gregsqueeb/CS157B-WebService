
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SMS-SUBMIT-PDU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SMS-SUBMIT-PDU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DataCodingScheme" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="ProtocolIdentifier" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="UserDataHeader" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *         &lt;element name="UserData" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SMS-SUBMIT-PDU", propOrder = {
    "dataCodingScheme",
    "protocolIdentifier",
    "userDataHeader",
    "userData"
})
public class SMSSUBMITPDU {

    @XmlElement(name = "DataCodingScheme", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] dataCodingScheme;
    @XmlElement(name = "ProtocolIdentifier", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] protocolIdentifier;
    @XmlElement(name = "UserDataHeader", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] userDataHeader;
    @XmlElement(name = "UserData", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] userData;

    /**
     * Gets the value of the dataCodingScheme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getDataCodingScheme() {
        return dataCodingScheme;
    }

    /**
     * Sets the value of the dataCodingScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataCodingScheme(byte[] value) {
        this.dataCodingScheme = ((byte[]) value);
    }

    /**
     * Gets the value of the protocolIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getProtocolIdentifier() {
        return protocolIdentifier;
    }

    /**
     * Sets the value of the protocolIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolIdentifier(byte[] value) {
        this.protocolIdentifier = ((byte[]) value);
    }

    /**
     * Gets the value of the userDataHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getUserDataHeader() {
        return userDataHeader;
    }

    /**
     * Sets the value of the userDataHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDataHeader(byte[] value) {
        this.userDataHeader = ((byte[]) value);
    }

    /**
     * Gets the value of the userData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getUserData() {
        return userData;
    }

    /**
     * Sets the value of the userData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserData(byte[] value) {
        this.userData = ((byte[]) value);
    }

}
