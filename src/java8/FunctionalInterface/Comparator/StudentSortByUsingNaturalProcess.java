package java8.FunctionalInterface.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    public Integer id;
    public String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString()
    {
        return  this.id+" : "+this.name;
    }
}


public class StudentSortByUsingNaturalProcess {
    public static void main(String[] args) {
        Student st1 = new Student(2, "Sakil");
        Student st2 = new Student(1, "Dure Fisha");
        Student st3 = new Student(10, "Parvin");
        Student st4 = new Student(7, "Muskan");

        List<Student> list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        System.out.println(list);
        Collections.sort(list,new StudentComparator() );
        System.out.println("Descending order sort: "+list);
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o2.id - o1.id;
    }
}
