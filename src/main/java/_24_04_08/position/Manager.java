package _24_04_08.position;

import _24_04_08.Employee;
import _24_04_08.enums.Department;

public class Manager extends Employee {
    int managedEmployees;

    public Manager(String name, double salary, Department department, int managedEmployees) {
        super(name, salary, department);
        this.managedEmployees = managedEmployees;
    }


}
