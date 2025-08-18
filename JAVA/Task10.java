//find the maximum and minimum in an array using one loop

public class Task10 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3};
        
        int maximum = numbers[0];
        int minimum = numbers[0];
        
        for (int count = 1; count < numbers.length; count++) {
            if (numbers[count] > maximum) {
                maximum = numbers[count];
            }
            if (numbers[count] < minimum) {
                minimum = numbers[count];
            }
        }
        
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
