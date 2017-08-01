
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
@WebServiceClient(name = "SubscriptionService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8081/Subscription?wsdl")
public class SubscriptionService
    extends Service
{

    private final static URL SUBSCRIPTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUBSCRIPTIONSERVICE_EXCEPTION;
    private final static QName SUBSCRIPTIONSERVICE_QNAME = new QName("http://ws/", "SubscriptionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/Subscription?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUBSCRIPTIONSERVICE_WSDL_LOCATION = url;
        SUBSCRIPTIONSERVICE_EXCEPTION = e;
    }

    public SubscriptionService() {
        super(__getWsdlLocation(), SUBSCRIPTIONSERVICE_QNAME);
    }

    public SubscriptionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUBSCRIPTIONSERVICE_QNAME, features);
    }

    public SubscriptionService(URL wsdlLocation) {
        super(wsdlLocation, SUBSCRIPTIONSERVICE_QNAME);
    }

    public SubscriptionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUBSCRIPTIONSERVICE_QNAME, features);
    }

    public SubscriptionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SubscriptionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Subscription
     */
    @WebEndpoint(name = "SubscriptionPort")
    public Subscription getSubscriptionPort() {
        return super.getPort(new QName("http://ws/", "SubscriptionPort"), Subscription.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Subscription
     */
    @WebEndpoint(name = "SubscriptionPort")
    public Subscription getSubscriptionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "SubscriptionPort"), Subscription.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUBSCRIPTIONSERVICE_EXCEPTION!= null) {
            throw SUBSCRIPTIONSERVICE_EXCEPTION;
        }
        return SUBSCRIPTIONSERVICE_WSDL_LOCATION;
    }

}