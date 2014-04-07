
package se.lantmateriet.namespace.distribution.produkter.fastighet.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FastighetsatgardstypType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FastighetsatgardstypType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Anläggningsåtgärd"/>
 *     &lt;enumeration value="Anläggningsförrättning, servitutsåtgärd"/>
 *     &lt;enumeration value="Anslutning"/>
 *     &lt;enumeration value="Arealavmätning"/>
 *     &lt;enumeration value="Avlösning"/>
 *     &lt;enumeration value="Avsöndring"/>
 *     &lt;enumeration value="Avstyckning"/>
 *     &lt;enumeration value="Avstyckning/laga skifte"/>
 *     &lt;enumeration value="Avstyckning/Servitutsutbrytning"/>
 *     &lt;enumeration value="Av ålder bestående"/>
 *     &lt;enumeration value="Avvittring"/>
 *     &lt;enumeration value="Beslut om fastighetsindelning"/>
 *     &lt;enumeration value="Delning"/>
 *     &lt;enumeration value="Förrättning enligt ensittarlagen"/>
 *     &lt;enumeration value="Ensittarinlösen"/>
 *     &lt;enumeration value="Enskifte"/>
 *     &lt;enumeration value="Förrättning enskilda väglagen"/>
 *     &lt;enumeration value="Expropriation"/>
 *     &lt;enumeration value="Expropriationsmätning"/>
 *     &lt;enumeration value="Fastighetsbestämning"/>
 *     &lt;enumeration value="Fastighetsreglering"/>
 *     &lt;enumeration value="Fastighetsreglering, servitutsåtgärd"/>
 *     &lt;enumeration value="Fastighetsreglering, andelsöverföring"/>
 *     &lt;enumeration value="Beslut om församlingsindelning"/>
 *     &lt;enumeration value="Gränsbestämning"/>
 *     &lt;enumeration value="Gränsutmärkning fullföljd"/>
 *     &lt;enumeration value="Hemmansklyvning"/>
 *     &lt;enumeration value="Beslut om kommun- och församlingsindelning"/>
 *     &lt;enumeration value="Indelningsändring"/>
 *     &lt;enumeration value="Inlösen"/>
 *     &lt;enumeration value="Inställd åtgärd eller förrättning"/>
 *     &lt;enumeration value="Införd i tomtboken"/>
 *     &lt;enumeration value="Beslut om församlingsindelning enligt äldre lagstiftning"/>
 *     &lt;enumeration value="Klyvning"/>
 *     &lt;enumeration value="Ledningsåtgärd"/>
 *     &lt;enumeration value="Legalisering, arealfång"/>
 *     &lt;enumeration value="Legaliseringsförrättning"/>
 *     &lt;enumeration value="Legalisering, sämjedelning"/>
 *     &lt;enumeration value="LGA-förrättning"/>
 *     &lt;enumeration value="Laga skifte"/>
 *     &lt;enumeration value="Beslut om kommun- och församlingsändring (i samband med fastighetsbildning)"/>
 *     &lt;enumeration value="Mantalsättning"/>
 *     &lt;enumeration value="Omprövning enligt 27:e § FL"/>
 *     &lt;enumeration value="Registrering"/>
 *     &lt;enumeration value="Registreringsbeslut"/>
 *     &lt;enumeration value="Rågångsåtgärd"/>
 *     &lt;enumeration value="Rättelse enligt 26:e § FL"/>
 *     &lt;enumeration value="Servitutsutbrytning"/>
 *     &lt;enumeration value="Sammanföring"/>
 *     &lt;enumeration value="Sammanläggning"/>
 *     &lt;enumeration value="Skattläggning"/>
 *     &lt;enumeration value="Storskifte"/>
 *     &lt;enumeration value="Servitutsåtgärd"/>
 *     &lt;enumeration value="Syneförrättning"/>
 *     &lt;enumeration value="Särskild gränsutmärkning"/>
 *     &lt;enumeration value="Tomtmätning"/>
 *     &lt;enumeration value="Undanröjd åtgärd"/>
 *     &lt;enumeration value="Uteslutning"/>
 *     &lt;enumeration value="Vägförrättning"/>
 *     &lt;enumeration value="Åbodelning"/>
 *     &lt;enumeration value="Ändrat andelstal"/>
 *     &lt;enumeration value="Äganderättsutredning"/>
 *     &lt;enumeration value="Ägomätning"/>
 *     &lt;enumeration value="Ägostyckning"/>
 *     &lt;enumeration value="Ägoutbyte"/>
 *     &lt;enumeration value="ÄULL-förrättning"/>
 *     &lt;enumeration value="Överenskommelse enligt anläggningslagen"/>
 *     &lt;enumeration value="Övriga åtgärder"/>
 *     &lt;enumeration value="Arealutredning"/>
 *     &lt;enumeration value="Arealkomplettering"/>
 *     &lt;enumeration value="Mätning"/>
 *     &lt;enumeration value="Nybyggnadskarta"/>
 *     &lt;enumeration value="Nymätning"/>
 *     &lt;enumeration value="Säkerställande av gränsmärke"/>
 *     &lt;enumeration value="Utredning"/>
 *     &lt;enumeration value="Återställande av gränsmärke"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FastighetsatgardstypType")
@XmlEnum
public enum FastighetsatgardstypType {

    @XmlEnumValue("Anl\u00e4ggnings\u00e5tg\u00e4rd")
    ANLÄGGNINGSÅTGÄRD("Anl\u00e4ggnings\u00e5tg\u00e4rd"),
    @XmlEnumValue("Anl\u00e4ggningsf\u00f6rr\u00e4ttning, servituts\u00e5tg\u00e4rd")
    ANLÄGGNINGSFÖRRÄTTNING_SERVITUTSÅTGÄRD("Anl\u00e4ggningsf\u00f6rr\u00e4ttning, servituts\u00e5tg\u00e4rd"),
    @XmlEnumValue("Anslutning")
    ANSLUTNING("Anslutning"),
    @XmlEnumValue("Arealavm\u00e4tning")
    AREALAVMÄTNING("Arealavm\u00e4tning"),
    @XmlEnumValue("Avl\u00f6sning")
    AVLÖSNING("Avl\u00f6sning"),
    @XmlEnumValue("Avs\u00f6ndring")
    AVSÖNDRING("Avs\u00f6ndring"),
    @XmlEnumValue("Avstyckning")
    AVSTYCKNING("Avstyckning"),
    @XmlEnumValue("Avstyckning/laga skifte")
    AVSTYCKNING_LAGA_SKIFTE("Avstyckning/laga skifte"),
    @XmlEnumValue("Avstyckning/Servitutsutbrytning")
    AVSTYCKNING_SERVITUTSUTBRYTNING("Avstyckning/Servitutsutbrytning"),
    @XmlEnumValue("Av \u00e5lder best\u00e5ende")
    AV_ÅLDER_BESTÅENDE("Av \u00e5lder best\u00e5ende"),
    @XmlEnumValue("Avvittring")
    AVVITTRING("Avvittring"),
    @XmlEnumValue("Beslut om fastighetsindelning")
    BESLUT_OM_FASTIGHETSINDELNING("Beslut om fastighetsindelning"),
    @XmlEnumValue("Delning")
    DELNING("Delning"),
    @XmlEnumValue("F\u00f6rr\u00e4ttning enligt ensittarlagen")
    FÖRRÄTTNING_ENLIGT_ENSITTARLAGEN("F\u00f6rr\u00e4ttning enligt ensittarlagen"),
    @XmlEnumValue("Ensittarinl\u00f6sen")
    ENSITTARINLÖSEN("Ensittarinl\u00f6sen"),
    @XmlEnumValue("Enskifte")
    ENSKIFTE("Enskifte"),
    @XmlEnumValue("F\u00f6rr\u00e4ttning enskilda v\u00e4glagen")
    FÖRRÄTTNING_ENSKILDA_VÄGLAGEN("F\u00f6rr\u00e4ttning enskilda v\u00e4glagen"),
    @XmlEnumValue("Expropriation")
    EXPROPRIATION("Expropriation"),
    @XmlEnumValue("Expropriationsm\u00e4tning")
    EXPROPRIATIONSMÄTNING("Expropriationsm\u00e4tning"),
    @XmlEnumValue("Fastighetsbest\u00e4mning")
    FASTIGHETSBESTÄMNING("Fastighetsbest\u00e4mning"),
    @XmlEnumValue("Fastighetsreglering")
    FASTIGHETSREGLERING("Fastighetsreglering"),
    @XmlEnumValue("Fastighetsreglering, servituts\u00e5tg\u00e4rd")
    FASTIGHETSREGLERING_SERVITUTSÅTGÄRD("Fastighetsreglering, servituts\u00e5tg\u00e4rd"),
    @XmlEnumValue("Fastighetsreglering, andels\u00f6verf\u00f6ring")
    FASTIGHETSREGLERING_ANDELSÖVERFÖRING("Fastighetsreglering, andels\u00f6verf\u00f6ring"),
    @XmlEnumValue("Beslut om f\u00f6rsamlingsindelning")
    BESLUT_OM_FÖRSAMLINGSINDELNING("Beslut om f\u00f6rsamlingsindelning"),
    @XmlEnumValue("Gr\u00e4nsbest\u00e4mning")
    GRÄNSBESTÄMNING("Gr\u00e4nsbest\u00e4mning"),
    @XmlEnumValue("Gr\u00e4nsutm\u00e4rkning fullf\u00f6ljd")
    GRÄNSUTMÄRKNING_FULLFÖLJD("Gr\u00e4nsutm\u00e4rkning fullf\u00f6ljd"),
    @XmlEnumValue("Hemmansklyvning")
    HEMMANSKLYVNING("Hemmansklyvning"),
    @XmlEnumValue("Beslut om kommun- och f\u00f6rsamlingsindelning")
    BESLUT_OM_KOMMUN_OCH_FÖRSAMLINGSINDELNING("Beslut om kommun- och f\u00f6rsamlingsindelning"),
    @XmlEnumValue("Indelnings\u00e4ndring")
    INDELNINGSÄNDRING("Indelnings\u00e4ndring"),
    @XmlEnumValue("Inl\u00f6sen")
    INLÖSEN("Inl\u00f6sen"),
    @XmlEnumValue("Inst\u00e4lld \u00e5tg\u00e4rd eller f\u00f6rr\u00e4ttning")
    INSTÄLLD_ÅTGÄRD_ELLER_FÖRRÄTTNING("Inst\u00e4lld \u00e5tg\u00e4rd eller f\u00f6rr\u00e4ttning"),
    @XmlEnumValue("Inf\u00f6rd i tomtboken")
    INFÖRD_I_TOMTBOKEN("Inf\u00f6rd i tomtboken"),
    @XmlEnumValue("Beslut om f\u00f6rsamlingsindelning enligt \u00e4ldre lagstiftning")
    BESLUT_OM_FÖRSAMLINGSINDELNING_ENLIGT_ÄLDRE_LAGSTIFTNING("Beslut om f\u00f6rsamlingsindelning enligt \u00e4ldre lagstiftning"),
    @XmlEnumValue("Klyvning")
    KLYVNING("Klyvning"),
    @XmlEnumValue("Lednings\u00e5tg\u00e4rd")
    LEDNINGSÅTGÄRD("Lednings\u00e5tg\u00e4rd"),
    @XmlEnumValue("Legalisering, arealf\u00e5ng")
    LEGALISERING_AREALFÅNG("Legalisering, arealf\u00e5ng"),
    @XmlEnumValue("Legaliseringsf\u00f6rr\u00e4ttning")
    LEGALISERINGSFÖRRÄTTNING("Legaliseringsf\u00f6rr\u00e4ttning"),
    @XmlEnumValue("Legalisering, s\u00e4mjedelning")
    LEGALISERING_SÄMJEDELNING("Legalisering, s\u00e4mjedelning"),
    @XmlEnumValue("LGA-f\u00f6rr\u00e4ttning")
    LGA_FÖRRÄTTNING("LGA-f\u00f6rr\u00e4ttning"),
    @XmlEnumValue("Laga skifte")
    LAGA_SKIFTE("Laga skifte"),
    @XmlEnumValue("Beslut om kommun- och f\u00f6rsamlings\u00e4ndring (i samband med fastighetsbildning)")
    BESLUT_OM_KOMMUN_OCH_FÖRSAMLINGSÄNDRING_I_SAMBAND_MED_FASTIGHETSBILDNING("Beslut om kommun- och f\u00f6rsamlings\u00e4ndring (i samband med fastighetsbildning)"),
    @XmlEnumValue("Mantals\u00e4ttning")
    MANTALSÄTTNING("Mantals\u00e4ttning"),
    @XmlEnumValue("Ompr\u00f6vning enligt 27:e \u00a7 FL")
    OMPRÖVNING_ENLIGT_27_E_FL("Ompr\u00f6vning enligt 27:e \u00a7 FL"),
    @XmlEnumValue("Registrering")
    REGISTRERING("Registrering"),
    @XmlEnumValue("Registreringsbeslut")
    REGISTRERINGSBESLUT("Registreringsbeslut"),
    @XmlEnumValue("R\u00e5g\u00e5ngs\u00e5tg\u00e4rd")
    RÅGÅNGSÅTGÄRD("R\u00e5g\u00e5ngs\u00e5tg\u00e4rd"),
    @XmlEnumValue("R\u00e4ttelse enligt 26:e \u00a7 FL")
    RÄTTELSE_ENLIGT_26_E_FL("R\u00e4ttelse enligt 26:e \u00a7 FL"),
    @XmlEnumValue("Servitutsutbrytning")
    SERVITUTSUTBRYTNING("Servitutsutbrytning"),
    @XmlEnumValue("Sammanf\u00f6ring")
    SAMMANFÖRING("Sammanf\u00f6ring"),
    @XmlEnumValue("Sammanl\u00e4ggning")
    SAMMANLÄGGNING("Sammanl\u00e4ggning"),
    @XmlEnumValue("Skattl\u00e4ggning")
    SKATTLÄGGNING("Skattl\u00e4ggning"),
    @XmlEnumValue("Storskifte")
    STORSKIFTE("Storskifte"),
    @XmlEnumValue("Servituts\u00e5tg\u00e4rd")
    SERVITUTSÅTGÄRD("Servituts\u00e5tg\u00e4rd"),
    @XmlEnumValue("Synef\u00f6rr\u00e4ttning")
    SYNEFÖRRÄTTNING("Synef\u00f6rr\u00e4ttning"),
    @XmlEnumValue("S\u00e4rskild gr\u00e4nsutm\u00e4rkning")
    SÄRSKILD_GRÄNSUTMÄRKNING("S\u00e4rskild gr\u00e4nsutm\u00e4rkning"),
    @XmlEnumValue("Tomtm\u00e4tning")
    TOMTMÄTNING("Tomtm\u00e4tning"),
    @XmlEnumValue("Undanr\u00f6jd \u00e5tg\u00e4rd")
    UNDANRÖJD_ÅTGÄRD("Undanr\u00f6jd \u00e5tg\u00e4rd"),
    @XmlEnumValue("Uteslutning")
    UTESLUTNING("Uteslutning"),
    @XmlEnumValue("V\u00e4gf\u00f6rr\u00e4ttning")
    VÄGFÖRRÄTTNING("V\u00e4gf\u00f6rr\u00e4ttning"),
    @XmlEnumValue("\u00c5bodelning")
    ÅBODELNING("\u00c5bodelning"),
    @XmlEnumValue("\u00c4ndrat andelstal")
    ÄNDRAT_ANDELSTAL("\u00c4ndrat andelstal"),
    @XmlEnumValue("\u00c4gander\u00e4ttsutredning")
    ÄGANDERÄTTSUTREDNING("\u00c4gander\u00e4ttsutredning"),
    @XmlEnumValue("\u00c4gom\u00e4tning")
    ÄGOMÄTNING("\u00c4gom\u00e4tning"),
    @XmlEnumValue("\u00c4gostyckning")
    ÄGOSTYCKNING("\u00c4gostyckning"),
    @XmlEnumValue("\u00c4goutbyte")
    ÄGOUTBYTE("\u00c4goutbyte"),
    @XmlEnumValue("\u00c4ULL-f\u00f6rr\u00e4ttning")
    ÄULL_FÖRRÄTTNING("\u00c4ULL-f\u00f6rr\u00e4ttning"),
    @XmlEnumValue("\u00d6verenskommelse enligt anl\u00e4ggningslagen")
    ÖVERENSKOMMELSE_ENLIGT_ANLÄGGNINGSLAGEN("\u00d6verenskommelse enligt anl\u00e4ggningslagen"),
    @XmlEnumValue("\u00d6vriga \u00e5tg\u00e4rder")
    ÖVRIGA_ÅTGÄRDER("\u00d6vriga \u00e5tg\u00e4rder"),
    @XmlEnumValue("Arealutredning")
    AREALUTREDNING("Arealutredning"),
    @XmlEnumValue("Arealkomplettering")
    AREALKOMPLETTERING("Arealkomplettering"),
    @XmlEnumValue("M\u00e4tning")
    MÄTNING("M\u00e4tning"),
    @XmlEnumValue("Nybyggnadskarta")
    NYBYGGNADSKARTA("Nybyggnadskarta"),
    @XmlEnumValue("Nym\u00e4tning")
    NYMÄTNING("Nym\u00e4tning"),
    @XmlEnumValue("S\u00e4kerst\u00e4llande av gr\u00e4nsm\u00e4rke")
    SÄKERSTÄLLANDE_AV_GRÄNSMÄRKE("S\u00e4kerst\u00e4llande av gr\u00e4nsm\u00e4rke"),
    @XmlEnumValue("Utredning")
    UTREDNING("Utredning"),
    @XmlEnumValue("\u00c5terst\u00e4llande av gr\u00e4nsm\u00e4rke")
    ÅTERSTÄLLANDE_AV_GRÄNSMÄRKE("\u00c5terst\u00e4llande av gr\u00e4nsm\u00e4rke");
    private final String value;

    FastighetsatgardstypType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FastighetsatgardstypType fromValue(String v) {
        for (FastighetsatgardstypType c: FastighetsatgardstypType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
