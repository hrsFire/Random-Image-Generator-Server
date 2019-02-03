package at.teamhsl.random_image_generator.Helpers;

// Start of user code (user defined imports)
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;
// End of user code

public class RandomWordHelper {
	/**
	 * Description of the property APIKEY.
	 */
	private String APIKEY = null;
	
	/**
	 * Description of the property APIURL.
	 */
	private String APIURL = null;
	
	// Start of user code (user defined attributes)
	// End of user code
	

	private static RandomWordHelper INSTANCE;
	
	private RandomWordHelper(){
	    // singleton
	}
	
	public static RandomWordHelper getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new RandomWordHelper();
	    }
	
	    return INSTANCE;
	}
	
	public static String GetRandomWord() throws Exception {
		// Start of user code GetRandomWord
		URL url = new URL("https://random-word-api.herokuapp.com/key");
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
		String apiKey = resp.toString();


		String Url = "https://random-word-api.herokuapp.com/word?key=" + URLEncoder.encode(apiKey, "UTF-8")  + "&number=1";
		url = new URL(Url);
		con = (HttpsURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		isr = new InputStreamReader(con.getInputStream());
		br = new BufferedReader(isr);
		resp = new StringBuffer();

		while ((inp = br.readLine()) != null) {
			resp.append(inp);
		}

		isr.close();
		String respstr = resp.toString();

		return TruncateResponse(respstr);
		// End of user code
	}
	
	// Start of user code (user defined operations)
	public static String TruncateResponse(String respstr){
		return respstr.substring(2, respstr.length() - 2);
	}
	// End of user code
	
}
