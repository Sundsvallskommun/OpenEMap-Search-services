
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustriandamalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustriandamalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Industrihotell"/>
 *     &lt;enumeration value="Kemisk industri"/>
 *     &lt;enumeration value="Livsmedelsindustri"/>
 *     &lt;enumeration value="Metall- eller maskinindustri"/>
 *     &lt;enumeration value="Textilindustri"/>
 *     &lt;enumeration value="Trävaruindustri"/>
 *     &lt;enumeration value="Annan tillverkningsindustri"/>
 *     &lt;enumeration value="Övrig industribyggnad"/>
 *     &lt;enumeration value="Gasturbinanläggning"/>
 *     &lt;enumeration value="Kondenskraftverk"/>
 *     &lt;enumeration value="Kärnkraftverk"/>
 *     &lt;enumeration value="Vattenkraftverk"/>
 *     &lt;enumeration value="Vindkraftverk"/>
 *     &lt;enumeration value="Värmeverk"/>
 *     &lt;enumeration value="Ospecificerad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndustriandamalType")
@XmlEnum
public enum IndustriandamalType {

    @XmlEnumValue("Industrihotell")
    INDUSTRIHOTELL("Industrihotell"),
    @XmlEnumValue("Kemisk industri")
    KEMISK_INDUSTRI("Kemisk industri"),
    @XmlEnumValue("Livsmedelsindustri")
    LIVSMEDELSINDUSTRI("Livsmedelsindustri"),
    @XmlEnumValue("Metall- eller maskinindustri")
    METALL_ELLER_MASKININDUSTRI("Metall- eller maskinindustri"),
    @XmlEnumValue("Textilindustri")
    TEXTILINDUSTRI("Textilindustri"),
    @XmlEnumValue("Tr\u00e4varuindustri")
    TRÄVARUINDUSTRI("Tr\u00e4varuindustri"),
    @XmlEnumValue("Annan tillverkningsindustri")
    ANNAN_TILLVERKNINGSINDUSTRI("Annan tillverkningsindustri"),
    @XmlEnumValue("\u00d6vrig industribyggnad")
    ÖVRIG_INDUSTRIBYGGNAD("\u00d6vrig industribyggnad"),
    @XmlEnumValue("Gasturbinanl\u00e4ggning")
    GASTURBINANLÄGGNING("Gasturbinanl\u00e4ggning"),
    @XmlEnumValue("Kondenskraftverk")
    KONDENSKRAFTVERK("Kondenskraftverk"),
    @XmlEnumValue("K\u00e4rnkraftverk")
    KÄRNKRAFTVERK("K\u00e4rnkraftverk"),
    @XmlEnumValue("Vattenkraftverk")
    VATTENKRAFTVERK("Vattenkraftverk"),
    @XmlEnumValue("Vindkraftverk")
    VINDKRAFTVERK("Vindkraftverk"),
    @XmlEnumValue("V\u00e4rmeverk")
    VÄRMEVERK("V\u00e4rmeverk"),
    @XmlEnumValue("Ospecificerad")
    OSPECIFICERAD("Ospecificerad");
    private final String value;

    IndustriandamalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndustriandamalType fromValue(String v) {
        for (IndustriandamalType c: IndustriandamalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
