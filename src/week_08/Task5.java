package week_08;

public class Task5 {

    public static void main(String[] args) {

        System.out.println(in1020(12,99));

    }

    private static boolean in1020(int n1, int n2) {
        return ((n1 >= 10 && n1 <= 20) || (n2 >= 10 && n2 <= 20));
    }
}


/*

Task 5
 : Write a method that given 2 int values, return true if either of them is in the range 10..20 inclusive.
            multiple parameter  --- takes two integers
            return type --- boolean

             in1020(12, 99) → true
             in1020(21, 12) → true
             in1020(8, 99) → false

 */