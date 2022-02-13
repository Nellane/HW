package ua.bozhko.hw4;

import java.util.Arrays;
import java.util.Random;

/*
1. Заполнить одномерный массив случайными целочисленными значениями.
Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива - 400 элементов.
   P.S. значения элементов можно ограничить значениями 1-10 включительно.
 */
public class task4_1 {
    public static void main(String[] args) {
        int[] arr = new int[400];
        fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Cреднее арифметическое: " + getMedianOfNumber(arr));
        System.out.println("Cреднее геометрическое элементов массива: " + getGeometricMedianElement(arr));
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static int getMedianOfNumber(int[] arrayMedianOfNumber) {
        Arrays.sort(arrayMedianOfNumber);
        if (arrayMedianOfNumber.length % 2 == 0) {
            return ((arrayMedianOfNumber[arrayMedianOfNumber.length / 2] + arrayMedianOfNumber[arrayMedianOfNumber.length / 2 - 1]) / 2);
        }
        return arrayMedianOfNumber[arrayMedianOfNumber.length / 2];
    }
    private static double getGeometricMedianElement(int[] arrayGeometricMedianElement){
        int count = 0;
        int pr = 1;
        for (int i = 0; i < arrayGeometricMedianElement.length; i++) {
            pr *= arrayGeometricMedianElement[i];
            count++;
        }
        double geom = Math.pow(pr, 1/count);
        return geom;
    }
}
