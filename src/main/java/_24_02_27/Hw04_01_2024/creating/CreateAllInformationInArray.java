package _24_02_27.Hw04_01_2024.creating;

import _24_02_27.Hw04_01_2024.equipments.*;
import com.github.javafaker.Faker;

import java.util.Date;

/**
 * Задание
 * Создайте массив из 10 произвольных объектов, выбирая из вышеуказанных классов.
 * Используйте Faker для генерации значений полей
 */
public class CreateAllInformationInArray {
    Faker faker = new Faker();
    Date date =  new Date(1990, 01, 01);
    Date date1 =  new Date(2024, 01, 01);
    public OfficeEquipment[] officeEquipment = new OfficeEquipment[]{new OfficeEquipment(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true),
            new Monitor(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true,
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().name(),
            faker.number().randomDigit(),
            true,
            faker.name().name(),
            false),
            new NoteBook(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            false,
            faker.name().name(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().name(),
            false),
            new Phone(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            false,
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().name(),
            faker.number().randomDigit(),
            true,
            faker.number().randomDigit(),
            faker.name().name()),
            new Printer(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            false,
            faker.name().name(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true,
            faker.number().randomDigit(),
            faker.name().name(),
            faker.number().randomDigit()),new Projector(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            false,
            faker.name().firstName(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().name(),
            true),new Router(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true,
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().name(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            false,
            faker.name().name()),new Scanner(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true,
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().firstName(),
            faker.number().randomDigit(),
            faker.name().name(),
            false,
            faker.name().name()),new Switch(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true,
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().firstName(),
            false,
            faker.number().randomDigit(),
            faker.name().name()),new Tablet(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.date().between(date,date1).getYear(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            false,
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.name().name(),
            faker.number().randomDigit(),
            false,
            faker.number().randomDigit(),
            faker.name().name())};

}