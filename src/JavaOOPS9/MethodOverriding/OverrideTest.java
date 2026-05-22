package JavaOOPS9.MethodOverriding;

public class OverrideTest {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.start();
        vehicle.accelerate(80);
        vehicle.stop();

        System.out.print("\n");
        Car car = new Car();
        car.start();
        car.accelerate(100);
        car.stop();
    }
}
