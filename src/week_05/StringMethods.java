package week_05;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {
        //123456
        String str = "ABCDEG";

        //how to get each char
        System.out.println(str.charAt(0));//first char which is A
        //how to get E
        System.out.println(str.charAt(4));

        //how to learn how many chars we have in a string

        System.out.println(str.length());

        //how to make letters lower case
        System.out.println(str.toLowerCase());

        // how to make the letters upper case
        System.out.println(str.toUpperCase());

        //how to trim(delete) the spaces at the begin part and end part
        //012345678
        String str1 = " ab cd   ";
        System.out.println(str1);
        System.out.println(str1.trim());

        //how to find the index of any char

        System.out.println(str1.indexOf('b')); //2
        System.out.println(str1.indexOf(' ')); //0
        System.out.println(str1.indexOf('e')); //-1

        //how to find index of string in a string

        System.out.println(str1.indexOf("b c")); //2

        System.out.println(str1.indexOf("b cd")); //2

        //if you want to find  the index of letters from end to start
        System.out.println(str1.lastIndexOf(' ')); //8

        //f you want to delete or replace chars or string


        System.out.println(str1.replace('a', 'z'));

        // '' we can not use like this because there is no empty char
        // System.out.println(str1.replace(' ' , ''));

        System.out.println(str1.replace(" ", ""));
        //delete or replace the first matching one

        System.out.println(str1.replaceFirst(" ", ""));

        // how we can get the part of the string
        //0123456         17
        String result = "About 183,000,000 results (0.39 seconds)";
        System.out.println(result.substring(6, 16 + 1));

        //About 90,300,000 results (0.41 seconds)
        String result2 = "About 183,000,000 results (0.39 seconds)";
        String result3 = "About 90,300,000 results (0.41 seconds)";
        int indexOfSpace = result2.indexOf(' '); //5
        int indexOfFirstDigit = indexOfSpace + 1;
        int indexOfResultWithSpace = result2.indexOf(" results");
        System.out.println(result2.substring(indexOfFirstDigit, indexOfResultWithSpace));

        String name = "Adam";
        //how to write your string as many as you want
        // System.out.println(name+name+name);
        System.out.println(name.repeat(5));

        //how you check your string is empty or not (length=0)
        String str3 = "";
        String str4 = " ";
        System.out.println(str3.isEmpty()); //true
        System.out.println(str4.isEmpty()); //false


    }


}