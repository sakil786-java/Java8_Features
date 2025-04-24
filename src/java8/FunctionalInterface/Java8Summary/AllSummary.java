package java8.FunctionalInterface.Java8Summary;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class AllSummary {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(12));

        Function<Integer, Integer> function = x -> x * x;
        System.out.println(function.apply(10));

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Sakil");

        Supplier<Integer>supplier=()->100;
        System.out.println(supplier.get());


    }
}
