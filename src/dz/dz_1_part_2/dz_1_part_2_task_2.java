package dz.dz_1_part_2;
/*
2.	(1 балл) Петя пришел домой и помогает дочке решать математику. Ей нужно определить, принадлежит ли
точка с указанными координатами первому квадранту. Недолго думая, Петя решил автоматизировать
процесс и написать программу: на вход нужно принимать два целых числа (координаты точки),
выводить true, когда точка попала в квадрант и false иначе.
Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её координаты удовлетворяют
условию: x > 0 и y > 0.

 	Ограничения:
-100 < x, y < 100

Входные данные:-50 -12
Выходные данные:false

Входные данные:42 15
Выходные данные:true

Входные данные:0 23
Выходные данные:false

Входные данные:46 26
Выходные данные:true


 */

import java.util.Scanner;

public class dz_1_part_2_task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите X координату точки (целое число): ");
        int x = scanner.nextInt();
        System.out.print("Введите Y координату точки (целое число): ");
        int y = scanner.nextInt();
        if (x > 0 && y > 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
