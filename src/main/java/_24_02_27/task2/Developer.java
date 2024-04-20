package _24_02_27.task2;

public class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, String position, double salary,String programmingLanguage) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

}
