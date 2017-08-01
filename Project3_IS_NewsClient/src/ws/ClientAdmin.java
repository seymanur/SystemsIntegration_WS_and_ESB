package ws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import artifact.ClientNews;
import artifact.ClientNewsService;

public class ClientAdmin {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	ClientNewsService newsService = new ClientNewsService();
	ClientNews newsClient = newsService.getClientNewsPort();

	try {
	    /* String fileDir= null;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Please add the directory of the xml file");
	    fileDir = scanner.nextLine();*/
	    String fileDir = "last.xml";

	    newsClient.addXMLNews(sendNews(fileDir));
	}
	catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    public static String sendNews(String fileDir) throws IOException
    {
	//String fileDir = "newscnn.xml";
	BufferedReader br = new BufferedReader(new FileReader(new File(fileDir)));
	String line;
	String st = "";

	while((line=br.readLine())!= null){
	    System.out.println(line);
	    st = st + line;
	}
	return st;
    }

}
