package _27_02_2024.task2;

public class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name,
                     String position,
                     double salary,
                     String programmingLanguage) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public double calculateBonus(){
        Employee employee = new Employee();
        return employee.salary+=500;
    }
}
