package _24_02_27.Hw04_01_2024.equipments;

/**
 * Класс Printer (Принтер) - наследуется от OfficeEquipment.
 * Дополнительные поля: printTechnology, printSpeed, maxResolution,
 * isColor, paperSize, connectivity, dutyCycle.
 */



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

    public String getPrintTechnology() {
        return printTechnology;
    }

    public void setPrintTechnology(String printTechnology) {
        this.printTechnology = printTechnology;
    }

    public double getPrintSpeed() {
        return printSpeed;
    }

    public void setPrintSpeed(double printSpeed) {
        this.printSpeed = printSpeed;
    }

    public double getMaxResolution() {
        return maxResolution;
    }

    public void setMaxResolution(double maxResolution) {
        this.maxResolution = maxResolution;
    }

    public boolean isColor() {
        return isColor;
    }

    public void setColor(boolean color) {
        isColor = color;
    }

    public int getPaperSize() {
        return paperSize;
    }

    public void setPaperSize(int paperSize) {
        this.paperSize = paperSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public double getDutyCycle() {
        return dutyCycle;
    }

    public void setDutyCycle(double dutyCycle) {
        this.dutyCycle = dutyCycle;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "printTechnology='" + printTechnology + '\'' +
                ", printSpeed=" + printSpeed +
                ", maxResolution=" + maxResolution +
                ", isColor=" + isColor +
                ", paperSize=" + paperSize +
                ", connectivity='" + connectivity + '\'' +
                ", dutyCycle=" + dutyCycle +
                ", manufacture='" + manufacture + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", weight=" + weight +
                ", isOperational=" + isOperational +
                '}';
    }
}
