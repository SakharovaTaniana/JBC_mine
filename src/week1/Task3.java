package week1;

import java.util.Scanner;

/*
Напишите программу, которая получает два числа с плавающей точкой "x" и "y" в аргументах командной строки
и выводит Евклидово расстояние от точки (x,y) до точки (0,0)
Входные данные: x = 5 y = 7
Выходные данные: 8.602325267042627
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.println(Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));


    }
}
