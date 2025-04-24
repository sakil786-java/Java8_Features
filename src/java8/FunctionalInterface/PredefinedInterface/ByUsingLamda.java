package java8.FunctionalInterface.PredefinedInterface;

public class ByUsingLamda {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for(int i=1;i<=5;i++)
            {
                System.out.println("Thread by using Lambda : "+ i);
            }
        };
        Thread thread=new Thread(runnable);
        thread.run();
    }
}
