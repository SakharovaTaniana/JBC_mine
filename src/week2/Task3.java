package week2;
/*
Дано четырехзначное число. Проверить эвляется ли оно палиндромом
Входные данные: 1881
Выходные данные: true

Входные данные: 5081
Выходные данные: false
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
//        int a1 = number % 10;
//        number /= 10;
//        int a2 = number % 10;
//        number /= 10;
//        int a3 = number % 10;
//        number /= 10;
//        int a4 = number % 10;
//        if (a1 == a4 && a3 == a2) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
        if (number >= 1000 && number <= 9999) {
            int end = number % 10; // последняя цифра
            int start = number / 1000; // первая цифра
            if (end != start) {
                System.out.println("Не палиндром");
            } else {
                end = number % 100 / 10; // предпоследняя цифра
                start = number / 100 % 10; // вторая слева цифра
                if (end != start) {
                    System.out.println("Не палиндром");
                } else {
                    System.out.println("Палиндром");
                }
            }
        } else {
            System.out.println("Вы ввели не четырехзначное число");
        }


    }
}
