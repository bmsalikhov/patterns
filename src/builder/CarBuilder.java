package builder;

public class CarBuilder {
    private int wheelsCount;
    private String engine;
    private String body;
    CarBuilder addWheels() {
        System.out.println("Wheels added.");
        wheelsCount = 4;
        return this;
    }
    CarBuilder addEngine() {
        System.out.println("Engine added.");
        engine = "super engine";
        return this;
    }
    CarBuilder addBody() {
        System.out.println("Body added.");
        body = "super body";
        return this;
    }

    Car build() {
        return new Car(wheelsCount, engine, body);
    }
}
