package _24_04_08.position;

import _24_04_08.Employee;
import _24_04_08.enums.Department;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, double salary, Department department, String programmingLanguage) {
        super(name, salary, department);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
