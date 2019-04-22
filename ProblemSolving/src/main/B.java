package main;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        //Easy Blue Whale
        Scanner in = new Scanner(System.in);
        int whhite = 1000;
        int purple = 2000;
        int blue = 3000;

        String s = in.next();

        long a = Long.parseLong(s, 2);
        long absdiff = Math.abs(blue - a);
        if (a == blue)
            System.out.println("Blue");
        else if (absdiff <= 500 && isPrime(a))
            System.out.println("Almost Blue");

        else System.out.println("Eh!");
    }

    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}
