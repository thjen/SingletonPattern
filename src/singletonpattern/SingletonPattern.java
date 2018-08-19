package singletonpattern;

public class SingletonPattern {

    public static void main(String[] args) {
        
        Database database = Database.getInstance("Products");
        
        System.out.println("This is the " + database.getName() + " database.");
        
        database = Database.getInstance("Employees");
        System.out.println("This is the " + database.getName() + " database.");     
    }
}
