package designpatterns.singleton.doubleCheckLoading;

public class DatabaseConnection {
    // Double check loading -> here we are doing the double check while creating the instance so, we can't face the
    // lock condition if the two user/client requests come parallely

    private static DatabaseConnection databaseConnection = null;

    private DatabaseConnection(String name){
        // doing something
    }

    public static DatabaseConnection getInstance(String name){
        if(databaseConnection == null){
            synchronized (DatabaseConnection.class){
                if(databaseConnection == null){
                    databaseConnection = new DatabaseConnection(name);
                }
            }
        }

        return databaseConnection;
    }
}
