package S9JavaOOP.SuperThis;

public class Car extends Vehicle{

    boolean isAuto = false;
    public Car(String type, String model, int maxSpeed, boolean isAuto) {
        super(type, model, maxSpeed);
        this.isAuto = isAuto();
    }

    public boolean isAuto() {
        return isAuto;
    }
}
