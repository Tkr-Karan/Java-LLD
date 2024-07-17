package designpatterns.singleton.eagerloading;

public class DatabaseConnection {

    // eager loading is nothing but when we are creating the instance or object at the very first time or load.
    private static DatabaseConnection databaseConnection = new DatabaseConnection();

    private DatabaseConnection(){}

    public static DatabaseConnection getInstance(){
        return new DatabaseConnection();
    }
}
