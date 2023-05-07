package week_12.inheritance.appTask;

public class Discord extends MobileApp {
    public Discord(double version) {

        super("Discord", version);
        System.out.println(version);
    }

    public void chat(String name) {
        System.out.println("You can use discord in order to chat with " + name);
    }
}