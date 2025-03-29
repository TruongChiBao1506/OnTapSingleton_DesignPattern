package iuh.fit.se.Bai23;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    private int connectionCount;
    private DatabaseConnection(){
        System.out.println("Database connection created");
        connectionCount = 0;
    }
    public static DatabaseConnection getInstance(){
        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null){
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
    public void connect(){
        connectionCount++;
        System.out.println("Connection count: " + connectionCount);
    }
    public int getConnectionCount(){
        return connectionCount;
    }
}
