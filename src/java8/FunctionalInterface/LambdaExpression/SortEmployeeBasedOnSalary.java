package java8.FunctionalInterface.LambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class  Employee1{
    private int id;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee1(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }
}
public class SortEmployeeBasedOnSalary {
    public static void main(String[] args) {
        Employee1 e1=new Employee1(4,100);
        Employee1 e2=new Employee1(2,200);
        Employee1 e3=new Employee1(3,90);
        Employee1 e4=new Employee1(1,300);
        Employee1 e5=new Employee1(7,10);
        List<Employee1>list= Arrays.asList(e1,e2,e3,e4,e5);
        System.out.println(list);
        Collections.sort(list,(a,b)->a.getSalary()- b.getSalary());
        System.out.println(list);



    }
}
