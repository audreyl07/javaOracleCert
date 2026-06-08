package S9JavaOOP.AbstractClass;

public class Car extends Vehicle{

    public Car(String type, String model) {
        super(type, model);
    }

    @Override
    int getMaxSpeed() {
        final int MAX_CAR_SPEED = 320;
        System.out.println("max speed of car is " + MAX_CAR_SPEED + " km/h");
        return 0;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}
