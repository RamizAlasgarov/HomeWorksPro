package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Scanner (Сканер) - наследуется от OfficeEquipment.
 * Дополнительные поля: scanResolution, scanSpeed, colorDepth,
 * maxPaperSize, connectivity, isDuplexScanning, scannerType.
 */

@ToString
public class Scanner extends OfficeEquipment{
    private int scanResolution;
    private int scanSpeed;
    private String colorType;
    private double maxPaperSize;
    private String connectivity;
    private boolean isDuplexScanning;
    private String scannerType;

    public Scanner(int id,
                   String modelName,
                   String manufacture,
                   int yearOfManufacture,
                   int price,
                   int weight,
                   boolean isOperational,
                   int scanResolution,
                   int scanSpeed,
                   String colorType,
                   double maxPaperSize,
                   String connectivity,
                   boolean isDuplexScanning,
                   String scannerType) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.scanResolution = scanResolution;
        this.scanSpeed = scanSpeed;
        this.colorType = colorType;
        this.maxPaperSize = maxPaperSize;
        this.connectivity = connectivity;
        this.isDuplexScanning = isDuplexScanning;
        this.scannerType = scannerType;
    }
}
