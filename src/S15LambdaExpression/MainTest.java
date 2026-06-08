package S15LambdaExpression;

public class MainTest {
    public static void main(String[] args) {
        //Anonymous class
        /*
        Animals animals = new Animals(){

            @Override
            public void show(String animal, int speed){
                System.out.println("The " + animal + " runs at a speed of " + speed + " km/h.");
            }
        };

        animals.show("Cheetah", 120);


        //Lambda expression
        Animals animal = (a, s) -> {
            System.out.println("The " + a + " runs at a speed of " + s + " km/h.");
        };
        animal.show("Cheetah", 120);
        */

        Animals animal = MainTest::display;
        animal.show ("Cheetah", 120);
    }

    public static void display(String animal, int speed){
        System.out.println("The " + animal + " runs at a speed of " + speed + " km/h.");
    }
}
