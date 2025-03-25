package iuh.fit.se.Bai2.database;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Database connection created!");
    }

    public static DatabaseConnection getInstance() {
        if(instance == null) {
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    System.out.println("Creating new database connection");
                    instance = new DatabaseConnection();
                }
            }
        }
        else{
            System.out.println("Database connection already exists");
        }
        return instance;
    }
    public void Connect(){
        System.out.println("Connected to database");
    }
}
