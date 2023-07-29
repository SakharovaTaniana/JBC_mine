package dz.dz_1_part_2;

import java.util.Scanner;

/*
(1 балл) Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
Ему хочется уметь разделять строку по первому пробелу. Для этого он может воспользоваться методами
indexOf() и substring().

На вход подается строка. Нужно вывести две строки, полученные из входной разделением по первому пробелу.


	Ограничения:
		В строке гарантированно есть хотя бы один пробел
		Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100


Входные данные: Hi great team!
Выходные данные: Hi
                 great team!

Входные данные: Hello world!
Выходные данные: Hello
                 world!
 */
public class dz_1_part_2_task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();
        int whitespaceIndex = s.indexOf(' ');
        System.out.println(s.substring(0,whitespaceIndex));
        System.out.println(s.substring(whitespaceIndex + 1));
    }
}
