package dz.dz_1_part_1;

import java.util.Scanner;

public class dz_1_part_1_task_1 {

    public dz_1_part_1_task_1() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус (r) шара: ");
        int r = scanner.nextInt();
        double v = 4.1887902047863905 * Math.pow((double)r, 3.0);
        System.out.println("Объем шара равен: " + v);
    }
}
