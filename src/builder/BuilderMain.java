package builder;

public class BuilderMain {
    public static void main(String[] args) {
        Car car = new CarBuilder().addBody().addEngine().addWheels().build();
    }
}
