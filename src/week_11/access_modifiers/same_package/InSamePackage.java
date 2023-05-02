package week_11.access_modifiers.same_package;


public class InSamePackage {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.publicField);
        System.out.println(student.defaultField);
        // System.out.println(student.privateField); //WE ARE NOT ABLE TO RACH PRIVATE IN SAME PACKAGE
        System.out.println(student.protectedField);
    }

}