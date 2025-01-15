package jagrit.dewan.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(-6);
        Utilityclass.print(list);
        Collections.sort(list);
        Utilityclass.print(list);

    }
}
