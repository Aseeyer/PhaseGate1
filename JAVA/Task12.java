//Write a program to sort an array without creating a new array
public class SortInPlace {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 20, 3};

        for (int count = 0; count < numbers.length - 1; count++) {
            int minIndex = count;

            for (int countTwo = count + 1; countTwo < numbers.length; countTwo++) {
                if (numbers[countTwo] < numbers[minIndex]) {
                    minIndex = countTwo;
                }
            }

            int temp = numbers[minIndex];
            numbers[minIndex] = numbers[count];
            numbers[count] = temp;
        }

        System.out.println("Sorted array in ascending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
