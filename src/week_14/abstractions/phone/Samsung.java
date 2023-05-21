package week_14.abstractions.phone;

public class Samsung extends Phone implements HasAndroid, HasBixby {
    public Samsung(String model, String colour) {
        super(model, colour);
    }

    @Override
    public void hasAndroid() {

    }

    @Override
    void text(double number) {

    }

    @Override
    void call(String name) {

    }

    @Override
    public void hasBixby() {

    }
}
