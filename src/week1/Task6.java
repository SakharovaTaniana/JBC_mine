package week1;
/*
Вычислить доход работника за неделю.
Прочитать из консоли данные: количество рабочих часов в неделю, часовая ставка, налог
Входные данные: количество рабочих часов в неделю = 40, часовая ставка = 300, налог = 17
Выходные данные: 9960.0
 */
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рабочих часов в неделю");
        int hoursPerWeek=scanner.nextInt();
        System.out.println("Введите часовую ставку");
        int ratePerHour=scanner.nextInt();
        System.out.println("Введите налог");
        int tax=scanner.nextInt();
        //Вычисляем доход работника за неделю.
        double summa=hoursPerWeek*ratePerHour*(1-tax/100.0);
        System.out.println("доход работника за неделю равен "+summa);

    }
}
