
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UtrymmestypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UtrymmestypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bergrum"/>
 *     &lt;enumeration value="Bro"/>
 *     &lt;enumeration value="Byggnad"/>
 *     &lt;enumeration value="Tunnel"/>
 *     &lt;enumeration value="Övrig anläggning"/>
 *     &lt;enumeration value="Ägarlägenhetfastighet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UtrymmestypType")
@XmlEnum
public enum UtrymmestypType {

    @XmlEnumValue("Bergrum")
    BERGRUM("Bergrum"),
    @XmlEnumValue("Bro")
    BRO("Bro"),
    @XmlEnumValue("Byggnad")
    BYGGNAD("Byggnad"),
    @XmlEnumValue("Tunnel")
    TUNNEL("Tunnel"),
    @XmlEnumValue("\u00d6vrig anl\u00e4ggning")
    ÖVRIG_ANLÄGGNING("\u00d6vrig anl\u00e4ggning"),
    @XmlEnumValue("\u00c4garl\u00e4genhetfastighet")
    ÄGARLÄGENHETFASTIGHET("\u00c4garl\u00e4genhetfastighet");
    private final String value;

    UtrymmestypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UtrymmestypType fromValue(String v) {
        for (UtrymmestypType c: UtrymmestypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
