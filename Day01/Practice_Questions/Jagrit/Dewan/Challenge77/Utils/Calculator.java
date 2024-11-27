package Jagrit.Dewan.Challenge77.Utils;

import Jagrit.Dewan.Challenge77.Geometry.Circle;
import Jagrit.Dewan.Challenge77.Geometry.Rectangle;


public class Calculator {
    public static void main(String[] args) {
        Circle Cir = new Circle(5.5);
        Rectangle Rect = new Rectangle(15,20);

        double CirArea = Math.PI * Math.pow(Cir.radius,2);
        int RectArea = Rect.length * Rect.breadth;

        System.out.printf("Area of Circle is %s",CirArea);
        System.out.printf("Area of Rectangle is %s", RectArea);
    }
}
