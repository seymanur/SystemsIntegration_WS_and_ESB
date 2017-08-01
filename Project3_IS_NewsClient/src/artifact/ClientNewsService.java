
package artifact;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClientNewsService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8081/ClientNews?wsdl")
public class ClientNewsService
    extends Service
{

    private final static URL CLIENTNEWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTNEWSSERVICE_EXCEPTION;
    private final static QName CLIENTNEWSSERVICE_QNAME = new QName("http://ws/", "ClientNewsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/ClientNews?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTNEWSSERVICE_WSDL_LOCATION = url;
        CLIENTNEWSSERVICE_EXCEPTION = e;
    }

    public ClientNewsService() {
        super(__getWsdlLocation(), CLIENTNEWSSERVICE_QNAME);
    }

    public ClientNewsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTNEWSSERVICE_QNAME, features);
    }

    public ClientNewsService(URL wsdlLocation) {
        super(wsdlLocation, CLIENTNEWSSERVICE_QNAME);
    }

    public ClientNewsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTNEWSSERVICE_QNAME, features);
    }

    public ClientNewsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClientNewsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClientNews
     */
    @WebEndpoint(name = "ClientNewsPort")
    public ClientNews getClientNewsPort() {
        return super.getPort(new QName("http://ws/", "ClientNewsPort"), ClientNews.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClientNews
     */
    @WebEndpoint(name = "ClientNewsPort")
    public ClientNews getClientNewsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "ClientNewsPort"), ClientNews.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTNEWSSERVICE_EXCEPTION!= null) {
            throw CLIENTNEWSSERVICE_EXCEPTION;
        }
        return CLIENTNEWSSERVICE_WSDL_LOCATION;
    }

}
