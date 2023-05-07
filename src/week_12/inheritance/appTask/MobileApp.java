package week_12.inheritance.appTask;

public class MobileApp {

    public String name;
    public double version; //3.5


    public MobileApp(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public void useTheApp(int minutes) {
        System.out.println("Using app for " + minutes + " minutes");
    }

    public void download() {
        System.out.println("App is downloaded");
    }


    @Override
    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}

/*

Task 2: appTask:


        Create a class called MobileApp

            instance variables:
                name, version

                add a constructor to set all the fields

            instance methods:
                useTheApp(int minutes), download()

        Create the following sub classes of MobileApp:
            1. Instagram:
                    extra methods:
                        postPhoto()
            2. Discord:
                    extra methods:
                        chat(String name)

            3. Youtube:
                    extra methods:
                      watchVideo(String video)

 */
