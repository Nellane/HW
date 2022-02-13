package ua.bozhko.hw4;

import java.util.Arrays;
import java.util.Random;

/*
 3. Заполнить одномерный массив случайными целочисленными значениями.
Проверить сколько составных чисел присутствует в массиве. Размер массива 1000 элементов.
 */
public class task4_3 {
     public static void main(String[] args) {
            int[] arr = new int[1000];
            int count = 0;
            fillRandomArray(arr);
         System.out.println(Arrays.toString(arr));
         System.out.println(findCompositeNumber(arr, 0));
     }

     private static void fillRandomArray(int[] array) {
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10);
            }
        }

    private static int findCompositeNumber(int[] compositeNumber, int cou) {
        for (int i = 0; i < compositeNumber.length; i++) {
                if (compositeNumber[i] < 2) cou--;
                for (int j = 2; j*j <= compositeNumber[i]; j++)
                    if (compositeNumber[i] % j == 0) cou++;
            }
        return cou;
    }
}
