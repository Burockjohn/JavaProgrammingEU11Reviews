package week_12.inheritance.appTask;

public class Youtube extends MobileApp {
    public Youtube(double version) {
        super("Youtube", version);
    }

    public void watchVideo() {
        System.out.println("You can watch videos from youtube");
    }
}