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

import java.util.Arrays;
import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();


        Address address = new Address(Country.GERMANY,"blinkin street",11);
        Address address1 = new Address(Country.GERMANY,"dorfer street",10);
        Address address2 = new Address(Country.USA,"blinkin street",12);
        Address[] addresses = new Address[]{address,address1,address2};

        Auto auto = new Auto(Model.BMW,4,true,700,40000,2010,Color.RED);
        Auto auto2 = new Auto(Model.AUDI,2,true,1000,70000,2015,Color.RED);
        Auto auto3 = new Auto(Model.BMW,4,false,300,20000,1999,Color.SILVER);
        Auto[] autos = new Auto[]{auto,auto2,auto3};

        Account account = new Account(Currency.USD,5000,10);
        Account account2 = new Account(Currency.EURO,3000,5);
        Account[] accounts = new Account[]{account,account2};


        Person person = new Person("petr","Petrov",address,2300.2,auto,accounts);
        Person person2 = new Person("Ivan","Aleksandrov",address1,2300.2,auto2,accounts);
        Person person3 = new Person("Mixa","Ivanov",address2,1300.2,auto3,accounts);
//        Person person4 = new Person("jane","Ivanova",address2,1300.2,null,accounts);


        Person[] persons = new Person[]{person,person2,person3};
//        System.out.println(Arrays.toString(AllMethods.isRedIsSport(persons)));
//        System.out.println();
//        System.out.println(AllMethods.findAverageSalaryInCountry(persons,Country.GERMANY));
//        System.out.println();
////        System.out.println(Arrays.toString(AllMethods.findAccountInfo(persons, 1500)));
//        System.out.println();
//        System.out.println(Arrays.toString(AllMethods.findYearOfReleased(persons, 2005)));
        System.out.println();
//        System.out.println(Arrays.toString(AllMethods.findSameStreetButDifferentHouses(persons,addresses)));
        for (AllMethods.StreetToPeople sameStreetButDifferentHouse : AllMethods.findSameStreetButDifferentHouses(persons)) {
            System.out.println(sameStreetButDifferentHouse);
        }
    }
}
