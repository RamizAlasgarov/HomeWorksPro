package _25_02_2024;

/**
 * 6: Найдите сумму всех нечетных элементов массива которые находятся на нечетных индексах.
 * 7: Найдите сумму всех четных элементов массива которые находятся на нечетных индексах.
 * 8: Найдите произведение всех нечетных элементов массива.
 * 9: Найдите разность между максимальным и минимальным элементами массива.
 * 10: Найдите сумму элементов массива, которые находятся между первым и последним положительными элементами.
 */
public class TaskTwo {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
//        System.out.println(findDifferenceBetweenMaxAndMin(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(findDifferenceBetweenMaxAndMin(new int[]{1,2,3,2,4}));
        System.out.println(findMultipOddNumbers(array));
    }
    public static int findSumOddNumbersInArray(int[] array){
        int sum =0;
        for (int i = 1; i < array.length; i+=2) {
            if(array[i] % 2 != 0){
                sum += array[i];
            }
        }
        return sum;
    }
    public static int findSumEvenNumbers(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i+=2) {
            if(array[i] % 2 == 0){
                sum += array[i];
            }
        }
        return sum;
    }
    public static int findMultipOddNumbers(int[] array){
        int sum = 1;
        for (int i = 1; i < array.length; i+=2) {
            sum *= array[i];
        }
        return sum;
    }
    public static int findDifferenceBetweenMaxAndMin(int[] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        for (int i = 0; i <array.length ; i++) {
            if(array[i] > max){
                max= array[i];
            }
        }
        return max-min;
    }



    public static int findSumBetweenFirstAndLast(int[] array){
        int sum = 0;
        for (int i = 1; i <array.length-1; i++) {
            if(array[i] > 0){
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
