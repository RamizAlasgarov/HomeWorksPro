package hw;

import hw.enums.Color;
import hw.enums.Country;
import hw.information.Address;
import hw.information.Person;

import java.util.Arrays;

public class AllMethods {
    /**
     * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
     */
    public static String[] isRedIsSport(Person[] persons) {
        String[] result = new String[persons.length];
        for (int i = 0; i < persons.length; i++) {
            if (!persons[i].getAuto().isSport() && !persons[i].getAuto().getColors().equals(Color.RED)) {
                result[i] = persons[i].getName() + " " + persons[i].getSurname();
            }
        }
        return result;
    }

    /**
     * Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
     */
    public static double findAverageSalaryInCountry(Person[] persons, Country country) {
        int counter = 0;
        double result = 0;
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAddress().getCountry() == country) {
                result += persons[i].getSalary();
                counter++;
            }
        }
        return result / counter;
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
    public static String[] findYearOfReleased(Person[] person, int year) {
        String[] people = new String[person.length];
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAuto().getYearOfProduction() < year) {
                people[i] = person[i].getName() + " " + person[i].getSurname();
            }
        }
        return people;
    }

    /**
     * Найти лиц, живущих на одной улице, но в разных домах.
     */
//    public static String[] findSameStreetButDifferentHouses(Person[] person, Address[] addresses){
//        int info = 0;
//        for (int i = addresses.length; i > 0; i--) {
//            info = addresses[i].getNumberOFHouse();
//        }
//        String[] people = new String[person.length];
//        for (int i = 0; i < person.length; i++) {
//            if(person[i].getAddress().getStreet().equals(addresses[i].getStreet()) &&
//                    (person[i].getAddress().getNumberOFHouse() != addresses[i].getNumberOFHouse())){
//
//                people[i] = person[i].getName() + person[i].getSurname();
//            }
//        }
//        return people;
//    }

//
// (person[i].getAddress().getNumberOFHouse() != addresses[i].getNumberOFHouse())
//public static String[] findSameStreetButDifferentHouses2(Person[] person, Address[] addresses) {
//    String[] people = new String[person.length];
//    for (int i = 0; i < person.length; i++) {
//        if (person[i].getAddress().getStreet().equals(addresses[i].getStreet())) {
//            for (int j = addresses.length-1; j > 0; j--) {
//                if (person[i].getAddress().getNumberOFHouse() != addresses[j].getNumberOFHouse() && (i!=j)) {
//                    people[i] = person[i].getName() + " " + person[i].getSurname();
//                }
//            }
//
//        }
//    }
//    return people;
//}

    /**
     * Найти лиц, живущих на одной улице, но в разных домах.
     */
    public static StreetToPeople[] findSameStreetButDifferentHouses(Person[] person) {
        StreetToPeople[] streetsToPeople = new StreetToPeople[person.length];
        int index = 0;
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (person[i].getAddress().getStreet().equals(person[j].getAddress().getStreet()) &&
                        person[i].getAddress().getNumberOFHouse() != person[j].getAddress().getNumberOFHouse()) {
                    StreetToPeople stp = new StreetToPeople(person[i].getAddress().getStreet(), new Person[]{person[i], person[j]});
                    streetsToPeople[index] = stp;
                    index++;
                }
            }
        }
        return reshuffle(Arrays.copyOfRange(streetsToPeople,0,index));

    }

    private static StreetToPeople[] reshuffle(StreetToPeople[] streetToPeople) {
        StreetToPeople[] street = new StreetToPeople[streetToPeople.length];
        int streetIndex = 0;
        for (int i = 0; i < streetToPeople.length; i++) {
            Person[] peopleOnThisStreet = new Person[10];
            int index = 0;
            String nameOfStreet = streetToPeople[i].nameOfStreet;
            for (int j = i+1; j <streetToPeople.length; j++) {
                if(nameOfStreet.equals(streetToPeople[j].nameOfStreet)){
                    for (Person person : streetToPeople[j].people) {
                        peopleOnThisStreet[index] = person;
                        index++;
                    }
                }
            }
            street[streetIndex] = new StreetToPeople(nameOfStreet, Arrays.copyOfRange(peopleOnThisStreet,0,index));
            streetIndex++;
        }
        return Arrays.copyOfRange(street,0,streetIndex);
    }




    public static class StreetToPeople {
        private final String nameOfStreet;
        private final Person[] people;

        public StreetToPeople(String nameOfStreet, Person[] people) {
            this.nameOfStreet = nameOfStreet;
            this.people = people;
        }

        public String getNameOfStreet() {
            return nameOfStreet;
        }

        public Person[] getPeople() {
            return people;
        }

        @Override
        public String toString() {
            return "StreetToPeople{" +
                    "nameOfStreet='" + nameOfStreet + '\'' +
                    ", people=" + Arrays.toString(people) +
                    '}';
        }
    }
}


