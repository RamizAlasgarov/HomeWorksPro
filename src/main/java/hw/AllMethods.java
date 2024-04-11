package hw;

import hw.enums.Color;
import hw.information.Person;

public class AllMethods {
    /**
     * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
     */
    public static String[] isRedIsSport(Person[] persons){
        String[] result = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            if(!persons[i].getAuto().isSport() && !persons[i].getAuto().getColors().equals(Color.RED)){
                result[i] = persons[i].getName() + " " + persons[i].getSurname();
            }
        }
        return result;
    }

}
