
package artifact;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClientNews", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClientNews {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addXMLNews", targetNamespace = "http://ws/", className = "artifact.AddXMLNews")
    @ResponseWrapper(localName = "addXMLNewsResponse", targetNamespace = "http://ws/", className = "artifact.AddXMLNewsResponse")
    public String addXMLNews(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}