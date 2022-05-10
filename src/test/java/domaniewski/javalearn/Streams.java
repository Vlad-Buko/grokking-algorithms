package domaniewski.javalearn;


import stream.person.Department;
import stream.person.Employee;
import stream.person.Position;

import java.util.List;

public class Streams {
    private List<Employee> emps = List.of(
            new Employee("Michael", "Smith",   243,  43, Position.MIDDLE),
            new Employee("Jane",    "Smith",   523,  40, Position.MANAGER),
            new Employee("Jury",    "Gagarin", 6423, 26, Position.MANAGER),
            new Employee("Jack",    "London",  5543, 53, Position.MIDDLE),
            new Employee("Eric",    "Jackson", 2534, 22, Position.MIDDLE),
            new Employee("Andrew",  "Bosh",    3456, 44, Position.MIDDLE),
            new Employee("Joe",     "Smith",   723,  30, Position.MANAGER),
            new Employee("Jack",    "Gagarin", 7423, 35, Position.MANAGER),
            new Employee("Jane",    "London",  7543, 42, Position.PILOT),
            new Employee("Mike",    "Jackson", 7534, 31, Position.PILOT),
            new Employee("Jack",    "Bosh",    7456, 54, Position.PILOT),
            new Employee("Mark",    "Smith",   123,  41, Position.MANAGER),
            new Employee("Jane",    "Gagarin", 1423, 28, Position.MANAGER),
            new Employee("Sam",     "London",  1543, 52, Position.PILOT),
            new Employee("Jack",    "Jackson", 1534, 27, Position.PILOT),
            new Employee("Eric",    "Bosh",    1456, 32, Position.MIDDLE)
    );

    private List<Department> deps = List.of(
            new Department(1, 0, "Head"),
            new Department(2, 1, "West"),
            new Department(3, 1, "East"),
            new Department(4, 2, "Germany"),
            new Department(5, 2, "France"),
            new Department(6, 3, "China"),
            new Department(7, 3, "Japan")
    );
}
