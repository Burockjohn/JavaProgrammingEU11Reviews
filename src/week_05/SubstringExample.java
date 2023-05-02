package week_05;

public class SubstringExample {

    public static void main(String[] args) {
        String result = "About 183,000,000 results (0.39 seconds)";

        String result1 = result.substring(6);
        System.out.println(result1);
        int indexOfSpace = result1.indexOf(' ');
        System.out.println(result1.substring(0, indexOfSpace));

    }
}