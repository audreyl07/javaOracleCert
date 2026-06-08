package S21Synchronized;

public class Counter {
    private int count = 0;

    public synchronized void increment (){
        count++;
    } //ensures one thread at a time can execute this method

    //getter
    public int getCount() { return count; }
}
