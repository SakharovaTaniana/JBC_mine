package week2;
/*
Ревлизовать System.out.println(), используя System.out.print и табуляцию \n
Входные данные: два слова, считываемые из консоли
Входные данные: Hello World
Выходные данные:Hello
                World
 */

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String s1 = scanner.nextLine();
        System.out.print("Введите второе слово: ");
        String s2 = scanner.nextLine();
        System.out.print(s1 + "\n" + s2);


    }
}
