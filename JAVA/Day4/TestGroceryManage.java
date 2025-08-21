import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGroceryManage {

    @Test
    public void testAddItem() {
        GroceryManagerApp.groceryList.clear();
        GroceryManagerApp.groceryList.add("Milk");
        assertTrue(GroceryManagerApp.groceryList.contains("Milk"));
    }

    @Test
    public void testRemoveItem() {
        GroceryManagerApp.groceryList.clear();
        GroceryManagerApp.groceryList.add("Bread");
        GroceryManagerApp.groceryList.remove("Bread");
        assertFalse(GroceryManagerApp.groceryList.contains("Bread"));
    }

    @Test
    public void testShowItems() {
        GroceryManagerApp.groceryList.clear();
        GroceryManagerApp.groceryList.add("Eggs");
        assertEquals(1, GroceryManagerApp.groceryList.size());
        assertEquals("Eggs", GroceryManagerApp.groceryList.get(0));
    }
}
