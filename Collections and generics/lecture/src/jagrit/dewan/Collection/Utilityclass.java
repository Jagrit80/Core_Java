package jagrit.dewan.Collection;

import java.util.Collection;

public class Utilityclass {
    public static void print(Collection collection){
        System.out.print("Collection is: ");
        for (Object coll : collection) {
            System.out.print(coll.toString());
        }
        System.out.println();
    }
}
