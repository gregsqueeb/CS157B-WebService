
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FORMAT-UNDEFINED"/>
 *     &lt;enumeration value="RTTTL"/>
 *     &lt;enumeration value="OTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataFormat")
@XmlEnum
public enum DataFormat {

    @XmlEnumValue("FORMAT-UNDEFINED")
    FORMAT_UNDEFINED("FORMAT-UNDEFINED"),
    RTTTL("RTTTL"),
    OTA("OTA");
    private final String value;

    DataFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataFormat fromValue(String v) {
        for (DataFormat c: DataFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
