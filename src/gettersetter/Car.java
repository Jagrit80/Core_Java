package gettersetter;

public class Car {
    private String color; //Public
    private String Model; //Public
    private double fuelLevel;
    private long costofPurchase; //DefaultAccess

    public String getColor(){
        return color;
    }

    public String getModel(){
        return Model;
    }

    public Car(long costofPurchase, double fuelLevel, String model, String color) {
        this.costofPurchase = costofPurchase;
        this.fuelLevel = fuelLevel;
        Model = model;
        this.color = color;
    }
}
