package jagrit.dewan.Challenge90;

import jagrit.dewan.Collection.Utilityclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jagrit","Dewan","Java","Course");
        System.out.println(list);
        listsorter(list);
        System.out.println(list);
    }
    public static void listsorter(List<String> stringList){
        Collections.sort(stringList);
    }
}
