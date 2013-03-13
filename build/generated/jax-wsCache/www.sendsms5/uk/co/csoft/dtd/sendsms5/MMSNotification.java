
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMSNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMSNotification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LibraryNumber" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}MMSLibraryNumber" minOccurs="0"/>
 *         &lt;element name="FileUpload" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}MMSFileUpload" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMSNotification", propOrder = {
    "libraryNumber",
    "fileUpload"
})
public class MMSNotification {

    @XmlElementRef(name = "LibraryNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<MMSLibraryNumber> libraryNumber;
    @XmlElementRef(name = "FileUpload", type = JAXBElement.class, required = false)
    protected JAXBElement<MMSFileUpload> fileUpload;

    /**
     * Gets the value of the libraryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MMSLibraryNumber }{@code >}
     *     
     */
    public JAXBElement<MMSLibraryNumber> getLibraryNumber() {
        return libraryNumber;
    }

    /**
     * Sets the value of the libraryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MMSLibraryNumber }{@code >}
     *     
     */
    public void setLibraryNumber(JAXBElement<MMSLibraryNumber> value) {
        this.libraryNumber = ((JAXBElement<MMSLibraryNumber> ) value);
    }

    /**
     * Gets the value of the fileUpload property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MMSFileUpload }{@code >}
     *     
     */
    public JAXBElement<MMSFileUpload> getFileUpload() {
        return fileUpload;
    }

    /**
     * Sets the value of the fileUpload property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MMSFileUpload }{@code >}
     *     
     */
    public void setFileUpload(JAXBElement<MMSFileUpload> value) {
        this.fileUpload = ((JAXBElement<MMSFileUpload> ) value);
    }

}
