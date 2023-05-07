package week_12.inheritance.season;

public class Summer extends Season {
    public Summer(double highAvgTemp, double lowAvgTemp) {
        super("Summer", highAvgTemp, lowAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink lemonade in Summer");
    }
}