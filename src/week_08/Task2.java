package week_08;

public class Task2 {

    public static void main(String[] args) {

        boolean result = isPrime(23);
        System.out.println(result);
    }

    private static boolean isPrime(int number) {
        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}

/*

Task 2 :   Write a method that can check if a number is prime or not

          Note : Prime numbers are special numbers, greater than 1, that have exactly two factors, themselves and 1

 */