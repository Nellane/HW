package ua.bozhko.hw4;

import java.util.Arrays;
import java.util.Random;

/*
   2. Заполнить одномерный массив случайными целочисленными значениями.
Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
 */
public class task4_2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int count = 2;
        fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findPrimeNumber(arr, count) + " - простое число");
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static int findPrimeNumber(int[] primeNumbers, int cou) {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] > 1) {
                if (primeNumbers[i] % cou != 0) {
                    cou++;
                } else if (primeNumbers[i] % cou == 0) {
                    cou--;
                }
            }
        }
        return cou;
    }
}