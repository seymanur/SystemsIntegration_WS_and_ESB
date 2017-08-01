package ws;

import javax.jws.WebService;

@WebService
public interface Subscription {
	 String subscribeUser(String email, String digestType, String favouriteRegion);
	 String unsubscribeUser(String email);
}
