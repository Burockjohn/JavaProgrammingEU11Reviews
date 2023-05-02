package week_07;

public class Task4 {

    public static void main(String[] args) {

        String words[] = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna", "ey edip adanada pide ye"};

        String longestPalindrome = "";

        int longest = 0;

        for (String word : words) {
            String result = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                result += word.charAt(i);
            }

            if (word.equalsIgnoreCase(result) && word.length() > longest) {
                longest = word.length();
                longestPalindrome = word;
            }

        }

        if (!(longest == 0)) {
            System.out.println("longestPalindrome = " + longestPalindrome);
        } else System.out.println("No palindrome");

    }
}

/*

Task 4 :  For Each - Nested For

            Longest Palindrome

             Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic" "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
                    Output: No palindrome

 */