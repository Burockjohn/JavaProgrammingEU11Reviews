package week_14.abstractions.database;

public class TestDatabase {

    public static void main(String[] args) {

        Oracle oracleDatabase = new Oracle();

        oracleDatabase.add("Burak");
        System.out.println(oracleDatabase.names);

        oracleDatabase.add("Yunus Kulcu");

        oracleDatabase.update("Burak", "Burak CAN");

        System.out.println(oracleDatabase.names);

    }
}
