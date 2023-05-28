package week_15.polymorphism.driver;

public class RemoteWebDriver implements WebDriver, JavaScriptExecuter, TakesScreenshot {
    @Override
    public void findElement() {
        System.out.println("We will find the element in " + getClass().getSimpleName());
    }

    @Override
    public void findElements() {
        System.out.println("We will find the elements in " + getClass().getSimpleName());
    }

    @Override
    public void get(String url) {
        System.out.println("I will go to that " + url + " in " + getClass().getSimpleName());
    }

    @Override
    public void close() {
        System.out.println("I will close the " + getClass().getSimpleName());
    }

    @Override
    public void quit() {
        System.out.println("I will quit from " + getClass().getSimpleName());
    }

    @Override
    public void getWindowHandle() {
        System.out.println("Getting the window");
    }

    @Override
    public void executeScript() {
        System.out.println("Executing javascript in " + getClass().getSimpleName());
    }

    @Override
    public void takeSS() {
        System.out.println("Taking screenshot in " + getClass().getSimpleName());
    }
}
