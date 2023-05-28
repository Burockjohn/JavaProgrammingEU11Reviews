package week_15.polymorphism.driver;

public interface WebDriver extends SearchContext{

    void get(String url);
    void close();
    void quit();
    void getWindowHandle();

}
