
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReleaseNotice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DownloadURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "version",
    "releaseNotice",
    "downloadURL",
    "releaseDate"
})
@XmlRootElement(name = "MobileMessengerVersionResponse")
public class MobileMessengerVersionResponse {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(name = "ReleaseNotice", required = true)
    protected String releaseNotice;
    @XmlElement(name = "DownloadURL", required = true)
    protected String downloadURL;
    @XmlElement(name = "ReleaseDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDate;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the releaseNotice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseNotice() {
        return releaseNotice;
    }

    /**
     * Sets the value of the releaseNotice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseNotice(String value) {
        this.releaseNotice = value;
    }

    /**
     * Gets the value of the downloadURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadURL() {
        return downloadURL;
    }

    /**
     * Sets the value of the downloadURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadURL(String value) {
        this.downloadURL = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

}
