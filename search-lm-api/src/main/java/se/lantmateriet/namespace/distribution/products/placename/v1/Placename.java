
package se.lantmateriet.namespace.distribution.products.placename.v1;

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
@WebService(name = "placename", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    net.opengis.gml.v_3_1_1.profiles.gmlsfprofile.v_1_0_0.ObjectFactory.class,
    se.lantmateriet.namespace.distribution.products.placename.v1.ObjectFactory.class
})
public interface Placename {


    /**
     * 
     * @param findOrtnamnRequest
     * @return
     *     returns se.lantmateriet.namespace.distribution.products.placename.v1.FindOrtnamnResponse
     */
    @WebMethod(operationName = "FindOrtnamn")
    @WebResult(name = "FindOrtnamnResponse", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", partName = "FindOrtnamnResponse")
    public FindOrtnamnResponse findOrtnamn(
        @WebParam(name = "FindOrtnamnRequest", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", partName = "FindOrtnamnRequest")
        FindOrtnamnRequest findOrtnamnRequest);

    /**
     * 
     * @param findOrtnamnsreferensRequest
     * @return
     *     returns se.lantmateriet.namespace.distribution.products.placename.v1.FindOrtnamnsreferensResponse
     */
    @WebMethod(operationName = "FindOrtnamnsreferens")
    @WebResult(name = "FindOrtnamnsreferensResponse", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", partName = "FindOrtnamnsreferensResponse")
    public FindOrtnamnsreferensResponse findOrtnamnsreferens(
        @WebParam(name = "FindOrtnamnsreferensRequest", targetNamespace = "http://namespace.lantmateriet.se/distribution/products/placename/v1", partName = "FindOrtnamnsreferensRequest")
        FindOrtnamnsreferensRequest findOrtnamnsreferensRequest);

}
