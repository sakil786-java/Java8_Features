package java8.FunctionalInterface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingByUsingLambda {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(5);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,(a,b)->(b-a));
        System.out.println("by using lambda List:"+ list);
    }
}
