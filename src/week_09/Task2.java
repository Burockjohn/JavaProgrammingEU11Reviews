package week_09;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {


        String str[] = {"apples", "tree", "loop", "cat", "animal", "shortcut"};

        String str2[] = getWords(str, 4);

        System.out.println(Arrays.toString(str2));

    }

    private static String[] getWords(String[] str, int numberOfLetter) {

        int counter = 0;

        for (String s : str) {
            if (s.length() <= numberOfLetter) counter++;
        }

        String result[] = new String[counter];

        int index = 0;

        for (String s : str) {
            if (s.length() <= numberOfLetter) result[index++] = s;
        }

        return result;

    }
}

/*

Task 2 : Four or less


                    Given an Array of Strings, go through and read only Strings that are 4 characters or less.

                    Take those Strings and put them into a different Array

                    Ex:

                    Input:
                    “apples”, “tree”, “loop, “cat”, “animal”, “shortcut”

                    Output:
                    [ tree, loop, cat ]

 */