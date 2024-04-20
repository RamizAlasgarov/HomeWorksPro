package _24_02_27.Hw04_01_2024.TryMethods;

import _24_02_27.Hw04_01_2024.equipments.OfficeEquipment;

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

    public void printAllEquipment(OfficeEquipment[] officeEquipments) {
        for (OfficeEquipment o : officeEquipments) {
            System.out.println(o);
        }
    }
    public int calculateTotalPrice(OfficeEquipment[] officeEquipments){
        int totalPirce = 0;
        for (OfficeEquipment o : officeEquipments){
            totalPirce += o.getPrice();
        }
        return totalPirce;
    }
    public void listByManufacturer(OfficeEquipment[] officeEquipment, String manufacturer){
        for (OfficeEquipment o : officeEquipment){
            if(manufacturer == o.getManufacture()){
                System.out.println(o.getId() + o.getManufacture() + o.getWeight() + o.getYearOfManufacture()+
                         o.getModelName() + o.getYearOfManufacture() + o.getPrice() + o.isOperational());
            }
        }
    }
    public void findOldestEquipment(OfficeEquipment[] officeEquipments){
        int year = Integer.MAX_VALUE;
        for (OfficeEquipment o : officeEquipments){
            if(o.getYearOfManufacture()<= year){
                year = o.getYearOfManufacture() ;
            }
        }
        System.out.println("oldest equipment by year of manufacture = " + year);
    }
    public int countOperational(OfficeEquipment[] officeEquipment){
        int counter = 0;
        for (OfficeEquipment o : officeEquipment){
            if(o.isOperational() == true){
                counter++;
            }
        }
        return counter;
    }


}
