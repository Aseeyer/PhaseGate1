//write a program that checks if a number is positive or negative

import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter any integer: ");
    int number = input.nextInt();

    if(number > 0){
        System.out.print("It is positive");
    }else{
        System.out.print("It is Negative");

    }



    }
}