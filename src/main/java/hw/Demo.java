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

import java.util.Random;

public class Demo {

    public static void main(String[] args) {
        Faker faker = new Faker();
        Random random = new Random();
//        Color color = Color.RED;
//        Color color1 = Color.SILVER;
//        Color color2 = Color.WHITE;
//        Currency currency = Currency.EURO;
//        Currency currency1 = Currency.USD;
//        Currency currency2 = Currency.RUBL;


        Address address = new Address(Country.GERMANY,"dorfer Strasse",15);
        Address address1 = new Address(Country.GERMANY,"dorfer Strasse13",17);
        Address address2 = new Address(Country.USA,"Franklin Street",10);
        Address[] addresses = new Address[]{address,address1,address2};

        Auto auto = new Auto(Model.BMW,4,true,700,40000,2010,Color.RED);
        Auto auto2 = new Auto(Model.AUDI,2,true,1000,70000,2015,Color.RED);
        Auto auto3 = new Auto(Model.BMW,4,false,300,20000,1999,Color.SILVER);
        Auto[] autos = new Auto[]{auto,auto2,auto3};

        Account account = new Account(Currency.USD,5000,10);
        Account account2 = new Account(Currency.EURO,3000,5);
        Account[] accounts = new Account[]{account,account2};


        Person person = new Person("petr","Petrov",address,1300.2,auto,accounts);
        Person person2 = new Person("petr","Petrov",address,1300.2,auto,accounts);
        Person person3 = new Person("petr","Petrov",address,1300.2,auto,accounts);




    }


    /**
     * Вывести имена и фамилии всех лиц, чьи автомобили не красные и не спортивные.
     */
    public void findNotReadAndNotSport(){

    }
}
