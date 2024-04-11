package hw;

import hw.enums.Color;
import hw.enums.Country;
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

    /**
     * Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
     */
    public static double findAverageSalaryInCountry(Person[] persons, Country country){
        int counter = 0;
        double result = 0;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].getAddress().getCountry() == country){
                result += persons[i].getSalary();
                counter++;
            }
        }
        return result/counter;
    }

    /**
     * Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.
     */
//    public static String[] findAccountInfo(Person[] person,double balance){
//        String[] people = new String[person.length];
//        for (int i = 0; i < person.length; i++) {
//            if(person[i].getAccounts()[i].getBalance() > balance){
//                people[i] = person[i].getName() + " " + person[i].getSurname();
//            }
//        }
//        return people;
//    }

    /**
     * Перечислить всех, у кого автомобиль был выпущен до определенного года.
     */
        public static String[] findYearOfReleased(Person[] person,int year){
        String[] people = new String[person.length];
        for (int i = 0; i < person.length; i++) {
            if(person[i].getAuto().getYearOfProduction() < year){
                people[i] = person[i].getName() + " " + person[i].getSurname();
            }
        }
        return people;
    }
    /**
     * Найти лиц, живущих на одной улице, но в разных домах.
     */
    public static String[] findSameStreetButDifferentHouses(Person[] person,String street){
        String[] people = new String[person.length];
        for (int i = 0; i < person.length-1; i++) {
            if(person[i].getAddress().getStreet() == person[i].getAddress().getStreet()  )
        }
    }
}





