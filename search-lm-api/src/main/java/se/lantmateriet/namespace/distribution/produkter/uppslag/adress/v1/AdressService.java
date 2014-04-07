
package se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "AdressService", targetNamespace = "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", wsdlLocation = "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1/adress-1.1.wsdl")
public class AdressService
    extends Service
{

    private final static URL ADRESSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1.AdressService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = se.lantmateriet.namespace.distribution.produkter.uppslag.adress.v1.AdressService.class.getResource(".");
            url = new URL(baseUrl, "http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1/adress-1.1.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1/adress-1.1.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        ADRESSSERVICE_WSDL_LOCATION = url;
    }

    public AdressService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AdressService() {
        super(ADRESSSERVICE_WSDL_LOCATION, new QName("http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", "AdressService"));
    }

    /**
     * 
     * @return
     *     returns AdressPortType
     */
    @WebEndpoint(name = "AdressSoapBinding")
    public AdressPortType getAdressSoapBinding() {
        return super.getPort(new QName("http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", "AdressSoapBinding"), AdressPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AdressPortType
     */
    @WebEndpoint(name = "AdressSoapBinding")
    public AdressPortType getAdressSoapBinding(WebServiceFeature... features) {
        return super.getPort(new QName("http://namespace.lantmateriet.se/distribution/produkter/uppslag/adress/v1", "AdressSoapBinding"), AdressPortType.class, features);
    }

}
