package _24_04_08;

import com.github.javafaker.Faker;
import _24_04_08.enums.Department;

/**
 *  Реализовать класс(те создать свой новый), который реализует интерфейс EmployeeProcessor и обрабатывает сотрудников -
 *  например, печатает информацию о каждом сотруднике,
 *  рассчитывает среднюю зарплату, рассчитывает среднюю зарплату в каждом департаменте.
 */

public class DataProcessing implements EmployeeProcessor{
    Department department = Department.SALES;
    Department department2 = Department.HR;
    Department department3 = Department.IT;
    Faker faker = new Faker();

    @Override
    public void printAllInformation() {
        for(Employee e : (Company.fillArray(department,department2,department3,faker))){
            System.out.println(e);
        }
    }

    @Override
    public double findAverageSalary(Employee[] employee) {
        double res = 0;
        for (int i = 0; i < employee.length; i++) {
            res += employee[i].salary;
        }
         return res/employee.length;
    }

    @Override
    public double getAverageSalaryInDepartment(Employee[] employees) {
        double result = 0;
        for (int i = 0; i < employees.length; i++) {
            result = employees[i].department.ordinal();
        }
        return result;
    }

}
