package _24_04_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        System.out.println(task.get1Count(2));
    }
    /**
     *
     * @param k == 7 [0 0 0 0 0 1 1 1]
     * @return 3
     * &
     */
    public int get1Count(int k) {
        int count = 0;
        String intToBinarySystem = Integer.toBinaryString(k);
        char[] charArray = intToBinarySystem.toCharArray();
        System.out.println(Arrays.toString(charArray));
        for (char i = 0; i < charArray.length; i++) {
            if(charArray[i] == 1){
                count++;
            }
        }
        System.out.println("***********");
        return count;
    }
}
