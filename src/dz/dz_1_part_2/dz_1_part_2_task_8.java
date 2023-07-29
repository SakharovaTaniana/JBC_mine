package dz.dz_1_part_2;

import java.util.Scanner;

/*
(1 балл) Раз так легко получается разделять по первому пробелу, Петя решил немного изменить
предыдущую программу и теперь разделять строку по последнему пробелу.

	Ограничения:
		В строке гарантированно есть хотя бы один пробел
		Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100

Пример:
Входные данные: Hi great team!
Выходные данные: Hi great
                 team!
Входные данные: Hello world!
Выходные данные: Hello
                 world!
 */
public class dz_1_part_2_task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = scanner.nextLine();
        int indexOfLastWhitespace = s.lastIndexOf(' ');
        System.out.println(s.substring(0,indexOfLastWhitespace));
        System.out.println(s.substring(indexOfLastWhitespace+1));
    }

}
