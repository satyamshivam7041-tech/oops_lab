import java.util.*;
import java.util.stream.*;


class Employee {
    private String name;
    private String department;
    private int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return name + " : " + department + " : " + salary;
    }
}

class ArrayClass {

    public static Stream<Employee> query(List<Employee> elist, String dept, double sal) {
        return elist.stream()
                .filter(e -> e.getDepartment().equals(dept) && e.getSalary() >= sal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        var eList = new ArrayList<Employee>();

        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));

        
        String dept = sc.next();
        double salary = sc.nextDouble();

        query(eList, dept, salary)
                .forEach(System.out::println);
    }
}