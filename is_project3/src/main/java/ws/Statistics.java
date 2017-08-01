package ws;

import javax.jws.WebService;

@WebService
public interface Statistics {
	int totalNews();
	int emailsDigest();
    int emailsNonDigest();
    int numTwitter();
    String totalNewsByGenre();
}
