package java8.FunctionalInterface.DefaultMethod;

interface  Parent{
   default void sayHello()
    {
        System.out.println("Hello");
    }
}
class  Child implements Parent
{

}
public class Example1 {
    public static void main(String[] args) {
        Child c=new Child();
        c.sayHello();
    }
}
