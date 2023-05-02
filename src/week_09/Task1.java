package week_09;

public class Task1 {

   /*
        Task 1 : Find the word
					String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
					//each word starts with upper case
					Write a method that returns : Welcome To Core Java
     */

    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

        String result = getSentence(str);

        System.out.println(result);


    }

    public static String getSentence(String str) {
        String container = "";
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                container += ' ';
            }
            if (Character.isLetter(c)) {
                container += c;
            }
        }

        return container.trim();
    }

    public static boolean isSpecial(char ch) {

        return !Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch);
    }


}
