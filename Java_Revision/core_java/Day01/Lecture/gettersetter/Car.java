package core_java.Day01.Lecture.gettersetter;

public class Car {
    private String color; //Public
    private String Model; //Public
    private double fuelLevel;
    private long costofPurchase;

    private long car;//DefaultAccess

    public String getColor(){
        return color;
    }

    public String getModel(){
        return Modl;
    }

    public Car(long costofPurchase, double fuelLevel, String model, String color) {
        this.costofPurchase = costofPurchase;
        this.fuelLevel = fuelLevel;
        Model = model;
        this.color = color;

    }
}
