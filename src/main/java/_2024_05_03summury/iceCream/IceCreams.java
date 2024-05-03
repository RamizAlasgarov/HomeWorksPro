package _2024_05_03summury.iceCream;

import _2024_05_03summury.iceCream.sweet.Cone;
import _2024_05_03summury.iceCream.sweet.Decustator;
import _2024_05_03summury.iceCream.sweet.IceCreamBall;

/**
 * Создайте класс Рожок для мороженого.
 * Создайте класс Шарик мороженого, содержащий поле Вкус.
 * При создании объекта Рожок указывается, сколько шариков в него помещается.
 * В программе создайте рожок на три шарика, положите в него три шарика с разными вкусами.
 * Создайте класс Дегустатор мороженого.
 * В классе создайте метод, который принимает рожок мороженного, съедает их и сообщает, шарик с каким вкусом был съеден. Дегустатор может есть шарики только в порядке, обратном порядку складывания шариков в рожок. Какую коллекцию нужно использовать для хранения шариков в рожке?
 */
public class IceCreams {
    public static void main(String[] args) {
        IceCreamBall iceCreamBallOne = new IceCreamBall("vanilla");
        IceCreamBall iceCreamBallTwo = new IceCreamBall("strawberry");
        IceCreamBall iceCreamBallThree = new IceCreamBall("chokolad");

        Cone cone = new Cone();
        cone.putBall(iceCreamBallOne);
        cone.putBall(iceCreamBallTwo);
        cone.putBall(iceCreamBallThree);

        Decustator decustator = new Decustator();
        decustator.taste(cone);
    }
}
