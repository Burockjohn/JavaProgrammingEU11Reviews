package week_12.inheritance.season;

public class Fall extends Season{


    public Fall(double highAvgTemp, double lowAvgTemp) {
        super("Fall", highAvgTemp, lowAvgTemp);
    }

    /*

    if you don't override it compiler is creating that one for us and it is calling parent class method
    @Override
    public void activity(){
    super.activity();
    }
     */

    public void activity(){
        System.out.println("Read a book");
    }

}
