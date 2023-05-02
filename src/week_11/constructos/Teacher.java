package week_11.constructos;

public class Teacher {

    public String name;
    public int age;
    public char Gender;


    public Teacher(String name, int age, char gender) {
        // this.name = name;
        // this.age = age;

        this(name, age);
        Gender = gender;

    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Gender=" + Gender +
                '}';
    }
}
