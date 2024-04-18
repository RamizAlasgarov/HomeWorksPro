package hw;

import com.github.javafaker.Faker;
import hw.enums.Color;
import hw.enums.Country;
import hw.enums.Currency;
import hw.enums.Model;
import hw.information.Account;
import hw.information.Address;
import hw.information.Auto;
import hw.information.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();


        Address address = new Address(Country.GERMANY, "blinkin street", 15,17);
        Address address1 = new Address(Country.GERMANY, "dorfer street", 10,22);
        Address address2 = new Address(Country.USA, "blinkin street", 12,34);
        List<Address> addresses = List.of(address, address1, address2);

        Auto auto = new Auto(Model.BMW, 4, true, 700, 40_000, 2024, Color.RED);
        Auto auto2 = new Auto(Model.AUDI, 3, true, 1000, 70000, 2015, Color.RED);
        Auto auto3 = new Auto(Model.BMW, 4, false, 300, 20_000, 1999, Color.SILVER);
        Auto auto4 = new Auto(Model.Mers, 4, false, 800, 20_000, 2023, Color.WHITE);
        List<Auto> autos = List.of(auto, auto2, auto3,auto4);

        Account account = new Account(Currency.USD, 5000, 10);
        Account account2 = new Account(Currency.EURO, 3000, 5);
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        accounts.add(account2);


        List<Account> accounts2 = new ArrayList<>();
        accounts2.add(account);


        Person person1 = new Person("petr", "Petrov", address, 2300.2, auto, accounts2);
        Person person2 = new Person("Ivan", "Aleksandrov", address1, 1300.2, auto2, accounts);
        Person person3 = new Person("Mixa", "Ivanov", address2, 1800.2, auto3, accounts);
        Person person4 = new Person("Ramiz", "Alasgarov", address2, 1300.2, auto4, accounts);
//        Person person5 = new Person("jane","Ivanova",address2,1300.2,null,accounts);
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);


//        System.out.println(AllMethods.isRedIsSport(persons));

//        System.out.println(AllMethods.findAverageSalaryInCountry(persons,Country.GERMANY));
//
//        System.out.println(AllMethods.findAccountInfo(persons, 1500));

//        System.out.println(AllMethods.findYearOfReleased(persons, 2005));

//        System.out.println(AllMethods.findSameStreetDifferentHouse(persons,"blinkin street",addresses));

//        System.out.println(AllMethods.withOutAuto(persons));
//        System.out.println(AllMethods.findWhoHaveSportCar(persons)); // problema s null

//        System.out.println(AllMethods.findTwoAccount(persons));

//        System.out.println(AllMethods.findStrongestAuto(persons,300));
//        System.out.println(AllMethods.findHousesEndWithFive(persons));
//        System.out.println(AllMethods.findSameCarAndColor(persons,Model.BMW,Color.RED));
//        System.out.println(AllMethods.findAverageSalary(persons));
//        System.out.println(AllMethods.findNameOfMaxBalance1(persons));
//        System.out.println(AllMethods.findNewCar(persons));
//        System.out.println(AllMethods.findNotSportCarsColor(persons, Color.SILVER));
//        System.out.println(AllMethods.findWhoLiveInFlatZero(persons));
//        System.out.println(AllMethods.findPriceWhichMoreThanWritten(persons, 30000));
//        System.out.println(AllMethods.findEvenNumberOfDoor(persons));

//        System.out.println(AllMethods.findCarPriceMoreThanSalary(persons));
        System.out.println(AllMethods.findForeigner(persons,Country.GERMANY));
    }
}
