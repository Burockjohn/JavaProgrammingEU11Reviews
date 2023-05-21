package week_14.abstractions.phone;

public class SamsungNote extends Samsung implements HasPen{
    public SamsungNote(String model, String colour) {
        super(model, colour);
    }

    @Override
    public void hasPen() {

    }
}
