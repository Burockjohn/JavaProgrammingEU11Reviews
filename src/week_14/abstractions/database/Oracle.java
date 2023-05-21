package week_14.abstractions.database;

public class Oracle extends Database {
    @Override
    void add(String name) {
        names.add(name);
        System.out.println("I added " + name + " in Database");
    }

    @Override
    void delete(String name) {
        names.remove(name);
    }

    @Override
    void update(String old, String newName) {
        int indexOfOldName = names.indexOf(old);
        names.set(indexOfOldName,newName);
    }
}
