package _2024_05_14;

/**
 * Создайте функциональный интерфейс Adder,
 *  который имеет один метод int add(int a, int b).
 *  Реализуйте этот интерфейс с использованием лямбда-выражения и вызовите метод.
 */
public class task1 {
    public static void main(String[] args) {
        Adder adder = (a,b) -> a+b;
        System.out.println(adder.add(1,2));
//        System.out.println(getAdder((a, b) -> a + b));
    }
    public static int getAdder(Adder adder){
        return adder.add(1,2);

    }
}
interface Adder{
    int add(int a,int b);
}