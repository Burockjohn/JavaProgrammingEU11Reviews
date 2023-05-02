package week_09;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        String arr[] = {"123", "34", "513"};

        int result [] = getSum(arr);

        System.out.println(Arrays.toString(result));


    }

    private static int[] getSum(String[] arr) {

        int result [] = new int [arr.length];
        int index = 0;

        for (String each : arr) {
            int sum = 0;
            for (String s : each.split("")) {
                sum += Integer.parseInt(s);
            }

            result[index++]= sum;
        }

        return result;
    }
}

/*

Task 3 : String numbers to sum

                    Given an Array of numbers in String format, add each digit of each element and store into a different Array.

                    Ex:

                    Input:
                    "123", "34", "513"

                    Output:
                    [ 6, 7, 9 ]

 */
