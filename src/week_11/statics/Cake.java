package week_11.statics;

public class Cake {

    public static int numberOfSlices = 10;

    public void eat(int slice) {

        numberOfSlices -= slice;

    }

}
