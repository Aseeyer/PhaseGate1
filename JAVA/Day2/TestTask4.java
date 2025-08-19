import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestTask4 {

    @Test
    public void testEnoughFuelExactDistance() {
        boolean result = Task4.isPossibleOrNot(50, 25, 2);
        assertTrue(result);
    }

    @Test
    public void testNotEnoughFuel() {
        boolean result = Task4.isPossibleOrNot(100, 25, 2);
        assertFalse(result);
    }

    @Test
    public void testMoreThanEnoughFuel() {
        boolean result = Task4.isPossibleOrNot(40, 25, 2);
        assertTrue(result);
    }

    @Test
    public void testZeroFuel() {
        boolean result = Task4.isPossibleOrNot(10, 25, 0);
        assertFalse(result);
    }
}
