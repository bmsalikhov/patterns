package bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car simpleCar = new SimpleCar(new SimpleEngine());
        simpleCar.setEngine();
    }
}
