package ws;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import artifact.Statistics;
import artifact.StatisticsService;

public class ClientStats {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	/*GetStatisticsService as = new GetStatisticsService();
	GetStatistics asp = as.getGetStatisticsPort();*/
	StatisticsService service = new StatisticsService();
	Statistics stat = service.getStatisticsPort();

	int stats = 0;
	while (stats != 6)
	{
	    Scanner scan = new Scanner(System.in);
	    System.out.println("--------------  Statistics ------------");
	    System.out.println("For Total Processes News              1");
	    System.out.println("Number of  Digest Emails Sent         2");
	    System.out.println("Number of  Non-digest Emails          3");
	    System.out.println("Number of  Twitter Messages Posted    4");
	    System.out.println("Number of  News for Each Region       5");
	    System.out.println("Exit                                  6");
	    stats = scan.nextInt();
	    switch (stats) {
	    case 1:
		System.out.println("Processes Total News: " + stat.totalNews());
		//System.out.println("Processed Movies " + asp.getMoviesProcessed());
		break;
	    case 2:
		System.out.println("Digest Mails Sent: " + stat.emailsDigest());

		//System.out.println("Digest Mails Sent " + asp.getNDigestMailsSent());
		break;
	    case 3:
		System.out.println("Non-digest Mails Sent " + stat.emailsNonDigest());

		//System.out.println("Non-digest Mails Sent " + asp.getNNonDigestMailsSent());
		break;
	    case 4:
		System.out.println("Total Tweets: " + stat.numTwitter());

		break;
	    case 5:
		//System.out.println("Count by Region: " + stat.totalNewsByGenre());
		String regions = stat.totalNewsByGenre();
		JSONObject reg = new JSONObject();
		//reg.
		JSONParser parser = new JSONParser();
		System.out.println("Count by Region: ");
		Object obj;
		try {
		    obj = parser.parse(regions);

		    JSONArray array = (JSONArray)obj;
		    for(int i = 0; i<array.size(); i++)
		    {
			pars(array.get(i).toString());
		    }
		}
		catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		break;
	    }
	}
    }


    public static void pars(String regions)
    {
	String [] r = regions.split("}, "); // new JSONObject(stats);

	//System.out.println(regions);
	for (int i = 0; i < r.length; i++)
	{
	    r[i] = r[i].replace("{", "");
	    System.out.println();
	    r[i] = r[i].replace("]", "");
	    System.out.println();
	    r[i] = r[i].replace("[", "");
	    System.out.println();
	    r[i] = r[i].replace("}", "");
	    System.out.println(r[i]);
	}
    }
}

