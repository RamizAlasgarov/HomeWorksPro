package _09_04_24;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{{2, 3, 5, 6, 9},
                                    {4, 7, 8, 11, 13},
                                    {14, 19, 25, 26, 27},
                                    {15, 21, 28, 33, 36},
                                    {24, 29, 44, 55, 66}};
        findNumberTwo(array,25);


//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println(findNumber(array, 30));
    }

    /**
     * @param array
     * @param number
     * @return
     */
//    public static boolean findNumber(int[][] array, int number) {
//        boolean isFinded = false;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] == number) {
//                    return !isFinded;
//                }
//            }
//        }
//        return isFinded;
//    }

    public static void findNumberTwo(int[][] array, int number) {
        int counter = 1;
        int seconCounter = 1;
        int startCount = array[4][0];
        int endCount = array[0][4];

//        for (int i = end; i > array.length/2; i--) {
//                if(end < number){
//                        end = array[4][0+1];
//                    if(end > number){
//                        end = array[4-1][0+1];
//                    }
//
//                    }
//            if(end == number){
//                System.out.println(end);
//                }
//        }
        for (int i = startCount; i > endCount; i++) {
            if(number > startCount) {
                startCount = array[4][counter];


                if (number < startCount) {
                    startCount = array[4 - seconCounter][counter];
                }
                if (number == startCount) {
                    System.out.println(number);
                }
            }

        }

    }
}

