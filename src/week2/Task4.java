package week2;
/*
Напишите систему проверки цен на номер отеля по его типу.
Считать данные из консоли о типе номера отеля (данные вводятся в виде значения int)
1 - VIP, 2 - Premium, 2 - Comfort, 4 - Economy.
Вывести цену номера: VIP - 12500 руб., Premium - 9000 руб., Comfort - 6300 руб., Economy - 3800 руб.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цифру от 1 до 4 включительно о типе номера отеля: " +
                "1 - VIP, 2 - Premium, 2 - Comfort, 4 - Economy: ");
        int typeOfHotelNomber = scanner.nextInt();
//        if (typeOfHotelNomber==1){
//            System.out.println("VIP - 12500 руб.");
//        }
//        else if (typeOfHotelNomber==2){
//            System.out.println("Premium - 9000 руб.");
//        }
//        else if (typeOfHotelNomber==3){
//            System.out.println("Comfort - 6300 руб.");
//        }
//        else if (typeOfHotelNomber==4){
//            System.out.println("Economy - 3800 руб.");
//        }
//        else {
//            System.out.println("Вы ввели некорректный номер.");
//        }

        /*
        switch (typeOfHotelNomber) {
            case 1:
                System.out.println("VIP - 12500 руб.");
                break;
            case 2:
                System.out.println("Premium - 9000 руб.");
                break;
            case 3:
                System.out.println("Comfort - 6300 руб.");
                break;
            case 4:
                System.out.println("Economy - 3800 руб.");
                break;
            default:
                System.out.println("Неизвестный тип номера. Введите допустимое значение (1-4)");

        }

         */
        switch (typeOfHotelNomber) {
            case 1 -> System.out.println("VIP - 12500 руб.");
            case 2 -> System.out.println("Premium - 9000 руб.");
            case 3 -> System.out.println("Comfort - 6300 руб.");
            case 4 -> System.out.println("Economy - 3800 руб.");
            default -> System.out.println("Неизвестный тип номера. Введите допустимое значение (1-4)");


        }
    }
}
