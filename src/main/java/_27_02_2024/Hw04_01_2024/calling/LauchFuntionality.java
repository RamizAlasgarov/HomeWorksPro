package _27_02_2024.Hw04_01_2024.calling;

import _27_02_2024.Hw04_01_2024.TryMethods.AllMethods;
import _27_02_2024.Hw04_01_2024.creating.CreateAllInformationInArray;

public class LauchFuntionality {
    public void callAllMethods(){
        CreateAllInformationInArray createAllInformation = new CreateAllInformationInArray();
        AllMethods allMethods = new AllMethods();
        System.out.print("All information about our equipments :\n");
        allMethods.printAllEquipment(createAllInformation.officeEquipment);
        System.out.println();
        System.out.println("total price of equipment :" + allMethods.calculateTotalPrice(createAllInformation.officeEquipment));

        allMethods.findOldestEquipment(createAllInformation.officeEquipment);
        System.out.println("displays all machines of the specified manufacturer");
        allMethods.listByManufacturer(createAllInformation.officeEquipment, "Josef");
        System.out.println();
        System.out.println("count of Operational equipment = " + allMethods.countOperational(createAllInformation.officeEquipment));
    }
}
