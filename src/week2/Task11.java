package week2;
/*
Дана последовательность символов, конкатенировать их в одну строку и вывести эту строку, исключая цифры.
На вход подаются заглавные или строчные символы английского алфавита или цифры
Входные данные: H 1 9 i 4
Выходные данные: Hi
 */

import java.util.Scanner;


public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первый символ: ");
        char ch1 = scanner.next().charAt(0);
        System.out.print("Введите второй символ: ");
        char ch2 = scanner.next().charAt(0);
        System.out.print("Введите третий символ: ");
        char ch3 = scanner.next().charAt(0);
        System.out.print("Введите четвертый символ: ");
        char ch4 = scanner.next().charAt(0);
        System.out.print("Введите пятый символ: ");
        char ch5 = scanner.next().charAt(0);

        if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= 'A' && ch1 <= 'Z')) {
            System.out.print(ch1);
        }
        if ((ch2 >= 'a' && ch2 <= 'z') || (ch2 >= 'A' && ch2 <= 'Z')) {
            System.out.print(ch2);
        }
        if ((ch3 >= 'a' && ch3 <= 'z') || (ch3 >= 'A' && ch3 <= 'Z')) {
            System.out.print(ch3);
        }
        if ((ch4 >= 'a' && ch4 <= 'z') || (ch4 >= 'A' && ch4 <= 'Z')) {
            System.out.print(ch4);
        }
        if ((ch5 >= 'a' && ch5 <= 'z') || (ch5 >= 'A' && ch5 <= 'Z')) {
            System.out.print(ch5);
        }


    }


}


