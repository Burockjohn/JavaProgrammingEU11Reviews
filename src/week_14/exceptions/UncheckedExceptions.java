package week_14.exceptions;

import week_12.inheritance.appTask.Discord;

public class UncheckedExceptions {

    public static Discord discord;

    public static void main(String[] args) {

        try {
            System.out.println(8/0); // arithmetic exception
        } catch (ArithmeticException e) {

        }

        System.out.println("Divide with zero handled");


        discord.chat("Burak"); // nullpointer exception because there is no object

        String number = "123a";
        System.out.println(Integer.parseInt(number)); // number format exception

        String name = "Burak";
        System.out.println(name.charAt(5)); // OutofBonds exception


    }

}
