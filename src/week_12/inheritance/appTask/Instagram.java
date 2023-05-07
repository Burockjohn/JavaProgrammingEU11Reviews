package week_12.inheritance.appTask;

public class Instagram extends MobileApp {
    public Instagram(double version) {
        super("Instagram", version);
    }

    public void postPhoto() {
        System.out.println("You can post your photos from instagram");
    }
}
