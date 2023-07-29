package tricksandfeatures;
// как можно корректно считатть String после считывания числа?

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine(); // обязательна эта строчка для считывания дальнейшей строки (т.е. это как перенос строки)
        String str = scanner.nextLine();
        System.out.println(a);
        System.out.println(str);

    }
}
