package week2;

import java.util.Scanner;

/*
    Дано число "n".
    Если оно четное и больше либо равно 0, то вывести "Четное больше или равно 0"
    Если четное и меньше 0, то вывести "Четное меньше 0"

    Входные данные: -4
    Выходные данные: Четное меньше 0
    Входные данные: 28
    Выходные данные: Четное больше или равно 0

 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
//        if (n % 2 == 0 && n >= 0) {
//            System.out.println("Четное больше или равно 0");
//        }
//        if (n % 2 == 0 && n < 0) {
//            System.out.println("Четное меньше 0");
//        }

        /*
        2 вариант решения:
        if (n % 2 == 0){
            if (n >= 0){
                System.out.println("Четное больше или равно 0");
            }
            else {
                System.out.println("Четное меньше 0");
            }
        } else {
            System.out.println("Вы ввели неправильное число");
        }

         */

        System.out.println((n % 2 == 0) ? (n >= 0)?"Четное больше или равно 0" : "Четное меньше 0":"Вы ввели неправильное число");

    }
}
