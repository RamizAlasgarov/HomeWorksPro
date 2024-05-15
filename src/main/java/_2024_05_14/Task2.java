package _2024_05_14;

/**
 * Создайте функциональный интерфейс StringConverter,
 *  который имеет один метод String convert(String str).
 *   Реализуйте его с использованием лямбда-выражения для преобразования строки в верхний регистр и вызовите метод.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(getUpperCase((s) -> s));
    }
    public static String getUpperCase(StringConverter stringConverter){
        return stringConverter.convert("yes").toUpperCase();
    }
}
interface StringConverter{
    String convert(String str);
}
