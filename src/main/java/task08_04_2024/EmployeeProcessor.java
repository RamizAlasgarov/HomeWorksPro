package task08_04_2024;

public interface EmployeeProcessor {
    void printAllInformation();
    double findAverageSalary(Employee[] employees);

    double getAverageSalaryInDepartment(Employee[] employees);
}
