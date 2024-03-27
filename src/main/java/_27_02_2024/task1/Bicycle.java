package _27_02_2024.task1;

public class Bicycle extends Vehicle{
    String typeOfBicycle;

    public Bicycle(String nameOfCar, int kmInHour,String typeOfBicycle) {
        super(nameOfCar, kmInHour);
        this.typeOfBicycle = typeOfBicycle;
    }

    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    public void setTypeOfBicycle(String typeOfBycycle) {
        this.typeOfBicycle = typeOfBycycle;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "typeOfBicycle='" + typeOfBicycle + '\'' +
                '}';
    }
}
