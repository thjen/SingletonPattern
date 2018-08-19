package singletonpattern;

public class Database {
    
    private static Database singleObject = new Database("Products");
    private int record;
    private String name;
    
    private Database(String n) {
        this.name = n;
        this.record = 0;
    }
    
    public void editRecord(String operation) {
        System.out.println("Performing a " + operation + " operation on record " + record + " in "
                + "database " + name);
    }
    
    public String getName() {
        return name;
    }
    
    public static synchronized Database getInstance(String n) {
        
        return singleObject;
    }
}
