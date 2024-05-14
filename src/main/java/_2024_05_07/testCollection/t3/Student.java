package _2024_05_07.testCollection.t3;

public class Student extends Person implements Identifiable{
    private int studentId;


    public Student(String name, String surname, int age,int studentId) {
        super(name, surname, age);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +"," +
                " name = " + getName()+ "," + "surname = " + getSurname() + "," + "age =" + getAge() +
                '}';
    }

    @Override
    public void Identifiable() {
        System.out.println("id " + studentId + ", " + "name is "+ getName() + ", " + "surname " +  getSurname());
    }
}
