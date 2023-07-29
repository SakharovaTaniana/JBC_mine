package dz.dz_1_part_1;

import java.util.Scanner;

/*
На вход подается два целых числа a и b. Вычислите и выведите среднее
квадратическое a и b.
Подсказка:
Среднее квадратическое: https://en.wikipedia.org/wiki/Root_mean_square
Для вычисления квадратного корня воспользуйтесь функцией Math.sqrt(x)

Ограничения:
0 < a, b < 100

Входные данные:35 5
               23 70
Выходные данные:25.0
                52.100863716449076
*/
public class dz_1_part_1_task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число \"a\": ");
        int a = scanner.nextInt();
        System.out.print("Введите целое число \"b\": ");
        int b = scanner.nextInt();
        double result = Math.sqrt(1.0 / 2 * (Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("среднее квадратическое \"a\" и \"b\" равно: " + result);
    }
}
