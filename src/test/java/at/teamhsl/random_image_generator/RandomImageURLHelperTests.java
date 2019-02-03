package at.teamhsl.random_image_generator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import at.teamhsl.random_image_generator.Helpers.RandomImageURLHelper;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class RandomImageURLHelperTests {
    @Test
    public void TestJSONparsing(){
        String examplejson = "{\n" +
                " \"kind\": \"customsearch#search\",\n" +
                " \"url\": {\n" +
                "  \"type\": \"application/json\",\n" +
                "  \"template\": \"https://www.googleapis.com/customsearch/v1?q={searchTerms}&num={count?}&start={startIndex?}&lr={language?}&safe={safe?}&cx={cx?}&sort={sort?}&filter={filter?}&gl={gl?}&cr={cr?}&googlehost={googleHost?}&c2coff={disableCnTwTranslation?}&hq={hq?}&hl={hl?}&siteSearch={siteSearch?}&siteSearchFilter={siteSearchFilter?}&exactTerms={exactTerms?}&excludeTerms={excludeTerms?}&linkSite={linkSite?}&orTerms={orTerms?}&relatedSite={relatedSite?}&dateRestrict={dateRestrict?}&lowRange={lowRange?}&highRange={highRange?}&searchType={searchType}&fileType={fileType?}&rights={rights?}&imgSize={imgSize?}&imgType={imgType?}&imgColorType={imgColorType?}&imgDominantColor={imgDominantColor?}&alt=json\"\n" +
                " },\n" +
                " \"queries\": {\n" +
                "  \"request\": [\n" +
                "   {\n" +
                "    \"title\": \"Google Custom Search - cat\",\n" +
                "    \"totalResults\": \"7880000000\",\n" +
                "    \"searchTerms\": \"cat\",\n" +
                "    \"count\": 1,\n" +
                "    \"startIndex\": 1,\n" +
                "    \"inputEncoding\": \"utf8\",\n" +
                "    \"outputEncoding\": \"utf8\",\n" +
                "    \"safe\": \"off\",\n" +
                "    \"cx\": \"000784618626346885213:r14xhqlh_xc\",\n" +
                "    \"searchType\": \"image\",\n" +
                "    \"imgSize\": \"xlarge\"\n" +
                "   }\n" +
                "  ],\n" +
                "  \"nextPage\": [\n" +
                "   {\n" +
                "    \"title\": \"Google Custom Search - cat\",\n" +
                "    \"totalResults\": \"7880000000\",\n" +
                "    \"searchTerms\": \"cat\",\n" +
                "    \"count\": 1,\n" +
                "    \"startIndex\": 2,\n" +
                "    \"inputEncoding\": \"utf8\",\n" +
                "    \"outputEncoding\": \"utf8\",\n" +
                "    \"safe\": \"off\",\n" +
                "    \"cx\": \"000784618626346885213:r14xhqlh_xc\",\n" +
                "    \"searchType\": \"image\",\n" +
                "    \"imgSize\": \"xlarge\"\n" +
                "   }\n" +
                "  ]\n" +
                " },\n" +
                " \"context\": {\n" +
                "  \"title\": \"FHVCI\"\n" +
                " },\n" +
                " \"searchInformation\": {\n" +
                "  \"searchTime\": 0.424064,\n" +
                "  \"formattedSearchTime\": \"0.42\",\n" +
                "  \"totalResults\": \"7880000000\",\n" +
                "  \"formattedTotalResults\": \"7,880,000,000\"\n" +
                " },\n" +
                " \"items\": [\n" +
                "  {\n" +
                "   \"kind\": \"customsearch#result\",\n" +
                "   \"title\": \"Cat, eye, green eye and whiskers HD photo by Erik-Jan Leusink ...\",\n" +
                "   \"htmlTitle\": \"\\u003cb\\u003eCat\\u003c/b\\u003e, eye, green eye and whiskers HD photo by Erik-Jan Leusink ...\",\n" +
                "   \"link\": \"TestLink\",\n" +
                "   \"displayLink\": \"unsplash.com\",\n" +
                "   \"snippet\": \"Cat, eye, green eye and whiskers HD photo by Erik-Jan Leusink ...\",\n" +
                "   \"htmlSnippet\": \"\\u003cb\\u003eCat\\u003c/b\\u003e, eye, green eye and whiskers HD photo by Erik-Jan Leusink ...\",\n" +
                "   \"mime\": \"image/\",\n" +
                "   \"image\": {\n" +
                "    \"contextLink\": \"https://unsplash.com/photos/IbPxGLgJiMI\",\n" +
                "    \"height\": 667,\n" +
                "    \"width\": 1000,\n" +
                "    \"byteSize\": 129408,\n" +
                "    \"thumbnailLink\": \"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSmH9Mtn6yU4UNg4RcP0CFOwO383jXSJxytFHd3e5GaIVI8i7CiRri_Y_FD\",\n" +
                "    \"thumbnailHeight\": 99,\n" +
                "    \"thumbnailWidth\": 149\n" +
                "   }\n" +
                "  }\n" +
                " ]\n" +
                "}";

                assertEquals("TestLink", RandomImageURLHelper.getLinkFromJSON(new JSONObject(examplejson)));
    }
}