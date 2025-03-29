package iuh.fit.se.Bai23;

public class Main {
    public static void main(String[] args) {

        Runnable task = () -> {
            DatabaseConnection db = DatabaseConnection.getInstance();
            db.connect();
            System.out.println("Connection count from " + Thread.currentThread().getName() + ": " + db.getConnectionCount());
        };

        // Tạo 3 thread để mô phỏng nhiều người dùng truy cập cùng lúc
        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        // Đợi các thread hoàn thành
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Kiểm tra kết quả cuối cùng
        DatabaseConnection db = DatabaseConnection.getInstance();
        System.out.println("Final connection count: " + db.getConnectionCount());
    }
}
