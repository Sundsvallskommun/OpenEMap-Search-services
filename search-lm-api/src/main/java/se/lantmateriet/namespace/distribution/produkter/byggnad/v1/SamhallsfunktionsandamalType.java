
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SamhallsfunktionsandamalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SamhallsfunktionsandamalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Badhus"/>
 *     &lt;enumeration value="Brandstation"/>
 *     &lt;enumeration value="Busstation"/>
 *     &lt;enumeration value="Distributionsbyggnad"/>
 *     &lt;enumeration value="Djursjukhus"/>
 *     &lt;enumeration value="Försvarsbyggnad"/>
 *     &lt;enumeration value="Vårdcentral"/>
 *     &lt;enumeration value="Högskola"/>
 *     &lt;enumeration value="Ishall"/>
 *     &lt;enumeration value="Järnvägsstation"/>
 *     &lt;enumeration value="Kommunhus"/>
 *     &lt;enumeration value="Kriminalvårdsanstalt"/>
 *     &lt;enumeration value="Kulturbyggnad"/>
 *     &lt;enumeration value="Polisstation"/>
 *     &lt;enumeration value="Reningsverk"/>
 *     &lt;enumeration value="Ridhus"/>
 *     &lt;enumeration value="Samfund"/>
 *     &lt;enumeration value="Sjukhus"/>
 *     &lt;enumeration value="Skola"/>
 *     &lt;enumeration value="Sporthall"/>
 *     &lt;enumeration value="Universitet"/>
 *     &lt;enumeration value="Vattenverk"/>
 *     &lt;enumeration value="Ospecificerad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SamhallsfunktionsandamalType")
@XmlEnum
public enum SamhallsfunktionsandamalType {

    @XmlEnumValue("Badhus")
    BADHUS("Badhus"),
    @XmlEnumValue("Brandstation")
    BRANDSTATION("Brandstation"),
    @XmlEnumValue("Busstation")
    BUSSTATION("Busstation"),
    @XmlEnumValue("Distributionsbyggnad")
    DISTRIBUTIONSBYGGNAD("Distributionsbyggnad"),
    @XmlEnumValue("Djursjukhus")
    DJURSJUKHUS("Djursjukhus"),
    @XmlEnumValue("F\u00f6rsvarsbyggnad")
    FÖRSVARSBYGGNAD("F\u00f6rsvarsbyggnad"),
    @XmlEnumValue("V\u00e5rdcentral")
    VÅRDCENTRAL("V\u00e5rdcentral"),
    @XmlEnumValue("H\u00f6gskola")
    HÖGSKOLA("H\u00f6gskola"),
    @XmlEnumValue("Ishall")
    ISHALL("Ishall"),
    @XmlEnumValue("J\u00e4rnv\u00e4gsstation")
    JÄRNVÄGSSTATION("J\u00e4rnv\u00e4gsstation"),
    @XmlEnumValue("Kommunhus")
    KOMMUNHUS("Kommunhus"),
    @XmlEnumValue("Kriminalv\u00e5rdsanstalt")
    KRIMINALVÅRDSANSTALT("Kriminalv\u00e5rdsanstalt"),
    @XmlEnumValue("Kulturbyggnad")
    KULTURBYGGNAD("Kulturbyggnad"),
    @XmlEnumValue("Polisstation")
    POLISSTATION("Polisstation"),
    @XmlEnumValue("Reningsverk")
    RENINGSVERK("Reningsverk"),
    @XmlEnumValue("Ridhus")
    RIDHUS("Ridhus"),
    @XmlEnumValue("Samfund")
    SAMFUND("Samfund"),
    @XmlEnumValue("Sjukhus")
    SJUKHUS("Sjukhus"),
    @XmlEnumValue("Skola")
    SKOLA("Skola"),
    @XmlEnumValue("Sporthall")
    SPORTHALL("Sporthall"),
    @XmlEnumValue("Universitet")
    UNIVERSITET("Universitet"),
    @XmlEnumValue("Vattenverk")
    VATTENVERK("Vattenverk"),
    @XmlEnumValue("Ospecificerad")
    OSPECIFICERAD("Ospecificerad");
    private final String value;

    SamhallsfunktionsandamalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamhallsfunktionsandamalType fromValue(String v) {
        for (SamhallsfunktionsandamalType c: SamhallsfunktionsandamalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
