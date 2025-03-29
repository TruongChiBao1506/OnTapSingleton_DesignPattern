package iuh.fit.se.Bai16;

public class User implements NotificationObserver{
    private String name;
    private String channel;

    public User(String name, String channel) {
        this.name = name;
        this.channel = channel;
    }


    @Override
    public void update(String message, String channel) {
        if(this.channel.equalsIgnoreCase(channel))
            System.out.println("User " + name + " received message: " + message + " from channel: " + channel);
    }
}
