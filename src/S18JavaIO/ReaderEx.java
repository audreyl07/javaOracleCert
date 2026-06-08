package S18JavaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws IOException, InterruptedException {

        Reader reader = new FileReader("test.txt");
        System.out.println("Reading...");
        int characterRead;
        //char [] charArray = new char[100];
        String text = "";
        if (reader.ready()){
            reader.skip(11);

            do {
                 //characterRead = reader.read(charArray, 0, 6);
                characterRead = reader.read();
                if (characterRead != -1){

                    text = text.concat(String.valueOf((char) characterRead));


                     //String charString = new String(charArray);
                     //System.out.print(charString);

                     //System.out.print((char)characterRead);
                     //Thread.sleep(300L);
                 }
            } while (characterRead != -1);
        }

        int index = text.indexOf("Writer");
        System.out.println(text.substring(index, index+6));

        System.out.println();
        System.out.println("Finished reading");
        reader.close();
    }
}
