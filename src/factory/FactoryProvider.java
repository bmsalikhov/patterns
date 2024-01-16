package factory;

public class FactoryProvider {
    public AbstractFactory getFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }
        return switch (type) {
            case "notification" -> new NotificationFactory();
            default -> throw new IllegalArgumentException("Unknown type: " + type);
        };
    }
}
