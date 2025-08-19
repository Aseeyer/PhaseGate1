/*
Implement the function which takes an array containing the names of people that like an item. it must return the display text as shown in the examples: 
[] -> "no one likes this"
["Peter"] -> "Peter likes this"
["Jacoob", ["Alex"] - "Jacoob and Alex like this"
["Max", "John", "Mark"] -> "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"] -> "Alex, Jacob and 2 others like this"
*/


public class Task3 {

    public static String getLikes(String[] names) {
        int count = names.length;

        if (count == 0) {
            return "no one likes this";
        } else if (count == 1) {
            return names[0] + " likes this";
        } else if (count == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (count == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (count - 2) + " others like this";
        }
    }

    public static void main(String[] args) {
        System.out.println(getLikes(new String[]{}));
        System.out.println(getLikes(new String[]{"Peter"}));
        System.out.println(getLikes(new String[]{"Jacob", "Alex"}));
        System.out.println(getLikes(new String[]{"Max", "John", "Mark"}));
        System.out.println(getLikes(new String[]{"Alex", "Jacob", "Mark", "Max"}));
        System.out.println(getLikes(new String[]{"Alex", "Jacob", "Mark", "Max", "Eze"}));

    }
}

