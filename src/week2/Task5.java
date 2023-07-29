package week2;

import java.util.Scanner;

/*
Даны 2 чилла "a"  и "b". Проверить утверждение, что только одно из них нечетное.
10 10 false
11 10 true
10 11 true
11 11 false


XOR - Исключающее или (т.е. true (1) будет только тогда, когда оба операнда разные)
A B RES
0 0 0
0 1 1
1 0 1
1 1 0

 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();
//        System.out.println(a%2==0 & b%2!=0?"true":b%2==0 & a%2!=0?"true":"false");

        boolean aIsOdd = a % 2 != 0;     // нечетное ли "а"?
        boolean bIsOdd = b % 2 != 0;     // нечетное ли "b"?

        /* 2 вариант
        if ((aIsOdd && !bIsOdd) || (!aIsOdd && bIsOdd)){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

         */


        if (aIsOdd ^ bIsOdd) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


    }
}
