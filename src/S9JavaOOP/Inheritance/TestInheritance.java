package S9JavaOOP.Inheritance;

public class TestInheritance {
    public static void main(String[] args) {

        SubClass dog = new SubClass();
        dog.eat("Dogs");
        dog.drink("Dogs");
        dog.breath("Dogs");
        dog.move("Dogs");
        dog.bark();
        dog.numberOfLegs = 4;
        dog.printLegs();

        System.out.println("\n");
        SubClass2 bird = new SubClass2();
        bird.eat("Birds");
        bird.drink("Birds");
        bird.breath("Birds");
        bird.move("Birds");
        bird.fly();
        bird.numberOfLegs = 2;
        bird.printLegs();
    }
}
