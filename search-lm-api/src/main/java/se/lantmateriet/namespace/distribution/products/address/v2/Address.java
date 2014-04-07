
package se.lantmateriet.namespace.distribution.products.address.v2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "address", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/address/v2")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.ObjectFactory.class,
    se.lantmateriet.namespace.distribution.products.address.v2.ObjectFactory.class
})
public interface Address {


    /**
     * 
     * @param findAdressRequest
     * @return
     *     returns se.lantmateriet.namespace.distribution.products.address.v2.FindAdressResponse
     */
    @WebMethod(operationName = "FindAdress")
    @WebResult(name = "FindAdressResponse", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/address/v2", partName = "FindAdressResponse")
    public FindAdressResponse findAdress(
        @WebParam(name = "FindAdressRequest", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/address/v2", partName = "FindAdressRequest")
        FindAdressRequest findAdressRequest);

    /**
     * 
     * @param findAdressreferensRequest
     * @return
     *     returns se.lantmateriet.namespace.distribution.products.address.v2.FindAdressreferensResponse
     */
    @WebMethod(operationName = "FindAdressreferens")
    @WebResult(name = "FindAdressreferensResponse", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/address/v2", partName = "FindAdressreferensResponse")
    public FindAdressreferensResponse findAdressreferens(
        @WebParam(name = "FindAdressreferensRequest", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/address/v2", partName = "FindAdressreferensRequest")
        FindAdressreferensRequest findAdressreferensRequest);

}
