package iuh.fit.se.Bai2.services;

import iuh.fit.se.Bai2.database.DatabaseConnection;

public class BookingService {
    private DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    public void bookRoom(String roomId) {
        databaseConnection.Connect();
        System.out.println("Room booked!" + roomId);
    }
}
