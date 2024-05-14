package _2024_05_07.testCollection.t3;

/**
 * Задание 1: Введение в наследование
 * Тема: Создание базового и производного классов.
 * Описание: Создайте базовый класс Person с полями имя,
 * фамилия и возраст. От него должен наследоваться класс Student,
 * который добавляет поле studentID. Реализуйте геттеры и сеттеры для всех полей.
 * В main создайте экземпляры Person и Student, установите значения их полей и выведите информацию о каждом объекте.
 */
public class Person implements Identifiable{
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void Identifiable() {
        System.out.println(name + surname + age);
    }
}
