package _2024_05_03summury.iceCream.sweet;

public class Decustator {
    public void taste(Cone cone){
        while (!cone.isEmpty()){
            IceCreamBall iceCreamBall = cone.takeBall();
            System.out.println("i tasted ball " + iceCreamBall.getTaste());
        }
    }
}
