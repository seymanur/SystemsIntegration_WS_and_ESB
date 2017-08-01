package user;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {

    public static void main(String[] args) {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	String email = null;
	String digestType = null;
	String region = null;
	try {
	    System.out.print("Please enter your email address : ");
	    email = reader.readLine();
	    System.out.println("Please enter digest type as : digest or non-digest: ");
	    digestType = reader.readLine();
	    System.out.println("Please your favourite region: US, Latin America,  ");
	    region = reader.readLine();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	System.out.println("You entered email: " + email);
	System.out.println("You entered digest type: " + digestType);
	System.out.println("You entered region: " + region);

	/*// ===== In Java 5, Java.util,Scanner is used for this purpose.
	Scanner in = new Scanner(System.in);
	System.out.print("Please enter user name : ");
	username = in.nextLine();
	System.out.println("You entered : " + username);
	 */
	/*
	// ====== Java 6
	Console console = System.console();
	username = console.readLine("Please enter user name : ");
	System.out.println("You entered : " + username);
	 */
    }
}
