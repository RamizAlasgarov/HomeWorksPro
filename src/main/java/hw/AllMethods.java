package hw;

import hw.enums.Color;
import hw.enums.Country;
import hw.enums.Model;
import hw.information.Address;
import hw.information.Person;

import java.util.ArrayList;
import java.util.Collections;
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
    public static List<String> findStrongestAuto(List<Person> personList,int horsePower){

        List<Person> notSportCar = new ArrayList<>();
        List<Person> sportCars = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().isSport()){
                sportCars.add(personList.get(i));
            }
        }
        for (int i = 0; i < personList.size(); i++) {
            if(!personList.get(i).getAuto().isSport()){
                notSportCar.add(personList.get(i));
            }
        }
        for (int i = 0; i < notSportCar.size(); i++) {
            if(notSportCar.get(i).getAuto().getHorsePower() > horsePower){
                result.add(notSportCar.get(i).getName());
            }
        }
        for (int i = 0; i < sportCars.size(); i++) {                    // kak sdelat ot zapolnennoy kollekcii
            if(sportCars.get(i).getAuto().getHorsePower() > horsePower){
                result.add(sportCars.get(i).getName());
            }
        }

        return result;
//        private static void printMaxCapacityAuto(Person[] array) {
//            Person maxSportive = null;
//            Person maxNonSportive = null;
//
//            for (Person person : array) {
//                if (person.getAuto().isSportive()) {
//                    if (maxSportive == null) {
//                        maxSportive = person;
//                    } else if (person.getAuto().getCapacity() > maxSportive.getAuto().getCapacity()) {
//                        maxSportive = person;
//                    }
//                } else {
//                    if (maxNonSportive == null) {
//                        maxNonSportive = person;
//                    } else if (person.getAuto().getCapacity() > maxNonSportive.getAuto().getCapacity()) {
//                        maxNonSportive = person;
//                    }
//                }
//            }
//
//            System.out.println("Самый мощный спортивный: " + maxSportive);
//            System.out.println("Самый мощный не спортивный: " + maxNonSportive);
//        }
    }

    /**
     * Вывести всех лиц, живущих в домах, номера которых заканчиваются на "5".
     */
    public static List<Person> findHousesEndWithFive(List<Person> personList){
        List<Person> intermediateList = new ArrayList<>();
        for (int i = 5; i < 10_000; i+=10) {

        }
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAddress().getNumberOFHouse() % 5 == 0 ){
                    intermediateList.add(personList.get(i));
            }
        }
        for (int i = 0; i < intermediateList.size(); i++) {
            if(intermediateList.get(i).getAddress().getNumberOFHouse() % 10 == 0){
                intermediateList.remove(i);
            }
        }
        return intermediateList;
    }
    /**
     * public static List<Integer> getUniqueDigit(List<Integer> integerList) {
     *     Collections.sort(integerList);
     *     for (int i = 0; i < integerList.size()-1; ) {
     *         if (integerList.get(i) == integerList.get(i + 1)) {
     *             integerList.remove(i + 1);
     *         }else {
     *             i++;
     *         }
     *     }
     *     return integerList;
     * }
     */
    /**
     * Найти лиц с автомобилями определенной марки и цвета.
     */
    public static List<Person> findSameCarAndColor(List<Person> personList, Model model,Color color){
        List<Person> nameList = new ArrayList<>();
        for (int i = 0; i < personList.size()-1; i++) {
            if(personList.get(i).getAuto().getModel().equals(model) && personList.get(i).getAuto().getColors().equals(color)){
                nameList.add(personList.get(i));
            }
        }
        return nameList;
    }

    /**
     * Вывести имена лиц, у которых зарплата выше среднего по массиву.
     */
        public static double findAverageSalary(List<Person> personList){
            double resultSalary = 0;
            for (int i = 0; i < personList.size(); i++) {
                resultSalary += personList.get(i).getSalary();
            }
            return resultSalary / personList.size();
        }

    /**
     * Определить лиц с наибольшим балансом на счету.
     */
    public static double findMaxBalance(List<Person> personList){
        double max = Integer.MIN_VALUE;
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getSalary() > max){
                max = personList.get(i).getSalary();
            }
        }
        return max;
    }
    public static List<String> findNameOfMaxBalance1(List<Person> personList){
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getSalary() == AllMethods.findMaxBalance(personList)){
                resultList = Collections.singletonList(personList.get(i).getName());
            }
        }
        return resultList;
    }

    /**
     * Вывести список лиц, чьи автомобили были куплены новыми (год выпуска авто равен текущему году).
     */
    public static List<Person> findNewCar(List<Person> personList){
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().getYearOfProduction() == 2024){
                list.add(personList.get(i));
            }
        }
        return list;
    }

    /**
     * Найти лиц, у которых есть автомобиль определенного цвета, но не спортивный.
     */
        public static List<String> findNotSportCarsColor(List<Person> personList,Color color){
            List<String> resultList = new ArrayList<>();
            for (int i = 0; i < personList.size(); i++) {
                if(!personList.get(i).getAuto().isSport() && personList.get(i).getAuto().getColors().equals(color)){
                    resultList.add(personList.get(i).getName()+ " " + personList.get(i).getSurname());
                }
            }
            return resultList;
        }

    /**
     * Вывести список лиц, проживающих в квартирах (номер квартиры не равен 0).
     */
    public static List<Person> findWhoLiveInFlatZero(List<Person> personList){
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAddress().getNumberOfFlat() == 0){
                list.add(personList.get(i));
            }
        }
        return list;
    }
    /**
     * Найти и вывести лиц, чьи автомобили имеют стоимость выше заданной.
     */
    public static List<Person> findPriceWhichMoreThanWritten(List<Person> personList,int price){
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().getPrice() > price){
                list.add(personList.get(i));
            }
        }
        return list;
    }
    /**
     * Вывести имена и фамилии всех лиц, чьи автомобили имеют четное количество дверей.
     */
    public static List<Person> findEvenNumberOfDoor(List<Person> personList){
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().getDoorCount() % 2 == 0 ){
                list.add(personList.get(i));
            }
        }
        return list;
    }
    /**
     * Определить и вывести лицо, имеющего счет с наименьшим балансом.
     */
//    public static List<String> findPersonWithLessBalance(List<Person> personList){
//        int res = 0;
//        List<Person> list = new ArrayList<>();
//        for (int i = 0; i < personList.size(); i++) {
//
//
//        }
//    }

    /**
     * Вывести список лиц, имеющих автомобили, которые стоят дороже их зарплаты.
     */
    public static List<Person> findCarPriceMoreThanSalary(List<Person> personList){
        List<Person> list = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAuto().getPrice() > person.getSalary()) {
                list.add(person);
            }
        }
        return list;
    }

    /**
     * Найти лиц, проживающих не в своей стране (предполагая, что есть поле гражданства в классе Person).
     */
    public static List<Person> findForeigner(List<Person> personList,Country country){
        List<Person> people = new ArrayList<>();

        for (Person person : personList) {
            if (!person.getAddress().getCountry().equals(country)) {
                  people.add(person);
            }
        }
        return people;
    }
    /**
     * Определить количество лиц, у которых есть автомобили с количеством дверей больше 4.
     */
    public static List<Person> findAutosWithMoreFourDoors(List<Person> personList){
        List<Person> resultList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().getDoorCount() > 4){
                resultList.add(personList.get(i));
            }
        }
        return resultList;
    }
    /**
     * Вывести список лиц, имеющих автомобиль той же марки, что и автомобиль первого лица в массиве.
     */
    public static List<Person> findSameAutoWithPersonOne(List<Person> personList){
        List<Person> resultList = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAuto().getModel().equals(personList.get(0).getAuto().getModel())){
                resultList.add(personList.get(i));
            }
        }
        return resultList;
    }
    /**
     * Найти лиц, чей счет в определенной валюте является единственным с такой валютой в массиве.
     */
    public static List<Person> findSoleAccount(List<Person> personList){
        List<Person> resultList = new ArrayList<>();
        for (int i = 0; i < personList.size()-1; i++) {
            if(personList.get(i).getAccounts().get(i).getCurrency() != personList.get(i+1).getAccounts().get(i+1).getCurrency()){
                resultList.add(personList.get(i));
            }
        }
        return resultList;
    }

    /**
     * Вывести список лиц, у которых нет автомобилей и живут в квартирах.
     */
    public static List<Person> findPersonWithOutAutoButLiveInApartments(List<Person> personList){
        List<Person> resultLIst = new ArrayList<>();
        for (int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getAddress().getNumberOFHouse() == -1 && personList.get(i).getAuto() == null){
                resultLIst.add(personList.get(i));
            }
        }
        return resultLIst;
    }
}

