package week2;
/*
Дана строка и паттерн (шаблон). Заменить паттерн на паттерн, состоящий из заглавных символов.
Входные данные: Hello world
                ld
Выходные данные: Hello worLD

 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите паттерн: ");
        String pattern = scanner.nextLine();
        System.out.println(str.replace(pattern,pattern.toUpperCase()));

    }
}
