package week_15.polymorphism.driver;

import java.sql.Driver;

public class TestDrivers {

    public static void main(String[] args) {

        WebDriver driver = new Chrome();
        driver.get("cydeo.com");

        ((TakesScreenshot) driver).takeSS();

        driver = new Firefox();
        driver.get("cydeo.com");

    }

}
