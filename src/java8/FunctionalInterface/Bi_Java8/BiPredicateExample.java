package java8.FunctionalInterface.Bi_Java8;

import java.util.function.BiPredicate;

public class BiPredicateExample
{
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate=(x,y)->x%2==0 && y%2==0;

        System.out.println(biPredicate.test(10,4));

        BiPredicate<String,Integer>stringLengthCheck=(str,l)->str.length()==l;
        System.out.println(stringLengthCheck.test("Sakil",5));
    }
}
