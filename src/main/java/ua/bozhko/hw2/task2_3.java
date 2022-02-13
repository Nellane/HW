package ua.bozhko.hw2;

public class task2_3 {
    /* 3. Создать метод и вызвать его в main():
Метод будет выводить на экран меньшее по модулю из трёх переданных в метод вещественных чисел.
Для вычисления модуля используйте тернарную операцию. */
    public static void main(String[] args) {
        min(-3, 7, -2);
    }

    public static void min(int a, int b, int c) {
        System.out.println((a < b && a < c) ? a : (b < a && b < c) ? b : (c < a && c < b) ? c : 0);
    }
}
