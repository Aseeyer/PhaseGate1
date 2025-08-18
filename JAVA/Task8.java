//Find the sum of all element in an array
public class SumArray {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3}; 
        
        int sum = 0; 
        
        for (int count = 0; count < numbers.length; count++) {
            sum += numbers[count]; 
        }
        
        System.out.println("The sum of all elements is: " + sum);
    }
}
