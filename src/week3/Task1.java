package week3;

import java.util.Scanner;

/*
Проверить, является ли введенная строка корректным hex номером цвета.
        Корректная строка состоит из 7 символов, первый символ “#”, далее цифры или буквы от A до F
        (заглавные или прописные).
        Если строка является корректным hex номером цвета, то вывести true, иначе false.

        Входные данные:
        #00AA12
        true

        00FFFF
        false

        #00FA
        false

        Подсказка:
        [0-9]{5}
        .matches();
 */
public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.print(line.matches("#[A-Fa-f0-9]{6}"));

    }
}
