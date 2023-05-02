package week_08;

public class Task1 {

    public static void main(String[] args) {

        String result = checkNumberEvenOrOdd(3);
        System.out.println(result);


    }

    private static String checkNumberEvenOrOdd(int number) {
        return (number % 2 == 0) ? "even" : "odd";
    }

}
/*

 Task 1 :   Write a method that can check if a number is even or odd

 */