package week_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListIntro {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        //add element
        nums.add(2);
        nums.add(3);
        nums.add(3);

        System.out.println(nums);

        nums.add(0, 5);

        System.out.println(nums);
        System.out.println(nums.size());

        // how to remove element

        //nums.remove(2); // it will remove the element in index of 2
        nums.remove(Integer.valueOf(2)); // İt will remove 2 as n object directly

        System.out.println(nums);

        // how to get element

        System.out.println(nums.get(0));

        // how to update your element
        nums.set(0, 6);
        System.out.println(nums);

        //how to get in the index of object
        System.out.println(nums.indexOf(3));

        //how to get the element index from end
        System.out.println(nums.lastIndexOf(3));

        //how to learn element in my arrayList or not
        System.out.println(nums.contains(5));
        System.out.println(nums.contains(6));

        //how to compare two arrayList
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(3, 2, 1));

        System.out.println(nums1.equals(nums2));
        Collections.sort(nums1);
        Collections.sort(nums2);
        System.out.println(nums1.equals(nums2));




    }
}

//how do you use ArrayList in your Framework? ->