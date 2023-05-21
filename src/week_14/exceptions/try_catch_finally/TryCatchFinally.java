package week_14.exceptions.try_catch_finally;

public class TryCatchFinally {

    public static void main(String[] args) {

        try {
            System.out.println("Program is started");
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("We have a problem");
            System.out.println(8/0);
        } finally {
            System.out.println("Closed app");
        }

    }
}
