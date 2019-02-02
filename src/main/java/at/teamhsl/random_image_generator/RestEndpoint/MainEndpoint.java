package at.teamhsl.random_image_generator.RestEndpoint;

// Start of user code (user defined imports)

// End of user code

@org.springframework.web.bind.annotation.RestController
public class MainEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.GetMapping("/GetImageURL")
	public WebURL GetImageURL() throws Exception {
		// Start of user code GetImageURL
		WebURL res = new WebURL();
		RandomWordHelper rwh = new RandomWordHelper();
		RandomImageURLHelper riuh = new RandomImageURLHelper();
		res.RandomWord = rwh.GetRandomWord();
		res.ImageURL = riuh.GetRandomImageURL(res.RandomWord);
		return res;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
