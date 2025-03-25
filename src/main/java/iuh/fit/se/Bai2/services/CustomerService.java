package iuh.fit.se.Bai2.services;

import iuh.fit.se.Bai2.database.DatabaseConnection;

public class CustomerService {

    private DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    public void getCustomerInfo(String customerName) {
        databaseConnection.Connect();
        System.out.println("Customer added!" + customerName);
    }
}
