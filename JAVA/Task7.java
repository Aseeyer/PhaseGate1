//find the smallest number in an array
public class Task7{
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3}; 
        
        int smallest = numbers[0];
        
        for (int count = 1; count < numbers.length; count++) {
            if (numbers[count] < smallest) {
                smallest = numbers[count]; 
            }
        }
        
        System.out.println("The smallest number is: " + smallest);
    }
}

