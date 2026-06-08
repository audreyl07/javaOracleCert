package S9JavaOOP.RecordClasses;

public record Person (String name, int age) implements Drink{
    //cannot abstract, private, static
    //implicitly final and public

    //static int age = 30;
    //essentially this simplifies the code by generating constructor, getters, equals, hashcode and toString method

    //can create this kind of constructor
    public Person(){
        this(null, 0);
    }

    //compact canonical constructor
    public Person{
        if (age < 0){
            System.out.println("Age cannot be negative. Setting age to 0.");
        }

    }

    public String isAdult(){
        return age >= 18 ? "Adult" : "Minor";
    }
    @Override
    public void canDrink(String drinkName) {

    }
}
