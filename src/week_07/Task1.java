package week_07;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] x = {1, 2, 3};

        int temp = x[0];

        //1   //   3     -1 = 2
        for (int i = 0; i < x.length - 1; i++) {
            x[i] = x[i + 1];
        }

        System.out.println(Arrays.toString(x));

        //last index first value
        x[x.length - 1] = temp;

        System.out.println(Arrays.toString(x));

    }
}


/*

Task 1    : Write a program that accepts an array and prints an array with the elements "rotated left"

        int[] x = {1,2,3};           // = > [2,3,1]
        int[] y = {17,12,10,8};      // = > [12,10,8,17]
        int[] a = {7,0,0};           // = > [0,0,7]

 */