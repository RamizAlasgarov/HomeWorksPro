package _25_02_2024;

import java.util.Arrays;
import java.util.Objects;

/**
 * 11: Найдите самую длинную строку в массиве строк.
 * 12: Подсчитайте, сколько раз в массиве встречается строка, равная заданной.
 * 13: Проверьте, все ли строки в массиве имеют одинаковую длину.
 * 14: Найдите строку в массиве, содержащую наибольшее количество гласных.
 * 15: Сформируйте новую строку, повторяя каждую строку в массиве столько раз, какова ее длина
 */
public class TaskThree {
    public static void main(String[] args) {
        String[] array = new String[]{"op","not ok"};
//        System.out.println(findMax(array));
//        System.out.println(findRepeat(array, "ok"));
        glasniy(array);
    }
    public static int findMax(String[] array ){
        int element = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() > element){
                element = array[i].length();
            }
        }
        return element;
    }
    //Подсчитайте, сколько раз в массиве встречается строка, равная заданной.
    public static int findRepeat(String[] array,String message){
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(Objects.equals(array[i],message)){
                counter++;
            }
        }
        return counter;
    }
    //Проверьте, все ли строки в массиве имеют одинаковую длину.
//    public static String isAllEquals(String[] array){
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = array.length-1; j > 0 ; j--) {
//                if(array[i] == array[j]){
//                    return "all are equals";
//                }
//            }
//
//        }
//        return "all are not equals";
//    }
    //Найдите строку в массиве, содержащую наибольшее количество гласных.

    public static void glasniy(String[] array){

        for (int i = 0; i < array.length; i++) {
            char[] c = array[i].toCharArray();

        }
        for (int i = array.length-1; i > 0 ; i--) {
            char[] c2 = array[i].toCharArray();
        }

    }
}
