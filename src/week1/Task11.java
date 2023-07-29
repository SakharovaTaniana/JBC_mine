package week1;

import java.util.Scanner;

/*
Дано целое число n.
Выведите следующее за ним четное число.
При решении этой задачи нельзя использовать условную конструкцию if и циклы.
5 -> 6
10 -> 12
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        System.out.println("Следующее четное число будет: "+(n+2-Math.abs(n)%2));
    }
}
