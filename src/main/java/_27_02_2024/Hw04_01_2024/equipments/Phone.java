package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Phone (Телефон) - наследуется от OfficeEquipment.
 * Дополнительные поля: screenSize, storageSize, operatingSystem,
 * batteryLife, isSmart, cameraResolution, processorType.
 */

@ToString
public class Phone extends OfficeEquipment{
    private double screenSize;
    private double storageSize;
    private String operatingSystem;
    private double batteryLife;
    private boolean isSmart;
    private double cameraResolution;
    private String processorType;

    public Phone(int id,
                 String modelName,
                 String manufacture,
                 int yearOfManufacture,
                 int price,
                 int weight,
                 boolean isOperational,
                 double screenSize,
                 double storageSize,
                 String operatingSystem,
                 double batteryLife,
                 boolean isSmart,
                 double cameraResolution,
                 String processorType) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.batteryLife = batteryLife;
        this.isSmart = isSmart;
        this.cameraResolution = cameraResolution;
        this.processorType = processorType;
    }
}
