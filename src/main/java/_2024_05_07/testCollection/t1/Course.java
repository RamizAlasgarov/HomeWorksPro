package _2024_05_07.testCollection.t1;

import lombok.*;

import java.util.List;
import java.util.Objects;

@ToString

@EqualsAndHashCode

public class Course {
    private String courseName;
    private List<Student> studentList;

    public Course(String courseName, List<Student> studentList) {
        this.courseName = courseName;
        this.studentList = studentList;

    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(Objects.equals(courseName,null)){
            System.out.println("course name is null");
            return;
        }
        this.courseName = courseName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
