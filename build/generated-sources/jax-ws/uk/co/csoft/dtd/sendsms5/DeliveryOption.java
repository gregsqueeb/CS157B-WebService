
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="Premier"/>
 *     &lt;enumeration value="LeastCost"/>
 *     &lt;enumeration value="Economy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryOption")
@XmlEnum
public enum DeliveryOption {

    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Premier")
    PREMIER("Premier"),
    @XmlEnumValue("LeastCost")
    LEAST_COST("LeastCost"),
    @XmlEnumValue("Economy")
    ECONOMY("Economy");
    private final String value;

    DeliveryOption(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryOption fromValue(String v) {
        for (DeliveryOption c: DeliveryOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
