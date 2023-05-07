package week_12.inheritance.season;

public class TestSeason {

    public static void main(String[] args) {

        Summer summer = new Summer(45, 25);
        summer.activity();

        Winter winter = new Winter(20, 1);
        winter.activity();

    }
}
