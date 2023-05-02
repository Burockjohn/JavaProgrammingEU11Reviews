package week_11.access_modifiers.different_package;

import week_11.access_modifiers.same_package.Student;

public class OutsidePackage {

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.publicField);
        // System.out.println(student.defaultField);
        // System.out.println(student.privateField);
        // System.out.println(student.protectedField);
    }

}