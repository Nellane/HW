package ua.bozhko.hw2;

public class task2_2 {
    /* 2. Создать метод и вызвать его в main():
    метод будет сообщать(возвращать значение), является ли целое число, переданное в метод, чётным или нет. */
    public static void main(String[] args) {
        System.out.println(isEven(18));
    }

    private static boolean isEven(int num) {
        if (num % 2 != 0) {
            return false;
        } else {
           return true;
        }
    }
}

