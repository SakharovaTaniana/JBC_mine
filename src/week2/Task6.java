package week2;
/*
Даны три ценых числа "a", "b" и "c". (5 и -5 прямо противоположные числа)
0 и 0 не считать прямопротивоположными

Входные данные: -1 1 0
Выходные данные: true
Входные данные: -2 1 0
Выходные данные: false

 */

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
        System.out.print("Введите число c: ");
        int c = scanner.nextInt();

        boolean res = (a == -b && a != 0) || (a == -c && a != 0) || (b == -c && b != 0);
        System.out.println(res);

    }
}
