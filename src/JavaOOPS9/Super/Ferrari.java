package JavaOOPS9.Super;

public class Ferrari extends Cars{

    boolean isAuto = true;

    public Ferrari(){
        super(); //invokes default constructor of the super class
        System.out.println("sub class default constructor");
    }
    public void printGear(){
        System.out.println(isAuto);
        System.out.println(super.isAuto);
    }

    public void accelerate(){
        System.out.println("ferrari accelerates faster");
    }
    public void speed(){
        System.out.println("Ferrari reaches 300");
    }

    public void display(){
        speed();
        super.accelerate();
        accelerate();
    }
}
