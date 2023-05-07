package week_12.inheritance.appTask;

public class TestApp {

    public static void main(String[] args) {

        Instagram instagram = new Instagram(2.3);
        instagram.download();
        System.out.println(instagram);
        instagram.postPhoto();

        Discord discord = new Discord(1.3);
        discord.chat("Ahmet");


    }
}
