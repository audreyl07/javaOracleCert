package S18JavaIO;

import java.io.*;
import java.util.Scanner;

public class CopyingFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter file name:");
        String newFileName = scanner.nextLine();
        try {
            Reader reader = new FileReader("test.txt");
            Writer writer = new FileWriter("copy.txt");

            if (reader.ready()){
                System.out.println("Reading...");
                int characterRead;

                do {
                    characterRead = reader.read();
                    if (characterRead != -1) {
                        writer.write(characterRead);
                    }
                } while (characterRead != -1);
                System.out.println("Finished copying file");
            }

             reader.close();
             scanner.close();
             writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
