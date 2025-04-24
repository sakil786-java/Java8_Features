package java8.FunctionalInterface.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        Consumer<String >consumer=s -> System.out.println(s);
        consumer.accept("Sakil");

        Consumer<List<Integer>>listConsumer=li->{
            for(Integer i:li)
            {
                System.out.print(i+100+" ");
            }
        };
        listConsumer.accept(Arrays.asList(1,2,3,4));
        System.out.println("____________");

        Consumer<List<Integer>>listConsumer2=li->{
            for(Integer i:li)
            {
                System.out.print(i+" ");
            }
        };
        listConsumer2.andThen(listConsumer).accept(Arrays.asList(1,2,3,4));
    }
}

