package JavaOOPS9.Anonymous;

public class Cheetah implements Animals{
    @Override
    public void show(String name, int speed) {
        System.out.println("The " + name + " can run at a speed of " + speed + " km/h.");
    }
}
