package java8.FunctionalInterface.PredefinedInterface;

public class MainForMyClass {
    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        Thread thread=new Thread(myClass);
        thread.run();
    }
}
