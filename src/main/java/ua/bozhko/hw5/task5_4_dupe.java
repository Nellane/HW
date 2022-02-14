package ua.bozhko.hw5;

import java.util.Arrays;
import java.util.Random;

/*
4.	Удаление из массива k-го элемента со сдвигом всех расположенных справа от него элементов на одну позицию влево.
*Необходимо создать новый массив, в котором удаляется элемент и вернуть его из метода.
 Изначальный массив не должен измениться
 */
public class task5_4_dupe {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(aDelElement(arr));
        System.out.println(Arrays.toString(arrToLeft(arr)));

    }

    private static void fillRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    private static int aDelElement(int[] aElement) {
        int count = 0;
        for (int i = 0; i < aElement.length - 1; i++) {
            count = aElement[0];
        }
        return count;
    }

    private static int[] arrToLeft(int[] arrayToLeft) {
        int[] arrNext = arrayToLeft;
        int count = 0;
        for (int i = 0; i < arrNext.length - 1; i++) {
            int tmp = arrNext[i];
            arrNext[i] = arrNext[i + 1];
            arrNext[i + 1] = tmp = 0;
        }
        return arrNext;
    }
}
