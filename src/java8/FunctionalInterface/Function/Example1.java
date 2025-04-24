package java8.FunctionalInterface.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Example1 {
    public static void main(String[] args) {

        Function<String, Integer> getLength = x -> x.length();
        System.out.println(getLength.apply("Sakil"));

        Function<String, String> getFirstThreeLetter = x -> x.substring(0, 3);
        System.out.println(getFirstThreeLetter.apply("Sakil"));
        List<Student> result = new ArrayList<>();
        Function<List<Student>, List<Student>> nameStartWithVip = li -> {
            for (Student s : li) {
                if (getFirstThreeLetter.apply(s.getName()).equalsIgnoreCase("vip")) {
                    result.add(s);
                }

            }
            return result;
        };
        Student s1 = new Student(1, "Sakil");
        Student s2 = new Student(1, "Vipul");
        Student s3 = new Student(1, "Arnab");
        Student s4 = new Student(1, "Vipin");

        List<Student>studentList= Arrays.asList(s1,s2,s3,s4);
        List<Student>filterStudent=   nameStartWithVip.apply(studentList);
        System.out.println(filterStudent);

        Function<Integer,Integer>function1=x->x*2;
        Function<Integer,Integer>function2=x->x*x*x;

        System.out.println(function1.andThen(function2).apply(3));//216
        System.out.println(function2.andThen(function1).apply(3));//54



    }
}

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}