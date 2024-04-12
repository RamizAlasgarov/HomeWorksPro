package hw.information;

import java.util.Arrays;

/**
 * 5.Создать класс Person.
 * Поля:
 * - имя
 * - фамилия
 * - адрес(это отдельный класс)
 * - зарплата
 * - авто(это отдельный класс)
 * <p>
 * <p>
 * <p>
 * - массив счетов(отдельный клас) -
 */
public class Person {
    private String name;
    private String surname;
    private Address address;
    private double salary;
    private Auto auto;
    private Account[] accounts;

    public Person(String name, String surmane, Address address, double salary, Auto auto, Account[] accounts) {
        this.name = name;
        this.surname = surmane;
        this.address = address;
        this.salary = salary;
        this.auto = auto;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return name + " " +  surname;
    }
}
