package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Printer (Принтер) - наследуется от OfficeEquipment.
 * Дополнительные поля: printTechnology, printSpeed, maxResolution,
 * isColor, paperSize, connectivity, dutyCycle.
 */


@ToString
public class Printer extends OfficeEquipment {
    private String printTechnology;
    private double printSpeed;
    private double maxResolution;
    private boolean isColor;
    private int paperSize;
    private String connectivity;
    private double dutyCycle;

    public Printer(int id,
                   String modelName,
                   String manufacture,
                   int yearOfManufacture,
                   int price, int weight,
                   boolean isOperational,
                   String printTechnology,
                   double printSpeed,
                   double maxResolution,
                   boolean isColor,
                   int paperSize,
                   String connectivity,
                   double dutyCycle) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.printTechnology = printTechnology;
        this.printSpeed = printSpeed;
        this.maxResolution = maxResolution;
        this.isColor = isColor;
        this.paperSize = paperSize;
        this.connectivity = connectivity;
        this.dutyCycle = dutyCycle;
    }
}
