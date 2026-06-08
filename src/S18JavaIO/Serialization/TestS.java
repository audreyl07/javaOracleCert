package S18JavaIO.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestS {
    public static void main(String[] args) throws IOException {

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Benjamin", "Smith", 20, false, 1, 70.5));
        personList.add(new Person("Emily", "Johnson", 21, false, 2, 59.6));
        personList.add(new Person("Alexander", "William", 22, true, 3, 80.1));
        personList.add(new Person("William", "Taylor", 23, true, 4, 75.6));

        FileOutputStream fileOut = new FileOutputStream("persons.txt");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(personList);
        out.close();
        fileOut.close();

        System.out.println("Serialized data is saved in persons.txt");
    }
}

