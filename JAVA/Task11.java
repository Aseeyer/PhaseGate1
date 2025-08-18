//Write a program to sort an array without using built-in functions

public class SortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3}; 
        

        
        for (int count = 0; count < numbers.length - 1; count++) {
            for (int countTwo = 0; countTwo < numbers.length - 1 - count; countTwo++) {
                if (numbers[countTwo] > numbers[countTwo + 1]) {


                    int temp = numbers[countTwo];
                    numbers[countTwo] = numbers[countTwo + 1];
                    numbers[countTwo + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
