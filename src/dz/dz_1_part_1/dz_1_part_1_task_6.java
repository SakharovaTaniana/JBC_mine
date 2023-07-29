package dz.dz_1_part_1;

import java.util.Scanner;

/*
На вход подается количество километров count. Переведите километры в мили
(1 миля = 1,60934 км) и выведите количество миль.
Ограничения:
0 < count < 1000

Входные данные: 7
                143
Выходные данные:
                4.349609156548647
                88.85630134092237
 */
public class dz_1_part_1_task_6 {
    private static final double KILOMETRS_IN_ONE_MILE = 1.60934;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество километров: ");
        int countOfKilometrs = scanner.nextInt();
        System.out.println("В " + countOfKilometrs + " километрах " + countOfKilometrs / KILOMETRS_IN_ONE_MILE
                + " миль.");

    }
}
