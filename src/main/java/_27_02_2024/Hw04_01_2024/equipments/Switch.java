package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Switch (Коммутатор) - наследуется от OfficeEquipment.
 * Дополнительные поля: portCount, speed, layer, managementType,
 * powerOverEthernet, stackable, formFactor.
 */

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

    public int getPortCount() {
        return portCount;
    }

    public void setPortCount(int portCount) {
        this.portCount = portCount;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getLayer() {
        return layer;
    }

    public void setLayer(int layer) {
        this.layer = layer;
    }

    public String getManagementType() {
        return managementType;
    }

    public void setManagementType(String managementType) {
        this.managementType = managementType;
    }

    public boolean isPowerOverEthernet() {
        return powerOverEthernet;
    }

    public void setPowerOverEthernet(boolean powerOverEthernet) {
        this.powerOverEthernet = powerOverEthernet;
    }

    public int getStackable() {
        return stackable;
    }

    public void setStackable(int stackable) {
        this.stackable = stackable;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        return "Switch{" +
                "portCount=" + portCount +
                ", speed=" + speed +
                ", layer=" + layer +
                ", managementType='" + managementType + '\'' +
                ", powerOverEthernet=" + powerOverEthernet +
                ", stackable=" + stackable +
                ", formFactor='" + formFactor + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", weight=" + weight +
                ", isOperational=" + isOperational +
                '}';
    }
}
