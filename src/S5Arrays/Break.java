package S5Arrays;

public class Break {
    public static void main(String[] args) {

        String [] animals = {"Monkey", "Bee","Cat", "Dog", "Cow"};

        int index=0;
        String animal = "null";
        while (index < animals.length){
            animal = animals[index];

            if (animal == "Dog"){
                break;
            } index++;

        }
        System.out.println(animal);
       /*
        for (String animal: animals){
            if (animal == "Dog"){
                break;
            }
            System.out.println(animal);
        }

        for (int x=15; x>=0; x--){
            System.out.println("x : " + x);

            if (x==5){
                break; // essentially stops the loop because condition is met
            }
        }

        int a=0;
        switch (a){
            case 0:
                System.out.println("Hi....");
                break;
            case 1:
                System.out.println("Hello....");
                break;

        }

         */

    }
}
