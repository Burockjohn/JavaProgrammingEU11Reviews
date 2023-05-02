package week_08;

import java.util.Arrays;

public class Task6 {


    /*
     Write a program that accepts String array.Count how many names have the same first and last letter
                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"
                Output : 4
     */


    public static void main(String[] args) {

        String[] array = {"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet", "Asya"};

        int result = countWords(array);
        System.out.println("result = " + result);

        String[] strings = getWordsFirstAndLastCharSame(array);
        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));
    }

    private static int countWords(String[] array) {
        int counter = 0;

        for (String each : array) {
            //each=Anna
            String temp = each.toLowerCase(); //anna

            char firstLetter = temp.charAt(0);
            char lastLetter = temp.charAt(temp.length() - 1);
            if (firstLetter == lastLetter) {
                counter++;
            }

        }

        return counter;


    }


    private static String[] getWordsFirstAndLastCharSame(String[] array) {
        int arraySize = countWords(array);

        String[] result = new String[arraySize];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            String each = array[i];
            String temp = each.toLowerCase();
            char firstLetter = temp.charAt(0);
            char lastLetter = temp.charAt(temp.length() - 1);
            if (firstLetter == lastLetter) {
                result[index++] = each;
            }


        }

        return result;

    }

}