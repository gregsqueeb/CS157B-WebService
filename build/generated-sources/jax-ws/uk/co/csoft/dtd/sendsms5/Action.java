
package uk.co.csoft.dtd.sendsms5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for action.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="action">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="signal-medium"/>
 *     &lt;enumeration value="signal-none"/>
 *     &lt;enumeration value="signal-low"/>
 *     &lt;enumeration value="signal-high"/>
 *     &lt;enumeration value="signal-delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "action")
@XmlEnum
public enum Action {

    @XmlEnumValue("signal-medium")
    SIGNAL_MEDIUM("signal-medium"),
    @XmlEnumValue("signal-none")
    SIGNAL_NONE("signal-none"),
    @XmlEnumValue("signal-low")
    SIGNAL_LOW("signal-low"),
    @XmlEnumValue("signal-high")
    SIGNAL_HIGH("signal-high"),
    @XmlEnumValue("signal-delete")
    SIGNAL_DELETE("signal-delete");
    private final String value;

    Action(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Action fromValue(String v) {
        for (Action c: Action.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
