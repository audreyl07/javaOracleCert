package JavaOOPS9.Polymorphism;

public class Motorcycle extends Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Motorcycle is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is braking");
    }
}
