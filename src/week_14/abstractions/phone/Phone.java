package week_14.abstractions.phone;

public abstract class Phone {

    String model, colour;

    public Phone(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    abstract void text(double number); // first rule
    abstract void call(String name); // second rule

    //abstract void hasAndroid(); -> we can not type because android OS is not common for every phone
}
