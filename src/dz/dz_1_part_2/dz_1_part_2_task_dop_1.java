package dz.dz_1_part_2;

import java.util.Scanner;

import static java.lang.Character.isDigit;

/*
(2 балла) У Марата был взломан пароль. Он решил написать программу, которая проверяет его пароль на
сложность. В интернете он узнал, что пароль должен отвечать следующим требованиям:
●	пароль должен состоять из хотя бы 8 символов;
●	в пароле должны быть:
○	заглавные буквы
○	строчные символы
○	числа
○	специальные знаки(_*-)
Если пароль прошел проверку, то программа должна вывести в консоль строку пароль надежный,
иначе строку: пароль не прошел проверку

Входные данные: Hello_22
Выходные данные: пароль надежный

Входные данные: world234
Выходные данные: пароль не прошел проверку
 */
public class dz_1_part_2_task_dop_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();
        boolean isUpperLetter = false; // Проверка, есть ли в пароле хотя бы 1 заглавная буква
        boolean isLowerLetter = false; // Проверка, есть ли в пароле хотя бы 1 строчная буква
        boolean isDigit = false; // Проверка, есть ли в пароле хотя бы 1 цифра
        boolean isSpecialSign = false; // Проверка, есть ли в пароле хотя бы 1 специальный знак

        for (int i = 0; i < password.length(); i++) {
            if (password.length() < 8) {
                break;
            } else if (password.charAt(i) == password.toUpperCase().charAt(i) && isUpperLetter == false) {
                isUpperLetter = true;
            } else if (password.charAt(i) == password.toLowerCase().charAt(i) && isLowerLetter == false) {
                isLowerLetter = true;
            } else if (isDigit(password.charAt(i)) && isDigit == false) {
                isDigit = true;
            } else if ((password.charAt(i) == '_' || password.charAt(i) == '*'
                    || password.charAt(i) == '-') && isSpecialSign == false) {
                isSpecialSign = true;
            }
        }
        if (isUpperLetter == true && isLowerLetter == true && isDigit == true && isSpecialSign
                && password.length() >= 8) {
            System.out.println("пароль надежный");
        } else {
            System.out.println("пароль не прошел проверку");
        }


    }
}
