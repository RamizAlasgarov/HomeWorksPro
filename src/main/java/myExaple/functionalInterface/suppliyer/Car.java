package myExaple.functionalInterface.suppliyer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private String name;
    private int horsePower;
    private double engine;

    private static List<Car>  createThreeCar(Supplier<Car> supplier){
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(supplier.get());
        }
        return cars;
    }

    public static void main(String[] args) {
List<Car> carList = createThreeCar(() -> new Car("nissan",1300,1.6));
        System.out.println(carList);
    }
}
