package week_11;

import week_11.custom_classes.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class School {

    public static void main(String[] args) {

        Student student1 = new Student("Ramazan", "Mert", 18);
        Student student2 = new Student("Furkan", "Ozturk", 20);
        Student student3 = new Student("Pazilya", "Jurat", 22);
        Student student4 = new Student("Ahmet", "Çelik", 25);
        Student student5 = new Student("Adel", "Mohsen", 18);

        ArrayList<Student> list = new ArrayList<>();
        list.addAll(Arrays.asList(student1, student2, student3, student4, student5));

        System.out.println(list);

        ArrayList<Student> res = getStudentsNameStartsWithA(list, "A");
        System.out.println(res);


    }

    private static ArrayList<Student> getStudentsNameStartsWithA(ArrayList<Student> list, String str) {
        ArrayList<Student> result = new ArrayList<>();

        for (Student student : list) {
            if (student.firstName.startsWith(str)) result.addAll(Arrays.asList(student));
        }

        return result;

    }
}

/*


- create a class which is School with main method

- create a list of student in School class

- create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"
 */