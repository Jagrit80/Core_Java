package jagrit.dewan.filewriterandreader;

import java.io.FileReader;
import java.io.IOException;

public class readerclass {
    public static void main(String[] args) {
        String filename = "javaCourse.txt";
        try (FileReader reader = new FileReader(filename)){
        int read = 0;
        do {
            read = reader.read();
            System.out.println((char) read);
        }while (read != -1);
        }
        catch (IOException e){
            System.out.println("exception Occured");
        }

    }
}
