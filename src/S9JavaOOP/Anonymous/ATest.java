package S9JavaOOP.Anonymous;

public class ATest {

    public static void main(String[] args) {
//        Cheetah cheetah = new Cheetah();
//        cheetah.show("Cheetah", 120);


        //Anonymous class
        Animals animal = new Animals(){
            @Override
            public void show(String name, int speed) {
                System.out.println("The " + name + " can run at a speed of " + speed + " km/h.");
            }
        };


        animal.show("Cheetah", 120);
    }
}
