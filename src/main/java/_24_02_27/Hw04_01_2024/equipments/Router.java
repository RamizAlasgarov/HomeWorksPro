package _24_02_27.Hw04_01_2024.equipments;

/**
 * Класс Router (Маршрутизатор) - наследуется от OfficeEquipment.
 * Дополнительные поля: speed, band, security, ports, range,
 * isDualBand, connectivityType.
 */

public class Router extends OfficeEquipment{
    private int speed;
    private double band;
    private String security;
    private int ports;
    private double range;
    private boolean isDualBand;

    private String connectivityType;

    public Router(int id,
                  String modelName,
                  String manufacture,
                  int yearOfManufacture,
                  int price,
                  int weight,
                  boolean isOperational,
                  int speed,
                  double band,
                  String security,
                  int ports,
                  double range,
                  boolean isDualBand,
                  String connectivityType) {
        super(id, modelName, manufacture, yearOfManufacture, price, weight, isOperational);
        this.speed = speed;
        this.band = band;
        this.security = security;
        this.ports = ports;
        this.range = range;
        this.isDualBand = isDualBand;
        this.connectivityType = connectivityType;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getBand() {
        return band;
    }

    public void setBand(double band) {
        this.band = band;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public int getPorts() {
        return ports;
    }

    public void setPorts(int ports) {
        this.ports = ports;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public boolean isDualBand() {
        return isDualBand;
    }

    public void setDualBand(boolean dualBand) {
        isDualBand = dualBand;
    }

    public String getConnectivityType() {
        return connectivityType;
    }

    public void setConnectivityType(String connectivityType) {
        this.connectivityType = connectivityType;
    }

    @Override
    public String toString() {
        return "Router{" +
                "speed=" + speed +
                ", band=" + band +
                ", security='" + security + '\'' +
                ", ports=" + ports +
                ", range=" + range +
                ", isDualBand=" + isDualBand +
                ", connectivityType='" + connectivityType + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                ", weight=" + weight +
                ", isOperational=" + isOperational +
                '}';
    }
}
