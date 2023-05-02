package week_05;

import java.util.Scanner;

public class FormWithScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter your gender");
        String gender = scanner.nextLine();
        System.out.println("Please enter your job");
        String job = scanner.nextLine();

        System.out.println(
                "First name: " + firstName + "\n" +
                        "Gender: " + gender + "\n" +
                        "Age: " + age + "\n" +
                        "Job: " + job

        );

    }
}