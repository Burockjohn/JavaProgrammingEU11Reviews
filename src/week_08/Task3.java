package week_08;

public class Task3 {

    public static void main(String[] args) {

        String name = " Burak Can ";
        System.out.println(removeWhiteSpaces(name));

    }

    private static String removeWhiteSpaces(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                result += text.charAt(i);
            } else {
                if (i > 0 && i < text.length() - 1) {
                    if (Character.isLetterOrDigit(text.charAt(i - 1)) && Character.isLetterOrDigit(text.charAt(i + 1))) {
                        result += text.charAt(i);
                    }
                }
            }
        }
        return result;
    }

}
/*

Task 3 :    Write a method that can remove  all extra space from String , trim() is forbidden

// create a loop --- taking every index one by one with charAt(i)  and compares against ' '   str.charAt(i) == ' '
don't add empty to result, if not empty add it to result string

                 Input: "  He ll o "
                 Outp

 */
