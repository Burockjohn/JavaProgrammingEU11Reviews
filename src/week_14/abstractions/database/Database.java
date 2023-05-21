package week_14.abstractions.database;

import java.util.ArrayList;

public abstract class Database {

    protected ArrayList<String> names = new ArrayList<>();

    abstract void add(String name);
    abstract void delete(String name);

    abstract void update(String old, String newName);

}
