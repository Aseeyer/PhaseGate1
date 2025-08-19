import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask3 {

    @Test
    public void testNoOneLikesThis() {
        String result = Task3.getLikes(new String[]{});
        assertEquals("no one likes this", result);
    }

    @Test
    public void testSinglePersonLikesThis() {
        String result = Task3.getLikes(new String[]{"Peter"});
        assertEquals("Peter likes this", result);
    }

    @Test
    public void testTwoPeopleLikeThis() {
        String result = Task3.getLikes(new String[]{"Jacob", "Alex"});
        assertEquals("Jacob and Alex like this", result);
    }

    @Test
    public void testMoreThanThreePeopleLikeThis() {
        String result = Task3.getLikes(new String[]{"Alex", "Jacob", "Mark", "Max"});
        assertEquals("Alex, Jacob and 2 others like this", result);
    }
}
