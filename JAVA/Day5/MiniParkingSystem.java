/*
My Thought Process...

create an empty array, which is set to hold 20 spaces for the cars to be parked.
welcome user and prompt for the user for their name.
using more prompts to ask the user what they want to do in the app.
create switch cases for user input
selecting one would allow user to park their car.
selecting two would allow user to remove a car from the slot based on user's input.
selecting three would show all availabe and filled up slots.
using functions to implement the three switch cases.

funtion one, using a loop, goes through the spaces.
it checks, if the space is empty(0), then adds a car(1) if it is empty.

function two, takes the user input, checks if it is lesser or equals to the total spaces
then using loop to go to specified user input and subtracts from it(leaving an empty space).

function three using the stringBuilder to create a new stringBuilder - status that appends each s in parking spaces
and another append to add space. calling a to string method to return the stringBuilder's contents as a String, with it's results applied to s

*/




import java.util.Scanner;

public class MiniParkingSystem {


    private static final int SIZE = 20;


    private static int[] parking = new int[SIZE];


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

	System.out.println("Hello, Welcome to our free parking garage (smiles)");
	System.out.println("This is Emmanuel, your friendly parking director");

	System.out.println("Kindly input your name sir");
        String bigManName = input.nextLine();
        System.out.printf("Welcome Mr %s. Feel free to park your lovely cars at any of our available slots ", bigManName);
	System.out.println("""     
                              """);


        do {
            System.out.println("\n=-=-= So what woudl you like to do? =-=-=");
            System.out.println("1. Park your car");
            System.out.println("2. Drive a car out of the garage");
            System.out.println("3. Show the parking status of your garage");
            System.out.println("0. To Exit Garage");
            System.out.print("Enter your choice: ");



            choice = input.nextInt();



            switch (choice) {
                case 1 -> System.out.println(parkCar());
                case 2 -> {
                    System.out.print("Enter the number of the car you wish to remove (1-20): ");
                    int removeCarFromGarage = input.nextInt();
                    System.out.println(removeCar(removeCarFromGarage));
                }
                case 3 -> System.out.println(showParkingStatus());
                case 0 -> System.out.println("Driving out of garage... Goodbye!");
                default -> System.out.println("We don't have that option available at the moment.");
            }
        } while (choice != 0);
    }


    public static String parkCar() {
        for (int count = 0; count < SIZE; count++) {
            if (parking[count] == 0) {
                parking[count] = 1;
                return "Your car has been parked at " + (count + 1);
            }
        }
        return "Sorry! The Parking lot is currently full, you can opt to drive out some to repark another.";
    }

    
    public static String removeCar(int slot) {
        if (slot >= 1 && slot <= SIZE) {
            if (parking[slot - 1] == 1) {
                parking[slot - 1] = 0;
                return "Car removed from slot " + slot;
            } else {
                return "The parking space at " + slot + " is already empty, so there is space for you to park into.";
            }
        }
        return "Invalid car parking space number!";
    }



    public static String showParkingStatus() {
        StringBuilder status = new StringBuilder();
        for (int s : parking) {
            status.append(s).append(" ");
        }
        return status.toString().trim();
    }


    public static int[] getParking() {
        return parking;
    }


    public static void resetParking() {
        parking = new int[SIZE];
    }


}
