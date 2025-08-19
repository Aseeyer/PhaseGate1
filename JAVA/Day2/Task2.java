public class Task2 {
    public static char getAverage(int numberOne, int numberTwo, int numberThree) {
        int average = (numberOne + numberTwo + numberThree) / 3;

        if (average >= 90 && average <= 100) {
            return 'A';
        } else if (average >= 80 && average < 90) {
            return 'B';
        } else if (average >= 70 && average < 80) {
            return 'C';
        } else if (average >= 60 && average < 70) {
            return 'D';
        } else if (average >= 0 && average < 60) {
            return 'F';
        } else {
            throw new IllegalArgumentException("Average out of range: " + average);
        }
    }

    public static void main(String[] args) {
        int numberOne = 50;
        int numberTwo = 60;
        int numberThree = 80;

        char grade = getAverage(numberOne, numberTwo, numberThree);
        System.out.println("Grade: " + grade);
    }
}







