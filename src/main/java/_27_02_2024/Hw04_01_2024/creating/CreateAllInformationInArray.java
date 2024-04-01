package _27_02_2024.Hw04_01_2024.creating;

import _27_02_2024.Hw04_01_2024.equipments.*;
import com.github.javafaker.Faker;

/**
 * Задание
 * Создайте массив из 10 произвольных объектов, выбирая из вышеуказанных классов.
 * Используйте Faker для генерации значений полей
 */
public class CreateAllInformationInArray {
    Faker faker = new Faker();
    public OfficeEquipment[] officeEquipment1 = new OfficeEquipment[]{new OfficeEquipment(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true),
            new Monitor(faker.number().randomDigit(),
            faker.name().name(),
            faker.name().name(),
            faker.number().randomDigit(),
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
            faker.number().randomDigit(),
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
            faker.number().randomDigit(),
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
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            false,
            faker.name().name(),
            faker.number().randomDigit(),
            faker.number().randomDigit(),
            true,
            faker.number().randomDigit(),
            faker.name().name(),
            faker.number().randomDigit())};

}
