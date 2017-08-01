
package artifact;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the artifact package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddXMLNews_QNAME = new QName("http://ws/", "addXMLNews");
    private final static QName _AddXMLNewsResponse_QNAME = new QName("http://ws/", "addXMLNewsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: artifact
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddXMLNews }
     * 
     */
    public AddXMLNews createAddXMLNews() {
        return new AddXMLNews();
    }

    /**
     * Create an instance of {@link AddXMLNewsResponse }
     * 
     */
    public AddXMLNewsResponse createAddXMLNewsResponse() {
        return new AddXMLNewsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddXMLNews }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addXMLNews")
    public JAXBElement<AddXMLNews> createAddXMLNews(AddXMLNews value) {
        return new JAXBElement<AddXMLNews>(_AddXMLNews_QNAME, AddXMLNews.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddXMLNewsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addXMLNewsResponse")
    public JAXBElement<AddXMLNewsResponse> createAddXMLNewsResponse(AddXMLNewsResponse value) {
        return new JAXBElement<AddXMLNewsResponse>(_AddXMLNewsResponse_QNAME, AddXMLNewsResponse.class, null, value);
    }

}
