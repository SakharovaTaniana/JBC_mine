package dz.dz_1_part_1;

import java.util.Scanner;

/*
Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров). На вход
подается количество дюймов, выведите количество сантиметров.
Ограничения:
0 < count < 1000

Входные данные: 12
                99
Выходные данные: 30.48
                 251.46
 */
public class dz_1_part_1_task_5 {
    private final static double SANTIMETRS_IN_ONE_INCH = 2.54;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дюймой: ");
        int countOfInches = scanner.nextInt();
        System.out.println(countOfInches * SANTIMETRS_IN_ONE_INCH + " сантиметров в " + countOfInches + " дюймах.");

    }
}
