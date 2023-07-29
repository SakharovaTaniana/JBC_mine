package dz.dz_1_part_1;

import java.util.Scanner;

/*
На вход подается баланс счета в банке – n. Рассчитайте дневной бюджет на 30
дней.
Ограничения:
0 < count < 100000

Входные данные: 13509
                81529
Выходные данные:
                450.3
                2717.633333333333
 */
public class dz_1_part_1_task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите баланс счета в банке: ");
        int n = scanner.nextInt();
        System.out.println("Дневной бюджет на 30 дней равен: " + n / 30.0);
    }
}
