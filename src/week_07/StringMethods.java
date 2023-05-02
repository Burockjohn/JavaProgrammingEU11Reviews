package week_07;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        //split(String regex)
        //toCharArray()

        String str = "I    love   Java";

        String words[] = str.split(" ");

        int counter = 0;

        for (String word : words) {
            if (!word.isEmpty()) {
                counter++;
            }
        }

        System.out.println(counter);
        System.out.println(words.length);
        System.out.println(words.length - counter); // to find how many extra spaces are

        String name = "Adam";
        String split [] = name.split(""); // {"A", "d", "a", "m"}
        char charsOfName[] = name.toCharArray();// {'A', 'd', 'a', 'm'} they are not same
        System.out.println(Arrays.toString(charsOfName));

        String name2  = new String(charsOfName); // ****bonus****
        System.out.println(name2);

        char name3[] = {'B', 'U', 'R', 'A', 'K'};

        String nameBurak = new String(name3);

        System.out.println(nameBurak);


    }
}
