package ws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import artifact.Subscription;
import artifact.SubscriptionService;

public class ClientWS {

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException{
	/*SoapService ss= new SoapService();
	Soap ns = ss.getSoapPort();
	ns.getXMLFile("");
	 */
	sendUserInfo();
    }


    public static void sendUserInfo()
    {
	SubscriptionService subsService = new SubscriptionService();
	Subscription subs = subsService.getSubscriptionPort();
	String email = null;
	String digestType = null;
	String region = null;
	int sub = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("For subscription enter 1, for unsubscription enter 2 please.");
	sub = scanner.nextInt();
	boolean emailcheck;
	switch (sub) {
	case 1:
	    Scanner sn = new Scanner(System.in);
	    System.out.print("Please enter your email address : ");
	    email = sn.nextLine();
	    emailcheck =emailConfirm(email);
	    if(!emailcheck)
	    {
		System.out.println("Please enter a valid email: ");
		email =sn.nextLine();
	    }

	    System.out.println("Please enter digest type as : digest or non-digest: ");
	    digestType = sn.nextLine();
	    System.out.println("Please your favourite region as: US(us), Latin America(lamerica), Africa(africa), Asia(asia), Europe(europe), Middle East(meast) ");
	    region = sn.nextLine();
	    System.out.println("You entered email: " + email);
	    System.out.println("You entered digest type: " + digestType);
	    System.out.println("You entered region: " + region);
	    System.out.println(subs.subscribeUser(email, digestType, region));
	    break;
	case 2:
	    Scanner s = new Scanner(System.in);
	    System.out.print("Please enter your email address : ");
	    email = s.nextLine();
	    System.out.println(subs.unsubscribeUser(email));
	    break;

	}
    }


    /* System.out.println(subs.subscribeUser(email, digestType, region));
    subs.subscribeUser(email, digestType, region);*/

    public static void sendNews() throws IOException
    {
	/*ClientService clientService = new ClientService();
	Client client = clientService.getClientPort();*/

	String fileDir = "newscnn.xml";
	BufferedReader br;
	try {
	    br = new BufferedReader(new FileReader(new File(fileDir)));


	    //File file = new File(fileDir);
	    /*FileReader in = new FileReader(file);*/

	    //BufferedReader br = new BufferedReader(in);
	    String line;
	    StringBuilder sb = new StringBuilder();

	    String st = "";
	    try {
		while((line=br.readLine())!= null){
		    System.out.println(line);
		    st = st + line;
		}
	    }
	    catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }}
	catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	/*client.addXMLFile(st);*/


	System.out.println("");


	//ns.getXMLFile(st);
	// ns.createUser(email, digestType, region);
    }

    public static Boolean emailConfirm(String email1)
    {
	String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
	email1= "user@domain.com";
	Boolean b = email1.matches(EMAIL_REGEX);
	System.out.println("is e-mail: "+email1+" :Valid = " + b);
	return b;
    }

}
