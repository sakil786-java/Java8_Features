package java8.FunctionalInterface.DefaultMethod;
interface A {
    default void sayHello() {
        System.out.println("From A");
    }
}
interface B {
    default void sayHello() {
        System.out.println("From B");
    }
}

public class Example2 implements A, B {
    public static void main(String[] args) {
        Example2 example2 = new Example2();
        example2.sayHello();
    }
    //    @Override
//    public void sayHello() {
//        System.out.println("Own Implementation");
//    }
    @Override
    public void sayHello() {
        A.super.sayHello();
    }
}