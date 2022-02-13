package ua.bozhko.hw5;

import java.util.Arrays;

/*
2.	Проверить, заданный массив на упорядоченность по невозрастанию, т. е. определить,
 верно ли, что каждый его элемент, начиная со второго, не больше предыдущего.
*передать массив в метод, получить boolean
 */
public class task5_2 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        deepArr(arr);
        System.out.println(Arrays.deepToString(deepArr(arr)));
        System.out.println(elementArrMostOrNot(deepArr(arr)));
    }

    private static int[][] deepArr(int[][] array) {
        int[][] twoDeepArr = {{1, 2, 3},
                {-7, -3, -4},
                {6, 9, 8},
                {-11, -10, -13}};
        return twoDeepArr;
    }

    private static boolean elementArrMostOrNot(int[][] arrayBool) {
        boolean trFa = false;
        for (int i = 0; i < arrayBool.length - 1; i++) {
            for (int j = 0; j < arrayBool.length; j++) {
                if (arrayBool[i][0] < arrayBool[i + 1][0]) {
                    trFa = true;
                } else {
                    trFa = false;
                }
            }
        }
        return trFa;
    }
}
