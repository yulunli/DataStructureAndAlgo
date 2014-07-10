package main.java;

import java.math.*;

public class MainClass {

    public BigInteger sum_to(BigInteger num) {
        return num.multiply(num.add(BigInteger.ONE)).divide(BigInteger.valueOf(2));
    }

    public static BigInteger pow10(BigInteger power) {
        BigInteger result = BigInteger.ONE;
        for (BigInteger i = BigInteger.ZERO; i.compareTo(power) == -1; i = i.add(BigInteger.ONE)) {
            result = result.multiply(BigInteger.TEN);
        }
        return result;
    }

    public void getSums(String input) {
        String revInput = new StringBuilder(input).reverse().toString();
        BigInteger num = new BigInteger(input);
        int len = input.length();
        int[] digits = new int[len];
        BigInteger total = BigInteger.ZERO;
        BigInteger cache = BigInteger.valueOf(1);
        for (int i = 0; i < len; i++) {
            digits[i] = revInput.charAt(i) - '0';
        }
        for (int j = 0; j < len; j++) {
			/* Add the 45s. */
            total = total.add(num.divide(pow10(BigInteger.valueOf(j+1))).multiply(BigInteger.valueOf(45)).multiply(pow10(BigInteger.valueOf(j))));
            if (digits[j] != 0) {
                total = total.add(sum_to(BigInteger.valueOf(digits[j]-1)).multiply(pow10(BigInteger.valueOf(j))));
            }
            total = total.add(BigInteger.valueOf(digits[j]).multiply(cache));
//            System.out.println("###");
//            System.out.println(num.divide(BigInteger.valueOf((long) Math.pow(10, j+1))).multiply(BigInteger.valueOf(45)).multiply(BigInteger.valueOf((long) Math.pow(10, j+1))));
//            System.out.println(BigInteger.valueOf(sum_to(digits[j]-1)).multiply(BigInteger.valueOf((long) Math.pow(10, j))));
//            System.out.println(BigInteger.valueOf(digits[j]).multiply(cache));
            cache = cache.add(BigInteger.valueOf(digits[j]).multiply(pow10(BigInteger.valueOf(j))));
        }
        System.out.println(total);
    }

    public static void main(String args[]) {
        MainClass mainClass = new MainClass();
        mainClass.getSums("BMC_TEST_INPUT_MAGIC");
//        mainClass.getSums("2156066748418634712003645841319690531436417229807756437768555206355316035108264713884461422361512244456");
//        mainClass.getSums("99");
        // mainClass.getSums("999");
        // mainClass.getSums("2537");
    }
}