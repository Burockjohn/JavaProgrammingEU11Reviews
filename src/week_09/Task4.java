package week_09;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        String str[] = {"one", "hi", "hold"};

        String result[] = hideWords(str);

        System.out.println(Arrays.toString(result));

    }

    private static String[] hideWords(String[] str) {

        String res[] = new String[str.length];
        int index = 0;

        for (String each : str) {
            String temp = "";

            for (int i = 0; i < each.length(); i++) {
                temp += "*";
            }

            res[index++] = temp;
        }

        return res;


    }

}
/*

Task 4 : Hide Passwords

                    Given an array of passwords (String). Hide each password as a star (*) and show the hidden password

                    Ex:

                    Input:
                    {"one", "hi", "hold}

                    Output:
                    [ ***, **, **** ]

 */