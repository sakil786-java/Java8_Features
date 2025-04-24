package java8.FunctionalInterface.FunctionalInterface_;

// Define a functional interface
@FunctionalInterface
interface Greeting {
    String sayHello(String message);
}

public class Example1 {
    public static void main(String[] args) {
        // Using a traditional class method
        Example1 example1 = new Example1();
        System.out.println(example1.sayHello("Sakil says Hello"));

        // Using a lambda expression with the functional interface
        Greeting example2 = (Str) -> {
            return "Hello, " + Str;
        };

        // Calling the lambda expression
        System.out.println(example2.sayHello("Sakil"));
    }

    // Normal method (not used in lambda)
    public String sayHello(String message) {
        return message;
    }
}

