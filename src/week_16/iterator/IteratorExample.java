package week_16.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "Cydeo", "dog"));


        //I want to remove the word is the word is starting with a

        /*
We are not able to use remove method with loops because of index problem
        for (String word : words) {

            if (word.startsWith("a")){
                words.remove(word);
            }
        }
        ,
         */
        //  words.removeIf(k->k.startsWith("a"));
        // System.out.println(words);

        //("apple", "banana", "cherry", "Cydeo", "dog"));

        Iterator<String> iterator= words.iterator();


        while (iterator.hasNext()){

            String word= iterator.next();
            if (word.startsWith("a")){
                iterator.remove();
            }
        }
        System.out.println(words);


        List<String> words2 = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "Cydeo", "dog"));


        //if I want to remove the word which has more than 5 length
        Iterator<String> iterator1 = words2.iterator();
        while (iterator1.hasNext()) {

            String word= iterator1.next();
            if (word.length()>5){
                iterator1.remove();
            }
        }

        System.out.println(words2);


    }
}
