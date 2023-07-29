package week1;
/*
Дано двузначное число.
Вывести сначала первую цифру (десятки) на разных строках, затем правую (единицы)
Входные данные: 78
Выходные данные:
7
8
 */
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число:");
        int number=scanner.nextInt();
        System.out.println("цифра десятков: "+number/10);
        System.out.println("цифра единиц: "+number%10);
    }
}
