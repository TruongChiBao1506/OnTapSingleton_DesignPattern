package iuh.fit.se.Bai14;

public class Main {
    public static void main(String[] args) {
        MessageSubscriberOne s1 = new MessageSubscriberOne();
        MessageSubscriberTwo s2 = new MessageSubscriberTwo();
        MessageSubscriberThree s3 = new MessageSubscriberThree();

        MessagePublisher publisher = new MessagePublisher();

        // Đăng ký observers
        publisher.register(s1);
        publisher.register(s2);
        publisher.register(s3);

        // Thay đổi trạng thái và thông báo
        publisher.setMessage("First Message");

        // Hủy đăng ký một observer
        publisher.unregister(s2);

        // Thay đổi trạng thái lần nữa
        publisher.setMessage("Second Message");

        publisher.register(s2);

        publisher.setMessage("Third Message");
    }
}
