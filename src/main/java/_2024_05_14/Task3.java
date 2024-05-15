package _2024_05_14;

/**
 * Создайте функциональный интерфейс NumberFilter,
 * который имеет один метод boolean filter(int number).
 * Реализуйте его с использованием лямбда-выражения для проверки,
 * является ли число четным. Примените фильтр к массиву чисел и выведите только четные числа.
 */
public class Task3 {
    public static void main(String[] args) {
        NumberFilter numberFilter = n -> n % 2 == 0;
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int i : array) {
            if (numberFilter.filter(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isUnique(NumberFilter numberFilter, int i) {
        return numberFilter.filter(i);
    }
}

interface NumberFilter {
    boolean filter(int number);
}
