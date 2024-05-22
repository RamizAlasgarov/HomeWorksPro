package myExaple.functionalInterface.predicateExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentDemo {
    private static void check(List<Student> list, Predicate<Student> predicate){
        for (Student student : list) {
            if(predicate.test(student)){
                System.out.println(student);
            }
        }
    }
    public static void main(String[] args) {
        Student st1 = new Student("Ramiz",30,3);
        Student st2 = new Student("Ivan",20,1);
        Student st3 = new Student("Petr",33,4);
        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
//        System.out.println(studentList);

        check(studentList,s->s.getAge()>=30&&s.getCourse()>2);
    }


}
