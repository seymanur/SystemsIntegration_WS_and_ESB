package ws;

import javax.jws.WebService;
@WebService
public interface ClientNews {	
	String addXMLNews(String xmlfile);
}
