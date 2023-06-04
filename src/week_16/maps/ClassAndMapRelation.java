package week_16.maps;

import java.util.HashMap;
import java.util.Map;

public class ClassAndMapRelation {

    public static void main(String[] args) {

        Student student1 = new Student();

        Map<String,String> studentMap1 = new HashMap<>();

        studentMap1.put("id", "1");
        studentMap1.put("name", "Melih");
        studentMap1.put("gender", "Male");

        student1.setId("1");
        student1.setName("Melih");
        student1.setGender("Male");

        System.out.println("Map objecet" );
        System.out.println(studentMap1);
        System.out.println("------------------------------");


        System.out.println("Student object");
        System.out.println(student1);

    }

}
