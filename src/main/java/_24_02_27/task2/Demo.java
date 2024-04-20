package _24_02_27.task2;

import com.github.javafaker.Faker;

public class Demo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Employee[] employees = new Employee[]{new Manager(faker.name().name(),
                "manager",
                500,
                faker.number().randomDigit()),new Developer(faker.name().name(),
                "Developer",1000.10,"Java")};

        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}
