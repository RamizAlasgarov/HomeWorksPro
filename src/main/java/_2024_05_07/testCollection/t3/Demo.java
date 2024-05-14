package _2024_05_07.testCollection.t3;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Faker faker = new Faker();
//        Person person = new Person(faker.name().name(),faker.name().lastName(),23);
//        Person person2 = new Person(faker.name().name(),faker.name().lastName(),32);
        /**
         * task 1
         */
        Student student = new Student(faker.name().name(),faker.name().lastName(),23,1);
        Student student2 = new Student(faker.name().name(),faker.name().lastName(),32,2);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        System.out.println(studentList);
        System.out.println("==========================");

        /**
         * task 2
         */
        Student student1 = new Student(faker.name().name(),faker.name().lastName(),11,3);
        student1.Identifiable();
        System.out.println("=================");

        /**
         * task 3
         * В main создайте массив типа Person, включающий объекты Person и Student.
         * Итерируйте массив и вызовите метод describe() для каждого элемента, результаты
         * выведите на экран.
         */
        Person[] personArray = new Person[2];

    }
}
