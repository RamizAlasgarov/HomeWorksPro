package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Switch (Коммутатор) - наследуется от OfficeEquipment.
 * Дополнительные поля: portCount, speed, layer, managementType,
 * powerOverEthernet, stackable, formFactor.
 */
@ToString
public class Switch extends OfficeEquipment{
    private int portCount;
    private double speed;
    private int layer;
    private String managementType;
    private boolean powerOverEthernet;
    private int stackable;
    private String formFactor;

    public Switch(int id,
                  String modelName,
                  String manufacture,
                  int yearOfManufacture,
                  int price,
                  int weight,
                  boolean isOperational,
                  int portCount,
                  double speed,
                  int layer,
                  String managementType,
                  boolean powerOverEthernet,
                  int stackable,
                  String formFactor) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.portCount = portCount;
        this.speed = speed;
        this.layer = layer;
        this.managementType = managementType;
        this.powerOverEthernet = powerOverEthernet;
        this.stackable = stackable;
        this.formFactor = formFactor;
    }
}
