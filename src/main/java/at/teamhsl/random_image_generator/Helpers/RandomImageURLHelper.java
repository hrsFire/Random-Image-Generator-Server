package at.teamhsl.random_image_generator.Helpers;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
// Start of user code (user defined imports)

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

// End of user code

public class RandomImageURLHelper {
	/**
	 * Description of the property APIKEY.
	 */
	public String APIKEY = "AIzaSyC8BSPovw3UtoxwL9tAMfj7XcIpBoCMrXU";
	
	/**
	 * Description of the property APIURL.
	 */
	public String APIURL = "https://www.googleapis.com/customsearch/v1?q=cat&cx=000784618626346885213%3Ar14xhqlh_xc&imgSize=xlarge&num=1&searchType=image&key=";
	
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static RandomImageURLHelper INSTANCE;
	
	private RandomImageURLHelper(){
	    // singleton
	}
	
	public static RandomImageURLHelper getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new RandomImageURLHelper();
	    }
	
	    return INSTANCE;
	}
	
	public String GetRandomImageURL(String Word) throws Exception {
		// Start of user code GetRandomImageURL
		APIKEY = "AIzaSyC8BSPovw3UtoxwL9tAMfj7XcIpBoCMrXU";
		APIURL = "https://www.googleapis.com/customsearch/v1?q="+Word+"&cx=000784618626346885213%3Ar14xhqlh_xc&imgSize=xlarge&num=1&searchType=image&key=";
		URL url = new URL(APIURL + APIKEY);
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		InputStreamReader isr = new InputStreamReader(con.getInputStream());
		BufferedReader br = new BufferedReader(isr);
		StringBuffer resp = new StringBuffer();
		String inp;
		while((inp = br.readLine()) != null) {
			resp.append(inp);
		}
		isr.close();
		String respstr = resp.toString();
		JSONParser jsnparser = new JSONParser();
		JSONObject json = (JSONObject) jsnparser.parse(respstr);
		JSONArray jarr = (JSONArray) json.get("items");
		return (String) json.get("link");
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
