package java8.FunctionalInterface.PredefinedInterface;

public class MyClass implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Hello : "+ i);
        }
    }
}

