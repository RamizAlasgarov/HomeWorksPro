package task08_04_2024.position;

import task08_04_2024.enums.Department;
import task08_04_2024.Employee;

public class Manager extends Employee {
    int managedEmployees;

    public Manager(String name, double salary, Department department, int managedEmployees) {
        super(name, salary, department);
        this.managedEmployees = managedEmployees;
    }


}
