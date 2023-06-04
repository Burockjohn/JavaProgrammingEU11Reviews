package week_16.maps;

import java.util.*;

public class ExcelAndMapRelation {

    public static void main(String[] args) {

        Map<String, String> student1 = new HashMap<>();
        student1.put("id", "1");
        student1.put("name", "Yunus");
        student1.put("gender", "male");

        Map<String, String> student2 = new HashMap<>();
        student2.put("id", "2");
        student2.put("name", "Elif");
        student2.put("gender", "female");

        Map<String, String> student3 = new HashMap<>();
        student3.put("id", "3");
        student3.put("name", "Burak");
        student3.put("gender", "male");

        List<Map<String, String>> students = new ArrayList<>();
        students.addAll(Arrays.asList(student1, student2, student3));
        System.out.println(students);

        for (Map<String, String> student : students) {
            if (student.get("id").equals("3")) System.out.println(student.get("name"));

            /*for (Map.Entry<String, String> pairOfStudents : student.entrySet()) {
                if (pairOfStudents.getValue().equals("3")) {
                    System.out.println(student.get("name"));
                    break;
                }
            }

             */
        }


    }
}
