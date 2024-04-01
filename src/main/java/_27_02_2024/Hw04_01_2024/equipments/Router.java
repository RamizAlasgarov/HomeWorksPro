package _27_02_2024.Hw04_01_2024.equipments;

import lombok.ToString;

/**
 * Класс Router (Маршрутизатор) - наследуется от OfficeEquipment.
 * Дополнительные поля: speed, band, security, ports, range,
 * isDualBand, connectivityType.
 */
@ToString
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
}
