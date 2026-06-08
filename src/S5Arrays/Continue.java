package S5Arrays;

public class Continue {
    public static void main(String[] args) {
        String [] animals = {"Monkey", "Bee","Cat", "Dog", "Cow"};
        int index =0;
        String animal;

        while (index < animals.length){
            animal = animals[index];

            if (animal == "Cow"){
                continue;
            }
            System.out.println(animal);
            index++;
        }
        /*
        String [] animals = {"Monkey", "Bee","Cat", "Dog", "Cow"};
        for (String animal: animals){
            if (animal == "Dog"){
                continue;
            }
            System.out.println(animal);
        }

         */
        /*
        for (int num = 10; num >=0; num--){
            if (num % 2 == 1){
                continue;
            }
            System.out.println(num);
        }

         */
    }
}
