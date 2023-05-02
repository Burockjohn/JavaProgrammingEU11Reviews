package week_09;

import static java.util.Collections.frequency;

public class Task5 {

    public static void main(String[] args) {

        String str[] = {"java", "html", "css", "java", "javascript", "selenium"};

        int count = frequencyOfWord(str, "java");

        System.out.println(count);


    }

    private static int frequencyOfWord(String[] str, String word) {

        int counter = 0;

        for (String element : str) {
            if (element.equals(word)) counter++;

        }

        return counter;

    }
}

/*

Task 5 : Target Words

                    Given an Array of Strings and a target word (String) print how many times the target word is in the Array
                    Ex: 
                    Input: 
                        "java", "html", “css", “java", “javascript", “selenium"
                        Target: java 

                        Output: 2

 */