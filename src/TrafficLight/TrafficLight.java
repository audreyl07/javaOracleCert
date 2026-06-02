package TrafficLight;

public enum TrafficLight {

    RED("Stop"), YELLOW("Wait"), GREEN("Go");

    private String action;
    //can only be private or default
    TrafficLight(String action){
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
