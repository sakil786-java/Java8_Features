package java8.FunctionalInterface.Comparator;

import java.util.Comparator;

public class ForSortClass implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
