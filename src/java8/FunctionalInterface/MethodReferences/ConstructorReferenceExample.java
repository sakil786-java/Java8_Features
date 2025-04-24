package java8.FunctionalInterface.MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sakil","Bob");
      //  List<Student>studentList=  names.stream().map(x->new Student(x)).collect(Collectors.toList());
        List<Student>studentList=  names.stream().map(Student::new ).collect(Collectors.toList());

        //studentList.forEach(student -> System.out.println(student));
        studentList.forEach(System.out::println);

    }
}

class Student{
    private  String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}