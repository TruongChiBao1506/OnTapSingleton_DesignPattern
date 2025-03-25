package iuh.fit.se.Bai2;

import iuh.fit.se.Bai2.database.DatabaseConnection;
import iuh.fit.se.Bai2.services.BookingService;
import iuh.fit.se.Bai2.services.CancellationService;
import iuh.fit.se.Bai2.services.CustomerService;

public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Bắt đầu hệ thống quản lý đặt phòng...\n");

        // Kiểm tra Singleton bằng cách gọi nhiều lần
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.Connect();

        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.Connect();

        // Kiểm tra hashCode để đảm bảo chỉ có một instance
        System.out.println("\n🔍 Kiểm tra instance:");
        System.out.println("db1 hashcode: " + db1.hashCode());
        System.out.println("db2 hashcode: " + db2.hashCode());

        // Gọi các dịch vụ để kiểm tra việc sử dụng chung instance
        BookingService bookingService = new BookingService();
        CancellationService cancellationService = new CancellationService();
        CustomerService customerService = new CustomerService();

        bookingService.bookRoom("101");
        cancellationService.cancelBooking("102");
        customerService.getCustomerInfo("CUST001");
    }
}
