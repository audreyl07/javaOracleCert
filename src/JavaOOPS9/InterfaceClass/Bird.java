package JavaOOPS9.InterfaceClass;

public class Bird implements CanFed, CanFly{

    //implement the methods of the interfaces
    @Override
    public void canEat() {
        System.out.println("Birds can eat bird seed");
    }
    @Override
    public void canDrink() {
        System.out.println("Birds can drink water");
    }
    @Override
    public void canFly(){
        System.out.println("Birds can fly");
    }
}
