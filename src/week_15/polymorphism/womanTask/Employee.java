package week_15.polymorphism.womanTask;

public class Employee implements Woman{
    @Override
    public void activity() {
        System.out.println("Working at office");
    }
}
