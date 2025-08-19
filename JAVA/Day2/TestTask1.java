import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask1 {

    @Test
    public void testFatherOlderTwiceInPast() {
        int fatherAge = 50;
        int sonAge = 20;
        int result = Task1.ageGapCalculator(fatherAge, sonAge);
        assertEquals(10, result);
    }

    @Test
    public void testFatherWillBeTwiceInFuture() {
        int fatherAge = 30;
        int sonAge = 20;
        int result = Task1.ageGapCalculator(fatherAge, sonAge);
        assertEquals(10, result);
    }

    @Test
    public void testFatherExactlyTwiceNow() {
        int fatherAge = 40;
        int sonAge = 20;
        int result = Task1.ageGapCalculator(fatherAge, sonAge);
        assertEquals(0, result);
    }

    @Test
    public void testWithYoungFather() {
        int fatherAge = 22;
        int sonAge = 10;
        int result = Task1.ageGapCalculator(fatherAge, sonAge);
        assertEquals(2, result);
    }
}
