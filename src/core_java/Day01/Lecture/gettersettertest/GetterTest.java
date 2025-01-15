package core_java.Day01.Lecture.gettersettertest;

import gettersetter.Car;

public class GetterTest {

    public static void main(String[] args) {
        Car car = new Car(100000,5.0,"Maruti","Black");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }
}
