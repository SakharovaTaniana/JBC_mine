package week1;

import java.util.Scanner;

/*
Дано "m" - количество гигабайт трафика, используемое пользователем за месяц, "с" - запланированная цена
за этот трафик.
Вычистить стоимость одного гигабайта трафика.
Ограничения:
0 < m < 100
Входные данные: m = 5 с = 20
Выходные данные: 4.0
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usedTrafic = scanner.nextInt();//количество гигабайт трафика ("m")
        int totalPrice = scanner.nextInt();//цена за этот трафик ("с")
        double pricePerOneGigabyte =totalPrice/usedTrafic;//стоимость одного гигабайта трафика
        System.out.println("Стоимость одного гигабайта трафика равна "+ pricePerOneGigabyte + " руб.");
        // или System.out.println((double)totalPrice/usedTrafic);


    }
}
