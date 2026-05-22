package JavaOOPS9;

public class ThisKeyword {

    String car;
    int year;

    //default constructor
    public ThisKeyword(){
        this("BMW", 2026); //watch for recursive looping

        //cannot use this everywhere.
    }

    public ThisKeyword(String car, int year){
        //refers to the instance of this class
        this.car = car;
        this.year = year;
        //this would be the default variables. null & 0
//        car = car;
//        year = year;
    }

    public void printHello(){
        System.out.println("Hello");
        this.printWorld();
    }
    public void printWorld(){
        System.out.println("World");
    }

    public static void main(String[] args) {
        ThisKeyword object = new ThisKeyword();
        System.out.println("Car: " + object.car);
        System.out.println("Year: " +object.year );


        object.printHello();
    }
}
