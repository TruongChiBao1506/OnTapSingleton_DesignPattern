package iuh.fit.se.Bai16;

public class Main {
    public static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem();
        User user1 = new User("User1", "EMAIL");
        User user2 = new User("User2", "SMS");
        User user3 = new User("User3", "PUSH");

        notificationSystem.registerObserver(user1);
        notificationSystem.registerObserver(user2);
        notificationSystem.registerObserver(user3);

        notificationSystem.eventOccurred("Hello");
    }
}
