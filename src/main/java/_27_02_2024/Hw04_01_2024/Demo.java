package _27_02_2024.Hw04_01_2024;

import _27_02_2024.Hw04_01_2024.TryMethods.AllMethods;
import _27_02_2024.Hw04_01_2024.creating.CreateAllInformationInArray;


public class Demo {
    public static void main(String[] args) {
        CreateAllInformationInArray createAllInformation = new CreateAllInformationInArray();
        AllMethods allMethods = new AllMethods();
        allMethods.printAllEquipment(createAllInformation.officeEquipment1);
    }
}
