// Your function takes two arguments: current father's age(years), current age of the his son(years). calculate how many years ago the father was twice as old as his son (or in how many years he will be twice as old). The answer is always greater or equal to 0, no matter if it was in the past or it is in the future.

public class Task1 {
    public static int ageGapCalculator(int fatherAge, int sonAge) {
        return Math.abs(2 * sonAge - fatherAge);
    }




    public static void main(String[] args) {
        int fatherAge = 50;
        int sonAge = 20;
        int twice = ageGapCalculator(fatherAge, sonAge);
        System.out.println("The father was or will be twice as old in " + twice + " years.");
    }
}
