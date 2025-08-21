import java.util.ArrayList;
import java.util.Scanner;

public class GroceryManagerApp {

    public static ArrayList<String> groceryList = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        System.out.println("What is your name? ");
        String userName = scanner.nextLine().toUpperCase();
        System.out.println("Welcome Mr " + userName + " to your personal grocery app");
        System.out.println("\n|=-=-=-= " + userName + " Manager App =-=-=-=|");

        while (running) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> showItems();
                case 0 -> {
                    running = false;
                    System.out.println("Exiting Grocery Manager App. Goodbye!");
                }
                default -> System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static void showMenu() {
        System.out.println("\nWhat would you like to do today on your grocery app?");
        System.out.println("1. Add an Item");
        System.out.println("2. Remove an Item");
        System.out.println("3. Show All Items");
        System.out.println("0. Exit the grocery app");
    }

    public static int getUserChoice() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Dear Sir, this is an invalid input. Please enter a number.");
            return -1;
        }
    }

    public static void addItem() {
        System.out.print("Enter any item of your choice to add: ");
        String itemToAdd = scanner.nextLine();
        groceryList.add(itemToAdd);
        System.out.println("'" + itemToAdd + "' added successfully!");
    }

    public static void removeItem() {
        System.out.print("Enter item to remove: ");
        String itemToRemove = scanner.nextLine();
        if (groceryList.remove(itemToRemove)) {
            System.out.println("'" + itemToRemove + "' removed successfully!");
        } else {
            System.out.println("'" + itemToRemove + "' not found in the list.");
        }
    }

    public static void showItems() {
        System.out.println("\n--- Grocery List ---");
        if (groceryList.isEmpty()) {
            System.out.println("No items in the list.");
        } else {
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }
}
