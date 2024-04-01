package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Projector (Проектор) - наследуется от OfficeEquipment.
 * Дополнительные поля: lumens, resolution, contrastRatio, lampLife,
 * projectionSize, connectivity, is3DReady.
 */
@ToString
public class Projector extends OfficeEquipment{
    private String lumens;
    private int resolution;
    private int contrastRatio;
    private double lampLife;
    private int projectionSize;
    private String connectivity;
    private boolean is3DReady;

    public Projector(int id,
                     String modelName,
                     String manufacture,
                     int yearOfManufacture,
                     int price,
                     int weight,
                     boolean isOperational,
                     String lumens,
                     int resolution,
                     int contrastRatio,
                     double lampLife,
                     int projectionSize,
                     String connectivity,
                     boolean is3DReady) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.lumens = lumens;
        this.resolution = resolution;
        this.contrastRatio = contrastRatio;
        this.lampLife = lampLife;
        this.projectionSize = projectionSize;
        this.connectivity = connectivity;
        this.is3DReady = is3DReady;
    }
}
