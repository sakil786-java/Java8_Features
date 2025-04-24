package java8.FunctionalInterface.ComparatorWithMoreMethod;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Sakil", 27, "DEV"));
        employeeList.add(new Employee("Devesh", 23, "HR"));
        employeeList.add(new Employee("Samiha", 18, "TEST"));
        employeeList.add(new Employee("Srijani", 18, "HR"));
        employeeList.add(new Employee("Kushal", 30, "DEV"));
        employeeList.add(new Employee("Koushik", 50, "HR"));
        employeeList.add(new Employee("Arif", 18, "TEST"));
        System.out.println("Employee before sort");
        System.out.println(employeeList);
        // comparingInt()
        List<Employee> sortedByAge = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList());
        System.out.println("Employee after sort");
        System.out.println(sortedByAge);

        //thenComparing()
        //sort by age then name
        List<Employee> sortedByAgeThenName = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(sortedByAgeThenName);
        //sort by age then name length
        List<Employee> sortedByAgeThenNameLength = employeeList.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing((x, y) -> y.getName().length() - x.getName().length())).collect(Collectors.toList());
        System.out.println(sortedByAgeThenNameLength);
        //Sort by age then department name
        List<Employee> sorthByAgeThenDepartmentName = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getDepartment)).collect(Collectors.toList());
        System.out.println("--");
        System.out.println(sorthByAgeThenDepartmentName);
        //Custom Object Filters:
        //Filter employees based on multiple criteria (e.g., age > 25 and name length start with K ).

        List<Employee> ageGreaterThan25AndStartWithK = employeeList.stream().filter(emp -> emp.getAge() > 25 && emp.getName().startsWith("K")).collect(Collectors.toList());
        ageGreaterThan25AndStartWithK.forEach(System.out::println);


        //Grouping BY Department

        Map<String, List<Employee>> groupByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        groupByDepartment.forEach((department, employee) -> {
            System.out.print(department + ": ");
            System.out.println(employee);
        });

        //Count Occurrences:
        //Count the frequency of each word in a list using Stream and Collectors.groupingBy().
        List<String> stringList = Arrays.asList("apple", "banana", "bird", "apple", "bomb", "cup", "phone", "bomb");
        Map<String, Long> stringGrouping = stringList.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(stringGrouping);


        //Identify duplicate elements in a list using Collectors.groupingBy().
        Map<String, Long> stringGrouping2 = stringList.stream().collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        List<String>duplicateWord = stringGrouping2.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateWord);


    }
}
