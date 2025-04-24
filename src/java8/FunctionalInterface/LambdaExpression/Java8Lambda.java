package java8.FunctionalInterface.LambdaExpression;

public class Java8Lambda {
    public static void main(String[] args) {
        Employee sde=()->"Software Engineer from Lambda";
        System.out.println(sde.getName());
        Employee editor=()->"Editor from Lambda";
        System.out.println(editor.getName());
    }
}
