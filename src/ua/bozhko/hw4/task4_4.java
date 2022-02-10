package ua.bozhko.hw4;

import java.util.Arrays;
import java.util.Random;

/*
   4. Заполнить одномерный массив случайными целочисленными значениями.
 Все четные значения заменить на нули. Размер массива - 2000 элементов.
 */
public class task4_4 {

    public static void main(String[] args) {
        int[] arr = new int[2000];
        int count = 2;
        fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findEvenValues(arr)));
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static int[] findEvenValues(int[] evenValues) {
        for (int i = 0; i < evenValues.length; i++) {
            if (evenValues[i] % 2 == 0) {
                evenValues[i] = 0;
            }
        }
        return evenValues;
    }

}

