package week1;

import java.util.Scanner;

/*
Напишите аналог функции swap, которая меняет значения двух параметров местами без вспомогательной переменной
Входные данные: a = 7, b = 5
Выходные данные: a = 5, b = 7
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        a = a + b;// 7 + 5 = 12
        b = a - b;// 12 - 5 = 7
        a = a - b;// 12 - 7 = 5
        System.out.println("a = "+a);
        System.out.println("b = "+b);


    }

}
