package JavaOOPS9.MethodOverriding;


//super class
public class Vehicle {
    //private cannot inherit
    //default & protected can be inherited and changed
    public void start(){
        System.out.println("Vehicle has started.");
    }
    public void accelerate(int speed){
        System.out.println("Vehicle accelerates at " + speed);
    }

    public void stop(){
        System.out.println("Vehicle has stopped.");
    }
}
