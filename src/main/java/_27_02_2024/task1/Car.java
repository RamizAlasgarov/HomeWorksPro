package _27_02_2024.task1;

public class Car extends Vehicle{
    private String engineType;


    public Car(String nameOfCar, int kmInHour,String engineType) {
        super(nameOfCar, kmInHour);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
