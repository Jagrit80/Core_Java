package jagrit.dewan.Challenge87;

import java.util.Scanner;

//Arithmetic Exception Handling
//Write a program that asks the user to enter two integers and
//then divides the first by the second. The program should
//handle any arithmetic exceptions that may occur (like
//division by zero) and display an appropriate message.
//Key Points:
//• Use Scanner to read user input.
//• Implement a try-catch block to handle ArithmeticException.
//• Display a user-friendly message if division by zero occurs.
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Please enter First Number");
        int First = input.nextInt();
        System.out.println("Please enter Second Number");
        int second = input.nextInt();
        try {
            int result = First/second;

        }
        catch (ArithmeticException excep){
            if (excep.getMessage().equals("/ by zero"))
                System.out.println("Divide by Zero Occured");
            else {
                throw excep;
            }
        }

    }
}
