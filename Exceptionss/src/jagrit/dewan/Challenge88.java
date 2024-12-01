package jagrit.dewan;
//File Not Found Exception Handling
//Write a program to read a filename from the user and display its
//content. The program should handle the situation where the file
//does not exist.
//Key Points:
//• Use Scanner to read the filename from the user.
//• Use FileReader to read the file content.
//• Implement a try-catch block to handle FileNotFoundException.
//• Display a message informing the user if the file is not found.

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Challenge88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter File Name: ");
        String filename = input.next();
        System.out.printf("File name is %s",filename);
        try (FileReader reader = new FileReader(filename)){
            int read = 0;
            do {
                read = reader.read();
                System.out.println((char)read);

            }while (read != -1);
        }
        catch (FileNotFoundException F){
            System.out.println("File not Found Exception occured");
        }
        catch (IOException e){
            System.out.println("IO Exception Occured");
        }


        }
    }

