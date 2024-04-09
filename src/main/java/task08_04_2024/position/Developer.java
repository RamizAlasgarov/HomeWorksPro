package task08_04_2024.position;

import task08_04_2024.enums.Department;
import task08_04_2024.Employee;

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
