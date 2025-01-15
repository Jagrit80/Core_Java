package jagrit.dewan.Collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set <String>set = new HashSet<>();
        System.out.println(set.add("Jagrit"));
        System.out.println(set.add("Java"));
        System.out.println(set.add("Dewan"));
        Utilityclass.print(set);
        System.out.println(set.add("Jagrit"));
        Utilityclass.print(set);


    }
}
