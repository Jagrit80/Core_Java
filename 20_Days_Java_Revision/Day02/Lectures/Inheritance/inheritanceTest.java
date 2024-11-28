package in.day2.Inheritance;

public class inheritanceTest {
    public static void main(String[] args) {
        Vehicle Veh = new Vehicle(); //As Two Wheeler extends Vehicle Now it can Make object of Vehicle Here
        twoWheeler tw = new twoWheeler();
        Veh.commute();
        tw.commute(); //As Commute is a method of vehicle class but as two wheeler extends vehicle thats why twowheeler can access methods behaviours and variables of Vehicle

        //Object Class Method//
        System.out.println(Veh.toString());
        System.out.println(Veh.hashCode());
        System.out.println(Veh.toString());//to string method is overridden in Parent Class Vehicle
        System.out.println(Veh.getClass());//Gives Fully Qualified Class Name
    }
}
