package S9JavaOOP.Inheritance;

public class SuperClass {

    int numberOfLegs;
    public void printLegs(){
        System.out.println("number of legs: " + numberOfLegs);
    }

    public void eat (String animals){
        System.out.println(animals + " eat food.");
    }
    protected void drink(String animals){
        System.out.println(animals + " drink water.");
    }

    void move(String animals){
        System.out.println(animals + " move");
    }

    public void breath(String animals){
        System.out.println(animals + " breathe");
    }
}
