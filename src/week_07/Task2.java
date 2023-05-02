package week_07;

public class Task2 {

    public static void main(String[] args) {

        String str = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

        String[] words = str.split(", ");

        for (String word : words) {
            if (word.contains(" ")) {
                System.out.println(word);
            }
        }


    }
}

/*

Task 2 :    Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer"

        output : wooden spoons
                 trash can
                 dish washer

 */