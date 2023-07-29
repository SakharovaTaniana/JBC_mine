package week2;

import java.util.Scanner;

/*
Даны три ценых числа "a", "b" и "c".
Найдите сумму двух чисел больших из них.
Входные данные: 21 0 8
Выходные данные: 29
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.print("Введите число c: ");
        int c = scanner.nextInt();
        int summa;
//        summa = Math.max(a, b) + Math.max(b, c);

        if (a <= b && a <= c) {
            summa = b + c;
        } else if (b <= a && b <= c) {
            summa = a + c;
        } else {
            summa = a + b;
        }
        System.out.println(summa);

    }
}
