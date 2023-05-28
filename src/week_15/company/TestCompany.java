package week_15.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCompany {

    static List<Employee> employees;

    static {
        employees = new ArrayList<>();
        Tester tester1 = new Tester("Burak", 1);
        Tester tester2 = new Tester("Cağla", 2);
        Tester tester3 = new Tester("Ramazan", 3);
        Tester tester4 = new Tester("Emre", 4);
        Tester tester5 = new Tester("Pazilya", 5);
        List<Tester> testers = new ArrayList<>(Arrays.asList(tester1,tester2,tester3,tester4,tester5));

        Developer developer1 = new Developer("Mustafa", 1);
        Developer developer2 = new Developer("Melih", 2);
        Developer developer3 = new Developer("Serhat", 3);
        Developer developer4 = new Developer("Emirhan", 4);
        Developer developer5 = new Developer("Burak", 5);
        Developer developer6 = new Developer("Harun", 6);
        Developer developer7 = new Developer("Edip", 7);
        List<Developer> developers = new ArrayList<>(Arrays.asList(developer1,developer2,developer3,developer4,developer5,developer6,developer7));

        PO po1 = new PO("Mehmet", 1);
        PO po2 = new PO("Ahmet", 2);
        PO po3 = new PO("Serhat", 3);
        PO po4 = new PO("Merve", 4);
        List<PO> POs = new ArrayList<>(Arrays.asList(po1,po2,po3,po4));

        employees.addAll(testers);
        employees.addAll(developers);
        employees.addAll(POs);


    }

    public static void main(String[] args) {

        System.out.println(getTesters());
        System.out.println(getDevelopers());
        System.out.println(getPOs());


    }

    public static List<Employee> getTesters() {
      List<Employee> temp = new ArrayList<>(employees);
      temp.removeIf(p ->!(p instanceof Tester));
      return temp;
    }

    public static List<Employee> getDevelopers() {
        List<Employee> temp = new ArrayList<>(employees);
        temp.removeIf(p ->!(p instanceof Developer));
        return temp;
    }

    public static List<Employee> getPOs() {
        List<Employee> temp = new ArrayList<>(employees);
        temp.removeIf(p ->!(p instanceof PO));
        return temp;
    }
}
