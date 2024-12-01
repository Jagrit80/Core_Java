package jagrit.dewan.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Division Calculator");
        int first = input.nextInt();
        int second = input.nextInt();

        try {
            int[] a = new int[5];
            a[6] = first/second;
            System.out.println("result is %d" + a[6]);
        }
        catch (ArithmeticException exception){
            System.out.println("enter valid values Divide by zero is invalid calculation");
        }
        catch (Throwable th){
            System.out.println("General Exception");
            throw th;
        }
        finally {
            System.out.println("I am In finally");//This wil always run
        }

    }
}
