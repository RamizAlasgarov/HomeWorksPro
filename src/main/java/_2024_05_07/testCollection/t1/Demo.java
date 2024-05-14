package _2024_05_07.testCollection.t1;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Student student1 = new Student("roma","Alas",21);
        Student student2 = new Student("Ivan","Varas",2);
        Student student3 = new Student("ads","ads",1);
        Student student4 = new Student("qwe","qwe",23);
        Student student5 = new Student("asf","asf",3);
        Student student6 = new Student("asf","asf",3);
        List<Student> studentList1 = new ArrayList<>();

        studentList1.add(student1);
        studentList1.add(student2);
        Collections.sort(studentList1,(o1,o2) -> o1.getSurname().compareTo(o2.getSurname()));


        /**
         * t2.txt Задание 4:
         */
        Collections.sort(studentList1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int ageComp = o1.getAge()-o2.getAge();
                int surnameComp = o1.getSurname().compareTo(o2.getSurname());
                int nameComp = o1.getName().compareTo(o2.getName());
                if(surnameComp == 0){
                    return nameComp;
                }
                if(nameComp == 0){
                    return ageComp;
                }
                return ageComp;
            }
        });


        /**
         *  t2.txt Задание 3:
         */
        Collections.sort(studentList1,new AgeComparator());
        Collections.sort(studentList1,new NameComparator());


        /**
         * t2.txt Задание 5:
         */
        List<Student> studentList = new ArrayList<>();
        studentList.add(student3);
        studentList.add(student4);
        Group group1 = new Group("BGroup",studentList1);
        Group group2 = new Group("AGroup",studentList);
        List<Group> groups = new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        Collections.sort(groups);
        System.out.println(groups);



        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(student1);
        studentList2.add(student2);
        List<Student> studentList3 = new ArrayList<>();
        studentList3.add(student1);
        studentList3.add(student2);
        Course course1 = new Course("Java",studentList1);
        Course course2 =new Course("C",studentList2);
        Course course3 =new Course("C++",studentList3);
        System.out.println("----------");
//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(course3);

    }
}

/**
 * task3
 */
class Demo2{

}