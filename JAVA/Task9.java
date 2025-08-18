//Print the element in an array in reverse order

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3};
        
        System.out.println("Array in reverse order:");
        
        for (int count = numbers.length - 1; count >= 0; count--) {
            System.out.print(numbers[count] + " ");
        }
    }
}
