package week_12.inheritance.season_overriding;

public class Spring extends Season {

    public Spring(double highAvgTemp, double lowAvgTemp) {
        super("Spring", highAvgTemp, lowAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Go outside in" + getClass().getSimpleName());
    }
}
