package dz.dz_1_part_1;

import java.util.Scanner;

/*
На вход подается двузначное число n. Выведите число, полученное
перестановкой цифр в исходном числе n. Если после перестановки получается
ведущий 0, его также надо вывести.
Ограничения:
9 < count < 100

Входные данные: 45
                10
Выходные данные:
                54
                01
 */
public class dz_1_part_1_task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число \"n\": ");
        int n = scanner.nextInt();
        System.out.println("Полученное число после перестановки его цифр равно: " +
                n % 10 + n / 10);
    }

}
