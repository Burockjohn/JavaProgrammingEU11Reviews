package week_08;

import java.util.Arrays;

public class MultiDimensionalArray { // container for the arrays, or arrays inside another array

    public static void main(String[] args) {

        //two-dimension array  0          1            2
        int array2D[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};

        System.out.println(Arrays.deepToString(array2D));

        // print 5
        System.out.println(array2D[1][1]);

        //print 10
        System.out.println(array2D[2][3]);


        // three-dimension array
        int array3D[][][] = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9, 10}, {11, 12, 13, 14, 15}}};
        //                  0-0-0

        System.out.println(Arrays.deepToString(array3D));

        for (int i = 0; i < array2D.length; i++) { // rows or we can say each dimensional array
            for (int j = 0; j < array2D[i].length; j++) { // for elements
                System.out.println(array2D[i][j]);
            }
        }

    }

}
