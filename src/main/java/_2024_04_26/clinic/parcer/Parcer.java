package _2024_04_26.clinic.parcer;

import _2024_04_26.clinic.Patient;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 1 Создать класс Patient
 * 2 Сделать парсер из строки в Patient
 * 3 Сделать картотеку, которая находит пациентов по id или имени и фамилии.
 */
public class  Parcer {
    public static Patient getInformation(String info) {

        Patient patient = new Patient();
        String[] array = info.split(" ");
        System.out.println(Arrays.toString(array) + "end");
        patient.setId(Integer.parseInt(array[0]));
        patient.setName(array[1]);
        patient.setSurname(array[2]);
        patient.setBornData(LocalDate.parse(array[3]));
        return patient;
    }


    private Parcer() {

    }
}
