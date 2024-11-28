package in.day2.Equals;

public class EqualsandHashcodetest {
    public static void main(String[] args) {
        Person person = new Person("Jagrit",24,"862");
        Person person1 = new Person("Jagrit",24,"862");

        if (person==person1){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");//Result OF this will always be unequal Because == Compare References
        }
    }

}

