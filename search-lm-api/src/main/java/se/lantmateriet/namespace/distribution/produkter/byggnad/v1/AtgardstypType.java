
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtgardstypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AtgardstypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Migrerat objekt"/>
 *     &lt;enumeration value="Godkänt bygglov"/>
 *     &lt;enumeration value="Ny färdigbyggd byggnad"/>
 *     &lt;enumeration value="Befintlig byggnad"/>
 *     &lt;enumeration value="Byggnaden färdigbyggd"/>
 *     &lt;enumeration value="Ändrad byggnadsinformation"/>
 *     &lt;enumeration value="Riven, nedbrunnen byggnad"/>
 *     &lt;enumeration value="Felregistrerad byggnad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AtgardstypType")
@XmlEnum
public enum AtgardstypType {

    @XmlEnumValue("Migrerat objekt")
    MIGRERAT_OBJEKT("Migrerat objekt"),
    @XmlEnumValue("Godk\u00e4nt bygglov")
    GODKÄNT_BYGGLOV("Godk\u00e4nt bygglov"),
    @XmlEnumValue("Ny f\u00e4rdigbyggd byggnad")
    NY_FÄRDIGBYGGD_BYGGNAD("Ny f\u00e4rdigbyggd byggnad"),
    @XmlEnumValue("Befintlig byggnad")
    BEFINTLIG_BYGGNAD("Befintlig byggnad"),
    @XmlEnumValue("Byggnaden f\u00e4rdigbyggd")
    BYGGNADEN_FÄRDIGBYGGD("Byggnaden f\u00e4rdigbyggd"),
    @XmlEnumValue("\u00c4ndrad byggnadsinformation")
    ÄNDRAD_BYGGNADSINFORMATION("\u00c4ndrad byggnadsinformation"),
    @XmlEnumValue("Riven, nedbrunnen byggnad")
    RIVEN_NEDBRUNNEN_BYGGNAD("Riven, nedbrunnen byggnad"),
    @XmlEnumValue("Felregistrerad byggnad")
    FELREGISTRERAD_BYGGNAD("Felregistrerad byggnad");
    private final String value;

    AtgardstypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AtgardstypType fromValue(String v) {
        for (AtgardstypType c: AtgardstypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
