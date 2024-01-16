package bridge;

public class SimpleCar extends Car {
    public SimpleCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.print("SimpleCar engine: ");
        engine.setEngine();
    }
}
