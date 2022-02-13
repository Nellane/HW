package ua.bozhko.hw3;

public class task3_2 {
    /* Количество слов в строке
Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество слов в ней.
 */
    public static void main(String[] args) {
        String text = "sads adss saffg tstg";
        int count = 0;
        if (text.length() != 0) {
            count++;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Вы ввели " + count + " слов");
    }
}
