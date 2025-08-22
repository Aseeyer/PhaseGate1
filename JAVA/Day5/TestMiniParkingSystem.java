import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MiniParkingSystemTest {

    @Test
    void testParkCar() {
        MiniParkingSystem.resetParking();
        String result = MiniParkingSystem.parkCar();
        assertEquals("Your car has been parked at 1", result);
        assertEquals(1, MiniParkingSystem.getParking()[0]);
    }

    @Test
    void testRemoveCar() {
        MiniParkingSystem.resetParking();
        MiniParkingSystem.parkCar();
        String result = MiniParkingSystem.removeCar(1);
        assertEquals("Car removed from slot 1", result);
        assertEquals(0, MiniParkingSystem.getParking()[0]);
    }

    @Test
    void testRemoveEmptySlot() {
        MiniParkingSystem.resetParking();
        String result = MiniParkingSystem.removeCar(1);
        assertEquals("The parking space at 1 is already empty, so there is space for you to park into.", result);
    }

    @Test
    void testInvalidSlot() {
        MiniParkingSystem.resetParking();
        String result = MiniParkingSystem.removeCar(21);
        assertEquals("Invalid car parking space number!", result);
    }

    @Test
    void testParkingFull() {
        MiniParkingSystem.resetParking();
        for (int i = 0; i < 20; i++) {
            MiniParkingSystem.parkCar();
        }
        String result = MiniParkingSystem.parkCar();
        assertEquals("Sorry! The Parking lot is currently full, you can opt to drive out some to repark another.", result);
    }
}
