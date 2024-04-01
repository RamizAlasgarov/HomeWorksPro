package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Tablet (Планшет) - наследуется от OfficeEquipment.
 * Дополнительные поля: screenSize, storageSize, operatingSystem,
 * batteryLife, isCellular, cameraResolution, processorType.
 */
@ToString
public class Tablet extends OfficeEquipment{
    private int screenSize;
    private double storageSize;
    private String operatingSystem;
    private double batteryLife;
    private boolean isCellular;
    private double cameraResolution;
    private String processorType;

    public Tablet(int id,
                  String modelName,
                  String manufacture,
                  int yearOfManufacture,
                  int price,
                  int weight,
                  boolean isOperational,
                  int screenSize,
                  double storageSize,
                  String operatingSystem,
                  double batteryLife,
                  boolean isCellular,
                  double cameraResolution,
                  String processorType) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.storageSize = storageSize;
        this.operatingSystem = operatingSystem;
        this.batteryLife = batteryLife;
        this.isCellular = isCellular;
        this.cameraResolution = cameraResolution;
        this.processorType = processorType;
    }
}
