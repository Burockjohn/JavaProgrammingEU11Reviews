package week_11.access_modifiers.same_package;

public class Student {
    public String publicField;
    String defaultField;
    private int privateField;
    protected int protectedField;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.publicField);
        System.out.println(student.defaultField);
        System.out.println(student.privateField);
        System.out.println(student.protectedField);
    }
}