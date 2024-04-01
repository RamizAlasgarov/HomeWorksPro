package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Scanner (Сканер) - наследуется от OfficeEquipment.
 * Дополнительные поля: scanResolution, scanSpeed, colorDepth,
 * maxPaperSize, connectivity, isDuplexScanning, scannerType.
 */


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

    public int getScanResolution() {
        return scanResolution;
    }

    public void setScanResolution(int scanResolution) {
        this.scanResolution = scanResolution;
    }

    public int getScanSpeed() {
        return scanSpeed;
    }

    public void setScanSpeed(int scanSpeed) {
        this.scanSpeed = scanSpeed;
    }

    public String getColorType() {
        return colorType;
    }

    public void setColorType(String colorType) {
        this.colorType = colorType;
    }

    public double getMaxPaperSize() {
        return maxPaperSize;
    }

    public void setMaxPaperSize(double maxPaperSize) {
        this.maxPaperSize = maxPaperSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public boolean isDuplexScanning() {
        return isDuplexScanning;
    }

    public void setDuplexScanning(boolean duplexScanning) {
        isDuplexScanning = duplexScanning;
    }

    public String getScannerType() {
        return scannerType;
    }

    public void setScannerType(String scannerType) {
        this.scannerType = scannerType;
    }

    @Override
    public String toString() {
        return "Scanner{" +
                "scanResolution=" + scanResolution +
                ", scanSpeed=" + scanSpeed +
                ", colorType='" + colorType + '\'' +
                ", maxPaperSize=" + maxPaperSize +
                ", connectivity='" + connectivity + '\'' +
                ", isDuplexScanning=" + isDuplexScanning +
                ", scannerType='" + scannerType + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", weight=" + weight +
                ", isOperational=" + isOperational +
                '}';
    }
}
