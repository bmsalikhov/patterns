package factory;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryProvider factoryProvider = new FactoryProvider();
        AbstractFactory<Notification> notificationFactory = factoryProvider.getFactory("notification");
        Notification sms = notificationFactory.create("SMS");
        Notification email = notificationFactory.create("EMAIL");
        Notification push = notificationFactory.create("PUSH");
        sms.notifyUser();
        email.notifyUser();
        push.notifyUser();
    }
}