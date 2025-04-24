package java8.FunctionalInterface.FunctionalInterface_;

public class Example2 {
    public static void main(String[] args) {
        // Using Lambda for Runnable
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task Running: " + i);
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}
