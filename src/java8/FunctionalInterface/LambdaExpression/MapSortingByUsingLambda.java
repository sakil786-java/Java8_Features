package java8.FunctionalInterface.LambdaExpression;

import java.util.Map;
import java.util.TreeMap;

public class MapSortingByUsingLambda {
    public static void main(String[] args) {
        Map<Integer,String>map=new TreeMap<>();
        map.put(2,"Sakil");
        map.put(5,"Sameha");
        map.put(1,"Parvin");
        map.put(4,"Dure Fisha Saleem");
        System.out.println("Before Sorting "+map);
        Map<Integer,String>map2=new TreeMap<>((a,b)->(b-a));
        map2.put(2,"Sakil");
        map2.put(5,"Sameha");
        map2.put(1,"Parvin");
        map2.put(4,"Dure Fisha Saleem");

        System.out.println("After Sorting "+map2);
    }
}
