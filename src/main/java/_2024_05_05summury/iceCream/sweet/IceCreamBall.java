package _2024_05_05summury.iceCream.sweet;

/**
 * Создайте класс Рожок для мороженого.
 * Создайте класс Шарик мороженого, содержащий поле Вкус.
 * При создании объекта Рожок указывается, сколько шариков в него помещается.
 * В программе создайте рожок на три шарика, положите в него три шарика с разными вкусами.
 * Создайте класс Дегустатор мороженого. В классе создайте метод, который принимает рожок мороженного, съедает их и сообщает, шарик с каким вкусом был съеден. Дегустатор может есть шарики только в порядке, обратном порядку складывания шариков в рожок. Какую коллекцию нужно использовать для хранения шариков в рожке?
 */
public class IceCreamBall {
    private String taste;

    public IceCreamBall(String taste) {
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    @Override
    public String toString() {
        return "IceCreamBall{" +
                "taste='" + taste + '\'' +
                '}';
    }
}