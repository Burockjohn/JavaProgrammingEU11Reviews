package week_08;

public class MethodsIntro {

    public static void main(String[] args) {

        //my job is printing Hello Word 10 times
/*
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
       */
        repeatHelloWorld10Times();
        //windows alt+enter + enter
        //mac option + enter +enter

        repeatHelloWorld10Times();


        // sum3And5();
        sumAndPrintTwoNumber(3, 5);
        sumAndPrintTwoNumber(20, 56);

        //sum two number and multiply result which is coming from method with 2

        int result = sumWithReturn(3, 5);
        System.out.println(result * 2);

    }

    private static int sumWithReturn(int num1, int num2) {

        return num1 + num2;
    }

    public static void sumAndPrintTwoNumber(int num1, int num2) {
        System.out.println(num1 + num2);

    }


    public static void repeatHelloWorld10Times() {
        //we will implement the idea

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }


    }

}
