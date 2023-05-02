package week_11.constructos;

public class TestTeacher {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Adam", 34, 'M');
        Teacher teacher2 = new Teacher("Aysun", 25);

        System.out.println(teacher2);
        teacher2.Gender = 'F';
        System.out.println(teacher2);

    }
}
