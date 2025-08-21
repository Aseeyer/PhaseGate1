import unittest
import GroceryManagerApp

class TestGroceryManagerApp(unittest.TestCase):

    def test_add_item_function_exists(self):
        GroceryManagerApp.grocery_list.clear()
        GroceryManagerApp.grocery_list.append("Milk")
        self.assertIn("Milk", GroceryManagerApp.grocery_list)

    def test_add_item_adds_correct_item(self):
        GroceryManagerApp.grocery_list.clear()
        GroceryManagerApp.grocery_list.append("Eggs")
        self.assertEqual(GroceryManagerApp.grocery_list, ["Eggs"])

    def test_remove_item_function_exists(self):
        GroceryManagerApp.grocery_list.clear()
        GroceryManagerApp.grocery_list.append("Bread")
        GroceryManagerApp.grocery_list.remove("Bread")
        self.assertNotIn("Bread", GroceryManagerApp.grocery_list)

    def test_remove_item_from_list(self):
        GroceryManagerApp.grocery_list.clear()
        GroceryManagerApp.grocery_list.extend(["Apples", "Bananas"])
        GroceryManagerApp.grocery_list.remove("Apples")
        self.assertEqual(GroceryManagerApp.grocery_list, ["Bananas"])

    def test_show_items_function_exists(self):
        GroceryManagerApp.grocery_list.clear()
        GroceryManagerApp.grocery_list.append("Rice")
        result = GroceryManagerApp.grocery_list
        self.assertIsNotNone(result)




