import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RandomWordHelperTests {
    @Test
    public void testTruncation(){
        String teststr = "[test]";
        assertEquals("test", RandomWordHelper.TruncateResponse(teststr));
    }
}