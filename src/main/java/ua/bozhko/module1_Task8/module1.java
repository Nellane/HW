package ua.bozhko.module1_Task8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Пользователь вводит размер массива в консоль  (i >= 10)
Метод заполняет массив случайными числами в диапазоне [-100; 100]
Вывести массив на экран
Пользователю предлагается выбрать способ сортировки по возрастанию или убыванию
Сортируется массив в соответствии с выбором (нужно написать свой алгоритм сортировки)
Вывести массив на экран
Каждое третье число массива возвести в куб
Вывести массив на экран
 */
public class module1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter variant sorted 1 - from less, 2 - from more: ");
        int swi = scan.nextInt();
        switch (swi) {
            case 1:
                System.out.println(Arrays.toString(bubbleSortLess(arr)));
                arrayCube(bubbleSortLess(arr));
                System.out.println(Arrays.toString(arrayCube(bubbleSortLess(arr))));
                break;
            case 2:
                System.out.println(Arrays.toString(bubbleSortMore(arr)));
                arrayCube(bubbleSortMore(arr));
                System.out.println(Arrays.toString(arrayCube(bubbleSortMore(arr))));
                break;
            default:
                System.out.println("Вы ввели не верное число");
        }
    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
    }

    private static int[] bubbleSortLess(int[] arrayLess) {
        for (int i = arrayLess.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayLess[j] > arrayLess[j + 1]) {
                    int tmp = arrayLess[j];
                    arrayLess[j] = arrayLess[j + 1];
                    arrayLess[j + 1] = tmp;
                }
            }
        }
        return arrayLess;
    }

    private static int[] bubbleSortMore(int[] arrayMore) {
        for (int i = arrayMore.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayMore[j] < arrayMore[j + 1]) {
                    int tmp = arrayMore[j];
                    arrayMore[j] = arrayMore[j + 1];
                    arrayMore[j + 1] = tmp;
                }
            }
        }
        return arrayMore;
    }

    private static int[] arrayCube(int[] arrayCube) {
        for (int i = 3; i <= arrayCube.length; i += 3) {
            arrayCube[i] = arrayCube[i] * arrayCube[i] * arrayCube[i];
            arrayCube[i] = arrayCube[i];
        }
        return arrayCube;
    }
}
