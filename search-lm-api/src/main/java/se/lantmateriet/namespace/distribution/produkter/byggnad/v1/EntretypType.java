
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntretypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntretypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bostadsadress"/>
 *     &lt;enumeration value="Bostadsadress med registrerad lägenhet"/>
 *     &lt;enumeration value="Butiksadress"/>
 *     &lt;enumeration value="Besöksadress"/>
 *     &lt;enumeration value="Leveransadress"/>
 *     &lt;enumeration value="Uppgift saknas"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntretypType")
@XmlEnum
public enum EntretypType {

    @XmlEnumValue("Bostadsadress")
    BOSTADSADRESS("Bostadsadress"),
    @XmlEnumValue("Bostadsadress med registrerad l\u00e4genhet")
    BOSTADSADRESS_MED_REGISTRERAD_LÄGENHET("Bostadsadress med registrerad l\u00e4genhet"),
    @XmlEnumValue("Butiksadress")
    BUTIKSADRESS("Butiksadress"),
    @XmlEnumValue("Bes\u00f6ksadress")
    BESÖKSADRESS("Bes\u00f6ksadress"),
    @XmlEnumValue("Leveransadress")
    LEVERANSADRESS("Leveransadress"),
    @XmlEnumValue("Uppgift saknas")
    UPPGIFT_SAKNAS("Uppgift saknas");
    private final String value;

    EntretypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntretypType fromValue(String v) {
        for (EntretypType c: EntretypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
