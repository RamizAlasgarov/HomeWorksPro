package _24_04_18;

import java.util.Arrays;

public class IntToBinarySystem {
    public static void main(String[] args) {
        IntToBinarySystem task = new IntToBinarySystem();
//        System.out.println(task.get1Count(5));
//        System.out.println(countOnes(5));
        int i = 0b00000011;
        System.out.println(i);
        System.out.println(i >>> 1);
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
        System.out.println(intToBinarySystem);
        System.out.println("********");
        char[] charArray = intToBinarySystem.toCharArray();
        System.out.println(Arrays.toString(charArray));
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] % 2 ==  1){
                count++;
            }
        }
        System.out.println("***********");
        return count;
    }
    public static int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            count = count + num & 1;
            num = num >>> 1;
        }
        return count;
    }

}
