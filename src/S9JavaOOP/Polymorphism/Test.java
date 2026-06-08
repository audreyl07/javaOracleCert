package S9JavaOOP.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        //points to the car class

        //vehicle.accelerate();

        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
        }

        Vehicle vehicle2 = new Motorcycle(); //this works but the subclass cannot point to the superclass unless you explicitly cast it, so we need to cast it to the motorcycle class
        printAccelerate(vehicle);
        printAccelerate(vehicle2);
//        vehicle2.accelerate();
    }

    public static void printAccelerate(Vehicle vehicle){
        vehicle.accelerate();
    }
    //this is redundant code.
//    public static void printAccelerate(Car car){
//        car.accelerate();
//    }
//
//    public static void printAccelerate(Motorcycle motorcycle){
//        motorcycle.accelerate();
//    }
}
