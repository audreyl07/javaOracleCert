package JavaOOPS9.Polymorphism;

public class Car extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }
}
