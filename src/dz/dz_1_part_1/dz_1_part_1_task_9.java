package dz.dz_1_part_1;

import java.util.Scanner;

/*
На вход подается бюджет мероприятия – n тугриков. Бюджет на одного гостя – k
тугриков. Вычислите и выведите, сколько гостей можно пригласить на
мероприятие.
Ограничения:
0 < n < 100000
0 < k < 1000
k < n

Входные данные: 14185    72
                85177    89
Выходные данные:
                197
                957
 */
public class dz_1_part_1_task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите бюджет мероприятия: ");
        int n = scanner.nextInt();
        System.out.print("Введите бюджет на одного гостя: ");
        int k = scanner.nextInt();
        System.out.println(n / k + " гостей можно пригласить на мероприятие");

    }
}

