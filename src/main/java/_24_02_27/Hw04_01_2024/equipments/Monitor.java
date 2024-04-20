package _24_02_27.Hw04_01_2024.equipments;



/**
 * Класс Monitor (Монитор) - наследуется от OfficeEquipment.
 * Дополнительные поля: screenSize, resolution, panelType,
 * refreshRate, isCurved, ports, isHDR.
 */


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

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getPanelType() {
        return panelType;
    }

    public void setPanelType(String panelType) {
        this.panelType = panelType;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean curved) {
        isCurved = curved;
    }

    public String getPorts() {
        return ports;
    }

    public void setPorts(String ports) {
        this.ports = ports;
    }

    public boolean isHDR() {
        return isHDR;
    }

    public void setHDR(boolean HDR) {
        isHDR = HDR;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "screenSize=" + screenSize +
                ", resolution=" + resolution +
                ", panelType='" + panelType + '\'' +
                ", refreshRate=" + refreshRate +
                ", isCurved=" + isCurved +
                ", ports='" + ports + '\'' +
                ", isHDR=" + isHDR +
                ", manufacture='" + manufacture + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", weight=" + weight +
                ", isOperational=" + isOperational +
                '}';
    }
}
