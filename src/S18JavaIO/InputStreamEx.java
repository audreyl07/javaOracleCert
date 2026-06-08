package S18JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("example.txt");
            int length = inputStream.available();
            System.out.println("length = " + length);

            System.out.println("reading data from file: ");
            byte[] charArray = new byte[length];
            inputStream.skip(5);
            int charRead = inputStream.read(charArray, 0, 11);
            String charString = new String(charArray);
            System.out.println(charString);

            for (int offset = 0; offset < 11; offset++){
                String characterString = new String(charArray, offset, 1);
                System.out.print(characterString);
                Thread.sleep(500L);

            }
            /*System.out.println("reading data from file: ");
            int charAsDecimal = inputStream.read();
            while (charAsDecimal != -1){
                char character = (char) charAsDecimal;
                String eachCharAsString = String.valueOf(character);
                System.out.print(eachCharAsString);
                Thread.sleep(500L);
                charAsDecimal = inputStream.read();
            }
            System.out.println("\nFinished reading data from file");
            inputStream.close();

             */


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
