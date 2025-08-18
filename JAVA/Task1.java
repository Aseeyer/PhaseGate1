import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter First integer: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter Second Integer: ");
    int secondNumber = input.nextInt();

    int squareFirstNumber = firstNumber * firstNumber;
    int squareSecondNumber = secondNumber * secondNumber;

    int sumOfSquares = squareFirstNumber + squareSecondNumber;
    int differenceBetweenSquares = squareFirstNumber - squareSecondNumber;



    System.out.printf("\n The square of %d is %d ", firstNumber, squareFirstNumber);
    System.out.printf("\n The square of %d is %d ", secondNumber, squareSecondNumber);
    System.out.printf("\n The sum of %d and %d is equals to %d",squareFirstNumber, squareSecondNumber, sumOfSquares );
    System.out.printf("\n The difference of %d and %d is equals to %d ",squareFirstNumber, squareSecondNumber, differenceBetweenSquares );




    
    }
}