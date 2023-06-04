package week_16.functional_interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

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

        BiPredicate<String, String> isEqual = (k, v) -> k.equals(v); // String::equals
        System.out.println(isEqual.test("Burak", "burak"));

        BiConsumer<Integer, Integer> multiply = (k, v) -> System.out.println(k * v);
        multiply.accept(8, 8);

        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};

        BiFunction<Integer[], Integer[], List<Integer>> mergeArrayInAList = (a1, a2) -> {
            List<Integer> list = new ArrayList<>(Arrays.asList(a1));
            for (Integer a : a2) {
                list.add(a);
            }
            return list;
        };

        System.out.println(mergeArrayInAList.apply(arr1, arr2));


    }
}
