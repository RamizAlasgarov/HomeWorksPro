package _24_02_25;

import java.util.Arrays;

/**
 * 1: Найдите сумму всех нечетных элементов массива.
 * 2: Найдите максимальный элемент в массиве.
 * 3: Проверьте, содержит ли массив заданный элемент.
 * 4: Посчитайте, сколько раз заданный элемент встречается в массиве.
 * 5: Инвертируйте элементы массива.
 */
public class TaskOne {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,2,2,2};


//        System.out.println(OddNumbersInArray.findOddNumber(array));
//        System.out.println(findMaxInArray(array));
//        System.out.println(findElement(array, 2));
//        System.out.println(findCountOfSameElement(array,2));
//        invertArray(array);
    }
    public static int findOddNumber(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
        if(array[i] %2 != 0)
            sum+= array[i];
        }
        return sum;
    }
    public static int findMaxInArray(int[] array){

        int maxElement = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= maxElement){
                maxElement = array[i];
            }
        }
        return maxElement;
    }
    public static int findElement(int[] array,int element){
        for (int i = 0; i < array.length ; i++) {
            if(array[i] == element){
                return element;
            }
        }
        return -1;

    }

    public static int findCountOfSameElement(int[] array,int findElement){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == findElement){
                counter++;
            }
        }
        return counter;
    }
    public static void invertArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        System.out.println(Arrays.toString(array));
    }
}
