package _2024_05_07.testCollection.t1;

import lombok.*;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;


@ToString

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private int age;
    List<Course> studentList;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public void addCourse(Course course){
        studentList.add(course);
    }

    public void deleteCourse(Course course){
        studentList.remove(course);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        if(Objects.equals(name,null)){
            System.out.println("name is null");
            return;
        }
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(Objects.equals(surname,null)){
            System.out.println("surname is null");
            return;
        }
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("age is < 0");
            return;
        }
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(studentList, student.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, studentList);
    }

    @Override
    public int compareTo(Student o) {
        int res = this.age-o.getAge();
        if(res == 0){
            return this.getName().compareTo(o.getName());
        }
        return res;
    }
}
class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
