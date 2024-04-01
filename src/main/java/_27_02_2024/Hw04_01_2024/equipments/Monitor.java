package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Monitor (Монитор) - наследуется от OfficeEquipment.
 * Дополнительные поля: screenSize, resolution, panelType,
 * refreshRate, isCurved, ports, isHDR.
 */

@ToString
public class Monitor extends OfficeEquipment{
    private int screenSize;
    private int resolution;
    private String panelType;
    private int refreshRate;
    private boolean isCurved;
    private String ports;
    private boolean isHDR;

    public Monitor(int id, String modelName,
                   String manufacture,
                   int yearOfManufacture,
                   int price, int weight,
                   boolean isOperational,
                   int screenSize,
                   int resolution,
                   String panelType,
                   int refreshRate,
                   boolean isCurved,
                   String ports,
                   boolean isHDR) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.panelType = panelType;
        this.refreshRate = refreshRate;
        this.isCurved = isCurved;
        this.ports = ports;
        this.isHDR = isHDR;
    }
}
