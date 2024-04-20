package _24_02_27.Hw04_01_2024.equipments;

/**
 * Класс Projector (Проектор) - наследуется от OfficeEquipment.
 * Дополнительные поля: lumens, resolution, contrastRatio, lampLife,
 * projectionSize, connectivity, is3DReady.
 */

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

    public String getLumens() {
        return lumens;
    }

    public void setLumens(String lumens) {
        this.lumens = lumens;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getContrastRatio() {
        return contrastRatio;
    }

    public void setContrastRatio(int contrastRatio) {
        this.contrastRatio = contrastRatio;
    }

    public double getLampLife() {
        return lampLife;
    }

    public void setLampLife(double lampLife) {
        this.lampLife = lampLife;
    }

    public int getProjectionSize() {
        return projectionSize;
    }

    public void setProjectionSize(int projectionSize) {
        this.projectionSize = projectionSize;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public boolean isIs3DReady() {
        return is3DReady;
    }

    public void setIs3DReady(boolean is3DReady) {
        this.is3DReady = is3DReady;
    }

    @Override
    public String toString() {
        return "Projector{" +
                "lumens='" + lumens + '\'' +
                ", resolution=" + resolution +
                ", contrastRatio=" + contrastRatio +
                ", lampLife=" + lampLife +
                ", projectionSize=" + projectionSize +
                ", connectivity='" + connectivity + '\'' +
                ", is3DReady=" + is3DReady +
                ", manufacture='" + manufacture + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", weight=" + weight +
                ", isOperational=" + isOperational +
                '}';
    }
}
