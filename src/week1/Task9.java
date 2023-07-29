package week1;
/*
Решение квадратного уравнения.
Даны целые числа a, b и c, определяющие квадратное уравнение.
Вычислить корни уравнения.
Гарантируется, что в тестовых заданиях у всех уравнений есть решения и их два.
Входные данные: а = 9, b = -96, с = 30
Выходные данные: x1 = 0.322    x2 = 10.344
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число \"а\": ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число \"b\": ");
        int b = scanner.nextInt();
        System.out.print("Введите целое число \"c\": ");
        int c = scanner.nextInt();
        double d = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        System.out.println("Корни уравнения: x1 = " + x1 + " x2 = " + x2);
    }
}
