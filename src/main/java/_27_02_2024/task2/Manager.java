package _27_02_2024.task2;

public class Manager extends Employee{
    private int subordinatesCount;

    public Manager(String name, String position, double salary,int subordinatesCount) {
        super(name, position, salary);
        this.subordinatesCount = subordinatesCount;
    }

    public int getSubordinatesCount() {
        return subordinatesCount;
    }

    public void setSubordinatesCount(int subordinatesCount) {
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "subordinatesCount=" + subordinatesCount +
                '}';
    }


//    @Override
//    public double calculateBonus() {
//        return super.setSalary() *= 0.02;
//    }
}
