package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Laptop (Ноутбук) - наследуется от OfficeEquipment.
 * Дополнительные поля: processorType, ramSize, storageSize,
 * batteryLife, screenSize, operatingSystem, isTouchscreen.
 */

@ToString
public class NoteBook extends OfficeEquipment {
  private String processorType;
  private int ramSize;
  private double storageSize;
  private int batteryLife;
  private int screenSize;
  private String operatingSystem;
  private boolean isTouchscreen;


  public NoteBook(int id,
                  String modelName,
                  String manufacture,
                  int yearOfManufacture,
                  int price, int weight,
                  boolean isOperational,
                  String processorType,
                  int ramSize,
                  double storageSize,
                  int batteryLife,
                  int screenSize,
                  String operatingSystem,
                  boolean isTouchscreen) {
    super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
    this.processorType = processorType;
    this.ramSize = ramSize;
    this.storageSize = storageSize;
    this.batteryLife = batteryLife;
    this.screenSize = screenSize;
    this.operatingSystem = operatingSystem;
    this.isTouchscreen = isTouchscreen;
  }
}
