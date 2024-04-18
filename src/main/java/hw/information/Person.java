package hw.information;

import java.util.List;

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
    private List<Account> accounts;

    public Person(String name, String surname, Address address, double salary, Auto auto, List<Account> accounts) {
        this.name = name;
        this.surname = surname;
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return name + " " +  surname;
    }
}
