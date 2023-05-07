package week_12.encapsulation;

public class Person {

    private String name;

    private int age;

    public void setName(String name) {
        boolean isValidName = true;
        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c)) {
                isValidName = false;
                break;
            }
        }

        if (isValidName) {
            this.name = name;
        } else {
            System.err.println("Your name is not valid");
            System.exit(0);
        }

    }

    public void setAge(int age) {
        if (age < 0) {
            System.err.println("Invalid age");
            System.exit(0);
        }
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
