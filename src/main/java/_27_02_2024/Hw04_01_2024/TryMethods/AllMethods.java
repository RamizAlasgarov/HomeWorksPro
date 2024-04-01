package _27_02_2024.Hw04_01_2024.TryMethods;

import _27_02_2024.Hw04_01_2024.equipments.OfficeEquipment;

import java.util.Arrays;

/**
 * Задание
 * Реализуйте следующие методы которые принимают массив OfficeEquipment:
 * printAllEquipment(OfficeEquipment[] officeEquipment) - выводит информацию о всей технике.
 * calculateTotalPrice(OfficeEquipment[] officeEquipment) - вычисляет общую стоимость всей техники.
 * listByManufacturer(OfficeEquipment[] officeEquipment, String manufacturer) - выводит всю технику указанного производителя.
 * findOldestEquipment(OfficeEquipment[] officeEquipment, int year) - находит самую старую технику по году выпуска.
 * countOperational(OfficeEquipment[] officeEquipment) - подсчитывает количество исправной техники. (изменено)
 */
public class AllMethods {

    public void printAllEquipment(OfficeEquipment[] officeEquipments){
for (OfficeEquipment o : officeEquipments){
    System.out.println(o);
}


    }

}
