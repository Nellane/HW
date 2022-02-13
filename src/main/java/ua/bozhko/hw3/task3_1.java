package ua.bozhko.hw3;

public class task3_1 {
    public static void main(String[] args) {
        String str = new String("556 887 927");
        System.out.println(str.replace(" ", ""));
        System.out.println(textContrast(str));
    }

    public static boolean textContrast(String str) {
        for (int i = 0, j = str.length() - 1; i < str.length() / 2; i++, j--) {
            if (i != j) {
                return false;
            }
        }
        return true;
    }
}
