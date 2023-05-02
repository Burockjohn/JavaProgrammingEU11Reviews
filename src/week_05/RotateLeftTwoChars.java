package week_05;

public class RotateLeftTwoChars {

    /*
    Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
     Hint: The string length will be at least 2.

                 input :"Hello" -> "lloHe"
                 input :"java" → "vaja"
                 input :"Hi" → "Hi"
     */
    public static void main(String[] args) {

        String word = "H";
        if (word.length() >= 2) {
            //1- get the first two chars
            String firstTwo = word.substring(0, 2);

            //2- get the rest of the chars with excluded first twı chars
            String rest = word.substring(2);

            //3- is concat the results
            String result = rest + firstTwo;

            //4- print the result
            System.out.println(result);
        } else {
            System.out.println("your word length is smaller than 2");
        }


    }
}