package _2024_04_23;

public class FibanaciNumbers {
    public static int getFibonachi(int index) {
        int sum = 0;
        int x1 = 0;
        int x2 = 1;

        if (index == 0 || index == 1) {
            return index;
        }

        for (int i = 1; i < index; i++) {
            sum = x1 + x2;
            x1 = x2;
            x2 = sum;
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
