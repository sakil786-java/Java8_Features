package java8.FunctionalInterface.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MethodReferencesExample {
    public static void print(String s)
    {
        System.out.println(s);
    }

    public static void main(String[] args) {
        List<String>students= Arrays.asList("sakil","alice");
        students.forEach(MethodReferencesExample::print);//giving references
    }
}
