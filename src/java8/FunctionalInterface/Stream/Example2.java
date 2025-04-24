package java8.FunctionalInterface.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
//sort the list by descending , distinct element, start from 2nd highest,limit 3, only odd number,add 100
        List<Integer>list= Arrays.asList(9,8,2,3,7,6,9,8,1,0,5);

        List<Integer> integerList = list.stream().distinct()
                .filter(x -> x % 2 != 0)
                .sorted((a,b)->b-a).skip(1).limit(3).map(x -> x + 100).collect(Collectors.toList());
        integerList.forEach(System.out::println);


        //print 0 to 100

        List<Integer> collected = Stream.iterate(0, x -> x + 1).limit(101).skip(1).collect(Collectors.toList());
        System.out.print(collected+" ");
        System.out.println();
      Integer max=  Stream.iterate(0, x -> x + 1).limit(101).max((a,b)->a-b).get();
      System.out.println("max : "+max);
        Integer max2=  Stream.iterate(0, x -> x + 1).limit(101).max((a,b)->b-a).get();
        System.out.println("max2 : "+max2);

        Integer min=  Stream.iterate(0, x -> x + 1).limit(101).min((a,b)->a-b).get();
        System.out.println("min : "+min);
    }
}
