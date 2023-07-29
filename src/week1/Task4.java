package week1;

import java.util.Scanner;

/*
Дана площадь круга. Нужно найти диаметр окружности и длину окружности.
Входные данные: 91
Выходные данные: диаметр окружности равен: 10.764051215546116, длина окружности равна: 33.81626422162396

 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ploshadKruga = scanner.nextDouble();
        //ploshadKruga=PI*(r^2) -> r=Math.sqrt(ploshadKruga/PI)
        //diametr=2*r
        double diametr =2*Math.sqrt(ploshadKruga/Math.PI);
        //dlinaOkruznosti=2*PI*r -> =PI*diametr
        double dlinaOkruznosti=Math.PI*diametr;
        System.out.println("диаметр окружности равен: "+diametr);
        System.out.println("длина окружности равна: "+dlinaOkruznosti);


    }
}
