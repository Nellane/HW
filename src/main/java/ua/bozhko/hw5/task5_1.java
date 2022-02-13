package ua.bozhko.hw5;

import java.util.Arrays;

/*
1.	Заполнение двумерного массива значениями индекса(от 1 и до кол-ва элементов в массиве),
при этом каждая вторая строка - отрицательными значениями.
Например
1 2 3
-4 -5 -6
7 8 9
-10 -11 -12
*Передать массив в метод, заполнить данный массив
 */
public class task5_1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        deepArr(arr);
        System.out.println(Arrays.deepToString(deepArr(arr)));
    }

    private static int[][] deepArr(int[][] array) {
        int[][] twoDeepArr = {{1, 2, 3},
                {-7, -3, -4},
                {6, 9, 8},
                {-11, -10, -13}};
        return twoDeepArr;
    }
}
