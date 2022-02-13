package ua.bozhko.hw5;

import java.util.Arrays;

/*
3.	Дан двумерный массив NxN(количество строк = количество столбцов),
 написать программу которая поменяет местами столбцы и строки.
*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
 Изначальный массив не должен измениться
 */
public class task5_3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 7, 6},
                {-3, 8, 4},
                {5, -9, 2}
        };
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(willChangePlaces(arr)));
    }

    private static int[][] willChangePlaces(int[][] a) {
        int[][] arrSwap = a;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = arrSwap[i][j];
                arrSwap[i][j] = arrSwap[j][i];
                arrSwap[j][i] = temp;
            }
        }
        return arrSwap;
    }
}