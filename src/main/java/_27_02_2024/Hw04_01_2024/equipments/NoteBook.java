package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Laptop (Ноутбук) - наследуется от OfficeEquipment.
 * Дополнительные поля: processorType, ramSize, storageSize,
 * batteryLife, screenSize, operatingSystem, isTouchscreen.
 */


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

  public String getProcessorType() {
    return processorType;
  }

  public void setProcessorType(String processorType) {
    this.processorType = processorType;
  }

  public int getRamSize() {
    return ramSize;
  }

  public void setRamSize(int ramSize) {
    this.ramSize = ramSize;
  }

  public double getStorageSize() {
    return storageSize;
  }

  public void setStorageSize(double storageSize) {
    this.storageSize = storageSize;
  }

  public int getBatteryLife() {
    return batteryLife;
  }

  public void setBatteryLife(int batteryLife) {
    this.batteryLife = batteryLife;
  }

  public int getScreenSize() {
    return screenSize;
  }

  public void setScreenSize(int screenSize) {
    this.screenSize = screenSize;
  }

  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public boolean isTouchscreen() {
    return isTouchscreen;
  }

  public void setTouchscreen(boolean touchscreen) {
    isTouchscreen = touchscreen;
  }

  @Override
  public String toString() {
    return "NoteBook{" +
            "processorType='" + processorType + '\'' +
            ", ramSize=" + ramSize +
            ", storageSize=" + storageSize +
            ", batteryLife=" + batteryLife +
            ", screenSize=" + screenSize +
            ", operatingSystem='" + operatingSystem + '\'' +
            ", isTouchscreen=" + isTouchscreen +
            ", manufacture='" + manufacture + '\'' +
            ", yearOfManufacture=" + yearOfManufacture +
            ", price=" + price +
            ", weight=" + weight +
            ", isOperational=" + isOperational +
            '}';
  }
}
