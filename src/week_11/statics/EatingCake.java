package week_11.statics;

public class EatingCake {

    public static void main(String[] args) {

        Cake person1 = new Cake();
        person1.eat(2); // 8 left

        System.out.println(person1.numberOfSlices);

        Cake person2 = new Cake();
        person2.eat(3); // 5 left but 7 because different cake if we didn't use static

        System.out.println(person2.numberOfSlices);

        Cake person3 = new Cake();
        person3.eat(3); // 2 left but 7 because different cake -> static belongs to Class

        System.out.println(person3.numberOfSlices);

    }

}
