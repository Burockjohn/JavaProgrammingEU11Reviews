package week_12.encapsulation;

public class Address {

    private String street, city, state, country;
    private int zipcode;

    public Address(String street, String city, String state, String country, int zipcode) {
        setStreet(street);
        setCity(city);
        setState(state);
        setCountry(country);
        setZipcode(zipcode);
    }

    //------------------------------------\\

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZipcode() {
        return zipcode;
    }

    //-------------------------------------------\\


    public void setStreet(String street) {
        if (street.isEmpty() || street.length() > 50) {
            System.err.println("you can not use empty street or you you can't use street length bigger than 50");
            System.exit(0);
        }
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipcode(int zipcode) {
        if ((zipcode + "").length() == 5) {
            this.zipcode = zipcode;
        } else {
            System.err.println("Invalid zipcode");
            System.exit(0);
        }

    }

    //-----------------------------------------\\


    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}

/*

Task 1: AdressTask

    Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments

 */