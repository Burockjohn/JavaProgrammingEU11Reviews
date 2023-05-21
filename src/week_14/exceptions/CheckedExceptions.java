package week_14.exceptions;

public class CheckedExceptions {

    public static void main(String[] args){

        System.out.println("Adam");

        //wait 3 seconds
        //Thread.sleep(3000);

        waitFor(3);

        System.out.println("Ozkan");

    }

    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
