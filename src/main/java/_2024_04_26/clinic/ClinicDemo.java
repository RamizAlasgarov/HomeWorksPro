package _2024_04_26.clinic;

import _2024_04_26.clinic.parcer.Parcer;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClinicDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(Path.of("patients"));
        List<String> readList = new ArrayList<>();
        while (scanner.hasNextLine()){

            readList.add(scanner.nextLine());
        }
//        System.out.println(readList);


        List<Patient> patientList = new ArrayList<>();
        for (String s : readList) {
            patientList.add(Parcer.getInformation(s));
        }
        System.out.println(patientList);

    }


}
