package week2;
/*
Дан символ. Поменять его со строчного на заглавный или с заглавного на строичный.
Входные данные: d
Выходные данные: D
Входные данные: A
Выходные данные: a
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
//        String ch=scanner.next();
//        if (ch.toUpperCase().equals(ch)){
//            System.out.println(ch.toLowerCase());
//        }
//        else {
//            System.out.println(ch.toUpperCase());
//        }

        char ch = scanner.nextLine().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println((char) (ch + ('A' - 'a')));
        } else {
            System.out.println((char) (ch - ('A' - 'a')));
        }

    }
}
