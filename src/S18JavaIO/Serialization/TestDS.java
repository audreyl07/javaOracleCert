package S18JavaIO.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class TestDS {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("persons.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Object personObject = in.readObject();

        //System.out.println(personObject);
        for (Person person: (ArrayList<Person>) personObject) {
            System.out.println(person.toString());
        }
        in.close();
        fileIn.close();
    }
}
