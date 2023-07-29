package dz.dz_1_part_1;

import java.util.Scanner;

/*
На вход подается количество секунд, прошедших с начала текущего дня – count.
Выведите в консоль текущее время в формате: часы и минуты.
Ограничения:
0 < count < 86400

Входные данные: 32433
                41812
Выходные данные: 9 0
                 11 36
 */
public class dz_1_part_1_task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд, прошедших с начала текущего дня: ");
        int count = scanner.nextInt();
        int hours = count / (60 * 60); // количество часов
        int minutes = count % (60 * 60) / 60; // оставшееся количество минут
        System.out.println("Текущее время: " + hours + " часов " + minutes + " минут.");
    }
}
