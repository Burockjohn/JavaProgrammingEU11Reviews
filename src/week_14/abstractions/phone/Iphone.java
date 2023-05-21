package week_14.abstractions.phone;

public class Iphone extends Phone implements HasIOS {
    public Iphone(String model, String colour) {
        super(model, colour);
    }

    @Override
    public void faceTime() {

    }

    @Override
    void text(double number) {

    }

    @Override
    void call(String name) {

    }
}
