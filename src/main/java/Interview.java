package main.java;

public class Interview {

    public static String reverse(String s) {
        int length = s.length();
        int last = length - 1;
        char[] chars = s.toCharArray();
        for (int i = 0; i < length / 2; i++) {
            char c = chars[i];
            chars[i] = chars[last - i];
            chars[last - i] = c;
        }
        return new String(chars);
    }

    public static int fib(int n) {
        return n <= 1 ? n : fib(n-1) + fib(n-2);
    }

    public static void multTable(int max) {
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= max; j++) {
                System.out.print(String.format("%4d", j * i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Interview i = new Interview();
//        System.out.println(i.reverse("ab"));
//        System.out.println(i.fib(2));
        multTable(9);
    }
}
