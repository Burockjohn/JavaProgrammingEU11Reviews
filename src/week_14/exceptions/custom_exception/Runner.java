package week_14.exceptions.custom_exception;

public class Runner {

    public static void main(String[] args) throws FailToCheckOutException {

        Library library = new Library();

        try {
            library.getLibraryCard("XXXXX");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            library.barrow(false);
        } catch (FailToCheckOutException e) {
            e.getStackTrace();
        }

        System.out.println("Continue");

    }
}
