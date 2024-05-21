package myExaple.static_nested_class;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class Car {
    private String name;
    private int doorCount;
    Engine engine;

    public static class Engine {
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class CarDemo {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(234);
        Car car = new Car("toyota", 3, engine);
        System.out.println(car);
    }



}
