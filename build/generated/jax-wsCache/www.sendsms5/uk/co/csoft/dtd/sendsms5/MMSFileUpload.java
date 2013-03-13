
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMSFileUpload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMSFileUpload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileData1" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/>
 *         &lt;element name="FileType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileTitle1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextMessage1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMSFileUpload", propOrder = {
    "fileName1",
    "fileData1",
    "fileType1",
    "fileTitle1",
    "contentType1",
    "textMessage1"
})
public class MMSFileUpload {

    @XmlElementRef(name = "FileName1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName1;
    @XmlElementRef(name = "FileData1", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> fileData1;
    @XmlElementRef(name = "FileType1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileType1;
    @XmlElementRef(name = "FileTitle1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileTitle1;
    @XmlElementRef(name = "ContentType1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentType1;
    @XmlElementRef(name = "TextMessage1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> textMessage1;

    /**
     * Gets the value of the fileName1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName1() {
        return fileName1;
    }

    /**
     * Sets the value of the fileName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName1(JAXBElement<String> value) {
        this.fileName1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileData1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFileData1() {
        return fileData1;
    }

    /**
     * Sets the value of the fileData1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFileData1(JAXBElement<byte[]> value) {
        this.fileData1 = ((JAXBElement<byte[]> ) value);
    }

    /**
     * Gets the value of the fileType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileType1() {
        return fileType1;
    }

    /**
     * Sets the value of the fileType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileType1(JAXBElement<String> value) {
        this.fileType1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the fileTitle1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileTitle1() {
        return fileTitle1;
    }

    /**
     * Sets the value of the fileTitle1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileTitle1(JAXBElement<String> value) {
        this.fileTitle1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the contentType1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentType1() {
        return contentType1;
    }

    /**
     * Sets the value of the contentType1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentType1(JAXBElement<String> value) {
        this.contentType1 = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the textMessage1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTextMessage1() {
        return textMessage1;
    }

    /**
     * Sets the value of the textMessage1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTextMessage1(JAXBElement<String> value) {
        this.textMessage1 = ((JAXBElement<String> ) value);
    }

}
