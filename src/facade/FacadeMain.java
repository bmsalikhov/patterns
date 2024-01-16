package facade;

public class FacadeMain {
    public static void main(String[] args) {
        Facade car = new Facade();
        car.startCar();
        car.stopCar();
    }
}
