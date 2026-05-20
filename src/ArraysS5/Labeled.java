package ArraysS5;

public class Labeled {
    //this is for complex nested loops
    public static void main(String[] args) {
        System.out.println("Unlabeled Loop");
        for (int i=1; i<=3; i++){
            for (int j=1; j<=3; j++){
                System.out.println("outer loop: "+i +", Inner loop: " + j);
                if (i==2 && j==2){
                    break; //terminates inner loop
                }

            }
        }

        System.out.println("Labeled Loop ");
        outerLoop:for (int i=1; i<=3; i++){
            innerLoop:for (int j=1; j<=3; j++){
                System.out.println("outer loop: "+i +", Inner loop: " + j);
                if (i==2 && j==2){
                    break outerLoop; //terminates inner loop
                }

            }
        }
        /*
        String [] animals = {"Cat", "Dog", "Cow", "Lion", "Rabbit"};
        int index = 0;
        String animal = "null";
        animalsLoop: while (index < animals.length){
            animal = animals[index];
            if (animal == "Lion"){
                System.out.println(animal);
                break;
            } index++;
        }

         */
    }


}
