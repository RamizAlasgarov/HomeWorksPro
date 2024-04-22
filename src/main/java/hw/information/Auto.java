package hw.information;

import hw.enums.Color1;
import hw.enums.Model;

/**
 *7. Создать класс Car.
 * Поля:
 * - Марка машины(Энам)
 * - кол-во дверей
 * - спортивная или нет
 * - мощность в лс //enum
 * - стоимость
 * - год выпуска
 * - цвет(энам)
 */
public class Auto {
    private Model model;
    private int doorCount;
    private boolean isSport;
    private int horsePower;
    private int price;
    private int yearOfProduction;
    private Color1 colors;

    public Auto(Model model, int doorCount, boolean isSport, int horsePower, int price, int yearOfProduction, Color1 colors) {
        this.model = model;
        this.doorCount = doorCount;
        this.isSport = isSport;
        this.horsePower = horsePower;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.colors = colors;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public Color1 getColors() {
        return colors;
    }

    public void setColors(Color1 colors) {
        this.colors = colors;
    }
}
