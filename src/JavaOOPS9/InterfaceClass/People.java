package JavaOOPS9.InterfaceClass;

public class People implements CanFed{
    @Override
    public void canEat() {
        System.out.println("People can eat meat");
    }

    @Override
    public void canDrink() {
        System.out.println("People can drink water");
    }
}
