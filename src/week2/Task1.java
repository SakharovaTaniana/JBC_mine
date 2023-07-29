package week2;

import java.util.Scanner;

/*
Дано число "n". Нужно проверить четное ли оно.
Входные данные: 4
Выходные данные: true или число четное
Входные данные: 3
Выходные данные: false или число нечетное
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        String str;
        if (n % 2 == 0) {
            str = "число четное";
        } else {
            str = "число нечетное";
        }
        System.out.println(str);
        //System.out.println(n % 2 == 0); // это второй вариант решения
        /*
        это третий вариант решения:
        String str2=(n % 2 == 0)?"число четное":"число нечетное";
        System.out.println(str2);
         */


    }
}
