package _27_02_2024.Hw04_01_2024.equipments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
public class OfficeEquipment {
    private Number id;
    private String modelName;
    String manufacture ;
    int yearOfManufacture;
    int price;
    int weight;
    boolean isOperational;


    public OfficeEquipment(int id, String modelName,
                           String manufacture,
                           int yearOfManufacture,
                           int price,
                           int weight,
                           boolean isOperational) {
        this.id = id;
        this.modelName = modelName;
        this.manufacture = manufacture;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.weight = weight;
        this.isOperational = isOperational;
    }



    public int getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public Number getId() {
        return id;
    }


    public String getModelName() {
        return modelName;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isOperational() {
        return isOperational;
    }


    //    @Override
//    public String toString() {
//        return "OfficeEquipment{" +
//                "id=" + id +
//                ", modelName='" + modelName + '\'' +
//                ", manufacture='" + manufacture + '\'' +
//                ", yearOfManufacture=" + yearOfManufacture +
//                ", price=" + price +
//                ", weight=" + weight +
//                ", isOperational=" + isOperational +
//                '}';
//    }
}
