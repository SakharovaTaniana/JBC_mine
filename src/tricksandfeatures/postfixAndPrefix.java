package tricksandfeatures;

// Дано: x = 2, y = 4, z = 1.
// Какой результат будет у этого выражения: (++x - y++ + ++z )?
public class postfixAndPrefix {
    public static void main(String[] args) {
        int x = 2, y = 4, z = 1;
        System.out.println(++x - y++ + ++z);

        int a = 5, b = 7;
        System.out.println("a++ :" + a++);
        System.out.println("a :" + a);
        System.out.println();
        System.out.println("++b :" + ++b);
        System.out.println("b :" + b);
    }

}
