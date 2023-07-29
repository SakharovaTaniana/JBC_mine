package dz.dz_1_part_1;

import java.util.Scanner;

/*
Прочитайте из консоли имя пользователя и выведите в консоль строку:
Привет, <имя пользователя>!
Подсказка:
Получите данные из консоли c помощью объекта Scanner, сохраните в
переменную userName и выведите в консоль с помощью System.out.println()
Ограничения:
0 < длина имени пользователя < 100

Входные данные: Иван
Выходные данные: Привет, Иван!
 */
public class dz_1_part_1_task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя: ");
        String userName = scanner.nextLine();
        System.out.println("Привет, " + userName + "!");
    }
}
