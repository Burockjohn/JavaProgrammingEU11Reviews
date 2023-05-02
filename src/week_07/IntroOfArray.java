package week_07;

import java.util.Arrays;

public class IntroOfArray {

    public static void main(String[] args) {

        //if we know the data
        //Data type     variable name
        //   0       1       2
        String[] names = {"Adam", "Enis", "Yunus"};

        //****Array size is fixed it means when you create you can not change
        //****able to use with non-primitive and primitive data types

        //if we don't know the array elements we need to use new keyword, we need to know the size of the array

        int[] numbers = new int[10];

        numbers[0] = 10;
        numbers[1] = 15;

        //default values
        /*
        int,byte,short,long --> 0
        float,double  -->0.0
        boolean  -->false
        String --> null

         */

        //how we can print the elements

        //Arrays utility class toString(array_name)

        System.out.println(Arrays.toString(numbers));
        numbers[2] = 20;
        System.out.println(Arrays.toString(numbers));

        //how to print one element

        System.out.println(names[1]);

        //how to sort array

        /*
        sort method
        from small numbers to big numbers
        from a to z    (97)
        from A to Z   (65)

         */

        //how we can compare  arrays --> by using equals but important order of elements is important

        int[] array1 = {1, 2, 3};
        int[] array2 = {2, 1, 3};

        System.out.println(Arrays.equals(array1, array2));

        // how we can understand arrays have same elements
        Arrays.sort(array1);
        Arrays.sort(array2);

        if (Arrays.equals(array1, array2)) {
            System.out.println("Arrays have same elements");
        } else {
            System.out.println("Not");
        }

        int[] array3 = {1, 2, 3};
        int[] array4 = {4, 5, 6};


        int[] mergedArray = new int[array3.length + array4.length];

        int index = 0;
        //we need to put first array which is array3
        for (int each : array4) {
            mergedArray[index++] = each;
        }
        System.out.println(index);
        System.out.println(Arrays.toString(mergedArray));

        //we need to put second array  which is array4
        for (int each : array3) {
            mergedArray[index++] = each;
        }

        System.out.println(Arrays.toString(mergedArray));

    }
}