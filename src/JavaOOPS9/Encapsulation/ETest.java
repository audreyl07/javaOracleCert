package JavaOOPS9.Encapsulation;

public class ETest {
    public static void main(String[] args) {
        Car car = new Car("Ferrari", 320, false);

        car.setAuto(true);
        System.out.println("Model: " + car.getModel());
        System.out.println("Max Speed: " + car.getSpeed() + " km/h");

        System.out.println("Car is automatic: " + car.isAuto());
    }
}
