package _2024_04_26.clinic;

import java.io.BufferedReader;
import java.io.File;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

/**
 * 1 Создать класс Patient
 * 2 Сделать парсер из строки в Patient
 * 3 Сделать картотеку, которая находит пациентов по id или имени и фамилии.
 */
public class Patient {
    private int id;
    private String name;
    private String surname;
    private LocalDate bornData;

    public LocalDate getBornData() {
        return bornData;
    }

    public void setBornData(LocalDate bornData) {
        this.bornData = bornData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornData=" + bornData +
                '}';
    }
}
