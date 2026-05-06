interface Vehicle {
    void start();

    default void stop() {
        System.out.println("стор");
    }

    static void serviceInfo() {
        System.out.println("10000 км");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("двигатель");
    }

    @Override
    public void stop() {
        System.out.println("тормоз");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        Vehicle.serviceInfo();
    }
}