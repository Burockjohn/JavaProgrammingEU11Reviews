package week_05;

public class ThreeCopiesOfString {
    /*
    Create a logic print a new string made of 3 copies of the last 2 chars of the original string.

          Hint: The string length will be at least 2.

     */
    public static void main(String[] args) {

        String word = "Hello"; //lololo

        if (word.length() >= 2) {
            //we will implement
            int indexOfLastSecondChar = word.length() - 2;
            System.out.println(word.substring(indexOfLastSecondChar).repeat(3));

        } else {
            System.out.println("invalid word");
        }


    }
}