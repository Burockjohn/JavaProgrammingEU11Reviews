package week_06;

public class Task2WithWhile {
    /*
        Task 2: Given a sentence which is string and count the words in it.

    input:

      String str="Java is java in everywhere is Java";

      output:7
         */
    public static void main(String[] args) {

        String str = "Java is java in everywhere is Java";
        //  |||||||||||

        int counter = 0;
        while (str.contains(" ")) {
            str = str.replaceFirst(" ", "");
            counter++;
        }
        System.out.println(counter + 1);


    }
}