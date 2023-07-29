package week1;
/*
n - число детей
k - число конфет
1. Вывести сколько конфет достанется каждому ребенку,если стараться делить их поровну
2. Вывести сколько конфет останется взрослым после выдачи конфет детям
(1) Входные данные: 5 3
(2) Входные данные: 3 17

 */
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число детей: ");
        int n=scanner.nextInt();
        System.out.print("Введите число конфет: ");
        int k=scanner.nextInt();
        System.out.println("всего детям раздали конфет: "+n*(k/n));
        System.out.println(k/n+" конфет достанется каждому ребенку,если стараться делить конфеты поровну");
        System.out.println(k%n+ " конфет останется взрослым после выдачи конфет детям");
    }
}
