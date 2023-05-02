package week_09;

import java.util.ArrayList;

public class WrapperClassIntro {

    public static void main(String[] args) {


        int[] array = {1, 2, 5, 3};
        String[] array2 = {"1", "2", "5", "3"};
        // 1-  we can not use primitive data types with collections so we have  a problem but the solution is using
        // Wrapper Classes Which are Integer,Boolean,Double, ...
        ArrayList<Integer> arrayList = new ArrayList<>();

        // 2- We have some methods in wrapper classes for making our job easy

        //isDigit()

        char ch = '2';
        System.out.println(Character.isDigit(ch));

        //isLetter()
        System.out.println(Character.isUpperCase('a'));

        //parseInt() --> is returning primitive
        //valueOf()  --> is returning object

        String number = "12";
        int data = Integer.parseInt(number);
        System.out.println(number + 4); //124
        System.out.println(data + 4); //16
        Integer obj = Integer.valueOf(number);
        System.out.println(obj + 4);  //16

        System.out.println(obj.toString() + 4);//124


        //autoboxing --->> primitive to object
        int a = 5;
        Integer objInt = a;

        // unboxing  --->> object to primitive
        int c = objInt;


    }
}
