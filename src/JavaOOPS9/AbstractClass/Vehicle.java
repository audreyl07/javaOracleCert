package JavaOOPS9.AbstractClass;

public abstract class Vehicle {
    //abstract super class

    String type;
    String model; //no abstract variables

    public Vehicle(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }

    //abstract method, only declaration
    abstract int getMaxSpeed();
    //cannot be final or private because it needs to be implemented by the subclass
}