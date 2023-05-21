package week_14.exceptions.custom_exception;

public class Library {

    public void getLibraryCard(String city) {
        if (city.equals("Fairfax") || city.equals("Mclean")) {
            System.out.println("Library card created");
        } else {
            throw new NonResidentException("You can not get the card other than Fairfax or Mclean cities");
        }
    }

    public void barrow(boolean checkedOut) throws FailToCheckOutException{
        if (checkedOut) {
            System.out.println("Enjoy reading");
        } else {
            throw new FailToCheckOutException("You can not check it out");

        }
    }
}
