package ua.bozhko.hw2;

public class task2_2 {
    /* 2. Создать метод и вызвать его в main():
    метод будет сообщать(возвращать значение), является ли целое число, переданное в метод, чётным или нет. */
    public static void main(String[] args) {
        somechet(18);
        System.out.println();
    }

    private static void somechet(int num) {
        if (num % 2 != 0) {
            System.out.println("нечет" + num);
            return;
        }
        System.out.println("чет" + num);
    }
}

