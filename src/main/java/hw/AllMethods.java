package hw;

import hw.enums.Color;
import hw.enums.Country;
import hw.information.Address;
import hw.information.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMethods {
    /**
     * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
     */
    public static List<String> isRedIsSport(List<Person> persons) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            if (!persons.get(i).getAuto().getColors().equals("red") && !persons.get(i).getAuto().isSport()) {
                result.add(persons.get(i).getSurname() + " " + persons.get(i).getName());
            }
        }
        return result;
    }

    /**
     * Найти и вывести среднюю зарплату всех лиц, проживающих в определенной стране.
     */
    public static double findAverageSalaryInCountry(List<Person> persons, Country country) {
        int counter = 0;
        double result = 0;
        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getAddress().getCountry() == country) {
                result += persons.get(i).getSalary();
                counter++;
            }
        }
        return result / counter;
    }

    /**
     * Вывести информацию о всех лицах, у которых счет в определенной валюте превышает заданный баланс.
     */
    public static List<String> findAccountInfo(List<Person> person, double balance) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getAccounts().get(i).getBalance() > balance) {
                list.add(person.get(i).getName());
            }

        }
        return list;
    }

    /**
     * Перечислить всех, у кого автомобиль был выпущен до определенного года.
     */
    public static List<String> findYearOfReleased(List<Person> person, int year) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < person.size(); i++) {
            if (person.get(i).getAuto().getYearOfProduction() < year) {
                list.add(person.get(i).getName() + " " + person.get(i).getSurname());
            }
        }
        return list;
    }


    /**
     * Найти лиц, живущих на одной улице, но в разных домах.
     */
    public static List<String> findSameStreetDifferentHouse(List<Person> personList, String street, List<Address> addressList) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i <= personList.size(); i++) {
            for (int j = addressList.get(i).getNumberOFHouse(); j >= 0; j--) {
                if (personList.get(i).getAddress().getStreet().equals(street) && personList.get(i).getAddress().getNumberOFHouse() == personList.get(i + 1).getAddress().getNumberOFHouse()) {
                    resultList.add(personList.get(i).getName() + personList.get(i).getSurname());
                }
            }

        }
        return resultList;
    }
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

//    /**
//     * Найти лиц, живущих на одной улице, но в разных домах.
//     */
//    public static StreetToPeople[] findSameStreetButDifferentHouses(Person[] person) {
//        StreetToPeople[] streetsToPeople = new StreetToPeople[person.length];
//        int index = 0;
//        for (int i = 0; i < person.length; i++) {
//            for (int j = i + 1; j < person.length; j++) {
//                if (person[i].getAddress().getStreet().equals(person[j].getAddress().getStreet()) &&
//                        person[i].getAddress().getNumberOFHouse() != person[j].getAddress().getNumberOFHouse()) {
//                    StreetToPeople stp = new StreetToPeople(person[i].getAddress().getStreet(), new Person[]{person[i], person[j]});
//                    streetsToPeople[index] = stp;
//                    index++;
//                }
//            }
//        }
//        return reshuffle(Arrays.copyOfRange(streetsToPeople,0,index));
//
//    }
//
//    private static StreetToPeople[] reshuffle(StreetToPeople[] streetToPeople) {
//        StreetToPeople[] street = new StreetToPeople[streetToPeople.length];
//        int streetIndex = 0;
//        for (int i = 0; i < streetToPeople.length; i++) {
//            Person[] peopleOnThisStreet = new Person[10];
//            int index = 0;
//            String nameOfStreet = streetToPeople[i].nameOfStreet;
//            for (int j = i+1; j <streetToPeople.length; j++) {
//                if(nameOfStreet.equals(streetToPeople[j].nameOfStreet)){
//                    for (Person person : streetToPeople[j].people) {
//                        peopleOnThisStreet[index] = person;
//                        index++;
//                    }
//                }
//            }
//            street[streetIndex] = new StreetToPeople(nameOfStreet, Arrays.copyOfRange(peopleOnThisStreet,0,index));
//            streetIndex++;
//        }
//        return Arrays.copyOfRange(street,0,streetIndex);
//    }
//
//
//
//
//    public static class StreetToPeople {
//        private final String nameOfStreet;
//        private final Person[] people;
//
//        public StreetToPeople(String nameOfStreet, Person[] people) {
//            this.nameOfStreet = nameOfStreet;
//            this.people = people;
//        }
//
//        public String getNameOfStreet() {
//            return nameOfStreet;
//        }
//
//        public Person[] getPeople() {
//            return people;
//        }
//
//        @Override
//        public String toString() {
//            return "StreetToPeople{" +
//                    "nameOfStreet='" + nameOfStreet + '\'' +
//                    ", people=" + Arrays.toString(people) +
//                    '}';
//        }
//    }

    /**
     * Вывести список всех лиц без автомобилей (предполагая, что авто может быть null).
     */
    public static List<String> withOutAuto(List<Person> personList) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getAuto() == null) {
                list.add(personList.get(i).getName());
            }
        }
        return list;
    }
    /**
     * Определить количество лиц, имеющих спортивный автомобиль с мощностью более 300 л.с.
     */
    public static List<String> findWhoHaveSportCar(List<Person> personList){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().isSport() && personList.get(i).getAuto().getHorsePower() > 300){
                list.add(personList.get(i).getName() +" " + personList.get(i).getSurname());
            }
        }
        return list;
    }

    /**
     * Найти и вывести имена и фамилии лиц, имеющих более одного счета (предполагая наличие списка счетов).
     */
    public static List<String> findTwoAccount(List<Person> personList){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAccounts().size() > 1){
                list.add(personList.get(i).getName() + " " + personList.get(i).getSurname());
            }
        }
        return list;
    }
    /**
     * Вывести список лиц, чьи автомобили являются наиболее мощными в своем классе (спортивные/неспортивные).
     */
    public static List<String> findStrongestAuto(List<Person> personList){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().isSport() && personList.get(i).getAuto().getModel().name().equals(personList.get(i).getAuto().getModel().name())) {
                list.add(personList.get(i).getName());
            }
        }
        return list;
    }
}

