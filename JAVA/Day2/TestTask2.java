import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTask2 {

    @Test
    public void testThatReturnsAGrade() {
        char grade = Task2.getAverage(95, 92, 90);
        assertEquals('A', grade);
    }

    @Test
    public void testThatReturnsBGrade() {
        char grade = Task2.getAverage(85, 80, 82);
        assertEquals('B', grade);
    }

    @Test
    public void testThatReturnsCGrade() {
        char grade = Task2.getAverage(72, 75, 70);
        assertEquals('C', grade);
    }

    @Test
    public void testThatReturnsFGrade() {
        char grade = Task2.getAverage(50, 55, 40);
        assertEquals('F', grade);
    }
}
