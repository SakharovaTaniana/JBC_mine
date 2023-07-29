package dz.dz_1_part_2;

import java.util.Scanner;

/*
(1 балл) На следующий день на работе Петю и его коллег попросили заполнить анкету. Один из вопросов
был про уровень владения английского. Петя и его коллеги примерно представляют, сколько они знают
иностранных слов. Также у них есть табличка перевода количества слов в уровень владения английском
языком. Было бы здорово автоматизировать этот перевод!

На вход подается положительное целое число count - количество выученных иностранных слов.
Нужно вывести какому уровню соответствует это количество.

Количество слов	Уровень английского
count < 500 	beginner
500 <= count < 1500	pre-intermediate
1500 <= count < 2500	intermediate
2500 <= count < 3500	upper-intermediate
3500 <= count	fluent

	Ограничения:
0 <= n < 10000

Входные данные:595
Выходные данные:pre-intermediate

Входные данные:9000
Выходные данные:fluent

Входные данные:3303
Выходные данные:upper-intermediate

Входные данные:292
Выходные данные:beginner

 */
public class dz_1_part_2_task_6 {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int count;
        boolean flag = true; // переменная-индикатор, что число введено неверно
        do {
            System.out.print("Введите количество выученных иностранных слов (положительное" +
                    " целое число): ");
            count = scanner.nextInt();
            if (count < 0 || count >= 10000) {
                System.out.println("Вы ввели неверное число.");
                continue;
            } else {
                flag = false;
            }
        }
        while (flag);
        if (count < 500) {
            System.out.println("beginner");
        } else if (count >= 500 && count < 1500) {
            System.out.println("pre-intermediate");
        } else if (count >= 1500 && count < 2500) {
            System.out.println("intermediate");
        } else if (count >= 2500 && count < 3500) {
            System.out.println("upper-intermediate");
        } else {
            System.out.println("fluent");
        }

    }
}
