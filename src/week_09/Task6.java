package week_09;

import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        System.out.println(isSortedOrder("abcd"));

    }

    private static boolean isSortedOrder(String word) {

        char result[] = word.toCharArray();
        Arrays.sort(result);
        return new String(result).equals(word);

    }
}
/*

 Homework  : Sorted Order

                Create a method that accepts a String and returns a boolean.
                return true if the given String is sorted meaning the characters are in alphabetically order
                return false if the given String is not sorted

        Ex:
           input: "abcd"
           output: true

           input: "abzy"
           output: false

 */
