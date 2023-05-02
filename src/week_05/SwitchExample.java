package week_05;

public class SwitchExample {

    public static void main(String[] args) {
        char oper = '-';
        int a = 2;
        int b = 2;
        int result = 0;
        switch (oper) {

            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            default:
                System.err.println("Not Supported Action");
                System.exit(0); //if you want to exit the program we can use that statement

        }

        System.out.println("result = " + result);


    }
}