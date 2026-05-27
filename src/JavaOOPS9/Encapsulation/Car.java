package JavaOOPS9.Encapsulation;

public class Car extends Vehicle{

    private boolean isAuto;
    public Car(String model, int speed, boolean isAuto) {
        super(model, speed);
        this.isAuto = isAuto;
    }

    //setter method
    public void setAuto(boolean isAuto) {
        this.isAuto = isAuto;
    }

    public boolean isAuto() {
        return isAuto;
    }
}
