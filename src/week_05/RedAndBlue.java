package week_05;

public class RedAndBlue {
    /*
    Given a string, if the string begins with "red" or "blue" print that color string, otherwise print the empty string.

                     input :"redxx" → "red"
                     input :"xxred" → ""
                     input :"blueTimes" → "blue"
     */
    public static void main(String[] args) {

        String word = "bluexx";

        if (word.indexOf("red") == 0) { //startsWith()
            System.out.println("red");
        } else if (word.indexOf("blue") == 0) {
            System.out.println("blue");
        } else {
            System.out.println("\"\"");
        }


    }
}