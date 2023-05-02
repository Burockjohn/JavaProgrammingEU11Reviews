package week_06;


import java.util.Random;
import java.util.Scanner;

public class WhileDoWhileIntro {

    public static void main(String[] args) {

        //  System.out.println("Do want to play game?");
        Scanner scanner = new Scanner(System.in);
        //    String ans = scanner.next();  // Yes or No
      /*
        if (ans.equals("Yes")){

        }

       */
/*
        int hidden= 6;
        while (ans.equals("Yes")){

            System.out.println("Try to know the number");
            int number= scanner.nextInt();

            if (number==hidden){
                System.out.println("Congrats you found");
                break;
            }

            System.out.println("Do you want to go on playing");
            ans= scanner.next();


        }

 */
//we will create a random number from 0-24
        Random random = new Random();
        int hiddenNumber = random.nextInt(25);
        boolean flag = true;
        System.out.println("Game is starting");
        System.out.println("Try to find the number");

        do {

            int num = scanner.nextInt();
            if (num == hiddenNumber) {
                flag = false;
                System.out.println("found the number");

            } else {
                System.out.println("Try another number");

            }


        } while (flag);


    }
}