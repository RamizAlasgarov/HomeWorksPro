package _27_02_2024.task1;

public class Demo {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Transport",20);
        Car car = new Car("bmw",300,"2.0");
        Bicycle bicycle = new Bicycle("honda",30,"mountainBicycle");
        Vehicle[] vehicles = new Vehicle[]{car,bicycle};
        for(Vehicle v : vehicles){
            System.out.println(v);
        }

    }
}
