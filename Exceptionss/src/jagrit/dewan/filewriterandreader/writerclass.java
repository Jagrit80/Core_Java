package jagrit.dewan.filewriterandreader;

import java.io.FileWriter;
import java.io.IOException;

public class writerclass {
    public static void main (String[] args) {
        String filename = "javaCourse.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("This is the Best JavaPractice");
            writer.flush();
            System.out.println("File Written Successfully");

        }
        catch (IOException exception){
            System.out.printf( "Exception occured %s", exception.getMessage());
        }

    }
}
