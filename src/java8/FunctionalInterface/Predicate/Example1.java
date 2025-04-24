package java8.FunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Example1 {
    public static void main(String[] args) {
        Predicate<Integer>salaryGreaterThanLakh=x->x>100000;
        System.out.println(salaryGreaterThanLakh.test(100));
        System.out.println(salaryGreaterThanLakh.test(50000000));

        Predicate<String> letterStartWithW=x->x.toLowerCase().charAt(0)=='w';
        System.out.println(letterStartWithW.test("World of Game"));


    }
}
