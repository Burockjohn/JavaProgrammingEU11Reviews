package week_12.inheritance.season_overriding;

public class Season {

    String name;
    double highAvgTemp;
    double lowAvgTemp;

    public Season(String name, double highAvgTemp, double lowAvgTemp) {
        this.name = name;
        this.highAvgTemp = highAvgTemp;
        this.lowAvgTemp = lowAvgTemp;
    }

    public void activity() {
        System.out.println("We can do different activities in different season");
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highAvgTemp=" + highAvgTemp +
                ", lowAvgTemp=" + lowAvgTemp +
                '}';
    }
}
