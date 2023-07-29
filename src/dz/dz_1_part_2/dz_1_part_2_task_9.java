package dz.dz_1_part_2;

import java.util.Scanner;

/*
(1 балл) Пока Петя практиковался в работе со строками, к нему подбежала его дочь и спросила:
"А правда ли, что тригонометрическое тождество (sin^2(x)+ cos^2(x) - 1 == 0) всегда-всегда выполняется?"

Напишите программу, которая проверяет, что при любом x на входе
тригонометрическое тождество будет выполняться (то есть будет выводить true при любом x).

	Ограничения:
-1000 < x < 1000

Входные данные: 90
Выходные данные: true

Входные данные: 0
Выходные данные: true

Входные данные: -200
Выходные данные: true
 */
public class dz_1_part_2_task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение \"X\": ");
        double x = scanner.nextDouble();
        if ((int) (Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2)) - 1 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
