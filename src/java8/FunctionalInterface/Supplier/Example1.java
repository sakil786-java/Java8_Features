package java8.FunctionalInterface.Supplier;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example1 {
    public static void main(String[] args) {
        //it will only return
        Supplier<Integer>integerSupplier=()->1;
        System.out.println(integerSupplier.get());



    }
}
