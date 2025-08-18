import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter First integer: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter Second Integer: ");
    int secondNumber = input.nextInt();

    System.out.print("Enter Third Integer: ");
    int thirdNumber = input.nextInt();


    int sum = firstNumber + secondNumber + thirdNumber;
    double averageOfSum = sum / 3;
    int productOfNumbers = firstNumber * secondNumber * thirdNumber;
  
    System.out.printf("\n The sum of %d, %d and %d is %d", firstNumber, secondNumber, thirdNumber, sum);
    System.out.printf("\n The average is their sum is %f", averageOfSum);
    System.out.printf("\n The product of the numbers is %d", productOfNumbers);

    int largest = firstNumber;
    int smallest = 0;

    if(secondNumber > largest) largest = secondNumber;
    if(thirdNumber > largest) largest = thirdNumber;
    System.out.printf("\n The largest number is %d", largest);


    if (firstNumber > smallest && firstNumber < smallest) smallest = firstNumber;
    if(secondNumber > smallest && secondNumber < largest) smallest = secondNumber;
    if (thirdNumber > smallest && thirdNumber < largest) smallest = thirdNumber;
    System.out.printf("\n The smallest number is %d", smallest);




    }
}

