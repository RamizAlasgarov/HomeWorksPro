package _24_04_08;

import com.github.javafaker.Faker;
import _24_04_08.enums.Department;
import _24_04_08.position.Developer;
import _24_04_08.position.Manager;

/**
 * Задание:
 * Реализовать описанные классы и интерфейс.
 * Создать несколько экземпляров классов Manager и Developer, а также поместить их в массив в классе Company.
 *
 */
public class Company {
    public static void main(String[] args) {
        Department department = Department.SALES;
        Department department2 = Department.HR;
        Department department3 = Department.IT;
        Faker faker = new Faker();


        DataProcessing dataProcessing = new DataProcessing();
        dataProcessing.printAllInformation();
        System.out.println();
        System.out.println(dataProcessing.findAverageSalary(fillArray(department, department2, department3, faker)));
        System.out.println();
        System.out.println(dataProcessing.getAverageSalaryInDepartment(fillArray(department, department2, department3, faker)));


    }

    static Employee[] fillArray(Department department, Department department2, Department department3, Faker faker) {

        Manager manager = new Manager(faker.name().name(),1500.2, department,5);
        Manager manager2 = new Manager(faker.name().name(),1300.50, department,5);
        Manager manager3 = new Manager(faker.name().name(),1400.20, department2,5);
        Developer developer = new Developer(faker.name().name(), 800.50, department3,"Java");
        Developer developer2 = new Developer(faker.name().name(),1300.80, department3,"Cotlin");
        Developer developer3 = new Developer(faker.name().name(),2000, department3,"C++");
        Employee[] employees = new Employee[]{manager,manager2,manager3,developer,developer2,developer3};
        return employees;
    }
}
