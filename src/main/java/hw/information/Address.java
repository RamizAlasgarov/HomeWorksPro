package hw.information;

import hw.enums.Country;

/**
 * 6. Создать класс Address.
 * Поля:
 * - Страна(Энам)
 * - Улица
 * - номер дома
 * - номер квартиры(если живет не в доме а в квартире, если в доме то номер квартиры == 0)
 */
public class Address {
        private Country country;
        private String street;
        private int numberOFHouse;
        private int numberOfFlat;

        public Address(Country country, String street, int numberOFHouse,int numberOfFlat) {
                this.country = country;
                this.street = street;
                this.numberOFHouse = numberOFHouse;
                this.numberOfFlat = numberOfFlat;
        }

        public Country getCountry() {
                return country;
        }

        public void setCountry(Country country) {
                this.country = country;
        }

        public String getStreet() {
                return street;
        }

        public void setStreet(String street) {
                this.street = street;
        }

        public int getNumberOFHouse() {
                return numberOFHouse;
        }

        public void setNumberOFHouse(int numberOFHouse) {
                this.numberOFHouse = numberOFHouse;
        }

        public int getNumberOfFlat() {
                return numberOfFlat;
        }

        public void setNumberOfFlat(int numberOfFlat) {
                this.numberOfFlat = numberOfFlat;
        }
}
