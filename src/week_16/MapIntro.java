package week_16;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {

        // how to create a map
        Map<Integer, String> employeeWithNum = new HashMap<>();

        // how to add a pair
        employeeWithNum.put(1, "Burak C");
        employeeWithNum.put(2, "Yunus Kulcu");
        employeeWithNum.put(3, "Burak Yılmaz");
        employeeWithNum.put(4, "Çağlar Engin");
        employeeWithNum.put(6, "X Y");

        System.out.println(employeeWithNum.get(1));


        // how to update value
        employeeWithNum.replace(1, "Burak Ca");
        System.out.println(employeeWithNum.get(1));
        employeeWithNum.put(1, "Burak Can");
        System.out.println(employeeWithNum.get(1));

        // how to understand do you have key ot not on your map?
        System.out.println(employeeWithNum.containsKey(1));
        System.out.println(employeeWithNum.containsKey(5));

        // how to remove pair from map
        employeeWithNum.remove(6);
        System.out.println(employeeWithNum.get(6));

        // how to remove all pairs from map
        System.out.println(employeeWithNum);
        employeeWithNum.clear();
        System.out.println(employeeWithNum);


    }
}
