package designpatterns.singleton.singlethreaded;

public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection() {}

    // creating the database instance
    // that is the public method that help us to create instance

    public static DatabaseConnection getInstance(){
        // here we to check if the instance is creating first time
        if(databaseConnection == null) databaseConnection = new DatabaseConnection();


        return databaseConnection;
    }
}
