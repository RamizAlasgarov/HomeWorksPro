package _2024_05_05summury.iceCream.sweet;

import java.util.Stack;

/**
 * Создайте класс Рожок для мороженого.
 * Создайте класс Шарик мороженого, содержащий поле Вкус.
 * При создании объекта Рожок указывается, сколько шариков в него помещается.
 * В программе создайте рожок на три шарика, положите в него три шарика с разными вкусами.
 * Создайте класс Дегустатор мороженого.
 * В классе создайте метод, который принимает рожок мороженного,
 * съедает их и сообщает, шарик с каким вкусом был съеден.
 * Дегустатор может есть шарики только в порядке, обратном
 * порядку складывания шариков в рожок.
 * Какую коллекцию нужно использовать для хранения шариков в рожке?
 */
public class Cone {
    private Stack<IceCreamBall> balls;

    public Cone() {
        balls = new Stack<>();
    }

    public void putBall(IceCreamBall iceCreamBall){
        balls.add(iceCreamBall);
    }

    public IceCreamBall takeBall(){
        return balls.pop();
    }

    public boolean isEmpty(){
        return balls.isEmpty();
    }

}
