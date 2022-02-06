package ua.bozhko.hw2;

public class task2_1 {
    public static void main(String[] args) {
        /* 1. Создать метод и вызвать его в main():
 Заданы плоские декартовы координаты треугольника.
 Найти площадь треугольника.
 Метод должен вернуть значение площади.
         */
        int AB = 13, CA = 12, BC = 14;
        double triangle = calculateTriangle();
        System.out.println("Стороны треугольника: AB = " + AB + " BC = " + BC + " CA = " + CA);
        System.out.println("Площадь треугольника = " + triangle);
    }
    private static double calculateTriangle() {
        int AB = 13, CA = 12, BC = 14;
        int p = (AB + BC + CA) / 2;
        double x = Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
        return x;
    }
}
