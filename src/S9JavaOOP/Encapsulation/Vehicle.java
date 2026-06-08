package S9JavaOOP.Encapsulation;

public class Vehicle {
    private String model;
    private int speed;

    public Vehicle (String model, int speed){
        this.model = model;
        this.speed = speed;
    }

    //getter methods
    public int getSpeed(){
        return speed;
    }

    public String getModel() {
        return model;
    }

    //setter methods
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
