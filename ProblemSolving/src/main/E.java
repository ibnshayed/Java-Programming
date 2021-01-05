package main;

import java.math.BigInteger;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger bigInteger = BigInteger.valueOf(2);
        String s = bigInteger.toString();
        char[] c = s.toCharArray();
        System.out.println(c[s.length() - 1]);
    }

    public static BigInteger powOfSix(BigInteger n) {
        BigInteger x = BigInteger.valueOf(2);
        BigInteger result = BigInteger.valueOf(6);
        while (true) {
            if (x.equals(n))
                break;
            result = result.multiply(BigInteger.valueOf(6));
            x.add(BigInteger.valueOf(1));
        }
        return result;
    }

}
