package week1;
/*
Перевод литров в галлоны.
С консоли считывается число n - количество литров, которое нужно перевести в галлоны
1 литр = 0,219969 галлона
 */
import java.util.Scanner;

public class Task10 {
    private final static double LITRE_TO_GALLON=0.219969;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество литров: ");
        int litrov=scanner.nextInt();
        System.out.println("Введено: "+litrov+" литров - это "+LITRE_TO_GALLON*litrov+" галлонов.");
    }
}
