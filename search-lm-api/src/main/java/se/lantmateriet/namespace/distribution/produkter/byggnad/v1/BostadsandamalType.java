
package se.lantmateriet.namespace.distribution.produkter.byggnad.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BostadsandamalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BostadsandamalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Småhus friliggande"/>
 *     &lt;enumeration value="Småhus kedjehus"/>
 *     &lt;enumeration value="Småhus radhus"/>
 *     &lt;enumeration value="Småhus med flera lägenheter"/>
 *     &lt;enumeration value="Flerfamiljshus"/>
 *     &lt;enumeration value="Ospecificerad"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BostadsandamalType")
@XmlEnum
public enum BostadsandamalType {

    @XmlEnumValue("Sm\u00e5hus friliggande")
    SMÅHUS_FRILIGGANDE("Sm\u00e5hus friliggande"),
    @XmlEnumValue("Sm\u00e5hus kedjehus")
    SMÅHUS_KEDJEHUS("Sm\u00e5hus kedjehus"),
    @XmlEnumValue("Sm\u00e5hus radhus")
    SMÅHUS_RADHUS("Sm\u00e5hus radhus"),
    @XmlEnumValue("Sm\u00e5hus med flera l\u00e4genheter")
    SMÅHUS_MED_FLERA_LÄGENHETER("Sm\u00e5hus med flera l\u00e4genheter"),
    @XmlEnumValue("Flerfamiljshus")
    FLERFAMILJSHUS("Flerfamiljshus"),
    @XmlEnumValue("Ospecificerad")
    OSPECIFICERAD("Ospecificerad");
    private final String value;

    BostadsandamalType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BostadsandamalType fromValue(String v) {
        for (BostadsandamalType c: BostadsandamalType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
