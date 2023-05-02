package week_11.custom_classes;

public class Student {

    public String firstName, lastName;
    public int age;
    public static String course;


    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    static {
        course = "Cydeo";
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
