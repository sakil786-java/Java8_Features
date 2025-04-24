package java8.FunctionalInterface.FunctionalInterface_;

import java.util.function.Consumer;

public class Example3 {
    public static void main(String[] args) {
        // Consumer Interface (Takes input, no return)
        Consumer<String> printMessage = message -> System.out.println("Message: " + message);

        printMessage.accept("Lambda in Java");
    }
}
