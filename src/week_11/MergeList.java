package week_11;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeList {

    public static void main(String[] args) {

        ArrayList<Integer> num1s = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> num2s = new ArrayList<>(Arrays.asList(5, 6, 7, 8));

        ArrayList<Integer> result = mergeList(num1s, num2s);
        System.out.println(result);

    }

    private static ArrayList<Integer> mergeList(ArrayList<Integer> num1s, ArrayList<Integer> num2s) {

        ArrayList<Integer> result = new ArrayList<>(num1s);
        result.addAll(num2s);
        return result;

    }

}
