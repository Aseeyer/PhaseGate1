/*writ an application that reads an integer and determines and prints whether it's divisible by 3 or not. 
*/

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
  
    System.out.print("Enter any integer: ");
    int number = input.nextInt();

    if(number % 3 == 0){
        System.out.printf("The number %d is divisible by 3", number);
    }else{
        System.out.printf("The number %d is not divisible by 3", number);

    }
    }
}
