package java8.FunctionalInterface.Bi_Java8;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String,String ,Integer>stringLengthAdd=(str1,str2)->str1.length()+str2.length();
        System.out.println(stringLengthAdd.apply("sakil","sakil"));
    }
}
