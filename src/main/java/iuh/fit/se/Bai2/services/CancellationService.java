package iuh.fit.se.Bai2.services;

import iuh.fit.se.Bai2.database.DatabaseConnection;

public class CancellationService {

    private DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    public void cancelBooking(String roomId) {
        databaseConnection.Connect();
        System.out.println("Room booking cancelled!" + roomId);
    }
}
