package in.day2.nested;

public class Car {
    private int noOfDoors;
    public void repair(){
        tyre t = new tyre();
    }
    private static class tyre{
        private double width;
        private double pressure;
        private String material;

        public void inflate(){

        }
    }
}
