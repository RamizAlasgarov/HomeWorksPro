package _2024_05_14;

import java.util.ArrayList;
import java.util.List;

/**
 * Создайте функциональный интерфейс TriFunction,
 * который принимает три аргумента разных типов и возвращает результат.
 * Реализуйте его с использованием лямбда-выражения для объединения трех строк. Вызовите метод и выведите результат.
 */
public class Task4 {
    public static void main(String[] args) {
        TriFunction triFunction = (a, b, c) -> a + " " + b + " " + c;
        System.out.println(triFunction.doSomething(1, 2.2, 'o'));
    }

    public void doIt() {

    }
}

interface TriFunction {
    String doSomething(int a, double b, char c);
}
