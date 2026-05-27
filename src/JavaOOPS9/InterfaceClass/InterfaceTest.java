package JavaOOPS9.InterfaceClass;

public class InterfaceTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.canDrink();
        bird.canEat();
        bird.canFly();

        System.out.println("-----------------------------");

        People people = new People();
        people.canDrink();
        people.canEat();
    }
}
