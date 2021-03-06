package at.teamhsl.random_image_generator.RestEndpoint;

// Start of user code (user defined imports)
import at.teamhsl.random_image_generator.Helpers.RandomImageURLHelper;
import at.teamhsl.random_image_generator.Helpers.RandomWordHelper;
import at.teamhsl.random_image_generator.Model.WordURL;
import org.springframework.web.bind.annotation.PathVariable;
// End of user code

@org.springframework.web.bind.annotation.RestController
public class MainEndpoint {
	// Start of user code (user defined attributes)
	
	// End of user code
	
	
	@org.springframework.web.bind.annotation.GetMapping("/GetImageURL/{searchValue}")
	public at.teamhsl.random_image_generator.Model.WordURL GetImageURL(@PathVariable("searchValue") String searchValue) throws Exception {
		// Start of user code GetImageURL
		WordURL res = new WordURL();
		res.RandomWord = searchValue + " " + RandomWordHelper.GetRandomWord();
		res.ImageURL = RandomImageURLHelper.GetRandomImageURL(res.RandomWord);
		return res;
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
}
