
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WAPPush complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WAPPush">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SimplePush" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}SimplePush" minOccurs="0"/>
 *         &lt;element name="LibraryNumber" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}MMSLibraryNumber" minOccurs="0"/>
 *         &lt;element name="FileUpload" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}MMSFileUpload" minOccurs="0"/>
 *         &lt;element name="si" type="{http://www.csoft.co.uk/dtd/sendsms5.xsd}si" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WAPPush", propOrder = {
    "simplePush",
    "libraryNumber",
    "fileUpload",
    "si"
})
public class WAPPush {

    @XmlElementRef(name = "SimplePush", type = JAXBElement.class, required = false)
    protected JAXBElement<SimplePush> simplePush;
    @XmlElementRef(name = "LibraryNumber", type = JAXBElement.class, required = false)
    protected JAXBElement<MMSLibraryNumber> libraryNumber;
    @XmlElementRef(name = "FileUpload", type = JAXBElement.class, required = false)
    protected JAXBElement<MMSFileUpload> fileUpload;
    @XmlElementRef(name = "si", type = JAXBElement.class, required = false)
    protected JAXBElement<Si> si;

    /**
     * Gets the value of the simplePush property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SimplePush }{@code >}
     *     
     */
    public JAXBElement<SimplePush> getSimplePush() {
        return simplePush;
    }

    /**
     * Sets the value of the simplePush property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SimplePush }{@code >}
     *     
     */
    public void setSimplePush(JAXBElement<SimplePush> value) {
        this.simplePush = ((JAXBElement<SimplePush> ) value);
    }

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

    /**
     * Gets the value of the si property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Si }{@code >}
     *     
     */
    public JAXBElement<Si> getSi() {
        return si;
    }

    /**
     * Sets the value of the si property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Si }{@code >}
     *     
     */
    public void setSi(JAXBElement<Si> value) {
        this.si = ((JAXBElement<Si> ) value);
    }

}
