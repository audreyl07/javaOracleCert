package JavaOOPS9.RecordClasses;

public class OuterPerson {
    public int a = 10;
    public record InnerPerson(){
        public void show(){
            System.out.println("This is the inner record class.");
        }
    }
}
