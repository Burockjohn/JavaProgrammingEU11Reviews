package week_16.functional_interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

        //6 different function
        /*

        1. Predicate
        2. Consumer
        3. Function
        4. BiPredicate
        5. BiConsumer
        6. BiFunction

        */
        // () -> {}
        Predicate<String> containsA = k -> k.contains("a");
        System.out.println(containsA.test("Burak"));

        Predicate<Integer> isDivisibleBy3 = k -> k % 3 == 0;
        System.out.println(isDivisibleBy3.test(8));

        Consumer<String> duplicateString = k -> System.out.println(k + k);
        duplicateString.accept("Burak");

        Consumer<String> printReverse = k -> { // System.out.println(new StringBuilder(k).reverse());
            String temp = "";
            char[] chars = k.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                temp += chars[i];
            }
            System.out.println(temp);
        };

        printReverse.accept("Burak");

        Function<String, String> returnReversed = k -> new StringBuilder(k).reverse().toString();
        System.out.println(returnReversed.apply("Burak"));


    }
}
