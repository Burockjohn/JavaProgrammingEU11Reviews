package week_15.collection;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmet", "Rafet", "Mehmet", "Saffet", "Temel", "Ahmet"));

        System.out.println(getSortedUniqueNames(names));

    }

    public static List<String> getSortedUniqueNames(List<String> list) {
        Set<String> set = new TreeSet<>(list);
        List<String> result = new ArrayList<>(set);
        return result;

        //return new ArrayList<>(new TreeSet<>(list));

    }

}

/*

Task 2

 --    create a list put the names
         ahmet
         rafet
         mehmet
         saffet
         temel
     -- create a method and return the sorted list which are unique
      ahmet ,mehmet,rafet,saffet,temel

 */