package factory;

public class NotificationFactory implements AbstractFactory<Notification> {
    public Notification create(String channel) {
        if (channel == null || channel.isEmpty()) {
            return null;
        }
        return switch (channel) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            case "PUSH" -> new PushNotification();
            default -> throw new IllegalArgumentException("Unknown channel: " + channel);
        };
    }
}
