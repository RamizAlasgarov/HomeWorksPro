package _27_02_2024.task1;

public class Vehicle {
    private String NameOfVehicle;
    private int kmInHour;

    public Vehicle(String nameOfCar, int kmInHour) {
        this.NameOfVehicle = nameOfCar;
        this.kmInHour = kmInHour;
    }

    public String getNameOfVehicle() {
        return NameOfVehicle;
    }

    public void setNameOfVehicle(String nameOfVehicle) {
        this.NameOfVehicle = nameOfVehicle;
    }

    public int getKmInHour() {
        return kmInHour;
    }

    public void setKmInHour(int kmInHour) {
        this.kmInHour = kmInHour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfCar='" + NameOfVehicle + '\'' +
                ", kmInHour=" + kmInHour +
                '}';
    }
}
