package _2024_05_07.testCollection.t1;

import java.util.List;

public class Group implements Comparable<Group>{
    private String groupName;
    List<Student> studentList;

    @Override
    public int compareTo(Group o) {
        return this.groupName.compareTo(o.groupName);
    }

    public Group(String groupName, List<Student> studentList) {
        this.groupName = groupName;
        this.studentList = studentList;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", studentList=" + studentList +
                '}';
    }

}
