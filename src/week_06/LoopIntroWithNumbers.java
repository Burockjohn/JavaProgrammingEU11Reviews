package week_06;

public class LoopIntroWithNumbers {

    public static void main(String[] args) {
/*
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);
        System.out.println(11);
        System.out.println(12);
        System.out.println(13);
        System.out.println(14);
        System.out.println(15);


 */

        /*
        for(init(start point) ; condition(exit rule) ; inc/dec){
        //implementation
        }
         */

        //print the numbers from 1 to 15
        for (int i = 1; i <= 15; i++) {
            System.out.println(i);
        }

        System.out.println("==============");
        //print numbers from 50 to 100
        for (int i = 50; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("==============");
        //print the even numbers from 0 to 100(included)

        for (int i = 0; i <= 100; i = i + 2) {
            System.out.println(i);
        }
        System.out.println("==============");
        //print the even numbers from 1 to 99(included)
        for (int i = 1; i <= 99; i = i + 2) {
            System.out.println(i);
        }

        //print the numbers if the number is divisible by 5 from 0 to 1000(inc)
        System.out.println("==============");
        for (int i = 0; i <= 1000; i++) {

            if (i % 5 == 0)
                System.out.println(i);
        }


    }
}