package TrafficLight;

public class TrafficLightTest {

    public static void main(String[] args) {
        TrafficLight[] lights = TrafficLight.values();

        for (TrafficLight light: lights) {
            System.out.println(light.name() + " action: " + light.getAction());
        }
    }
}
