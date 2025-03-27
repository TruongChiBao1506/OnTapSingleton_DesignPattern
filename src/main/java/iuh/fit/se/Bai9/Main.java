package iuh.fit.se.Bai9;

public class Main {
    public static void main(String[] args) {
        // Trường hợp 1: Đơn hàng hoàn tất bình thường
        System.out.println("=== Normal Order Flow ===");
        OrderContext order1 = new OrderContext("ORD001");
        order1.processOrder(); // Mới tạo -> Kiểm tra thông tin
        order1.processOrder(); // Đang xử lý -> Đóng gói và vận chuyển
        order1.processOrder(); // Đã giao -> Cập nhật trạng thái
        System.out.println("Final state of ORD001: " + order1.getStateName());
        System.out.println();

        // Trường hợp 2: Đơn hàng bị hủy sau khi tạo
        System.out.println("=== Order Cancellation Flow ===");
        OrderContext order2 = new OrderContext("ORD002");
        order2.processOrder(); // Mới tạo -> Kiểm tra thông tin
        order2.setState(new CancelledState()); // Hủy đơn hàng
        order2.processOrder(); // Xử lý hủy và hoàn tiền
        System.out.println("Final state of ORD002: " + order2.getStateName());
    }
}
