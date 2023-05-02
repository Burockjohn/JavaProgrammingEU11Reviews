package week_09;

public class MethodOverloadingRules {

    public static void main(String[] args) {


        //number of parameters ---> Success
        methodA(3);
        methodA(3, 5);

        //different data types ---> Success
        methodA(4.5);

        //sequence of paramter ---> Success
        methodB(2, 4.5);
        methodB(2.3, 4);

        //return type ---> FAILED
      /* int result= methodC(3,5);
            methodC(3,5);
       */


    }

    /*
        private static int methodC(int i, int i1) {
            return 0;
        }
        private static void methodC(int i, int i1) {
            System.out.println("");
        }
     */
    private static void methodB(int i, double v) {
    }

    private static void methodB(double i, int v) {
    }

    private static void methodA(int i) {

    }

    private static void methodA(double i) {

    }

    private static void methodA(int i, int i1) {

    }
}
