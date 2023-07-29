package dz.dz_1_part_2;

import java.util.Scanner;

/*
(1 балл) "А логарифмическое?" - не унималась дочь.

Напишите программу, которая проверяет, что log(e^n) == n для любого вещественного n.

	Ограничения:
-500 < n < 500

Входные данные: 1,0
Выходные данные: true

Входные данные: 12,34
Выходные данные: true

Входные данные: -42,10
Выходные данные: true
 */
public class dz_1_part_2_task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вещественное число: ");
        double n = scanner.nextDouble();
        System.out.println(Math.log(Math.pow(Math.E, n)) == n ? true : false);
    }
}
