// Find the largest number in an array
public class LargestNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3}; 
        
        int largest = numbers[0];
        
        for (int count = 1; count < numbers.length; count++) {
            if (numbers[count] > largest) {
                largest = numbers[count]; 
            }
        }
        
        System.out.println("The largest number is: " + largest);
    }
}
