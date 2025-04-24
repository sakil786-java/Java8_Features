package java8.FunctionalInterface.Bi_Java8;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>biConsumerSum=(x,y)->{
            System.out.println(x+y);
        };
        biConsumerSum.accept(10,2);
    }
}
