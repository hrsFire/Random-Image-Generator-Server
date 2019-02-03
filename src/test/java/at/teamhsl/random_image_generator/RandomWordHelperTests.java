package at.teamhsl.random_image_generator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import at.teamhsl.random_image_generator.Helpers.RandomWordHelper;
import org.junit.jupiter.api.Test;

public class RandomWordHelperTests {
    @Test
    public void testTruncation(){
        String teststr = "[test]";
        assertEquals("es", RandomWordHelper.TruncateResponse(teststr));
    }
}