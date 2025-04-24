package java8.FunctionalInterface.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StringUpperCase {
    public static void main(String[] args) {
        //Convert List to Uppercase:
        //Given a list of strings, convert each string to uppercase using Stream.map().
        List<String> stringList = Arrays.asList("sakil", "sourav", "arnab");
        List<String> upperCaseList = stringList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCaseList);

//        Filter Even Numbers:
//        Given a list of integers, filter out all odd numbers and collect even numbers into a new list.

        List<Integer>listInteger=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(listInteger);
        List<Integer> evenNumber = listInteger.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumber);

        //Find the First Element:
        //Find the first element in a stream that matches a given condition (e.g., greater than a specific value).
        System.out.println(listInteger);
        Integer firstElement = listInteger.stream().filter(x -> x > 5).findFirst().get();
        System.out.println(firstElement);

        //Count Matching Elements:
        //Count how many elements in a list satisfy a condition (e.g., greater than a specific value).
        List<Integer>integerList=Arrays.asList(1,2,3,4,5,6,3,4,5,6);
        //how many odd number
        long oddCount = integerList.stream().filter(x -> x % 2 != 0).count();
        System.out.println(oddCount);

        // Sort a List:
        // Sort a list of custom objects (e.g., Employee) based on a field like salary using Stream.sorted().

        List<Employee>employeeList=Arrays.asList(
                new Employee(100,"Sakil"),
                new Employee(50,"Rohan"),
                new Employee(80,"Jadu"),
                new Employee(120,"Soumya")


        );
        System.out.println(employeeList);
        List<Employee> sortedInDescList = employeeList.stream().sorted((a, b) -> b.getSalary() - a.getSalary()).collect(Collectors.toList());
        System.out.println(sortedInDescList);
        List<Employee> secondHighestSalary = sortedInDescList.stream().skip(1).limit(1).collect(Collectors.toList());
        System.out.println(secondHighestSalary);



        //Find Max or Min by Field:
       // Find the employee with the highest or lowest salary using Stream.max() or Stream.min().
        Employee employeeWithHighestSalary = employeeList.stream().max((a, b) -> a.getSalary() - b.getSalary()).get();
        System.out.println("Highest Salary:"+ employeeWithHighestSalary);
        Employee employeeWithLowestSalary = employeeList.stream().min((a, b) -> a.getSalary() - b.getSalary()).get();
        System.out.println("Lowest Salary:"+  employeeWithLowestSalary);
    }

}

class Employee{
    private int salary;
    private String name;
    Employee(int salary,String name)
    {
        this.salary=salary;
        this.name=name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString()
    {
        return "Employee: "+ name+" : "+salary;
    }

}