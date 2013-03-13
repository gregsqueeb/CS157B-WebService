
package net.webservicex;

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
 *         &lt;element name="GetSunSetRiseTimeResult" type="{http://www.webserviceX.NET/}LatLonDate"/>
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
    "getSunSetRiseTimeResult"
})
@XmlRootElement(name = "GetSunSetRiseTimeResponse")
public class GetSunSetRiseTimeResponse {

    @XmlElement(name = "GetSunSetRiseTimeResult", required = true)
    protected LatLonDate getSunSetRiseTimeResult;

    /**
     * Gets the value of the getSunSetRiseTimeResult property.
     * 
     * @return
     *     possible object is
     *     {@link LatLonDate }
     *     
     */
    public LatLonDate getGetSunSetRiseTimeResult() {
        return getSunSetRiseTimeResult;
    }

    /**
     * Sets the value of the getSunSetRiseTimeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LatLonDate }
     *     
     */
    public void setGetSunSetRiseTimeResult(LatLonDate value) {
        this.getSunSetRiseTimeResult = value;
    }

}
