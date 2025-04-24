package java8.FunctionalInterface.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1Stream {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(a).filter(x -> x % 2 == 0).map(x -> x * x).sum();
        System.out.println(sum);

        List<String> fruits = Arrays.asList("apple", "banana", "mango", "berry");
        List<String> fruitListAfterCheck = fruits.stream().filter(x -> x.startsWith("b")).map(x -> x + " fruit").collect(Collectors.toList());

        fruitListAfterCheck.forEach(System.out::println);

        Stream<String> bookList = Stream.of("A", "B", "C");
        bookList.forEach(System.out::print);
        System.out.println();
        System.out.println("++");
        List<Integer> list = Arrays.asList(1, 2,10,11, 3, 4, 5, 6,1);
        Stream<Integer> distinct = list.stream().distinct();
        System.out.println("Distinct: ");
        distinct.forEach(System.out::print);
        System.out.println();
        //distict with sorted
        Stream<Integer> sorted =list.stream().distinct().sorted((u,v)->v-u);
    sorted.forEach(System.out::print);
        System.out.println();
        List<Integer> filterList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        filterList.forEach(System.out::println);
        List<Integer> mappedList = filterList.stream().map(x -> x * 2).collect(Collectors.toList());
        mappedList.stream().map(e->e+" ").collect(Collectors.toList()).forEach(System.out::print);

        //sorted

    }
}
