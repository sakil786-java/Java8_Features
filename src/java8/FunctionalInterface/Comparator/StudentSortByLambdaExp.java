package java8.FunctionalInterface.Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student2 {
    public Integer id;
    public String name;

    public Student2(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return  this.id+" : "+this.name;
    }
}
public class StudentSortByLambdaExp {
    public static void main(String[] args) {
        Student2 st1 = new Student2(2, "Sakil");
        Student2 st2 = new Student2(1, "Dure Saleem Fisha");
        Student2 st3 = new Student2(10, "Parvin");
        Student2 st4 = new Student2(7, "Muskan");

        List<Student2> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        System.out.println(list);
        Collections.sort(list,(a,b)->(b.id-a.id) );
        System.out.println("Descending order sort: "+list);
    }
}
